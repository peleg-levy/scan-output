package com.uxcam.e;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/ac.class */
public abstract class ac implements Closeable {
    public abstract u a();

    public abstract long b();

    public abstract com.uxcam.f.e c();

    public final byte[] d() {
        long b = b();
        if (b > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + b);
        }
        com.uxcam.f.e c = c();
        try {
            byte[] m = c.m();
            if (b == -1 || b == m.length) {
                return m;
            }
            throw new IOException("Content-Length and stream length disagree");
        } finally {
            com.uxcam.e.a.c.a(c);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.uxcam.e.a.c.a(c());
    }
}
