package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/k.class */
public final class k implements e {
    public static int a = 7168;

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[] iArr2 = dVar2.d[0];
        for (int i = 0; i < dVar.a(0) * dVar.b(0); i++) {
            iArr2[i] = ((iArr[i] * a) >> 13) + 16;
        }
        a(dVar.d[1], dVar2.d[1], dVar.a(1), dVar.b(1));
        a(dVar.d[2], dVar2.d[2], dVar.a(2), dVar.b(2));
    }

    private static void a(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2 / 2; i5++) {
            int i6 = 0;
            while (i6 < i) {
                iArr2[i4] = ((((((iArr[i3] - 128) * a) >> 13) + 128) + ((((iArr[i3 + i] - 128) * a) >> 13) + 128)) + 1) >> 1;
                i6++;
                i4++;
                i3++;
            }
            i3 += i;
        }
    }
}
