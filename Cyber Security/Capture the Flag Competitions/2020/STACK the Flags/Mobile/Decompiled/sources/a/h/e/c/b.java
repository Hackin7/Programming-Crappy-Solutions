package a.h.e.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f789a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f790b;

    /* renamed from: c  reason: collision with root package name */
    public int f791c;

    public b(Shader shader, ColorStateList colorStateList, int color) {
        this.f789a = shader;
        this.f790b = colorStateList;
        this.f791c = color;
    }

    public static b d(Shader shader) {
        return new b(shader, null, 0);
    }

    public static b c(ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static b b(int color) {
        return new b(null, null, color);
    }

    public Shader f() {
        return this.f789a;
    }

    public int e() {
        return this.f791c;
    }

    public void k(int color) {
        this.f791c = color;
    }

    public boolean h() {
        return this.f789a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f789a == null && (colorStateList = this.f790b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] stateSet) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f790b;
        int colorForState = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (colorForState == this.f791c) {
            return false;
        }
        this.f791c = colorForState;
        return true;
    }

    public boolean l() {
        return h() || this.f791c != 0;
    }

    public static b g(Resources resources, int resId, Resources.Theme theme) {
        try {
            return a(resources, resId, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    public static b a(Resources resources, int resId, Resources.Theme theme) {
        int type;
        XmlPullParser parser = resources.getXml(resId);
        AttributeSet attrs = Xml.asAttributeSet(parser);
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            String name = parser.getName();
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c2 = 0;
                }
            } else if (name.equals("gradient")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return c(a.b(resources, parser, attrs, theme));
            }
            if (c2 == 1) {
                return d(d.b(resources, parser, attrs, theme));
            }
            throw new XmlPullParserException(parser.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
