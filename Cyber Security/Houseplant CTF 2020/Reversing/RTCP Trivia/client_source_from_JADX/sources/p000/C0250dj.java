package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: dj */
public abstract class C0250dj<K, V> {

    /* renamed from: b */
    C0252b f1189b;

    /* renamed from: c */
    C0253c f1190c;

    /* renamed from: d */
    C0255e f1191d;

    /* renamed from: dj$a */
    final class C0251a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f1192a;

        /* renamed from: b */
        int f1193b;

        /* renamed from: c */
        int f1194c;

        /* renamed from: d */
        boolean f1195d = false;

        C0251a(int i) {
            this.f1192a = i;
            this.f1193b = C0250dj.this.mo1377a();
        }

        public final boolean hasNext() {
            return this.f1194c < this.f1193b;
        }

        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T a = C0250dj.this.mo1379a(this.f1194c, this.f1192a);
            this.f1194c++;
            this.f1195d = true;
            return a;
        }

        public final void remove() {
            if (!this.f1195d) {
                throw new IllegalStateException();
            }
            this.f1194c--;
            this.f1193b--;
            this.f1195d = false;
            C0250dj.this.mo1381a(this.f1194c);
        }
    }

    /* renamed from: dj$b */
    final class C0252b implements Set<Entry<K, V>> {
        C0252b() {
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = C0250dj.this.mo1377a();
            for (Entry entry : collection) {
                C0250dj.this.mo1382a(entry.getKey(), entry.getValue());
            }
            return a != C0250dj.this.mo1377a();
        }

        public final void clear() {
            C0250dj.this.mo1385c();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C0250dj.this.mo1378a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0247dg.m801a(C0250dj.this.mo1379a(a, 1), entry.getValue());
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C0250dj.m815a((Set<T>) this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a = C0250dj.this.mo1377a() - 1; a >= 0; a--) {
                Object a2 = C0250dj.this.mo1379a(a, 0);
                Object a3 = C0250dj.this.mo1379a(a, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public final boolean isEmpty() {
            return C0250dj.this.mo1377a() == 0;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C0254d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return C0250dj.this.mo1377a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: dj$c */
    final class C0253c implements Set<K> {
        C0253c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C0250dj.this.mo1385c();
        }

        public final boolean contains(Object obj) {
            return C0250dj.this.mo1378a(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map b = C0250dj.this.mo1384b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C0250dj.m815a((Set<T>) this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a = C0250dj.this.mo1377a() - 1; a >= 0; a--) {
                Object a2 = C0250dj.this.mo1379a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public final boolean isEmpty() {
            return C0250dj.this.mo1377a() == 0;
        }

        public final Iterator<K> iterator() {
            return new C0251a(0);
        }

        public final boolean remove(Object obj) {
            int a = C0250dj.this.mo1378a(obj);
            if (a < 0) {
                return false;
            }
            C0250dj.this.mo1381a(a);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map b = C0250dj.this.mo1384b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            return size != b.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return C0250dj.m814a(C0250dj.this.mo1384b(), collection);
        }

        public final int size() {
            return C0250dj.this.mo1377a();
        }

        public final Object[] toArray() {
            return C0250dj.this.mo1414b(0);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0250dj.this.mo1413a(tArr, 0);
        }
    }

    /* renamed from: dj$d */
    final class C0254d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: a */
        int f1199a;

        /* renamed from: b */
        int f1200b;

        /* renamed from: c */
        boolean f1201c = false;

        C0254d() {
            this.f1199a = C0250dj.this.mo1377a() - 1;
            this.f1200b = -1;
        }

        public final boolean equals(Object obj) {
            if (!this.f1201c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                return C0247dg.m801a(entry.getKey(), C0250dj.this.mo1379a(this.f1200b, 0)) && C0247dg.m801a(entry.getValue(), C0250dj.this.mo1379a(this.f1200b, 1));
            }
        }

        public final K getKey() {
            if (this.f1201c) {
                return C0250dj.this.mo1379a(this.f1200b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f1201c) {
                return C0250dj.this.mo1379a(this.f1200b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f1200b < this.f1199a;
        }

        public final int hashCode() {
            if (!this.f1201c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = 0;
            Object a = C0250dj.this.mo1379a(this.f1200b, 0);
            Object a2 = C0250dj.this.mo1379a(this.f1200b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return hashCode ^ i;
        }

        public final /* synthetic */ Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1200b++;
            this.f1201c = true;
            return this;
        }

        public final void remove() {
            if (!this.f1201c) {
                throw new IllegalStateException();
            }
            C0250dj.this.mo1381a(this.f1200b);
            this.f1200b--;
            this.f1199a--;
            this.f1201c = false;
        }

        public final V setValue(V v) {
            if (this.f1201c) {
                return C0250dj.this.mo1380a(this.f1200b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: dj$e */
    final class C0255e implements Collection<V> {
        C0255e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C0250dj.this.mo1385c();
        }

        public final boolean contains(Object obj) {
            return C0250dj.this.mo1383b(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return C0250dj.this.mo1377a() == 0;
        }

        public final Iterator<V> iterator() {
            return new C0251a(1);
        }

        public final boolean remove(Object obj) {
            int b = C0250dj.this.mo1383b(obj);
            if (b < 0) {
                return false;
            }
            C0250dj.this.mo1381a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int a = C0250dj.this.mo1377a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0250dj.this.mo1379a(i, 1))) {
                    C0250dj.this.mo1381a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int a = C0250dj.this.mo1377a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0250dj.this.mo1379a(i, 1))) {
                    C0250dj.this.mo1381a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return C0250dj.this.mo1377a();
        }

        public final Object[] toArray() {
            return C0250dj.this.mo1414b(1);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0250dj.this.mo1413a(tArr, 1);
        }
    }

    C0250dj() {
    }

    /* renamed from: a */
    public static <K, V> boolean m814a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public static <T> boolean m815a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1377a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1378a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1379a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo1380a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1381a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1382a(K k, V v);

    /* renamed from: a */
    public final <T> T[] mo1413a(T[] tArr, int i) {
        int a = mo1377a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo1379a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1383b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo1384b();

    /* renamed from: b */
    public final Object[] mo1414b(int i) {
        int a = mo1377a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo1379a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo1385c();

    /* renamed from: d */
    public final Set<K> mo1415d() {
        if (this.f1190c == null) {
            this.f1190c = new C0253c<>();
        }
        return this.f1190c;
    }
}
