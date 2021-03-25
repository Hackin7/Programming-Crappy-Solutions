package a.e;

import a.e.f;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f509f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f510g = new Object[0];
    public static Object[] h;
    public static int i;
    public static Object[] j;
    public static int k;

    /* renamed from: b  reason: collision with root package name */
    public int[] f511b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f512c;

    /* renamed from: d  reason: collision with root package name */
    public int f513d;

    /* renamed from: e  reason: collision with root package name */
    public f<E, E> f514e;

    public final int e(Object key, int hash) {
        int N = this.f513d;
        if (N == 0) {
            return -1;
        }
        int index = c.a(this.f511b, N, hash);
        if (index < 0 || key.equals(this.f512c[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f511b[end] == hash) {
            if (key.equals(this.f512c[end])) {
                return end;
            }
            end++;
        }
        int i2 = index - 1;
        while (i2 >= 0 && this.f511b[i2] == hash) {
            if (key.equals(this.f512c[i2])) {
                return i2;
            }
            i2--;
        }
        return ~end;
    }

    public final int f() {
        int N = this.f513d;
        if (N == 0) {
            return -1;
        }
        int index = c.a(this.f511b, N, 0);
        if (index < 0 || this.f512c[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f511b[end] == 0) {
            if (this.f512c[end] == null) {
                return end;
            }
            end++;
        }
        int i2 = index - 1;
        while (i2 >= 0 && this.f511b[i2] == 0) {
            if (this.f512c[i2] == null) {
                return i2;
            }
            i2--;
        }
        return ~end;
    }

    public final void a(int size) {
        if (size == 8) {
            synchronized (b.class) {
                if (j != null) {
                    Object[] array = j;
                    this.f512c = array;
                    j = (Object[]) array[0];
                    this.f511b = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    k--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (b.class) {
                if (h != null) {
                    Object[] array2 = h;
                    this.f512c = array2;
                    h = (Object[]) array2[0];
                    this.f511b = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.f511b = new int[size];
        this.f512c = new Object[size];
    }

    public static void c(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (b.class) {
                if (k < 10) {
                    array[0] = j;
                    array[1] = hashes;
                    for (int i2 = size - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    j = array;
                    k++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (b.class) {
                if (i < 10) {
                    array[0] = h;
                    array[1] = hashes;
                    for (int i3 = size - 1; i3 >= 2; i3--) {
                        array[i3] = null;
                    }
                    h = array;
                    i++;
                }
            }
        }
    }

    public b() {
        this(0);
    }

    public b(int capacity) {
        if (capacity == 0) {
            this.f511b = f509f;
            this.f512c = f510g;
        } else {
            a(capacity);
        }
        this.f513d = 0;
    }

    public void clear() {
        int i2 = this.f513d;
        if (i2 != 0) {
            c(this.f511b, this.f512c, i2);
            this.f511b = f509f;
            this.f512c = f510g;
            this.f513d = 0;
        }
    }

    public void b(int minimumCapacity) {
        if (this.f511b.length < minimumCapacity) {
            int[] ohashes = this.f511b;
            Object[] oarray = this.f512c;
            a(minimumCapacity);
            int i2 = this.f513d;
            if (i2 > 0) {
                System.arraycopy(ohashes, 0, this.f511b, 0, i2);
                System.arraycopy(oarray, 0, this.f512c, 0, this.f513d);
            }
            c(ohashes, oarray, this.f513d);
        }
    }

    public boolean contains(Object key) {
        return indexOf(key) >= 0;
    }

    public int indexOf(Object key) {
        return key == null ? f() : e(key, key.hashCode());
    }

    public E h(int index) {
        return (E) this.f512c[index];
    }

    public boolean isEmpty() {
        return this.f513d <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E value) {
        int index;
        int hash;
        if (value == null) {
            hash = 0;
            index = f();
        } else {
            hash = value.hashCode();
            index = e(value, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = ~index;
        int i2 = this.f513d;
        if (i2 >= this.f511b.length) {
            int n = 4;
            if (i2 >= 8) {
                n = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                n = 8;
            }
            int[] ohashes = this.f511b;
            Object[] oarray = this.f512c;
            a(n);
            int[] iArr = this.f511b;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.f512c, 0, oarray.length);
            }
            c(ohashes, oarray, this.f513d);
        }
        int i3 = this.f513d;
        if (index2 < i3) {
            int[] iArr2 = this.f511b;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i3 - index2);
            Object[] objArr = this.f512c;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.f513d - index2);
        }
        this.f511b[index2] = hash;
        this.f512c[index2] = value;
        this.f513d++;
        return true;
    }

    public boolean remove(Object object) {
        int index = indexOf(object);
        if (index < 0) {
            return false;
        }
        g(index);
        return true;
    }

    public E g(int index) {
        Object[] objArr = this.f512c;
        E e2 = (E) objArr[index];
        int i2 = this.f513d;
        if (i2 <= 1) {
            c(this.f511b, objArr, i2);
            this.f511b = f509f;
            this.f512c = f510g;
            this.f513d = 0;
        } else {
            int[] iArr = this.f511b;
            int n = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = this.f513d - 1;
                this.f513d = i3;
                if (index < i3) {
                    int[] iArr2 = this.f511b;
                    System.arraycopy(iArr2, index + 1, iArr2, index, i3 - index);
                    Object[] objArr2 = this.f512c;
                    System.arraycopy(objArr2, index + 1, objArr2, index, this.f513d - index);
                }
                this.f512c[this.f513d] = null;
            } else {
                if (i2 > 8) {
                    n = i2 + (i2 >> 1);
                }
                int[] ohashes = this.f511b;
                Object[] oarray = this.f512c;
                a(n);
                this.f513d--;
                if (index > 0) {
                    System.arraycopy(ohashes, 0, this.f511b, 0, index);
                    System.arraycopy(oarray, 0, this.f512c, 0, index);
                }
                int i4 = this.f513d;
                if (index < i4) {
                    System.arraycopy(ohashes, index + 1, this.f511b, index, i4 - index);
                    System.arraycopy(oarray, index + 1, this.f512c, index, this.f513d - index);
                }
            }
        }
        return e2;
    }

    public int size() {
        return this.f513d;
    }

    public Object[] toArray() {
        int i2 = this.f513d;
        Object[] result = new Object[i2];
        System.arraycopy(this.f512c, 0, result, 0, i2);
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] array) {
        if (array.length < this.f513d) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), this.f513d);
        }
        System.arraycopy(this.f512c, 0, array, 0, this.f513d);
        int length = array.length;
        int i2 = this.f513d;
        if (length > i2) {
            array[i2] = null;
        }
        return array;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f513d; i2++) {
            try {
                if (!set.contains(h(i2))) {
                    return false;
                }
            } catch (NullPointerException e2) {
                return false;
            } catch (ClassCastException e3) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] hashes = this.f511b;
        int result = 0;
        int s = this.f513d;
        for (int i2 = 0; i2 < s; i2++) {
            result += hashes[i2];
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f513d * 14);
        buffer.append('{');
        for (int i2 = 0; i2 < this.f513d; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            Object value = h(i2);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Set)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }

    public class a extends f<E, E> {
        public a() {
        }

        @Override // a.e.f
        public int d() {
            return b.this.f513d;
        }

        @Override // a.e.f
        public Object b(int index, int offset) {
            return b.this.f512c[index];
        }

        @Override // a.e.f
        public int e(Object key) {
            return b.this.indexOf(key);
        }

        @Override // a.e.f
        public int f(Object value) {
            return b.this.indexOf(value);
        }

        @Override // a.e.f
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // a.e.f
        public void g(E key, E e2) {
            b.this.add(key);
        }

        @Override // a.e.f
        public E i(int index, E e2) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // a.e.f
        public void h(int index) {
            b.this.g(index);
        }

        @Override // a.e.f
        public void a() {
            b.this.clear();
        }
    }

    public final f<E, E> d() {
        if (this.f514e == null) {
            this.f514e = new a();
        }
        return this.f514e;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return ((f.c) d().m()).iterator();
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

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.e.b<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f513d + collection.size());
        boolean added = false;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            added |= add(it.next());
        }
        return added;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        boolean removed = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            removed |= remove(it.next());
        }
        return removed;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean removed = false;
        for (int i2 = this.f513d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f512c[i2])) {
                g(i2);
                removed = true;
            }
        }
        return removed;
    }
}
