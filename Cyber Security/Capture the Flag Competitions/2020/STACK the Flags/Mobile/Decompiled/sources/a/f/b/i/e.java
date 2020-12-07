package a.f.b.i;

import a.f.b.b;
import a.f.b.h;
import a.f.b.i.d;
import a.f.b.i.m.c;
import a.f.b.i.m.f;
import a.f.b.i.m.l;
import a.f.b.i.m.n;
import a.f.b.i.m.p;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import net.sqlcipher.BuildConfig;

public class e {
    public static float p0 = 0.5f;
    public float A = 0.0f;
    public boolean B = false;
    public boolean C;
    public boolean D = false;
    public int E = 0;
    public int F = 0;
    public d G = new d(this, d.a.LEFT);
    public d H = new d(this, d.a.TOP);
    public d I = new d(this, d.a.RIGHT);
    public d J = new d(this, d.a.BOTTOM);
    public d K = new d(this, d.a.BASELINE);
    public d L = new d(this, d.a.CENTER_X);
    public d M = new d(this, d.a.CENTER_Y);
    public d N;
    public d[] O;
    public ArrayList<d> P;
    public boolean[] Q;
    public a[] R;
    public e S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f621a = false;
    public int a0;

    /* renamed from: b  reason: collision with root package name */
    public c f622b;
    public int b0;

    /* renamed from: c  reason: collision with root package name */
    public c f623c;
    public float c0;

    /* renamed from: d  reason: collision with root package name */
    public l f624d = null;
    public float d0;

    /* renamed from: e  reason: collision with root package name */
    public n f625e = null;
    public Object e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f626f = {true, true};
    public int f0;

    /* renamed from: g  reason: collision with root package name */
    public int[] f627g = {0, 0, 0, 0};
    public String g0;
    public boolean h = true;
    public String h0;
    public boolean i = false;
    public int i0;
    public boolean j = true;
    public int j0;
    public boolean k = false;
    public float[] k0;
    public boolean l = false;
    public e[] l0;
    public int m = -1;
    public e[] m0;
    public int n = -1;
    public int n0;
    public int o = 0;
    public int o0;
    public int p = 0;
    public int[] q = new int[2];
    public int r = 0;
    public int s = 0;
    public float t = 1.0f;
    public int u = 0;
    public int v = 0;
    public float w = 1.0f;
    public int x = -1;
    public float y = 1.0f;
    public int[] z = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public p J(int orientation) {
        if (orientation == 0) {
            return this.f624d;
        }
        if (orientation == 1) {
            return this.f625e;
        }
        return null;
    }

    public void o0(int x1) {
        this.G.s(x1);
        this.X = x1;
    }

    public void p0(int y1) {
        this.H.s(y1);
        this.Y = y1;
    }

    public void n0(int x1, int x2) {
        this.G.s(x1);
        this.I.s(x2);
        this.X = x1;
        this.T = x2 - x1;
        this.k = true;
    }

    public void q0(int y1, int y2) {
        this.H.s(y1);
        this.J.s(y2);
        this.Y = y1;
        this.U = y2 - y1;
        if (this.B) {
            this.K.s(this.Z + y1);
        }
        this.l = true;
    }

    public void m0(int baselineValue) {
        if (this.B) {
            int y1 = baselineValue - this.Z;
            this.Y = y1;
            this.H.s(y1);
            this.J.s(this.U + y1);
            this.K.s(baselineValue);
            this.l = true;
        }
    }

    public boolean c0() {
        return this.k || (this.G.m() && this.I.m());
    }

    public boolean d0() {
        return this.l || (this.H.m() && this.J.m());
    }

    public void g0() {
        this.k = false;
        this.l = false;
        int mAnchorsSize = this.P.size();
        for (int i2 = 0; i2 < mAnchorsSize; i2++) {
            this.P.get(i2).q();
        }
    }

    public boolean U() {
        int mAnchorsSize = this.P.size();
        for (int i2 = 0; i2 < mAnchorsSize; i2++) {
            if (this.P.get(i2).l()) {
                return true;
            }
        }
        return false;
    }

