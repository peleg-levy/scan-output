package com.uxcam.video;

import android.content.Context;
import com.uxcam.c.d;
import java.io.File;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/b.class */
public class b extends c {
    private static String b = c.class.getSimpleName();

    public b(Context context) {
        super(context);
    }

    @Override // com.uxcam.video.c
    public final void a(File file) {
        if (d.y) {
            new a().a(this.a, file);
        }
    }
}
