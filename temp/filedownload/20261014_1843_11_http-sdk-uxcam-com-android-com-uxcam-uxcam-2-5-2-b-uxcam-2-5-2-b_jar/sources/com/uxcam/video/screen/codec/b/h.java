package com.uxcam.video.screen.codec.b;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/h.class */
public final class h {
    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer2.hasArray()) {
            byteBuffer.put(byteBuffer2.array(), byteBuffer2.arrayOffset() + byteBuffer2.position(), Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
            return;
        }
        byte[] bArr = new byte[Math.min(byteBuffer2.remaining(), byteBuffer.remaining())];
        byteBuffer2.duplicate().get(bArr);
        byteBuffer.put(bArr);
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        int min = Math.min(byteBuffer.remaining(), i);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    public static void a(ByteBuffer byteBuffer, String str, int i) {
        byteBuffer.put((byte) str.length());
        byteBuffer.put(f.a(str));
        a(byteBuffer, i - str.length());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        return allocate;
    }
}
