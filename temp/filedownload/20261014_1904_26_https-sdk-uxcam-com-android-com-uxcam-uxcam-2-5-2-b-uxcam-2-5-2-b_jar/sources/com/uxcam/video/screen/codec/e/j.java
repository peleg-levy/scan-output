package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/j.class */
public final class j implements e {
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
                f.a(iArr[i], iArr2[i2], iArr3[i2], iArr4, i * 3);
                f.a(iArr[i + 1], iArr2[i2], iArr3[i2], iArr4, (i + 1) * 3);
                i += 2;
                i2++;
            }
        }
    }
}
