package com.uxcam.e.a.c;

import com.uxcam.e.a.c.j;
import com.uxcam.f.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/h.class */
public final class h {
    private static final f[] a = {new f(f.e, ""), new f(f.b, "GET"), new f(f.b, "POST"), new f(f.c, "/"), new f(f.c, "/index.html"), new f(f.d, "http"), new f(f.d, "https"), new f(f.a, "200"), new f(f.a, "204"), new f(f.a, "206"), new f(f.a, "304"), new f(f.a, "400"), new f(f.a, "404"), new f(f.a, "500"), new f("accept-charset", ""), new f("accept-encoding", "gzip, deflate"), new f("accept-language", ""), new f("accept-ranges", ""), new f("accept", ""), new f("access-control-allow-origin", ""), new f("age", ""), new f("allow", ""), new f("authorization", ""), new f("cache-control", ""), new f("content-disposition", ""), new f("content-encoding", ""), new f("content-language", ""), new f("content-length", ""), new f("content-location", ""), new f("content-range", ""), new f("content-type", ""), new f("cookie", ""), new f("date", ""), new f("etag", ""), new f("expect", ""), new f("expires", ""), new f("from", ""), new f("host", ""), new f("if-match", ""), new f("if-modified-since", ""), new f("if-none-match", ""), new f("if-range", ""), new f("if-unmodified-since", ""), new f("last-modified", ""), new f("link", ""), new f("location", ""), new f("max-forwards", ""), new f("proxy-authenticate", ""), new f("proxy-authorization", ""), new f("range", ""), new f("referer", ""), new f("refresh", ""), new f("retry-after", ""), new f("server", ""), new f("set-cookie", ""), new f("strict-transport-security", ""), new f("transfer-encoding", ""), new f("user-agent", ""), new f("vary", ""), new f("via", ""), new f("www-authenticate", "")};
    private static final Map b;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/h$a.class */
    static final class a {
        final List a;
        final com.uxcam.f.e b;
        final int c;
        int d;
        f[] e;
        int f;
        int g;
        int h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(s sVar) {
            this(sVar, (byte) 0);
        }

