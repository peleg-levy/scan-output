package com.uxcam.video.screen.codec.codecs.h264.io.model;

import com.uxcam.video.screen.codec.b.a.a;
import com.uxcam.video.screen.codec.b.a.b;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/PictureParameterSet.class */
public class PictureParameterSet {
    public boolean entropy_coding_mode_flag;
    public int[] num_ref_idx_active_minus1 = new int[2];
    public int slice_group_change_rate_minus1;
    public int pic_parameter_set_id;
    public int seq_parameter_set_id;
    public boolean pic_order_present_flag;
    public int num_slice_groups_minus1;
    public int slice_group_map_type;
    public boolean weighted_pred_flag;
    public int weighted_bipred_idc;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public int chroma_qp_index_offset;
    public boolean deblocking_filter_control_present_flag;
    public boolean constrained_intra_pred_flag;
    public boolean redundant_pic_cnt_present_flag;
    public int[] top_left;
    public int[] bottom_right;
    public int[] run_length_minus1;
    public boolean slice_group_change_direction_flag;
    public int[] slice_group_id;
    public PPSExt extended;

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/model/PictureParameterSet$PPSExt.class */
    public static class PPSExt {
        public boolean transform_8x8_mode_flag;
        public ScalingMatrix scalindMatrix;
        public int second_chroma_qp_index_offset;
        public boolean[] pic_scaling_list_present_flag;
    }

