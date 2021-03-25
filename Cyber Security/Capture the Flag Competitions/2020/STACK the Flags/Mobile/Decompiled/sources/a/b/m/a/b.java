package a.b.m.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

public class b extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    public c f103b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f104c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f105d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f106e;

    /* renamed from: f  reason: collision with root package name */
    public int f107f = 255;

    /* renamed from: g  reason: collision with root package name */
    public boolean f108g;
    public int h = -1;
    public boolean i;
    public Runnable j;
    public long k;
    public long l;
    public C0004b m;

    public abstract c b();

    public void draw(Canvas canvas) {
        Drawable drawable = this.f105d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f106e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f103b.getChangingConfigurations();
    }

    public final boolean e() {
        if (!isAutoMirrored() || a.h.f.l.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    public boolean getPadding(Rect padding) {
        boolean result;
        Rect r = this.f103b.l();
        if (r != null) {
            padding.set(r);
            result = (((r.left | r.top) | r.bottom) | r.right) != 0;
        } else {
            Drawable drawable = this.f105d;
            if (drawable != null) {
                result = drawable.getPadding(padding);
            } else {
                result = super.getPadding(padding);
            }
        }
        if (e()) {
            int left = padding.left;
            padding.left = padding.right;
            padding.right = left;
        }
        return result;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f105d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int alpha) {
        if (!this.f108g || this.f107f != alpha) {
            this.f108g = true;
            this.f107f = alpha;
            Drawable drawable = this.f105d;
            if (drawable == null) {
                return;
            }
            if (this.k == 0) {
                drawable.setAlpha(alpha);
            } else {
                a(false);
            }
        }
    }

    public int getAlpha() {
        return this.f107f;
    }

    public void setDither(boolean dither) {
        c cVar = this.f103b;
        if (cVar.x != dither) {
            cVar.x = dither;
            Drawable drawable = this.f105d;
            if (drawable != null) {
                drawable.setDither(dither);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f103b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f105d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList tint) {
        c cVar = this.f103b;
        cVar.H = true;
        if (cVar.F != tint) {
            cVar.F = tint;
            a.h.f.l.a.o(this.f105d, tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        c cVar = this.f103b;
        cVar.I = true;
        if (cVar.G != tintMode) {
            cVar.G = tintMode;
            a.h.f.l.a.p(this.f105d, tintMode);
        }
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f106e;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        Drawable drawable2 = this.f105d;
        if (drawable2 != null) {
            drawable2.setBounds(bounds);
        }
    }

    public void setAutoMirrored(boolean mirrored) {
        c cVar = this.f103b;
        if (cVar.C != mirrored) {
            cVar.C = mirrored;
            Drawable drawable = this.f105d;
            if (drawable != null) {
                a.h.f.l.a.j(drawable, mirrored);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f103b.C;
    }

    public void jumpToCurrentState() {
        boolean changed = false;
        Drawable drawable = this.f106e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f106e = null;
            changed = true;
        }
        Drawable drawable2 = this.f105d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f108g) {
                this.f105d.setAlpha(this.f107f);
            }
        }
        if (this.l != 0) {
            this.l = 0;
            changed = true;
        }
        if (this.k != 0) {
            this.k = 0;
            changed = true;
        }
        if (changed) {
            invalidateSelf();
        }
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f105d;
        if (drawable != null) {
            a.h.f.l.a.k(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Rect rect = this.f104c;
        if (rect == null) {
            this.f104c = new Rect(left, top, right, bottom);
        } else {
            rect.set(left, top, right, bottom);
        }
        Drawable drawable = this.f105d;
        if (drawable != null) {
            a.h.f.l.a.l(drawable, left, top, right, bottom);
        }
    }

    public void getHotspotBounds(Rect outRect) {
        Rect rect = this.f104c;
        if (rect != null) {
            outRect.set(rect);
        } else {
            super.getHotspotBounds(outRect);
        }
    }

    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f106e;
        if (drawable != null) {
            return drawable.setState(state);
        }
        Drawable drawable2 = this.f105d;
        if (drawable2 != null) {
            return drawable2.setState(state);
        }
        return false;
    }

    public boolean onLevelChange(int level) {
        Drawable drawable = this.f106e;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        Drawable drawable2 = this.f105d;
        if (drawable2 != null) {
            return drawable2.setLevel(level);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return this.f103b.w(layoutDirection, c());
    }

    public int getIntrinsicWidth() {
        if (this.f103b.q()) {
            return this.f103b.m();
        }
        Drawable drawable = this.f105d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.f103b.q()) {
            return this.f103b.i();
        }
        Drawable drawable = this.f105d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.f103b.q()) {
            return this.f103b.k();
        }
        Drawable drawable = this.f105d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.f103b.q()) {
            return this.f103b.j();
        }
        Drawable drawable = this.f105d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable who) {
        c cVar = this.f103b;
        if (cVar != null) {
            cVar.p();
        }
        if (who == this.f105d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (who == this.f105d && getCallback() != null) {
            getCallback().scheduleDrawable(this, what, when);
        }
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (who == this.f105d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, what);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        Drawable drawable = this.f106e;
        if (drawable != null) {
            drawable.setVisible(visible, restart);
        }
        Drawable drawable2 = this.f105d;
        if (drawable2 != null) {
            drawable2.setVisible(visible, restart);
        }
        return changed;
    }

    public int getOpacity() {
        Drawable drawable = this.f105d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f103b.n();
    }

    public int c() {
        return this.h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    public boolean g(int index) {
        Runnable runnable;
        if (index == this.h) {
            return false;
        }
        long now = SystemClock.uptimeMillis();
        if (this.f103b.B > 0) {
            Drawable drawable = this.f106e;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f105d;
            if (drawable2 != null) {
                this.f106e = drawable2;
                this.l = ((long) this.f103b.B) + now;
            } else {
                this.f106e = null;
                this.l = 0;
            }
        } else {
            Drawable drawable3 = this.f105d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (index >= 0) {
            c cVar = this.f103b;
            if (index < cVar.h) {
                Drawable d2 = cVar.g(index);
                this.f105d = d2;
                this.h = index;
                if (d2 != null) {
                    int i2 = this.f103b.A;
                    if (i2 > 0) {
                        this.k = ((long) i2) + now;
                    }
                    d(d2);
                }
                if (!(this.k == 0 && this.l == 0)) {
                    runnable = this.j;
                    if (runnable != null) {
                        this.j = new a();
                    } else {
                        unscheduleSelf(runnable);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f105d = null;
        this.h = -1;
        runnable = this.j;
        if (runnable != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    public final void d(Drawable d2) {
        if (this.m == null) {
            this.m = new C0004b();
        }
        C0004b bVar = this.m;
        bVar.b(d2.getCallback());
        d2.setCallback(bVar);
        try {
            if (this.f103b.A <= 0 && this.f108g) {
                d2.setAlpha(this.f107f);
            }
            if (this.f103b.E) {
                d2.setColorFilter(this.f103b.D);
            } else {
                if (this.f103b.H) {
                    a.h.f.l.a.o(d2, this.f103b.F);
                }
                if (this.f103b.I) {
                    a.h.f.l.a.p(d2, this.f103b.G);
                }
            }
            d2.setVisible(isVisible(), true);
            d2.setDither(this.f103b.x);
            d2.setState(getState());
            d2.setLevel(getLevel());
            d2.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                d2.setLayoutDirection(getLayoutDirection());
            }
            d2.setAutoMirrored(this.f103b.C);
            Rect hotspotBounds = this.f104c;
            if (hotspotBounds != null) {
                d2.setHotspotBounds(hotspotBounds.left, hotspotBounds.top, hotspotBounds.right, hotspotBounds.bottom);
            }
        } finally {
            d2.setCallback(this.m.a());
        }
    }

    public void a(boolean schedule) {
        this.f108g = true;
        long now = SystemClock.uptimeMillis();
        boolean animating = false;
        Drawable drawable = this.f105d;
        if (drawable != null) {
            long j2 = this.k;
            if (j2 != 0) {
                if (j2 <= now) {
                    drawable.setAlpha(this.f107f);
                    this.k = 0;
                } else {
                    drawable.setAlpha(((255 - (((int) ((j2 - now) * 255)) / this.f103b.A)) * this.f107f) / 255);
                    animating = true;
                }
            }
        } else {
            this.k = 0;
        }
        Drawable drawable2 = this.f106e;
        if (drawable2 != null) {
            long j3 = this.l;
            if (j3 != 0) {
                if (j3 <= now) {
                    drawable2.setVisible(false, false);
                    this.f106e = null;
                    this.l = 0;
                } else {
                    drawable2.setAlpha((this.f107f * (((int) ((j3 - now) * 255)) / this.f103b.B)) / 255);
                    animating = true;
                }
            }
        } else {
            this.l = 0;
        }
        if (schedule && animating) {
            scheduleSelf(this.j, 16 + now);
        }
    }

    public Drawable getCurrent() {
        return this.f105d;
    }

    public final void i(Resources res) {
        this.f103b.y(res);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f103b.b(theme);
    }

    public boolean canApplyTheme() {
        return this.f103b.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f103b.c()) {
            return null;
        }
        this.f103b.f114d = getChangingConfigurations();
        return this.f103b;
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            c clone = b();
            clone.r();
            h(clone);
            this.i = true;
        }
        return this;
    }

    public static abstract class c extends Drawable.ConstantState {
        public int A = 0;
        public int B = 0;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final b f111a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f112b;

        /* renamed from: c  reason: collision with root package name */
        public int f113c = 160;

        /* renamed from: d  reason: collision with root package name */
        public int f114d;

        /* renamed from: e  reason: collision with root package name */
        public int f115e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f116f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f117g;
        public int h;
        public boolean i = false;
        public boolean j;
        public Rect k;
        public boolean l = false;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x = true;
        public boolean y;
        public int z;

        public abstract void r();

        public c(c orig, b owner, Resources res) {
            this.f111a = owner;
            this.f112b = res != null ? res : orig != null ? orig.f112b : null;
            int f2 = b.f(res, orig != null ? orig.f113c : 0);
            this.f113c = f2;
            if (orig != null) {
                this.f114d = orig.f114d;
                this.f115e = orig.f115e;
                this.v = true;
                this.w = true;
                this.i = orig.i;
                this.l = orig.l;
                this.x = orig.x;
                this.y = orig.y;
                this.z = orig.z;
                this.A = orig.A;
                this.B = orig.B;
                this.C = orig.C;
                this.D = orig.D;
                this.E = orig.E;
                this.F = orig.F;
                this.G = orig.G;
                this.H = orig.H;
                this.I = orig.I;
                if (orig.f113c == f2) {
                    if (orig.j) {
                        this.k = new Rect(orig.k);
                        this.j = true;
                    }
                    if (orig.m) {
                        this.n = orig.n;
                        this.o = orig.o;
                        this.p = orig.p;
                        this.q = orig.q;
                        this.m = true;
                    }
                }
                if (orig.r) {
                    this.s = orig.s;
                    this.r = true;
                }
                if (orig.t) {
                    this.u = orig.u;
                    this.t = true;
                }
                Drawable[] origDr = orig.f117g;
                this.f117g = new Drawable[origDr.length];
                this.h = orig.h;
                SparseArray<Drawable.ConstantState> origDf = orig.f116f;
                if (origDf != null) {
                    this.f116f = origDf.clone();
                } else {
                    this.f116f = new SparseArray<>(this.h);
                }
                int count = this.h;
                for (int i2 = 0; i2 < count; i2++) {
                    if (origDr[i2] != null) {
                        Drawable.ConstantState cs = origDr[i2].getConstantState();
                        if (cs != null) {
                            this.f116f.put(i2, cs);
                        } else {
                            this.f117g[i2] = origDr[i2];
                        }
                    }
                }
                return;
            }
            this.f117g = new Drawable[10];
            this.h = 0;
        }

        public int getChangingConfigurations() {
            return this.f114d | this.f115e;
        }

        public final int a(Drawable dr) {
            int pos = this.h;
            if (pos >= this.f117g.length) {
                o(pos, pos + 10);
            }
            dr.mutate();
            dr.setVisible(false, true);
            dr.setCallback(this.f111a);
            this.f117g[pos] = dr;
            this.h++;
            this.f115e |= dr.getChangingConfigurations();
            p();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return pos;
        }

        public void p() {
            this.r = false;
            this.t = false;
        }

        public final int f() {
            return this.f117g.length;
        }

        public final void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f116f;
            if (sparseArray != null) {
                int futureCount = sparseArray.size();
                for (int keyIndex = 0; keyIndex < futureCount; keyIndex++) {
                    this.f117g[this.f116f.keyAt(keyIndex)] = s(this.f116f.valueAt(keyIndex).newDrawable(this.f112b));
                }
                this.f116f = null;
            }
        }

        public final Drawable s(Drawable child) {
            if (Build.VERSION.SDK_INT >= 23) {
                child.setLayoutDirection(this.z);
            }
            Drawable child2 = child.mutate();
            child2.setCallback(this.f111a);
            return child2;
        }

        public final int h() {
            return this.h;
        }

        public final Drawable g(int index) {
            int keyIndex;
            Drawable result = this.f117g[index];
            if (result != null) {
                return result;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f116f;
            if (sparseArray == null || (keyIndex = sparseArray.indexOfKey(index)) < 0) {
                return null;
            }
            Drawable prepared = s(this.f116f.valueAt(keyIndex).newDrawable(this.f112b));
            this.f117g[index] = prepared;
            this.f116f.removeAt(keyIndex);
            if (this.f116f.size() == 0) {
                this.f116f = null;
            }
            return prepared;
        }

        public final boolean w(int layoutDirection, int currentIndex) {
            boolean changed = false;
            int count = this.h;
            Drawable[] drawables = this.f117g;
            for (int i2 = 0; i2 < count; i2++) {
                if (drawables[i2] != null) {
                    boolean childChanged = false;
                    if (Build.VERSION.SDK_INT >= 23) {
                        childChanged = drawables[i2].setLayoutDirection(layoutDirection);
                    }
                    if (i2 == currentIndex) {
                        changed = childChanged;
                    }
                }
            }
            this.z = layoutDirection;
            return changed;
        }

        public final void y(Resources res) {
            if (res != null) {
                this.f112b = res;
                int targetDensity = b.f(res, this.f113c);
                int sourceDensity = this.f113c;
                this.f113c = targetDensity;
                if (sourceDensity != targetDensity) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int count = this.h;
                Drawable[] drawables = this.f117g;
                for (int i2 = 0; i2 < count; i2++) {
                    if (drawables[i2] != null && drawables[i2].canApplyTheme()) {
                        drawables[i2].applyTheme(theme);
                        this.f115e |= drawables[i2].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int count = this.h;
            Drawable[] drawables = this.f117g;
            for (int i2 = 0; i2 < count; i2++) {
                Drawable d2 = drawables[i2];
                if (d2 == null) {
                    Drawable.ConstantState future = this.f116f.get(i2);
                    if (future != null && future.canApplyTheme()) {
                        return true;
                    }
                } else if (d2.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final void x(boolean variable) {
            this.i = variable;
        }

        public final Rect l() {
            if (this.i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            e();
            Rect r2 = null;
            Rect t2 = new Rect();
            int count = this.h;
            Drawable[] drawables = this.f117g;
            for (int i2 = 0; i2 < count; i2++) {
                if (drawables[i2].getPadding(t2)) {
                    if (r2 == null) {
                        r2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = t2.left;
                    if (i3 > r2.left) {
                        r2.left = i3;
                    }
                    int i4 = t2.top;
                    if (i4 > r2.top) {
                        r2.top = i4;
                    }
                    int i5 = t2.right;
                    if (i5 > r2.right) {
                        r2.right = i5;
                    }
                    int i6 = t2.bottom;
                    if (i6 > r2.bottom) {
                        r2.bottom = i6;
                    }
                }
            }
            this.j = true;
            this.k = r2;
            return r2;
        }

        public final void t(boolean constant) {
            this.l = constant;
        }

        public final boolean q() {
            return this.l;
        }

        public final int m() {
            if (!this.m) {
                d();
            }
            return this.n;
        }

        public final int i() {
            if (!this.m) {
                d();
            }
            return this.o;
        }

        public final int k() {
            if (!this.m) {
                d();
            }
            return this.p;
        }

        public final int j() {
            if (!this.m) {
                d();
            }
            return this.q;
        }

        public void d() {
            this.m = true;
            e();
            int count = this.h;
            Drawable[] drawables = this.f117g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < count; i2++) {
                Drawable dr = drawables[i2];
                int s2 = dr.getIntrinsicWidth();
                if (s2 > this.n) {
                    this.n = s2;
                }
                int s3 = dr.getIntrinsicHeight();
                if (s3 > this.o) {
                    this.o = s3;
                }
                int s4 = dr.getMinimumWidth();
                if (s4 > this.p) {
                    this.p = s4;
                }
                int s5 = dr.getMinimumHeight();
                if (s5 > this.q) {
                    this.q = s5;
                }
            }
        }

        public final void u(int duration) {
            this.A = duration;
        }

        public final void v(int duration) {
            this.B = duration;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            e();
            int count = this.h;
            Drawable[] drawables = this.f117g;
            int op = count > 0 ? drawables[0].getOpacity() : -2;
            for (int i2 = 1; i2 < count; i2++) {
                op = Drawable.resolveOpacity(op, drawables[i2].getOpacity());
            }
            this.s = op;
            this.r = true;
            return op;
        }

        public void o(int oldSize, int newSize) {
            Drawable[] newDrawables = new Drawable[newSize];
            System.arraycopy(this.f117g, 0, newDrawables, 0, oldSize);
            this.f117g = newDrawables;
        }

        public synchronized boolean c() {
            if (this.v) {
                return this.w;
            }
            e();
            this.v = true;
            int count = this.h;
            Drawable[] drawables = this.f117g;
            for (int i2 = 0; i2 < count; i2++) {
                if (drawables[i2].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }
    }

    public void h(c state) {
        this.f103b = state;
        int i2 = this.h;
        if (i2 >= 0) {
            Drawable g2 = state.g(i2);
            this.f105d = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.f106e = null;
    }

    /* renamed from: a.b.m.a.b$b  reason: collision with other inner class name */
    public static class C0004b implements Drawable.Callback {

        /* renamed from: b  reason: collision with root package name */
        public Drawable.Callback f110b;

        public C0004b b(Drawable.Callback callback) {
            this.f110b = callback;
            return this;
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f110b;
            this.f110b = null;
            return callback;
        }

        public void invalidateDrawable(Drawable who) {
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Drawable.Callback callback = this.f110b;
            if (callback != null) {
                callback.scheduleDrawable(who, what, when);
            }
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            Drawable.Callback callback = this.f110b;
            if (callback != null) {
                callback.unscheduleDrawable(who, what);
            }
        }
    }

    public static int f(Resources r, int parentDensity) {
        int densityDpi = r == null ? parentDensity : r.getDisplayMetrics().densityDpi;
        if (densityDpi == 0) {
            return 160;
        }
        return densityDpi;
    }
}
