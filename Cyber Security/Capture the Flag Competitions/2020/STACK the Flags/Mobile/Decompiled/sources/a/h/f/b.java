package a.h.f;

import android.graphics.Insets;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f811e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f812a;

    /* renamed from: b  reason: collision with root package name */
    public final int f813b;

    /* renamed from: c  reason: collision with root package name */
    public final int f814c;

    /* renamed from: d  reason: collision with root package name */
    public final int f815d;

    public b(int left, int top, int right, int bottom) {
        this.f812a = left;
        this.f813b = top;
        this.f814c = right;
        this.f815d = bottom;
    }

    public static b a(int left, int top, int right, int bottom) {
        if (left == 0 && top == 0 && right == 0 && bottom == 0) {
            return f811e;
        }
        return new b(left, top, right, bottom);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        b insets = (b) o;
        if (this.f815d == insets.f815d && this.f812a == insets.f812a && this.f814c == insets.f814c && this.f813b == insets.f813b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f812a * 31) + this.f813b) * 31) + this.f814c) * 31) + this.f815d;
    }

    public String toString() {
        return "Insets{left=" + this.f812a + ", top=" + this.f813b + ", right=" + this.f814c + ", bottom=" + this.f815d + '}';
    }

    public Insets b() {
        return Insets.of(this.f812a, this.f813b, this.f814c, this.f815d);
    }
}
