package com.uxcam.video.screen.codec.codecs.h264.io.model;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/PredictionWeightTable.class */
public class PredictionWeightTable {
    public int luma_log2_weight_denom;
    public int chroma_log2_weight_denom;
    public int[][] luma_weight = new int[2];
    public int[][][] chroma_weight = new int[2];
    public int[][] luma_offset = new int[2];
    public int[][][] chroma_offset = new int[2];
}
