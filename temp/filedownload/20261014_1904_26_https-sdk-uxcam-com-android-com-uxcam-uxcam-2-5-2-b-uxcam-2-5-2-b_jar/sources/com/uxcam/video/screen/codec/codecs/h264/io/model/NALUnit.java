package com.uxcam.video.screen.codec.codecs.h264.io.model;

import java.nio.ByteBuffer;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/NALUnit.class */
public class NALUnit {
    public NALUnitType type;
    public int nal_ref_idc;

    public NALUnit(NALUnitType nALUnitType, int i) {
        this.type = nALUnitType;
        this.nal_ref_idc = i;
    }

    public static NALUnit read(ByteBuffer byteBuffer) {
        int i = byteBuffer.get() & 255;
        return new NALUnit(NALUnitType.fromValue(i & 31), (i >> 5) & 3);
    }

    public void write(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.type.getValue() | (this.nal_ref_idc << 5)));
    }
}
