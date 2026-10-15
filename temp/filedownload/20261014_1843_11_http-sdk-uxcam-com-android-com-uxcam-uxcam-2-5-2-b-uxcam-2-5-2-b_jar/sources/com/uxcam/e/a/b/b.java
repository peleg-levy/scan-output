package com.uxcam.e.a.b;

import com.uxcam.e.k;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/b/b.class */
public final class b {
    final List a;
    int b = 0;
    boolean c;
    boolean d;

    public b(List list) {
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(SSLSocket sSLSocket) {
        for (int i = this.b; i < this.a.size(); i++) {
            if (((k) this.a.get(i)).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
