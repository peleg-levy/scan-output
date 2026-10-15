package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/b.class */
public class b extends ak {
    public static int a = 1;
    public static int b = 2;
    public static Set c;
    private static Map g;
    private static Map h;
    private short i;
    private short j;
    private float k;
    private short l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private short t;
    private int u;

    @Override // com.uxcam.video.screen.codec.c.a.a.ak, com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putShort(this.t);
        byteBuffer.putShort(this.l);
        byteBuffer.putInt(this.m);
        if (this.t < 2) {
            byteBuffer.putShort(this.i);
            if (this.t == 0) {
                byteBuffer.putShort(this.j);
            } else {
                byteBuffer.putShort((short) 16);
            }
            byteBuffer.putShort((short) this.n);
            byteBuffer.putShort((short) this.o);
            byteBuffer.putInt((int) Math.round(this.k * 65536.0d));
            if (this.t == 1) {
                byteBuffer.putInt(this.p);
                byteBuffer.putInt(this.q);
                byteBuffer.putInt(this.r);
                byteBuffer.putInt(this.s);
            }
        } else if (this.t == 2) {
            byteBuffer.putShort((short) 3);
            byteBuffer.putShort((short) 16);
            byteBuffer.putShort((short) -2);
            byteBuffer.putShort((short) 0);
            byteBuffer.putInt(65536);
            byteBuffer.putInt(72);
            byteBuffer.putLong(Double.doubleToLongBits(this.k));
            byteBuffer.putInt(this.i);
            byteBuffer.putInt(2130706432);
            byteBuffer.putInt(this.j);
            byteBuffer.putInt(this.u);
            byteBuffer.putInt(this.r);
            byteBuffer.putInt(this.p);
        }
        c(byteBuffer);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.af, com.uxcam.video.screen.codec.c.a.a.c
    public final void a(StringBuilder sb) {
        sb.append(this.d.a + ": {\n");
        sb.append("entry: ");
        com.uxcam.video.screen.codec.b.c.b.a(this, sb, "channelCount", "sampleSize", "sampleRat", "revision", "vendor", "compressionId", "pktSize", "samplesPerPkt", "bytesPerPkt", "bytesPerFrame", "bytesPerSample", "version", "lpcmFlags");
        sb.append(",\nexts: [\n");
        b(sb);
        sb.append("\n]\n");
        sb.append("}\n");
    }

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("raw ");
        c.add("twos");
        c.add("sowt");
        c.add("fl32");
        c.add("fl64");
        c.add("in24");
        c.add("in32");
        c.add("lpcm");
        g = new HashMap();
        h = new HashMap();
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.Left, com.uxcam.video.screen.codec.b.b.a.STEREO_LEFT);
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.Right, com.uxcam.video.screen.codec.b.b.a.STEREO_RIGHT);
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.HeadphonesLeft, com.uxcam.video.screen.codec.b.b.a.STEREO_LEFT);
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.HeadphonesRight, com.uxcam.video.screen.codec.b.b.a.STEREO_RIGHT);
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.LeftTotal, com.uxcam.video.screen.codec.b.b.a.STEREO_LEFT);
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.RightTotal, com.uxcam.video.screen.codec.b.b.a.STEREO_RIGHT);
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.LeftWide, com.uxcam.video.screen.codec.b.b.a.STEREO_LEFT);
        g.put(com.uxcam.video.screen.codec.c.a.a.a.a.RightWide, com.uxcam.video.screen.codec.b.b.a.STEREO_RIGHT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.Left, com.uxcam.video.screen.codec.b.b.a.FRONT_LEFT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.Right, com.uxcam.video.screen.codec.b.b.a.FRONT_RIGHT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.LeftCenter, com.uxcam.video.screen.codec.b.b.a.FRONT_CENTER_LEFT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.RightCenter, com.uxcam.video.screen.codec.b.b.a.FRONT_CENTER_RIGHT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.Center, com.uxcam.video.screen.codec.b.b.a.CENTER);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.CenterSurround, com.uxcam.video.screen.codec.b.b.a.REAR_CENTER);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.CenterSurroundDirect, com.uxcam.video.screen.codec.b.b.a.REAR_CENTER);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.LeftSurround, com.uxcam.video.screen.codec.b.b.a.REAR_LEFT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.LeftSurroundDirect, com.uxcam.video.screen.codec.b.b.a.REAR_LEFT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.RightSurround, com.uxcam.video.screen.codec.b.b.a.REAR_RIGHT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.RightSurroundDirect, com.uxcam.video.screen.codec.b.b.a.REAR_RIGHT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.RearSurroundLeft, com.uxcam.video.screen.codec.b.b.a.SIDE_LEFT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.RearSurroundRight, com.uxcam.video.screen.codec.b.b.a.SIDE_RIGHT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.LFE2, com.uxcam.video.screen.codec.b.b.a.LFE);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.LFEScreen, com.uxcam.video.screen.codec.b.b.a.LFE);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.LeftTotal, com.uxcam.video.screen.codec.b.b.a.STEREO_LEFT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.RightTotal, com.uxcam.video.screen.codec.b.b.a.STEREO_RIGHT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.LeftWide, com.uxcam.video.screen.codec.b.b.a.STEREO_LEFT);
        h.put(com.uxcam.video.screen.codec.c.a.a.a.a.RightWide, com.uxcam.video.screen.codec.b.b.a.STEREO_RIGHT);
    }
}
