package com.uxcam.j;

import java.lang.reflect.Field;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/j/h.class */
public final class h {
    public static Object a(String str, Object obj) {
        try {
            Field a = a(str, (Class) obj.getClass());
            a.setAccessible(true);
            return a.get(obj);
        } catch (Exception e) {
            l.a("ReflectionUtil", e);
            return null;
        }
    }

    public static Field a(String str, Class cls) {
        int i = 0;
        for (Class cls2 = cls; cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            for (Field field : cls2.getDeclaredFields()) {
                i++;
                if (str.equals(field.getName())) {
                    new StringBuilder("looped for ").append(i).append(" name : ").append(str);
                    return field;
                }
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found for class " + cls);
    }
}
