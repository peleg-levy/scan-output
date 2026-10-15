package com.uxcam.e.a.d;

import com.uxcam.e.ab;
import com.uxcam.e.ac;
import com.uxcam.e.r;
import com.uxcam.e.w;
import com.uxcam.e.z;
import com.uxcam.f.r;
import com.uxcam.f.s;
import com.uxcam.f.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/c.class */
public final class c implements h {
    final w a;
    final com.uxcam.e.a.b.g b;
    final com.uxcam.f.e c;
    final com.uxcam.f.d d;
    int e = 0;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/c$a.class */
    private abstract class a implements s {
        protected final com.uxcam.f.i a;
        protected boolean b;

        private a() {
            this.a = new com.uxcam.f.i(c.this.c.a());
        }

        @Override // com.uxcam.f.s
        public final t a() {
            return this.a;
        }

        protected final void a(boolean z) {
            if (c.this.e == 6) {
                return;
            }
            if (c.this.e != 5) {
                throw new IllegalStateException("state: " + c.this.e);
            }
            c.a(this.a);
            c.this.e = 6;
            if (c.this.b != null) {
                c.this.b.a(!z, c.this);
            }
        }

        /* synthetic */ a(c cVar, byte b) {
            this();
        }
    }

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/c$b.class */
    private final class b implements r {
        private final com.uxcam.f.i b;
        private boolean c;

        private b() {
            this.b = new com.uxcam.f.i(c.this.d.a());
        }

        @Override // com.uxcam.f.r
        public final t a() {
            return this.b;
        }

        @Override // com.uxcam.f.r
        public final void a_(com.uxcam.f.c cVar, long j) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            c.this.d.i(j);
            c.this.d.b("\r\n");
            c.this.d.a_(cVar, j);
            c.this.d.b("\r\n");
        }

        @Override // com.uxcam.f.r, java.io.Flushable
        public final synchronized void flush() {
            if (this.c) {
                return;
            }
            c.this.d.flush();
        }

