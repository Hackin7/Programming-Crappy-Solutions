package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: cc */
class C0182cc extends ListView {

    /* renamed from: a */
    C0184b f927a;

    /* renamed from: b */
    private final Rect f928b = new Rect();

    /* renamed from: c */
    private int f929c = 0;

    /* renamed from: d */
    private int f930d = 0;

    /* renamed from: e */
    private int f931e = 0;

    /* renamed from: f */
    private int f932f = 0;

    /* renamed from: g */
    private int f933g;

    /* renamed from: h */
    private Field f934h;

    /* renamed from: i */
    private C0183a f935i;

    /* renamed from: j */
    private boolean f936j;

    /* renamed from: k */
    private boolean f937k;

    /* renamed from: l */
    private boolean f938l;

    /* renamed from: m */
    private C0402gt f939m;

    /* renamed from: n */
    private C0438he f940n;

    /* renamed from: cc$a */
    static class C0183a extends C0798r {

        /* renamed from: b */
        boolean f941b = true;

        C0183a(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f941b) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f2) {
            if (this.f941b) {
                super.setHotspot(f, f2);
            }
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f941b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f941b) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f941b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: cc$b */
    class C0184b implements Runnable {
        C0184b() {
        }

        public final void run() {
            C0182cc.this.f927a = null;
            C0182cc.this.drawableStateChanged();
        }
    }

