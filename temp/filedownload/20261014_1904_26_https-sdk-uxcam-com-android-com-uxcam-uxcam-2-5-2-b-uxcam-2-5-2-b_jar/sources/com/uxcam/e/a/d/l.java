package com.uxcam.e.a.d;

import com.uxcam.e.ab;
import com.uxcam.e.s;
import com.uxcam.e.t;
import com.uxcam.e.w;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/l.class */
public final class l implements t {
    private final w c;
    private com.uxcam.e.a.b.g d;
    public boolean a;
    public volatile boolean b;

    public l(w wVar) {
        this.c = wVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b6, code lost:
    
        if (r0.equals("HEAD") == false) goto L81;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x010c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0258  */
    @Override // com.uxcam.e.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.uxcam.e.ab a(com.uxcam.e.t.a r8) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.a.d.l.a(com.uxcam.e.t$a):com.uxcam.e.ab");
    }

    private com.uxcam.e.a a(s sVar) {
        SSLSocketFactory sSLSocketFactory = null;
        HostnameVerifier hostnameVerifier = null;
        com.uxcam.e.g gVar = null;
        if (sVar.b()) {
            sSLSocketFactory = this.c.l;
            hostnameVerifier = this.c.n;
            gVar = this.c.o;
        }
        return new com.uxcam.e.a(sVar.b, sVar.c, this.c.s, this.c.k, sSLSocketFactory, hostnameVerifier, gVar, this.c.p, this.c.b, this.c.c, this.c.d, this.c.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.IOException r4, boolean r5, com.uxcam.e.z r6) {
        /*
            r3 = this;
            r0 = r3
            com.uxcam.e.a.b.g r0 = r0.d
            r1 = r4
            r0.a(r1)
            r0 = r3
            com.uxcam.e.w r0 = r0.c
            boolean r0 = r0.v
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r5
            if (r0 != 0) goto L24
            r0 = r6
            com.uxcam.e.aa r0 = r0.d
            boolean r0 = r0 instanceof com.uxcam.e.a.d.n
            if (r0 == 0) goto L24
            r0 = 0
            return r0
        L24:
            r0 = r4
            r1 = r0
            r4 = r1
            boolean r0 = r0 instanceof java.net.ProtocolException
            if (r0 == 0) goto L31
            r0 = 0
            goto L68
        L31:
            r0 = r4
            boolean r0 = r0 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L47
            r0 = r4
            boolean r0 = r0 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L43
            r0 = r5
            if (r0 != 0) goto L67
        L43:
            r0 = 0
            goto L68
        L47:
            r0 = r4
            boolean r0 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L5c
            r0 = r4
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L5c
            r0 = 0
            goto L68
        L5c:
            r0 = r4
            boolean r0 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L67
            r0 = 0
            goto L68
        L67:
            r0 = 1
        L68:
            if (r0 != 0) goto L6d
            r0 = 0
            return r0
        L6d:
            r0 = r3
            com.uxcam.e.a.b.g r0 = r0.d
            r1 = r0
            r4 = r1
            com.uxcam.e.ad r0 = r0.b
            if (r0 != 0) goto L9b
            r0 = r4
            com.uxcam.e.a.b.f r0 = r0.c
            r1 = r0
            r5 = r1
            boolean r0 = r0.c()
            if (r0 != 0) goto L93
            r0 = r5
            boolean r0 = r0.b()
            if (r0 != 0) goto L93
            r0 = r5
            boolean r0 = r0.d()
            if (r0 == 0) goto L97
        L93:
            r0 = 1
            goto L98
        L97:
            r0 = 0
        L98:
            if (r0 == 0) goto L9f
        L9b:
            r0 = 1
            goto La0
        L9f:
            r0 = 0
        La0:
            if (r0 != 0) goto La5
            r0 = 0
            return r0
        La5:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.a.d.l.a(java.io.IOException, boolean, com.uxcam.e.z):boolean");
    }

    private static boolean a(ab abVar, s sVar) {
        s sVar2 = abVar.a.a;
        return sVar2.b.equals(sVar.b) && sVar2.c == sVar.c && sVar2.a.equals(sVar.a);
    }
}
