package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/f.class */
public final class f implements e {
    private static final int a = a(0.71414d);
    private static final int b = a(1.772d);
    private static final int c = -a(0.34414d);
    private static final int d = a(1.402d);

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[] iArr2 = dVar.d[1];
        int[] iArr3 = dVar.d[2];
        int[] iArr4 = dVar2.d[0];
        int i = 0;
        int i2 = 0;
        int i3 = dVar2.b;
        for (int i4 = 0; i4 < (dVar2.c >> 1); i4++) {
            for (int i5 = 0; i5 < (dVar2.b >> 1); i5++) {
                int i6 = i5 << 1;
                a(iArr[i + i6], iArr2[i2], iArr3[i2], iArr4, (i + i6) * 3);
                a(iArr[i + i6 + 1], iArr2[i2], iArr3[i2], iArr4, (i + i6 + 1) * 3);
                a(iArr[i + i6 + i3], iArr2[i2], iArr3[i2], iArr4, (i + i6 + i3) * 3);
                a(iArr[i + i6 + i3 + 1], iArr2[i2], iArr3[i2], iArr4, (i + i6 + i3 + 1) * 3);
                i2++;
            }
            if ((dVar2.b & 1) != 0) {
                int i7 = dVar2.b - 1;
                a(iArr[i + i7], iArr2[i2], iArr3[i2], iArr4, (i + i7) * 3);
                a(iArr[i + i7 + i3], iArr2[i2], iArr3[i2], iArr4, (i + i7 + i3) * 3);
                i2++;
            }
            i += 2 * i3;
        }
        if ((dVar2.c & 1) != 0) {
            for (int i8 = 0; i8 < (dVar2.b >> 1); i8++) {
                int i9 = i8 << 1;
                a(iArr[i + i9], iArr2[i2], iArr3[i2], iArr4, (i + i9) * 3);
                a(iArr[i + i9 + 1], iArr2[i2], iArr3[i2], iArr4, (i + i9 + 1) * 3);
                i2++;
            }
            if ((dVar2.b & 1) != 0) {
                int i10 = dVar2.b - 1;
                a(iArr[i + i10], iArr2[i2], iArr3[i2], iArr4, (i + i10) * 3);
            }
        }
    }

    private static final int a(double d2) {
        return (int) ((d2 * 1024.0d) + 0.5d);
    }

    public static final void a(int i, int i2, int i3, int[] iArr, int i4) {
        int i5 = i << 10;
        int i6 = i2 - 128;
        int i7 = i3 - 128;
        int i8 = (d * i7) + 512;
        int i9 = ((c * i6) - (a * i7)) + 512;
        int i10 = (b * i6) + 512;
        int i11 = (i5 + i8) >> 10;
        iArr[i4] = com.uxcam.video.screen.codec.b.c.a.a((i5 + i10) >> 10);
        iArr[i4 + 1] = com.uxcam.video.screen.codec.b.c.a.a((i5 + i9) >> 10);
        iArr[i4 + 2] = com.uxcam.video.screen.codec.b.c.a.a(i11);
    }
}
