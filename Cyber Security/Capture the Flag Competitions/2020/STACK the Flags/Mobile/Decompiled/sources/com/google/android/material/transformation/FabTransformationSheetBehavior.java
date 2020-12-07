package com.google.android.material.transformation;

import a.h.m.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.a;
import b.d.a.a.k.h;
import b.d.a.a.k.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g  reason: collision with root package name */
    public Map<View, Integer> f2823g;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.e a0(Context context, boolean expanded) {
        int specRes;
        if (expanded) {
            specRes = a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            specRes = a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.e spec = new FabTransformationBehavior.e();
        spec.f2817a = h.c(context, specRes);
        spec.f2818b = new j(17, 0.0f, 0.0f);
        return spec;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, com.google.android.material.transformation.ExpandableTransformationBehavior
    public boolean G(View dependency, View child, boolean expanded, boolean animated) {
        c0(child, expanded);
        super.G(dependency, child, expanded, animated);
        return true;
    }

    public final void c0(View sheet, boolean expanded) {
        ViewParent viewParent = sheet.getParent();
        if (viewParent instanceof CoordinatorLayout) {
            CoordinatorLayout parent = (CoordinatorLayout) viewParent;
            int childCount = parent.getChildCount();
            if (expanded) {
                this.f2823g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);
                boolean hasScrimBehavior = (child.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) child.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (child != sheet && !hasScrimBehavior) {
                    if (!expanded) {
                        Map<View, Integer> map = this.f2823g;
                        if (map != null && map.containsKey(child)) {
                            s.h0(child, this.f2823g.get(child).intValue());
                        }
                    } else {
                        this.f2823g.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                        s.h0(child, 4);
                    }
                }
            }
            if (!expanded) {
                this.f2823g = null;
            }
        }
    }
}
