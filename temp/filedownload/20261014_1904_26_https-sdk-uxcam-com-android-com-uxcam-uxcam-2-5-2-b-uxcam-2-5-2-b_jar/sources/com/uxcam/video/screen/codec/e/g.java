package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/g.class */
public final class g implements e {
    public static int a = 7168;

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[] iArr2 = dVar2.d[0];
        for (int i = 0; i < dVar.a(0) * dVar.b(0); i++) {
            iArr2[i] = ((iArr[i] * a) >> 13) + 16;
        }
        int[] iArr3 = dVar.d[1];
        int[] iArr4 = dVar2.d[1];
        for (int i2 = 0; i2 < dVar.a(1) * dVar.b(1); i2++) {
            iArr4[i2] = (((iArr3[i2] - 128) * a) >> 13) + 128;
        }
        int[] iArr5 = dVar.d[2];
        int[] iArr6 = dVar2.d[2];
        for (int i3 = 0; i3 < dVar.a(2) * dVar.b(2); i3++) {
            iArr6[i3] = (((iArr5[i3] - 128) * a) >> 13) + 128;
        }
    }
}
