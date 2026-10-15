package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/m.class */
public class m extends af {
    private static final a a = new a();

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/m$a.class */
    public static class a extends d {
        private Map a = new HashMap();

        public a() {
            this.a.put(au.a(), au.class);
            this.a.put(com.uxcam.video.screen.codec.c.a.a.a.a(), com.uxcam.video.screen.codec.c.a.a.a.class);
            this.a.put("cios", com.uxcam.video.screen.codec.c.a.a.a.class);
        }
    }

    public static String a() {
        return "dref";
    }

    public m() {
        this(new w("dref"));
    }

    private m(w wVar) {
        super(wVar);
        this.f = a;
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.e.size());
        super.a(byteBuffer);
    }
}
