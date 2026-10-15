package com.uxcam.video.screen.codec.b;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/b/f.class */
public final class f {
    public static byte[] a(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            bArr[i] = (byte) charArray[i];
        }
        return bArr;
    }
}
