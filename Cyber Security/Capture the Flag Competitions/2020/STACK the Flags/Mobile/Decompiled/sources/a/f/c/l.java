package a.f.c;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class l extends c {
    public boolean i;
    public boolean j;

    @Override // a.f.c.c
    public void g(AttributeSet attrs) {
        super.g(attrs);
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, k.ConstraintLayout_Layout);
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                if (attr == k.ConstraintLayout_Layout_android_visibility) {
                    this.i = true;
                } else if (attr == k.ConstraintLayout_Layout_android_elevation) {
                    this.j = true;
                }
            }
            a2.recycle();
        }
    }

    public void n() {
    }

    @Override // a.f.c.c
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.i || this.j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout container = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f700c; i2++) {
                View view = container.h(this.f699b[i2]);
                if (view != null) {
                    if (this.i) {
                        view.setVisibility(visibility);
                    }
                    if (this.j && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        c();
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        c();
    }
}
