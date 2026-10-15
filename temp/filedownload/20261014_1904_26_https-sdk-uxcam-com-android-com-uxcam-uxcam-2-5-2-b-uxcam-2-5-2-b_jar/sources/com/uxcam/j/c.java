package com.uxcam.j;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/c.class */
public final class c {
    private static String a;

    public static String a() {
        StringBuilder sb = new StringBuilder();
        for (Field field : Build.VERSION_CODES.class.getFields()) {
            String name = field.getName();
            int i = -1;
            try {
                i = field.getInt(new Object());
            } catch (IllegalAccessException unused) {
            } catch (IllegalArgumentException unused2) {
            } catch (NullPointerException unused3) {
            }
            if (i == Build.VERSION.SDK_INT) {
                sb.append(" ").append(name);
            }
        }
        return sb.toString();
    }

    public static String a(Context context, int i) {
        int i2 = 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i == 1) {
            i2 = displayMetrics.widthPixels;
        } else if (i == 2) {
            i2 = displayMetrics.heightPixels;
        }
        return String.valueOf(i2);
    }

    public static String a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        a = string;
        if (string.equals("") || a == null || a.isEmpty()) {
            a = new BigInteger(64, new SecureRandom()).toString(16);
        }
        return a;
    }

    public static boolean b(Context context) {
        return ((context.getResources().getConfiguration().screenLayout & 15) == 4) || ((context.getResources().getConfiguration().screenLayout & 15) == 3);
    }

    public static String c(Context context) {
        return b(context) ? "Tablet" : "Phone";
    }
}
