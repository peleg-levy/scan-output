package com.uxcam.j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/e.class */
public class e {
    public Context a;

    public e(Context context) {
        this.a = context;
    }

    public static File a(Context context) {
        Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
        File file = new File(com.uxcam.d.a.b(), new com.uxcam.c.f(m.a()).b() + "$" + com.uxcam.c.d.c + "$icon.png");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ((BitmapDrawable) applicationIcon).getBitmap().compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        return file;
    }
}
