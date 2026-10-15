package com.uxcam.e;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/c.class */
public final class c implements Closeable, Flushable {
    final com.uxcam.e.a.a.e a;
    private final com.uxcam.e.a.a.d b;

    @Override // java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
