package com.uxcam.g;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import com.uxcam.j.m;
import java.util.ArrayList;

@TargetApi(14)
/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/g/d.class */
public final class d extends View.AccessibilityDelegate {
    View.AccessibilityDelegate a;
    ArrayList b;

    public d(View.AccessibilityDelegate accessibilityDelegate, com.uxcam.c.e eVar) {
        this.a = accessibilityDelegate;
        this.b = eVar.d;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        new StringBuilder("view : ").append(view.getClass().getCanonicalName()).append(" event type : ").append(i);
        if (view instanceof CompoundButton) {
            CompoundButton compoundButton = (CompoundButton) view;
            new StringBuilder("compoundButton state : ").append(compoundButton.isChecked()).append(" ").append((Object) compoundButton.getText());
            b bVar = new b(3, view.getX(), view.getY(), view.getWidth(), view.getHeight(), String.valueOf(view.getId()), ((Button) view).getText().toString(), "toggled", compoundButton.isChecked() ? "on" : "off", m.d());
            bVar.c = compoundButton.getClass().getSimpleName();
            this.b.add(bVar);
        } else if ((view instanceof Button) && i == 1) {
            if (view instanceof Button) {
                this.b.add(new b(5, view.getX(), view.getY(), view.getWidth(), view.getHeight(), String.valueOf(view.getId()), ((Button) view).getText().toString(), "tapped", null, m.d()));
                new StringBuilder().append(((Button) view).getId()).append(" view clicked");
                new StringBuilder("Tapped Button '").append((Object) ((Button) view).getText()).append("'");
            }
            new StringBuilder().append(view.getClass().getCanonicalName()).append(" view clicked");
        }
        if (this.a != null) {
            this.a.sendAccessibilityEvent(view, i);
        }
    }
}
