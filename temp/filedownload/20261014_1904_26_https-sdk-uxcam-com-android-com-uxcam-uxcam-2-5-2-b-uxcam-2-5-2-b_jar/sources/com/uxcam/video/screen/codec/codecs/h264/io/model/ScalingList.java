package com.uxcam.video.screen.codec.codecs.h264.io.model;

import com.uxcam.video.screen.codec.b.a.b;
import com.uxcam.video.screen.codec.codecs.h264.io.a.a;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/ScalingList.class */
public class ScalingList {
    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;

    public void write(b bVar) {
        if (this.useDefaultScalingMatrixFlag) {
            a.b(bVar, 0);
            return;
        }
        int i = 8;
        for (int i2 = 0; i2 < this.scalingList.length; i2++) {
            a.b(bVar, (this.scalingList[i2] - i) - 256);
            i = this.scalingList[i2];
        }
    }

    public static ScalingList read(com.uxcam.video.screen.codec.b.a.a aVar, int i) {
        ScalingList scalingList = new ScalingList();
        scalingList.scalingList = new int[i];
        int i2 = 8;
        int i3 = 8;
        int i4 = 0;
        while (i4 < i) {
            if (i3 != 0) {
                i3 = ((i2 + com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar)) + 256) % 256;
                scalingList.useDefaultScalingMatrixFlag = i4 == 0 && i3 == 0;
            }
            scalingList.scalingList[i4] = i3 == 0 ? i2 : i3;
            i2 = scalingList.scalingList[i4];
            i4++;
        }
        return scalingList;
    }
}
