package com.uxcam.f;

import java.nio.charset.Charset;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/u.class */
final class u {
    public static final Charset a = Charset.forName("UTF-8");

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static short a(short s) {
        int i = s & 65535;
        return (short) (((i & 65280) >>> 8) | ((i & 255) << 8));
    }

    public static int a(int i) {
        return ((i & (-16777216)) >>> 24) | ((i & 16711680) >>> 8) | ((i & 65280) << 8) | ((i & 255) << 24);
    }

    public static void a(Throwable th) {
        throw th;
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
