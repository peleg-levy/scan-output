package com.uxcam.video.screen;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.uxcam.j.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/e.class */
public final class e {

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/e$a.class */
    public static class a {
        final View a;
        final Rect b;
        final WindowManager.LayoutParams c;

        public a(View view, Rect rect, WindowManager.LayoutParams layoutParams) {
            this.a = view;
            this.b = rect;
            this.c = layoutParams;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List list, Bitmap bitmap) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if ((aVar.c.flags & 2) == 2) {
                new Canvas(bitmap).drawARGB((int) (255.0f * aVar.c.dimAmount), 0, 0, 0);
            }
            Canvas canvas = new Canvas(bitmap);
            canvas.translate(aVar.b.left * d.g, aVar.b.top * d.g);
            canvas.scale(d.g, d.g);
            if (Build.VERSION.SDK_INT < 23 || aVar.a.isAttachedToWindow()) {
                aVar.a.draw(canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List a(Activity activity) {
        Object a2;
        Object[] objArr;
        WindowManager.LayoutParams[] layoutParamsArr;
        ArrayList arrayList = new ArrayList();
        try {
            h.a("mWindowManager", (Class) activity.getWindowManager().getClass());
            a2 = h.a("mWindowManager", activity.getWindowManager());
        } catch (NoSuchFieldException unused) {
            a2 = h.a("mGlobal", activity.getWindowManager());
        }
        Object a3 = h.a("mRoots", a2);
        Object a4 = h.a("mParams", a2);
        if (Build.VERSION.SDK_INT >= 19) {
            objArr = ((List) a3).toArray();
            List list = (List) a4;
            layoutParamsArr = (WindowManager.LayoutParams[]) list.toArray(new WindowManager.LayoutParams[list.size()]);
        } else {
            objArr = (Object[]) a3;
            layoutParamsArr = (WindowManager.LayoutParams[]) a4;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Object a5 = h.a("mAttachInfo", obj);
            int intValue = ((Integer) h.a("mWindowTop", a5)).intValue();
            int intValue2 = ((Integer) h.a("mWindowLeft", a5)).intValue();
            Rect rect = (Rect) h.a("mWinFrame", obj);
            Rect rect2 = new Rect(intValue2, intValue, intValue2 + rect.width(), intValue + rect.height());
            View view = (View) h.a("mView", obj);
            arrayList.add(new a(view, rect2, layoutParamsArr[i]));
            if (!(view.getContext() instanceof Activity)) {
                try {
                    Window window = (Window) h.a("this$0", view);
                    if (window != null) {
                        Window.Callback callback = window.getCallback();
                        if (!(callback instanceof com.uxcam.a.d)) {
                            window.setCallback(new com.uxcam.a.d(callback));
                        }
                    }
                } catch (ClassCastException unused2) {
                    try {
                        PopupWindow popupWindow = (PopupWindow) h.a("this$0", view);
                        if (popupWindow != null) {
                            popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: com.uxcam.video.screen.e.2
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                    if (com.uxcam.b.f() == null) {
                                        return false;
                                    }
                                    com.uxcam.b.f().a(motionEvent);
                                    return false;
                                }
                            });
                        }
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                }
            }
        }
        return arrayList;
    }
}
