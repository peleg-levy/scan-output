package com.uxcam.video.screen.codec.codecs.h264.c;

import com.uxcam.video.screen.codec.b.h;
import com.uxcam.video.screen.codec.c.a.a.c;
import com.uxcam.video.screen.codec.c.a.a.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/c/a.class */
public final class a extends c {
    private int a;
    private int b;
    private int c;
    private List e;
    private List f;

    public a() {
        super(new w("avcC"));
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public a(int i, int i2, List list, List list2) {
        this();
        this.a = i;
        this.b = 0;
        this.c = i2;
        this.e = list;
        this.f = list2;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) this.a);
        byteBuffer.put((byte) this.b);
        byteBuffer.put((byte) this.c);
        byteBuffer.put((byte) -1);
        byteBuffer.put((byte) (this.e.size() | 224));
        for (ByteBuffer byteBuffer2 : this.e) {
            byteBuffer.putShort((short) (byteBuffer2.remaining() + 1));
            byteBuffer.put((byte) 103);
            h.a(byteBuffer, byteBuffer2);
        }
        byteBuffer.put((byte) this.f.size());
        for (ByteBuffer byteBuffer3 : this.f) {
            byteBuffer.putShort((byte) (byteBuffer3.remaining() + 1));
            byteBuffer.put((byte) 104);
            h.a(byteBuffer, byteBuffer3);
        }
    }
}
