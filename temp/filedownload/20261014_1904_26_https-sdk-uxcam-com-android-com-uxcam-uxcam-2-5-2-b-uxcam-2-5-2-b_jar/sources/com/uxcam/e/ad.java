package com.uxcam.e;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/ad.class */
public final class ad {
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public ad(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.a.equals(adVar.a) && this.b.equals(adVar.b) && this.c.equals(adVar.c);
    }

    public final int hashCode() {
        return (31 * ((31 * (527 + this.a.hashCode())) + this.b.hashCode())) + this.c.hashCode();
    }
}
