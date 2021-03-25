package b.c.a.a.d;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import b.c.a.a.c.e;
import b.c.a.a.c.i;
import b.c.a.a.d.e;
import b.c.a.a.e.c;
import b.c.a.a.g.a.d;
import b.c.a.a.j.f;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T extends e> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f2437a;

    /* renamed from: b  reason: collision with root package name */
    public List<Integer> f2438b;

    /* renamed from: c  reason: collision with root package name */
    public String f2439c;

    /* renamed from: d  reason: collision with root package name */
    public i.a f2440d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2441e;

    /* renamed from: f  reason: collision with root package name */
    public transient c f2442f;

    /* renamed from: g  reason: collision with root package name */
    public e.b f2443g;
    public float h;
    public float i;
    public DashPathEffect j;
    public boolean k;
    public boolean l;
    public b.c.a.a.j.c m;
    public float n;
    public boolean o;

    public a() {
        this.f2437a = null;
        this.f2438b = null;
        this.f2439c = "DataSet";
        this.f2440d = i.a.LEFT;
        this.f2441e = true;
        this.f2443g = e.b.DEFAULT;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = null;
        this.k = true;
        this.l = true;
        this.m = new b.c.a.a.j.c();
        this.n = 17.0f;
        this.o = true;
        this.f2437a = new ArrayList();
        this.f2438b = new ArrayList();
        this.f2437a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.f2438b.add(-16777216);
    }

    public a(String label) {
        this();
        this.f2439c = label;
    }

    @Override // b.c.a.a.g.a.d
    public List<Integer> T() {
        return this.f2437a;
    }

    @Override // b.c.a.a.g.a.d
    public int g0(int index) {
        List<Integer> list = this.f2437a;
        return list.get(index % list.size()).intValue();
    }

    public void h0(int... colors) {
        this.f2437a = b.c.a.a.j.a.b(colors);
    }

    @Override // b.c.a.a.g.a.d
    public String i() {
        return this.f2439c;
    }

    @Override // b.c.a.a.g.a.d
    public boolean K() {
        return this.f2441e;
    }

    @Override // b.c.a.a.g.a.d
    public void I(c f2) {
        if (f2 != null) {
            this.f2442f = f2;
        }
    }

    @Override // b.c.a.a.g.a.d
    public c D() {
        if (h()) {
            return f.j();
        }
        return this.f2442f;
    }

    @Override // b.c.a.a.g.a.d
    public boolean h() {
        return this.f2442f == null;
    }

    public void i0(int color) {
        this.f2438b.clear();
        this.f2438b.add(Integer.valueOf(color));
    }

    public void j0(float size) {
        this.n = f.e(size);
    }

    @Override // b.c.a.a.g.a.d
    public int J(int index) {
        List<Integer> list = this.f2438b;
        return list.get(index % list.size()).intValue();
    }

    @Override // b.c.a.a.g.a.d
    public Typeface g() {
        return null;
    }

    @Override // b.c.a.a.g.a.d
    public float B() {
        return this.n;
    }

    @Override // b.c.a.a.g.a.d
    public e.b c() {
        return this.f2443g;
    }

    @Override // b.c.a.a.g.a.d
    public float a0() {
        return this.h;
    }

    @Override // b.c.a.a.g.a.d
    public float P() {
        return this.i;
    }

    @Override // b.c.a.a.g.a.d
    public DashPathEffect b0() {
        return this.j;
    }

    @Override // b.c.a.a.g.a.d
    public boolean r() {
        return this.k;
    }

    @Override // b.c.a.a.g.a.d
    public boolean f0() {
        return this.l;
    }

    @Override // b.c.a.a.g.a.d
    public b.c.a.a.j.c F() {
        return this.m;
    }

    @Override // b.c.a.a.g.a.d
    public boolean isVisible() {
        return this.o;
    }

    @Override // b.c.a.a.g.a.d
    public i.a A() {
        return this.f2440d;
    }
}
