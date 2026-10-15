package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/au.class */
public class au extends s {
    private String c;

    public static String a() {
        return "url ";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        Charset forName = Charset.forName("utf-8");
        if (this.c != null) {
            com.uxcam.video.screen.codec.b.h.a(byteBuffer, ByteBuffer.wrap(this.c.getBytes(forName)));
            byteBuffer.put((byte) 0);
        }
    }
}
