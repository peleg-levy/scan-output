package com.uxcam.e;

import java.util.concurrent.TimeUnit;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/d.class */
public final class d {
    public static final d a;
    public static final d b;
    public final boolean c;
    public final boolean d;
    public final int e;
    private final int m;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    private final boolean n;
    String l;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/d$a.class */
    public static final class a {
        boolean a;
        boolean b;
        int c = -1;
        int d = -1;
        int e = -1;
        boolean f;
        boolean g;

        public final d a() {
            return new d(this, (byte) 0);
        }
    }

    private d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.m = i2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = i3;
        this.j = i4;
        this.k = z6;
        this.n = z7;
        this.l = str;
    }

    private d(a aVar) {
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.m = -1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = aVar.d;
        this.j = aVar.e;
        this.k = aVar.f;
        this.n = aVar.g;
    }

    public static d a(r rVar) {
        String str;
        char charAt;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = true;
        String str2 = null;
        int length = rVar.a.length / 2;
        for (int i5 = 0; i5 < length; i5++) {
            String a2 = rVar.a(i5);
            String b2 = rVar.b(i5);
            if (a2.equalsIgnoreCase("Cache-Control")) {
                if (str2 != null) {
                    z8 = false;
                } else {
                    str2 = b2;
                }
            } else if (a2.equalsIgnoreCase("Pragma")) {
                z8 = false;
            }
            int i6 = 0;
            while (i6 < b2.length()) {
                int a3 = com.uxcam.e.a.d.f.a(b2, i6, "=,;");
                String trim = b2.substring(i6, a3).trim();
                if (a3 == b2.length() || b2.charAt(a3) == ',' || b2.charAt(a3) == ';') {
                    i6 = a3 + 1;
                    str = null;
                } else {
                    int i7 = a3 + 1;
                    while (i7 < b2.length() && ((charAt = b2.charAt(i7)) == ' ' || charAt == '\t')) {
                        i7++;
                    }
                    int i8 = i7;
                    if (i8 >= b2.length() || b2.charAt(i8) != '\"') {
                        i6 = com.uxcam.e.a.d.f.a(b2, i8, ",;");
                        str = b2.substring(i8, i6).trim();
                    } else {
                        int i9 = i8 + 1;
                        int a4 = com.uxcam.e.a.d.f.a(b2, i9, "\"");
                        str = b2.substring(i9, a4);
                        i6 = a4 + 1;
                    }
                }
                if ("no-cache".equalsIgnoreCase(trim)) {
                    z = true;
                } else if ("no-store".equalsIgnoreCase(trim)) {
                    z2 = true;
                } else if ("max-age".equalsIgnoreCase(trim)) {
                    i = com.uxcam.e.a.d.f.a(str, -1);
                } else if ("s-maxage".equalsIgnoreCase(trim)) {
                    i2 = com.uxcam.e.a.d.f.a(str, -1);
                } else if ("private".equalsIgnoreCase(trim)) {
                    z3 = true;
                } else if ("public".equalsIgnoreCase(trim)) {
                    z4 = true;
                } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                    z5 = true;
                } else if ("max-stale".equalsIgnoreCase(trim)) {
                    i3 = com.uxcam.e.a.d.f.a(str, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(trim)) {
                    i4 = com.uxcam.e.a.d.f.a(str, -1);
                } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                    z6 = true;
                } else if ("no-transform".equalsIgnoreCase(trim)) {
                    z7 = true;
                }
            }
        }
        if (!z8) {
            str2 = null;
        }
        return new d(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, str2);
    }

    public final String toString() {
        String sb;
        String str = this.l;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.c) {
            sb2.append("no-cache, ");
        }
        if (this.d) {
            sb2.append("no-store, ");
        }
        if (this.e != -1) {
            sb2.append("max-age=").append(this.e).append(", ");
        }
        if (this.m != -1) {
            sb2.append("s-maxage=").append(this.m).append(", ");
        }
        if (this.f) {
            sb2.append("private, ");
        }
        if (this.g) {
            sb2.append("public, ");
        }
        if (this.h) {
            sb2.append("must-revalidate, ");
        }
        if (this.i != -1) {
            sb2.append("max-stale=").append(this.i).append(", ");
        }
        if (this.j != -1) {
            sb2.append("min-fresh=").append(this.j).append(", ");
        }
        if (this.k) {
            sb2.append("only-if-cached, ");
        }
        if (this.n) {
            sb2.append("no-transform, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        String str2 = sb;
        this.l = str2;
        return str2;
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }

    static {
        a aVar = new a();
        aVar.a = true;
        a = aVar.a();
        a aVar2 = new a();
        aVar2.f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        aVar2.d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        b = aVar2.a();
    }
}
