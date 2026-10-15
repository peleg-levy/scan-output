package com.uxcam.video.screen.codec.codecs.h264.a;

import java.util.Arrays;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/a/b.class */
public final class b {
    public static int[] a = {0, 1, 4, 8, 5, 2, 3, 6, 9, 12, 13, 10, 7, 11, 14, 15};
    static int[][] b = {new int[]{10, 13, 10, 13, 13, 16, 13, 16, 10, 13, 10, 13, 13, 16, 13, 16}, new int[]{11, 14, 11, 14, 14, 18, 14, 18, 11, 14, 11, 14, 14, 18, 14, 18}, new int[]{13, 16, 13, 16, 16, 20, 16, 20, 13, 16, 13, 16, 16, 20, 16, 20}, new int[]{14, 18, 14, 18, 18, 23, 18, 23, 14, 18, 14, 18, 18, 23, 18, 23}, new int[]{16, 20, 16, 20, 20, 25, 20, 25, 16, 20, 16, 20, 20, 25, 20, 25}, new int[]{18, 23, 18, 23, 23, 29, 23, 29, 18, 23, 18, 23, 23, 29, 23, 29}};
    static int[][] c = new int[6][64];
    static int[][] d = {new int[]{20, 18, 32, 19, 25, 24}, new int[]{22, 19, 35, 21, 28, 26}, new int[]{26, 23, 42, 24, 33, 31}, new int[]{28, 25, 45, 26, 35, 33}, new int[]{32, 28, 51, 30, 40, 38}, new int[]{36, 32, 58, 34, 46, 43}};
    public static int[] e = {0, 1, 8, 16, 9, 2, 3, 10, 17, 24, 32, 25, 18, 11, 4, 5, 12, 19, 26, 33, 40, 48, 41, 34, 27, 20, 13, 6, 7, 14, 21, 28, 35, 42, 49, 56, 57, 50, 43, 36, 29, 22, 15, 23, 30, 37, 44, 51, 58, 59, 52, 45, 38, 31, 39, 46, 53, 60, 61, 54, 47, 55, 62, 63};
    private static final int[][] f = {new int[]{13107, 8066, 13107, 8066, 8066, 5243, 8066, 5243, 13107, 8066, 13107, 8066, 8066, 5243, 8066, 5243}, new int[]{11916, 7490, 11916, 7490, 7490, 4660, 7490, 4660, 11916, 7490, 11916, 7490, 7490, 4660, 7490, 4660}, new int[]{10082, 6554, 10082, 6554, 6554, 4194, 6554, 4194, 10082, 6554, 10082, 6554, 6554, 4194, 6554, 4194}, new int[]{9362, 5825, 9362, 5825, 5825, 3647, 5825, 3647, 9362, 5825, 9362, 5825, 5825, 3647, 5825, 3647}, new int[]{8192, 5243, 8192, 5243, 5243, 3355, 5243, 3355, 8192, 5243, 8192, 5243, 5243, 3355, 5243, 3355}, new int[]{7282, 4559, 7282, 4559, 4559, 2893, 4559, 2893, 7282, 4559, 7282, 4559, 4559, 2893, 4559, 2893}};

