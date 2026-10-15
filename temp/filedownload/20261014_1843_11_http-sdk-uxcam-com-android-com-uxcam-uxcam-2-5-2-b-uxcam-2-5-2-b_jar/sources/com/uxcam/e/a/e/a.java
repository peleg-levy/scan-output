package com.uxcam.e.a.e;

import java.io.File;
import java.io.IOException;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/e/a.class */
public interface a {
    public static final a a = new a() { // from class: com.uxcam.e.a.e.a.1
        @Override // com.uxcam.e.a.e.a
        public final void a(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }
    };

    void a(File file);
}
