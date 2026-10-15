package com.uxcam.h;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;
import com.uxcam.UXCam;
import com.uxcam.b;
import com.uxcam.c.d;
import com.uxcam.j.c;
import com.uxcam.j.f;
import com.uxcam.j.g;
import com.uxcam.j.l;
import com.uxcam.j.m;
import com.uxcam.j.n;
import com.uxcam.service.HttpPostService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/h/a.class */
public final class a {
    private JSONObject a;
    private Context b;
    private boolean c;
    private static final double[][] d = {new double[]{0.5d, 320.0d}, new double[]{0.5d, 368.0d}, new double[]{1.0d, 420.0d}, new double[]{1.0d, 420.0d}};
    private static final double[][] e = {new double[]{0.5d, 160.0d}, new double[]{0.5d, 240.0d}, new double[]{1.0d, 320.0d}, new double[]{1.0d, 420.0d}};
    private static final double[][] f = {new double[]{0.5d, 160.0d}, new double[]{0.5d, 320.0d}, new double[]{0.5d, 320.0d}, new double[]{0.5d, 380.0d}};
    private static final double[][] g = {new double[]{0.5d, 160.0d}, new double[]{0.5d, 240.0d}, new double[]{0.5d, 260.0d}, new double[]{0.5d, 320.0d}};

    public a(JSONObject jSONObject, Context context, boolean z) {
        this.a = jSONObject;
        this.b = context;
        this.c = z;
    }

