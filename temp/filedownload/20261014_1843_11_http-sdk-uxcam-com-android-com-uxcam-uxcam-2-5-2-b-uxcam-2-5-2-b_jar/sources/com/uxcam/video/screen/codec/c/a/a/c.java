package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/c.class */
public abstract class c {
    protected w d;

    public c(w wVar) {
        this.d = wVar;
    }

    public static void a(c cVar, List list, Collection collection) {
        if (list.size() <= 0) {
            collection.add(cVar);
            return;
        }
        String str = (String) list.remove(0);
        if (cVar instanceof af) {
            for (c cVar2 : ((af) cVar).b()) {
                if (str == null || str.equals(cVar2.d.a)) {
                    a(cVar2, list, collection);
                }
            }
        }
        list.add(0, str);
    }

    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        com.uxcam.video.screen.codec.b.h.a(byteBuffer, 8);
        a(byteBuffer);
        w wVar = this.d;
        wVar.b = ((byteBuffer.position() - duplicate.position()) - 8) + wVar.a();
        if (this.d.a() != 8) {
            throw new AssertionError();
        }
        this.d.a(duplicate);
    }

    public abstract void a(ByteBuffer byteBuffer);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    public void a(StringBuilder sb) {
        sb.append("'" + this.d.a + "'");
    }
}
