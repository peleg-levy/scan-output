package com.uxcam.g;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import com.uxcam.j.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(11)
/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/g/c.class */
public final class c {
    public static ArrayList a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/g/c$a.class */
    public static class a implements SeekBar.OnSeekBarChangeListener {
        private SeekBar.OnSeekBarChangeListener a;
        private int b;
        private ArrayList c;

        public a(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, int i, com.uxcam.c.e eVar) {
            this.a = onSeekBarChangeListener;
            this.b = i;
            this.c = eVar.d;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (this.a != null) {
                this.a.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            new StringBuilder("SeekBar value : onStartTrackingTouch ").append(seekBar.getProgress());
            if (this.a != null) {
                this.a.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            new StringBuilder("SeekBar value : onStopTrackingTouch ").append(seekBar.getProgress());
            if (this.a != null) {
                this.a.onStopTrackingTouch(seekBar);
            }
            new StringBuilder("SeekBar value : ").append(seekBar.getProgress());
            b bVar = new b(3, seekBar.getX(), seekBar.getY(), seekBar.getWidth(), seekBar.getHeight(), String.valueOf(seekBar.getId()), m.b(this.b) + " seekbar", "changed", "value is " + seekBar.getProgress(), m.d());
            bVar.c = seekBar.getClass().getSimpleName();
            this.c.add(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public static void a(ViewGroup viewGroup) {
        com.uxcam.c.e eVar;
        int size = com.uxcam.i.a.a().a.size();
        if (com.uxcam.i.a.a().a.isEmpty()) {
            eVar = new com.uxcam.c.e();
            com.uxcam.i.a.a().a.add(eVar);
        } else {
            eVar = (com.uxcam.c.e) com.uxcam.i.a.a().a.get(size - 1);
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof ViewGroup) {
                if (childAt instanceof AdapterView) {
                    AdapterView adapterView = (AdapterView) childAt;
                    if (adapterView.getOnItemClickListener() == null) {
                        adapterView.setOnItemClickListener(new e());
                    } else if (!(adapterView.getOnItemClickListener() instanceof e)) {
                        adapterView.setOnItemClickListener(new e(adapterView.getOnItemClickListener()));
                    }
                }
                a((ViewGroup) childAt);
            } else if (childAt != null) {
                if (childAt instanceof Button) {
                    new StringBuilder("Button found ").append(childAt.getClass().getCanonicalName());
                    a(childAt, eVar);
                }
                if (childAt instanceof EditText) {
                    new StringBuilder("EditText found ").append(childAt.getClass().getCanonicalName());
                    a(childAt, eVar);
                    i++;
                    boolean z = false;
                    EditText editText = (EditText) childAt;
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference.get() != null && ((View) weakReference.get()).equals(childAt)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        editText.addTextChangedListener(new f(editText, i, eVar));
                        a.add(new WeakReference(editText));
                    }
                }
                if (childAt instanceof CompoundButton) {
                    new StringBuilder("Button found ").append(childAt.getClass().getCanonicalName());
                    a(childAt, eVar);
                }
                IllegalAccessException illegalAccessException = childAt instanceof SeekBar;
                if (illegalAccessException != 0) {
                    try {
                        SeekBar seekBar = (SeekBar) childAt;
                        i2++;
                        Field declaredField = childAt.getClass().getDeclaredField("mOnSeekBarChangeListener");
                        declaredField.setAccessible(true);
                        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) declaredField.get(childAt);
                        illegalAccessException = onSeekBarChangeListener instanceof a;
                        if (illegalAccessException == 0) {
                            seekBar.setOnSeekBarChangeListener(new a(onSeekBarChangeListener, i2, eVar));
                        }
                    } catch (IllegalAccessException unused) {
                        illegalAccessException.printStackTrace();
                    } catch (NoSuchFieldException unused2) {
                        illegalAccessException.printStackTrace();
                    }
                    new StringBuilder("SeekBar found ").append(childAt.getClass().getCanonicalName());
                    a(childAt, eVar);
                }
            }
        }
    }

    @TargetApi(14)
    private static void a(View view, com.uxcam.c.e eVar) {
        View.AccessibilityDelegate a2 = a(view);
        if (a2 instanceof d) {
            ((d) a2).b = eVar.d;
        } else {
            new StringBuilder("Accessibility listener added to ").append(view);
            view.setAccessibilityDelegate(new d(a2, eVar));
        }
    }

    private static View.AccessibilityDelegate a(View view) {
        View.AccessibilityDelegate accessibilityDelegate = null;
        try {
            accessibilityDelegate = (View.AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(view, new Object[0]);
        } catch (IllegalAccessException unused) {
        } catch (NoSuchMethodException unused2) {
        } catch (InvocationTargetException unused3) {
        }
        return accessibilityDelegate;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.ViewTreeObserver, java.lang.Exception] */
    public static void a(Context context) {
        ?? viewTreeObserver;
        try {
            if (com.uxcam.c.d.B) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                com.uxcam.g.a aVar = new com.uxcam.g.a();
                aVar.b = (com.uxcam.c.e) com.uxcam.i.a.a().a.get(com.uxcam.i.a.a().a.size() - 1);
                viewTreeObserver = decorView.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.uxcam.g.a.1
                    private final Rect c = new Rect();
                    private int d;
                    final /* synthetic */ View a;

                    public AnonymousClass1(View decorView2) {
                        r6 = decorView2;
                    }

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        r6.getWindowVisibleDisplayFrame(this.c);
                        int height = this.c.height();
                        if (this.d != 0) {
                            if (this.d > height + 150) {
                                a.this.b.d.add(new b(8, 0.0f, 0.0f, 0.0f, 0.0f, "keyboard", "keyboard", "shown", null, m.d()));
                            } else if (this.d + 150 < height) {
                                a.this.b.d.add(new b(8, 0.0f, 0.0f, 0.0f, 0.0f, "keyboard", "keyboard", "hidden", null, m.d()));
                            }
                        }
                        this.d = height;
                    }
                });
            }
        } catch (Exception unused) {
            viewTreeObserver.printStackTrace();
        }
    }

    public static void a() {
        if (com.uxcam.c.d.B) {
            ((com.uxcam.c.e) com.uxcam.i.a.a().a.get(com.uxcam.i.a.a().a.size() - 1)).d.add(new b(7, 0.0f, 0.0f, 0.0f, 0.0f, "", "Navigated back", "tapped", "back", m.d()));
        }
    }
}
