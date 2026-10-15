package com.uxcam.video.screen.codec.b.b;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/b/d.class */
public final class d {
    public b a;
    public int b;
    public int c;
    public int[][] d;
    public f e = null;

    private d(int i, int i2, int[][] iArr, b bVar) {
        this.b = i;
        this.c = i2;
        this.d = iArr;
        this.a = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [int[], int[][]] */
    public static d a(int i, int i2, b bVar) {
        int[] iArr = new int[4];
        for (int i3 = 0; i3 < bVar.l; i3++) {
            int i4 = bVar.m[i3];
            iArr[i4] = iArr[i4] + ((i >> bVar.n[i3]) * (i2 >> bVar.o[i3]));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            i5 += iArr[i6] != 0 ? 1 : 0;
        }
        ?? r0 = new int[i5];
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            if (iArr[i8] != 0) {
                int i9 = i7;
                i7++;
                r0[i9] = new int[iArr[i8]];
            }
        }
        return new d(i, i2, r0, bVar);
    }

    public final int a(int i) {
        return this.b >> this.a.n[i];
    }

    public final int b(int i) {
        return this.c >> this.a.o[i];
    }
}
