package com.uxcam;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.uxcam.UXCam;
import com.uxcam.a.c;
import com.uxcam.b;
import com.uxcam.c.d;
import com.uxcam.c.f;
import com.uxcam.e.ab;
import com.uxcam.e.ac;
import com.uxcam.e.p;
import com.uxcam.e.u;
import com.uxcam.e.w;
import com.uxcam.e.z;
import com.uxcam.j.g;
import com.uxcam.j.l;
import com.uxcam.j.m;
import com.uxcam.j.n;
import com.uxcam.service.HttpPostService;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/b.class */
public class b {
    public static String b;
    static c e;
    private static b n;
    public static String f;
    protected Application.ActivityLifecycleCallbacks g;
    public f h;
    public n i;
    public Context k;
    public boolean l;
    public static final String a = b.class.getSimpleName();
    public static boolean c = false;
    public static boolean d = false;
    private static boolean o = false;
    public int j = 0;
    public List m = new CopyOnWriteArrayList();

    private b() {
    }

    public static b a() {
        if (n == null) {
            n = new b();
        }
        return n;
    }

    @TargetApi(14)
    public static void a(String str, boolean z) {
        f = str;
        Application application = null;
        try {
            Application application2 = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
            new StringBuilder("Context is ").append(application2);
            application = application2;
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException unused2) {
        } catch (IllegalArgumentException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (InvocationTargetException unused5) {
        }
        if (!o && Build.VERSION.SDK_INT >= 14) {
            o = true;
            int i = Build.VERSION.SDK_INT;
            if (z) {
                a().g = new com.uxcam.a.b();
                a().g = com.uxcam.a.a.a(application);
            } else if (i < 21 || Build.FINGERPRINT.startsWith("generic")) {
                a().g = com.uxcam.a.a.a(application);
            } else {
                a().g = new com.uxcam.a.b();
                application.registerActivityLifecycleCallbacks(a().g);
            }
        }
        if (!d.C || Build.VERSION.SDK_INT < 14) {
            return;
        }
        a((Activity) m.b());
    }

    @TargetApi(14)
    public static void a(String str, String str2) {
        d.b = str2;
        UXCam.startWithKey(str);
    }

    @TargetApi(14)
    public static void a(Activity activity, String str) {
        b(activity, str);
    }

    @TargetApi(14)
    public static void b(Activity activity, String str) {
        f = str;
        if (o || Build.VERSION.SDK_INT < 14) {
            return;
        }
        o = true;
        com.uxcam.a.a aVar = new com.uxcam.a.a();
        a().g = aVar;
        aVar.onActivityStarted(activity);
        aVar.onActivityResumed(activity);
        activity.getApplication().registerActivityLifecycleCallbacks(aVar);
    }

    public static void a(Activity activity) {
        boolean z = false;
        Iterator it = com.uxcam.video.screen.d.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((Activity) it.next()).equals(activity)) {
                z = true;
                break;
            }
        }
        if (!z) {
            com.uxcam.video.screen.d.o.add(activity);
            new StringBuilder("added :").append(activity.getClass().getSimpleName());
        }
        m.a(activity);
        c cVar = new c(activity);
        e = cVar;
        m.f();
        try {
            if (cVar.b != null) {
                b a2 = a();
                Context a3 = m.a();
                boolean z2 = true;
                if (a().j == 3) {
                    z2 = false;
                }
                if (!a2.l && z2 && !d.C) {
                    try {
                        if (f == null) {
                            f = m.b(a3);
                        }
                        if (a().j == 2) {
                            a().j = 0;
                        }
                        new StringBuilder("App key is ").append(f);
                        boolean z3 = false;
                        try {
                            a3.getPackageManager().getServiceInfo(new ComponentName(a3.getPackageName(), HttpPostService.class.getName()), 4);
                        } catch (PackageManager.NameNotFoundException unused) {
                            z3 = true;
                            Log.i("UXCam", "UXCam 2.5.2-b : HttpPostService service not included in project's manifest");
                        }
                        if (f.equals("") || f == null) {
                            z3 = true;
                        }
                        if (!com.uxcam.j.a.b(a3)) {
                            z3 = true;
                        }
                        try {
                            if (!m.a(m.a, true)) {
                                z3 = true;
                            }
                        } catch (Exception e2) {
                            z3 = true;
                            e2.getMessage();
                        }
                        if (z3) {
                            throw new Exception("Pre-Condition validation failed");
                        }
                        a2.h = new f(a3);
                        a2.k = a3;
                        if ((com.uxcam.j.b.a || com.uxcam.j.b.b || !(a().j != 1)) ? false : true) {
                            n nVar = a().i;
                            if (nVar != null) {
                                nVar.a();
                            }
                            a2.l = true;
                            String str = f;
                            if (d.y) {
                                final com.uxcam.k.a aVar = new com.uxcam.k.a(a2.k);
                                try {
                                    if (com.uxcam.j.a.b(aVar.a)) {
                                        String a4 = com.uxcam.j.c.a(aVar.a);
                                        String str2 = Build.VERSION.RELEASE;
                                        String str3 = Build.MODEL;
                                        int i = new g(aVar.a).a.getInt("recorded_session_count", 0);
                                        w wVar = new w();
                                        p.a a5 = new p.a().a("app_key", str).a("buildIdentifier", m.d(aVar.a)).a("device_id", a4).a("device_os", str2).a("device_type", com.uxcam.j.c.c(aVar.a)).a("device_model_name", str3).a("app_version", m.e(aVar.a)).a("sdk_version", "2.5.2-b").a("sdk_version_number", "39").a("sessions_recorded_on_device", Integer.toString(i));
                                        wVar.a(new z.a().a("https://api.uxcam.com/webservices/v3/verifyapp").a("POST", new p(a5.a, a5.b, (byte) 0)).a()).a(new com.uxcam.e.f() { // from class: com.uxcam.k.a.1
                                            @Override // com.uxcam.e.f
                                            public final void a(IOException iOException) {
                                                new StringBuilder("onFailure ").append(iOException.getMessage());
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
                                            /* JADX WARN: Type inference failed for: r0v3 */
                                            @Override // com.uxcam.e.f
                                            public final void a(ab abVar) {
                                                Charset charset;
                                                if (!abVar.a()) {
                                                    b.a().l = false;
                                                    return;
                                                }
                                                JSONException jSONException = 200;
                                                if (200 != abVar.b) {
                                                    b.a().l = false;
                                                    return;
                                                }
                                                try {
                                                    ac acVar = abVar.f;
                                                    byte[] d2 = acVar.d();
                                                    u a6 = acVar.a();
                                                    if (a6 != null) {
                                                        charset = a6.b != null ? Charset.forName(a6.b) : com.uxcam.e.a.c.c;
                                                    } else {
                                                        charset = com.uxcam.e.a.c.c;
                                                    }
                                                    final JSONObject jSONObject = new JSONObject(new String(d2, charset.name()));
                                                    jSONException = new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.uxcam.k.a.1.1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            a.this.a(jSONObject);
                                                        }
                                                    });
                                                } catch (JSONException unused2) {
                                                    jSONException.printStackTrace();
                                                }
                                            }
                                        });
                                    }
                                } catch (Exception e3) {
                                    l.a("VerificationHandler", e3);
                                }
                            } else {
                                try {
                                    new com.uxcam.k.a(a2.k).a(new JSONObject("{\"appName_icon\":true,\"verify_status\":true,\"video_record\":true,\"settings\":{\"session_percentage_to_record\":100,\"camera_record\":false,\"cc_message\":\"Would like to record your camera video?\",\"screen_record\":true,\"sessions_per_user\":\"all\",\"wifi_status\":false,\"screen_quality\":2,\"url\":null,\"g_status\":true,\"camera_quality\":\"low\",\"g_data_size\":10,\"wifi_data_size\":0},\"domain\":\"uxc.am\",\"app_id\":\"556c1ffc73cde7d41d9aa711\",\"app_device_id\":\"UXBrowser\",\"s3\":{\"X-amz-signature\":\"2259cfdd94a82657a65f152ee5bddc97a2dc1148c5fa6fd2c7c25312f1597148\",\"X-amz-date\":\"20150603T092842Z\",\"acl\":\"private\",\"X-amz-algorithm\":\"AWS4-HMAC-SHA256\",\"success_action_status\":200,\"policy\":\"eyJleHBpcmF0aW9uIjoiMjAxNS0wNi0wM1QxNToyODo0MloiLCJjb25kaXRpb25zIjpbeyJidWNrZXQiOiJkYXRhLnV4Y2FtLmNvbSJ9LHsiYWNsIjoicHJpdmF0ZSJ9LFsic3RhcnRzLXdpdGgiLCIka2V5IiwiNTRlZmYzNWZhMTQ3M2UzMjY5ZDM2NjNmXC8iXSxbInN0YXJ0cy13aXRoIiwiJENvbnRlbnQtVHlwZSIsIiJdLHsic3VjY2Vzc19hY3Rpb25fc3RhdHVzIjoiMjAwIn0seyJ4LWFtei1jcmVkZW50aWFsIjoiQUtJQUpRTFVOU1BJTUFRNkZDU0FcLzIwMTUwNjAzXC9ldS13ZXN0LTFcL3MzXC9hd3M0X3JlcXVlc3QifSx7IngtYW16LWFsZ29yaXRobSI6IkFXUzQtSE1BQy1TSEEyNTYifSx7IngtYW16LWRhdGUiOiIyMDE1MDYwM1QwOTI4NDJaIn0seyJ4LWFtei1leHBpcmVzIjoiODY0MDAifV19\",\"url\":\"https:\\/\\/s3-eu-west-1.amazonaws.com\\/data.uxcam.com\\/\",\"X-amz-expires\":\"86400\",\"X-amz-credential\":\"AKIAJQLUNSPIMAQ6FCSA\\/20150603\\/eu-west-1\\/s3\\/aws4_request\"}}"));
                                } catch (JSONException unused2) {
                                }
                            }
                        }
                    } catch (Exception e4) {
                        new StringBuilder("Exception while starting Uxcam :").append(e4.getMessage());
                        l.a(a, "Exception while starting Uxcam :" + e4.getMessage());
                        a().j = 3;
                    }
                }
                cVar.a((ViewGroup) cVar.b.findViewById(R.id.content).getRootView());
                a();
                Activity activity2 = cVar.b;
                if (new f(activity2).a.a("status").booleanValue() && com.uxcam.j.b.a) {
                    try {
                        com.uxcam.i.a.a().a(m.a(), null);
                    } catch (Exception unused3) {
                    }
                    com.uxcam.g.c.a(activity2);
                }
            }
        } catch (Exception unused4) {
        }
        c.a++;
        new StringBuilder("ctest onstart called for activity ").append(cVar.getClass().getName());
        Window window = activity.getWindow();
        window.setCallback(new com.uxcam.a.d(window.getCallback()));
    }

    public static void b() {
        try {
            c.a();
        } catch (Exception e2) {
            l.a(a, e2);
        }
    }

    public static void c() {
        if (e != null) {
            e.b = null;
            n nVar = a().i;
            if (nVar != null) {
                nVar.a();
            }
            c.b();
        }
    }

    public static void d() {
        try {
            final c cVar = e;
            c.a();
            if (c.a == 0) {
                Log.i("UXCam", "UXCam 2.5.2-b : Error in integration, see integration docs for instruction.");
                l.a("UXCamActivityData -> onStopTaskForLollipop", "activity count is 0. Integration error");
                UXCam.stopApplicationAndUploadData();
            }
            c.a--;
            new StringBuilder("ctest onstop called for activity ").append(cVar.getClass().getName());
            if (c.a == 0) {
                n nVar = a().i;
                if (nVar != null) {
                    nVar.a();
                }
                new Thread(new Runnable() { // from class: com.uxcam.a.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            Thread.sleep(2000L);
                            if (c.a == 0) {
                                l.a(c.c, "ACtivity count is 0");
                                c.b();
                            }
                        } catch (InterruptedException e2) {
                            l.a(c.c, e2);
                        }
                    }
                }).start();
            }
        } catch (Exception unused) {
        }
    }

    public static void e() {
        d.C = true;
        a();
        b(m.b());
    }

    public static void a(MapView mapView) {
        d = true;
        com.uxcam.video.screen.d.i();
        com.uxcam.video.screen.d.j = new WeakReference(mapView);
        mapView.getMapAsync(new OnMapReadyCallback() { // from class: com.uxcam.b.1
            public final void onMapReady(GoogleMap googleMap) {
                com.uxcam.video.screen.d.k = new WeakReference(googleMap);
            }
        });
    }

    public static void a(MapFragment mapFragment) {
        d = true;
        com.uxcam.video.screen.d.i();
        if (mapFragment != null) {
            com.uxcam.video.screen.d.l = new WeakReference(mapFragment);
            mapFragment.getMapAsync(new OnMapReadyCallback() { // from class: com.uxcam.b.2
                public final void onMapReady(GoogleMap googleMap) {
                    com.uxcam.video.screen.d.k = new WeakReference(googleMap);
                }
            });
        }
    }

    public static void a(SupportMapFragment supportMapFragment) {
        d = true;
        com.uxcam.video.screen.d.i();
        if (supportMapFragment != null) {
            com.uxcam.video.screen.d.m = new WeakReference(supportMapFragment);
            supportMapFragment.getMapAsync(new OnMapReadyCallback() { // from class: com.uxcam.b.3
                public final void onMapReady(GoogleMap googleMap) {
                    com.uxcam.video.screen.d.k = new WeakReference(googleMap);
                }
            });
        }
    }

    public static void a(View view) {
        com.uxcam.video.screen.d.p = 1;
        com.uxcam.video.screen.d.n.add(new WeakReference(view));
    }

    public static void a(boolean z) {
        com.uxcam.video.screen.d.i = z;
    }

    public static c f() {
        return e;
    }

    public static void g() {
        boolean isEmpty = HttpPostService.c.isEmpty();
        File[] listFiles = new File(com.uxcam.d.a.b()).listFiles();
        boolean z = (listFiles != null && listFiles.length == 0) && HttpPostService.b;
        if (!isEmpty && !z) {
            new StringBuilder("Notification NOT stopped isSendingFilesEmpty : ").append(isEmpty).append(" isRootFolderEmptyAndServiceRunning : false");
            return;
        }
        if (com.uxcam.j.b.a) {
            return;
        }
        l.a(a, "Notification stopped isSendingFilesEmpty : " + isEmpty + " isRootFolderEmptyAndServiceRunning : " + z);
        m.a().stopService(new Intent(m.a(), (Class<?>) HttpPostService.class));
        if (z) {
            Log.i("UXCam", "UXCam 2.5.2-b : session data sent successfully");
        }
    }

    public static void a(Context context) {
        if (com.uxcam.video.a.a.a) {
            Intent intent = new Intent(context, (Class<?>) HttpPostService.class);
            intent.putExtra("arg_which_service", "stop_camera");
            context.startService(intent);
        }
        a.a(context, true);
        new g(context).a("make_camera_stop", (Boolean) true);
    }

    public static void a(String str) {
        b = str;
    }

    public static void h() {
        c = true;
    }

    public static void b(String str) {
        if (com.uxcam.j.b.a) {
            try {
                com.uxcam.i.a.a().a(m.a(), str);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, Map map) {
        com.uxcam.i.a a2 = com.uxcam.i.a.a();
        int a3 = m.a(a.b(), Calendar.getInstance());
        if (a2.c == null) {
            a2.c = new ArrayList();
        }
        if (a2.c.size() >= 100) {
            new StringBuilder().append(str).append(" event  will not be tracked. (limit 100)");
            return;
        }
        if (com.uxcam.i.a.a(str) > 100) {
            new StringBuilder().append(str).append(" event will not be tracked. (byte size limit 100 bytes)");
            return;
        }
        if (map != null) {
            int i = 0;
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (i >= 100) {
                    new StringBuilder().append(entry.getKey()).append(" : ").append(entry.getValue()).append(" param will not be tracked. (size limit 100)");
                    it.remove();
                } else if (com.uxcam.i.a.a((String) entry.getKey()) > 100) {
                    new StringBuilder().append(entry.getKey()).append(" : ").append(entry.getValue()).append(" param will not be tracked. (byte size limit 100 bytes)");
                    it.remove();
                } else if (com.uxcam.i.a.a((String) entry.getValue()) > 100) {
                    new StringBuilder().append(entry.getKey()).append(" : ").append(entry.getValue()).append(" param will not be tracked. (byte size limit 100 bytes)");
                    it.remove();
                }
                i++;
            }
        }
        a2.c.add(new com.uxcam.c.a(str, a3, map));
    }

    public static String i() {
        return d.w + "/s/" + d.v;
    }

    public static String j() {
        return d.w + "/u/" + d.u;
    }

    public static boolean k() {
        return com.uxcam.j.b.a;
    }

    public static void l() {
        com.uxcam.video.screen.d.d = true;
    }

    public static void m() {
        com.uxcam.video.screen.d.d = false;
    }

    @TargetApi(14)
    public static void b(Context context) {
        if (!d.y && a().g != null) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(a().g);
            o = false;
        }
        a().l = false;
        l.a(a, "UXCam onStop is called");
        com.uxcam.j.b.b = false;
        a().j = 2;
        if (a().j == 1) {
            com.uxcam.i.a.a().c = new ArrayList();
        }
        try {
            if (com.uxcam.j.b.a) {
                com.uxcam.j.b.a = false;
                if (com.uxcam.video.a.a.a) {
                    Intent intent = new Intent(context, (Class<?>) HttpPostService.class);
                    intent.putExtra("arg_which_service", "stop_camera");
                    context.startService(intent);
                }
                new f(context).a(false);
                new g(context).a("make_camera_stop", (Boolean) false);
                Intent intent2 = new Intent(context, (Class<?>) HttpPostService.class);
                intent2.putExtra("arg_which_service", "value_stop_uxcam");
                context.startService(intent2);
                if (!d.C) {
                    m.a((Context) null);
                }
                e = null;
                com.uxcam.video.screen.c.f = null;
            }
        } catch (Exception e2) {
            l.a("UXCam -> onstop", e2);
        }
    }

    public final void a(UXCam.OnVerificationListener onVerificationListener) {
        this.m.removeAll(this.m);
        this.m.add(onVerificationListener);
    }

    public static void n() {
        d.z = true;
    }
}
