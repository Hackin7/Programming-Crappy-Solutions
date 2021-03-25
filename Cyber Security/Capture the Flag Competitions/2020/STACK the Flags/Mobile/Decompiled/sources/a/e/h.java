package a.e;

import androidx.collection.SparseArrayCompat;

public class h<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f552f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f553b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f554c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f555d;

    /* renamed from: e  reason: collision with root package name */
    public int f556e;

    public h() {
        this(10);
    }

    public h(int initialCapacity) {
        this.f553b = false;
        if (initialCapacity == 0) {
            this.f554c = c.f516a;
            this.f555d = c.f518c;
            return;
        }
        int initialCapacity2 = c.e(initialCapacity);
        this.f554c = new int[initialCapacity2];
        this.f555d = new Object[initialCapacity2];
    }

    /* renamed from: c */
    public h<E> clone() {
        try {
            SparseArrayCompat<E> clone = (h) super.clone();
            clone.f554c = (int[]) this.f554c.clone();
            clone.f555d = (Object[]) this.f555d.clone();
            return clone;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E e(int key) {
        return f(key, null);
    }

    public E f(int key, E valueIfKeyNotFound) {
        int i = c.a(this.f554c, this.f556e, key);
        if (i >= 0) {
            Object[] objArr = this.f555d;
            if (objArr[i] != f552f) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    public void j(int key) {
        Object[] objArr;
        Object obj;
        int i = c.a(this.f554c, this.f556e, key);
        if (i >= 0 && (objArr = this.f555d)[i] != (obj = f552f)) {
            objArr[i] = obj;
            this.f553b = true;
        }
    }

    public final void d() {
        int n = this.f556e;
        int o = 0;
        int[] keys = this.f554c;
        Object[] values = this.f555d;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f552f) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f553b = false;
        this.f556e = o;
    }

    public void i(int key, E value) {
        int i = c.a(this.f554c, this.f556e, key);
        if (i >= 0) {
            this.f555d[i] = value;
            return;
        }
        int i2 = ~i;
        if (i2 < this.f556e) {
            Object[] objArr = this.f555d;
            if (objArr[i2] == f552f) {
                this.f554c[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f553b && this.f556e >= this.f554c.length) {
            d();
            i2 = ~c.a(this.f554c, this.f556e, key);
        }
        int i3 = this.f556e;
        if (i3 >= this.f554c.length) {
            int n = c.e(i3 + 1);
            int[] nkeys = new int[n];
            Object[] nvalues = new Object[n];
            int[] iArr = this.f554c;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr2 = this.f555d;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f554c = nkeys;
            this.f555d = nvalues;
        }
        int n2 = this.f556e;
        if (n2 - i2 != 0) {
            int[] iArr2 = this.f554c;
            System.arraycopy(iArr2, i2, iArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f555d;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f556e - i2);
        }
        this.f554c[i2] = key;
        this.f555d[i2] = value;
        this.f556e++;
    }

    public int k() {
        if (this.f553b) {
            d();
        }
        return this.f556e;
    }

    public int h(int index) {
        if (this.f553b) {
            d();
        }
        return this.f554c[index];
    }

    public E l(int index) {
        if (this.f553b) {
            d();
        }
        return (E) this.f555d[index];
    }

    public int g(int key) {
        if (this.f553b) {
            d();
        }
        return c.a(this.f554c, this.f556e, key);
    }

    public void b() {
        int n = this.f556e;
        Object[] values = this.f555d;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f556e = 0;
        this.f553b = false;
    }

    public void a(int key, E value) {
        int i = this.f556e;
        if (i == 0 || key > this.f554c[i - 1]) {
            if (this.f553b && this.f556e >= this.f554c.length) {
                d();
            }
            int pos = this.f556e;
            if (pos >= this.f554c.length) {
                int n = c.e(pos + 1);
                int[] nkeys = new int[n];
                Object[] nvalues = new Object[n];
                int[] iArr = this.f554c;
                System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
                Object[] objArr = this.f555d;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f554c = nkeys;
                this.f555d = nvalues;
            }
            this.f554c[pos] = key;
            this.f555d[pos] = value;
            this.f556e = pos + 1;
            return;
        }
        i(key, value);
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f556e * 28);
        buffer.append('{');
        for (int i = 0; i < this.f556e; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(h(i));
            buffer.append('=');
            Object value = l(i);
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
