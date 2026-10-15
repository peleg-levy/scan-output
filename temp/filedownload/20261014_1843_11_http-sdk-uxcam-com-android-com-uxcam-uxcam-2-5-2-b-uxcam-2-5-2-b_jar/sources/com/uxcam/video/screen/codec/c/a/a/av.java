package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/av.class */
public class av extends s {
    int c;
    int e;
    int f;
    int g;

    public av() {
        super(new w("vmhd"));
    }

    public av(byte b) {
        super(new w("vmhd"));
        this.c = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public static String a() {
        return "vmhd";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putShort((short) this.c);
        byteBuffer.putShort((short) this.e);
        byteBuffer.putShort((short) this.f);
        byteBuffer.putShort((short) this.g);
    }
}
