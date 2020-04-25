package p000;

/* renamed from: dl */
public final class C0257dl<E> implements Cloneable {

    /* renamed from: d */
    private static final Object f1211d = new Object();

    /* renamed from: a */
    public boolean f1212a;

    /* renamed from: b */
    public Object[] f1213b;

    /* renamed from: c */
    public int f1214c;

    /* renamed from: e */
    private int[] f1215e;

    public C0257dl() {
        this(10);
    }

    public C0257dl(int i) {
        Object[] objArr;
        this.f1212a = false;
        if (i == 0) {
            this.f1215e = C0247dg.f1174a;
            objArr = C0247dg.f1176c;
        } else {
            int a = C0247dg.m798a(i);
            this.f1215e = new int[a];
            objArr = new Object[a];
        }
        this.f1213b = objArr;
        this.f1214c = 0;
    }

    /* renamed from: c */
    private void m838c() {
        int i = this.f1214c;
        int[] iArr = this.f1215e;
        Object[] objArr = this.f1213b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1211d) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1212a = false;
        this.f1214c = i2;
    }

    /* renamed from: a */
    public final C0257dl<E> clone() {
        try {
            C0257dl<E> dlVar = (C0257dl) super.clone();
            dlVar.f1215e = (int[]) this.f1215e.clone();
            dlVar.f1213b = (Object[]) this.f1213b.clone();
            return dlVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final E mo1489a(int i, E e) {
        int a = C0247dg.m799a(this.f1215e, this.f1214c, i);
        return (a < 0 || this.f1213b[a] == f1211d) ? e : this.f1213b[a];
    }

    /* renamed from: a */
    public final void mo1490a(int i) {
        int a = C0247dg.m799a(this.f1215e, this.f1214c, i);
        if (a >= 0 && this.f1213b[a] != f1211d) {
            this.f1213b[a] = f1211d;
            this.f1212a = true;
        }
    }

    /* renamed from: b */
    public final int mo1491b() {
        if (this.f1212a) {
            m838c();
        }
        return this.f1214c;
    }

    /* renamed from: b */
    public final int mo1492b(int i) {
        if (this.f1212a) {
            m838c();
        }
        return this.f1215e[i];
    }

    /* renamed from: b */
    public final void mo1493b(int i, E e) {
        int a = C0247dg.m799a(this.f1215e, this.f1214c, i);
        if (a >= 0) {
            this.f1213b[a] = e;
            return;
        }
        int i2 = ~a;
        if (i2 >= this.f1214c || this.f1213b[i2] != f1211d) {
            if (this.f1212a && this.f1214c >= this.f1215e.length) {
                m838c();
                i2 = ~C0247dg.m799a(this.f1215e, this.f1214c, i);
            }
            if (this.f1214c >= this.f1215e.length) {
                int a2 = C0247dg.m798a(this.f1214c + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                System.arraycopy(this.f1215e, 0, iArr, 0, this.f1215e.length);
                System.arraycopy(this.f1213b, 0, objArr, 0, this.f1213b.length);
                this.f1215e = iArr;
                this.f1213b = objArr;
            }
            if (this.f1214c - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.f1215e, i2, this.f1215e, i3, this.f1214c - i2);
                System.arraycopy(this.f1213b, i2, this.f1213b, i3, this.f1214c - i2);
            }
            this.f1215e[i2] = i;
            this.f1213b[i2] = e;
            this.f1214c++;
            return;
        }
        this.f1215e[i2] = i;
        this.f1213b[i2] = e;
    }

    /* renamed from: c */
    public final E mo1494c(int i) {
        if (this.f1212a) {
            m838c();
        }
        return this.f1213b[i];
    }

    /* renamed from: c */
    public final void mo1495c(int i, E e) {
        if (this.f1214c == 0 || i > this.f1215e[this.f1214c - 1]) {
            if (this.f1212a && this.f1214c >= this.f1215e.length) {
                m838c();
            }
            int i2 = this.f1214c;
            if (i2 >= this.f1215e.length) {
                int a = C0247dg.m798a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                System.arraycopy(this.f1215e, 0, iArr, 0, this.f1215e.length);
                System.arraycopy(this.f1213b, 0, objArr, 0, this.f1213b.length);
                this.f1215e = iArr;
                this.f1213b = objArr;
            }
            this.f1215e[i2] = i;
            this.f1213b[i2] = e;
            this.f1214c = i2 + 1;
            return;
        }
        mo1493b(i, e);
    }

    public final String toString() {
        if (mo1491b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1214c * 28);
        sb.append('{');
        for (int i = 0; i < this.f1214c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1492b(i));
            sb.append('=');
            Object c = mo1494c(i);
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
