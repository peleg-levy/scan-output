package com.uxcam.video.screen.codec.c.a;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/d.class */
public final class d {
    public static final long a;

    public static int a(long j) {
        return (int) ((j - a) / 1000);
    }

    static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1904, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        a = calendar.getTimeInMillis();
    }
}
