package b.c.a.a.c;

import b.c.a.a.e.c;
import b.c.a.a.j.f;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

public abstract class a extends b {

    /* renamed from: g  reason: collision with root package name */
    public c f2390g;
    public float[] h = new float[0];
    public float[] i = new float[0];
    public int j;
    public int k;
    public int l = 6;
    public float m = 1.0f;
    public boolean n = false;
    public boolean o = false;
    public boolean p = true;
    public boolean q = false;
    public List<g> r;
    public boolean s = false;
    public float t = 0.0f;
    public float u = 0.0f;
    public boolean v = false;
    public boolean w = false;
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;

    public a() {
        this.f2395e = f.e(10.0f);
        this.f2392b = f.e(5.0f);
        this.f2393c = f.e(5.0f);
        this.r = new ArrayList();
    }

    public boolean o() {
        return this.q && this.j > 0;
    }

    public boolean p() {
        return this.p;
    }

    public boolean r() {
        return this.o;
    }

    public int k() {
        return this.l;
    }

    public boolean s() {
        return this.n;
    }

    public float j() {
        return this.m;
    }

    public List<g> l() {
        return this.r;
    }

    public boolean q() {
        return this.s;
    }

    public String m() {
        String longest = BuildConfig.FLAVOR;
        for (int i2 = 0; i2 < this.h.length; i2++) {
            String text = i(i2);
            if (text != null && longest.length() < text.length()) {
                longest = text;
            }
        }
        return longest;
    }

    public String i(int index) {
        if (index < 0 || index >= this.h.length) {
            return BuildConfig.FLAVOR;
        }
        return n().a(this.h[index]);
    }

    public c n() {
        c cVar = this.f2390g;
        if (cVar == null || ((cVar instanceof b.c.a.a.e.a) && ((b.c.a.a.e.a) cVar).e() != this.k)) {
            this.f2390g = new b.c.a.a.e.a(this.k);
        }
        return this.f2390g;
    }

    public void h(float dataMin, float dataMax) {
        float min = this.v ? this.y : dataMin - this.t;
        float max = this.w ? this.x : this.u + dataMax;
        if (Math.abs(max - min) == 0.0f) {
            max += 1.0f;
            min -= 1.0f;
        }
        this.y = min;
        this.x = max;
        this.z = Math.abs(max - min);
    }
}
