package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: bv */
public final class C0165bv extends Spinner implements C0395gp {

    /* renamed from: d */
    private static final int[] f874d = {16843505};

    /* renamed from: a */
    C0168b f875a;

    /* renamed from: b */
    int f876b;

    /* renamed from: c */
    final Rect f877c;

    /* renamed from: e */
    private final C0142bd f878e;

    /* renamed from: f */
    private final Context f879f;

    /* renamed from: g */
    private C0187ce f880g;

    /* renamed from: h */
    private SpinnerAdapter f881h;

    /* renamed from: i */
    private final boolean f882i;

    /* renamed from: bv$a */
    static class C0167a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f885a;

        /* renamed from: b */
        private ListAdapter f886b;

        public C0167a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f885a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f886b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f886b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            if (this.f885a == null) {
                return 0;
            }
            return this.f885a.getCount();
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f885a == null) {
                return null;
            }
            return this.f885a.getDropDownView(i, view, viewGroup);
        }

        public final Object getItem(int i) {
            if (this.f885a == null) {
                return null;
            }
            return this.f885a.getItem(i);
        }

        public final long getItemId(int i) {
            if (this.f885a == null) {
                return -1;
            }
            return this.f885a.getItemId(i);
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            return this.f885a != null && this.f885a.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f886b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f885a != null) {
                this.f885a.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f885a != null) {
                this.f885a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: bv$b */
    class C0168b extends C0192cg {

        /* renamed from: a */
        CharSequence f887a;

        /* renamed from: b */
        ListAdapter f888b;

        /* renamed from: c */
        final Rect f889c = new Rect();

        public C0168b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f993m = C0165bv.this;
            mo1214f();
            this.f992l = 0;
            this.f994n = new OnItemClickListener(C0165bv.this) {
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C0165bv.this.setSelection(i);
                    if (C0165bv.this.getOnItemClickListener() != null) {
                        C0165bv.this.performItemClick(view, i, C0168b.this.f888b.getItemId(i));
                    }
                    C0168b.this.mo114c();
                }
            };
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1060a() {
            int i;
            Drawable background = this.f999s.getBackground();
            int i2 = 0;
            if (background != null) {
                background.getPadding(C0165bv.this.f877c);
                i2 = C0225cx.m739a(C0165bv.this) ? C0165bv.this.f877c.right : -C0165bv.this.f877c.left;
            } else {
                Rect rect = C0165bv.this.f877c;
                C0165bv.this.f877c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C0165bv.this.getPaddingLeft();
            int paddingRight = C0165bv.this.getPaddingRight();
            int width = C0165bv.this.getWidth();
            if (C0165bv.this.f876b == -2) {
                int a = C0165bv.this.mo1025a((SpinnerAdapter) this.f888b, this.f999s.getBackground());
                int i3 = (C0165bv.this.getContext().getResources().getDisplayMetrics().widthPixels - C0165bv.this.f877c.left) - C0165bv.this.f877c.right;
                if (a > i3) {
                    a = i3;
                }
                i = Math.max(a, (width - paddingLeft) - paddingRight);
            } else {
                i = C0165bv.this.f876b == -1 ? (width - paddingLeft) - paddingRight : C0165bv.this.f876b;
            }
            mo1213b(i);
            this.f987g = C0225cx.m739a(C0165bv.this) ? i2 + ((width - paddingRight) - this.f986f) : i2 + paddingLeft;
        }

        /* renamed from: a */
        public final void mo1061a(ListAdapter listAdapter) {
            super.mo1061a(listAdapter);
            this.f888b = listAdapter;
        }

        /* renamed from: b */
        public final void mo111b() {
            boolean isShowing = this.f999s.isShowing();
            mo1060a();
            mo1216h();
            super.mo111b();
            this.f985e.setChoiceMode(1);
            int selectedItemPosition = C0165bv.this.getSelectedItemPosition();
            C0182cc ccVar = this.f985e;
            if (this.f999s.isShowing() && ccVar != null) {
                ccVar.setListSelectionHidden(false);
                ccVar.setSelection(selectedItemPosition);
                if (ccVar.getChoiceMode() != 0) {
                    ccVar.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!isShowing) {
                ViewTreeObserver viewTreeObserver = C0165bv.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final C01702 r1 = new OnGlobalLayoutListener() {
                        public final void onGlobalLayout() {
                            C0168b bVar = C0168b.this;
                            C0165bv bvVar = C0165bv.this;
                            if (!(C0396gq.m1276m(bvVar) && bvVar.getGlobalVisibleRect(bVar.f889c))) {
                                C0168b.this.mo114c();
                                return;
                            }
                            C0168b.this.mo1060a();
                            C0168b.super.mo111b();
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(r1);
                    mo1212a((OnDismissListener) new OnDismissListener() {
                        public final void onDismiss() {
                            ViewTreeObserver viewTreeObserver = C0165bv.this.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(r1);
                            }
                        }
                    });
                }
            }
        }
    }

    public C0165bv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.spinnerStyle);
    }

    public C0165bv(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private C0165bv(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r2 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r2 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r12 != 1) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r12 = new p000.C0165bv.C0168b(r8, r8.f879f, r10, r11);
        r1 = p000.C0215cr.m676a(r8.f879f, r10, p000.C0116b.C0126j.Spinner, r11, 0);
        r8.f876b = r1.mo1322f(p000.C0116b.C0126j.Spinner_android_dropDownWidth, -2);
        r12.mo1211a(r1.mo1312a(p000.C0116b.C0126j.Spinner_android_popupBackground));
        r12.f887a = r0.mo1319d(p000.C0116b.C0126j.Spinner_android_prompt);
        r1.f1087b.recycle();
        r8.f875a = r12;
        r8.f880g = new p000.C0165bv.C01661(r8, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0165bv(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f877c = r0
            int[] r0 = p000.C0116b.C0126j.Spinner
            r1 = 0
            cr r0 = p000.C0215cr.m676a(r9, r10, r0, r11, r1)
            bd r2 = new bd
            r2.<init>(r8)
            r8.f878e = r2
            int r2 = p000.C0116b.C0126j.Spinner_popupTheme
            int r2 = r0.mo1324g(r2, r1)
            r3 = 0
            if (r2 == 0) goto L_0x0027
            w r4 = new w
            r4.<init>(r9, r2)
            goto L_0x0030
        L_0x0027:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 >= r4) goto L_0x002f
            r4 = r9
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            r8.f879f = r4
            android.content.Context r2 = r8.f879f
            r4 = 1
            if (r2 == 0) goto L_0x00a0
            int[] r2 = f874d     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r2, r11, r1)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            boolean r5 = r2.hasValue(r1)     // Catch:{ Exception -> 0x004e }
            if (r5 == 0) goto L_0x0048
            int r5 = r2.getInt(r1, r1)     // Catch:{ Exception -> 0x004e }
            r12 = r5
        L_0x0048:
            if (r2 == 0) goto L_0x005f
        L_0x004a:
            r2.recycle()
            goto L_0x005f
        L_0x004e:
            r5 = move-exception
            goto L_0x0055
        L_0x0050:
            r9 = move-exception
            r2 = r3
            goto L_0x009a
        L_0x0053:
            r5 = move-exception
            r2 = r3
        L_0x0055:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x005f
            goto L_0x004a
        L_0x005f:
            if (r12 != r4) goto L_0x00a0
            bv$b r12 = new bv$b
            android.content.Context r2 = r8.f879f
            r12.<init>(r2, r10, r11)
            android.content.Context r2 = r8.f879f
            int[] r5 = p000.C0116b.C0126j.Spinner
            cr r1 = p000.C0215cr.m676a(r2, r10, r5, r11, r1)
            int r2 = p000.C0116b.C0126j.Spinner_android_dropDownWidth
            r5 = -2
            int r2 = r1.mo1322f(r2, r5)
            r8.f876b = r2
            int r2 = p000.C0116b.C0126j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r2 = r1.mo1312a(r2)
            r12.mo1211a(r2)
            int r2 = p000.C0116b.C0126j.Spinner_android_prompt
            java.lang.String r2 = r0.mo1319d(r2)
            r12.f887a = r2
            android.content.res.TypedArray r1 = r1.f1087b
            r1.recycle()
            r8.f875a = r12
            bv$1 r1 = new bv$1
            r1.<init>(r8, r12)
            r8.f880g = r1
            goto L_0x00a0
        L_0x0099:
            r9 = move-exception
        L_0x009a:
            if (r2 == 0) goto L_0x009f
            r2.recycle()
        L_0x009f:
            throw r9
        L_0x00a0:
            int r12 = p000.C0116b.C0126j.Spinner_android_entries
            android.content.res.TypedArray r1 = r0.f1087b
            java.lang.CharSequence[] r12 = r1.getTextArray(r12)
            if (r12 == 0) goto L_0x00ba
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r9, r2, r12)
            int r9 = p000.C0116b.C0123g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r9)
            r8.setAdapter(r1)
        L_0x00ba:
            android.content.res.TypedArray r9 = r0.f1087b
            r9.recycle()
            r8.f882i = r4
            android.widget.SpinnerAdapter r9 = r8.f881h
            if (r9 == 0) goto L_0x00cc
            android.widget.SpinnerAdapter r9 = r8.f881h
            r8.setAdapter(r9)
            r8.f881h = r3
        L_0x00cc:
            bd r9 = r8.f878e
            r9.mo925a(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0165bv.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo1025a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i2 = 0;
        View view = null;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f877c);
            i2 += this.f877c.left + this.f877c.right;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f878e != null) {
            this.f878e.mo928d();
        }
    }

    public final int getDropDownHorizontalOffset() {
        if (this.f875a != null) {
            return this.f875a.f987g;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public final int getDropDownVerticalOffset() {
        if (this.f875a != null) {
            return this.f875a.mo1215g();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public final int getDropDownWidth() {
        if (this.f875a != null) {
            return this.f876b;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final Drawable getPopupBackground() {
        if (this.f875a != null) {
            return this.f875a.f999s.getBackground();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public final Context getPopupContext() {
        if (this.f875a != null) {
            return this.f879f;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public final CharSequence getPrompt() {
        return this.f875a != null ? this.f875a.f887a : super.getPrompt();
    }

    public final ColorStateList getSupportBackgroundTintList() {
        if (this.f878e != null) {
            return this.f878e.mo926b();
        }
        return null;
    }

    public final Mode getSupportBackgroundTintMode() {
        if (this.f878e != null) {
            return this.f878e.mo927c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f875a != null && this.f875a.f999s.isShowing()) {
            this.f875a.mo114c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f875a != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1025a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f880g == null || !this.f880g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        if (this.f875a == null) {
            return super.performClick();
        }
        if (!this.f875a.f999s.isShowing()) {
            this.f875a.mo111b();
        }
        return true;
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f882i) {
            this.f881h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f875a != null) {
            this.f875a.mo1061a((ListAdapter) new C0167a(spinnerAdapter, (this.f879f == null ? getContext() : this.f879f).getTheme()));
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f878e != null) {
            this.f878e.mo921a();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f878e != null) {
            this.f878e.mo922a(i);
        }
    }

    public final void setDropDownHorizontalOffset(int i) {
        if (this.f875a != null) {
            this.f875a.f987g = i;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public final void setDropDownVerticalOffset(int i) {
        if (this.f875a != null) {
            this.f875a.mo1210a(i);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public final void setDropDownWidth(int i) {
        if (this.f875a != null) {
            this.f876b = i;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f875a != null) {
            this.f875a.mo1211a(drawable);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0785o.m2608b(getPopupContext(), i));
    }

    public final void setPrompt(CharSequence charSequence) {
        if (this.f875a != null) {
            this.f875a.f887a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f878e != null) {
            this.f878e.mo923a(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (this.f878e != null) {
            this.f878e.mo924a(mode);
        }
    }
}
