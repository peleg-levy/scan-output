package com.uxcam.j;

import android.content.Context;
import com.uxcam.service.HttpPostService;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/i.class */
public class i {
    private static final String a = i.class.getSimpleName();
    private Context b;

    public i(Context context) {
        this.b = context;
    }

    public final void a() {
        File[] listFiles;
        try {
            File[] listFiles2 = new File(com.uxcam.d.a.c() + "/.UXCam_Temp/").listFiles();
            if (listFiles2 != null) {
                for (File file : listFiles2) {
                    String substring = file.getName().substring(1);
                    if (file != null && !substring.equals(new com.uxcam.c.f(this.b).a()) && (listFiles = file.listFiles()) != null) {
                        if (listFiles.length == 0) {
                            file.delete();
                        } else if (a.b(this.b)) {
                            a(file);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private void a(File file) {
        file.getName().substring(1);
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.uxcam.j.i.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".mp4") || str.endsWith(".txt");
            }
        });
        if (listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (HttpPostService.a(file2)) {
                    new StringBuilder("Sending offline data : ").append(file2.getAbsolutePath());
                    l.a(a, "Sending offline data : " + file2.getAbsolutePath());
                    if (file2.getName().contains("camera")) {
                        new com.uxcam.video.b(this.b).a(file2);
                    } else if (file2.getName().contains("screen")) {
                        new com.uxcam.video.b(this.b).a(file2);
                    } else if (file2.getName().contains(".txt")) {
                        new com.uxcam.d.c(this.b).a(file2);
                    }
                } else {
                    new StringBuilder("Sending offline data File is already being posted ").append(file2);
                }
            }
        }
    }
}
