package com.uxcam.d;

import android.content.Context;
import com.uxcam.service.HttpPostService;
import java.io.File;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/d/c.class */
public final class c extends d {
    public c(Context context) {
        super(context);
    }

    @Override // com.uxcam.d.d
    public final void a(File file) {
        HttpPostService.b(file);
        new com.uxcam.video.a().a(this.a, file);
    }
}
