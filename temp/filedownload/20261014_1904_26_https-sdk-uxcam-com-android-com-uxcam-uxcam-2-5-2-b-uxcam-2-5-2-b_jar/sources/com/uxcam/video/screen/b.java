package com.uxcam.video.screen;

import android.os.Looper;
import com.uxcam.j.l;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/b.class */
public final class b extends ArrayList {
    private static final ExecutorService a = Executors.newSingleThreadExecutor();
    private static String b = "MyArrayList";

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(final com.uxcam.c.c cVar) {
        Runnable runnable = new Runnable() { // from class: com.uxcam.video.screen.b.1
            @Override // java.lang.Runnable
            public final void run() {
                d.a();
                a aVar = new a(d.h());
                com.uxcam.c.c cVar2 = cVar;
                if (a.a) {
                    try {
                        aVar.c = cVar2.a;
                        aVar.d = cVar2.b;
                        aVar.e = cVar2.c;
                        new StringBuilder("position value: ").append(aVar.d);
                        for (int i = 0; i < aVar.e; i++) {
                            if (i == aVar.e - 1) {
                                aVar.b();
                                d.a.remove(cVar2);
                                if (aVar.c != null) {
                                    aVar.c.recycle();
                                }
                            } else {
                                aVar.b();
                            }
                        }
                        d.a(aVar.b);
                    } catch (Exception e) {
                        l.a("EncodeVideoTask->doInBackground", e);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a.submit(runnable);
        } else {
            runnable.run();
        }
        return super.add(cVar);
    }
}
