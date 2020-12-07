package a.f.b.i;

import a.f.b.i.e;
import java.util.ArrayList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public e f601a;

    /* renamed from: b  reason: collision with root package name */
    public e f602b;

    /* renamed from: c  reason: collision with root package name */
    public e f603c;

    /* renamed from: d  reason: collision with root package name */
    public e f604d;

    /* renamed from: e  reason: collision with root package name */
    public e f605e;

    /* renamed from: f  reason: collision with root package name */
    public e f606f;

    /* renamed from: g  reason: collision with root package name */
    public e f607g;
    public ArrayList<e> h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p = false;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public c(e first, int orientation, boolean isRtl) {
        this.f601a = first;
        this.o = orientation;
        this.p = isRtl;
    }

    public static boolean c(e widget, int orientation) {
        if (widget.O() != 8 && widget.R[orientation] == e.a.MATCH_CONSTRAINT) {
            int[] iArr = widget.q;
            if (iArr[orientation] == 0 || iArr[orientation] == 3) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        boolean z;
        e next;
        int offset = this.o * 2;
        e lastVisited = this.f601a;
        e widget = this.f601a;
        e eVar = this.f601a;
        boolean done = false;
        while (true) {
            z = true;
            if (done) {
                break;
            }
            this.i++;
            e[] eVarArr = widget.m0;
            int i2 = this.o;
            eVarArr[i2] = null;
            widget.l0[i2] = null;
            if (widget.O() != 8) {
                this.l++;
                if (widget.q(this.o) != e.a.MATCH_CONSTRAINT) {
                    this.m += widget.A(this.o);
                }
                int e2 = this.m + widget.O[offset].e();
                this.m = e2;
                this.m = e2 + widget.O[offset + 1].e();
                int e3 = this.n + widget.O[offset].e();
                this.n = e3;
                this.n = e3 + widget.O[offset + 1].e();
                if (this.f602b == null) {
                    this.f602b = widget;
                }
                this.f604d = widget;
                e.a[] aVarArr = widget.R;
                int i3 = this.o;
                if (aVarArr[i3] == e.a.MATCH_CONSTRAINT) {
                    int[] iArr = widget.q;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.j++;
                        float[] fArr = widget.k0;
                        int i4 = this.o;
                        float weight = fArr[i4];
                        if (weight > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (c(widget, this.o)) {
                            if (weight < 0.0f) {
                                this.q = true;
                            } else {
                                this.r = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(widget);
                        }
                        if (this.f606f == null) {
                            this.f606f = widget;
                        }
                        e eVar2 = this.f607g;
                        if (eVar2 != null) {
                            eVar2.l0[this.o] = widget;
                        }
                        this.f607g = widget;
                    }
                    if (this.o != 0 ? widget.p == 0 && widget.u == 0 && widget.v != 0 : widget.o == 0 && widget.r == 0 && widget.s != 0) {
                    }
                    if (widget.V != 0.0f) {
                    }
                }
            }
            if (lastVisited != widget) {
                lastVisited.m0[this.o] = widget;
            }
            lastVisited = widget;
            d nextAnchor = widget.O[offset + 1].f613f;
            if (nextAnchor != null) {
                next = nextAnchor.f611d;
                d[] dVarArr = next.O;
                if (dVarArr[offset].f613f == null || dVarArr[offset].f613f.f611d != widget) {
                    next = null;
                }
            } else {
                next = null;
            }
            if (next != null) {
                widget = next;
            } else {
                done = true;
            }
        }
        e eVar3 = this.f602b;
        if (eVar3 != null) {
            this.m -= eVar3.O[offset].e();
        }
        e eVar4 = this.f604d;
        if (eVar4 != null) {
            this.m -= eVar4.O[offset + 1].e();
        }
        this.f603c = widget;
        if (this.o != 0 || !this.p) {
            this.f605e = this.f601a;
        } else {
            this.f605e = widget;
        }
        if (!this.r || !this.q) {
            z = false;
        }
        this.s = z;
    }

    public void a() {
        if (!this.t) {
            b();
        }
        this.t = true;
    }
}
