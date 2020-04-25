package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ex */
public final class C0315ex {
    /* renamed from: a */
    public static ColorStateList m1051a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1052a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static ColorStateList m1052a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m1053b(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m1053b(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r18.getDepth()
            r3 = 1
            int r2 = r2 + r3
            r4 = 20
            int[][] r5 = new int[r4][]
            int[] r4 = new int[r4]
            r6 = 0
            r7 = r4
            r4 = r6
        L_0x0013:
            int r8 = r18.next()
            if (r8 == r3) goto L_0x00c1
            int r9 = r18.getDepth()
            if (r9 >= r2) goto L_0x0022
            r10 = 3
            if (r8 == r10) goto L_0x00c1
        L_0x0022:
            r10 = 2
            if (r8 != r10) goto L_0x00bc
            if (r9 > r2) goto L_0x00bc
            java.lang.String r8 = r18.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00bc
            int[] r8 = p000.C0302ep.C0305c.ColorStateListItem
            if (r1 != 0) goto L_0x003e
            r9 = r17
            android.content.res.TypedArray r8 = r9.obtainAttributes(r0, r8)
            goto L_0x0044
        L_0x003e:
            r9 = r17
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r0, r8, r6, r6)
        L_0x0044:
            int r10 = p000.C0302ep.C0305c.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r8.getColor(r10, r11)
            int r11 = p000.C0302ep.C0305c.ColorStateListItem_android_alpha
            boolean r11 = r8.hasValue(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x005e
            int r11 = p000.C0302ep.C0305c.ColorStateListItem_android_alpha
        L_0x0059:
            float r12 = r8.getFloat(r11, r12)
            goto L_0x0069
        L_0x005e:
            int r11 = p000.C0302ep.C0305c.ColorStateListItem_alpha
            boolean r11 = r8.hasValue(r11)
            if (r11 == 0) goto L_0x0069
            int r11 = p000.C0302ep.C0305c.ColorStateListItem_alpha
            goto L_0x0059
        L_0x0069:
            r8.recycle()
            int r8 = r19.getAttributeCount()
            int[] r11 = new int[r8]
            r13 = r6
            r14 = r13
        L_0x0074:
            if (r13 >= r8) goto L_0x0099
            int r15 = r0.getAttributeNameResource(r13)
            r3 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r3) goto L_0x0095
            r3 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r3) goto L_0x0095
            int r3 = p000.C0302ep.C0303a.alpha
            if (r15 == r3) goto L_0x0095
            int r3 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r6)
            if (r16 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            int r15 = -r15
        L_0x0092:
            r11[r14] = r15
            r14 = r3
        L_0x0095:
            int r13 = r13 + 1
            r3 = 1
            goto L_0x0074
        L_0x0099:
            int[] r3 = android.util.StateSet.trimStateSet(r11, r14)
            int r8 = android.graphics.Color.alpha(r10)
            float r8 = (float) r8
            float r8 = r8 * r12
            int r8 = java.lang.Math.round(r8)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r8 = r8 << 24
            r8 = r8 | r10
            int[] r7 = p000.C0325fb.m1069a(r7, r4, r8)
            java.lang.Object[] r3 = p000.C0325fb.m1070a((T[]) r5, r4, r3)
            r5 = r3
            int[][] r5 = (int[][]) r5
            int r4 = r4 + 1
            goto L_0x00be
        L_0x00bc:
            r9 = r17
        L_0x00be:
            r3 = 1
            goto L_0x0013
        L_0x00c1:
            int[] r0 = new int[r4]
            int[][] r1 = new int[r4][]
            java.lang.System.arraycopy(r7, r6, r0, r6, r4)
            java.lang.System.arraycopy(r5, r6, r1, r6, r4)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0315ex.m1053b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
