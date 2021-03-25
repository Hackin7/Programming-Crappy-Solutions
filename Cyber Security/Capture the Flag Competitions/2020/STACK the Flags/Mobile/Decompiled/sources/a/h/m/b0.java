package a.h.m;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

public class b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f912b = new a().a().a().b().c();

    /* renamed from: a  reason: collision with root package name */
    public final i f913a;

    public b0(WindowInsets insets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f913a = new h(this, insets);
        } else if (i2 >= 28) {
            this.f913a = new g(this, insets);
        } else {
            this.f913a = new f(this, insets);
        }
    }

    public b0(b0 src) {
        if (src != null) {
            i srcImpl = src.f913a;
            if (Build.VERSION.SDK_INT >= 29 && (srcImpl instanceof h)) {
                this.f913a = new h(this, (h) srcImpl);
            } else if (Build.VERSION.SDK_INT >= 28 && (srcImpl instanceof g)) {
                this.f913a = new g(this, (g) srcImpl);
            } else if (srcImpl instanceof f) {
                this.f913a = new f(this, (f) srcImpl);
            } else if (srcImpl instanceof e) {
                this.f913a = new e(this, (e) srcImpl);
            } else {
                this.f913a = new i(this);
            }
        } else {
            this.f913a = new i(this);
        }
    }

    public static b0 n(WindowInsets insets) {
        a.h.l.h.b(insets);
        return new b0(insets);
    }

    public int e() {
        return h().f812a;
    }

    public int g() {
        return h().f813b;
    }

    public int f() {
        return h().f814c;
    }

    public int d() {
        return h().f815d;
    }

    public boolean k() {
        return this.f913a.h();
    }

    public b0 c() {
        return this.f913a.c();
    }

    @Deprecated
    public b0 l(int left, int top, int right, int bottom) {
        a aVar = new a(this);
        aVar.c(a.h.f.b.a(left, top, right, bottom));
        return aVar.a();
    }

    public b0 b() {
        return this.f913a.b();
    }

    public b0 a() {
        return this.f913a.a();
    }

    public a.h.f.b h() {
        return this.f913a.f();
    }

    public b0 i(int left, int top, int right, int bottom) {
        return this.f913a.g(left, top, right, bottom);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b0)) {
            return false;
        }
        return a.h.l.c.a(this.f913a, ((b0) o).f913a);
    }

    public int hashCode() {
        i iVar = this.f913a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public WindowInsets m() {
        i iVar = this.f913a;
        if (iVar instanceof e) {
            return ((e) iVar).f922b;
        }
        return null;
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f925a;

        public i(b0 host) {
            this.f925a = host;
        }

        public boolean i() {
            return false;
        }

        public boolean h() {
            return false;
        }

        public b0 c() {
            return this.f925a;
        }

        public b0 b() {
            return this.f925a;
        }

        public c d() {
            return null;
        }

        public b0 a() {
            return this.f925a;
        }

        public a.h.f.b f() {
            return a.h.f.b.f811e;
        }

        public a.h.f.b e() {
            return a.h.f.b.f811e;
        }

        public b0 g(int left, int top, int right, int bottom) {
            return b0.f912b;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            i impl = (i) o;
            if (i() != impl.i() || h() != impl.h() || !a.h.l.c.a(f(), impl.f()) || !a.h.l.c.a(e(), impl.e()) || !a.h.l.c.a(d(), impl.d())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return a.h.l.c.b(Boolean.valueOf(i()), Boolean.valueOf(h()), f(), e(), d());
        }
    }

    public static class e extends i {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets f922b;

        /* renamed from: c  reason: collision with root package name */
        public a.h.f.b f923c;

        public e(b0 host, WindowInsets insets) {
            super(host);
            this.f923c = null;
            this.f922b = insets;
        }

        public e(b0 host, e other) {
            this(host, new WindowInsets(other.f922b));
        }

        @Override // a.h.m.b0.i
        public boolean i() {
            return this.f922b.isRound();
        }

        @Override // a.h.m.b0.i
        public final a.h.f.b f() {
            if (this.f923c == null) {
                this.f923c = a.h.f.b.a(this.f922b.getSystemWindowInsetLeft(), this.f922b.getSystemWindowInsetTop(), this.f922b.getSystemWindowInsetRight(), this.f922b.getSystemWindowInsetBottom());
            }
            return this.f923c;
        }

        @Override // a.h.m.b0.i
        public b0 g(int left, int top, int right, int bottom) {
            a b2 = new a(b0.n(this.f922b));
            b2.c(b0.j(f(), left, top, right, bottom));
            b2.b(b0.j(e(), left, top, right, bottom));
            return b2.a();
        }
    }

    public static class f extends e {

        /* renamed from: d  reason: collision with root package name */
        public a.h.f.b f924d = null;

        public f(b0 host, WindowInsets insets) {
            super(host, insets);
        }

        public f(b0 host, f other) {
            super(host, other);
        }

        @Override // a.h.m.b0.i
        public boolean h() {
            return this.f922b.isConsumed();
        }

        @Override // a.h.m.b0.i
        public b0 b() {
            return b0.n(this.f922b.consumeStableInsets());
        }

        @Override // a.h.m.b0.i
        public b0 c() {
            return b0.n(this.f922b.consumeSystemWindowInsets());
        }

        @Override // a.h.m.b0.i
        public final a.h.f.b e() {
            if (this.f924d == null) {
                this.f924d = a.h.f.b.a(this.f922b.getStableInsetLeft(), this.f922b.getStableInsetTop(), this.f922b.getStableInsetRight(), this.f922b.getStableInsetBottom());
            }
            return this.f924d;
        }
    }

    public static class g extends f {
        public g(b0 host, WindowInsets insets) {
            super(host, insets);
        }

        public g(b0 host, g other) {
            super(host, other);
        }

        @Override // a.h.m.b0.i
        public c d() {
            return c.a(this.f922b.getDisplayCutout());
        }

        @Override // a.h.m.b0.i
        public b0 a() {
            return b0.n(this.f922b.consumeDisplayCutout());
        }

        @Override // a.h.m.b0.i
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            return Objects.equals(this.f922b, ((g) o).f922b);
        }

        @Override // a.h.m.b0.i
        public int hashCode() {
            return this.f922b.hashCode();
        }
    }

    public static class h extends g {
        public h(b0 host, WindowInsets insets) {
            super(host, insets);
        }

        public h(b0 host, h other) {
            super(host, other);
        }

        @Override // a.h.m.b0.i, a.h.m.b0.e
        public b0 g(int left, int top, int right, int bottom) {
            return b0.n(this.f922b.inset(left, top, right, bottom));
        }
    }

    public static a.h.f.b j(a.h.f.b insets, int left, int top, int right, int bottom) {
        int newLeft = Math.max(0, insets.f812a - left);
        int newTop = Math.max(0, insets.f813b - top);
        int newRight = Math.max(0, insets.f814c - right);
        int newBottom = Math.max(0, insets.f815d - bottom);
        if (newLeft == left && newTop == top && newRight == right && newBottom == bottom) {
            return insets;
        }
        return a.h.f.b.a(newLeft, newTop, newRight, newBottom);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f914a;

        public a() {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f914a = new c();
            } else {
                this.f914a = new b();
            }
        }

        public a(b0 insets) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f914a = new c(insets);
            } else {
                this.f914a = new b(insets);
            }
        }

        public a c(a.h.f.b insets) {
            this.f914a.c(insets);
            return this;
        }

        public a b(a.h.f.b insets) {
            this.f914a.b(insets);
            return this;
        }

        public b0 a() {
            return this.f914a.a();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f921a;

        public abstract b0 a();

        public abstract void c(a.h.f.b bVar);

        public d() {
            this(new b0((b0) null));
        }

        public d(b0 insets) {
            this.f921a = insets;
        }

        public void b(a.h.f.b insets) {
        }
    }

    public static class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public static Field f915c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f916d = false;

        /* renamed from: e  reason: collision with root package name */
        public static Constructor<WindowInsets> f917e;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f918f = false;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f919b;

        public b() {
            this.f919b = d();
        }

        public b(b0 insets) {
            this.f919b = insets.m();
        }

        @Override // a.h.m.b0.d
        public void c(a.h.f.b insets) {
            WindowInsets windowInsets = this.f919b;
            if (windowInsets != null) {
                this.f919b = windowInsets.replaceSystemWindowInsets(insets.f812a, insets.f813b, insets.f814c, insets.f815d);
            }
        }

        @Override // a.h.m.b0.d
        public b0 a() {
            return b0.n(this.f919b);
        }

        public static WindowInsets d() {
            if (!f916d) {
                try {
                    f915c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f916d = true;
            }
            Field field = f915c;
            if (field != null) {
                try {
                    WindowInsets consumed = (WindowInsets) field.get(null);
                    if (consumed != null) {
                        return new WindowInsets(consumed);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f918f) {
                try {
                    f917e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f918f = true;
            }
            Constructor<WindowInsets> constructor = f917e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }
    }

    public static class c extends d {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f920b;

        public c() {
            this.f920b = new WindowInsets.Builder();
        }

        public c(b0 insets) {
            WindowInsets.Builder builder;
            WindowInsets platInsets = insets.m();
            if (platInsets != null) {
                builder = new WindowInsets.Builder(platInsets);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f920b = builder;
        }

        @Override // a.h.m.b0.d
        public void c(a.h.f.b insets) {
            this.f920b.setSystemWindowInsets(insets.b());
        }

        @Override // a.h.m.b0.d
        public void b(a.h.f.b insets) {
            this.f920b.setStableInsets(insets.b());
        }

        @Override // a.h.m.b0.d
        public b0 a() {
            return b0.n(this.f920b.build());
        }
    }
}
