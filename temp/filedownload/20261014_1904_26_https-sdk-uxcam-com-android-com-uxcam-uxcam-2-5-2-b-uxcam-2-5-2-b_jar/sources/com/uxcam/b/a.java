package com.uxcam.b;

import android.os.Process;
import com.uxcam.j.l;
import com.uxcam.j.m;
import com.uxcam.video.screen.d;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/b/a.class */
public class a implements Thread.UncaughtExceptionHandler {
    private static String a = a.class.getSimpleName();
    private Thread.UncaughtExceptionHandler b;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            String stringWriter2 = stringWriter.toString();
            l.a(a, "caught in CustomExceptionHandler of UXCam: " + stringWriter2);
            d.f = false;
            if (d.e != null) {
                try {
                    d.e.a();
                } catch (IOException unused) {
                }
            }
            com.uxcam.a.a();
            com.uxcam.a.a(m.a(), stringWriter2);
            this.b.uncaughtException(thread, th);
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable th2) {
            Process.killProcess(Process.myPid());
            System.exit(10);
            throw th2;
        }
    }
}
