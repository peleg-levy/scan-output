package com.uxcam.j;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/l.class */
public final class l {
    public static StringBuilder a;

    public static void a(String str, String str2) {
        if (a == null) {
            a = new StringBuilder();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(System.getProperty("line.separator"));
            sb.append("[" + str + "]");
            sb.append(str2);
            a.append((CharSequence) sb);
            g gVar = new g(m.a());
            gVar.a("uxlog", gVar.b("uxlog") + ((CharSequence) sb) + System.getProperty("line.separator"));
        } catch (Exception unused) {
        }
    }

    public static void a(String str, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        a(str, stringWriter.toString());
    }
}
