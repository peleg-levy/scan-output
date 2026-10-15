package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/aw.class */
public class aw extends ak {
    private static final a c = new a();
    private short g;
    private short h;
    private String i;
    private int j;
    private int k;
    public short a;
    public short b;
    private float l;
    private float m;
    private short n;
    private String o;
    private short p;
    private short q;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/aw$a.class */
    public static class a extends d {
        private Map a = new HashMap();

        public a() {
            this.a.put(ah.a(), ah.class);
            this.a.put(j.a(), j.class);
            this.a.put(t.a(), t.class);
            this.a.put(g.a(), g.class);
            this.a.put(q.a(), q.class);
        }
    }

    public aw(w wVar, String str, short s, short s2, String str2) {
        super(wVar, (byte) 0);
        this.f = c;
        this.g = (short) 0;
        this.h = (short) 0;
        this.i = str;
        this.j = 0;
        this.k = 768;
        this.a = s;
        this.b = s2;
        this.l = 72.0f;
        this.m = 72.0f;
        this.n = (short) 1;
        this.o = str2;
        this.p = (short) 24;
        this.q = (short) -1;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.ak, com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putShort(this.g);
        byteBuffer.putShort(this.h);
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.i), 0, 4);
        byteBuffer.putInt(this.j);
        byteBuffer.putInt(this.k);
        byteBuffer.putShort(this.a);
        byteBuffer.putShort(this.b);
        byteBuffer.putInt((int) (this.l * 65536.0f));
        byteBuffer.putInt((int) (this.m * 65536.0f));
        byteBuffer.putInt(0);
        byteBuffer.putShort(this.n);
        com.uxcam.video.screen.codec.b.h.a(byteBuffer, this.o, 31);
        byteBuffer.putShort(this.p);
        byteBuffer.putShort(this.q);
        c(byteBuffer);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        sb.append(this.d.a + ": {\n");
        sb.append("entry: ");
        com.uxcam.video.screen.codec.b.c.b.a(this, sb, "version", "revision", "vendor", "temporalQual", "spacialQual", "width", "height", "hRes", "vRes", "frameCount", "compressorName", "depth", "clrTbl");
        sb.append(",\nexts: [\n");
        b(sb);
        sb.append("\n]\n");
        sb.append("}\n");
    }
}
