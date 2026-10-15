package com.uxcam.f;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/o.class */
final class o {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    o f;
    o g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(o oVar) {
        this(oVar.a, oVar.b, oVar.c);
        oVar.d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public final o a() {
        o oVar = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return oVar;
    }

    public final o a(o oVar) {
        oVar.g = this;
        oVar.f = this.f;
        this.f.g = oVar;
        this.f = oVar;
        return oVar;
    }

    public final void a(o oVar, int i) {
        if (!oVar.e) {
            throw new IllegalArgumentException();
        }
        if (oVar.c + i > 8192) {
            if (oVar.d) {
                throw new IllegalArgumentException();
            }
            if ((oVar.c + i) - oVar.b > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(oVar.a, oVar.b, oVar.a, 0, oVar.c - oVar.b);
            oVar.c -= oVar.b;
            oVar.b = 0;
        }
        System.arraycopy(this.a, this.b, oVar.a, oVar.c, i);
        oVar.c += i;
        this.b += i;
    }
}
