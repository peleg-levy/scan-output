package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/i.class */
public class i extends c {
    private short a;
    private short b;
    private short c;
    private short e;
    private short f;

    public i() {
        super(new w("crgn"));
    }

    public static String a() {
        return "crgn";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        byteBuffer.putShort(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.e);
        byteBuffer.putShort(this.f);
    }
}
