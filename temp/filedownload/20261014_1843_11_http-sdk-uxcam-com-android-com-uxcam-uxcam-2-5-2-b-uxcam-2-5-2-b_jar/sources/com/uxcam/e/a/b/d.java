package com.uxcam.e.a.b;

import com.uxcam.e.ad;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/b/d.class */
public final class d {
    private final Set a = new LinkedHashSet();

    public final synchronized void a(ad adVar) {
        this.a.add(adVar);
    }

    public final synchronized void b(ad adVar) {
        this.a.remove(adVar);
    }

    public final synchronized boolean c(ad adVar) {
        return this.a.contains(adVar);
    }
}
