package com.uxcam.video.screen.codec.c.a.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/a.class */
public class a extends s {
    private static Set c;
    private String e;
    private short f;
    private short g;
    private short h;
    private String i;
    private int j;
    private short k;
    private short l;
    private int m;
    private String n;
    private int o;
    private int p;
    private String q;
    private String r;
    private short s;
    private short t;
    private int u;
    private short v;
    private List w;

    /* renamed from: com.uxcam.video.screen.codec.c.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/a$a.class */
    public static class C0008a {
        short a;
        int b;
        byte[] c;

        public final String toString() {
            try {
                return new String(this.c, 0, this.b, a.c.contains(Short.valueOf(this.a)) ? "UTF-16" : "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
    }

    public a() {
        super(new w("alis", 0L));
    }

    public static String a() {
        return "alis";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        if ((this.b & 1) != 0) {
            return;
        }
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.e), 0, 4);
        byteBuffer.putShort(this.f);
        byteBuffer.putShort(this.g);
        byteBuffer.putShort(this.h);
        com.uxcam.video.screen.codec.b.h.a(byteBuffer, this.i, 27);
        byteBuffer.putInt(this.j);
        byteBuffer.putShort(this.k);
        byteBuffer.putShort(this.l);
        byteBuffer.putInt(this.m);
        com.uxcam.video.screen.codec.b.h.a(byteBuffer, this.n, 63);
        byteBuffer.putInt(this.o);
        byteBuffer.putInt(this.p);
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.q), 0, 4);
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.r), 0, 4);
        byteBuffer.putShort(this.s);
        byteBuffer.putShort(this.t);
        byteBuffer.putInt(this.u);
        byteBuffer.putShort(this.v);
        byteBuffer.put(new byte[10]);
        for (C0008a c0008a : this.w) {
            byteBuffer.putShort(c0008a.a);
            byteBuffer.putShort((short) c0008a.b);
            byteBuffer.put(c0008a.c);
        }
        byteBuffer.putShort((short) -1);
        byteBuffer.putShort((short) 0);
    }

    private C0008a c() {
        for (C0008a c0008a : this.w) {
            if (c0008a.a == 18) {
                return c0008a;
            }
        }
        return null;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        super.a(sb);
        sb.append(": ");
        if ((this.b & 1) != 0) {
            sb.append("'self'");
            return;
        }
        StringBuilder sb2 = new StringBuilder("'");
        C0008a c2 = c();
        sb.append(sb2.append(c2 == null ? null : "/" + c2.toString()).append("'").toString());
    }

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(14);
        c.add(15);
    }
}
