package com.uxcam.video.screen.codec.c.a.b;

import com.uxcam.video.screen.codec.b.g;
import com.uxcam.video.screen.codec.b.i;
import com.uxcam.video.screen.codec.c.a.a.aa;
import com.uxcam.video.screen.codec.c.a.a.ab;
import com.uxcam.video.screen.codec.c.a.a.ad;
import com.uxcam.video.screen.codec.c.a.a.ae;
import com.uxcam.video.screen.codec.c.a.a.af;
import com.uxcam.video.screen.codec.c.a.a.aj;
import com.uxcam.video.screen.codec.c.a.a.ak;
import com.uxcam.video.screen.codec.c.a.a.al;
import com.uxcam.video.screen.codec.c.a.a.am;
import com.uxcam.video.screen.codec.c.a.a.an;
import com.uxcam.video.screen.codec.c.a.a.ao;
import com.uxcam.video.screen.codec.c.a.a.ap;
import com.uxcam.video.screen.codec.c.a.a.aq;
import com.uxcam.video.screen.codec.c.a.a.as;
import com.uxcam.video.screen.codec.c.a.a.at;
import com.uxcam.video.screen.codec.c.a.a.av;
import com.uxcam.video.screen.codec.c.a.a.k;
import com.uxcam.video.screen.codec.c.a.a.l;
import com.uxcam.video.screen.codec.c.a.a.m;
import com.uxcam.video.screen.codec.c.a.a.n;
import com.uxcam.video.screen.codec.c.a.a.u;
import com.uxcam.video.screen.codec.c.a.a.v;
import com.uxcam.video.screen.codec.c.a.a.w;
import com.uxcam.video.screen.codec.c.a.a.x;
import com.uxcam.video.screen.codec.c.a.a.z;
import com.uxcam.video.screen.codec.c.a.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/b/b.class */
public class b extends a {
    private List o;
    private long p;
    private long q;
    private g r;
    private com.uxcam.video.screen.codec.b.d s;
    private com.uxcam.video.screen.codec.b.d t;
    private List u;
    private int v;
    private int w;
    private long x;
    private int y;
    private long z;
    private int A;
    private boolean B;
    private d C;
    private i D;

    public b(i iVar, int i, e eVar) {
        super(i, eVar);
        this.o = new ArrayList();
        this.p = 0L;
        this.q = -1L;
        this.r = new g();
        this.s = new com.uxcam.video.screen.codec.b.d();
        this.t = new com.uxcam.video.screen.codec.b.d();
        this.u = new ArrayList();
        this.v = 0;
        this.w = 0;
        this.x = 0L;
        this.y = -1;
        this.B = true;
        this.D = iVar;
        a(new com.uxcam.video.screen.codec.b.b.e(1, 1), com.uxcam.video.screen.codec.b.b.i.a);
    }

    public final void a(com.uxcam.video.screen.codec.c.a.b bVar) {
        if (this.k) {
            throw new IllegalStateException("The muxer track has finished muxing");
        }
        int i = bVar.g + 1;
        int i2 = (int) (bVar.b - this.x);
        if (i2 != this.v) {
            if (this.w > 0) {
                this.u.add(new k.a(this.w, this.v));
            }
            this.v = i2;
            this.w = 0;
        }
        this.w++;
        this.x += bVar.c;
        if (this.y != -1 && this.y != i) {
            a(this.y);
            this.i = -1;
        }
        this.g.add(bVar.a);
        if (bVar.d) {
            this.t.a(this.A + 1);
        } else {
            this.B = false;
        }
        this.A++;
        this.f += bVar.c;
        if (this.q != -1 && bVar.c != this.q) {
            this.o.add(new ap.a((int) this.p, (int) this.q));
            this.p = 0L;
        }
        this.q = bVar.c;
        this.p++;
        this.z += bVar.c;
        if (!(this.e == com.uxcam.video.screen.codec.b.b.i.a || this.e == com.uxcam.video.screen.codec.b.b.i.b)) {
            throw new AssertionError();
        }
        if (this.e == com.uxcam.video.screen.codec.b.b.i.a && this.g.size() * this.d.b == this.d.a) {
            a(i);
        } else if (this.e == com.uxcam.video.screen.codec.b.b.i.b && this.f > 0 && this.f * this.d.b >= this.d.a * this.c) {
            a(i);
        }
        if (this.C != null) {
            d dVar = this.C;
            if (bVar.d) {
                dVar.e();
            }
            dVar.o.add(new com.uxcam.video.screen.codec.b.b.c(bVar));
        }
        this.y = i;
    }

