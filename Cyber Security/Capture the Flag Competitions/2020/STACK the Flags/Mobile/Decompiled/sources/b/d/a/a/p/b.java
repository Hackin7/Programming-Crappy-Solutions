package b.d.a.a.p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final View f2602a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2603b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f2604c = 0;

    public b(a widget) {
        this.f2602a = (View) widget;
    }

    public boolean c() {
        return this.f2603b;
    }

    public Bundle e() {
        Bundle state = new Bundle();
        state.putBoolean("expanded", this.f2603b);
        state.putInt("expandedComponentIdHint", this.f2604c);
        return state;
    }

    public void d(Bundle state) {
        this.f2603b = state.getBoolean("expanded", false);
        this.f2604c = state.getInt("expandedComponentIdHint", 0);
        if (this.f2603b) {
            a();
        }
    }

    public void f(int expandedComponentIdHint) {
        this.f2604c = expandedComponentIdHint;
    }

    public int b() {
        return this.f2604c;
    }

    public final void a() {
        ViewParent parent = this.f2602a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f2602a);
        }
    }
}
