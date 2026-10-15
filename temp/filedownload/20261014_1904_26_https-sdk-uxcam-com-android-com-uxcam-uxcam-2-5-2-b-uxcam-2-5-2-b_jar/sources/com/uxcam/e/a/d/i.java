package com.uxcam.e.a.d;

import com.uxcam.e.ab;
import com.uxcam.e.s;
import com.uxcam.e.t;
import com.uxcam.e.z;
import java.util.List;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/i.class */
public final class i implements t.a {
    private final List d;
    public final com.uxcam.e.a.b.g a;
    final h b;
    private final com.uxcam.e.i e;
    private final int f;
    public final z c;
    private int g;

    public i(List list, com.uxcam.e.a.b.g gVar, h hVar, com.uxcam.e.i iVar, int i, z zVar) {
        this.d = list;
        this.e = iVar;
        this.a = gVar;
        this.b = hVar;
        this.f = i;
        this.c = zVar;
    }

    @Override // com.uxcam.e.t.a
    public final z a() {
        return this.c;
    }

    @Override // com.uxcam.e.t.a
    public final ab a(z zVar) {
        return a(zVar, this.a, this.b, this.e);
    }

    public final ab a(z zVar, com.uxcam.e.a.b.g gVar, h hVar, com.uxcam.e.i iVar) {
        if (this.f >= this.d.size()) {
            throw new AssertionError();
        }
        this.g++;
        if (this.b != null) {
            s sVar = zVar.a;
            if (!(sVar.b.equals(this.e.a().a.a.b) && sVar.c == this.e.a().a.a.c)) {
                throw new IllegalStateException("network interceptor " + this.d.get(this.f - 1) + " must retain the same host and port");
            }
        }
        if (this.b != null && this.g > 1) {
            throw new IllegalStateException("network interceptor " + this.d.get(this.f - 1) + " must call proceed() exactly once");
        }
        i iVar2 = new i(this.d, gVar, hVar, iVar, this.f + 1, zVar);
        t tVar = (t) this.d.get(this.f);
        ab a = tVar.a(iVar2);
        if (hVar != null && this.f + 1 < this.d.size() && iVar2.g != 1) {
            throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
        }
        if (a == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        return a;
    }
}
