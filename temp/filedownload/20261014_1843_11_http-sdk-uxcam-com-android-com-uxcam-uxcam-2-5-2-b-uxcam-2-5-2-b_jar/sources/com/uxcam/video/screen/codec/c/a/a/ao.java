package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ao.class */
public class ao extends s {
    private int[] c;

    public static String b() {
        return "stss";
    }

    public ao() {
        super(new w("stss"));
    }

    public ao(int[] iArr) {
        this();
        this.c = iArr;
    }

    public ao(w wVar) {
        super(wVar);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.c.length);
        for (int i = 0; i < this.c.length; i++) {
            byteBuffer.putInt(this.c[i]);
        }
    }
}
