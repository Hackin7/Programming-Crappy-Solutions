package a.c.a.b;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f487b;

    /* renamed from: c  reason: collision with root package name */
    public c<K, V> f488c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f489d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public int f490e = 0;

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> c(K k) {
        SafeIterableMap.Entry<K, V> currentNode = this.f487b;
        while (currentNode != null && !currentNode.f491b.equals(k)) {
            currentNode = currentNode.f493d;
        }
        return currentNode;
    }

    public c<K, V> f(K key, V v) {
        SafeIterableMap.Entry<K, V> newEntry = new c<>(key, v);
        this.f490e++;
        c<K, V> cVar = this.f488c;
        if (cVar == null) {
            this.f487b = newEntry;
            this.f488c = newEntry;
            return newEntry;
        }
        cVar.f493d = newEntry;
        newEntry.f494e = cVar;
        this.f488c = newEntry;
        return newEntry;
    }

    public V g(K key) {
        c<K, V> toRemove = c(key);
        if (toRemove == null) {
            return null;
        }
        this.f490e--;
        if (!this.f489d.isEmpty()) {
            Iterator<f<K, V>> it = this.f489d.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(toRemove);
            }
        }
        c<K, V> cVar = toRemove.f494e;
        if (cVar != null) {
            cVar.f493d = toRemove.f493d;
        } else {
            this.f487b = toRemove.f493d;
        }
        c<K, V> cVar2 = toRemove.f493d;
        if (cVar2 != null) {
            cVar2.f494e = toRemove.f494e;
        } else {
            this.f488c = toRemove.f494e;
        }
        toRemove.f493d = null;
        toRemove.f494e = null;
        return toRemove.f492c;
    }

    public int size() {
        return this.f490e;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        SafeIterableMap.ListIterator<K, V> iterator = new a<>(this.f487b, this.f488c);
        this.f489d.put(iterator, false);
        return iterator;
    }

    public Iterator<Map.Entry<K, V>> a() {
        SafeIterableMap.DescendingIterator<K, V> iterator = new C0009b<>(this.f488c, this.f487b);
        this.f489d.put(iterator, false);
        return iterator;
    }

    public b<K, V>.d d() {
        SafeIterableMap<K, V>.IteratorWithAdditions iterator = new d();
        this.f489d.put(iterator, false);
        return iterator;
    }

    public Map.Entry<K, V> b() {
        return this.f487b;
    }

    public Map.Entry<K, V> e() {
        return this.f488c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b map = (b) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> iterator1 = iterator();
        Iterator iterator2 = map.iterator();
        while (((e) iterator1).hasNext() && ((e) iterator2).hasNext()) {
            Map.Entry<K, V> next1 = (Map.Entry) ((e) iterator1).next();
            Object next2 = ((e) iterator2).next();
            if ((next1 == null && next2 != null) || (next1 != null && !next1.equals(next2))) {
                return false;
            }
        }
        if (((e) iterator1).hasNext() || ((e) iterator2).hasNext()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int h = 0;
        Iterator<Map.Entry<K, V>> i = iterator();
        while (((e) i).hasNext()) {
            h += ((Map.Entry) ((e) i).next()).hashCode();
        }
        return h;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Iterator<Map.Entry<K, V>> iterator = iterator();
        while (((e) iterator).hasNext()) {
            builder.append(((Map.Entry) ((e) iterator).next()).toString());
            if (((e) iterator).hasNext()) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f498b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f499c;

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f498b = cVar2;
            this.f499c = cVar;
        }

        public boolean hasNext() {
            return this.f499c != null;
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f498b == cVar && cVar == this.f499c) {
                this.f499c = null;
                this.f498b = null;
            }
            c<K, V> cVar2 = this.f498b;
            if (cVar2 == cVar) {
                this.f498b = b(cVar2);
            }
            if (this.f499c == cVar) {
                this.f499c = e();
            }
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.f499c;
            c<K, V> cVar2 = this.f498b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.f499c;
            this.f499c = e();
            return result;
        }
    }

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f493d;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f494e;
        }
    }

    /* renamed from: a.c.a.b.b$b  reason: collision with other inner class name */
    public static class C0009b<K, V> extends e<K, V> {
        public C0009b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f494e;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f493d;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f495b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f496c = true;

        public d() {
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f495b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f494e;
                this.f495b = cVar3;
                this.f496c = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (!this.f496c) {
                c<K, V> cVar = this.f495b;
                if (cVar == null || cVar.f493d == null) {
                    return false;
                }
                return true;
            } else if (b.this.f487b != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f496c) {
                this.f496c = false;
                this.f495b = b.this.f487b;
            } else {
                c<K, V> cVar = this.f495b;
                this.f495b = cVar != null ? cVar.f493d : null;
            }
            return this.f495b;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public final K f491b;

        /* renamed from: c  reason: collision with root package name */
        public final V f492c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f493d;

        /* renamed from: e  reason: collision with root package name */
        public c<K, V> f494e;

        public c(K key, V value) {
            this.f491b = key;
            this.f492c = value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f491b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f492c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f491b) + "=" + ((Object) this.f492c);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c entry = (c) obj;
            if (!this.f491b.equals(entry.f491b) || !this.f492c.equals(entry.f492c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f491b.hashCode() ^ this.f492c.hashCode();
        }
    }
}
