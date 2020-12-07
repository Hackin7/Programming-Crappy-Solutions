package b.d.a.a.l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public d f2568a;

    /* renamed from: b  reason: collision with root package name */
    public int f2569b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2570c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout parent, V child, int layoutDirection) {
        E(parent, child, layoutDirection);
        if (this.f2568a == null) {
            this.f2568a = new d(child);
        }
        this.f2568a.b();
        int i = this.f2569b;
        if (i != 0) {
            this.f2568a.d(i);
            this.f2569b = 0;
        }
        int i2 = this.f2570c;
        if (i2 == 0) {
            return true;
        }
        this.f2568a.c(i2);
        this.f2570c = 0;
        return true;
    }

    public void E(CoordinatorLayout parent, V child, int layoutDirection) {
        parent.I(child, layoutDirection);
    }

    public boolean F(int offset) {
        d dVar = this.f2568a;
        if (dVar != null) {
            return dVar.d(offset);
        }
        this.f2569b = offset;
        return false;
    }

    public int D() {
        d dVar = this.f2568a;
        if (dVar != null) {
            return dVar.a();
        }
        return 0;
    }
}
