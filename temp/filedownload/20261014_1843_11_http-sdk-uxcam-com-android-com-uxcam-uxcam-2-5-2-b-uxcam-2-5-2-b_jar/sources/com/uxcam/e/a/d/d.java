package com.uxcam.e.a.d;

import com.uxcam.e.ab;
import com.uxcam.e.ac;
import com.uxcam.e.r;
import com.uxcam.e.w;
import com.uxcam.e.x;
import com.uxcam.e.z;
import com.uxcam.f.r;
import com.uxcam.f.s;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/d.class */
public final class d implements h {
    private static final com.uxcam.f.f a = com.uxcam.f.f.a("connection");
    private static final com.uxcam.f.f b = com.uxcam.f.f.a("host");
    private static final com.uxcam.f.f c = com.uxcam.f.f.a("keep-alive");
    private static final com.uxcam.f.f d = com.uxcam.f.f.a("proxy-connection");
    private static final com.uxcam.f.f e = com.uxcam.f.f.a("transfer-encoding");
    private static final com.uxcam.f.f f = com.uxcam.f.f.a("te");
    private static final com.uxcam.f.f g = com.uxcam.f.f.a("encoding");
    private static final com.uxcam.f.f h = com.uxcam.f.f.a("upgrade");
    private static final List i = com.uxcam.e.a.c.a(a, b, c, d, e, com.uxcam.e.a.c.f.b, com.uxcam.e.a.c.f.c, com.uxcam.e.a.c.f.d, com.uxcam.e.a.c.f.e, com.uxcam.e.a.c.f.f, com.uxcam.e.a.c.f.g);
    private static final List j = com.uxcam.e.a.c.a(a, b, c, d, e);
    private static final List k = com.uxcam.e.a.c.a(a, b, c, d, f, e, g, h, com.uxcam.e.a.c.f.b, com.uxcam.e.a.c.f.c, com.uxcam.e.a.c.f.d, com.uxcam.e.a.c.f.e, com.uxcam.e.a.c.f.f, com.uxcam.e.a.c.f.g);
    private static final List l = com.uxcam.e.a.c.a(a, b, c, d, f, e, g, h);
    private final w m;
    private final com.uxcam.e.a.b.g n;
    private final com.uxcam.e.a.c.d o;
    private com.uxcam.e.a.c.e p;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/d$a.class */
    class a extends com.uxcam.f.h {
        public a(s sVar) {
            super(sVar);
        }

        @Override // com.uxcam.f.h, com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            d.this.n.a(false, (h) d.this);
            super.close();
        }
    }

    public d(w wVar, com.uxcam.e.a.b.g gVar, com.uxcam.e.a.c.d dVar) {
        this.m = wVar;
        this.n = gVar;
        this.o = dVar;
    }

    @Override // com.uxcam.e.a.d.h
    public final r a(z zVar, long j2) {
        return this.p.d();
    }

    @Override // com.uxcam.e.a.d.h
    public final void a(z zVar) {
        List b2;
        if (this.p != null) {
            return;
        }
        boolean b3 = g.b(zVar.b);
        if (this.o.a == x.HTTP_2) {
            com.uxcam.e.r rVar = zVar.c;
            ArrayList arrayList = new ArrayList((rVar.a.length / 2) + 4);
            arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.b, zVar.b));
            arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.c, k.a(zVar.a)));
            arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.e, com.uxcam.e.a.c.a(zVar.a, false)));
            arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.d, zVar.a.a));
            int length = rVar.a.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                com.uxcam.f.f a2 = com.uxcam.f.f.a(rVar.a(i2).toLowerCase(Locale.US));
                if (!k.contains(a2)) {
                    arrayList.add(new com.uxcam.e.a.c.f(a2, rVar.b(i2)));
                }
            }
            b2 = arrayList;
        } else {
            b2 = b(zVar);
        }
        this.p = this.o.a(b2, b3);
        this.p.h.a(this.m.x, TimeUnit.MILLISECONDS);
        this.p.i.a(this.m.y, TimeUnit.MILLISECONDS);
    }

    @Override // com.uxcam.e.a.d.h
    public final void b() {
        this.p.d().close();
    }

    @Override // com.uxcam.e.a.d.h
    public final ab.a a() {
        if (this.o.a != x.HTTP_2) {
            return a(this.p.c());
        }
        List c2 = this.p.c();
        String str = null;
        r.a aVar = new r.a();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.uxcam.f.f fVar = ((com.uxcam.e.a.c.f) c2.get(i2)).h;
            String a2 = ((com.uxcam.e.a.c.f) c2.get(i2)).i.a();
            if (fVar.equals(com.uxcam.e.a.c.f.a)) {
                str = a2;
            } else if (!l.contains(fVar)) {
                com.uxcam.e.a.a.a.a(aVar, fVar.a(), a2);
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        m a3 = m.a("HTTP/1.1 " + str);
        ab.a aVar2 = new ab.a();
        aVar2.b = x.HTTP_2;
        aVar2.c = a3.b;
        aVar2.d = a3.c;
        return aVar2.a(aVar.a());
    }

    private static List b(z zVar) {
        com.uxcam.e.r rVar = zVar.c;
        ArrayList arrayList = new ArrayList((rVar.a.length / 2) + 5);
        arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.b, zVar.b));
        arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.c, k.a(zVar.a)));
        arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.g, "HTTP/1.1"));
        arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.f, com.uxcam.e.a.c.a(zVar.a, false)));
        arrayList.add(new com.uxcam.e.a.c.f(com.uxcam.e.a.c.f.d, zVar.a.a));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = rVar.a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            com.uxcam.f.f a2 = com.uxcam.f.f.a(rVar.a(i2).toLowerCase(Locale.US));
            if (!i.contains(a2)) {
                String b2 = rVar.b(i2);
                if (linkedHashSet.add(a2)) {
                    arrayList.add(new com.uxcam.e.a.c.f(a2, b2));
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        if (((com.uxcam.e.a.c.f) arrayList.get(i3)).h.equals(a2)) {
                            arrayList.set(i3, new com.uxcam.e.a.c.f(a2, ((com.uxcam.e.a.c.f) arrayList.get(i3)).i.a() + (char) 0 + b2));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return arrayList;
    }

    private static ab.a a(List list) {
        String str = null;
        String str2 = "HTTP/1.1";
        r.a aVar = new r.a();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.uxcam.f.f fVar = ((com.uxcam.e.a.c.f) list.get(i2)).h;
            String a2 = ((com.uxcam.e.a.c.f) list.get(i2)).i.a();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < a2.length()) {
                    int indexOf = a2.indexOf(0, i4);
                    int i5 = indexOf;
                    if (indexOf == -1) {
                        i5 = a2.length();
                    }
                    String substring = a2.substring(i4, i5);
                    if (fVar.equals(com.uxcam.e.a.c.f.a)) {
                        str = substring;
                    } else if (fVar.equals(com.uxcam.e.a.c.f.g)) {
                        str2 = substring;
                    } else if (!j.contains(fVar)) {
                        com.uxcam.e.a.a.a.a(aVar, fVar.a(), substring);
                    }
                    i3 = i5 + 1;
                }
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        m a3 = m.a(str2 + " " + str);
        ab.a aVar2 = new ab.a();
        aVar2.b = x.SPDY_3;
        aVar2.c = a3.b;
        aVar2.d = a3.c;
        return aVar2.a(aVar.a());
    }

    @Override // com.uxcam.e.a.d.h
    public final ac a(ab abVar) {
        return new j(abVar.e, com.uxcam.f.l.a(new a(this.p.f)));
    }
}
