package com.uxcam.f;

import java.io.EOFException;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/n.class */
final class n implements e {
    public final c a = new c();
    public final s b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.b = sVar;
    }

    @Override // com.uxcam.f.e
    public final c b() {
        return this.a;
    }

    @Override // com.uxcam.f.s
    public final long a(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b == 0 && this.b.a(this.a, 8192L) == -1) {
            return -1L;
        }
        return this.a.a(cVar, Math.min(j, this.a.b));
    }

    @Override // com.uxcam.f.e
    public final boolean c() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.a.c() && this.b.a(this.a, 8192L) == -1;
    }

    @Override // com.uxcam.f.e
    public final void a(long j) {
        if (!b(j)) {
            throw new EOFException();
        }
    }

    private boolean b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (this.a.b < j) {
            if (this.b.a(this.a, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.uxcam.f.e
    public final byte d() {
        a(1L);
        return this.a.d();
    }

    @Override // com.uxcam.f.e
    public final f c(long j) {
        a(j);
        return this.a.c(j);
    }

    @Override // com.uxcam.f.e
    public final byte[] m() {
        this.a.a(this.b);
        return this.a.m();
    }

    @Override // com.uxcam.f.e
    public final byte[] e(long j) {
        a(j);
        return this.a.e(j);
    }

    @Override // com.uxcam.f.e
    public final String l() {
        long a = a((byte) 10);
        if (a != -1) {
            return this.a.d(a);
        }
        c cVar = new c();
        this.a.a(cVar, 0L, Math.min(32L, this.a.b));
        throw new EOFException("\\n not found: size=" + this.a.b + " content=" + cVar.j().c() + "…");
    }

    @Override // com.uxcam.f.e
    public final short e() {
        a(2L);
        return this.a.e();
    }

    @Override // com.uxcam.f.e
    public final short g() {
        a(2L);
        return u.a(this.a.e());
    }

    @Override // com.uxcam.f.e
    public final int f() {
        a(4L);
        return this.a.f();
    }

    @Override // com.uxcam.f.e
    public final int h() {
        a(4L);
        return u.a(this.a.f());
    }

    @Override // com.uxcam.f.e
    public final long i() {
        a(1L);
        for (int i = 0; b(i + 1); i++) {
            byte b = this.a.b(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b)));
                }
                return this.a.i();
            }
        }
        return this.a.i();
    }

    @Override // com.uxcam.f.e
    public final void f(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.a.b == 0 && this.b.a(this.a, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.a.b);
            this.a.f(min);
            j -= min;
        }
    }

    @Override // com.uxcam.f.e
    public final long a(byte b) {
        long j = 0;
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long a = this.a.a(b, j);
            if (a != -1) {
                return a;
            }
            long j2 = this.a.b;
            if (this.b.a(this.a, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.n();
    }

    @Override // com.uxcam.f.s
    public final t a() {
        return this.b.a();
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }
}
