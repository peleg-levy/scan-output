package com.uxcam.e;

import java.util.ArrayList;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/p.class */
public final class p extends aa {
    private static final u a = u.a("application/x-www-form-urlencoded");
    private final List b;
    private final List c;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/p$a.class */
    public static final class a {
        public final List a = new ArrayList();
        public final List b = new ArrayList();

        public final a a(String str, String str2) {
            this.a.add(s.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.b.add(s.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }
    }

    private p(List list, List list2) {
        this.b = com.uxcam.e.a.c.a(list);
        this.c = com.uxcam.e.a.c.a(list2);
    }

    @Override // com.uxcam.e.aa
    public final u a() {
        return a;
    }

    @Override // com.uxcam.e.aa
    public final long b() {
        return a(null, true);
    }

    @Override // com.uxcam.e.aa
    public final void a(com.uxcam.f.d dVar) {
        a(dVar, false);
    }

    private long a(com.uxcam.f.d dVar, boolean z) {
        long j = 0;
        com.uxcam.f.c cVar = z ? new com.uxcam.f.c() : dVar.b();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.h(38);
            }
            cVar.b((String) this.b.get(i));
            cVar.h(61);
            cVar.b((String) this.c.get(i));
        }
        if (z) {
            j = cVar.b;
            cVar.n();
        }
        return j;
    }

    public /* synthetic */ p(List list, List list2, byte b) {
        this(list, list2);
    }
}
