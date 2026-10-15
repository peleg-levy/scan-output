package com.uxcam.e.a.b;

import com.uxcam.e.a.c.d;
import com.uxcam.e.ab;
import com.uxcam.e.ad;
import com.uxcam.e.i;
import com.uxcam.e.k;
import com.uxcam.e.q;
import com.uxcam.e.s;
import com.uxcam.e.x;
import com.uxcam.e.z;
import com.uxcam.f.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/b/c.class */
public final class c extends d.b implements i {
    public final ad a;
    private Socket m;
    public Socket b;
    public q c;
    private x n;
    public volatile com.uxcam.e.a.c.d d;
    public int e;
    public com.uxcam.f.e f;
    public com.uxcam.f.d g;
    public int h;
    public boolean j;
    public final List i = new ArrayList();
    public long k = Long.MAX_VALUE;

    public c(ad adVar) {
        this.a = adVar;
    }

    public final void a(int i, int i2, int i3, List list, boolean z) {
        if (this.n != null) {
            throw new IllegalStateException("already connected");
        }
        e eVar = null;
        b bVar = new b(list);
        if (this.a.a.i == null) {
            if (!list.contains(k.c)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.a.a.a.b;
            if (!com.uxcam.e.a.f.e.b().a(str)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        }
        while (this.n == null) {
            try {
                ad adVar = this.a;
                if (adVar.a.i != null && adVar.b.type() == Proxy.Type.HTTP) {
                    z a = new z.a().a(this.a.a.a).a("Host", com.uxcam.e.a.c.a(this.a.a.a, true)).a("Proxy-Connection", "Keep-Alive").a("User-Agent", "okhttp/3.4.1").a();
                    s sVar = a.a;
                    a(i, i2);
                    String str2 = "CONNECT " + com.uxcam.e.a.c.a(sVar, true) + " HTTP/1.1";
                    com.uxcam.e.a.d.c cVar = new com.uxcam.e.a.d.c(null, null, this.f, this.g);
                    this.f.a().a(i2, TimeUnit.MILLISECONDS);
                    this.g.a().a(i3, TimeUnit.MILLISECONDS);
                    cVar.a(a.c, str2);
                    cVar.b();
                    ab.a c = cVar.c();
                    c.a = a;
                    ab a2 = c.a();
                    long a3 = com.uxcam.e.a.d.f.a(a2.e);
                    long j = a3;
                    if (a3 == -1) {
                        j = 0;
                    }
                    com.uxcam.f.s a4 = cVar.a(j);
                    com.uxcam.e.a.c.a(a4, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                    a4.close();
                    switch (a2.b) {
                        case 200:
                            if (!this.f.b().c() || !this.g.b().c()) {
                                throw new IOException("TLS tunnel buffered too many bytes!");
                            }
                            a(bVar);
                            break;
                        case 407:
                            this.a.a.d.a();
                            throw new IOException("Failed to authenticate with proxy");
                        default:
                            throw new IOException("Unexpected response code for CONNECT: " + a2.b);
                    }
                } else {
                    a(i, i2);
                    a(bVar);
                }
            } catch (IOException e) {
                com.uxcam.e.a.c.a(this.b);
                com.uxcam.e.a.c.a(this.m);
                this.b = null;
                this.m = null;
                this.f = null;
                this.g = null;
                this.c = null;
                this.n = null;
                if (eVar == null) {
                    eVar = new e(e);
                } else {
                    e eVar2 = eVar;
                    e.a(e, eVar2.a);
                    eVar2.a = e;
                }
                if (z) {
                    bVar.d = true;
                    if (!((!bVar.c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || (!(e instanceof SSLHandshakeException) && !(e instanceof SSLProtocolException))) ? false : true)) {
                    }
                }
                throw eVar;
            }
        }
    }

    private void a(int i, int i2) {
        Proxy proxy = this.a.b;
        this.m = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? this.a.a.c.createSocket() : new Socket(proxy);
        this.m.setSoTimeout(i2);
        try {
            com.uxcam.e.a.f.e.b().a(this.m, this.a.c, i);
            this.f = l.a(l.b(this.m));
            this.g = l.a(l.a(this.m));
        } catch (ConnectException unused) {
            throw new ConnectException("Failed to connect to " + this.a.c);
        }
    }

    private void a(b bVar) {
        if (this.a.a.i != null) {
            com.uxcam.e.a aVar = this.a.a;
            try {
                try {
                    SSLSocket sSLSocket = (SSLSocket) aVar.i.createSocket(this.m, aVar.a.b, aVar.a.c, true);
                    k kVar = null;
                    int i = bVar.b;
                    int size = bVar.a.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        k kVar2 = (k) bVar.a.get(i);
                        if (kVar2.a(sSLSocket)) {
                            kVar = kVar2;
                            bVar.b = i + 1;
                            break;
                        }
                        i++;
                    }
                    if (kVar == null) {
                        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + bVar.d + ", modes=" + bVar.a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
                    }
                    bVar.c = bVar.a(sSLSocket);
                    com.uxcam.e.a.a.a.a(kVar, sSLSocket, bVar.d);
                    k kVar3 = kVar;
                    if (kVar3.e) {
                        com.uxcam.e.a.f.e.b().a(sSLSocket, aVar.a.b, aVar.e);
                    }
                    sSLSocket.startHandshake();
                    q a = q.a(sSLSocket.getSession());
                    if (!aVar.j.verify(aVar.a.b, sSLSocket.getSession())) {
                        X509Certificate x509Certificate = (X509Certificate) a.b.get(0);
                        throw new SSLPeerUnverifiedException("Hostname " + aVar.a.b + " not verified:\n    certificate: " + com.uxcam.e.g.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.uxcam.e.a.g.d.a(x509Certificate));
                    }
                    aVar.k.a(aVar.a.b, a.b);
                    String a2 = kVar3.e ? com.uxcam.e.a.f.e.b().a(sSLSocket) : null;
                    this.b = sSLSocket;
                    this.f = l.a(l.b(this.b));
                    this.g = l.a(l.a(this.b));
                    this.c = a;
                    this.n = a2 != null ? x.a(a2) : x.HTTP_1_1;
                    if (sSLSocket != null) {
                        com.uxcam.e.a.f.e.b().b(sSLSocket);
                    }
                } catch (AssertionError e) {
                    if (!com.uxcam.e.a.c.a((AssertionError) null)) {
                        throw e;
                    }
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    com.uxcam.e.a.f.e.b().b(null);
                }
                com.uxcam.e.a.c.a((Socket) null);
                throw th;
            }
        } else {
            this.n = x.HTTP_1_1;
            this.b = this.m;
        }
        if (this.n != x.SPDY_3 && this.n != x.HTTP_2) {
            this.h = 1;
            return;
        }
        this.b.setSoTimeout(0);
        d.a aVar2 = new d.a();
        Socket socket = this.b;
        String str = this.a.a.a.b;
        com.uxcam.f.e eVar = this.f;
        com.uxcam.f.d dVar = this.g;
        aVar2.a = socket;
        aVar2.b = str;
        aVar2.c = eVar;
        aVar2.d = dVar;
        aVar2.f = this.n;
        aVar2.e = this;
        com.uxcam.e.a.c.d dVar2 = new com.uxcam.e.a.c.d(aVar2, (byte) 0);
        dVar2.i.a();
        dVar2.i.b(dVar2.e);
        if (dVar2.e.b() != 65536) {
            dVar2.i.a(0, r0 - 65536);
        }
        new Thread(dVar2.j).start();
        this.h = dVar2.a();
        this.d = dVar2;
    }

    @Override // com.uxcam.e.i
    public final ad a() {
        return this.a;
    }

    public final boolean a(boolean z) {
        if (this.b.isClosed() || this.b.isInputShutdown() || this.b.isOutputShutdown()) {
            return false;
        }
        if (this.d != null || !z) {
            return true;
        }
        try {
            int soTimeout = this.b.getSoTimeout();
            try {
                this.b.setSoTimeout(1);
                if (this.f.c()) {
                    this.b.setSoTimeout(soTimeout);
                    return false;
                }
                this.b.setSoTimeout(soTimeout);
                return true;
            } catch (Throwable th) {
                this.b.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // com.uxcam.e.a.c.d.b
    public final void a(com.uxcam.e.a.c.e eVar) {
        eVar.a(com.uxcam.e.a.c.a.REFUSED_STREAM);
    }

    @Override // com.uxcam.e.a.c.d.b
    public final void a(com.uxcam.e.a.c.d dVar) {
        this.h = dVar.a();
    }

    public final String toString() {
        return "Connection{" + this.a.a.a.b + ":" + this.a.a.a.c + ", proxy=" + this.a.b + " hostAddress=" + this.a.c + " cipherSuite=" + (this.c != null ? this.c.a : "none") + " protocol=" + this.n + '}';
    }
}
