package com.uxcam.f;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/t.class */
public class t {
    public static final t b = new t() { // from class: com.uxcam.f.t.1
        @Override // com.uxcam.f.t
        public final t a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.uxcam.f.t
        public final t a(long j) {
            return this;
        }

        @Override // com.uxcam.f.t
        public final void f() {
        }
    };
    private boolean a;
    private long c;
    private long d;

    public t a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.d = timeUnit.toNanos(j);
        return this;
    }

    public long c_() {
        return this.d;
    }

    public boolean d_() {
        return this.a;
    }

    public long c() {
        if (this.a) {
            return this.c;
        }
        throw new IllegalStateException("No deadline");
    }

    public t a(long j) {
        this.a = true;
        this.c = j;
        return this;
    }

    public t d() {
        this.d = 0L;
        return this;
    }

    public t e_() {
        this.a = false;
        return this;
    }

    public void f() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.a && this.c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
