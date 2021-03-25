package a.o.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.o f1295a;

    /* renamed from: b  reason: collision with root package name */
    public int f1296b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1297c;

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public /* synthetic */ h(RecyclerView.o x0, a x1) {
        this(x0);
    }

    public h(RecyclerView.o layoutManager) {
        this.f1296b = Integer.MIN_VALUE;
        this.f1297c = new Rect();
        this.f1295a = layoutManager;
    }

    public void s() {
        this.f1296b = n();
    }

    public int o() {
        if (Integer.MIN_VALUE == this.f1296b) {
            return 0;
        }
        return n() - this.f1296b;
    }

    public static h b(RecyclerView.o layoutManager, int orientation) {
        if (orientation == 0) {
            return a(layoutManager);
        }
        if (orientation == 1) {
            return c(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static class a extends h {
        public a(RecyclerView.o layoutManager) {
            super(layoutManager, null);
        }

        @Override // a.o.c.h
        public int i() {
            return this.f1295a.m0() - this.f1295a.d0();
        }

        @Override // a.o.c.h
        public int h() {
            return this.f1295a.m0();
        }

        @Override // a.o.c.h
        public void r(int amount) {
            this.f1295a.A0(amount);
        }

        @Override // a.o.c.h
        public int m() {
            return this.f1295a.c0();
        }

        @Override // a.o.c.h
        public int e(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f1295a.R(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // a.o.c.h
        public int f(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f1295a.Q(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // a.o.c.h
        public int d(View view) {
            return this.f1295a.S(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // a.o.c.h
        public int g(View view) {
            return this.f1295a.P(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // a.o.c.h
        public int p(View view) {
            this.f1295a.l0(view, true, this.f1297c);
            return this.f1297c.right;
        }

        @Override // a.o.c.h
        public int q(View view) {
            this.f1295a.l0(view, true, this.f1297c);
            return this.f1297c.left;
        }

        @Override // a.o.c.h
        public int n() {
            return (this.f1295a.m0() - this.f1295a.c0()) - this.f1295a.d0();
        }

        @Override // a.o.c.h
        public int j() {
            return this.f1295a.d0();
        }

        @Override // a.o.c.h
        public int k() {
            return this.f1295a.n0();
        }

        @Override // a.o.c.h
        public int l() {
            return this.f1295a.W();
        }
    }

    public static h a(RecyclerView.o layoutManager) {
        return new a(layoutManager);
    }

    public static class b extends h {
        public b(RecyclerView.o layoutManager) {
            super(layoutManager, null);
        }

        @Override // a.o.c.h
        public int i() {
            return this.f1295a.V() - this.f1295a.b0();
        }

        @Override // a.o.c.h
        public int h() {
            return this.f1295a.V();
        }

        @Override // a.o.c.h
        public void r(int amount) {
            this.f1295a.B0(amount);
        }

        @Override // a.o.c.h
        public int m() {
            return this.f1295a.e0();
        }

        @Override // a.o.c.h
        public int e(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f1295a.Q(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // a.o.c.h
        public int f(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f1295a.R(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // a.o.c.h
        public int d(View view) {
            return this.f1295a.N(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // a.o.c.h
        public int g(View view) {
            return this.f1295a.T(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // a.o.c.h
        public int p(View view) {
            this.f1295a.l0(view, true, this.f1297c);
            return this.f1297c.bottom;
        }

        @Override // a.o.c.h
        public int q(View view) {
            this.f1295a.l0(view, true, this.f1297c);
            return this.f1297c.top;
        }

        @Override // a.o.c.h
        public int n() {
            return (this.f1295a.V() - this.f1295a.e0()) - this.f1295a.b0();
        }

        @Override // a.o.c.h
        public int j() {
            return this.f1295a.b0();
        }

        @Override // a.o.c.h
        public int k() {
            return this.f1295a.W();
        }

        @Override // a.o.c.h
        public int l() {
            return this.f1295a.n0();
        }
    }

    public static h c(RecyclerView.o layoutManager) {
        return new b(layoutManager);
    }
}
