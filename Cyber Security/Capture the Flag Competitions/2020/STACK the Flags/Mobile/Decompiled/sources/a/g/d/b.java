package a.g.d;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Matrix> f762a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<RectF> f763b = new ThreadLocal<>();

    public static void c(ViewGroup parent, View descendant, Rect rect) {
        Matrix m = f762a.get();
        if (m == null) {
            m = new Matrix();
            f762a.set(m);
        } else {
            m.reset();
        }
        b(parent, descendant, m);
        RectF rectF = f763b.get();
        if (rectF == null) {
            rectF = new RectF();
            f763b.set(rectF);
        }
        rectF.set(rect);
        m.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void a(ViewGroup parent, View descendant, Rect out) {
        out.set(0, 0, descendant.getWidth(), descendant.getHeight());
        c(parent, descendant, out);
    }

    public static void b(ViewParent target, View view, Matrix m) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != target) {
            View vp = (View) parent;
            b(target, vp, m);
            m.preTranslate((float) (-vp.getScrollX()), (float) (-vp.getScrollY()));
        }
        m.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            m.preConcat(view.getMatrix());
        }
    }
}
