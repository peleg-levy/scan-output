package com.uxcam.e.a.f;

import com.uxcam.e.w;
import com.uxcam.e.x;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/f/e.class */
public class e {
    static final e c;
    private static final Logger a;

    public static e b() {
        return c;
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
    }

    public void b(SSLSocket sSLSocket) {
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(int i, String str, Throwable th) {
        a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public boolean a(String str) {
        return true;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x xVar = (x) list.get(i);
            if (xVar != x.HTTP_1_0) {
                arrayList.add(xVar.toString());
            }
        }
        return arrayList;
    }

    public com.uxcam.e.a.g.b a(X509TrustManager x509TrustManager) {
        return new com.uxcam.e.a.g.a(com.uxcam.e.a.g.e.a(x509TrustManager));
    }

    static {
        e eVar;
        e a2 = a.a();
        if (a2 != null) {
            eVar = a2;
        } else {
            b a3 = b.a();
            if (a3 != null) {
                eVar = a3;
            } else {
                e a4 = c.a();
                eVar = a4 != null ? a4 : new e();
            }
        }
        c = eVar;
        a = Logger.getLogger(w.class.getName());
    }
}
