package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: ai */
public final class C0018ai extends BaseAdapter {

    /* renamed from: a */
    public C0019aj f94a;

    /* renamed from: b */
    boolean f95b;

    /* renamed from: c */
    private int f96c = -1;

    /* renamed from: d */
    private final boolean f97d;

    /* renamed from: e */
    private final LayoutInflater f98e;

    /* renamed from: f */
    private final int f99f;

    public C0018ai(C0019aj ajVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f97d = z;
        this.f98e = layoutInflater;
        this.f94a = ajVar;
        this.f99f = i;
        m61a();
    }

    /* renamed from: a */
    private void m61a() {
        C0023al alVar = this.f94a.f111j;
        if (alVar != null) {
            ArrayList k = this.f94a.mo181k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (((C0023al) k.get(i)) == alVar) {
                    this.f96c = i;
                    return;
                }
            }
        }
        this.f96c = -1;
    }

    /* renamed from: a */
    public final C0023al getItem(int i) {
        ArrayList k = this.f97d ? this.f94a.mo181k() : this.f94a.mo178i();
        if (this.f96c >= 0 && i >= this.f96c) {
            i++;
        }
        return (C0023al) k.get(i);
    }

    public final int getCount() {
        ArrayList k = this.f97d ? this.f94a.mo181k() : this.f94a.mo178i();
        return this.f96c < 0 ? k.size() : k.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f98e.inflate(this.f99f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f94a.mo164b() && groupId != groupId2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C0104a aVar = (C0104a) view;
        if (this.f95b) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo340a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        m61a();
        super.notifyDataSetChanged();
    }
}
