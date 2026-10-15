package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/k.class */
public class k extends s {
    private a[] c;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/k$a.class */
    public static class a {
        public int a;
        public int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public k() {
        super(new w("ctts"));
    }

    public k(a[] aVarArr) {
        super(new w("ctts"));
        this.c = aVarArr;
    }

    public static String a() {
        return "ctts";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.c.length);
        for (int i = 0; i < this.c.length; i++) {
            byteBuffer.putInt(this.c[i].a);
            byteBuffer.putInt(this.c[i].b);
        }
    }
}
