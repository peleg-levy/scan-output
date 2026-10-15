package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/s.class */
public class s extends c {
    protected byte a;
    protected int b;

    public s(w wVar) {
        super(wVar);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt((this.a << 24) | (this.b & 16777215));
    }

    public final void a(int i) {
        this.b = i;
    }
}
