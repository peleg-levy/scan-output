package com.uxcam.e;

import com.uxcam.e.k;
import com.uxcam.e.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/w.class */
public class w implements Cloneable {
    private static final List z = com.uxcam.e.a.c.a(x.HTTP_2, x.SPDY_3, x.HTTP_1_1);
    private static final List A = com.uxcam.e.a.c.a(k.a, k.b, k.c);
    final n a;
    public final Proxy b;
    public final List c;
    public final List d;
    final List e;
    final List f;
    public final ProxySelector g;
    public final m h;
    final c i;
    final com.uxcam.e.a.a.e j;
    public final SocketFactory k;
    public final SSLSocketFactory l;
    final com.uxcam.e.a.g.b m;
    public final HostnameVerifier n;
    public final g o;
    public final b p;
    public final b q;
    public final j r;
    public final o s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/w$a.class */
    public static final class a {
        Proxy b;
        c i;
        com.uxcam.e.a.a.e j;
        SSLSocketFactory l;
        com.uxcam.e.a.g.b m;
        final List e = new ArrayList();
        final List f = new ArrayList();
        n a = new n();
        List c = w.z;
        List d = w.A;
        ProxySelector g = ProxySelector.getDefault();
        m h = m.a;
        SocketFactory k = SocketFactory.getDefault();
        HostnameVerifier n = com.uxcam.e.a.g.d.a;
        g o = g.a;
        b p = b.a;
        b q = b.a;
        j r = new j();
        o s = o.a;
        boolean t = true;
        boolean u = true;
        boolean v = true;
        int w = 10000;
        int x = 10000;
        int y = 10000;
    }

    public w() {
        this(new a());
    }

    private w(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = com.uxcam.e.a.c.a(aVar.e);
        this.f = com.uxcam.e.a.c.a(aVar.f);
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        boolean z2 = false;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            z2 = z2 || ((k) it.next()).d;
        }
        if (aVar.l == null && z2) {
            X509TrustManager c = c();
            this.l = a(c);
            this.m = com.uxcam.e.a.f.e.b().a(c);
        } else {
            this.l = aVar.l;
            this.m = aVar.m;
        }
        this.n = aVar.n;
        g gVar = aVar.o;
        com.uxcam.e.a.g.b bVar = this.m;
        this.o = gVar.c != bVar ? new g(gVar.b, bVar) : gVar;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
        this.x = aVar.x;
        this.y = aVar.y;
    }

    private static X509TrustManager c() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public final e a(z zVar) {
        return new y(this, zVar);
    }

    static {
        com.uxcam.e.a.a.a = new com.uxcam.e.a.a() { // from class: com.uxcam.e.w.1
            @Override // com.uxcam.e.a.a
            public final void a(r.a aVar, String str) {
                int indexOf = str.indexOf(":", 1);
                if (indexOf != -1) {
                    aVar.a(str.substring(0, indexOf), str.substring(indexOf + 1));
                } else if (str.startsWith(":")) {
                    aVar.a("", str.substring(1));
                } else {
                    aVar.a("", str);
                }
            }

            @Override // com.uxcam.e.a.a
            public final void a(r.a aVar, String str, String str2) {
                aVar.a(str, str2);
            }

            @Override // com.uxcam.e.a.a
            public final boolean a(j jVar, com.uxcam.e.a.b.c cVar) {
                if (!j.g && !Thread.holdsLock(jVar)) {
                    throw new AssertionError();
                }
                if (cVar.j || jVar.b == 0) {
                    jVar.d.remove(cVar);
                    return true;
                }
                jVar.notifyAll();
                return false;
            }

            @Override // com.uxcam.e.a.a
            public final com.uxcam.e.a.b.c a(j jVar, com.uxcam.e.a aVar, com.uxcam.e.a.b.g gVar) {
                if (!j.g && !Thread.holdsLock(jVar)) {
                    throw new AssertionError();
                }
                for (com.uxcam.e.a.b.c cVar : jVar.d) {
                    if (cVar.i.size() < cVar.h && aVar.equals(cVar.a.a) && !cVar.j) {
                        gVar.a(cVar);
                        return cVar;
                    }
                }
                return null;
            }

            @Override // com.uxcam.e.a.a
            public final void b(j jVar, com.uxcam.e.a.b.c cVar) {
                if (!j.g && !Thread.holdsLock(jVar)) {
                    throw new AssertionError();
                }
                if (!jVar.f) {
                    jVar.f = true;
                    j.a.execute(jVar.c);
                }
                jVar.d.add(cVar);
            }

            @Override // com.uxcam.e.a.a
            public final com.uxcam.e.a.b.d a(j jVar) {
                return jVar.e;
            }

            @Override // com.uxcam.e.a.a
            public final void a(k kVar, SSLSocket sSLSocket, boolean z2) {
                String[] enabledCipherSuites = kVar.f != null ? (String[]) com.uxcam.e.a.c.a(String.class, kVar.f, sSLSocket.getEnabledCipherSuites()) : sSLSocket.getEnabledCipherSuites();
                String[] enabledProtocols = kVar.g != null ? (String[]) com.uxcam.e.a.c.a(String.class, kVar.g, sSLSocket.getEnabledProtocols()) : sSLSocket.getEnabledProtocols();
                if (z2 && com.uxcam.e.a.c.a((Object[]) sSLSocket.getSupportedCipherSuites(), (Object) "TLS_FALLBACK_SCSV") != -1) {
                    enabledCipherSuites = com.uxcam.e.a.c.a(enabledCipherSuites, "TLS_FALLBACK_SCSV");
                }
                k b = new k.a(kVar).a(enabledCipherSuites).b(enabledProtocols).b();
                if (b.g != null) {
                    sSLSocket.setEnabledProtocols(b.g);
                }
                if (b.f != null) {
                    sSLSocket.setEnabledCipherSuites(b.f);
                }
            }
        };
    }
}
