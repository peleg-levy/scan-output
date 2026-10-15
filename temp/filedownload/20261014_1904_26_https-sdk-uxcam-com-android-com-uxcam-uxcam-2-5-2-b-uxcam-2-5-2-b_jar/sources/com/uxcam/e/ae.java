package com.uxcam.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/ae.class */
public enum ae {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    final String e;

    ae(String str) {
        this.e = str;
    }

    public static ae a(String str) {
        boolean z = -1;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    z = true;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    z = false;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    z = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    z = 2;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                return TLS_1_2;
            case true:
                return TLS_1_1;
            case true:
                return TLS_1_0;
            case true:
                return SSL_3_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }
}
