package com.uxcam.video.screen.codec.codecs.h264.io.a;

import com.uxcam.video.screen.codec.codecs.h264.io.model.SeqParameterSet;
import com.uxcam.video.screen.codec.codecs.h264.io.model.SliceHeader;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/a/b.class */
public final class b {
    public static void a(SliceHeader sliceHeader, com.uxcam.video.screen.codec.b.a.b bVar, int i) {
        SeqParameterSet seqParameterSet = sliceHeader.sps;
        int i2 = 1 << sliceHeader.pred_weight_table.luma_log2_weight_denom;
        int i3 = 1 << sliceHeader.pred_weight_table.chroma_log2_weight_denom;
        for (int i4 = 0; i4 < sliceHeader.pred_weight_table.luma_weight[i].length; i4++) {
            boolean z = (sliceHeader.pred_weight_table.luma_weight[i][i4] == i2 && sliceHeader.pred_weight_table.luma_offset[i][i4] == 0) ? false : true;
            a.a(bVar, z);
            if (z) {
                a.b(bVar, sliceHeader.pred_weight_table.luma_weight[i][i4]);
                a.b(bVar, sliceHeader.pred_weight_table.luma_offset[i][i4]);
            }
            if (seqParameterSet.chroma_format_idc != com.uxcam.video.screen.codec.b.b.b.MONO) {
                boolean z2 = (sliceHeader.pred_weight_table.chroma_weight[i][0][i4] == i3 && sliceHeader.pred_weight_table.chroma_offset[i][0][i4] == 0 && sliceHeader.pred_weight_table.chroma_weight[i][1][i4] == i3 && sliceHeader.pred_weight_table.chroma_offset[i][1][i4] == 0) ? false : true;
                a.a(bVar, z2);
                if (z2) {
                    for (int i5 = 0; i5 < 2; i5++) {
                        a.b(bVar, sliceHeader.pred_weight_table.chroma_weight[i][i5][i4]);
                        a.b(bVar, sliceHeader.pred_weight_table.chroma_offset[i][i5][i4]);
                    }
                }
            }
        }
    }

    public static void a(int[][] iArr, com.uxcam.video.screen.codec.b.a.b bVar) {
        if (iArr == null) {
            return;
        }
        for (int i = 0; i < iArr[0].length; i++) {
            a.a(bVar, iArr[0][i]);
            a.a(bVar, iArr[1][i]);
        }
        a.a(bVar, 3);
    }
}
