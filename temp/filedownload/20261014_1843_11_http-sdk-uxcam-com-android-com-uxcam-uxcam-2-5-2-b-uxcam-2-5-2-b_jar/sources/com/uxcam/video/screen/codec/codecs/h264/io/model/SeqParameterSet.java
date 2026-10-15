package com.uxcam.video.screen.codec.codecs.h264.io.model;

import com.uxcam.video.screen.codec.b.a.a;
import com.uxcam.video.screen.codec.b.b.b;
import com.uxcam.video.screen.codec.codecs.h264.io.model.VUIParameters;
import java.nio.ByteBuffer;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/SeqParameterSet.class */
public class SeqParameterSet {
    public int pic_order_cnt_type;
    public boolean field_pic_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean mb_adaptive_frame_field_flag;
    public boolean direct_8x8_inference_flag;
    public b chroma_format_idc;
    public int log2_max_frame_num_minus4;
    public int log2_max_pic_order_cnt_lsb_minus4;
    public int pic_height_in_map_units_minus1;
    public int pic_width_in_mbs_minus1;
    public int bit_depth_luma_minus8;
    public int bit_depth_chroma_minus8;
    public boolean qpprime_y_zero_transform_bypass_flag;
    public int profile_idc;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public int level_idc;
    public int seq_parameter_set_id;
    public boolean residual_color_transform_flag;
    public int offset_for_non_ref_pic;
    public int offset_for_top_to_bottom_field;
    public int num_ref_frames;
    public boolean gaps_in_frame_num_value_allowed_flag;
    public boolean frame_mbs_only_flag;
    public boolean frame_cropping_flag;
    public int frame_crop_left_offset;
    public int frame_crop_right_offset;
    public int frame_crop_top_offset;
    public int frame_crop_bottom_offset;
    public int[] offsetForRefFrame;
    public VUIParameters vuiParams;
    public ScalingMatrix scalingMatrix;
    public int num_ref_frames_in_pic_order_cnt_cycle;

    public static b getColor(int i) {
        switch (i) {
            case 0:
                return b.MONO;
            case 1:
                return b.YUV420;
            case 2:
                return b.YUV422;
            case 3:
                return b.YUV444;
            default:
                throw new RuntimeException("Colorspace not supported");
        }
    }

    public static int fromColor(b bVar) {
        switch (bVar) {
            case MONO:
                return 0;
            case YUV420:
                return 1;
            case YUV422:
                return 2;
            case YUV444:
                return 3;
            default:
                throw new RuntimeException("Colorspace not supported");
        }
    }

