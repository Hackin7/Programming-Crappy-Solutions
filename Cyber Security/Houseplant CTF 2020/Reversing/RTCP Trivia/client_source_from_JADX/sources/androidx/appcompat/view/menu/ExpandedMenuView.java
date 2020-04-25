package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C0021b, OnItemClickListener, C0103ar {

    /* renamed from: a */
    private static final int[] f306a = {16842964, 16843049};

    /* renamed from: b */
    private C0019aj f307b;

    /* renamed from: c */
    private int f308c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0215cr a = C0215cr.m676a(context, attributeSet, f306a, i, 0);
        if (a.mo1323f(0)) {
            setBackgroundDrawable(a.mo1312a(0));
        }
        if (a.mo1323f(1)) {
            setDivider(a.mo1312a(1));
        }
        a.f1087b.recycle();
    }

    /* renamed from: a */
    public final void mo362a(C0019aj ajVar) {
        this.f307b = ajVar;
    }

    /* renamed from: a */
    public final boolean mo195a(C0023al alVar) {
        return this.f307b.mo151a((MenuItem) alVar, (C0101aq) null, 0);
    }

    public final int getWindowAnimations() {
        return this.f308c;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo195a((C0023al) getAdapter().getItem(i));
    }
}
