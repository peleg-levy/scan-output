package com.uxcam.video.screen.codec.b.b;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/b/e.class */
public final class e {
    public final int a;
    public final int b;

    public e(int i, int i2) {
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
        e eVar = (e) obj;
        return this.b == eVar.b && this.a == eVar.a;
    }

    public final e a() {
        return new e(this.b, this.a);
    }
}
