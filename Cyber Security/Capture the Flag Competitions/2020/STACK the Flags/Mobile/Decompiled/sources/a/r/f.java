package a.r;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

public class f {
    public static <T> ObjectAnimator a(T target, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(target, property, (TypeConverter) null, path);
    }
}
