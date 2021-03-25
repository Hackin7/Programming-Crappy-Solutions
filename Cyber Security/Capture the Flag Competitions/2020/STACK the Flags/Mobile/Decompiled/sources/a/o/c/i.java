package a.o.c;

import a.h.m.c0.d;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

public class i extends a.h.m.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f1298d;

    /* renamed from: e  reason: collision with root package name */
    public final a.h.m.a f1299e = new a(this);

    public i(RecyclerView recyclerView) {
        this.f1298d = recyclerView;
    }

    public boolean o() {
        return this.f1298d.m0();
    }

    @Override // a.h.m.a
    public boolean j(View host, int action, Bundle args) {
        if (super.j(host, action, args)) {
            return true;
        }
        if (o() || this.f1298d.getLayoutManager() == null) {
            return false;
        }
        return this.f1298d.getLayoutManager().e1(action, args);
    }

    @Override // a.h.m.a
    public void g(View host, d info) {
        super.g(host, info);
        info.K(RecyclerView.class.getName());
        if (!o() && this.f1298d.getLayoutManager() != null) {
            this.f1298d.getLayoutManager().K0(info);
        }
    }

    @Override // a.h.m.a
    public void f(View host, AccessibilityEvent event) {
        super.f(host, event);
        event.setClassName(RecyclerView.class.getName());
        if ((host instanceof RecyclerView) && !o()) {
            RecyclerView rv = (RecyclerView) host;
            if (rv.getLayoutManager() != null) {
                rv.getLayoutManager().I0(event);
            }
        }
    }

    public a.h.m.a n() {
        return this.f1299e;
    }

    public static class a extends a.h.m.a {

        /* renamed from: d  reason: collision with root package name */
        public final i f1300d;

        public a(i recyclerViewDelegate) {
            this.f1300d = recyclerViewDelegate;
        }

        @Override // a.h.m.a
        public void g(View host, d info) {
            super.g(host, info);
            if (!this.f1300d.o() && this.f1300d.f1298d.getLayoutManager() != null) {
                this.f1300d.f1298d.getLayoutManager().M0(host, info);
            }
        }

        @Override // a.h.m.a
        public boolean j(View host, int action, Bundle args) {
            if (super.j(host, action, args)) {
                return true;
            }
            if (this.f1300d.o() || this.f1300d.f1298d.getLayoutManager() == null) {
                return false;
            }
            return this.f1300d.f1298d.getLayoutManager().g1(host, action, args);
        }
    }
}
