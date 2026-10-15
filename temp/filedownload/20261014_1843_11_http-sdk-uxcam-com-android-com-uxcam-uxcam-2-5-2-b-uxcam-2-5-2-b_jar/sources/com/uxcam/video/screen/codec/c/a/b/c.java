package com.uxcam.video.screen.codec.c.a.b;

import com.uxcam.video.screen.codec.b.i;
import com.uxcam.video.screen.codec.c.a.a.ac;
import com.uxcam.video.screen.codec.c.a.a.ad;
import com.uxcam.video.screen.codec.c.a.a.r;
import com.uxcam.video.screen.codec.c.a.a.w;
import com.uxcam.video.screen.codec.c.a.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/b/c.class */
public final class c {
    protected long a;
    protected i b;
    private List c;
    private int d;

    public c(i iVar, com.uxcam.video.screen.codec.c.a.a aVar) {
        this(iVar, aVar.c);
    }

    private c(i iVar, r rVar) {
        this.c = new ArrayList();
        this.d = 1;
        this.b = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        rVar.b(allocate);
        new w("wide", 8L).a(allocate);
        new w("mdat", 1L).a(allocate);
        this.a = allocate.position();
        allocate.putLong(0L);
        allocate.flip();
        iVar.write(allocate);
    }

    public final b a(e eVar) {
        i iVar = this.b;
        int i = this.d;
        this.d = i + 1;
        b bVar = new b(iVar, i, eVar);
        this.c.add(bVar);
        return bVar;
    }

    public final void a(ac acVar) {
        long a = (this.b.a() - this.a) + 8;
        com.uxcam.video.screen.codec.c.a.c.a(this.b, acVar);
        this.b.a(this.a);
        this.b.write((ByteBuffer) ByteBuffer.allocate(8).putLong(a).flip());
    }

    public final ac a() {
        a aVar;
        ac acVar = new ac();
        int b = ((a) this.c.get(0)).b();
        long a = ((a) this.c.get(0)).a();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            a aVar2 = (a) it.next();
            if (aVar2.c()) {
                aVar = aVar2;
                break;
            }
        }
        a aVar3 = aVar;
        if (aVar != null) {
            b = aVar3.b();
            a = aVar3.a();
        }
        ad adVar = new ad(b, a, new Date().getTime(), new Date().getTime(), new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824}, this.d);
        acVar.a(adVar);
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            com.uxcam.video.screen.codec.c.a.a.c a2 = ((a) it2.next()).a(adVar);
            if (a2 != null) {
                acVar.a(a2);
            }
        }
        return acVar;
    }
}
