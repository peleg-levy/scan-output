package com.uxcam.d;

import android.os.Environment;
import com.uxcam.c.f;
import com.uxcam.j.m;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/d/a.class */
public final class a {
    public static String a() {
        return b() + "/." + new f(m.a()).a() + "/";
    }

    public static String b() {
        if (com.uxcam.c.d.y) {
            return c() + "/.UXCam_Temp";
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "UXBrowser");
        file.mkdirs();
        return file.getAbsolutePath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            java.lang.String[] r0 = com.uxcam.j.m.c
            r1 = 0
            boolean r0 = com.uxcam.j.m.a(r0, r1)
            if (r0 != 0) goto Le
            r0 = 0
            goto L18
        Le:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r3 = r0
            java.lang.String r0 = "mounted"
            r1 = r3
            boolean r0 = r0.equals(r1)
        L18:
            if (r0 == 0) goto L2a
            android.content.Context r0 = com.uxcam.j.m.a()
            android.content.Context r0 = r0.getApplicationContext()
            r1 = 0
            java.io.File r0 = r0.getExternalFilesDir(r1)
            r1 = r0
            r3 = r1
            if (r0 != 0) goto L31
        L2a:
            android.content.Context r0 = com.uxcam.j.m.a()
            java.io.File r0 = r0.getFilesDir()
            r3 = r0
        L31:
            r0 = 0
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L3b
            r4 = r0
            goto L3c
        L3b:
        L3c:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.d.a.c():java.lang.String");
    }

    public static final String d() {
        f fVar = new f(m.a());
        if (com.uxcam.c.d.y) {
            return fVar.b() + "$" + com.uxcam.c.d.c + "$" + fVar.a() + "$screen.mp4";
        }
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm", Locale.ENGLISH).format(new Date()) + ".mp4";
    }
}
