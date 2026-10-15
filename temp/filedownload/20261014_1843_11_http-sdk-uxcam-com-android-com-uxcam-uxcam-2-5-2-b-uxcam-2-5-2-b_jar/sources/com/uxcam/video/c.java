package com.uxcam.video;

import android.content.Context;
import com.uxcam.c.f;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/c.class */
public class c {
    private static String b = b.class.getSimpleName();
    protected Context a;

    public c(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        try {
            File[] fileArr = new File[0];
            if (str.equals("screen")) {
                fileArr = new File(com.uxcam.d.a.a()).listFiles(new FilenameFilter() { // from class: com.uxcam.video.c.1
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str2) {
                        return str2.endsWith("screen.mp4");
                    }
                });
            } else if (str.equals("camera")) {
                fileArr = new File(com.uxcam.d.a.a()).listFiles(new FilenameFilter() { // from class: com.uxcam.video.c.2
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str2) {
                        return str2.endsWith("camera.mp4");
                    }
                });
            }
            File file = (fileArr == null || fileArr.length <= 0) ? null : fileArr[0];
            File file2 = file;
            if (file != null) {
                new f(this.a).a();
                a(file2);
            }
        } catch (Exception unused) {
        }
    }

    public void a(File file) {
    }
}
