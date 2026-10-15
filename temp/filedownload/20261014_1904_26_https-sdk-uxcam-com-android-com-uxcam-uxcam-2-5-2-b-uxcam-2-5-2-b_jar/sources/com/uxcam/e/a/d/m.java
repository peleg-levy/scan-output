package com.uxcam.e.a.d;

import com.uxcam.e.x;
import java.net.ProtocolException;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/d/m.class */
public final class m {
    public final x a;
    public final int b;
    public final String c;

    private m(x xVar, int i, String str) {
        this.a = xVar;
        this.b = i;
        this.c = str;
    }

    public static m a(String str) {
        x xVar;
        int i;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            i = 9;
            if (charAt == 0) {
                xVar = x.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                xVar = x.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            xVar = x.HTTP_1_0;
            i = 4;
        }
        if (str.length() < i + 3) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i + 3));
            String str2 = "";
            if (str.length() > i + 3) {
                if (str.charAt(i + 3) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i + 4);
            }
            return new m(xVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == x.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ').append(this.b);
        if (this.c != null) {
            sb.append(' ').append(this.c);
        }
        return sb.toString();
    }
}
