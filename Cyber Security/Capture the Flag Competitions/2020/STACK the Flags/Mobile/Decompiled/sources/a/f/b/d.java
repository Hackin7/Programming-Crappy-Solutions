package a.f.b;

import a.f.b.h;
import a.f.b.i.d;
import a.f.b.i.e;
import java.util.Arrays;
import java.util.HashMap;
import net.sqlcipher.database.SQLiteDatabase;

public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    public static int w = SQLiteDatabase.SLEEP_AFTER_YIELD_QUANTUM;
    public static long x = 0;
    public static long y = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f576a;

    /* renamed from: b  reason: collision with root package name */
    public int f577b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, h> f578c;

    /* renamed from: d  reason: collision with root package name */
    public a f579d;

    /* renamed from: e  reason: collision with root package name */
    public int f580e;

    /* renamed from: f  reason: collision with root package name */
    public int f581f;

    /* renamed from: g  reason: collision with root package name */
    public b[] f582g;
    public boolean h;
    public boolean i;
    public boolean[] j;
    public int k;
    public int l;
    public int m;
    public final c n;
    public h[] o;
    public int p;
    public a q;

    public interface a {
        void a(h hVar);

        h b(d dVar, boolean[] zArr);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.f576a = false;
        this.f577b = 0;
        this.f578c = null;
        this.f580e = 32;
        this.f581f = 32;
        this.f582g = null;
        this.h = false;
        this.i = false;
        this.j = new boolean[32];
        this.k = 1;
        this.l = 0;
        this.m = 32;
        this.o = new h[w];
        this.p = 0;
        this.f582g = new b[32];
        C();
        c cVar = new c();
        this.n = cVar;
        this.f579d = new g(cVar);
        this.q = new b(this.n);
    }

    public static void w() {
    }

    public final void y() {
        int i2 = this.f580e * 2;
        this.f580e = i2;
        this.f582g = (b[]) Arrays.copyOf(this.f582g, i2);
        c cVar = this.n;
        cVar.f575d = (h[]) Arrays.copyOf(cVar.f575d, this.f580e);
        int i3 = this.f580e;
        this.j = new boolean[i3];
        this.f581f = i3;
        this.m = i3;
    }

    public final void C() {
        for (int i2 = 0; i2 < this.l; i2++) {
            b row = this.f582g[i2];
            if (row != null) {
                ((f) this.n.f573b).b(row);
            }
            this.f582g[i2] = null;
        }
    }

    public void D() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.n;
            h[] hVarArr = cVar.f575d;
            if (i2 >= hVarArr.length) {
                break;
            }
            h variable = hVarArr[i2];
            if (variable != null) {
                variable.d();
            }
            i2++;
        }
        ((f) cVar.f574c).c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.f575d, (Object) null);
        HashMap<String, h> hashMap = this.f578c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f577b = 0;
        this.f579d.clear();
        this.k = 1;
        for (int i3 = 0; i3 < this.l; i3++) {
            b[] bVarArr = this.f582g;
            if (bVarArr[i3] != null) {
                bVarArr[i3].f568c = false;
            }
        }
        C();
        this.l = 0;
        this.q = new b(this.n);
    }

    public h q(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.k + 1 >= this.f581f) {
            y();
        }
        h variable = null;
        if (anchor instanceof a.f.b.i.d) {
            variable = ((a.f.b.i.d) anchor).h();
            if (variable == null) {
                ((a.f.b.i.d) anchor).r();
                variable = ((a.f.b.i.d) anchor).h();
            }
            int i2 = variable.f590c;
            if (i2 == -1 || i2 > this.f577b || this.n.f575d[i2] == null) {
                if (variable.f590c != -1) {
                    variable.d();
                }
                int i3 = this.f577b + 1;
                this.f577b = i3;
                this.k++;
                variable.f590c = i3;
                variable.j = h.a.UNRESTRICTED;
                this.n.f575d[i3] = variable;
            }
        }
        return variable;
    }

    public b r() {
        b row = (b) ((f) this.n.f573b).a();
        if (row == null) {
            row = new b(this.n);
            x++;
        } else {
            row.z();
        }
        h.b();
        return row;
    }

    public h t() {
        if (this.k + 1 >= this.f581f) {
            y();
        }
        h variable = a(h.a.SLACK, null);
        int i2 = this.f577b + 1;
        this.f577b = i2;
        this.k++;
        variable.f590c = i2;
        this.n.f575d[i2] = variable;
        return variable;
    }

    public h p() {
        if (this.k + 1 >= this.f581f) {
            y();
        }
        h variable = a(h.a.SLACK, null);
        int i2 = this.f577b + 1;
        this.f577b = i2;
        this.k++;
        variable.f590c = i2;
        this.n.f575d[i2] = variable;
        return variable;
    }

    public void m(b row, int sign, int strength) {
        row.d(o(strength, null), sign);
    }

    public h o(int strength, String prefix) {
        if (this.k + 1 >= this.f581f) {
            y();
        }
        h variable = a(h.a.ERROR, prefix);
        int i2 = this.f577b + 1;
        this.f577b = i2;
        this.k++;
        variable.f590c = i2;
        variable.f592e = strength;
        this.n.f575d[i2] = variable;
        this.f579d.a(variable);
        return variable;
    }

    public final h a(h.a type, String prefix) {
        h variable = (h) ((f) this.n.f574c).a();
        if (variable == null) {
            variable = new h(type);
            variable.f(type);
        } else {
            variable.d();
            variable.f(type);
        }
        int i2 = this.p;
        int i3 = w;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            w = i4;
            this.o = (h[]) Arrays.copyOf(this.o, i4);
        }
        h[] hVarArr = this.o;
        int i5 = this.p;
        this.p = i5 + 1;
        hVarArr[i5] = variable;
        return variable;
    }

    public int x(Object object) {
        h variable = ((a.f.b.i.d) object).h();
        if (variable != null) {
            return (int) (variable.f593f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f579d.isEmpty()) {
            n();
        } else if (this.h || this.i) {
            boolean fullySolved = true;
            int i2 = 0;
            while (true) {
                if (i2 >= this.l) {
                    break;
                } else if (!this.f582g[i2].f571f) {
                    fullySolved = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!fullySolved) {
                A(this.f579d);
            } else {
                n();
            }
        } else {
            A(this.f579d);
        }
    }

    public void A(a goal) {
        u();
        B(goal);
        n();
    }

    public void d(b row) {
        h pivotCandidate;
        if (row != null) {
            if (this.l + 1 >= this.m || this.k + 1 >= this.f581f) {
                y();
            }
            boolean added = false;
            if (!row.f571f) {
                row.E(this);
                if (!row.isEmpty()) {
                    row.q();
                    if (row.e(this)) {
                        h extra = p();
                        row.f566a = extra;
                        int numRows = this.l;
                        l(row);
                        if (this.l == numRows + 1) {
                            added = true;
                            ((b) this.q).u(row);
                            B(this.q);
                            if (extra.f591d == -1) {
                                if (row.f566a == extra && (pivotCandidate = row.w(extra)) != null) {
                                    row.y(pivotCandidate);
                                }
                                if (!row.f571f) {
                                    row.f566a.g(this, row);
                                }
                                ((f) this.n.f573b).b(row);
                                this.l--;
                            }
                        }
                    }
                    if (!row.s()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!added) {
                l(row);
            }
        }
    }

    public final void l(b row) {
        int i2;
        if (row.f571f) {
            row.f566a.e(this, row.f567b);
        } else {
            b[] bVarArr = this.f582g;
            int i3 = this.l;
            bVarArr[i3] = row;
            h hVar = row.f566a;
            hVar.f591d = i3;
            this.l = i3 + 1;
            hVar.g(this, row);
        }
        if (this.f576a) {
            int i4 = 0;
            while (i4 < this.l) {
                if (this.f582g[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f582g;
                if (bVarArr2[i4] != null && bVarArr2[i4].f571f) {
                    b removedRow = bVarArr2[i4];
                    removedRow.f566a.e(this, removedRow.f567b);
                    ((f) this.n.f573b).b(removedRow);
                    this.f582g[i4] = null;
                    int lastRow = i4 + 1;
                    int j2 = i4 + 1;
                    while (true) {
                        i2 = this.l;
                        if (j2 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.f582g;
                        bVarArr3[j2 - 1] = bVarArr3[j2];
                        if (bVarArr3[j2 - 1].f566a.f591d == j2) {
                            bVarArr3[j2 - 1].f566a.f591d = j2 - 1;
                        }
                        lastRow = j2;
                        j2++;
                    }
                    if (lastRow < i2) {
                        this.f582g[lastRow] = null;
                    }
                    this.l--;
                    i4--;
                }
                i4++;
            }
            this.f576a = false;
        }
    }

    public final int B(a goal) {
        boolean done = false;
        int tries = 0;
        for (int i2 = 0; i2 < this.k; i2++) {
            this.j[i2] = false;
        }
        while (!done) {
            tries++;
            if (tries >= this.k * 2) {
                return tries;
            }
            if (((b) goal).r() != null) {
                this.j[((b) goal).r().f590c] = true;
            }
            h pivotCandidate = goal.b(this, this.j);
            if (pivotCandidate != null) {
                boolean[] zArr = this.j;
                int i3 = pivotCandidate.f590c;
                if (zArr[i3]) {
                    return tries;
                }
                zArr[i3] = true;
            }
            if (pivotCandidate != null) {
                float min = Float.MAX_VALUE;
                int pivotRowIndex = -1;
                for (int i4 = 0; i4 < this.l; i4++) {
                    b current = this.f582g[i4];
                    if (current.f566a.j != h.a.UNRESTRICTED && !current.f571f && current.t(pivotCandidate)) {
                        float a_j = current.f570e.g(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-current.f567b) / a_j;
                            if (value < min) {
                                min = value;
                                pivotRowIndex = i4;
                            }
                        }
                    }
                }
                if (pivotRowIndex > -1) {
                    b pivotEquation = this.f582g[pivotRowIndex];
                    pivotEquation.f566a.f591d = -1;
                    pivotEquation.y(pivotCandidate);
                    h hVar = pivotEquation.f566a;
                    hVar.f591d = pivotRowIndex;
                    hVar.g(this, pivotEquation);
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    public final int u() {
        float f2;
        boolean infeasibleSystem;
        a goal;
        a goal2 = null;
        int tries = 0;
        boolean infeasibleSystem2 = false;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.l) {
                break;
            }
            b[] bVarArr = this.f582g;
            if (bVarArr[i2].f566a.j != h.a.UNRESTRICTED && bVarArr[i2].f567b < 0.0f) {
                infeasibleSystem2 = true;
                break;
            }
            i2++;
        }
        if (infeasibleSystem2) {
            boolean done = false;
            tries = 0;
            while (!done) {
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i3 = 0;
                while (i3 < this.l) {
                    b current = this.f582g[i3];
                    if (current.f566a.j != h.a.UNRESTRICTED && !current.f571f && current.f567b < f2) {
                        int size = current.f570e.k();
                        int j2 = 0;
                        while (j2 < size) {
                            h candidate = current.f570e.f(j2);
                            float a_j = current.f570e.g(candidate);
                            if (a_j > 0.0f) {
                                goal = goal2;
                                int k2 = 0;
                                while (true) {
                                    infeasibleSystem = infeasibleSystem2;
                                    if (k2 >= 9) {
                                        break;
                                    }
                                    float value = candidate.h[k2] / a_j;
                                    if ((value < min && k2 == strength) || k2 > strength) {
                                        min = value;
                                        pivotRowIndex = i3;
                                        pivotColumnIndex = candidate.f590c;
                                        strength = k2;
                                    }
                                    k2++;
                                    infeasibleSystem2 = infeasibleSystem;
                                }
                            } else {
                                goal = goal2;
                                infeasibleSystem = infeasibleSystem2;
                            }
                            j2++;
                            goal2 = goal;
                            infeasibleSystem2 = infeasibleSystem;
                        }
                    }
                    i3++;
                    goal2 = goal2;
                    infeasibleSystem2 = infeasibleSystem2;
                    f2 = 0.0f;
                }
                if (pivotRowIndex != -1) {
                    b pivotEquation = this.f582g[pivotRowIndex];
                    pivotEquation.f566a.f591d = -1;
                    pivotEquation.y(this.n.f575d[pivotColumnIndex]);
                    h hVar = pivotEquation.f566a;
                    hVar.f591d = pivotRowIndex;
                    hVar.g(this, pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.k / 2) {
                    done = true;
                }
                goal2 = goal2;
                infeasibleSystem2 = infeasibleSystem2;
                f2 = 0.0f;
            }
        }
        return tries;
    }

    public final void n() {
        for (int i2 = 0; i2 < this.l; i2++) {
            b row = this.f582g[i2];
            row.f566a.f593f = row.f567b;
        }
    }

    public c v() {
        return this.n;
    }

    public void h(h a2, h b2, int margin, int strength) {
        b row = r();
        h slack = t();
        slack.f592e = 0;
        row.n(a2, b2, slack, margin);
        if (strength != 8) {
            m(row, (int) (-1.0f * row.f570e.g(slack)), strength);
        }
        d(row);
    }

    public void g(h a2, h b2, int margin) {
        b row = r();
        h slack = t();
        slack.f592e = 0;
        row.n(a2, b2, slack, margin);
        d(row);
    }

    public void j(h a2, h b2, int margin, int strength) {
        b row = r();
        h slack = t();
        slack.f592e = 0;
        row.o(a2, b2, slack, margin);
        if (strength != 8) {
            m(row, (int) (-1.0f * row.f570e.g(slack)), strength);
        }
        d(row);
    }

    public void i(h a2, h b2, int margin) {
        b row = r();
        h slack = t();
        slack.f592e = 0;
        row.o(a2, b2, slack, margin);
        d(row);
    }

    public void c(h a2, h b2, int m1, float bias, h c2, h d2, int m2, int strength) {
        b row = r();
        row.g(a2, b2, m1, bias, c2, d2, m2);
        if (strength != 8) {
            row.c(this, strength);
        }
        d(row);
    }

    public void k(h a2, h b2, h c2, h d2, float ratio, int strength) {
        b row = r();
        row.j(a2, b2, c2, d2, ratio);
        if (strength != 8) {
            row.c(this, strength);
        }
        d(row);
    }

    public b e(h a2, h b2, int margin, int strength) {
        if (strength == 8 && b2.f594g && a2.f591d == -1) {
            a2.e(this, b2.f593f + ((float) margin));
            return null;
        }
        b row = r();
        row.m(a2, b2, margin);
        if (strength != 8) {
            row.c(this, strength);
        }
        d(row);
        return row;
    }

    public void f(h a2, int value) {
        int i2 = a2.f591d;
        if (i2 == -1) {
            a2.e(this, (float) value);
            for (int i3 = 0; i3 < this.f577b + 1; i3++) {
                h variable = this.n.f575d[i3];
                if (variable != null && variable.n && variable.o == a2.f590c) {
                    variable.e(this, ((float) value) + variable.p);
                }
            }
            return;
        }
        int idx = a2.f591d;
        if (i2 != -1) {
            b row = this.f582g[idx];
            if (row.f571f) {
                row.f567b = (float) value;
            } else if (row.f570e.k() == 0) {
                row.f571f = true;
                row.f567b = (float) value;
            } else {
                b newRow = r();
                newRow.l(a2, value);
                d(newRow);
            }
        } else {
            b row2 = r();
            row2.h(a2, value);
            d(row2);
        }
    }

    public static b s(d linearSystem, h variableA, h variableC, float percent) {
        b row = linearSystem.r();
        row.i(variableA, variableC, percent);
        return row;
    }

    public void b(e widget, e target, float angle, int radius) {
        h Al = q(widget.k(d.a.LEFT));
        h At = q(widget.k(d.a.TOP));
        h Ar = q(widget.k(d.a.RIGHT));
        h Ab = q(widget.k(d.a.BOTTOM));
        h Bl = q(target.k(d.a.LEFT));
        h Bt = q(target.k(d.a.TOP));
        h Br = q(target.k(d.a.RIGHT));
        h Bb = q(target.k(d.a.BOTTOM));
        b row = r();
        row.p(At, Ab, Bt, Bb, (float) (Math.sin((double) angle) * ((double) radius)));
        d(row);
        b row2 = r();
        row2.p(Al, Ar, Bl, Br, (float) (Math.cos((double) angle) * ((double) radius)));
        d(row2);
    }
}
