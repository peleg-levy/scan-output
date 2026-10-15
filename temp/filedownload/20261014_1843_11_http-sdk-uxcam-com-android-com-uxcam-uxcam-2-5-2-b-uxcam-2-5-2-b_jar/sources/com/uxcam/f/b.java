package com.uxcam.f;

import java.io.UnsupportedEncodingException;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/f/b.class */
final class b {
    private static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    public static String a(byte[] bArr) {
        return a(bArr, a);
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) * 4) / 3];
        int i = 0;
        int length = bArr.length - (bArr.length % 3);
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i;
            int i4 = i + 1;
            bArr3[i3] = bArr2[(bArr[i2] & 255) >> 2];
            int i5 = i4 + 1;
            bArr3[i4] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i2 + 1] & 255) >> 4)];
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[((bArr[i2 + 1] & 15) << 2) | ((bArr[i2 + 2] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = bArr2[bArr[i2 + 2] & 63];
        }
        switch (bArr.length % 3) {
            case 1:
                int i7 = i;
                int i8 = i + 1;
                bArr3[i7] = bArr2[(bArr[length] & 255) >> 2];
                int i9 = i8 + 1;
                bArr3[i8] = bArr2[(bArr[length] & 3) << 4];
                int i10 = i9 + 1;
                bArr3[i9] = 61;
                i = i10 + 1;
                bArr3[i10] = 61;
                break;
            case 2:
                int i11 = i;
                int i12 = i + 1;
                bArr3[i11] = bArr2[(bArr[length] & 255) >> 2];
                int i13 = i12 + 1;
                bArr3[i12] = bArr2[((bArr[length] & 3) << 4) | ((bArr[length + 1] & 255) >> 4)];
                int i14 = i13 + 1;
                bArr3[i13] = bArr2[(bArr[length + 1] & 15) << 2];
                i = i14 + 1;
                bArr3[i14] = 61;
                break;
        }
        try {
            return new String(bArr3, 0, i, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
