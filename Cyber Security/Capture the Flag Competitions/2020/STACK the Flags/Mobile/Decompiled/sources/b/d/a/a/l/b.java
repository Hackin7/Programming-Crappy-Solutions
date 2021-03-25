package b.d.a.a.l;

import a.h.h.a;
import a.h.m.b0;
import a.h.m.d;
import a.h.m.s;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2564d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f2565e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public int f2566f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2567g;

    public abstract View G(List<View> list);

    public abstract float I(View view);

    public b() {
    }

    public b(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout parent, View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        int availableHeight;
        int childLpHeight = child.getLayoutParams().height;
        if (childLpHeight != -1 && childLpHeight != -2) {
            return false;
        }
        View header = G(parent.r(child));
        if (header == null) {
            return false;
        }
        if (s.s(header) && !s.s(child)) {
            s.f0(child, true);
            if (s.s(child)) {
                child.requestLayout();
                return true;
            }
        }
        int availableHeight2 = View.MeasureSpec.getSize(parentHeightMeasureSpec);
        if (availableHeight2 == 0) {
            availableHeight = parent.getHeight();
        } else {
            availableHeight = availableHeight2;
        }
        parent.J(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec((availableHeight - header.getMeasuredHeight()) + K(header), childLpHeight == -1 ? 1073741824 : Integer.MIN_VALUE), heightUsed);
        return true;
    }

    @Override // b.d.a.a.l.c
    public void E(CoordinatorLayout parent, View child, int layoutDirection) {
        View header = G(parent.r(child));
        if (header != null) {
            CoordinatorLayout.f lp = (CoordinatorLayout.f) child.getLayoutParams();
            Rect available = this.f2564d;
            available.set(parent.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lp).leftMargin, header.getBottom() + ((ViewGroup.MarginLayoutParams) lp).topMargin, (parent.getWidth() - parent.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, ((parent.getHeight() + header.getBottom()) - parent.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
            b0 parentInsets = parent.getLastWindowInsets();
            if (parentInsets != null && s.s(parent) && !s.s(child)) {
                available.left += parentInsets.e();
                available.right -= parentInsets.f();
            }
            Rect out = this.f2565e;
            d.a(M(lp.f1654c), child.getMeasuredWidth(), child.getMeasuredHeight(), available, out, layoutDirection);
            int overlap = H(header);
            child.layout(out.left, out.top - overlap, out.right, out.bottom - overlap);
            this.f2566f = out.top - header.getBottom();
            return;
        }
        super.E(parent, child, layoutDirection);
        this.f2566f = 0;
    }

    public final int H(View header) {
        if (this.f2567g == 0) {
            return 0;
        }
        float I = I(header);
        int i = this.f2567g;
        return a.a((int) (I * ((float) i)), 0, i);
    }

    public static int M(int gravity) {
        if (gravity == 0) {
            return 8388659;
        }
        return gravity;
    }

    public int K(View v) {
        return v.getMeasuredHeight();
    }

    public final int L() {
        return this.f2566f;
    }

    public final void N(int overlayTop) {
        this.f2567g = overlayTop;
    }

    public final int J() {
        return this.f2567g;
    }
}
