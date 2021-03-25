package a.o.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class k extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    public boolean f1301g = true;

    public abstract boolean w(RecyclerView.b0 b0Var);

    public abstract boolean x(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i, int i2, int i3, int i4);

    public abstract boolean y(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4);

    public abstract boolean z(RecyclerView.b0 b0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.b0 viewHolder) {
        return !this.f1301g || viewHolder.s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.b0 viewHolder, RecyclerView.l.c preLayoutInfo, RecyclerView.l.c postLayoutInfo) {
        int oldLeft = preLayoutInfo.f1767a;
        int oldTop = preLayoutInfo.f1768b;
        View disappearingItemView = viewHolder.f1750b;
        int newLeft = postLayoutInfo == null ? disappearingItemView.getLeft() : postLayoutInfo.f1767a;
        int newTop = postLayoutInfo == null ? disappearingItemView.getTop() : postLayoutInfo.f1768b;
        if (viewHolder.u() || (oldLeft == newLeft && oldTop == newTop)) {
            z(viewHolder);
            return true;
        }
        disappearingItemView.layout(newLeft, newTop, disappearingItemView.getWidth() + newLeft, disappearingItemView.getHeight() + newTop);
        return y(viewHolder, oldLeft, oldTop, newLeft, newTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.b0 viewHolder, RecyclerView.l.c preLayoutInfo, RecyclerView.l.c postLayoutInfo) {
        if (preLayoutInfo != null && (preLayoutInfo.f1767a != postLayoutInfo.f1767a || preLayoutInfo.f1768b != postLayoutInfo.f1768b)) {
            return y(viewHolder, preLayoutInfo.f1767a, preLayoutInfo.f1768b, postLayoutInfo.f1767a, postLayoutInfo.f1768b);
        }
        w(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.b0 viewHolder, RecyclerView.l.c preInfo, RecyclerView.l.c postInfo) {
        if (preInfo.f1767a != postInfo.f1767a || preInfo.f1768b != postInfo.f1768b) {
            return y(viewHolder, preInfo.f1767a, preInfo.f1768b, postInfo.f1767a, postInfo.f1768b);
        }
        E(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.b0 oldHolder, RecyclerView.b0 newHolder, RecyclerView.l.c preInfo, RecyclerView.l.c postInfo) {
        int toTop;
        int toLeft;
        int fromLeft = preInfo.f1767a;
        int fromTop = preInfo.f1768b;
        if (newHolder.I()) {
            toLeft = preInfo.f1767a;
            toTop = preInfo.f1768b;
        } else {
            toLeft = postInfo.f1767a;
            toTop = postInfo.f1768b;
        }
        return x(oldHolder, newHolder, fromLeft, fromTop, toLeft, toTop);
    }

    public final void G(RecyclerView.b0 item) {
        O();
        h(item);
    }

    public final void E(RecyclerView.b0 item) {
        M();
        h(item);
    }

    public final void A(RecyclerView.b0 item) {
        I();
        h(item);
    }

    public final void C(RecyclerView.b0 item, boolean oldItem) {
        K();
        h(item);
    }

    public final void H(RecyclerView.b0 item) {
        P();
    }

    public final void F(RecyclerView.b0 item) {
        N();
    }

    public final void B(RecyclerView.b0 item) {
        J();
    }

    public final void D(RecyclerView.b0 item, boolean oldItem) {
        L();
    }

    public void P() {
    }

    public void O() {
    }

    public void J() {
    }

    public void I() {
    }

    public void N() {
    }

    public void M() {
    }

    public void L() {
    }

    public void K() {
    }
}
