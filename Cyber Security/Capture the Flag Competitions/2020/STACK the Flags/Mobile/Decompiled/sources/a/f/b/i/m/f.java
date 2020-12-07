package a.f.b.i.m;

import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f651a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f652b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f653c = false;

    /* renamed from: d  reason: collision with root package name */
    public p f654d;

    /* renamed from: e  reason: collision with root package name */
    public a f655e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f656f;

    /* renamed from: g  reason: collision with root package name */
    public int f657g;
    public int h = 1;
    public g i = null;
    public boolean j = false;
    public List<d> k = new ArrayList();
    public List<f> l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p run) {
        this.f654d = run;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f654d.f675b.p());
        sb.append(":");
        sb.append(this.f655e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.f657g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }

    public void d(int value) {
        if (!this.j) {
            this.j = true;
            this.f657g = value;
            for (d node : this.k) {
                node.a(node);
            }
        }
    }

    @Override // a.f.b.i.m.d
    public void a(d node) {
        for (f target : this.l) {
            if (!target.j) {
                return;
            }
        }
        this.f653c = true;
        d dVar = this.f651a;
        if (dVar != null) {
            dVar.a(this);
        }
        if (this.f652b) {
            this.f654d.a(this);
            return;
        }
        f target2 = null;
        int numTargets = 0;
        for (f t : this.l) {
            if (!(t instanceof g)) {
                target2 = t;
                numTargets++;
            }
        }
        if (target2 != null && numTargets == 1 && target2.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (gVar.j) {
                    this.f656f = this.h * gVar.f657g;
                } else {
                    return;
                }
            }
            d(target2.f657g + this.f656f);
        }
        d dVar2 = this.f651a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
    }

    public void b(d dependency) {
        this.k.add(dependency);
        if (this.j) {
            dependency.a(dependency);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.f657g = 0;
        this.f653c = false;
        this.f652b = false;
    }
}
