package a.h.m;

import android.view.View;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public int f955a;

    /* renamed from: b  reason: collision with root package name */
    public int f956b;

    public void c(View child, View target, int axes) {
        b(axes, 0);
    }

    public void b(int axes, int type) {
        if (type == 1) {
            this.f956b = axes;
        } else {
            this.f955a = axes;
        }
    }

    public int a() {
        return this.f955a | this.f956b;
    }

    public void d(int type) {
        if (type == 1) {
            this.f956b = 0;
        } else {
            this.f955a = 0;
        }
    }
}
