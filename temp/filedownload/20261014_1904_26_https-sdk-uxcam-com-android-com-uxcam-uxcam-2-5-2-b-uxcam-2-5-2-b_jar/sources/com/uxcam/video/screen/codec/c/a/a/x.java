package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/x.class */
public class x extends c {
    private ByteBuffer a;

    public x(w wVar, ByteBuffer byteBuffer) {
        super(wVar);
        this.a = byteBuffer;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        com.uxcam.video.screen.codec.b.h.a(byteBuffer, this.a);
    }
}
