package com.uxcam.video.screen;

import android.graphics.Bitmap;
import com.uxcam.j.l;
import com.uxcam.video.screen.codec.b.b.g;
import com.uxcam.video.screen.codec.codecs.h264.io.model.NALUnit;
import com.uxcam.video.screen.codec.codecs.h264.io.model.NALUnitType;
import com.uxcam.video.screen.codec.codecs.h264.io.model.PictureParameterSet;
import com.uxcam.video.screen.codec.codecs.h264.io.model.RefPicMarkingIDR;
import com.uxcam.video.screen.codec.codecs.h264.io.model.SeqParameterSet;
import com.uxcam.video.screen.codec.codecs.h264.io.model.SliceHeader;
import com.uxcam.video.screen.codec.codecs.h264.io.model.SliceType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/a.class */
public class a {
    public static boolean a = true;
    private static String f = a.class.getSimpleName();
    com.uxcam.video.screen.codec.a.a.a b;
    Bitmap c;
    int d;
    int e;

    public a(com.uxcam.video.screen.codec.a.a.a aVar) {
        this.b = aVar;
    }

    public static void a() {
        a = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v73, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r1v75, types: [int[], int[][]] */
    public final void b() {
        ByteBuffer a2;
        try {
            if (this.c == null) {
                return;
            }
            com.uxcam.video.screen.codec.a.a.a aVar = this.b;
            Bitmap bitmap = this.c;
            com.uxcam.video.screen.codec.b.b.d a3 = com.uxcam.video.screen.codec.b.b.d.a(Integer.parseInt(String.valueOf(bitmap.getWidth())), Integer.parseInt(String.valueOf(bitmap.getHeight())), com.uxcam.video.screen.codec.b.b.b.RGB);
            int[] iArr = a3.d[0];
            int[] iArr2 = new int[bitmap.getWidth() * bitmap.getHeight()];
            bitmap.getPixels(iArr2, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < bitmap.getHeight(); i3++) {
                int i4 = 0;
                while (i4 < bitmap.getWidth()) {
                    int i5 = iArr2[i];
                    iArr[i2] = (i5 >> 16) & 255;
                    iArr[i2 + 1] = (i5 >> 8) & 255;
                    iArr[i2 + 2] = i5 & 255;
                    i4++;
                    i++;
                    i2 += 3;
                }
            }
            if (aVar.a == null) {
                aVar.a = com.uxcam.video.screen.codec.b.b.d.a(a3.b, a3.c, com.uxcam.video.screen.codec.codecs.h264.b.a()[0]);
            }
            if (com.uxcam.video.screen.codec.a.a.i > 0) {
                com.uxcam.video.screen.codec.a.a.i = 1;
            }
            aVar.b.a(a3, aVar.a);
            aVar.g.clear();
            com.uxcam.video.screen.codec.codecs.h264.b bVar = aVar.c;
            com.uxcam.video.screen.codec.b.b.d dVar = aVar.a;
            ByteBuffer duplicate = aVar.g.duplicate();
            g gVar = new g(dVar.e == null ? dVar.b : dVar.e.a, dVar.e == null ? dVar.c : dVar.e.b);
            SeqParameterSet seqParameterSet = new SeqParameterSet();
            seqParameterSet.pic_width_in_mbs_minus1 = ((gVar.a + 15) >> 4) - 1;
            seqParameterSet.pic_height_in_map_units_minus1 = ((gVar.b + 15) >> 4) - 1;
            seqParameterSet.chroma_format_idc = com.uxcam.video.screen.codec.b.b.b.YUV420;
            seqParameterSet.profile_idc = 66;
            seqParameterSet.level_idc = 40;
            seqParameterSet.frame_mbs_only_flag = true;
            int i6 = (seqParameterSet.pic_width_in_mbs_minus1 + 1) << 4;
            int i7 = (seqParameterSet.pic_height_in_map_units_minus1 + 1) << 4;
            seqParameterSet.frame_cropping_flag = (i6 == gVar.a && i7 == gVar.b) ? false : true;
            seqParameterSet.frame_crop_right_offset = ((i6 - gVar.a) + 1) >> 1;
            seqParameterSet.frame_crop_bottom_offset = ((i7 - gVar.b) + 1) >> 1;
            PictureParameterSet pictureParameterSet = new PictureParameterSet();
            pictureParameterSet.pic_init_qp_minus26 = -6;
            duplicate.putInt(1);
            new NALUnit(NALUnitType.SPS, 3).write(duplicate);
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            seqParameterSet.write(allocate);
            allocate.flip();
            com.uxcam.video.screen.codec.codecs.h264.c.a(allocate, duplicate);
            duplicate.putInt(1);
            new NALUnit(NALUnitType.PPS, 3).write(duplicate);
            ByteBuffer allocate2 = ByteBuffer.allocate(1024);
            pictureParameterSet.write(allocate2);
            allocate2.flip();
            com.uxcam.video.screen.codec.codecs.h264.c.a(allocate2, duplicate);
            int i8 = seqParameterSet.pic_width_in_mbs_minus1 + 1;
            bVar.b = new int[]{new int[16], new int[8], new int[8]};
            bVar.c = new int[]{new int[i8 << 4], new int[i8 << 3], new int[i8 << 3]};
            bVar.a = new com.uxcam.video.screen.codec.codecs.h264.io.a[]{new com.uxcam.video.screen.codec.codecs.h264.io.a(seqParameterSet, 2, 2), new com.uxcam.video.screen.codec.codecs.h264.io.a(seqParameterSet, 1, 1), new com.uxcam.video.screen.codec.codecs.h264.io.a(seqParameterSet, 1, 1)};
            duplicate.putInt(1);
            new NALUnit(NALUnitType.IDR_SLICE, 2).write(duplicate);
            SliceHeader sliceHeader = new SliceHeader();
            sliceHeader.slice_type = SliceType.I;
            sliceHeader.refPicMarkingIDR = new RefPicMarkingIDR(false, false);
            sliceHeader.pps = pictureParameterSet;
            sliceHeader.sps = seqParameterSet;
            sliceHeader.pic_order_cnt_lsb = 0;
            com.uxcam.video.screen.codec.b.a.b bVar2 = new com.uxcam.video.screen.codec.b.a.b(ByteBuffer.allocate(dVar.b * dVar.c));
            new com.uxcam.video.screen.codec.codecs.h264.io.a.b();
            SeqParameterSet seqParameterSet2 = sliceHeader.sps;
            PictureParameterSet pictureParameterSet2 = sliceHeader.pps;
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.first_mb_in_slice);
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.slice_type.ordinal() + (sliceHeader.slice_type_restr ? 5 : 0));
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.pic_parameter_set_id);
            bVar2.a(sliceHeader.frame_num, seqParameterSet2.log2_max_frame_num_minus4 + 4);
            if (!seqParameterSet2.frame_mbs_only_flag) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.field_pic_flag);
                if (sliceHeader.field_pic_flag) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.bottom_field_flag);
                }
            }
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.idr_pic_id);
            if (seqParameterSet2.pic_order_cnt_type == 0) {
                bVar2.a(sliceHeader.pic_order_cnt_lsb, seqParameterSet2.log2_max_pic_order_cnt_lsb_minus4 + 4);
                if (pictureParameterSet2.pic_order_present_flag && !seqParameterSet2.field_pic_flag) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar2, sliceHeader.delta_pic_order_cnt_bottom);
                }
            }
            if (seqParameterSet2.pic_order_cnt_type == 1 && !seqParameterSet2.delta_pic_order_always_zero_flag) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar2, sliceHeader.delta_pic_order_cnt[0]);
                if (pictureParameterSet2.pic_order_present_flag && !seqParameterSet2.field_pic_flag) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar2, sliceHeader.delta_pic_order_cnt[1]);
                }
            }
            if (pictureParameterSet2.redundant_pic_cnt_present_flag) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.redundant_pic_cnt);
            }
            if (sliceHeader.slice_type == SliceType.B) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.direct_spatial_mv_pred_flag);
            }
            if (sliceHeader.slice_type == SliceType.P || sliceHeader.slice_type == SliceType.SP || sliceHeader.slice_type == SliceType.B) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.num_ref_idx_active_override_flag);
                if (sliceHeader.num_ref_idx_active_override_flag) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.num_ref_idx_active_minus1[0]);
                    if (sliceHeader.slice_type == SliceType.B) {
                        com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.num_ref_idx_active_minus1[1]);
                    }
                }
            }
            if (sliceHeader.slice_type.isInter()) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.refPicReordering[0] != null);
                com.uxcam.video.screen.codec.codecs.h264.io.a.b.a(sliceHeader.refPicReordering[0], bVar2);
            }
            if (sliceHeader.slice_type == SliceType.B) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.refPicReordering[1] != null);
                com.uxcam.video.screen.codec.codecs.h264.io.a.b.a(sliceHeader.refPicReordering[1], bVar2);
            }
            if ((pictureParameterSet2.weighted_pred_flag && (sliceHeader.slice_type == SliceType.P || sliceHeader.slice_type == SliceType.SP)) || (pictureParameterSet2.weighted_bipred_idc == 1 && sliceHeader.slice_type == SliceType.B)) {
                SeqParameterSet seqParameterSet3 = sliceHeader.sps;
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.pred_weight_table.luma_log2_weight_denom);
                if (seqParameterSet3.chroma_format_idc != com.uxcam.video.screen.codec.b.b.b.MONO) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.pred_weight_table.chroma_log2_weight_denom);
                }
                com.uxcam.video.screen.codec.codecs.h264.io.a.b.a(sliceHeader, bVar2, 0);
                if (sliceHeader.slice_type == SliceType.B) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.b.a(sliceHeader, bVar2, 1);
                }
            }
            RefPicMarkingIDR refPicMarkingIDR = sliceHeader.refPicMarkingIDR;
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, refPicMarkingIDR.isDiscardDecodedPics());
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, refPicMarkingIDR.isUseForlongTerm());
            if (pictureParameterSet2.entropy_coding_mode_flag && sliceHeader.slice_type.isInter()) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.cabac_init_idc);
            }
            com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar2, sliceHeader.slice_qp_delta);
            if (sliceHeader.slice_type == SliceType.SP || sliceHeader.slice_type == SliceType.SI) {
                if (sliceHeader.slice_type == SliceType.SP) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.sp_for_switch_flag);
                }
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar2, sliceHeader.slice_qs_delta);
            }
            if (pictureParameterSet2.deblocking_filter_control_present_flag) {
                com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, sliceHeader.disable_deblocking_filter_idc);
                if (sliceHeader.disable_deblocking_filter_idc != 1) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar2, sliceHeader.slice_alpha_c0_offset_div2);
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.b(bVar2, sliceHeader.slice_beta_offset_div2);
                }
            }
            if (pictureParameterSet2.num_slice_groups_minus1 > 0 && pictureParameterSet2.slice_group_map_type >= 3 && pictureParameterSet2.slice_group_map_type <= 5) {
                int i9 = ((seqParameterSet2.pic_height_in_map_units_minus1 + 1) * (seqParameterSet2.pic_width_in_mbs_minus1 + 1)) / (pictureParameterSet2.slice_group_change_rate_minus1 + 1);
                if (((seqParameterSet2.pic_height_in_map_units_minus1 + 1) * (seqParameterSet2.pic_width_in_mbs_minus1 + 1)) % (pictureParameterSet2.slice_group_change_rate_minus1 + 1) > 0) {
                    i9++;
                }
                int i10 = (i9 + 1) - 1;
                int i11 = 0;
                while (i10 != 0) {
                    i10 >>= 1;
                    i11++;
                }
                bVar2.a(sliceHeader.slice_group_change_cycle, i11);
            }
            com.uxcam.video.screen.codec.b.b.d a4 = com.uxcam.video.screen.codec.b.b.d.a(16, 16, com.uxcam.video.screen.codec.b.b.b.YUV420);
            for (int i12 = 0; i12 < seqParameterSet.pic_height_in_map_units_minus1 + 1; i12++) {
                for (int i13 = 0; i13 < seqParameterSet.pic_width_in_mbs_minus1 + 1; i13++) {
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar2, 23);
                    com.uxcam.video.screen.codec.b.a.b bVar3 = bVar2;
                    com.uxcam.video.screen.codec.b.a.b bVar4 = new com.uxcam.video.screen.codec.b.a.b(bVar3.a.duplicate(), bVar3.c, bVar3.b, bVar3.d);
                    int i14 = i13;
                    int i15 = i12;
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar4, 0);
                    com.uxcam.video.screen.codec.codecs.h264.io.a.a.a(bVar4, com.uxcam.video.screen.codec.b.c.a.c(0));
                    int i16 = i14 << 4;
                    int i17 = i15 << 4;
                    int a5 = bVar.a(i16, i17);
                    int[][] iArr3 = new int[16][16];
                    for (int i18 = 0; i18 < iArr3.length; i18++) {
                        int[] iArr4 = iArr3[i18];
                        com.uxcam.video.screen.codec.codecs.h264.b.a(dVar.d[0], dVar.a(0), dVar.b(0), i16 + com.uxcam.video.screen.codec.codecs.h264.a.h[i18], i17 + com.uxcam.video.screen.codec.codecs.h264.a.i[i18], iArr4, a5);
                        com.uxcam.video.screen.codec.codecs.h264.a.b.b(iArr4);
                    }
                    int[] a6 = com.uxcam.video.screen.codec.codecs.h264.b.a(iArr3);
                    bVar.a(0, bVar4, i14 << 2, i15 << 2, a6);
                    bVar.a(0, bVar4, i14 << 2, i15 << 2, iArr3);
                    com.uxcam.video.screen.codec.codecs.h264.b.a(a6, iArr3);
                    int[] iArr5 = a4.d[0];
                    int a7 = bVar.a(i16, i17);
                    for (int i19 = 0; i19 < iArr3.length; i19++) {
                        com.uxcam.video.screen.codec.codecs.h264.b.a(iArr5, a7, iArr3[i19], 4, com.uxcam.video.screen.codec.codecs.h264.a.h[i19], com.uxcam.video.screen.codec.codecs.h264.a.i[i19]);
                    }
                    int i20 = dVar.a.n[1];
                    int i21 = dVar.a.o[1];
                    int i22 = i14 << (4 - i20);
                    int i23 = i15 << (4 - i21);
                    int[][] a8 = bVar.a(dVar, 1, i20, i21, i22, i23);
                    int[][] a9 = bVar.a(dVar, 2, i20, i21, i22, i23);
                    int[] a10 = com.uxcam.video.screen.codec.codecs.h264.b.a(a8);
                    int[] a11 = com.uxcam.video.screen.codec.codecs.h264.b.a(a9);
                    bVar.a(1, bVar4, i14 << 1, i15 << 1, a10);
                    bVar.a(2, bVar4, i14 << 1, i15 << 1, a11);
                    bVar.a(1, bVar4, i14 << 1, i15 << 1, a8);
                    bVar.a(2, bVar4, i14 << 1, i15 << 1, a9);
                    com.uxcam.video.screen.codec.codecs.h264.b.a(a10, a8);
                    bVar.a(a4.d[1], 1, i22, i23, a8);
                    com.uxcam.video.screen.codec.codecs.h264.b.a(a11, a9);
                    bVar.a(a4.d[2], 2, i22, i23, a9);
                    bVar4.b();
                    bVar2.b();
                    bVar2 = bVar4;
                    int i24 = i13;
                    System.arraycopy(a4.d[0], 240, bVar.c[0], i24 << 4, 16);
                    System.arraycopy(a4.d[1], 56, bVar.c[1], i24 << 3, 8);
                    System.arraycopy(a4.d[2], 56, bVar.c[2], i24 << 3, 8);
                    com.uxcam.video.screen.codec.codecs.h264.b.a(a4.d[0], 15, 16, bVar.b[0]);
                    com.uxcam.video.screen.codec.codecs.h264.b.a(a4.d[1], 7, 8, bVar.b[1]);
                    com.uxcam.video.screen.codec.codecs.h264.b.a(a4.d[2], 7, 8, bVar.b[2]);
                }
            }
            bVar2.a(1);
            bVar2.a();
            ByteBuffer byteBuffer = bVar2.a;
            byteBuffer.flip();
            com.uxcam.video.screen.codec.codecs.h264.c.a(byteBuffer, duplicate);
            duplicate.flip();
            aVar.d.clear();
            aVar.e.clear();
            ArrayList arrayList = aVar.d;
            ArrayList arrayList2 = aVar.e;
            ByteBuffer duplicate2 = duplicate.duplicate();
            while (duplicate2.hasRemaining() && (a2 = com.uxcam.video.screen.codec.codecs.h264.c.a(duplicate2)) != null) {
                NALUnit read = NALUnit.read(a2);
                if (read.type == NALUnitType.PPS) {
                    if (arrayList2 != null) {
                        arrayList2.add(a2);
                    }
                    duplicate.position(duplicate2.position());
                } else if (read.type != NALUnitType.SPS) {
                    if (read.type == NALUnitType.IDR_SLICE || read.type == NALUnitType.NON_IDR_SLICE) {
                        break;
                    }
                } else {
                    if (arrayList != null) {
                        arrayList.add(a2);
                    }
                    duplicate.position(duplicate2.position());
                }
            }
            ByteBuffer duplicate3 = duplicate.duplicate();
            ByteBuffer duplicate4 = duplicate.duplicate();
            int position = duplicate4.position();
            while (true) {
                ByteBuffer a12 = com.uxcam.video.screen.codec.codecs.h264.c.a(duplicate3);
                if (a12 == null) {
                    aVar.f.a(new com.uxcam.video.screen.codec.c.a.b(duplicate, aVar.h * com.uxcam.video.screen.codec.a.a.i, 1L, com.uxcam.video.screen.codec.a.a.i, aVar.h, aVar.h * com.uxcam.video.screen.codec.a.a.i, 0));
                    aVar.h++;
                    return;
                } else {
                    duplicate4.position(position);
                    duplicate4.putInt(a12.remaining());
                    position += a12.remaining() + 4;
                }
            }
        } catch (IOException e) {
            l.a("", e);
        }
    }
}
