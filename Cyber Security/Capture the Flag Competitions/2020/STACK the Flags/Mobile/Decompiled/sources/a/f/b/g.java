package a.f.b;

import a.f.b.b;
import java.util.Arrays;
import java.util.Comparator;
import net.sqlcipher.BuildConfig;

public class g extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f585g = 128;
    public h[] h = new h[128];
    public h[] i = new h[128];
    public int j = 0;
    public b k = new b(this);

    public class b implements Comparable {

        /* renamed from: b  reason: collision with root package name */
        public h f586b;

        public b(g row) {
        }

        public void b(h variable) {
            this.f586b = variable;
        }

        public boolean a(h other, float value) {
            if (this.f586b.f588a) {
                boolean empty = true;
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f586b.i;
                    fArr[i] = fArr[i] + (other.i[i] * value);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f586b.i[i] = 0.0f;
                    } else {
                        empty = false;
                    }
                }
                if (!empty) {
                    return false;
                }
                g.this.H(this.f586b);
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float strength = other.i[i2];
                if (strength != 0.0f) {
                    float v = value * strength;
                    if (Math.abs(v) < 1.0E-4f) {
                        v = 0.0f;
                    }
                    this.f586b.i[i2] = v;
                } else {
                    this.f586b.i[i2] = 0.0f;
                }
            }
            return true;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float value = this.f586b.i[i];
                if (value > 0.0f) {
                    return false;
                }
                if (value < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(h other) {
            for (int i = 8; i >= 0; i--) {
                float comparedValue = other.i[i];
                float value = this.f586b.i[i];
                if (value != comparedValue) {
                    if (value < comparedValue) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object o) {
            return this.f586b.f590c - ((h) o).f590c;
        }

        public void e() {
            Arrays.fill(this.f586b.i, 0.0f);
        }

        public String toString() {
            String result = "[ ";
            if (this.f586b != null) {
                for (int i = 0; i < 9; i++) {
                    result = result + this.f586b.i[i] + " ";
                }
            }
            return result + "] " + this.f586b;
        }
    }

    @Override // a.f.b.d.a, a.f.b.b
    public void clear() {
        this.j = 0;
        this.f567b = 0.0f;
    }

    public g(c cache) {
        super(cache);
    }

    @Override // a.f.b.d.a, a.f.b.b
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // a.f.b.d.a, a.f.b.b
    public h b(d system, boolean[] avoid) {
        int pivot = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            h variable = this.h[i2];
            if (!avoid[variable.f590c]) {
                this.k.b(variable);
                if (pivot == -1) {
                    if (this.k.c()) {
                        pivot = i2;
                    }
                } else if (this.k.d(this.h[pivot])) {
                    pivot = i2;
                }
            }
        }
        if (pivot == -1) {
            return null;
        }
        return this.h[pivot];
    }

    @Override // a.f.b.d.a, a.f.b.b
    public void a(h error) {
        this.k.b(error);
        this.k.e();
        error.i[error.f592e] = 1.0f;
        G(error);
    }

    public final void G(h variable) {
        int i2;
        int i3 = this.j + 1;
        h[] hVarArr = this.h;
        if (i3 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.h = hVarArr2;
            this.i = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.h;
        int i4 = this.j;
        hVarArr3[i4] = variable;
        int i5 = i4 + 1;
        this.j = i5;
        if (i5 > 1 && hVarArr3[i5 - 1].f590c > variable.f590c) {
            int i6 = 0;
            while (true) {
                i2 = this.j;
                if (i6 >= i2) {
                    break;
                }
                this.i[i6] = this.h[i6];
                i6++;
            }
            Arrays.sort(this.i, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.j; i7++) {
                this.h[i7] = this.i[i7];
            }
        }
        variable.f588a = true;
        variable.a(this);
    }

    public class a implements Comparator<h> {
        public a(g this$0) {
        }

        /* renamed from: a */
        public int compare(h variable1, h variable2) {
            return variable1.f590c - variable2.f590c;
        }
    }

    public final void H(h variable) {
        for (int i2 = 0; i2 < this.j; i2++) {
            if (this.h[i2] == variable) {
                int j2 = i2;
                while (true) {
                    int i3 = this.j;
                    if (j2 < i3 - 1) {
                        h[] hVarArr = this.h;
                        hVarArr[j2] = hVarArr[j2 + 1];
                        j2++;
                    } else {
                        this.j = i3 - 1;
                        variable.f588a = false;
                        return;
                    }
                }
            }
        }
    }

    @Override // a.f.b.b
    public void C(d system, b definition, boolean removeFromDefinition) {
        h goalVariable = definition.f566a;
        if (goalVariable != null) {
            b.a rowVariables = definition.f570e;
            int currentSize = rowVariables.k();
            for (int i2 = 0; i2 < currentSize; i2++) {
                h solverVariable = rowVariables.f(i2);
                float value = rowVariables.a(i2);
                this.k.b(solverVariable);
                if (this.k.a(goalVariable, value)) {
                    G(solverVariable);
                }
                this.f567b += definition.f567b * value;
            }
            H(goalVariable);
        }
    }

    @Override // a.f.b.b
    public String toString() {
        String result = BuildConfig.FLAVOR + " goal -> (" + this.f567b + ") : ";
        for (int i2 = 0; i2 < this.j; i2++) {
            this.k.b(this.h[i2]);
            result = result + this.k + " ";
        }
        return result;
    }
}
