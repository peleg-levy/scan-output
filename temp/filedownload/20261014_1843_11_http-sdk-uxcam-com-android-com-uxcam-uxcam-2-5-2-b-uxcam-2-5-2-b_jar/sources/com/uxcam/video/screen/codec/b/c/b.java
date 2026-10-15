package com.uxcam.video.screen.codec.b.c;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/c/b.class */
public final class b {
    static Set a;

    public static void a(Object obj, StringBuilder sb, String... strArr) {
        sb.append("{\n");
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        for (Method method : obj.getClass().getMethods()) {
            if (!method.getName().startsWith("get") ? false : method.getParameterTypes().length != 0 ? false : !Void.TYPE.equals(method.getReturnType())) {
                try {
                    String substring = method.getName().substring(3);
                    String str = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                    if (strArr.length <= 0 || hashSet.contains(str)) {
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (invoke.getClass().isPrimitive() || a.contains(invoke.getClass()) || (invoke instanceof Iterable)) {
                            sb.append(str + ": ");
                            a(sb, invoke);
                            sb.append(",\n");
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        sb.append("}");
    }

    private static void a(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (obj == String.class) {
            sb.append("'");
            sb.append((String) obj);
            sb.append("'");
        } else {
            if (!(obj instanceof Iterable)) {
                sb.append(String.valueOf(obj));
                return;
            }
            Iterator it = ((Iterable) obj).iterator();
            sb.append("[");
            while (it.hasNext()) {
                a(it.next(), sb, new String[0]);
                if (it.hasNext()) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
    }

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(String.class);
        a.add(Byte.class);
        a.add(Short.class);
        a.add(Integer.class);
        a.add(Long.class);
        a.add(Float.class);
        a.add(Double.class);
        a.add(Character.class);
    }
}
