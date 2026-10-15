package com.uxcam.e.a.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/k.class */
final class k {
    private final com.uxcam.f.k c;
    int a;
    final com.uxcam.f.e b;

    public k(com.uxcam.f.e eVar) {
        this.c = new com.uxcam.f.k(new com.uxcam.f.h(eVar) { // from class: com.uxcam.e.a.c.k.1
            @Override // com.uxcam.f.h, com.uxcam.f.s
            public final long a(com.uxcam.f.c cVar, long j) {
                if (k.this.a == 0) {
                    return -1L;
                }
                long a = super.a(cVar, Math.min(j, k.this.a));
                if (a == -1) {
                    return -1L;
                }
                k.this.a = (int) (k.this.a - a);
                return a;
            }
        }, new Inflater() { // from class: com.uxcam.e.a.c.k.2
            @Override // java.util.zip.Inflater
            public final int inflate(byte[] bArr, int i, int i2) {
                int inflate = super.inflate(bArr, i, i2);
                int i3 = inflate;
                if (inflate == 0 && needsDictionary()) {
                    setDictionary(o.a);
                    i3 = super.inflate(bArr, i, i2);
                }
                return i3;
            }
        });
        this.b = com.uxcam.f.l.a(this.c);
    }

    public final List a(int i) {
        this.a += i;
        int f = this.b.f();
        if (f < 0) {
            throw new IOException("numberOfPairs < 0: " + f);
        }
        if (f > 1024) {
            throw new IOException("numberOfPairs > 1024: " + f);
        }
        ArrayList arrayList = new ArrayList(f);
        for (int i2 = 0; i2 < f; i2++) {
            com.uxcam.f.f d = a().d();
            com.uxcam.f.f a = a();
            if (d.e() == 0) {
                throw new IOException("name.size == 0");
            }
            arrayList.add(new f(d, a));
        }
        if (this.a > 0) {
            this.c.b();
            if (this.a != 0) {
                throw new IOException("compressedLimit > 0: " + this.a);
            }
        }
        return arrayList;
    }

    private com.uxcam.f.f a() {
        return this.b.c(this.b.f());
    }
}
