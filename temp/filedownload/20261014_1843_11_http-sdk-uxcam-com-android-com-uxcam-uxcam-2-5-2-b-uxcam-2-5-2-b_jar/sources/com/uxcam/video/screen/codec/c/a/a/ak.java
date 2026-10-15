package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/ak.class */
public class ak extends af {
    private short a;

    public ak(w wVar) {
        super(wVar);
    }

    public ak(w wVar, byte b) {
        super(wVar);
        this.a = (short) 1;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[]{0, 0, 0, 0, 0, 0});
        byteBuffer.putShort(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
    }
}
