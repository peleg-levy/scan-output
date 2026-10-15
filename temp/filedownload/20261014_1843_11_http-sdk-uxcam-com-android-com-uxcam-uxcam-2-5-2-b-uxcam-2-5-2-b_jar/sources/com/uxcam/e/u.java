package com.uxcam.e;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/u.class */
public final class u {
    private static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String e;
    public final String a;
    private final String f;
    public final String b;

    private u(String str, String str2, String str3, String str4) {
        this.e = str;
        this.a = str2;
        this.f = str3;
        this.b = str4;
    }

    public static u a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        String str2 = null;
        Matcher matcher2 = d.matcher(str);
        int end = matcher.end();
        while (true) {
            int i = end;
            if (i >= str.length()) {
                return new u(str, lowerCase, lowerCase2, str2);
            }
            matcher2.region(i, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple different charsets: " + str);
                }
                str2 = group2;
            }
            end = matcher2.end();
        }
    }

    public final String toString() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).e.equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
