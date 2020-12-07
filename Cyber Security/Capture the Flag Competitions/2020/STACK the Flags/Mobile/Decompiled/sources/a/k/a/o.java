package a.k.a;

import a.m.d;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f1103a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f1104b;

    /* renamed from: c  reason: collision with root package name */
    public int f1105c;

    /* renamed from: d  reason: collision with root package name */
    public int f1106d;

    /* renamed from: e  reason: collision with root package name */
    public int f1107e;

    /* renamed from: f  reason: collision with root package name */
    public int f1108f;

    /* renamed from: g  reason: collision with root package name */
    public int f1109g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public boolean p = false;
    public ArrayList<Runnable> q;

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1110a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f1111b;

        /* renamed from: c  reason: collision with root package name */
        public int f1112c;

        /* renamed from: d  reason: collision with root package name */
        public int f1113d;

        /* renamed from: e  reason: collision with root package name */
        public int f1114e;

        /* renamed from: f  reason: collision with root package name */
        public int f1115f;

        /* renamed from: g  reason: collision with root package name */
        public d.b f1116g;
        public d.b h;

        public a() {
        }

        public a(int cmd, Fragment fragment) {
            this.f1110a = cmd;
            this.f1111b = fragment;
            d.b bVar = d.b.RESUMED;
            this.f1116g = bVar;
            this.h = bVar;
        }

        public a(int cmd, Fragment fragment, d.b state) {
            this.f1110a = cmd;
            this.f1111b = fragment;
            this.f1116g = fragment.mMaxState;
            this.h = state;
        }
    }

    public void d(a op) {
        this.f1103a.add(op);
        op.f1112c = this.f1104b;
        op.f1113d = this.f1105c;
        op.f1114e = this.f1106d;
        op.f1115f = this.f1107e;
    }

    public o c(Fragment fragment, String tag) {
        i(0, fragment, tag, 1);
        return this;
    }

    public o b(int containerViewId, Fragment fragment) {
        i(containerViewId, fragment, null, 1);
        return this;
    }

    public void i(int containerViewId, Fragment fragment, String tag, int opcmd) {
        Class<?> fragmentClass = fragment.getClass();
        int modifiers = fragmentClass.getModifiers();
        if (fragmentClass.isAnonymousClass() || !Modifier.isPublic(modifiers) || (fragmentClass.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + fragmentClass.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (tag != null) {
            String str = fragment.mTag;
            if (str == null || tag.equals(str)) {
                fragment.mTag = tag;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + tag);
            }
        }
        if (containerViewId != 0) {
            if (containerViewId != -1) {
                int i2 = fragment.mFragmentId;
                if (i2 == 0 || i2 == containerViewId) {
                    fragment.mFragmentId = containerViewId;
                    fragment.mContainerId = containerViewId;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + containerViewId);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + tag + " to container view with no id");
            }
        }
        d(new a(opcmd, fragment));
    }

    public o j(Fragment fragment) {
        d(new a(3, fragment));
        return this;
    }

    public o k(Fragment fragment, d.b state) {
        d(new a(10, fragment, state));
        return this;
    }

    public o h() {
        if (!this.h) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
