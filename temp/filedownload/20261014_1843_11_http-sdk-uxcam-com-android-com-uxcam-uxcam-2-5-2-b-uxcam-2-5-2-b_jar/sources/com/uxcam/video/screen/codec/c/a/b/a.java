package com.uxcam.video.screen.codec.c.a.b;

import com.uxcam.video.screen.codec.b.b.g;
import com.uxcam.video.screen.codec.c.a.a.ad;
import com.uxcam.video.screen.codec.c.a.a.af;
import com.uxcam.video.screen.codec.c.a.a.ah;
import com.uxcam.video.screen.codec.c.a.a.ai;
import com.uxcam.video.screen.codec.c.a.a.ak;
import com.uxcam.video.screen.codec.c.a.a.at;
import com.uxcam.video.screen.codec.c.a.a.aw;
import com.uxcam.video.screen.codec.c.a.a.h;
import com.uxcam.video.screen.codec.c.a.a.o;
import com.uxcam.video.screen.codec.c.a.a.p;
import com.uxcam.video.screen.codec.c.a.a.w;
import com.uxcam.video.screen.codec.c.a.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/b/a.class */
public abstract class a {
    protected int a;
    protected e b;
    protected com.uxcam.video.screen.codec.b.b.e d;
    protected int e;
    protected long f;
    protected boolean k;
    protected List m;
    String n;
    protected List g = new ArrayList();
    protected List h = new ArrayList();
    protected int i = -1;
    protected int j = 0;
    protected List l = new ArrayList();
    protected int c = 1;

    public a(int i, e eVar) {
        this.a = i;
        this.b = eVar;
    }

    public final void a(com.uxcam.video.screen.codec.b.b.e eVar, int i) {
        this.d = eVar;
        this.e = i;
    }

    public abstract long a();

    public final int b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract com.uxcam.video.screen.codec.c.a.a.c a(ad adVar);

    public final boolean c() {
        return this.b == e.VIDEO;
    }

    public final g d() {
        int i = 0;
        short s = 0;
        if (this.l.get(0) instanceof aw) {
            aw awVar = (aw) this.l.get(0);
            String[] strArr = {ah.a()};
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (int i2 = 0; i2 <= 0; i2++) {
                linkedList2.add(strArr[0]);
            }
            com.uxcam.video.screen.codec.c.a.a.c.a(awVar, linkedList2, linkedList);
            Object[] array = linkedList.toArray((Object[]) Array.newInstance((Class<?>) ah.class, 0));
            ah ahVar = (ah) (array.length > 0 ? array[0] : null);
            com.uxcam.video.screen.codec.b.b.e eVar = ahVar != null ? new com.uxcam.video.screen.codec.b.b.e(ahVar.a, ahVar.b) : new com.uxcam.video.screen.codec.b.b.e(1, 1);
            i = (eVar.a * awVar.a) / eVar.b;
            s = awVar.b;
        }
        return new g(i, s);
    }

    public final void a(at atVar) {
        g d = d();
        if (this.b == e.VIDEO) {
            af afVar = new af(new w("tapt"));
            afVar.a(new h(d.a, d.b));
            afVar.a(new ai(d.a, d.b));
            afVar.a(new p(d.a, d.b));
            atVar.a(afVar);
        }
    }

    public final void a(ak akVar) {
        if (this.k) {
            throw new IllegalStateException("The muxer track has finished muxing");
        }
        this.l.add(akVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(at atVar) {
        if (this.m != null) {
            af afVar = new af(new w("edts"));
            afVar.a(new o(this.m));
            atVar.a(afVar);
        }
    }
}
