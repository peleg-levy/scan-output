package com.uxcam.video.screen.codec.e;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/n.class */
public final class n implements e {
    private int a = 0;
    private int b;

    public n(int i) {
        this.b = i;
    }

    @Override // com.uxcam.video.screen.codec.e.e
    public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
        System.arraycopy(dVar.d[0], 0, dVar2.d[0], 0, dVar.b * dVar.c);
        a(dVar.d[1], dVar2.d[1], dVar.a(1), dVar.b(1));
        a(dVar.d[2], dVar2.d[2], dVar.a(2), dVar.b(2));
        if (this.a > this.b) {
            b(dVar2.d[0], this.a - this.b);
            b(dVar2.d[1], this.a - this.b);
            b(dVar2.d[2], this.a - this.b);
        } else if (this.b > this.a) {
            a(dVar2.d[0], this.b - this.a);
            a(dVar2.d[1], this.b - this.a);
            a(dVar2.d[2], this.b - this.a);
        }
    }

    private static void a(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = i2;
            iArr[i3] = iArr[i3] >> i;
        }
    }

    private static void b(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = i2;
            iArr[i3] = iArr[i3] << i;
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2 / 2; i5++) {
            int i6 = 0;
            while (i6 < i) {
                iArr2[i4] = ((iArr[i3] + iArr[i3 + i]) + 1) >> 1;
                i6++;
                i4++;
                i3++;
            }
            i3 += i;
        }
    }
}
