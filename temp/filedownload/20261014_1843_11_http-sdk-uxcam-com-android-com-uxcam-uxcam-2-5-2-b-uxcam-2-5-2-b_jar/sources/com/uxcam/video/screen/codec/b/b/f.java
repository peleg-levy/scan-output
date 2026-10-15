package com.uxcam.video.screen.codec.b.b;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/b/f.class */
public final class f {
    private int c;
    private int d;
    public int a;
    public int b;

    public final int hashCode() {
        return (31 * ((31 * ((31 * (31 + this.b)) + this.a)) + this.c)) + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.b == fVar.b && this.a == fVar.a && this.c == fVar.c && this.d == fVar.d;
    }

    public final String toString() {
        return "Rect [x=" + this.c + ", y=" + this.d + ", width=" + this.a + ", height=" + this.b + "]";
    }
}
