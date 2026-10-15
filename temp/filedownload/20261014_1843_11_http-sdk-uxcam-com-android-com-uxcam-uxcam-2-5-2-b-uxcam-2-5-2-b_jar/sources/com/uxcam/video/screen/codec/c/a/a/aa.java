package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/aa.class */
public class aa extends s {
    private long c;
    private long e;
    private int f;
    private long g;
    private int h;
    private int i;

    public static String a() {
        return "mdhd";
    }

    public aa(int i, long j, long j2, long j3) {
        super(new w("mdhd"));
        this.f = i;
        this.g = j;
        this.h = 0;
        this.c = j2;
        this.e = j3;
        this.i = 0;
    }

    public aa() {
        super(new w("mdhd"));
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(com.uxcam.video.screen.codec.c.a.d.a(this.c));
        byteBuffer.putInt(com.uxcam.video.screen.codec.c.a.d.a(this.e));
        byteBuffer.putInt(this.f);
        byteBuffer.putInt((int) this.g);
        byteBuffer.putShort((short) this.h);
        byteBuffer.putShort((short) this.i);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        super.a(sb);
        sb.append(": ");
        com.uxcam.video.screen.codec.b.c.b.a(this, sb, "created", "modified", "timescale", "duration", "language", "quality");
    }
}
