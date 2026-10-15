package com.uxcam.video.screen.codec.codecs.h264.io.a;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/a/a.class */
public final class a {
    public static void a(com.uxcam.video.screen.codec.b.a.b bVar, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= 15) {
                break;
            }
            if (i < i3 + (1 << i4)) {
                i2 = i4;
                break;
            } else {
                i3 += 1 << i4;
                i4++;
            }
        }
        bVar.a(0, i2);
        bVar.a(1);
        bVar.a(i - i3, i2);
    }

    public static void b(com.uxcam.video.screen.codec.b.a.b bVar, int i) {
        a(bVar, com.uxcam.video.screen.codec.b.c.a.c(i));
    }

    public static void a(com.uxcam.video.screen.codec.b.a.b bVar, boolean z) {
        bVar.a(z ? 1 : 0);
    }

    public static void a(com.uxcam.video.screen.codec.b.a.b bVar, long j, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bVar.a(((int) (j >> ((i - i2) - 1))) & 1);
        }
    }

    public static void a(com.uxcam.video.screen.codec.b.a.b bVar) {
        bVar.a(1);
        bVar.a();
    }
}
