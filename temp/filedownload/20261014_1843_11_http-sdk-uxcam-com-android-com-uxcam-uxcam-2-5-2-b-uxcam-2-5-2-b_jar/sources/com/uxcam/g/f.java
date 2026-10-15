package com.uxcam.g;

import android.annotation.TargetApi;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.uxcam.j.m;
import java.util.ArrayList;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/g/f.class */
public final class f implements TextWatcher {
    private final View a;
    private final int b;
    private ArrayList c;

    public f(View view, int i, com.uxcam.c.e eVar) {
        this.a = view;
        this.b = i;
        this.c = eVar.d;
    }

    @Override // android.text.TextWatcher
    @TargetApi(11)
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        new StringBuilder("view : ").append(this.a.getClass().getCanonicalName()).append(" event type : beforeTextChanged ").append(charSequence.toString());
        new StringBuilder("position ordinal : ").append(m.b(this.b));
        new StringBuilder(" Started Editing ").append(this.b).append("st Textfield");
        new StringBuilder(" Filled ").append(this.b).append("st Textfield");
        if (this.c.isEmpty()) {
            this.c.add(new b(5, this.a.getX(), this.a.getY(), this.a.getWidth(), this.a.getHeight(), String.valueOf(this.a.getId()), m.b(this.b) + " Textfield", "focus", null, m.d()));
            this.c.add(new b(5, this.a.getX(), this.a.getY(), this.a.getWidth(), this.a.getHeight(), String.valueOf(this.a.getId()), m.b(this.b) + " Textfield", "blur", null, m.d()));
            return;
        }
        b bVar = (b) this.c.get(this.c.size() - 1);
        if (bVar.a.equals(String.valueOf(this.a.getId()))) {
            bVar.b = m.d();
        } else {
            this.c.add(new b(5, this.a.getX(), this.a.getY(), this.a.getWidth(), this.a.getHeight(), String.valueOf(this.a.getId()), m.b(this.b) + " Textfield", "focus", null, m.d()));
            this.c.add(new b(5, this.a.getX(), this.a.getY(), this.a.getWidth(), this.a.getHeight(), String.valueOf(this.a.getId()), m.b(this.b) + " Textfield", "blur", null, m.d()));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }
}
