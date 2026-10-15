package com.uxcam.video.screen.codec.d;

import com.uxcam.video.screen.codec.b.b.e;
import com.uxcam.video.screen.codec.c.a.a.n;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/d/a.class */
public final class a {

    /* renamed from: com.uxcam.video.screen.codec.d.a$a, reason: collision with other inner class name */
    /* loaded from: 20261014_1904_26_https-sdk-uxcam-com-android-com-uxcam-uxcam-2-5-2-b-uxcam-2-5-2-b.jar:com/uxcam/video/screen/codec/d/a$a.class */
    public static class C0009a {
        public Object a;
        public Object b;

        public C0009a(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }
    }

    public static C0009a a(List list, e eVar, long j) {
        long j2 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ListIterator listIterator = list.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            n nVar = (n) listIterator.next();
            if (j2 + nVar.a > j) {
                int i = (int) (j - j2);
                int i2 = (int) ((eVar.a * i) / eVar.b);
                n nVar2 = new n(i, nVar.b);
                n nVar3 = new n(nVar.a - i, i2 + nVar.b);
                listIterator.remove();
                if (nVar2.a > 0) {
                    listIterator.add(nVar2);
                    arrayList.add(nVar2);
                }
                if (nVar3.a > 0) {
                    listIterator.add(nVar3);
                    arrayList2.add(nVar3);
                }
            } else {
                arrayList.add(nVar);
                j2 += nVar.a;
            }
        }
        while (listIterator.hasNext()) {
            arrayList2.add(listIterator.next());
        }
        return new C0009a(arrayList, arrayList2);
    }
}
