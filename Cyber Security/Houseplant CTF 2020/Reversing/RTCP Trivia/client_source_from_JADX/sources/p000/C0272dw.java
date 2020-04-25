package p000;

import java.util.ArrayList;

/* renamed from: dw */
public final class C0272dw {

    /* renamed from: a */
    protected C0278dy f1309a;

    /* renamed from: b */
    protected C0278dy f1310b;

    /* renamed from: c */
    protected C0278dy f1311c;

    /* renamed from: d */
    protected C0278dy f1312d;

    /* renamed from: e */
    protected C0278dy f1313e;

    /* renamed from: f */
    protected C0278dy f1314f;

    /* renamed from: g */
    protected C0278dy f1315g;

    /* renamed from: h */
    protected ArrayList<C0278dy> f1316h;

    /* renamed from: i */
    protected int f1317i;

    /* renamed from: j */
    protected int f1318j;

    /* renamed from: k */
    protected float f1319k = 0.0f;

    /* renamed from: l */
    protected boolean f1320l;

    /* renamed from: m */
    protected boolean f1321m;

    /* renamed from: n */
    protected boolean f1322n;

    /* renamed from: o */
    boolean f1323o;

    /* renamed from: p */
    private int f1324p;

    /* renamed from: q */
    private boolean f1325q = false;

    public C0272dw(C0278dy dyVar, int i, boolean z) {
        this.f1309a = dyVar;
        this.f1324p = i;
        this.f1325q = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1548a() {
        int i = this.f1324p * 2;
        boolean z = false;
        C0278dy dyVar = this.f1309a;
        boolean z2 = false;
        while (!z2) {
            this.f1317i++;
            C0278dy dyVar2 = null;
            dyVar.f1389ai[this.f1324p] = null;
            dyVar.f1388ah[this.f1324p] = null;
            if (dyVar.f1378Y != 8) {
                if (this.f1310b == null) {
                    this.f1310b = dyVar;
                }
                if (this.f1312d != null) {
                    this.f1312d.f1389ai[this.f1324p] = dyVar;
                }
                this.f1312d = dyVar;
                if (dyVar.f1360F[this.f1324p] == C0280a.f1425c && (dyVar.f1403i[this.f1324p] == 0 || dyVar.f1403i[this.f1324p] == 3 || dyVar.f1403i[this.f1324p] == 2)) {
                    this.f1318j++;
                    float f = dyVar.f1387ag[this.f1324p];
                    if (f > 0.0f) {
                        this.f1319k += dyVar.f1387ag[this.f1324p];
                    }
                    int i2 = this.f1324p;
                    if (dyVar.f1378Y != 8 && dyVar.f1360F[i2] == C0280a.f1425c && (dyVar.f1403i[i2] == 0 || dyVar.f1403i[i2] == 3)) {
                        if (f < 0.0f) {
                            this.f1320l = true;
                        } else {
                            this.f1321m = true;
                        }
                        if (this.f1316h == null) {
                            this.f1316h = new ArrayList<>();
                        }
                        this.f1316h.add(dyVar);
                    }
                    if (this.f1314f == null) {
                        this.f1314f = dyVar;
                    }
                    if (this.f1315g != null) {
                        this.f1315g.f1388ah[this.f1324p] = dyVar;
                    }
                    this.f1315g = dyVar;
                }
            }
            C0273dx dxVar = dyVar.f1358D[i + 1].f1329d;
            if (dxVar != null) {
                C0278dy dyVar3 = dxVar.f1327b;
                if (dyVar3.f1358D[i].f1329d != null && dyVar3.f1358D[i].f1329d.f1327b == dyVar) {
                    dyVar2 = dyVar3;
                }
            }
            if (dyVar2 != null) {
                dyVar = dyVar2;
            } else {
                z2 = true;
            }
        }
        this.f1311c = dyVar;
        this.f1313e = (this.f1324p != 0 || !this.f1325q) ? this.f1309a : this.f1311c;
        if (this.f1321m && this.f1320l) {
            z = true;
        }
        this.f1322n = z;
    }
}
