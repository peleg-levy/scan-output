package com.uxcam.video.screen.codec.b.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/a/a.class */
public final class a {
    private ByteBuffer c;
    private int d;
    protected int b = c();
    protected int a = 0;

    public a(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.d = byteBuffer.position();
    }

    private int c() {
        if (this.c.remaining() >= 4) {
            this.a -= 32;
            return ((this.c.get() & 255) << 24) | ((this.c.get() & 255) << 16) | ((this.c.get() & 255) << 8) | (this.c.get() & 255);
        }
        this.a -= this.c.remaining() << 3;
        int i = 0;
        if (this.c.hasRemaining()) {
            i = 0 | (this.c.get() & 255);
        }
        int i2 = i << 8;
        if (this.c.hasRemaining()) {
            i2 |= this.c.get() & 255;
        }
        int i3 = i2 << 8;
        if (this.c.hasRemaining()) {
            i3 |= this.c.get() & 255;
        }
        int i4 = i3 << 8;
        if (this.c.hasRemaining()) {
            i4 |= this.c.get() & 255;
        }
        return i4;
    }

    public final int a() {
        int i = this.b >>> 31;
        this.b <<= 1;
        this.a++;
        if (this.a == 32) {
            this.b = c();
        }
        return i;
    }

    public final int a(int i) {
        if (i > 32) {
            throw new IllegalArgumentException("Can not read more then 32 bit");
        }
        int i2 = 0;
        if (i + this.a > 31) {
            int i3 = 0 | (this.b >>> this.a);
            i -= 32 - this.a;
            i2 = i3 << i;
            this.a = 32;
            this.b = c();
        }
        if (i != 0) {
            i2 |= this.b >>> (32 - i);
            this.b <<= i;
            this.a += i;
        }
        return i2;
    }

    public final int b() {
        return ((this.c.remaining() << 3) + 32) - this.a;
    }

    public final int b(int i) {
        if (i > 24) {
            throw new IllegalArgumentException("Can not check more then 24 bit");
        }
        while (this.a + i > 32) {
            this.a -= 8;
            this.b |= (this.c.hasRemaining() ? this.c.get() & 255 : 0) << this.a;
        }
        return this.b >>> (32 - i);
    }
}
