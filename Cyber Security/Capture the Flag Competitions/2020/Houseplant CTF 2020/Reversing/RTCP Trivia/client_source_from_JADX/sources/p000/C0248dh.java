package p000;

/* renamed from: dh */
public final class C0248dh<E> implements Cloneable {

    /* renamed from: a */
    public static final Object f1177a = new Object();

    /* renamed from: b */
    public boolean f1178b;

    /* renamed from: c */
    public long[] f1179c;

    /* renamed from: d */
    public Object[] f1180d;

    /* renamed from: e */
    public int f1181e;

    public C0248dh() {
        this(0);
    }

    private C0248dh(byte b) {
        this.f1178b = false;
        int b2 = C0247dg.m802b(10);
        this.f1179c = new long[b2];
        this.f1180d = new Object[b2];
        this.f1181e = 0;
    }

    /* renamed from: a */
    private long m804a(int i) {
        if (this.f1178b) {
            m806b();
        }
        return this.f1179c[i];
    }

    /* renamed from: b */
    private E m805b(int i) {
        if (this.f1178b) {
            m806b();
        }
        return this.f1180d[i];
    }

    /* renamed from: b */
    private void m806b() {
        int i = this.f1181e;
        long[] jArr = this.f1179c;
        Object[] objArr = this.f1180d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1177a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1178b = false;
        this.f1181e = i2;
    }

    /* renamed from: a */
    public final C0248dh<E> clone() {
        try {
            C0248dh<E> dhVar = (C0248dh) super.clone();
            dhVar.f1179c = (long[]) this.f1179c.clone();
            dhVar.f1180d = (Object[]) this.f1180d.clone();
            return dhVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final E mo1405a(long j, E e) {
        int a = C0247dg.m800a(this.f1179c, this.f1181e, j);
        return (a < 0 || this.f1180d[a] == f1177a) ? e : this.f1180d[a];
    }

    /* renamed from: b */
    public final void mo1406b(long j, E e) {
        int a = C0247dg.m800a(this.f1179c, this.f1181e, j);
        if (a >= 0) {
            this.f1180d[a] = e;
            return;
        }
        int i = ~a;
        if (i >= this.f1181e || this.f1180d[i] != f1177a) {
            if (this.f1178b && this.f1181e >= this.f1179c.length) {
                m806b();
                i = ~C0247dg.m800a(this.f1179c, this.f1181e, j);
            }
            if (this.f1181e >= this.f1179c.length) {
                int b = C0247dg.m802b(this.f1181e + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f1179c, 0, jArr, 0, this.f1179c.length);
                System.arraycopy(this.f1180d, 0, objArr, 0, this.f1180d.length);
                this.f1179c = jArr;
                this.f1180d = objArr;
            }
            if (this.f1181e - i != 0) {
                int i2 = i + 1;
                System.arraycopy(this.f1179c, i, this.f1179c, i2, this.f1181e - i);
                System.arraycopy(this.f1180d, i, this.f1180d, i2, this.f1181e - i);
            }
            this.f1179c[i] = j;
            this.f1180d[i] = e;
            this.f1181e++;
            return;
        }
        this.f1179c[i] = j;
        this.f1180d[i] = e;
    }

    /* renamed from: c */
    public final void mo1407c(long j, E e) {
        if (this.f1181e == 0 || j > this.f1179c[this.f1181e - 1]) {
            if (this.f1178b && this.f1181e >= this.f1179c.length) {
                m806b();
            }
            int i = this.f1181e;
            if (i >= this.f1179c.length) {
                int b = C0247dg.m802b(i + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f1179c, 0, jArr, 0, this.f1179c.length);
                System.arraycopy(this.f1180d, 0, objArr, 0, this.f1180d.length);
                this.f1179c = jArr;
                this.f1180d = objArr;
            }
            this.f1179c[i] = j;
            this.f1180d[i] = e;
            this.f1181e = i + 1;
            return;
        }
        mo1406b(j, e);
    }

    public final String toString() {
        if (this.f1178b) {
            m806b();
        }
        if (this.f1181e <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1181e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1181e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m804a(i));
            sb.append('=');
            Object b = m805b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
