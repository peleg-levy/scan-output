package com.uxcam.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/l.class */
public final class l {
    private static final Pattern c = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0250, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023c, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0228, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0214, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.uxcam.e.l a(long r13, com.uxcam.e.s r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.l.a(long, com.uxcam.e.s, java.lang.String):com.uxcam.e.l");
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    public static List a(s sVar, r rVar) {
        ArrayList arrayList = null;
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            if ("Set-Cookie".equalsIgnoreCase(rVar.a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(rVar.b(i));
            }
        }
        List unmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
        ArrayList arrayList2 = null;
        int size = unmodifiableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l a = a(System.currentTimeMillis(), sVar, (String) unmodifiableList.get(i2));
            if (a != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(a);
            }
        }
        return arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.emptyList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(com.uxcam.e.a.d.e.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=").append(this.h);
        }
        sb.append("; path=").append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.a.equals(this.a) && lVar.b.equals(this.b) && lVar.h.equals(this.h) && lVar.i.equals(this.i) && lVar.g == this.g && lVar.j == this.j && lVar.k == this.k && lVar.l == this.l && lVar.m == this.m;
    }

    public final int hashCode() {
        return (31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * ((31 * (527 + this.a.hashCode())) + this.b.hashCode())) + this.h.hashCode())) + this.i.hashCode())) + ((int) (this.g ^ (this.g >>> 32))))) + (this.j ? 0 : 1))) + (this.k ? 0 : 1))) + (this.l ? 0 : 1))) + (this.m ? 0 : 1);
    }
}
