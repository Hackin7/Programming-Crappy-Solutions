package a.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public f<K, V>.b f531a;

    /* renamed from: b  reason: collision with root package name */
    public f<K, V>.c f532b;

    /* renamed from: c  reason: collision with root package name */
    public f<K, V>.e f533c;

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k, V v);

    public abstract void h(int i);

    public abstract V i(int i, V v);

    public final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        public final int f534b;

        /* renamed from: c  reason: collision with root package name */
        public int f535c;

        /* renamed from: d  reason: collision with root package name */
        public int f536d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f537e = false;

        public a(int offset) {
            this.f534b = offset;
            this.f535c = f.this.d();
        }

        public boolean hasNext() {
            return this.f536d < this.f535c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) f.this.b(this.f536d, this.f534b);
                this.f536d++;
                this.f537e = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f537e) {
                int i = this.f536d - 1;
                this.f536d = i;
                this.f535c--;
                this.f537e = false;
                f.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public int f541b;

        /* renamed from: c  reason: collision with root package name */
        public int f542c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f543d = false;

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            a();
            return this;
        }

        public d() {
            this.f541b = f.this.d() - 1;
            this.f542c = -1;
        }

        public boolean hasNext() {
            return this.f542c < this.f541b;
        }

        public Map.Entry<K, V> a() {
            if (hasNext()) {
                this.f542c++;
                this.f543d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f543d) {
                f.this.h(this.f542c);
                this.f542c--;
                this.f541b--;
                this.f543d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f543d) {
                return (K) f.this.b(this.f542c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f543d) {
                return (V) f.this.b(this.f542c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V setValue(V object) {
            if (this.f543d) {
                return (V) f.this.i(this.f542c, object);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object o) {
            if (!this.f543d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(o instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry<?, ?> e2 = (Map.Entry) o;
                if (!c.c(e2.getKey(), f.this.b(this.f542c, 0)) || !c.c(e2.getValue(), f.this.b(this.f542c, 1))) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            if (this.f543d) {
                int i = 0;
                Object key = f.this.b(this.f542c, 0);
                Object value = f.this.b(this.f542c, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i = value.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            a();
            throw null;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ljava/util/Map$Entry<TK;TV;>;)Z */
        public boolean a() {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.e.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int oldSize = f.this.d();
            for (Map.Entry<K, V> entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return oldSize != f.this.d();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e2 = (Map.Entry) o;
            int index = f.this.e(e2.getKey());
            if (index < 0) {
                return false;
            }
            return c.c(f.this.b(index, 1), e2.getValue());
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object object) {
            return f.k(this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = f.this.d() - 1; i >= 0; i--) {
                int i2 = 0;
                Object key = f.this.b(i, 0);
                Object value = f.this.b(i, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i2 = value.hashCode();
                }
                result += i2 ^ hashCode;
            }
            return result;
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object object) {
            return f.this.e(object) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object object) {
            int index = f.this.e(object);
            if (index < 0) {
                return false;
            }
            f.this.h(index);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] array) {
            return (T[]) f.this.r(array, 0);
        }

        public boolean equals(Object object) {
            return f.k(this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = f.this.d() - 1; i >= 0; i--) {
                int i2 = 0;
                Object obj = f.this.b(i, 0);
                if (obj != null) {
                    i2 = obj.hashCode();
                }
                result += i2;
            }
            return result;
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object object) {
            return f.this.f(object) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object object) {
            int index = f.this.f(object);
            if (index < 0) {
                return false;
            }
            f.this.h(index);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int N = f.this.d();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int N = f.this.d();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (!collection.contains(f.this.b(i, 1))) {
                    f.this.h(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            return (T[]) f.this.r(array, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return oldSize != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return oldSize != map.size();
    }

    public Object[] q(int offset) {
        int N = d();
        Object[] result = new Object[N];
        for (int i = 0; i < N; i++) {
            result[i] = b(i, offset);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARNING: Unknown variable types count: 1 */
    public <T> T[] r(T[] array, int offset) {
        int N = d();
        if (array.length < N) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), N);
        }
        for (int i = 0; i < N; i++) {
            array[i] = b(i, offset);
        }
        if (array.length > N) {
            array[N] = null;
        }
        return array;
    }

    public static <T> boolean k(Set<T> set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> s = (Set) object;
        try {
            if (set.size() != s.size() || !set.containsAll(s)) {
                return false;
            }
            return true;
        } catch (NullPointerException e2) {
            return false;
        } catch (ClassCastException e3) {
            return false;
        }
    }

    public Set<Map.Entry<K, V>> l() {
        if (this.f531a == null) {
            this.f531a = new b();
        }
        return this.f531a;
    }

    public Set<K> m() {
        if (this.f532b == null) {
            this.f532b = new c();
        }
        return this.f532b;
    }

    public Collection<V> n() {
        if (this.f533c == null) {
            this.f533c = new e();
        }
        return this.f533c;
    }
}
