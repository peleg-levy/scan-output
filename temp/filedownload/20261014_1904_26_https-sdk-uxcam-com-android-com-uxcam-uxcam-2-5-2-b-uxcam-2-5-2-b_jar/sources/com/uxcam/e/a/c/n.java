package com.uxcam.e.a.c;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/n.class */
public final class n {
    int a;
    int b;
    int c;
    final int[] d = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n a(int i, int i2, int i3) {
        if (i >= this.d.length) {
            return this;
        }
        int i4 = 1 << i;
        this.a |= i4;
        if ((i2 & 1) != 0) {
            this.b |= i4;
        } else {
            this.b &= i4 ^ (-1);
        }
        if ((i2 & 2) != 0) {
            this.c |= i4;
        } else {
            this.c &= i4 ^ (-1);
        }
        this.d[i] = i3;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i) {
        return (this.a & (1 << i)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = 0;
        if ((this.c & (1 << i)) != 0) {
            i2 = 2;
        }
        if ((this.b & (1 << i)) != 0) {
            i2 |= 1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if ((2 & this.a) != 0) {
            return this.d[1];
        }
        return -1;
    }

    public final int b() {
        if ((128 & this.a) != 0) {
            return this.d[7];
        }
        return 65536;
    }
}
