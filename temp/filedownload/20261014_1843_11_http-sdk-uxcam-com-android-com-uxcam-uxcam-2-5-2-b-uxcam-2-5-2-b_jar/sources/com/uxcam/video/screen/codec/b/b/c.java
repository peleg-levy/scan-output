package com.uxcam.video.screen.codec.b.b;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/b/c.class */
public class c {
    public ByteBuffer a;
    public long b;
    private long g;
    public long c;
    private long h;
    public boolean d;
    public h e;
    public int f;

    public c(ByteBuffer byteBuffer, long j, long j2, long j3, long j4, boolean z, h hVar) {
        this(byteBuffer, j, j2, j3, j4, z, hVar, (byte) 0);
    }

    public c(c cVar) {
        this(null, cVar.b, cVar.g, cVar.c, cVar.h, cVar.d, cVar.e);
        this.f = cVar.f;
    }

    private c(ByteBuffer byteBuffer, long j, long j2, long j3, long j4, boolean z, h hVar, byte b) {
        this.a = byteBuffer;
        this.b = j;
        this.g = j2;
        this.c = j3;
        this.h = j4;
        this.d = z;
        this.e = hVar;
        this.f = 0;
    }
}
