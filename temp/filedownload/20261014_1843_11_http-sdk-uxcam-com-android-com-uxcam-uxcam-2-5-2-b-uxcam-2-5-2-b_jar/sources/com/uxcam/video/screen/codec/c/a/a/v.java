package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/v.class */
public class v extends s {
    private String c;
    private String e;
    private String f;
    private int g;
    private int h;
    private String i;

    public v(String str, String str2, String str3) {
        super(new w("hdlr"));
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.g = 0;
        this.h = 0;
        this.i = "";
    }

    public v() {
        super(new w("hdlr"));
    }

    public static String a() {
        return "hdlr";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.c));
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.e));
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.f));
        byteBuffer.putInt(this.g);
        byteBuffer.putInt(this.h);
        if (this.i != null) {
            byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.i));
        }
    }
}
