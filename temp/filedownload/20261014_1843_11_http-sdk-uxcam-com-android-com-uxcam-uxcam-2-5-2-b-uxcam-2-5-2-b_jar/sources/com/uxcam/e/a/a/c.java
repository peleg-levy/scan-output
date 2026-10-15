package com.uxcam.e.a.a;

import com.uxcam.e.a.d.f;
import com.uxcam.e.ab;
import com.uxcam.e.r;
import com.uxcam.e.z;
import java.util.Date;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/a/c.class */
public final class c {
    public final z a;
    public final ab b;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/a/c$a.class */
    public static class a {
        final long a;
        final z b;
        final ab c;
        Date d;
        String e;
        Date f;
        String g;
        Date h;
        long i;
        long j;
        String k;
        int l;

        public a(long j, z zVar, ab abVar) {
            this.l = -1;
            this.a = j;
            this.b = zVar;
            this.c = abVar;
            if (abVar != null) {
                this.i = abVar.g;
                this.j = abVar.h;
                r rVar = abVar.e;
                int length = rVar.a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = rVar.a(i);
                    String b = rVar.b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.d = com.uxcam.e.a.d.e.a(b);
                        this.e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.h = com.uxcam.e.a.d.e.a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f = com.uxcam.e.a.d.e.a(b);
                        this.g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.l = f.a(b, -1);
                    }
                }
            }
        }
    }

    private c(z zVar, ab abVar) {
        this.a = zVar;
        this.b = abVar;
    }

    public static boolean a(ab abVar, z zVar) {
        switch (abVar.b) {
            case 200:
            case 203:
            case 204:
            case 300:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501:
                break;
            case 302:
            case 307:
                if (abVar.a("Expires") == null && abVar.c().e == -1 && !abVar.c().g && !abVar.c().f) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return (abVar.c().d || zVar.b().d) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c(z zVar, ab abVar, byte b) {
        this(zVar, abVar);
    }
}
