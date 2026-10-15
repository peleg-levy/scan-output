package com.uxcam.e;

import com.uxcam.e.r;
import java.io.Closeable;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/ab.class */
public final class ab implements Closeable {
    public final z a;
    private final x i;
    public final int b;
    public final String c;
    public final q d;
    public final r e;
    public final ac f;
    private final ab j;
    private final ab k;
    private final ab l;
    public final long g;
    public final long h;
    private volatile d m;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/ab$a.class */
    public static class a {
        public z a;
        public x b;
        public int c;
        public String d;
        public q e;
        r.a f;
        public ac g;
        ab h;
        ab i;
        public ab j;
        public long k;
        public long l;

        public a() {
            this.c = -1;
            this.f = new r.a();
        }

        private a(ab abVar) {
            this.c = -1;
            this.a = abVar.a;
            this.b = abVar.i;
            this.c = abVar.b;
            this.d = abVar.c;
            this.e = abVar.d;
            this.f = abVar.e.a();
            this.g = abVar.f;
            this.h = abVar.j;
            this.i = abVar.k;
            this.j = abVar.l;
            this.k = abVar.g;
            this.l = abVar.h;
        }

        public final a a(String str, String str2) {
            r.a aVar = this.f;
            r.a.b(str, str2);
            aVar.a(str, str2);
            return this;
        }

        public final a a(r rVar) {
            this.f = rVar.a();
            return this;
        }

        public final a a(ab abVar) {
            if (abVar != null) {
                a("networkResponse", abVar);
            }
            this.h = abVar;
            return this;
        }

        public final a b(ab abVar) {
            if (abVar != null) {
                a("cacheResponse", abVar);
            }
            this.i = abVar;
            return this;
        }

        private static void a(String str, ab abVar) {
            if (abVar.f != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (abVar.j != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (abVar.k != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (abVar.l != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public final ab a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.c < 0) {
                throw new IllegalStateException("code < 0: " + this.c);
            }
            return new ab(this, (byte) 0);
        }

        /* synthetic */ a(ab abVar, byte b) {
            this(abVar);
        }
    }

    private ab(a aVar) {
        this.a = aVar.a;
        this.i = aVar.b;
        this.b = aVar.c;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f.a();
        this.f = aVar.g;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.g = aVar.k;
        this.h = aVar.l;
    }

    public final boolean a() {
        return this.b >= 200 && this.b < 300;
    }

    public final String a(String str) {
        String a2 = this.e.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public final a b() {
        return new a(this, (byte) 0);
    }

    public final d c() {
        d dVar = this.m;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.e);
        this.m = a2;
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.i + ", code=" + this.b + ", message=" + this.c + ", url=" + this.a.a + '}';
    }

    /* synthetic */ ab(a aVar, byte b) {
        this(aVar);
    }
}