    public final void a() {
        String str;
        JSONObject optJSONObject = this.a.optJSONObject("settings");
        JSONObject jSONObject = optJSONObject;
        if (optJSONObject == null) {
            jSONObject = new JSONObject();
        }
        String optString = this.a.optString("app_id");
        d.c = optString;
        if (optString == null || d.c.equals("")) {
            return;
        }
        if (jSONObject.has("cc_message")) {
            d.g = jSONObject.optString("cc_message");
        }
        d.w = this.a.optString("domain");
        d.u = this.a.optString("device_url");
        d.v = this.a.optString("session_url");
        d.x = this.a.optString("misc");
        d.d = this.a.optBoolean("appName_icon", false);
        JSONObject optJSONObject2 = this.a.optJSONObject("s3");
        JSONObject jSONObject2 = optJSONObject2;
        if (optJSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject2 != null) {
            d.l = jSONObject2.optString("url");
            d.m = jSONObject2.optString("acl");
            d.n = jSONObject2.optString("success_action_status");
            d.o = jSONObject2.optString("policy");
            d.p = jSONObject2.optString("X-amz-algorithm");
            d.q = jSONObject2.optString("X-amz-credential");
            d.r = jSONObject2.optString("X-amz-date");
            d.s = jSONObject2.optString("X-amz-expires");
            d.t = jSONObject2.optString("X-amz-signature");
        }
        d.a = jSONObject.optString("url");
        a(jSONObject.optInt("screen_recording_quality", 2), com.uxcam.video.screen.d.j());
        d.e = jSONObject.optBoolean("camera_record", false);
        if (new g(this.b).a("make_camera_stop").booleanValue()) {
            d.e = false;
        }
        d.h = jSONObject.optBoolean("screen_record", false);
        if (!this.c) {
            d.e = false;
            d.h = false;
        }
        d.k = jSONObject.optBoolean("g_status", false);
        d.f = jSONObject.optString("camera_quality");
        JSONObject optJSONObject3 = this.a.optJSONObject("filter");
        if (optJSONObject3 != null) {
            try {
                JSONArray jSONArray = optJSONObject3.getJSONArray("screens");
                d.G = new ArrayList();
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        d.G.add(jSONArray.get(i).toString());
                    }
                }
            } catch (JSONException unused) {
            }
            try {
                JSONArray jSONArray2 = optJSONObject3.getJSONArray("tags");
                d.H = new ArrayList();
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        d.H.add(jSONArray2.get(i2).toString());
                    }
                }
            } catch (JSONException unused2) {
            }
            d.I = optJSONObject3.optBoolean("upload_crashed_session_only", false);
        }
        d.J = jSONObject.optBoolean("upload_crashed_session", true);
        d.F = jSONObject.optInt("max_session_length");
        int optInt = jSONObject.optInt("min_session_length");
        if (optInt > 4) {
            d.E = optInt;
        }
        boolean z = d.e;
        final Context context = this.b;
        com.uxcam.i.a.a().b();
        if (b.a().i != null) {
            b.a().i.a();
        }
        if (z && m.a(m.b, false)) {
            n nVar = new n(m.b(), new f() { // from class: com.uxcam.h.a.1
                @Override // com.uxcam.j.f
                public final void a() {
                    l.a("SettingsHandler", "Dialog OK clicked");
                    a.c();
                }

                @Override // com.uxcam.j.f
                public final void b() {
                    l.a("SettingsHandler", "Dialog CANCEL clicked");
                    com.uxcam.j.b.b = true;
                    d.e = false;
                    a.c();
                }
            });
            b.a().i = nVar;
            int i3 = new g(nVar.e).a.getInt("ask_dialog_pref", 0);
            if (i3 > 0) {
                nVar.f.a();
            } else if (i3 < 0) {
                nVar.f.b();
            } else {
                CharSequence[] charSequenceArr = {"Always ask before recording", "Don't ask again, Always Record"};
                AlertDialog.Builder builder = new AlertDialog.Builder(nVar.e);
                if (d.g == null || d.g.isEmpty()) {
                    str = m.c(nVar.e) + " would like to record your camera video?";
                    builder.setMessage("would you like to give access?");
                } else {
                    str = d.g;
                }
                builder.setTitle(str).setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.uxcam.j.n.2
                    public AnonymousClass2() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        n.this.d = true;
                        n.this.f.a();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.uxcam.j.n.1
                    public AnonymousClass1() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        n.this.d = true;
                        n.this.f.b();
                    }
                });
                nVar.c = builder.create();
                nVar.c.setCanceledOnTouchOutside(false);
                nVar.c.setCancelable(false);
                nVar.c.show();
            }
        } else {
            b.a().i = null;
            c();
        }
        if (!this.a.has("appName_icon") || d.d) {
            return;
        }
        com.uxcam.j.d dVar = new com.uxcam.j.d(this.b);
        new com.uxcam.video.a().a(dVar.a, com.uxcam.j.d.a(dVar.a));
    }

    private void a(int i, boolean z) {
        if (i > 4) {
            i = 2;
        }
        boolean b = c.b(this.b);
        new StringBuilder("isUsingMediaCodec ").append(z).append(" isTablet ").append(b);
        if (z && b) {
            a(d[i - 1][0], (int) d[i - 1][1], i);
            return;
        }
        if (z) {
            a(e[i - 1][0], (int) e[i - 1][1], i);
        } else if (b) {
            a(f[i - 1][0], (int) f[i - 1][1], i);
        } else {
            a(g[i - 1][0], (int) g[i - 1][1], i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        com.uxcam.j.b.b = false;
        com.uxcam.j.b.c.clear();
        com.uxcam.j.b.a = true;
        for (UXCam.OnVerificationListener onVerificationListener : b.a().m) {
            new com.uxcam.c.f(m.b());
            onVerificationListener.onVerificationSuccess();
        }
        com.uxcam.a a = com.uxcam.a.a();
        try {
            com.uxcam.a.b = Calendar.getInstance();
            a.c = m.a();
            com.uxcam.c.f fVar = new com.uxcam.c.f(a.c);
            m.e();
            l.a(com.uxcam.a.a, "UXCam gets started for APP_DEVICE_ID : " + fVar.a());
            Log.i("UXCam", "UXCam 2.5.2-b : Application key is verified, UXCam has started capturing data as per configuration from UXCam settings page.");
            com.uxcam.i.a.a().a(a.c, null);
            com.uxcam.g.c.a(m.b());
            if (d.e && !new g(m.b()).a("make_camera_stop").booleanValue() && m.a(m.b, true)) {
                try {
                    if (com.uxcam.j.b.a) {
                        int ringerMode = ((AudioManager) a.c.getSystemService("audio")).getRingerMode();
                        Intent intent = new Intent(a.c, (Class<?>) HttpPostService.class);
                        intent.putExtra("arg_which_service", "start_camera");
                        intent.putExtra("currentringstate", ringerMode);
                        a.c.startService(intent);
                    }
                } catch (Exception unused) {
                }
            }
            if (d.h) {
                if (com.uxcam.video.screen.d.b && com.uxcam.video.screen.d.e != null) {
                    com.uxcam.video.screen.d.a.clear();
                    new com.uxcam.video.screen.a(com.uxcam.video.screen.d.e);
                    com.uxcam.video.screen.a.a();
                    com.uxcam.video.screen.c.a = 0;
                    com.uxcam.video.screen.d.b = false;
                    try {
                        com.uxcam.video.screen.d.e.a();
                    } catch (IOException unused2) {
                    }
                    com.uxcam.video.screen.d.e();
                }
                com.uxcam.video.screen.d.b = false;
                com.uxcam.video.screen.d a2 = com.uxcam.video.screen.d.a();
                com.uxcam.video.screen.a.a = true;
                a2.s = new Timer();
                a2.t = new TimerTask() { // from class: com.uxcam.video.screen.d.2

                    /* renamed from: com.uxcam.video.screen.d$2$1 */
                    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/d$2$1.class */
                    class AnonymousClass1 implements Runnable {
                        AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            d.g();
                        }
                    }

                    public AnonymousClass2() {
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        if (d.h) {
                            d.g();
                        } else {
                            d.this.r.post(new Runnable() { // from class: com.uxcam.video.screen.d.2.1
                                AnonymousClass1() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    d.g();
                                }
                            });
                        }
                    }
                };
                a2.s.schedule(a2.t, 0L, com.uxcam.video.screen.d.q);
            }
            Intent intent2 = new Intent(a.c, (Class<?>) HttpPostService.class);
            intent2.putExtra("arg_which_service", "send_offline_data");
            a.c.startService(intent2);
            Intent intent3 = new Intent(a.c, (Class<?>) HttpPostService.class);
            intent3.putExtra("arg_which_service", "stop_foreground");
            a.c.startService(intent3);
        } catch (Exception e2) {
            l.a("ServiceHandler -> startUXCamService", e2);
        }
    }

    private void a(double d2, int i, int i2) {
        int i3 = m.a().getResources().getDisplayMetrics().widthPixels;
        if (i3 < i && i2 != 1) {
            a(i2 - 1, true);
            return;
        }
        d.D = i;
        d.i = (int) (1000.0d / d2);
        int i4 = 1000 / d.i;
        com.uxcam.video.screen.a.c.a = i4;
        if (i4 <= 0) {
            com.uxcam.video.screen.a.c.a = 1;
        }
        new StringBuilder(" fps ").append(d2).append(" width ").append(i).append(" frame time ").append(d.i).append(" deviceOriginalWidth ").append(i3);
    }
}
