package com.uxcam.e.a.c;

import com.uxcam.e.a.c.b;
import com.uxcam.e.x;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/d.class */
public final class d implements Closeable {
    private static final ExecutorService l;
    public final x a;
    final boolean b;
    private final b m;
    private final Map n;
    private final String o;
    private int p;
    private int q;
    private boolean r;
    private final ExecutorService s;
    private Map t;
    private final m u;
    private int v;
    long c;
    long d;
    public n e;
    final n f;
    private boolean w;
    final q g;
    final Socket h;
    public final com.uxcam.e.a.c.c i;
    public final c j;
    private final Set x;
    static final /* synthetic */ boolean k;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/d$a.class */
    public static class a {
        public Socket a;
        public String b;
        public com.uxcam.f.e c;
        public com.uxcam.f.d d;
        public b e = b.l;
        public x f = x.SPDY_3;
        m g = m.a;
        boolean h = true;
    }

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/d$b.class */
    public static abstract class b {
        public static final b l = new b() { // from class: com.uxcam.e.a.c.d.b.1
            @Override // com.uxcam.e.a.c.d.b
            public final void a(e eVar) {
                eVar.a(com.uxcam.e.a.c.a.REFUSED_STREAM);
            }
        };

        public abstract void a(e eVar);

        public void a(d dVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/d$c.class */
    public class c extends com.uxcam.e.a.b implements b.a {
        final com.uxcam.e.a.c.b a;

        private c(com.uxcam.e.a.c.b bVar) {
            super("OkHttp %s", d.this.o);
            this.a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.uxcam.e.a.b
        public final void b() {
            com.uxcam.e.a.c.a aVar = com.uxcam.e.a.c.a.INTERNAL_ERROR;
            com.uxcam.e.a.c.a aVar2 = com.uxcam.e.a.c.a.INTERNAL_ERROR;
            try {
                try {
                    if (!d.this.b) {
                        this.a.a();
                    }
                    do {
                    } while (this.a.a(this));
                    aVar = com.uxcam.e.a.c.a.NO_ERROR;
                    aVar2 = com.uxcam.e.a.c.a.CANCEL;
                    try {
                        d.this.a(aVar, aVar2);
                    } catch (IOException unused) {
                    }
                    com.uxcam.e.a.c.a(this.a);
                } catch (IOException unused2) {
                    try {
                        d.this.a(com.uxcam.e.a.c.a.PROTOCOL_ERROR, com.uxcam.e.a.c.a.PROTOCOL_ERROR);
                    } catch (IOException unused3) {
                    }
                    com.uxcam.e.a.c.a(this.a);
                }
            } catch (Throwable th) {
                try {
                    d.this.a(aVar, aVar2);
                } catch (IOException unused4) {
                }
                com.uxcam.e.a.c.a(this.a);
                throw th;
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(boolean z, int i, com.uxcam.f.e eVar, int i2) {
            if (d.a(d.this, i)) {
                d.a(d.this, i, eVar, i2, z);
                return;
            }
            e a = d.this.a(i);
            if (a == null) {
                d.this.a(i, com.uxcam.e.a.c.a.INVALID_STREAM);
                eVar.f(i2);
            } else {
                if (!e.j && Thread.holdsLock(a)) {
                    throw new AssertionError();
                }
                a.f.a(eVar, i2);
                if (z) {
                    a.e();
                }
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(boolean z, boolean z2, int i, List list, g gVar) {
            if (d.a(d.this, i)) {
                d.a(d.this, i, list, z2);
                return;
            }
            synchronized (d.this) {
                if (d.this.r) {
                    return;
                }
                e a = d.this.a(i);
                if (a == null) {
                    if (gVar == g.SPDY_REPLY || gVar == g.SPDY_HEADERS) {
                        d.this.a(i, com.uxcam.e.a.c.a.INVALID_STREAM);
                        return;
                    }
                    if (i <= d.this.p) {
                        return;
                    }
                    if (i % 2 == d.this.q % 2) {
                        return;
                    }
                    final e eVar = new e(i, d.this, z, z2, list);
                    d.this.p = i;
                    d.this.n.put(Integer.valueOf(i), eVar);
                    d.l.execute(new com.uxcam.e.a.b("OkHttp %s stream %d", new Object[]{d.this.o, Integer.valueOf(i)}) { // from class: com.uxcam.e.a.c.d.c.1
                        @Override // com.uxcam.e.a.b
                        public final void b() {
                            try {
                                d.this.m.a(eVar);
                            } catch (IOException e) {
                                com.uxcam.e.a.f.e.b().a(4, "FramedConnection.Listener failure for " + d.this.o, e);
                                try {
                                    eVar.a(com.uxcam.e.a.c.a.PROTOCOL_ERROR);
                                } catch (IOException unused) {
                                }
                            }
                        }
                    });
                    return;
                }
                if (gVar == g.SPDY_SYN_STREAM) {
                    a.b(com.uxcam.e.a.c.a.PROTOCOL_ERROR);
                    d.this.b(i);
                    return;
                }
                if (!e.j && Thread.holdsLock(a)) {
                    throw new AssertionError();
                }
                com.uxcam.e.a.c.a aVar = null;
                boolean z3 = true;
                synchronized (a) {
                    if (a.e == null) {
                        if (gVar == g.SPDY_HEADERS) {
                            aVar = com.uxcam.e.a.c.a.PROTOCOL_ERROR;
                        } else {
                            a.e = list;
                            z3 = a.a();
                            a.notifyAll();
                        }
                    } else {
                        if (gVar == g.SPDY_REPLY) {
                            aVar = com.uxcam.e.a.c.a.STREAM_IN_USE;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(a.e);
                            arrayList.addAll(list);
                            a.e = arrayList;
                        }
                    }
                }
                if (aVar != null) {
                    a.b(aVar);
                } else if (!z3) {
                    a.d.b(a.c);
                }
                if (z2) {
                    a.e();
                }
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(int i, com.uxcam.e.a.c.a aVar) {
            if (d.a(d.this, i)) {
                d.a(d.this, i, aVar);
                return;
            }
            e b = d.this.b(i);
            if (b != null) {
                b.c(aVar);
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(boolean z, final n nVar) {
            long j = 0;
            e[] eVarArr = null;
            synchronized (d.this) {
                int b = d.this.f.b();
                if (z) {
                    n nVar2 = d.this.f;
                    nVar2.c = 0;
                    nVar2.b = 0;
                    nVar2.a = 0;
                    Arrays.fill(nVar2.d, 0);
                }
                n nVar3 = d.this.f;
                for (int i = 0; i < 10; i++) {
                    if (nVar.a(i)) {
                        nVar3.a(i, nVar.b(i), nVar.d[i]);
                    }
                }
                if (d.this.a == x.HTTP_2) {
                    d.l.execute(new com.uxcam.e.a.b("OkHttp %s ACK Settings", new Object[]{d.this.o}) { // from class: com.uxcam.e.a.c.d.c.3
                        @Override // com.uxcam.e.a.b
                        public final void b() {
                            try {
                                d.this.i.a(nVar);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
                int b2 = d.this.f.b();
                if (b2 != -1 && b2 != b) {
                    j = b2 - b;
                    if (!d.this.w) {
                        d dVar = d.this;
                        dVar.d += j;
                        if (j > 0) {
                            dVar.notifyAll();
                        }
                        d.h(d.this);
                    }
                    if (!d.this.n.isEmpty()) {
                        eVarArr = (e[]) d.this.n.values().toArray(new e[d.this.n.size()]);
                    }
                }
                d.l.execute(new com.uxcam.e.a.b("OkHttp %s settings", d.this.o) { // from class: com.uxcam.e.a.c.d.c.2
                    @Override // com.uxcam.e.a.b
                    public final void b() {
                        d.this.m.a(d.this);
                    }
                });
            }
            if (eVarArr == null || j == 0) {
                return;
            }
            for (e eVar : eVarArr) {
                synchronized (eVar) {
                    eVar.a(j);
                }
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(boolean z, int i, int i2) {
            if (!z) {
                d.a(d.this, i, i2);
                return;
            }
            l c = d.this.c(i);
            if (c != null) {
                if (c.c != -1 || c.b == -1) {
                    throw new IllegalStateException();
                }
                c.c = System.nanoTime();
                c.a.countDown();
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(int i, com.uxcam.f.f fVar) {
            e[] eVarArr;
            fVar.e();
            synchronized (d.this) {
                eVarArr = (e[]) d.this.n.values().toArray(new e[d.this.n.size()]);
                d.i(d.this);
            }
            for (e eVar : eVarArr) {
                if (eVar.c > i && eVar.b()) {
                    eVar.c(com.uxcam.e.a.c.a.REFUSED_STREAM);
                    d.this.b(eVar.c);
                }
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(int i, long j) {
            if (i == 0) {
                synchronized (d.this) {
                    d.this.d += j;
                    d.this.notifyAll();
                }
                return;
            }
            e a = d.this.a(i);
            if (a != null) {
                synchronized (a) {
                    a.a(j);
                }
            }
        }

        @Override // com.uxcam.e.a.c.b.a
        public final void a(int i, List list) {
            d.a(d.this, i, list);
        }

        /* synthetic */ c(d dVar, com.uxcam.e.a.c.b bVar, byte b) {
            this(bVar);
        }
    }

    private d(a aVar) {
        this.n = new HashMap();
        this.c = 0L;
        this.e = new n();
        this.f = new n();
        this.w = false;
        this.x = new LinkedHashSet();
        this.a = aVar.f;
        this.u = aVar.g;
        this.b = aVar.h;
        this.m = aVar.e;
        this.q = aVar.h ? 1 : 2;
        if (aVar.h && this.a == x.HTTP_2) {
            this.q += 2;
        }
        this.v = aVar.h ? 1 : 2;
        if (aVar.h) {
            this.e.a(7, 0, 16777216);
        }
        this.o = aVar.b;
        if (this.a == x.HTTP_2) {
            this.g = new i();
            this.s = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.uxcam.e.a.c.a(com.uxcam.e.a.c.a("OkHttp %s Push Observer", this.o), true));
            this.f.a(7, 0, 65535);
            this.f.a(5, 0, 16384);
        } else {
            if (this.a != x.SPDY_3) {
                throw new AssertionError(this.a);
            }
            this.g = new o();
            this.s = null;
        }
        this.d = this.f.b();
        this.h = aVar.a;
        this.i = this.g.a(aVar.d, this.b);
        this.j = new c(this, this.g.a(aVar.c, this.b), (byte) 0);
    }

    final synchronized e a(int i) {
        return (e) this.n.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized e b(int i) {
        e eVar = (e) this.n.remove(Integer.valueOf(i));
        notifyAll();
        return eVar;
    }

    public final synchronized int a() {
        n nVar = this.f;
        if ((16 & nVar.a) != 0) {
            return nVar.d[4];
        }
        return Integer.MAX_VALUE;
    }

    public final e a(List list, boolean z) {
        int i;
        e eVar;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.i) {
            synchronized (this) {
                if (this.r) {
                    throw new IOException("shutdown");
                }
                i = this.q;
                this.q += 2;
                eVar = new e(i, this, z3, false, list);
                z2 = !z || this.d == 0 || eVar.b == 0;
                if (eVar.a()) {
                    this.n.put(Integer.valueOf(i), eVar);
                }
            }
            this.i.a(z3, i, list);
        }
        if (z2) {
            this.i.b();
        }
        return eVar;
    }

    public final void a(int i, boolean z, com.uxcam.f.c cVar, long j) {
        int min;
        if (j == 0) {
            this.i.a(z, i, cVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.d <= 0) {
                    try {
                        if (!this.n.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.d), this.i.c());
                this.d -= min;
            }
            j -= min;
            this.i.a(z && j == 0, i, cVar, min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final int i, final com.uxcam.e.a.c.a aVar) {
        l.submit(new com.uxcam.e.a.b("OkHttp %s stream %d", new Object[]{this.o, Integer.valueOf(i)}) { // from class: com.uxcam.e.a.c.d.1
            @Override // com.uxcam.e.a.b
            public final void b() {
                try {
                    d.this.b(i, aVar);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, com.uxcam.e.a.c.a aVar) {
        this.i.a(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final int i, final long j) {
        l.execute(new com.uxcam.e.a.b("OkHttp Window Update %s stream %d", new Object[]{this.o, Integer.valueOf(i)}) { // from class: com.uxcam.e.a.c.d.2
            @Override // com.uxcam.e.a.b
            public final void b() {
                try {
                    d.this.i.a(i, j);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized l c(int i) {
        if (this.t != null) {
            return (l) this.t.remove(Integer.valueOf(i));
        }
        return null;
    }

    public final void b() {
        this.i.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(com.uxcam.e.a.c.a.NO_ERROR, com.uxcam.e.a.c.a.CANCEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.uxcam.e.a.c.a aVar, com.uxcam.e.a.c.a aVar2) {
        if (!k && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        IOException e = null;
        try {
            synchronized (this.i) {
                synchronized (this) {
                    if (!this.r) {
                        this.r = true;
                        this.i.a(this.p, aVar, com.uxcam.e.a.c.a);
                    }
                }
            }
        } catch (IOException e2) {
            e = e2;
        }
        e[] eVarArr = null;
        l[] lVarArr = null;
        synchronized (this) {
            if (!this.n.isEmpty()) {
                eVarArr = (e[]) this.n.values().toArray(new e[this.n.size()]);
                this.n.clear();
            }
            if (this.t != null) {
                lVarArr = (l[]) this.t.values().toArray(new l[this.t.size()]);
                this.t = null;
            }
        }
        if (eVarArr != null) {
            for (e eVar : eVarArr) {
                try {
                    eVar.a(aVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                if (lVar.c != -1 || lVar.b == -1) {
                    throw new IllegalStateException();
                }
                lVar.c = lVar.b - 1;
                lVar.a.countDown();
            }
        }
        try {
            this.i.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.h.close();
        } catch (IOException e5) {
            e = e5;
        }
        if (e != null) {
            throw e;
        }
    }

    static /* synthetic */ void a(d dVar, boolean z, int i, int i2, l lVar) {
        synchronized (dVar.i) {
            if (lVar != null) {
                if (lVar.b != -1) {
                    throw new IllegalStateException();
                }
                lVar.b = System.nanoTime();
            }
            dVar.i.a(z, i, i2);
        }
    }

    public /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }

    static /* synthetic */ boolean a(d dVar, int i) {
        return dVar.a == x.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    static /* synthetic */ void a(d dVar, final int i, com.uxcam.f.e eVar, final int i2, final boolean z) {
        final com.uxcam.f.c cVar = new com.uxcam.f.c();
        eVar.a(i2);
        eVar.a(cVar, i2);
        if (cVar.b != i2) {
            throw new IOException(cVar.b + " != " + i2);
        }
        dVar.s.execute(new com.uxcam.e.a.b("OkHttp %s Push Data[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.uxcam.e.a.c.d.6
            @Override // com.uxcam.e.a.b
            public final void b() {
                try {
                    d.this.u.a(cVar, i2);
                    d.this.i.a(i, com.uxcam.e.a.c.a.CANCEL);
                    synchronized (d.this) {
                        d.this.x.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
            }
        });
    }

    static /* synthetic */ void a(d dVar, final int i, final List list, final boolean z) {
        dVar.s.execute(new com.uxcam.e.a.b("OkHttp %s Push Headers[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.uxcam.e.a.c.d.5
            @Override // com.uxcam.e.a.b
            public final void b() {
                d.this.u.b();
                try {
                    d.this.i.a(i, com.uxcam.e.a.c.a.CANCEL);
                    synchronized (d.this) {
                        d.this.x.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
            }
        });
    }

    static /* synthetic */ void a(d dVar, final int i, final com.uxcam.e.a.c.a aVar) {
        dVar.s.execute(new com.uxcam.e.a.b("OkHttp %s Push Reset[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.uxcam.e.a.c.d.7
            @Override // com.uxcam.e.a.b
            public final void b() {
                d.this.u.c();
                synchronized (d.this) {
                    d.this.x.remove(Integer.valueOf(i));
                }
            }
        });
    }

    static /* synthetic */ boolean h(d dVar) {
        dVar.w = true;
        return true;
    }

    static /* synthetic */ void a(d dVar, final int i, final int i2) {
        l.execute(new com.uxcam.e.a.b("OkHttp %s ping %08x%08x", new Object[]{dVar.o, Integer.valueOf(i), Integer.valueOf(i2)}) { // from class: com.uxcam.e.a.c.d.3
            final /* synthetic */ boolean a = true;
            final /* synthetic */ l e = null;

            @Override // com.uxcam.e.a.b
            public final void b() {
                try {
                    d.a(d.this, this.a, i, i2, this.e);
                } catch (IOException unused) {
                }
            }
        });
    }

    static /* synthetic */ boolean i(d dVar) {
        dVar.r = true;
        return true;
    }

    static /* synthetic */ void a(d dVar, final int i, final List list) {
        synchronized (dVar) {
            if (dVar.x.contains(Integer.valueOf(i))) {
                dVar.a(i, com.uxcam.e.a.c.a.PROTOCOL_ERROR);
            } else {
                dVar.x.add(Integer.valueOf(i));
                dVar.s.execute(new com.uxcam.e.a.b("OkHttp %s Push Request[%s]", new Object[]{dVar.o, Integer.valueOf(i)}) { // from class: com.uxcam.e.a.c.d.4
                    @Override // com.uxcam.e.a.b
                    public final void b() {
                        d.this.u.a();
                        try {
                            d.this.i.a(i, com.uxcam.e.a.c.a.CANCEL);
                            synchronized (d.this) {
                                d.this.x.remove(Integer.valueOf(i));
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
            }
        }
    }

    static {
        k = !d.class.desiredAssertionStatus();
        l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.uxcam.e.a.c.a("OkHttp FramedConnection", true));
    }
}
