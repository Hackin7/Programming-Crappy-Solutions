package a.r;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

public class t implements u {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroupOverlay f1409a;

    public t(ViewGroup group) {
        this.f1409a = group.getOverlay();
    }

    public void b(View view) {
        this.f1409a.add(view);
    }

    @Override // a.r.u
    public void a(View view) {
        this.f1409a.remove(view);
    }
}
