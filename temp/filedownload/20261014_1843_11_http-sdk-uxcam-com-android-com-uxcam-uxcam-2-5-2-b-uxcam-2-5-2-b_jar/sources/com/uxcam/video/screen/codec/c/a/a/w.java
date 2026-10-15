package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/w.class */
public final class w {
    String a;
    long b;
    private boolean c;

    public w(String str) {
        this.a = str;
    }

    public w(String str, long j) {
        this.b = j;
        this.a = str;
    }

    public final long a() {
        return (this.c || this.b > 4294967296L) ? 16L : 8L;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (this.b > 4294967296L) {
            byteBuffer.putInt(1);
        } else {
            byteBuffer.putInt((int) this.b);
        }
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.a));
        if (this.b > 4294967296L) {
            byteBuffer.putLong(this.b);
        }
    }
}
