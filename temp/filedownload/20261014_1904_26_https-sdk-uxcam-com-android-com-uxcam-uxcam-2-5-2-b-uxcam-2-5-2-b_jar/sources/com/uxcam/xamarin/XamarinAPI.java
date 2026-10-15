package com.uxcam.xamarin;

import android.content.Context;
import android.view.View;
import com.uxcam.b;
import com.uxcam.j.j;
import java.util.Map;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/xamarin/XamarinAPI.class */
public class XamarinAPI {
    public static void startWithKey(String str) {
        j.a = "XA";
        b.a(str, true);
    }

    public static void stopApplicationAndUploadData() {
        b.e();
    }

    public static void stopUxcamCameraVideo(Context context) {
        b.a(context);
    }

    public static void tagUsersName(String str) {
        b.a(str);
    }

    public static void tagScreenName(String str) {
        b.b(str);
    }

    public static void markUserAsFavorite() {
        b.h();
    }

    public static void addTag(String str) {
        b.a(str, (Map) null);
    }

    public static void occludeSensitiveView(View view) {
        b.a(view);
    }
}
