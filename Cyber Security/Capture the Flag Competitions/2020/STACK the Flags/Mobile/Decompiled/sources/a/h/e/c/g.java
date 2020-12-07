package a.h.e.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class g {
    public static boolean j(XmlPullParser parser, String attrName) {
        return parser.getAttributeValue("http://schemas.android.com/apk/res/android", attrName) != null;
    }

    public static float f(TypedArray a2, XmlPullParser parser, String attrName, int resId, float defaultValue) {
        if (!j(parser, attrName)) {
            return defaultValue;
        }
        return a2.getFloat(resId, defaultValue);
    }

    public static boolean a(TypedArray a2, XmlPullParser parser, String attrName, int resId, boolean defaultValue) {
        if (!j(parser, attrName)) {
            return defaultValue;
        }
        return a2.getBoolean(resId, defaultValue);
    }

    public static int g(TypedArray a2, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!j(parser, attrName)) {
            return defaultValue;
        }
        return a2.getInt(resId, defaultValue);
    }

    public static int b(TypedArray a2, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!j(parser, attrName)) {
            return defaultValue;
        }
        return a2.getColor(resId, defaultValue);
    }

    public static b e(TypedArray a2, XmlPullParser parser, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        if (j(parser, attrName)) {
            TypedValue value = new TypedValue();
            a2.getValue(resId, value);
            int i = value.type;
            if (i >= 28 && i <= 31) {
                return b.b(value.data);
            }
            b complexColor = b.g(a2.getResources(), a2.getResourceId(resId, 0), theme);
            if (complexColor != null) {
                return complexColor;
            }
        }
        return b.b(defaultValue);
    }

    public static ColorStateList c(TypedArray a2, XmlPullParser parser, Resources.Theme theme, String attrName, int resId) {
        if (!j(parser, attrName)) {
            return null;
        }
        TypedValue value = new TypedValue();
        a2.getValue(resId, value);
        int i = value.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + resId + ": " + value);
        } else if (i < 28 || i > 31) {
            return a.c(a2.getResources(), a2.getResourceId(resId, 0), theme);
        } else {
            return d(value);
        }
    }

    public static ColorStateList d(TypedValue value) {
        return ColorStateList.valueOf(value.data);
    }

    public static int h(TypedArray a2, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!j(parser, attrName)) {
            return defaultValue;
        }
        return a2.getResourceId(resId, defaultValue);
    }

    public static String i(TypedArray a2, XmlPullParser parser, String attrName, int resId) {
        if (!j(parser, attrName)) {
            return null;
        }
        return a2.getString(resId);
    }

    public static TypedValue l(TypedArray a2, XmlPullParser parser, String attrName, int resId) {
        if (!j(parser, attrName)) {
            return null;
        }
        return a2.peekValue(resId);
    }

    public static TypedArray k(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme == null) {
            return res.obtainAttributes(set, attrs);
        }
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }
}
