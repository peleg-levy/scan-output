package com.uxcam.video.screen.codec.b.a;

import com.uxcam.video.screen.codec.b.e;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/a/d.class */
public final class d {
    e a = new e();
    private e b = new e();
    private com.uxcam.video.screen.codec.b.d c = new com.uxcam.video.screen.codec.b.d();
    private com.uxcam.video.screen.codec.b.d d = new com.uxcam.video.screen.codec.b.d();

    public final d a(int i, String str) {
        int parseInt = Integer.parseInt(str, 2);
        int length = str.length();
        this.c.a(parseInt << (32 - length));
        this.d.a(length);
        this.a.a(i, this.c.b - 1);
        this.b.a(this.c.b - 1, i);
        return this;
    }

    public final c a() {
        return new c(this.c.a(), this.d.a()) { // from class: com.uxcam.video.screen.codec.b.a.d.1
            @Override // com.uxcam.video.screen.codec.b.a.c
            public final void a(b bVar, int i) {
                e eVar = d.this.a;
                super.a(bVar, (i >= eVar.a.length ? null : Integer.valueOf(eVar.a[i])).intValue());
            }
        };
    }
}
