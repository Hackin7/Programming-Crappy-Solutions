package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: ad */
public abstract class C0007ad implements C0101aq {

    /* renamed from: a */
    protected Context f32a;

    /* renamed from: b */
    protected Context f33b;

    /* renamed from: c */
    protected C0019aj f34c;

    /* renamed from: d */
    protected LayoutInflater f35d;

    /* renamed from: e */
    protected LayoutInflater f36e;

    /* renamed from: f */
    public C0102a f37f;

    /* renamed from: g */
    protected C0103ar f38g;

    /* renamed from: h */
    public int f39h;

    /* renamed from: i */
    private int f40i;

    /* renamed from: j */
    private int f41j;

    public C0007ad(Context context, int i, int i2) {
        this.f32a = context;
        this.f35d = LayoutInflater.from(context);
        this.f40i = i;
        this.f41j = i2;
    }

    /* renamed from: a */
    public View mo92a(C0023al alVar, View view, ViewGroup viewGroup) {
        if (!(view instanceof C0104a)) {
            view = this.f35d.inflate(this.f41j, viewGroup, false);
        }
        C0104a aVar = (C0104a) view;
        mo95a(alVar, aVar);
        return (View) aVar;
    }

    /* renamed from: a */
    public C0103ar mo93a(ViewGroup viewGroup) {
        if (this.f38g == null) {
            this.f38g = (C0103ar) this.f35d.inflate(this.f40i, viewGroup, false);
            this.f38g.mo362a(this.f34c);
            mo98a(true);
        }
        return this.f38g;
    }

    /* renamed from: a */
    public void mo94a(C0019aj ajVar, boolean z) {
        if (this.f37f != null) {
            this.f37f.mo196a(ajVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo95a(C0023al alVar, C0104a aVar);

    /* renamed from: a */
    public void mo96a(Context context, C0019aj ajVar) {
        this.f33b = context;
        this.f36e = LayoutInflater.from(this.f33b);
        this.f34c = ajVar;
    }

    /* renamed from: a */
    public final void mo97a(C0102a aVar) {
        this.f37f = aVar;
    }

    /* renamed from: a */
    public void mo98a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f38g;
        if (viewGroup != null) {
            int i = 0;
            if (this.f34c != null) {
                this.f34c.mo180j();
                ArrayList i2 = this.f34c.mo178i();
                int size = i2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C0023al alVar = (C0023al) i2.get(i4);
                    if (mo100a(alVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        C0023al itemData = childAt instanceof C0104a ? ((C0104a) childAt).getItemData() : null;
                        View a = mo92a(alVar, childAt, viewGroup);
                        if (alVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f38g).addView(a, i3);
                        }
                        i3++;
                    }
                }
                i = i3;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo101a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo99a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo100a(C0023al alVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo101a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo102a(C0111aw awVar) {
        if (this.f37f != null) {
            return this.f37f.mo197a(awVar);
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo103b(C0023al alVar) {
        return false;
    }

    /* renamed from: c */
    public final boolean mo104c(C0023al alVar) {
        return false;
    }
}
