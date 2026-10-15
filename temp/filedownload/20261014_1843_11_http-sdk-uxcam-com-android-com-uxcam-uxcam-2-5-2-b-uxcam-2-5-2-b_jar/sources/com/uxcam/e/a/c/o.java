package com.uxcam.e.a.c;

import com.uxcam.e.a.c.b;
import com.uxcam.f.r;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.Deflater;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/o.class */
public final class o implements q {
    static final byte[] a;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/o$a.class */
    static final class a implements com.uxcam.e.a.c.b {
        private final com.uxcam.f.e a;
        private final boolean b;
        private final k c;

        a(com.uxcam.f.e eVar, boolean z) {
            this.a = eVar;
            this.c = new k(this.a);
            this.b = z;
        }

        @Override // com.uxcam.e.a.c.b
        public final void a() {
        }

        /*  JADX ERROR: Types fix failed
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
            */
        /* JADX WARN: Failed to calculate best type for var: r3v2 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r3v2 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to calculate best type for var: r8v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Failed to set immutable type for var: r8v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:100)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Not initialized variable reg: 3, insn: MOVE (r1 I:??) = (r3 I:??), block:B:72:0x029e */
        @Override // com.uxcam.e.a.c.b
        public final boolean a(com.uxcam.e.a.c.b.a r8) {
            /*
                Method dump skipped, instructions count: 791
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.a.c.o.a.a(com.uxcam.e.a.c.b$a):boolean");
        }

        private void a(b.a aVar, int i, int i2) {
            int f = this.a.f();
            if (i2 != 4 + (8 * f)) {
                throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(f));
            }
            n nVar = new n();
            for (int i3 = 0; i3 < f; i3++) {
                int f2 = this.a.f();
                nVar.a(f2 & 16777215, (f2 & (-16777216)) >>> 24, this.a.f());
            }
            aVar.a((i & 1) != 0, nVar);
        }

        private static IOException a(String str, Object... objArr) {
            throw new IOException(com.uxcam.e.a.c.a(str, objArr));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.c.b.close();
        }
    }

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/o$b.class */
    static final class b implements c {
        private final com.uxcam.f.d a;
        private final com.uxcam.f.c b;
        private final com.uxcam.f.d c;
        private final boolean d;
        private boolean e;

        b(com.uxcam.f.d dVar, boolean z) {
            this.a = dVar;
            this.d = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(o.a);
            this.b = new com.uxcam.f.c();
            this.c = com.uxcam.f.l.a(new com.uxcam.f.g((r) this.b, deflater));
        }

        @Override // com.uxcam.e.a.c.c
        public final void a(n nVar) {
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a() {
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void b() {
            if (this.e) {
                throw new IOException("closed");
            }
            this.a.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(boolean z, int i, List list) {
            if (this.e) {
                throw new IOException("closed");
            }
            a(list);
            int i2 = (int) (10 + this.b.b);
            int i3 = (z ? 1 : 0) | 0;
            this.a.f(-2147287039);
            this.a.f(((i3 & 255) << 24) | (i2 & 16777215));
            this.a.f(i & Integer.MAX_VALUE);
            this.a.f(0);
            this.a.g(0);
            this.a.a(this.b);
            this.a.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(int i, com.uxcam.e.a.c.a aVar) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (aVar.t == -1) {
                throw new IllegalArgumentException();
            }
            this.a.f(-2147287037);
            this.a.f(8);
            this.a.f(i & Integer.MAX_VALUE);
            this.a.f(aVar.t);
            this.a.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final int c() {
            return 16383;
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(boolean z, int i, com.uxcam.f.c cVar, int i2) {
            int i3 = z ? 1 : 0;
            if (this.e) {
                throw new IOException("closed");
            }
            if (i2 > 16777215) {
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i2);
            }
            this.a.f(i & Integer.MAX_VALUE);
            this.a.f(((i3 & 255) << 24) | (i2 & 16777215));
            if (i2 > 0) {
                this.a.a_(cVar, i2);
            }
        }

        private void a(List list) {
            this.c.f(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                com.uxcam.f.f fVar = ((f) list.get(i)).h;
                this.c.f(fVar.e());
                this.c.b(fVar);
                com.uxcam.f.f fVar2 = ((f) list.get(i)).i;
                this.c.f(fVar2.e());
                this.c.b(fVar2);
            }
            this.c.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void b(n nVar) {
            if (this.e) {
                throw new IOException("closed");
            }
            int bitCount = Integer.bitCount(nVar.a);
            this.a.f(-2147287036);
            this.a.f(0 | ((4 + (bitCount * 8)) & 16777215));
            this.a.f(bitCount);
            for (int i = 0; i <= 10; i++) {
                if (nVar.a(i)) {
                    this.a.f(((nVar.b(i) & 255) << 24) | (i & 16777215));
                    this.a.f(nVar.d[i]);
                }
            }
            this.a.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(boolean z, int i, int i2) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (z != (this.d != ((i & 1) == 1))) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.a.f(-2147287034);
            this.a.f(4);
            this.a.f(i);
            this.a.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(int i, com.uxcam.e.a.c.a aVar, byte[] bArr) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (aVar.u == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            this.a.f(-2147287033);
            this.a.f(8);
            this.a.f(i);
            this.a.f(aVar.u);
            this.a.flush();
        }

        @Override // com.uxcam.e.a.c.c
        public final synchronized void a(int i, long j) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            }
            this.a.f(-2147287031);
            this.a.f(8);
            this.a.f(i);
            this.a.f((int) j);
            this.a.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            this.e = true;
            com.uxcam.e.a.c.a((Closeable) this.a, (Closeable) this.c);
        }
    }

    @Override // com.uxcam.e.a.c.q
    public final com.uxcam.e.a.c.b a(com.uxcam.f.e eVar, boolean z) {
        return new a(eVar, z);
    }

    @Override // com.uxcam.e.a.c.q
    public final c a(com.uxcam.f.d dVar, boolean z) {
        return new b(dVar, z);
    }

    static {
        try {
            a = "������\u0007options������\u0004head������\u0004post������\u0003put������\u0006delete������\u0005trace������\u0006accept������\u000eaccept-charset������\u000faccept-encoding������\u000faccept-language������\raccept-ranges������\u0003age������\u0005allow������\rauthorization������\rcache-control������\nconnection������\fcontent-base������\u0010content-encoding������\u0010content-language������\u000econtent-length������\u0010content-location������\u000bcontent-md5������\rcontent-range������\fcontent-type������\u0004date������\u0004etag������\u0006expect������\u0007expires������\u0004from������\u0004host������\bif-match������\u0011if-modified-since������\rif-none-match������\bif-range������\u0013if-unmodified-since������\rlast-modified������\blocation������\fmax-forwards������\u0006pragma������\u0012proxy-authenticate������\u0013proxy-authorization������\u0005range������\u0007referer������\u000bretry-after������\u0006server������\u0002te������\u0007trailer������\u0011transfer-encoding������\u0007upgrade������\nuser-agent������\u0004vary������\u0003via������\u0007warning������\u0010www-authenticate������\u0006method������\u0003get������\u0006status������\u0006200 OK������\u0007version������\bHTTP/1.1������\u0003url������\u0006public������\nset-cookie������\nkeep-alive������\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(com.uxcam.e.a.c.c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
