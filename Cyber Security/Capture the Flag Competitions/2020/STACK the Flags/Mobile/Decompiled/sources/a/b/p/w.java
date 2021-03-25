package a.b.p;

import a.b.j;
import a.b.k.c;
import a.b.o.j.p;
import a.h.m.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class w extends Spinner {
    public static final int[] j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final e f429b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f430c;

    /* renamed from: d  reason: collision with root package name */
    public h0 f431d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f432e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f433f;

    /* renamed from: g  reason: collision with root package name */
    public g f434g;
    public int h;
    public final Rect i;

    public interface g {
        void a(int i);

        boolean b();

        int c();

        void d(int i, int i2);

        void dismiss();

        int g();

        Drawable i();

        CharSequence j();

        void l(CharSequence charSequence);

        void m(Drawable drawable);

        void n(int i);

        void o(ListAdapter listAdapter);

        void p(int i);
    }

    public w(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.a.spinnerStyle);
    }

    public w(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }

    public w(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        this(context, attrs, defStyleAttr, mode, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (0 == 0) goto L_0x006a;
     */
    public w(Context context, AttributeSet attrs, int defStyleAttr, int mode, Resources.Theme popupTheme) {
        super(context, attrs, defStyleAttr);
        this.i = new Rect();
        r0.a(this, getContext());
        w0 a2 = w0.u(context, attrs, j.Spinner, defStyleAttr, 0);
        this.f429b = new e(this);
        if (popupTheme != null) {
            this.f430c = new a.b.o.d(context, popupTheme);
        } else {
            int popupThemeResId = a2.m(j.Spinner_popupTheme, 0);
            if (popupThemeResId != 0) {
                this.f430c = new a.b.o.d(context, popupThemeResId);
            } else {
                this.f430c = context;
            }
        }
        if (mode == -1) {
            TypedArray aa = null;
            try {
                aa = context.obtainStyledAttributes(attrs, j, defStyleAttr, 0);
                if (aa.hasValue(0)) {
                    mode = aa.getInt(0, 0);
                }
            } catch (Exception e2) {
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e2);
            } catch (Throwable th) {
                if (0 != 0) {
                    aa.recycle();
                }
                throw th;
            }
            aa.recycle();
        }
        if (mode == 0) {
            c cVar = new c();
            this.f434g = cVar;
            cVar.l(a2.n(j.Spinner_android_prompt));
        } else if (mode == 1) {
            e popup = new e(this.f430c, attrs, defStyleAttr);
            w0 pa = w0.u(this.f430c, attrs, j.Spinner, defStyleAttr, 0);
            this.h = pa.l(j.Spinner_android_dropDownWidth, -2);
            popup.m(pa.f(j.Spinner_android_popupBackground));
            popup.l(a2.n(j.Spinner_android_prompt));
            pa.v();
            this.f434g = popup;
            this.f431d = new a(this, popup);
        }
        CharSequence[] entries = a2.p(j.Spinner_android_entries);
        if (entries != null) {
            ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(context, 17367048, entries);
            adapter.setDropDownViewResource(a.b.g.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) adapter);
        }
        a2.v();
        this.f433f = true;
        SpinnerAdapter spinnerAdapter = this.f432e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f432e = null;
        }
        this.f429b.e(attrs, defStyleAttr);
    }

    public class a extends h0 {
        public final /* synthetic */ e k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View src, e eVar) {
            super(src);
            this.k = eVar;
        }

        @Override // a.b.p.h0
        public p b() {
            return this.k;
        }

        @Override // a.b.p.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (w.this.getInternalPopup().b()) {
                return true;
            }
            w.this.b();
            return true;
        }
    }

    public Context getPopupContext() {
        return this.f430c;
    }

    public void setPopupBackgroundDrawable(Drawable background) {
        g gVar = this.f434g;
        if (gVar != null) {
            gVar.m(background);
        } else {
            super.setPopupBackgroundDrawable(background);
        }
    }

    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(a.b.l.a.a.d(getPopupContext(), resId));
    }

    public Drawable getPopupBackground() {
        g gVar = this.f434g;
        if (gVar != null) {
            return gVar.i();
        }
        return super.getPopupBackground();
    }

    public void setDropDownVerticalOffset(int pixels) {
        g gVar = this.f434g;
        if (gVar != null) {
            gVar.n(pixels);
        } else {
            super.setDropDownVerticalOffset(pixels);
        }
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f434g;
        if (gVar != null) {
            return gVar.g();
        }
        return super.getDropDownVerticalOffset();
    }

    public void setDropDownHorizontalOffset(int pixels) {
        g gVar = this.f434g;
        if (gVar != null) {
            gVar.p(pixels);
            this.f434g.a(pixels);
            return;
        }
        super.setDropDownHorizontalOffset(pixels);
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f434g;
        if (gVar != null) {
            return gVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    public void setDropDownWidth(int pixels) {
        if (this.f434g != null) {
            this.h = pixels;
        } else {
            super.setDropDownWidth(pixels);
        }
    }

    public int getDropDownWidth() {
        if (this.f434g != null) {
            return this.h;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.AbsSpinner, android.widget.Spinner
    public void setAdapter(SpinnerAdapter adapter) {
        if (!this.f433f) {
            this.f432e = adapter;
            return;
        }
        super.setAdapter(adapter);
        if (this.f434g != null) {
            Context popupContext = this.f430c;
            if (popupContext == null) {
                popupContext = getContext();
            }
            this.f434g.o(new d(adapter, popupContext.getTheme()));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f434g;
        if (gVar != null && gVar.b()) {
            this.f434g.dismiss();
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        h0 h0Var = this.f431d;
        if (h0Var == null || !h0Var.onTouch(this, event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f434g != null && View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        g gVar = this.f434g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setPrompt(CharSequence prompt) {
        g gVar = this.f434g;
        if (gVar != null) {
            gVar.l(prompt);
        } else {
            super.setPrompt(prompt);
        }
    }

    public CharSequence getPrompt() {
        g gVar = this.f434g;
        return gVar != null ? gVar.j() : super.getPrompt();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        e eVar = this.f429b;
        if (eVar != null) {
            eVar.g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        e eVar = this.f429b;
        if (eVar != null) {
            eVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        e eVar = this.f429b;
        if (eVar != null) {
            eVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f429b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        e eVar = this.f429b;
        if (eVar != null) {
            eVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f429b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f429b;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int a(SpinnerAdapter adapter, Drawable background) {
        if (adapter == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int start = Math.max(0, getSelectedItemPosition());
        int end = Math.min(adapter.getCount(), start + 15);
        for (int i2 = Math.max(0, start - (15 - (end - start))); i2 < end; i2++) {
            int positionType = adapter.getItemViewType(i2);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i2, itemView, this);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background == null) {
            return width;
        }
        background.getPadding(this.i);
        Rect rect = this.i;
        return width + rect.left + rect.right;
    }

    public final g getInternalPopup() {
        return this.f434g;
    }

    public void b() {
        this.f434g.d(getTextDirection(), getTextAlignment());
    }

    public Parcelable onSaveInstanceState() {
        f ss = new f(super.onSaveInstanceState());
        g gVar = this.f434g;
        ss.f446b = gVar != null && gVar.b();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        ViewTreeObserver vto;
        f ss = (f) state;
        super.onRestoreInstanceState(ss.getSuperState());
        if (ss.f446b && (vto = getViewTreeObserver()) != null) {
            vto.addOnGlobalLayoutListener(new b());
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().b()) {
                w.this.b();
            }
            ViewTreeObserver vto = w.this.getViewTreeObserver();
            if (vto != null) {
                vto.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public boolean f446b;

        public f(Parcelable superState) {
            super(superState);
        }

        public f(Parcel in) {
            super(in);
            this.f446b = in.readByte() != 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeByte(this.f446b ? (byte) 1 : 0);
        }

        public class a implements Parcelable.Creator<f> {
            /* renamed from: a */
            public f createFromParcel(Parcel in) {
                return new f(in);
            }

            /* renamed from: b */
            public f[] newArray(int size) {
                return new f[size];
            }
        }
    }

    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public SpinnerAdapter f440b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f441c;

        public d(SpinnerAdapter adapter, Resources.Theme dropDownTheme) {
            this.f440b = adapter;
            if (adapter instanceof ListAdapter) {
                this.f441c = (ListAdapter) adapter;
            }
            if (dropDownTheme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (adapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter) adapter;
                if (themedAdapter.getDropDownViewTheme() != dropDownTheme) {
                    themedAdapter.setDropDownViewTheme(dropDownTheme);
                }
            } else if (adapter instanceof s0) {
                s0 themedAdapter2 = (s0) adapter;
                if (themedAdapter2.getDropDownViewTheme() == null) {
                    themedAdapter2.setDropDownViewTheme(dropDownTheme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f440b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int position) {
            SpinnerAdapter spinnerAdapter = this.f440b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(position);
        }

        public long getItemId(int position) {
            SpinnerAdapter spinnerAdapter = this.f440b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            return getDropDownView(position, convertView, parent);
        }

        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            SpinnerAdapter spinnerAdapter = this.f440b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(position, convertView, parent);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f440b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f440b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(observer);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f440b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(observer);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter adapter = this.f441c;
            if (adapter != null) {
                return adapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int position) {
            ListAdapter adapter = this.f441c;
            if (adapter != null) {
                return adapter.isEnabled(position);
            }
            return true;
        }

        public int getItemViewType(int position) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    public class c implements g, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public a.b.k.c f436b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f437c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f438d;

        public c() {
        }

        @Override // a.b.p.w.g
        public void dismiss() {
            a.b.k.c cVar = this.f436b;
            if (cVar != null) {
                cVar.dismiss();
                this.f436b = null;
            }
        }

        @Override // a.b.p.w.g
        public boolean b() {
            a.b.k.c cVar = this.f436b;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // a.b.p.w.g
        public void o(ListAdapter adapter) {
            this.f437c = adapter;
        }

        @Override // a.b.p.w.g
        public void l(CharSequence hintText) {
            this.f438d = hintText;
        }

        @Override // a.b.p.w.g
        public CharSequence j() {
            return this.f438d;
        }

        @Override // a.b.p.w.g
        public void d(int textDirection, int textAlignment) {
            if (this.f437c != null) {
                c.a builder = new c.a(w.this.getPopupContext());
                CharSequence charSequence = this.f438d;
                if (charSequence != null) {
                    builder.j(charSequence);
                }
                builder.i(this.f437c, w.this.getSelectedItemPosition(), this);
                a.b.k.c a2 = builder.a();
                this.f436b = a2;
                ListView listView = a2.e();
                listView.setTextDirection(textDirection);
                listView.setTextAlignment(textAlignment);
                this.f436b.show();
            }
        }

        public void onClick(DialogInterface dialog, int which) {
            w.this.setSelection(which);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, which, this.f437c.getItemId(which));
            }
            dismiss();
        }

        @Override // a.b.p.w.g
        public void m(Drawable bg) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // a.b.p.w.g
        public void n(int px) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.p.w.g
        public void a(int px) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.p.w.g
        public Drawable i() {
            return null;
        }

        @Override // a.b.p.w.g
        public int g() {
            return 0;
        }

        @Override // a.b.p.w.g
        public int c() {
            return 0;
        }

        @Override // a.b.p.w.g
        public void p(int px) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    public class e extends j0 implements g {
        public CharSequence G;
        public ListAdapter H;
        public final Rect I = new Rect();
        public int J;

        public e(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            z(w.this);
            F(true);
            K(0);
            H(new a(w.this));
        }

        public class a implements AdapterView.OnItemClickListener {
            public a(w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                w.this.setSelection(position);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(v, position, eVar.H.getItemId(position));
                }
                e.this.dismiss();
            }
        }

        @Override // a.b.p.w.g, a.b.p.j0
        public void o(ListAdapter adapter) {
            super.o(adapter);
            this.H = adapter;
        }

        @Override // a.b.p.w.g
        public CharSequence j() {
            return this.G;
        }

        @Override // a.b.p.w.g
        public void l(CharSequence hintText) {
            this.G = hintText;
        }

        public void O() {
            int hOffset;
            int i;
            Drawable background = i();
            int hOffset2 = 0;
            if (background != null) {
                background.getPadding(w.this.i);
                if (d1.b(w.this)) {
                    i = w.this.i.right;
                } else {
                    i = -w.this.i.left;
                }
                hOffset2 = i;
            } else {
                Rect rect = w.this.i;
                rect.right = 0;
                rect.left = 0;
            }
            int spinnerPaddingLeft = w.this.getPaddingLeft();
            int spinnerPaddingRight = w.this.getPaddingRight();
            int spinnerWidth = w.this.getWidth();
            w wVar = w.this;
            int i2 = wVar.h;
            if (i2 == -2) {
                int contentWidth = wVar.a((SpinnerAdapter) this.H, i());
                int i3 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.i;
                int contentWidthLimit = (i3 - rect2.left) - rect2.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                B(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
            } else if (i2 == -1) {
                B((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
            } else {
                B(i2);
            }
            if (d1.b(w.this)) {
                hOffset = hOffset2 + (((spinnerWidth - spinnerPaddingRight) - v()) - P());
            } else {
                hOffset = hOffset2 + P() + spinnerPaddingLeft;
            }
            a(hOffset);
        }

        @Override // a.b.p.w.g
        public void d(int textDirection, int textAlignment) {
            ViewTreeObserver vto;
            boolean wasShowing = b();
            O();
            E(2);
            super.f();
            ListView listView = k();
            listView.setChoiceMode(1);
            listView.setTextDirection(textDirection);
            listView.setTextAlignment(textAlignment);
            L(w.this.getSelectedItemPosition());
            if (!wasShowing && (vto = w.this.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener layoutListener = new b();
                vto.addOnGlobalLayoutListener(layoutListener);
                G(new c(layoutListener));
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(w.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.O();
                e.super.f();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f444b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f444b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver vto = w.this.getViewTreeObserver();
                if (vto != null) {
                    vto.removeGlobalOnLayoutListener(this.f444b);
                }
            }
        }

        public boolean Q(View view) {
            return s.J(view) && view.getGlobalVisibleRect(this.I);
        }

        @Override // a.b.p.w.g
        public void p(int px) {
            this.J = px;
        }

        public int P() {
            return this.J;
        }
    }
}
