package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/j.class */
public class j extends c {
    private final String a = "nclc";
    private short b;
    private short c;
    private short e;

    public j() {
        super(new w("colr"));
        this.a = "nclc";
    }

    public static String a() {
        return "colr";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a("nclc"));
        byteBuffer.putShort(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.e);
    }
}
