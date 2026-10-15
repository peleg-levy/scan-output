package com.uxcam.video.screen.codec.b.b;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/b/h.class */
public final class h {
    public short a;
    public byte b;
    public byte c;
    public byte d;
    public boolean e;

    public final String toString() {
        return String.format("%02d:%02d:%02d", Short.valueOf(this.a), Byte.valueOf(this.b), Byte.valueOf(this.c)) + (this.e ? ";" : ":") + String.format("%02d", Byte.valueOf(this.d));
    }
}
