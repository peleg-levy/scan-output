package com.uxcam.e;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/j.class */
public final class j {
    static final Executor a;
    final int b;
    private final long h;
    final Runnable c;
    final Deque d;
    final com.uxcam.e.a.b.d e;
    boolean f;
    static final /* synthetic */ boolean g;

    public j() {
        this(TimeUnit.MINUTES);
    }

    private j(TimeUnit timeUnit) {
        this.c = new Runnable() { // from class: com.uxcam.e.j.1
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    long a2 = j.this.a(System.nanoTime());
                    if (a2 == -1) {
                        return;
                    }
                    if (a2 > 0) {
                        long j = a2 / 1000000;
                        long j2 = a2 - (j * 1000000);
                        synchronized (j.this) {
                            try {
                                j.this.wait(j, (int) j2);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.d = new ArrayDeque();
        this.e = new com.uxcam.e.a.b.d();
        this.b = 5;
        this.h = timeUnit.toNanos(5L);
        if (5 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: 5");
        }
    }

    final long a(long j) {
        char c;
        int size;
        int i = 0;
        int i2 = 0;
        com.uxcam.e.a.b.c cVar = null;
        long j2 = Long.MIN_VALUE;
        synchronized (this) {
            for (com.uxcam.e.a.b.c cVar2 : this.d) {
                List list = cVar2.i;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    if (((Reference) list.get(i3)).get() == null) {
                        c = 0;
                        com.uxcam.e.a.f.e.b().a(5, "A connection to " + cVar2.a.a.a + " was leaked. Did you forget to close a response body?", (Throwable) null);
                        list.remove(i3);
                        cVar2.j = true;
                        if (list.isEmpty()) {
                            cVar2.k = j - this.h;
                            size = 0;
                            break;
                        }
                    } else {
                        i3++;
                    }
                }
                if (size > 0) {
                    i++;
                } else {
                    i2++;
                    long j3 = c;
                    if (j - cVar2.k > j2) {
                        j2 = j3;
                        cVar = cVar2;
                    }
                }
            }
            if (j2 >= this.h || i2 > this.b) {
                this.d.remove(cVar);
                com.uxcam.e.a.c.a(cVar.b);
                return 0L;
            }
            if (i2 > 0) {
                return this.h - j2;
            }
            if (i > 0) {
                return this.h;
            }
            this.f = false;
            return -1L;
        }
    }

    static {
        g = !j.class.desiredAssertionStatus();
        a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.uxcam.e.a.c.a("OkHttp ConnectionPool", true));
    }
}
