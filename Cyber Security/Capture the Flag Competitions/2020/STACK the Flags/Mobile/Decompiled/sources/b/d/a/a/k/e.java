package b.d.a.a.k;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class e extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f2542b = new e();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f2543a = new WeakHashMap<>();

    public e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable object) {
        return Integer.valueOf(object.getAlpha());
    }

    /* renamed from: b */
    public void set(Drawable object, Integer value) {
        object.setAlpha(value.intValue());
    }
}
