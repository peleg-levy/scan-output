package com.uxcam.video.screen.codec.c.a;

import com.uxcam.video.screen.codec.b.i;
import com.uxcam.video.screen.codec.c.a.a.ac;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/c.class */
public final class c {
    private static Map a;

    public static void a(i iVar, ac acVar) {
        ByteBuffer allocate = ByteBuffer.allocate(4194304);
        acVar.b(allocate);
        allocate.flip();
        iVar.write(allocate);
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(com.uxcam.video.screen.codec.b.b.MPEG2, "m2v1");
        a.put(com.uxcam.video.screen.codec.b.b.H264, "avc1");
        a.put(com.uxcam.video.screen.codec.b.b.J2K, "mjp2");
    }
}
