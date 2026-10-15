package com.uxcam.f;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/g.class */
public final class g implements r {
    private final d a;
    private final Deflater b;
    private boolean c;

    public g(r rVar, Deflater deflater) {
        this(l.a(rVar), deflater);
    }

    private g(d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.a = dVar;
        this.b = deflater;
    }

    @Override // com.uxcam.f.r
    public final void a_(c cVar, long j) {
        u.a(cVar.b, 0L, j);
        while (j > 0) {
            o oVar = cVar.a;
            int min = (int) Math.min(j, oVar.c - oVar.b);
            this.b.setInput(oVar.a, oVar.b, min);
            a(false);
            cVar.b -= min;
            oVar.b += min;
            if (oVar.b == oVar.c) {
                cVar.a = oVar.a();
                p.a(oVar);
            }
            j -= min;
        }
    }

    @IgnoreJRERequirement
    private void a(boolean z) {
        o e;
        c b = this.a.b();
        while (true) {
            e = b.e(1);
            int deflate = z ? this.b.deflate(e.a, e.c, 8192 - e.c, 2) : this.b.deflate(e.a, e.c, 8192 - e.c);
            int i = deflate;
            if (deflate > 0) {
                e.c += i;
                b.b += i;
                this.a.o();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (e.b == e.c) {
            b.a = e.a();
            p.a(e);
        }
    }

    @Override // com.uxcam.f.r, java.io.Flushable
    public final void flush() {
        a(true);
        this.a.flush();
    }

    @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            this.b.finish();
            a(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.c = true;
        if (th != null) {
            u.a(th);
        }
    }

    @Override // com.uxcam.f.r
    public final t a() {
        return this.a.a();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ")";
    }
}
