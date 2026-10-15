package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ar.class */
public class ar extends ak {
    private static final a a = new a();
    private int b;
    private int c;
    private int g;
    private byte h;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ar$a.class */
    public static class a extends d {
        private Map a = new HashMap();
    }

    public ar() {
        super(new w("tmcd"));
        this.f = a;
    }

    public ar(int i, int i2, int i3, int i4) {
        super(new w("tmcd"));
        this.b = i;
        this.c = i2;
        this.g = i3;
        this.h = (byte) i4;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.ak, com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.g);
        byteBuffer.put(this.h);
        byteBuffer.put((byte) -49);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        sb.append(this.d.a + ": {\n");
        sb.append("entry: ");
        com.uxcam.video.screen.codec.b.c.b.a(this, sb, "flags", "timescale", "frameDuration", "numFrames");
        sb.append(",\nexts: [\n");
        b(sb);
        sb.append("\n]\n");
        sb.append("}\n");
    }
}
