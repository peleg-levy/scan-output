package com.uxcam.video.screen.codec.c.a.b;

import com.uxcam.video.screen.codec.b.b.e;
import com.uxcam.video.screen.codec.b.b.h;
import com.uxcam.video.screen.codec.c.a.a.ad;
import com.uxcam.video.screen.codec.c.a.a.ar;
import com.uxcam.video.screen.codec.c.a.a.n;
import com.uxcam.video.screen.codec.d.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/b/d.class */
public final class d extends b {
    private h p;
    private h q;
    private int r;
    private long s;
    private long t;
    private int u;
    private List v;
    List o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.video.screen.codec.c.a.b.d.e():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    @Override // com.uxcam.video.screen.codec.c.a.b.b, com.uxcam.video.screen.codec.c.a.b.a
    public final com.uxcam.video.screen.codec.c.a.a.c a(ad adVar) {
        e();
        f();
        if (this.l.size() == 0) {
            return null;
        }
        if (this.m != null) {
            e eVar = new e(1, 1);
            List list = this.v;
            List<n> list2 = this.m;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            for (n nVar : list2) {
                long j = (eVar.a * nVar.b) / eVar.b;
                a.C0009a a = com.uxcam.video.screen.codec.d.a.a((List) com.uxcam.video.screen.codec.d.a.a(arrayList2, eVar.a(), j).b, eVar.a(), j + nVar.a);
                arrayList.addAll((Collection) a.a);
                arrayList2 = (List) a.b;
            }
            this.m = arrayList;
        } else {
            this.m = this.v;
        }
        return super.a(adVar);
    }

    private void f() {
        if (this.s > 0) {
            if (this.q == null) {
                this.v.add(new n(this.s, -1L));
                return;
            }
            if (this.r == -1) {
                this.r = this.p.d + 1;
            }
            this.l.add(new ar(this.q.e ? 1 : 0, this.c, (int) (this.s / this.u), this.r));
            ByteBuffer allocate = ByteBuffer.allocate(4);
            h hVar = this.q;
            int a = (a(hVar) * this.r) + hVar.d;
            if (hVar.e) {
                a = (int) (a - ((18 * (a / 18000)) + (2 * (((a % 18000) - 2) / 1800))));
            }
            allocate.putInt(a);
            allocate.flip();
            a(new com.uxcam.video.screen.codec.c.a.b(allocate, this.t, this.c, this.s, 0L, this.t, this.l.size() - 1));
            this.v.add(new n(this.s, this.t));
        }
    }

    private static int a(h hVar) {
        return (hVar.a * 3600) + (hVar.b * 60) + hVar.c;
    }
}
