package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/m.class */
public final class m implements e {
    public static int a = 9362;
    private int b;
    private int c;
    private int d;

    public m(int i) {
        this.b = (i + 13) - 0;
        if (this.b < 0) {
            throw new IllegalArgumentException("Maximum upshift allowed: " + (i + 13));
        }
        this.c = 128 << Math.max(i - 0, 0);
        this.d = 128 << Math.max(0 - i, 0);
    }

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        int[] iArr = dVar.d[0];
        int[] iArr2 = dVar2.d[0];
        for (int i = 0; i < dVar.a(0) * dVar.b(0); i++) {
            iArr2[i] = ((iArr[i] - 16) * a) >> this.b;
        }
        a(dVar.d[1], dVar2.d[1], dVar.a(1), dVar.b(1));
        a(dVar.d[2], dVar2.d[2], dVar.a(2), dVar.b(2));
    }

    private void a(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2 / 2; i5++) {
            int i6 = 0;
            while (i6 < i) {
                iArr2[i4] = ((((((iArr[i3] - this.c) * a) >> this.b) + this.d) + ((((iArr[i3 + i] - this.c) * a) >> this.b) + this.d)) + 1) >> 1;
                i6++;
                i4++;
                i3++;
            }
            i3 += i;
        }
    }
}
