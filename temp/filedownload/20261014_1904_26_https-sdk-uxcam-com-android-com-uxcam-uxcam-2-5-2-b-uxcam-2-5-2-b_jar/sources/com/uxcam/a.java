package com.uxcam;

import android.content.Context;
import com.uxcam.c.d;
import com.uxcam.d.c;
import com.uxcam.j.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/a.class */
public class a {
    public static String a = a.class.getSimpleName();
    private static volatile a d = null;
    public static Calendar b;
    public Context c;

    private a() {
    }

    public static a a() {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public static Calendar b() {
        if (b == null) {
            b = Calendar.getInstance();
        }
        return b;
    }

    public static void a(Context context, boolean z) {
        if (d.e) {
            try {
                d.e = false;
                if (com.uxcam.j.a.b(context) && z) {
                    new com.uxcam.video.b(context).a("camera");
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context, String str) {
        try {
            boolean z = false;
            if (!str.isEmpty()) {
                z = true;
                str = "UXCam 2.5.2-b " + str;
            }
            l.a(a, "ServiceHanlder.stopUxcamServiceCalled, STOP CALLED");
            a(context, !z);
            try {
                if (d.y) {
                    File a2 = new com.uxcam.d.b(str).a();
                    l.a(a, "Fetch Log and Clean");
                    if (a2 != null && !z) {
                        new c(context).a(a2);
                    }
                }
            } catch (Exception unused) {
            }
            com.uxcam.video.screen.d.b = true;
            if (d.h) {
                com.uxcam.video.screen.d a3 = com.uxcam.video.screen.d.a();
                com.uxcam.video.screen.d.f = false;
                if (a3.s != null) {
                    a3.s.cancel();
                    a3.s = null;
                }
                if (com.uxcam.video.screen.c.h != null) {
                    com.uxcam.video.screen.c.h.cancel();
                    com.uxcam.video.screen.c.h = null;
                }
                if (!com.uxcam.video.screen.d.h) {
                    com.uxcam.video.screen.d.a(com.uxcam.video.screen.d.e);
                }
                com.uxcam.video.screen.d.d = false;
                com.uxcam.g.c.a = new ArrayList();
            }
            a(context, !z);
            l.a(a, "Uxcam Session ENDS");
        } catch (Exception e) {
            l.a("EXCEPTION IN ServiceHandler -> stopUxcamService", e);
        }
    }
}
