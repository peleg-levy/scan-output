package com.uxcam.video.screen.codec.b.b;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/b/g.class */
public final class g {
    public int a;
    public int b;

    public g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int hashCode() {
        return (31 * (31 + this.b)) + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.b == gVar.b && this.a == gVar.a;
    }
}