        @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            c.this.d.b("0\r\n\r\n");
            c.a(this.b);
            c.this.e = 3;
        }

        /* synthetic */ b(c cVar, byte b) {
            this();
        }
    }

    /* renamed from: com.uxcam.e.a.d.c$c, reason: collision with other inner class name */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/c$c.class */
    private class C0000c extends a {
        private final com.uxcam.e.s e;
        private long f;
        private boolean g;

        C0000c(com.uxcam.e.s sVar) {
            super(c.this, (byte) 0);
            this.f = -1L;
            this.g = true;
            this.e = sVar;
        }

        @Override // com.uxcam.f.s
        public final long a(com.uxcam.f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (!this.g) {
                return -1L;
            }
            if (this.f == 0 || this.f == -1) {
                if (this.f != -1) {
                    c.this.c.l();
                }
                try {
                    this.f = c.this.c.i();
                    String trim = c.this.c.l().trim();
                    if (this.f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f + trim + "\"");
                    }
                    if (this.f == 0) {
                        this.g = false;
                        com.uxcam.e.a.d.f.a(c.this.a.h, this.e, c.this.d());
                        a(true);
                    }
                    if (!this.g) {
                        return -1L;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long a = c.this.c.a(cVar, Math.min(j, this.f));
            if (a == -1) {
                a(false);
                throw new ProtocolException("unexpected end of stream");
            }
            this.f -= a;
            return a;
        }

        @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            if (this.g && !com.uxcam.e.a.c.a((s) this, TimeUnit.MILLISECONDS)) {
                a(false);
            }
            this.b = true;
        }
    }

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/c$d.class */
    private final class d implements r {
        private final com.uxcam.f.i b;
        private boolean c;
        private long d;

        private d(long j) {
            this.b = new com.uxcam.f.i(c.this.d.a());
            this.d = j;
        }

        @Override // com.uxcam.f.r
        public final t a() {
            return this.b;
        }

        @Override // com.uxcam.f.r
        public final void a_(com.uxcam.f.c cVar, long j) {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            com.uxcam.e.a.c.a(cVar.b, j);
            if (j > this.d) {
                throw new ProtocolException("expected " + this.d + " bytes but received " + j);
            }
            c.this.d.a_(cVar, j);
            this.d -= j;
        }

        @Override // com.uxcam.f.r, java.io.Flushable
        public final void flush() {
            if (this.c) {
                return;
            }
            c.this.d.flush();
        }

        @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            c.a(this.b);
            c.this.e = 3;
        }

        /* synthetic */ d(c cVar, long j, byte b) {
            this(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/c$e.class */
    public class e extends a {
        private long e;

        public e(long j) {
            super(c.this, (byte) 0);
            this.e = j;
            if (this.e == 0) {
                a(true);
            }
        }

        @Override // com.uxcam.f.s
        public final long a(com.uxcam.f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (this.e == 0) {
                return -1L;
            }
            long a = c.this.c.a(cVar, Math.min(this.e, j));
            if (a == -1) {
                a(false);
                throw new ProtocolException("unexpected end of stream");
            }
            this.e -= a;
            if (this.e == 0) {
                a(true);
            }
            return a;
        }

        @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            if (this.e != 0 && !com.uxcam.e.a.c.a((s) this, TimeUnit.MILLISECONDS)) {
                a(false);
            }
            this.b = true;
        }
    }

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/c$f.class */
    private class f extends a {
        private boolean e;

        private f() {
            super(c.this, (byte) 0);
        }

        @Override // com.uxcam.f.s
        public final long a(com.uxcam.f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            if (this.e) {
                return -1L;
            }
            long a = c.this.c.a(cVar, j);
            if (a != -1) {
                return a;
            }
            this.e = true;
            a(true);
            return -1L;
        }

        @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            if (!this.e) {
                a(false);
            }
            this.b = true;
        }

        /* synthetic */ f(c cVar, byte b) {
            this();
        }
    }

    public c(w wVar, com.uxcam.e.a.b.g gVar, com.uxcam.f.e eVar, com.uxcam.f.d dVar) {
        this.a = wVar;
        this.b = gVar;
        this.c = eVar;
        this.d = dVar;
    }

    @Override // com.uxcam.e.a.d.h
    public final r a(z zVar, long j) {
        if ("chunked".equalsIgnoreCase(zVar.a("Transfer-Encoding"))) {
            if (this.e != 1) {
                throw new IllegalStateException("state: " + this.e);
            }
            this.e = 2;
            return new b(this, (byte) 0);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 2;
        return new d(this, j, (byte) 0);
    }

    @Override // com.uxcam.e.a.d.h
    public final void a(z zVar) {
        Proxy.Type type = this.b.b().a.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.b);
        sb.append(' ');
        if (!zVar.a.b() && type == Proxy.Type.HTTP) {
            sb.append(zVar.a);
        } else {
            sb.append(k.a(zVar.a));
        }
        sb.append(" HTTP/1.1");
        a(zVar.c, sb.toString());
    }

    @Override // com.uxcam.e.a.d.h
    public final ab.a a() {
        return c();
    }

    @Override // com.uxcam.e.a.d.h
    public final ac a(ab abVar) {
        s fVar;
        if (!com.uxcam.e.a.d.f.a(abVar)) {
            fVar = a(0L);
        } else if ("chunked".equalsIgnoreCase(abVar.a("Transfer-Encoding"))) {
            com.uxcam.e.s sVar = abVar.a.a;
            if (this.e != 4) {
                throw new IllegalStateException("state: " + this.e);
            }
            this.e = 5;
            fVar = new C0000c(sVar);
        } else {
            long a2 = com.uxcam.e.a.d.f.a(abVar.e);
            if (a2 != -1) {
                fVar = a(a2);
            } else {
                if (this.e != 4) {
                    throw new IllegalStateException("state: " + this.e);
                }
                if (this.b == null) {
                    throw new IllegalStateException("streamAllocation == null");
                }
                this.e = 5;
                this.b.d();
                fVar = new f(this, (byte) 0);
            }
        }
        return new j(abVar.e, com.uxcam.f.l.a(fVar));
    }

    @Override // com.uxcam.e.a.d.h
    public final void b() {
        this.d.flush();
    }

    public final void a(com.uxcam.e.r rVar, String str) {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.b(str).b("\r\n");
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            this.d.b(rVar.a(i)).b(": ").b(rVar.b(i)).b("\r\n");
        }
        this.d.b("\r\n");
        this.e = 1;
    }

    public final ab.a c() {
        m a2;
        ab.a a3;
        if (this.e != 1 && this.e != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        do {
            try {
                a2 = m.a(this.c.l());
                ab.a aVar = new ab.a();
                aVar.b = a2.a;
                aVar.c = a2.b;
                aVar.d = a2.c;
                a3 = aVar.a(d());
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.b);
                iOException.initCause(e2);
                throw iOException;
            }
        } while (a2.b == 100);
        this.e = 4;
        return a3;
    }

    public final com.uxcam.e.r d() {
        r.a aVar = new r.a();
        while (true) {
            String l = this.c.l();
            if (l.length() == 0) {
                return aVar.a();
            }
            com.uxcam.e.a.a.a.a(aVar, l);
        }
    }

    public final s a(long j) {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new e(j);
    }

    static /* synthetic */ void a(com.uxcam.f.i iVar) {
        t tVar = iVar.a;
        t tVar2 = t.b;
        if (tVar2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        iVar.a = tVar2;
        tVar.e_();
        tVar.d();
    }
}
