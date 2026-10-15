package com.uxcam.e;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/o.class */
public interface o {
    public static final o a = new o() { // from class: com.uxcam.e.o.1
        @Override // com.uxcam.e.o
        public final List a(String str) {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            return Arrays.asList(InetAddress.getAllByName(str));
        }
    };

    List a(String str);
}
