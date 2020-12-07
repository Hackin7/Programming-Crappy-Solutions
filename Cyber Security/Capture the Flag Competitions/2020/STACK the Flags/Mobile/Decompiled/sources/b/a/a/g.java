package b.a.a;

import android.graphics.Bitmap;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f1928a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1929b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1930c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1931d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f1932e;

    public g(int width, int height, String id, String fileName, String dirName) {
        this.f1928a = width;
        this.f1929b = height;
        this.f1930c = id;
        this.f1931d = fileName;
    }

    public int e() {
        return this.f1928a;
    }

    public int c() {
        return this.f1929b;
    }

    public String d() {
        return this.f1930c;
    }

    public String b() {
        return this.f1931d;
    }

    public Bitmap a() {
        return this.f1932e;
    }

    public void f(Bitmap bitmap) {
        this.f1932e = bitmap;
    }
}
