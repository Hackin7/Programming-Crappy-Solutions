package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;

/* renamed from: ah */
public final class C0016ah implements OnItemClickListener, C0101aq {

    /* renamed from: a */
    Context f83a;

    /* renamed from: b */
    public LayoutInflater f84b;

    /* renamed from: c */
    C0019aj f85c;

    /* renamed from: d */
    public ExpandedMenuView f86d;

    /* renamed from: e */
    int f87e;

    /* renamed from: f */
    int f88f;

    /* renamed from: g */
    int f89g;

    /* renamed from: h */
    public C0102a f90h;

    /* renamed from: i */
    public C0017a f91i;

    /* renamed from: ah$a */
    public class C0017a extends BaseAdapter {

        /* renamed from: b */
        private int f93b = -1;

        public C0017a() {
            m59a();
        }

        /* renamed from: a */
        private void m59a() {
            C0023al alVar = C0016ah.this.f85c.f111j;
            if (alVar != null) {
                ArrayList k = C0016ah.this.f85c.mo181k();
                int size = k.size();
                for (int i = 0; i < size; i++) {
                    if (((C0023al) k.get(i)) == alVar) {
                        this.f93b = i;
                        return;
                    }
                }
            }
            this.f93b = -1;
        }

        /* renamed from: a */
        public final C0023al getItem(int i) {
            ArrayList k = C0016ah.this.f85c.mo181k();
            int i2 = i + C0016ah.this.f87e;
            if (this.f93b >= 0 && i2 >= this.f93b) {
                i2++;
            }
            return (C0023al) k.get(i2);
        }

        public final int getCount() {
            int size = C0016ah.this.f85c.mo181k().size() - C0016ah.this.f87e;
            return this.f93b < 0 ? size : size - 1;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0016ah.this.f84b.inflate(C0016ah.this.f89g, viewGroup, false);
            }
            ((C0104a) view).mo340a(getItem(i));
            return view;
        }

        public final void notifyDataSetChanged() {
            m59a();
            super.notifyDataSetChanged();
        }
    }

    private C0016ah(int i) {
        this.f89g = i;
        this.f88f = 0;
    }

    public C0016ah(Context context, int i) {
        this(i);
        this.f83a = context;
        this.f84b = LayoutInflater.from(this.f83a);
    }

    /* renamed from: a */
    public final void mo94a(C0019aj ajVar, boolean z) {
        if (this.f90h != null) {
            this.f90h.mo196a(ajVar, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r2.f84b == null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96a(android.content.Context r3, p000.C0019aj r4) {
        /*
            r2 = this;
            int r0 = r2.f88f
            if (r0 == 0) goto L_0x0016
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f88f
            r0.<init>(r3, r1)
            r2.f83a = r0
        L_0x000d:
            android.content.Context r3 = r2.f83a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f84b = r3
            goto L_0x0021
        L_0x0016:
            android.content.Context r0 = r2.f83a
            if (r0 == 0) goto L_0x0021
            r2.f83a = r3
            android.view.LayoutInflater r3 = r2.f84b
            if (r3 != 0) goto L_0x0021
            goto L_0x000d
        L_0x0021:
            r2.f85c = r4
            ah$a r3 = r2.f91i
            if (r3 == 0) goto L_0x002c
            ah$a r3 = r2.f91i
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0016ah.mo96a(android.content.Context, aj):void");
    }

    /* renamed from: a */
    public final void mo97a(C0102a aVar) {
        this.f90h = aVar;
    }

    /* renamed from: a */
    public final void mo98a(boolean z) {
        if (this.f91i != null) {
            this.f91i.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo99a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo102a(C0111aw awVar) {
        if (!awVar.hasVisibleItems()) {
            return false;
        }
        C0022ak akVar = new C0022ak(awVar);
        C0019aj ajVar = akVar.f127a;
        C0231a aVar = new C0231a(ajVar.f102a);
        akVar.f129c = new C0016ah(aVar.f1140a.f246a, C0123g.abc_list_menu_item_layout);
        akVar.f129c.f90h = akVar;
        akVar.f127a.mo146a((C0101aq) akVar.f129c);
        aVar.f1140a.f268w = akVar.f129c.mo128b();
        aVar.f1140a.f269x = akVar;
        View view = ajVar.f109h;
        if (view != null) {
            aVar.f1140a.f252g = view;
        } else {
            aVar.f1140a.f249d = ajVar.f108g;
            aVar.f1140a.f251f = ajVar.f107f;
        }
        aVar.f1140a.f266u = akVar;
        akVar.f128b = aVar.mo1348a();
        akVar.f128b.setOnDismissListener(akVar);
        LayoutParams attributes = akVar.f128b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        akVar.f128b.show();
        if (this.f90h != null) {
            this.f90h.mo197a(awVar);
        }
        return true;
    }

    /* renamed from: b */
    public final ListAdapter mo128b() {
        if (this.f91i == null) {
            this.f91i = new C0017a();
        }
        return this.f91i;
    }

    /* renamed from: b */
    public final boolean mo103b(C0023al alVar) {
        return false;
    }

    /* renamed from: c */
    public final boolean mo104c(C0023al alVar) {
        return false;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f85c.mo151a((MenuItem) this.f91i.getItem(i), (C0101aq) this, 0);
    }
}
