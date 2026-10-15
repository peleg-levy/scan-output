package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/y.class */
public class y extends c {
    private int a;
    private int b;
    private int c;
    private int e;

    public y() {
        super(new w("load"));
    }

    public static String a() {
        return "load";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.e);
    }
}
