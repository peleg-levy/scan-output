package com.uxcam.video.screen.codec.b.b;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/b/b.class */
public enum b {
    RGB(3, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}),
    YUV420(3, new int[]{0, 1, 2}, new int[]{0, 1, 1}, new int[]{0, 1, 1}),
    YUV420J(3, new int[]{0, 1, 2}, new int[]{0, 1, 1}, new int[]{0, 1, 1}),
    YUV422(3, new int[]{0, 1, 2}, new int[]{0, 1, 1}, new int[]{0, 0, 0}),
    YUV422J(3, new int[]{0, 1, 2}, new int[]{0, 1, 1}, new int[]{0, 0, 0}),
    YUV444(3, new int[]{0, 1, 2}, new int[]{0, 0, 0}, new int[]{0, 0, 0}),
    YUV444J(3, new int[]{0, 1, 2}, new int[]{0, 0, 0}, new int[]{0, 0, 0}),
    YUV422_10(3, new int[]{0, 1, 2}, new int[]{0, 1, 1}, new int[]{0, 0, 0}),
    GREY(1, new int[]{0}, new int[]{0}, new int[]{0}),
    MONO(1, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}),
    YUV444_10(3, new int[]{0, 1, 2}, new int[]{0, 0, 0}, new int[]{0, 0, 0});

    public int l;
    public int[] m;
    public int[] n;
    public int[] o;

    b(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.l = i;
        this.m = iArr;
        this.n = iArr2;
        this.o = iArr3;
    }
}
