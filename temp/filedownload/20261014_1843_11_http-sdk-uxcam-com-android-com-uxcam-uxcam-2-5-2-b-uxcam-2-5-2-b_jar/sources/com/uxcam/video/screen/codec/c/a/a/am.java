package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/am.class */
public class am extends s {
    private a[] c;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/am$a.class */
    public static class a {
        long a;
        int b;
        int c;

        public a(long j, int i, int i2) {
            this.a = j;
            this.b = i;
            this.c = i2;
        }
    }

    public am(a[] aVarArr) {
        super(new w("stsc"));
        this.c = aVarArr;
    }

    public am() {
        super(new w("stsc"));
    }

    public static String a() {
        return "stsc";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.c.length);
        for (a aVar : this.c) {
            byteBuffer.putInt((int) aVar.a);
            byteBuffer.putInt(aVar.b);
            byteBuffer.putInt(aVar.c);
        }
    }
}
