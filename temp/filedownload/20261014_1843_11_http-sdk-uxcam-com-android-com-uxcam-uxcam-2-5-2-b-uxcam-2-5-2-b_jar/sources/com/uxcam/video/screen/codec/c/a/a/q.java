package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/q.class */
public class q extends c {
    private int a;
    private int b;

    public q() {
        super(new w("fiel"));
    }

    public static String a() {
        return "fiel";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) this.a);
        byteBuffer.put((byte) this.b);
    }
}
