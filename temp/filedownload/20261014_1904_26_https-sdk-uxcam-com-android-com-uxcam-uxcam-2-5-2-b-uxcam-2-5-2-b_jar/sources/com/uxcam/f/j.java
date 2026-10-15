package com.uxcam.f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/j.class */
public final class j implements s {
    private final e b;
    private final Inflater c;
    private final k d;
    private int a = 0;
    private final CRC32 e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.c = new Inflater(true);
        this.b = l.a(sVar);
        this.d = new k(this.b, this.c);
    }

    @Override // com.uxcam.f.s
    public final long a(c cVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.a == 0) {
            this.b.a(10L);
            byte b = this.b.b().b(3L);
            boolean z = ((b >> 1) & 1) == 1;
            boolean z2 = z;
            if (z) {
                a(this.b.b(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.b.e());
            this.b.f(8L);
            if (((b >> 2) & 1) == 1) {
                this.b.a(2L);
                if (z2) {
                    a(this.b.b(), 0L, 2L);
                }
                short g = this.b.b().g();
                this.b.a(g);
                if (z2) {
                    a(this.b.b(), 0L, g);
                }
                this.b.f(g);
            }
            if (((b >> 3) & 1) == 1) {
                long a = this.b.a((byte) 0);
                if (a == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    a(this.b.b(), 0L, a + 1);
                }
                this.b.f(a + 1);
            }
            if (((b >> 4) & 1) == 1) {
                long a2 = this.b.a((byte) 0);
                if (a2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    a(this.b.b(), 0L, a2 + 1);
                }
                this.b.f(a2 + 1);
            }
            if (z2) {
                a("FHCRC", this.b.g(), (short) this.e.getValue());
                this.e.reset();
            }
            this.a = 1;
        }
        if (this.a == 1) {
            long j2 = cVar.b;
            long a3 = this.d.a(cVar, j);
            if (a3 != -1) {
                a(cVar, j2, a3);
                return a3;
            }
            this.a = 2;
        }
        if (this.a != 2) {
            return -1L;
        }
        a("CRC", this.b.h(), (int) this.e.getValue());
        a("ISIZE", this.b.h(), this.c.getTotalOut());
        this.a = 3;
        if (this.b.c()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // com.uxcam.f.s
    public final t a() {
        return this.b.a();
    }

    @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    private void a(c cVar, long j, long j2) {
        o oVar;
        o oVar2 = cVar.a;
        while (true) {
            oVar = oVar2;
            if (j < oVar.c - oVar.b) {
                break;
            }
            j -= oVar.c - oVar.b;
            oVar2 = oVar.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(oVar.c - r0, j2);
            this.e.update(oVar.a, (int) (oVar.b + j), min);
            j2 -= min;
            j = 0;
            oVar = oVar.f;
        }
    }

    private static void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
