package com.uxcam.e;

import com.uxcam.e.y;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/n.class */
public final class n {
    private Runnable c;
    private ExecutorService d;
    private int a = 64;
    private int b = 5;
    private final Deque e = new ArrayDeque();
    private final Deque f = new ArrayDeque();
    private final Deque g = new ArrayDeque();

    private synchronized ExecutorService a() {
        if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.uxcam.e.a.c.a("OkHttp Dispatcher", false));
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(y.a aVar) {
        if (this.f.size() >= this.a || c(aVar) >= this.b) {
            this.e.add(aVar);
        } else {
            this.f.add(aVar);
            a().execute(aVar);
        }
    }

    private void b() {
        if (this.f.size() < this.a && !this.e.isEmpty()) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                y.a aVar = (y.a) it.next();
                if (c(aVar) < this.b) {
                    it.remove();
                    this.f.add(aVar);
                    a().execute(aVar);
                }
                if (this.f.size() >= this.a) {
                    return;
                }
            }
        }
    }

    private int c(y.a aVar) {
        int i = 0;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (((y.a) it.next()).a().equals(aVar.a())) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(y.a aVar) {
        int c;
        Runnable runnable;
        Deque deque = this.f;
        synchronized (this) {
            if (!deque.remove(aVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            b();
            c = c();
            runnable = this.c;
        }
        if (c != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    private synchronized int c() {
        return this.f.size() + this.g.size();
    }
}
