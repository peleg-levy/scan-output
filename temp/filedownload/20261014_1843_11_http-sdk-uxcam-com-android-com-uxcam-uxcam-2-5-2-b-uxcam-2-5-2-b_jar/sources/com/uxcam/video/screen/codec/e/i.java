package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/i.class */
public final class i implements e {
    private int a = 0;
    private int b;

    public i(int i) {
        this.b = i;
    }

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[] iArr2 = dVar2.d[0];
        int i = dVar.b;
        int i2 = dVar2.b;
        int i3 = dVar2.c;
        int length = iArr.length / i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = i4;
                i4++;
                int i9 = i5;
                i5++;
                iArr2[i8] = (iArr[i9] & 255) << 2;
            }
            for (int i10 = i; i10 < i2; i10++) {
                int i11 = i4;
                i4++;
                iArr2[i11] = iArr2[i - 1];
            }
        }
        int i12 = (length - 1) * i2;
        for (int i13 = length; i13 < i3; i13++) {
            for (int i14 = 0; i14 < i2; i14++) {
                int i15 = i4;
                i4++;
                iArr2[i15] = iArr2[i12 + i14];
            }
        }
        a(dVar.d[1], dVar2.d[1], 0, dVar.b >> 1, dVar2.b >> 1, dVar.c >> 1, dVar2.c);
        a(dVar.d[1], dVar2.d[1], 1, dVar.b >> 1, dVar2.b >> 1, dVar.c >> 1, dVar2.c);
        a(dVar.d[2], dVar2.d[2], 0, dVar.b >> 1, dVar2.b >> 1, dVar.c >> 1, dVar2.c);
        a(dVar.d[2], dVar2.d[2], 1, dVar.b >> 1, dVar2.b >> 1, dVar.c >> 1, dVar2.c);
    }

    private static final void a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0 + (i * i3);
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = i7;
                i7++;
                iArr2[i6] = (iArr[i10] & 255) << 2;
                i6++;
            }
            int i11 = i6 - 1;
            int i12 = i2 * 1;
            while (true) {
                int i13 = i12;
                if (i13 < i3) {
                    iArr2[i6] = iArr2[i11];
                    i6++;
                    i12 = i13 + 1;
                }
            }
            i6 += 1 * i3;
        }
        int i14 = i6 - (2 * i3);
        int i15 = i4 * 2;
        while (true) {
            int i16 = i15;
            if (i16 >= i5) {
                return;
            }
            int i17 = 0;
            while (true) {
                int i18 = i17;
                if (i18 < i3) {
                    iArr2[i6] = iArr2[i14 + i18];
                    i6++;
                    i17 = i18 + 1;
                }
            }
            i6 += 1 * i3;
            i15 = i16 + 2;
        }
    }
}
