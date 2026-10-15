package com.uxcam.video.screen.codec.codecs.h264;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/c.class */
public final class c {
    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = -1;
            while (true) {
                if (!byteBuffer.hasRemaining()) {
                    break;
                }
                int i2 = (i << 8) | (byteBuffer.get() & 255);
                i = i2;
                if ((i2 & 16777215) == 1) {
                    byteBuffer.position(byteBuffer.position());
                    break;
                }
            }
        }
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        int position = byteBuffer.position();
        ByteBuffer slice = byteBuffer.slice();
        slice.order(ByteOrder.BIG_ENDIAN);
        int i3 = -1;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            int i4 = (i3 << 8) | (byteBuffer.get() & 255);
            i3 = i4;
            if ((i4 & 16777215) == 1) {
                byteBuffer.position(byteBuffer.position() - (i3 == 1 ? 4 : 3));
                slice.limit(byteBuffer.position() - position);
            }
        }
        return slice;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byteBuffer2.put(b);
        byteBuffer2.put(b2);
        while (byteBuffer.hasRemaining()) {
            byte b3 = byteBuffer.get();
            if (b == 0 && b2 == 0 && (b3 & 255) <= 3) {
                byteBuffer2.put((byte) 3);
                b2 = 3;
            }
            byteBuffer2.put(b3);
            b = b2;
            b2 = b3;
        }
    }
}
