package com.google.android.material.transformation;

import a.h.m.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f2799a = 0;

    public abstract boolean G(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout parent, View child, int layoutDirection) {
        b.d.a.a.p.a dep;
        if (s.K(child) || (dep = F(parent, child)) == null || !E(dep.a())) {
            return false;
        }
        this.f2799a = dep.a() ? 1 : 2;
        child.getViewTreeObserver().addOnPreDrawListener(new a(child, this.f2799a, dep));
        return false;
    }

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2800b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2801c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b.d.a.a.p.a f2802d;

        public a(View view, int i, b.d.a.a.p.a aVar) {
            this.f2800b = view;
            this.f2801c = i;
            this.f2802d = aVar;
        }

        public boolean onPreDraw() {
            this.f2800b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f2799a == this.f2801c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b.d.a.a.p.a aVar = this.f2802d;
                expandableBehavior.G((View) aVar, this.f2800b, aVar.a(), false);
            }
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout parent, View child, View dependency) {
        b.d.a.a.p.a dep = (b.d.a.a.p.a) dependency;
        if (!E(dep.a())) {
            return false;
        }
        this.f2799a = dep.a() ? 1 : 2;
        return G((View) dep, child, dep.a(), true);
    }

    public b.d.a.a.p.a F(CoordinatorLayout parent, View child) {
        List<View> dependencies = parent.r(child);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View dependency = dependencies.get(i);
            if (e(parent, child, dependency)) {
                return (b.d.a.a.p.a) dependency;
            }
        }
        return null;
    }

    public final boolean E(boolean expanded) {
        if (expanded) {
            int i = this.f2799a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f2799a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
