package com.uxcam.e.a.b;

import com.uxcam.e.ad;
import com.uxcam.e.s;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/b/f.class */
public final class f {
    final com.uxcam.e.a a;
    final d b;
    private Proxy c;
    private InetSocketAddress d;
    private List e;
    private int f;
    private int h;
    private List g = Collections.emptyList();
    private final List i = new ArrayList();

    public f(com.uxcam.e.a aVar, d dVar) {
        this.e = Collections.emptyList();
        this.a = aVar;
        this.b = dVar;
        s sVar = aVar.a;
        Proxy proxy = aVar.h;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            this.e = new ArrayList();
            List<Proxy> select = this.a.g.select(sVar.a());
            if (select != null) {
                this.e.addAll(select);
            }
            this.e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.e.add(Proxy.NO_PROXY);
        }
        this.f = 0;
    }

    public final ad a() {
        while (true) {
            if (!c()) {
                if (!b()) {
                    if (d()) {
                        return (ad) this.i.remove(0);
                    }
                    throw new NoSuchElementException();
                }
                if (!b()) {
                    throw new SocketException("No route to " + this.a.a.b + "; exhausted proxy configurations: " + this.e);
                }
                List list = this.e;
                int i = this.f;
                this.f = i + 1;
                Proxy proxy = (Proxy) list.get(i);
                a(proxy);
                this.c = proxy;
            }
            if (!c()) {
                throw new SocketException("No route to " + this.a.a.b + "; exhausted inet socket addresses: " + this.g);
            }
            List list2 = this.g;
            int i2 = this.h;
            this.h = i2 + 1;
            this.d = (InetSocketAddress) list2.get(i2);
            ad adVar = new ad(this.a, this.c, this.d);
            if (!this.b.c(adVar)) {
                return adVar;
            }
            this.i.add(adVar);
        }
    }

    public final boolean b() {
        return this.f < this.e.size();
    }

    private void a(Proxy proxy) {
        String str;
        int i;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.a.a.b;
            i = this.a.a.c;
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            InetAddress address2 = inetSocketAddress.getAddress();
            str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
            i = inetSocketAddress.getPort();
        }
        if (i <= 0 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List a = this.a.b.a(str);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g.add(new InetSocketAddress((InetAddress) a.get(i2), i));
            }
        }
        this.h = 0;
    }

    public final boolean c() {
        return this.h < this.g.size();
    }

    public final boolean d() {
        return !this.i.isEmpty();
    }
}
