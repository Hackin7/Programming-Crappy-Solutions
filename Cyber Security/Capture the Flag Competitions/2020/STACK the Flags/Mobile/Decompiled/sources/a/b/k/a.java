package a.b.k;

import a.b.j;
import a.b.o.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

public abstract class a {

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract void a();
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract int d();

    public abstract Context e();

    public abstract boolean i(int i, KeyEvent keyEvent);

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n(CharSequence charSequence);

    public void g(Configuration config) {
    }

    public a.b.o.b o(b.a callback) {
        return null;
    }

    public boolean k() {
        return false;
    }

    public boolean a() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean j(KeyEvent event) {
        return false;
    }

    public void h() {
    }

    /* renamed from: a.b.k.a$a  reason: collision with other inner class name */
    public static class C0000a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2a;

        public C0000a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f2a = 0;
            TypedArray a2 = c2.obtainStyledAttributes(attrs, j.ActionBarLayout);
            this.f2a = a2.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            a2.recycle();
        }

        public C0000a(int width, int height) {
            super(width, height);
            this.f2a = 0;
            this.f2a = 8388627;
        }

        public C0000a(C0000a source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f2a = 0;
            this.f2a = source.f2a;
        }

        public C0000a(ViewGroup.LayoutParams source) {
            super(source);
            this.f2a = 0;
        }
    }
}
