package com.uxcam.video.screen.a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import com.uxcam.j.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(18)
/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/a/c.class */
public final class c {
    public static int a = 1;
    public String b;
    private MediaCodec h;
    private Surface i;
    private MediaMuxer j;
    private int k;
    private boolean l;
    private MediaCodec.BufferInfo m;
    public b d;
    int c = 150000;
    public ArrayList f = new ArrayList();
    a g = new a(this);
    public C0005c e = new C0005c(this, 0);

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/a/c$a.class */
    private static class a extends Handler {
        c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 100) {
                if (message.arg1 == 101) {
                    Iterator it = this.a.f.iterator();
                    while (it.hasNext()) {
                        ((com.uxcam.video.screen.a.a) it.next()).a();
                    }
                } else if (message.arg1 == 102) {
                    Iterator it2 = this.a.f.iterator();
                    while (it2.hasNext()) {
                        ((com.uxcam.video.screen.a.a) it2.next()).b();
                    }
                }
            }
        }
    }

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/a/c$b.class */
    public interface b {
        boolean a(Canvas canvas);

        int a();

        int b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.uxcam.video.screen.a.c$c, reason: collision with other inner class name */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/a/c$c.class */
    public class C0005c extends Thread {
        private C0005c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            if (c.this.d == null) {
                throw new NullPointerException("Need to set an encoder source on the surfaceEncoder");
            }
            boolean z = true;
            try {
                c.this.m = new MediaCodec.BufferInfo();
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", c.this.d.a(), c.this.d.b());
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("bitrate", c.this.c);
                createVideoFormat.setInteger("frame-rate", c.a);
                createVideoFormat.setInteger("i-frame-interval", 100);
                createVideoFormat.setInteger("stride", c.this.d.a());
                createVideoFormat.setInteger("slice-height", c.this.d.b());
                try {
                    c.this.h = MediaCodec.createEncoderByType("video/avc");
                } catch (IOException unused) {
                }
                c.this.h.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                c.this.i = c.this.h.createInputSurface();
                c.this.h.start();
                try {
                    c.this.j = new MediaMuxer(c.this.b, 0);
                    c.this.k = -1;
                    c.this.l = false;
                    boolean z2 = true;
                    while (z2) {
                        Thread.sleep(1000 / c.a);
                        a(false);
                        z2 = a();
                    }
                    a(true);
                } catch (IOException e) {
                    throw new RuntimeException("MediaMuxer creation failed", e);
                }
            } catch (Exception unused2) {
                z = false;
            } finally {
                b();
            }
            Message.obtain(c.this.g, 100, z ? 101 : 102, -1).sendToTarget();
        }

        private boolean a() {
            try {
                Canvas lockCanvas = c.this.i.lockCanvas(null);
                boolean a = c.this.d.a(lockCanvas);
                c.this.i.unlockCanvasAndPost(lockCanvas);
                return a;
            } catch (Surface.OutOfResourcesException unused) {
                return false;
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("UXCam : IllegalArgumentException while lockCamvas ");
            }
        }

        private void b() {
            if (c.this.h != null) {
                try {
                    c.this.h.stop();
                    c.this.h.release();
                    c.this.h = null;
                } catch (Exception e) {
                    l.a("SurfaceEncoder", e);
                }
            }
            if (c.this.i != null) {
                try {
                    c.this.i.release();
                    c.this.i = null;
                } catch (Exception e2) {
                    l.a("SurfaceEncoder", e2);
                }
            }
            if (c.this.j != null) {
                try {
                    c.this.j.stop();
                    c.this.j.release();
                    c.this.j = null;
                } catch (Exception e3) {
                    l.a("SurfaceEncoder", e3);
                }
            }
        }

        private void a(boolean z) {
            if (z) {
                c.this.h.signalEndOfInputStream();
            }
            while (true) {
                ByteBuffer[] outputBuffers = c.this.h.getOutputBuffers();
                while (true) {
                    int dequeueOutputBuffer = c.this.h.dequeueOutputBuffer(c.this.m, 10000L);
                    if (dequeueOutputBuffer == -1) {
                        if (!z) {
                            return;
                        }
                    } else if (dequeueOutputBuffer != -3) {
                        if (dequeueOutputBuffer == -2) {
                            if (c.this.l) {
                                throw new RuntimeException("format changed twice");
                            }
                            MediaFormat outputFormat = c.this.h.getOutputFormat();
                            new StringBuilder("encoder output format changed: ").append(outputFormat);
                            c.this.k = c.this.j.addTrack(outputFormat);
                            c.this.j.start();
                            c.this.l = true;
                        } else if (dequeueOutputBuffer < 0) {
                            continue;
                        } else {
                            ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                            if (byteBuffer == null) {
                                throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                            }
                            if ((c.this.m.flags & 2) != 0) {
                                c.this.m.size = 0;
                            }
                            if (c.this.m.size != 0) {
                                if (!c.this.l) {
                                    throw new RuntimeException("muxer hasn't started");
                                }
                                byteBuffer.position(c.this.m.offset);
                                byteBuffer.limit(c.this.m.offset + c.this.m.size);
                                c.this.j.writeSampleData(c.this.k, byteBuffer, c.this.m);
                                new StringBuilder("sent ").append(c.this.m.size).append(" bytes to muxer");
                            }
                            c.this.h.releaseOutputBuffer(dequeueOutputBuffer, false);
                            if ((c.this.m.flags & 4) != 0) {
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* synthetic */ C0005c(c cVar, byte b) {
            this();
        }
    }
}
