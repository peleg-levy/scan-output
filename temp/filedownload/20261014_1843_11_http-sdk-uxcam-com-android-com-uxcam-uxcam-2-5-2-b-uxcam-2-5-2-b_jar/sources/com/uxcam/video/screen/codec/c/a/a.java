package com.uxcam.video.screen.codec.c.a;

import com.uxcam.video.screen.codec.c.a.a.r;
import java.util.Arrays;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a.class */
public enum a {
    MOV("qt  ", new String[]{"qt  "}),
    MP4("isom", new String[]{"isom", "iso2", "avc1", "mp41"});

    public r c;

    a(String str, String[] strArr) {
        this.c = new r(str, Arrays.asList(strArr));
    }
}
