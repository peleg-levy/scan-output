package com.uxcam.c;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/c/b.class */
public final class b {
    public int a;
    public float b;
    public float c;
    public float d;
    public int e;
    public Boolean f;
    public boolean g;
    public ArrayList h;

    public b() {
        this.f = true;
        this.g = false;
        this.h = new ArrayList();
    }

    public b(int i, float f) {
        this.f = true;
        this.g = false;
        this.h = new ArrayList();
        this.a = i;
        this.b = f;
    }

    private b(int i, float f, float f2, float f3, int i2, Boolean bool, boolean z) {
        this.f = true;
        this.g = false;
        this.h = new ArrayList();
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i2;
        this.f = bool;
        this.g = z;
    }

    public final b a() {
        return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a = 2;
        }
        if (this.h.isEmpty()) {
            return;
        }
        ((b) this.h.get(0)).a = 1;
        ((b) this.h.get(this.h.size() - 1)).a = 3;
    }
}
