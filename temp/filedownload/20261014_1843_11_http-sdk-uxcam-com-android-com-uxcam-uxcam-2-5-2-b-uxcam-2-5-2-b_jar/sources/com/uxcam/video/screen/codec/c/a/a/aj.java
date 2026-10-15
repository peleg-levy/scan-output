package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/aj.class */
public class aj extends af {
    public static final a a = new a();

    /* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/aj$a.class */
    public static class a extends d {
        private Map a = new HashMap();

        public a() {
            this.a.put("ap4h", aw.class);
            this.a.put("apch", aw.class);
            this.a.put("apcn", aw.class);
            this.a.put("apcs", aw.class);
            this.a.put("apco", aw.class);
            this.a.put("avc1", aw.class);
            this.a.put("cvid", aw.class);
            this.a.put("jpeg", aw.class);
            this.a.put("smc ", aw.class);
            this.a.put("rle ", aw.class);
            this.a.put("rpza", aw.class);
            this.a.put("kpcd", aw.class);
            this.a.put("png ", aw.class);
            this.a.put("mjpa", aw.class);
            this.a.put("mjpb", aw.class);
            this.a.put("SVQ1", aw.class);
            this.a.put("SVQ3", aw.class);
            this.a.put("mp4v", aw.class);
            this.a.put("dvc ", aw.class);
            this.a.put("dvcp", aw.class);
            this.a.put("gif ", aw.class);
            this.a.put("h263", aw.class);
            this.a.put("tiff", aw.class);
            this.a.put("raw ", aw.class);
            this.a.put("2vuY", aw.class);
            this.a.put("yuv2", aw.class);
            this.a.put("v308", aw.class);
            this.a.put("v408", aw.class);
            this.a.put("v216", aw.class);
            this.a.put("v410", aw.class);
            this.a.put("v210", aw.class);
            this.a.put("m2v1", aw.class);
            this.a.put("m1v1", aw.class);
            this.a.put("xd5b", aw.class);
            this.a.put("dv5n", aw.class);
            this.a.put("jp2h", aw.class);
            this.a.put("mjp2", aw.class);
            this.a.put("ac-3", b.class);
            this.a.put("cac3", b.class);
            this.a.put("ima4", b.class);
            this.a.put("aac ", b.class);
            this.a.put("celp", b.class);
            this.a.put("hvxc", b.class);
            this.a.put("twvq", b.class);
            this.a.put(".mp1", b.class);
            this.a.put(".mp2", b.class);
            this.a.put("midi", b.class);
            this.a.put("apvs", b.class);
            this.a.put("alac", b.class);
            this.a.put("aach", b.class);
            this.a.put("aacl", b.class);
            this.a.put("aace", b.class);
            this.a.put("aacf", b.class);
            this.a.put("aacp", b.class);
            this.a.put("aacs", b.class);
            this.a.put("samr", b.class);
            this.a.put("AUDB", b.class);
            this.a.put("ilbc", b.class);
            this.a.put("ms\u0000\u0011", b.class);
            this.a.put("ms\u00001", b.class);
            this.a.put("aes3", b.class);
            this.a.put("NONE", b.class);
            this.a.put("raw ", b.class);
            this.a.put("twos", b.class);
            this.a.put("sowt", b.class);
            this.a.put("MAC3 ", b.class);
            this.a.put("MAC6 ", b.class);
            this.a.put("ima4", b.class);
            this.a.put("fl32", b.class);
            this.a.put("fl64", b.class);
            this.a.put("in24", b.class);
            this.a.put("in32", b.class);
            this.a.put("ulaw", b.class);
            this.a.put("alaw", b.class);
            this.a.put("dvca", b.class);
            this.a.put("QDMC", b.class);
            this.a.put("QDM2", b.class);
            this.a.put("Qclp", b.class);
            this.a.put(".mp3", b.class);
            this.a.put("mp4a", b.class);
            this.a.put("lpcm", b.class);
            this.a.put("tmcd", ar.class);
            this.a.put("time", ar.class);
            this.a.put("c608", ak.class);
            this.a.put("c708", ak.class);
            this.a.put("text", ak.class);
        }
    }

    public static String a() {
        return "stsd";
    }

    private aj(w wVar) {
        super(wVar);
        this.f = a;
    }

    public aj() {
        this(new w("stsd"));
    }

    public aj(ak... akVarArr) {
        this();
        for (ak akVar : akVarArr) {
            this.e.add(akVar);
        }
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.e.size());
        super.a(byteBuffer);
    }
}
