package androidx.appcompat.view.menu;

import a.b.o.j.g;
import a.b.o.j.i;
import a.b.o.j.n;
import a.b.p.w0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1529c = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    public g f1530b;

    public ExpandedMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        setOnItemClickListener(this);
        w0 a2 = w0.u(context, attrs, f1529c, defStyleAttr, 0);
        if (a2.r(0)) {
            setBackgroundDrawable(a2.f(0));
        }
        if (a2.r(1)) {
            setDivider(a2.f(1));
        }
        a2.v();
    }

    @Override // a.b.o.j.n
    public void b(g menu) {
        this.f1530b = menu;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // a.b.o.j.g.b
    public boolean a(i item) {
        return this.f1530b.L(item, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView parent, View v, int position, long id) {
        a((i) getAdapter().getItem(position));
    }

    public int getWindowAnimations() {
        return 0;
    }
}
