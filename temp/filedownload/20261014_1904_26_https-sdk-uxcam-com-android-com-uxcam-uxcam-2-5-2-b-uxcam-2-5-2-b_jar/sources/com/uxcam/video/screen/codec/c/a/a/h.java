package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/h.class */
public class h extends s {
    private float c;
    private float e;

    public static String a() {
        return "clef";
    }

    public h(w wVar) {
        super(wVar);
    }

    public h() {
        super(new w("clef"));
    }

    public h(int i, int i2) {
        this();
        this.c = i;
        this.e = i2;
    }

    public h(w wVar, int i, int i2) {
        super(wVar);
        this.c = i;
        this.e = i2;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt((int) (this.c * 65536.0f));
        byteBuffer.putInt((int) (this.e * 65536.0f));
    }
}
