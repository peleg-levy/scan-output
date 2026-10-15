package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/h.class */
public final class h implements e {
    private final int b = 0;
    private final int a = 0;

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
                l.a((iArr[i + i6] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i6) * 3);
                l.a((iArr[(i + i6) + 1] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i6 + 1) * 3);
                l.a((iArr[(i + i6) + i3] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i6 + i3) * 3);
                l.a((iArr[((i + i6) + i3) + 1] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i6 + i3 + 1) * 3);
                i2++;
            }
            if ((dVar2.b & 1) != 0) {
                int i7 = dVar2.b - 1;
                l.a((iArr[i + i7] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i7) * 3);
                l.a((iArr[(i + i7) + i3] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i7 + i3) * 3);
                i2++;
            }
            i += 2 * i3;
        }
        if ((dVar2.c & 1) != 0) {
            for (int i8 = 0; i8 < (dVar2.b >> 1); i8++) {
                int i9 = i8 << 1;
                l.a((iArr[i + i9] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i9) * 3);
                l.a((iArr[(i + i9) + 1] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i9 + 1) * 3);
                i2++;
            }
            if ((dVar2.b & 1) != 0) {
                int i10 = dVar2.b - 1;
                l.a((iArr[i + i10] << this.b) >> this.a, (iArr2[i2] << this.b) >> this.a, (iArr3[i2] << this.b) >> this.a, iArr4, (i + i10) * 3);
            }
        }
    }
}
