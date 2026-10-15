package com.uxcam.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.uxcam.j.l;

@TargetApi(14)
/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/a/a.class */
public class a implements Application.ActivityLifecycleCallbacks {
    public static final String a = a.class.getName();
    private static a b;
    private boolean c = false;
    private boolean d = true;
    private Handler e = new Handler();
    private Runnable f;

    public static a a(Application application) {
        if (b == null) {
            b = new a();
            application.registerActivityLifecycleCallbacks(b);
        }
        return b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.d = false;
        this.c = true;
        if (this.f != null) {
            this.e.removeCallbacks(this.f);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.uxcam.b.b();
        this.d = true;
        if (this.f != null) {
            this.e.removeCallbacks(this.f);
        }
        Handler handler = this.e;
        Runnable runnable = new Runnable() { // from class: com.uxcam.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!a.this.c || !a.this.d) {
                    String str = a.a;
                    return;
                }
                a.c(a.this);
                l.a(a.a, "went background");
                com.uxcam.b.c();
            }
        };
        this.f = runnable;
        handler.postDelayed(runnable, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        com.uxcam.b.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        com.uxcam.video.screen.d.o.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    static /* synthetic */ boolean c(a aVar) {
        aVar.c = false;
        return false;
    }
}
