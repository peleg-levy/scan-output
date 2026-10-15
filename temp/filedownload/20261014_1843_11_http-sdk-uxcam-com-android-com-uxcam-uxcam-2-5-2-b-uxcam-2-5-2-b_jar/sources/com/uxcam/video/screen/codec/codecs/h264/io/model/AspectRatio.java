package com.uxcam.video.screen.codec.codecs.h264.io.model;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/AspectRatio.class */
public class AspectRatio {
    public static final AspectRatio Extended_SAR = new AspectRatio(255);
    private int value;

    private AspectRatio(int i) {
        this.value = i;
    }

    public static AspectRatio fromValue(int i) {
        return i == Extended_SAR.value ? Extended_SAR : new AspectRatio(i);
    }

    public int getValue() {
        return this.value;
    }
}
