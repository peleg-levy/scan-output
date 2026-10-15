package com.uxcam.e.a.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/b/e.class */
public final class e extends RuntimeException {
    private static final Method b;
    public IOException a;

    public e(IOException iOException) {
        super(iOException);
        this.a = iOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(IOException iOException, IOException iOException2) {
        if (b != null) {
            try {
                b.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        b = method;
    }
}
