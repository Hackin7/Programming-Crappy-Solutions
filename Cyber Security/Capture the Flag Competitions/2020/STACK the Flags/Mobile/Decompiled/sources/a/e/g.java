package a.e;

import androidx.collection.SimpleArrayMap;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class g<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static Object[] f546e;

    /* renamed from: f  reason: collision with root package name */
    public static int f547f;

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f548g;
    public static int h;

    /* renamed from: b  reason: collision with root package name */
    public int[] f549b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f550c;

    /* renamed from: d  reason: collision with root package name */
    public int f551d;

    public static int b(int[] hashes, int N, int hash) {
        try {
            return c.a(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object key, int hash) {
        int N = this.f551d;
        if (N == 0) {
            return -1;
        }
        int index = b(this.f549b, N, hash);
        if (index < 0 || key.equals(this.f550c[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f549b[end] == hash) {
            if (key.equals(this.f550c[end << 1])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f549b[i] == hash) {
            if (key.equals(this.f550c[i << 1])) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    public int g() {
        int N = this.f551d;
        if (N == 0) {
            return -1;
        }
        int index = b(this.f549b, N, 0);
        if (index < 0 || this.f550c[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f549b[end] == 0) {
            if (this.f550c[end << 1] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f549b[i] == 0) {
            if (this.f550c[i << 1] == null) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    public final void a(int size) {
        if (size == 8) {
            synchronized (g.class) {
                if (f548g != null) {
                    Object[] array = f548g;
                    this.f550c = array;
                    f548g = (Object[]) array[0];
                    this.f549b = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    h--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (g.class) {
                if (f546e != null) {
                    Object[] array2 = f546e;
                    this.f550c = array2;
                    f546e = (Object[]) array2[0];
                    this.f549b = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f547f--;
                    return;
                }
            }
        }
        this.f549b = new int[size];
        this.f550c = new Object[(size << 1)];
    }

    public static void d(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (g.class) {
                if (h < 10) {
                    array[0] = f548g;
                    array[1] = hashes;
                    for (int i = (size << 1) - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    f548g = array;
                    h++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (g.class) {
                if (f547f < 10) {
                    array[0] = f546e;
                    array[1] = hashes;
                    for (int i2 = (size << 1) - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f546e = array;
                    f547f++;
                }
            }
        }
    }

    public g() {
        this.f549b = c.f516a;
        this.f550c = c.f518c;
        this.f551d = 0;
    }

    public g(int capacity) {
        if (capacity == 0) {
            this.f549b = c.f516a;
            this.f550c = c.f518c;
        } else {
            a(capacity);
        }
        this.f551d = 0;
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }

    public void clear() {
        if (this.f551d > 0) {
            int[] ohashes = this.f549b;
            Object[] oarray = this.f550c;
            int osize = this.f551d;
            this.f549b = c.f516a;
            this.f550c = c.f518c;
            this.f551d = 0;
            d(ohashes, oarray, osize);
        }
        if (this.f551d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void c(int minimumCapacity) {
        int osize = this.f551d;
        if (this.f549b.length < minimumCapacity) {
            int[] ohashes = this.f549b;
            Object[] oarray = this.f550c;
            a(minimumCapacity);
            if (this.f551d > 0) {
                System.arraycopy(ohashes, 0, this.f549b, 0, osize);
                System.arraycopy(oarray, 0, this.f550c, 0, osize << 1);
            }
            d(ohashes, oarray, osize);
        }
        if (this.f551d != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object key) {
        return f(key) >= 0;
    }

    public int f(Object key) {
        return key == null ? g() : e(key, key.hashCode());
    }

    public int h(Object value) {
        int N = this.f551d * 2;
        Object[] array = this.f550c;
        if (value == null) {
            for (int i = 1; i < N; i += 2) {
                if (array[i] == null) {
                    return i >> 1;
                }
            }
            return -1;
        }
        for (int i2 = 1; i2 < N; i2 += 2) {
            if (value.equals(array[i2])) {
                return i2 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object value) {
        return h(value) >= 0;
    }

    public V get(Object key) {
        return getOrDefault(key, null);
    }

    public V getOrDefault(Object key, V defaultValue) {
        int index = f(key);
        return index >= 0 ? (V) this.f550c[(index << 1) + 1] : defaultValue;
    }

    public K i(int index) {
        return (K) this.f550c[index << 1];
    }

    public V m(int index) {
        return (V) this.f550c[(index << 1) + 1];
    }

    public V l(int index, V value) {
        int index2 = (index << 1) + 1;
        Object[] objArr = this.f550c;
        V old = (V) objArr[index2];
        objArr[index2] = value;
        return old;
    }

    public boolean isEmpty() {
        return this.f551d <= 0;
    }

    public V put(K key, V value) {
        int index;
        int hash;
        int osize = this.f551d;
        if (key == null) {
            hash = 0;
            index = g();
        } else {
            hash = key.hashCode();
            index = e(key, hash);
        }
        if (index >= 0) {
            int index2 = (index << 1) + 1;
            Object[] objArr = this.f550c;
            V old = (V) objArr[index2];
            objArr[index2] = value;
            return old;
        }
        int index3 = ~index;
        if (osize >= this.f549b.length) {
            int n = 4;
            if (osize >= 8) {
                n = (osize >> 1) + osize;
            } else if (osize >= 4) {
                n = 8;
            }
            int[] ohashes = this.f549b;
            Object[] oarray = this.f550c;
            a(n);
            if (osize == this.f551d) {
                int[] iArr = this.f549b;
                if (iArr.length > 0) {
                    System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                    System.arraycopy(oarray, 0, this.f550c, 0, oarray.length);
                }
                d(ohashes, oarray, osize);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index3 < osize) {
            int[] iArr2 = this.f549b;
            System.arraycopy(iArr2, index3, iArr2, index3 + 1, osize - index3);
            Object[] objArr2 = this.f550c;
            System.arraycopy(objArr2, index3 << 1, objArr2, (index3 + 1) << 1, (this.f551d - index3) << 1);
        }
        int i = this.f551d;
        if (osize == i) {
            int[] iArr3 = this.f549b;
            if (index3 < iArr3.length) {
                iArr3[index3] = hash;
                Object[] objArr3 = this.f550c;
                objArr3[index3 << 1] = key;
                objArr3[(index3 << 1) + 1] = value;
                this.f551d = i + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.e.g<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public void j(g<? extends K, ? extends V> gVar) {
        int N = gVar.f551d;
        c(this.f551d + N);
        if (this.f551d != 0) {
            for (int i = 0; i < N; i++) {
                put(gVar.i(i), gVar.m(i));
            }
        } else if (N > 0) {
            System.arraycopy(gVar.f549b, 0, this.f549b, 0, N);
            System.arraycopy(gVar.f550c, 0, this.f550c, 0, N << 1);
            this.f551d = N;
        }
    }

    public V putIfAbsent(K key, V value) {
        V mapValue = get(key);
        if (mapValue == null) {
            return put(key, value);
        }
        return mapValue;
    }

    public V remove(Object key) {
        int index = f(key);
        if (index >= 0) {
            return k(index);
        }
        return null;
    }

    public boolean remove(Object key, Object value) {
        int index = f(key);
        if (index < 0) {
            return false;
        }
        V mapValue = m(index);
        if (value != mapValue && (value == null || !value.equals(mapValue))) {
            return false;
        }
        k(index);
        return true;
    }

    public V k(int index) {
        int nsize;
        Object[] objArr = this.f550c;
        V v = (V) objArr[(index << 1) + 1];
        int osize = this.f551d;
        if (osize <= 1) {
            d(this.f549b, objArr, osize);
            this.f549b = c.f516a;
            this.f550c = c.f518c;
            nsize = 0;
        } else {
            nsize = osize - 1;
            int[] iArr = this.f549b;
            int n = 8;
            if (iArr.length <= 8 || this.f551d >= iArr.length / 3) {
                if (index < nsize) {
                    int[] iArr2 = this.f549b;
                    System.arraycopy(iArr2, index + 1, iArr2, index, nsize - index);
                    Object[] objArr2 = this.f550c;
                    System.arraycopy(objArr2, (index + 1) << 1, objArr2, index << 1, (nsize - index) << 1);
                }
                Object[] objArr3 = this.f550c;
                objArr3[nsize << 1] = null;
                objArr3[(nsize << 1) + 1] = null;
            } else {
                if (osize > 8) {
                    n = osize + (osize >> 1);
                }
                int[] ohashes = this.f549b;
                Object[] oarray = this.f550c;
                a(n);
                if (osize == this.f551d) {
                    if (index > 0) {
                        System.arraycopy(ohashes, 0, this.f549b, 0, index);
                        System.arraycopy(oarray, 0, this.f550c, 0, index << 1);
                    }
                    if (index < nsize) {
                        System.arraycopy(ohashes, index + 1, this.f549b, index, nsize - index);
                        System.arraycopy(oarray, (index + 1) << 1, this.f550c, index << 1, (nsize - index) << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (osize == this.f551d) {
            this.f551d = nsize;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V replace(K key, V value) {
        int index = f(key);
        if (index >= 0) {
            return l(index, value);
        }
        return null;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int index = f(key);
        if (index < 0) {
            return false;
        }
        V mapValue = m(index);
        if (mapValue != oldValue && (oldValue == null || !oldValue.equals(mapValue))) {
            return false;
        }
        l(index, newValue);
        return true;
    }

    public int size() {
        return this.f551d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof g) {
            SimpleArrayMap<?, ?> map = (g) object;
            if (size() != map.size()) {
                return false;
            }
            for (int i = 0; i < this.f551d; i++) {
                try {
                    K key = i(i);
                    V mine = m(i);
                    Object theirs = map.get(key);
                    if (mine == null) {
                        if (theirs != null || !map.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
                        return false;
                    }
                } catch (NullPointerException e2) {
                    return false;
                } catch (ClassCastException e3) {
                    return false;
                }
            }
            return true;
        } else if (!(object instanceof Map)) {
            return false;
        } else {
            Map<?, ?> map2 = (Map) object;
            if (size() != map2.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f551d; i2++) {
                try {
                    K key2 = i(i2);
                    V mine2 = m(i2);
                    Object theirs2 = map2.get(key2);
                    if (mine2 == null) {
                        if (theirs2 != null || !map2.containsKey(key2)) {
                            return false;
                        }
                    } else if (!mine2.equals(theirs2)) {
                        return false;
                    }
                } catch (NullPointerException e4) {
                    return false;
                } catch (ClassCastException e5) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] hashes = this.f549b;
        Object[] array = this.f550c;
        int result = 0;
        int i = 0;
        int v = 1;
        int s = this.f551d;
        while (i < s) {
            Object value = array[v];
            result += hashes[i] ^ (value == null ? 0 : value.hashCode());
            i++;
            v += 2;
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f551d * 28);
        buffer.append('{');
        for (int i = 0; i < this.f551d; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object key = i(i);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = m(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }
}
