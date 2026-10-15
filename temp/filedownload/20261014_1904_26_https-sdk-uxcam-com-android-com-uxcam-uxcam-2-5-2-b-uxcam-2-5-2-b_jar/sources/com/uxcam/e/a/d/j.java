package com.uxcam.e.a.d;

import com.uxcam.e.ac;
import com.uxcam.e.r;
import com.uxcam.e.u;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/j.class */
public final class j extends ac {
    private final r a;
    private final com.uxcam.f.e b;

    public j(r rVar, com.uxcam.f.e eVar) {
        this.a = rVar;
        this.b = eVar;
    }

    @Override // com.uxcam.e.ac
    public final u a() {
        String a = this.a.a("Content-Type");
        if (a != null) {
            return u.a(a);
        }
        return null;
    }

    @Override // com.uxcam.e.ac
    public final long b() {
        return f.a(this.a);
    }

    @Override // com.uxcam.e.ac
    public final com.uxcam.f.e c() {
        return this.b;
    }
}
