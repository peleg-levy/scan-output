package com.uxcam.e.a.d;

import com.uxcam.e.aa;
import com.uxcam.e.ab;
import com.uxcam.e.r;
import com.uxcam.e.t;
import com.uxcam.e.u;
import com.uxcam.e.z;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/a.class */
public final class a implements t {
    private final com.uxcam.e.m a;

    public a(com.uxcam.e.m mVar) {
        this.a = mVar;
    }

    @Override // com.uxcam.e.t
    public final ab a(t.a aVar) {
        z a = aVar.a();
        z.a a2 = a.a();
        aa aaVar = a.d;
        if (aaVar != null) {
            u a3 = aaVar.a();
            if (a3 != null) {
                a2.a("Content-Type", a3.toString());
            }
            long b = aaVar.b();
            if (b != -1) {
                a2.a("Content-Length", Long.toString(b));
                a2.b("Transfer-Encoding");
            } else {
                a2.a("Transfer-Encoding", "chunked");
                a2.b("Content-Length");
            }
        }
        if (a.a("Host") == null) {
            a2.a("Host", com.uxcam.e.a.c.a(a.a, false));
        }
        if (a.a("Connection") == null) {
            a2.a("Connection", "Keep-Alive");
        }
        boolean z = false;
        if (a.a("Accept-Encoding") == null) {
            z = true;
            a2.a("Accept-Encoding", "gzip");
        }
        List b2 = this.a.b();
        if (!b2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                com.uxcam.e.l lVar = (com.uxcam.e.l) b2.get(i);
                sb.append(lVar.a).append('=').append(lVar.b);
            }
            a2.a("Cookie", sb.toString());
        }
        if (a.a("User-Agent") == null) {
            a2.a("User-Agent", "okhttp/3.4.1");
        }
        ab a4 = aVar.a(a2.a());
        f.a(this.a, a.a, a4.e);
        ab.a b3 = a4.b();
        b3.a = a;
        if (z && "gzip".equalsIgnoreCase(a4.a("Content-Encoding")) && f.a(a4)) {
            com.uxcam.f.j jVar = new com.uxcam.f.j(a4.f.c());
            r a5 = a4.e.a().a("Content-Encoding").a("Content-Length").a();
            b3.a(a5);
            b3.g = new j(a5, com.uxcam.f.l.a(jVar));
        }
        return b3.a();
    }
}
