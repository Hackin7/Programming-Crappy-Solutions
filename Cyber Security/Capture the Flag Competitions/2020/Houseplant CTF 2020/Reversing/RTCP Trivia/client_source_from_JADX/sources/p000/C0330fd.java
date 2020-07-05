package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: fd */
public final class C0330fd {
    /* renamed from: a */
    public static float m1075a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m1081a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m1076a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1081a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    /* renamed from: a */
    public static int m1077a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1081a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static TypedArray m1078a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static TypedValue m1079a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (!m1081a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    /* renamed from: a */
    public static C0316ey m1080a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i) {
        if (m1081a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0316ey.m1054a(typedValue.data);
            }
            C0316ey a = C0316ey.m1055a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0316ey.m1054a(0);
    }

    /* renamed from: a */
    public static boolean m1081a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m1082b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1081a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    /* renamed from: c */
    public static String m1083c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1081a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }
}
