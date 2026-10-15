package com.uxcam.g;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/g/b.class */
public final class b {
    private int d;
    private float e;
    private float f;
    private float g;
    private float h;
    String a;
    private String i;
    private String j;
    private String k;
    float b;
    String c;

    public b(int i, float f, float f2, float f3, float f4, String str, String str2, String str3, String str4, float f5) {
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.a = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.b = f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v24, types: [org.json.JSONObject] */
    public final JSONObject a() {
        JSONException jSONObject = new JSONObject();
        try {
            jSONObject.put("e", this.d);
            jSONObject.put("x", this.e);
            jSONObject.put("y", this.f);
            jSONObject.put("w", this.g);
            jSONObject.put("h", this.h);
            jSONObject.put("i", this.a);
            jSONObject.put("n", this.i);
            jSONObject.put("a", this.j);
            jSONObject.put("v", this.k);
            jSONObject.put("t", this.b);
            jSONObject = jSONObject.put("actualClass", this.c);
        } catch (JSONException unused) {
            jSONObject.printStackTrace();
        }
        return jSONObject;
    }
}
