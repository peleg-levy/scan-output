package com.uxcam.j;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.StrictMode;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.WindowManager;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/m.class */
public class m {
    private static Context e;
    private static Context f;
    private static StringBuffer g;
    private static final String d = m.class.getSimpleName();
    public static String[] a = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"};
    public static String[] b = {"android.permission.SYSTEM_ALERT_WINDOW", "android.permission.CAMERA"};
    public static String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static boolean h = false;

    public static void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        file.delete();
    }

    public static Context a() {
        return f;
    }

    public static Context b() {
        return e;
    }

    public static void a(Context context) {
        e = context;
        if (context != null) {
            f = context.getApplicationContext();
        }
    }

    public static String b(Context context) {
        String str = null;
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("uxcam_app_key");
            if (obj instanceof Integer) {
                str = obj.toString();
            } else if (obj instanceof String) {
                str = (String) obj;
            }
            return str;
        } catch (Exception e2) {
            new StringBuilder("api key from manifest is Failed to load meta-data, nullpointer exception NameNotFound: ").append(e2.getMessage());
            return "";
        }
    }

    public static String c() {
        return DateFormat.format("yyyy-MM-dd hh:mm:ss", new Date()).toString();
    }

    public static int a(Calendar calendar, Calendar calendar2) {
        return (int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 1000);
    }

    public static float b(Calendar calendar, Calendar calendar2) {
        return ((float) (calendar2.getTimeInMillis() - calendar.getTimeInMillis())) / 1000.0f;
    }

    public static int d() {
        return a(com.uxcam.a.b(), Calendar.getInstance());
    }

    public static String c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Unknown");
    }

    public static String d(Context context) {
        return (com.uxcam.c.d.b == null || com.uxcam.c.d.b.isEmpty()) ? context.getApplicationInfo().packageName : com.uxcam.c.d.b;
    }

    public static String e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            new StringBuilder("Version name is ").append(packageInfo.versionName);
            new StringBuilder("Version code is ").append(packageInfo.versionCode);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static void e() {
        File file = new File(com.uxcam.d.a.a());
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static boolean a(String[] strArr, boolean z) {
        PackageManager packageManager = f.getPackageManager();
        g = new StringBuffer();
        PackageInfo packageInfo = null;
        try {
            packageInfo = packageManager.getPackageInfo(f.getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String[] strArr2 = packageInfo.requestedPermissions;
        if (strArr2 == null) {
            return true;
        }
        for (int i = 0; i < strArr.length; i++) {
            for (String str : strArr2) {
                if (strArr[i].compareTo(str) == 0) {
                    h = true;
                }
            }
            if (!h) {
                g.append("," + strArr[i]);
                if (z) {
                    Log.i("UXCam", "UXCam 2.5.2-b : Missed permission : " + strArr[i] + ". Add this permission to project’s manifest.");
                }
            }
            h = false;
        }
        if (g.length() == 0) {
            return true;
        }
        if (!z) {
            return false;
        }
        new StringBuilder("Missed permission : ").append((Object) g);
        return false;
    }

    @TargetApi(9)
    public static void f() {
        if (Build.VERSION.SDK_INT > 9) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        }
    }

    public static int f(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && configuration.orientation == 2) {
            return 2;
        }
        return ((rotation == 1 || rotation == 3) && configuration.orientation == 1) ? 2 : 1;
    }

    public static int a(int i) {
        return i - (i % 16);
    }

    public static String b(int i) {
        return (i % 100 == 11 || i % 100 == 12 || i % 100 == 13) ? i + "th" : i + new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"}[i % 10];
    }

    public static Map a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }
}
