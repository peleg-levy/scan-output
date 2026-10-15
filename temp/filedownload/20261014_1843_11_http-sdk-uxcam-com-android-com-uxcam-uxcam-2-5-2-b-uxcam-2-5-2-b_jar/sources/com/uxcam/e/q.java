package com.uxcam.e;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/q.class */
public final class q {
    private final ae c;
    public final h a;
    public final List b;
    private final List d;

    private q(ae aeVar, h hVar, List list, List list2) {
        this.c = aeVar;
        this.a = hVar;
        this.b = list;
        this.d = list2;
    }

    public static q a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        h a = h.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        ae a2 = ae.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List a3 = certificateArr != null ? com.uxcam.e.a.c.a(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(a2, a, a3, localCertificates != null ? com.uxcam.e.a.c.a(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return com.uxcam.e.a.c.a(this.a, qVar.a) && this.a.equals(qVar.a) && this.b.equals(qVar.b) && this.d.equals(qVar.d);
    }

    public final int hashCode() {
        return (31 * ((31 * ((31 * (527 + (this.c != null ? this.c.hashCode() : 0))) + this.a.hashCode())) + this.b.hashCode())) + this.d.hashCode();
    }
}
