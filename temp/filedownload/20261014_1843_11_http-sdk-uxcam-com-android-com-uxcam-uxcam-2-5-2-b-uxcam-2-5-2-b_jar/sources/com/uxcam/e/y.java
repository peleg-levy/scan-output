package com.uxcam.e;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/y.class */
public final class y implements e {
    final w a;
    final com.uxcam.e.a.d.l b;
    private boolean d;
    z c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/y$a.class */
    public final class a extends com.uxcam.e.a.b {
        private final f c;

        private a(f fVar) {
            super("OkHttp %s", y.this.a().toString());
            this.c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String a() {
            return y.this.c.a.b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.uxcam.e.a.b
        public final void b() {
            try {
                y yVar = y.this;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(yVar.a.e);
                arrayList.add(yVar.b);
                arrayList.add(new com.uxcam.e.a.d.a(yVar.a.h));
                w wVar = yVar.a;
                arrayList.add(new com.uxcam.e.a.a.a(wVar.i != null ? wVar.i.a : wVar.j));
                arrayList.add(new com.uxcam.e.a.b.a(yVar.a));
                if (!yVar.b.a) {
                    arrayList.addAll(yVar.a.f);
                }
                arrayList.add(new com.uxcam.e.a.d.b(yVar.b.a));
                ab a = new com.uxcam.e.a.d.i(arrayList, null, null, null, 0, yVar.c).a(yVar.c);
                if (y.this.b.b) {
                    this.c.a(new IOException("Canceled"));
                } else {
                    this.c.a(a);
                }
            } catch (IOException e) {
                if (0 != 0) {
                    com.uxcam.e.a.f.e b = com.uxcam.e.a.f.e.b();
                    StringBuilder sb = new StringBuilder("Callback failure for ");
                    y yVar2 = y.this;
                    b.a(4, sb.append((yVar2.b.b ? "canceled call" : "call") + " to " + yVar2.a()).toString(), e);
                } else {
                    this.c.a(e);
                }
            } finally {
                y.this.a.a.b(this);
            }
        }

        /* synthetic */ a(y yVar, f fVar, byte b) {
            this(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public y(w wVar, z zVar) {
        this.a = wVar;
        this.c = zVar;
        this.b = new com.uxcam.e.a.d.l(wVar);
    }

    @Override // com.uxcam.e.e
    public final void a(f fVar) {
        synchronized (this) {
            if (this.d) {
                throw new IllegalStateException("Already Executed");
            }
            this.d = true;
        }
        this.a.a.a(new a(this, fVar, (byte) 0));
    }

    final s a() {
        return this.c.a.c("/...");
    }
}