    public static final void a(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = iArr[i] + iArr[i + 2];
            int i3 = iArr[i] - iArr[i + 2];
            int i4 = (iArr[i + 1] >> 1) - iArr[i + 3];
            int i5 = iArr[i + 1] + (iArr[i + 3] >> 1);
            iArr[i] = i2 + i5;
            iArr[i + 1] = i3 + i4;
            iArr[i + 2] = i3 - i4;
            iArr[i + 3] = i2 - i5;
        }
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = iArr[i6] + iArr[i6 + 8];
            int i8 = iArr[i6] - iArr[i6 + 8];
            int i9 = (iArr[i6 + 4] >> 1) - iArr[i6 + 12];
            int i10 = iArr[i6 + 4] + (iArr[i6 + 12] >> 1);
            iArr[i6] = i7 + i10;
            iArr[i6 + 4] = i8 + i9;
            iArr[i6 + 8] = i8 - i9;
            iArr[i6 + 12] = i7 - i10;
        }
        for (int i11 = 0; i11 < 16; i11++) {
            iArr[i11] = (iArr[i11] + 32) >> 6;
        }
    }

    public static void b(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = iArr[i] + iArr[i + 3];
            int i3 = iArr[i + 1] + iArr[i + 2];
            int i4 = iArr[i + 1] - iArr[i + 2];
            int i5 = iArr[i] - iArr[i + 3];
            iArr[i] = i2 + i3;
            iArr[i + 1] = (i5 << 1) + i4;
            iArr[i + 2] = i2 - i3;
            iArr[i + 3] = i5 - (i4 << 1);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = iArr[i6] + iArr[i6 + 12];
            int i8 = iArr[i6 + 4] + iArr[i6 + 8];
            int i9 = iArr[i6 + 4] - iArr[i6 + 8];
            int i10 = iArr[i6] - iArr[i6 + 12];
            iArr[i6] = i7 + i8;
            iArr[i6 + 4] = i9 + (i10 << 1);
            iArr[i6 + 8] = i7 - i8;
            iArr[i6 + 12] = i10 - (i9 << 1);
        }
    }

    public static void c(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = iArr[i] + iArr[i + 2];
            int i3 = iArr[i] - iArr[i + 2];
            int i4 = iArr[i + 1] - iArr[i + 3];
            int i5 = iArr[i + 1] + iArr[i + 3];
            iArr[i] = i2 + i5;
            iArr[i + 1] = i3 + i4;
            iArr[i + 2] = i3 - i4;
            iArr[i + 3] = i2 - i5;
        }
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = iArr[i6] + iArr[i6 + 8];
            int i8 = iArr[i6] - iArr[i6 + 8];
            int i9 = iArr[i6 + 4] - iArr[i6 + 12];
            int i10 = iArr[i6 + 4] + iArr[i6 + 12];
            iArr[i6] = i7 + i10;
            iArr[i6 + 4] = i8 + i9;
            iArr[i6 + 8] = i8 - i9;
            iArr[i6 + 12] = i7 - i10;
        }
    }

    public static void d(int[] iArr) {
        for (int i = 0; i < 16; i += 4) {
            int i2 = iArr[i] + iArr[i + 3];
            int i3 = iArr[i + 1] + iArr[i + 2];
            int i4 = iArr[i + 1] - iArr[i + 2];
            int i5 = iArr[i] - iArr[i + 3];
            iArr[i] = i2 + i3;
            iArr[i + 1] = i5 + i4;
            iArr[i + 2] = i2 - i3;
            iArr[i + 3] = i5 - i4;
        }
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = iArr[i6] + iArr[i6 + 12];
            int i8 = iArr[i6 + 4] + iArr[i6 + 8];
            int i9 = iArr[i6 + 4] - iArr[i6 + 8];
            int i10 = iArr[i6] - iArr[i6 + 12];
            iArr[i6] = (i7 + i8) >> 1;
            iArr[i6 + 4] = (i9 + i10) >> 1;
            iArr[i6 + 8] = (i7 - i8) >> 1;
            iArr[i6 + 12] = (i10 - i9) >> 1;
        }
    }

    public static void e(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = ((iArr[i] * (b[2][i] << 4)) + 1) >> 1;
        }
    }

    public static void f(int[] iArr) {
        for (int i = 1; i < 16; i++) {
            int i2 = iArr[i] >> 31;
            iArr[i] = ((((((iArr[i] ^ i2) - i2) * f[2][i]) + 87296) >> 18) ^ i2) - i2;
        }
    }

    public static void g(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = ((iArr[i] * (b[2][0] << 4)) + 4) >> 3;
        }
    }

    public static void h(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i] >> 31;
            iArr[i] = ((((((iArr[i] ^ i2) - i2) * f[2][0]) + 174592) >> 19) ^ i2) - i2;
        }
    }

    public static void i(int[] iArr) {
        int i = iArr[0] + iArr[1];
        int i2 = iArr[0] - iArr[1];
        int i3 = iArr[2] + iArr[3];
        int i4 = iArr[2] - iArr[3];
        iArr[0] = i + i3;
        iArr[1] = i2 + i4;
        iArr[2] = i - i3;
        iArr[3] = i2 - i4;
    }

    public static void j(int[] iArr) {
        i(iArr);
    }

    public static void k(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            iArr[i] = ((iArr[i] * b[2][0]) << 3) >> 1;
        }
    }

    public static void l(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i] >> 31;
            iArr[i] = ((((((iArr[i] ^ i2) - i2) * f[2][0]) + 174592) >> 19) ^ i2) - i2;
        }
    }

    public static void m(int[] iArr) {
        com.uxcam.video.screen.codec.b.a.a(iArr, 2, 4);
        com.uxcam.video.screen.codec.b.a.a(iArr, 3, 5);
        com.uxcam.video.screen.codec.b.a.a(iArr, 10, 12);
        com.uxcam.video.screen.codec.b.a.a(iArr, 11, 13);
    }

    public static void a() {
    }

    public static void b() {
    }

    public static void c() {
    }

    public static void d() {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int[], int[][]] */
    static {
        for (int i = 0; i < 6; i++) {
            Arrays.fill(c[i], d[i][5]);
            for (int i2 = 0; i2 < 8; i2 += 4) {
                for (int i3 = 0; i3 < 8; i3 += 4) {
                    c[i][(i2 << 3) + i3] = d[i][0];
                }
            }
            for (int i4 = 1; i4 < 8; i4 += 2) {
                for (int i5 = 1; i5 < 8; i5 += 2) {
                    c[i][(i4 << 3) + i5] = d[i][1];
                }
            }
            for (int i6 = 2; i6 < 8; i6 += 4) {
                for (int i7 = 2; i7 < 8; i7 += 4) {
                    c[i][(i6 << 3) + i7] = d[i][2];
                }
            }
            for (int i8 = 0; i8 < 8; i8 += 4) {
                for (int i9 = 1; i9 < 8; i9 += 2) {
                    c[i][(i8 << 3) + i9] = d[i][3];
                }
            }
            for (int i10 = 1; i10 < 8; i10 += 2) {
                for (int i11 = 0; i11 < 8; i11 += 4) {
                    c[i][(i10 << 3) + i11] = d[i][3];
                }
            }
            for (int i12 = 0; i12 < 8; i12 += 4) {
                for (int i13 = 2; i13 < 8; i13 += 4) {
                    c[i][(i12 << 3) + i13] = d[i][4];
                }
            }
            for (int i14 = 2; i14 < 8; i14 += 4) {
                for (int i15 = 0; i15 < 8; i15 += 4) {
                    c[i][(i14 << 3) + i15] = d[i][4];
                }
            }
        }
    }
}
