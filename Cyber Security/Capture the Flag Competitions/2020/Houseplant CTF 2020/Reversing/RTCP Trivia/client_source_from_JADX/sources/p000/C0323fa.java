package p000;

import android.graphics.Shader.TileMode;
import java.util.List;

/* renamed from: fa */
final class C0323fa {

    /* renamed from: fa$a */
    static final class C0324a {

        /* renamed from: a */
        final int[] f1607a;

        /* renamed from: b */
        final float[] f1608b;

        C0324a(int i, int i2) {
            this.f1607a = new int[]{i, i2};
            this.f1608b = new float[]{0.0f, 1.0f};
        }

        C0324a(int i, int i2, int i3) {
            this.f1607a = new int[]{i, i2, i3};
            this.f1608b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0324a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f1607a = new int[size];
            this.f1608b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f1607a[i] = ((Integer) list.get(i)).intValue();
                this.f1608b[i] = ((Float) list2.get(i)).floatValue();
            }
        }
    }

    /* renamed from: a */
    static TileMode m1066a(int i) {
        switch (i) {
            case 1:
                return TileMode.REPEAT;
            case 2:
                return TileMode.MIRROR;
            default:
                return TileMode.CLAMP;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p000.C0323fa.C0324a m1067a(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0084
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0084
        L_0x0021:
            r6 = 2
            if (r3 != r6) goto L_0x0012
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0012
            int[] r3 = p000.C0302ep.C0305c.GradientColorItem
            android.content.res.TypedArray r3 = p000.C0330fd.m1078a(r8, r11, r10, r3)
            int r5 = p000.C0302ep.C0305c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p000.C0302ep.C0305c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0049
            goto L_0x0069
        L_0x0049:
            int r5 = p000.C0302ep.C0305c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p000.C0302ep.C0305c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0069:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0084:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0090
            fa$a r8 = new fa$a
            r8.<init>(r4, r2)
            return r8
        L_0x0090:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0323fa.m1067a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):fa$a");
    }
}
