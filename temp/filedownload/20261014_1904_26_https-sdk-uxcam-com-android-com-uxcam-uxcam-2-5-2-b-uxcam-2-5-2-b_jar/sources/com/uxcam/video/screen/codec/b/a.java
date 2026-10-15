package com.uxcam.video.screen.codec.b;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/a.class */
public final class a {
    public static final void a(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static final int a(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static int a(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 = i; i3 < i + 16; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }
}
