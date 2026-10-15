package com.uxcam.j;

import android.app.Dialog;
import android.content.Context;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/n.class */
public class n {
    protected static final String a = n.class.getSimpleName();
    public Dialog c;
    public Context e;
    public f f;
    int b = -1;
    boolean d = false;

    public n(Context context, f fVar) {
        this.e = context;
        this.f = fVar;
    }

    public final void a() {
        if (this.c != null) {
            try {
                this.c.dismiss();
            } catch (Exception unused) {
            }
        }
    }
}
