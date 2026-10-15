package com.uxcam.e.a.c;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/f.class */
public final class f {
    public static final com.uxcam.f.f a = com.uxcam.f.f.a(":status");
    public static final com.uxcam.f.f b = com.uxcam.f.f.a(":method");
    public static final com.uxcam.f.f c = com.uxcam.f.f.a(":path");
    public static final com.uxcam.f.f d = com.uxcam.f.f.a(":scheme");
    public static final com.uxcam.f.f e = com.uxcam.f.f.a(":authority");
    public static final com.uxcam.f.f f = com.uxcam.f.f.a(":host");
    public static final com.uxcam.f.f g = com.uxcam.f.f.a(":version");
    public final com.uxcam.f.f h;
    public final com.uxcam.f.f i;
    final int j;

    public f(String str, String str2) {
        this(com.uxcam.f.f.a(str), com.uxcam.f.f.a(str2));
    }

    public f(com.uxcam.f.f fVar, String str) {
        this(fVar, com.uxcam.f.f.a(str));
    }

    public f(com.uxcam.f.f fVar, com.uxcam.f.f fVar2) {
        this.h = fVar;
        this.i = fVar2;
        this.j = 32 + fVar.e() + fVar2.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.h.equals(fVar.h) && this.i.equals(fVar.i);
    }

    public final int hashCode() {
        return (31 * (527 + this.h.hashCode())) + this.i.hashCode();
    }

    public final String toString() {
        return com.uxcam.e.a.c.a("%s: %s", this.h.a(), this.i.a());
    }
}
