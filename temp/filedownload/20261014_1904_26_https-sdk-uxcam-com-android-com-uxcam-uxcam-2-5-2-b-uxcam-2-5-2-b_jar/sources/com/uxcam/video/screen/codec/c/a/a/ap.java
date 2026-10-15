package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ap.class */
public class ap extends s {
    private a[] c;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ap$a.class */
    public static class a {
        int a;
        int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public ap(a[] aVarArr) {
        super(new w("stts"));
        this.c = aVarArr;
    }

    public ap() {
        super(new w("stts"));
    }

    public static String a() {
        return "stts";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.c.length);
        for (a aVar : this.c) {
            byteBuffer.putInt(aVar.a);
            byteBuffer.putInt(aVar.b);
        }
    }
}
