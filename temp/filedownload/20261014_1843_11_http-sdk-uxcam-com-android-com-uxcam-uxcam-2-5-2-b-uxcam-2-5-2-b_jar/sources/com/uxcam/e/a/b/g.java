package com.uxcam.e.a.b;

import com.uxcam.e.a.c.p;
import com.uxcam.e.a.d.h;
import com.uxcam.e.ad;
import com.uxcam.e.j;
import com.uxcam.e.w;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/b/g.class */
public final class g {
    public final com.uxcam.e.a a;
    public ad b;
    private final j d;
    public final f c;
    private int e;
    private c f;
    private boolean g;
    private boolean h;
    private h i;

    public g(j jVar, com.uxcam.e.a aVar) {
        this.d = jVar;
        this.a = aVar;
        this.c = new f(aVar, e());
    }

    public final h a(w wVar, boolean z) {
        h cVar;
        h hVar;
        int i = wVar.w;
        int i2 = wVar.x;
        int i3 = wVar.y;
        try {
            c a = a(i, i2, i3, wVar.v, z);
            if (a.d != null) {
                cVar = new com.uxcam.e.a.d.d(wVar, this, a.d);
            } else {
                a.b.setSoTimeout(i2);
                a.f.a().a(i2, TimeUnit.MILLISECONDS);
                a.g.a().a(i3, TimeUnit.MILLISECONDS);
                cVar = new com.uxcam.e.a.d.c(wVar, this, a.f, a.g);
            }
            synchronized (this.d) {
                this.i = cVar;
                hVar = cVar;
            }
            return hVar;
        } catch (IOException e) {
            throw new e(e);
        }
    }

    private c a(int i, int i2, int i3, boolean z, boolean z2) {
        while (true) {
            c a = a(i, i2, i3, z);
            synchronized (this.d) {
                if (a.e == 0) {
                    return a;
                }
                if (a.a(z2)) {
                    return a;
                }
                a(true, false, false);
            }
        }
    }

    private c a(int i, int i2, int i3, boolean z) {
        synchronized (this.d) {
            if (this.g) {
                throw new IllegalStateException("released");
            }
            if (this.i != null) {
                throw new IllegalStateException("stream != null");
            }
            if (this.h) {
                throw new IOException("Canceled");
            }
            c cVar = this.f;
            if (cVar != null && !cVar.j) {
                return cVar;
            }
            c a = com.uxcam.e.a.a.a.a(this.d, this.a, this);
            if (a != null) {
                this.f = a;
                return a;
            }
            ad adVar = this.b;
            if (adVar == null) {
                adVar = this.c.a();
                synchronized (this.d) {
                    this.b = adVar;
                    this.e = 0;
                }
            }
            c cVar2 = new c(adVar);
            a(cVar2);
            synchronized (this.d) {
                com.uxcam.e.a.a.a.b(this.d, cVar2);
                this.f = cVar2;
                if (this.h) {
                    throw new IOException("Canceled");
                }
            }
            cVar2.a(i, i2, i3, this.a.f, z);
            e().b(cVar2.a);
            return cVar2;
        }
    }

    public final void a(boolean z, h hVar) {
        synchronized (this.d) {
            if (hVar != null) {
                if (hVar == this.i) {
                    if (!z) {
                        this.f.e++;
                    }
                }
            }
            throw new IllegalStateException("expected " + this.i + " but was " + hVar);
        }
        a(z, false, true);
    }

    public final h a() {
        h hVar;
        synchronized (this.d) {
            hVar = this.i;
        }
        return hVar;
    }

    private d e() {
        return com.uxcam.e.a.a.a.a(this.d);
    }

    public final synchronized c b() {
        return this.f;
    }

    public final void c() {
        a(false, true, false);
    }

    public final void d() {
        a(true, false, false);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        c cVar = null;
        synchronized (this.d) {
            if (z3) {
                this.i = null;
            }
            if (z2) {
                this.g = true;
            }
            if (this.f != null) {
                if (z) {
                    this.f.j = true;
                }
                if (this.i == null && (this.g || this.f.j)) {
                    c cVar2 = this.f;
                    int size = cVar2.i.size();
                    for (int i = 0; i < size; i++) {
                        if (((Reference) cVar2.i.get(i)).get() == this) {
                            cVar2.i.remove(i);
                            if (this.f.i.isEmpty()) {
                                this.f.k = System.nanoTime();
                                if (com.uxcam.e.a.a.a.a(this.d, this.f)) {
                                    cVar = this.f;
                                }
                            }
                            this.f = null;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        }
        if (cVar != null) {
            com.uxcam.e.a.c.a(cVar.b);
        }
    }

    public final void a(IOException iOException) {
        boolean z = false;
        synchronized (this.d) {
            if (iOException instanceof p) {
                p pVar = (p) iOException;
                if (pVar.a == com.uxcam.e.a.c.a.REFUSED_STREAM) {
                    this.e++;
                }
                if (pVar.a != com.uxcam.e.a.c.a.REFUSED_STREAM || this.e > 1) {
                    z = true;
                    this.b = null;
                }
            } else if (this.f != null) {
                if (!(this.f.d != null)) {
                    z = true;
                    if (this.f.e == 0) {
                        if (this.b != null && iOException != null) {
                            f fVar = this.c;
                            ad adVar = this.b;
                            if (adVar.b.type() != Proxy.Type.DIRECT && fVar.a.g != null) {
                                fVar.a.g.connectFailed(fVar.a.a.a(), adVar.b.address(), iOException);
                            }
                            fVar.b.a(adVar);
                        }
                        this.b = null;
                    }
                }
            }
        }
        a(z, false, true);
    }

    public final void a(c cVar) {
        cVar.i.add(new WeakReference(this));
    }

    public final String toString() {
        return this.a.toString();
    }
}
