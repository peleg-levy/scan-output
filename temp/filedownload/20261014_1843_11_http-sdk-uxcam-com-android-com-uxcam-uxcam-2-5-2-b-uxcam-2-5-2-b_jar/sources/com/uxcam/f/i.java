package com.uxcam.f;

import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/i.class */
public final class i extends t {
    public t a;

    public i(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = tVar;
    }

    @Override // com.uxcam.f.t
    public final t a(long j, TimeUnit timeUnit) {
        return this.a.a(j, timeUnit);
    }

    @Override // com.uxcam.f.t
    public final long c_() {
        return this.a.c_();
    }

    @Override // com.uxcam.f.t
    public final boolean d_() {
        return this.a.d_();
    }

    @Override // com.uxcam.f.t
    public final long c() {
        return this.a.c();
    }

    @Override // com.uxcam.f.t
    public final t a(long j) {
        return this.a.a(j);
    }

    @Override // com.uxcam.f.t
    public final t d() {
        return this.a.d();
    }

    @Override // com.uxcam.f.t
    public final t e_() {
        return this.a.e_();
    }

    @Override // com.uxcam.f.t
    public final void f() {
        this.a.f();
    }
}
