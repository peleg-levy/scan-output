package com.uxcam.e.a.c;

import java.io.IOException;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c/p.class */
public final class p extends IOException {
    public final a a;

    public p(a aVar) {
        super("stream was reset: " + aVar);
        this.a = aVar;
    }
}
