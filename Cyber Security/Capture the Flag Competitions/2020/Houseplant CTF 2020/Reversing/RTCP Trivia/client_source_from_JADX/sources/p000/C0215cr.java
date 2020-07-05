package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: cr */
public final class C0215cr {

    /* renamed from: a */
    final Context f1086a;

    /* renamed from: b */
    public final TypedArray f1087b;

    /* renamed from: c */
    TypedValue f1088c;

    private C0215cr(Context context, TypedArray typedArray) {
        this.f1086a = context;
        this.f1087b = typedArray;
    }

    /* renamed from: a */
    public static C0215cr m674a(Context context, int i, int[] iArr) {
        return new C0215cr(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0215cr m675a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0215cr(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0215cr m676a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0215cr(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public final int mo1311a(int i, int i2) {
        return this.f1087b.getInt(i, i2);
    }

    /* renamed from: a */
    public final Drawable mo1312a(int i) {
        if (this.f1087b.hasValue(i)) {
            int resourceId = this.f1087b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0785o.m2608b(this.f1086a, resourceId);
            }
        }
        return this.f1087b.getDrawable(i);
    }

    /* renamed from: a */
    public final boolean mo1313a(int i, boolean z) {
        return this.f1087b.getBoolean(i, z);
    }

    /* renamed from: b */
    public final int mo1314b(int i, int i2) {
        return this.f1087b.getColor(i, i2);
    }

    /* renamed from: b */
    public final Drawable mo1315b(int i) {
        if (this.f1087b.hasValue(i)) {
            int resourceId = this.f1087b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0147bi.m485a().mo966a(this.f1086a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int mo1316c(int i, int i2) {
        return this.f1087b.getInteger(i, i2);
    }

    /* renamed from: c */
    public final CharSequence mo1317c(int i) {
        return this.f1087b.getText(i);
    }

    /* renamed from: d */
    public final int mo1318d(int i, int i2) {
        return this.f1087b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public final String mo1319d(int i) {
        return this.f1087b.getString(i);
    }

    /* renamed from: e */
    public final int mo1320e(int i, int i2) {
        return this.f1087b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public final ColorStateList mo1321e(int i) {
        if (this.f1087b.hasValue(i)) {
            int resourceId = this.f1087b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0785o.m2607a(this.f1086a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f1087b.getColorStateList(i);
    }

    /* renamed from: f */
    public final int mo1322f(int i, int i2) {
        return this.f1087b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public final boolean mo1323f(int i) {
        return this.f1087b.hasValue(i);
    }

    /* renamed from: g */
    public final int mo1324g(int i, int i2) {
        return this.f1087b.getResourceId(i, i2);
    }
}
