package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/al.class */
public class al extends s {
    private int c;
    private int e;
    private int[] f;

    public static String a() {
        return "stsz";
    }

    public al(int[] iArr) {
        this();
        this.f = iArr;
    }

    public al() {
        super(new w("stsz"));
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.c);
        if (this.c != 0) {
            byteBuffer.putInt(this.e);
            return;
        }
        byteBuffer.putInt(this.f.length);
        int length = this.f.length;
        for (int i = 0; i < length; i++) {
            byteBuffer.putInt(r0[i]);
        }
    }
}