    C0182cc(Context context, boolean z) {
        super(context, null, C0117a.dropDownListViewStyle);
        this.f937k = z;
        setCacheColorHint(0);
        try {
            this.f934h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f934h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m608a() {
        Drawable selector = getSelector();
        if (selector != null && this.f938l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f935i != null) {
            this.f935i.f941b = z;
        }
    }

    /* renamed from: a */
    public int mo1157a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1158a(android.view.MotionEvent r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            int r3 = r18.getActionMasked()
            r4 = 1
            r5 = 0
            switch(r3) {
                case 1: goto L_0x0016;
                case 2: goto L_0x0014;
                case 3: goto L_0x0011;
                default: goto L_0x000d;
            }
        L_0x000d:
            r5 = r4
            r3 = 0
            goto L_0x0131
        L_0x0011:
            r3 = r5
            goto L_0x0131
        L_0x0014:
            r6 = r4
            goto L_0x0017
        L_0x0016:
            r6 = r5
        L_0x0017:
            int r7 = r18.findPointerIndex(r19)
            if (r7 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r8 = r2.getX(r7)
            int r8 = (int) r8
            float r7 = r2.getY(r7)
            int r7 = (int) r7
            int r9 = r1.pointToPosition(r8, r7)
            r10 = -1
            if (r9 != r10) goto L_0x0033
            r3 = r4
            r5 = r6
            goto L_0x0131
        L_0x0033:
            int r6 = r17.getFirstVisiblePosition()
            int r6 = r9 - r6
            android.view.View r6 = r1.getChildAt(r6)
            float r8 = (float) r8
            float r7 = (float) r7
            r1.f938l = r4
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 21
            if (r11 < r12) goto L_0x004a
            r1.drawableHotspotChanged(r8, r7)
        L_0x004a:
            boolean r11 = r17.isPressed()
            if (r11 != 0) goto L_0x0053
            r1.setPressed(r4)
        L_0x0053:
            r17.layoutChildren()
            int r11 = r1.f933g
            if (r11 == r10) goto L_0x0072
            int r11 = r1.f933g
            int r13 = r17.getFirstVisiblePosition()
            int r11 = r11 - r13
            android.view.View r11 = r1.getChildAt(r11)
            if (r11 == 0) goto L_0x0072
            if (r11 == r6) goto L_0x0072
            boolean r13 = r11.isPressed()
            if (r13 == 0) goto L_0x0072
            r11.setPressed(r5)
        L_0x0072:
            r1.f933g = r9
            int r11 = r6.getLeft()
            float r11 = (float) r11
            float r11 = r8 - r11
            int r13 = r6.getTop()
            float r13 = (float) r13
            float r13 = r7 - r13
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r12) goto L_0x0089
            r6.drawableHotspotChanged(r11, r13)
        L_0x0089:
            boolean r11 = r6.isPressed()
            if (r11 != 0) goto L_0x0092
            r6.setPressed(r4)
        L_0x0092:
            android.graphics.drawable.Drawable r11 = r17.getSelector()
            if (r11 == 0) goto L_0x009c
            if (r9 == r10) goto L_0x009c
            r12 = r4
            goto L_0x009d
        L_0x009c:
            r12 = r5
        L_0x009d:
            if (r12 == 0) goto L_0x00a2
            r11.setVisible(r5, r5)
        L_0x00a2:
            android.graphics.Rect r13 = r1.f928b
            int r14 = r6.getLeft()
            int r15 = r6.getTop()
            int r5 = r6.getRight()
            int r10 = r6.getBottom()
            r13.set(r14, r15, r5, r10)
            int r5 = r13.left
            int r10 = r1.f929c
            int r5 = r5 - r10
            r13.left = r5
            int r5 = r13.top
            int r10 = r1.f930d
            int r5 = r5 - r10
            r13.top = r5
            int r5 = r13.right
            int r10 = r1.f931e
            int r5 = r5 + r10
            r13.right = r5
            int r5 = r13.bottom
            int r10 = r1.f932f
            int r5 = r5 + r10
            r13.bottom = r5
            java.lang.reflect.Field r5 = r1.f934h     // Catch:{ IllegalAccessException -> 0x00f0 }
            boolean r5 = r5.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00f0 }
            boolean r10 = r6.isEnabled()     // Catch:{ IllegalAccessException -> 0x00f0 }
            if (r10 == r5) goto L_0x00f5
            java.lang.reflect.Field r10 = r1.f934h     // Catch:{ IllegalAccessException -> 0x00f0 }
            r5 = r5 ^ r4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalAccessException -> 0x00f0 }
            r10.set(r1, r5)     // Catch:{ IllegalAccessException -> 0x00f0 }
            r5 = -1
            if (r9 == r5) goto L_0x00f5
            r17.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00f0 }
            goto L_0x00f5
        L_0x00f0:
            r0 = move-exception
            r5 = r0
            r5.printStackTrace()
        L_0x00f5:
            if (r12 == 0) goto L_0x0113
            android.graphics.Rect r5 = r1.f928b
            float r10 = r5.exactCenterX()
            float r5 = r5.exactCenterY()
            int r12 = r17.getVisibility()
            if (r12 != 0) goto L_0x010a
            r12 = r4
        L_0x0108:
            r13 = 0
            goto L_0x010c
        L_0x010a:
            r12 = 0
            goto L_0x0108
        L_0x010c:
            r11.setVisible(r12, r13)
            p000.C0345fn.m1144a(r11, r10, r5)
            goto L_0x0114
        L_0x0113:
            r13 = 0
        L_0x0114:
            android.graphics.drawable.Drawable r5 = r17.getSelector()
            if (r5 == 0) goto L_0x0120
            r10 = -1
            if (r9 == r10) goto L_0x0120
            p000.C0345fn.m1144a(r5, r8, r7)
        L_0x0120:
            r1.setSelectorEnabled(r13)
            r17.refreshDrawableState()
            if (r3 != r4) goto L_0x000d
            long r7 = r1.getItemIdAtPosition(r9)
            r1.performItemClick(r6, r9, r7)
            goto L_0x000d
        L_0x0131:
            if (r5 == 0) goto L_0x0135
            if (r3 == 0) goto L_0x015a
        L_0x0135:
            r3 = 0
            r1.f938l = r3
            r1.setPressed(r3)
            r17.drawableStateChanged()
            int r6 = r1.f933g
            int r7 = r17.getFirstVisiblePosition()
            int r6 = r6 - r7
            android.view.View r6 = r1.getChildAt(r6)
            if (r6 == 0) goto L_0x014e
            r6.setPressed(r3)
        L_0x014e:
            gt r3 = r1.f939m
            if (r3 == 0) goto L_0x015a
            gt r3 = r1.f939m
            r3.mo1825a()
            r3 = 0
            r1.f939m = r3
        L_0x015a:
            if (r5 == 0) goto L_0x0172
            he r3 = r1.f940n
            if (r3 != 0) goto L_0x0167
            he r3 = new he
            r3.<init>(r1)
            r1.f940n = r3
        L_0x0167:
            he r3 = r1.f940n
            r3.mo1872a(r4)
            he r3 = r1.f940n
            r3.onTouch(r1, r2)
            return r5
        L_0x0172:
            he r2 = r1.f940n
            if (r2 == 0) goto L_0x017c
            he r2 = r1.f940n
            r3 = 0
            r2.mo1872a(r3)
        L_0x017c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0182cc.mo1158a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.f928b.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f928b);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f927a == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m608a();
        }
    }

    public boolean hasFocus() {
        return this.f937k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f937k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f937k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f937k && this.f936j) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f927a = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f927a == null) {
            this.f927a = new C0184b();
            C0184b bVar = this.f927a;
            C0182cc.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m608a();
            }
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f933g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f927a != null) {
            C0184b bVar = this.f927a;
            C0182cc.this.f927a = null;
            C0182cc.this.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f936j = z;
    }

    public void setSelector(Drawable drawable) {
        this.f935i = drawable != null ? new C0183a(drawable) : null;
        super.setSelector(this.f935i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f929c = rect.left;
        this.f930d = rect.top;
        this.f931e = rect.right;
        this.f932f = rect.bottom;
    }
}
