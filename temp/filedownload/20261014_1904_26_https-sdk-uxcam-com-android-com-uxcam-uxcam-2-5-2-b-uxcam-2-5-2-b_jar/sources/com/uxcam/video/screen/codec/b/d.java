package com.uxcam.video.screen.codec.b;

import java.util.Arrays;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/d.class */
public final class d {
    public int[] a;
    public int b;
    private int c;

    public d() {
        this((byte) 0);
    }

    private d(byte b) {
        this.c = 128;
        this.a = new int[128];
    }

    public final int[] a() {
        int[] iArr = new int[this.b];
        System.arraycopy(this.a, 0, iArr, 0, this.b);
        return iArr;
    }

    public final void a(int i) {
        if (this.b >= this.a.length) {
            int[] iArr = new int[this.a.length + this.c];
            System.arraycopy(this.a, 0, iArr, 0, this.a.length);
            this.a = iArr;
        }
        int[] iArr2 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr2[i2] = i;
    }

    public final void a(int i, int i2, int i3) {
        if (i2 > this.a.length) {
            int[] iArr = new int[i2 + this.c];
            System.arraycopy(this.a, 0, iArr, 0, this.a.length);
            this.a = iArr;
        }
        Arrays.fill(this.a, i, i2, i3);
        this.b = Math.max(this.b, i2);
    }
}
