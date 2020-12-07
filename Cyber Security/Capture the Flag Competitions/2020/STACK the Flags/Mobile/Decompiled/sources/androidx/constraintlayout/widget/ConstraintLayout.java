package androidx.constraintlayout.widget;

import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.f;
import a.f.b.i.g;
import a.f.b.i.j;
import a.f.b.i.k;
import a.f.b.i.m.b;
import a.f.c.c;
import a.f.c.d;
import a.f.c.e;
import a.f.c.h;
import a.f.c.i;
import a.f.c.l;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<View> f1623b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<c> f1624c = new ArrayList<>(4);

    /* renamed from: d  reason: collision with root package name */
    public f f1625d = new f();

    /* renamed from: e  reason: collision with root package name */
    public int f1626e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1627f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1628g = Integer.MAX_VALUE;
    public int h = Integer.MAX_VALUE;
    public boolean i = true;
    public int j = 257;
    public e k = null;
    public d l = null;
    public int m = -1;
    public HashMap<String, Integer> n = new HashMap<>();
    public int o = -1;
    public int p = -1;
    public SparseArray<a.f.b.i.e> q = new SparseArray<>();
    public b r = new b(this);
    public int s = 0;
    public int t = 0;

    public void q(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            String name = (String) value1;
            int index = name.indexOf("/");
            if (index != -1) {
                name = name.substring(index + 1);
            }
            this.n.put(name, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    public Object f(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String name = (String) value;
        HashMap<String, Integer> hashMap = this.n;
        if (hashMap == null || !hashMap.containsKey(name)) {
            return null;
        }
        return this.n.get(name);
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        j(attrs, 0, 0);
    }

    public void setId(int id) {
        this.f1623b.remove(getId());
        super.setId(id);
        this.f1623b.put(getId(), this);
    }

    public class b implements b.AbstractC0011b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f1637a;

        /* renamed from: b  reason: collision with root package name */
        public int f1638b;

        /* renamed from: c  reason: collision with root package name */
        public int f1639c;

        /* renamed from: d  reason: collision with root package name */
        public int f1640d;

        /* renamed from: e  reason: collision with root package name */
        public int f1641e;

        /* renamed from: f  reason: collision with root package name */
        public int f1642f;

        /* renamed from: g  reason: collision with root package name */
        public int f1643g;

        public void a(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
            this.f1638b = top;
            this.f1639c = bottom;
            this.f1640d = width;
            this.f1641e = height;
            this.f1642f = widthSpec;
            this.f1643g = heightSpec;
        }

        public b(ConstraintLayout l) {
            this.f1637a = l;
        }

        /* JADX INFO: Multiple debug info for r0v13 int: [D('width' int), D('ratio' float)] */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x0218  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x0222  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x023b A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x025c  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0292  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x02a0  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x02ad  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x02bd  */
        /* JADX WARNING: Removed duplicated region for block: B:151:0x02c8  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x02d0  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x02d8  */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x02e3  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x02eb  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x02fc  */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x031f  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0323 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x0330  */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x0337  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x033d  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0342  */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x0361  */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x0363  */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x0368  */
        /* JADX WARNING: Removed duplicated region for block: B:194:0x0376  */
        @SuppressLint({"WrongCall"})
        public final void d(a.f.b.i.e widget, b.a measure) {
            int horizontalSpec;
            boolean horizontalUseRatio;
            boolean verticalUseRatio;
            a params;
            int height;
            int horizontalSpec2;
            int verticalSpec;
            int w;
            int h2;
            int horizontalSpec3;
            int i;
            int verticalSpec2;
            int width;
            int i2;
            int i3;
            int i4;
            int horizontalSpec4;
            int i5;
            int verticalSpec3;
            if (widget != null) {
                if (widget.O() != 8 || widget.Y()) {
                    e.a horizontalBehavior = measure.f637a;
                    e.a verticalBehavior = measure.f638b;
                    int horizontalDimension = measure.f639c;
                    int verticalDimension = measure.f640d;
                    int horizontalSpec5 = 0;
                    int verticalSpec4 = 0;
                    int heightPadding = this.f1638b + this.f1639c;
                    int widthPadding = this.f1640d;
                    boolean didHorizontalWrap = false;
                    boolean didVerticalWrap = false;
                    View child = (View) widget.o();
                    int ordinal = horizontalBehavior.ordinal();
                    if (ordinal == 0) {
                        horizontalSpec = 2;
                        int horizontalSpec6 = View.MeasureSpec.makeMeasureSpec(horizontalDimension, 1073741824);
                        widget.f627g[2] = horizontalDimension;
                        horizontalSpec5 = horizontalSpec6;
                    } else if (ordinal == 1) {
                        int horizontalSpec7 = ViewGroup.getChildMeasureSpec(this.f1642f, widthPadding, -2);
                        didHorizontalWrap = true;
                        horizontalSpec = 2;
                        widget.f627g[2] = -2;
                        horizontalSpec5 = horizontalSpec7;
                    } else if (ordinal == 2) {
                        int horizontalSpec8 = ViewGroup.getChildMeasureSpec(this.f1642f, widthPadding, -2);
                        didHorizontalWrap = true;
                        boolean shouldDoWrap = widget.o == 1;
                        int[] iArr = widget.f627g;
                        iArr[2] = 0;
                        if (measure.j) {
                            boolean useCurrent = !(!shouldDoWrap || iArr[3] == 0 || iArr[0] == widget.P()) || (child instanceof i);
                            if (!shouldDoWrap || useCurrent) {
                                didHorizontalWrap = false;
                                horizontalSpec5 = View.MeasureSpec.makeMeasureSpec(widget.P(), 1073741824);
                                horizontalSpec = 2;
                            }
                        }
                        horizontalSpec5 = horizontalSpec8;
                        horizontalSpec = 2;
                    } else if (ordinal != 3) {
                        horizontalSpec = 2;
                    } else {
                        int horizontalSpec9 = ViewGroup.getChildMeasureSpec(this.f1642f, widget.x() + widthPadding, -1);
                        widget.f627g[2] = -1;
                        horizontalSpec5 = horizontalSpec9;
                        horizontalSpec = 2;
                    }
                    int horizontalSpec10 = verticalBehavior.ordinal();
                    if (horizontalSpec10 == 0) {
                        verticalSpec4 = View.MeasureSpec.makeMeasureSpec(verticalDimension, 1073741824);
                        widget.f627g[3] = verticalDimension;
                    } else if (horizontalSpec10 == 1) {
                        verticalSpec4 = ViewGroup.getChildMeasureSpec(this.f1643g, heightPadding, -2);
                        didVerticalWrap = true;
                        widget.f627g[3] = -2;
                    } else if (horizontalSpec10 == horizontalSpec) {
                        verticalSpec4 = ViewGroup.getChildMeasureSpec(this.f1643g, heightPadding, -2);
                        didVerticalWrap = true;
                        boolean shouldDoWrap2 = widget.p == 1;
                        int[] iArr2 = widget.f627g;
                        iArr2[3] = 0;
                        if (measure.j) {
                            boolean useCurrent2 = !(!shouldDoWrap2 || iArr2[2] == 0 || iArr2[1] == widget.t()) || (child instanceof i);
                            if (!shouldDoWrap2 || useCurrent2) {
                                verticalSpec4 = View.MeasureSpec.makeMeasureSpec(widget.t(), 1073741824);
                                didVerticalWrap = false;
                            }
                        }
                    } else if (horizontalSpec10 == 3) {
                        verticalSpec4 = ViewGroup.getChildMeasureSpec(this.f1643g, widget.N() + heightPadding, -1);
                        widget.f627g[3] = -1;
                    }
                    f container = (f) widget.G();
                    if (container != null && j.b(ConstraintLayout.this.j, 256) && child.getMeasuredWidth() == widget.P() && child.getMeasuredWidth() < container.P() && child.getMeasuredHeight() == widget.t() && child.getMeasuredHeight() < container.t() && child.getBaseline() == widget.l() && !widget.b0()) {
                        if (c(widget.y(), horizontalSpec5, widget.P()) && c(widget.z(), verticalSpec4, widget.t())) {
                            measure.f641e = widget.P();
                            measure.f642f = widget.t();
                            measure.f643g = widget.l();
                            return;
                        }
                    }
                    boolean horizontalMatchConstraints = horizontalBehavior == e.a.MATCH_CONSTRAINT;
                    boolean verticalMatchConstraints = verticalBehavior == e.a.MATCH_CONSTRAINT;
                    boolean verticalDimensionKnown = verticalBehavior == e.a.MATCH_PARENT || verticalBehavior == e.a.FIXED;
                    boolean horizontalDimensionKnown = horizontalBehavior == e.a.MATCH_PARENT || horizontalBehavior == e.a.FIXED;
                    if (horizontalMatchConstraints) {
                        if (widget.V > 0.0f) {
                            horizontalUseRatio = true;
                            if (!verticalMatchConstraints) {
                                if (widget.V > 0.0f) {
                                    verticalUseRatio = true;
                                    params = (a) child.getLayoutParams();
                                    if (!measure.j || !horizontalMatchConstraints || widget.o != 0 || !verticalMatchConstraints || widget.p != 0) {
                                        if ((child instanceof l) || !(widget instanceof k)) {
                                            child.measure(horizontalSpec5, verticalSpec4);
                                            widget.D0(horizontalSpec5, verticalSpec4);
                                        } else {
                                            k kVar = (k) widget;
                                            ((l) child).n();
                                        }
                                        w = child.getMeasuredWidth();
                                        h2 = child.getMeasuredHeight();
                                        int baseline = child.getBaseline();
                                        if (didHorizontalWrap) {
                                            horizontalSpec3 = horizontalSpec5;
                                            int[] iArr3 = widget.f627g;
                                            iArr3[0] = w;
                                            iArr3[2] = h2;
                                        } else {
                                            horizontalSpec3 = horizontalSpec5;
                                            int[] iArr4 = widget.f627g;
                                            iArr4[0] = 0;
                                            iArr4[2] = 0;
                                        }
                                        if (didVerticalWrap) {
                                            int[] iArr5 = widget.f627g;
                                            iArr5[1] = h2;
                                            iArr5[3] = w;
                                        } else {
                                            int[] iArr6 = widget.f627g;
                                            iArr6[1] = 0;
                                            iArr6[3] = 0;
                                        }
                                        i = widget.r;
                                        if (i > 0) {
                                            verticalSpec2 = verticalSpec4;
                                            width = Math.max(i, w);
                                        } else {
                                            verticalSpec2 = verticalSpec4;
                                            width = w;
                                        }
                                        i2 = widget.s;
                                        if (i2 > 0) {
                                            width = Math.min(i2, width);
                                        }
                                        i3 = widget.u;
                                        if (i3 > 0) {
                                            height = Math.max(i3, h2);
                                        } else {
                                            height = h2;
                                        }
                                        i4 = widget.v;
                                        if (i4 > 0) {
                                            height = Math.min(i4, height);
                                        }
                                        if (!j.b(ConstraintLayout.this.j, 1)) {
                                            if (horizontalUseRatio && verticalDimensionKnown) {
                                                width = (int) ((((float) height) * widget.V) + 0.5f);
                                            } else if (verticalUseRatio && horizontalDimensionKnown) {
                                                height = (int) ((((float) width) / widget.V) + 0.5f);
                                            }
                                        }
                                        if (w == width || h2 != height) {
                                            if (w != width) {
                                                i5 = 1073741824;
                                                horizontalSpec4 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
                                            } else {
                                                i5 = 1073741824;
                                                horizontalSpec4 = horizontalSpec3;
                                            }
                                            if (h2 != height) {
                                                verticalSpec3 = View.MeasureSpec.makeMeasureSpec(height, i5);
                                            } else {
                                                verticalSpec3 = verticalSpec2;
                                            }
                                            child.measure(horizontalSpec4, verticalSpec3);
                                            widget.D0(horizontalSpec4, verticalSpec3);
                                            verticalSpec = child.getMeasuredWidth();
                                            height = child.getMeasuredHeight();
                                            horizontalSpec2 = child.getBaseline();
                                        } else {
                                            verticalSpec = width;
                                            horizontalSpec2 = baseline;
                                        }
                                    } else {
                                        verticalSpec = 0;
                                        height = 0;
                                        horizontalSpec2 = 0;
                                    }
                                    boolean hasBaseline = horizontalSpec2 != -1;
                                    measure.i = verticalSpec == measure.f639c || height != measure.f640d;
                                    if (params.X) {
                                        hasBaseline = true;
                                    }
                                    if (!(!hasBaseline || horizontalSpec2 == -1 || widget.l() == horizontalSpec2)) {
                                        measure.i = true;
                                    }
                                    measure.f641e = verticalSpec;
                                    measure.f642f = height;
                                    measure.h = hasBaseline;
                                    measure.f643g = horizontalSpec2;
                                    return;
                                }
                            }
                            verticalUseRatio = false;
                            params = (a) child.getLayoutParams();
                            if (!measure.j) {
                            }
                            if (child instanceof l) {
                            }
                            child.measure(horizontalSpec5, verticalSpec4);
                            widget.D0(horizontalSpec5, verticalSpec4);
                            w = child.getMeasuredWidth();
                            h2 = child.getMeasuredHeight();
                            int baseline2 = child.getBaseline();
                            if (didHorizontalWrap) {
                            }
                            if (didVerticalWrap) {
                            }
                            i = widget.r;
                            if (i > 0) {
                            }
                            i2 = widget.s;
                            if (i2 > 0) {
                            }
                            i3 = widget.u;
                            if (i3 > 0) {
                            }
                            i4 = widget.v;
                            if (i4 > 0) {
                            }
                            if (!j.b(ConstraintLayout.this.j, 1)) {
                            }
                            if (w == width) {
                            }
                            if (w != width) {
                            }
                            if (h2 != height) {
                            }
                            child.measure(horizontalSpec4, verticalSpec3);
                            widget.D0(horizontalSpec4, verticalSpec3);
                            verticalSpec = child.getMeasuredWidth();
                            height = child.getMeasuredHeight();
                            horizontalSpec2 = child.getBaseline();
                            if (horizontalSpec2 != -1) {
                            }
                            measure.i = verticalSpec == measure.f639c || height != measure.f640d;
                            if (params.X) {
                            }
                            measure.i = true;
                            measure.f641e = verticalSpec;
                            measure.f642f = height;
                            measure.h = hasBaseline;
                            measure.f643g = horizontalSpec2;
                            return;
                        }
                    }
                    horizontalUseRatio = false;
                    if (!verticalMatchConstraints) {
                    }
                    verticalUseRatio = false;
                    params = (a) child.getLayoutParams();
                    if (!measure.j) {
                    }
                    if (child instanceof l) {
                    }
                    child.measure(horizontalSpec5, verticalSpec4);
                    widget.D0(horizontalSpec5, verticalSpec4);
                    w = child.getMeasuredWidth();
                    h2 = child.getMeasuredHeight();
                    int baseline22 = child.getBaseline();
                    if (didHorizontalWrap) {
                    }
                    if (didVerticalWrap) {
                    }
                    i = widget.r;
                    if (i > 0) {
                    }
                    i2 = widget.s;
                    if (i2 > 0) {
                    }
                    i3 = widget.u;
                    if (i3 > 0) {
                    }
                    i4 = widget.v;
                    if (i4 > 0) {
                    }
                    if (!j.b(ConstraintLayout.this.j, 1)) {
                    }
                    if (w == width) {
                    }
                    if (w != width) {
                    }
                    if (h2 != height) {
                    }
                    child.measure(horizontalSpec4, verticalSpec3);
                    widget.D0(horizontalSpec4, verticalSpec3);
                    verticalSpec = child.getMeasuredWidth();
                    height = child.getMeasuredHeight();
                    horizontalSpec2 = child.getBaseline();
                    if (horizontalSpec2 != -1) {
                    }
                    measure.i = verticalSpec == measure.f639c || height != measure.f640d;
                    if (params.X) {
                    }
                    measure.i = true;
                    measure.f641e = verticalSpec;
                    measure.f642f = height;
                    measure.h = hasBaseline;
                    measure.f643g = horizontalSpec2;
                    return;
                }
                measure.f641e = 0;
                measure.f642f = 0;
                measure.f643g = 0;
            }
        }

        public final boolean c(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int lastMode = View.MeasureSpec.getMode(lastMeasureSpec);
            View.MeasureSpec.getSize(lastMeasureSpec);
            int mode = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode != 1073741824) {
                return false;
            }
            if ((lastMode == Integer.MIN_VALUE || lastMode == 0) && widgetSize == size) {
                return true;
            }
            return false;
        }

        public final void b() {
            int widgetsCount = this.f1637a.getChildCount();
            for (int i = 0; i < widgetsCount; i++) {
                View child = this.f1637a.getChildAt(i);
                if (child instanceof i) {
                    ((i) child).a();
                }
            }
            int helperCount = this.f1637a.f1624c.size();
            if (helperCount > 0) {
                for (int i2 = 0; i2 < helperCount; i2++) {
                    ((c) this.f1637a.f1624c.get(i2)).j();
                }
            }
        }
    }

    public final void j(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f1625d.j0(this);
        this.f1625d.C1(this.r);
        this.f1623b.put(getId(), this);
        this.k = null;
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, a.f.c.k.ConstraintLayout_Layout, defStyleAttr, defStyleRes);
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                if (attr == a.f.c.k.ConstraintLayout_Layout_android_minWidth) {
                    this.f1626e = a2.getDimensionPixelOffset(attr, this.f1626e);
                } else if (attr == a.f.c.k.ConstraintLayout_Layout_android_minHeight) {
                    this.f1627f = a2.getDimensionPixelOffset(attr, this.f1627f);
                } else if (attr == a.f.c.k.ConstraintLayout_Layout_android_maxWidth) {
                    this.f1628g = a2.getDimensionPixelOffset(attr, this.f1628g);
                } else if (attr == a.f.c.k.ConstraintLayout_Layout_android_maxHeight) {
                    this.h = a2.getDimensionPixelOffset(attr, this.h);
                } else if (attr == a.f.c.k.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.j = a2.getInt(attr, this.j);
                } else if (attr == a.f.c.k.ConstraintLayout_Layout_layoutDescription) {
                    int id = a2.getResourceId(attr, 0);
                    if (id != 0) {
                        try {
                            m(id);
                        } catch (Resources.NotFoundException e2) {
                            this.l = null;
                        }
                    }
                } else if (attr == a.f.c.k.ConstraintLayout_Layout_constraintSet) {
                    int id2 = a2.getResourceId(attr, 0);
                    try {
                        a.f.c.e eVar = new a.f.c.e();
                        this.k = eVar;
                        eVar.i(getContext(), id2);
                    } catch (Resources.NotFoundException e3) {
                        this.k = null;
                    }
                    this.m = id2;
                }
            }
            a2.recycle();
        }
        this.f1625d.D1(this.j);
    }

    public void m(int id) {
        this.l = new d(getContext(), this, id);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        a.f.b.i.e widget = i(view);
        if ((view instanceof h) && !(widget instanceof g)) {
            a layoutParams = (a) view.getLayoutParams();
            g gVar = new g();
            layoutParams.m0 = gVar;
            layoutParams.Y = true;
            gVar.h1(layoutParams.R);
        }
        if (view instanceof c) {
            c helper = (c) view;
            helper.m();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f1624c.contains(helper)) {
                this.f1624c.add(helper);
            }
        }
        this.f1623b.put(view.getId(), view);
        this.i = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1623b.remove(view.getId());
        this.f1625d.b1(i(view));
        this.f1624c.remove(view);
        this.i = true;
    }

    public void setMinWidth(int value) {
        if (value != this.f1626e) {
            this.f1626e = value;
            requestLayout();
        }
    }

    public void setMinHeight(int value) {
        if (value != this.f1627f) {
            this.f1627f = value;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.f1626e;
    }

    public int getMinHeight() {
        return this.f1627f;
    }

    public void setMaxWidth(int value) {
        if (value != this.f1628g) {
            this.f1628g = value;
            requestLayout();
        }
    }

    public void setMaxHeight(int value) {
        if (value != this.h) {
            this.h = value;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.f1628g;
    }

    public int getMaxHeight() {
        return this.h;
    }

    public final boolean s() {
        int count = getChildCount();
        boolean recompute = false;
        int i2 = 0;
        while (true) {
            if (i2 >= count) {
                break;
            } else if (getChildAt(i2).isLayoutRequested()) {
                recompute = true;
                break;
            } else {
                i2++;
            }
        }
        if (recompute) {
            p();
        }
        return recompute;
    }

    public final void p() {
        boolean isInEditMode = isInEditMode();
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            a.f.b.i.e widget = i(getChildAt(i2));
            if (widget != null) {
                widget.f0();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < count; i3++) {
                View view = getChildAt(i3);
                try {
                    String IdAsString = getResources().getResourceName(view.getId());
                    q(0, IdAsString, Integer.valueOf(view.getId()));
                    int slashIndex = IdAsString.indexOf(47);
                    if (slashIndex != -1) {
                        IdAsString = IdAsString.substring(slashIndex + 1);
                    }
                    g(view.getId()).k0(IdAsString);
                } catch (Resources.NotFoundException e2) {
                }
            }
        }
        if (this.m != -1) {
            for (int i4 = 0; i4 < count; i4++) {
                View child = getChildAt(i4);
                if (child.getId() == this.m && (child instanceof a.f.c.f)) {
                    this.k = ((a.f.c.f) child).getConstraintSet();
                }
            }
        }
        a.f.c.e eVar = this.k;
        if (eVar != null) {
            eVar.c(this, true);
        }
        this.f1625d.c1();
        int helperCount = this.f1624c.size();
        if (helperCount > 0) {
            for (int i5 = 0; i5 < helperCount; i5++) {
                this.f1624c.get(i5).l(this);
            }
        }
        for (int i6 = 0; i6 < count; i6++) {
            View child2 = getChildAt(i6);
            if (child2 instanceof i) {
                ((i) child2).b(this);
            }
        }
        this.q.clear();
        this.q.put(0, this.f1625d);
        this.q.put(getId(), this.f1625d);
        for (int i7 = 0; i7 < count; i7++) {
            View child3 = getChildAt(i7);
            this.q.put(child3.getId(), i(child3));
        }
        for (int i8 = 0; i8 < count; i8++) {
            View child4 = getChildAt(i8);
            a.f.b.i.e widget2 = i(child4);
            if (widget2 != null) {
                a layoutParams = (a) child4.getLayoutParams();
                this.f1625d.Y0(widget2);
                c(isInEditMode, child4, widget2, layoutParams, this.q);
            }
        }
    }

    public void c(boolean isInEditMode, View child, a.f.b.i.e widget, a layoutParams, SparseArray<a.f.b.i.e> sparseArray) {
        int resolveGoneRightMargin;
        float resolvedHorizontalBias;
        int resolvedRightToRight;
        a.f.b.i.e target;
        a.f.b.i.e target2;
        a.f.b.i.e target3;
        a.f.b.i.e target4;
        layoutParams.a();
        widget.R0(child.getVisibility());
        if (layoutParams.a0) {
            widget.B0(true);
            widget.R0(8);
        }
        widget.j0(child);
        if (child instanceof c) {
            ((c) child).h(widget, this.f1625d.w1());
        }
        if (layoutParams.Y) {
            g guideline = (g) widget;
            int resolvedGuideBegin = layoutParams.j0;
            int resolvedGuideEnd = layoutParams.k0;
            float resolvedGuidePercent = layoutParams.l0;
            if (resolvedGuidePercent != -1.0f) {
                guideline.g1(resolvedGuidePercent);
            } else if (resolvedGuideBegin != -1) {
                guideline.e1(resolvedGuideBegin);
            } else if (resolvedGuideEnd != -1) {
                guideline.f1(resolvedGuideEnd);
            }
        } else {
            int resolvedLeftToLeft = layoutParams.c0;
            int resolvedLeftToRight = layoutParams.d0;
            int resolvedRightToLeft = layoutParams.e0;
            int resolvedRightToRight2 = layoutParams.f0;
            int resolveGoneLeftMargin = layoutParams.g0;
            int resolveGoneRightMargin2 = layoutParams.h0;
            float resolvedHorizontalBias2 = layoutParams.i0;
            int i2 = layoutParams.m;
            if (i2 != -1) {
                a.f.b.i.e target5 = sparseArray.get(i2);
                if (target5 != null) {
                    widget.h(target5, layoutParams.o, layoutParams.n);
                }
            } else {
                if (resolvedLeftToLeft != -1) {
                    a.f.b.i.e target6 = sparseArray.get(resolvedLeftToLeft);
                    if (target6 != null) {
                        d.a aVar = d.a.LEFT;
                        resolvedHorizontalBias = resolvedHorizontalBias2;
                        resolveGoneRightMargin = resolveGoneRightMargin2;
                        resolvedRightToRight = resolvedRightToRight2;
                        widget.V(aVar, target6, aVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, resolveGoneLeftMargin);
                    } else {
                        resolvedHorizontalBias = resolvedHorizontalBias2;
                        resolveGoneRightMargin = resolveGoneRightMargin2;
                        resolvedRightToRight = resolvedRightToRight2;
                    }
                } else {
                    resolvedHorizontalBias = resolvedHorizontalBias2;
                    resolveGoneRightMargin = resolveGoneRightMargin2;
                    resolvedRightToRight = resolvedRightToRight2;
                    if (!(resolvedLeftToRight == -1 || (target4 = sparseArray.get(resolvedLeftToRight)) == null)) {
                        widget.V(d.a.LEFT, target4, d.a.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, resolveGoneLeftMargin);
                    }
                }
                if (resolvedRightToLeft != -1) {
                    a.f.b.i.e target7 = sparseArray.get(resolvedRightToLeft);
                    if (target7 != null) {
                        widget.V(d.a.RIGHT, target7, d.a.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolveGoneRightMargin);
                    }
                } else if (!(resolvedRightToRight == -1 || (target3 = sparseArray.get(resolvedRightToRight)) == null)) {
                    d.a aVar2 = d.a.RIGHT;
                    widget.V(aVar2, target3, aVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolveGoneRightMargin);
                }
                int i3 = layoutParams.h;
                if (i3 != -1) {
                    a.f.b.i.e target8 = sparseArray.get(i3);
                    if (target8 != null) {
                        d.a aVar3 = d.a.TOP;
                        widget.V(aVar3, target8, aVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.u);
                    }
                } else {
                    int i4 = layoutParams.i;
                    if (!(i4 == -1 || (target2 = sparseArray.get(i4)) == null)) {
                        widget.V(d.a.TOP, target2, d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.u);
                    }
                }
                int i5 = layoutParams.j;
                if (i5 != -1) {
                    a.f.b.i.e target9 = sparseArray.get(i5);
                    if (target9 != null) {
                        widget.V(d.a.BOTTOM, target9, d.a.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.w);
                    }
                } else {
                    int i6 = layoutParams.k;
                    if (!(i6 == -1 || (target = sparseArray.get(i6)) == null)) {
                        d.a aVar4 = d.a.BOTTOM;
                        widget.V(aVar4, target, aVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.w);
                    }
                }
                int i7 = layoutParams.l;
                if (i7 != -1) {
                    View view = this.f1623b.get(i7);
                    a.f.b.i.e target10 = sparseArray.get(layoutParams.l);
                    if (!(target10 == null || view == null || !(view.getLayoutParams() instanceof a))) {
                        a targetParams = (a) view.getLayoutParams();
                        layoutParams.X = true;
                        targetParams.X = true;
                        widget.k(d.a.BASELINE).a(target10.k(d.a.BASELINE), 0, -1, true);
                        widget.s0(true);
                        targetParams.m0.s0(true);
                        widget.k(d.a.TOP).p();
                        widget.k(d.a.BOTTOM).p();
                    }
                }
                if (resolvedHorizontalBias >= 0.0f) {
                    widget.u0(resolvedHorizontalBias);
                }
                float f2 = layoutParams.A;
                if (f2 >= 0.0f) {
                    widget.L0(f2);
                }
            }
            if (isInEditMode && !(layoutParams.P == -1 && layoutParams.Q == -1)) {
                widget.J0(layoutParams.P, layoutParams.Q);
            }
            if (layoutParams.V) {
                widget.x0(e.a.FIXED);
                widget.S0(((ViewGroup.MarginLayoutParams) layoutParams).width);
                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                    widget.x0(e.a.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                if (layoutParams.S) {
                    widget.x0(e.a.MATCH_CONSTRAINT);
                } else {
                    widget.x0(e.a.MATCH_PARENT);
                }
                widget.k(d.a.LEFT).f614g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                widget.k(d.a.RIGHT).f614g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                widget.x0(e.a.MATCH_CONSTRAINT);
                widget.S0(0);
            }
            if (layoutParams.W) {
                widget.O0(e.a.FIXED);
                widget.t0(((ViewGroup.MarginLayoutParams) layoutParams).height);
                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                    widget.O0(e.a.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                if (layoutParams.T) {
                    widget.O0(e.a.MATCH_CONSTRAINT);
                } else {
                    widget.O0(e.a.MATCH_PARENT);
                }
                widget.k(d.a.TOP).f614g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                widget.k(d.a.BOTTOM).f614g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                widget.O0(e.a.MATCH_CONSTRAINT);
                widget.t0(0);
            }
            widget.l0(layoutParams.B);
            widget.z0(layoutParams.D);
            widget.Q0(layoutParams.E);
            widget.v0(layoutParams.F);
            widget.M0(layoutParams.G);
            widget.y0(layoutParams.H, layoutParams.J, layoutParams.L, layoutParams.N);
            widget.P0(layoutParams.I, layoutParams.K, layoutParams.M, layoutParams.O);
        }
    }

    public final a.f.b.i.e g(int id) {
        if (id == 0) {
            return this.f1625d;
        }
        View view = this.f1623b.get(id);
        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1625d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).m0;
    }

    public final a.f.b.i.e i(View view) {
        if (view == this) {
            return this.f1625d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).m0;
    }

    public void o(f layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int paddingX;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingY = Math.max(0, getPaddingTop());
        int paddingBottom = Math.max(0, getPaddingBottom());
        int paddingHeight = paddingY + paddingBottom;
        int paddingWidth = getPaddingWidth();
        this.r.a(widthMeasureSpec, heightMeasureSpec, paddingY, paddingBottom, paddingWidth, paddingHeight);
        int paddingStart = Math.max(0, getPaddingStart());
        int paddingEnd = Math.max(0, getPaddingEnd());
        if (paddingStart <= 0 && paddingEnd <= 0) {
            paddingX = Math.max(0, getPaddingLeft());
        } else if (k()) {
            paddingX = paddingEnd;
        } else {
            paddingX = paddingStart;
        }
        int widthSize2 = widthSize - paddingWidth;
        int heightSize2 = heightSize - paddingHeight;
        r(layout, widthMode, widthSize2, heightMode, heightSize2);
        layout.y1(optimizationLevel, widthMode, widthSize2, heightMode, heightSize2, this.o, this.p, paddingX, paddingY);
    }

    public void n(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        b bVar = this.r;
        int heightPadding = bVar.f1641e;
        int resolvedWidthSize = ViewGroup.resolveSizeAndState(measuredWidth + bVar.f1640d, widthMeasureSpec, 0);
        int resolvedWidthSize2 = Math.min(this.f1628g, resolvedWidthSize & 16777215);
        int resolvedHeightSize = Math.min(this.h, ViewGroup.resolveSizeAndState(measuredHeight + heightPadding, heightMeasureSpec, 0 << 16) & 16777215);
        if (isWidthMeasuredTooSmall) {
            resolvedWidthSize2 |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            resolvedHeightSize |= 16777216;
        }
        setMeasuredDimension(resolvedWidthSize2, resolvedHeightSize);
        this.o = resolvedWidthSize2;
        this.p = resolvedHeightSize;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.i) {
            if (this.s == widthMeasureSpec && this.t == heightMeasureSpec) {
                n(widthMeasureSpec, heightMeasureSpec, this.f1625d.P(), this.f1625d.t(), this.f1625d.x1(), this.f1625d.v1());
                return;
            } else if (this.s == widthMeasureSpec && View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.t) == Integer.MIN_VALUE && View.MeasureSpec.getSize(heightMeasureSpec) >= this.f1625d.t()) {
                this.s = widthMeasureSpec;
                this.t = heightMeasureSpec;
                n(widthMeasureSpec, heightMeasureSpec, this.f1625d.P(), this.f1625d.t(), this.f1625d.x1(), this.f1625d.v1());
                return;
            }
        }
        this.s = widthMeasureSpec;
        this.t = heightMeasureSpec;
        this.f1625d.E1(k());
        if (this.i) {
            this.i = false;
            if (s()) {
                this.f1625d.G1();
            }
        }
        o(this.f1625d, this.j, widthMeasureSpec, heightMeasureSpec);
        n(widthMeasureSpec, heightMeasureSpec, this.f1625d.P(), this.f1625d.t(), this.f1625d.x1(), this.f1625d.v1());
    }

    public boolean k() {
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    private int getPaddingWidth() {
        int widthPadding = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int rtlPadding = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return rtlPadding > 0 ? rtlPadding : widthPadding;
    }

    public void r(f layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        b bVar = this.r;
        int heightPadding = bVar.f1641e;
        int widthPadding = bVar.f1640d;
        e.a widthBehaviour = e.a.FIXED;
        e.a heightBehaviour = e.a.FIXED;
        int desiredWidth = 0;
        int desiredHeight = 0;
        int childCount = getChildCount();
        if (widthMode == Integer.MIN_VALUE) {
            widthBehaviour = e.a.WRAP_CONTENT;
            desiredWidth = widthSize;
            if (childCount == 0) {
                desiredWidth = Math.max(0, this.f1626e);
            }
        } else if (widthMode == 0) {
            widthBehaviour = e.a.WRAP_CONTENT;
            if (childCount == 0) {
                desiredWidth = Math.max(0, this.f1626e);
            }
        } else if (widthMode == 1073741824) {
            desiredWidth = Math.min(this.f1628g - widthPadding, widthSize);
        }
        if (heightMode == Integer.MIN_VALUE) {
            heightBehaviour = e.a.WRAP_CONTENT;
            desiredHeight = heightSize;
            if (childCount == 0) {
                desiredHeight = Math.max(0, this.f1627f);
            }
        } else if (heightMode == 0) {
            heightBehaviour = e.a.WRAP_CONTENT;
            if (childCount == 0) {
                desiredHeight = Math.max(0, this.f1627f);
            }
        } else if (heightMode == 1073741824) {
            desiredHeight = Math.min(this.h - heightPadding, heightSize);
        }
        if (!(desiredWidth == layout.P() && desiredHeight == layout.t())) {
            layout.u1();
        }
        layout.T0(0);
        layout.U0(0);
        layout.F0(this.f1628g - widthPadding);
        layout.E0(this.h - heightPadding);
        layout.I0(0);
        layout.H0(0);
        layout.x0(widthBehaviour);
        layout.S0(desiredWidth);
        layout.O0(heightBehaviour);
        layout.t0(desiredHeight);
        layout.I0(this.f1626e - widthPadding);
        layout.H0(this.f1627f - heightPadding);
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        int widgetsCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i2 = 0; i2 < widgetsCount; i2++) {
            View child = getChildAt(i2);
            a params = (a) child.getLayoutParams();
            a.f.b.i.e widget = params.m0;
            if ((child.getVisibility() != 8 || params.Y || params.Z || params.b0 || isInEditMode) && !params.a0) {
                int l2 = widget.Q();
                int t2 = widget.R();
                int r2 = widget.P() + l2;
                int b2 = widget.t() + t2;
                child.layout(l2, t2, r2, b2);
                if ((child instanceof i) && (content = ((i) child).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(l2, t2, r2, b2);
                }
            }
        }
        int helperCount = this.f1624c.size();
        if (helperCount > 0) {
            for (int i3 = 0; i3 < helperCount; i3++) {
                this.f1624c.get(i3).i();
            }
        }
    }

    public void setOptimizationLevel(int level) {
        this.j = level;
        this.f1625d.D1(level);
    }

    public int getOptimizationLevel() {
        return this.f1625d.r1();
    }

    /* renamed from: e */
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    /* renamed from: d */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new a(p2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof a;
    }

    public void setConstraintSet(a.f.c.e set) {
        this.k = set;
    }

    public View h(int id) {
        return this.f1623b.get(id);
    }

    public void dispatchDraw(Canvas canvas) {
        float ch;
        float cw;
        int count;
        int helperCount;
        ConstraintLayout constraintLayout = this;
        ArrayList<c> arrayList = constraintLayout.f1624c;
        if (arrayList != null && (helperCount = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                constraintLayout.f1624c.get(i2).k();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int count2 = getChildCount();
            float cw2 = (float) getWidth();
            float ch2 = (float) getHeight();
            int i3 = 0;
            while (i3 < count2) {
                View child = constraintLayout.getChildAt(i3);
                if (child.getVisibility() == 8) {
                    count = count2;
                    cw = cw2;
                    ch = ch2;
                } else {
                    Object tag = child.getTag();
                    if (tag == null || !(tag instanceof String)) {
                        count = count2;
                        cw = cw2;
                        ch = ch2;
                    } else {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int x = Integer.parseInt(split[0]);
                            int x2 = (int) ((((float) x) / 1080.0f) * cw2);
                            int y = (int) ((((float) Integer.parseInt(split[1])) / 1920.0f) * ch2);
                            int w = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * cw2);
                            int h2 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * ch2);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            count = count2;
                            cw = cw2;
                            ch = ch2;
                            canvas.drawLine((float) x2, (float) y, (float) (x2 + w), (float) y, paint);
                            canvas.drawLine((float) (x2 + w), (float) y, (float) (x2 + w), (float) (y + h2), paint);
                            canvas.drawLine((float) (x2 + w), (float) (y + h2), (float) x2, (float) (y + h2), paint);
                            canvas.drawLine((float) x2, (float) (y + h2), (float) x2, (float) y, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine((float) x2, (float) y, (float) (x2 + w), (float) (y + h2), paint);
                            canvas.drawLine((float) x2, (float) (y + h2), (float) (x2 + w), (float) y, paint);
                        } else {
                            count = count2;
                            cw = cw2;
                            ch = ch2;
                        }
                    }
                }
                i3++;
                constraintLayout = this;
                count2 = count;
                cw2 = cw;
                ch2 = ch;
            }
        }
    }

    public void setOnConstraintsChanged(a.f.c.g constraintsChangedListener) {
        a.f.c.d dVar = this.l;
        if (dVar != null) {
            dVar.c(constraintsChangedListener);
        }
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public String U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f1629a;
        public boolean a0;

        /* renamed from: b  reason: collision with root package name */
        public int f1630b;
        public boolean b0;

        /* renamed from: c  reason: collision with root package name */
        public float f1631c;
        public int c0;

        /* renamed from: d  reason: collision with root package name */
        public int f1632d;
        public int d0;

        /* renamed from: e  reason: collision with root package name */
        public int f1633e;
        public int e0;

        /* renamed from: f  reason: collision with root package name */
        public int f1634f;
        public int f0;

        /* renamed from: g  reason: collision with root package name */
        public int f1635g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public float i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public float l0;
        public int m;
        public a.f.b.i.e m0;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0041a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1636a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1636a = sparseIntArray;
                sparseIntArray.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_android_orientation, 1);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f1636a.append(a.f.c.k.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            int commaIndex;
            int i2 = -1;
            this.f1629a = -1;
            this.f1630b = -1;
            this.f1631c = -1.0f;
            this.f1632d = -1;
            this.f1633e = -1;
            this.f1634f = -1;
            this.f1635g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            int i3 = 0;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new a.f.b.i.e();
            TypedArray a2 = c2.obtainStyledAttributes(attrs, a.f.c.k.ConstraintLayout_Layout);
            int N2 = a2.getIndexCount();
            int i4 = 0;
            while (i4 < N2) {
                int attr = a2.getIndex(i4);
                int look = C0041a.f1636a.get(attr);
                switch (look) {
                    case 1:
                        this.R = a2.getInt(attr, this.R);
                        break;
                    case 2:
                        int resourceId = a2.getResourceId(attr, this.m);
                        this.m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.m = a2.getInt(attr, -1);
                            break;
                        }
                    case 3:
                        this.n = a2.getDimensionPixelSize(attr, this.n);
                        break;
                    case 4:
                        float f2 = a2.getFloat(attr, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 >= 0.0f) {
                            break;
                        } else {
                            this.o = (360.0f - f2) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1629a = a2.getDimensionPixelOffset(attr, this.f1629a);
                        break;
                    case 6:
                        this.f1630b = a2.getDimensionPixelOffset(attr, this.f1630b);
                        break;
                    case 7:
                        this.f1631c = a2.getFloat(attr, this.f1631c);
                        break;
                    case 8:
                        int resourceId2 = a2.getResourceId(attr, this.f1632d);
                        this.f1632d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1632d = a2.getInt(attr, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = a2.getResourceId(attr, this.f1633e);
                        this.f1633e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1633e = a2.getInt(attr, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = a2.getResourceId(attr, this.f1634f);
                        this.f1634f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1634f = a2.getInt(attr, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = a2.getResourceId(attr, this.f1635g);
                        this.f1635g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1635g = a2.getInt(attr, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = a2.getResourceId(attr, this.h);
                        this.h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.h = a2.getInt(attr, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = a2.getResourceId(attr, this.i);
                        this.i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.i = a2.getInt(attr, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = a2.getResourceId(attr, this.j);
                        this.j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.j = a2.getInt(attr, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = a2.getResourceId(attr, this.k);
                        this.k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.k = a2.getInt(attr, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = a2.getResourceId(attr, this.l);
                        this.l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.l = a2.getInt(attr, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = a2.getResourceId(attr, this.p);
                        this.p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.p = a2.getInt(attr, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = a2.getResourceId(attr, this.q);
                        this.q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.q = a2.getInt(attr, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = a2.getResourceId(attr, this.r);
                        this.r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.r = a2.getInt(attr, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = a2.getResourceId(attr, this.s);
                        this.s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.s = a2.getInt(attr, -1);
                            break;
                        }
                    case 21:
                        this.t = a2.getDimensionPixelSize(attr, this.t);
                        break;
                    case 22:
                        this.u = a2.getDimensionPixelSize(attr, this.u);
                        break;
                    case 23:
                        this.v = a2.getDimensionPixelSize(attr, this.v);
                        break;
                    case 24:
                        this.w = a2.getDimensionPixelSize(attr, this.w);
                        break;
                    case 25:
                        this.x = a2.getDimensionPixelSize(attr, this.x);
                        break;
                    case 26:
                        this.y = a2.getDimensionPixelSize(attr, this.y);
                        break;
                    case 27:
                        this.S = a2.getBoolean(attr, this.S);
                        break;
                    case 28:
                        this.T = a2.getBoolean(attr, this.T);
                        break;
                    case 29:
                        this.z = a2.getFloat(attr, this.z);
                        break;
                    case 30:
                        this.A = a2.getFloat(attr, this.A);
                        break;
                    case 31:
                        int i5 = a2.getInt(attr, 0);
                        this.H = i5;
                        if (i5 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i6 = a2.getInt(attr, 0);
                        this.I = i6;
                        if (i6 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.J = a2.getDimensionPixelSize(attr, this.J);
                            break;
                        } catch (Exception e2) {
                            if (a2.getInt(attr, this.J) == -2) {
                                this.J = -2;
                            }
                            break;
                        }
                    case 34:
                        try {
                            this.L = a2.getDimensionPixelSize(attr, this.L);
                            break;
                        } catch (Exception e3) {
                            if (a2.getInt(attr, this.L) == -2) {
                                this.L = -2;
                            }
                            break;
                        }
                    case 35:
                        this.N = Math.max(0.0f, a2.getFloat(attr, this.N));
                        this.H = 2;
                        break;
                    case 36:
                        try {
                            this.K = a2.getDimensionPixelSize(attr, this.K);
                            break;
                        } catch (Exception e4) {
                            if (a2.getInt(attr, this.K) == -2) {
                                this.K = -2;
                            }
                            break;
                        }
                    case 37:
                        try {
                            this.M = a2.getDimensionPixelSize(attr, this.M);
                            break;
                        } catch (Exception e5) {
                            if (a2.getInt(attr, this.M) == -2) {
                                this.M = -2;
                            }
                            break;
                        }
                    case 38:
                        this.O = Math.max(0.0f, a2.getFloat(attr, this.O));
                        this.I = 2;
                        break;
                    default:
                        switch (look) {
                            case 44:
                                String string = a2.getString(attr);
                                this.B = string;
                                this.C = i2;
                                if (string == null) {
                                    break;
                                } else {
                                    int len = string.length();
                                    int commaIndex2 = this.B.indexOf(44);
                                    if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
                                        commaIndex = 0;
                                    } else {
                                        String dimension = this.B.substring(i3, commaIndex2);
                                        if (dimension.equalsIgnoreCase("W")) {
                                            this.C = i3;
                                        } else if (dimension.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        commaIndex = commaIndex2 + 1;
                                    }
                                    int colonIndex = this.B.indexOf(58);
                                    if (colonIndex < 0 || colonIndex >= len - 1) {
                                        String r2 = this.B.substring(commaIndex);
                                        if (r2.length() > 0) {
                                            try {
                                                Float.parseFloat(r2);
                                            } catch (NumberFormatException e6) {
                                            }
                                        }
                                    } else {
                                        String nominator = this.B.substring(commaIndex, colonIndex);
                                        String denominator = this.B.substring(colonIndex + 1);
                                        if (nominator.length() > 0 && denominator.length() > 0) {
                                            try {
                                                float nominatorValue = Float.parseFloat(nominator);
                                                float denominatorValue = Float.parseFloat(denominator);
                                                if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(denominatorValue / nominatorValue);
                                                    } else {
                                                        Math.abs(nominatorValue / denominatorValue);
                                                    }
                                                }
                                            } catch (NumberFormatException e7) {
                                            }
                                        }
                                    }
                                    continue;
                                }
                            case 45:
                                this.D = a2.getFloat(attr, this.D);
                                continue;
                            case 46:
                                this.E = a2.getFloat(attr, this.E);
                                continue;
                            case 47:
                                this.F = a2.getInt(attr, i3);
                                continue;
                            case 48:
                                this.G = a2.getInt(attr, i3);
                                continue;
                            case 49:
                                this.P = a2.getDimensionPixelOffset(attr, this.P);
                                continue;
                            case 50:
                                this.Q = a2.getDimensionPixelOffset(attr, this.Q);
                                continue;
                            case 51:
                                this.U = a2.getString(attr);
                                continue;
                            default:
                                continue;
                        }
                }
                i4++;
                i2 = -1;
                i3 = 0;
            }
            a2.recycle();
            a();
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f1631c != -1.0f || this.f1629a != -1 || this.f1630b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.m0 instanceof g)) {
                    this.m0 = new g();
                }
                ((g) this.m0).h1(this.R);
            }
        }

        public a(int width, int height) {
            super(width, height);
            this.f1629a = -1;
            this.f1630b = -1;
            this.f1631c = -1.0f;
            this.f1632d = -1;
            this.f1633e = -1;
            this.f1634f = -1;
            this.f1635g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new a.f.b.i.e();
        }

        public a(ViewGroup.LayoutParams source) {
            super(source);
            this.f1629a = -1;
            this.f1630b = -1;
            this.f1631c = -1.0f;
            this.f1632d = -1;
            this.f1633e = -1;
            this.f1634f = -1;
            this.f1635g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new a.f.b.i.e();
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int layoutDirection) {
            int preLeftMargin = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int preRightMargin = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(layoutDirection);
            boolean isRtl = 1 == getLayoutDirection();
            this.e0 = -1;
            this.f0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.g0 = this.t;
            this.h0 = this.v;
            this.i0 = this.z;
            this.j0 = this.f1629a;
            this.k0 = this.f1630b;
            this.l0 = this.f1631c;
            if (isRtl) {
                boolean startEndDefined = false;
                int i2 = this.p;
                if (i2 != -1) {
                    this.e0 = i2;
                    startEndDefined = true;
                } else {
                    int i3 = this.q;
                    if (i3 != -1) {
                        this.f0 = i3;
                        startEndDefined = true;
                    }
                }
                int i4 = this.r;
                if (i4 != -1) {
                    this.d0 = i4;
                    startEndDefined = true;
                }
                int i5 = this.s;
                if (i5 != -1) {
                    this.c0 = i5;
                    startEndDefined = true;
                }
                int i6 = this.x;
                if (i6 != -1) {
                    this.h0 = i6;
                }
                int i7 = this.y;
                if (i7 != -1) {
                    this.g0 = i7;
                }
                if (startEndDefined) {
                    this.i0 = 1.0f - this.z;
                }
                if (this.Y && this.R == 1) {
                    float f2 = this.f1631c;
                    if (f2 != -1.0f) {
                        this.l0 = 1.0f - f2;
                        this.j0 = -1;
                        this.k0 = -1;
                    } else {
                        int i8 = this.f1629a;
                        if (i8 != -1) {
                            this.k0 = i8;
                            this.j0 = -1;
                            this.l0 = -1.0f;
                        } else {
                            int i9 = this.f1630b;
                            if (i9 != -1) {
                                this.j0 = i9;
                                this.k0 = -1;
                                this.l0 = -1.0f;
                            }
                        }
                    }
                }
            } else {
                int i10 = this.p;
                if (i10 != -1) {
                    this.d0 = i10;
                }
                int i11 = this.q;
                if (i11 != -1) {
                    this.c0 = i11;
                }
                int i12 = this.r;
                if (i12 != -1) {
                    this.e0 = i12;
                }
                int i13 = this.s;
                if (i13 != -1) {
                    this.f0 = i13;
                }
                int i14 = this.x;
                if (i14 != -1) {
                    this.g0 = i14;
                }
                int i15 = this.y;
                if (i15 != -1) {
                    this.h0 = i15;
                }
            }
            if (this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
                int i16 = this.f1634f;
                if (i16 != -1) {
                    this.e0 = i16;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                    }
                } else {
                    int i17 = this.f1635g;
                    if (i17 != -1) {
                        this.f0 = i17;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                        }
                    }
                }
                int i18 = this.f1632d;
                if (i18 != -1) {
                    this.c0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                        return;
                    }
                    return;
                }
                int i19 = this.f1633e;
                if (i19 != -1) {
                    this.d0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                    }
                }
            }
        }
    }

    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final void l() {
        this.i = true;
        this.o = -1;
        this.p = -1;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
