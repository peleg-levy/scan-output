package com.uxcam.f;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/f.class */
public class f implements Serializable, Comparable {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final f b = a(new byte[0]);
    final byte[] c;
    transient int d;
    transient String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(byte[] bArr) {
        this.c = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new f((byte[]) bArr.clone());
    }

    public static f a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(u.a));
        fVar.e = str;
        return fVar;
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, u.a);
        this.e = str2;
        return str2;
    }

    public String b() {
        return b.a(this.c);
    }

    public String c() {
        char[] cArr = new char[this.c.length * 2];
        int i = 0;
        for (byte b2 : this.c) {
            int i2 = i;
            int i3 = i + 1;
            cArr[i2] = a[(b2 >> 4) & 15];
            i = i3 + 1;
            cArr[i3] = a[b2 & 15];
        }
        return new String(cArr);
    }

    public f d() {
        for (int i = 0; i < this.c.length; i++) {
            byte b2 = this.c[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr = (byte[]) this.c.clone();
                int i2 = i;
                bArr[i2] = (byte) (b2 - (-32));
                for (int i3 = i + 1; i3 < bArr.length; i3++) {
                    byte b3 = bArr[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr[i3] = (byte) (b3 - (-32));
                    }
                }
                return new f(bArr);
            }
        }
        return this;
    }

    public f a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (i2 > this.c.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.c.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == this.c.length) {
            return this;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.c, i, bArr, 0, i3);
        return new f(bArr);
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int e() {
        return this.c.length;
    }

    public byte[] f() {
        return (byte[]) this.c.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        cVar.b(this.c, 0, this.c.length);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && u.a(this.c, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof f) && ((f) obj).e() == this.c.length && ((f) obj).a(0, this.c, 0, this.c.length);
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public String toString() {
        int length;
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int i = 0;
        int i2 = 0;
        int length2 = a2.length();
        while (true) {
            if (i >= length2) {
                length = a2.length();
                break;
            }
            if (i2 == 64) {
                length = i;
                break;
            }
            int codePointAt = a2.codePointAt(i);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        length = -1;
        int i3 = length;
        if (length == -1) {
            return this.c.length <= 64 ? "[hex=" + c() + "]" : "[size=" + this.c.length + " hex=" + a(0, 64).c() + "…]";
        }
        String replace = a2.substring(0, i3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return i3 < a2.length() ? "[size=" + this.c.length + " text=" + replace + "…]" : "[text=" + replace + "]";
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        f fVar = (f) obj;
        int e = e();
        int e2 = fVar.e();
        int min = Math.min(e, e2);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = fVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (e == e2) {
            return 0;
        }
        return e < e2 ? -1 : 1;
    }
}
