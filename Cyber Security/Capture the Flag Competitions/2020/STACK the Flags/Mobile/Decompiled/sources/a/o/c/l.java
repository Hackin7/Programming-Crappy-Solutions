package a.o.c;

import android.view.View;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final b f1302a;

    /* renamed from: b  reason: collision with root package name */
    public a f1303b = new a();

    public interface b {
        View a(int i);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    public l(b callback) {
        this.f1302a = callback;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1304a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1305b;

        /* renamed from: c  reason: collision with root package name */
        public int f1306c;

        /* renamed from: d  reason: collision with root package name */
        public int f1307d;

        /* renamed from: e  reason: collision with root package name */
        public int f1308e;

        public void e(int rvStart, int rvEnd, int childStart, int childEnd) {
            this.f1305b = rvStart;
            this.f1306c = rvEnd;
            this.f1307d = childStart;
            this.f1308e = childEnd;
        }

        public void a(int flags) {
            this.f1304a |= flags;
        }

        public void d() {
            this.f1304a = 0;
        }

        public int c(int x, int y) {
            if (x > y) {
                return 1;
            }
            if (x == y) {
                return 2;
            }
            return 4;
        }

        public boolean b() {
            int i = this.f1304a;
            if ((i & 7) != 0 && (i & (c(this.f1307d, this.f1305b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f1304a;
            if ((i2 & 112) != 0 && (i2 & (c(this.f1307d, this.f1306c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f1304a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.f1308e, this.f1305b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f1304a;
            if ((i4 & 28672) == 0 || (i4 & (c(this.f1308e, this.f1306c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    public View a(int fromIndex, int toIndex, int preferredBoundFlags, int acceptableBoundFlags) {
        int start = this.f1302a.c();
        int end = this.f1302a.b();
        int next = toIndex > fromIndex ? 1 : -1;
        View acceptableMatch = null;
        for (int i = fromIndex; i != toIndex; i += next) {
            View child = this.f1302a.a(i);
            this.f1303b.e(start, end, this.f1302a.e(child), this.f1302a.d(child));
            if (preferredBoundFlags != 0) {
                this.f1303b.d();
                this.f1303b.a(preferredBoundFlags);
                if (this.f1303b.b()) {
                    return child;
                }
            }
            if (acceptableBoundFlags != 0) {
                this.f1303b.d();
                this.f1303b.a(acceptableBoundFlags);
                if (this.f1303b.b()) {
                    acceptableMatch = child;
                }
            }
        }
        return acceptableMatch;
    }

    public boolean b(View child, int boundsFlags) {
        this.f1303b.e(this.f1302a.c(), this.f1302a.b(), this.f1302a.e(child), this.f1302a.d(child));
        if (boundsFlags == 0) {
            return false;
        }
        this.f1303b.d();
        this.f1303b.a(boundsFlags);
        return this.f1303b.b();
    }
}
