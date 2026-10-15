package com.uxcam.video.a;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.uxcam.c.d;
import com.uxcam.c.f;
import com.uxcam.j.l;
import com.uxcam.j.m;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/a/a.class */
public class a implements SurfaceHolder.Callback {
    private static final String g = a.class.getSimpleName();
    public static boolean a;
    public int b;
    Notification c;
    public WindowManager d;
    public SurfaceView e;
    private Camera h = null;
    private MediaRecorder i = null;
    public Context f;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        new Thread(new Runnable() { // from class: com.uxcam.video.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.a(a.this, surfaceHolder);
                } catch (Exception unused) {
                    l.a(a.g, "Exception in RecordingService.surfaceCreate()");
                    ((NotificationManager) a.this.f.getSystemService("notification")).cancel(1);
                }
            }
        }).start();
    }

    public final void a() {
        ((Service) this.f).stopForeground(true);
        a(true);
        a = false;
        if (this.i != null) {
            this.i.stop();
            this.i.reset();
            this.i.release();
        }
        if (this.h != null) {
            this.h.lock();
            this.h.release();
            this.d.removeView(this.e);
        }
        if (this.b != 0) {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        try {
            AudioManager audioManager = (AudioManager) this.f.getApplicationContext().getSystemService("audio");
            int[] iArr = {8, 0, 4, 3, 5, 2, 1};
            if (z) {
                audioManager.unloadSoundEffects();
                for (int i = 0; i < 7; i++) {
                    audioManager.setStreamMute(iArr[i], true);
                }
                audioManager.setRingerMode(0);
                return;
            }
            for (int i2 = 0; i2 < 7; i2++) {
                audioManager.setStreamMute(iArr[i2], false);
            }
            audioManager.setRingerMode(this.b);
            audioManager.loadSoundEffects();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    private static Camera c() {
        Camera camera = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= Camera.getNumberOfCameras()) {
                break;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 1) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            try {
                camera = Camera.open(i);
            } catch (Exception unused) {
                l.a(g, "Camera in use");
                return null;
            }
        }
        return camera;
    }

    static /* synthetic */ void a(a aVar, SurfaceHolder surfaceHolder) {
        if (aVar.b != 0) {
            aVar.a(true);
            new Timer().schedule(new TimerTask() { // from class: com.uxcam.video.a.a.3
                final /* synthetic */ boolean a = false;

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    a.this.a(this.a);
                }
            }, 4000L);
        }
        aVar.h = c();
        if (aVar.h == null) {
            l.a(g, "Camera is not available (in use or does not exist)");
            return;
        }
        Camera.Parameters parameters = aVar.h.getParameters();
        aVar.h.setParameters(parameters);
        aVar.h.unlock();
        aVar.i = new MediaRecorder();
        int rotation = ((WindowManager) aVar.f.getSystemService("window")).getDefaultDisplay().getRotation();
        int f = m.f(aVar.f);
        if (f != 1) {
            if (f == 2) {
                switch (rotation) {
                    case 0:
                        aVar.i.setOrientationHint(0);
                        break;
                    case 1:
                        aVar.i.setOrientationHint(90);
                        break;
                    case 2:
                        aVar.i.setOrientationHint(180);
                        break;
                    case 3:
                        aVar.i.setOrientationHint(270);
                        break;
                }
            }
        } else {
            switch (rotation) {
                case 0:
                    aVar.i.setOrientationHint(270);
                    break;
                case 1:
                    aVar.i.setOrientationHint(0);
                    break;
                case 2:
                    aVar.i.setOrientationHint(90);
                    break;
                case 3:
                    aVar.i.setOrientationHint(180);
                    break;
            }
        }
        aVar.i.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: com.uxcam.video.a.a.2
            @Override // android.media.MediaRecorder.OnErrorListener
            public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
                a.this.i.reset();
                a.this.i.release();
                a.c(a.this);
                a.this.h.lock();
                a.this.h.release();
                a.e(a.this);
                a.this.a();
            }
        });
        aVar.i.setCamera(aVar.h);
        aVar.i.setAudioSource(0);
        aVar.i.setVideoSource(0);
        aVar.i.setOutputFormat(2);
        aVar.i.setAudioEncoder(3);
        aVar.i.setVideoEncoder(2);
        f fVar = new f(m.a());
        aVar.i.setOutputFile(com.uxcam.d.a.a() + (fVar.b() + "$" + d.c + "$" + fVar.a() + "$camera.mp4"));
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        int size = supportedPreviewSizes.size() - 1;
        String str = d.f;
        if (str.equalsIgnoreCase("low")) {
            size = supportedPreviewSizes.size() - 1;
        } else if (str.equalsIgnoreCase("medium")) {
            size = (supportedPreviewSizes.size() - 1) / 3;
        } else if (str.equalsIgnoreCase("high")) {
            size = 0;
        }
        Camera.Size size2 = supportedPreviewSizes.get(size);
        aVar.i.setVideoSize(size2.width, size2.height);
        aVar.i.setPreviewDisplay(surfaceHolder.getSurface());
        aVar.i.prepare();
        a = true;
        String c = m.c(aVar.f);
        aVar.c = new Notification(R.drawable.ic_notification_overlay, "Recording camera video", System.currentTimeMillis());
        aVar.c = new Notification.Builder(aVar.f).setContentTitle(c).setContentText("Recording camera video").setSmallIcon(R.drawable.ic_notification_overlay).setContentIntent(PendingIntent.getActivity(aVar.f, 0, new Intent(aVar.f, (Class<?>) a.class), 0)).getNotification();
        ((NotificationManager) aVar.f.getSystemService("notification")).notify(1, aVar.c);
        ((Service) aVar.f).startForeground(1, aVar.c);
        aVar.i.start();
    }

    static /* synthetic */ MediaRecorder c(a aVar) {
        aVar.i = null;
        return null;
    }

    static /* synthetic */ Camera e(a aVar) {
        aVar.h = null;
        return null;
    }
}
