package com.uxcam.video.screen.codec.e;

import java.util.HashMap;
import java.util.Map;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/a.class */
public final class a {
    private static Map a = new HashMap();

    /* renamed from: com.uxcam.video.screen.codec.e.a$a, reason: collision with other inner class name */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/e/a$a.class */
    public static class C0010a implements e {
        @Override // com.uxcam.video.screen.codec.e.e
        public final void a(com.uxcam.video.screen.codec.b.b.d dVar, com.uxcam.video.screen.codec.b.b.d dVar2) {
            for (int i = 0; i < 3; i++) {
                System.arraycopy(dVar.d[i], 0, dVar2.d[i], 0, Math.min(dVar.a(i) * dVar.b(i), dVar2.a(i) * dVar2.b(i)));
            }
        }
    }

    public static e a(com.uxcam.video.screen.codec.b.b.b bVar, com.uxcam.video.screen.codec.b.b.b bVar2) {
        Map map = (Map) a.get(bVar);
        if (map == null) {
            return null;
        }
        return (e) map.get(bVar2);
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(com.uxcam.video.screen.codec.b.b.b.RGB, new C0010a());
        hashMap.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new c());
        hashMap.put(com.uxcam.video.screen.codec.b.b.b.YUV420J, new b());
        hashMap.put(com.uxcam.video.screen.codec.b.b.b.YUV422, new d(0));
        hashMap.put(com.uxcam.video.screen.codec.b.b.b.YUV422_10, new d(2));
        a.put(com.uxcam.video.screen.codec.b.b.b.RGB, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new C0010a());
        hashMap2.put(com.uxcam.video.screen.codec.b.b.b.RGB, new h());
        hashMap2.put(com.uxcam.video.screen.codec.b.b.b.YUV422, new i(0));
        hashMap2.put(com.uxcam.video.screen.codec.b.b.b.YUV422_10, new i(2));
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV420, hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(com.uxcam.video.screen.codec.b.b.b.YUV422, new C0010a());
        hashMap3.put(com.uxcam.video.screen.codec.b.b.b.RGB, new l(0));
        hashMap3.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new n(0));
        hashMap3.put(com.uxcam.video.screen.codec.b.b.b.YUV420J, new m(0));
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV422, hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(com.uxcam.video.screen.codec.b.b.b.YUV422_10, new C0010a());
        hashMap4.put(com.uxcam.video.screen.codec.b.b.b.RGB, new l(2));
        hashMap4.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new n(2));
        hashMap4.put(com.uxcam.video.screen.codec.b.b.b.YUV420J, new m(2));
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV422_10, hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(com.uxcam.video.screen.codec.b.b.b.YUV444, new C0010a());
        hashMap5.put(com.uxcam.video.screen.codec.b.b.b.RGB, new q(0));
        hashMap5.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new r(0));
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV444, hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(com.uxcam.video.screen.codec.b.b.b.YUV444_10, new C0010a());
        hashMap6.put(com.uxcam.video.screen.codec.b.b.b.RGB, new q(2));
        hashMap6.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new r(2));
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV444_10, hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(com.uxcam.video.screen.codec.b.b.b.YUV420J, new C0010a());
        hashMap7.put(com.uxcam.video.screen.codec.b.b.b.RGB, new f());
        hashMap7.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new g());
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV420J, hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(com.uxcam.video.screen.codec.b.b.b.YUV422J, new C0010a());
        hashMap8.put(com.uxcam.video.screen.codec.b.b.b.RGB, new j());
        hashMap8.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new k());
        hashMap8.put(com.uxcam.video.screen.codec.b.b.b.YUV420J, new n(0));
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV422J, hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(com.uxcam.video.screen.codec.b.b.b.YUV444J, new C0010a());
        hashMap9.put(com.uxcam.video.screen.codec.b.b.b.RGB, new o());
        hashMap9.put(com.uxcam.video.screen.codec.b.b.b.YUV420, new p());
        hashMap9.put(com.uxcam.video.screen.codec.b.b.b.YUV420J, new r(0));
        a.put(com.uxcam.video.screen.codec.b.b.b.YUV444J, hashMap9);
    }
}
