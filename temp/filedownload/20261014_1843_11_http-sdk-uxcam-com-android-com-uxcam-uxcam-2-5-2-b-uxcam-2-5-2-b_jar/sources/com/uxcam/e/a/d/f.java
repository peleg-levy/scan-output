package com.uxcam.e.a.d;

import com.uxcam.e.ab;
import com.uxcam.e.r;
import com.uxcam.e.s;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/f.class */
public final class f {
    public static long a(r rVar) {
        return a(rVar.a("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(com.uxcam.e.m mVar, s sVar, r rVar) {
        if (mVar == com.uxcam.e.m.a || com.uxcam.e.l.a(sVar, rVar).isEmpty()) {
            return;
        }
        mVar.a();
    }

    public static boolean a(ab abVar) {
        if (abVar.a.b.equals("HEAD")) {
            return false;
        }
        int i = abVar.b;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && a(abVar.e) == -1 && !"chunked".equalsIgnoreCase(abVar.a("Transfer-Encoding"))) ? false : true;
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
