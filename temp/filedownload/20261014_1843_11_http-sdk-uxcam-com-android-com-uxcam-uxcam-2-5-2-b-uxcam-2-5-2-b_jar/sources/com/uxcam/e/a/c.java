package com.uxcam.e.a;

import com.uxcam.f.f;
import com.uxcam.f.s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.IDN;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/c.class */
public final class c {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final Charset c = Charset.forName("UTF-8");
    public static final TimeZone d = TimeZone.getTimeZone("GMT");
    private static final Pattern e = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static void a(long j, long j2) {
        if ((0 | j2) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.Closeable r2) {
        /*
            r0 = r2
            if (r0 == 0) goto Ld
            r0 = r2
            r0.close()     // Catch: java.lang.RuntimeException -> Lb java.lang.Exception -> Lc
            return
        Lb:
            throw r0
        Lc:
        Ld:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.a.c.a(java.io.Closeable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, java.net.Socket] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.net.Socket r3) {
        /*
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            r0.close()     // Catch: java.lang.AssertionError -> L9 java.lang.RuntimeException -> L14 java.lang.Exception -> L15
            return
        L9:
            r1 = move-exception
            r3 = r1
            boolean r0 = a(r0)
            if (r0 != 0) goto L13
            r0 = r3
            throw r0
        L13:
            return
        L14:
            throw r0
        L15:
        L16:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.a.c.a(java.net.Socket):void");
    }

    public static void a(Closeable closeable, Closeable closeable2) {
        Throwable th = null;
        try {
            closeable.close();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            closeable2.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static boolean a(s sVar, TimeUnit timeUnit) {
        try {
            return a(sVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(s sVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = sVar.a().d_() ? sVar.a().c() - nanoTime : Long.MAX_VALUE;
        sVar.a().a(nanoTime + Math.min(c2, timeUnit.toNanos(i)));
        try {
            com.uxcam.f.c cVar = new com.uxcam.f.c();
            while (sVar.a(cVar, 8192L) != -1) {
                cVar.n();
            }
            if (c2 == Long.MAX_VALUE) {
                sVar.a().e_();
                return true;
            }
            sVar.a().a(nanoTime + c2);
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                sVar.a().e_();
                return false;
            }
            sVar.a().a(nanoTime + c2);
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                sVar.a().e_();
            } else {
                sVar.a().a(nanoTime + c2);
            }
            throw th;
        }
    }

    public static f a(f fVar) {
        try {
            return f.a(MessageDigest.getInstance("SHA-1").digest(fVar.f()));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static f b(f fVar) {
        try {
            return f.a(MessageDigest.getInstance("SHA-256").digest(fVar.f()));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static List a(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List a(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.uxcam.e.a.c.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static Object[] a(Class cls, Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Object obj2 = objArr2[i];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, arrayList.size()));
    }

    public static String a(com.uxcam.e.s sVar, boolean z) {
        String str = sVar.b.contains(":") ? "[" + sVar.b + "]" : sVar.b;
        return (z || sVar.c != com.uxcam.e.s.a(sVar.a)) ? str + ":" + sVar.c : str;
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (a(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static int a(String str, int i, int i2) {
        while (i < i2) {
            switch (str.charAt(i)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    i++;
                default:
                    return i;
            }
        }
        return i2;
    }

    public static int b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            switch (str.charAt(i3)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                default:
                    return i3 + 1;
            }
        }
        return i;
    }

    public static String c(String str, int i, int i2) {
        int a2 = a(str, i, i2);
        return str.substring(a2, b(str, a2, i2));
    }

    public static int a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String a(String str) {
        boolean z;
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= lowerCase.length()) {
                    z = false;
                    break;
                }
                char charAt = lowerCase.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    break;
                }
                if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                    z = true;
                    break;
                }
                i++;
            }
            z = true;
            if (z) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static boolean b(String str) {
        return e.matcher(str).matches();
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
