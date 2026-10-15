package com.uxcam.e;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/g.class */
public final class g {
    public static final g a = new g(com.uxcam.e.a.c.a(new a().a));
    final List b;
    final com.uxcam.e.a.g.b c;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/g$a.class */
    public static final class a {
        final List a = new ArrayList();
    }

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/g$b.class */
    static final class b {
        final String a;
        final String b;
        final String c;
        final com.uxcam.f.f d;

        public final boolean equals(Object obj) {
            return (obj instanceof b) && this.a.equals(((b) obj).a) && this.c.equals(((b) obj).c) && this.d.equals(((b) obj).d);
        }

        public final int hashCode() {
            return (31 * ((31 * (527 + this.a.hashCode())) + this.c.hashCode())) + this.d.hashCode();
        }

        public final String toString() {
            return this.c + this.d.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(List list, com.uxcam.e.a.g.b bVar) {
        this.b = list;
        this.c = bVar;
    }

    public final void a(String str, List list) {
        List emptyList = Collections.emptyList();
        for (b bVar : this.b) {
            if (bVar.a.startsWith("*.") ? str.regionMatches(false, str.indexOf(46) + 1, bVar.b, 0, bVar.b.length()) : str.equals(bVar.b)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(bVar);
            }
        }
        List list2 = emptyList;
        if (list2.isEmpty()) {
            return;
        }
        if (this.c != null) {
            list = this.c.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            com.uxcam.f.f fVar = null;
            com.uxcam.f.f fVar2 = null;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar2 = (b) list2.get(i2);
                if (bVar2.c.equals("sha256/")) {
                    if (fVar2 == null) {
                        fVar2 = a(x509Certificate);
                    }
                    if (bVar2.d.equals(fVar2)) {
                        return;
                    }
                } else {
                    if (!bVar2.c.equals("sha1/")) {
                        throw new AssertionError();
                    }
                    if (fVar == null) {
                        fVar = com.uxcam.e.a.c.a(com.uxcam.f.f.a(x509Certificate.getPublicKey().getEncoded()));
                    }
                    if (bVar2.d.equals(fVar)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ").append(a((Certificate) x509Certificate2)).append(": ").append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ").append(str).append(":");
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            sb.append("\n    ").append((b) list2.get(i4));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + a((X509Certificate) certificate).b();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static com.uxcam.f.f a(X509Certificate x509Certificate) {
        return com.uxcam.e.a.c.b(com.uxcam.f.f.a(x509Certificate.getPublicKey().getEncoded()));
    }

    private /* synthetic */ g(List list) {
        this(list, null);
    }
}
