package com.uxcam.i;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import com.uxcam.c.e;
import com.uxcam.j.l;
import com.uxcam.j.m;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/i/b.class */
public class b extends ScaleGestureDetector.SimpleOnScaleGestureListener implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {
    public e c;
    private float g;
    private float h;
    private static final String e = b.class.getSimpleName();
    private static int f = -1;
    public static boolean d = false;
    boolean a = true;
    boolean b = false;
    private ArrayList i = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/i/b$a.class */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {a, b, c, d};

        public static int a(double d2) {
            return a(d2, 45.0f, 135.0f) ? a : (a(d2, 0.0f, 45.0f) || a(d2, 315.0f, 360.0f)) ? d : a(d2, 225.0f, 315.0f) ? b : c;
        }

        private static boolean a(double d2, float f, float f2) {
            return d2 >= ((double) f) && d2 < ((double) f2);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        new StringBuilder("onDoubleTap x : ").append(motionEvent.getRawX()).append(" y : ").append(motionEvent.getRawY());
        a(1, motionEvent.getRawX(), motionEvent.getRawY());
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b = true;
        new StringBuilder("onSingleTap x : ").append(motionEvent.getRawX()).append(" y : ").append(motionEvent.getRawY());
        a(0, motionEvent.getRawX(), motionEvent.getRawY());
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        try {
            this.g = motionEvent.getRawX();
            this.h = motionEvent.getRawY();
            this.a = this.b;
            if (this.c != null && !this.i.isEmpty()) {
                a(((com.uxcam.c.b) this.i.get(0)).a());
                com.uxcam.c.b a2 = ((com.uxcam.c.b) this.i.get(0)).a();
                a2.a = 11;
                a2.h = this.i;
                a2.b();
                a(a2);
                this.i = new ArrayList();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        try {
            float rawX = motionEvent.getRawX();
            int a2 = a.a(((((Math.atan2(motionEvent.getRawY() - motionEvent2.getRawY(), motionEvent2.getRawX() - rawX) + 3.141592653589793d) * 180.0d) / 3.141592653589793d) + 180.0d) % 360.0d);
            if (a2 == a.b && Math.abs(f2) > 200.0f) {
                new StringBuilder("onSwipe x : ").append(motionEvent.getRawX()).append(" y : ").append(motionEvent.getRawY());
                a(3, motionEvent.getRawX(), motionEvent.getRawY());
                return false;
            }
            if (a2 == a.a && Math.abs(f2) > 200.0f) {
                a(2, motionEvent.getRawX(), motionEvent.getRawY());
                new StringBuilder("onSwipe x : ").append(motionEvent.getRawX()).append(" y : ").append(motionEvent.getRawY());
                return false;
            }
            if (a2 == a.d && Math.abs(f2) > 200.0f) {
                a(5, motionEvent.getRawX(), motionEvent.getRawY());
                new StringBuilder("onSwipe x : ").append(motionEvent.getRawX()).append(" y : ").append(motionEvent.getRawY());
                return false;
            }
            if (a2 == a.c && Math.abs(f2) > 200.0f) {
                a(4, motionEvent.getRawX(), motionEvent.getRawY());
                new StringBuilder("onSwipe x : ").append(motionEvent.getRawX()).append(" y : ").append(motionEvent.getRawY());
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        a(9, motionEvent.getRawX(), motionEvent.getRawY());
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        new StringBuilder("onscroll x : ").append(motionEvent2.getRawX()).append(" y : ").append(motionEvent2.getRawY());
        a(6, motionEvent2.getRawX(), motionEvent2.getRawY());
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        a(0, motionEvent.getRawX(), motionEvent.getRawY());
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.b = true;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, float f2, float f3) {
        try {
            com.uxcam.c.b bVar = new com.uxcam.c.b(i, m.b(com.uxcam.a.b(), Calendar.getInstance()));
            bVar.f = Boolean.valueOf(d);
            bVar.c = f2;
            bVar.d = f3;
            Activity activity = (Activity) m.b();
            if (activity.getWindow() != null) {
                activity.getWindow().getDecorView().getLocationOnScreen(new int[2]);
                bVar.d += r0[1];
                bVar.c += r0[0];
            }
            boolean z = 2 != m.a().getResources().getConfiguration().orientation;
            DisplayMetrics displayMetrics = m.a().getResources().getDisplayMetrics();
            if (!z) {
                int i2 = displayMetrics.heightPixels - ((int) bVar.d);
                bVar.d = bVar.c;
                bVar.c = i2;
                if (i == 6) {
                    float f4 = bVar.d;
                    bVar.d = bVar.c;
                    bVar.c = f4;
                }
            }
            int i3 = -1;
            int rotation = ((WindowManager) m.a().getSystemService("window")).getDefaultDisplay().getRotation();
            int f5 = m.f(m.a());
            if (f5 != 1) {
                if (f5 == 2) {
                    switch (rotation) {
                        case 0:
                            i3 = 0;
                            break;
                        case 1:
                            i3 = 3;
                            break;
                        case 2:
                            i3 = 2;
                            break;
                        case 3:
                            i3 = 1;
                            break;
                    }
                }
            } else {
                switch (rotation) {
                    case 0:
                        i3 = 1;
                        break;
                    case 1:
                        i3 = 0;
                        break;
                    case 2:
                        i3 = 3;
                        break;
                    case 3:
                        i3 = 2;
                }
            }
            int i4 = i3;
            if (bVar.a == 10 && f == i4) {
                return;
            }
            f = i4;
            bVar.e = i4;
            if (this.c != null) {
                boolean z2 = false;
                if (bVar.a == 6) {
                    this.i.add(bVar);
                    return;
                }
                if (!this.i.isEmpty() && (bVar.a == 2 || bVar.a == 3 || bVar.a == 4 || bVar.a == 5)) {
                    com.uxcam.c.b a2 = ((com.uxcam.c.b) this.i.get(0)).a();
                    a2.a = bVar.a;
                    a(a2);
                    bVar.h = this.i;
                    bVar.b();
                    bVar.a = 11;
                    bVar.b = a2.b;
                    a(bVar);
                    this.i = new ArrayList();
                    z2 = true;
                } else if (!this.i.isEmpty()) {
                    a(((com.uxcam.c.b) this.i.get(0)).a());
                    com.uxcam.c.b a3 = ((com.uxcam.c.b) this.i.get(0)).a();
                    a3.a = 11;
                    a3.h = this.i;
                    a3.b();
                    a(a3);
                    this.i = new ArrayList();
                }
                new StringBuilder("normal gesture registered ").append(bVar.a);
                if (z2) {
                    return;
                }
                a(bVar);
            }
        } catch (Exception e2) {
            l.a("UXGestureListener", e2);
        }
    }

    private void a(com.uxcam.c.b bVar) {
        if (this.c != null) {
            new StringBuilder("UXCam event ").append(bVar.a).append(" added  responsive ").append(bVar.f).append(" x : ").append(bVar.c).append(" y :").append(bVar.d).append(" time :").append(bVar.b);
            float f2 = bVar.b - this.c.b;
            if (f2 >= 1.0f) {
                this.c.c.add(bVar);
                return;
            }
            int indexOf = com.uxcam.i.a.a().a.indexOf(this.c) - 1;
            if (indexOf >= 0) {
                e eVar = (e) com.uxcam.i.a.a().a.get(indexOf);
                bVar.b -= f2;
                eVar.c.add(bVar);
            }
        }
    }
}
