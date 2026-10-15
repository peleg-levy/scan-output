package com.uxcam.e;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/v.class */
public final class v extends aa {
    public static final u a = u.a("multipart/mixed");
    public static final u b = u.a("multipart/alternative");
    public static final u c = u.a("multipart/digest");
    public static final u d = u.a("multipart/parallel");
    public static final u e = u.a("multipart/form-data");
    private static final byte[] f = {58, 32};
    private static final byte[] g = {13, 10};
    private static final byte[] h = {45, 45};
    private final com.uxcam.f.f i;
    private final u j;
    private final u k;
    private final List l;
    private long m = -1;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/v$a.class */
    public static final class a {
        public final com.uxcam.f.f a;
        public u b;
        public final List c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        private a(String str) {
            this.b = v.a;
            this.c = new ArrayList();
            this.a = com.uxcam.f.f.a(str);
        }

        public final a a(String str, String str2) {
            final byte[] bytes = str2.getBytes(com.uxcam.e.a.c.c);
            final int length = bytes.length;
            if (bytes == null) {
                throw new NullPointerException("content == null");
            }
            com.uxcam.e.a.c.a(bytes.length, length);
            return a(b.a(str, null, new aa() { // from class: com.uxcam.e.aa.1
                final /* synthetic */ u a = null;
                final /* synthetic */ int d = 0;

                @Override // com.uxcam.e.aa
                public final u a() {
                    return this.a;
                }

                @Override // com.uxcam.e.aa
                public final long b() {
                    return length;
                }

                @Override // com.uxcam.e.aa
                public final void a(com.uxcam.f.d dVar) {
                    dVar.b(bytes, this.d, length);
                }
            }));
        }

        public final a a(b bVar) {
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.c.add(bVar);
            return this;
        }
    }

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/v$b.class */
    public static final class b {
        final r a;
        final aa b;

        public static b a(String str, String str2, aa aaVar) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            v.a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                v.a(sb, str2);
            }
            r a = r.a("Content-Disposition", sb.toString());
            if (a.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (a.a("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new b(a, aaVar);
        }

        private b(r rVar, aa aaVar) {
            this.a = rVar;
            this.b = aaVar;
        }
    }

    public v(com.uxcam.f.f fVar, u uVar, List list) {
        this.i = fVar;
        this.j = uVar;
        this.k = u.a(uVar + "; boundary=" + fVar.a());
        this.l = com.uxcam.e.a.c.a(list);
    }

    @Override // com.uxcam.e.aa
    public final u a() {
        return this.k;
    }

    /*  JADX ERROR: Failed to decode insn: 0x0016: MOVE_MULTI, method: com.uxcam.e.v.b():long
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[6]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:49)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:118)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:54)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:81)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:50)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:156)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:443)
        	at jadx.core.ProcessClass.process(ProcessClass.java:70)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:110)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */
    @Override // com.uxcam.e.aa
    public final long b() {
        /*
            r6 = this;
            r0 = r6
            long r0 = r0.m
            r1 = r0; r0 = r0; 
            r7 = r1
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf
            r0 = r7
            return r0
            r0 = r6
            r1 = r6
            r2 = 0
            r3 = 1
            long r1 = r1.a(r2, r3)
            // decode failed: arraycopy: source index -1 out of bounds for object array[6]
            r0.m = r1
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.v.b():long");
    }

    @Override // com.uxcam.e.aa
    public final void a(com.uxcam.f.d dVar) {
        a(dVar, false);
    }

    private long a(com.uxcam.f.d dVar, boolean z) {
        long j = 0;
        com.uxcam.f.c cVar = null;
        if (z) {
            com.uxcam.f.c cVar2 = new com.uxcam.f.c();
            cVar = cVar2;
            dVar = cVar2;
        }
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.l.get(i);
            r rVar = bVar.a;
            aa aaVar = bVar.b;
            dVar.b(h);
            dVar.b(this.i);
            dVar.b(g);
            if (rVar != null) {
                int length = rVar.a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    dVar.b(rVar.a(i2)).b(f).b(rVar.b(i2)).b(g);
                }
            }
            u a2 = aaVar.a();
            if (a2 != null) {
                dVar.b("Content-Type: ").b(a2.toString()).b(g);
            }
            long b2 = aaVar.b();
            if (b2 != -1) {
                dVar.b("Content-Length: ").j(b2).b(g);
            } else if (z) {
                cVar.n();
                return -1L;
            }
            dVar.b(g);
            if (z) {
                j += b2;
            } else {
                aaVar.a(dVar);
            }
            dVar.b(g);
        }
        dVar.b(h);
        dVar.b(this.i);
        dVar.b(h);
        dVar.b(g);
        if (z) {
            j += cVar.b;
            cVar.n();
        }
        return j;
    }

    static StringBuilder a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\n':
                    sb.append("%0A");
                    break;
                case '\r':
                    sb.append("%0D");
                    break;
                case '\"':
                    sb.append("%22");
                    break;
                default:
                    sb.append(charAt);
                    break;
            }
        }
        sb.append('\"');
        return sb;
    }
}
