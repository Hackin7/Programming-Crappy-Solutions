package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aa */
public final class C0003aa {

    /* renamed from: a */
    public final ArrayList<C0402gt> f0a = new ArrayList<>();

    /* renamed from: b */
    C0406gu f1b;

    /* renamed from: c */
    boolean f2c;

    /* renamed from: d */
    private long f3d = -1;

    /* renamed from: e */
    private Interpolator f4e;

    /* renamed from: f */
    private final C0407gv f5f = new C0407gv() {

        /* renamed from: b */
        private boolean f7b = false;

        /* renamed from: c */
        private int f8c = 0;

        /* renamed from: a */
        public final void mo7a(View view) {
            if (!this.f7b) {
                this.f7b = true;
                if (C0003aa.this.f1b != null) {
                    C0003aa.this.f1b.mo7a(null);
                }
            }
        }

        /* renamed from: b */
        public final void mo8b(View view) {
            int i = this.f8c + 1;
            this.f8c = i;
            if (i == C0003aa.this.f0a.size()) {
                if (C0003aa.this.f1b != null) {
                    C0003aa.this.f1b.mo8b(null);
                }
                this.f8c = 0;
                this.f7b = false;
                C0003aa.this.f2c = false;
            }
        }
    };

    /* renamed from: a */
    public final C0003aa mo1a(Interpolator interpolator) {
        if (!this.f2c) {
            this.f4e = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final C0003aa mo2a(C0402gt gtVar) {
        if (!this.f2c) {
            this.f0a.add(gtVar);
        }
        return this;
    }

    /* renamed from: a */
    public final C0003aa mo3a(C0406gu guVar) {
        if (!this.f2c) {
            this.f1b = guVar;
        }
        return this;
    }

    /* renamed from: a */
    public final void mo4a() {
        if (!this.f2c) {
            Iterator it = this.f0a.iterator();
            while (it.hasNext()) {
                C0402gt gtVar = (C0402gt) it.next();
                if (this.f3d >= 0) {
                    gtVar.mo1822a(this.f3d);
                }
                if (this.f4e != null) {
                    Interpolator interpolator = this.f4e;
                    View view = (View) gtVar.f1746a.get();
                    if (view != null) {
                        view.animate().setInterpolator(interpolator);
                    }
                }
                if (this.f1b != null) {
                    gtVar.mo1823a((C0406gu) this.f5f);
                }
                View view2 = (View) gtVar.f1746a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f2c = true;
        }
    }

    /* renamed from: b */
    public final void mo5b() {
        if (this.f2c) {
            Iterator it = this.f0a.iterator();
            while (it.hasNext()) {
                ((C0402gt) it.next()).mo1825a();
            }
            this.f2c = false;
        }
    }

    /* renamed from: c */
    public final C0003aa mo6c() {
        if (!this.f2c) {
            this.f3d = 250;
        }
        return this;
    }
}
