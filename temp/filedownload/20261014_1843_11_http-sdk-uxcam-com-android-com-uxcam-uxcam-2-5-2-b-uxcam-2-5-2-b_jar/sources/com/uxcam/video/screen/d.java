package com.uxcam.video.screen;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.uxcam.UXCam;
import com.uxcam.j.l;
import com.uxcam.j.m;
import com.uxcam.service.HttpPostService;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/d.class */
public class d {
    public static b a;
    public static boolean b;
    public static com.uxcam.video.screen.codec.a.a.a e;
    private static d v;
    private static int w;
    private static int x;
    final Handler r = new Handler();
    public Timer s;
    public TimerTask t;
    private static int y;
    private static int z;
    public static int c = -1;
    public static boolean d = false;
    public static boolean f = false;
    public static float g = 1.0f;
    public static boolean h = false;
    public static boolean i = false;
    public static WeakReference j = new WeakReference(null);
    public static WeakReference k = new WeakReference(null);
    public static WeakReference l = new WeakReference(null);
    public static WeakReference m = new WeakReference(null);
    public static ArrayList n = new ArrayList();
    public static ArrayList o = new ArrayList();
    private static String u = d.class.getSimpleName();
    public static int p = 0;
    public static int q = 1000;

    private d() {
        h = j();
        c = -1;
        if (!h) {
            n();
            return;
        }
        m();
        l.a(u, "IS using MediaCodec.");
        f = true;
        com.uxcam.video.screen.a.c cVar = new com.uxcam.video.screen.a.c();
        File file = new File(com.uxcam.d.a.a());
        if (!file.exists()) {
            file.mkdir();
        }
        cVar.b = new File(file, com.uxcam.d.a.d()).getAbsolutePath();
        cVar.d = new com.uxcam.video.screen.a.b();
        cVar.f.add(new com.uxcam.video.screen.a.a() { // from class: com.uxcam.video.screen.d.1
            @Override // com.uxcam.video.screen.a.a
            public final void a() {
                String unused = d.u;
                l.a(d.u, "ENCODING COMPLETE WITH MEDIA CODEC");
                d.d();
            }

            @Override // com.uxcam.video.screen.a.a
            public final void b() {
                String unused = d.u;
                l.a(d.u, "ENCODING FAILED WITH MEDIA CODEC");
                d.n();
            }
        });
        q = com.uxcam.c.d.i;
        cVar.e.start();
    }

    public static d a() {
        if (v == null) {
            v = new d();
        }
        return v;
    }

    public static int b() {
        return c == 1 ? w : x;
    }

    public static int c() {
        return c == 1 ? x : w;
    }

    public static void a(com.uxcam.video.screen.codec.a.a.a aVar) {
        if (a.size() == 0 && b && com.uxcam.c.d.h) {
            c.a = 0;
            com.uxcam.c.d.h = false;
            b = false;
            new StringBuilder("position value stoping encoding.....").append(a.size());
            try {
                aVar.a();
            } catch (IOException e2) {
                l.a(u, e2);
            }
            v = null;
            e = null;
            a.clear();
            a = null;
            c.a = 0;
            Intent intent = new Intent(m.a(), (Class<?>) HttpPostService.class);
            intent.putExtra("arg_which_service", "screen_upload");
            m.a().startService(intent);
        }
    }

    public static void d() {
        c.a = 0;
        com.uxcam.c.d.h = false;
        b = false;
        e();
        Intent intent = new Intent(m.a(), (Class<?>) HttpPostService.class);
        intent.putExtra("arg_which_service", "screen_upload");
        m.a().startService(intent);
    }

    private static void m() {
        if (z == 0) {
            DisplayMetrics displayMetrics = m.a().getResources().getDisplayMetrics();
            z = displayMetrics.heightPixels;
            y = displayMetrics.widthPixels;
        }
        w = y;
        if (y > com.uxcam.c.d.D) {
            int i2 = com.uxcam.c.d.D;
            w = i2;
            g = i2 / y;
        }
        w = (int) (y * g);
        x = (int) (z * g);
        new StringBuilder("vvtest width is ").append(w).append("Height is ").append(x);
        if (c == -1) {
            c = w > x ? 0 : 1;
        }
    }

    public static void e() {
        v = null;
        e = null;
        if (a != null) {
            a.clear();
            a = null;
        }
        c.a = 0;
    }

    public static int f() {
        return q == 2000 ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        h = false;
        try {
            if (e == null) {
                File file = new File(com.uxcam.d.a.a());
                if (!file.exists()) {
                    file.mkdir();
                }
                e = new com.uxcam.video.screen.codec.a.a.a(new File(file, com.uxcam.d.a.d()));
            }
            l.a(u, "IS using JCodec.");
        } catch (IOException unused) {
        }
        a = new b();
        m();
        q = com.uxcam.c.d.i;
    }

    public static void g() {
        if (com.uxcam.c.d.F > 0) {
            com.uxcam.i.a.a();
            if (Integer.parseInt(com.uxcam.i.a.c()) > com.uxcam.c.d.F) {
                UXCam.ignoreRecording();
            }
        }
        c.a(h);
    }

    public static com.uxcam.video.screen.codec.a.a.a h() {
        return e;
    }

    public static void i() {
        j = new WeakReference(null);
        k = new WeakReference(null);
        l = new WeakReference(null);
    }

    public static boolean j() {
        return (Build.VERSION.SDK_INT < 19 || Build.FINGERPRINT.startsWith("generic") || Build.MODEL.equalsIgnoreCase("Nexus 10")) ? false : true;
    }
}
