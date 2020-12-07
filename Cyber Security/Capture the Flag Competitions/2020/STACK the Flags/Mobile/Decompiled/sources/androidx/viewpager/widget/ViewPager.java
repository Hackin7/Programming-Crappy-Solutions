package androidx.viewpager.widget;

import a.h.m.b0;
import a.h.m.p;
import a.h.m.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class ViewPager extends ViewGroup {
    public static final int[] b0 = {16842931};
    public static final Comparator<f> c0 = new a();
    public static final Interpolator d0 = new b();
    public static final m e0 = new m();
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public int H = -1;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public int M;
    public EdgeEffect N;
    public EdgeEffect O;
    public boolean P = true;
    public boolean Q;
    public int R;
    public List<j> S;
    public j T;
    public List<i> U;
    public ArrayList<View> V;
    public final Runnable W = new c();
    public int a0 = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1843b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<f> f1844c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final f f1845d = new f();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1846e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public a.u.a.a f1847f;

    /* renamed from: g  reason: collision with root package name */
    public int f1848g;
    public int h = -1;
    public Parcelable i = null;
    public ClassLoader j = null;
    public Scroller k;
    public boolean l;
    public k m;
    public int n;
    public Drawable o;
    public int p;
    public int q;
    public float r = -3.4028235E38f;
    public float s = Float.MAX_VALUE;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x = 1;
    public boolean y;
    public boolean z;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f1852a;

        /* renamed from: b  reason: collision with root package name */
        public int f1853b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1854c;

        /* renamed from: d  reason: collision with root package name */
        public float f1855d;

        /* renamed from: e  reason: collision with root package name */
        public float f1856e;
    }

    public interface i {
        void a(ViewPager viewPager, a.u.a.a aVar, a.u.a.a aVar2);
    }

    public interface j {
        void a(int i, float f2, int i2);

        void b(int i);

        void c(int i);
    }

    public static class a implements Comparator<f> {
        /* renamed from: a */
        public int compare(f lhs, f rhs) {
            return lhs.f1853b - rhs.f1853b;
        }
    }

    public static class b implements Interpolator {
        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.H();
        }
    }

    public ViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        y();
    }

    public void y() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.k = new Scroller(context, d0);
        ViewConfiguration configuration = ViewConfiguration.get(context);
        float density = context.getResources().getDisplayMetrics().density;
        this.C = configuration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * density);
        this.K = configuration.getScaledMaximumFlingVelocity();
        this.N = new EdgeEffect(context);
        this.O = new EdgeEffect(context);
        this.L = (int) (25.0f * density);
        this.M = (int) (2.0f * density);
        this.A = (int) (16.0f * density);
        s.Z(this, new h());
        if (s.t(this) == 0) {
            s.h0(this, 1);
        }
        s.j0(this, new d());
    }

    public class d implements p {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f1850a = new Rect();

        public d() {
        }

        @Override // a.h.m.p
        public b0 a(View v, b0 originalInsets) {
            b0 applied = s.R(v, originalInsets);
            if (applied.k()) {
                return applied;
            }
            Rect res = this.f1850a;
            res.left = applied.e();
            res.top = applied.g();
            res.right = applied.f();
            res.bottom = applied.d();
            int count = ViewPager.this.getChildCount();
            for (int i = 0; i < count; i++) {
                b0 childInsets = s.f(ViewPager.this.getChildAt(i), applied);
                res.left = Math.min(childInsets.e(), res.left);
                res.top = Math.min(childInsets.g(), res.top);
                res.right = Math.min(childInsets.f(), res.right);
                res.bottom = Math.min(childInsets.d(), res.bottom);
            }
            return applied.l(res.left, res.top, res.right, res.bottom);
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.W);
        Scroller scroller = this.k;
        if (scroller != null && !scroller.isFinished()) {
            this.k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void setScrollState(int newState) {
        if (this.a0 != newState) {
            this.a0 = newState;
            p(newState);
        }
    }

    public void setAdapter(a.u.a.a adapter) {
        a.u.a.a aVar = this.f1847f;
        if (aVar != null) {
            aVar.setViewPagerObserver(null);
            this.f1847f.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.f1844c.size(); i2++) {
                f ii = this.f1844c.get(i2);
                this.f1847f.destroyItem((ViewGroup) this, ii.f1853b, ii.f1852a);
            }
            this.f1847f.finishUpdate((ViewGroup) this);
            this.f1844c.clear();
            K();
            this.f1848g = 0;
            scrollTo(0, 0);
        }
        a.u.a.a oldAdapter = this.f1847f;
        this.f1847f = adapter;
        this.f1843b = 0;
        if (adapter != null) {
            if (this.m == null) {
                this.m = new k();
            }
            this.f1847f.setViewPagerObserver(this.m);
            this.w = false;
            boolean wasFirstLayout = this.P;
            this.P = true;
            this.f1843b = this.f1847f.getCount();
            if (this.h >= 0) {
                this.f1847f.restoreState(this.i, this.j);
                R(this.h, false, true);
                this.h = -1;
                this.i = null;
                this.j = null;
            } else if (!wasFirstLayout) {
                H();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.U;
        if (!(list == null || list.isEmpty())) {
            int count = this.U.size();
            for (int i3 = 0; i3 < count; i3++) {
                this.U.get(i3).a(this, oldAdapter, adapter);
            }
        }
    }

    public final void K() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).f1857a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public a.u.a.a getAdapter() {
        return this.f1847f;
    }

    public void f(i listener) {
        if (this.U == null) {
            this.U = new ArrayList();
        }
        this.U.add(listener);
    }

    public void L(i listener) {
        List<i> list = this.U;
        if (list != null) {
            list.remove(listener);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int item) {
        this.w = false;
        R(item, !this.P, false);
    }

    public void Q(int item, boolean smoothScroll) {
        this.w = false;
        R(item, smoothScroll, false);
    }

    public int getCurrentItem() {
        return this.f1848g;
    }

    public void R(int item, boolean smoothScroll, boolean always) {
        S(item, smoothScroll, always, 0);
    }

    public void S(int item, boolean smoothScroll, boolean always, int velocity) {
        a.u.a.a aVar = this.f1847f;
        boolean dispatchSelected = false;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (always || this.f1848g != item || this.f1844c.size() == 0) {
            if (item < 0) {
                item = 0;
            } else if (item >= this.f1847f.getCount()) {
                item = this.f1847f.getCount() - 1;
            }
            int pageLimit = this.x;
            int i2 = this.f1848g;
            if (item > i2 + pageLimit || item < i2 - pageLimit) {
                for (int i3 = 0; i3 < this.f1844c.size(); i3++) {
                    this.f1844c.get(i3).f1854c = true;
                }
            }
            if (this.f1848g != item) {
                dispatchSelected = true;
            }
            if (this.P) {
                this.f1848g = item;
                if (dispatchSelected) {
                    o(item);
                }
                requestLayout();
                return;
            }
            I(item);
            P(item, smoothScroll, velocity, dispatchSelected);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public final void P(int item, boolean smoothScroll, int velocity, boolean dispatchSelected) {
        f curInfo = x(item);
        int destX = 0;
        if (curInfo != null) {
            destX = (int) (((float) getClientWidth()) * Math.max(this.r, Math.min(curInfo.f1856e, this.s)));
        }
        if (smoothScroll) {
            T(destX, 0, velocity);
            if (dispatchSelected) {
                o(item);
                return;
            }
            return;
        }
        if (dispatchSelected) {
            o(item);
        }
        k(false);
        scrollTo(destX, 0);
        F(destX);
    }

    @Deprecated
    public void setOnPageChangeListener(j listener) {
        this.T = listener;
    }

    public void g(j listener) {
        if (this.S == null) {
            this.S = new ArrayList();
        }
        this.S.add(listener);
    }

    public void M(j listener) {
        List<j> list = this.S;
        if (list != null) {
            list.remove(listener);
        }
    }

    public int getChildDrawingOrder(int childCount, int i2) {
        return ((g) this.V.get(i2).getLayoutParams()).f1862f;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public void setOffscreenPageLimit(int limit) {
        if (limit < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + limit + " too small; defaulting to " + 1);
            limit = 1;
        }
        if (limit != this.x) {
            this.x = limit;
            H();
        }
    }

    public void setPageMargin(int marginPixels) {
        int oldMargin = this.n;
        this.n = marginPixels;
        int width = getWidth();
        J(width, width, marginPixels, oldMargin);
        requestLayout();
    }

    public int getPageMargin() {
        return this.n;
    }

    public void setPageMarginDrawable(Drawable d2) {
        this.o = d2;
        if (d2 != null) {
            refreshDrawableState();
        }
        setWillNotDraw(d2 == null);
        invalidate();
    }

    public void setPageMarginDrawable(int resId) {
        setPageMarginDrawable(a.h.e.a.c(getContext(), resId));
    }

    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.o;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable d2 = this.o;
        if (d2 != null && d2.isStateful()) {
            d2.setState(getDrawableState());
        }
    }

    public float q(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public void T(int x2, int y2, int velocity) {
        int sx;
        int duration;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.k;
        if (scroller != null && !scroller.isFinished()) {
            sx = this.l ? this.k.getCurrX() : this.k.getStartX();
            this.k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            sx = getScrollX();
        }
        int sy = getScrollY();
        int dx = x2 - sx;
        int dy = y2 - sy;
        if (dx == 0 && dy == 0) {
            k(false);
            H();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int width = getClientWidth();
        int halfWidth = width / 2;
        float distance = ((float) halfWidth) + (((float) halfWidth) * q(Math.min(1.0f, (((float) Math.abs(dx)) * 1.0f) / ((float) width))));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / ((float) velocity2)) * 1000.0f) * 4;
        } else {
            duration = (int) ((1.0f + (((float) Math.abs(dx)) / (((float) this.n) + (((float) width) * this.f1847f.getPageWidth(this.f1848g))))) * 100.0f);
        }
        int duration2 = Math.min(duration, 600);
        this.l = false;
        this.k.startScroll(sx, sy, dx, dy, duration2);
        s.T(this);
    }

    public f e(int position, int index) {
        f ii = new f();
        ii.f1853b = position;
        ii.f1852a = this.f1847f.instantiateItem((ViewGroup) this, position);
        ii.f1855d = this.f1847f.getPageWidth(position);
        if (index < 0 || index >= this.f1844c.size()) {
            this.f1844c.add(ii);
        } else {
            this.f1844c.add(index, ii);
        }
        return ii;
    }

    public void l() {
        int adapterCount = this.f1847f.getCount();
        this.f1843b = adapterCount;
        boolean needPopulate = this.f1844c.size() < (this.x * 2) + 1 && this.f1844c.size() < adapterCount;
        int newCurrItem = this.f1848g;
        boolean isUpdating = false;
        int i2 = 0;
        while (i2 < this.f1844c.size()) {
            f ii = this.f1844c.get(i2);
            int newPos = this.f1847f.getItemPosition(ii.f1852a);
            if (newPos != -1) {
                if (newPos == -2) {
                    this.f1844c.remove(i2);
                    i2--;
                    if (!isUpdating) {
                        this.f1847f.startUpdate((ViewGroup) this);
                        isUpdating = true;
                    }
                    this.f1847f.destroyItem((ViewGroup) this, ii.f1853b, ii.f1852a);
                    needPopulate = true;
                    int i3 = this.f1848g;
                    if (i3 == ii.f1853b) {
                        newCurrItem = Math.max(0, Math.min(i3, adapterCount - 1));
                        needPopulate = true;
                    }
                } else {
                    int i4 = ii.f1853b;
                    if (i4 != newPos) {
                        if (i4 == this.f1848g) {
                            newCurrItem = newPos;
                        }
                        ii.f1853b = newPos;
                        needPopulate = true;
                    }
                }
            }
            i2++;
        }
        if (isUpdating) {
            this.f1847f.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f1844c, c0);
        if (needPopulate) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g lp = (g) getChildAt(i5).getLayoutParams();
                if (!lp.f1857a) {
                    lp.f1859c = 0.0f;
                }
            }
            R(newCurrItem, false, true);
            requestLayout();
        }
    }

    public void H() {
        I(this.f1848g);
    }

    public void I(int newCurrentItem) {
        f oldCurInfo;
        String resName;
        f ii;
        float leftWidthNeeded;
        float rightWidthNeeded;
        int startPos;
        int pageLimit;
        int i2 = this.f1848g;
        if (i2 != newCurrentItem) {
            f oldCurInfo2 = x(i2);
            this.f1848g = newCurrentItem;
            oldCurInfo = oldCurInfo2;
        } else {
            oldCurInfo = null;
        }
        if (this.f1847f == null) {
            U();
        } else if (this.w) {
            U();
        } else if (getWindowToken() != null) {
            this.f1847f.startUpdate((ViewGroup) this);
            int pageLimit2 = this.x;
            int startPos2 = Math.max(0, this.f1848g - pageLimit2);
            int N2 = this.f1847f.getCount();
            int endPos = Math.min(N2 - 1, this.f1848g + pageLimit2);
            if (N2 == this.f1843b) {
                f curItem = null;
                int curIndex = 0;
                while (true) {
                    if (curIndex >= this.f1844c.size()) {
                        break;
                    }
                    f ii2 = this.f1844c.get(curIndex);
                    int i3 = ii2.f1853b;
                    int i4 = this.f1848g;
                    if (i3 < i4) {
                        curIndex++;
                    } else if (i3 == i4) {
                        curItem = ii2;
                    }
                }
                if (curItem == null && N2 > 0) {
                    curItem = e(this.f1848g, curIndex);
                }
                if (curItem != null) {
                    float extraWidthLeft = 0.0f;
                    int itemIndex = curIndex - 1;
                    f ii3 = itemIndex >= 0 ? this.f1844c.get(itemIndex) : null;
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        leftWidthNeeded = 0.0f;
                    } else {
                        leftWidthNeeded = (2.0f - curItem.f1855d) + (((float) getPaddingLeft()) / ((float) clientWidth));
                    }
                    for (int pos = this.f1848g - 1; pos >= 0; pos--) {
                        if (extraWidthLeft < leftWidthNeeded || pos >= startPos2) {
                            if (ii3 == null || pos != ii3.f1853b) {
                                extraWidthLeft += e(pos, itemIndex + 1).f1855d;
                                curIndex++;
                                ii3 = itemIndex >= 0 ? this.f1844c.get(itemIndex) : null;
                            } else {
                                extraWidthLeft += ii3.f1855d;
                                itemIndex--;
                                ii3 = itemIndex >= 0 ? this.f1844c.get(itemIndex) : null;
                            }
                        } else if (ii3 == null) {
                            break;
                        } else if (pos == ii3.f1853b && !ii3.f1854c) {
                            this.f1844c.remove(itemIndex);
                            this.f1847f.destroyItem((ViewGroup) this, pos, ii3.f1852a);
                            itemIndex--;
                            curIndex--;
                            ii3 = itemIndex >= 0 ? this.f1844c.get(itemIndex) : null;
                        }
                    }
                    float extraWidthRight = curItem.f1855d;
                    int itemIndex2 = curIndex + 1;
                    if (extraWidthRight < 2.0f) {
                        f ii4 = itemIndex2 < this.f1844c.size() ? this.f1844c.get(itemIndex2) : null;
                        if (clientWidth <= 0) {
                            rightWidthNeeded = 0.0f;
                        } else {
                            rightWidthNeeded = (((float) getPaddingRight()) / ((float) clientWidth)) + 2.0f;
                        }
                        int pos2 = this.f1848g + 1;
                        while (true) {
                            if (pos2 >= N2) {
                                break;
                            }
                            if (extraWidthRight < rightWidthNeeded || pos2 <= endPos) {
                                pageLimit = pageLimit2;
                                startPos = startPos2;
                                if (ii4 == null || pos2 != ii4.f1853b) {
                                    f ii5 = e(pos2, itemIndex2);
                                    itemIndex2++;
                                    extraWidthRight += ii5.f1855d;
                                    ii4 = itemIndex2 < this.f1844c.size() ? this.f1844c.get(itemIndex2) : null;
                                } else {
                                    extraWidthRight += ii4.f1855d;
                                    itemIndex2++;
                                    ii4 = itemIndex2 < this.f1844c.size() ? this.f1844c.get(itemIndex2) : null;
                                }
                            } else if (ii4 == null) {
                                break;
                            } else {
                                pageLimit = pageLimit2;
                                if (pos2 != ii4.f1853b || ii4.f1854c) {
                                    startPos = startPos2;
                                } else {
                                    this.f1844c.remove(itemIndex2);
                                    startPos = startPos2;
                                    this.f1847f.destroyItem((ViewGroup) this, pos2, ii4.f1852a);
                                    ii4 = itemIndex2 < this.f1844c.size() ? this.f1844c.get(itemIndex2) : null;
                                }
                            }
                            pos2++;
                            pageLimit2 = pageLimit;
                            startPos2 = startPos;
                        }
                    }
                    i(curItem, curIndex, oldCurInfo);
                    this.f1847f.setPrimaryItem((ViewGroup) this, this.f1848g, curItem.f1852a);
                }
                this.f1847f.finishUpdate((ViewGroup) this);
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View child = getChildAt(i5);
                    g lp = (g) child.getLayoutParams();
                    lp.f1862f = i5;
                    if (!lp.f1857a) {
                        if (lp.f1859c == 0.0f && (ii = v(child)) != null) {
                            lp.f1859c = ii.f1855d;
                            lp.f1861e = ii.f1853b;
                        }
                    }
                }
                U();
                if (hasFocus()) {
                    View currentFocused = findFocus();
                    f ii6 = currentFocused != null ? u(currentFocused) : null;
                    if (ii6 == null || ii6.f1853b != this.f1848g) {
                        for (int i6 = 0; i6 < getChildCount(); i6++) {
                            View child2 = getChildAt(i6);
                            f ii7 = v(child2);
                            if (ii7 != null && ii7.f1853b == this.f1848g && child2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                resName = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException e2) {
                resName = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f1843b + ", found: " + N2 + " Pager id: " + resName + " Pager class: " + getClass() + " Problematic adapter: " + this.f1847f.getClass());
        }
    }

    public final void U() {
    }

    public final void i(f curItem, int curIndex, f oldCurInfo) {
        int i2;
        int i3;
        f ii;
        f ii2;
        int N2 = this.f1847f.getCount();
        int width = getClientWidth();
        float marginOffset = width > 0 ? ((float) this.n) / ((float) width) : 0.0f;
        if (oldCurInfo != null) {
            int oldCurPosition = oldCurInfo.f1853b;
            int itemIndex = curItem.f1853b;
            if (oldCurPosition < itemIndex) {
                int itemIndex2 = 0;
                float offset = oldCurInfo.f1856e + oldCurInfo.f1855d + marginOffset;
                int pos = oldCurPosition + 1;
                while (pos <= curItem.f1853b && itemIndex2 < this.f1844c.size()) {
                    f ii3 = this.f1844c.get(itemIndex2);
                    while (true) {
                        ii2 = ii3;
                        if (pos > ii2.f1853b && itemIndex2 < this.f1844c.size() - 1) {
                            itemIndex2++;
                            ii3 = this.f1844c.get(itemIndex2);
                        }
                    }
                    while (pos < ii2.f1853b) {
                        offset += this.f1847f.getPageWidth(pos) + marginOffset;
                        pos++;
                    }
                    ii2.f1856e = offset;
                    offset += ii2.f1855d + marginOffset;
                    pos++;
                }
            } else if (oldCurPosition > itemIndex) {
                int itemIndex3 = this.f1844c.size() - 1;
                float offset2 = oldCurInfo.f1856e;
                int pos2 = oldCurPosition - 1;
                while (pos2 >= curItem.f1853b && itemIndex3 >= 0) {
                    f ii4 = this.f1844c.get(itemIndex3);
                    while (true) {
                        ii = ii4;
                        if (pos2 < ii.f1853b && itemIndex3 > 0) {
                            itemIndex3--;
                            ii4 = this.f1844c.get(itemIndex3);
                        }
                    }
                    while (pos2 > ii.f1853b) {
                        offset2 -= this.f1847f.getPageWidth(pos2) + marginOffset;
                        pos2--;
                    }
                    offset2 -= ii.f1855d + marginOffset;
                    ii.f1856e = offset2;
                    pos2--;
                }
            }
        }
        int itemCount = this.f1844c.size();
        float offset3 = curItem.f1856e;
        int i4 = curItem.f1853b;
        int pos3 = i4 - 1;
        this.r = i4 == 0 ? curItem.f1856e : -3.4028235E38f;
        this.s = curItem.f1853b == N2 + -1 ? (curItem.f1856e + curItem.f1855d) - 1.0f : Float.MAX_VALUE;
        int i5 = curIndex - 1;
        while (i5 >= 0) {
            f ii5 = this.f1844c.get(i5);
            while (true) {
                i3 = ii5.f1853b;
                if (pos3 <= i3) {
                    break;
                }
                offset3 -= this.f1847f.getPageWidth(pos3) + marginOffset;
                pos3--;
            }
            offset3 -= ii5.f1855d + marginOffset;
            ii5.f1856e = offset3;
            if (i3 == 0) {
                this.r = offset3;
            }
            i5--;
            pos3--;
        }
        float offset4 = curItem.f1856e + curItem.f1855d + marginOffset;
        int pos4 = curItem.f1853b + 1;
        int i6 = curIndex + 1;
        while (i6 < itemCount) {
            f ii6 = this.f1844c.get(i6);
            while (true) {
                i2 = ii6.f1853b;
                if (pos4 >= i2) {
                    break;
                }
                offset4 += this.f1847f.getPageWidth(pos4) + marginOffset;
                pos4++;
            }
            if (i2 == N2 - 1) {
                this.s = (ii6.f1855d + offset4) - 1.0f;
            }
            ii6.f1856e = offset4;
            offset4 += ii6.f1855d + marginOffset;
            i6++;
            pos4++;
        }
    }

    public static class l extends a.j.a.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public int f1865d;

        /* renamed from: e  reason: collision with root package name */
        public Parcelable f1866e;

        /* renamed from: f  reason: collision with root package name */
        public ClassLoader f1867f;

        public l(Parcelable superState) {
            super(superState);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f1865d);
            out.writeParcelable(this.f1866e, flags);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1865d + "}";
        }

        public static class a implements Parcelable.ClassLoaderCreator<l> {
            /* renamed from: b */
            public l createFromParcel(Parcel in, ClassLoader loader) {
                return new l(in, loader);
            }

            /* renamed from: a */
            public l createFromParcel(Parcel in) {
                return new l(in, null);
            }

            /* renamed from: c */
            public l[] newArray(int size) {
                return new l[size];
            }
        }

        public l(Parcel in, ClassLoader loader) {
            super(in, loader);
            loader = loader == null ? getClass().getClassLoader() : loader;
            this.f1865d = in.readInt();
            this.f1866e = in.readParcelable(loader);
            this.f1867f = loader;
        }
    }

    public Parcelable onSaveInstanceState() {
        l ss = new l(super.onSaveInstanceState());
        ss.f1865d = this.f1848g;
        a.u.a.a aVar = this.f1847f;
        if (aVar != null) {
            ss.f1866e = aVar.saveState();
        }
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof l)) {
            super.onRestoreInstanceState(state);
            return;
        }
        l ss = (l) state;
        super.onRestoreInstanceState(ss.a());
        a.u.a.a aVar = this.f1847f;
        if (aVar != null) {
            aVar.restoreState(ss.f1866e, ss.f1867f);
            R(ss.f1865d, false, true);
            return;
        }
        this.h = ss.f1865d;
        this.i = ss.f1866e;
        this.j = ss.f1867f;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (!checkLayoutParams(params)) {
            params = generateLayoutParams(params);
        }
        g lp = (g) params;
        boolean z2 = lp.f1857a | z(child);
        lp.f1857a = z2;
        if (!this.u) {
            super.addView(child, index, params);
        } else if (!z2) {
            lp.f1860d = true;
            addViewInLayout(child, index, params);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public static boolean z(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public void removeView(View view) {
        if (this.u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public f v(View child) {
        for (int i2 = 0; i2 < this.f1844c.size(); i2++) {
            f ii = this.f1844c.get(i2);
            if (this.f1847f.isViewFromObject(child, ii.f1852a)) {
                return ii;
            }
        }
        return null;
    }

    public f u(View child) {
        while (true) {
            ViewParent parent = child.getParent();
            if (parent == this) {
                return v(child);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            child = (View) parent;
        }
    }

    public f x(int position) {
        for (int i2 = 0; i2 < this.f1844c.size(); i2++) {
            f ii = this.f1844c.get(i2);
            if (ii.f1853b == position) {
                return ii;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        g lp;
        int measuredWidth;
        int heightMode;
        int widthSize;
        int heightSize;
        int heightMode2;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, widthMeasureSpec), ViewGroup.getDefaultSize(0, heightMeasureSpec));
        int measuredWidth2 = getMeasuredWidth();
        int maxGutterSize = measuredWidth2 / 10;
        this.B = Math.min(maxGutterSize, this.A);
        int childWidthSize = (measuredWidth2 - getPaddingLeft()) - getPaddingRight();
        int childHeightSize = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int size = getChildCount();
        int i2 = 0;
        while (i2 < size) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                g lp2 = (g) child.getLayoutParams();
                if (lp2 == null || !lp2.f1857a) {
                    measuredWidth = measuredWidth2;
                    heightMode = maxGutterSize;
                } else {
                    int i3 = lp2.f1858b;
                    int hgrav = i3 & 7;
                    int vgrav = i3 & 112;
                    int widthMode = Integer.MIN_VALUE;
                    int heightMode3 = Integer.MIN_VALUE;
                    boolean consumeVertical = vgrav == 48 || vgrav == 80;
                    boolean consumeHorizontal = hgrav == 3 || hgrav == 5;
                    if (consumeVertical) {
                        widthMode = 1073741824;
                    } else if (consumeHorizontal) {
                        heightMode3 = 1073741824;
                    }
                    int i4 = ((ViewGroup.LayoutParams) lp2).width;
                    measuredWidth = measuredWidth2;
                    if (i4 != -2) {
                        widthMode = 1073741824;
                        if (i4 != -1) {
                            widthSize = ((ViewGroup.LayoutParams) lp2).width;
                        } else {
                            widthSize = childWidthSize;
                        }
                    } else {
                        widthSize = childWidthSize;
                    }
                    int i5 = ((ViewGroup.LayoutParams) lp2).height;
                    if (i5 == -2) {
                        heightMode2 = heightMode3;
                        heightSize = childHeightSize;
                    } else if (i5 != -1) {
                        heightSize = ((ViewGroup.LayoutParams) lp2).height;
                        heightMode2 = 1073741824;
                    } else {
                        heightMode2 = 1073741824;
                        heightSize = childHeightSize;
                    }
                    heightMode = maxGutterSize;
                    child.measure(View.MeasureSpec.makeMeasureSpec(widthSize, widthMode), View.MeasureSpec.makeMeasureSpec(heightSize, heightMode2));
                    if (consumeVertical) {
                        childHeightSize -= child.getMeasuredHeight();
                    } else if (consumeHorizontal) {
                        childWidthSize -= child.getMeasuredWidth();
                    }
                }
            } else {
                measuredWidth = measuredWidth2;
                heightMode = maxGutterSize;
            }
            i2++;
            maxGutterSize = heightMode;
            measuredWidth2 = measuredWidth;
        }
        View.MeasureSpec.makeMeasureSpec(childWidthSize, 1073741824);
        this.t = View.MeasureSpec.makeMeasureSpec(childHeightSize, 1073741824);
        this.u = true;
        H();
        this.u = false;
        int size2 = getChildCount();
        for (int i6 = 0; i6 < size2; i6++) {
            View child2 = getChildAt(i6);
            if (child2.getVisibility() != 8 && ((lp = (g) child2.getLayoutParams()) == null || !lp.f1857a)) {
                child2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) childWidthSize) * lp.f1859c), 1073741824), this.t);
            }
        }
    }

    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        if (w2 != oldw) {
            int i2 = this.n;
            J(w2, oldw, i2, i2);
        }
    }

    public final void J(int width, int oldWidth, int margin, int oldMargin) {
        if (oldWidth <= 0 || this.f1844c.isEmpty()) {
            f ii = x(this.f1848g);
            int scrollPos = (int) (((float) ((width - getPaddingLeft()) - getPaddingRight())) * (ii != null ? Math.min(ii.f1856e, this.s) : 0.0f));
            if (scrollPos != getScrollX()) {
                k(false);
                scrollTo(scrollPos, getScrollY());
            }
        } else if (!this.k.isFinished()) {
            this.k.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) (((float) (((width - getPaddingLeft()) - getPaddingRight()) + margin)) * (((float) getScrollX()) / ((float) (((oldWidth - getPaddingLeft()) - getPaddingRight()) + oldMargin)))), getScrollY());
        }
    }

    /* JADX INFO: Multiple debug info for r11v10 int: [D('lp' androidx.viewpager.widget.ViewPager$g), D('hgrav' int)] */
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int i2;
        boolean z2;
        int paddingLeft;
        int width;
        int count;
        int childLeft;
        int childTop;
        int count2 = getChildCount();
        int width2 = r2 - l2;
        int height = b2 - t2;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int decorCount = 0;
        int i3 = 0;
        while (true) {
            i2 = 8;
            if (i3 >= count2) {
                break;
            }
            View child = getChildAt(i3);
            if (child.getVisibility() != 8) {
                g lp = (g) child.getLayoutParams();
                if (lp.f1857a) {
                    int i4 = lp.f1858b;
                    int hgrav = i4 & 7;
                    int vgrav = i4 & 112;
                    if (hgrav == 1) {
                        childLeft = Math.max((width2 - child.getMeasuredWidth()) / 2, paddingLeft2);
                    } else if (hgrav == 3) {
                        childLeft = paddingLeft2;
                        paddingLeft2 += child.getMeasuredWidth();
                    } else if (hgrav != 5) {
                        childLeft = paddingLeft2;
                    } else {
                        childLeft = (width2 - paddingRight) - child.getMeasuredWidth();
                        paddingRight += child.getMeasuredWidth();
                    }
                    if (vgrav == 16) {
                        childTop = Math.max((height - child.getMeasuredHeight()) / 2, paddingTop);
                    } else if (vgrav == 48) {
                        childTop = paddingTop;
                        paddingTop += child.getMeasuredHeight();
                    } else if (vgrav != 80) {
                        childTop = paddingTop;
                    } else {
                        childTop = (height - paddingBottom) - child.getMeasuredHeight();
                        paddingBottom += child.getMeasuredHeight();
                    }
                    int childLeft2 = childLeft + scrollX;
                    child.layout(childLeft2, childTop, child.getMeasuredWidth() + childLeft2, childTop + child.getMeasuredHeight());
                    decorCount++;
                    paddingLeft2 = paddingLeft2;
                    paddingTop = paddingTop;
                }
            }
            i3++;
        }
        int childWidth = (width2 - paddingLeft2) - paddingRight;
        int i5 = 0;
        while (i5 < count2) {
            View child2 = getChildAt(i5);
            if (child2.getVisibility() != i2) {
                g lp2 = (g) child2.getLayoutParams();
                if (!lp2.f1857a) {
                    f ii = v(child2);
                    if (ii != null) {
                        count = count2;
                        int childLeft3 = paddingLeft2 + ((int) (((float) childWidth) * ii.f1856e));
                        if (lp2.f1860d) {
                            lp2.f1860d = false;
                            width = width2;
                            paddingLeft = paddingLeft2;
                            child2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) childWidth) * lp2.f1859c), 1073741824), View.MeasureSpec.makeMeasureSpec((height - paddingTop) - paddingBottom, 1073741824));
                        } else {
                            width = width2;
                            paddingLeft = paddingLeft2;
                        }
                        child2.layout(childLeft3, paddingTop, child2.getMeasuredWidth() + childLeft3, child2.getMeasuredHeight() + paddingTop);
                    } else {
                        width = width2;
                        paddingLeft = paddingLeft2;
                        count = count2;
                    }
                } else {
                    count = count2;
                    width = width2;
                    paddingLeft = paddingLeft2;
                }
            } else {
                count = count2;
                width = width2;
                paddingLeft = paddingLeft2;
            }
            i5++;
            count2 = count;
            width2 = width;
            paddingLeft2 = paddingLeft;
            i2 = 8;
        }
        this.p = paddingTop;
        this.q = height - paddingBottom;
        this.R = decorCount;
        if (this.P) {
            z2 = false;
            P(this.f1848g, false, 0, false);
        } else {
            z2 = false;
        }
        this.P = z2;
    }

    public void computeScroll() {
        this.l = true;
        if (this.k.isFinished() || !this.k.computeScrollOffset()) {
            k(true);
            return;
        }
        int oldX = getScrollX();
        int oldY = getScrollY();
        int x2 = this.k.getCurrX();
        int y2 = this.k.getCurrY();
        if (!(oldX == x2 && oldY == y2)) {
            scrollTo(x2, y2);
            if (!F(x2)) {
                this.k.abortAnimation();
                scrollTo(0, y2);
            }
        }
        s.T(this);
    }

    public final boolean F(int xpos) {
        if (this.f1844c.size() != 0) {
            f ii = w();
            int width = getClientWidth();
            int i2 = this.n;
            int widthWithMargin = width + i2;
            int currentPage = ii.f1853b;
            float pageOffset = ((((float) xpos) / ((float) width)) - ii.f1856e) / (ii.f1855d + (((float) i2) / ((float) width)));
            this.Q = false;
            B(currentPage, pageOffset, (int) (((float) widthWithMargin) * pageOffset));
            if (this.Q) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.P) {
            return false;
        } else {
            this.Q = false;
            B(0, 0.0f, 0);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public void B(int position, float offset, int offsetPixels) {
        int childLeft;
        if (this.R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = getChildAt(i2);
                g lp = (g) child.getLayoutParams();
                if (lp.f1857a) {
                    int hgrav = lp.f1858b & 7;
                    if (hgrav == 1) {
                        childLeft = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (hgrav == 3) {
                        childLeft = paddingLeft;
                        paddingLeft += child.getWidth();
                    } else if (hgrav != 5) {
                        childLeft = paddingLeft;
                    } else {
                        childLeft = (width - paddingRight) - child.getMeasuredWidth();
                        paddingRight += child.getMeasuredWidth();
                    }
                    int childOffset = (childLeft + scrollX) - child.getLeft();
                    if (childOffset != 0) {
                        child.offsetLeftAndRight(childOffset);
                    }
                }
            }
        }
        n(position, offset, offsetPixels);
        this.Q = true;
    }

    public final void n(int position, float offset, int offsetPixels) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.a(position, offset, offsetPixels);
        }
        List<j> list = this.S;
        if (list != null) {
            int z2 = list.size();
            for (int i2 = 0; i2 < z2; i2++) {
                j listener = this.S.get(i2);
                if (listener != null) {
                    listener.a(position, offset, offsetPixels);
                }
            }
        }
    }

    public final void o(int position) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.c(position);
        }
        List<j> list = this.S;
        if (list != null) {
            int z2 = list.size();
            for (int i2 = 0; i2 < z2; i2++) {
                j listener = this.S.get(i2);
                if (listener != null) {
                    listener.c(position);
                }
            }
        }
    }

    public final void p(int state) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.b(state);
        }
        List<j> list = this.S;
        if (list != null) {
            int z2 = list.size();
            for (int i2 = 0; i2 < z2; i2++) {
                j listener = this.S.get(i2);
                if (listener != null) {
                    listener.b(state);
                }
            }
        }
    }

    public final void k(boolean postEvents) {
        boolean needPopulate = this.a0 == 2;
        if (needPopulate) {
            setScrollingCacheEnabled(false);
            if (true ^ this.k.isFinished()) {
                this.k.abortAnimation();
                int oldX = getScrollX();
                int oldY = getScrollY();
                int x2 = this.k.getCurrX();
                int y2 = this.k.getCurrY();
                if (!(oldX == x2 && oldY == y2)) {
                    scrollTo(x2, y2);
                    if (x2 != oldX) {
                        F(x2);
                    }
                }
            }
        }
        this.w = false;
        for (int i2 = 0; i2 < this.f1844c.size(); i2++) {
            f ii = this.f1844c.get(i2);
            if (ii.f1854c) {
                needPopulate = true;
                ii.f1854c = false;
            }
        }
        if (!needPopulate) {
            return;
        }
        if (postEvents) {
            s.U(this, this.W);
        } else {
            this.W.run();
        }
    }

    public final boolean A(float x2, float dx) {
        return (x2 < ((float) this.B) && dx > 0.0f) || (x2 > ((float) (getWidth() - this.B)) && dx < 0.0f);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        float y2;
        int action = ev.getAction() & 255;
        if (action == 3 || action == 1) {
            O();
            return false;
        }
        if (action != 0) {
            if (this.y) {
                return true;
            }
            if (this.z) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = ev.getX();
            this.F = x2;
            this.D = x2;
            float y3 = ev.getY();
            this.G = y3;
            this.E = y3;
            this.H = ev.getPointerId(0);
            this.z = false;
            this.l = true;
            this.k.computeScrollOffset();
            if (this.a0 != 2 || Math.abs(this.k.getFinalX() - this.k.getCurrX()) <= this.M) {
                k(false);
                this.y = false;
            } else {
                this.k.abortAnimation();
                this.w = false;
                H();
                this.y = true;
                N(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int activePointerId = this.H;
            if (activePointerId != -1) {
                int pointerIndex = ev.findPointerIndex(activePointerId);
                float x3 = ev.getX(pointerIndex);
                float dx = x3 - this.D;
                float xDiff = Math.abs(dx);
                float y4 = ev.getY(pointerIndex);
                float yDiff = Math.abs(y4 - this.G);
                if (dx == 0.0f || A(this.D, dx)) {
                    y2 = y4;
                } else {
                    y2 = y4;
                    if (j(this, false, (int) dx, (int) x3, (int) y4)) {
                        this.D = x3;
                        this.E = y2;
                        this.z = true;
                        return false;
                    }
                }
                if (xDiff > ((float) this.C) && 0.5f * xDiff > yDiff) {
                    this.y = true;
                    N(true);
                    setScrollState(1);
                    this.D = dx > 0.0f ? this.F + ((float) this.C) : this.F - ((float) this.C);
                    this.E = y2;
                    setScrollingCacheEnabled(true);
                } else if (yDiff > ((float) this.C)) {
                    this.z = true;
                }
                if (this.y && G(x3)) {
                    s.T(this);
                }
            }
        } else if (action == 6) {
            C(ev);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(ev);
        return this.y;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        a.u.a.a aVar;
        if ((ev.getAction() == 0 && ev.getEdgeFlags() != 0) || (aVar = this.f1847f) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(ev);
        boolean needsInvalidate = false;
        int action = ev.getAction() & 255;
        if (action == 0) {
            this.k.abortAnimation();
            this.w = false;
            H();
            float x2 = ev.getX();
            this.F = x2;
            this.D = x2;
            float y2 = ev.getY();
            this.G = y2;
            this.E = y2;
            this.H = ev.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.y) {
                    int pointerIndex = ev.findPointerIndex(this.H);
                    if (pointerIndex == -1) {
                        needsInvalidate = O();
                    } else {
                        float x3 = ev.getX(pointerIndex);
                        float xDiff = Math.abs(x3 - this.D);
                        float y3 = ev.getY(pointerIndex);
                        float yDiff = Math.abs(y3 - this.E);
                        if (xDiff > ((float) this.C) && xDiff > yDiff) {
                            this.y = true;
                            N(true);
                            float f2 = this.F;
                            this.D = x3 - f2 > 0.0f ? f2 + ((float) this.C) : f2 - ((float) this.C);
                            this.E = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.y) {
                    needsInvalidate = false | G(ev.getX(ev.findPointerIndex(this.H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int index = ev.getActionIndex();
                    this.D = ev.getX(index);
                    this.H = ev.getPointerId(index);
                } else if (action == 6) {
                    C(ev);
                    this.D = ev.getX(ev.findPointerIndex(this.H));
                }
            } else if (this.y) {
                P(this.f1848g, true, 0, false);
                needsInvalidate = O();
            }
        } else if (this.y) {
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM, (float) this.K);
            int initialVelocity = (int) velocityTracker.getXVelocity(this.H);
            this.w = true;
            int width = getClientWidth();
            int scrollX = getScrollX();
            f ii = w();
            S(m(ii.f1853b, ((((float) scrollX) / ((float) width)) - ii.f1856e) / (ii.f1855d + (((float) this.n) / ((float) width))), initialVelocity, (int) (ev.getX(ev.findPointerIndex(this.H)) - this.F)), true, true, initialVelocity);
            needsInvalidate = O();
        }
        if (needsInvalidate) {
            s.T(this);
        }
        return true;
    }

    public final boolean O() {
        this.H = -1;
        r();
        this.N.onRelease();
        this.O.onRelease();
        return this.N.isFinished() || this.O.isFinished();
    }

    public final void N(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    public final boolean G(float x2) {
        boolean needsInvalidate = false;
        this.D = x2;
        float scrollX = ((float) getScrollX()) + (this.D - x2);
        int width = getClientWidth();
        float leftBound = ((float) width) * this.r;
        float rightBound = ((float) width) * this.s;
        boolean leftAbsolute = true;
        boolean rightAbsolute = true;
        f firstItem = this.f1844c.get(0);
        ArrayList<f> arrayList = this.f1844c;
        f lastItem = arrayList.get(arrayList.size() - 1);
        if (firstItem.f1853b != 0) {
            leftAbsolute = false;
            leftBound = firstItem.f1856e * ((float) width);
        }
        if (lastItem.f1853b != this.f1847f.getCount() - 1) {
            rightAbsolute = false;
            rightBound = lastItem.f1856e * ((float) width);
        }
        if (scrollX < leftBound) {
            if (leftAbsolute) {
                this.N.onPull(Math.abs(leftBound - scrollX) / ((float) width));
                needsInvalidate = true;
            }
            scrollX = leftBound;
        } else if (scrollX > rightBound) {
            if (rightAbsolute) {
                this.O.onPull(Math.abs(scrollX - rightBound) / ((float) width));
                needsInvalidate = true;
            }
            scrollX = rightBound;
        }
        this.D += scrollX - ((float) ((int) scrollX));
        scrollTo((int) scrollX, getScrollY());
        F((int) scrollX);
        return needsInvalidate;
    }

    public final f w() {
        int width = getClientWidth();
        float marginOffset = 0.0f;
        float scrollOffset = width > 0 ? ((float) getScrollX()) / ((float) width) : 0.0f;
        if (width > 0) {
            marginOffset = ((float) this.n) / ((float) width);
        }
        int lastPos = -1;
        float lastOffset = 0.0f;
        float lastWidth = 0.0f;
        boolean first = true;
        f lastItem = null;
        int i2 = 0;
        while (i2 < this.f1844c.size()) {
            f ii = this.f1844c.get(i2);
            if (!first && ii.f1853b != lastPos + 1) {
                ii = this.f1845d;
                ii.f1856e = lastOffset + lastWidth + marginOffset;
                int i3 = lastPos + 1;
                ii.f1853b = i3;
                ii.f1855d = this.f1847f.getPageWidth(i3);
                i2--;
            }
            float offset = ii.f1856e;
            float rightBound = ii.f1855d + offset + marginOffset;
            if (!first && scrollOffset < offset) {
                return lastItem;
            }
            if (scrollOffset < rightBound || i2 == this.f1844c.size() - 1) {
                return ii;
            }
            first = false;
            lastPos = ii.f1853b;
            lastOffset = offset;
            lastWidth = ii.f1855d;
            lastItem = ii;
            i2++;
        }
        return lastItem;
    }

    public final int m(int currentPage, float pageOffset, int velocity, int deltaX) {
        int targetPage;
        if (Math.abs(deltaX) <= this.L || Math.abs(velocity) <= this.J) {
            targetPage = ((int) (pageOffset + (currentPage >= this.f1848g ? 0.4f : 0.6f))) + currentPage;
        } else {
            targetPage = velocity > 0 ? currentPage : currentPage + 1;
        }
        if (this.f1844c.size() <= 0) {
            return targetPage;
        }
        ArrayList<f> arrayList = this.f1844c;
        return Math.max(this.f1844c.get(0).f1853b, Math.min(targetPage, arrayList.get(arrayList.size() - 1).f1853b));
    }

    public void draw(Canvas canvas) {
        a.u.a.a aVar;
        super.draw(canvas);
        boolean needsInvalidate = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f1847f) != null && aVar.getCount() > 1)) {
            if (!this.N.isFinished()) {
                int restoreCount = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.r * ((float) width));
                this.N.setSize(height, width);
                needsInvalidate = false | this.N.draw(canvas);
                canvas.restoreToCount(restoreCount);
            }
            if (!this.O.isFinished()) {
                int restoreCount2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.s + 1.0f)) * ((float) width2));
                this.O.setSize(height2, width2);
                needsInvalidate |= this.O.draw(canvas);
                canvas.restoreToCount(restoreCount2);
            }
        } else {
            this.N.finish();
            this.O.finish();
        }
        if (needsInvalidate) {
            s.T(this);
        }
    }

    public void onDraw(Canvas canvas) {
        float drawAt;
        float marginOffset;
        super.onDraw(canvas);
        if (this.n > 0 && this.o != null && this.f1844c.size() > 0 && this.f1847f != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float marginOffset2 = ((float) this.n) / ((float) width);
            int itemIndex = 0;
            f ii = this.f1844c.get(0);
            float offset = ii.f1856e;
            int itemCount = this.f1844c.size();
            int firstPos = ii.f1853b;
            int lastPos = this.f1844c.get(itemCount - 1).f1853b;
            int pos = firstPos;
            while (pos < lastPos) {
                while (pos > ii.f1853b && itemIndex < itemCount) {
                    itemIndex++;
                    ii = this.f1844c.get(itemIndex);
                }
                if (pos == ii.f1853b) {
                    float f2 = ii.f1856e;
                    float f3 = ii.f1855d;
                    drawAt = (f2 + f3) * ((float) width);
                    offset = f2 + f3 + marginOffset2;
                } else {
                    float widthFactor = this.f1847f.getPageWidth(pos);
                    drawAt = ((float) width) * (offset + widthFactor);
                    offset += widthFactor + marginOffset2;
                }
                if (((float) this.n) + drawAt > ((float) scrollX)) {
                    marginOffset = marginOffset2;
                    this.o.setBounds(Math.round(drawAt), this.p, Math.round(((float) this.n) + drawAt), this.q);
                    this.o.draw(canvas);
                } else {
                    marginOffset = marginOffset2;
                }
                if (drawAt <= ((float) (scrollX + width))) {
                    pos++;
                    marginOffset2 = marginOffset;
                } else {
                    return;
                }
            }
        }
    }

    public final void C(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.H) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.D = ev.getX(newPointerIndex);
            this.H = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void r() {
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private void setScrollingCacheEnabled(boolean enabled) {
        if (this.v != enabled) {
            this.v = enabled;
        }
    }

    public boolean canScrollHorizontally(int direction) {
        if (this.f1847f == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        if (direction < 0) {
            if (scrollX > ((int) (((float) width) * this.r))) {
                return true;
            }
            return false;
        } else if (direction <= 0 || scrollX >= ((int) (((float) width) * this.s))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j(View v2, boolean checkV, int dx, int x2, int y2) {
        if (v2 instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) v2;
            int scrollX = v2.getScrollX();
            int scrollY = v2.getScrollY();
            for (int i2 = group.getChildCount() - 1; i2 >= 0; i2--) {
                View child = group.getChildAt(i2);
                if (x2 + scrollX >= child.getLeft() && x2 + scrollX < child.getRight() && y2 + scrollY >= child.getTop() && y2 + scrollY < child.getBottom() && j(child, true, dx, (x2 + scrollX) - child.getLeft(), (y2 + scrollY) - child.getTop())) {
                    return true;
                }
            }
        }
        if (checkV) {
            if (v2.canScrollHorizontally(-dx)) {
                return true;
            }
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || s(event);
    }

    public boolean s(KeyEvent event) {
        if (event.getAction() != 0) {
            return false;
        }
        int keyCode = event.getKeyCode();
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode != 61) {
                    return false;
                }
                if (event.hasNoModifiers()) {
                    return h(2);
                }
                if (event.hasModifiers(1)) {
                    return h(1);
                }
                return false;
            } else if (event.hasModifiers(2)) {
                return E();
            } else {
                return h(66);
            }
        } else if (event.hasModifiers(2)) {
            return D();
        } else {
            return h(17);
        }
    }

    public boolean h(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        } else if (currentFocused != null) {
            boolean isChild = false;
            ViewParent parent = currentFocused.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (parent == this) {
                    isChild = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (!isChild) {
                StringBuilder sb = new StringBuilder();
                sb.append(currentFocused.getClass().getSimpleName());
                for (ViewParent parent2 = currentFocused.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                currentFocused = null;
            }
        }
        boolean handled = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        if (nextFocused == null || nextFocused == currentFocused) {
            if (direction == 17 || direction == 1) {
                handled = D();
            } else if (direction == 66 || direction == 2) {
                handled = E();
            }
        } else if (direction == 17) {
            handled = (currentFocused == null || t(this.f1846e, nextFocused).left < t(this.f1846e, currentFocused).left) ? nextFocused.requestFocus() : D();
        } else if (direction == 66) {
            handled = (currentFocused == null || t(this.f1846e, nextFocused).left > t(this.f1846e, currentFocused).left) ? nextFocused.requestFocus() : E();
        }
        if (handled) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(direction));
        }
        return handled;
    }

    public final Rect t(Rect outRect, View child) {
        if (outRect == null) {
            outRect = new Rect();
        }
        if (child == null) {
            outRect.set(0, 0, 0, 0);
            return outRect;
        }
        outRect.left = child.getLeft();
        outRect.right = child.getRight();
        outRect.top = child.getTop();
        outRect.bottom = child.getBottom();
        ViewParent parent = child.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup group = (ViewGroup) parent;
            outRect.left += group.getLeft();
            outRect.right += group.getRight();
            outRect.top += group.getTop();
            outRect.bottom += group.getBottom();
            parent = group.getParent();
        }
        return outRect;
    }

    public boolean D() {
        int i2 = this.f1848g;
        if (i2 <= 0) {
            return false;
        }
        Q(i2 - 1, true);
        return true;
    }

    public boolean E() {
        a.u.a.a aVar = this.f1847f;
        if (aVar == null || this.f1848g >= aVar.getCount() - 1) {
            return false;
        }
        Q(this.f1848g + 1, true);
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        f ii;
        int focusableCount = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View child = getChildAt(i2);
                if (child.getVisibility() == 0 && (ii = v(child)) != null && ii.f1853b == this.f1848g) {
                    child.addFocusables(views, direction, focusableMode);
                }
            }
        }
        if ((descendantFocusability == 262144 && focusableCount != views.size()) || !isFocusable()) {
            return;
        }
        if ((focusableMode & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            views.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> views) {
        f ii;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 0 && (ii = v(child)) != null && ii.f1853b == this.f1848g) {
                child.addTouchables(views);
            }
        }
    }

    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        int end;
        int increment;
        int index;
        f ii;
        int count = getChildCount();
        if ((direction & 2) != 0) {
            index = 0;
            increment = 1;
            end = count;
        } else {
            index = count - 1;
            increment = -1;
            end = -1;
        }
        for (int i2 = index; i2 != end; i2 += increment) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 0 && (ii = v(child)) != null && ii.f1853b == this.f1848g && child.requestFocus(direction, previouslyFocusedRect)) {
                return true;
            }
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        f ii;
        if (event.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(event);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 0 && (ii = v(child)) != null && ii.f1853b == this.f1848g && child.dispatchPopulateAccessibilityEvent(event)) {
                return true;
            }
        }
        return false;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return generateDefaultLayoutParams();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof g) && super.checkLayoutParams(p2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new g(getContext(), attrs);
    }

    public class h extends a.h.m.a {
        public h() {
        }

        @Override // a.h.m.a
        public void f(View host, AccessibilityEvent event) {
            a.u.a.a aVar;
            super.f(host, event);
            event.setClassName(ViewPager.class.getName());
            event.setScrollable(n());
            if (event.getEventType() == 4096 && (aVar = ViewPager.this.f1847f) != null) {
                event.setItemCount(aVar.getCount());
                event.setFromIndex(ViewPager.this.f1848g);
                event.setToIndex(ViewPager.this.f1848g);
            }
        }

        @Override // a.h.m.a
        public void g(View host, a.h.m.c0.d info) {
            super.g(host, info);
            info.K(ViewPager.class.getName());
            info.R(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                info.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                info.a(8192);
            }
        }

        @Override // a.h.m.a
        public boolean j(View host, int action, Bundle args) {
            if (super.j(host, action, args)) {
                return true;
            }
            if (action != 4096) {
                if (action != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f1848g - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f1848g + 1);
                return true;
            }
        }

        public final boolean n() {
            a.u.a.a aVar = ViewPager.this.f1847f;
            return aVar != null && aVar.getCount() > 1;
        }
    }

    public class k extends DataSetObserver {
        public k() {
        }

        public void onChanged() {
            ViewPager.this.l();
        }

        public void onInvalidated() {
            ViewPager.this.l();
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1857a;

        /* renamed from: b  reason: collision with root package name */
        public int f1858b;

        /* renamed from: c  reason: collision with root package name */
        public float f1859c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1860d;

        /* renamed from: e  reason: collision with root package name */
        public int f1861e;

        /* renamed from: f  reason: collision with root package name */
        public int f1862f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a2 = context.obtainStyledAttributes(attrs, ViewPager.b0);
            this.f1858b = a2.getInteger(0, 48);
            a2.recycle();
        }
    }

    public static class m implements Comparator<View> {
        /* renamed from: a */
        public int compare(View lhs, View rhs) {
            g llp = (g) lhs.getLayoutParams();
            g rlp = (g) rhs.getLayoutParams();
            boolean z = llp.f1857a;
            if (z != rlp.f1857a) {
                return z ? 1 : -1;
            }
            return llp.f1861e - rlp.f1861e;
        }
    }
}
