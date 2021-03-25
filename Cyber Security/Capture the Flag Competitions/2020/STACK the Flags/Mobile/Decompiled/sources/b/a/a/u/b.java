package b.a.a.u;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2072a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2073b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2074c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2075d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2076e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2077f;

    /* renamed from: g  reason: collision with root package name */
    public final float f2078g;
    public final int h;
    public final int i;
    public final float j;
    public final boolean k;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String text, String fontName, float size, a justification, int tracking, float lineHeight, float baselineShift, int color, int strokeColor, float strokeWidth, boolean strokeOverFill) {
        this.f2072a = text;
        this.f2073b = fontName;
        this.f2074c = size;
        this.f2075d = justification;
        this.f2076e = tracking;
        this.f2077f = lineHeight;
        this.f2078g = baselineShift;
        this.h = color;
        this.i = strokeColor;
        this.j = strokeWidth;
        this.k = strokeOverFill;
    }

    public int hashCode() {
        long temp = (long) Float.floatToRawIntBits(this.f2077f);
        return (((((((((int) (((float) (((this.f2072a.hashCode() * 31) + this.f2073b.hashCode()) * 31)) + this.f2074c)) * 31) + this.f2075d.ordinal()) * 31) + this.f2076e) * 31) + ((int) ((temp >>> 32) ^ temp))) * 31) + this.h;
    }
}
