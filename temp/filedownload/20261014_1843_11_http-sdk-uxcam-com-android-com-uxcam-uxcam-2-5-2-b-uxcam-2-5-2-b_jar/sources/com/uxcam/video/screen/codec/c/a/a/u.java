package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/u.class */
public class u extends s {
    private short c;
    private short e;
    private short f;
    private short g;
    private short h;

    public static String a() {
        return "gmin";
    }

    private u(w wVar) {
        super(wVar);
    }

    public u() {
        this(new w("gmin"));
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.e);
        byteBuffer.putShort(this.f);
        byteBuffer.putShort(this.g);
        byteBuffer.putShort(this.h);
        byteBuffer.putShort((short) 0);
    }
}