    public static PictureParameterSet read(ByteBuffer byteBuffer) {
        a aVar = new a(byteBuffer);
        PictureParameterSet pictureParameterSet = new PictureParameterSet();
        pictureParameterSet.pic_parameter_set_id = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        pictureParameterSet.seq_parameter_set_id = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        pictureParameterSet.entropy_coding_mode_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        pictureParameterSet.pic_order_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        pictureParameterSet.num_slice_groups_minus1 = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
        if (pictureParameterSet.num_slice_groups_minus1 > 0) {
            pictureParameterSet.slice_group_map_type = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            pictureParameterSet.top_left = new int[pictureParameterSet.num_slice_groups_minus1 + 1];
            pictureParameterSet.bottom_right = new int[pictureParameterSet.num_slice_groups_minus1 + 1];
            pictureParameterSet.run_length_minus1 = new int[pictureParameterSet.num_slice_groups_minus1 + 1];
            if (pictureParameterSet.slice_group_map_type == 0) {
                for (int i = 0; i <= pictureParameterSet.num_slice_groups_minus1; i++) {
                    pictureParameterSet.run_length_minus1[i] = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
                }
            } else if (pictureParameterSet.slice_group_map_type == 2) {
                for (int i2 = 0; i2 < pictureParameterSet.num_slice_groups_minus1; i2++) {
                    pictureParameterSet.top_left[i2] = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
                    pictureParameterSet.bottom_right[i2] = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
                }
            } else if (pictureParameterSet.slice_group_map_type == 3 || pictureParameterSet.slice_group_map_type == 4 || pictureParameterSet.slice_group_map_type == 5) {
                pictureParameterSet.slice_group_change_direction_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
                pictureParameterSet.slice_group_change_rate_minus1 = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
            } else if (pictureParameterSet.slice_group_map_type == 6) {
                int i3 = pictureParameterSet.num_slice_groups_minus1 + 1 > 4 ? 3 : pictureParameterSet.num_slice_groups_minus1 + 1 > 2 ? 2 : 1;
                int a = com.uxcam.video.screen.codec.codecs.h264.a.a.a(aVar);
                pictureParameterSet.slice_group_id = new int[a + 1];
                for (int i4 = 0; i4 <= a; i4++) {
                    new StringBuilder("PPS: slice_group_id [").append(i4).append("]f");
                    pictureParameterSet.slice_group_id[i4] = aVar.a(i3);
                }
            }
        }
        pictureParameterSet.num_ref_idx_active_minus1 = new int[]{com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar), com.uxcam.video.screen.codec.codecs.h264.a.a.b(aVar)};
        pictureParameterSet.weighted_pred_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        pictureParameterSet.weighted_bipred_idc = aVar.a(2);
        pictureParameterSet.pic_init_qp_minus26 = com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar);
        pictureParameterSet.pic_init_qs_minus26 = com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar);
        pictureParameterSet.chroma_qp_index_offset = com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar);
        pictureParameterSet.deblocking_filter_control_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        pictureParameterSet.constrained_intra_pred_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        pictureParameterSet.redundant_pic_cnt_present_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
        if ((aVar.b() < 32 && aVar.b(1) == 1 && (aVar.b(24) << 9) == 0) ? false : true) {
            pictureParameterSet.extended = new PPSExt();
            pictureParameterSet.extended.transform_8x8_mode_flag = com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar);
            if (com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar)) {
                int i5 = 0;
                while (true) {
                    if (i5 >= 6 + (2 * (pictureParameterSet.extended.transform_8x8_mode_flag ? 1 : 0))) {
                        break;
                    }
                    if (com.uxcam.video.screen.codec.codecs.h264.a.a.d(aVar)) {
                        pictureParameterSet.extended.scalindMatrix.ScalingList4x4 = new ScalingList[8];
                        pictureParameterSet.extended.scalindMatrix.ScalingList8x8 = new ScalingList[8];
                        if (i5 < 6) {
                            pictureParameterSet.extended.scalindMatrix.ScalingList4x4[i5] = ScalingList.read(aVar, 16);
                        } else {
                            pictureParameterSet.extended.scalindMatrix.ScalingList8x8[i5 - 6] = ScalingList.read(aVar, 64);
                        }
                    }
                    i5++;
                }
            }
            pictureParameterSet.extended.second_chroma_qp_index_offset = com.uxcam.video.screen.codec.codecs.h264.a.a.c(aVar);
        }
        return pictureParameterSet;
    }

    public void write(ByteBuffer byteBuffer) {
        b bVar = new b(byteBuffer);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.pic_parameter_set_id);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.seq_parameter_set_id);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.entropy_coding_mode_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.pic_order_present_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.num_slice_groups_minus1);
        if (this.num_slice_groups_minus1 > 0) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.slice_group_map_type);
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (this.slice_group_map_type == 0) {
                for (int i = 0; i <= this.num_slice_groups_minus1; i++) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, iArr3[i]);
                }
            } else if (this.slice_group_map_type == 2) {
                for (int i2 = 0; i2 < this.num_slice_groups_minus1; i2++) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, iArr[i2]);
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, iArr2[i2]);
                }
            } else if (this.slice_group_map_type == 3 || this.slice_group_map_type == 4 || this.slice_group_map_type == 5) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.slice_group_change_direction_flag);
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.slice_group_change_rate_minus1);
            } else if (this.slice_group_map_type == 6) {
                int i3 = this.num_slice_groups_minus1 + 1 > 4 ? 3 : this.num_slice_groups_minus1 + 1 > 2 ? 2 : 1;
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.slice_group_id.length);
                for (int i4 = 0; i4 <= this.slice_group_id.length; i4++) {
                    bVar.a(this.slice_group_id[i4], i3);
                }
            }
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.num_ref_idx_active_minus1[0]);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.num_ref_idx_active_minus1[1]);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.weighted_pred_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.weighted_bipred_idc, 2);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar, this.pic_init_qp_minus26);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar, this.pic_init_qs_minus26);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar, this.chroma_qp_index_offset);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.deblocking_filter_control_present_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.constrained_intra_pred_flag);
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.redundant_pic_cnt_present_flag);
        if (this.extended != null) {
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.extended.transform_8x8_mode_flag);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.extended.scalindMatrix != null);
            if (this.extended.scalindMatrix != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= 6 + (2 * (this.extended.transform_8x8_mode_flag ? 1 : 0))) {
                        break;
                    }
                    if (i5 < 6) {
                        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.extended.scalindMatrix.ScalingList4x4[i5] != null);
                        if (this.extended.scalindMatrix.ScalingList4x4[i5] != null) {
                            this.extended.scalindMatrix.ScalingList4x4[i5].write(bVar);
                        }
                    } else {
                        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar, this.extended.scalindMatrix.ScalingList8x8[i5 - 6] != null);
                        if (this.extended.scalindMatrix.ScalingList8x8[i5 - 6] != null) {
                            this.extended.scalindMatrix.ScalingList8x8[i5 - 6].write(bVar);
                        }
                    }
                    i5++;
                }
            }
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar, this.extended.second_chroma_qp_index_offset);
        }
        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar);
    }

    public int hashCode() {
        return (31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * (31 + Arrays.hashCode(this.bottom_right))) + this.chroma_qp_index_offset)) + (this.constrained_intra_pred_flag ? 1231 : 1237))) + (this.deblocking_filter_control_present_flag ? 1231 : 1237))) + (this.entropy_coding_mode_flag ? 1231 : 1237))) + (this.extended == null ? 0 : this.extended.hashCode()))) + this.num_ref_idx_active_minus1[0])) + this.num_ref_idx_active_minus1[1])) + this.num_slice_groups_minus1)) + this.pic_init_qp_minus26)) + this.pic_init_qs_minus26)) + (this.pic_order_present_flag ? 1231 : 1237))) + this.pic_parameter_set_id)) + (this.redundant_pic_cnt_present_flag ? 1231 : 1237))) + Arrays.hashCode(this.run_length_minus1))) + this.seq_parameter_set_id)) + (this.slice_group_change_direction_flag ? 1231 : 1237))) + this.slice_group_change_rate_minus1)) + Arrays.hashCode(this.slice_group_id))) + this.slice_group_map_type)) + Arrays.hashCode(this.top_left))) + this.weighted_bipred_idc)) + (this.weighted_pred_flag ? 1231 : 1237);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PictureParameterSet pictureParameterSet = (PictureParameterSet) obj;
        if (!Arrays.equals(this.bottom_right, pictureParameterSet.bottom_right) || this.chroma_qp_index_offset != pictureParameterSet.chroma_qp_index_offset || this.constrained_intra_pred_flag != pictureParameterSet.constrained_intra_pred_flag || this.deblocking_filter_control_present_flag != pictureParameterSet.deblocking_filter_control_present_flag || this.entropy_coding_mode_flag != pictureParameterSet.entropy_coding_mode_flag) {
            return false;
        }
        if (this.extended == null) {
            if (pictureParameterSet.extended != null) {
                return false;
            }
        } else if (!this.extended.equals(pictureParameterSet.extended)) {
            return false;
        }
        return this.num_ref_idx_active_minus1[0] == pictureParameterSet.num_ref_idx_active_minus1[0] && this.num_ref_idx_active_minus1[1] == pictureParameterSet.num_ref_idx_active_minus1[1] && this.num_slice_groups_minus1 == pictureParameterSet.num_slice_groups_minus1 && this.pic_init_qp_minus26 == pictureParameterSet.pic_init_qp_minus26 && this.pic_init_qs_minus26 == pictureParameterSet.pic_init_qs_minus26 && this.pic_order_present_flag == pictureParameterSet.pic_order_present_flag && this.pic_parameter_set_id == pictureParameterSet.pic_parameter_set_id && this.redundant_pic_cnt_present_flag == pictureParameterSet.redundant_pic_cnt_present_flag && Arrays.equals(this.run_length_minus1, pictureParameterSet.run_length_minus1) && this.seq_parameter_set_id == pictureParameterSet.seq_parameter_set_id && this.slice_group_change_direction_flag == pictureParameterSet.slice_group_change_direction_flag && this.slice_group_change_rate_minus1 == pictureParameterSet.slice_group_change_rate_minus1 && Arrays.equals(this.slice_group_id, pictureParameterSet.slice_group_id) && this.slice_group_map_type == pictureParameterSet.slice_group_map_type && Arrays.equals(this.top_left, pictureParameterSet.top_left) && this.weighted_bipred_idc == pictureParameterSet.weighted_bipred_idc && this.weighted_pred_flag == pictureParameterSet.weighted_pred_flag;
    }

    public PictureParameterSet copy() {
        ByteBuffer allocate = ByteBuffer.allocate(2048);
        write(allocate);
        allocate.flip();
        return read(allocate);
    }
}
