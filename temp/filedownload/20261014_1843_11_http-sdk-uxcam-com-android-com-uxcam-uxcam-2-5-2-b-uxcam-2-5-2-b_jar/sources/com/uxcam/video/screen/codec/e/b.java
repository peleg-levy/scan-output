package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/b.class */
public final class b implements e {
    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[][] iArr2 = dVar2.d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = dVar.b * 3;
        int i5 = dVar2.b;
        for (int i6 = 0; i6 < (dVar.c >> 1); i6++) {
            for (int i7 = 0; i7 < (dVar.b >> 1); i7++) {
                iArr2[1][i] = 0;
                iArr2[2][i] = 0;
                a(iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr2[0], i2, iArr2[1], i, iArr2[2], i);
                iArr2[0][i2] = iArr2[0][i2];
                a(iArr[i3 + i4], iArr[i3 + i4 + 1], iArr[i3 + i4 + 2], iArr2[0], i2 + i5, iArr2[1], i, iArr2[2], i);
                iArr2[0][i2 + i5] = iArr2[0][i2 + i5];
                int i8 = i2 + 1;
                a(iArr[i3 + 3], iArr[i3 + 4], iArr[i3 + 5], iArr2[0], i8, iArr2[1], i, iArr2[2], i);
                iArr2[0][i8] = iArr2[0][i8];
                a(iArr[i3 + i4 + 3], iArr[i3 + i4 + 4], iArr[i3 + i4 + 5], iArr2[0], i8 + i5, iArr2[1], i, iArr2[2], i);
                iArr2[0][i8 + i5] = iArr2[0][i8 + i5];
                i2 = i8 + 1;
                iArr2[1][i] = iArr2[1][i] >> 2;
                iArr2[2][i] = iArr2[2][i] >> 2;
                i++;
                i3 += 6;
            }
            i2 += i5;
            i3 += i4;
        }
    }

    private static void a(int i, int i2, int i3, int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        int i7 = ((((66 * i) + (129 * i2)) + (25 * i3)) + 128) >> 8;
        iArr[i4] = a(i7 + 16);
        iArr2[i5] = iArr2[i5] + a(((((((-38) * i) - (74 * i2)) + (112 * i3)) + 128) >> 8) + 128);
        iArr3[i6] = iArr3[i6] + a((((((112 * i) - (94 * i2)) - (18 * i3)) + 128) >> 8) + 128);
    }

    private static final int a(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }
}