    public static SeqParameterSet read(ByteBuffer byteBuffer) {
        a aVar = new a(byteBuffer);
        SeqParameterSet seqParameterSet = new SeqParameterSet();
        seqParameterSet.profile_idc = aVar.a(8);
        seqParameterSet.constraint_set_0_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        seqParameterSet.constraint_set_1_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        seqParameterSet.constraint_set_2_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        seqParameterSet.constraint_set_3_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        aVar.a(4);
        seqParameterSet.level_idc = aVar.a(8);
        seqParameterSet.seq_parameter_set_id = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        if (seqParameterSet.profile_idc == 100 || seqParameterSet.profile_idc == 110 || seqParameterSet.profile_idc == 122 || seqParameterSet.profile_idc == 144) {
            seqParameterSet.chroma_format_idc = getColor(com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar));
            if (seqParameterSet.chroma_format_idc == b.YUV444) {
                seqParameterSet.residual_color_transform_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
            }
            seqParameterSet.bit_depth_luma_minus8 = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            seqParameterSet.bit_depth_chroma_minus8 = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            seqParameterSet.qpprime_y_zero_transform_bypass_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
            if (com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar)) {
                readScalingListMatrix(aVar, seqParameterSet);
            }
        } else {
            seqParameterSet.chroma_format_idc = b.YUV420;
        }
        seqParameterSet.log2_max_frame_num_minus4 = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        seqParameterSet.pic_order_cnt_type = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        if (seqParameterSet.pic_order_cnt_type == 0) {
            seqParameterSet.log2_max_pic_order_cnt_lsb_minus4 = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        } else if (seqParameterSet.pic_order_cnt_type == 1) {
            seqParameterSet.delta_pic_order_always_zero_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
            seqParameterSet.offset_for_non_ref_pic = com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar);
            seqParameterSet.offset_for_top_to_bottom_field = com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar);
            seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            seqParameterSet.offsetForRefFrame = new int[seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle];
            for (int i = 0; i < seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle; i++) {
                new StringBuilder("SPS: offsetForRefFrame [").append(i).append("]");
                seqParameterSet.offsetForRefFrame[i] = com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar);
            }
        }
        seqParameterSet.num_ref_frames = com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar);
        seqParameterSet.gaps_in_frame_num_value_allowed_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        seqParameterSet.pic_width_in_mbs_minus1 = com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar);
        seqParameterSet.pic_height_in_map_units_minus1 = com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar);
        seqParameterSet.frame_mbs_only_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (!seqParameterSet.frame_mbs_only_flag) {
            seqParameterSet.mb_adaptive_frame_field_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        }
        seqParameterSet.direct_8x8_inference_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        seqParameterSet.frame_cropping_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (seqParameterSet.frame_cropping_flag) {
            seqParameterSet.frame_crop_left_offset = com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar);
            seqParameterSet.frame_crop_right_offset = com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar);
            seqParameterSet.frame_crop_top_offset = com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar);
            seqParameterSet.frame_crop_bottom_offset = com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar);
        }
        if (com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar)) {
            seqParameterSet.vuiParams = readVUIParameters(aVar);
        }
        return seqParameterSet;
    }

    private static void readScalingListMatrix(a aVar, SeqParameterSet seqParameterSet) {
        seqParameterSet.scalingMatrix = new ScalingMatrix();
        for (int i = 0; i < 8; i++) {
            if (com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar)) {
                seqParameterSet.scalingMatrix.ScalingList4x4 = new ScalingList[8];
                seqParameterSet.scalingMatrix.ScalingList8x8 = new ScalingList[8];
                if (i < 6) {
                    seqParameterSet.scalingMatrix.ScalingList4x4[i] = ScalingList.read(aVar, 16);
                } else {
                    seqParameterSet.scalingMatrix.ScalingList8x8[i - 6] = ScalingList.read(aVar, 64);
                }
            }
        }
    }

    private static VUIParameters readVUIParameters(a aVar) {
        VUIParameters vUIParameters = new VUIParameters();
        vUIParameters.aspect_ratio_info_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (vUIParameters.aspect_ratio_info_present_flag) {
            vUIParameters.aspect_ratio = AspectRatio.fromValue(aVar.a(8));
            if (vUIParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                vUIParameters.sar_width = aVar.a(16);
                vUIParameters.sar_height = aVar.a(16);
            }
        }
        vUIParameters.overscan_info_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (vUIParameters.overscan_info_present_flag) {
            vUIParameters.overscan_appropriate_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        }
        vUIParameters.video_signal_type_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (vUIParameters.video_signal_type_present_flag) {
            vUIParameters.video_format = aVar.a(3);
            vUIParameters.video_full_range_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
            vUIParameters.colour_description_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
            if (vUIParameters.colour_description_present_flag) {
                vUIParameters.colour_primaries = aVar.a(8);
                vUIParameters.transfer_characteristics = aVar.a(8);
                vUIParameters.matrix_coefficients = aVar.a(8);
            }
        }
        vUIParameters.chroma_loc_info_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (vUIParameters.chroma_loc_info_present_flag) {
            vUIParameters.chroma_sample_loc_type_top_field = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            vUIParameters.chroma_sample_loc_type_bottom_field = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        }
        vUIParameters.timing_info_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (vUIParameters.timing_info_present_flag) {
            vUIParameters.num_units_in_tick = aVar.a(32);
            vUIParameters.time_scale = aVar.a(32);
            vUIParameters.fixed_frame_rate_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        }
        boolean d = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (d) {
            vUIParameters.nalHRDParams = readHRDParameters(aVar);
        }
        boolean d2 = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (d2) {
            vUIParameters.vclHRDParams = readHRDParameters(aVar);
        }
        if (d || d2) {
            vUIParameters.low_delay_hrd_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        }
        vUIParameters.pic_struct_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if (com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar)) {
            vUIParameters.bitstreamRestriction = new VUIParameters.BitstreamRestriction();
            vUIParameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
            vUIParameters.bitstreamRestriction.max_bytes_per_pic_denom = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            vUIParameters.bitstreamRestriction.max_bits_per_mb_denom = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            vUIParameters.bitstreamRestriction.log2_max_mv_length_horizontal = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            vUIParameters.bitstreamRestriction.log2_max_mv_length_vertical = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            vUIParameters.bitstreamRestriction.num_reorder_frames = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            vUIParameters.bitstreamRestriction.max_dec_frame_buffering = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        }
        return vUIParameters;
    }

    private static HRDParameters readHRDParameters(a aVar) {
        HRDParameters hRDParameters = new HRDParameters();
        hRDParameters.cpb_cnt_minus1 = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        hRDParameters.bit_rate_scale = aVar.a(4);
        hRDParameters.cpb_size_scale = aVar.a(4);
        hRDParameters.bit_rate_value_minus1 = new int[hRDParameters.cpb_cnt_minus1 + 1];
        hRDParameters.cpb_size_value_minus1 = new int[hRDParameters.cpb_cnt_minus1 + 1];
        hRDParameters.cbr_flag = new boolean[hRDParameters.cpb_cnt_minus1 + 1];
        for (int i = 0; i <= hRDParameters.cpb_cnt_minus1; i++) {
            hRDParameters.bit_rate_value_minus1[i] = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            hRDParameters.cpb_size_value_minus1[i] = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            hRDParameters.cbr_flag[i] = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        }
        hRDParameters.initial_cpb_removal_delay_length_minus1 = aVar.a(5);
        hRDParameters.cpb_removal_delay_length_minus1 = aVar.a(5);
        hRDParameters.dpb_output_delay_length_minus1 = aVar.a(5);
        hRDParameters.time_offset_length = aVar.a(5);
        return hRDParameters;
    }

    public void write(ByteBuffer byteBuffer) {
        com.uxcam.video.screen.codec.b.a.b bVar = new com.uxcam.video.screen.codec.b.a.b(byteBuffer);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.profile_idc, 8);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.constraint_set_0_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.constraint_set_1_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.constraint_set_2_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.constraint_set_3_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, 0L, 4);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.level_idc, 8);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.seq_parameter_set_id);
        if (this.profile_idc == 100 || this.profile_idc == 110 || this.profile_idc == 122 || this.profile_idc == 144) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, fromColor(this.chroma_format_idc));
            if (this.chroma_format_idc == b.YUV444) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.residual_color_transform_flag);
            }
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.bit_depth_luma_minus8);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.bit_depth_chroma_minus8);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.qpprime_y_zero_transform_bypass_flag);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.scalingMatrix != null);
            if (this.scalingMatrix != null) {
                for (int i = 0; i < 8; i++) {
                    if (i < 6) {
                        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.scalingMatrix.ScalingList4x4[i] != null);
                        if (this.scalingMatrix.ScalingList4x4[i] != null) {
                            this.scalingMatrix.ScalingList4x4[i].write(bVar);
                        }
                    } else {
                        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.scalingMatrix.ScalingList8x8[i - 6] != null);
                        if (this.scalingMatrix.ScalingList8x8[i - 6] != null) {
                            this.scalingMatrix.ScalingList8x8[i - 6].write(bVar);
                        }
                    }
                }
            }
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.log2_max_frame_num_minus4);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.pic_order_cnt_type);
        if (this.pic_order_cnt_type == 0) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.log2_max_pic_order_cnt_lsb_minus4);
        } else if (this.pic_order_cnt_type == 1) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.delta_pic_order_always_zero_flag);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar, this.offset_for_non_ref_pic);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar, this.offset_for_top_to_bottom_field);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.offsetForRefFrame.length);
            for (int i2 = 0; i2 < this.offsetForRefFrame.length; i2++) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar, this.offsetForRefFrame[i2]);
            }
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.num_ref_frames);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.gaps_in_frame_num_value_allowed_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.pic_width_in_mbs_minus1);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.pic_height_in_map_units_minus1);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.frame_mbs_only_flag);
        if (!this.frame_mbs_only_flag) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.mb_adaptive_frame_field_flag);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.direct_8x8_inference_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.frame_cropping_flag);
        if (this.frame_cropping_flag) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.frame_crop_left_offset);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.frame_crop_right_offset);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.frame_crop_top_offset);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.frame_crop_bottom_offset);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.vuiParams != null);
        if (this.vuiParams != null) {
            writeVUIParameters(this.vuiParams, bVar);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar);
    }

    private void writeVUIParameters(VUIParameters vUIParameters, com.uxcam.video.screen.codec.b.a.b bVar) {
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.aspect_ratio_info_present_flag);
        if (vUIParameters.aspect_ratio_info_present_flag) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.aspect_ratio.getValue(), 8);
            if (vUIParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.sar_width, 16);
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.sar_height, 16);
            }
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.overscan_info_present_flag);
        if (vUIParameters.overscan_info_present_flag) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.overscan_appropriate_flag);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.video_signal_type_present_flag);
        if (vUIParameters.video_signal_type_present_flag) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.video_format, 3);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.video_full_range_flag);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.colour_description_present_flag);
            if (vUIParameters.colour_description_present_flag) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.colour_primaries, 8);
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.transfer_characteristics, 8);
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.matrix_coefficients, 8);
            }
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.chroma_loc_info_present_flag);
        if (vUIParameters.chroma_loc_info_present_flag) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.chroma_sample_loc_type_top_field);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.chroma_sample_loc_type_bottom_field);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.timing_info_present_flag);
        if (vUIParameters.timing_info_present_flag) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.num_units_in_tick, 32);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.time_scale, 32);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.fixed_frame_rate_flag);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.nalHRDParams != null);
        if (vUIParameters.nalHRDParams != null) {
            writeHRDParameters(vUIParameters.nalHRDParams, bVar);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.vclHRDParams != null);
        if (vUIParameters.vclHRDParams != null) {
            writeHRDParameters(vUIParameters.vclHRDParams, bVar);
        }
        if (vUIParameters.nalHRDParams != null || vUIParameters.vclHRDParams != null) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.low_delay_hrd_flag);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.pic_struct_present_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction != null);
        if (vUIParameters.bitstreamRestriction != null) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction.max_bytes_per_pic_denom);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction.max_bits_per_mb_denom);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction.log2_max_mv_length_horizontal);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction.log2_max_mv_length_vertical);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction.num_reorder_frames);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, vUIParameters.bitstreamRestriction.max_dec_frame_buffering);
        }
    }

    private void writeHRDParameters(HRDParameters hRDParameters, com.uxcam.video.screen.codec.b.a.b bVar) {
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.cpb_cnt_minus1);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.bit_rate_scale, 4);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.cpb_size_scale, 4);
        for (int i = 0; i <= hRDParameters.cpb_cnt_minus1; i++) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.bit_rate_value_minus1[i]);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.cpb_size_value_minus1[i]);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.cbr_flag[i]);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.initial_cpb_removal_delay_length_minus1, 5);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.cpb_removal_delay_length_minus1, 5);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.dpb_output_delay_length_minus1, 5);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, hRDParameters.time_offset_length, 5);
    }

    public SeqParameterSet copy() {
        ByteBuffer allocate = ByteBuffer.allocate(2048);
        write(allocate);
        allocate.flip();
        return read(allocate);
    }
}