    private void a(int i) {
        if (this.g.size() == 0) {
            return;
        }
        g gVar = this.r;
        long a = this.D.a();
        if (gVar.b >= gVar.a.length) {
            long[] jArr = new long[gVar.a.length + gVar.c];
            System.arraycopy(gVar.a, 0, jArr, 0, gVar.a.length);
            gVar.a = jArr;
        }
        long[] jArr2 = gVar.a;
        int i2 = gVar.b;
        gVar.b = i2 + 1;
        jArr2[i2] = a;
        for (ByteBuffer byteBuffer : this.g) {
            this.s.a(byteBuffer.remaining());
            this.D.write(byteBuffer);
        }
        if (this.i == -1 || this.i != this.g.size()) {
            this.h.add(new am.a(this.j + 1, this.g.size(), i));
        }
        this.i = this.g.size();
        this.j++;
        this.f = 0L;
        this.g.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uxcam.video.screen.codec.c.a.b.a
    public com.uxcam.video.screen.codec.c.a.a.c a(ad adVar) {
        if (this.k) {
            throw new IllegalStateException("The muxer track has finished muxing");
        }
        a(this.y);
        if (this.p > 0) {
            this.o.add(new ap.a((int) this.p, (int) this.q));
        }
        this.k = true;
        at atVar = new at();
        com.uxcam.video.screen.codec.b.b.g d = d();
        as asVar = new as(this.a, (adVar.c * this.z) / this.c, d.a, d.b, new Date().getTime(), new Date().getTime(), new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824});
        asVar.a(15);
        atVar.a(asVar);
        a(atVar);
        z zVar = new z();
        atVar.a(zVar);
        zVar.a(new aa(this.c, this.z, new Date().getTime(), new Date().getTime()));
        zVar.a(new v("mhlr", this.b.e, "appl"));
        ab abVar = new ab();
        zVar.a(abVar);
        e eVar = this.b;
        switch (eVar) {
            case VIDEO:
                av avVar = new av((byte) 0);
                avVar.a(1);
                abVar.a(avVar);
                break;
            case SOUND:
                an anVar = new an();
                anVar.a(1);
                abVar.a(anVar);
                break;
            case TIMECODE:
                af afVar = new af(new w("gmhd"));
                afVar.a(new u());
                af afVar2 = new af(new w("tmcd"));
                afVar.a(afVar2);
                afVar2.a(new aq(new short[]{0, 0, 0}, new short[]{255, 255, 255}, "Lucida Grande"));
                abVar.a(afVar);
                break;
            default:
                throw new IllegalStateException("Handler " + eVar.e + " not supported");
        }
        abVar.a(new v("dhlr", "url ", "appl"));
        l lVar = new l();
        abVar.a(lVar);
        m mVar = new m();
        lVar.a(mVar);
        mVar.a(new x(new w("alis", 0L), ByteBuffer.wrap(new byte[]{0, 0, 0, 1})));
        af afVar3 = new af(new w("stbl"));
        abVar.a(afVar3);
        a(afVar3);
        b(atVar);
        if (this.n != null) {
            af afVar4 = new af(new w("udta"));
            afVar4.a(new ae(this.n));
            atVar.a(afVar4);
        }
        afVar3.a(new aj((ak[]) this.l.toArray(new ak[0])));
        afVar3.a(new am((am.a[]) this.h.toArray(new am.a[0])));
        afVar3.a(new al(this.s.a()));
        afVar3.a(new ap((ap.a[]) this.o.toArray(new ap.a[0])));
        g gVar = this.r;
        long[] jArr = new long[gVar.b];
        System.arraycopy(gVar.a, 0, jArr, 0, gVar.b);
        afVar3.a(new com.uxcam.video.screen.codec.c.a.a.e(jArr));
        if (!this.B && this.t.b > 0) {
            afVar3.a(new ao(this.t.a()));
        }
        return atVar;
    }

    private void a(af afVar) {
        if (this.u.size() > 0) {
            this.u.add(new k.a(this.w, this.v));
            int i = Integer.MAX_VALUE;
            for (k.a aVar : this.u) {
                if (aVar.b < i) {
                    i = aVar.b;
                }
            }
            int i2 = i;
            if (i2 > 0) {
                Iterator it = this.u.iterator();
                while (it.hasNext()) {
                    ((k.a) it.next()).b -= i2;
                }
            }
            if (((k.a) this.u.get(0)).b > 0) {
                if (this.m == null) {
                    this.m = new ArrayList();
                    this.m.add(new n(this.z, r0.b));
                } else {
                    Iterator it2 = this.m.iterator();
                    while (it2.hasNext()) {
                        ((n) it2.next()).b += r0.b;
                    }
                }
            }
            afVar.a(new k((k.a[]) this.u.toArray(new k.a[0])));
        }
    }

    @Override // com.uxcam.video.screen.codec.c.a.b.a
    public final long a() {
        return this.z;
    }
}
