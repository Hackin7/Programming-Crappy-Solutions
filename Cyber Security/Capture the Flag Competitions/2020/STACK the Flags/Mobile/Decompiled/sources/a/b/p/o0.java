package a.b.p;

public class o0 {

    /* renamed from: a  reason: collision with root package name */
    public int f381a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f382b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f383c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f384d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f385e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f386f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f387g = false;
    public boolean h = false;

    public int b() {
        return this.f381a;
    }

    public int c() {
        return this.f382b;
    }

    public int d() {
        return this.f387g ? this.f382b : this.f381a;
    }

    public int a() {
        return this.f387g ? this.f381a : this.f382b;
    }

    public void g(int start, int end) {
        this.f383c = start;
        this.f384d = end;
        this.h = true;
        if (this.f387g) {
            if (end != Integer.MIN_VALUE) {
                this.f381a = end;
            }
            if (start != Integer.MIN_VALUE) {
                this.f382b = start;
                return;
            }
            return;
        }
        if (start != Integer.MIN_VALUE) {
            this.f381a = start;
        }
        if (end != Integer.MIN_VALUE) {
            this.f382b = end;
        }
    }

    public void e(int left, int right) {
        this.h = false;
        if (left != Integer.MIN_VALUE) {
            this.f385e = left;
            this.f381a = left;
        }
        if (right != Integer.MIN_VALUE) {
            this.f386f = right;
            this.f382b = right;
        }
    }

    public void f(boolean isRtl) {
        if (isRtl != this.f387g) {
            this.f387g = isRtl;
            if (!this.h) {
                this.f381a = this.f385e;
                this.f382b = this.f386f;
            } else if (isRtl) {
                int i = this.f384d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f385e;
                }
                this.f381a = i;
                int i2 = this.f383c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f386f;
                }
                this.f382b = i2;
            } else {
                int i3 = this.f383c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f385e;
                }
                this.f381a = i3;
                int i4 = this.f384d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f386f;
                }
                this.f382b = i4;
            }
        }
    }
}
