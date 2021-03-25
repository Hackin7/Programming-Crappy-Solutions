package b.a.a.t;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import b.a.a.u.i;
import b.a.a.x.d;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final i<String> f2058a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<i<String>, Typeface> f2059b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f2060c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f2061d;

    /* renamed from: e  reason: collision with root package name */
    public b.a.a.a f2062e = null;

    /* renamed from: f  reason: collision with root package name */
    public String f2063f = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f2061d = null;
            return;
        }
        this.f2061d = ((View) callback).getContext().getAssets();
    }

    public void c(b.a.a.a assetDelegate) {
        this.f2062e = assetDelegate;
    }

    public Typeface b(String fontFamily, String style) {
        this.f2058a.b(fontFamily, style);
        Typeface typeface = this.f2059b.get(this.f2058a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = d(a(fontFamily), style);
        this.f2059b.put(this.f2058a, typeface2);
        return typeface2;
    }

    public final Typeface a(String fontFamily) {
        Typeface defaultTypeface = this.f2060c.get(fontFamily);
        if (defaultTypeface != null) {
            return defaultTypeface;
        }
        Typeface typeface = null;
        if (0 == 0) {
            typeface = Typeface.createFromAsset(this.f2061d, "fonts/" + fontFamily + this.f2063f);
        }
        this.f2060c.put(fontFamily, typeface);
        return typeface;
    }

    public final Typeface d(Typeface typeface, String style) {
        int styleInt = 0;
        boolean containsItalic = style.contains("Italic");
        boolean containsBold = style.contains("Bold");
        if (containsItalic && containsBold) {
            styleInt = 3;
        } else if (containsItalic) {
            styleInt = 2;
        } else if (containsBold) {
            styleInt = 1;
        }
        if (typeface.getStyle() == styleInt) {
            return typeface;
        }
        return Typeface.create(typeface, styleInt);
    }
}
