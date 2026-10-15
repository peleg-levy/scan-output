package com.uxcam.e;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/k.class */
public final class k {
    private static final h[] h = {h.aK, h.aO, h.W, h.am, h.al, h.av, h.aw, h.F, h.J, h.U, h.D, h.H, h.h};
    public static final k a;
    public static final k b;
    public static final k c;
    final boolean d;
    public final boolean e;
    final String[] f;
    final String[] g;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/k$a.class */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        a(boolean z) {
            this.a = z;
        }

        public a(k kVar) {
            this.a = kVar.d;
            this.b = kVar.f;
            this.c = kVar.g;
            this.d = kVar.e;
        }

        public final a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) strArr.clone();
            return this;
        }

        public final a a(ae... aeVarArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[aeVarArr.length];
            for (int i = 0; i < aeVarArr.length; i++) {
                strArr[i] = aeVarArr[i].e;
            }
            return b(strArr);
        }

        public final a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[]) strArr.clone();
            return this;
        }

        public final a a() {
            if (!this.a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.d = true;
            return this;
        }

        public final k b() {
            return new k(this, (byte) 0);
        }
    }

    private k(a aVar) {
        this.d = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.e = aVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.d) {
            return false;
        }
        if (this.g == null || a(this.g, sSLSocket.getEnabledProtocols())) {
            return this.f == null || a(this.f, sSLSocket.getEnabledCipherSuites());
        }
        return false;
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (com.uxcam.e.a.c.a((Object[]) strArr2, (Object) str) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        if (this.d != kVar.d) {
            return false;
        }
        if (this.d) {
            return Arrays.equals(this.f, kVar.f) && Arrays.equals(this.g, kVar.g) && this.e == kVar.e;
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        if (this.d) {
            i = (31 * ((31 * (527 + Arrays.hashCode(this.f))) + Arrays.hashCode(this.g))) + (this.e ? 0 : 1);
        }
        return i;
    }

    public final String toString() {
        String str;
        String str2;
        List a2;
        List a3;
        if (!this.d) {
            return "ConnectionSpec()";
        }
        if (this.f != null) {
            if (this.f == null) {
                a3 = null;
            } else {
                h[] hVarArr = new h[this.f.length];
                for (int i = 0; i < this.f.length; i++) {
                    hVarArr[i] = h.a(this.f[i]);
                }
                a3 = com.uxcam.e.a.c.a(hVarArr);
            }
            str = a3.toString();
        } else {
            str = "[all enabled]";
        }
        String str3 = str;
        if (this.g != null) {
            if (this.g == null) {
                a2 = null;
            } else {
                ae[] aeVarArr = new ae[this.g.length];
                for (int i2 = 0; i2 < this.g.length; i2++) {
                    aeVarArr[i2] = ae.a(this.g[i2]);
                }
                a2 = com.uxcam.e.a.c.a(aeVarArr);
            }
            str2 = a2.toString();
        } else {
            str2 = "[all enabled]";
        }
        return "ConnectionSpec(cipherSuites=" + str3 + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.e + ")";
    }

    /* synthetic */ k(a aVar, byte b2) {
        this(aVar);
    }

    static {
        a aVar = new a(true);
        h[] hVarArr = h;
        if (!aVar.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[hVarArr.length];
        for (int i = 0; i < hVarArr.length; i++) {
            strArr[i] = hVarArr[i].aS;
        }
        a = aVar.a(strArr).a(ae.TLS_1_2, ae.TLS_1_1, ae.TLS_1_0).a().b();
        b = new a(a).a(ae.TLS_1_0).a().b();
        c = new a(false).b();
    }
}
