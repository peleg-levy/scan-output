package com.uxcam.j;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/g.class */
public final class g {
    public SharedPreferences a;

    public g(Context context) {
        this.a = context.getSharedPreferences("preferenceHelper", 0);
    }

    public final void a(String str, Boolean bool) {
        this.a.edit().putBoolean(str, bool.booleanValue()).apply();
    }

    public final Boolean a(String str) {
        return Boolean.valueOf(this.a.getBoolean(str, false));
    }

    public final void a(String str, String str2) {
        this.a.edit().putString(str, str2).apply();
    }

    public final String b(String str) {
        return this.a.getString(str, null);
    }
}
