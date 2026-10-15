package com.uxcam.video.screen.codec.codecs.h264;

import com.uxcam.video.screen.codec.b.b.d;
import com.uxcam.video.screen.codec.codecs.h264.io.model.MBType;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/b.class */
public final class b {
    public com.uxcam.video.screen.codec.codecs.h264.io.a[] a;
    public int[][] b;
    public int[][] c;
    private com.uxcam.video.screen.codec.codecs.h264.b.b d;

    public b() {
        this(new com.uxcam.video.screen.codec.codecs.h264.b.a());
    }

    private b(com.uxcam.video.screen.codec.codecs.h264.b.b bVar) {
        this.d = bVar;
    }

    public static void a(int[] iArr, int i, int i2, int[] iArr2) {
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            iArr2[i3] = iArr[i];
            i += i2;
        }
    }

    public final void a(int[] iArr, int i, int i2, int i3, int[][] iArr2) {
        a(iArr, a(i, i2, i3), iArr2[0], 3, 0, 0);
        a(iArr, b(i, i2, i3), iArr2[1], 3, 4, 0);
        a(iArr, c(i, i2, i3), iArr2[2], 3, 0, 4);
        a(iArr, d(i, i2, i3), iArr2[3], 3, 4, 4);
    }

    public static void a(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        int i5 = 1 << i2;
        int i6 = 0;
        int i7 = (i4 << i2) + i3;
        for (int i8 = 0; i8 < 4; i8++) {
            iArr[i7] = com.uxcam.video.screen.codec.b.c.a.a(iArr2[i6] + i);
            iArr[i7 + 1] = com.uxcam.video.screen.codec.b.c.a.a(iArr2[i6 + 1] + i);
            iArr[i7 + 2] = com.uxcam.video.screen.codec.b.c.a.a(iArr2[i6 + 2] + i);
            iArr[i7 + 3] = com.uxcam.video.screen.codec.b.c.a.a(iArr2[i6 + 3] + i);
            i6 += 4;
            i7 += i5;
        }
    }

    public static void a(int[] iArr, int[][] iArr2) {
        if (iArr.length == 4) {
            com.uxcam.video.screen.codec.codecs.h264.a.b.i(iArr);
            com.uxcam.video.screen.codec.codecs.h264.a.b.k(iArr);
        } else if (iArr.length == 8) {
            com.uxcam.video.screen.codec.codecs.h264.a.b.c();
            com.uxcam.video.screen.codec.codecs.h264.a.b.d();
        } else {
            com.uxcam.video.screen.codec.codecs.h264.a.b.c(iArr);
            com.uxcam.video.screen.codec.codecs.h264.a.b.g(iArr);
            com.uxcam.video.screen.codec.codecs.h264.a.b.m(iArr);
        }
        for (int i = 0; i < iArr2.length; i++) {
            com.uxcam.video.screen.codec.codecs.h264.a.b.e(iArr2[i]);
            iArr2[i][0] = iArr[i];
            com.uxcam.video.screen.codec.codecs.h264.a.b.a(iArr2[i]);
        }
    }

    public static int[] a(int[][] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[i][0];
            iArr[i][0] = 0;
        }
        return iArr2;
    }

    public final void a(int i, com.uxcam.video.screen.codec.b.a.b bVar, int i2, int i3, int[][] iArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            com.uxcam.video.screen.codec.codecs.h264.a.b.f(iArr[i4]);
            com.uxcam.video.screen.codec.codecs.h264.io.a aVar = this.a[i];
            int i5 = i2 + a.j[i4];
            int i6 = i3 + a.k[i4];
            int a = com.uxcam.video.screen.codec.codecs.h264.io.a.a(bVar, iArr[i4], a.e, 1, 15, com.uxcam.video.screen.codec.codecs.h264.a.b.a, com.uxcam.video.screen.codec.codecs.h264.io.a.a(i5 != 0, MBType.I_16x16, aVar.a[i6 & aVar.c], i6 != 0, MBType.I_16x16, aVar.b[i5]));
            aVar.a[i6 & aVar.c] = a;
            aVar.b[i5] = a;
        }
    }

    public final void a(int i, com.uxcam.video.screen.codec.b.a.b bVar, int i2, int i3, int[] iArr) {
        if (iArr.length == 4) {
            com.uxcam.video.screen.codec.codecs.h264.a.b.l(iArr);
            com.uxcam.video.screen.codec.codecs.h264.a.b.j(iArr);
            this.a[i].a(bVar, iArr, a.f, iArr.length, new int[]{0, 1, 2, 3});
        } else {
            if (iArr.length == 8) {
                com.uxcam.video.screen.codec.codecs.h264.a.b.b();
                com.uxcam.video.screen.codec.codecs.h264.a.b.a();
                this.a[i].a(bVar, iArr, a.g, iArr.length, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
                return;
            }
            com.uxcam.video.screen.codec.codecs.h264.a.b.m(iArr);
            com.uxcam.video.screen.codec.codecs.h264.a.b.h(iArr);
            com.uxcam.video.screen.codec.codecs.h264.a.b.d(iArr);
            com.uxcam.video.screen.codec.codecs.h264.io.a aVar = this.a[i];
            com.uxcam.video.screen.codec.codecs.h264.io.a.a(bVar, iArr, a.e, 0, 16, com.uxcam.video.screen.codec.codecs.h264.a.b.a, com.uxcam.video.screen.codec.codecs.h264.io.a.a(i2 != 0, MBType.I_16x16, aVar.a[i3 & aVar.c], i3 != 0, MBType.I_16x16, aVar.b[i2]));
        }
    }

    public final int[][] a(d dVar, int i, int i2, int i3, int i4, int i5) {
        int[][] iArr = new int[16 >> (i2 + i3)][16];
        a(dVar.d[i], dVar.a(i), dVar.b(i), i4, i5, iArr[0], a(i, i4, i5));
        com.uxcam.video.screen.codec.codecs.h264.a.b.b(iArr[0]);
        a(dVar.d[i], dVar.a(i), dVar.b(i), i4 + 4, i5, iArr[1], b(i, i4, i5));
        com.uxcam.video.screen.codec.codecs.h264.a.b.b(iArr[1]);
        a(dVar.d[i], dVar.a(i), dVar.b(i), i4, i5 + 4, iArr[2], c(i, i4, i5));
        com.uxcam.video.screen.codec.codecs.h264.a.b.b(iArr[2]);
        a(dVar.d[i], dVar.a(i), dVar.b(i), i4 + 4, i5 + 4, iArr[3], d(i, i4, i5));
        com.uxcam.video.screen.codec.codecs.h264.a.b.b(iArr[3]);
        return iArr;
    }

    private static int a(int[] iArr, int i) {
        return ((((iArr[i] + iArr[i + 1]) + iArr[i + 2]) + iArr[i + 3]) + 2) >> 2;
    }

    private static int a(int[] iArr, int[] iArr2, int i, int i2) {
        return ((((((((iArr[i] + iArr[i + 1]) + iArr[i + 2]) + iArr[i + 3]) + iArr2[i2]) + iArr2[i2 + 1]) + iArr2[i2 + 2]) + iArr2[i2 + 3]) + 4) >> 3;
    }

    private int a(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i2 != 0 && i3 != 0) {
            return a(this.b[i], this.c[i], i4, i2);
        }
        if (i2 != 0) {
            return a(this.b[i], i4);
        }
        if (i3 != 0) {
            return a(this.c[i], i2);
        }
        return 128;
    }

    private int b(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i3 != 0) {
            return a(this.c[i], i2 + 4);
        }
        if (i2 != 0) {
            return a(this.b[i], i4);
        }
        return 128;
    }

    private int c(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i2 != 0) {
            return a(this.b[i], i4 + 4);
        }
        if (i3 != 0) {
            return a(this.c[i], i2);
        }
        return 128;
    }

    private int d(int i, int i2, int i3) {
        int i4 = i3 & 7;
        if (i2 != 0 && i3 != 0) {
            return a(this.b[i], this.c[i], i4 + 4, i2 + 4);
        }
        if (i2 != 0) {
            return a(this.b[i], i4 + 4);
        }
        if (i3 != 0) {
            return a(this.c[i], i2 + 4);
        }
        return 128;
    }

    public final int a(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return 128;
        }
        return i2 == 0 ? (com.uxcam.video.screen.codec.b.a.a(this.b[0]) + 8) >> 4 : i == 0 ? (com.uxcam.video.screen.codec.b.a.a(this.c[0], i) + 8) >> 4 : ((com.uxcam.video.screen.codec.b.a.a(this.b[0]) + com.uxcam.video.screen.codec.b.a.a(this.c[0], i)) + 16) >> 5;
    }

    public static void a(int[] iArr, int i, int i2, int i3, int i4, int[] iArr2, int i5) {
        if (i3 + 4 < i && i4 + 4 < i2) {
            int i6 = 0;
            int i7 = (i4 * i) + i3;
            int i8 = 0;
            while (i6 < 4) {
                iArr2[i8] = iArr[i7] - i5;
                iArr2[i8 + 1] = iArr[i7 + 1] - i5;
                iArr2[i8 + 2] = iArr[i7 + 2] - i5;
                iArr2[i8 + 3] = iArr[i7 + 3] - i5;
                i6++;
                i7 += i;
                i8 += 4;
            }
            return;
        }
        int i9 = 0;
        int i10 = i4;
        while (i10 < Math.min(i4 + 4, i2)) {
            int min = (i10 * i) + Math.min(i3, i);
            int i11 = i3;
            while (i11 < Math.min(i3 + 4, i)) {
                int i12 = i9;
                i9++;
                int i13 = min;
                min++;
                iArr2[i12] = iArr[i13] - i5;
                i11++;
            }
            int i14 = min - 1;
            while (i11 < i3 + 4) {
                int i15 = i9;
                i9++;
                iArr2[i15] = iArr[i14] - i5;
                i11++;
            }
            i10++;
        }
        while (i10 < i4 + 4) {
            int min2 = ((i2 * i) - i) + Math.min(i3, i);
            int i16 = i3;
            while (i16 < Math.min(i3 + 4, i)) {
                int i17 = i9;
                i9++;
                int i18 = min2;
                min2++;
                iArr2[i17] = iArr[i18] - i5;
                i16++;
            }
            int i19 = min2 - 1;
            while (i16 < i3 + 4) {
                int i20 = i9;
                i9++;
                iArr2[i20] = iArr[i19] - i5;
                i16++;
            }
            i10++;
        }
    }

    public static com.uxcam.video.screen.codec.b.b.b[] a() {
        return new com.uxcam.video.screen.codec.b.b.b[]{com.uxcam.video.screen.codec.b.b.b.YUV420J};
    }
}
