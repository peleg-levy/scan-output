package com.uxcam.f;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/l.class */
public final class l {
    static final Logger a = Logger.getLogger(l.class.getName());

    private l() {
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    public static r a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        final a c = c(socket);
        final OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new r() { // from class: com.uxcam.f.a.1
            final /* synthetic */ r a;

            public AnonymousClass1(r rVar) {
                r5 = rVar;
            }

            @Override // com.uxcam.f.r
            public final void a_(c cVar, long j) {
                u.a(cVar.b, 0L, j);
                while (j > 0) {
                    long j2 = 0;
                    o oVar = cVar.a;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        long j3 = j2 + (cVar.a.c - cVar.a.b);
                        j2 = j3;
                        if (j3 >= j) {
                            j2 = j;
                            break;
                        }
                    }
                    a.this.a_();
                    try {
                        try {
                            r5.a_(cVar, j2);
                            j -= j2;
                            a.this.a(true);
                        } catch (IOException e) {
                            throw a.this.b(e);
                        }
                    } catch (Throwable th) {
                        a.this.a(false);
                        throw th;
                    }
                }
            }

            @Override // com.uxcam.f.r, java.io.Flushable
            public final void flush() {
                a.this.a_();
                try {
                    try {
                        r5.flush();
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }

            @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                a.this.a_();
                try {
                    try {
                        r5.close();
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }

            @Override // com.uxcam.f.r
            public final t a() {
                return a.this;
            }

            public final String toString() {
                return "AsyncTimeout.sink(" + r5 + ")";
            }
        };
    }

    private static s a(final InputStream inputStream, final t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new s() { // from class: com.uxcam.f.l.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v21, types: [long] */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            @Override // com.uxcam.f.s
            public final long a(c cVar, long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("byteCount < 0: " + j);
                }
                AssertionError assertionError = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (assertionError == 0) {
                    return 0L;
                }
                try {
                    t.this.f();
                    o e = cVar.e(1);
                    int read = inputStream.read(e.a, e.c, (int) Math.min(j, 8192 - e.c));
                    if (read == -1) {
                        return -1L;
                    }
                    e.c += read;
                    cVar.b += read;
                    assertionError = read;
                    return assertionError;
                } catch (AssertionError e2) {
                    if (l.a(assertionError)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }

            @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                inputStream.close();
            }

            @Override // com.uxcam.f.s
            public final t a() {
                return t.this;
            }

            public final String toString() {
                return "source(" + inputStream + ")";
            }
        };
    }

    public static s a(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileInputStream(file), new t());
    }

    public static s b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        a c = c(socket);
        return new s() { // from class: com.uxcam.f.a.2
            final /* synthetic */ s a;

            public AnonymousClass2(s sVar) {
                r5 = sVar;
            }

            @Override // com.uxcam.f.s
            public final long a(c cVar, long j) {
                boolean z = false;
                a.this.a_();
                try {
                    try {
                        long a2 = r5.a(cVar, j);
                        z = true;
                        a.this.a(true);
                        return a2;
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(z);
                    throw th;
                }
            }

            @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    try {
                        r5.close();
                        a.this.a(true);
                    } catch (IOException e) {
                        throw a.this.b(e);
                    }
                } catch (Throwable th) {
                    a.this.a(false);
                    throw th;
                }
            }

            @Override // com.uxcam.f.s
            public final t a() {
                return a.this;
            }

            public final String toString() {
                return "AsyncTimeout.source(" + r5 + ")";
            }
        };
    }

    private static a c(final Socket socket) {
        return new a() { // from class: com.uxcam.f.l.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.uxcam.f.a
            public final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.net.Socket, java.lang.AssertionError] */
            @Override // com.uxcam.f.a
            public final void a() {
                ?? r0;
                try {
                    r0 = socket;
                    r0.close();
                } catch (AssertionError e) {
                    if (!l.a((AssertionError) r0)) {
                        throw e;
                    }
                    l.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                } catch (Exception e2) {
                    l.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                }
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
