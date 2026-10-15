package com.uxcam.f;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/h.class */
public abstract class h implements s {
    private final s a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = sVar;
    }

    @Override // com.uxcam.f.s
    public long a(c cVar, long j) {
        return this.a.a(cVar, j);
    }

    @Override // com.uxcam.f.s
    public final t a() {
        return this.a.a();
    }

    @Override // com.uxcam.f.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }
}