        private a(s sVar, byte b) {
            this.a = new ArrayList();
            this.e = new f[8];
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = 4096;
            this.d = 4096;
            this.b = com.uxcam.f.l.a(sVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a() {
            if (this.d < this.h) {
                if (this.d == 0) {
                    c();
                } else {
                    d(this.h - this.d);
                }
            }
        }

        private void c() {
            this.a.clear();
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private int d(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.e.length - 1; length >= this.f && i > 0; length--) {
                    i -= this.e[length].j;
                    this.h -= this.e[length].j;
                    this.g--;
                    i2++;
                }
                System.arraycopy(this.e, this.f + 1, this.e, this.f + 1 + i2, this.g);
                this.f += i2;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int a(int i) {
            return this.f + 1 + i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final com.uxcam.f.f b(int i) {
            return c(i) ? h.a[i].h : this.e[a(i - h.a.length)].h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean c(int i) {
            return i >= 0 && i <= h.a.length - 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(f fVar) {
            this.a.add(fVar);
            int i = fVar.j;
            if (i > this.d) {
                c();
                return;
            }
            d((this.h + i) - this.d);
            if (this.g + 1 > this.e.length) {
                f[] fVarArr = new f[this.e.length * 2];
                System.arraycopy(this.e, 0, fVarArr, this.e.length, this.e.length);
                this.f = this.e.length - 1;
                this.e = fVarArr;
            }
            int i2 = this.f;
            this.f = i2 - 1;
            this.e[i2] = fVar;
            this.g++;
            this.h += i;
        }

        private int d() {
            return this.b.d() & 255;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = i2;
            int i5 = 0;
            while (true) {
                int d = d();
                if ((d & 128) == 0) {
                    return i4 + (d << i5);
                }
                i4 += (d & 127) << i5;
                i5 += 7;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final com.uxcam.f.f b() {
            int d = d();
            boolean z = (d & 128) == 128;
            int a = a(d, 127);
            if (!z) {
                return this.b.c(a);
            }
            j a2 = j.a();
            byte[] e = this.b.e(a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            j.a aVar = a2.a;
            int i = 0;
            int i2 = 0;
            for (byte b : e) {
                i = (i << 8) | (b & 255);
                i2 += 8;
                while (i2 >= 8) {
                    j.a aVar2 = aVar.a[(i >>> (i2 - 8)) & 255];
                    aVar = aVar2;
                    if (aVar2.a == null) {
                        byteArrayOutputStream.write(aVar.b);
                        i2 -= aVar.c;
                        aVar = a2.a;
                    } else {
                        i2 -= 8;
                    }
                }
            }
            while (i2 > 0) {
                j.a aVar3 = aVar.a[(i << (8 - i2)) & 255];
                if (aVar3.a != null || aVar3.c > i2) {
                    break;
                }
                byteArrayOutputStream.write(aVar3.b);
                i2 -= aVar3.c;
                aVar = a2.a;
            }
            return com.uxcam.f.f.a(byteArrayOutputStream.toByteArray());
        }
    }

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/h$b.class */
    static final class b {
        private final com.uxcam.f.c g;
        private int h;
        private boolean i;
        int a;
        int b;
        f[] c;
        int d;
        int e;
        int f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(com.uxcam.f.c cVar) {
            this(cVar, (byte) 0);
        }

        private b(com.uxcam.f.c cVar, byte b) {
            this.h = Integer.MAX_VALUE;
            this.c = new f[8];
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            this.a = 4096;
            this.b = 4096;
            this.g = cVar;
        }

        private void a() {
            Arrays.fill(this.c, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.c.length - 1; length >= this.d && i > 0; length--) {
                    i -= this.c[length].j;
                    this.f -= this.c[length].j;
                    this.e--;
                    i2++;
                }
                System.arraycopy(this.c, this.d + 1, this.c, this.d + 1 + i2, this.e);
                Arrays.fill(this.c, this.d + 1, this.d + 1 + i2, (Object) null);
                this.d += i2;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(List list) {
            if (this.i) {
                if (this.h < this.b) {
                    a(this.h, 31, 32);
                }
                this.i = false;
                this.h = Integer.MAX_VALUE;
                a(this.b, 31, 32);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                f fVar = (f) list.get(i);
                com.uxcam.f.f d = fVar.h.d();
                com.uxcam.f.f fVar2 = fVar.i;
                Integer num = (Integer) h.b.get(d);
                if (num != null) {
                    a(num.intValue() + 1, 15, 0);
                    a(fVar2);
                } else {
                    int a = com.uxcam.e.a.c.a((Object[]) this.c, (Object) fVar);
                    if (a != -1) {
                        a((a - this.d) + h.a.length, 127, 128);
                    } else {
                        this.g.h(64);
                        a(d);
                        a(fVar2);
                        int i2 = fVar.j;
                        if (i2 > this.b) {
                            a();
                        } else {
                            b((this.f + i2) - this.b);
                            if (this.e + 1 > this.c.length) {
                                f[] fVarArr = new f[this.c.length * 2];
                                System.arraycopy(this.c, 0, fVarArr, this.c.length, this.c.length);
                                this.d = this.c.length - 1;
                                this.c = fVarArr;
                            }
                            int i3 = this.d;
                            this.d = i3 - 1;
                            this.c[i3] = fVar;
                            this.e++;
                            this.f += i2;
                        }
                    }
                }
            }
        }

        private void a(int i, int i2, int i3) {
            if (i < i2) {
                this.g.h(i3 | i);
                return;
            }
            this.g.h(i3 | i2);
            int i4 = i - i2;
            while (true) {
                int i5 = i4;
                if (i5 < 128) {
                    this.g.h(i5);
                    return;
                } else {
                    this.g.h((i5 & 127) | 128);
                    i4 = i5 >>> 7;
                }
            }
        }

        private void a(com.uxcam.f.f fVar) {
            a(fVar.e(), 127, 0);
            this.g.b(fVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(int i) {
            this.a = i;
            int min = Math.min(i, 16384);
            if (this.b == min) {
                return;
            }
            if (min < this.b) {
                this.h = Math.min(this.h, min);
            }
            this.i = true;
            this.b = min;
            if (this.b < this.f) {
                if (this.b == 0) {
                    a();
                } else {
                    b(this.f - this.b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.uxcam.f.f a(com.uxcam.f.f fVar) {
        int e = fVar.e();
        for (int i = 0; i < e; i++) {
            byte a2 = fVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.a());
            }
        }
        return fVar;
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        for (int i = 0; i < a.length; i++) {
            if (!linkedHashMap.containsKey(a[i].h)) {
                linkedHashMap.put(a[i].h, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }
}
