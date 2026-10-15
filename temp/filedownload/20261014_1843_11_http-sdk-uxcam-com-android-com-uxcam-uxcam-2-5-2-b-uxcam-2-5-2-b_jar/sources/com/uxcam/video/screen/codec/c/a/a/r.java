package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/r.class */
public class r extends c {
    private String a;
    private int b;
    private Collection c;

    public r(String str, Collection collection) {
        super(new w("ftyp"));
        this.c = new LinkedList();
        this.a = str;
        this.b = 512;
        this.c = collection;
    }

    public r() {
        super(new w("ftyp"));
        this.c = new LinkedList();
    }

    public static String a() {
        return "ftyp";
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.put(com.uxcam.video.screen.codec.b.f.a(this.a));
        byteBuffer.putInt(this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            byteBuffer.put(com.uxcam.video.screen.codec.b.f.a((String) it.next()));
        }
    }
}