    public boolean T(int orientation) {
        if (orientation == 0) {
            if ((this.G.f613f != null ? 1 : 0) + (this.I.f613f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.H.f613f != null ? 1 : 0) + (this.J.f613f != null ? 1 : 0) + (this.K.f613f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public boolean a0() {
        return this.D;
    }

    public void C0(boolean inVirtualLayout) {
        this.D = inVirtualLayout;
    }

    public int B() {
        return this.z[1];
    }

    public int C() {
        return this.z[0];
    }

    public void F0(int maxWidth) {
        this.z[0] = maxWidth;
    }

    public void E0(int maxHeight) {
        this.z[1] = maxHeight;
    }

    public void s0(boolean hasBaseline) {
        this.B = hasBaseline;
    }

    public boolean Y() {
        return this.C;
    }

    public void B0(boolean inPlaceholder) {
        this.C = inPlaceholder;
    }

    public void A0(int orientation, boolean value) {
        this.Q[orientation] = value;
    }

    public void G0(boolean measureRequested) {
        this.h = measureRequested;
    }

    public boolean b0() {
        return this.h && this.f0 != 8;
    }

    public int y() {
        return this.E;
    }

    public int z() {
        return this.F;
    }

    public void D0(int horizontal, int vertical) {
        this.E = horizontal;
        this.F = vertical;
        G0(false);
    }

    public void f0() {
        this.G.p();
        this.H.p();
        this.I.p();
        this.J.p();
        this.K.p();
        this.L.p();
        this.M.p();
        this.N.p();
        this.S = null;
        this.A = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        a[] aVarArr = this.R;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.m = -1;
        this.n = -1;
        int[] iArr = this.z;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.o = 0;
        this.p = 0;
        this.t = 1.0f;
        this.w = 1.0f;
        this.s = Integer.MAX_VALUE;
        this.v = Integer.MAX_VALUE;
        this.r = 0;
        this.u = 0;
        this.x = -1;
        this.y = 1.0f;
        boolean[] zArr = this.f626f;
        zArr[0] = true;
        zArr[1] = true;
        this.D = false;
        boolean[] zArr2 = this.Q;
        zArr2[0] = false;
        zArr2[1] = false;
        this.h = true;
    }

    public boolean e0() {
        a[] aVarArr = this.R;
        a aVar = aVarArr[0];
        a aVar2 = a.MATCH_CONSTRAINT;
        return aVar == aVar2 && aVarArr[1] == aVar2;
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.N = dVar;
        this.O = new d[]{this.G, this.I, this.H, this.J, this.K, dVar};
        this.P = new ArrayList<>();
        this.Q = new boolean[2];
        a aVar = a.FIXED;
        this.R = new a[]{aVar, aVar};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new e[]{null, null};
        this.m0 = new e[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        b();
    }

    public void j() {
        if (this.f624d == null) {
            this.f624d = new l(this);
        }
        if (this.f625e == null) {
            this.f625e = new n(this);
        }
    }

    public void h0(a.f.b.c cache) {
        this.G.r();
        this.H.r();
        this.I.r();
        this.J.r();
        this.K.r();
        this.N.r();
        this.L.r();
        this.M.r();
    }

    public final void b() {
        this.P.add(this.G);
        this.P.add(this.H);
        this.P.add(this.I);
        this.P.add(this.J);
        this.P.add(this.L);
        this.P.add(this.M);
        this.P.add(this.N);
        this.P.add(this.K);
    }

    public e G() {
        return this.S;
    }

    public void K0(e widget) {
        this.S = widget;
    }

    public void h(e target, float angle, int radius) {
        d.a aVar = d.a.CENTER;
        V(aVar, target, aVar, radius, 0);
        this.A = angle;
    }

    public void R0(int visibility) {
        this.f0 = visibility;
    }

    public int O() {
        return this.f0;
    }

    public String p() {
        return this.g0;
    }

    public void k0(String name) {
        this.g0 = name;
    }

    public void i(a.f.b.d system) {
        system.q(this.G);
        system.q(this.H);
        system.q(this.I);
        system.q(this.J);
        if (this.Z > 0) {
            system.q(this.K);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.h0;
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null) {
            str = "type: " + this.h0 + " ";
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.g0 != null) {
            str3 = "id: " + this.g0 + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.X);
        sb.append(", ");
        sb.append(this.Y);
        sb.append(") - (");
        sb.append(this.T);
        sb.append(" x ");
        sb.append(this.U);
        sb.append(")");
        return sb.toString();
    }

    public int Q() {
        e eVar = this.S;
        if (eVar == null || !(eVar instanceof f)) {
            return this.X;
        }
        return ((f) eVar).w0 + this.X;
    }

    public int R() {
        e eVar = this.S;
        if (eVar == null || !(eVar instanceof f)) {
            return this.Y;
        }
        return ((f) eVar).x0 + this.Y;
    }

    public int P() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public int t() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public int A(int orientation) {
        if (orientation == 0) {
            return P();
        }
        if (orientation == 1) {
            return t();
        }
        return 0;
    }

    public int E() {
        return this.a0;
    }

    public int D() {
        return this.b0;
    }

    public int I() {
        return Q() + this.T;
    }

    public int n() {
        return R() + this.U;
    }

    public int x() {
        int margin = 0;
        d dVar = this.G;
        if (dVar != null) {
            margin = 0 + dVar.f614g;
        }
        d dVar2 = this.I;
        if (dVar2 != null) {
            return margin + dVar2.f614g;
        }
        return margin;
    }

    public int N() {
        int margin = 0;
        if (this.G != null) {
            margin = 0 + this.H.f614g;
        }
        if (this.I != null) {
            return margin + this.J.f614g;
        }
        return margin;
    }

    public float u() {
        return this.c0;
    }

    public float K() {
        return this.d0;
    }

    public float m(int orientation) {
        if (orientation == 0) {
            return this.c0;
        }
        if (orientation == 1) {
            return this.d0;
        }
        return -1.0f;
    }

    public boolean S() {
        return this.B;
    }

    public int l() {
        return this.Z;
    }

    public Object o() {
        return this.e0;
    }

    public void T0(int x2) {
        this.X = x2;
    }

    public void U0(int y2) {
        this.Y = y2;
    }

    public void J0(int x2, int y2) {
        this.X = x2;
        this.Y = y2;
    }

    public void S0(int w2) {
        this.T = w2;
        int i2 = this.a0;
        if (w2 < i2) {
            this.T = i2;
        }
    }

    public void t0(int h2) {
        this.U = h2;
        int i2 = this.b0;
        if (h2 < i2) {
            this.U = i2;
        }
    }

    public void y0(int horizontalMatchStyle, int min, int max, float percent) {
        this.o = horizontalMatchStyle;
        this.r = min;
        this.s = max == Integer.MAX_VALUE ? 0 : max;
        this.t = percent;
        if (percent > 0.0f && percent < 1.0f && this.o == 0) {
            this.o = 2;
        }
    }

    public void P0(int verticalMatchStyle, int min, int max, float percent) {
        this.p = verticalMatchStyle;
        this.u = min;
        this.v = max == Integer.MAX_VALUE ? 0 : max;
        this.w = percent;
        if (percent > 0.0f && percent < 1.0f && this.p == 0) {
            this.p = 2;
        }
    }

    public void l0(String ratio) {
        int commaIndex;
        if (ratio == null || ratio.length() == 0) {
            this.V = 0.0f;
            return;
        }
        int dimensionRatioSide = -1;
        float dimensionRatio = 0.0f;
        int len = ratio.length();
        int commaIndex2 = ratio.indexOf(44);
        if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
            commaIndex = 0;
        } else {
            String dimension = ratio.substring(0, commaIndex2);
            if (dimension.equalsIgnoreCase("W")) {
                dimensionRatioSide = 0;
            } else if (dimension.equalsIgnoreCase("H")) {
                dimensionRatioSide = 1;
            }
            commaIndex = commaIndex2 + 1;
        }
        int colonIndex = ratio.indexOf(58);
        if (colonIndex < 0 || colonIndex >= len - 1) {
            String r2 = ratio.substring(commaIndex);
            if (r2.length() > 0) {
                try {
                    dimensionRatio = Float.parseFloat(r2);
                } catch (NumberFormatException e2) {
                }
            }
        } else {
            String nominator = ratio.substring(commaIndex, colonIndex);
            String denominator = ratio.substring(colonIndex + 1);
            if (nominator.length() > 0 && denominator.length() > 0) {
                try {
                    float nominatorValue = Float.parseFloat(nominator);
                    float denominatorValue = Float.parseFloat(denominator);
                    if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                        dimensionRatio = dimensionRatioSide == 1 ? Math.abs(denominatorValue / nominatorValue) : Math.abs(nominatorValue / denominatorValue);
                    }
                } catch (NumberFormatException e3) {
                }
            }
        }
        if (dimensionRatio > 0.0f) {
            this.V = dimensionRatio;
            this.W = dimensionRatioSide;
        }
    }

    public float r() {
        return this.V;
    }

    public int s() {
        return this.W;
    }

    public void u0(float horizontalBiasPercent) {
        this.c0 = horizontalBiasPercent;
    }

    public void L0(float verticalBiasPercent) {
        this.d0 = verticalBiasPercent;
    }

    public void I0(int w2) {
        if (w2 < 0) {
            this.a0 = 0;
        } else {
            this.a0 = w2;
        }
    }

    public void H0(int h2) {
        if (h2 < 0) {
            this.b0 = 0;
        } else {
            this.b0 = h2;
        }
    }

    public void r0(int left, int top, int right, int bottom) {
        int w2 = right - left;
        int h2 = bottom - top;
        this.X = left;
        this.Y = top;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        if (this.R[0] == a.FIXED && w2 < this.T) {
            w2 = this.T;
        }
        if (this.R[1] == a.FIXED && h2 < this.U) {
            h2 = this.U;
        }
        this.T = w2;
        this.U = h2;
        int i2 = this.b0;
        if (h2 < i2) {
            this.U = i2;
        }
        int i3 = this.T;
        int i4 = this.a0;
        if (i3 < i4) {
            this.T = i4;
        }
    }

    public void w0(int left, int right) {
        this.X = left;
        int i2 = right - left;
        this.T = i2;
        int i3 = this.a0;
        if (i2 < i3) {
            this.T = i3;
        }
    }

    public void N0(int top, int bottom) {
        this.Y = top;
        int i2 = bottom - top;
        this.U = i2;
        int i3 = this.b0;
        if (i2 < i3) {
            this.U = i3;
        }
    }

    public void i0(int baseline) {
        this.Z = baseline;
        this.B = baseline > 0;
    }

    public void j0(Object companion) {
        this.e0 = companion;
    }

    public void z0(float horizontalWeight) {
        this.k0[0] = horizontalWeight;
    }

    public void Q0(float verticalWeight) {
        this.k0[1] = verticalWeight;
    }

    public void v0(int horizontalChainStyle) {
        this.i0 = horizontalChainStyle;
    }

    public int v() {
        return this.i0;
    }

    public void M0(int verticalChainStyle) {
        this.j0 = verticalChainStyle;
    }

    public int L() {
        return this.j0;
    }

    public boolean f() {
        return this.f0 != 8;
    }

    public void V(d.a startType, e target, d.a endType, int margin, int goneMargin) {
        k(startType).a(target.k(endType), margin, goneMargin, true);
    }

    public d k(d.a anchorType) {
        switch (anchorType.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.G;
            case 2:
                return this.H;
            case 3:
                return this.I;
            case 4:
                return this.J;
            case 5:
                return this.K;
            case 6:
                return this.N;
            case 7:
                return this.L;
            case 8:
                return this.M;
            default:
                throw new AssertionError(anchorType.name());
        }
    }

    public a w() {
        return this.R[0];
    }

    public a M() {
        return this.R[1];
    }

    public a q(int orientation) {
        if (orientation == 0) {
            return w();
        }
        if (orientation == 1) {
            return M();
        }
        return null;
    }

    public void x0(a behaviour) {
        this.R[0] = behaviour;
    }

    public void O0(a behaviour) {
        this.R[1] = behaviour;
    }

    public boolean X() {
        d dVar = this.G;
        d dVar2 = dVar.f613f;
        if (dVar2 != null && dVar2.f613f == dVar) {
            return true;
        }
        d dVar3 = this.I;
        d dVar4 = dVar3.f613f;
        if (dVar4 == null || dVar4.f613f != dVar3) {
            return false;
        }
        return true;
    }

    public e H(int orientation) {
        d dVar;
        d dVar2;
        if (orientation == 0) {
            d dVar3 = this.G;
            d dVar4 = dVar3.f613f;
            if (dVar4 == null || dVar4.f613f != dVar3) {
                return null;
            }
            return dVar4.f611d;
        } else if (orientation == 1 && (dVar2 = (dVar = this.H).f613f) != null && dVar2.f613f == dVar) {
            return dVar2.f611d;
        } else {
            return null;
        }
    }

    public e F(int orientation) {
        d dVar;
        d dVar2;
        if (orientation == 0) {
            d dVar3 = this.I;
            d dVar4 = dVar3.f613f;
            if (dVar4 == null || dVar4.f613f != dVar3) {
                return null;
            }
            return dVar4.f611d;
        } else if (orientation == 1 && (dVar2 = (dVar = this.J).f613f) != null && dVar2.f613f == dVar) {
            return dVar2.f611d;
        } else {
            return null;
        }
    }

    public boolean Z() {
        d dVar = this.H;
        d dVar2 = dVar.f613f;
        if (dVar2 != null && dVar2.f613f == dVar) {
            return true;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f613f;
        if (dVar4 == null || dVar4.f613f != dVar3) {
            return false;
        }
        return true;
    }

    public final boolean W(int orientation) {
        int offset = orientation * 2;
        d[] dVarArr = this.O;
        return (dVarArr[offset].f613f == null || dVarArr[offset].f613f.f613f == dVarArr[offset] || dVarArr[offset + 1].f613f == null || dVarArr[offset + 1].f613f.f613f != dVarArr[offset + 1]) ? false : true;
    }

    /* JADX INFO: Multiple debug info for r0v9 int: [D('inHorizontalChain' boolean), D('width' int)] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0605  */
    public void e(a.f.b.d system, boolean optimize) {
        boolean verticalParentWrapContent;
        boolean horizontalParentWrapContent;
        boolean inVerticalChain;
        boolean inHorizontalChain;
        int matchConstraintDefaultWidth;
        boolean useRatio;
        int matchConstraintDefaultHeight;
        int height;
        int width;
        boolean wrapContent;
        int width2;
        boolean applyPosition;
        h left;
        h right;
        h top;
        h bottom;
        h baseline;
        boolean applyVerticalConstraints;
        int i2;
        h baseline2;
        h bottom2;
        h top2;
        a.f.b.d dVar;
        e eVar;
        char c2;
        int i3;
        int height2;
        boolean applyPosition2;
        l lVar;
        int i4;
        int i5;
        int height3;
        int width3;
        boolean inHorizontalChain2;
        boolean inVerticalChain2;
        l lVar2;
        n nVar;
        e eVar2;
        e eVar3;
        h left2 = system.q(this.G);
        h right2 = system.q(this.I);
        h top3 = system.q(this.H);
        h bottom3 = system.q(this.J);
        h baseline3 = system.q(this.K);
        e eVar4 = this.S;
        if (eVar4 != null) {
            boolean horizontalParentWrapContent2 = eVar4 != null && eVar4.R[0] == a.WRAP_CONTENT;
            e eVar5 = this.S;
            horizontalParentWrapContent = horizontalParentWrapContent2;
            verticalParentWrapContent = eVar5 != null && eVar5.R[1] == a.WRAP_CONTENT;
        } else {
            horizontalParentWrapContent = false;
            verticalParentWrapContent = false;
        }
        if (this.f0 == 8 && !U()) {
            boolean[] zArr = this.Q;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        if (this.k || this.l) {
            if (this.k) {
                system.f(left2, this.X);
                system.f(right2, this.X + this.T);
                if (horizontalParentWrapContent && (eVar3 = this.S) != null) {
                    if (this.j) {
                        f container = (f) eVar3;
                        container.m1(this.G);
                        container.g1(this.I);
                    } else {
                        system.h(system.q(eVar3.I), right2, 0, 5);
                    }
                }
            }
            if (this.l) {
                system.f(top3, this.Y);
                system.f(bottom3, this.Y + this.U);
                if (this.K.l()) {
                    system.f(baseline3, this.Y + this.Z);
                }
                if (verticalParentWrapContent && (eVar2 = this.S) != null) {
                    if (this.j) {
                        f container2 = (f) eVar2;
                        container2.m1(this.H);
                        container2.l1(this.J);
                    } else {
                        system.h(system.q(eVar2.J), bottom3, 0, 5);
                    }
                }
            }
            if (this.k && this.l) {
                this.k = false;
                this.l = false;
                return;
            }
        }
        if (!(!optimize || (lVar2 = this.f624d) == null || (nVar = this.f625e) == null)) {
            f fVar = lVar2.h;
            if (fVar.j && lVar2.i.j && nVar.h.j && nVar.i.j) {
                system.f(left2, fVar.f657g);
                system.f(right2, this.f624d.i.f657g);
                system.f(top3, this.f625e.h.f657g);
                system.f(bottom3, this.f625e.i.f657g);
                system.f(baseline3, this.f625e.k.f657g);
                if (this.S != null) {
                    if (horizontalParentWrapContent && this.f626f[0] && !X()) {
                        system.h(system.q(this.S.I), right2, 0, 8);
                    }
                    if (verticalParentWrapContent && this.f626f[1] && !Z()) {
                        system.h(system.q(this.S.J), bottom3, 0, 8);
                    }
                }
                this.k = false;
                this.l = false;
                return;
            }
        }
        if (this.S != null) {
            if (W(0)) {
                ((f) this.S).d1(this, 0);
                inHorizontalChain2 = true;
            } else {
                inHorizontalChain2 = X();
            }
            if (W(1)) {
                ((f) this.S).d1(this, 1);
                inVerticalChain2 = true;
            } else {
                inVerticalChain2 = Z();
            }
            if (!inHorizontalChain2 && horizontalParentWrapContent && this.f0 != 8 && this.G.f613f == null && this.I.f613f == null) {
                system.h(system.q(this.S.I), right2, 0, 1);
            }
            if (!inVerticalChain2 && verticalParentWrapContent && this.f0 != 8 && this.H.f613f == null && this.J.f613f == null && this.K == null) {
                system.h(system.q(this.S.J), bottom3, 0, 1);
            }
            inHorizontalChain = inHorizontalChain2;
            inVerticalChain = inVerticalChain2;
        } else {
            inHorizontalChain = false;
            inVerticalChain = false;
        }
        int width4 = this.T;
        if (width4 < this.a0) {
            width4 = this.a0;
        }
        int height4 = this.U;
        if (height4 < this.b0) {
            height4 = this.b0;
        }
        boolean horizontalDimensionFixed = this.R[0] != a.MATCH_CONSTRAINT;
        boolean verticalDimensionFixed = this.R[1] != a.MATCH_CONSTRAINT;
        boolean useRatio2 = false;
        this.x = this.W;
        float f2 = this.V;
        this.y = f2;
        int matchConstraintDefaultWidth2 = this.o;
        int matchConstraintDefaultHeight2 = this.p;
        if (f2 <= 0.0f || this.f0 == 8) {
            width3 = width4;
            height3 = height4;
        } else {
            useRatio2 = true;
            if (this.R[0] == a.MATCH_CONSTRAINT && matchConstraintDefaultWidth2 == 0) {
                matchConstraintDefaultWidth2 = 3;
            }
            if (this.R[1] == a.MATCH_CONSTRAINT && matchConstraintDefaultHeight2 == 0) {
                matchConstraintDefaultHeight2 = 3;
            }
            a[] aVarArr = this.R;
            width3 = width4;
            a aVar = aVarArr[0];
            a aVar2 = a.MATCH_CONSTRAINT;
            height3 = height4;
            if (aVar == aVar2 && aVarArr[1] == aVar2 && matchConstraintDefaultWidth2 == 3 && matchConstraintDefaultHeight2 == 3) {
                V0(horizontalDimensionFixed, verticalDimensionFixed);
            } else {
                a[] aVarArr2 = this.R;
                a aVar3 = aVarArr2[0];
                a aVar4 = a.MATCH_CONSTRAINT;
                if (aVar3 == aVar4 && matchConstraintDefaultWidth2 == 3) {
                    this.x = 0;
                    int width5 = (int) (this.y * ((float) this.U));
                    if (aVarArr2[1] != aVar4) {
                        width = width5;
                        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
                        useRatio = false;
                        matchConstraintDefaultWidth = 4;
                        height = height3;
                    } else {
                        width = width5;
                        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
                        useRatio = true;
                        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
                        height = height3;
                    }
                    int[] iArr = this.q;
                    iArr[0] = matchConstraintDefaultWidth;
                    iArr[1] = matchConstraintDefaultHeight;
                    if (!useRatio) {
                    }
                    if (!useRatio) {
                    }
                    if (this.R[0] != a.WRAP_CONTENT) {
                    }
                    if (wrapContent) {
                    }
                    if (this.N.n()) {
                    }
                    boolean[] zArr2 = this.Q;
                    boolean isInHorizontalBarrier = zArr2[0];
                    boolean isInVerticalBarrier = zArr2[1];
                    if (this.m != 2) {
                    }
                    baseline = baseline3;
                    bottom = bottom3;
                    top = top3;
                    right = right2;
                    left = left2;
                    applyVerticalConstraints = true;
                    if (optimize) {
                    }
                    dVar = system;
                    baseline2 = baseline;
                    bottom2 = bottom;
                    top2 = top;
                    i3 = 8;
                    c2 = 1;
                    i2 = 0;
                    if (!(eVar.n != 2 ? false : applyVerticalConstraints)) {
                    }
                    if (useRatio) {
                    }
                    if (eVar.N.n()) {
                    }
                    eVar.k = false;
                    eVar.l = false;
                } else if (this.R[1] == a.MATCH_CONSTRAINT && matchConstraintDefaultHeight2 == 3) {
                    this.x = 1;
                    if (this.W == -1) {
                        this.y = 1.0f / this.y;
                    }
                    int height5 = (int) (this.y * ((float) this.T));
                    if (this.R[0] != a.MATCH_CONSTRAINT) {
                        height = height5;
                        matchConstraintDefaultHeight = 4;
                        useRatio = false;
                        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
                        width = width3;
                    } else {
                        height = height5;
                        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
                        useRatio = true;
                        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
                        width = width3;
                    }
                    int[] iArr2 = this.q;
                    iArr2[0] = matchConstraintDefaultWidth;
                    iArr2[1] = matchConstraintDefaultHeight;
                    boolean useHorizontalRatio = !useRatio && ((i5 = this.x) == 0 || i5 == -1);
                    boolean useVerticalRatio = !useRatio && ((i4 = this.x) == 1 || i4 == -1);
                    wrapContent = this.R[0] != a.WRAP_CONTENT && (this instanceof f);
                    if (wrapContent) {
                        width2 = 0;
                    } else {
                        width2 = width;
                    }
                    if (this.N.n()) {
                        applyPosition = false;
                    } else {
                        applyPosition = true;
                    }
                    boolean[] zArr22 = this.Q;
                    boolean isInHorizontalBarrier2 = zArr22[0];
                    boolean isInVerticalBarrier2 = zArr22[1];
                    if (this.m != 2 || this.k) {
                        baseline = baseline3;
                        bottom = bottom3;
                        top = top3;
                        right = right2;
                        left = left2;
                    } else {
                        if (optimize && (lVar = this.f624d) != null) {
                            f fVar2 = lVar.h;
                            if (fVar2.j) {
                                if (!lVar.i.j) {
                                    e eVar6 = this.S;
                                    h parentMax = eVar6 == null ? system.q(eVar6.I) : null;
                                    e eVar7 = this.S;
                                    h parentMin = eVar7 == null ? system.q(eVar7.G) : null;
                                    boolean z2 = this.f626f[0];
                                    a[] aVarArr3 = this.R;
                                    baseline = baseline3;
                                    bottom = bottom3;
                                    top = top3;
                                    right = right2;
                                    left = left2;
                                    g(system, true, horizontalParentWrapContent, verticalParentWrapContent, z2, parentMin, parentMax, aVarArr3[0], wrapContent, this.G, this.I, this.X, width2, this.a0, this.z[0], this.c0, useHorizontalRatio, aVarArr3[1] != a.MATCH_CONSTRAINT, inHorizontalChain, inVerticalChain, isInHorizontalBarrier2, matchConstraintDefaultWidth, matchConstraintDefaultHeight, this.r, this.s, this.t, applyPosition);
                                } else if (optimize) {
                                    system.f(left2, fVar2.f657g);
                                    system.f(right2, this.f624d.i.f657g);
                                    if (this.S == null) {
                                        baseline = baseline3;
                                        bottom = bottom3;
                                        top = top3;
                                        right = right2;
                                        left = left2;
                                    } else if (!horizontalParentWrapContent || !this.f626f[0] || X()) {
                                        baseline = baseline3;
                                        bottom = bottom3;
                                        top = top3;
                                        right = right2;
                                        left = left2;
                                    } else {
                                        system.h(system.q(this.S.I), right2, 0, 8);
                                        baseline = baseline3;
                                        bottom = bottom3;
                                        top = top3;
                                        right = right2;
                                        left = left2;
                                    }
                                } else {
                                    baseline = baseline3;
                                    bottom = bottom3;
                                    top = top3;
                                    right = right2;
                                    left = left2;
                                }
                            }
                        }
                        e eVar62 = this.S;
                        if (eVar62 == null) {
                        }
                        e eVar72 = this.S;
                        if (eVar72 == null) {
                        }
                        boolean z22 = this.f626f[0];
                        a[] aVarArr32 = this.R;
                        baseline = baseline3;
                        bottom = bottom3;
                        top = top3;
                        right = right2;
                        left = left2;
                        g(system, true, horizontalParentWrapContent, verticalParentWrapContent, z22, parentMin, parentMax, aVarArr32[0], wrapContent, this.G, this.I, this.X, width2, this.a0, this.z[0], this.c0, useHorizontalRatio, aVarArr32[1] != a.MATCH_CONSTRAINT, inHorizontalChain, inVerticalChain, isInHorizontalBarrier2, matchConstraintDefaultWidth, matchConstraintDefaultHeight, this.r, this.s, this.t, applyPosition);
                    }
                    applyVerticalConstraints = true;
                    if (optimize) {
                        eVar = this;
                        n nVar2 = eVar.f625e;
                        if (nVar2 != null) {
                            f fVar3 = nVar2.h;
                            if (fVar3.j && nVar2.i.j) {
                                dVar = system;
                                top2 = top;
                                dVar.f(top2, fVar3.f657g);
                                bottom2 = bottom;
                                dVar.f(bottom2, eVar.f625e.i.f657g);
                                baseline2 = baseline;
                                dVar.f(baseline2, eVar.f625e.k.f657g);
                                e eVar8 = eVar.S;
                                if (eVar8 != null) {
                                    if (inVerticalChain || !verticalParentWrapContent) {
                                        i3 = 8;
                                        c2 = 1;
                                    } else {
                                        c2 = 1;
                                        if (eVar.f626f[1]) {
                                            i3 = 8;
                                            i2 = 0;
                                            dVar.h(dVar.q(eVar8.J), bottom2, 0, 8);
                                        } else {
                                            i3 = 8;
                                        }
                                    }
                                    i2 = 0;
                                } else {
                                    i3 = 8;
                                    c2 = 1;
                                    i2 = 0;
                                }
                                applyVerticalConstraints = false;
                                if (!(eVar.n != 2 ? false : applyVerticalConstraints) && !eVar.l) {
                                    boolean wrapContent2 = eVar.R[c2] == a.WRAP_CONTENT && (eVar instanceof f);
                                    if (wrapContent2) {
                                        height2 = 0;
                                    } else {
                                        height2 = height;
                                    }
                                    e eVar9 = eVar.S;
                                    h parentMax2 = eVar9 != null ? dVar.q(eVar9.J) : null;
                                    e eVar10 = eVar.S;
                                    h parentMin2 = eVar10 != null ? dVar.q(eVar10.H) : null;
                                    if (eVar.Z > 0 || eVar.f0 == i3) {
                                        if (eVar.K.f613f != null) {
                                            dVar.e(baseline2, top2, l(), i3);
                                            dVar.e(baseline2, dVar.q(eVar.K.f613f), 0, i3);
                                            if (verticalParentWrapContent) {
                                                dVar.h(parentMax2, dVar.q(eVar.J), i2, 5);
                                            }
                                            applyPosition2 = false;
                                            boolean z3 = eVar.f626f[c2];
                                            a[] aVarArr4 = eVar.R;
                                            g(system, false, verticalParentWrapContent, horizontalParentWrapContent, z3, parentMin2, parentMax2, aVarArr4[c2], wrapContent2, eVar.H, eVar.J, eVar.Y, height2, eVar.b0, eVar.z[c2], eVar.d0, useVerticalRatio, aVarArr4[0] != a.MATCH_CONSTRAINT, inVerticalChain, inHorizontalChain, isInVerticalBarrier2, matchConstraintDefaultHeight, matchConstraintDefaultWidth, eVar.u, eVar.v, eVar.w, applyPosition2);
                                        } else if (eVar.f0 == i3) {
                                            dVar.e(baseline2, top2, i2, i3);
                                        } else {
                                            dVar.e(baseline2, top2, l(), i3);
                                        }
                                    }
                                    applyPosition2 = applyPosition;
                                    boolean z32 = eVar.f626f[c2];
                                    a[] aVarArr42 = eVar.R;
                                    g(system, false, verticalParentWrapContent, horizontalParentWrapContent, z32, parentMin2, parentMax2, aVarArr42[c2], wrapContent2, eVar.H, eVar.J, eVar.Y, height2, eVar.b0, eVar.z[c2], eVar.d0, useVerticalRatio, aVarArr42[0] != a.MATCH_CONSTRAINT, inVerticalChain, inHorizontalChain, isInVerticalBarrier2, matchConstraintDefaultHeight, matchConstraintDefaultWidth, eVar.u, eVar.v, eVar.w, applyPosition2);
                                }
                                if (useRatio) {
                                    if (eVar.x == 1) {
                                        system.k(bottom2, top2, right, left, eVar.y, 8);
                                    } else {
                                        system.k(right, left, bottom2, top2, eVar.y, 8);
                                    }
                                }
                                if (eVar.N.n()) {
                                    dVar.b(eVar, eVar.N.i().g(), (float) Math.toRadians((double) (eVar.A + 90.0f)), eVar.N.e());
                                }
                                eVar.k = false;
                                eVar.l = false;
                            }
                        }
                    } else {
                        eVar = this;
                    }
                    dVar = system;
                    baseline2 = baseline;
                    bottom2 = bottom;
                    top2 = top;
                    i3 = 8;
                    c2 = 1;
                    i2 = 0;
                    if (!(eVar.n != 2 ? false : applyVerticalConstraints)) {
                    }
                    if (useRatio) {
                    }
                    if (eVar.N.n()) {
                    }
                    eVar.k = false;
                    eVar.l = false;
                }
            }
        }
        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
        useRatio = useRatio2;
        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
        width = width3;
        height = height3;
        int[] iArr22 = this.q;
        iArr22[0] = matchConstraintDefaultWidth;
        iArr22[1] = matchConstraintDefaultHeight;
        if (!useRatio) {
        }
        if (!useRatio) {
        }
        if (this.R[0] != a.WRAP_CONTENT) {
        }
        if (wrapContent) {
        }
        if (this.N.n()) {
        }
        boolean[] zArr222 = this.Q;
        boolean isInHorizontalBarrier22 = zArr222[0];
        boolean isInVerticalBarrier22 = zArr222[1];
        if (this.m != 2) {
        }
        baseline = baseline3;
        bottom = bottom3;
        top = top3;
        right = right2;
        left = left2;
        applyVerticalConstraints = true;
        if (optimize) {
        }
        dVar = system;
        baseline2 = baseline;
        bottom2 = bottom;
        top2 = top;
        i3 = 8;
        c2 = 1;
        i2 = 0;
        if (!(eVar.n != 2 ? false : applyVerticalConstraints)) {
        }
        if (useRatio) {
        }
        if (eVar.N.n()) {
        }
        eVar.k = false;
        eVar.l = false;
    }

    public boolean d() {
        return (this instanceof k) || (this instanceof g);
    }

    public void V0(boolean horizontalDimensionFixed, boolean verticalDimensionFixed) {
        if (this.x == -1) {
            if (horizontalDimensionFixed && !verticalDimensionFixed) {
                this.x = 0;
            } else if (!horizontalDimensionFixed && verticalDimensionFixed) {
                this.x = 1;
                if (this.W == -1) {
                    this.y = 1.0f / this.y;
                }
            }
        }
        if (this.x == 0 && (!this.H.n() || !this.J.n())) {
            this.x = 1;
        } else if (this.x == 1 && (!this.G.n() || !this.I.n())) {
            this.x = 0;
        }
        if (this.x == -1 && (!this.H.n() || !this.J.n() || !this.G.n() || !this.I.n())) {
            if (this.H.n() && this.J.n()) {
                this.x = 0;
            } else if (this.G.n() && this.I.n()) {
                this.y = 1.0f / this.y;
                this.x = 1;
            }
        }
        if (this.x != -1) {
            return;
        }
        if (this.r > 0 && this.u == 0) {
            this.x = 0;
        } else if (this.r == 0 && this.u > 0) {
            this.y = 1.0f / this.y;
            this.x = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0533, code lost:
        if ((r2 instanceof a.f.b.i.a) != false) goto L_0x0538;
     */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0577 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0606 A[ADDED_TO_REGION] */
    public final void g(a.f.b.d system, boolean isHorizontal, boolean parentWrapContent, boolean oppositeParentWrapContent, boolean isTerminal, h parentMin, h parentMax, a dimensionBehaviour, boolean wrapContent, d beginAnchor, d endAnchor, int beginPosition, int dimension, int minDimension, int maxDimension, float bias, boolean useRatio, boolean oppositeVariable, boolean inChain, boolean oppositeInChain, boolean inBarrier, int matchConstraintDefault, int oppositeMatchConstraintDefault, int matchMinDimension, int matchMaxDimension, float matchPercentDimension, boolean applyPosition) {
        int numConnections;
        int matchConstraintDefault2;
        boolean variableSize;
        boolean variableSize2;
        int dimension2;
        boolean variableSize3;
        int numConnections2;
        int matchMaxDimension2;
        int matchMaxDimension3;
        boolean variableSize4;
        h end;
        h beginTarget;
        h endTarget;
        int numConnections3;
        int matchConstraintDefault3;
        h begin;
        h begin2;
        h hVar;
        d dVar;
        a[] aVarArr;
        a aVar;
        boolean parentWrapContent2;
        e eVar;
        int rangeCheckStrength;
        h begin3;
        int matchConstraintDefault4;
        e endWidget;
        e beginWidget;
        boolean applyCentering;
        e parent;
        int wrapStrength;
        h hVar2;
        int i2;
        boolean applyRangeCheck;
        e beginWidget2;
        int wrapStrength2;
        e beginWidget3;
        int wrapStrength3;
        h begin4;
        e endWidget2;
        e beginWidget4;
        int rangeCheckStrength2;
        int boundsCheckStrength;
        int i3;
        int i4;
        int rangeCheckStrength3;
        boolean applyCentering2;
        e eVar2;
        int matchMinDimension2;
        int matchMaxDimension4;
        h percentBegin;
        h percentEnd;
        int i5;
        h begin5 = system.q(beginAnchor);
        h end2 = system.q(endAnchor);
        h beginTarget2 = system.q(beginAnchor.i());
        h endTarget2 = system.q(endAnchor.i());
        a.f.b.d.w();
        boolean isBeginConnected = beginAnchor.n();
        boolean isEndConnected = endAnchor.n();
        boolean isCenterConnected = this.N.n();
        int numConnections4 = 0;
        if (isBeginConnected) {
            numConnections4 = 0 + 1;
        }
        if (isEndConnected) {
            numConnections4++;
        }
        if (isCenterConnected) {
            numConnections = numConnections4 + 1;
        } else {
            numConnections = numConnections4;
        }
        if (useRatio) {
            matchConstraintDefault2 = 3;
        } else {
            matchConstraintDefault2 = matchConstraintDefault;
        }
        int ordinal = dimensionBehaviour.ordinal();
        if (ordinal == 0) {
            variableSize = false;
        } else if (ordinal == 1) {
            variableSize = false;
        } else if (ordinal != 2) {
            variableSize = ordinal != 3 ? false : false;
        } else {
            variableSize = matchConstraintDefault2 != 4;
        }
        if (this.f0 == 8) {
            dimension2 = 0;
            variableSize2 = false;
        } else {
            dimension2 = dimension;
            variableSize2 = variableSize;
        }
        if (applyPosition) {
            if (!isBeginConnected && !isEndConnected && !isCenterConnected) {
                system.f(begin5, beginPosition);
            } else if (isBeginConnected && !isEndConnected) {
                system.e(begin5, beginTarget2, beginAnchor.e(), 8);
            }
        }
        if (!variableSize2) {
            if (wrapContent) {
                system.e(end2, begin5, 0, 3);
                if (minDimension > 0) {
                    i5 = 8;
                    system.h(end2, begin5, minDimension, 8);
                } else {
                    i5 = 8;
                }
                if (maxDimension < Integer.MAX_VALUE) {
                    system.j(end2, begin5, maxDimension, i5);
                }
            } else {
                system.e(end2, begin5, dimension2, 8);
            }
            matchMaxDimension3 = matchMinDimension;
            matchMaxDimension2 = matchMaxDimension;
            endTarget = endTarget2;
            numConnections2 = numConnections;
            variableSize3 = variableSize2;
            variableSize4 = isTerminal;
            beginTarget = beginTarget2;
            end = end2;
        } else if (numConnections == 2 || useRatio || !(matchConstraintDefault2 == 1 || matchConstraintDefault2 == 0)) {
            if (matchMinDimension == -2) {
                matchMinDimension2 = dimension2;
            } else {
                matchMinDimension2 = matchMinDimension;
            }
            if (matchMaxDimension == -2) {
                matchMaxDimension4 = dimension2;
            } else {
                matchMaxDimension4 = matchMaxDimension;
            }
            if (dimension2 > 0 && matchConstraintDefault2 != 1) {
                dimension2 = 0;
            }
            if (matchMinDimension2 > 0) {
                system.h(end2, begin5, matchMinDimension2, 8);
                dimension2 = Math.max(dimension2, matchMinDimension2);
            }
            if (matchMaxDimension4 > 0) {
                boolean applyLimit = true;
                if (parentWrapContent && matchConstraintDefault2 == 1) {
                    applyLimit = false;
                }
                if (applyLimit) {
                    system.j(end2, begin5, matchMaxDimension4, 8);
                }
                dimension2 = Math.min(dimension2, matchMaxDimension4);
            }
            if (matchConstraintDefault2 == 1) {
                if (parentWrapContent) {
                    system.e(end2, begin5, dimension2, 8);
                } else if (inChain) {
                    system.e(end2, begin5, dimension2, 5);
                    system.j(end2, begin5, dimension2, 8);
                } else {
                    system.e(end2, begin5, dimension2, 5);
                    system.j(end2, begin5, dimension2, 8);
                }
                matchMaxDimension2 = matchMaxDimension4;
                matchMaxDimension3 = matchMinDimension2;
                numConnections2 = numConnections;
                variableSize3 = variableSize2;
                variableSize4 = isTerminal;
                endTarget = endTarget2;
                beginTarget = beginTarget2;
                end = end2;
            } else if (matchConstraintDefault2 == 2) {
                if (beginAnchor.j() == d.a.TOP || beginAnchor.j() == d.a.BOTTOM) {
                    percentBegin = system.q(this.S.k(d.a.TOP));
                    percentEnd = system.q(this.S.k(d.a.BOTTOM));
                } else {
                    percentBegin = system.q(this.S.k(d.a.LEFT));
                    percentEnd = system.q(this.S.k(d.a.RIGHT));
                }
                b r2 = system.r();
                endTarget = endTarget2;
                numConnections2 = numConnections;
                beginTarget = beginTarget2;
                end = end2;
                r2.j(end2, begin5, percentEnd, percentBegin, matchPercentDimension);
                system.d(r2);
                variableSize3 = false;
                matchMaxDimension2 = matchMaxDimension4;
                variableSize4 = isTerminal;
                matchMaxDimension3 = matchMinDimension2;
            } else {
                numConnections2 = numConnections;
                endTarget = endTarget2;
                beginTarget = beginTarget2;
                end = end2;
                variableSize3 = variableSize2;
                matchMaxDimension2 = matchMaxDimension4;
                matchMaxDimension3 = matchMinDimension2;
                variableSize4 = true;
            }
        } else {
            int d2 = Math.max(matchMinDimension, dimension2);
            if (matchMaxDimension > 0) {
                d2 = Math.min(matchMaxDimension, d2);
            }
            system.e(end2, begin5, d2, 8);
            matchMaxDimension3 = matchMinDimension;
            matchMaxDimension2 = matchMaxDimension;
            endTarget = endTarget2;
            numConnections2 = numConnections;
            variableSize3 = false;
            variableSize4 = isTerminal;
            beginTarget = beginTarget2;
            end = end2;
        }
        if (!applyPosition) {
            hVar = parentMax;
            begin2 = begin5;
            numConnections3 = numConnections2;
            matchConstraintDefault3 = 8;
            begin = parentMin;
        } else if (inChain) {
            hVar = parentMax;
            begin2 = begin5;
            numConnections3 = numConnections2;
            matchConstraintDefault3 = 8;
            begin = parentMin;
        } else {
            int wrapStrength4 = 5;
            if (isBeginConnected || isEndConnected || isCenterConnected) {
                if (!isBeginConnected || isEndConnected) {
                    if (!isBeginConnected && isEndConnected) {
                        system.e(end, endTarget, -endAnchor.e(), 8);
                        if (parentWrapContent) {
                            if (!this.i || !begin5.f594g || (eVar2 = this.S) == null) {
                                system.h(begin5, parentMin, 0, 5);
                            } else {
                                f container = (f) eVar2;
                                if (isHorizontal) {
                                    container.h1(beginAnchor);
                                } else {
                                    container.m1(beginAnchor);
                                }
                            }
                        }
                    } else if (isBeginConnected && isEndConnected) {
                        boolean applyBoundsCheck = true;
                        boolean applyStrongChecks = false;
                        boolean applyRangeCheck2 = false;
                        int boundsCheckStrength2 = 4;
                        int centeringStrength = 6;
                        if (parentWrapContent) {
                            rangeCheckStrength = 5;
                        } else {
                            rangeCheckStrength = 5;
                        }
                        e beginWidget5 = beginAnchor.f613f.f611d;
                        e endWidget3 = endAnchor.f613f.f611d;
                        e parent2 = G();
                        if (!variableSize3) {
                            applyCentering = true;
                            if (!beginTarget.f594g || !endTarget.f594g) {
                                wrapStrength = 5;
                                hVar2 = parentMax;
                                beginWidget = beginWidget5;
                                endWidget = endWidget3;
                                matchConstraintDefault4 = matchConstraintDefault2;
                                begin3 = begin5;
                                parent = parent2;
                                i2 = numConnections2;
                                applyRangeCheck2 = true;
                            } else {
                                system.c(begin5, beginTarget, beginAnchor.e(), bias, endTarget, end, endAnchor.e(), 8);
                                if (parentWrapContent && variableSize4) {
                                    int margin = 0;
                                    if (endAnchor.f613f != null) {
                                        margin = endAnchor.e();
                                    }
                                    if (endTarget != parentMax) {
                                        system.h(parentMax, end, margin, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        } else if (matchConstraintDefault2 == 0) {
                            if (matchMaxDimension2 == 0 && matchMaxDimension3 == 0) {
                                applyStrongChecks = true;
                                if (!beginTarget.f594g || !endTarget.f594g) {
                                    applyCentering2 = false;
                                    rangeCheckStrength = 8;
                                    boundsCheckStrength2 = 8;
                                } else {
                                    system.e(begin5, beginTarget, beginAnchor.e(), 8);
                                    system.e(end, endTarget, -endAnchor.e(), 8);
                                    return;
                                }
                            } else {
                                applyCentering2 = true;
                                applyBoundsCheck = true;
                                applyRangeCheck2 = true;
                                rangeCheckStrength = 5;
                                boundsCheckStrength2 = 5;
                            }
                            if ((beginWidget5 instanceof a) || (endWidget3 instanceof a)) {
                                boundsCheckStrength2 = 4;
                                wrapStrength = 5;
                                applyCentering = applyCentering2;
                                beginWidget = beginWidget5;
                                endWidget = endWidget3;
                                begin3 = begin5;
                                matchConstraintDefault4 = matchConstraintDefault2;
                                parent = parent2;
                                i2 = numConnections2;
                                hVar2 = parentMax;
                            } else {
                                wrapStrength = 5;
                                applyCentering = applyCentering2;
                                beginWidget = beginWidget5;
                                endWidget = endWidget3;
                                begin3 = begin5;
                                matchConstraintDefault4 = matchConstraintDefault2;
                                parent = parent2;
                                i2 = numConnections2;
                                hVar2 = parentMax;
                            }
                        } else if (matchConstraintDefault2 == 1) {
                            applyRangeCheck2 = true;
                            rangeCheckStrength = 8;
                            wrapStrength = 5;
                            applyCentering = true;
                            beginWidget = beginWidget5;
                            endWidget = endWidget3;
                            begin3 = begin5;
                            matchConstraintDefault4 = matchConstraintDefault2;
                            parent = parent2;
                            i2 = numConnections2;
                            hVar2 = parentMax;
                        } else if (matchConstraintDefault2 != 3) {
                            wrapStrength = 5;
                            hVar2 = parentMax;
                            applyCentering = false;
                            beginWidget = beginWidget5;
                            endWidget = endWidget3;
                            matchConstraintDefault4 = matchConstraintDefault2;
                            begin3 = begin5;
                            parent = parent2;
                            i2 = numConnections2;
                        } else if (this.x == -1) {
                            applyRangeCheck2 = true;
                            applyStrongChecks = true;
                            rangeCheckStrength = 8;
                            boundsCheckStrength2 = 5;
                            if (oppositeInChain) {
                                boundsCheckStrength2 = 5;
                                centeringStrength = 4;
                                if (parentWrapContent) {
                                    centeringStrength = 5;
                                    wrapStrength = 5;
                                    applyCentering = true;
                                    beginWidget = beginWidget5;
                                    endWidget = endWidget3;
                                    begin3 = begin5;
                                    matchConstraintDefault4 = matchConstraintDefault2;
                                    parent = parent2;
                                    i2 = numConnections2;
                                    hVar2 = parentMax;
                                } else {
                                    wrapStrength = 5;
                                    applyCentering = true;
                                    beginWidget = beginWidget5;
                                    endWidget = endWidget3;
                                    begin3 = begin5;
                                    matchConstraintDefault4 = matchConstraintDefault2;
                                    parent = parent2;
                                    i2 = numConnections2;
                                    hVar2 = parentMax;
                                }
                            } else {
                                centeringStrength = 8;
                                wrapStrength = 5;
                                applyCentering = true;
                                beginWidget = beginWidget5;
                                endWidget = endWidget3;
                                begin3 = begin5;
                                matchConstraintDefault4 = matchConstraintDefault2;
                                parent = parent2;
                                i2 = numConnections2;
                                hVar2 = parentMax;
                            }
                        } else {
                            applyRangeCheck2 = true;
                            applyStrongChecks = true;
                            if (useRatio) {
                                if (!(oppositeMatchConstraintDefault == 2 || oppositeMatchConstraintDefault == 1)) {
                                    rangeCheckStrength = 8;
                                    boundsCheckStrength2 = 5;
                                }
                                wrapStrength = 5;
                                hVar2 = parentMax;
                                applyCentering = true;
                                beginWidget = beginWidget5;
                                endWidget = endWidget3;
                                matchConstraintDefault4 = matchConstraintDefault2;
                                begin3 = begin5;
                                parent = parent2;
                                i2 = numConnections2;
                            } else {
                                rangeCheckStrength = 5;
                                if (matchMaxDimension2 > 0) {
                                    boundsCheckStrength2 = 5;
                                    wrapStrength = 5;
                                    hVar2 = parentMax;
                                    applyCentering = true;
                                    beginWidget = beginWidget5;
                                    endWidget = endWidget3;
                                    matchConstraintDefault4 = matchConstraintDefault2;
                                    begin3 = begin5;
                                    parent = parent2;
                                    i2 = numConnections2;
                                } else if (matchMaxDimension2 != 0 || matchMaxDimension3 != 0) {
                                    wrapStrength = 5;
                                    hVar2 = parentMax;
                                    applyCentering = true;
                                    beginWidget = beginWidget5;
                                    endWidget = endWidget3;
                                    matchConstraintDefault4 = matchConstraintDefault2;
                                    begin3 = begin5;
                                    parent = parent2;
                                    i2 = numConnections2;
                                } else if (!oppositeInChain) {
                                    boundsCheckStrength2 = 8;
                                    wrapStrength = 5;
                                    hVar2 = parentMax;
                                    applyCentering = true;
                                    beginWidget = beginWidget5;
                                    endWidget = endWidget3;
                                    matchConstraintDefault4 = matchConstraintDefault2;
                                    begin3 = begin5;
                                    parent = parent2;
                                    i2 = numConnections2;
                                } else {
                                    if (beginWidget5 == parent2 || endWidget3 == parent2) {
                                        rangeCheckStrength = 5;
                                    } else {
                                        rangeCheckStrength = 4;
                                    }
                                    boundsCheckStrength2 = 4;
                                    wrapStrength = 5;
                                    hVar2 = parentMax;
                                    applyCentering = true;
                                    beginWidget = beginWidget5;
                                    endWidget = endWidget3;
                                    matchConstraintDefault4 = matchConstraintDefault2;
                                    begin3 = begin5;
                                    parent = parent2;
                                    i2 = numConnections2;
                                }
                            }
                        }
                        if (!applyRangeCheck2 || beginTarget != endTarget) {
                            beginWidget2 = beginWidget;
                        } else {
                            beginWidget2 = beginWidget;
                            if (beginWidget2 != parent) {
                                applyBoundsCheck = false;
                                applyRangeCheck = false;
                                if (!applyCentering) {
                                    if (!variableSize3 && !oppositeVariable && !oppositeInChain) {
                                        if (beginTarget == parentMin && endTarget == hVar2) {
                                            centeringStrength = 8;
                                            rangeCheckStrength = 8;
                                            applyBoundsCheck = false;
                                            parentWrapContent2 = false;
                                            wrapStrength2 = wrapStrength;
                                            wrapStrength3 = 8;
                                            beginWidget3 = beginWidget2;
                                            system.c(begin3, beginTarget, beginAnchor.e(), bias, endTarget, end, endAnchor.e(), centeringStrength);
                                        }
                                    }
                                    parentWrapContent2 = parentWrapContent;
                                    wrapStrength2 = wrapStrength;
                                    wrapStrength3 = 8;
                                    beginWidget3 = beginWidget2;
                                    system.c(begin3, beginTarget, beginAnchor.e(), bias, endTarget, end, endAnchor.e(), centeringStrength);
                                } else {
                                    beginWidget3 = beginWidget2;
                                    wrapStrength2 = wrapStrength;
                                    wrapStrength3 = 8;
                                    parentWrapContent2 = parentWrapContent;
                                }
                                if (this.f0 == wrapStrength3 || endAnchor.l()) {
                                    if (!applyRangeCheck) {
                                        if (!parentWrapContent2 || beginTarget == endTarget || variableSize3) {
                                            endWidget2 = endWidget;
                                            beginWidget4 = beginWidget3;
                                        } else {
                                            beginWidget4 = beginWidget3;
                                            if (!(beginWidget4 instanceof a)) {
                                                endWidget2 = endWidget;
                                            } else {
                                                endWidget2 = endWidget;
                                            }
                                            rangeCheckStrength3 = 6;
                                            begin4 = begin3;
                                            system.h(begin4, beginTarget, beginAnchor.e(), rangeCheckStrength3);
                                            system.j(end, endTarget, -endAnchor.e(), rangeCheckStrength3);
                                            rangeCheckStrength = rangeCheckStrength3;
                                        }
                                        rangeCheckStrength3 = rangeCheckStrength;
                                        begin4 = begin3;
                                        system.h(begin4, beginTarget, beginAnchor.e(), rangeCheckStrength3);
                                        system.j(end, endTarget, -endAnchor.e(), rangeCheckStrength3);
                                        rangeCheckStrength = rangeCheckStrength3;
                                    } else {
                                        begin4 = begin3;
                                        endWidget2 = endWidget;
                                        beginWidget4 = beginWidget3;
                                    }
                                    if (parentWrapContent2 || !inBarrier || (beginWidget4 instanceof a) || (endWidget2 instanceof a)) {
                                        boundsCheckStrength = boundsCheckStrength2;
                                        rangeCheckStrength2 = rangeCheckStrength;
                                    } else {
                                        applyBoundsCheck = true;
                                        boundsCheckStrength = 6;
                                        rangeCheckStrength2 = 6;
                                    }
                                    if (applyBoundsCheck) {
                                        if (applyStrongChecks && (!oppositeInChain || oppositeParentWrapContent)) {
                                            int strength = boundsCheckStrength;
                                            if (beginWidget4 == parent || endWidget2 == parent) {
                                                strength = 6;
                                            }
                                            if ((beginWidget4 instanceof g) || (endWidget2 instanceof g)) {
                                                strength = 5;
                                            }
                                            if ((beginWidget4 instanceof a) || (endWidget2 instanceof a)) {
                                                strength = 5;
                                            }
                                            if (oppositeInChain) {
                                                strength = 5;
                                            }
                                            boundsCheckStrength = Math.max(strength, boundsCheckStrength);
                                        }
                                        if (parentWrapContent2) {
                                            boundsCheckStrength = Math.min(rangeCheckStrength2, boundsCheckStrength);
                                            if (useRatio && !oppositeInChain && (beginWidget4 == parent || endWidget2 == parent)) {
                                                boundsCheckStrength = 4;
                                            }
                                        }
                                        system.e(begin4, beginTarget, beginAnchor.e(), boundsCheckStrength);
                                        system.e(end, endTarget, -endAnchor.e(), boundsCheckStrength);
                                    }
                                    if (!parentWrapContent2) {
                                        int margin2 = 0;
                                        i3 = 8;
                                        if (parentMin == beginTarget) {
                                            margin2 = beginAnchor.e();
                                        }
                                        if (beginTarget != parentMin) {
                                            wrapStrength4 = wrapStrength2;
                                            system.h(begin4, parentMin, margin2, wrapStrength4);
                                        } else {
                                            wrapStrength4 = wrapStrength2;
                                        }
                                    } else {
                                        wrapStrength4 = wrapStrength2;
                                        i3 = 8;
                                    }
                                    if (parentWrapContent2 || !variableSize3) {
                                        if (!parentWrapContent2 && variableSize4) {
                                            int margin3 = 0;
                                            if (endAnchor.f613f != null) {
                                                margin3 = endAnchor.e();
                                            }
                                            if (endTarget == parentMax) {
                                                return;
                                            }
                                            if (!this.i || !end.f594g || (eVar = this.S) == null) {
                                                system.h(parentMax, end, margin3, wrapStrength4);
                                                return;
                                            }
                                            f container2 = (f) eVar;
                                            if (isHorizontal) {
                                                container2.g1(endAnchor);
                                                return;
                                            } else {
                                                container2.l1(endAnchor);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else if (minDimension == 0 && matchMaxDimension3 == 0) {
                                        if (!variableSize3) {
                                            i4 = 0;
                                        } else if (matchConstraintDefault4 == 3) {
                                            system.h(end, begin4, 0, i3);
                                            if (!parentWrapContent2) {
                                            }
                                            return;
                                        } else {
                                            i4 = 0;
                                        }
                                        system.h(end, begin4, i4, wrapStrength4);
                                        if (!parentWrapContent2) {
                                        }
                                        return;
                                    } else {
                                        if (!parentWrapContent2) {
                                        }
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                        applyRangeCheck = applyRangeCheck2;
                        if (!applyCentering) {
                        }
                        if (this.f0 == wrapStrength3) {
                        }
                        if (!applyRangeCheck) {
                        }
                        if (parentWrapContent2) {
                        }
                        boundsCheckStrength = boundsCheckStrength2;
                        rangeCheckStrength2 = rangeCheckStrength;
                        if (applyBoundsCheck) {
                        }
                        if (!parentWrapContent2) {
                        }
                        if (parentWrapContent2) {
                        }
                        if (!parentWrapContent2) {
                        }
                        return;
                    }
                }
            }
            parentWrapContent2 = parentWrapContent;
            if (!parentWrapContent2) {
            }
            return;
        }
        if (numConnections3 < 2 && parentWrapContent && variableSize4) {
            system.h(begin2, begin, 0, matchConstraintDefault3);
            boolean applyEnd = isHorizontal || this.K.f613f == null;
            if (!isHorizontal && (dVar = this.K.f613f) != null) {
                e target = dVar.f611d;
                applyEnd = target.V != 0.0f && (aVarArr = target.R)[0] == (aVar = a.MATCH_CONSTRAINT) && aVarArr[1] == aVar;
            }
            if (applyEnd) {
                system.h(hVar, end, 0, 8);
            }
        }
    }

    public void X0(a.f.b.d system, boolean optimize) {
        n nVar;
        l lVar;
        int left = system.x(this.G);
        int top = system.x(this.H);
        int right = system.x(this.I);
        int bottom = system.x(this.J);
        if (optimize && (lVar = this.f624d) != null) {
            f fVar = lVar.h;
            if (fVar.j) {
                f fVar2 = lVar.i;
                if (fVar2.j) {
                    left = fVar.f657g;
                    right = fVar2.f657g;
                }
            }
        }
        if (optimize && (nVar = this.f625e) != null) {
            f fVar3 = nVar.h;
            if (fVar3.j) {
                f fVar4 = nVar.i;
                if (fVar4.j) {
                    top = fVar3.f657g;
                    bottom = fVar4.f657g;
                }
            }
        }
        int h2 = bottom - top;
        if (right - left < 0 || h2 < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        r0(left, top, right, bottom);
    }

    public void W0(boolean updateHorizontal, boolean updateVertical) {
        boolean updateHorizontal2 = updateHorizontal & this.f624d.k();
        boolean updateVertical2 = updateVertical & this.f625e.k();
        l lVar = this.f624d;
        int left = lVar.h.f657g;
        n nVar = this.f625e;
        int top = nVar.h.f657g;
        int right = lVar.i.f657g;
        int bottom = nVar.i.f657g;
        int h2 = bottom - top;
        if (right - left < 0 || h2 < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        int w2 = right - left;
        int h3 = bottom - top;
        if (updateHorizontal2) {
            this.X = left;
        }
        if (updateVertical2) {
            this.Y = top;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        if (updateHorizontal2) {
            if (this.R[0] == a.FIXED && w2 < this.T) {
                w2 = this.T;
            }
            this.T = w2;
            int i2 = this.a0;
            if (w2 < i2) {
                this.T = i2;
            }
        }
        if (updateVertical2) {
            if (this.R[1] == a.FIXED && h3 < this.U) {
                h3 = this.U;
            }
            this.U = h3;
            int i3 = this.b0;
            if (h3 < i3) {
                this.U = i3;
            }
        }
    }

    public void c(f container, a.f.b.d system, HashSet<e> hashSet, int orientation, boolean addSelf) {
        if (addSelf) {
            if (hashSet.contains(this)) {
                j.a(container, system, this);
                hashSet.remove(this);
                e(system, container.A1(64));
            } else {
                return;
            }
        }
        if (orientation == 0) {
            HashSet<ConstraintAnchor> dependents = this.G.c();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f611d.c(container, system, hashSet, orientation, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.I.c();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f611d.c(container, system, hashSet, orientation, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.H.c();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f611d.c(container, system, hashSet, orientation, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.J.c();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f611d.c(container, system, hashSet, orientation, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.K.c();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f611d.c(container, system, hashSet, orientation, true);
            }
        }
    }
}
