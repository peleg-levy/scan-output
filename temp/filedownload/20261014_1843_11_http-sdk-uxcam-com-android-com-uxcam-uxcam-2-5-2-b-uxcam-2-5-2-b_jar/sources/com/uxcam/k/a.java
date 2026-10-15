package com.uxcam.k;

import android.content.Context;
import android.util.Log;
import com.uxcam.UXCam;
import com.uxcam.b;
import com.uxcam.c.f;
import com.uxcam.j.l;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/k/a.class */
public class a {
    private static String b = a.class.getSimpleName();
    public Context a;

    public a(Context context) {
        this.a = context;
    }

    public final void a(JSONObject jSONObject) {
        b.a().l = false;
        if (b.a().j != 2) {
            new StringBuilder("Verification success, settings received is : ").append(jSONObject.toString());
            l.a(b, "VERIFICATION SUCCESS, settings received is : " + jSONObject.toString());
            try {
                boolean z = jSONObject.getBoolean("verify_status");
                if (!z) {
                    String string = jSONObject.has("log") ? jSONObject.getString("log") : "Verification failed";
                    Log.i("UXCam", "UXCam 2.5.2-b : Application Key verification failed. Error : " + string);
                    b.a().j = 1;
                    Iterator it = b.a().m.iterator();
                    while (it.hasNext()) {
                        ((UXCam.OnVerificationListener) it.next()).onVerificationFailed(string);
                    }
                    return;
                }
                String string2 = jSONObject.getString("app_device_id");
                String str = null;
                if (jSONObject.has("user_id")) {
                    str = jSONObject.getString("user_id");
                }
                boolean z2 = jSONObject.getBoolean("video_record");
                f fVar = new f(this.a);
                fVar.a(z);
                l.a("VerificationData", "New APP DEVICE ID SET " + string2);
                fVar.a.a("app_device_id", string2);
                fVar.a(new StringBuilder().append(new Random().nextInt(10000)).toString());
                if (str != null) {
                    fVar.a(str);
                }
                new com.uxcam.h.a(jSONObject, this.a, z2).a();
            } catch (Exception e) {
                new StringBuilder().append(e);
            }
        }
    }
}
