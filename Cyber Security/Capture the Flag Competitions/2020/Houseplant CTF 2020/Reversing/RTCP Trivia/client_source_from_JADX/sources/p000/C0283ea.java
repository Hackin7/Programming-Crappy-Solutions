package p000;

import java.util.ArrayList;

/* renamed from: ea */
public final class C0283ea extends C0278dy {

    /* renamed from: a */
    protected float f1446a = -1.0f;

    /* renamed from: al */
    protected int f1447al = -1;

    /* renamed from: am */
    private C0273dx f1448am = this.f1417w;

    /* renamed from: an */
    private int f1449an;

    /* renamed from: ao */
    private boolean f1450ao;

    /* renamed from: ap */
    private int f1451ap;

    /* renamed from: aq */
    private C0287ed f1452aq;

    /* renamed from: ar */
    private int f1453ar;

    /* renamed from: b */
    protected int f1454b = -1;

    public C0283ea() {
        this.f1449an = 0;
        this.f1450ao = false;
        this.f1451ap = 0;
        this.f1452aq = new C0287ed();
        this.f1453ar = 8;
        this.f1359E.clear();
        this.f1359E.add(this.f1448am);
        int length = this.f1358D.length;
        for (int i = 0; i < length; i++) {
            this.f1358D[i] = this.f1448am;
        }
    }

    /* renamed from: a */
    public final C0273dx mo1555a(C0277c cVar) {
        switch (cVar) {
            case LEFT:
            case RIGHT:
                if (this.f1449an == 1) {
                    return this.f1448am;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f1449an == 0) {
                    return this.f1448am;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    /* renamed from: a */
    public final void mo1630a(float f) {
        if (f > -1.0f) {
            this.f1446a = f;
            this.f1454b = -1;
            this.f1447al = -1;
        }
    }

    /* renamed from: a */
    public final void mo1543a(int i) {
        C0278dy dyVar = this.f1361G;
        if (dyVar != null) {
            if (this.f1449an == 1) {
                this.f1417w.f1326a.mo1639a(dyVar.f1417w.f1326a, 0);
                this.f1419y.f1326a.mo1639a(dyVar.f1417w.f1326a, 0);
                if (this.f1454b != -1) {
                    this.f1416v.f1326a.mo1639a(dyVar.f1416v.f1326a, this.f1454b);
                    this.f1418x.f1326a.mo1639a(dyVar.f1416v.f1326a, this.f1454b);
                } else if (this.f1447al != -1) {
                    this.f1416v.f1326a.mo1639a(dyVar.f1418x.f1326a, -this.f1447al);
                    this.f1418x.f1326a.mo1639a(dyVar.f1418x.f1326a, -this.f1447al);
                } else if (this.f1446a != -1.0f && dyVar.mo1593x() == C0280a.f1423a) {
                    int i2 = (int) (((float) dyVar.f1362H) * this.f1446a);
                    this.f1416v.f1326a.mo1639a(dyVar.f1416v.f1326a, i2);
                    this.f1418x.f1326a.mo1639a(dyVar.f1416v.f1326a, i2);
                }
            } else {
                this.f1416v.f1326a.mo1639a(dyVar.f1416v.f1326a, 0);
                this.f1418x.f1326a.mo1639a(dyVar.f1416v.f1326a, 0);
                if (this.f1454b != -1) {
                    this.f1417w.f1326a.mo1639a(dyVar.f1417w.f1326a, this.f1454b);
                    this.f1419y.f1326a.mo1639a(dyVar.f1417w.f1326a, this.f1454b);
                } else if (this.f1447al != -1) {
                    this.f1417w.f1326a.mo1639a(dyVar.f1419y.f1326a, -this.f1447al);
                    this.f1419y.f1326a.mo1639a(dyVar.f1419y.f1326a, -this.f1447al);
                } else if (this.f1446a != -1.0f && dyVar.mo1594y() == C0280a.f1423a) {
                    int i3 = (int) (((float) dyVar.f1363I) * this.f1446a);
                    this.f1417w.f1326a.mo1639a(dyVar.f1417w.f1326a, i3);
                    this.f1419y.f1326a.mo1639a(dyVar.f1417w.f1326a, i3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1544a(C0262dq dqVar) {
        C0281dz dzVar = (C0281dz) this.f1361G;
        if (dzVar != null) {
            C0273dx a = dzVar.mo1555a(C0277c.LEFT);
            C0273dx a2 = dzVar.mo1555a(C0277c.RIGHT);
            boolean z = this.f1361G != null && this.f1361G.f1360F[0] == C0280a.f1424b;
            if (this.f1449an == 0) {
                a = dzVar.mo1555a(C0277c.TOP);
                a2 = dzVar.mo1555a(C0277c.BOTTOM);
                z = this.f1361G != null && this.f1361G.f1360F[1] == C0280a.f1424b;
            }
            if (this.f1454b != -1) {
                C0268dt a3 = dqVar.mo1520a((Object) this.f1448am);
                dqVar.mo1531c(a3, dqVar.mo1520a((Object) a), this.f1454b, 6);
                if (z) {
                    dqVar.mo1526a(dqVar.mo1520a((Object) a2), a3, 0, 5);
                }
            } else if (this.f1447al != -1) {
                C0268dt a4 = dqVar.mo1520a((Object) this.f1448am);
                C0268dt a5 = dqVar.mo1520a((Object) a2);
                dqVar.mo1531c(a4, a5, -this.f1447al, 6);
                if (z) {
                    dqVar.mo1526a(a4, dqVar.mo1520a((Object) a), 0, 5);
                    dqVar.mo1526a(a5, a4, 0, 5);
                }
            } else {
                if (this.f1446a != -1.0f) {
                    dqVar.mo1521a(C0262dq.m868a(dqVar, dqVar.mo1520a((Object) this.f1448am), dqVar.mo1520a((Object) a), dqVar.mo1520a((Object) a2), this.f1446a, this.f1450ao));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1545a() {
        return true;
    }

    /* renamed from: j */
    public final void mo1631j(int i) {
        if (this.f1449an != i) {
            this.f1449an = i;
            this.f1359E.clear();
            this.f1448am = this.f1449an == 1 ? this.f1416v : this.f1417w;
            this.f1359E.add(this.f1448am);
            int length = this.f1358D.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1358D[i2] = this.f1448am;
            }
        }
    }

    /* renamed from: k */
    public final void mo1632k(int i) {
        if (i >= 0) {
            this.f1446a = -1.0f;
            this.f1454b = i;
            this.f1447al = -1;
        }
    }

    /* renamed from: l */
    public final void mo1633l(int i) {
        if (i >= 0) {
            this.f1446a = -1.0f;
            this.f1454b = -1;
            this.f1447al = i;
        }
    }

    /* renamed from: u */
    public final ArrayList<C0273dx> mo1590u() {
        return this.f1359E;
    }

    /* renamed from: z */
    public final void mo1595z() {
        if (this.f1361G != null) {
            int b = C0262dq.m871b((Object) this.f1448am);
            if (this.f1449an == 1) {
                mo1560b(b);
                mo1563c(0);
                mo1568e(this.f1361G.mo1581m());
                mo1565d(0);
                return;
            }
            mo1560b(0);
            mo1563c(b);
            mo1565d(this.f1361G.mo1580l());
            mo1568e(0);
        }
    }
}
