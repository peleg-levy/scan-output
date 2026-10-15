package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/l.class */
public final class l implements e {
    private int a;
    private int b = 0;

    public l(int i) {
        this.a = i;
    }

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[] iArr2 = dVar.d[1];
        int[] iArr3 = dVar.d[2];
        int[] iArr4 = dVar2.d[0];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < dVar2.c; i3++) {
            for (int i4 = 0; i4 < dVar2.b; i4 += 2) {
                a((iArr[i] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, i * 3);
                a((iArr[i + 1] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + 1) * 3);
                i += 2;
                i2++;
            }
        }
    }

    public static final void a(int i, int i2, int i3, int[] iArr, int i4) {
        int i5 = i - 16;
        int i6 = i2 - 128;
        int i7 = i3 - 128;
        int i8 = (((298 * i5) + (409 * i7)) + 128) >> 8;
        iArr[i4] = a((((298 * i5) + (516 * i6)) + 128) >> 8);
        iArr[i4 + 1] = a(((((298 * i5) - (100 * i6)) - (208 * i7)) + 128) >> 8);
        iArr[i4 + 2] = a(i8);
    }

    private static int a(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }
}
