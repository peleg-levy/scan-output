package com.uxcam.e;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/s.class */
public final class s {
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    private final String f;
    private final String g;
    public final String b;
    public final int c;
    private final List h;
    public final List d;
    private final String i;
    private final String j;

    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/s$a.class */
    public static final class a {
        String a;
        String d;
        List g;
        String h;
        String b = "";
        String c = "";
        int e = -1;
        final List f = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: $VALUES field not found */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* renamed from: com.uxcam.e.s$a$a, reason: collision with other inner class name */
        /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/s$a$a.class */
        public static final class EnumC0002a {
            public static final int a = 1;
            public static final int b = 2;
            public static final int c = 3;
            public static final int d = 4;
            public static final int e = 5;
            private static final /* synthetic */ int[] f = {a, b, c, d, e};
        }

        public a() {
            this.f.add("");
        }

        final int a() {
            return this.e != -1 ? this.e : s.a(this.a);
        }

        public final a a(String str) {
            this.g = str != null ? s.b(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public final s b() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.d == null) {
                throw new IllegalStateException("host == null");
            }
            return new s(this, (byte) 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
            int a = a();
            if (a != s.a(this.a)) {
                sb.append(':');
                sb.append(a);
            }
            s.a(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                s.b(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:77:0x017e. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:102:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0281  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0165 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01b8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x025d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int a(com.uxcam.e.s r12, java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 872
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.s.a.a(com.uxcam.e.s, java.lang.String):int");
        }

        private void b(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.f.clear();
                this.f.add("");
                i++;
            } else {
                this.f.set(this.f.size() - 1, "");
            }
            while (i < i2) {
                int a = com.uxcam.e.a.c.a(str, i, i2, "/\\");
                boolean z = a < i2;
                String a2 = s.a(str, i, a, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!(a2.equals(".") || a2.equalsIgnoreCase("%2e"))) {
                    if (!(a2.equals("..") || a2.equalsIgnoreCase("%2e.") || a2.equalsIgnoreCase(".%2e") || a2.equalsIgnoreCase("%2e%2e"))) {
                        if (((String) this.f.get(this.f.size() - 1)).isEmpty()) {
                            this.f.set(this.f.size() - 1, a2);
                        } else {
                            this.f.add(a2);
                        }
                        if (z) {
                            this.f.add("");
                        }
                    } else if (!((String) this.f.remove(this.f.size() - 1)).isEmpty() || this.f.isEmpty()) {
                        this.f.add("");
                    } else {
                        this.f.set(this.f.size() - 1, "");
                    }
                }
                i = a;
                if (z) {
                    i++;
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
        private static int c(String str, int i, int i2) {
            while (i < i2) {
                switch (str.charAt(i)) {
                    case ':':
                        return i;
                    case '[':
                        do {
                            i++;
                            if (i < i2) {
                            }
                            i++;
                        } while (str.charAt(i) != ']');
                        i++;
                        break;
                    default:
                        i++;
                }
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(String str, int i, int i2) {
            String a = s.a(str, i, i2, false);
            if (!a.contains(":")) {
                return com.uxcam.e.a.c.a(a);
            }
            InetAddress d = (a.startsWith("[") && a.endsWith("]")) ? d(a, 1, a.length() - 1) : d(a, 0, a.length());
            InetAddress inetAddress = d;
            if (d == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length != 16) {
                throw new AssertionError();
            }
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i5 < address.length) {
                int i6 = i5;
                while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i7 = i5 - i6;
                if (i7 > i4) {
                    i3 = i6;
                    i4 = i7;
                }
                i5 += 2;
            }
            com.uxcam.f.c cVar = new com.uxcam.f.c();
            int i8 = 0;
            while (i8 < address.length) {
                if (i8 == i3) {
                    cVar.h(58);
                    int i9 = i8 + i4;
                    i8 = i9;
                    if (i9 == 16) {
                        cVar.h(58);
                    }
                } else {
                    if (i8 > 0) {
                        cVar.h(58);
                    }
                    cVar.i(((address[i8] & 255) << 8) | (address[i8 + 1] & 255));
                    i8 += 2;
                }
            }
            return cVar.k();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0189, code lost:
        
            if (r11 == 16) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x018f, code lost:
        
            if (r12 != (-1)) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0192, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0194, code lost:
        
            java.lang.System.arraycopy(r0, r12, r0, 16 - (r11 - r12), r11 - r12);
            java.util.Arrays.fill(r0, r12, r12 + (16 - r11), (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01bb, code lost:
        
            return java.net.InetAddress.getByAddress(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01c4, code lost:
        
            throw new java.lang.AssertionError();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.net.InetAddress d(java.lang.String r7, int r8, int r9) {
            /*
                Method dump skipped, instructions count: 453
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uxcam.e.s.a.d(java.lang.String, int, int):java.net.InetAddress");
        }

        private static int e(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(s.a(str, i, i2, "", false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    private s(a aVar) {
        this.a = aVar.a;
        this.f = a(aVar.b, false);
        this.g = a(aVar.c, false);
        this.b = aVar.d;
        this.c = aVar.a();
        this.h = a(aVar.f, false);
        this.d = aVar.g != null ? a(aVar.g, true) : null;
        this.i = aVar.h != null ? a(aVar.h, false) : null;
        this.j = aVar.toString();
    }

    public final URI a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = c();
        aVar.c = d();
        aVar.d = this.b;
        aVar.e = this.c != a(this.a) ? this.c : -1;
        aVar.f.clear();
        aVar.f.addAll(f());
        aVar.a(g());
        aVar.h = this.i == null ? null : this.j.substring(this.j.indexOf(35) + 1);
        int size = aVar.f.size();
        for (int i = 0; i < size; i++) {
            aVar.f.set(i, a((String) aVar.f.get(i), "[]", true, true, false, true));
        }
        if (aVar.g != null) {
            int size2 = aVar.g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) aVar.g.get(i2);
                if (str != null) {
                    aVar.g.set(i2, a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (aVar.h != null) {
            aVar.h = a(aVar.h, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final boolean b() {
        return this.a.equals("https");
    }

    public final String c() {
        if (this.f.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        return this.j.substring(length, com.uxcam.e.a.c.a(this.j, length, this.j.length(), ":@"));
    }

    public final String d() {
        if (this.g.isEmpty()) {
            return "";
        }
        return this.j.substring(this.j.indexOf(58, this.a.length() + 3) + 1, this.j.indexOf(64));
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final String e() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        return this.j.substring(indexOf, com.uxcam.e.a.c.a(this.j, indexOf, this.j.length(), "?#"));
    }

    static void a(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
    }

    public final List f() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        int a2 = com.uxcam.e.a.c.a(this.j, indexOf, this.j.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i = indexOf + 1;
            int a3 = com.uxcam.e.a.c.a(this.j, i, a2, '/');
            arrayList.add(this.j.substring(i, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public final String g() {
        if (this.d == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        return this.j.substring(indexOf, com.uxcam.e.a.c.a(this.j, indexOf + 1, this.j.length(), '#'));
    }

    public static void b(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 > str.length()) {
                return arrayList;
            }
            int indexOf = str.indexOf(38, i2);
            int i3 = indexOf;
            if (indexOf == -1) {
                i3 = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > i3) {
                arrayList.add(str.substring(i2, i3));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, i3));
            }
            i = i3 + 1;
        }
    }

    public final s c(String str) {
        a aVar = new a();
        a aVar2 = aVar.a(this, str) == a.EnumC0002a.a ? aVar : null;
        a aVar3 = aVar2;
        if (aVar2 != null) {
            return aVar3.b();
        }
        return null;
    }

    public static s d(String str) {
        a aVar = new a();
        if (aVar.a(null, str) == a.EnumC0002a.a) {
            return aVar.b();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).j.equals(this.j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return this.j;
    }

    private static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private static List a(List list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.uxcam.f.c cVar = new com.uxcam.f.c();
                cVar.a(str, i, i3);
                int i4 = i3;
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt != 37 || i4 + 2 >= i2) {
                        if (codePointAt == 43 && z) {
                            cVar.h(32);
                        }
                        cVar.a(codePointAt);
                    } else {
                        int a2 = a(str.charAt(i4 + 1));
                        int a3 = a(str.charAt(i4 + 2));
                        if (a2 != -1 && a3 != -1) {
                            cVar.h((a2 << 4) + a3);
                            i4 += 2;
                        }
                        cVar.a(codePointAt);
                    }
                    i4 += Character.charCount(codePointAt);
                }
                return cVar.k();
            }
        }
        return str.substring(i, i2);
    }

    private static boolean a(String str, int i, int i2) {
        return i + 2 < i2 && str.charAt(i) == '%' && a(str.charAt(i + 1)) != -1 && a(str.charAt(i + 2)) != -1;
    }

    static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return (c - 'A') + 10;
    }

    static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3;
        int i4 = i;
        while (true) {
            i3 = i4;
            if (i3 >= i2) {
                return str.substring(i, i2);
            }
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !a(str, i3, i2)))) || (codePointAt == 43 && z3)))) {
                break;
            }
            i4 = i3 + Character.charCount(codePointAt);
        }
        com.uxcam.f.c cVar = new com.uxcam.f.c();
        cVar.a(str, i, i3);
        int i5 = i3;
        com.uxcam.f.c cVar2 = null;
        while (i5 < i2) {
            int codePointAt2 = str.codePointAt(i5);
            if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                if (codePointAt2 == 43 && z3) {
                    cVar.b(z ? "+" : "%2B");
                } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !a(str, i5, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new com.uxcam.f.c();
                    }
                    cVar2.a(codePointAt2);
                    while (!cVar2.c()) {
                        int d = cVar2.d() & 255;
                        cVar.h(37);
                        cVar.h((int) e[(d >> 4) & 15]);
                        cVar.h((int) e[d & 15]);
                    }
                } else {
                    cVar.a(codePointAt2);
                }
            }
            i5 += Character.charCount(codePointAt2);
        }
        return cVar.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    /* synthetic */ s(a aVar, byte b) {
        this(aVar);
    }
}
