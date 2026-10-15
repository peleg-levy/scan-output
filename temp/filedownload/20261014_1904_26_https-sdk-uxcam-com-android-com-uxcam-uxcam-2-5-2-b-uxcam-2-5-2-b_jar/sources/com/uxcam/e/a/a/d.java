package com.uxcam.e.a.a;

import com.uxcam.f.r;
import com.uxcam.f.t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/a/d.class */
public final class d implements Closeable, Flushable {
    static final Pattern a;
    private final com.uxcam.e.a.e.a c;
    private long d;
    private final int e;
    private long f;
    private com.uxcam.f.d g;
    private final LinkedHashMap h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final Executor m;
    private final Runnable n;
    private static final r o;
    static final /* synthetic */ boolean b;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/a/d$a.class */
    public final class a {
        final b a;
        boolean b;
        final /* synthetic */ d c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/a/d$b.class */
    public final class b {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        a f;

        final void a(com.uxcam.f.d dVar) {
            for (long j : this.b) {
                dVar.h(32).j(j);
            }
        }
    }

    private synchronized void a(a aVar) {
        b bVar = aVar.a;
        if (bVar.f != aVar) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < this.e; i++) {
            this.c.a(bVar.d[i]);
        }
        this.i++;
        bVar.f = null;
        if (bVar.e || false) {
            bVar.e = true;
            this.g.b("CLEAN").h(32);
            this.g.b(bVar.a);
            bVar.a(this.g);
            this.g.h(10);
        } else {
            this.h.remove(bVar.a);
            this.g.b("REMOVE").h(32);
            this.g.b(bVar.a);
            this.g.h(10);
        }
        this.g.flush();
        if (this.f > this.d || a()) {
            this.m.execute(this.n);
        }
    }

    private boolean a() {
        return this.i >= 2000 && this.i >= this.h.size();
    }

    private boolean a(b bVar) {
        if (bVar.f != null) {
            a aVar = bVar.f;
            if (aVar.a.f == aVar) {
                for (int i = 0; i < aVar.c.e; i++) {
                    try {
                        aVar.c.c.a(aVar.a.d[i]);
                    } catch (IOException unused) {
                    }
                }
                aVar.a.f = null;
            }
        }
        for (int i2 = 0; i2 < this.e; i2++) {
            this.c.a(bVar.c[i2]);
            this.f -= bVar.b[i2];
            bVar.b[i2] = 0;
        }
        this.i++;
        this.g.b("REMOVE").h(32).b(bVar.a).h(10);
        this.h.remove(bVar.a);
        if (!a()) {
            return true;
        }
        this.m.execute(this.n);
        return true;
    }

    private synchronized boolean b() {
        return this.k;
    }

    private synchronized void c() {
        if (b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.j) {
            c();
            d();
            this.g.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.j || this.k) {
            this.k = true;
            return;
        }
        for (b bVar : (b[]) this.h.values().toArray(new b[this.h.size()])) {
            if (bVar.f != null) {
                a aVar = bVar.f;
                synchronized (aVar.c) {
                    if (aVar.b) {
                        throw new IllegalStateException();
                    }
                    if (aVar.a.f == aVar) {
                        aVar.c.a(aVar);
                    }
                    aVar.b = true;
                }
            }
        }
        d();
        this.g.close();
        this.g = null;
        this.k = true;
    }

    private void d() {
        while (this.f > this.d) {
            a((b) this.h.values().iterator().next());
        }
        this.l = false;
    }

    static {
        b = !d.class.desiredAssertionStatus();
        a = Pattern.compile("[a-z0-9_-]{1,120}");
        o = new r() { // from class: com.uxcam.e.a.a.d.1
            @Override // com.uxcam.f.r
            public final void a_(com.uxcam.f.c cVar, long j) {
                cVar.f(j);
            }

            @Override // com.uxcam.f.r, java.io.Flushable
            public final void flush() {
            }

            @Override // com.uxcam.f.r
            public final t a() {
                return t.b;
            }

            @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        };
    }
}
