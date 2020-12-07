package a.b.p;

import a.b.j;
import a.b.o.j.p;
import a.h.m.s;
import a.h.n.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class j0 implements p {
    public static Method D;
    public static Method E;
    public static Method F;
    public Rect A;
    public boolean B;
    public PopupWindow C;

    /* renamed from: b  reason: collision with root package name */
    public Context f351b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f352c;

    /* renamed from: d  reason: collision with root package name */
    public f0 f353d;

    /* renamed from: e  reason: collision with root package name */
    public int f354e;

    /* renamed from: f  reason: collision with root package name */
    public int f355f;

    /* renamed from: g  reason: collision with root package name */
    public int f356g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public DataSetObserver r;
    public View s;
    public AdapterView.OnItemClickListener t;
    public final g u;
    public final f v;
    public final e w;
    public final c x;
    public final Handler y;
    public final Rect z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                F = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException e3) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                E = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException e4) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public j0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f354e = -2;
        this.f355f = -2;
        this.i = 1002;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.q = 0;
        this.u = new g();
        this.v = new f();
        this.w = new e();
        this.x = new c();
        this.z = new Rect();
        this.f351b = context;
        this.y = new Handler(context.getMainLooper());
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ListPopupWindow, defStyleAttr, defStyleRes);
        this.f356g = a2.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = a2.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        a2.recycle();
        q qVar = new q(context, attrs, defStyleAttr, defStyleRes);
        this.C = qVar;
        qVar.setInputMethodMode(1);
    }

    public void o(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new d();
        } else {
            ListAdapter listAdapter = this.f352c;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f352c = adapter;
        if (adapter != null) {
            adapter.registerDataSetObserver(this.r);
        }
        f0 f0Var = this.f353d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f352c);
        }
    }

    public void K(int position) {
        this.q = position;
    }

    public void F(boolean modal) {
        this.B = modal;
        this.C.setFocusable(modal);
    }

    public boolean x() {
        return this.B;
    }

    public Drawable i() {
        return this.C.getBackground();
    }

    public void m(Drawable d2) {
        this.C.setBackgroundDrawable(d2);
    }

    public void A(int animationStyle) {
        this.C.setAnimationStyle(animationStyle);
    }

    public View t() {
        return this.s;
    }

    public void z(View anchor) {
        this.s = anchor;
    }

    public int c() {
        return this.f356g;
    }

    public void a(int offset) {
        this.f356g = offset;
    }

    public int g() {
        if (!this.j) {
            return 0;
        }
        return this.h;
    }

    public void n(int offset) {
        this.h = offset;
        this.j = true;
    }

    public void D(Rect bounds) {
        this.A = bounds != null ? new Rect(bounds) : null;
    }

    public void C(int gravity) {
        this.m = gravity;
    }

    public int v() {
        return this.f355f;
    }

    public void M(int width) {
        this.f355f = width;
    }

    public void B(int width) {
        Drawable popupBackground = this.C.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.z);
            Rect rect = this.z;
            this.f355f = rect.left + rect.right + width;
            return;
        }
        M(width);
    }

    public void H(AdapterView.OnItemClickListener clickListener) {
        this.t = clickListener;
    }

    @Override // a.b.o.j.p
    public void f() {
        int widthSpec;
        int heightSpec;
        int widthSpec2;
        int heightSpec2;
        int height = q();
        boolean noInputMethod = w();
        h.b(this.C, this.i);
        boolean z2 = true;
        if (!this.C.isShowing()) {
            int widthSpec3 = this.f355f;
            if (widthSpec3 == -1) {
                widthSpec = -1;
            } else if (widthSpec3 == -2) {
                widthSpec = t().getWidth();
            } else {
                widthSpec = this.f355f;
            }
            int i2 = this.f354e;
            if (i2 == -1) {
                heightSpec = -1;
            } else if (i2 == -2) {
                heightSpec = height;
            } else {
                heightSpec = this.f354e;
            }
            this.C.setWidth(widthSpec);
            this.C.setHeight(heightSpec);
            J(true);
            this.C.setOutsideTouchable(!this.o && !this.n);
            this.C.setTouchInterceptor(this.v);
            if (this.l) {
                h.a(this.C, this.k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = F;
                if (method != null) {
                    try {
                        method.invoke(this.C, this.A);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.C.setEpicenterBounds(this.A);
            }
            h.c(this.C, t(), this.f356g, this.h, this.m);
            this.f353d.setSelection(-1);
            if (!this.B || this.f353d.isInTouchMode()) {
                r();
            }
            if (!this.B) {
                this.y.post(this.x);
            }
        } else if (s.J(t())) {
            int widthSpec4 = this.f355f;
            if (widthSpec4 == -1) {
                widthSpec2 = -1;
            } else if (widthSpec4 == -2) {
                widthSpec2 = t().getWidth();
            } else {
                widthSpec2 = this.f355f;
            }
            int i3 = this.f354e;
            if (i3 == -1) {
                heightSpec2 = noInputMethod ? height : -1;
                if (noInputMethod) {
                    this.C.setWidth(this.f355f == -1 ? -1 : 0);
                    this.C.setHeight(0);
                } else {
                    this.C.setWidth(this.f355f == -1 ? -1 : 0);
                    this.C.setHeight(-1);
                }
            } else {
                heightSpec2 = i3 == -2 ? height : this.f354e;
            }
            PopupWindow popupWindow = this.C;
            if (this.o || this.n) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.C.update(t(), this.f356g, this.h, widthSpec2 < 0 ? -1 : widthSpec2, heightSpec2 < 0 ? -1 : heightSpec2);
        }
    }

    @Override // a.b.o.j.p
    public void dismiss() {
        this.C.dismiss();
        y();
        this.C.setContentView(null);
        this.f353d = null;
        this.y.removeCallbacks(this.u);
    }

    public void G(PopupWindow.OnDismissListener listener) {
        this.C.setOnDismissListener(listener);
    }

    public final void y() {
    }

    public void E(int mode) {
        this.C.setInputMethodMode(mode);
    }

    public void L(int position) {
        f0 list = this.f353d;
        if (b() && list != null) {
            list.setListSelectionHidden(false);
            list.setSelection(position);
            if (list.getChoiceMode() != 0) {
                list.setItemChecked(position, true);
            }
        }
    }

    public void r() {
        f0 list = this.f353d;
        if (list != null) {
            list.setListSelectionHidden(true);
            list.requestLayout();
        }
    }

    @Override // a.b.o.j.p
    public boolean b() {
        return this.C.isShowing();
    }

    public boolean w() {
        return this.C.getInputMethodMode() == 2;
    }

    @Override // a.b.o.j.p
    public ListView k() {
        return this.f353d;
    }

    public f0 s(Context context, boolean hijackFocus) {
        return new f0(context, hijackFocus);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v25, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    public final int q() {
        int padding;
        int childWidthSpec;
        int widthSize;
        int widthMode;
        int otherHeights = 0;
        boolean ignoreBottomDecorations = false;
        if (this.f353d == null) {
            Context context = this.f351b;
            new a();
            f0 s2 = s(context, !this.B);
            this.f353d = s2;
            s2.setAdapter(this.f352c);
            this.f353d.setOnItemClickListener(this.t);
            this.f353d.setFocusable(true);
            this.f353d.setFocusableInTouchMode(true);
            this.f353d.setOnItemSelectedListener(new b());
            this.f353d.setOnScrollListener(this.w);
            ViewGroup dropDownView = this.f353d;
            View hintView = null;
            if (0 != 0) {
                LinearLayout hintContainer = new LinearLayout(context);
                hintContainer.setOrientation(1);
                LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i2 = this.q;
                if (i2 == 0) {
                    hintContainer.addView(null);
                    hintContainer.addView(dropDownView, hintParams);
                } else if (i2 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.q);
                } else {
                    hintContainer.addView(dropDownView, hintParams);
                    hintContainer.addView(null);
                }
                if (this.f355f >= 0) {
                    widthMode = Integer.MIN_VALUE;
                    widthSize = this.f355f;
                } else {
                    widthMode = 0;
                    widthSize = 0;
                }
                hintView.measure(View.MeasureSpec.makeMeasureSpec(widthSize, widthMode), 0);
                LinearLayout.LayoutParams hintParams2 = (LinearLayout.LayoutParams) hintView.getLayoutParams();
                dropDownView = hintContainer;
                otherHeights = hintView.getMeasuredHeight() + hintParams2.topMargin + hintParams2.bottomMargin;
            }
            this.C.setContentView(dropDownView);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.C.getContentView();
            View view = null;
            if (0 != 0) {
                LinearLayout.LayoutParams hintParams3 = (LinearLayout.LayoutParams) view.getLayoutParams();
                otherHeights = view.getMeasuredHeight() + hintParams3.topMargin + hintParams3.bottomMargin;
            }
        }
        Drawable background = this.C.getBackground();
        if (background != null) {
            background.getPadding(this.z);
            Rect rect = this.z;
            int i3 = rect.top;
            padding = rect.bottom + i3;
            if (!this.j) {
                this.h = -i3;
            }
        } else {
            this.z.setEmpty();
            padding = 0;
        }
        if (this.C.getInputMethodMode() == 2) {
            ignoreBottomDecorations = true;
        }
        int maxHeight = u(t(), this.h, ignoreBottomDecorations);
        if (this.n || this.f354e == -1) {
            return maxHeight + padding;
        }
        int i4 = this.f355f;
        if (i4 == -2) {
            int i5 = this.f351b.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.z;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i4 != -1) {
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            int i6 = this.f351b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.z;
            childWidthSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect3.left + rect3.right), 1073741824);
        }
        int listContent = this.f353d.d(childWidthSpec, maxHeight - otherHeights, -1);
        if (listContent > 0) {
            otherHeights += padding + this.f353d.getPaddingTop() + this.f353d.getPaddingBottom();
        }
        return listContent + otherHeights;
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            View view = j0.this.t();
            if (view != null && view.getWindowToken() != null) {
                j0.this.f();
            }
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            f0 dropDownList;
            if (position != -1 && (dropDownList = j0.this.f353d) != null) {
                dropDownList.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void I(boolean overlapAnchor) {
        this.l = true;
        this.k = overlapAnchor;
    }

    public class d extends DataSetObserver {
        public d() {
        }

        public void onChanged() {
            if (j0.this.b()) {
                j0.this.f();
            }
        }

        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            j0.this.r();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            f0 f0Var = j0.this.f353d;
            if (f0Var != null && s.J(f0Var) && j0.this.f353d.getCount() > j0.this.f353d.getChildCount()) {
                int childCount = j0.this.f353d.getChildCount();
                j0 j0Var = j0.this;
                if (childCount <= j0Var.p) {
                    j0Var.C.setInputMethodMode(2);
                    j0.this.f();
                }
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        public boolean onTouch(View v, MotionEvent event) {
            PopupWindow popupWindow;
            int action = event.getAction();
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (action == 0 && (popupWindow = j0.this.C) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.C.getWidth() && y >= 0 && y < j0.this.C.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.y.postDelayed(j0Var.u, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.y.removeCallbacks(j0Var2.u);
                return false;
            }
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
            if (scrollState == 1 && !j0.this.w() && j0.this.C.getContentView() != null) {
                j0 j0Var = j0.this;
                j0Var.y.removeCallbacks(j0Var.u);
                j0.this.u.run();
            }
        }
    }

    public final void J(boolean clip) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = D;
            if (method != null) {
                try {
                    method.invoke(this.C, Boolean.valueOf(clip));
                } catch (Exception e2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.C.setIsClippedToScreen(clip);
        }
    }

    public final int u(View anchor, int yOffset, boolean ignoreBottomDecorations) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.C.getMaxAvailableHeight(anchor, yOffset, ignoreBottomDecorations);
        }
        Method method = E;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.C, anchor, Integer.valueOf(yOffset), Boolean.valueOf(ignoreBottomDecorations))).intValue();
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.C.getMaxAvailableHeight(anchor, yOffset);
    }
}
