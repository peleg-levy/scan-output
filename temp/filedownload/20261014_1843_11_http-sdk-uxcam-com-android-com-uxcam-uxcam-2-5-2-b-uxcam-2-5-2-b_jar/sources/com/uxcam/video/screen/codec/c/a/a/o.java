package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/o.class */
public class o extends s {
    private List c;

    public static String a() {
        return "elst";
    }

    private o(w wVar) {
        super(wVar);
    }

    public o() {
        this(new w("elst"));
    }

    public o(List list) {
        this();
        this.c = list;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.s, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.c.size());
        for (n nVar : this.c) {
            byteBuffer.putInt((int) nVar.a);
            byteBuffer.putInt((int) nVar.b);
            byteBuffer.putInt((int) (nVar.c * 65536.0f));
        }
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        super.a(sb);
        sb.append(": ");
        com.uxcam.video.screen.codec.b.c.b.a(this, sb, "edits");
    }
}
