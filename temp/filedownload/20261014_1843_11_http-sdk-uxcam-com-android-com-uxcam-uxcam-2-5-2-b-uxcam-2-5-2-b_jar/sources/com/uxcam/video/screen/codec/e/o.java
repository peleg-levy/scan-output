package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/o.class */
public final class o implements e {
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
                f.a(iArr[i], iArr2[i], iArr3[i], iArr4, i2);
                i4++;
                i++;
                i2 += 3;
            }
        }
    }
}
