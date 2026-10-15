package com.uxcam.video.screen.codec.codecs.h264.io.model;

import com.uxcam.video.screen.codec.b.a.b;
import com.uxcam.video.screen.codec.codecs.h264.io.a.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/SEI.class */
public class SEI {
    public SEIMessage[] messages;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/SEI$SEIMessage.class */
    public static class SEIMessage {
        public int payloadType;
        public int payloadSize;
        public byte[] payload;

        public SEIMessage(int i, int i2, byte[] bArr) {
            this.payload = bArr;
            this.payloadType = i;
            this.payloadSize = i2;
        }
    }

    public SEI(SEIMessage[] sEIMessageArr) {
        this.messages = sEIMessageArr;
    }

    public static SEI read(ByteBuffer byteBuffer) {
        SEIMessage sei_message;
        ArrayList arrayList = new ArrayList();
        do {
            sei_message = sei_message(byteBuffer);
            if (sei_message != null) {
                arrayList.add(sei_message);
            }
        } while (sei_message != null);
        return new SEI((SEIMessage[]) arrayList.toArray(new SEIMessage[0]));
    }

    private static SEIMessage sei_message(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = byteBuffer.get() & 255;
            if (i != 255) {
                break;
            }
            i3 += 255;
        }
        if (i == -1) {
            return null;
        }
        int i4 = i3 + i;
        int i5 = 0;
        while (true) {
            i2 = byteBuffer.get() & 255;
            if (i2 != 255) {
                break;
            }
            i5 += 255;
        }
        if (i2 == -1) {
            return null;
        }
        int i6 = i5 + i2;
        byte[] sei_payload = sei_payload(i4, i6, byteBuffer);
        if (sei_payload.length != i6) {
            return null;
        }
        return new SEIMessage(i4, i6, sei_payload);
    }

    private static byte[] sei_payload(int i, int i2, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return bArr;
    }

    public void write(ByteBuffer byteBuffer) {
        a.a(new b(byteBuffer));
    }
}
