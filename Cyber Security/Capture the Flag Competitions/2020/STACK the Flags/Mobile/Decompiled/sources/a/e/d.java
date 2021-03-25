package a.e;

import androidx.collection.LongSparseArray;

public class d<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f519f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f520b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f521c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f522d;

    /* renamed from: e  reason: collision with root package name */
    public int f523e;

    public d() {
        this(10);
    }

    public d(int initialCapacity) {
        this.f520b = false;
        if (initialCapacity == 0) {
            this.f521c = c.f517b;
            this.f522d = c.f518c;
            return;
        }
        int initialCapacity2 = c.f(initialCapacity);
        this.f521c = new long[initialCapacity2];
        this.f522d = new Object[initialCapacity2];
    }

    /* renamed from: c */
    public d<E> clone() {
        try {
            LongSparseArray<E> clone = (d) super.clone();
            clone.f521c = (long[]) this.f521c.clone();
            clone.f522d = (Object[]) this.f522d.clone();
            return clone;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E f(long key) {
        return g(key, null);
    }

    public E g(long key, E valueIfKeyNotFound) {
        int i = c.b(this.f521c, this.f523e, key);
        if (i >= 0) {
            Object[] objArr = this.f522d;
            if (objArr[i] != f519f) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    public void k(long key) {
        Object[] objArr;
        Object obj;
        int i = c.b(this.f521c, this.f523e, key);
        if (i >= 0 && (objArr = this.f522d)[i] != (obj = f519f)) {
            objArr[i] = obj;
            this.f520b = true;
        }
    }

    public void l(int index) {
        Object[] objArr = this.f522d;
        Object obj = objArr[index];
        Object obj2 = f519f;
        if (obj != obj2) {
            objArr[index] = obj2;
            this.f520b = true;
        }
    }

    public final void e() {
        int n = this.f523e;
        int o = 0;
        long[] keys = this.f521c;
        Object[] values = this.f522d;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f519f) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f520b = false;
        this.f523e = o;
    }

    public void j(long key, E value) {
        int i = c.b(this.f521c, this.f523e, key);
        if (i >= 0) {
            this.f522d[i] = value;
            return;
        }
        int i2 = ~i;
        if (i2 < this.f523e) {
            Object[] objArr = this.f522d;
            if (objArr[i2] == f519f) {
                this.f521c[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f520b && this.f523e >= this.f521c.length) {
            e();
            i2 = ~c.b(this.f521c, this.f523e, key);
        }
        int i3 = this.f523e;
        if (i3 >= this.f521c.length) {
            int n = c.f(i3 + 1);
            long[] nkeys = new long[n];
            Object[] nvalues = new Object[n];
            long[] jArr = this.f521c;
            System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
            Object[] objArr2 = this.f522d;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f521c = nkeys;
            this.f522d = nvalues;
        }
        int n2 = this.f523e;
        if (n2 - i2 != 0) {
            long[] jArr2 = this.f521c;
            System.arraycopy(jArr2, i2, jArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f522d;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f523e - i2);
        }
        this.f521c[i2] = key;
        this.f522d[i2] = value;
        this.f523e++;
    }

    public int m() {
        if (this.f520b) {
            e();
        }
        return this.f523e;
    }

    public long i(int index) {
        if (this.f520b) {
            e();
        }
        return this.f521c[index];
    }

    public E n(int index) {
        if (this.f520b) {
            e();
        }
        return (E) this.f522d[index];
    }

    public int h(long key) {
        if (this.f520b) {
            e();
        }
        return c.b(this.f521c, this.f523e, key);
    }

    public boolean d(long key) {
        return h(key) >= 0;
    }

    public void b() {
        int n = this.f523e;
        Object[] values = this.f522d;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f523e = 0;
        this.f520b = false;
    }

    public void a(long key, E value) {
        int i = this.f523e;
        if (i == 0 || key > this.f521c[i - 1]) {
            if (this.f520b && this.f523e >= this.f521c.length) {
                e();
            }
            int pos = this.f523e;
            if (pos >= this.f521c.length) {
                int n = c.f(pos + 1);
                long[] nkeys = new long[n];
                Object[] nvalues = new Object[n];
                long[] jArr = this.f521c;
                System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
                Object[] objArr = this.f522d;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f521c = nkeys;
                this.f522d = nvalues;
            }
            this.f521c[pos] = key;
            this.f522d[pos] = value;
            this.f523e = pos + 1;
            return;
        }
        j(key, value);
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f523e * 28);
        buffer.append('{');
        for (int i = 0; i < this.f523e; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(i(i));
            buffer.append('=');
            Object value = n(i);
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
