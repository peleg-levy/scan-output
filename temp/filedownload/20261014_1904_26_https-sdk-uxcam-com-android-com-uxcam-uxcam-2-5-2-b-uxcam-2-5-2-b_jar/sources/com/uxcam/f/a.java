package com.uxcam.f;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/a.class */
public class a extends t {
    private static a a;
    private boolean c;
    private a d;
    private long e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.uxcam.f.a$a, reason: collision with other inner class name */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/a$a.class */
    public static final class C0003a extends Thread {
        public C0003a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    a e = a.e();
                    if (e != null) {
                        e.a();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public final void a_() {
        if (this.c) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long c_ = c_();
        boolean d_ = d_();
        if (c_ != 0 || d_) {
            this.c = true;
            a(this, c_, d_);
        }
    }

    private static synchronized void a(a aVar, long j, boolean z) {
        a aVar2;
        if (a == null) {
            a = new a();
            new C0003a().start();
        }
        long nanoTime = System.nanoTime();
        if (j != 0 && z) {
            aVar.e = nanoTime + Math.min(j, aVar.c() - nanoTime);
        } else if (j != 0) {
            aVar.e = nanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            aVar.e = aVar.c();
        }
        long j2 = aVar.e - nanoTime;
        a aVar3 = a;
        while (true) {
            aVar2 = aVar3;
            if (aVar2.d == null || j2 < aVar2.d.e - nanoTime) {
                break;
            } else {
                aVar3 = aVar2.d;
            }
        }
        aVar.d = aVar2.d;
        aVar2.d = aVar;
        if (aVar2 == a) {
            a.class.notify();
        }
    }

    public final boolean b_() {
        if (!this.c) {
            return false;
        }
        this.c = false;
        return a(this);
    }

    private static synchronized boolean a(a aVar) {
        a aVar2 = a;
        while (true) {
            a aVar3 = aVar2;
            if (aVar3 == null) {
                return true;
            }
            if (aVar3.d == aVar) {
                aVar3.d = aVar.d;
                aVar.d = null;
                return false;
            }
            aVar2 = aVar3.d;
        }
    }

    public void a() {
    }

    final void a(boolean z) {
        if (b_() && z) {
            throw a((IOException) null);
        }
    }

    final IOException b(IOException iOException) {
        return !b_() ? iOException : a(iOException);
    }

    public IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    static synchronized a e() {
        a aVar = a.d;
        if (aVar == null) {
            a.class.wait();
            return null;
        }
        long nanoTime = aVar.e - System.nanoTime();
        if (nanoTime > 0) {
            long j = nanoTime / 1000000;
            a.class.wait(j, (int) (nanoTime - (j * 1000000)));
            return null;
        }
        a.d = aVar.d;
        aVar.d = null;
        return aVar;
    }
}
