package com.uxcam.e.a.f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/f/d.class */
final class d {
    private final Class a;
    private final String b;
    private final Class[] c;

    public d(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public final boolean a(Object obj) {
        return a((Class) obj.getClass()) != null;
    }

    private Object c(Object obj, Object... objArr) {
        Method a = a((Class) obj.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.reflect.InvocationTargetException] */
    public final Object a(Object obj, Object... objArr) {
        ?? c;
        try {
            c = c(obj, objArr);
            return c;
        } catch (InvocationTargetException unused) {
            Throwable targetException = c.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Object d(Object obj, Object... objArr) {
        Method a = a((Class) obj.getClass());
        if (a == null) {
            throw new AssertionError("Method " + this.b + " not supported for object " + obj);
        }
        try {
            return a.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.reflect.InvocationTargetException] */
    public final Object b(Object obj, Object... objArr) {
        ?? d;
        try {
            d = d(obj, objArr);
            return d;
        } catch (InvocationTargetException unused) {
            Throwable targetException = d.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Method a(Class cls) {
        Method method = null;
        if (this.b != null) {
            Method a = a(cls, this.b, this.c);
            method = a;
            if (a != null && this.a != null && !this.a.isAssignableFrom(method.getReturnType())) {
                method = null;
            }
        }
        return method;
    }

    private static Method a(Class cls, String str, Class[] clsArr) {
        Method method = null;
        try {
            Method method2 = cls.getMethod(str, clsArr);
            method = method2;
            if ((method2.getModifiers() & 1) == 0) {
                method = null;
            }
        } catch (NoSuchMethodException unused) {
        }
        return method;
    }
}
