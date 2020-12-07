package a.d.e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.cardview.widget.CardView;

public class a implements c {
    @Override // a.d.e.c
    public void h(b cardView, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        ((CardView.a) cardView).e(new d(backgroundColor, radius));
        View view = ((CardView.a) cardView).b();
        view.setClipToOutline(true);
        view.setElevation(elevation);
        m(cardView, maxElevation);
    }

    @Override // a.d.e.c
    public void i(b cardView, float radius) {
        o(cardView).h(radius);
    }

    @Override // a.d.e.c
    public void n() {
    }

    @Override // a.d.e.c
    public void m(b cardView, float maxElevation) {
        o(cardView).g(maxElevation, ((CardView.a) cardView).d(), ((CardView.a) cardView).c());
        p(cardView);
    }

    @Override // a.d.e.c
    public float a(b cardView) {
        return o(cardView).c();
    }

    @Override // a.d.e.c
    public float d(b cardView) {
        return b(cardView) * 2.0f;
    }

    @Override // a.d.e.c
    public float c(b cardView) {
        return b(cardView) * 2.0f;
    }

    @Override // a.d.e.c
    public float b(b cardView) {
        return o(cardView).d();
    }

    @Override // a.d.e.c
    public void g(b cardView, float elevation) {
        ((CardView.a) cardView).b().setElevation(elevation);
    }

    @Override // a.d.e.c
    public float l(b cardView) {
        return ((CardView.a) cardView).b().getElevation();
    }

    public void p(b cardView) {
        if (!((CardView.a) cardView).d()) {
            ((CardView.a) cardView).f(0, 0, 0, 0);
            return;
        }
        float elevation = a(cardView);
        float radius = b(cardView);
        int hPadding = (int) Math.ceil((double) e.a(elevation, radius, ((CardView.a) cardView).c()));
        int vPadding = (int) Math.ceil((double) e.b(elevation, radius, ((CardView.a) cardView).c()));
        ((CardView.a) cardView).f(hPadding, vPadding, hPadding, vPadding);
    }

    @Override // a.d.e.c
    public void e(b cardView) {
        m(cardView, a(cardView));
    }

    @Override // a.d.e.c
    public void j(b cardView) {
        m(cardView, a(cardView));
    }

    @Override // a.d.e.c
    public void k(b cardView, ColorStateList color) {
        o(cardView).f(color);
    }

    @Override // a.d.e.c
    public ColorStateList f(b cardView) {
        return o(cardView).b();
    }

    public final d o(b cardView) {
        return (d) ((CardView.a) cardView).a();
    }
}
