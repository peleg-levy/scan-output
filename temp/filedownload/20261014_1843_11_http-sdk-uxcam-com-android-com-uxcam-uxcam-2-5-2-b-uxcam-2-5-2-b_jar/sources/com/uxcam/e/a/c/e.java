package com.uxcam.e.a.c;

import com.uxcam.f.r;
import com.uxcam.f.s;
import com.uxcam.f.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/e.class */
public final class e {
    long b;
    final int c;
    final d d;
    private final List k;
    List e;
    public final b f;
    final a g;
    static final /* synthetic */ boolean j;
    long a = 0;
    public final c h = new c();
    public final c i = new c();
    private com.uxcam.e.a.c.a l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/e$a.class */
    public final class a implements r {
        private final com.uxcam.f.c c = new com.uxcam.f.c();
        private boolean d;
        private boolean e;
        static final /* synthetic */ boolean a;

        a() {
        }

        @Override // com.uxcam.f.r
        public final void a_(com.uxcam.f.c cVar, long j) {
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            this.c.a_(cVar, j);
            while (this.c.b >= 16384) {
                a(false);
            }
        }

        private void a(boolean z) {
            long min;
            synchronized (e.this) {
                e.this.i.a_();
                while (e.this.b <= 0 && !this.e && !this.d && e.this.l == null) {
                    try {
                        e.this.f();
                    } finally {
                    }
                }
                e.this.i.b();
                e.h(e.this);
                min = Math.min(e.this.b, this.c.b);
                e.this.b -= min;
            }
            e.this.i.a_();
            try {
                e.this.d.a(e.this.c, z && min == this.c.b, this.c, min);
            } finally {
            }
        }

        @Override // com.uxcam.f.r, java.io.Flushable
        public final void flush() {
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            synchronized (e.this) {
                e.h(e.this);
            }
            while (this.c.b > 0) {
                a(false);
                e.this.d.b();
            }
        }

        @Override // com.uxcam.f.r
        public final t a() {
            return e.this.i;
        }

        @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            synchronized (e.this) {
                if (this.d) {
                    return;
                }
                if (!e.this.g.e) {
                    if (this.c.b > 0) {
                        while (this.c.b > 0) {
                            a(true);
                        }
                    } else {
                        e.this.d.a(e.this.c, true, (com.uxcam.f.c) null, 0L);
                    }
                }
                synchronized (e.this) {
                    this.d = true;
                }
                e.this.d.b();
                e.f(e.this);
            }
        }

