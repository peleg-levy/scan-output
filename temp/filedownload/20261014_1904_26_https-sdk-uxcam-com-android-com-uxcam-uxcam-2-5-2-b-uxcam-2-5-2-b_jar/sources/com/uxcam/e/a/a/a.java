package com.uxcam.e.a.a;

import com.uxcam.e.a.a.c;
import com.uxcam.e.a.d.f;
import com.uxcam.e.a.d.j;
import com.uxcam.e.ab;
import com.uxcam.e.ac;
import com.uxcam.e.r;
import com.uxcam.e.s;
import com.uxcam.e.t;
import com.uxcam.e.u;
import com.uxcam.e.x;
import com.uxcam.e.z;
import com.uxcam.f.l;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/a/a.class */
public final class a implements t {
    private static final ac b = new ac() { // from class: com.uxcam.e.a.a.a.1
        @Override // com.uxcam.e.ac
        public final u a() {
            return null;
        }

        @Override // com.uxcam.e.ac
        public final long b() {
            return 0L;
        }

        @Override // com.uxcam.e.ac
        public final com.uxcam.f.e c() {
            return new com.uxcam.f.c();
        }
    };
    final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    @Override // com.uxcam.e.t
    public final ab a(t.a aVar) {
        c cVar;
        long j;
        String sb;
        String str;
        String str2;
        b b2;
        ab a;
        boolean z;
        Date b3;
        ab a2 = this.a != null ? this.a.a() : null;
        c.a aVar2 = new c.a(System.currentTimeMillis(), aVar.a(), a2);
        if (aVar2.c == null) {
            cVar = new c(aVar2.b, null, (byte) 0);
        } else if (aVar2.b.a.b() && aVar2.c.d == null) {
            cVar = new c(aVar2.b, null, (byte) 0);
        } else if (c.a(aVar2.c, aVar2.b)) {
            com.uxcam.e.d b4 = aVar2.b.b();
            if (!b4.c) {
                z zVar = aVar2.b;
                if (!((zVar.a("If-Modified-Since") == null && zVar.a("If-None-Match") == null) ? false : true)) {
                    long max = aVar2.d != null ? Math.max(0L, aVar2.j - aVar2.d.getTime()) : 0L;
                    long max2 = (aVar2.l != -1 ? Math.max(max, TimeUnit.SECONDS.toMillis(aVar2.l)) : max) + (aVar2.j - aVar2.i) + (aVar2.a - aVar2.j);
                    if (aVar2.c.c().e != -1) {
                        j = TimeUnit.SECONDS.toMillis(r0.e);
                    } else if (aVar2.h != null) {
                        long time = aVar2.h.getTime() - (aVar2.d != null ? aVar2.d.getTime() : aVar2.j);
                        j = time > 0 ? time : 0L;
                    } else {
                        if (aVar2.f != null) {
                            s sVar = aVar2.c.a.a;
                            if (sVar.d == null) {
                                sb = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                s.b(sb2, sVar.d);
                                sb = sb2.toString();
                            }
                            if (sb == null) {
                                long time2 = (aVar2.d != null ? aVar2.d.getTime() : aVar2.i) - aVar2.f.getTime();
                                j = time2 > 0 ? time2 / 10 : 0L;
                            }
                        }
                        j = 0;
                    }
                    long j2 = j;
                    if (b4.e != -1) {
                        j2 = Math.min(j2, TimeUnit.SECONDS.toMillis(b4.e));
                    }
                    long j3 = 0;
                    if (b4.j != -1) {
                        j3 = TimeUnit.SECONDS.toMillis(b4.j);
                    }
                    long j4 = 0;
                    com.uxcam.e.d c = aVar2.c.c();
                    if (!c.h && b4.i != -1) {
                        j4 = TimeUnit.SECONDS.toMillis(b4.i);
                    }
                    if (c.c || max2 + j3 >= j2 + j4) {
                        if (aVar2.k != null) {
                            str = "If-None-Match";
                            str2 = aVar2.k;
                        } else if (aVar2.f != null) {
                            str = "If-Modified-Since";
                            str2 = aVar2.g;
                        } else if (aVar2.d != null) {
                            str = "If-Modified-Since";
                            str2 = aVar2.e;
                        } else {
                            cVar = new c(aVar2.b, null, (byte) 0);
                        }
                        r.a a3 = aVar2.b.c.a();
                        com.uxcam.e.a.a.a.a(a3, str, str2);
                        z.a a4 = aVar2.b.a();
                        a4.c = a3.a().a();
                        cVar = new c(a4.a(), aVar2.c, (byte) 0);
                    } else {
                        ab.a b5 = aVar2.c.b();
                        if (max2 + j3 >= j2) {
                            b5.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (max2 > 86400000) {
                            if (aVar2.c.c().e == -1 && aVar2.h == null) {
                                b5.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                        }
                        cVar = new c(null, b5.a(), (byte) 0);
                    }
                }
            }
            cVar = new c(aVar2.b, null, (byte) 0);
        } else {
            cVar = new c(aVar2.b, null, (byte) 0);
        }
        c cVar2 = (cVar.a == null || !aVar2.b.b().k) ? cVar : new c(null, null, (byte) 0);
        c cVar3 = cVar2;
        z zVar2 = cVar2.a;
        ab abVar = cVar3.b;
        if (a2 != null && abVar == null) {
            com.uxcam.e.a.c.a(a2.f);
        }
        if (zVar2 == null && abVar == null) {
            ab.a aVar3 = new ab.a();
            aVar3.a = aVar.a();
            aVar3.b = x.HTTP_1_1;
            aVar3.c = 504;
            aVar3.d = "Unsatisfiable Request (only-if-cached)";
            aVar3.g = b;
            aVar3.k = -1L;
            aVar3.l = System.currentTimeMillis();
            return aVar3.a();
        }
        if (zVar2 == null) {
            return abVar.b().b(a(abVar)).a();
        }
        try {
            ab a5 = aVar.a(zVar2);
            if (a5 == null && a2 != null) {
            }
            if (abVar != null) {
                if (a5.b == 304) {
                    z = true;
                } else {
                    Date b6 = abVar.e.b("Last-Modified");
                    z = (b6 == null || (b3 = a5.e.b("Last-Modified")) == null || b3.getTime() >= b6.getTime()) ? false : true;
                }
                if (z) {
                    ab a6 = abVar.b().a(a(abVar.e, a5.e)).b(a(abVar)).a(a(a5)).a();
                    a5.f.close();
                    return a6;
                }
                com.uxcam.e.a.c.a(abVar.f);
            }
            ab a7 = a5.b().b(a(abVar)).a(a(a5)).a();
            ab abVar2 = a7;
            if (f.a(a7)) {
                z zVar3 = a5.a;
                e eVar = this.a;
                if (eVar == null) {
                    b2 = null;
                } else if (c.a(abVar2, zVar3)) {
                    b2 = eVar.b();
                } else {
                    String str3 = zVar3.b;
                    if (!str3.equals("POST") && !str3.equals("PATCH") && !str3.equals("PUT") && !str3.equals("DELETE")) {
                        str3.equals("MOVE");
                    }
                    b2 = null;
                }
                final b bVar = b2;
                if (bVar == null) {
                    a = abVar2;
                } else {
                    com.uxcam.f.r a8 = bVar.a();
                    if (a8 == null) {
                        a = abVar2;
                    } else {
                        final com.uxcam.f.e c2 = abVar2.f.c();
                        final com.uxcam.f.d a9 = l.a(a8);
                        com.uxcam.f.s sVar2 = new com.uxcam.f.s() { // from class: com.uxcam.e.a.a.a.2
                            boolean a;

                            @Override // com.uxcam.f.s
                            public final long a(com.uxcam.f.c cVar4, long j5) {
                                try {
                                    long a10 = c2.a(cVar4, j5);
                                    if (a10 != -1) {
                                        cVar4.a(a9.b(), cVar4.b - a10, a10);
                                        a9.o();
                                        return a10;
                                    }
                                    if (this.a) {
                                        return -1L;
                                    }
                                    this.a = true;
                                    a9.close();
                                    return -1L;
                                } catch (IOException e) {
                                    if (!this.a) {
                                        this.a = true;
                                    }
                                    throw e;
                                }
                            }

                            @Override // com.uxcam.f.s
                            public final com.uxcam.f.t a() {
                                return c2.a();
                            }

                            @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                if (!this.a && !com.uxcam.e.a.c.a((com.uxcam.f.s) this, TimeUnit.MILLISECONDS)) {
                                    this.a = true;
                                }
                                c2.close();
                            }
                        };
                        ab.a b7 = abVar2.b();
                        b7.g = new j(abVar2.e, l.a(sVar2));
                        a = b7.a();
                    }
                }
                abVar2 = a;
            }
            return abVar2;
        } finally {
            if (a2 != null) {
                com.uxcam.e.a.c.a(a2.f);
            }
        }
    }

    private static ab a(ab abVar) {
        if (abVar == null || abVar.f == null) {
            return abVar;
        }
        ab.a b2 = abVar.b();
        b2.g = null;
        return b2.a();
    }

    private static r a(r rVar, r rVar2) {
        r.a aVar = new r.a();
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = rVar.a(i);
            String b2 = rVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b2.startsWith("1")) && (!a(a) || rVar2.a(a) == null)) {
                com.uxcam.e.a.a.a.a(aVar, a, b2);
            }
        }
        int length2 = rVar2.a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a2 = rVar2.a(i2);
            if (!"Content-Length".equalsIgnoreCase(a2) && a(a2)) {
                com.uxcam.e.a.a.a.a(aVar, a2, rVar2.b(i2));
            }
        }
        return aVar.a();
    }

    private static boolean a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
