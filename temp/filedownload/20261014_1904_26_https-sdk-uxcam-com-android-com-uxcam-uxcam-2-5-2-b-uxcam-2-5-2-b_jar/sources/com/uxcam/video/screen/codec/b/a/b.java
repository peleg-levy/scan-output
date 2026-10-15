package com.uxcam.video.screen.codec.b.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/a/b.class */
public final class b {
    public final ByteBuffer a;
    public int b;
    public int c;
    public int d;

    public b(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.d = byteBuffer.position();
    }

    public b(ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.a = byteBuffer;
        this.c = i;
        this.b = i2;
        this.d = i3;
    }

    public final void a() {
        int i = (this.c + 7) >> 3;
        for (int i2 = 0; i2 < i; i2++) {
            this.a.put((byte) (this.b >>> 24));
            this.b <<= 8;
        }
    }

    private final void b(int i) {
        this.a.put((byte) (i >>> 24));
        this.a.put((byte) (i >> 16));
        this.a.put((byte) (i >> 8));
        this.a.put((byte) i);
    }

    public final void a(int i, int i2) {
        if (i2 > 32) {
            throw new IllegalArgumentException("Max 32 bit to write");
        }
        if (i2 == 0) {
            return;
        }
        int i3 = i & ((-1) >>> (32 - i2));
        if (32 - this.c < i2) {
            int i4 = i2 - (32 - this.c);
            this.b |= i3 >>> i4;
            b(this.b);
            this.b = i3 << (32 - i4);
            this.c = i4;
            return;
        }
        this.b |= i3 << ((32 - this.c) - i2);
        this.c += i2;
        if (this.c == 32) {
            b(this.b);
            this.c = 0;
            this.b = 0;
        }
    }

    public final void a(int i) {
        this.b |= i << ((32 - this.c) - 1);
        this.c++;
        if (this.c == 32) {
            b(this.b);
            this.c = 0;
            this.b = 0;
        }
    }

    public final int b() {
        return ((this.a.position() - this.d) << 3) + this.c;
    }
}
