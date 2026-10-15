package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ae.class */
public class ae extends c {
    private String a;

    public static String a() {
        return "name";
    }

    public ae(String str) {
        this();
        this.a = str;
    }

    public ae() {
        super(new w("name"));
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.a));
        byteBuffer.putInt(0);
    }
}
