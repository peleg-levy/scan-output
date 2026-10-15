package com.uxcam.g;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.AdapterView;
import com.uxcam.j.m;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/g/e.class */
public final class e implements AdapterView.OnItemClickListener {
    AdapterView.OnItemClickListener a;

    public e() {
    }

    public e(AdapterView.OnItemClickListener onItemClickListener) {
        this.a = onItemClickListener;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    @TargetApi(11)
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.a != null) {
            this.a.onItemClick(adapterView, view, i, j);
        }
        if (com.uxcam.c.d.B) {
            ((com.uxcam.c.e) com.uxcam.i.a.a().a.get(com.uxcam.i.a.a().a.size() - 1)).d.add(new b(4, view.getX(), view.getY(), view.getWidth(), view.getHeight(), String.valueOf(view.getId()), m.b(i) + " ListItem", "clicked", null, m.d()));
        }
    }
}
