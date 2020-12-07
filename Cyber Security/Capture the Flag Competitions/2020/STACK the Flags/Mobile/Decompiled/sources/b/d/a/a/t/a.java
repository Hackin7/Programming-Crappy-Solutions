package b.d.a.a.t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

public class a {
    public static ColorStateList a(Context context, TypedArray attributes, int index) {
        int resourceId;
        ColorStateList value;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0 || (value = a.b.l.a.a.c(context, resourceId)) == null) {
            return attributes.getColorStateList(index);
        }
        return value;
    }

    public static Drawable b(Context context, TypedArray attributes, int index) {
        int resourceId;
        Drawable value;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0 || (value = a.b.l.a.a.d(context, resourceId)) == null) {
            return attributes.getDrawable(index);
        }
        return value;
    }
}
