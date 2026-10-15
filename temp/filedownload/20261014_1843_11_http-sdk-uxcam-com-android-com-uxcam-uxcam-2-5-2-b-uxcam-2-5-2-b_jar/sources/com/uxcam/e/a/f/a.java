package com.uxcam.e.a.f;

import android.util.Log;
import com.uxcam.e.x;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/f/a.class */
final class a extends e {
    private final Class a;
    private final d b;
    private final d d;
    private final d e;
    private final d f;

    /* renamed from: com.uxcam.e.a.f.a$a, reason: collision with other inner class name */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/f/a$a.class */
    static final class C0001a extends com.uxcam.e.a.g.b {
        private final Object a;
        private final Method b;

        C0001a(Object obj, Method method) {
            this.a = obj;
            this.b = method;
        }

        @Override // com.uxcam.e.a.g.b
        public final List a(List list, String str) {
            try {
                return (List) this.b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }
    }

    private a(Class cls, d dVar, d dVar2, d dVar3, d dVar4) {
        this.a = cls;
        this.b = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f = dVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.uxcam.e.a.f.e
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!com.uxcam.e.a.c.a((AssertionError) socket)) {
                throw e;
            }
            throw new IOException(e);
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // com.uxcam.e.a.f.e
    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.b.a(sSLSocket, true);
            this.d.a(sSLSocket, str);
        }
        if (this.f == null || !this.f.a(sSLSocket)) {
            return;
        }
        Object[] objArr = new Object[1];
        com.uxcam.f.c cVar = new com.uxcam.f.c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x xVar = (x) list.get(i);
            if (xVar != x.HTTP_1_0) {
                cVar.h(xVar.toString().length());
                cVar.b(xVar.toString());
            }
        }
        objArr[0] = cVar.m();
        this.f.b(sSLSocket, objArr);
    }

    @Override // com.uxcam.e.a.f.e
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.e == null || !this.e.a(sSLSocket) || (bArr = (byte[]) this.e.b(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, com.uxcam.e.a.c.c);
    }

    @Override // com.uxcam.e.a.f.e
    public final void a(int i, String str, Throwable th) {
        int min;
        int i2 = i == 5 ? 5 : 3;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            int i4 = indexOf != -1 ? indexOf : length;
            do {
                min = Math.min(i4, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                i3 = min;
            } while (min < i4);
            i3++;
        }
    }

    @Override // com.uxcam.e.a.f.e
    public final boolean a(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.a(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // com.uxcam.e.a.f.e
    public final com.uxcam.e.a.g.b a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0001a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public static e a() {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            d dVar = new d(null, "setUseSessionTickets", Boolean.TYPE);
            d dVar2 = new d(null, "setHostname", String.class);
            d dVar3 = null;
            d dVar4 = null;
            try {
                Class.forName("android.net.Network");
                dVar3 = new d(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                dVar4 = new d(null, "setAlpnProtocols", byte[].class);
            } catch (ClassNotFoundException unused2) {
            }
            return new a(cls, dVar, dVar2, dVar3, dVar4);
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }
}
