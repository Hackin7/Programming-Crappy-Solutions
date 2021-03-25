package androidx.appcompat.widget;

import a.b.o.j.g;
import a.b.o.j.i;
import a.b.o.j.m;
import a.b.o.j.n;
import a.b.p.d1;
import a.b.p.i0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;

public class ActionMenuView extends i0 implements g.b, n {
    public int A;
    public e B;
    public g q;
    public Context r;
    public int s;
    public boolean t;
    public a.b.p.c u;
    public m.a v;
    public g.a w;
    public boolean x;
    public int y;
    public int z;

    public interface a {
        boolean a();

        boolean b();
    }

    public interface e {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBaselineAligned(false);
        float density = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * density);
        this.A = (int) (4.0f * density);
        this.r = context;
        this.s = 0;
    }

    public void setPopupTheme(int resId) {
        if (this.s != resId) {
            this.s = resId;
            if (resId == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.s;
    }

    public void setPresenter(a.b.p.c presenter) {
        this.u = presenter;
        presenter.H(this);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        a.b.p.c cVar = this.u;
        if (cVar != null) {
            cVar.j(false);
            if (this.u.E()) {
                this.u.B();
                this.u.K();
            }
        }
    }

    public void setOnMenuItemClickListener(e listener) {
        this.B = listener;
    }

    @Override // a.b.p.i0
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        g gVar;
        boolean wasFormatted = this.x;
        boolean z2 = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        this.x = z2;
        if (wasFormatted != z2) {
            this.y = 0;
        }
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (!(!this.x || (gVar = this.q) == null || widthSize == this.y)) {
            this.y = widthSize;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.x || childCount <= 0) {
            for (int i = 0; i < childCount; i++) {
                c lp = (c) getChildAt(i).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) lp).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) lp).leftMargin = 0;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        M(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02bd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void M(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize;
        int heightMode;
        boolean needsExpansion;
        boolean needsExpansion2;
        int heightSize;
        int visibleItemCount;
        int visibleItemCount2;
        ?? r3;
        int heightMode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int widthSize2 = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightSize2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int widthPadding = getPaddingLeft() + getPaddingRight();
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int itemHeightSpec = ViewGroup.getChildMeasureSpec(heightMeasureSpec, heightPadding, -2);
        int widthSize3 = widthSize2 - widthPadding;
        int i = this.z;
        int cellCount = widthSize3 / i;
        int cellSizeRemaining = widthSize3 % i;
        if (cellCount == 0) {
            setMeasuredDimension(widthSize3, 0);
            return;
        }
        int cellSize = i + (cellSizeRemaining / cellCount);
        int cellsRemaining = cellCount;
        int maxChildHeight = 0;
        int maxCellsUsed = 0;
        int expandableItemCount = 0;
        boolean hasOverflow = false;
        long smallestItemsAt = 0;
        int childCount = getChildCount();
        int maxChildHeight2 = 0;
        int i2 = 0;
        while (i2 < childCount) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                boolean isGeneratedItem = child instanceof ActionMenuItemView;
                int visibleItemCount3 = maxChildHeight2 + 1;
                if (isGeneratedItem) {
                    int i3 = this.A;
                    visibleItemCount2 = visibleItemCount3;
                    r3 = 0;
                    child.setPadding(i3, 0, i3, 0);
                } else {
                    visibleItemCount2 = visibleItemCount3;
                    r3 = 0;
                }
                c lp = (c) child.getLayoutParams();
                lp.h = r3;
                int i4 = r3 == true ? 1 : 0;
                int i5 = r3 == true ? 1 : 0;
                int i6 = r3 == true ? 1 : 0;
                lp.f1555e = i4;
                lp.f1554d = r3;
                lp.f1556f = r3;
                ((ViewGroup.MarginLayoutParams) lp).leftMargin = r3;
                ((ViewGroup.MarginLayoutParams) lp).rightMargin = r3;
                lp.f1557g = isGeneratedItem && ((ActionMenuItemView) child).f();
                int cellsUsed = L(child, cellSize, lp.f1553c ? 1 : cellsRemaining, itemHeightSpec, heightPadding);
                maxCellsUsed = Math.max(maxCellsUsed, cellsUsed);
                if (lp.f1556f) {
                    expandableItemCount++;
                }
                if (lp.f1553c) {
                    hasOverflow = true;
                }
                cellsRemaining -= cellsUsed;
                int maxChildHeight3 = Math.max(maxChildHeight, child.getMeasuredHeight());
                if (cellsUsed == 1) {
                    maxChildHeight = maxChildHeight3;
                    smallestItemsAt |= (long) (1 << i2);
                    maxChildHeight2 = visibleItemCount2;
                } else {
                    maxChildHeight = maxChildHeight3;
                    maxChildHeight2 = visibleItemCount2;
                }
            }
            i2++;
            cellCount = cellCount;
            cellSizeRemaining = cellSizeRemaining;
        }
        boolean centerSingleExpandedItem = hasOverflow && maxChildHeight2 == 2;
        boolean needsExpansion3 = false;
        while (true) {
            if (expandableItemCount <= 0 || cellsRemaining <= 0) {
                heightMode = heightMode2;
                widthSize = widthSize3;
                needsExpansion = needsExpansion3;
            } else {
                int minCells = Integer.MAX_VALUE;
                long minCellsAt = 0;
                int minCellsItemCount = 0;
                int i7 = 0;
                while (i7 < childCount) {
                    c lp2 = (c) getChildAt(i7).getLayoutParams();
                    if (lp2.f1556f) {
                        int i8 = lp2.f1554d;
                        if (i8 < minCells) {
                            minCells = lp2.f1554d;
                            minCellsAt = 1 << i7;
                            minCellsItemCount = 1;
                        } else if (i8 == minCells) {
                            minCellsAt |= 1 << i7;
                            minCellsItemCount++;
                        }
                    }
                    i7++;
                    expandableItemCount = expandableItemCount;
                    needsExpansion3 = needsExpansion3;
                }
                needsExpansion = needsExpansion3;
                smallestItemsAt |= minCellsAt;
                if (minCellsItemCount > cellsRemaining) {
                    heightMode = heightMode2;
                    widthSize = widthSize3;
                    break;
                }
                int minCells2 = minCells + 1;
                int i9 = 0;
                while (i9 < childCount) {
                    View child2 = getChildAt(i9);
                    c lp3 = (c) child2.getLayoutParams();
                    if ((minCellsAt & ((long) (1 << i9))) != 0) {
                        if (centerSingleExpandedItem && lp3.f1557g && cellsRemaining == 1) {
                            int i10 = this.A;
                            child2.setPadding(i10 + cellSize, 0, i10, 0);
                        }
                        lp3.f1554d++;
                        lp3.h = true;
                        cellsRemaining--;
                    } else if (lp3.f1554d == minCells2) {
                        smallestItemsAt |= (long) (1 << i9);
                    }
                    i9++;
                    minCellsItemCount = minCellsItemCount;
                    heightMode2 = heightMode2;
                    widthSize3 = widthSize3;
                }
                needsExpansion3 = true;
                heightPadding = heightPadding;
                expandableItemCount = expandableItemCount;
            }
        }
        heightMode = heightMode2;
        widthSize = widthSize3;
        needsExpansion = needsExpansion3;
        boolean singleItem = !hasOverflow && maxChildHeight2 == 1;
        if (cellsRemaining > 0 && smallestItemsAt != 0) {
            if (cellsRemaining < maxChildHeight2 - 1 || singleItem || maxCellsUsed > 1) {
                float expandCount = (float) Long.bitCount(smallestItemsAt);
                if (!singleItem) {
                    if ((smallestItemsAt & 1) != 0) {
                        if (!((c) getChildAt(0).getLayoutParams()).f1557g) {
                            expandCount -= 0.5f;
                        }
                    }
                    if ((smallestItemsAt & ((long) (1 << (childCount - 1)))) != 0 && !((c) getChildAt(childCount - 1).getLayoutParams()).f1557g) {
                        expandCount -= 0.5f;
                    }
                }
                int extraPixels = expandCount > 0.0f ? (int) (((float) (cellsRemaining * cellSize)) / expandCount) : 0;
                int i11 = 0;
                needsExpansion2 = needsExpansion;
                while (i11 < childCount) {
                    if ((smallestItemsAt & ((long) (1 << i11))) != 0) {
                        View child3 = getChildAt(i11);
                        c lp4 = (c) child3.getLayoutParams();
                        if (child3 instanceof ActionMenuItemView) {
                            lp4.f1555e = extraPixels;
                            lp4.h = true;
                            if (i11 == 0 && !lp4.f1557g) {
                                ((ViewGroup.MarginLayoutParams) lp4).leftMargin = (-extraPixels) / 2;
                            }
                            needsExpansion2 = true;
                        } else if (lp4.f1553c) {
                            lp4.f1555e = extraPixels;
                            lp4.h = true;
                            ((ViewGroup.MarginLayoutParams) lp4).rightMargin = (-extraPixels) / 2;
                            needsExpansion2 = true;
                        } else {
                            if (i11 != 0) {
                                ((ViewGroup.MarginLayoutParams) lp4).leftMargin = extraPixels / 2;
                            }
                            if (i11 != childCount - 1) {
                                ((ViewGroup.MarginLayoutParams) lp4).rightMargin = extraPixels / 2;
                            }
                        }
                    }
                    i11++;
                    singleItem = singleItem;
                    expandCount = expandCount;
                }
                if (!needsExpansion2) {
                    int i12 = 0;
                    while (i12 < childCount) {
                        View child4 = getChildAt(i12);
                        c lp5 = (c) child4.getLayoutParams();
                        if (!lp5.h) {
                            visibleItemCount = maxChildHeight2;
                        } else {
                            visibleItemCount = maxChildHeight2;
                            child4.measure(View.MeasureSpec.makeMeasureSpec((lp5.f1554d * cellSize) + lp5.f1555e, 1073741824), itemHeightSpec);
                        }
                        i12++;
                        maxChildHeight2 = visibleItemCount;
                    }
                }
                if (heightMode == 1073741824) {
                    heightSize = maxChildHeight;
                } else {
                    heightSize = heightSize2;
                }
                setMeasuredDimension(widthSize, heightSize);
            }
        }
        needsExpansion2 = needsExpansion;
        if (!needsExpansion2) {
        }
        if (heightMode == 1073741824) {
        }
        setMeasuredDimension(widthSize, heightSize);
    }

    public static int L(View child, int cellSize, int cellsRemaining, int parentHeightMeasureSpec, int parentHeightPadding) {
        c lp = (c) child.getLayoutParams();
        int childHeightSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(parentHeightMeasureSpec) - parentHeightPadding, View.MeasureSpec.getMode(parentHeightMeasureSpec));
        ActionMenuItemView itemView = child instanceof ActionMenuItemView ? (ActionMenuItemView) child : null;
        boolean expandable = false;
        boolean hasText = itemView != null && itemView.f();
        int cellsUsed = 0;
        if (cellsRemaining > 0 && (!hasText || cellsRemaining >= 2)) {
            child.measure(View.MeasureSpec.makeMeasureSpec(cellSize * cellsRemaining, Integer.MIN_VALUE), childHeightSpec);
            int measuredWidth = child.getMeasuredWidth();
            cellsUsed = measuredWidth / cellSize;
            if (measuredWidth % cellSize != 0) {
                cellsUsed++;
            }
            if (hasText && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        if (!lp.f1553c && hasText) {
            expandable = true;
        }
        lp.f1556f = expandable;
        lp.f1554d = cellsUsed;
        child.measure(View.MeasureSpec.makeMeasureSpec(cellsUsed * cellSize, 1073741824), childHeightSpec);
        return cellsUsed;
    }

    /* JADX INFO: Multiple debug info for r3v9 int: [D('b' int), D('dividerWidth' int)] */
    @Override // a.b.p.i0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i;
        int nonOverflowCount;
        int overflowWidth;
        int dividerWidth;
        int r2;
        int l;
        ActionMenuView actionMenuView = this;
        if (!actionMenuView.x) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int childCount = getChildCount();
        int midVertical = (bottom - top) / 2;
        int dividerWidth2 = getDividerWidth();
        int overflowWidth2 = 0;
        int nonOverflowCount2 = 0;
        int widthRemaining = ((right - left) - getPaddingRight()) - getPaddingLeft();
        int i2 = 0;
        boolean isLayoutRtl = d1.b(this);
        int i3 = 0;
        while (true) {
            i = 8;
            if (i3 >= childCount) {
                break;
            }
            View v2 = actionMenuView.getChildAt(i3);
            if (v2.getVisibility() == 8) {
                dividerWidth = dividerWidth2;
            } else {
                c p = (c) v2.getLayoutParams();
                if (p.f1553c) {
                    overflowWidth2 = v2.getMeasuredWidth();
                    if (actionMenuView.G(i3)) {
                        overflowWidth2 += dividerWidth2;
                    }
                    int height = v2.getMeasuredHeight();
                    if (isLayoutRtl) {
                        l = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) p).leftMargin;
                        r2 = l + overflowWidth2;
                    } else {
                        r2 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) p).rightMargin;
                        l = r2 - overflowWidth2;
                    }
                    int t2 = midVertical - (height / 2);
                    dividerWidth = dividerWidth2;
                    v2.layout(l, t2, r2, t2 + height);
                    widthRemaining -= overflowWidth2;
                    i2 = 1;
                } else {
                    dividerWidth = dividerWidth2;
                    widthRemaining -= (v2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) p).leftMargin) + ((ViewGroup.MarginLayoutParams) p).rightMargin;
                    actionMenuView.G(i3);
                    nonOverflowCount2++;
                }
            }
            i3++;
            dividerWidth2 = dividerWidth;
        }
        if (childCount == 1 && i2 == 0) {
            View v3 = actionMenuView.getChildAt(0);
            int width = v3.getMeasuredWidth();
            int height2 = v3.getMeasuredHeight();
            int l2 = ((right - left) / 2) - (width / 2);
            int t3 = midVertical - (height2 / 2);
            v3.layout(l2, t3, l2 + width, t3 + height2);
            return;
        }
        int spacerCount = nonOverflowCount2 - (i2 ^ 1);
        int spacerSize = Math.max(0, spacerCount > 0 ? widthRemaining / spacerCount : 0);
        if (isLayoutRtl) {
            int startRight = getWidth() - getPaddingRight();
            int i4 = 0;
            while (i4 < childCount) {
                View v4 = actionMenuView.getChildAt(i4);
                c lp = (c) v4.getLayoutParams();
                if (v4.getVisibility() == i) {
                    overflowWidth = overflowWidth2;
                    nonOverflowCount = nonOverflowCount2;
                } else if (lp.f1553c) {
                    overflowWidth = overflowWidth2;
                    nonOverflowCount = nonOverflowCount2;
                } else {
                    int startRight2 = startRight - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                    int width2 = v4.getMeasuredWidth();
                    int height3 = v4.getMeasuredHeight();
                    int t4 = midVertical - (height3 / 2);
                    overflowWidth = overflowWidth2;
                    nonOverflowCount = nonOverflowCount2;
                    v4.layout(startRight2 - width2, t4, startRight2, t4 + height3);
                    startRight = startRight2 - ((((ViewGroup.MarginLayoutParams) lp).leftMargin + width2) + spacerSize);
                }
                i4++;
                overflowWidth2 = overflowWidth;
                nonOverflowCount2 = nonOverflowCount;
                i = 8;
            }
            return;
        }
        int startLeft = getPaddingLeft();
        int i5 = 0;
        while (i5 < childCount) {
            View v5 = actionMenuView.getChildAt(i5);
            c lp2 = (c) v5.getLayoutParams();
            if (v5.getVisibility() != 8 && !lp2.f1553c) {
                int startLeft2 = startLeft + ((ViewGroup.MarginLayoutParams) lp2).leftMargin;
                int width3 = v5.getMeasuredWidth();
                int height4 = v5.getMeasuredHeight();
                int t5 = midVertical - (height4 / 2);
                v5.layout(startLeft2, t5, startLeft2 + width3, t5 + height4);
                startLeft = startLeft2 + ((ViewGroup.MarginLayoutParams) lp2).rightMargin + width3 + spacerSize;
            }
            i5++;
            actionMenuView = this;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    public void setOverflowIcon(Drawable icon) {
        getMenu();
        this.u.I(icon);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.u.A();
    }

    public boolean K() {
        return this.t;
    }

    public void setOverflowReserved(boolean reserveOverflow) {
        this.t = reserveOverflow;
    }

    /* renamed from: C */
    public c m() {
        c params = new c(-2, -2);
        params.f341b = 16;
        return params;
    }

    /* renamed from: D */
    public c n(AttributeSet attrs) {
        return new c(getContext(), attrs);
    }

    /* renamed from: E */
    public c o(ViewGroup.LayoutParams p) {
        c result;
        if (p == null) {
            return m();
        }
        if (p instanceof c) {
            result = new c((c) p);
        } else {
            result = new c(p);
        }
        if (result.f341b <= 0) {
            result.f341b = 16;
        }
        return result;
    }

    @Override // a.b.p.i0
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof c;
    }

    public c F() {
        c result = m();
        result.f1553c = true;
        return result;
    }

    @Override // a.b.o.j.g.b
    public boolean a(i item) {
        return this.q.L(item, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // a.b.o.j.n
    public void b(g menu) {
        this.q = menu;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.q = gVar;
            gVar.R(new d());
            a.b.p.c cVar = new a.b.p.c(context);
            this.u = cVar;
            cVar.J(true);
            a.b.p.c cVar2 = this.u;
            m.a aVar = this.v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.h(aVar);
            this.q.c(this.u, this.r);
            this.u.H(this);
        }
        return this.q;
    }

    public void O(m.a pcb, g.a mcb) {
        this.v = pcb;
        this.w = mcb;
    }

    public g N() {
        return this.q;
    }

    public boolean P() {
        a.b.p.c cVar = this.u;
        return cVar != null && cVar.K();
    }

    public boolean H() {
        a.b.p.c cVar = this.u;
        return cVar != null && cVar.B();
    }

    public boolean J() {
        a.b.p.c cVar = this.u;
        return cVar != null && cVar.E();
    }

    public boolean I() {
        a.b.p.c cVar = this.u;
        return cVar != null && cVar.D();
    }

    public void B() {
        a.b.p.c cVar = this.u;
        if (cVar != null) {
            cVar.y();
        }
    }

    public boolean G(int childIndex) {
        if (childIndex == 0) {
            return false;
        }
        View childBefore = getChildAt(childIndex - 1);
        View child = getChildAt(childIndex);
        boolean result = false;
        if (childIndex < getChildCount() && (childBefore instanceof a)) {
            result = false | ((a) childBefore).a();
        }
        if (childIndex <= 0 || !(child instanceof a)) {
            return result;
        }
        return result | ((a) child).b();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean exclusive) {
        this.u.G(exclusive);
    }

    public class d implements g.a {
        public d() {
        }

        @Override // a.b.o.j.g.a
        public boolean a(g menu, MenuItem item) {
            e eVar = ActionMenuView.this.B;
            return eVar != null && ((Toolbar.a) eVar).a(item);
        }

        @Override // a.b.o.j.g.a
        public void b(g menu) {
            g.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.b(menu);
            }
        }
    }

    public static class b implements m.a {
        @Override // a.b.o.j.m.a
        public void a(g menu, boolean allMenusAreClosing) {
        }

        @Override // a.b.o.j.m.a
        public boolean b(g subMenu) {
            return false;
        }
    }

    public static class c extends i0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f1553c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f1554d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f1555e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f1556f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f1557g;
        public boolean h;

        public c(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public c(ViewGroup.LayoutParams other) {
            super(other);
        }

        public c(c other) {
            super(other);
            this.f1553c = other.f1553c;
        }

        public c(int width, int height) {
            super(width, height);
            this.f1553c = false;
        }
    }
}
