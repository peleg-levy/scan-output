package com.uxcam;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.SupportMapFragment;
import com.uxcam.c.d;
import com.uxcam.j.j;
import com.uxcam.j.m;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/UXCam.class */
public class UXCam {

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/UXCam$OnVerificationListener.class */
    public interface OnVerificationListener {
        void onVerificationSuccess();

        void onVerificationFailed(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startWithKey(String str) {
        try {
            b.a(str, false);
        } catch (Exception unused) {
            str.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startWithKey(String str, String str2) {
        try {
            b.a(str, str2);
        } catch (Exception unused) {
            str.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.uxcam.b, java.lang.Exception] */
    public static void startWithKey(String str, String str2, OnVerificationListener onVerificationListener) {
        ?? a;
        try {
            b.a(str, str2);
            a = b.a();
            a.a(onVerificationListener);
        } catch (Exception unused) {
            a.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.uxcam.b, java.lang.Exception] */
    public static void startWithKey(String str, OnVerificationListener onVerificationListener) {
        ?? a;
        try {
            b.a(str, false);
            a = b.a();
            a.a(onVerificationListener);
        } catch (Exception unused) {
            a.printStackTrace();
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0004: INVOKE (r0 I:java.lang.Exception) VIRTUAL call: java.lang.Exception.printStackTrace():void A[MD:():void (c)], block:B:6:0x0004 */
    public static void stopApplicationAndUploadData() {
        Exception printStackTrace;
        try {
            b.e();
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    public static void setGoogleMapFragment(MapFragment mapFragment) {
        try {
            b.d = true;
            b.a(mapFragment);
        } catch (Exception unused) {
            mapFragment.printStackTrace();
        }
    }

    public static void setGoogleMapFragment(SupportMapFragment supportMapFragment) {
        try {
            b.d = true;
            b.a(supportMapFragment);
        } catch (Exception unused) {
            supportMapFragment.printStackTrace();
        }
    }

    public static void setMapView(MapView mapView) {
        try {
            b.d = true;
            b.a(mapView);
        } catch (Exception unused) {
            mapView.printStackTrace();
        }
    }

    public static void setGoogleMapFragment(MapView mapView) {
        try {
            b.d = true;
            b.a(mapView);
        } catch (Exception unused) {
            mapView.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void occludeSensitiveView(View view) {
        try {
            b.a(view);
        } catch (Exception unused) {
            view.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void occludeSensitiveScreen(boolean z) {
        try {
            b.a(z);
        } catch (Exception unused) {
            z.printStackTrace();
        }
    }

    public static void tagUsersName(String str) {
        b.a(str);
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0004: INVOKE (r0 I:java.lang.Exception) VIRTUAL call: java.lang.Exception.printStackTrace():void A[MD:():void (c)], block:B:6:0x0004 */
    public static void markSessionAsFavorite() {
        Exception printStackTrace;
        try {
            b.h();
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void tagScreenName(String str) {
        try {
            b.b(str);
        } catch (Exception unused) {
            str.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void addTagWithProperties(String str) {
        try {
            b.a(str, (Map) null);
        } catch (Exception unused) {
            str.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void addTagWithProperties(String str, Map map) {
        try {
            b.a(str, map);
        } catch (Exception unused) {
            str.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void addTagWithProperties(String str, JSONObject jSONObject) {
        try {
            b.a(str, m.a(jSONObject));
        } catch (Exception unused) {
            str.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startApplicationWithKeyForCordova(Activity activity, String str) {
        try {
            j.a = "CO";
            b.b(activity, str);
        } catch (Exception unused) {
            activity.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startApplicationWithKeyForCordova(Activity activity, String str, String str2) {
        try {
            j.a = "CO";
            d.b = str2;
            b.b(activity, str);
        } catch (Exception unused) {
            activity.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startWithKeyForAppcelerator(Activity activity, String str) {
        try {
            j.a = "AP";
            b.b(activity, str);
        } catch (Exception unused) {
            activity.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startWithKeyForAppcelerator(Activity activity, String str, String str2) {
        try {
            j.a = "AP";
            d.b = str2;
            b.b(activity, str);
        } catch (Exception unused) {
            activity.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopUXCamCameraVideo(Context context) {
        try {
            b.a(context);
        } catch (Exception unused) {
            context.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void startWithKeyForSegment(Activity activity, String str) {
        try {
            b.a(activity, str);
        } catch (Exception unused) {
            activity.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.uxcam.b, java.lang.Exception] */
    public static void addVerificationListener(OnVerificationListener onVerificationListener) {
        ?? a;
        try {
            a = b.a();
            a.a(onVerificationListener);
        } catch (Exception unused) {
            a.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, java.lang.Exception] */
    public static void removeVerificationListener(OnVerificationListener onVerificationListener) {
        ?? remove;
        try {
            remove = b.a().m.remove(onVerificationListener);
        } catch (Exception unused) {
            remove.printStackTrace();
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0004: INVOKE (r0 I:java.lang.Exception) VIRTUAL call: java.lang.Exception.printStackTrace():void A[MD:():void (c)], block:B:6:0x0004 */
    public static void enableDebugMode() {
        Exception printStackTrace;
        try {
            b.n();
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String, java.lang.Exception] */
    public static String urlForCurrentSession() {
        ?? i;
        try {
            i = b.i();
            return i;
        } catch (Exception unused) {
            i.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String, java.lang.Exception] */
    public static String urlForCurrentUser() {
        ?? j;
        try {
            j = b.j();
            return j;
        } catch (Exception unused) {
            j.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, java.lang.Exception] */
    public static boolean isRecording() {
        ?? k;
        try {
            k = b.k();
            return k;
        } catch (Exception unused) {
            k.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0004: INVOKE (r0 I:java.lang.Exception) VIRTUAL call: java.lang.Exception.printStackTrace():void A[MD:():void (c)], block:B:6:0x0004 */
    public static void pause() {
        Exception printStackTrace;
        try {
            b.l();
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0004: INVOKE (r0 I:java.lang.Exception) VIRTUAL call: java.lang.Exception.printStackTrace():void A[MD:():void (c)], block:B:6:0x0004 */
    public static void resume() {
        Exception printStackTrace;
        try {
            b.m();
        } catch (Exception unused) {
            printStackTrace.printStackTrace();
        }
    }

    public static void ignoreRecording() {
        d.A = true;
        stopApplicationAndUploadData();
    }
}
