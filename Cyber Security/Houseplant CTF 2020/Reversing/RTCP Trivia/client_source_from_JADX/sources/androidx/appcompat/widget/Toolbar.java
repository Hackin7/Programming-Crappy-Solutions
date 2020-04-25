package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView.C0057e;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f513A;

    /* renamed from: B */
    private int f514B;

    /* renamed from: C */
    private int f515C;

    /* renamed from: D */
    private CharSequence f516D;

    /* renamed from: E */
    private CharSequence f517E;

    /* renamed from: F */
    private int f518F;

    /* renamed from: G */
    private int f519G;

    /* renamed from: H */
    private boolean f520H;

    /* renamed from: I */
    private boolean f521I;

    /* renamed from: J */
    private final ArrayList<View> f522J;

    /* renamed from: K */
    private final int[] f523K;

    /* renamed from: L */
    private final C0057e f524L;

    /* renamed from: M */
    private C0216cs f525M;

    /* renamed from: N */
    private boolean f526N;

    /* renamed from: O */
    private final Runnable f527O;

    /* renamed from: a */
    public ActionMenuView f528a;

    /* renamed from: b */
    public TextView f529b;

    /* renamed from: c */
    public TextView f530c;

    /* renamed from: d */
    Drawable f531d;

    /* renamed from: e */
    CharSequence f532e;

    /* renamed from: f */
    ImageButton f533f;

    /* renamed from: g */
    View f534g;

    /* renamed from: h */
    public Context f535h;

    /* renamed from: i */
    public int f536i;

    /* renamed from: j */
    public int f537j;

    /* renamed from: k */
    public int f538k;

    /* renamed from: l */
    int f539l;

    /* renamed from: m */
    public C0204ck f540m;

    /* renamed from: n */
    final ArrayList<View> f541n;

    /* renamed from: o */
    C0084c f542o;

    /* renamed from: p */
    public C0127ba f543p;

    /* renamed from: q */
    public C0082a f544q;

    /* renamed from: r */
    public C0102a f545r;

    /* renamed from: s */
    public C0020a f546s;

    /* renamed from: t */
    private ImageButton f547t;

    /* renamed from: u */
    private ImageView f548u;

    /* renamed from: v */
    private int f549v;

    /* renamed from: w */
    private int f550w;

    /* renamed from: x */
    private int f551x;

    /* renamed from: y */
    private int f552y;

    /* renamed from: z */
    private int f553z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0082a implements C0101aq {

        /* renamed from: a */
        C0019aj f557a;

        /* renamed from: b */
        public C0023al f558b;

        public C0082a() {
        }

        /* renamed from: a */
        public final void mo94a(C0019aj ajVar, boolean z) {
        }

        /* renamed from: a */
        public final void mo96a(Context context, C0019aj ajVar) {
            if (!(this.f557a == null || this.f558b == null)) {
                this.f557a.mo165b(this.f558b);
            }
            this.f557a = ajVar;
        }

        /* renamed from: a */
        public final void mo97a(C0102a aVar) {
        }

        /* renamed from: a */
        public final void mo98a(boolean z) {
            if (this.f558b != null) {
                boolean z2 = false;
                if (this.f557a != null) {
                    int size = this.f557a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f557a.getItem(i) == this.f558b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo104c(this.f558b);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo99a() {
            return false;
        }

        /* renamed from: a */
        public final boolean mo102a(C0111aw awVar) {
            return false;
        }

        /* renamed from: b */
        public final boolean mo103b(C0023al alVar) {
            Toolbar toolbar = Toolbar.this;
            if (toolbar.f533f == null) {
                toolbar.f533f = new C0155bl(toolbar.getContext(), null, C0117a.toolbarNavigationButtonStyle);
                toolbar.f533f.setImageDrawable(toolbar.f531d);
                toolbar.f533f.setContentDescription(toolbar.f532e);
                C0083b bVar = new C0083b();
                bVar.f924a = (toolbar.f539l & C0126j.AppCompatTheme_windowActionBarOverlay) | 8388611;
                bVar.f560b = 2;
                toolbar.f533f.setLayoutParams(bVar);
                toolbar.f533f.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        Toolbar.this.mo625c();
                    }
                });
            }
            ViewParent parent = Toolbar.this.f533f.getParent();
            if (parent != Toolbar.this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(Toolbar.this.f533f);
                }
                Toolbar.this.addView(Toolbar.this.f533f);
            }
            Toolbar.this.f534g = alVar.getActionView();
            this.f558b = alVar;
            ViewParent parent2 = Toolbar.this.f534g.getParent();
            if (parent2 != Toolbar.this) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(Toolbar.this.f534g);
                }
                C0083b e = Toolbar.m258e();
                e.f924a = (Toolbar.this.f539l & C0126j.AppCompatTheme_windowActionBarOverlay) | 8388611;
                e.f560b = 2;
                Toolbar.this.f534g.setLayoutParams(e);
                Toolbar.this.addView(Toolbar.this.f534g);
            }
            Toolbar toolbar2 = Toolbar.this;
            for (int childCount = toolbar2.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar2.getChildAt(childCount);
                if (!(((C0083b) childAt.getLayoutParams()).f560b == 2 || childAt == toolbar2.f528a)) {
                    toolbar2.removeViewAt(childCount);
                    toolbar2.f541n.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            alVar.mo208d(true);
            if (Toolbar.this.f534g instanceof C0804v) {
                ((C0804v) Toolbar.this.f534g).mo311a();
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo104c(C0023al alVar) {
            if (Toolbar.this.f534g instanceof C0804v) {
                ((C0804v) Toolbar.this.f534g).mo312b();
            }
            Toolbar.this.removeView(Toolbar.this.f534g);
            Toolbar.this.removeView(Toolbar.this.f533f);
            Toolbar.this.f534g = null;
            Toolbar toolbar = Toolbar.this;
            for (int size = toolbar.f541n.size() - 1; size >= 0; size--) {
                toolbar.addView((View) toolbar.f541n.get(size));
            }
            toolbar.f541n.clear();
            this.f558b = null;
            Toolbar.this.requestLayout();
            alVar.mo208d(false);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public static class C0083b extends C0178a {

        /* renamed from: b */
        int f560b;

        public C0083b() {
            this.f560b = 0;
            this.f924a = 8388627;
        }

        public C0083b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f560b = 0;
        }

        public C0083b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f560b = 0;
        }

        public C0083b(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f560b = 0;
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0083b(C0083b bVar) {
            super((C0178a) bVar);
            this.f560b = 0;
            this.f560b = bVar.f560b;
        }

        public C0083b(C0178a aVar) {
            super(aVar);
            this.f560b = 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public interface C0084c {
        /* renamed from: a */
        boolean mo693a();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public static class C0085d extends C0450hm {
        public static final Creator<C0085d> CREATOR = new ClassLoaderCreator<C0085d>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0085d(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0085d(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0085d[i];
            }
        };

        /* renamed from: a */
        int f561a;

        /* renamed from: b */
        boolean f562b;

        public C0085d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f561a = parcel.readInt();
            this.f562b = parcel.readInt() != 0;
        }

        public C0085d(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f561a);
            parcel.writeInt(this.f562b ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f515C = 8388627;
        this.f522J = new ArrayList<>();
        this.f541n = new ArrayList<>();
        this.f523K = new int[2];
        this.f524L = new C0057e() {
            /* renamed from: a */
            public final boolean mo495a() {
                if (Toolbar.this.f542o != null) {
                    return Toolbar.this.f542o.mo693a();
                }
                return false;
            }
        };
        this.f527O = new Runnable() {
            public final void run() {
                Toolbar.this.mo624b();
            }
        };
        C0215cr a = C0215cr.m676a(getContext(), attributeSet, C0126j.Toolbar, i, 0);
        this.f537j = a.mo1324g(C0126j.Toolbar_titleTextAppearance, 0);
        this.f538k = a.mo1324g(C0126j.Toolbar_subtitleTextAppearance, 0);
        this.f515C = a.mo1316c(C0126j.Toolbar_android_gravity, this.f515C);
        this.f539l = a.mo1316c(C0126j.Toolbar_buttonGravity, 48);
        int d = a.mo1318d(C0126j.Toolbar_titleMargin, 0);
        if (a.mo1323f(C0126j.Toolbar_titleMargins)) {
            d = a.mo1318d(C0126j.Toolbar_titleMargins, d);
        }
        this.f553z = d;
        this.f552y = d;
        this.f551x = d;
        this.f550w = d;
        int d2 = a.mo1318d(C0126j.Toolbar_titleMarginStart, -1);
        if (d2 >= 0) {
            this.f550w = d2;
        }
        int d3 = a.mo1318d(C0126j.Toolbar_titleMarginEnd, -1);
        if (d3 >= 0) {
            this.f551x = d3;
        }
        int d4 = a.mo1318d(C0126j.Toolbar_titleMarginTop, -1);
        if (d4 >= 0) {
            this.f552y = d4;
        }
        int d5 = a.mo1318d(C0126j.Toolbar_titleMarginBottom, -1);
        if (d5 >= 0) {
            this.f553z = d5;
        }
        this.f549v = a.mo1320e(C0126j.Toolbar_maxButtonHeight, -1);
        int d6 = a.mo1318d(C0126j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d7 = a.mo1318d(C0126j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.mo1320e(C0126j.Toolbar_contentInsetLeft, 0);
        int e2 = a.mo1320e(C0126j.Toolbar_contentInsetRight, 0);
        mo628f();
        C0204ck ckVar = this.f540m;
        ckVar.f1028h = false;
        if (e != Integer.MIN_VALUE) {
            ckVar.f1025e = e;
            ckVar.f1021a = e;
        }
        if (e2 != Integer.MIN_VALUE) {
            ckVar.f1026f = e2;
            ckVar.f1022b = e2;
        }
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f540m.mo1275a(d6, d7);
        }
        this.f513A = a.mo1318d(C0126j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f514B = a.mo1318d(C0126j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f531d = a.mo1312a(C0126j.Toolbar_collapseIcon);
        this.f532e = a.mo1317c(C0126j.Toolbar_collapseContentDescription);
        CharSequence c = a.mo1317c(C0126j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        CharSequence c2 = a.mo1317c(C0126j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c2)) {
            setSubtitle(c2);
        }
        this.f535h = getContext();
        setPopupTheme(a.mo1324g(C0126j.Toolbar_popupTheme, 0));
        Drawable a2 = a.mo1312a(C0126j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        CharSequence c3 = a.mo1317c(C0126j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c3)) {
            setNavigationContentDescription(c3);
        }
        Drawable a3 = a.mo1312a(C0126j.Toolbar_logo);
        if (a3 != null) {
            setLogo(a3);
        }
        CharSequence c4 = a.mo1317c(C0126j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c4)) {
            setLogoDescription(c4);
        }
        if (a.mo1323f(C0126j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo1314b(C0126j.Toolbar_titleTextColor, -1));
        }
        if (a.mo1323f(C0126j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo1314b(C0126j.Toolbar_subtitleTextColor, -1));
        }
        a.f1087b.recycle();
    }

    /* renamed from: a */
    private int m245a(int i) {
        int b = C0396gq.m1264b(this);
        int a = C0384gf.m1231a(i, b) & 7;
        return (a == 1 || a == 3 || a == 5) ? a : b == 1 ? 5 : 3;
    }

    /* renamed from: a */
    private int m246a(View view, int i) {
        C0083b bVar = (C0083b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = bVar.f924a & C0126j.AppCompatTheme_windowActionBarOverlay;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f515C & C0126j.AppCompatTheme_windowActionBarOverlay;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < bVar.topMargin) {
            i4 = bVar.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < bVar.bottomMargin) {
                i4 = Math.max(0, i4 - (bVar.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: a */
    private int m247a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m248a(View view, int i, int[] iArr, int i2) {
        C0083b bVar = (C0083b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m246a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + bVar.rightMargin;
    }

    /* renamed from: a */
    private static C0083b m249a(LayoutParams layoutParams) {
        return layoutParams instanceof C0083b ? new C0083b((C0083b) layoutParams) : layoutParams instanceof C0178a ? new C0083b((C0178a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0083b((MarginLayoutParams) layoutParams) : new C0083b(layoutParams);
    }

    /* renamed from: a */
    private void m250a(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m251a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        C0083b bVar = layoutParams == null ? new C0083b() : !checkLayoutParams(layoutParams) ? m249a(layoutParams) : (C0083b) layoutParams;
        bVar.f560b = 1;
        if (!z || this.f534g == null) {
            addView(view, bVar);
            return;
        }
        view.setLayoutParams(bVar);
        this.f541n.add(view);
    }

    /* renamed from: a */
    private void m252a(List<View> list, int i) {
        boolean z = C0396gq.m1264b(this) == 1;
        int childCount = getChildCount();
        int a = C0384gf.m1231a(i, C0396gq.m1264b(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0083b bVar = (C0083b) childAt.getLayoutParams();
                if (bVar.f560b == 0 && m253a(childAt) && m245a(bVar.f924a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0083b bVar2 = (C0083b) childAt2.getLayoutParams();
            if (bVar2.f560b == 0 && m253a(childAt2) && m245a(bVar2.f924a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private boolean m253a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private static int m254b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return (VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin) + (VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin);
    }

    /* renamed from: b */
    private int m255b(View view, int i, int[] iArr, int i2) {
        C0083b bVar = (C0083b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m246a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* renamed from: c */
    private static int m256c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: d */
    private boolean m257d(View view) {
        return view.getParent() == this || this.f541n.contains(view);
    }

    /* renamed from: e */
    protected static C0083b m258e() {
        return new C0083b();
    }

    /* renamed from: g */
    private void m259g() {
        if (this.f548u == null) {
            this.f548u = new C0157bn(getContext());
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0817z(getContext());
    }

    /* renamed from: h */
    private void m260h() {
        mo627d();
        if (this.f528a.f381a == null) {
            C0019aj ajVar = (C0019aj) this.f528a.getMenu();
            if (this.f544q == null) {
                this.f544q = new C0082a();
            }
            this.f528a.setExpandedActionViewsExclusive(true);
            ajVar.mo147a((C0101aq) this.f544q, this.f535h);
        }
    }

    /* renamed from: i */
    private void m261i() {
        if (this.f547t == null) {
            this.f547t = new C0155bl(getContext(), null, C0117a.toolbarNavigationButtonStyle);
            C0083b bVar = new C0083b();
            bVar.f924a = 8388611 | (this.f539l & C0126j.AppCompatTheme_windowActionBarOverlay);
            this.f547t.setLayoutParams(bVar);
        }
    }

    /* renamed from: a */
    public final boolean mo623a() {
        if (this.f528a != null) {
            ActionMenuView actionMenuView = this.f528a;
            if (actionMenuView.f383c != null && actionMenuView.f383c.mo890h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo624b() {
        if (this.f528a != null) {
            ActionMenuView actionMenuView = this.f528a;
            if (actionMenuView.f383c != null && actionMenuView.f383c.mo886d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo625c() {
        C0023al alVar = this.f544q == null ? null : this.f544q.f558b;
        if (alVar != null) {
            alVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0083b);
    }

    /* renamed from: d */
    public final void mo627d() {
        if (this.f528a == null) {
            this.f528a = new ActionMenuView(getContext());
            this.f528a.setPopupTheme(this.f536i);
            this.f528a.setOnMenuItemClickListener(this.f524L);
            this.f528a.mo472a(this.f545r, this.f546s);
            C0083b bVar = new C0083b();
            bVar.f924a = 8388613 | (this.f539l & C0126j.AppCompatTheme_windowActionBarOverlay);
            this.f528a.setLayoutParams(bVar);
            m251a((View) this.f528a, false);
        }
    }

    /* renamed from: f */
    public final void mo628f() {
        if (this.f540m == null) {
            this.f540m = new C0204ck();
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0083b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0083b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m249a(layoutParams);
    }

    public int getContentInsetEnd() {
        if (this.f540m == null) {
            return 0;
        }
        C0204ck ckVar = this.f540m;
        return ckVar.f1027g ? ckVar.f1021a : ckVar.f1022b;
    }

    public int getContentInsetEndWithActions() {
        return this.f514B != Integer.MIN_VALUE ? this.f514B : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        if (this.f540m != null) {
            return this.f540m.f1021a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f540m != null) {
            return this.f540m.f1022b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        if (this.f540m == null) {
            return 0;
        }
        C0204ck ckVar = this.f540m;
        return ckVar.f1027g ? ckVar.f1022b : ckVar.f1021a;
    }

    public int getContentInsetStartWithNavigation() {
        return this.f513A != Integer.MIN_VALUE ? this.f513A : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f528a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.widget.ActionMenuView r0 = r3.f528a
            aj r0 = r0.f381a
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f514B
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0396gq.m1264b(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0396gq.m1264b(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f513A, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        if (this.f548u != null) {
            return this.f548u.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        if (this.f548u != null) {
            return this.f548u.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m260h();
        return this.f528a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        if (this.f547t != null) {
            return this.f547t.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        if (this.f547t != null) {
            return this.f547t.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public C0127ba getOuterActionMenuPresenter() {
        return this.f543p;
    }

    public Drawable getOverflowIcon() {
        m260h();
        return this.f528a.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f535h;
    }

    public int getPopupTheme() {
        return this.f536i;
    }

    public CharSequence getSubtitle() {
        return this.f517E;
    }

    public CharSequence getTitle() {
        return this.f516D;
    }

    public int getTitleMarginBottom() {
        return this.f553z;
    }

    public int getTitleMarginEnd() {
        return this.f551x;
    }

    public int getTitleMarginStart() {
        return this.f550w;
    }

    public int getTitleMarginTop() {
        return this.f552y;
    }

    public C0180ca getWrapper() {
        if (this.f525M == null) {
            this.f525M = new C0216cs(this);
        }
        return this.f525M;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f527O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f521I = false;
        }
        if (!this.f521I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f521I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f521I = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02ab A[LOOP:0: B:101:0x02a9->B:102:0x02ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02cd A[LOOP:1: B:104:0x02cb->B:105:0x02cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f2 A[LOOP:2: B:107:0x02f0->B:108:0x02f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0342 A[LOOP:3: B:115:0x0340->B:116:0x0342, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            r24 = this;
            r0 = r24
            int r1 = p000.C0396gq.m1264b(r24)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r24.getWidth()
            int r5 = r24.getHeight()
            int r6 = r24.getPaddingLeft()
            int r7 = r24.getPaddingRight()
            int r8 = r24.getPaddingTop()
            int r9 = r24.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f523K
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p000.C0396gq.m1266c(r24)
            if (r12 < 0) goto L_0x003a
            int r13 = r29 - r27
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.f547t
            boolean r13 = r0.m253a(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004d
            android.widget.ImageButton r13 = r0.f547t
            int r13 = r0.m255b(r13, r10, r11, r12)
            r14 = r6
            goto L_0x0057
        L_0x004d:
            android.widget.ImageButton r13 = r0.f547t
            int r13 = r0.m248a(r13, r6, r11, r12)
            r14 = r13
            goto L_0x0056
        L_0x0055:
            r14 = r6
        L_0x0056:
            r13 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f533f
            boolean r15 = r0.m253a(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f533f
            int r13 = r0.m255b(r15, r13, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f533f
            int r14 = r0.m248a(r15, r14, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f528a
            boolean r15 = r0.m253a(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f528a
            int r14 = r0.m248a(r15, r14, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f528a
            int r13 = r0.m255b(r15, r13, r11, r12)
        L_0x0085:
            int r15 = r24.getCurrentContentInsetLeft()
            int r16 = r24.getCurrentContentInsetRight()
            int r2 = r15 - r14
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r13
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r14, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r13, r10)
            android.view.View r13 = r0.f534g
            boolean r13 = r0.m253a(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f534g
            int r10 = r0.m255b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f534g
            int r2 = r0.m248a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f548u
            boolean r13 = r0.m253a(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f548u
            int r10 = r0.m255b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f548u
            int r2 = r0.m248a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f529b
            boolean r13 = r0.m253a(r13)
            android.widget.TextView r14 = r0.f530c
            boolean r14 = r0.m253a(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f529b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r15 = (androidx.appcompat.widget.Toolbar.C0083b) r15
            int r3 = r15.topMargin
            r19 = r7
            android.widget.TextView r7 = r0.f529b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r19 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f530c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r7 = (androidx.appcompat.widget.Toolbar.C0083b) r7
            int r15 = r7.topMargin
            r20 = r4
            android.widget.TextView r4 = r0.f530c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r20 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0124
            goto L_0x012a
        L_0x0124:
            r21 = r6
            r22 = r12
            goto L_0x029b
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            android.widget.TextView r4 = r0.f529b
            goto L_0x0131
        L_0x012f:
            android.widget.TextView r4 = r0.f530c
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            android.widget.TextView r7 = r0.f530c
            goto L_0x0138
        L_0x0136:
            android.widget.TextView r7 = r0.f529b
        L_0x0138:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r4 = (androidx.appcompat.widget.Toolbar.C0083b) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r7 = (androidx.appcompat.widget.Toolbar.C0083b) r7
            if (r13 == 0) goto L_0x014e
            android.widget.TextView r15 = r0.f529b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0158
        L_0x014e:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f530c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0158:
            r21 = r6
            r15 = 1
            goto L_0x015f
        L_0x015c:
            r21 = r6
            r15 = 0
        L_0x015f:
            int r6 = r0.f515C
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a8
            r12 = 80
            if (r6 == r12) goto L_0x019c
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.f552y
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x0183
            int r2 = r4.topMargin
            int r3 = r0.f552y
            int r6 = r2 + r3
            goto L_0x019a
        L_0x0183:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f553z
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x019a
            int r2 = r7.bottomMargin
            int r3 = r0.f553z
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x019a:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x019c:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f553z
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a8:
            r23 = r2
            int r2 = r24.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f552y
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x022a
            if (r15 == 0) goto L_0x01bd
            int r3 = r0.f550w
            r1 = 1
            goto L_0x01bf
        L_0x01bd:
            r1 = 1
            r3 = 0
        L_0x01bf:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f5
            android.widget.TextView r1 = r0.f529b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r1 = (androidx.appcompat.widget.Toolbar.C0083b) r1
            android.widget.TextView r2 = r0.f529b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f529b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f529b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f551x
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f6
        L_0x01f5:
            r2 = r10
        L_0x01f6:
            if (r14 == 0) goto L_0x021e
            android.widget.TextView r1 = r0.f530c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r1 = (androidx.appcompat.widget.Toolbar.C0083b) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f530c
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f530c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f530c
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f551x
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x021f
        L_0x021e:
            r3 = r10
        L_0x021f:
            if (r15 == 0) goto L_0x0226
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0226:
            r2 = r23
            goto L_0x029b
        L_0x022a:
            if (r15 == 0) goto L_0x0232
            int r3 = r0.f550w
            r18 = r3
            r1 = 0
            goto L_0x0235
        L_0x0232:
            r1 = 0
            r18 = 0
        L_0x0235:
            r2 = r11[r1]
            int r2 = r18 - r2
            int r3 = java.lang.Math.max(r1, r2)
            int r3 = r23 + r3
            int r2 = -r2
            int r2 = java.lang.Math.max(r1, r2)
            r11[r1] = r2
            if (r13 == 0) goto L_0x026b
            android.widget.TextView r1 = r0.f529b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r1 = (androidx.appcompat.widget.Toolbar.C0083b) r1
            android.widget.TextView r2 = r0.f529b
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f529b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f529b
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f551x
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x026c
        L_0x026b:
            r2 = r3
        L_0x026c:
            if (r14 == 0) goto L_0x0292
            android.widget.TextView r1 = r0.f530c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r1 = (androidx.appcompat.widget.Toolbar.C0083b) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f530c
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f530c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f530c
            r6.layout(r3, r8, r4, r5)
            int r5 = r0.f551x
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0293
        L_0x0292:
            r4 = r3
        L_0x0293:
            if (r15 == 0) goto L_0x029a
            int r2 = java.lang.Math.max(r2, r4)
            goto L_0x029b
        L_0x029a:
            r2 = r3
        L_0x029b:
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            r3 = 3
            r0.m252a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a9:
            if (r2 >= r1) goto L_0x02bc
            java.util.ArrayList<android.view.View> r4 = r0.f522J
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m248a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a9
        L_0x02bc:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            r2 = 5
            r0.m252a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            int r1 = r1.size()
            r2 = 0
        L_0x02cb:
            if (r2 >= r1) goto L_0x02dc
            java.util.ArrayList<android.view.View> r4 = r0.f522J
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m255b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02cb
        L_0x02dc:
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            r2 = 1
            r0.m252a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r6 = r2
            r2 = 0
            r7 = 0
        L_0x02f0:
            if (r2 >= r4) goto L_0x0323
            java.lang.Object r8 = r1.get(r2)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$b r9 = (androidx.appcompat.widget.Toolbar.C0083b) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r5
            int r5 = r9.rightMargin
            int r5 = r5 - r6
            r6 = 0
            int r9 = java.lang.Math.max(r6, r13)
            int r14 = java.lang.Math.max(r6, r5)
            int r13 = -r13
            int r13 = java.lang.Math.max(r6, r13)
            int r5 = -r5
            int r5 = java.lang.Math.max(r6, r5)
            int r8 = r8.getMeasuredWidth()
            int r9 = r9 + r8
            int r9 = r9 + r14
            int r7 = r7 + r9
            int r2 = r2 + 1
            r6 = r5
            r5 = r13
            goto L_0x02f0
        L_0x0323:
            r6 = 0
            int r4 = r20 - r21
            int r4 = r4 - r19
            int r4 = r4 / 2
            int r1 = r21 + r4
            int r2 = r7 / 2
            int r1 = r1 - r2
            int r7 = r7 + r1
            if (r1 >= r3) goto L_0x0333
            goto L_0x033a
        L_0x0333:
            if (r7 <= r10) goto L_0x0339
            int r7 = r7 - r10
            int r3 = r1 - r7
            goto L_0x033a
        L_0x0339:
            r3 = r1
        L_0x033a:
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            int r1 = r1.size()
        L_0x0340:
            if (r6 >= r1) goto L_0x0351
            java.util.ArrayList<android.view.View> r2 = r0.f522J
            java.lang.Object r2 = r2.get(r6)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m248a(r2, r3, r11, r12)
            int r6 = r6 + 1
            goto L_0x0340
        L_0x0351:
            java.util.ArrayList<android.view.View> r1 = r0.f522J
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int[] iArr = this.f523K;
        if (C0225cx.m739a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m253a((View) this.f547t)) {
            m250a(this.f547t, i, 0, i2, this.f549v);
            i5 = this.f547t.getMeasuredWidth() + m254b(this.f547t);
            i4 = Math.max(0, this.f547t.getMeasuredHeight() + m256c(this.f547t));
            i3 = View.combineMeasuredStates(0, this.f547t.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m253a((View) this.f533f)) {
            m250a(this.f533f, i, 0, i2, this.f549v);
            i5 = this.f533f.getMeasuredWidth() + m254b(this.f533f);
            i4 = Math.max(i4, this.f533f.getMeasuredHeight() + m256c(this.f533f));
            i3 = View.combineMeasuredStates(i3, this.f533f.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m253a((View) this.f528a)) {
            m250a(this.f528a, i, max, i2, this.f549v);
            i6 = this.f528a.getMeasuredWidth() + m254b(this.f528a);
            i4 = Math.max(i4, this.f528a.getMeasuredHeight() + m256c(this.f528a));
            i3 = View.combineMeasuredStates(i3, this.f528a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m253a(this.f534g)) {
            max2 += m247a(this.f534g, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f534g.getMeasuredHeight() + m256c(this.f534g));
            i3 = View.combineMeasuredStates(i3, this.f534g.getMeasuredState());
        }
        if (m253a((View) this.f548u)) {
            max2 += m247a(this.f548u, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f548u.getMeasuredHeight() + m256c(this.f548u));
            i3 = View.combineMeasuredStates(i3, this.f548u.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0083b) childAt.getLayoutParams()).f560b == 0 && m253a(childAt)) {
                View view = childAt;
                max2 += m247a(childAt, i, max2, i2, 0, iArr);
                i10 = Math.max(i10, view.getMeasuredHeight() + m256c(view));
                i3 = View.combineMeasuredStates(i3, view.getMeasuredState());
            }
        }
        int i12 = this.f552y + this.f553z;
        int i13 = this.f550w + this.f551x;
        if (m253a((View) this.f529b)) {
            m247a(this.f529b, i, max2 + i13, i2, i12, iArr);
            int measuredHeight = this.f529b.getMeasuredHeight() + m256c(this.f529b);
            i8 = this.f529b.getMeasuredWidth() + m254b(this.f529b);
            i9 = View.combineMeasuredStates(i3, this.f529b.getMeasuredState());
            i7 = measuredHeight;
        } else {
            i8 = 0;
            i9 = i3;
            i7 = 0;
        }
        if (m253a((View) this.f530c)) {
            int i14 = i7 + i12;
            int i15 = i9;
            i8 = Math.max(i8, m247a(this.f530c, i, max2 + i13, i2, i14, iArr));
            i7 += this.f530c.getMeasuredHeight() + m256c(this.f530c);
            i9 = View.combineMeasuredStates(i15, this.f530c.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int i17 = max2 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i18 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i17 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i18, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f526N) {
            int childCount2 = getChildCount();
            int i19 = 0;
            while (true) {
                if (i19 >= childCount2) {
                    z = true;
                    break;
                }
                View childAt2 = getChildAt(i19);
                if (m253a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i19++;
            }
        }
        z = false;
        if (z) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0085d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0085d dVar = (C0085d) parcelable;
        super.onRestoreInstanceState(dVar.f1909d);
        C0019aj ajVar = this.f528a != null ? this.f528a.f381a : null;
        if (!(dVar.f561a == 0 || this.f544q == null || ajVar == null)) {
            MenuItem findItem = ajVar.findItem(dVar.f561a);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (dVar.f562b) {
            removeCallbacks(this.f527O);
            post(this.f527O);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        mo628f();
        C0204ck ckVar = this.f540m;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != ckVar.f1027g) {
            ckVar.f1027g = z;
            if (!ckVar.f1028h) {
                ckVar.f1021a = ckVar.f1025e;
                ckVar.f1022b = ckVar.f1026f;
            } else if (z) {
                ckVar.f1021a = ckVar.f1024d != Integer.MIN_VALUE ? ckVar.f1024d : ckVar.f1025e;
                ckVar.f1022b = ckVar.f1023c != Integer.MIN_VALUE ? ckVar.f1023c : ckVar.f1026f;
            } else {
                ckVar.f1021a = ckVar.f1023c != Integer.MIN_VALUE ? ckVar.f1023c : ckVar.f1025e;
                ckVar.f1022b = ckVar.f1024d != Integer.MIN_VALUE ? ckVar.f1024d : ckVar.f1026f;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0085d dVar = new C0085d(super.onSaveInstanceState());
        if (!(this.f544q == null || this.f544q.f558b == null)) {
            dVar.f561a = this.f544q.f558b.getItemId();
        }
        dVar.f562b = mo623a();
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f520H = false;
        }
        if (!this.f520H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f520H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f520H = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f526N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f514B) {
            this.f514B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f513A) {
            this.f513A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0785o.m2608b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m259g();
            if (!m257d(this.f548u)) {
                m251a((View) this.f548u, true);
            }
        } else if (this.f548u != null && m257d(this.f548u)) {
            removeView(this.f548u);
            this.f541n.remove(this.f548u);
        }
        if (this.f548u != null) {
            this.f548u.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m259g();
        }
        if (this.f548u != null) {
            this.f548u.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m261i();
        }
        if (this.f547t != null) {
            this.f547t.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0785o.m2608b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m261i();
            if (!m257d(this.f547t)) {
                m251a((View) this.f547t, true);
            }
        } else if (this.f547t != null && m257d(this.f547t)) {
            removeView(this.f547t);
            this.f541n.remove(this.f547t);
        }
        if (this.f547t != null) {
            this.f547t.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m261i();
        this.f547t.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0084c cVar) {
        this.f542o = cVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m260h();
        this.f528a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f536i != i) {
            this.f536i = i;
            if (i == 0) {
                this.f535h = getContext();
                return;
            }
            this.f535h = new ContextThemeWrapper(getContext(), i);
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f530c == null) {
                Context context = getContext();
                this.f530c = new C0174bx(context);
                this.f530c.setSingleLine();
                this.f530c.setEllipsize(TruncateAt.END);
                if (this.f538k != 0) {
                    this.f530c.setTextAppearance(context, this.f538k);
                }
                if (this.f519G != 0) {
                    this.f530c.setTextColor(this.f519G);
                }
            }
            if (!m257d(this.f530c)) {
                m251a((View) this.f530c, true);
            }
        } else if (this.f530c != null && m257d(this.f530c)) {
            removeView(this.f530c);
            this.f541n.remove(this.f530c);
        }
        if (this.f530c != null) {
            this.f530c.setText(charSequence);
        }
        this.f517E = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f519G = i;
        if (this.f530c != null) {
            this.f530c.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f529b == null) {
                Context context = getContext();
                this.f529b = new C0174bx(context);
                this.f529b.setSingleLine();
                this.f529b.setEllipsize(TruncateAt.END);
                if (this.f537j != 0) {
                    this.f529b.setTextAppearance(context, this.f537j);
                }
                if (this.f518F != 0) {
                    this.f529b.setTextColor(this.f518F);
                }
            }
            if (!m257d(this.f529b)) {
                m251a((View) this.f529b, true);
            }
        } else if (this.f529b != null && m257d(this.f529b)) {
            removeView(this.f529b);
            this.f541n.remove(this.f529b);
        }
        if (this.f529b != null) {
            this.f529b.setText(charSequence);
        }
        this.f516D = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f553z = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f551x = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f550w = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f552y = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f518F = i;
        if (this.f529b != null) {
            this.f529b.setTextColor(i);
        }
    }
}
