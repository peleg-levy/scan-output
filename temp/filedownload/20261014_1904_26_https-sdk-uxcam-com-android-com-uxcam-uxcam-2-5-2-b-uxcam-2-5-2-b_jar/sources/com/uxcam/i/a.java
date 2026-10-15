package com.uxcam.i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.uxcam.c.e;
import com.uxcam.j.m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/i/a.class */
public final class a {
    private static String d = com.uxcam.a.class.getSimpleName();
    private static volatile a e = null;
    public b b;
    private GestureDetector f;
    private ScaleGestureDetector g;
    public ArrayList c = new ArrayList();
    public ArrayList a = new ArrayList();

    private a() {
    }

    public static a a() {
        if (e == null) {
            synchronized (com.uxcam.a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    @TargetApi(8)
    public final void a(Context context, String str) {
        e eVar;
        b bVar = a().b == null ? new b() : a().b;
        this.b = bVar;
        GestureDetector gestureDetector = new GestureDetector(context, bVar);
        gestureDetector.setOnDoubleTapListener(bVar);
        this.f = gestureDetector;
        this.g = new ScaleGestureDetector(context, bVar);
        this.b = bVar;
        if (str == null) {
            str = ((Activity) m.b()).getClass().getSimpleName();
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || !str.equalsIgnoreCase(((e) arrayList.get(arrayList.size() - 1)).a)) {
            e eVar2 = new e();
            eVar = eVar2;
            eVar2.a = str;
            m.a(com.uxcam.a.b(), Calendar.getInstance());
            float b = m.b(com.uxcam.a.b(), Calendar.getInstance());
            new StringBuilder("setuptimeline for ").append(str).append(" time ").append(b);
            eVar.b = b;
            arrayList.add(eVar);
        } else {
            eVar = (e) arrayList.get(arrayList.size() - 1);
        }
        b bVar2 = bVar;
        bVar2.c = eVar;
        bVar2.a(10, 0.0f, 0.0f);
    }

    public final void b() {
        ArrayList arrayList = null;
        if (this.c != null) {
            arrayList = this.c;
        }
        a aVar = new a();
        e = aVar;
        aVar.c = arrayList;
        this.a = null;
    }

    public static String c() {
        return String.valueOf(m.a(com.uxcam.a.b(), Calendar.getInstance()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    public final JSONArray d() {
        Iterator it = this.a.iterator();
        JSONArray jSONArray = new JSONArray();
        JSONException jSONException = jSONArray;
        while (true) {
            try {
                jSONException = it.hasNext();
                if (jSONException == 0) {
                    break;
                }
                JSONObject jSONObject = new JSONObject();
                e eVar = (e) it.next();
                Iterator it2 = eVar.c.iterator();
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("va", Float.valueOf(String.format(Locale.ENGLISH, "%.3f", Float.valueOf(eVar.b))));
                jSONArray2.put(jSONObject2);
                JSONArray jSONArray3 = new JSONArray();
                JSONArray jSONArray4 = new JSONArray();
                while (it2.hasNext()) {
                    com.uxcam.c.b bVar = (com.uxcam.c.b) it2.next();
                    JSONArray jSONArray5 = new JSONArray();
                    jSONArray5.put(bVar.c);
                    jSONArray5.put(bVar.d);
                    jSONArray5.put(bVar.e);
                    jSONArray5.put(bVar.a);
                    jSONArray5.put(bVar.f.booleanValue() ? 1 : 0);
                    jSONArray5.put(Float.valueOf(String.format(Locale.ENGLISH, "%.3f", Float.valueOf(bVar.b))));
                    JSONArray jSONArray6 = new JSONArray();
                    Iterator it3 = bVar.h.iterator();
                    while (it3.hasNext()) {
                        com.uxcam.c.b bVar2 = (com.uxcam.c.b) it3.next();
                        JSONArray jSONArray7 = new JSONArray();
                        jSONArray7.put(bVar2.a);
                        jSONArray7.put(Float.valueOf(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(bVar2.b))));
                        jSONArray7.put(bVar2.c);
                        jSONArray7.put(bVar2.d);
                        jSONArray6.put(jSONArray7);
                    }
                    jSONArray5.put(jSONArray6);
                    jSONArray3.put(jSONArray5);
                }
                Iterator it4 = eVar.d.iterator();
                while (it4.hasNext()) {
                    jSONArray4.put(((com.uxcam.g.b) it4.next()).a());
                }
                jSONObject.put("screenActions", jSONArray4);
                jSONObject.put("cor", jSONArray3);
                jSONObject.put("at", Float.valueOf(String.format(Locale.ENGLISH, "%.3f", Float.valueOf(eVar.b))));
                jSONObject.put("vt", Float.valueOf(String.format(Locale.ENGLISH, "%.3f", Float.valueOf(eVar.e))));
                jSONObject.put("an", eVar.a);
                jSONException = jSONArray.put(jSONObject);
            } catch (JSONException unused) {
                jSONException.getMessage();
            }
        }
        new StringBuilder("timeline is : ").append(jSONArray);
        return jSONArray;
    }

    public static int a(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        return bArr.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public final JSONArray e() {
        Iterator it = this.c.iterator();
        JSONArray jSONArray = new JSONArray();
        JSONException jSONException = jSONArray;
        while (true) {
            try {
                jSONException = it.hasNext();
                if (jSONException == 0) {
                    break;
                }
                JSONObject jSONObject = new JSONObject();
                com.uxcam.c.a aVar = (com.uxcam.c.a) it.next();
                jSONObject.put("tag", aVar.a);
                jSONObject.put("time", aVar.b);
                if (aVar.c != null) {
                    jSONObject.put("params", new JSONObject(aVar.c));
                }
                jSONException = jSONArray.put(jSONObject);
            } catch (JSONException unused) {
                jSONException.getMessage();
            }
        }
        return jSONArray;
    }

    public final boolean b(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((e) it.next()).a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((com.uxcam.c.a) it.next()).a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
