package a.f.b;

import a.f.b.d;
import a.f.b.h;
import java.util.ArrayList;
import net.sqlcipher.BuildConfig;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public h f566a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f567b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f568c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<h> f569d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public a f570e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f571f = false;

    public interface a {
        float a(int i);

        float b(b bVar, boolean z);

        void c(h hVar, float f2);

        void clear();

        float d(h hVar, boolean z);

        void e(h hVar, float f2, boolean z);

        h f(int i);

        float g(h hVar);

        boolean h(h hVar);

        void i(float f2);

        void j();

        int k();
    }

    public b() {
    }

    public b(c cache) {
        this.f570e = new a(this, cache);
    }

    public boolean s() {
        h hVar = this.f566a;
        return hVar != null && (hVar.j == h.a.UNRESTRICTED || this.f567b >= 0.0f);
    }

    public String toString() {
        return A();
    }

    public String A() {
        String s = (this.f566a == null ? BuildConfig.FLAVOR + "0" : BuildConfig.FLAVOR + this.f566a) + " = ";
        boolean addedVariable = false;
        if (this.f567b != 0.0f) {
            s = s + this.f567b;
            addedVariable = true;
        }
        int count = this.f570e.k();
        for (int i = 0; i < count; i++) {
            h v = this.f570e.f(i);
            if (v != null) {
                float amount = this.f570e.a(i);
                if (amount != 0.0f) {
                    String name = v.toString();
                    if (!addedVariable) {
                        if (amount < 0.0f) {
                            s = s + "- ";
                            amount *= -1.0f;
                        }
                    } else if (amount > 0.0f) {
                        s = s + " + ";
                    } else {
                        s = s + " - ";
                        amount *= -1.0f;
                    }
                    s = amount == 1.0f ? s + name : s + amount + " " + name;
                    addedVariable = true;
                }
            }
        }
        if (addedVariable) {
            return s;
        }
        return s + "0.0";
    }

    public void z() {
        this.f566a = null;
        this.f570e.clear();
        this.f567b = 0.0f;
        this.f571f = false;
    }

    public boolean t(h v) {
        return this.f570e.h(v);
    }

    public b h(h variable, int value) {
        this.f566a = variable;
        variable.f593f = (float) value;
        this.f567b = (float) value;
        this.f571f = true;
        return this;
    }

    public b l(h variable, int value) {
        if (value < 0) {
            this.f567b = (float) (value * -1);
            this.f570e.c(variable, 1.0f);
        } else {
            this.f567b = (float) value;
            this.f570e.c(variable, -1.0f);
        }
        return this;
    }

    public b m(h variableA, h variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f567b = (float) m;
        }
        if (!inverse) {
            this.f570e.c(variableA, -1.0f);
            this.f570e.c(variableB, 1.0f);
        } else {
            this.f570e.c(variableA, 1.0f);
            this.f570e.c(variableB, -1.0f);
        }
        return this;
    }

    public b d(h error, int sign) {
        this.f570e.c(error, (float) sign);
        return this;
    }

    public b n(h variableA, h variableB, h slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f567b = (float) m;
        }
        if (!inverse) {
            this.f570e.c(variableA, -1.0f);
            this.f570e.c(variableB, 1.0f);
            this.f570e.c(slack, 1.0f);
        } else {
            this.f570e.c(variableA, 1.0f);
            this.f570e.c(variableB, -1.0f);
            this.f570e.c(slack, -1.0f);
        }
        return this;
    }

    public b o(h variableA, h variableB, h slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f567b = (float) m;
        }
        if (!inverse) {
            this.f570e.c(variableA, -1.0f);
            this.f570e.c(variableB, 1.0f);
            this.f570e.c(slack, -1.0f);
        } else {
            this.f570e.c(variableA, 1.0f);
            this.f570e.c(variableB, -1.0f);
            this.f570e.c(slack, 1.0f);
        }
        return this;
    }

    public b k(float currentWeight, float totalWeights, float nextWeight, h variableStartA, h variableEndA, h variableStartB, h variableEndB) {
        this.f567b = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.f570e.c(variableStartA, 1.0f);
            this.f570e.c(variableEndA, -1.0f);
            this.f570e.c(variableEndB, 1.0f);
            this.f570e.c(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.f570e.c(variableStartA, 1.0f);
            this.f570e.c(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.f570e.c(variableStartB, 1.0f);
            this.f570e.c(variableEndB, -1.0f);
        } else {
            float w = (currentWeight / totalWeights) / (nextWeight / totalWeights);
            this.f570e.c(variableStartA, 1.0f);
            this.f570e.c(variableEndA, -1.0f);
            this.f570e.c(variableEndB, w);
            this.f570e.c(variableStartB, -w);
        }
        return this;
    }

    public b g(h variableA, h variableB, int marginA, float bias, h variableC, h variableD, int marginB) {
        if (variableB == variableC) {
            this.f570e.c(variableA, 1.0f);
            this.f570e.c(variableD, 1.0f);
            this.f570e.c(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.f570e.c(variableA, 1.0f);
            this.f570e.c(variableB, -1.0f);
            this.f570e.c(variableC, -1.0f);
            this.f570e.c(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f567b = (float) ((-marginA) + marginB);
            }
        } else if (bias <= 0.0f) {
            this.f570e.c(variableA, -1.0f);
            this.f570e.c(variableB, 1.0f);
            this.f567b = (float) marginA;
        } else if (bias >= 1.0f) {
            this.f570e.c(variableD, -1.0f);
            this.f570e.c(variableC, 1.0f);
            this.f567b = (float) (-marginB);
        } else {
            this.f570e.c(variableA, (1.0f - bias) * 1.0f);
            this.f570e.c(variableB, (1.0f - bias) * -1.0f);
            this.f570e.c(variableC, -1.0f * bias);
            this.f570e.c(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f567b = (((float) (-marginA)) * (1.0f - bias)) + (((float) marginB) * bias);
            }
        }
        return this;
    }

    public b c(d system, int strength) {
        this.f570e.c(system.o(strength, "ep"), 1.0f);
        this.f570e.c(system.o(strength, "em"), -1.0f);
        return this;
    }

    public b i(h variableA, h variableC, float percent) {
        this.f570e.c(variableA, -1.0f);
        this.f570e.c(variableC, percent);
        return this;
    }

    public b j(h variableA, h variableB, h variableC, h variableD, float ratio) {
        this.f570e.c(variableA, -1.0f);
        this.f570e.c(variableB, 1.0f);
        this.f570e.c(variableC, ratio);
        this.f570e.c(variableD, -ratio);
        return this;
    }

    public b p(h at, h ab, h bt, h bb, float angleComponent) {
        this.f570e.c(bt, 0.5f);
        this.f570e.c(bb, 0.5f);
        this.f570e.c(at, -0.5f);
        this.f570e.c(ab, -0.5f);
        this.f567b = -angleComponent;
        return this;
    }

    public void q() {
        float f2 = this.f567b;
        if (f2 < 0.0f) {
            this.f567b = f2 * -1.0f;
            this.f570e.j();
        }
    }

    public boolean e(d system) {
        boolean addedExtra = false;
        h pivotCandidate = f(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            y(pivotCandidate);
        }
        if (this.f570e.k() == 0) {
            this.f571f = true;
        }
        return addedExtra;
    }

    public h f(d system) {
        h restrictedCandidate = null;
        h unrestrictedCandidate = null;
        float unrestrictedCandidateAmount = 0.0f;
        float restrictedCandidateAmount = 0.0f;
        boolean unrestrictedCandidateIsNew = false;
        boolean restrictedCandidateIsNew = false;
        int currentSize = this.f570e.k();
        for (int i = 0; i < currentSize; i++) {
            float amount = this.f570e.a(i);
            h variable = this.f570e.f(i);
            if (variable.j == h.a.UNRESTRICTED) {
                if (unrestrictedCandidate == null) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = v(variable);
                } else if (unrestrictedCandidateAmount > amount) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = v(variable);
                } else if (!unrestrictedCandidateIsNew && v(variable)) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = true;
                }
            } else if (unrestrictedCandidate == null && amount < 0.0f) {
                if (restrictedCandidate == null) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = v(variable);
                } else if (restrictedCandidateAmount > amount) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = v(variable);
                } else if (!restrictedCandidateIsNew && v(variable)) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = true;
                }
            }
        }
        if (unrestrictedCandidate != null) {
            return unrestrictedCandidate;
        }
        return restrictedCandidate;
    }

    public final boolean v(h variable) {
        return variable.m <= 1;
    }

    public void y(h v) {
        h hVar = this.f566a;
        if (hVar != null) {
            this.f570e.c(hVar, -1.0f);
            this.f566a.f591d = -1;
            this.f566a = null;
        }
        float amount = this.f570e.d(v, true) * -1.0f;
        this.f566a = v;
        if (amount != 1.0f) {
            this.f567b /= amount;
            this.f570e.i(amount);
        }
    }

    @Override // a.f.b.d.a
    public boolean isEmpty() {
        return this.f566a == null && this.f567b == 0.0f && this.f570e.k() == 0;
    }

    public void C(d system, b definition, boolean removeFromDefinition) {
        this.f567b += definition.f567b * this.f570e.b(definition, removeFromDefinition);
        if (removeFromDefinition) {
            definition.f566a.c(this);
        }
        if (this.f566a != null && this.f570e.k() == 0) {
            this.f571f = true;
            system.f576a = true;
        }
    }

    public void B(d system, h variable, boolean removeFromDefinition) {
        if (variable.f594g) {
            this.f567b += variable.f593f * this.f570e.g(variable);
            this.f570e.d(variable, removeFromDefinition);
            if (removeFromDefinition) {
                variable.c(this);
            }
            if (this.f570e.k() == 0) {
                this.f571f = true;
                system.f576a = true;
            }
        }
    }

    public void D(d system, h variable, boolean removeFromDefinition) {
        if (variable.n) {
            float value = this.f570e.g(variable);
            this.f567b += variable.p * value;
            this.f570e.d(variable, removeFromDefinition);
            if (removeFromDefinition) {
                variable.c(this);
            }
            this.f570e.e(system.n.f575d[variable.o], value, removeFromDefinition);
            if (this.f570e.k() == 0) {
                this.f571f = true;
                system.f576a = true;
            }
        }
    }

    public final h x(boolean[] avoid, h exclude) {
        float value = 0.0f;
        h pivot = null;
        h pivotSlack = null;
        float valueSlack = 0.0f;
        int currentSize = this.f570e.k();
        for (int i = 0; i < currentSize; i++) {
            float currentValue = this.f570e.a(i);
            if (currentValue < 0.0f) {
                h v = this.f570e.f(i);
                if ((avoid == null || !avoid[v.f590c]) && v != exclude) {
                    if (1 != 0) {
                        h.a aVar = v.j;
                        if ((aVar == h.a.SLACK || aVar == h.a.ERROR) && currentValue < value) {
                            value = currentValue;
                            pivot = v;
                        }
                    } else {
                        h.a aVar2 = v.j;
                        if (aVar2 == h.a.SLACK) {
                            if (currentValue < valueSlack) {
                                valueSlack = currentValue;
                                pivotSlack = v;
                            }
                        } else if (aVar2 == h.a.ERROR && currentValue < value) {
                            value = currentValue;
                            pivot = v;
                        }
                    }
                }
            }
        }
        if (1 != 0) {
            return pivot;
        }
        return pivot != null ? pivot : pivotSlack;
    }

    public h w(h exclude) {
        return x(null, exclude);
    }

    @Override // a.f.b.d.a
    public h b(d system, boolean[] avoid) {
        return x(avoid, null);
    }

    @Override // a.f.b.d.a
    public void clear() {
        this.f570e.clear();
        this.f566a = null;
        this.f567b = 0.0f;
    }

    public void u(d.a row) {
        if (row instanceof b) {
            b copiedRow = (b) row;
            this.f566a = null;
            this.f570e.clear();
            for (int i = 0; i < copiedRow.f570e.k(); i++) {
                this.f570e.e(copiedRow.f570e.f(i), copiedRow.f570e.a(i), true);
            }
        }
    }

    @Override // a.f.b.d.a
    public void a(h error) {
        float weight = 1.0f;
        int i = error.f592e;
        if (i == 1) {
            weight = 1.0f;
        } else if (i == 2) {
            weight = 1000.0f;
        } else if (i == 3) {
            weight = 1000000.0f;
        } else if (i == 4) {
            weight = 1.0E9f;
        } else if (i == 5) {
            weight = 1.0E12f;
        }
        this.f570e.c(error, weight);
    }

    public h r() {
        return this.f566a;
    }

    public void E(d system) {
        if (system.f582g.length != 0) {
            boolean done = false;
            while (!done) {
                int currentSize = this.f570e.k();
                for (int i = 0; i < currentSize; i++) {
                    h variable = this.f570e.f(i);
                    if (variable.f591d != -1 || variable.f594g || variable.n) {
                        this.f569d.add(variable);
                    }
                }
                int size = this.f569d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        h variable2 = this.f569d.get(i2);
                        if (variable2.f594g) {
                            B(system, variable2, true);
                        } else if (variable2.n) {
                            D(system, variable2, true);
                        } else {
                            C(system, system.f582g[variable2.f591d], true);
                        }
                    }
                    this.f569d.clear();
                } else {
                    done = true;
                }
            }
            if (this.f566a != null && this.f570e.k() == 0) {
                this.f571f = true;
                system.f576a = true;
            }
        }
    }
}
