package a.r;

import android.graphics.Matrix;
import android.view.View;

public class d0 {
    public abstract void a(View view);

    public abstract void c(View view);

    public abstract void e(View view, float f2);

    public abstract void f(View view, Matrix matrix);

    public abstract void g(View view, Matrix matrix);

    public float b(View view) {
        Float savedAlpha = (Float) view.getTag(i.save_non_transition_alpha);
        if (savedAlpha != null) {
            return view.getAlpha() / savedAlpha.floatValue();
        }
        return view.getAlpha();
    }

    public void d(View v, int left, int top, int right, int bottom) {
        v.setLeft(left);
        v.setTop(top);
        v.setRight(right);
        v.setBottom(bottom);
    }
}
