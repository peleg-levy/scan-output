package com.uxcam.video.screen.codec.codecs.h264.io.model;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/SliceType.class */
public enum SliceType {
    P,
    B,
    I,
    SP,
    SI;

    public final boolean isIntra() {
        return this == I || this == SI;
    }

    public final boolean isInter() {
        return (this == I || this == SI) ? false : true;
    }
}
