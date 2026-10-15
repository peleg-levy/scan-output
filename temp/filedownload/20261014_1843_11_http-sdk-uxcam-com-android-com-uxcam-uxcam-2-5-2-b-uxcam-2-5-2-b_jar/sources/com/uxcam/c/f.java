package com.uxcam.c;

import android.content.Context;
import com.uxcam.j.g;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/c/f.class */
public final class f {
    public g a;

    public f(Context context) {
        this.a = new g(context);
    }

    public final void a(boolean z) {
        if (this.a != null) {
            this.a.a("status", Boolean.valueOf(z));
        }
    }

    public final String a() {
        return this.a.b("app_device_id");
    }

    public final String b() {
        return this.a.b("user_id");
    }

    public final void a(String str) {
        this.a.a("user_id", str);
    }
}
