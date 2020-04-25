package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

public final class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0058a f400a;

    /* renamed from: b */
    final FrameLayout f401b;

    /* renamed from: c */
    final FrameLayout f402c;

    /* renamed from: d */
    C0381ge f403d;

    /* renamed from: e */
    final DataSetObserver f404e;

    /* renamed from: f */
    OnDismissListener f405f;

    /* renamed from: g */
    boolean f406g;

    /* renamed from: h */
    int f407h;

    /* renamed from: i */
    private final C0059b f408i;

    /* renamed from: j */
    private final View f409j;

    /* renamed from: k */
    private final ImageView f410k;

    /* renamed from: l */
    private final int f411l;

    /* renamed from: m */
    private final OnGlobalLayoutListener f412m;

    /* renamed from: n */
    private C0192cg f413n;

    /* renamed from: o */
    private boolean f414o;

    /* renamed from: p */
    private int f415p;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f416a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0215cr a = C0215cr.m675a(context, attributeSet, f416a);
            setBackgroundDrawable(a.mo1312a(0));
            a.f1087b.recycle();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    class C0058a extends BaseAdapter {

        /* renamed from: a */
        C0135bb f417a;

        /* renamed from: b */
        boolean f418b;

        /* renamed from: c */
        final /* synthetic */ ActivityChooserView f419c;

        /* renamed from: d */
        private int f420d;

        /* renamed from: e */
        private boolean f421e;

        /* renamed from: f */
        private boolean f422f;

        /* renamed from: a */
        public final int mo511a() {
            int i = this.f420d;
            this.f420d = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f420d = i;
            return i2;
        }

        /* renamed from: a */
        public final void mo512a(int i) {
            if (this.f420d != i) {
                this.f420d = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public final void mo513a(boolean z) {
            if (this.f422f != z) {
                this.f422f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public final void mo514a(boolean z, boolean z2) {
            if (this.f418b != z || this.f421e != z2) {
                this.f418b = z;
                this.f421e = z2;
                notifyDataSetChanged();
            }
        }

        public final int getCount() {
            int a = this.f417a.mo895a();
            if (!this.f418b && this.f417a.mo900b() != null) {
                a--;
            }
            int min = Math.min(a, this.f420d);
            return this.f422f ? min + 1 : min;
        }

        public final Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f418b && this.f417a.mo900b() != null) {
                        i++;
                    }
                    return this.f417a.mo897a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            return (!this.f422f || i != getCount() - 1) ? 0 : 1;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0122f.list_item) {
                        view = LayoutInflater.from(this.f419c.getContext()).inflate(C0123g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f419c.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0122f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0122f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f418b || i != 0 || !this.f421e) {
                        view.setActivated(false);
                        return view;
                    }
                    view.setActivated(true);
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(this.f419c.getContext()).inflate(C0123g.abc_activity_chooser_view_list_item, viewGroup, false);
                        view.setId(1);
                        ((TextView) view.findViewById(C0122f.title)).setText(this.f419c.getContext().getString(C0124h.abc_activity_chooser_view_see_all));
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public final int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    class C0059b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f423a;

        public final void onClick(View view) {
            if (view == this.f423a.f402c) {
                this.f423a.mo497a();
                Intent b = this.f423a.f400a.f417a.mo899b(this.f423a.f400a.f417a.mo896a(this.f423a.f400a.f417a.mo900b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f423a.getContext().startActivity(b);
                }
            } else if (view == this.f423a.f401b) {
                this.f423a.f406g = false;
                this.f423a.mo496a(this.f423a.f407h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onDismiss() {
            if (this.f423a.f405f != null) {
                this.f423a.f405f.onDismiss();
            }
            if (this.f423a.f403d != null) {
                this.f423a.f403d.mo1809a(false);
            }
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0058a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f423a.mo497a();
                    if (!this.f423a.f406g) {
                        if (!this.f423a.f400a.f418b) {
                            i++;
                        }
                        Intent b = this.f423a.f400a.f417a.mo899b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f423a.getContext().startActivity(b);
                        }
                        return;
                    } else if (i > 0) {
                        C0135bb bbVar = this.f423a.f400a.f417a;
                        synchronized (bbVar.f792b) {
                            bbVar.mo901c();
                            C0136a aVar = (C0136a) bbVar.f793c.get(i);
                            C0136a aVar2 = (C0136a) bbVar.f793c.get(0);
                            bbVar.mo898a(new C0138c(new ComponentName(aVar.f805a.activityInfo.packageName, aVar.f805a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f806b - aVar.f806b) + 5.0f : 1.0f));
                        }
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f423a.mo496a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public final boolean onLongClick(View view) {
            if (view == this.f423a.f402c) {
                if (this.f423a.f400a.getCount() > 0) {
                    this.f423a.f406g = true;
                    this.f423a.mo496a(this.f423a.f407h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    private boolean m205b() {
        return getListPopupWindow().f999s.isShowing();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo496a(int i) {
        C0058a aVar;
        if (this.f400a.f417a == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f412m);
        boolean z = this.f402c.getVisibility() == 0;
        int a = this.f400a.f417a.mo895a();
        if (i == Integer.MAX_VALUE || a <= i + (z ? 1 : 0)) {
            this.f400a.mo513a(false);
            aVar = this.f400a;
        } else {
            this.f400a.mo513a(true);
            aVar = this.f400a;
            i--;
        }
        aVar.mo512a(i);
        C0192cg listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.f999s.isShowing()) {
            if (this.f406g || !z) {
                this.f400a.mo514a(true, z);
            } else {
                this.f400a.mo514a(false, false);
            }
            listPopupWindow.mo1213b(Math.min(this.f400a.mo511a(), this.f411l));
            listPopupWindow.mo111b();
            if (this.f403d != null) {
                this.f403d.mo1809a(true);
            }
            listPopupWindow.f985e.setContentDescription(getContext().getString(C0124h.abc_activitychooserview_choose_application));
            listPopupWindow.f985e.setSelector(new ColorDrawable(0));
        }
    }

    /* renamed from: a */
    public final boolean mo497a() {
        if (getListPopupWindow().f999s.isShowing()) {
            getListPopupWindow().mo114c();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f412m);
            }
        }
        return true;
    }

    public final C0135bb getDataModel() {
        return this.f400a.f417a;
    }

    /* access modifiers changed from: 0000 */
    public final C0192cg getListPopupWindow() {
        if (this.f413n == null) {
            this.f413n = new C0192cg(getContext());
            this.f413n.mo1061a((ListAdapter) this.f400a);
            this.f413n.f993m = this;
            this.f413n.mo1214f();
            this.f413n.f994n = this.f408i;
            this.f413n.mo1212a((OnDismissListener) this.f408i);
        }
        return this.f413n;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0135bb bbVar = this.f400a.f417a;
        if (bbVar != null) {
            bbVar.registerObserver(this.f404e);
        }
        this.f414o = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0135bb bbVar = this.f400a.f417a;
        if (bbVar != null) {
            bbVar.unregisterObserver(this.f404e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f412m);
        }
        if (m205b()) {
            mo497a();
        }
        this.f414o = false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f409j.layout(0, 0, i3 - i, i4 - i2);
        if (!m205b()) {
            mo497a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view = this.f409j;
        if (this.f402c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void setActivityChooserModel(C0135bb bbVar) {
        C0058a aVar = this.f400a;
        C0135bb bbVar2 = aVar.f419c.f400a.f417a;
        if (bbVar2 != null && aVar.f419c.isShown()) {
            bbVar2.unregisterObserver(aVar.f419c.f404e);
        }
        aVar.f417a = bbVar;
        if (bbVar != null && aVar.f419c.isShown()) {
            bbVar.registerObserver(aVar.f419c.f404e);
        }
        aVar.notifyDataSetChanged();
        if (getListPopupWindow().f999s.isShowing()) {
            mo497a();
            if (!getListPopupWindow().f999s.isShowing() && this.f414o) {
                this.f406g = false;
                mo496a(this.f407h);
            }
        }
    }

    public final void setDefaultActionButtonContentDescription(int i) {
        this.f415p = i;
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f410k.setContentDescription(getContext().getString(i));
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f410k.setImageDrawable(drawable);
    }

    public final void setInitialActivityCount(int i) {
        this.f407h = i;
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f405f = onDismissListener;
    }

    public final void setProvider(C0381ge geVar) {
        this.f403d = geVar;
    }
}
