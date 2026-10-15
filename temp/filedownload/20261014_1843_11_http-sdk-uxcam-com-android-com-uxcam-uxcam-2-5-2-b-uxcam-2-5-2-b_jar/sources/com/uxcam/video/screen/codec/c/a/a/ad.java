package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ad.class */
public class ad extends s {
    public int c;
    private long e;
    private float f;
    private float g;
    private long h;
    private long i;
    private int[] j;
    private int k;

    public static String a() {
        return "mvhd";
    }

    public ad(int i, long j, long j2, long j3, int[] iArr, int i2) {
        super(new w("mvhd"));
        this.c = i;
        this.e = j;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = j2;
        this.i = j3;
        this.j = iArr;
        this.k = i2;
    }

    public ad() {
        super(new w("mvhd"));
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(com.uxcam.video.screen.codec.c.a.d.a(this.h));
        byteBuffer.putInt(com.uxcam.video.screen.codec.c.a.d.a(this.i));
        byteBuffer.putInt(this.c);
        byteBuffer.putInt((int) this.e);
        byteBuffer.putInt((int) (this.f * 65536.0d));
        byteBuffer.putShort((short) (this.g * 256.0d));
        byteBuffer.put(new byte[10]);
        for (int i = 0; i < Math.min(9, this.j.length); i++) {
            byteBuffer.putInt(this.j[i]);
        }
        for (int min = Math.min(9, this.j.length); min < 9; min++) {
            byteBuffer.putInt(0);
        }
        byteBuffer.put(new byte[24]);
        byteBuffer.putInt(this.k);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        super.a(sb);
        sb.append(": ");
        com.uxcam.video.screen.codec.b.c.b.a(this, sb, "timescale", "duration", "rate", "volume", "created", "modified", "nextTrackId");
    }
}
