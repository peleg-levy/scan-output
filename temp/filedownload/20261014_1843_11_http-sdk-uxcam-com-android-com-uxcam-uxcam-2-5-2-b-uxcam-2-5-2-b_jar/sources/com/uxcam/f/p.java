package com.uxcam.f;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/p.class */
final class p {
    static o a;
    static long b;

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o a() {
        synchronized (p.class) {
            if (a == null) {
                return new o();
            }
            o oVar = a;
            a = oVar.f;
            oVar.f = null;
            b -= 8192;
            return oVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(o oVar) {
        if (oVar.f != null || oVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (oVar.d) {
            return;
        }
        synchronized (p.class) {
            if (b + 8192 > 65536) {
                return;
            }
            b += 8192;
            oVar.f = a;
            oVar.c = 0;
            oVar.b = 0;
            a = oVar;
        }
    }
}
