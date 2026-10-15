package com.uxcam.e.a.c;

import com.uxcam.e.a.c.b;
import com.uxcam.e.a.c.h;
import com.uxcam.f.s;
import com.uxcam.f.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/i.class */
public final class i implements q {
    private static final Logger a = Logger.getLogger(b.class.getName());
    private static final com.uxcam.f.f b = com.uxcam.f.f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/i$a.class */
    public static final class a implements s {
        private final com.uxcam.f.e f;
        int a;
        byte b;
        int c;
        int d;
        short e;

        public a(com.uxcam.f.e eVar) {
            this.f = eVar;
        }

        @Override // com.uxcam.f.s
        public final long a(com.uxcam.f.c cVar, long j) {
            while (this.d == 0) {
                this.f.f(this.e);
                this.e = (short) 0;
                if ((this.b & 4) != 0) {
                    return -1L;
                }
                int i = this.c;
                int a = i.a(this.f);
                this.d = a;
                this.a = a;
                byte d = (byte) (this.f.d() & 255);
                this.b = (byte) (this.f.d() & 255);
                if (i.a.isLoggable(Level.FINE)) {
                    i.a.fine(b.a(true, this.c, this.a, d, this.b));
                }
                this.c = this.f.f() & Integer.MAX_VALUE;
                if (d != 9) {
                    throw i.c("%s != TYPE_CONTINUATION", Byte.valueOf(d));
                }
                if (this.c != i) {
                    throw i.c("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            long a2 = this.f.a(cVar, Math.min(j, this.d));
            if (a2 == -1) {
                return -1L;
            }
            this.d = (int) (this.d - a2);
            return a2;
        }

        @Override // com.uxcam.f.s
        public final t a() {
            return this.f.a();
        }

        @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/i$b.class */
    public static final class b {
        private static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        private static final String[] b = new String[64];
        private static final String[] c = new String[256];

        b() {
        }

        static String a(boolean z, int i, int i2, byte b2, byte b3) {
            String str;
            String a2 = b2 < a.length ? a[b2] : com.uxcam.e.a.c.a("0x%02x", Byte.valueOf(b2));
            if (b3 != 0) {
                switch (b2) {
                    case 2:
                    case 3:
                    case 7:
                    case 8:
                        str = c[b3];
                        break;
                    case 4:
                    case 6:
                        if (b3 != 1) {
                            str = c[b3];
                            break;
                        } else {
                            str = "ACK";
                            break;
                        }
                    case 5:
                    default:
                        String str2 = b3 < b.length ? b[b3] : c[b3];
                        if (b2 == 5 && (b3 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                            break;
                        } else if (b2 == 0 && (b3 & 32) != 0) {
                            str = str2.replace("PRIORITY", "COMPRESSED");
                            break;
                        } else {
                            str = str2;
                            break;
                        }
                        break;
                }
            } else {
                str = "";
            }
            String str3 = str;
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = a2;
            objArr[4] = str3;
            return com.uxcam.e.a.c.a("%s 0x%08x %5d %-13s %s", objArr);
        }

        static {
            for (int i = 0; i < c.length; i++) {
                c[i] = com.uxcam.e.a.c.a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
            }
            b[0] = "";
            b[1] = "END_STREAM";
            int[] iArr = {1};
            b[8] = "PADDED";
            for (int i2 = 0; i2 <= 0; i2++) {
                int i3 = iArr[i2];
                b[i3 | 8] = b[i3] + "|PADDED";
            }
            b[4] = "END_HEADERS";
            b[32] = "PRIORITY";
            b[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                for (int i6 = 0; i6 <= 0; i6++) {
                    int i7 = iArr[i6];
                    b[i7 | i5] = b[i7] + '|' + b[i5];
                    b[i7 | i5 | 8] = b[i7] + '|' + b[i5] + "|PADDED";
                }
            }
            for (int i8 = 0; i8 < b.length; i8++) {
                if (b[i8] == null) {
                    b[i8] = c[i8];
                }
            }
        }
    }

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/i$c.class */
    static final class c implements com.uxcam.e.a.c.b {
        private final com.uxcam.f.e b;
        private final a c;
        private final boolean d;
        final h.a a;

        c(com.uxcam.f.e eVar, boolean z) {
            this.b = eVar;
            this.d = z;
            this.c = new a(this.b);
            this.a = new h.a(this.c);
        }

        @Override // com.uxcam.e.a.c.b
        public final void a() {
            if (this.d) {
                return;
            }
            com.uxcam.f.f c = this.b.c(i.b.e());
            if (i.a.isLoggable(Level.FINE)) {
                i.a.fine(com.uxcam.e.a.c.a("<< CONNECTION %s", c.c()));
            }
            if (!i.b.equals(c)) {
                throw i.c("Expected a connection header but was %s", c.a());
            }
        }

        @Override // com.uxcam.e.a.c.b
        public final boolean a(b.a aVar) {
            try {
                this.b.a(9L);
                int a = i.a(this.b);
                if (a < 0 || a > 16384) {
                    throw i.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
                }
                byte d = (byte) (this.b.d() & 255);
                byte d2 = (byte) (this.b.d() & 255);
                int f = this.b.f() & Integer.MAX_VALUE;
                if (i.a.isLoggable(Level.FINE)) {
                    i.a.fine(b.a(true, f, a, d, d2));
                }
                switch (d) {
                    case 0:
                        boolean z = (d2 & 1) != 0;
                        if ((d2 & 32) != 0) {
                            throw i.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                        short d3 = (d2 & 8) != 0 ? (short) (this.b.d() & 255) : (short) 0;
                        aVar.a(z, f, this.b, i.a(a, d2, d3));
                        this.b.f(d3);
                        return true;
                    case 1:
                        int i = a;
                        if (f == 0) {
                            throw i.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                        boolean z2 = (d2 & 1) != 0;
                        short d4 = (d2 & 8) != 0 ? (short) (this.b.d() & 255) : (short) 0;
                        if ((d2 & 32) != 0) {
                            b();
                            i -= 5;
                        }
                        aVar.a(false, z2, f, a(i.a(i, d2, d4), d4, d2, f), g.HTTP_20_HEADERS);
                        return true;
                    case 2:
                        if (a != 5) {
                            throw i.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        }
                        if (f == 0) {
                            throw i.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                        b();
                        return true;
                    case 3:
                        if (a != 4) {
                            throw i.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                        }
                        if (f == 0) {
                            throw i.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                        int f2 = this.b.f();
                        com.uxcam.e.a.c.a b = com.uxcam.e.a.c.a.b(f2);
                        if (b == null) {
                            throw i.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(f2));
                        }
                        aVar.a(f, b);
                        return true;
                    case 4:
                        if (f != 0) {
                            throw i.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        }
                        if ((d2 & 1) != 0) {
                            if (a != 0) {
                                throw i.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                            return true;
                        }
                        if (a % 6 != 0) {
                            throw i.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                        }
                        n nVar = new n();
                        for (int i2 = 0; i2 < a; i2 += 6) {
                            short e = this.b.e();
                            int f3 = this.b.f();
                            switch (e) {
                                case 2:
                                    if (f3 != 0 && f3 != 1) {
                                        throw i.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                    break;
                                case 3:
                                    e = 4;
                                    break;
                                case 4:
                                    e = 7;
                                    if (f3 < 0) {
                                        throw i.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    }
                                    break;
                                case 5:
                                    if (f3 < 16384 || f3 > 16777215) {
                                        throw i.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(f3));
                                    }
                                    break;
                            }
                            nVar.a(e, 0, f3);
                        }
                        aVar.a(false, nVar);
                        return true;
                    case 5:
                        if (f == 0) {
                            throw i.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                        short d5 = (d2 & 8) != 0 ? (short) (this.b.d() & 255) : (short) 0;
                        aVar.a(this.b.f() & Integer.MAX_VALUE, a(i.a(a - 4, d2, d5), d5, d2, f));
                        return true;
                    case 6:
                        if (a != 8) {
                            throw i.c("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        }
                        if (f != 0) {
                            throw i.c("TYPE_PING streamId != 0", new Object[0]);
                        }
                        aVar.a((d2 & 1) != 0, this.b.f(), this.b.f());
                        return true;
                    case 7:
                        if (a < 8) {
                            throw i.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        }
                        if (f != 0) {
                            throw i.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                        int f4 = this.b.f();
                        int f5 = this.b.f();
                        int i3 = a - 8;
                        if (com.uxcam.e.a.c.a.b(f5) == null) {
                            throw i.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(f5));
                        }
                        com.uxcam.f.f fVar = com.uxcam.f.f.b;
                        if (i3 > 0) {
                            fVar = this.b.c(i3);
                        }
                        aVar.a(f4, fVar);
                        return true;
                    case 8:
                        if (a != 4) {
                            throw i.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                        }
                        if ((this.b.f() & 2147483647L) == 0) {
                            throw i.c("windowSizeIncrement was 0", Long.valueOf(f));
                        }
                        aVar.a(f, f);
                        return true;
                    default:
                        this.b.f(a);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        private List a(int i, short s, byte b, int i2) {
            a aVar = this.c;
            this.c.d = i;
            aVar.a = i;
            this.c.e = s;
            this.c.b = b;
            this.c.c = i2;
            h.a aVar2 = this.a;
            while (!aVar2.b.c()) {
                int d = aVar2.b.d() & 255;
                if (d == 128) {
                    throw new IOException("index == 0");
                }
                if ((d & 128) == 128) {
                    int a = aVar2.a(d, 127) - 1;
                    if (h.a.c(a)) {
                        aVar2.a.add(h.a[a]);
                    } else {
                        int a2 = aVar2.a(a - h.a.length);
                        if (a2 < 0 || a2 > aVar2.e.length - 1) {
                            throw new IOException("Header index too large " + (a + 1));
                        }
                        aVar2.a.add(aVar2.e[a2]);
                    }
                } else if (d == 64) {
                    aVar2.a(new f(h.a(aVar2.b()), aVar2.b()));
                } else if ((d & 64) == 64) {
                    aVar2.a(new f(aVar2.b(aVar2.a(d, 63) - 1), aVar2.b()));
                } else if ((d & 32) == 32) {
                    aVar2.d = aVar2.a(d, 31);
                    if (aVar2.d < 0 || aVar2.d > aVar2.c) {
                        throw new IOException("Invalid dynamic table size update " + aVar2.d);
                    }
                    aVar2.a();
                } else if (d == 16 || d == 0) {
                    aVar2.a.add(new f(h.a(aVar2.b()), aVar2.b()));
                } else {
                    aVar2.a.add(new f(aVar2.b(aVar2.a(d, 15) - 1), aVar2.b()));
                }
            }
            h.a aVar3 = this.a;
            ArrayList arrayList = new ArrayList(aVar3.a);
            aVar3.a.clear();
            return arrayList;
        }

        private void b() {
            this.b.f();
            this.b.d();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
        }
    }

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/i$d.class */
    static final class d implements com.uxcam.e.a.c.c {
        private final com.uxcam.f.d b;
        private final boolean c;
        private boolean f;
        private final com.uxcam.f.c d = new com.uxcam.f.c();
        final h.b a = new h.b(this.d);
        private int e = 16384;

        d(com.uxcam.f.d dVar, boolean z) {
            this.b = dVar;
            this.c = z;
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void b() {
            if (this.f) {
                throw new IOException("closed");
            }
            this.b.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(n nVar) {
            if (this.f) {
                throw new IOException("closed");
            }
            this.e = (32 & nVar.a) != 0 ? nVar.d[5] : this.e;
            if (nVar.a() >= 0) {
                this.a.a(nVar.a());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.b.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a() {
            if (this.f) {
                throw new IOException("closed");
            }
            if (this.c) {
                if (i.a.isLoggable(Level.FINE)) {
                    i.a.fine(com.uxcam.e.a.c.a(">> CONNECTION %s", i.b.c()));
                }
                this.b.b(i.b.f());
                this.b.flush();
            }
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(boolean z, int i, List list) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (this.f) {
                throw new IOException("closed");
            }
            this.a.a(list);
            long j = this.d.b;
            int min = (int) Math.min(this.e, j);
            byte b = j == ((long) min) ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            a(i, min, (byte) 1, b);
            this.b.a_(this.d, min);
            if (j > min) {
                b(i, j - min);
            }
        }

        private void b(int i, long j) {
            while (j > 0) {
                int min = (int) Math.min(this.e, j);
                j -= min;
                a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.b.a_(this.d, min);
            }
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(int i, com.uxcam.e.a.c.a aVar) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (aVar.s == -1) {
                throw new IllegalArgumentException();
            }
            a(i, 4, (byte) 3, (byte) 0);
            this.b.f(aVar.s);
            this.b.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final int c() {
            return this.e;
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(boolean z, int i, com.uxcam.f.c cVar, int i2) {
            if (this.f) {
                throw new IOException("closed");
            }
            byte b = 0;
            if (z) {
                b = 1;
            }
            a(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.b.a_(cVar, i2);
            }
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void b(n nVar) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, Integer.bitCount(nVar.a) * 6, (byte) 4, (byte) 0);
            for (int i = 0; i < 10; i++) {
                if (nVar.a(i)) {
                    int i2 = i;
                    int i3 = i2;
                    if (i2 == 4) {
                        i3 = 3;
                    } else if (i3 == 7) {
                        i3 = 4;
                    }
                    this.b.g(i3);
                    this.b.f(nVar.d[i]);
                }
            }
            this.b.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(boolean z, int i, int i2) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.b.f(i);
            this.b.f(i2);
            this.b.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(int i, com.uxcam.e.a.c.a aVar, byte[] bArr) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (aVar.s == -1) {
                throw i.b("errorCode.httpCode == -1", new Object[0]);
            }
            a(0, 8 + bArr.length, (byte) 7, (byte) 0);
            this.b.f(i);
            this.b.f(aVar.s);
            if (bArr.length > 0) {
                this.b.b(bArr);
            }
            this.b.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(int i, long j) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw i.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
            }
            a(i, 4, (byte) 8, (byte) 0);
            this.b.f((int) j);
            this.b.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            this.f = true;
            this.b.close();
        }

        private void a(int i, int i2, byte b, byte b2) {
            if (i.a.isLoggable(Level.FINE)) {
                i.a.fine(b.a(false, i, i2, b, b2));
            }
            if (i2 > this.e) {
                throw i.b("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(i2)});
            }
            if ((i & Integer.MIN_VALUE) != 0) {
                throw i.b("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
            }
            i.a(this.b, i2);
            this.b.h(b & 255);
            this.b.h(b2 & 255);
            this.b.f(i & Integer.MAX_VALUE);
        }
    }

    @Override // com.uxcam.e.a.c.q
    public final com.uxcam.e.a.c.b a(com.uxcam.f.e eVar, boolean z) {
        return new c(eVar, z);
    }

    @Override // com.uxcam.e.a.c.q
    public final com.uxcam.e.a.c.c a(com.uxcam.f.d dVar, boolean z) {
        return new d(dVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException c(String str, Object... objArr) {
        throw new IOException(com.uxcam.e.a.c.a(str, objArr));
    }

    static /* synthetic */ int a(com.uxcam.f.e eVar) {
        return ((eVar.d() & 255) << 16) | ((eVar.d() & 255) << 8) | (eVar.d() & 255);
    }

    static /* synthetic */ int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s > i) {
            throw c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        }
        return (short) (i - s);
    }

    static /* synthetic */ IllegalArgumentException b(String str, Object[] objArr) {
        throw new IllegalArgumentException(com.uxcam.e.a.c.a(str, objArr));
    }

    static /* synthetic */ void a(com.uxcam.f.d dVar, int i) {
        dVar.h((i >>> 16) & 255);
        dVar.h((i >>> 8) & 255);
        dVar.h(i & 255);
    }
}
