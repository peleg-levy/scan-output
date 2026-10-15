package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/q.class */
public final class q implements e {
    private int a;
    private int b = 0;

    public q(int i) {
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
            int i4 = 0;
            while (i4 < dVar2.b) {
                int i5 = (iArr[i] << this.b) >> this.a;
                int i6 = (iArr2[i] << this.b) >> this.a;
                int i7 = (iArr3[i] << this.b) >> this.a;
                int i8 = i2;
                int i9 = i5 - 16;
                int i10 = i6 - 128;
                int i11 = i7 - 128;
                iArr4[i8] = a((((298 * i9) + (516 * i10)) + 128) >> 8);
                iArr4[i8 + 1] = a(((((298 * i9) - (100 * i10)) - (208 * i11)) + 128) >> 8);
                iArr4[i8 + 2] = a((((298 * i9) + (409 * i11)) + 128) >> 8);
                i4++;
                i++;
                i2 += 3;
            }
        }
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
