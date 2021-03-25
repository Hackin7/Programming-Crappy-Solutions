package a.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {
    public f<K, V> i;

    public a() {
    }

    public a(int capacity) {
        super(capacity);
    }

    public a(g map) {
        super(map);
    }

    /* renamed from: a.e.a$a  reason: collision with other inner class name */
    public class C0010a extends f<K, V> {
        public C0010a() {
        }

        @Override // a.e.f
        public int d() {
            return a.this.f551d;
        }

        @Override // a.e.f
        public Object b(int index, int offset) {
            return a.this.f550c[(index << 1) + offset];
        }

        @Override // a.e.f
        public int e(Object key) {
            return a.this.f(key);
        }

        @Override // a.e.f
        public int f(Object value) {
            return a.this.h(value);
        }

        @Override // a.e.f
        public Map<K, V> c() {
            return a.this;
        }

        @Override // a.e.f
        public void g(K key, V value) {
            a.this.put(key, value);
        }

        @Override // a.e.f
        public V i(int index, V value) {
            return (V) a.this.l(index, value);
        }

        @Override // a.e.f
        public void h(int index) {
            a.this.k(index);
        }

        @Override // a.e.f
        public void a() {
            a.this.clear();
        }
    }

    public final f<K, V> n() {
        if (this.i == null) {
            this.i = new C0010a();
        }
        return this.i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.e.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f551d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean o(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return n().m();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return n().n();
    }
}
