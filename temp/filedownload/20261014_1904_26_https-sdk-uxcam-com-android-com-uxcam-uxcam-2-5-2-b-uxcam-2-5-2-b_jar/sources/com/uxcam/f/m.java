package com.uxcam.f;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/m.class */
final class m implements d {
    public final c a = new c();
    public final r b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.b = rVar;
    }

    @Override // com.uxcam.f.d, com.uxcam.f.e
    public final c b() {
        return this.a;
    }

    @Override // com.uxcam.f.r
    public final void a_(c cVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a_(cVar, j);
        o();
    }

    @Override // com.uxcam.f.d
    public final d b(f fVar) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(fVar);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d b(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(str);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d b(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(bArr);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d b(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(bArr, i, i2);
        return o();
    }

    @Override // com.uxcam.f.d
    public final long a(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a = sVar.a(this.a, 8192L);
            if (a == -1) {
                return j;
            }
            j += a;
            o();
        }
    }

    @Override // com.uxcam.f.d
    public final d h(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.h(i);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d g(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.g(i);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d f(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.f(i);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d j(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.j(j);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d i(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.i(j);
        return o();
    }

    @Override // com.uxcam.f.d
    public final d o() {
        long j;
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.a;
        long j2 = cVar.b;
        long j3 = j2;
        if (j2 == 0) {
            j = 0;
        } else {
            o oVar = cVar.a.g;
            if (oVar.c < 8192 && oVar.e) {
                j3 -= oVar.c - oVar.b;
            }
            j = j3;
        }
        long j4 = j;
        if (j > 0) {
            this.b.a_(this.a, j4);
        }
        return this;
    }

    @Override // com.uxcam.f.d, com.uxcam.f.r, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b > 0) {
            this.b.a_(this.a, this.a.b);
        }
        this.b.flush();
    }

    @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.a.b > 0) {
                this.b.a_(this.a, this.a.b);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            u.a(th);
        }
    }

    @Override // com.uxcam.f.r
    public final t a() {
        return this.b.a();
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }
}
