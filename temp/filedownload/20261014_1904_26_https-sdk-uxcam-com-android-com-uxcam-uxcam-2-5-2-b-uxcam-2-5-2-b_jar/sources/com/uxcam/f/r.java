package com.uxcam.f;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/r.class */
public interface r extends Closeable, Flushable {
    void a_(c cVar, long j);

    void flush();

    t a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
