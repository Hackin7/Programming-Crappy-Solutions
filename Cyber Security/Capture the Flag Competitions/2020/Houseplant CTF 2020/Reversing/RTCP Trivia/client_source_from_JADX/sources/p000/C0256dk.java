package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: dk */
public class C0256dk<K, V> {

    /* renamed from: b */
    static Object[] f1204b;

    /* renamed from: c */
    static int f1205c;

    /* renamed from: d */
    static Object[] f1206d;

    /* renamed from: e */
    static int f1207e;

    /* renamed from: f */
    int[] f1208f = C0247dg.f1174a;

    /* renamed from: g */
    Object[] f1209g = C0247dg.f1176c;

    /* renamed from: h */
    int f1210h = 0;

    /* renamed from: a */
    private int m828a() {
        int i = this.f1210h;
        if (i == 0) {
            return -1;
        }
        int a = m830a(this.f1208f, i, 0);
        if (a < 0 || this.f1209g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1208f[i2] == 0) {
            if (this.f1209g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f1208f[i3] == 0) {
            if (this.f1209g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: a */
    private int m829a(Object obj, int i) {
        int i2 = this.f1210h;
        if (i2 == 0) {
            return -1;
        }
        int a = m830a(this.f1208f, i2, i);
        if (a < 0 || obj.equals(this.f1209g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1208f[i3] == i) {
            if (obj.equals(this.f1209g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f1208f[i4] == i) {
            if (obj.equals(this.f1209g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private static int m830a(int[] iArr, int i, int i2) {
        try {
            return C0247dg.m799a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    static void m831a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0243de.class) {
                if (f1207e < 10) {
                    objArr[0] = f1206d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1206d = objArr;
                    f1207e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0243de.class) {
                if (f1205c < 10) {
                    objArr[0] = f1204b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1204b = objArr;
                    f1205c++;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo1471a(Object obj) {
        return obj == null ? m828a() : m829a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1472a(int i) {
        if (i == 8) {
            synchronized (C0243de.class) {
                if (f1206d != null) {
                    Object[] objArr = f1206d;
                    this.f1209g = objArr;
                    f1206d = (Object[]) objArr[0];
                    this.f1208f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1207e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0243de.class) {
                if (f1204b != null) {
                    Object[] objArr2 = f1204b;
                    this.f1209g = objArr2;
                    f1204b = (Object[]) objArr2[0];
                    this.f1208f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1205c--;
                    return;
                }
            }
        }
        this.f1208f = new int[i];
        this.f1209g = new Object[(i << 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo1473b(Object obj) {
        int i = this.f1210h * 2;
        Object[] objArr = this.f1209g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final K mo1474b(int i) {
        return this.f1209g[i << 1];
    }

    /* renamed from: c */
    public final V mo1475c(int i) {
        return this.f1209g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f1210h > 0) {
            int[] iArr = this.f1208f;
            Object[] objArr = this.f1209g;
            int i = this.f1210h;
            this.f1208f = C0247dg.f1174a;
            this.f1209g = C0247dg.f1176c;
            this.f1210h = 0;
            m831a(iArr, objArr, i);
        }
        if (this.f1210h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo1471a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo1473b(obj) >= 0;
    }

    /* renamed from: d */
    public final V mo1479d(int i) {
        int i2 = i << 1;
        V v = this.f1209g[i2 + 1];
        int i3 = this.f1210h;
        int i4 = 0;
        if (i3 <= 1) {
            m831a(this.f1208f, this.f1209g, i3);
            this.f1208f = C0247dg.f1174a;
            this.f1209g = C0247dg.f1176c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f1208f.length <= 8 || this.f1210h >= this.f1208f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f1208f, i7, this.f1208f, i, i8);
                    System.arraycopy(this.f1209g, i7 << 1, this.f1209g, i2, i8 << 1);
                }
                int i9 = i5 << 1;
                this.f1209g[i9] = null;
                this.f1209g[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr = this.f1208f;
                Object[] objArr = this.f1209g;
                mo1472a(i6);
                if (i3 != this.f1210h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1208f, 0, i);
                    System.arraycopy(objArr, 0, this.f1209g, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr, i10, this.f1208f, i, i11);
                    System.arraycopy(objArr, i10 << 1, this.f1209g, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f1210h) {
            throw new ConcurrentModificationException();
        }
        this.f1210h = i4;
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0256dk) {
            C0256dk dkVar = (C0256dk) obj;
            if (size() != dkVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1210h) {
                try {
                    Object b = mo1474b(i);
                    Object c = mo1475c(i);
                    Object obj2 = dkVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !dkVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1210h) {
                try {
                    Object b2 = mo1474b(i2);
                    Object c2 = mo1475c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = mo1471a(obj);
        if (a >= 0) {
            return this.f1209g[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f1208f;
        Object[] objArr = this.f1209g;
        int i = this.f1210h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f1210h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f1210h;
        if (k == null) {
            i2 = m828a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = m829a(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V v2 = this.f1209g[i4];
            this.f1209g[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f1208f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f1208f;
            Object[] objArr = this.f1209g;
            mo1472a(i6);
            if (i3 != this.f1210h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1208f.length > 0) {
                System.arraycopy(iArr, 0, this.f1208f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1209g, 0, objArr.length);
            }
            m831a(iArr, objArr, i3);
        }
        if (i5 < i3) {
            int i7 = i5 + 1;
            System.arraycopy(this.f1208f, i5, this.f1208f, i7, i3 - i5);
            System.arraycopy(this.f1209g, i5 << 1, this.f1209g, i7 << 1, (this.f1210h - i5) << 1);
        }
        if (i3 != this.f1210h || i5 >= this.f1208f.length) {
            throw new ConcurrentModificationException();
        }
        this.f1208f[i5] = i;
        int i8 = i5 << 1;
        this.f1209g[i8] = k;
        this.f1209g[i8 + 1] = v;
        this.f1210h++;
        return null;
    }

    public V remove(Object obj) {
        int a = mo1471a(obj);
        if (a >= 0) {
            return mo1479d(a);
        }
        return null;
    }

    public int size() {
        return this.f1210h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1210h * 28);
        sb.append('{');
        for (int i = 0; i < this.f1210h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1474b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo1475c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
