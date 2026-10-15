package com.uxcam.e;

import com.uxcam.e.r;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/z.class */
public final class z {
    public final s a;
    public final String b;
    public final r c;
    public final aa d;
    final Object e;
    private volatile d f;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/z$a.class */
    public static class a {
        s a;
        String b;
        public r.a c;
        aa d;
        Object e;

        public a() {
            this.b = "GET";
            this.c = new r.a();
        }

        private a(z zVar) {
            this.a = zVar.a;
            this.b = zVar.b;
            this.d = zVar.d;
            this.e = zVar.e;
            this.c = zVar.c.a();
        }

        public final a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.a = sVar;
            return this;
        }

        public final a a(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            s d = s.d(str);
            if (d == null) {
                throw new IllegalArgumentException("unexpected url: " + str);
            }
            return a(d);
        }

        public final a a(String str, String str2) {
            r.a aVar = this.c;
            r.a.b(str, str2);
            aVar.a(str);
            aVar.a(str, str2);
            return this;
        }

        public final a b(String str) {
            this.c.a(str);
            return this;
        }

        public final a a(String str, aa aaVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (aaVar != null && !com.uxcam.e.a.d.g.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (aaVar == null && com.uxcam.e.a.d.g.a(str)) {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
            this.b = str;
            this.d = aaVar;
            return this;
        }

        public final z a() {
            if (this.a == null) {
                throw new IllegalStateException("url == null");
            }
            return new z(this, (byte) 0);
        }

        /* synthetic */ a(z zVar, byte b) {
            this(zVar);
        }
    }

    private z(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = aVar.e != null ? aVar.e : this;
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final a a() {
        return new a(this, (byte) 0);
    }

    public final d b() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.c);
        this.f = a2;
        return a2;
    }

    public final String toString() {
        return "Request{method=" + this.b + ", url=" + this.a + ", tag=" + (this.e != this ? this.e : null) + '}';
    }

    /* synthetic */ z(a aVar, byte b) {
        this(aVar);
    }
}
