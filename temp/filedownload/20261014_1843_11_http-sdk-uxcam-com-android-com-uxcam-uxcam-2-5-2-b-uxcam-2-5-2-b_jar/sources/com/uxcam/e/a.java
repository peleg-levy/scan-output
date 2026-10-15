package com.uxcam.e;

import com.uxcam.e.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a.class */
public final class a {
    public final s a;
    public final o b;
    public final SocketFactory c;
    public final b d;
    public final List e;
    public final List f;
    public final ProxySelector g;
    public final Proxy h;
    public final SSLSocketFactory i;
    public final HostnameVerifier j;
    public final g k;

    public a(String str, int i, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        s.a aVar = new s.a();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: " + str2);
            }
            aVar.a = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String a = s.a.a(str, 0, str.length());
        if (a == null) {
            throw new IllegalArgumentException("unexpected host: " + str);
        }
        aVar.d = a;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: " + i);
        }
        aVar.e = i;
        this.a = aVar.b();
        if (oVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.b = oVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = com.uxcam.e.a.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = com.uxcam.e.a.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && com.uxcam.e.a.c.a(this.h, aVar.h) && com.uxcam.e.a.c.a(this.i, aVar.i) && com.uxcam.e.a.c.a(this.j, aVar.j) && com.uxcam.e.a.c.a(this.k, aVar.k);
    }

    public final int hashCode() {
        return (31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * (527 + this.a.hashCode())) + this.b.hashCode())) + this.d.hashCode())) + this.e.hashCode())) + this.f.hashCode())) + this.g.hashCode())) + (this.h != null ? this.h.hashCode() : 0))) + (this.i != null ? this.i.hashCode() : 0))) + (this.j != null ? this.j.hashCode() : 0))) + (this.k != null ? this.k.hashCode() : 0);
    }
}
