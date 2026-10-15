package com.uxcam.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.uxcam.c.d;
import com.uxcam.j.i;
import com.uxcam.j.m;
import com.uxcam.video.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/service/HttpPostService.class */
public class HttpPostService extends Service {
    public static final String a = HttpPostService.class.getSimpleName();
    public static boolean b = false;
    public static List c = Collections.synchronizedList(new ArrayList());
    com.uxcam.video.a.a d;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/service/HttpPostService$a.class */
    private final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String string = message.getData().getString("arg_which_service");
            String str = HttpPostService.a;
            new StringBuilder("service started msg : ").append(string).append(" start id : ").append(message.arg1);
            if (string.equals("value_stop_uxcam")) {
                com.uxcam.a.a();
                com.uxcam.a.a(m.a(), "");
                return;
            }
            if (string.equals("send_offline_data")) {
                i iVar = new i(m.a());
                if (d.y) {
                    try {
                        iVar.a();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            if (string.equals("stop_foreground")) {
                String str2 = HttpPostService.a;
            } else if (string.equals("screen_upload")) {
                try {
                    new b(m.a()).a("screen");
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static boolean a(File file) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            if (file.getAbsolutePath().equals((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static void b(File file) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            if (file.getAbsolutePath().equals((String) it.next())) {
                return;
            }
        }
        c.add(file.getAbsolutePath());
    }

    public static synchronized void c(File file) {
        try {
            for (String str : c) {
                if (file.getAbsolutePath().equals(str)) {
                    c.remove(str);
                }
            }
        } catch (ConcurrentModificationException unused) {
            c(file);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || null == intent.getExtras()) {
            return 2;
        }
        b = true;
        String string = intent.getExtras().getString("arg_which_service");
        if (string == null || string.equalsIgnoreCase("stop_foreground")) {
            return 2;
        }
        if (string.equalsIgnoreCase("start_camera")) {
            int intExtra = intent.getIntExtra("currentringstate", 0);
            this.d = new com.uxcam.video.a.a();
            com.uxcam.video.a.a aVar = this.d;
            aVar.f = this;
            aVar.b = intExtra;
            try {
                aVar.d = (WindowManager) getSystemService("window");
                aVar.e = new SurfaceView(this);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1, 1, 2006, 262144, -3);
                layoutParams.gravity = 51;
                aVar.d.addView(aVar.e, layoutParams);
                aVar.e.getHolder().addCallback(aVar);
                return 2;
            } catch (Exception unused) {
                return 2;
            }
        }
        if (string.equalsIgnoreCase("stop_camera")) {
            if (this.d == null) {
                return 2;
            }
            this.d.a();
            this.d = null;
            return 2;
        }
        HandlerThread handlerThread = new HandlerThread("ServiceStartArguments", 10);
        handlerThread.start();
        a aVar2 = new a(handlerThread.getLooper());
        Message obtainMessage = aVar2.obtainMessage();
        obtainMessage.arg1 = i2;
        obtainMessage.setData(intent.getExtras());
        aVar2.sendMessage(obtainMessage);
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        b = false;
    }
}
