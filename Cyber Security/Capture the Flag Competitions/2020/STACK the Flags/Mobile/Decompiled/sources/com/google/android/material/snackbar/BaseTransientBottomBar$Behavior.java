package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.w.a;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final a j = new a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean D(View child) {
        return this.j.a(child);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout parent, View child, MotionEvent event) {
        this.j.b(parent, child, event);
        return super.k(parent, child, event);
    }
}
