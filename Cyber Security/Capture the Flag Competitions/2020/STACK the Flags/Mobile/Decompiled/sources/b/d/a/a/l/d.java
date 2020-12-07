package b.d.a.a.l;

import a.h.m.s;
import android.view.View;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f2571a;

    /* renamed from: b  reason: collision with root package name */
    public int f2572b;

    /* renamed from: c  reason: collision with root package name */
    public int f2573c;

    /* renamed from: d  reason: collision with root package name */
    public int f2574d;

    /* renamed from: e  reason: collision with root package name */
    public int f2575e;

    public d(View view) {
        this.f2571a = view;
    }

    public void b() {
        this.f2572b = this.f2571a.getTop();
        this.f2573c = this.f2571a.getLeft();
        e();
    }

    public final void e() {
        View view = this.f2571a;
        s.Q(view, this.f2574d - (view.getTop() - this.f2572b));
        View view2 = this.f2571a;
        s.P(view2, this.f2575e - (view2.getLeft() - this.f2573c));
    }

    public boolean d(int offset) {
        if (this.f2574d == offset) {
            return false;
        }
        this.f2574d = offset;
        e();
        return true;
    }

    public boolean c(int offset) {
        if (this.f2575e == offset) {
            return false;
        }
        this.f2575e = offset;
        e();
        return true;
    }

    public int a() {
        return this.f2574d;
    }
}
