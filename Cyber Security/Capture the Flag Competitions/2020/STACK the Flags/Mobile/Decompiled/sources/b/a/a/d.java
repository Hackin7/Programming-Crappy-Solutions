package b.a.a;

import android.graphics.Rect;
import b.a.a.u.c;
import b.a.a.u.h;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final n f1872a = new n();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f1873b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<b.a.a.u.l.d>> f1874c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, g> f1875d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, c> f1876e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f1877f;

    /* renamed from: g  reason: collision with root package name */
    public a.e.h<b.a.a.u.d> f1878g;
    public a.e.d<b.a.a.u.l.d> h;
    public List<b.a.a.u.l.d> i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public int o = 0;

    public void r(Rect bounds, float startFrame, float endFrame, float frameRate, List<b.a.a.u.l.d> list, a.e.d<b.a.a.u.l.d> dVar, Map<String, List<b.a.a.u.l.d>> map, Map<String, g> map2, a.e.h<b.a.a.u.d> hVar, Map<String, c> map3, List<h> list2) {
        this.j = bounds;
        this.k = startFrame;
        this.l = endFrame;
        this.m = frameRate;
        this.i = list;
        this.h = dVar;
        this.f1874c = map;
        this.f1875d = map2;
        this.f1878g = hVar;
        this.f1876e = map3;
        this.f1877f = list2;
    }

    public void a(String warning) {
        b.a.a.x.d.c(warning);
        this.f1873b.add(warning);
    }

    public void t(boolean hasDashPattern) {
        this.n = hasDashPattern;
    }

    public void q(int amount) {
        this.o += amount;
    }

    public boolean p() {
        return this.n;
    }

    public int l() {
        return this.o;
    }

    public void u(boolean enabled) {
        this.f1872a.b(enabled);
    }

    public n m() {
        return this.f1872a;
    }

    public b.a.a.u.l.d s(long id) {
        return this.h.f(id);
    }

    public Rect b() {
        return this.j;
    }

    public float d() {
        return (float) ((long) ((e() / this.m) * 1000.0f));
    }

    public float o() {
        return this.k;
    }

    public float f() {
        return this.l;
    }

    public float h() {
        return this.m;
    }

    public List<b.a.a.u.l.d> j() {
        return this.i;
    }

    public List<b.a.a.u.l.d> n(String id) {
        return this.f1874c.get(id);
    }

    public a.e.h<b.a.a.u.d> c() {
        return this.f1878g;
    }

    public Map<String, c> g() {
        return this.f1876e;
    }

    public h k(String markerName) {
        this.f1877f.size();
        for (int i2 = 0; i2 < this.f1877f.size(); i2++) {
            h marker = this.f1877f.get(i2);
            if (marker.a(markerName)) {
                return marker;
            }
        }
        return null;
    }

    public Map<String, g> i() {
        return this.f1875d;
    }

    public float e() {
        return this.l - this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (b.a.a.u.l.d layer : this.i) {
            sb.append(layer.w("\t"));
        }
        return sb.toString();
    }
}
