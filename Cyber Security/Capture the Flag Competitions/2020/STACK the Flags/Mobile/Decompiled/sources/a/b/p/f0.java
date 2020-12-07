package a.b.p;

import a.b.m.a.c;
import a.h.m.x;
import a.h.n.f;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class f0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    public final Rect f307b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public int f308c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f309d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f310e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f311f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f312g;
    public Field h;
    public a i;
    public boolean j;
    public boolean k;
    public boolean l;
    public x m;
    public f n;
    public b o;

    public f0(Context context, boolean hijackFocus) {
        super(context, null, a.b.a.dropDownListViewStyle);
        this.k = hijackFocus;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.k && this.j) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable sel) {
        a aVar = sel != null ? new a(sel) : null;
        this.i = aVar;
        super.setSelector(aVar);
        Rect padding = new Rect();
        if (sel != null) {
            sel.getPadding(padding);
        }
        this.f308c = padding.left;
        this.f309d = padding.top;
        this.f310e = padding.right;
        this.f311f = padding.bottom;
    }

    public void drawableStateChanged() {
        if (this.o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            k();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.f312g = pointToPosition((int) ev.getX(), (int) ev.getY());
        }
        b bVar = this.o;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(ev);
    }

    public int d(int widthMeasureSpec, int maxHeight, int disallowPartialChildPosition) {
        int paddingTop;
        ViewGroup.LayoutParams childLp;
        int heightMeasureSpec;
        int paddingTop2 = getListPaddingTop();
        int paddingBottom = getListPaddingBottom();
        int reportedDividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return paddingTop2 + paddingBottom;
        }
        int returnedHeight = paddingTop2 + paddingBottom;
        int dividerHeight = (reportedDividerHeight <= 0 || divider == null) ? 0 : reportedDividerHeight;
        int prevHeightWithoutPartialChild = 0;
        View child = null;
        int viewType = 0;
        int count = adapter.getCount();
        int i2 = 0;
        while (i2 < count) {
            int newType = adapter.getItemViewType(i2);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            child = adapter.getView(i2, child, this);
            ViewGroup.LayoutParams childLp2 = child.getLayoutParams();
            if (childLp2 == null) {
                paddingTop = paddingTop2;
                childLp = generateDefaultLayoutParams();
                child.setLayoutParams(childLp);
            } else {
                paddingTop = paddingTop2;
                childLp = childLp2;
            }
            int paddingBottom2 = childLp.height;
            if (paddingBottom2 > 0) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824);
            } else {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            child.measure(widthMeasureSpec, heightMeasureSpec);
            child.forceLayout();
            if (i2 > 0) {
                returnedHeight += dividerHeight;
            }
            returnedHeight += child.getMeasuredHeight();
            if (returnedHeight >= maxHeight) {
                return (disallowPartialChildPosition < 0 || i2 <= disallowPartialChildPosition || prevHeightWithoutPartialChild <= 0 || returnedHeight == maxHeight) ? maxHeight : prevHeightWithoutPartialChild;
            }
            if (disallowPartialChildPosition >= 0 && i2 >= disallowPartialChildPosition) {
                prevHeightWithoutPartialChild = returnedHeight;
            }
            i2++;
            paddingTop2 = paddingTop;
            paddingBottom = paddingBottom;
        }
        return returnedHeight;
    }

    private void setSelectorEnabled(boolean enabled) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.c(enabled);
        }
    }

    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f313c = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public void c(boolean enabled) {
            this.f313c = enabled;
        }

        @Override // a.b.m.a.c
        public boolean setState(int[] stateSet) {
            if (this.f313c) {
                return super.setState(stateSet);
            }
            return false;
        }

        @Override // a.b.m.a.c
        public void draw(Canvas canvas) {
            if (this.f313c) {
                super.draw(canvas);
            }
        }

        @Override // a.b.m.a.c
        public void setHotspot(float x, float y) {
            if (this.f313c) {
                super.setHotspot(x, y);
            }
        }

        @Override // a.b.m.a.c
        public void setHotspotBounds(int left, int top, int right, int bottom) {
            if (this.f313c) {
                super.setHotspotBounds(left, top, right, bottom);
            }
        }

        @Override // a.b.m.a.c
        public boolean setVisible(boolean visible, boolean restart) {
            if (this.f313c) {
                return super.setVisible(visible, restart);
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent ev) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(ev);
        }
        int action = ev.getActionMasked();
        if (action == 10 && this.o == null) {
            b bVar = new b();
            this.o = bVar;
            bVar.b();
        }
        boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            int position = pointToPosition((int) ev.getX(), (int) ev.getY());
            if (!(position == -1 || position == getSelectedItemPosition())) {
                View hoveredItem = getChildAt(position - getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    setSelectionFromTop(position, hoveredItem.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return handled;
    }

    public void onDetachedFromWindow() {
        this.o = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    public boolean e(MotionEvent event, int activePointerId) {
        boolean handledEvent = true;
        boolean clearPressedItem = false;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1) {
            handledEvent = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                handledEvent = false;
            }
            if (!handledEvent || clearPressedItem) {
                a();
            }
            if (!handledEvent) {
                if (this.n == null) {
                    this.n = new f(this);
                }
                this.n.m(true);
                this.n.onTouch(this, event);
            } else {
                f fVar = this.n;
                if (fVar != null) {
                    fVar.m(false);
                }
            }
            return handledEvent;
        }
        int activeIndex = event.findPointerIndex(activePointerId);
        if (activeIndex < 0) {
            handledEvent = false;
        } else {
            int x = (int) event.getX(activeIndex);
            int y = (int) event.getY(activeIndex);
            int position = pointToPosition(x, y);
            if (position == -1) {
                clearPressedItem = true;
            } else {
                View child = getChildAt(position - getFirstVisiblePosition());
                i(child, position, (float) x, (float) y);
                handledEvent = true;
                if (actionMasked == 1) {
                    b(child, position);
                }
            }
        }
        a();
        if (!handledEvent) {
        }
        return handledEvent;
    }

    public final void b(View child, int position) {
        performItemClick(child, position, getItemIdAtPosition(position));
    }

    public void setListSelectionHidden(boolean hideListSelection) {
        this.j = hideListSelection;
    }

    public final void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (!this.f307b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f307b);
            selector.draw(canvas);
        }
    }

    public final void h(int position, View sel, float x, float y) {
        g(position, sel);
        Drawable selector = getSelector();
        if (selector != null && position != -1) {
            a.h.f.l.a.k(selector, x, y);
        }
    }

    public final void g(int position, View sel) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean manageState = (selector == null || position == -1) ? false : true;
        if (manageState) {
            selector.setVisible(false, false);
        }
        f(position, sel);
        if (manageState) {
            Rect bounds = this.f307b;
            float x = bounds.exactCenterX();
            float y = bounds.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            a.h.f.l.a.k(selector, x, y);
        }
    }

    public final void f(int position, View sel) {
        Rect selectorRect = this.f307b;
        selectorRect.set(sel.getLeft(), sel.getTop(), sel.getRight(), sel.getBottom());
        selectorRect.left -= this.f308c;
        selectorRect.top -= this.f309d;
        selectorRect.right += this.f310e;
        selectorRect.bottom += this.f311f;
        try {
            boolean isChildViewEnabled = this.h.getBoolean(this);
            if (sel.isEnabled() != isChildViewEnabled) {
                this.h.set(this, Boolean.valueOf(!isChildViewEnabled));
                if (position != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    public final void a() {
        this.l = false;
        setPressed(false);
        drawableStateChanged();
        View motionView = getChildAt(this.f312g - getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        x xVar = this.m;
        if (xVar != null) {
            xVar.b();
            this.m = null;
        }
    }

    public final void i(View child, int position, float x, float y) {
        View motionView;
        this.l = true;
        drawableHotspotChanged(x, y);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f312g;
        if (!(i2 == -1 || (motionView = getChildAt(i2 - getFirstVisiblePosition())) == null || motionView == child || !motionView.isPressed())) {
            motionView.setPressed(false);
        }
        this.f312g = position;
        child.drawableHotspotChanged(x - ((float) child.getLeft()), y - ((float) child.getTop()));
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        h(position, child, x, y);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    public final boolean j() {
        return this.l;
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.drawableStateChanged();
        }

        public void a() {
            f0 f0Var = f0.this;
            f0Var.o = null;
            f0Var.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }
    }
}
