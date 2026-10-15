package com.uxcam.e.a.d;

import com.uxcam.e.ab;
import com.uxcam.e.t;
import com.uxcam.e.z;
import java.net.ProtocolException;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/b.class */
public final class b implements t {
    private final boolean a;

    public b(boolean z) {
        this.a = z;
    }

    @Override // com.uxcam.e.t
    public final ab a(t.a aVar) {
        h hVar = ((i) aVar).b;
        com.uxcam.e.a.b.g gVar = ((i) aVar).a;
        z a = aVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        hVar.a(a);
        if (g.b(a.b) && a.d != null) {
            com.uxcam.f.d a2 = com.uxcam.f.l.a(hVar.a(a, a.d.b()));
            a.d.a(a2);
            a2.close();
        }
        hVar.b();
        ab.a a3 = hVar.a();
        a3.a = a;
        a3.e = gVar.b().c;
        a3.k = currentTimeMillis;
        a3.l = System.currentTimeMillis();
        ab a4 = a3.a();
        if (!this.a || a4.b != 101) {
            ab.a b = a4.b();
            b.g = hVar.a(a4);
            a4 = b.a();
        }
        if ("close".equalsIgnoreCase(a4.a.a("Connection")) || "close".equalsIgnoreCase(a4.a("Connection"))) {
            gVar.a(true, false, false);
        }
        int i = a4.b;
        if ((i == 204 || i == 205) && a4.f.b() > 0) {
            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a4.f.b());
        }
        return a4;
    }
}
