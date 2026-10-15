package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/d.class */
public final class d implements e {
    private int a;
    private int b = 0;
    private int c = 1;

    public d(int i) {
        this.a = i;
    }

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[][] iArr2 = dVar2.d;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < dVar.c; i3++) {
            for (int i4 = 0; i4 < (dVar.b >> 1); i4++) {
                iArr2[1][i] = 0;
                iArr2[2][i] = 0;
                int i5 = i << 1;
                int i6 = i2;
                int i7 = i2 + 1;
                int i8 = iArr[i6];
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                int i11 = i9 + 1;
                c.a(i8, i10, iArr[i9], iArr2[0], i5, iArr2[1], i, iArr2[2], i);
                iArr2[0][i5] = (iArr2[0][i5] << this.a) >> this.b;
                int i12 = i11 + 1;
                int i13 = iArr[i11];
                int i14 = i12 + 1;
                int i15 = iArr[i12];
                i2 = i14 + 1;
                c.a(i13, i15, iArr[i14], iArr2[0], i5 + 1, iArr2[1], i, iArr2[2], i);
                iArr2[0][i5 + 1] = (iArr2[0][i5 + 1] << this.a) >> this.b;
                iArr2[1][i] = (iArr2[1][i] << this.a) >> this.c;
                iArr2[2][i] = (iArr2[2][i] << this.a) >> this.c;
                i++;
            }
        }
    }
}
