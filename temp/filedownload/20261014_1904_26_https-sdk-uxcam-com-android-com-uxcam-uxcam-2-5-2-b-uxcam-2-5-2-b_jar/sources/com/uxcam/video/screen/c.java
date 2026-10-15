package com.uxcam.video.screen;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.uxcam.j.l;
import com.uxcam.j.m;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/c.class */
public class c {
    public static Bitmap b;
    public static Bitmap c;
    private static Bitmap i;
    public static GoogleMap.SnapshotReadyCallback f;
    public static Timer h;
    public static int a = 0;
    public static boolean d = false;
    public static boolean e = false;
    private static String j = c.class.getSimpleName();
    public static long g = 0;

    private static boolean a() {
        final MapView mapView = (MapView) d.j.get();
        final SupportMapFragment supportMapFragment = (SupportMapFragment) d.m.get();
        final MapFragment mapFragment = (MapFragment) d.l.get();
        final boolean z = mapView != null && mapView.getVisibility() == 0;
        final boolean z2 = supportMapFragment != null && supportMapFragment.isVisible();
        final boolean z3 = mapFragment != null && mapFragment.isVisible();
        if ((z || z3 || z2) && d.k.get() == null) {
            d.a().r.post(new Runnable() { // from class: com.uxcam.video.screen.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (z3) {
                        mapFragment.getMapAsync(new OnMapReadyCallback() { // from class: com.uxcam.video.screen.c.2.1
                            public final void onMapReady(GoogleMap googleMap) {
                                d.k = new WeakReference(googleMap);
                            }
                        });
                    }
                    if (z2) {
                        supportMapFragment.getMapAsync(new OnMapReadyCallback() { // from class: com.uxcam.video.screen.c.2.2
                            public final void onMapReady(GoogleMap googleMap) {
                                d.k = new WeakReference(googleMap);
                            }
                        });
                    }
                    if (z) {
                        mapView.getMapAsync(new OnMapReadyCallback() { // from class: com.uxcam.video.screen.c.2.3
                            public final void onMapReady(GoogleMap googleMap) {
                                d.k = new WeakReference(googleMap);
                            }
                        });
                    }
                }
            });
        }
        if (d.k.get() != null) {
            return z || z3 || z2;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [android.view.ViewGroup, java.lang.Exception] */
    public static void a(boolean z) {
        ?? r0;
        try {
            if (com.uxcam.c.d.B) {
                r0 = (ViewGroup) ((Activity) m.b()).findViewById(R.id.content).getRootView();
                com.uxcam.g.c.a((ViewGroup) r0);
            }
        } catch (Exception unused) {
            r0.printStackTrace();
        }
        try {
            if (z) {
                if (!d.d) {
                    if (d.p == 0) {
                        g = System.currentTimeMillis();
                        b = b(z);
                    } else {
                        d.p--;
                    }
                }
                e = false;
                return;
            }
            int a2 = m.a(com.uxcam.a.b(), Calendar.getInstance());
            int i2 = a2 - a;
            int size = d.a.size();
            if (size < 10) {
                a++;
                b = b(z);
                d = true;
                int f2 = d.f();
                if (i2 > 0) {
                    f2 = i2 + 1;
                    a += i2;
                }
                new StringBuilder("vtest time is ").append(a2).append(" imagecount is ").append(a).append(" frametime: ").append(f2);
                if (b != null) {
                    d.a.add(new com.uxcam.c.c(b, size, f2));
                }
            }
        } catch (Exception e2) {
            l.a(j, e2);
        }
    }

    private static Bitmap b(boolean z) {
        Activity activity = (Activity) m.b();
        if (com.uxcam.b.d && a()) {
            d.a().r.post(new Runnable() { // from class: com.uxcam.video.screen.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleMap googleMap = (GoogleMap) d.k.get();
                    if (googleMap != null) {
                        c.f = new GoogleMap.SnapshotReadyCallback() { // from class: com.uxcam.video.screen.c.1.1
                            public final void onSnapshotReady(Bitmap bitmap) {
                                Bitmap unused = c.i = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * d.g), (int) (bitmap.getHeight() * d.g), true);
                            }
                        };
                        googleMap.snapshot(c.f);
                    }
                }
            });
        }
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int i2 = (int) (displayMetrics.widthPixels * d.g);
        int a2 = m.a((int) (displayMetrics.heightPixels * d.g));
        int a3 = m.a(i2);
        if (c == null || !z) {
            c = Bitmap.createBitmap(a3, a2, Bitmap.Config.ARGB_8888);
        }
        if (c.getHeight() != a2) {
            c = Bitmap.createBitmap(a3, a2, Bitmap.Config.ARGB_8888);
        }
        Iterator it = d.o.iterator();
        while (it.hasNext()) {
            Activity activity2 = (Activity) it.next();
            if (d.i) {
                new Canvas(c).drawColor(Color.rgb(78, 78, 78));
            } else {
                new StringBuilder("oscissue ScreenshotTaker.takeScreenshot called activity is >> ").append(activity2.getClass().getSimpleName());
                final Bitmap bitmap = c;
                if (activity2 == null) {
                    throw new IllegalArgumentException("Parameter activity cannot be null.");
                }
                try {
                    final List a4 = e.a(activity2);
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        e.a(a4, bitmap);
                    } else {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        activity2.runOnUiThread(new Runnable() { // from class: com.uxcam.video.screen.e.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    e.a(a4, bitmap);
                                } catch (Exception unused) {
                                } catch (Throwable th) {
                                    countDownLatch.countDown();
                                    throw th;
                                }
                                countDownLatch.countDown();
                            }
                        });
                        countDownLatch.await();
                    }
                } catch (Exception e2) {
                    new StringBuilder("Unable to take screenshot to file  of activity ").append(activity2.getClass().getName());
                    l.a("ScreenshotTaker", e2);
                }
                a(activity, new Canvas(c));
            }
        }
        new StringBuilder("vvtest First orientation is ").append(d.c);
        if (a2 > a3) {
            return c;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f);
        return Bitmap.createBitmap(c, 0, 0, c.getWidth(), c.getHeight(), matrix, true);
    }

    @TargetApi(11)
    private static void a(Activity activity, Canvas canvas) {
        if (com.uxcam.b.d && a()) {
            View view = null;
            if (d.l.get() != null) {
                view = ((MapFragment) d.l.get()).getView();
            } else if (d.m.get() != null) {
                view = ((SupportMapFragment) d.m.get()).getView();
            } else if (d.j.get() != null) {
                view = (View) d.j.get();
            }
            if (i != null) {
                view.getLocationOnScreen(new int[2]);
                canvas.drawBitmap(i, r0[0], r0[1], new Paint());
            }
        }
        if (!d.n.isEmpty()) {
            Iterator it = d.n.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() != null && ((View) weakReference.get()).getVisibility() == 0) {
                    new StringBuilder("oscissue drawOverlayInViewBlack called for view id :").append(((View) weakReference.get()).getId());
                    new c();
                    View view2 = (View) weakReference.get();
                    try {
                        int[] iArr = new int[2];
                        view2.getLocationOnScreen(iArr);
                        Paint paint = new Paint();
                        paint.setColor(-16777216);
                        paint.setStrokeWidth(3.0f);
                        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content).getRootView();
                        if (viewGroup.findViewById(view2.getId()) != null && (iArr[0] != 0 || iArr[1] != 0)) {
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            new StringBuilder("Location is ").append(iArr2[1]);
                            iArr[1] = iArr[1] - iArr2[1];
                            canvas.drawRect((iArr[0] + view2.getWidth()) * d.g, (iArr[1] + view2.getHeight()) * d.g, iArr[0] * d.g, iArr[1] * d.g, paint);
                        }
                    } catch (Exception e2) {
                        canvas.drawColor(-7829368);
                        l.a("drawOverlayInViewBlack", e2);
                    }
                }
            }
        }
        if (com.uxcam.c.d.y) {
            return;
        }
        new c();
        a(canvas);
    }

    private static void a(Canvas canvas) {
        Paint paint = new Paint();
        Iterator it = com.uxcam.i.a.a().a.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((com.uxcam.c.e) it.next()).c.iterator();
            while (it2.hasNext()) {
                com.uxcam.c.b bVar = (com.uxcam.c.b) it2.next();
                if (!bVar.g) {
                    paint.setAntiAlias(true);
                    paint.setColor(-65536);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAlpha(120);
                    canvas.drawCircle(bVar.c, bVar.d, 30.0f, paint);
                    new StringBuilder("plotting test ").append(bVar.c).append(" , ").append(bVar.d);
                    bVar.g = true;
                }
            }
        }
    }
}
