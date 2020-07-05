package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: cl */
public final class C0205cl extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: i */
    private static final Interpolator f1029i = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1030a;

    /* renamed from: b */
    C0190cf f1031b;

    /* renamed from: c */
    int f1032c;

    /* renamed from: d */
    int f1033d;

    /* renamed from: e */
    int f1034e;

    /* renamed from: f */
    private Spinner f1035f;

    /* renamed from: g */
    private boolean f1036g;

    /* renamed from: h */
    private int f1037h;

    /* renamed from: cl$a */
    class C0207a extends BaseAdapter {
        C0207a() {
        }

        public final int getCount() {
            return C0205cl.this.f1031b.getChildCount();
        }

        public final Object getItem(int i) {
            return ((C0208b) C0205cl.this.f1031b.getChildAt(i)).f1041a;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0205cl clVar = C0205cl.this;
                C0208b bVar = new C0208b(clVar.getContext(), (C0179b) getItem(i));
                bVar.setBackgroundDrawable(null);
                bVar.setLayoutParams(new LayoutParams(-1, clVar.f1034e));
                return bVar;
            }
            C0208b bVar2 = (C0208b) view;
            bVar2.f1041a = (C0179b) getItem(i);
            bVar2.mo1290a();
            return view;
        }
    }

    /* renamed from: cl$b */
    class C0208b extends LinearLayout {

        /* renamed from: a */
        C0179b f1041a;

        /* renamed from: c */
        private final int[] f1043c = {16842964};

        /* renamed from: d */
        private TextView f1044d;

        /* renamed from: e */
        private ImageView f1045e;

        /* renamed from: f */
        private View f1046f;

        public C0208b(Context context, C0179b bVar) {
            super(context, null, C0117a.actionBarTabStyle);
            this.f1041a = bVar;
            C0215cr a = C0215cr.m676a(context, null, this.f1043c, C0117a.actionBarTabStyle, 0);
            if (a.mo1323f(0)) {
                setBackgroundDrawable(a.mo1312a(0));
            }
            a.f1087b.recycle();
            setGravity(8388627);
            mo1290a();
        }

        /* renamed from: a */
        public final void mo1290a() {
            C0179b bVar = this.f1041a;
            View c = bVar.mo1126c();
            CharSequence charSequence = null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f1046f = c;
                if (this.f1044d != null) {
                    this.f1044d.setVisibility(8);
                }
                if (this.f1045e != null) {
                    this.f1045e.setVisibility(8);
                    this.f1045e.setImageDrawable(null);
                }
                return;
            }
            if (this.f1046f != null) {
                removeView(this.f1046f);
                this.f1046f = null;
            }
            Drawable a = bVar.mo1124a();
            CharSequence b = bVar.mo1125b();
            if (a != null) {
                if (this.f1045e == null) {
                    C0157bn bnVar = new C0157bn(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    bnVar.setLayoutParams(layoutParams);
                    addView(bnVar, 0);
                    this.f1045e = bnVar;
                }
                this.f1045e.setImageDrawable(a);
                this.f1045e.setVisibility(0);
            } else if (this.f1045e != null) {
                this.f1045e.setVisibility(8);
                this.f1045e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f1044d == null) {
                    C0174bx bxVar = new C0174bx(getContext(), null, C0117a.actionBarTabTextStyle);
                    bxVar.setEllipsize(TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    bxVar.setLayoutParams(layoutParams2);
                    addView(bxVar);
                    this.f1044d = bxVar;
                }
                this.f1044d.setText(b);
                this.f1044d.setVisibility(0);
            } else if (this.f1044d != null) {
                this.f1044d.setVisibility(8);
                this.f1044d.setText(null);
            }
            if (this.f1045e != null) {
                this.f1045e.setContentDescription(bVar.mo1127d());
            }
            if (!z) {
                charSequence = bVar.mo1127d();
            }
            C0219ct.m728a(this, charSequence);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0179b.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0179b.class.getName());
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0205cl.this.f1032c > 0 && getMeasuredWidth() > C0205cl.this.f1032c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(C0205cl.this.f1032c, 1073741824), i2);
            }
        }

        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    private boolean m650a() {
        return this.f1035f != null && this.f1035f.getParent() == this;
    }

    /* renamed from: b */
    private boolean m651b() {
        if (!m650a()) {
            return false;
        }
        removeView(this.f1035f);
        addView(this.f1031b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1035f.getSelectedItemPosition());
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1030a != null) {
            post(this.f1030a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0801t a = C0801t.m2659a(getContext());
        TypedArray obtainStyledAttributes = a.f3390a.obtainStyledAttributes(null, C0126j.ActionBar, C0117a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0126j.ActionBar_height, 0);
        Resources resources = a.f3390a.getResources();
        if (!a.mo2804b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0120d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1033d = a.f3390a.getResources().getDimensionPixelSize(C0120d.abc_action_bar_stacked_tab_max_width);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1030a != null) {
            removeCallbacks(this.f1030a);
        }
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1031b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1032c = -1;
        } else {
            if (childCount > 2) {
                this.f1032c = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1032c = MeasureSpec.getSize(i) / 2;
            }
            this.f1032c = Math.min(this.f1032c, this.f1033d);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1034e, 1073741824);
        if (z2 || !this.f1036g) {
            z = false;
        }
        if (z) {
            this.f1031b.measure(0, makeMeasureSpec);
            if (this.f1031b.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                if (!m650a()) {
                    if (this.f1035f == null) {
                        C0165bv bvVar = new C0165bv(getContext(), null, C0117a.actionDropDownStyle);
                        bvVar.setLayoutParams(new C0191a(-2, -1));
                        bvVar.setOnItemSelectedListener(this);
                        this.f1035f = bvVar;
                    }
                    removeView(this.f1031b);
                    addView(this.f1035f, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f1035f.getAdapter() == null) {
                        this.f1035f.setAdapter(new C0207a());
                    }
                    if (this.f1030a != null) {
                        removeCallbacks(this.f1030a);
                        this.f1030a = null;
                    }
                    this.f1035f.setSelection(this.f1037h);
                }
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f1037h);
                    return;
                }
            }
        }
        m651b();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public final void setAllowCollapse(boolean z) {
        this.f1036g = z;
    }

    public final void setContentHeight(int i) {
        this.f1034e = i;
        requestLayout();
    }

    public final void setTabSelected(int i) {
        this.f1037h = i;
        int childCount = this.f1031b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1031b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.f1031b.getChildAt(i);
                if (this.f1030a != null) {
                    removeCallbacks(this.f1030a);
                }
                this.f1030a = new Runnable() {
                    public final void run() {
                        C0205cl.this.smoothScrollTo(childAt2.getLeft() - ((C0205cl.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        C0205cl.this.f1030a = null;
                    }
                };
                post(this.f1030a);
            }
            i2++;
        }
        if (this.f1035f != null && i >= 0) {
            this.f1035f.setSelection(i);
        }
    }
}
