package com.uxcam.video.screen.codec.codecs.h264.io.model;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/RefPicMarkingIDR.class */
public class RefPicMarkingIDR {
    boolean discardDecodedPics;
    boolean useForlongTerm;

    public RefPicMarkingIDR(boolean z, boolean z2) {
        this.discardDecodedPics = z;
        this.useForlongTerm = z2;
    }

    public boolean isDiscardDecodedPics() {
        return this.discardDecodedPics;
    }

    public boolean isUseForlongTerm() {
        return this.useForlongTerm;
    }
}
