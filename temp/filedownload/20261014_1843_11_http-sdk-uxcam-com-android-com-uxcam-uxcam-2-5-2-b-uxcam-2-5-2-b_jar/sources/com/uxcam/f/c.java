package com.uxcam.f;

import java.io.EOFException;
import java.nio.charset.Charset;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/c.class */
public final class c implements d, e, Cloneable {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    o a;
    public long b;

    @Override // com.uxcam.f.d, com.uxcam.f.e
    public final c b() {
        return this;
    }

    @Override // com.uxcam.f.e
    public final boolean c() {
        return this.b == 0;
    }

    @Override // com.uxcam.f.e
    public final void a(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final c a(c cVar, long j, long j2) {
        o oVar;
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        u.a(this.b, j, j2);
        if (j2 == 0) {
            return this;
        }
        cVar.b += j2;
        o oVar2 = this.a;
        while (true) {
            oVar = oVar2;
            if (j < oVar.c - oVar.b) {
                break;
            }
            j -= oVar.c - oVar.b;
            oVar2 = oVar.f;
        }
        while (j2 > 0) {
            o oVar3 = new o(oVar);
            oVar3.b = (int) (oVar3.b + j);
            oVar3.c = Math.min(oVar3.b + ((int) j2), oVar3.c);
            if (cVar.a == null) {
                oVar3.g = oVar3;
                oVar3.f = oVar3;
                cVar.a = oVar3;
            } else {
                cVar.a.g.a(oVar3);
            }
            j2 -= oVar3.c - oVar3.b;
            j = 0;
            oVar = oVar.f;
        }
        return this;
    }

    @Override // com.uxcam.f.e
    public final byte d() {
        if (this.b == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.a;
        int i = oVar.b;
        int i2 = oVar.c;
        int i3 = i + 1;
        byte b = oVar.a[i];
        this.b--;
        if (i3 == i2) {
            this.a = oVar.a();
            p.a(oVar);
        } else {
            oVar.b = i3;
        }
        return b;
    }

    public final byte b(long j) {
        u.a(this.b, j, 1L);
        o oVar = this.a;
        while (true) {
            o oVar2 = oVar;
            int i = oVar2.c - oVar2.b;
            if (j < i) {
                return oVar2.a[oVar2.b + ((int) j)];
            }
            j -= i;
            oVar = oVar2.f;
        }
    }

    @Override // com.uxcam.f.e
    public final short e() {
        if (this.b < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        o oVar = this.a;
        int i = oVar.b;
        int i2 = oVar.c;
        if (i2 - i < 2) {
            return (short) (((d() & 255) << 8) | (d() & 255));
        }
        byte[] bArr = oVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.b -= 2;
        if (i4 == i2) {
            this.a = oVar.a();
            p.a(oVar);
        } else {
            oVar.b = i4;
        }
        return (short) i5;
    }

    @Override // com.uxcam.f.e
    public final int f() {
        if (this.b < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        o oVar = this.a;
        int i = oVar.b;
        int i2 = oVar.c;
        if (i2 - i < 4) {
            return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
        }
        byte[] bArr = oVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.b -= 4;
        if (i8 == i2) {
            this.a = oVar.a();
            p.a(oVar);
        } else {
            oVar.b = i8;
        }
        return i9;
    }

    @Override // com.uxcam.f.e
    public final short g() {
        return u.a(e());
    }

    @Override // com.uxcam.f.e
    public final int h() {
        return u.a(f());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127 A[EDGE_INSN: B:46:0x0127->B:43:0x0127 BREAK  A[LOOP:0: B:7:0x001a->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    @Override // com.uxcam.f.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.f.c.i():long");
    }

    public final f j() {
        return new f(m());
    }

    @Override // com.uxcam.f.e
    public final f c(long j) {
        return new f(e(j));
    }

    public final String k() {
        try {
            return a(this.b, u.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private String k(long j) {
        return a(j, u.a);
    }

    private String a(long j, Charset charset) {
        u.a(this.b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        o oVar = this.a;
        if (oVar.b + j > oVar.c) {
            return new String(e(j), charset);
        }
        String str = new String(oVar.a, oVar.b, (int) j, charset);
        oVar.b = (int) (oVar.b + j);
        this.b -= j;
        if (oVar.b == oVar.c) {
            this.a = oVar.a();
            p.a(oVar);
        }
        return str;
    }

    @Override // com.uxcam.f.e
    public final String l() {
        long a = a((byte) 10, 0L);
        if (a != -1) {
            return d(a);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: size=" + this.b + " content=" + cVar.j().c() + "…");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(long j) {
        if (j <= 0 || b(j - 1) != 13) {
            String k = k(j);
            f(1L);
            return k;
        }
        String k2 = k(j - 1);
        f(2L);
        return k2;
    }

    @Override // com.uxcam.f.e
    public final byte[] m() {
        try {
            return e(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.uxcam.f.e
    public final byte[] e(long j) {
        u.a(this.b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        c(bArr);
        return bArr;
    }

    private void c(byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return;
            }
            int length = bArr.length - i3;
            u.a(bArr.length, i3, length);
            o oVar = this.a;
            if (oVar == null) {
                i = -1;
            } else {
                int min = Math.min(length, oVar.c - oVar.b);
                System.arraycopy(oVar.a, oVar.b, bArr, i3, min);
                oVar.b += min;
                this.b -= min;
                if (oVar.b == oVar.c) {
                    this.a = oVar.a();
                    p.a(oVar);
                }
                i = min;
            }
            int i4 = i;
            if (i == -1) {
                throw new EOFException();
            }
            i2 = i3 + i4;
        }
    }

    public final void n() {
        try {
            f(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.uxcam.f.e
    public final void f(long j) {
        while (j > 0) {
            if (this.a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, this.a.c - this.a.b);
            this.b -= min;
            j -= min;
            this.a.b += min;
            if (this.a.b == this.a.c) {
                o oVar = this.a;
                this.a = oVar.a();
                p.a(oVar);
            }
        }
    }

    @Override // com.uxcam.f.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.a(this);
        return this;
    }

    @Override // com.uxcam.f.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str) {
        return a(str, 0, str.length());
    }

    public final c a(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                o e = e(1);
                byte[] bArr = e.a;
                int i3 = e.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i;
                i++;
                bArr[i3 + i4] = (byte) charAt2;
                while (i < min && (charAt = str.charAt(i)) < 128) {
                    int i5 = i;
                    i++;
                    bArr[i3 + i5] = (byte) charAt;
                }
                int i6 = (i + i3) - e.c;
                e.c += i6;
                this.b += i6;
            } else if (charAt2 < 2048) {
                h((charAt2 >> 6) | 192);
                h((charAt2 & '?') | 128);
                i++;
            } else if (charAt2 < 55296 || charAt2 > 57343) {
                h((charAt2 >> '\f') | 224);
                h(((charAt2 >> 6) & 63) | 128);
                h((charAt2 & '?') | 128);
                i++;
            } else {
                char charAt3 = i + 1 < i2 ? str.charAt(i + 1) : (char) 0;
                if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                    h(63);
                    i++;
                } else {
                    int i7 = 65536 + (((charAt2 & 10239) << 10) | (charAt3 & 9215));
                    h((i7 >> 18) | 240);
                    h(((i7 >> 12) & 63) | 128);
                    h(((i7 >> 6) & 63) | 128);
                    h((i7 & 63) | 128);
                    i += 2;
                }
            }
        }
        return this;
    }

    public final c a(int i) {
        if (i < 128) {
            h(i);
        } else if (i < 2048) {
            h((i >> 6) | 192);
            h((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
            }
            h((i >> 12) | 224);
            h(((i >> 6) & 63) | 128);
            h((i & 63) | 128);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
            }
            h((i >> 18) | 240);
            h(((i >> 12) & 63) | 128);
            h(((i >> 6) & 63) | 128);
            h((i & 63) | 128);
        }
        return this;
    }

    @Override // com.uxcam.f.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return b(bArr, 0, bArr.length);
    }

    @Override // com.uxcam.f.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        u.a(bArr.length, i, i2);
        int i3 = i + i2;
        while (i < i3) {
            o e = e(1);
            int min = Math.min(i3 - i, 8192 - e.c);
            System.arraycopy(bArr, i, e.a, e.c, min);
            i += min;
            e.c += min;
        }
        this.b += i2;
        return this;
    }

    @Override // com.uxcam.f.d
    public final long a(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long j2 = j;
            long a = sVar.a(this, 8192L);
            if (a == -1) {
                return j2;
            }
            j = j2 + a;
        }
    }

    @Override // com.uxcam.f.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c h(int i) {
        o e = e(1);
        byte[] bArr = e.a;
        int i2 = e.c;
        e.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // com.uxcam.f.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c g(int i) {
        o e = e(2);
        byte[] bArr = e.a;
        int i2 = e.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        e.c = i3 + 1;
        this.b += 2;
        return this;
    }

    @Override // com.uxcam.f.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c f(int i) {
        o e = e(4);
        byte[] bArr = e.a;
        int i2 = e.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        e.c = i5 + 1;
        this.b += 4;
        return this;
    }

    @Override // com.uxcam.f.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final c j(long j) {
        if (j == 0) {
            return h(48);
        }
        boolean z = false;
        if (j < 0) {
            long j2 = -j;
            j = j2;
            if (j2 < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        }
        int i = j < 100000000 ? j < 10000 ? j < 100 ? j < 10 ? 1 : 2 : j < 1000 ? 3 : 4 : j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8 : j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        if (z) {
            i++;
        }
        o e = e(i);
        byte[] bArr = e.a;
        int i2 = e.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        e.c += i;
        this.b += i;
        return this;
    }

    @Override // com.uxcam.f.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final c i(long j) {
        if (j == 0) {
            return h(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        o e = e(numberOfTrailingZeros);
        byte[] bArr = e.a;
        int i = e.c;
        for (int i2 = (e.c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (j & 15)];
            j >>>= 4;
        }
        e.c += numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o e(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.a != null) {
            o oVar = this.a.g;
            o oVar2 = oVar;
            if (oVar.c + i > 8192 || !oVar2.e) {
                oVar2 = oVar2.a(p.a());
            }
            return oVar2;
        }
        this.a = p.a();
        o oVar3 = this.a;
        o oVar4 = this.a;
        o oVar5 = this.a;
        oVar4.g = oVar5;
        oVar3.f = oVar5;
        return oVar5;
    }

    @Override // com.uxcam.f.r
    public final void a_(c cVar, long j) {
        o a;
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        u.a(cVar.b, 0L, j);
        while (j > 0) {
            if (j < cVar.a.c - cVar.a.b) {
                o oVar = this.a != null ? this.a.g : null;
                o oVar2 = oVar;
                if (oVar != null && oVar2.e) {
                    if ((j + oVar2.c) - (oVar2.d ? 0 : oVar2.b) <= 8192) {
                        cVar.a.a(oVar2, (int) j);
                        cVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                o oVar3 = cVar.a;
                int i = (int) j;
                if (i <= 0 || i > oVar3.c - oVar3.b) {
                    throw new IllegalArgumentException();
                }
                if (i >= 1024) {
                    a = new o(oVar3);
                } else {
                    a = p.a();
                    System.arraycopy(oVar3.a, oVar3.b, a.a, 0, i);
                }
                a.c = a.b + i;
                oVar3.b += i;
                oVar3.g.a(a);
                cVar.a = a;
            }
            o oVar4 = cVar.a;
            long j2 = oVar4.c - oVar4.b;
            cVar.a = oVar4.a();
            if (this.a == null) {
                this.a = oVar4;
                o oVar5 = this.a;
                o oVar6 = this.a;
                o oVar7 = this.a;
                oVar6.g = oVar7;
                oVar5.f = oVar7;
            } else {
                o a2 = this.a.g.a(oVar4);
                if (a2.g == a2) {
                    throw new IllegalStateException();
                }
                if (a2.g.e) {
                    int i2 = a2.c - a2.b;
                    if (i2 <= (8192 - a2.g.c) + (a2.g.d ? 0 : a2.g.b)) {
                        a2.a(a2.g, i2);
                        a2.a();
                        p.a(a2);
                    }
                }
            }
            cVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // com.uxcam.f.s
    public final long a(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.b == 0) {
            return -1L;
        }
        if (j > this.b) {
            j = this.b;
        }
        cVar.a_(this, j);
        return j;
    }

    @Override // com.uxcam.f.e
    public final long a(byte b) {
        return a(b, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(byte r6, long r7) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.f.c.a(byte, long):long");
    }

    @Override // com.uxcam.f.d, com.uxcam.f.r, java.io.Flushable
    public final void flush() {
    }

    @Override // com.uxcam.f.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.uxcam.f.r
    public final t a() {
        return t.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b != cVar.b) {
            return false;
        }
        if (this.b == 0) {
            return true;
        }
        o oVar = this.a;
        o oVar2 = cVar.a;
        int i = oVar.b;
        int i2 = oVar2.b;
        long j = 0;
        while (true) {
            long j2 = j;
            if (j2 >= this.b) {
                return true;
            }
            long min = Math.min(oVar.c - i, oVar2.c - i2);
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = i;
                i++;
                int i5 = i2;
                i2++;
                if (oVar.a[i4] != oVar2.a[i5]) {
                    return false;
                }
            }
            if (i == oVar.c) {
                o oVar3 = oVar.f;
                oVar = oVar3;
                i = oVar3.b;
            }
            if (i2 == oVar2.c) {
                o oVar4 = oVar2.f;
                oVar2 = oVar4;
                i2 = oVar4.b;
            }
            j = j2 + min;
        }
    }

    public final int hashCode() {
        o oVar;
        o oVar2 = this.a;
        o oVar3 = oVar2;
        if (oVar2 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oVar3.c;
            for (int i3 = oVar3.b; i3 < i2; i3++) {
                i = (31 * i) + oVar3.a[i3];
            }
            oVar = oVar3.f;
            oVar3 = oVar;
        } while (oVar != this.a);
        return i;
    }

    public final String toString() {
        if (this.b > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
        }
        int i = (int) this.b;
        return (i == 0 ? f.b : new q(this, i)).toString();
    }

    public final /* synthetic */ Object clone() {
        c cVar = new c();
        if (this.b == 0) {
            return cVar;
        }
        cVar.a = new o(this.a);
        o oVar = cVar.a;
        o oVar2 = cVar.a;
        o oVar3 = cVar.a;
        oVar2.g = oVar3;
        oVar.f = oVar3;
        o oVar4 = this.a.f;
        while (true) {
            o oVar5 = oVar4;
            if (oVar5 == this.a) {
                cVar.b = this.b;
                return cVar;
            }
            cVar.a.g.a(new o(oVar5));
            oVar4 = oVar5.f;
        }
    }

    @Override // com.uxcam.f.d
    public final /* bridge */ /* synthetic */ d o() {
        return this;
    }
}