        static {
            a = !e.class.desiredAssertionStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/e$b.class */
    public final class b implements s {
        private final com.uxcam.f.c c;
        private final com.uxcam.f.c d;
        private final long e;
        private boolean f;
        private boolean g;
        static final /* synthetic */ boolean a;

        private b(long j) {
            this.c = new com.uxcam.f.c();
            this.d = new com.uxcam.f.c();
            this.e = j;
        }

        @Override // com.uxcam.f.s
        public final long a(com.uxcam.f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            synchronized (e.this) {
                b();
                if (this.f) {
                    throw new IOException("stream closed");
                }
                if (e.this.l != null) {
                    throw new p(e.this.l);
                }
                if (this.d.b == 0) {
                    return -1L;
                }
                long a2 = this.d.a(cVar, Math.min(j, this.d.b));
                e.this.a += a2;
                if (e.this.a >= e.this.d.e.b() / 2) {
                    e.this.d.a(e.this.c, e.this.a);
                    e.this.a = 0L;
                }
                synchronized (e.this.d) {
                    e.this.d.c += a2;
                    if (e.this.d.c >= e.this.d.e.b() / 2) {
                        e.this.d.a(0, e.this.d.c);
                        e.this.d.c = 0L;
                    }
                }
                return a2;
            }
        }

        private void b() {
            e.this.h.a_();
            while (this.d.b == 0 && !this.g && !this.f && e.this.l == null) {
                try {
                    e.this.f();
                } finally {
                    e.this.h.b();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(com.uxcam.f.e eVar, long j) {
            boolean z;
            boolean z2;
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (e.this) {
                    z = this.g;
                    z2 = j + this.d.b > this.e;
                }
                if (z2) {
                    eVar.f(j);
                    e.this.b(com.uxcam.e.a.c.a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    eVar.f(j);
                    return;
                }
                long a2 = eVar.a(this.c, j);
                if (a2 == -1) {
                    throw new EOFException();
                }
                j -= a2;
                synchronized (e.this) {
                    boolean z3 = this.d.b == 0;
                    this.d.a(this.c);
                    if (z3) {
                        e.this.notifyAll();
                    }
                }
            }
        }

        @Override // com.uxcam.f.s
        public final t a() {
            return e.this.h;
        }

        @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (e.this) {
                this.f = true;
                this.d.n();
                e.this.notifyAll();
            }
            e.f(e.this);
        }

        /* synthetic */ b(e eVar, long j, byte b) {
            this(j);
        }

        static {
            a = !e.class.desiredAssertionStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/e$c.class */
    public class c extends com.uxcam.f.a {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.uxcam.f.a
        public final void a() {
            e.this.b(com.uxcam.e.a.c.a.CANCEL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.uxcam.f.a
        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void b() {
            if (b_()) {
                throw a((IOException) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i, d dVar, boolean z, boolean z2, List list) {
        if (dVar == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.c = i;
        this.d = dVar;
        this.b = dVar.f.b();
        this.f = new b(this, dVar.e.b(), (byte) 0);
        this.g = new a();
        this.f.g = z2;
        this.g.e = z;
        this.k = list;
    }

    public final synchronized boolean a() {
        if (this.l != null) {
            return false;
        }
        if (this.f.g || this.f.f) {
            return !(this.g.e || this.g.d) || this.e == null;
        }
        return true;
    }

    public final boolean b() {
        return this.d.b == ((this.c & 1) == 1);
    }

    public final synchronized List c() {
        this.h.a_();
        while (this.e == null && this.l == null) {
            try {
                f();
            } finally {
                this.h.b();
            }
        }
        if (this.e != null) {
            return this.e;
        }
        throw new p(this.l);
    }

    public final r d() {
        synchronized (this) {
            if (this.e == null && !b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.g;
    }

    public final void a(com.uxcam.e.a.c.a aVar) {
        if (d(aVar)) {
            this.d.b(this.c, aVar);
        }
    }

    public final void b(com.uxcam.e.a.c.a aVar) {
        if (d(aVar)) {
            this.d.a(this.c, aVar);
        }
    }

    private boolean d(com.uxcam.e.a.c.a aVar) {
        if (!j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            if (this.f.g && this.g.e) {
                return false;
            }
            this.l = aVar;
            notifyAll();
            this.d.b(this.c);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        boolean a2;
        if (!j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f.g = true;
            a2 = a();
            notifyAll();
        }
        if (a2) {
            return;
        }
        this.d.b(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(com.uxcam.e.a.c.a aVar) {
        if (this.l == null) {
            this.l = aVar;
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    static /* synthetic */ void f(e eVar) {
        boolean z;
        boolean a2;
        if (!j && Thread.holdsLock(eVar)) {
            throw new AssertionError();
        }
        synchronized (eVar) {
            z = !eVar.f.g && eVar.f.f && (eVar.g.e || eVar.g.d);
            a2 = eVar.a();
        }
        if (z) {
            eVar.a(com.uxcam.e.a.c.a.CANCEL);
        } else {
            if (a2) {
                return;
            }
            eVar.d.b(eVar.c);
        }
    }

    static /* synthetic */ void h(e eVar) {
        if (eVar.g.d) {
            throw new IOException("stream closed");
        }
        if (eVar.g.e) {
            throw new IOException("stream finished");
        }
        if (eVar.l != null) {
            throw new p(eVar.l);
        }
    }

    static {
        j = !e.class.desiredAssertionStatus();
    }
}
