package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: df */
public final class C0245df<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f1163c = new int[0];

    /* renamed from: d */
    private static final Object[] f1164d = new Object[0];

    /* renamed from: e */
    private static Object[] f1165e;

    /* renamed from: f */
    private static int f1166f;

    /* renamed from: g */
    private static Object[] f1167g;

    /* renamed from: h */
    private static int f1168h;

    /* renamed from: a */
    public Object[] f1169a;

    /* renamed from: b */
    int f1170b;

    /* renamed from: i */
    private int[] f1171i;

    /* renamed from: j */
    private C0250dj<E, E> f1172j;

    public C0245df() {
        this(0);
    }

    private C0245df(byte b) {
        this.f1171i = f1163c;
        this.f1169a = f1164d;
        this.f1170b = 0;
    }

    /* renamed from: a */
    private int m783a() {
        int i = this.f1170b;
        if (i == 0) {
            return -1;
        }
        int a = C0247dg.m799a(this.f1171i, i, 0);
        if (a < 0 || this.f1169a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1171i[i2] == 0) {
            if (this.f1169a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1171i[i3] == 0) {
            if (this.f1169a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: a */
    private int m784a(Object obj, int i) {
        int i2 = this.f1170b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0247dg.m799a(this.f1171i, i2, i);
        if (a < 0 || obj.equals(this.f1169a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1171i[i3] == i) {
            if (obj.equals(this.f1169a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1171i[i4] == i) {
            if (obj.equals(this.f1169a[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private static void m785a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0245df.class) {
                if (f1168h < 10) {
                    objArr[0] = f1167g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1167g = objArr;
                    f1168h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0245df.class) {
                if (f1166f < 10) {
                    objArr[0] = f1165e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1165e = objArr;
                    f1166f++;
                }
            }
        }
    }

    /* renamed from: b */
    private void m786b(int i) {
        if (i == 8) {
            synchronized (C0245df.class) {
                if (f1167g != null) {
                    Object[] objArr = f1167g;
                    this.f1169a = objArr;
                    f1167g = (Object[]) objArr[0];
                    this.f1171i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1168h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0245df.class) {
                if (f1165e != null) {
                    Object[] objArr2 = f1165e;
                    this.f1169a = objArr2;
                    f1165e = (Object[]) objArr2[0];
                    this.f1171i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1166f--;
                    return;
                }
            }
        }
        this.f1171i = new int[i];
        this.f1169a = new Object[i];
    }

    /* renamed from: a */
    public final int mo1386a(Object obj) {
        return obj == null ? m783a() : m784a(obj, obj.hashCode());
    }

    /* renamed from: a */
    public final E mo1387a(int i) {
        E e = this.f1169a[i];
        if (this.f1170b <= 1) {
            m785a(this.f1171i, this.f1169a, this.f1170b);
            this.f1171i = f1163c;
            this.f1169a = f1164d;
            this.f1170b = 0;
            return e;
        }
        int i2 = 8;
        if (this.f1171i.length <= 8 || this.f1170b >= this.f1171i.length / 3) {
            this.f1170b--;
            if (i < this.f1170b) {
                int i3 = i + 1;
                System.arraycopy(this.f1171i, i3, this.f1171i, i, this.f1170b - i);
                System.arraycopy(this.f1169a, i3, this.f1169a, i, this.f1170b - i);
            }
            this.f1169a[this.f1170b] = null;
        } else {
            if (this.f1170b > 8) {
                i2 = (this.f1170b >> 1) + this.f1170b;
            }
            int[] iArr = this.f1171i;
            Object[] objArr = this.f1169a;
            m786b(i2);
            this.f1170b--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f1171i, 0, i);
                System.arraycopy(objArr, 0, this.f1169a, 0, i);
            }
            if (i < this.f1170b) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, this.f1171i, i, this.f1170b - i);
                System.arraycopy(objArr, i4, this.f1169a, i, this.f1170b - i);
                return e;
            }
        }
        return e;
    }

    public final boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m783a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m784a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        if (this.f1170b >= this.f1171i.length) {
            int i4 = 4;
            if (this.f1170b >= 8) {
                i4 = (this.f1170b >> 1) + this.f1170b;
            } else if (this.f1170b >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f1171i;
            Object[] objArr = this.f1169a;
            m786b(i4);
            if (this.f1171i.length > 0) {
                System.arraycopy(iArr, 0, this.f1171i, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1169a, 0, objArr.length);
            }
            m785a(iArr, objArr, this.f1170b);
        }
        if (i3 < this.f1170b) {
            int i5 = i3 + 1;
            System.arraycopy(this.f1171i, i3, this.f1171i, i5, this.f1170b - i3);
            System.arraycopy(this.f1169a, i3, this.f1169a, i5, this.f1170b - i3);
        }
        this.f1171i[i3] = i;
        this.f1169a[i3] = e;
        this.f1170b++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f1170b + collection.size();
        boolean z = false;
        if (this.f1171i.length < size) {
            int[] iArr = this.f1171i;
            Object[] objArr = this.f1169a;
            m786b(size);
            if (this.f1170b > 0) {
                System.arraycopy(iArr, 0, this.f1171i, 0, this.f1170b);
                System.arraycopy(objArr, 0, this.f1169a, 0, this.f1170b);
            }
            m785a(iArr, objArr, this.f1170b);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void clear() {
        if (this.f1170b != 0) {
            m785a(this.f1171i, this.f1169a, this.f1170b);
            this.f1171i = f1163c;
            this.f1169a = f1164d;
            this.f1170b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return mo1386a(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1170b) {
                try {
                    if (!set.contains(this.f1169a[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f1171i;
        int i = 0;
        for (int i2 = 0; i2 < this.f1170b; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f1170b <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f1172j == null) {
            this.f1172j = new C0250dj<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo1377a() {
                    return C0245df.this.f1170b;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo1378a(Object obj) {
                    return C0245df.this.mo1386a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo1379a(int i, int i2) {
                    return C0245df.this.f1169a[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final E mo1380a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo1381a(int i) {
                    C0245df.this.mo1387a(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo1382a(E e, E e2) {
                    C0245df.this.add(e);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final int mo1383b(Object obj) {
                    return C0245df.this.mo1386a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Map<E, E> mo1384b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final void mo1385c() {
                    C0245df.this.clear();
                }
            };
        }
        return this.f1172j.mo1415d().iterator();
    }

    public final boolean remove(Object obj) {
        int a = mo1386a(obj);
        if (a < 0) {
            return false;
        }
        mo1387a(a);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1170b - 1; i >= 0; i--) {
            if (!collection.contains(this.f1169a[i])) {
                mo1387a(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f1170b;
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[this.f1170b];
        System.arraycopy(this.f1169a, 0, objArr, 0, this.f1170b);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1170b) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1170b);
        }
        System.arraycopy(this.f1169a, 0, tArr, 0, this.f1170b);
        if (tArr.length > this.f1170b) {
            tArr[this.f1170b] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1170b * 14);
        sb.append('{');
        for (int i = 0; i < this.f1170b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1169a[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
