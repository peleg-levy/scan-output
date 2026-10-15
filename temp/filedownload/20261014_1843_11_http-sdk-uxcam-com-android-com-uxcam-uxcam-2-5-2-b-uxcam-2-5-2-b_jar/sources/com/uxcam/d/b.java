package com.uxcam.d;

import android.content.Context;
import android.os.Build;
import com.uxcam.c.f;
import com.uxcam.j.g;
import com.uxcam.j.j;
import com.uxcam.j.l;
import com.uxcam.j.m;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/d/b.class */
public class b {
    private static String a = b.class.getSimpleName();
    private String b;

    public b(String str) {
        this.b = str;
    }

    public final File a() {
        try {
            boolean z = false;
            JSONObject jSONObject = new JSONObject();
            Context a2 = m.a();
            jSONObject.put("apd", new f(a2).a());
            jSONObject.put("did", com.uxcam.j.c.a(a2));
            jSONObject.put("osn", com.uxcam.j.c.a());
            jSONObject.put("dvt", com.uxcam.j.c.c(a2));
            String a3 = com.uxcam.j.c.a(a2, 2);
            String a4 = com.uxcam.j.c.a(a2, 1);
            if (Integer.parseInt(a4) > Integer.parseInt(a3)) {
                jSONObject.put("wd", a3);
                jSONObject.put("ht", a4);
            } else {
                jSONObject.put("wd", a4);
                jSONObject.put("ht", a3);
            }
            jSONObject.put("rl", String.valueOf(a2.getResources().getDisplayMetrics().densityDpi));
            jSONObject.put("d", m.c());
            jSONObject.put("cv", Build.VERSION.RELEASE);
            jSONObject.put("cn", Build.MANUFACTURER);
            jSONObject.put("dmn", Build.MODEL);
            jSONObject.put("dan", com.uxcam.b.b);
            jSONObject.put("aid", com.uxcam.c.d.c);
            jSONObject.put("av", m.e(a2));
            jSONObject.put("sv", j.a + ".2.5.2-b");
            if (!com.uxcam.c.d.d) {
                jSONObject.put("app_name", m.c(m.a()));
            }
            jSONObject.put("isF", com.uxcam.b.c ? 1 : 0);
            jSONObject.put("misc", new JSONObject(com.uxcam.c.d.x));
            jSONObject.put("cr", this.b);
            if (this.b.isEmpty() && com.uxcam.c.d.I) {
                z = true;
            }
            if (!this.b.isEmpty() && !com.uxcam.c.d.J) {
                z = true;
            }
            Iterator it = com.uxcam.c.d.G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!com.uxcam.i.a.a().b((String) it.next())) {
                    z = true;
                    break;
                }
            }
            Iterator it2 = com.uxcam.c.d.H.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!com.uxcam.i.a.a().c((String) it2.next())) {
                    z = true;
                    break;
                }
            }
            com.uxcam.i.a.a();
            String c = com.uxcam.i.a.c();
            jSONObject.put("tt", c);
            jSONObject.put("tags", com.uxcam.i.a.a().e());
            new StringBuilder("Tags are : ").append(com.uxcam.i.a.a().e());
            l.a(a, "Fetch Log and Clean");
            com.uxcam.i.a.a().c = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append("===============================================");
            sb.append(System.getProperty("line.separator"));
            sb.append("====================OLD LOG======================");
            sb.append(System.getProperty("line.separator"));
            sb.append("===============================================");
            sb.append(System.getProperty("line.separator"));
            g gVar = new g(m.a());
            sb.append(gVar.b("uxlog"));
            gVar.a("uxlog", "");
            sb.append("===============================================");
            sb.append(System.getProperty("line.separator"));
            sb.append("====================UXCAM======================");
            sb.append(System.getProperty("line.separator"));
            sb.append("===============================================");
            sb.append(System.getProperty("line.separator"));
            StringBuilder sb2 = l.a;
            l.a = null;
            sb.append(sb2.toString());
            jSONObject.put("log", sb.toString());
            com.uxcam.i.a a5 = com.uxcam.i.a.a();
            JSONArray d = !a5.a.isEmpty() ? a5.d() : null;
            a5.b();
            jSONObject.put("ut", d);
            d.toString();
            f fVar = new f(m.a());
            String str = fVar.b() + "$" + com.uxcam.c.d.c + "$" + fVar.a() + "$data.txt";
            String jSONObject2 = jSONObject.toString();
            try {
                File file = new File(a.a());
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, str);
                l.a(a, "JSON File created at : " + file2.getAbsolutePath());
                FileWriter fileWriter = new FileWriter(file2);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                fileWriter.append((CharSequence) jSONObject2);
                bufferedWriter.close();
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException unused) {
            }
            File file3 = new File(a.a() + str);
            if (Integer.parseInt(c) < com.uxcam.c.d.E || com.uxcam.c.d.A || z) {
                com.uxcam.c.d.A = false;
                m.a(file3.getParentFile());
            } else {
                g gVar2 = new g(a2);
                gVar2.a.edit().putInt("recorded_session_count", gVar2.a.getInt("recorded_session_count", 0) + 1).apply();
            }
            return file3;
        } catch (JSONException unused2) {
            l.a(a, "Exception in GenerateJSONFile -> createFile ");
            return null;
        }
    }
}
