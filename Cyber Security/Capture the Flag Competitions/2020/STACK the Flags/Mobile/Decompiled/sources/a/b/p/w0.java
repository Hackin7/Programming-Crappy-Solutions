package a.b.p;

import a.b.l.a.a;
import a.h.e.c.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

public class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f447a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f448b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f449c;

    public static w0 t(Context context, AttributeSet set, int[] attrs) {
        return new w0(context, context.obtainStyledAttributes(set, attrs));
    }

    public static w0 u(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
        return new w0(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }

    public static w0 s(Context context, int resid, int[] attrs) {
        return new w0(context, context.obtainStyledAttributes(resid, attrs));
    }

    public w0(Context context, TypedArray array) {
        this.f447a = context;
        this.f448b = array;
    }

    public TypedArray q() {
        return this.f448b;
    }

    public Drawable f(int index) {
        int resourceId;
        if (!this.f448b.hasValue(index) || (resourceId = this.f448b.getResourceId(index, 0)) == 0) {
            return this.f448b.getDrawable(index);
        }
        return a.d(this.f447a, resourceId);
    }

    public Drawable g(int index) {
        int resourceId;
        if (!this.f448b.hasValue(index) || (resourceId = this.f448b.getResourceId(index, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f447a, resourceId, true);
    }

    public Typeface i(int index, int style, f.a fontCallback) {
        int resourceId = this.f448b.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f449c == null) {
            this.f449c = new TypedValue();
        }
        return f.b(this.f447a, resourceId, this.f449c, style, fontCallback);
    }

    public CharSequence o(int index) {
        return this.f448b.getText(index);
    }

    public String n(int index) {
        return this.f448b.getString(index);
    }

    public boolean a(int index, boolean defValue) {
        return this.f448b.getBoolean(index, defValue);
    }

    public int j(int index, int defValue) {
        return this.f448b.getInt(index, defValue);
    }

    public float h(int index, float defValue) {
        return this.f448b.getFloat(index, defValue);
    }

    public int b(int index, int defValue) {
        return this.f448b.getColor(index, defValue);
    }

    public ColorStateList c(int index) {
        int resourceId;
        ColorStateList value;
        if (!this.f448b.hasValue(index) || (resourceId = this.f448b.getResourceId(index, 0)) == 0 || (value = a.c(this.f447a, resourceId)) == null) {
            return this.f448b.getColorStateList(index);
        }
        return value;
    }

    public int k(int index, int defValue) {
        return this.f448b.getInteger(index, defValue);
    }

    public int d(int index, int defValue) {
        return this.f448b.getDimensionPixelOffset(index, defValue);
    }

    public int e(int index, int defValue) {
        return this.f448b.getDimensionPixelSize(index, defValue);
    }

    public int l(int index, int defValue) {
        return this.f448b.getLayoutDimension(index, defValue);
    }

    public int m(int index, int defValue) {
        return this.f448b.getResourceId(index, defValue);
    }

    public CharSequence[] p(int index) {
        return this.f448b.getTextArray(index);
    }

    public boolean r(int index) {
        return this.f448b.hasValue(index);
    }

    public void v() {
        this.f448b.recycle();
    }
}
