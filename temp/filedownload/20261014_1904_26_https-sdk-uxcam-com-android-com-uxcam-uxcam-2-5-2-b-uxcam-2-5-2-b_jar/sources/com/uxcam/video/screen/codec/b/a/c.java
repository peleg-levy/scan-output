package com.uxcam.video.screen.codec.b.a;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/a/c.class */
public class c {
    private int[] a;
    private int[] b;
    private int[] c;
    private int[] d;

    public c(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
        com.uxcam.video.screen.codec.b.d dVar = new com.uxcam.video.screen.codec.b.d();
        com.uxcam.video.screen.codec.b.d dVar2 = new com.uxcam.video.screen.codec.b.d();
        a(0, 0, 0, dVar, dVar2);
        this.c = dVar.a();
        this.d = dVar2.a();
    }

    private int a(int i, int i2, int i3, com.uxcam.video.screen.codec.b.d dVar, com.uxcam.video.screen.codec.b.d dVar2) {
        int i4 = i + 256;
        dVar.a(i, i4, -1);
        dVar2.a(i, i4, 0);
        int i5 = i2 << 3;
        for (int i6 = 0; i6 < this.b.length; i6++) {
            if (this.b[i6] > i5 && (i2 <= 0 || (this.a[i6] >>> (32 - i5)) == i3)) {
                int i7 = this.a[i6] >>> ((32 - i5) - 8);
                int i8 = i7 & 255;
                int i9 = this.b[i6] - i5;
                if (i9 <= 8) {
                    for (int i10 = 0; i10 < (1 << (8 - i9)); i10++) {
                        dVar.a[i + i8 + i10] = i6;
                        dVar2.a[i + i8 + i10] = i9;
                    }
                } else {
                    if (dVar.a[i + i8] == -1) {
                        dVar.a[i + i8] = i4;
                        i4 = a(i4, i2 + 1, i7, dVar, dVar2);
                    }
                }
            }
        }
        return i4;
    }

    public void a(b bVar, int i) {
        bVar.a(this.a[i] >>> (32 - this.b[i]), this.b[i]);
    }
}
