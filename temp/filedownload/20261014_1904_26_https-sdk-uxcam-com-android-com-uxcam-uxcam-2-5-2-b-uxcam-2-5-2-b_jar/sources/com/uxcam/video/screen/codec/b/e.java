package com.uxcam.video.screen.codec.b;

import java.util.Arrays;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/e.class */
public final class e {
    public int[] a = new int[128];
    private int b;

    public e() {
        Arrays.fill(this.a, Integer.MIN_VALUE);
    }

    public final void a(int i, int i2) {
        if (i2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("This implementation can not store -2147483648");
        }
        if (this.a.length <= i) {
            int[] iArr = new int[i + 128];
            System.arraycopy(this.a, 0, iArr, 0, this.a.length);
            Arrays.fill(iArr, this.a.length, iArr.length, Integer.MIN_VALUE);
            this.a = iArr;
        }
        if (this.a[i] == Integer.MIN_VALUE) {
            this.b++;
        }
        this.a[i] = i2;
    }
}
