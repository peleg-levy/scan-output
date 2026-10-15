package com.uxcam.e.a.g;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: 20261014_1843_11_http-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/e/a/g/d.class */
public final class d implements HostnameVerifier {
    public static final d a = new d();

    private d() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        String str2;
        String a2;
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (com.uxcam.e.a.c.b(str)) {
                List a3 = a(x509Certificate, 7);
                int size = a3.size();
                for (int i = 0; i < size; i++) {
                    if (str.equalsIgnoreCase((String) a3.get(i))) {
                        return true;
                    }
                }
                return false;
            }
            String lowerCase = str.toLowerCase(Locale.US);
            boolean z = false;
            List a4 = a(x509Certificate, 2);
            int size2 = a4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                z = true;
                if (a(lowerCase, (String) a4.get(i2))) {
                    return true;
                }
            }
            if (z) {
                return false;
            }
            c cVar = new c(x509Certificate.getSubjectX500Principal());
            cVar.c = 0;
            cVar.d = 0;
            cVar.e = 0;
            cVar.f = 0;
            cVar.g = cVar.a.toCharArray();
            String a5 = cVar.a();
            String str3 = a5;
            if (a5 != null) {
                do {
                    String str4 = "";
                    if (cVar.c == cVar.b) {
                        str2 = null;
                    } else {
                        switch (cVar.g[cVar.c]) {
                            case '\"':
                                cVar.c++;
                                cVar.d = cVar.c;
                                cVar.e = cVar.d;
                                while (cVar.c != cVar.b) {
                                    if (cVar.g[cVar.c] == '\"') {
                                        cVar.c++;
                                        while (cVar.c < cVar.b && cVar.g[cVar.c] == ' ') {
                                            cVar.c++;
                                        }
                                        str4 = new String(cVar.g, cVar.d, cVar.e - cVar.d);
                                        break;
                                    } else {
                                        if (cVar.g[cVar.c] == '\\') {
                                            cVar.g[cVar.e] = cVar.d();
                                        } else {
                                            cVar.g[cVar.e] = cVar.g[cVar.c];
                                        }
                                        cVar.c++;
                                        cVar.e++;
                                    }
                                }
                                throw new IllegalStateException("Unexpected end of DN: " + cVar.a);
                            case '#':
                                str4 = cVar.b();
                                break;
                            case '+':
                            case ',':
                            case ';':
                                break;
                            default:
                                str4 = cVar.c();
                                break;
                        }
                        if ("cn".equalsIgnoreCase(str3)) {
                            str2 = str4;
                        } else if (cVar.c >= cVar.b) {
                            str2 = null;
                        } else {
                            if (cVar.g[cVar.c] != ',' && cVar.g[cVar.c] != ';' && cVar.g[cVar.c] != '+') {
                                throw new IllegalStateException("Malformed DN: " + cVar.a);
                            }
                            cVar.c++;
                            a2 = cVar.a();
                            str3 = a2;
                        }
                    }
                } while (a2 != null);
                throw new IllegalStateException("Malformed DN: " + cVar.a);
            }
            str2 = null;
            String str5 = str2;
            if (str2 != null) {
                return a(lowerCase, str5);
            }
            return false;
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List a(X509Certificate x509Certificate) {
        List a2 = a(x509Certificate, 7);
        List a3 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a2.size() + a3.size());
        arrayList.addAll(a2);
        arrayList.addAll(a3);
        return arrayList;
    }

    private static List a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null) {
                    if (num.intValue() == i && (str = (String) list.get(1)) != null) {
                        arrayList.add(str);
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str + '.';
        }
        if (!str2.endsWith(".")) {
            str2 = str2 + '.';
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }
}
