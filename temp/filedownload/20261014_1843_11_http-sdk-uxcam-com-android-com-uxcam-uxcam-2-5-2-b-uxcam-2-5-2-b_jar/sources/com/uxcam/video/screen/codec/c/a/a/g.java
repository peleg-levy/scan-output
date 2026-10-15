package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/g.class */
public class g extends c {
    private int a;
    private int b;
    private int c;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public g() {
        super(new w("clap"));
    }

    public static String a() {
        return "clap";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.i);
        byteBuffer.putInt(this.h);
        byteBuffer.putInt(this.g);
        byteBuffer.putInt(this.f);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.a);
    }
}
