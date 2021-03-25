package a.r;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

public class h {
    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
