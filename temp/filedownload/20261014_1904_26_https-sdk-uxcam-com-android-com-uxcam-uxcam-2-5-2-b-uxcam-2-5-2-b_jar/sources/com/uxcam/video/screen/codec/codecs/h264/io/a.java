package com.uxcam.video.screen.codec.codecs.h264.io;

import com.uxcam.video.screen.codec.b.a.c;
import com.uxcam.video.screen.codec.b.b.b;
import com.uxcam.video.screen.codec.codecs.h264.io.model.MBType;
import com.uxcam.video.screen.codec.codecs.h264.io.model.SeqParameterSet;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/codecs/h264/io/a.class */
public final class a {
    private b d;
    private c e;
    public int[] a;
    public int[] b;
    private int f;
    public int c;

    public a(SeqParameterSet seqParameterSet, int i, int i2) {
        this.d = seqParameterSet.chroma_format_idc;
        this.e = this.d == b.YUV420 ? com.uxcam.video.screen.codec.codecs.h264.a.b : this.d == b.YUV422 ? com.uxcam.video.screen.codec.codecs.h264.a.c : this.d == b.YUV444 ? com.uxcam.video.screen.codec.codecs.h264.a.a[0] : null;
        this.f = seqParameterSet.pic_width_in_mbs_minus1 + 1;
        this.c = (1 << i2) - 1;
        this.a = new int[4];
        this.b = new int[this.f << i];
    }

    public final void a(com.uxcam.video.screen.codec.b.a.b bVar, int[] iArr, c[] cVarArr, int i, int[] iArr2) {
        a(bVar, iArr, cVarArr, 0, i, iArr2, this.e);
    }

    public static int a(com.uxcam.video.screen.codec.b.a.b bVar, int[] iArr, c[] cVarArr, int i, int i2, int[] iArr2, c cVar) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = iArr[iArr2[i6 + i]];
            if (i7 == 0) {
                int i8 = i4;
                iArr3[i8] = iArr3[i8] + 1;
                i5++;
            } else {
                int i9 = i4;
                i4++;
                iArr4[i9] = i7;
            }
        }
        if (i4 < i2) {
            i5 -= iArr3[i4];
        }
        int i10 = 0;
        while (i10 < i4 && i10 < 3 && Math.abs(iArr4[(i4 - i10) - 1]) == 1) {
            i10++;
        }
        int i11 = (i4 << 4) | i10;
        cVar.a(bVar, i11);
        if (i4 > 0) {
            int i12 = i4;
            int i13 = i10;
            for (int i14 = i12 - 1; i14 >= i12 - i13; i14--) {
                bVar.a(iArr4[i14] >>> 31);
            }
            int i15 = i4;
            int i16 = (i15 <= 10 || i10 >= 3) ? 0 : 1;
            for (int i17 = (i15 - i10) - 1; i17 >= 0; i17--) {
                int i18 = iArr4[i17];
                int i19 = i18 >>> 31;
                int i20 = i18 >> 31;
                int i21 = ((((i18 ^ i20) - i20) << 1) + i19) - 2;
                if (i17 == (i15 - i10) - 1 && i10 < 3) {
                    i21 -= 2;
                }
                int i22 = i21 >> i16;
                if ((i16 == 0 && i22 < 14) || (i16 > 0 && i22 < 15)) {
                    bVar.a(1, i22 + 1);
                    bVar.a(i21, i16);
                } else if (i16 != 0 || i21 >= 30) {
                    if (i16 == 0) {
                        i21 -= 15;
                    }
                    int i23 = 12;
                    while (true) {
                        i3 = ((i21 - ((i23 + 3) << i16)) - (1 << i23)) + 4096;
                        if (i3 < (1 << i23)) {
                            break;
                        }
                        i23++;
                    }
                    bVar.a(1, i23 + 4);
                    bVar.a(i3, i23);
                } else {
                    bVar.a(1, 15);
                    bVar.a(i21 - 14, 4);
                }
                if (i16 == 0) {
                    i16 = 1;
                }
                if (com.uxcam.video.screen.codec.b.c.a.b(iArr4[i17]) > (3 << (i16 - 1)) && i16 < 6) {
                    i16++;
                }
            }
            if (i4 < i2) {
                cVarArr[i4 - 1].a(bVar, i5);
                int i24 = i5;
                for (int i25 = i4 - 1; i25 > 0 && i24 > 0; i25--) {
                    com.uxcam.video.screen.codec.codecs.h264.a.d[Math.min(6, i24 - 1)].a(bVar, iArr3[i25]);
                    i24 -= iArr3[i25];
                }
            }
        }
        return i11;
    }

    public static c a(boolean z, MBType mBType, int i, boolean z2, MBType mBType2, int i2) {
        int i3 = mBType == null ? 0 : i >> 4;
        int i4 = mBType2 == null ? 0 : i2 >> 4;
        return com.uxcam.video.screen.codec.codecs.h264.a.a[Math.min((z && z2) ? ((i3 + i4) + 1) >> 1 : z ? i3 : z2 ? i4 : 0, 8)];
    }
}
