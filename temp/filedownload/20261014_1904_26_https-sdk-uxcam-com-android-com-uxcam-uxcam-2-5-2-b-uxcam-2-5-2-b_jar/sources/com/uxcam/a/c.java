package com.uxcam.a;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.uxcam.c.e;
import com.uxcam.j.l;
import com.uxcam.j.m;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Calendar;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/a/c.class */
public class c {
    private GestureDetector d;
    private ScaleGestureDetector e;
    public Activity b;
    private static final String c = c.class.getSimpleName();
    public static int a = 0;

    public c(Activity activity) {
        this.b = activity;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof com.uxcam.b.a) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new com.uxcam.b.a(defaultUncaughtExceptionHandler));
    }

    public final void a(ViewGroup viewGroup) {
        int inputType;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            } else if (childAt != null && (childAt instanceof TextView) && ((inputType = ((TextView) childAt).getInputType()) == 128 || inputType == 129)) {
                com.uxcam.video.screen.d.n.add(new WeakReference(childAt));
            }
        }
    }

    public static void a() {
        if (com.uxcam.i.a.a().b != null) {
            e eVar = com.uxcam.i.a.a().b.c;
            com.uxcam.a.a();
            eVar.e = m.b(com.uxcam.a.b(), Calendar.getInstance()) - eVar.b;
        }
    }

    public static void b() {
        try {
            com.uxcam.c.d.C = false;
            com.uxcam.b.a();
            com.uxcam.b.b(m.b());
            l.a(c, "Stopping all uxcam services");
        } catch (Exception e) {
            l.a(c, e);
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (this.d != null) {
            this.d.onTouchEvent(motionEvent);
        } else if (com.uxcam.i.a.a().b != null) {
            GestureDetector gestureDetector = new GestureDetector(m.a(), com.uxcam.i.a.a().b);
            gestureDetector.setOnDoubleTapListener(com.uxcam.i.a.a().b);
            this.d = gestureDetector;
            this.d.onTouchEvent(motionEvent);
        }
        if (this.e != null) {
            try {
                this.e.onTouchEvent(motionEvent);
                return;
            } catch (Exception e) {
                l.a("UXCamActivityData -> dispatchTouchEvent", e);
                return;
            }
        }
        if (com.uxcam.i.a.a().b != null) {
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(m.a(), com.uxcam.i.a.a().b);
            this.e = scaleGestureDetector;
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
    }
}
