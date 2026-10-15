package com.uxcam.f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/k.class */
public final class k implements s {
    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;

    public k(s sVar, Inflater inflater) {
        this(l.a(sVar), inflater);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.a = eVar;
        this.b = inflater;
    }

    @Override // com.uxcam.f.s
    public final long a(c cVar, long j) {
        boolean b;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            b = b();
            try {
                o e = cVar.e(1);
                int inflate = this.b.inflate(e.a, e.c, 8192 - e.c);
                if (inflate > 0) {
                    e.c += inflate;
                    cVar.b += inflate;
                    return inflate;
                }
                if (this.b.finished() || this.b.needsDictionary()) {
                    c();
                    if (e.b != e.c) {
                        return -1L;
                    }
                    cVar.a = e.a();
                    p.a(e);
                    return -1L;
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!b);
        throw new EOFException("source exhausted prematurely");
    }

    public final boolean b() {
        if (!this.b.needsInput()) {
            return false;
        }
        c();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.a.c()) {
            return true;
        }
        o oVar = this.a.b().a;
        this.c = oVar.c - oVar.b;
        this.b.setInput(oVar.a, oVar.b, this.c);
        return false;
    }

    private void c() {
        if (this.c == 0) {
            return;
        }
        int remaining = this.c - this.b.getRemaining();
        this.c -= remaining;
        this.a.f(remaining);
    }

    @Override // com.uxcam.f.s
    public final t a() {
        return this.a.a();
    }

    @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
