package com.uxcam.video.screen.codec.codecs.h264.a;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/a/a.class */
public final class a {
    public static int a(com.uxcam.video.screen.codec.b.a.a aVar) {
        int i = 0;
        while (aVar.a() == 0 && i < 31) {
            i++;
        }
        int i2 = 0;
        if (i > 0) {
            i2 = (int) (((1 << i) - 1) + aVar.a(i));
        }
        return i2;
    }

    public static int b(com.uxcam.video.screen.codec.b.a.a aVar) {
        return a(aVar);
    }

    public static int c(com.uxcam.video.screen.codec.b.a.a aVar) {
        int a = a(aVar);
        return ((a >> 1) + (a & 1)) * (((a & 1) << 1) - 1);
    }

    public static boolean d(com.uxcam.video.screen.codec.b.a.a aVar) {
        return aVar.a() != 0;
    }
}
