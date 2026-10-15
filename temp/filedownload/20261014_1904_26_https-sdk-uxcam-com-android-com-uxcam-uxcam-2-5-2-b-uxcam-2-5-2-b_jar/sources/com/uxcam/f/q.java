package com.uxcam.f;

import java.util.Arrays;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/q.class */
final class q extends f {
    final transient byte[][] f;
    final transient int[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], byte[][]] */
    public q(c cVar, int i) {
        super(null);
        u.a(cVar.b, 0L, i);
        int i2 = 0;
        int i3 = 0;
        o oVar = cVar.a;
        while (true) {
            o oVar2 = oVar;
            if (i2 >= i) {
                this.f = new byte[i3];
                this.g = new int[i3 * 2];
                int i4 = 0;
                int i5 = 0;
                o oVar3 = cVar.a;
                while (true) {
                    o oVar4 = oVar3;
                    if (i4 >= i) {
                        return;
                    }
                    this.f[i5] = oVar4.a;
                    int i6 = i4 + (oVar4.c - oVar4.b);
                    i4 = i6;
                    if (i6 > i) {
                        i4 = i;
                    }
                    this.g[i5] = i4;
                    this.g[i5 + this.f.length] = oVar4.b;
                    oVar4.d = true;
                    i5++;
                    oVar3 = oVar4.f;
                }
            } else {
                if (oVar2.c == oVar2.b) {
                    throw new AssertionError("s.limit == s.pos");
                }
                i2 += oVar2.c - oVar2.b;
                i3++;
                oVar = oVar2.f;
            }
        }
    }

    @Override // com.uxcam.f.f
    public final String a() {
        return g().a();
    }

    @Override // com.uxcam.f.f
    public final String b() {
        return g().b();
    }

    @Override // com.uxcam.f.f
    public final String c() {
        return g().c();
    }

    @Override // com.uxcam.f.f
    public final f d() {
        return g().d();
    }

    @Override // com.uxcam.f.f
    public final f a(int i, int i2) {
        return g().a(i, i2);
    }

    @Override // com.uxcam.f.f
    public final byte a(int i) {
        u.a(this.g[this.f.length - 1], i, 1L);
        int b = b(i);
        return this.f[b][(i - (b == 0 ? 0 : this.g[b - 1])) + this.g[b + this.f.length]];
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    @Override // com.uxcam.f.f
    public final int e() {
        return this.g[this.f.length - 1];
    }

    @Override // com.uxcam.f.f
    public final byte[] f() {
        byte[] bArr = new byte[this.g[this.f.length - 1]];
        int i = 0;
        int length = this.f.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.g[length + i2];
            int i4 = this.g[i2];
            System.arraycopy(this.f[i2], i3, bArr, i, i4 - i);
            i = i4;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.uxcam.f.f
    public final void a(c cVar) {
        int i = 0;
        int length = this.f.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.g[length + i2];
            int i4 = this.g[i2];
            o oVar = new o(this.f[i2], i3, (i3 + i4) - i);
            if (cVar.a == null) {
                oVar.g = oVar;
                oVar.f = oVar;
                cVar.a = oVar;
            } else {
                cVar.a.g.a(oVar);
            }
            i = i4;
        }
        cVar.b += i;
    }

    @Override // com.uxcam.f.f
    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, (i4 + (this.g[b] - i4)) - i);
            if (!u.a(this.f[b], (i - i4) + this.g[this.f.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    private f g() {
        return new f(f());
    }

    @Override // com.uxcam.f.f
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || ((f) obj).e() != e()) {
            return false;
        }
        f fVar = (f) obj;
        int e = e();
        int i = 0;
        int i2 = 0;
        if (0 <= e() - e) {
            int b = b(0);
            while (true) {
                if (e <= 0) {
                    z = true;
                    break;
                }
                int i3 = b == 0 ? 0 : this.g[b - 1];
                int min = Math.min(e, (i3 + (this.g[b] - i3)) - i2);
                if (!fVar.a(i, this.f[b], (i2 - i3) + this.g[this.f.length + b], min)) {
                    z = false;
                    break;
                }
                i2 += min;
                i += min;
                e -= min;
                b++;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.uxcam.f.f
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int i2 = 1;
        int i3 = 0;
        int length = this.f.length;
        for (int i4 = 0; i4 < length; i4++) {
            byte[] bArr = this.f[i4];
            int i5 = this.g[length + i4];
            int i6 = this.g[i4];
            int i7 = i5 + (i6 - i3);
            for (int i8 = i5; i8 < i7; i8++) {
                i2 = (31 * i2) + bArr[i8];
            }
            i3 = i6;
        }
        int i9 = i2;
        this.d = i9;
        return i9;
    }

    @Override // com.uxcam.f.f
    public final String toString() {
        return g().toString();
    }
}
