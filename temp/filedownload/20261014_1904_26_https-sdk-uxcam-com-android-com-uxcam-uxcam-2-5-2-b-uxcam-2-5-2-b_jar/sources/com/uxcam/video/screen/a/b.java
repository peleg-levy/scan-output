package com.uxcam.video.screen.a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.uxcam.j.m;
import com.uxcam.video.screen.a.c;
import com.uxcam.video.screen.d;

@TargetApi(18)
/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/a/b.class */
public final class b implements c.b {
    int b = 0;
    Paint a = new Paint();

    public b() {
        this.a.setAntiAlias(true);
        this.a.setDither(true);
        this.a.setTextSize(22.0f);
    }

    @Override // com.uxcam.video.screen.a.c.b
    public final boolean a(Canvas canvas) {
        this.a.setColor(-16777216);
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.a);
        if (com.uxcam.video.screen.c.b != null && !com.uxcam.video.screen.c.b.isRecycled()) {
            canvas.drawBitmap(com.uxcam.video.screen.c.b, 0.0f, 0.0f, (Paint) null);
        }
        this.a.setColor(-65536);
        canvas.drawText(".", 0.0f, canvas.getHeight(), this.a);
        this.b++;
        return d.f;
    }

    @Override // com.uxcam.video.screen.a.c.b
    public final int a() {
        return m.a(d.b());
    }

    @Override // com.uxcam.video.screen.a.c.b
    public final int b() {
        return m.a(d.c());
    }
}
