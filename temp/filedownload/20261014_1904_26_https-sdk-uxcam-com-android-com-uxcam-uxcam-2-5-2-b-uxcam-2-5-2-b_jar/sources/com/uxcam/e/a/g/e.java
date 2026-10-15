package com.uxcam.e.a.g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/g/e.class */
public abstract class e {

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/g/e$a.class */
    static final class a extends e {
        private final X509TrustManager a;
        private final Method b;

        a(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        @Override // com.uxcam.e.a.g.e
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                return null;
            }
        }
    }

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/g/e$b.class */
    static final class b extends e {
        private final Map a = new LinkedHashMap();

        public b(X509Certificate... x509CertificateArr) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                List list = (List) this.a.get(subjectX500Principal);
                List list2 = list;
                if (list == null) {
                    list2 = new ArrayList(1);
                    this.a.put(subjectX500Principal, list2);
                }
                list2.add(x509Certificate);
            }
        }

        @Override // com.uxcam.e.a.g.e
        public final X509Certificate a(X509Certificate x509Certificate) {
            List<X509Certificate> list = (List) this.a.get(x509Certificate.getIssuerX500Principal());
            if (list == null) {
                return null;
            }
            for (X509Certificate x509Certificate2 : list) {
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return x509Certificate2;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public abstract X509Certificate a(X509Certificate x509Certificate);

    public static e a(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new b(x509TrustManager.getAcceptedIssuers());
        }
    }
}
