package p000;

/* renamed from: ds */
final class C0265ds {

    /* renamed from: ds$a */
    interface C0266a<T> {
        /* renamed from: a */
        T mo1535a();

        /* renamed from: a */
        void mo1536a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo1537a(T t);
    }

    /* renamed from: ds$b */
    static class C0267b<T> implements C0266a<T> {

        /* renamed from: a */
        private final Object[] f1283a = new Object[256];

        /* renamed from: b */
        private int f1284b;

        C0267b() {
        }

        /* renamed from: a */
        public final T mo1535a() {
            if (this.f1284b <= 0) {
                return null;
            }
            int i = this.f1284b - 1;
            T t = this.f1283a[i];
            this.f1283a[i] = null;
            this.f1284b--;
            return t;
        }

        /* renamed from: a */
        public final void mo1536a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f1284b < this.f1283a.length) {
                    this.f1283a[this.f1284b] = t;
                    this.f1284b++;
                }
            }
        }

        /* renamed from: a */
        public final boolean mo1537a(T t) {
            if (this.f1284b >= this.f1283a.length) {
                return false;
            }
            this.f1283a[this.f1284b] = t;
            this.f1284b++;
            return true;
        }
    }
}
