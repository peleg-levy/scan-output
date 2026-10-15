package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/e.class */
public class e extends s {
    private long[] c;

    public e() {
        super(new w("co64", 0L));
    }

    public e(long[] jArr) {
        this();
        this.c = jArr;
    }

    public static String a() {
        return "co64";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.c.length);
        for (long j : this.c) {
            byteBuffer.putLong(j);
        }
    }
}
