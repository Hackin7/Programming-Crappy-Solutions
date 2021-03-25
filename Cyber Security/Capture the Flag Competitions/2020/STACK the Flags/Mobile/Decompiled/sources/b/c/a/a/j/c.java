package b.c.a.a.j;

import android.os.Parcel;
import android.os.Parcelable;
import b.c.a.a.j.d;

public class c extends d.a {

    /* renamed from: e  reason: collision with root package name */
    public static d<c> f2510e;

    /* renamed from: c  reason: collision with root package name */
    public float f2511c;

    /* renamed from: d  reason: collision with root package name */
    public float f2512d;

    static {
        d<c> a2 = d.a(32, new c(0.0f, 0.0f));
        f2510e = a2;
        a2.g(0.5f);
        new a();
    }

    public c() {
    }

    public c(float x, float y) {
        this.f2511c = x;
        this.f2512d = y;
    }

    public static c c(float x, float y) {
        c result = f2510e.b();
        result.f2511c = x;
        result.f2512d = y;
        return result;
    }

    public static c b() {
        return f2510e.b();
    }

    public static c d(c copy) {
        c result = f2510e.b();
        result.f2511c = copy.f2511c;
        result.f2512d = copy.f2512d;
        return result;
    }

    public static void f(c instance) {
        f2510e.c(instance);
    }

    public static class a implements Parcelable.Creator<c> {
        /* renamed from: a */
        public c createFromParcel(Parcel in) {
            c r = new c(0.0f, 0.0f);
            r.e(in);
            return r;
        }

        /* renamed from: b */
        public c[] newArray(int size) {
            return new c[size];
        }
    }

    public void e(Parcel in) {
        this.f2511c = in.readFloat();
        this.f2512d = in.readFloat();
    }

    @Override // b.c.a.a.j.d.a
    public d.a a() {
        return new c(0.0f, 0.0f);
    }
}
