package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/as.class */
public class as extends s {
    private int c;
    private long e;
    private float f;
    private float g;
    private long h;
    private long i;
    private float j;
    private short k;
    private long l;
    private int[] m;

    public static String a() {
        return "tkhd";
    }

    public as(int i, long j, float f, float f2, long j2, long j3, int[] iArr) {
        super(new w("tkhd"));
        this.c = i;
        this.e = j;
        this.f = f;
        this.g = f2;
        this.h = j2;
        this.i = j3;
        this.j = 1.0f;
        this.k = (short) 0;
        this.l = 0L;
        this.m = iArr;
    }

    public as() {
        super(new w("tkhd"));
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(com.uxcam.video.screen.codec.c.a.d.a(this.h));
        byteBuffer.putInt(com.uxcam.video.screen.codec.c.a.d.a(this.i));
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(0);
        byteBuffer.putInt((int) this.e);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putShort(this.k);
        byteBuffer.putShort((short) this.l);
        byteBuffer.putShort((short) (this.j * 256.0d));
        byteBuffer.putShort((short) 0);
        for (int i = 0; i < 9; i++) {
            byteBuffer.putInt(this.m[i]);
        }
        byteBuffer.putInt((int) (this.f * 65536.0f));
        byteBuffer.putInt((int) (this.g * 65536.0f));
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        super.a(sb);
        sb.append(": ");
        com.uxcam.video.screen.codec.b.c.b.a(this, sb, "trackId", "duration", "width", "height", "created", "modified", "volume", "layer", "altGroup");
    }
}
