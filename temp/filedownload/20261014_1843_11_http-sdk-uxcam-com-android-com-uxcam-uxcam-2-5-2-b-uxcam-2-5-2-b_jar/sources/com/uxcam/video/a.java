package com.uxcam.video;

import android.content.Context;
import android.net.NetworkInfo;
import com.uxcam.c.d;
import com.uxcam.e.aa;
import com.uxcam.e.ab;
import com.uxcam.e.f;
import com.uxcam.e.u;
import com.uxcam.e.v;
import com.uxcam.e.w;
import com.uxcam.e.z;
import com.uxcam.j.l;
import com.uxcam.service.HttpPostService;
import java.io.File;
import java.io.IOException;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/a.class */
public final class a {
    Context a;

    public final void a(Context context, final File file) {
        this.a = context;
        if (file.exists()) {
            NetworkInfo a = com.uxcam.j.a.a(context);
            boolean z = a != null && a.isConnected() && a.getType() == 1;
            NetworkInfo a2 = com.uxcam.j.a.a(context);
            boolean z2 = a2 != null && a2.isConnected() && a2.getType() == 0;
            if ((z && d.j) || (z2 && d.k)) {
                try {
                    final String replace = file.getName().replace("$", "/");
                    String str = null;
                    if (replace.endsWith(".mp4")) {
                        str = "video/mp4";
                    } else if (replace.endsWith(".txt")) {
                        str = "text/plain";
                    } else if (replace.endsWith(".png")) {
                        str = "image/png";
                    }
                    HttpPostService.b(file);
                    w wVar = new w();
                    final u a3 = u.a(str);
                    v.a aVar = new v.a();
                    u uVar = v.e;
                    if (uVar == null) {
                        throw new NullPointerException("type == null");
                    }
                    if (!uVar.a.equals("multipart")) {
                        throw new IllegalArgumentException("multipart != " + uVar);
                    }
                    aVar.b = uVar;
                    v.a a4 = aVar.a("acl", d.m).a("success_action_status", d.n).a("policy", d.o).a("X-amz-algorithm", d.p).a("X-amz-credential", d.q).a("X-amz-date", d.r).a("X-amz-expires", d.s).a("X-amz-signature", d.t).a("key", replace).a("content-type", str);
                    if (file == null) {
                        throw new NullPointerException("content == null");
                    }
                    v.a a5 = a4.a(v.b.a("file", "abc", new aa() { // from class: com.uxcam.e.aa.2
                        @Override // com.uxcam.e.aa
                        public final u a() {
                            return u.this;
                        }

                        @Override // com.uxcam.e.aa
                        public final long b() {
                            return file.length();
                        }

                        @Override // com.uxcam.e.aa
                        public final void a(com.uxcam.f.d dVar) {
                            com.uxcam.f.s sVar = null;
                            try {
                                sVar = com.uxcam.f.l.a(file);
                                dVar.a(sVar);
                                com.uxcam.e.a.c.a(sVar);
                            } catch (Throwable th) {
                                com.uxcam.e.a.c.a(sVar);
                                throw th;
                            }
                        }
                    }));
                    if (a5.c.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    wVar.a(new z.a().a(d.l).a("POST", new v(a5.a, a5.b, a5.c)).a()).a(new f() { // from class: com.uxcam.video.a.1
                        @Override // com.uxcam.e.f
                        public final void a(IOException iOException) {
                            new StringBuilder("onFailure ").append(iOException.getMessage());
                            a.a(file, iOException.getMessage());
                        }

                        @Override // com.uxcam.e.f
                        public final void a(ab abVar) {
                            if (!abVar.a()) {
                                a.a(file, abVar.c);
                            } else if (Integer.parseInt(d.n) == abVar.b) {
                                l.a("AmazonUploader", " UPLOAD TO S3 success: " + file.getAbsolutePath() + " size : " + file.length());
                                new StringBuilder(" UPLOAD TO S3 success: ").append(replace).append(" size : ").append(file.length());
                                HttpPostService.c(file);
                                file.delete();
                                File parentFile = file.getParentFile();
                                File[] listFiles = parentFile.listFiles();
                                if (listFiles != null && listFiles.length == 0) {
                                    parentFile.delete();
                                }
                                com.uxcam.b.g();
                            } else {
                                a.a(file, abVar.c);
                            }
                            abVar.f.close();
                        }
                    });
                } catch (Exception unused) {
                }
            }
        }
    }

    static /* synthetic */ void a(File file, String str) {
        l.a("AmazonUploader", " UPLOAD TO S3 Failed: " + file.getAbsolutePath() + " size : " + file.length() + " Response : " + str);
        new StringBuilder(" UPLOAD TO S3 Failed: ").append(file.getAbsolutePath()).append(" size : ").append(file.length()).append(" Response : ").append(str);
        HttpPostService.c(file);
        com.uxcam.b.g();
    }
}
