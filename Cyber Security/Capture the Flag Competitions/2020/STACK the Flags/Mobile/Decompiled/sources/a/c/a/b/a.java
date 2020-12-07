package a.c.a.b;

import a.c.a.b.b;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f486f = new HashMap<>();

    @Override // a.c.a.b.b
    public b.c<K, V> c(K k) {
        return this.f486f.get(k);
    }

    public V i(K key, V v) {
        SafeIterableMap.Entry<K, V> current = c(key);
        if (current != null) {
            return current.f492c;
        }
        this.f486f.put(key, f(key, v));
        return null;
    }

    @Override // a.c.a.b.b
    public V g(K key) {
        V removed = (V) super.g(key);
        this.f486f.remove(key);
        return removed;
    }

    public boolean contains(K key) {
        return this.f486f.containsKey(key);
    }

    public Map.Entry<K, V> h(K k) {
        if (contains(k)) {
            return this.f486f.get(k).f494e;
        }
        return null;
    }
}
