package a.b.o;

import a.h.m.x;
import a.h.m.y;
import a.h.m.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<x> f153a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f154b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f155c;

    /* renamed from: d  reason: collision with root package name */
    public y f156d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f157e;

    /* renamed from: f  reason: collision with root package name */
    public final z f158f = new a();

    public h c(x animator) {
        if (!this.f157e) {
            this.f153a.add(animator);
        }
        return this;
    }

    public h d(x anim1, x anim2) {
        this.f153a.add(anim1);
        anim2.h(anim1.c());
        this.f153a.add(anim2);
        return this;
    }

    public void h() {
        if (!this.f157e) {
            Iterator<x> it = this.f153a.iterator();
            while (it.hasNext()) {
                x animator = it.next();
                long j = this.f154b;
                if (j >= 0) {
                    animator.d(j);
                }
                Interpolator interpolator = this.f155c;
                if (interpolator != null) {
                    animator.e(interpolator);
                }
                if (this.f156d != null) {
                    animator.f(this.f158f);
                }
                animator.j();
            }
            this.f157e = true;
        }
    }

    public void b() {
        this.f157e = false;
    }

    public void a() {
        if (this.f157e) {
            Iterator<x> it = this.f153a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f157e = false;
        }
    }

    public h e(long duration) {
        if (!this.f157e) {
            this.f154b = duration;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f157e) {
            this.f155c = interpolator;
        }
        return this;
    }

    public h g(y listener) {
        if (!this.f157e) {
            this.f156d = listener;
        }
        return this;
    }

    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public boolean f159a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f160b = 0;

        public a() {
        }

        @Override // a.h.m.z, a.h.m.y
        public void b(View view) {
            if (!this.f159a) {
                this.f159a = true;
                y yVar = h.this.f156d;
                if (yVar != null) {
                    yVar.b(null);
                }
            }
        }

        public void d() {
            this.f160b = 0;
            this.f159a = false;
            h.this.b();
        }

        @Override // a.h.m.y
        public void a(View view) {
            int i = this.f160b + 1;
            this.f160b = i;
            if (i == h.this.f153a.size()) {
                y yVar = h.this.f156d;
                if (yVar != null) {
                    yVar.a(null);
                }
                d();
            }
        }
    }
}
