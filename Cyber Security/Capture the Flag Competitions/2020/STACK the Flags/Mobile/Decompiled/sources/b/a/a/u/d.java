package b.a.a.u;

import b.a.a.u.k.n;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f2086a;

    /* renamed from: b  reason: collision with root package name */
    public final char f2087b;

    /* renamed from: c  reason: collision with root package name */
    public final double f2088c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2089d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2090e;

    public static int c(char character, String fontFamily, String style) {
        return (((((0 * 31) + character) * 31) + fontFamily.hashCode()) * 31) + style.hashCode();
    }

    public d(List<n> list, char character, double size, double width, String style, String fontFamily) {
        this.f2086a = list;
        this.f2087b = character;
        this.f2088c = width;
        this.f2089d = style;
        this.f2090e = fontFamily;
    }

    public List<n> a() {
        return this.f2086a;
    }

    public double b() {
        return this.f2088c;
    }

    public int hashCode() {
        return c(this.f2087b, this.f2090e, this.f2089d);
    }
}
