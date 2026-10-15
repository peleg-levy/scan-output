package com.uxcam.video.screen.codec.a;

import com.uxcam.video.screen.codec.b.b.d;
import com.uxcam.video.screen.codec.b.b.g;
import com.uxcam.video.screen.codec.b.h;
import com.uxcam.video.screen.codec.b.i;
import com.uxcam.video.screen.codec.c.a.a.ak;
import com.uxcam.video.screen.codec.c.a.a.aw;
import com.uxcam.video.screen.codec.c.a.a.w;
import com.uxcam.video.screen.codec.c.a.b.b;
import com.uxcam.video.screen.codec.c.a.b.c;
import com.uxcam.video.screen.codec.codecs.h264.io.model.SeqParameterSet;
import com.uxcam.video.screen.codec.e.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/a/a.class */
public class a {
    private i j;
    public d a;
    public b f;
    public int h;
    private c k;
    public static int i = 1;
    private final int l = 1;
    public ByteBuffer g = ByteBuffer.allocate(4194304);
    public com.uxcam.video.screen.codec.codecs.h264.b c = new com.uxcam.video.screen.codec.codecs.h264.b();
    public e b = com.uxcam.video.screen.codec.e.a.a(com.uxcam.video.screen.codec.b.b.b.RGB, com.uxcam.video.screen.codec.codecs.h264.b.a()[0]);
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();

    public a(File file) {
        this.j = new com.uxcam.video.screen.codec.b.c(new FileOutputStream(file).getChannel());
        this.k = new c(this.j, com.uxcam.video.screen.codec.c.a.a.MP4);
        this.f = this.k.a(com.uxcam.video.screen.codec.c.a.e.VIDEO);
    }

    public final void a() {
        b bVar = this.f;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.e;
        ByteBuffer a = h.a(h.a((ByteBuffer) arrayList.get(0)));
        if (a.remaining() >= 2) {
            ByteBuffer duplicate = a.duplicate();
            ByteBuffer duplicate2 = a.duplicate();
            byte b = duplicate.get();
            duplicate2.put(b);
            byte b2 = duplicate.get();
            duplicate2.put(b2);
            while (duplicate.hasRemaining()) {
                byte b3 = duplicate.get();
                if (b != 0 || b2 != 0 || b3 != 3) {
                    duplicate2.put(b3);
                }
                b = b2;
                b2 = b3;
            }
            a.limit(duplicate2.position());
        }
        SeqParameterSet read = SeqParameterSet.read(a);
        com.uxcam.video.screen.codec.codecs.h264.c.a aVar = new com.uxcam.video.screen.codec.codecs.h264.c.a(read.profile_idc, read.level_idc, arrayList, arrayList2);
        int i2 = (read.pic_width_in_mbs_minus1 + 1) << 4;
        int i3 = ((read.pic_height_in_map_units_minus1 + 1) << (read.frame_mbs_only_flag ? 0 : 1)) << 4;
        g gVar = new g(read.frame_cropping_flag ? i2 - ((read.frame_crop_right_offset + read.frame_crop_left_offset) << read.chroma_format_idc.n[1]) : i2, read.frame_cropping_flag ? i3 - ((read.frame_crop_bottom_offset + read.frame_crop_top_offset) << read.chroma_format_idc.o[1]) : i3);
        aw awVar = new aw(new w("avc1"), "jcod", (short) gVar.a, (short) gVar.b, "JCodec");
        awVar.a(aVar);
        bVar.a((ak) awVar);
        c cVar = this.k;
        cVar.a(cVar.a());
        i iVar = this.j;
        if (iVar != null) {
            try {
                iVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
