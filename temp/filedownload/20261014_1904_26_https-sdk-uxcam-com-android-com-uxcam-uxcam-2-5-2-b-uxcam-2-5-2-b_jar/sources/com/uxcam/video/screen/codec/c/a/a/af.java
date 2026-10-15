package com.uxcam.video.screen.codec.c.a.a;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/c/a/a/af.class */
public class af extends c {
    protected List e;
    protected d f;

    public af(w wVar) {
        super(wVar);
        this.e = new LinkedList();
        this.f = d.a();
    }

    public final List b() {
        return this.e;
    }

    public final void a(c cVar) {
        this.e.add(cVar);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public void a(ByteBuffer byteBuffer) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(byteBuffer);
        }
    }

    public final void a(ad adVar) {
        this.e.add(0, adVar);
    }

    @Override // com.uxcam.video.screen.codec.c.a.a.c
    public void a(StringBuilder sb) {
        super.a(sb);
        sb.append(": {\n");
        b(sb);
        sb.append("\n}");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(sb2);
            if (it.hasNext()) {
                sb2.append(",\n");
            }
        }
        sb.append(sb2.toString().replaceAll("([^\n]*)\n", "  $1\n"));
    }
}
