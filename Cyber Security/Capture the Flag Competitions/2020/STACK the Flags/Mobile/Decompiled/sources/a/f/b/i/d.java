package a.f.b.i;

import a.f.b.h;
import a.f.b.i.m.i;
import a.f.b.i.m.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f608a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f609b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f610c;

    /* renamed from: d  reason: collision with root package name */
    public final e f611d;

    /* renamed from: e  reason: collision with root package name */
    public final a f612e;

    /* renamed from: f  reason: collision with root package name */
    public d f613f;

    /* renamed from: g  reason: collision with root package name */
    public int f614g = 0;
    public int h = -1;
    public h i;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public void b(int orientation, ArrayList<o> arrayList, o group) {
        HashSet<d> hashSet = this.f608a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f611d, orientation, arrayList, group);
            }
        }
    }

    public HashSet<d> c() {
        return this.f608a;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f608a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f608a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public void s(int finalValue) {
        this.f609b = finalValue;
        this.f610c = true;
    }

    public int d() {
        if (!this.f610c) {
            return 0;
        }
        return this.f609b;
    }

    public void q() {
        this.f610c = false;
        this.f609b = 0;
    }

    public boolean m() {
        return this.f610c;
    }

    public d(e owner, a type) {
        this.f611d = owner;
        this.f612e = type;
    }

    public h h() {
        return this.i;
    }

    public void r() {
        h hVar = this.i;
        if (hVar == null) {
            this.i = new h(h.a.UNRESTRICTED);
        } else {
            hVar.d();
        }
    }

    public e g() {
        return this.f611d;
    }

    public a j() {
        return this.f612e;
    }

    public int e() {
        d dVar;
        if (this.f611d.O() == 8) {
            return 0;
        }
        if (this.h <= -1 || (dVar = this.f613f) == null || dVar.f611d.O() != 8) {
            return this.f614g;
        }
        return this.h;
    }

    public d i() {
        return this.f613f;
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f613f;
        if (!(dVar == null || (hashSet = dVar.f608a) == null)) {
            hashSet.remove(this);
            if (this.f613f.f608a.size() == 0) {
                this.f613f.f608a = null;
            }
        }
        this.f608a = null;
        this.f613f = null;
        this.f614g = 0;
        this.h = -1;
        this.f610c = false;
        this.f609b = 0;
    }

    public boolean a(d toAnchor, int margin, int goneMargin, boolean forceConnection) {
        if (toAnchor == null) {
            p();
            return true;
        } else if (!forceConnection && !o(toAnchor)) {
            return false;
        } else {
            this.f613f = toAnchor;
            if (toAnchor.f608a == null) {
                toAnchor.f608a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f613f.f608a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (margin > 0) {
                this.f614g = margin;
            } else {
                this.f614g = 0;
            }
            this.h = goneMargin;
            return true;
        }
    }

    public boolean n() {
        return this.f613f != null;
    }

    public boolean o(d anchor) {
        boolean isCompatible = false;
        if (anchor == null) {
            return false;
        }
        a target = anchor.j();
        a aVar = this.f612e;
        if (target != aVar) {
            switch (aVar.ordinal()) {
                case 0:
                case 5:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    boolean isCompatible2 = target == a.LEFT || target == a.RIGHT;
                    if (!(anchor.g() instanceof g)) {
                        return isCompatible2;
                    }
                    if (isCompatible2 || target == a.CENTER_X) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 2:
                case 4:
                    boolean isCompatible3 = target == a.TOP || target == a.BOTTOM;
                    if (!(anchor.g() instanceof g)) {
                        return isCompatible3;
                    }
                    if (isCompatible3 || target == a.CENTER_Y) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 6:
                    if (target == a.BASELINE || target == a.CENTER_X || target == a.CENTER_Y) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.f612e.name());
            }
        } else if (aVar != a.BASELINE || (anchor.g().S() && g().S())) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.f611d.p() + ":" + this.f612e.toString();
    }

    public final d f() {
        switch (this.f612e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f611d.I;
            case 2:
                return this.f611d.J;
            case 3:
                return this.f611d.G;
            case 4:
                return this.f611d.H;
            default:
                throw new AssertionError(this.f612e.name());
        }
    }
}
