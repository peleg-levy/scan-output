package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/aq.class */
public class aq extends s {
    private short c;
    private short e;
    private short f;
    private short[] g;
    private short[] h;
    private String i;

    public static String a() {
        return "tcmi";
    }

    public aq(short[] sArr, short[] sArr2, String str) {
        this(new w("tcmi"));
        this.c = (short) 0;
        this.e = (short) 0;
        this.f = (short) 12;
        this.g = sArr;
        this.h = sArr2;
        this.i = str;
    }

    private aq(w wVar) {
        super(wVar);
        this.g = new short[3];
        this.h = new short[3];
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.e);
        byteBuffer.putShort(this.f);
        byteBuffer.putShort((short) 0);
        byteBuffer.putShort(this.g[0]);
        byteBuffer.putShort(this.g[1]);
        byteBuffer.putShort(this.g[2]);
        byteBuffer.putShort(this.h[0]);
        byteBuffer.putShort(this.h[1]);
        byteBuffer.putShort(this.h[2]);
        String str = this.i;
        byteBuffer.put((byte) str.length());
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(str));
    }
}
