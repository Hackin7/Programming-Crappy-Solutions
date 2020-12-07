package a.k.a;

import a.m.p;
import a.m.q;
import a.m.r;
import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class l extends p {
    public static final q.a h = new a();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<Fragment> f1091b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, l> f1092c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, r> f1093d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1094e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1095f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1096g = false;

    public static class a implements q.a {
        @Override // a.m.q.a
        public <T extends p> T a(Class<T> cls) {
            return new l(true);
        }
    }

    public static l g(r viewModelStore) {
        return (l) new q(viewModelStore, h).a(l.class);
    }

    public l(boolean stateAutomaticallySaved) {
        this.f1094e = stateAutomaticallySaved;
    }

    @Override // a.m.p
    public void c() {
        boolean z = j.H;
        this.f1095f = true;
    }

    public boolean j() {
        return this.f1095f;
    }

    public boolean d(Fragment fragment) {
        return this.f1091b.add(fragment);
    }

    public Collection<Fragment> h() {
        return this.f1091b;
    }

    public boolean l(Fragment fragment) {
        if (!this.f1091b.contains(fragment)) {
            return true;
        }
        if (this.f1094e) {
            return this.f1095f;
        }
        return !this.f1096g;
    }

    public boolean k(Fragment fragment) {
        return this.f1091b.remove(fragment);
    }

    public l f(Fragment f2) {
        l childNonConfig = this.f1092c.get(f2.mWho);
        if (childNonConfig != null) {
            return childNonConfig;
        }
        l childNonConfig2 = new l(this.f1094e);
        this.f1092c.put(f2.mWho, childNonConfig2);
        return childNonConfig2;
    }

    public r i(Fragment f2) {
        r viewModelStore = this.f1093d.get(f2.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        r viewModelStore2 = new r();
        this.f1093d.put(f2.mWho, viewModelStore2);
        return viewModelStore2;
    }

    public void e(Fragment f2) {
        boolean z = j.H;
        l childNonConfig = this.f1092c.get(f2.mWho);
        if (childNonConfig != null) {
            childNonConfig.c();
            this.f1092c.remove(f2.mWho);
        }
        r viewModelStore = this.f1093d.get(f2.mWho);
        if (viewModelStore != null) {
            viewModelStore.a();
            this.f1093d.remove(f2.mWho);
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        l that = (l) o;
        if (!this.f1091b.equals(that.f1091b) || !this.f1092c.equals(that.f1092c) || !this.f1093d.equals(that.f1093d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f1091b.hashCode() * 31) + this.f1092c.hashCode()) * 31) + this.f1093d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> fragmentIterator = this.f1091b.iterator();
        while (fragmentIterator.hasNext()) {
            sb.append(fragmentIterator.next());
            if (fragmentIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> childNonConfigIterator = this.f1092c.keySet().iterator();
        while (childNonConfigIterator.hasNext()) {
            sb.append(childNonConfigIterator.next());
            if (childNonConfigIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> viewModelStoreIterator = this.f1093d.keySet().iterator();
        while (viewModelStoreIterator.hasNext()) {
            sb.append(viewModelStoreIterator.next());
            if (viewModelStoreIterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
