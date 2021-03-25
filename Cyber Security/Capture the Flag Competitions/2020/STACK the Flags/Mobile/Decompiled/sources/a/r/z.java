package a.r;

import a.h.m.s;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f1413a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f1414b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1415c;

    /* renamed from: d  reason: collision with root package name */
    public static final Property<View, Float> f1416d = new a(Float.class, "translationAlpha");

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            f1413a = new c0();
        } else {
            f1413a = new b0();
        }
        new b(Rect.class, "clipBounds");
    }

    public static class a extends Property<View, Float> {
        public a(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(z.d(view));
        }

        /* renamed from: b */
        public void set(View view, Float alpha) {
            z.h(view, alpha.floatValue());
        }
    }

    public static class b extends Property<View, Rect> {
        public b(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return s.o(view);
        }

        /* renamed from: b */
        public void set(View view, Rect clipBounds) {
            s.d0(view, clipBounds);
        }
    }

    public static y c(View view) {
        return new x(view);
    }

    public static h0 e(View view) {
        return new g0(view);
    }

    public static void h(View view, float alpha) {
        f1413a.e(view, alpha);
    }

    public static float d(View view) {
        return f1413a.b(view);
    }

    public static void f(View view) {
        f1413a.c(view);
    }

    public static void a(View view) {
        f1413a.a(view);
    }

    public static void i(View view, int visibility) {
        b();
        Field field = f1414b;
        if (field != null) {
            try {
                f1414b.setInt(view, (field.getInt(view) & -13) | visibility);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    public static void j(View view, Matrix matrix) {
        f1413a.f(view, matrix);
    }

    public static void k(View view, Matrix matrix) {
        f1413a.g(view, matrix);
    }

    public static void g(View v, int left, int top, int right, int bottom) {
        f1413a.d(v, left, top, right, bottom);
    }

    public static void b() {
        if (!f1415c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1414b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f1415c = true;
        }
    }
}
