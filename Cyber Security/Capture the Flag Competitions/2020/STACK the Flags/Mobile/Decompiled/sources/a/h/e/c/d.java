package a.h.e.c;

import a.h.c;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d {
    public static Shader b(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("gradient")) {
            TypedArray a2 = g.k(resources, theme, attrs, c.GradientColor);
            float startX = g.f(a2, parser, "startX", c.GradientColor_android_startX, 0.0f);
            float startY = g.f(a2, parser, "startY", c.GradientColor_android_startY, 0.0f);
            float endX = g.f(a2, parser, "endX", c.GradientColor_android_endX, 0.0f);
            float endY = g.f(a2, parser, "endY", c.GradientColor_android_endY, 0.0f);
            float centerX = g.f(a2, parser, "centerX", c.GradientColor_android_centerX, 0.0f);
            float centerY = g.f(a2, parser, "centerY", c.GradientColor_android_centerY, 0.0f);
            int type = g.g(a2, parser, "type", c.GradientColor_android_type, 0);
            int startColor = g.b(a2, parser, "startColor", c.GradientColor_android_startColor, 0);
            boolean hasCenterColor = g.j(parser, "centerColor");
            int centerColor = g.b(a2, parser, "centerColor", c.GradientColor_android_centerColor, 0);
            int endColor = g.b(a2, parser, "endColor", c.GradientColor_android_endColor, 0);
            int tileMode = g.g(a2, parser, "tileMode", c.GradientColor_android_tileMode, 0);
            float gradientRadius = g.f(a2, parser, "gradientRadius", c.GradientColor_android_gradientRadius, 0.0f);
            a2.recycle();
            a colorStops = a(c(resources, parser, attrs, theme), startColor, endColor, hasCenterColor, centerColor);
            if (type != 1) {
                if (type != 2) {
                    return new LinearGradient(startX, startY, endX, endY, colorStops.f802a, colorStops.f803b, d(tileMode));
                }
                return new SweepGradient(centerX, centerY, colorStops.f802a, colorStops.f803b);
            } else if (gradientRadius > 0.0f) {
                return new RadialGradient(centerX, centerY, gradientRadius, colorStops.f802a, colorStops.f803b, d(tileMode));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r13.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    public static a c(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int depth;
        int innerDepth = parser.getDepth() + 1;
        List<Float> offsets = new ArrayList<>(20);
        List<Integer> colors = new ArrayList<>(20);
        while (true) {
            int type = parser.next();
            if (type != 1 && ((depth = parser.getDepth()) >= innerDepth || type != 3)) {
                if (type == 2 && depth <= innerDepth && parser.getName().equals("item")) {
                    TypedArray a2 = g.k(resources, theme, attrs, c.GradientColorItem);
                    boolean hasColor = a2.hasValue(c.GradientColorItem_android_color);
                    boolean hasOffset = a2.hasValue(c.GradientColorItem_android_offset);
                    if (!hasColor || !hasOffset) {
                    } else {
                        int color = a2.getColor(c.GradientColorItem_android_color, 0);
                        float offset = a2.getFloat(c.GradientColorItem_android_offset, 0.0f);
                        a2.recycle();
                        colors.add(Integer.valueOf(color));
                        offsets.add(Float.valueOf(offset));
                    }
                }
            }
        }
        if (colors.size() > 0) {
            return new a(colors, offsets);
        }
        return null;
    }

    public static a a(a colorItems, int startColor, int endColor, boolean hasCenterColor, int centerColor) {
        if (colorItems != null) {
            return colorItems;
        }
        if (hasCenterColor) {
            return new a(startColor, centerColor, endColor);
        }
        return new a(startColor, endColor);
    }

    public static Shader.TileMode d(int tileMode) {
        if (tileMode == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (tileMode != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f802a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f803b;

        public a(List<Integer> colorsList, List<Float> offsetsList) {
            int size = colorsList.size();
            this.f802a = new int[size];
            this.f803b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f802a[i] = colorsList.get(i).intValue();
                this.f803b[i] = offsetsList.get(i).floatValue();
            }
        }

        public a(int startColor, int endColor) {
            this.f802a = new int[]{startColor, endColor};
            this.f803b = new float[]{0.0f, 1.0f};
        }

        public a(int startColor, int centerColor, int endColor) {
            this.f802a = new int[]{startColor, centerColor, endColor};
            this.f803b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
