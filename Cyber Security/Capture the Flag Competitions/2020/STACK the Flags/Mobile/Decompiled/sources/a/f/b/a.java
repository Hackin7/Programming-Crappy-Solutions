package a.f.b;

import a.f.b.b;
import java.util.Arrays;
import net.sqlcipher.BuildConfig;

public class a implements b.a {
    public static float l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    public int f559a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f560b;

    /* renamed from: c  reason: collision with root package name */
    public final c f561c;

    /* renamed from: d  reason: collision with root package name */
    public int f562d = 8;

    /* renamed from: e  reason: collision with root package name */
    public h f563e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f564f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f565g = new int[8];
    public float[] h = new float[8];
    public int i = -1;
    public int j = -1;
    public boolean k = false;

    public a(b arrayRow, c cache) {
        this.f560b = arrayRow;
        this.f561c = cache;
    }

    @Override // a.f.b.b.a
    public final void c(h variable, float value) {
        if (value == 0.0f) {
            d(variable, true);
        } else if (this.i == -1) {
            this.i = 0;
            this.h[0] = value;
            this.f564f[0] = variable.f590c;
            this.f565g[0] = -1;
            variable.m++;
            variable.a(this.f560b);
            this.f559a++;
            if (!this.k) {
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f564f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                }
            }
        } else {
            int current = this.i;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f559a) {
                int[] iArr2 = this.f564f;
                int i3 = iArr2[current];
                int i4 = variable.f590c;
                if (i3 == i4) {
                    this.h[current] = value;
                    return;
                }
                if (iArr2[current] < i4) {
                    previous = current;
                }
                current = this.f565g[current];
                counter++;
            }
            int i5 = this.j;
            int availableIndice = i5 + 1;
            if (this.k) {
                int[] iArr3 = this.f564f;
                if (iArr3[i5] == -1) {
                    availableIndice = this.j;
                } else {
                    availableIndice = iArr3.length;
                }
            }
            int[] iArr4 = this.f564f;
            if (availableIndice >= iArr4.length && this.f559a < iArr4.length) {
                int i6 = 0;
                while (true) {
                    int[] iArr5 = this.f564f;
                    if (i6 >= iArr5.length) {
                        break;
                    } else if (iArr5[i6] == -1) {
                        availableIndice = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            int[] iArr6 = this.f564f;
            if (availableIndice >= iArr6.length) {
                availableIndice = iArr6.length;
                int i7 = this.f562d * 2;
                this.f562d = i7;
                this.k = false;
                this.j = availableIndice - 1;
                this.h = Arrays.copyOf(this.h, i7);
                this.f564f = Arrays.copyOf(this.f564f, this.f562d);
                this.f565g = Arrays.copyOf(this.f565g, this.f562d);
            }
            this.f564f[availableIndice] = variable.f590c;
            this.h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr7 = this.f565g;
                iArr7[availableIndice] = iArr7[previous];
                iArr7[previous] = availableIndice;
            } else {
                this.f565g[availableIndice] = this.i;
                this.i = availableIndice;
            }
            variable.m++;
            variable.a(this.f560b);
            this.f559a++;
            if (!this.k) {
                this.j++;
            }
            if (this.f559a >= this.f564f.length) {
                this.k = true;
            }
            int i8 = this.j;
            int[] iArr8 = this.f564f;
            if (i8 >= iArr8.length) {
                this.k = true;
                this.j = iArr8.length - 1;
            }
        }
    }

    @Override // a.f.b.b.a
    public void e(h variable, float value, boolean removeFromDefinition) {
        if (value > -0.001f && value < 0.001f) {
            return;
        }
        if (this.i == -1) {
            this.i = 0;
            this.h[0] = value;
            this.f564f[0] = variable.f590c;
            this.f565g[0] = -1;
            variable.m++;
            variable.a(this.f560b);
            this.f559a++;
            if (!this.k) {
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f564f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int current = this.i;
        int previous = -1;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            int[] iArr2 = this.f564f;
            int idx = iArr2[current];
            int i3 = variable.f590c;
            if (idx == i3) {
                float v = this.h[current] + value;
                if (v > -0.001f && v < 0.001f) {
                    v = 0.0f;
                }
                this.h[current] = v;
                if (v == 0.0f) {
                    if (current == this.i) {
                        this.i = this.f565g[current];
                    } else {
                        int[] iArr3 = this.f565g;
                        iArr3[previous] = iArr3[current];
                    }
                    if (removeFromDefinition) {
                        variable.c(this.f560b);
                    }
                    if (this.k) {
                        this.j = current;
                    }
                    variable.m--;
                    this.f559a--;
                    return;
                }
                return;
            }
            if (iArr2[current] < i3) {
                previous = current;
            }
            current = this.f565g[current];
            counter++;
        }
        int i4 = this.j;
        int availableIndice = i4 + 1;
        if (this.k) {
            int[] iArr4 = this.f564f;
            if (iArr4[i4] == -1) {
                availableIndice = this.j;
            } else {
                availableIndice = iArr4.length;
            }
        }
        int[] iArr5 = this.f564f;
        if (availableIndice >= iArr5.length && this.f559a < iArr5.length) {
            int i5 = 0;
            while (true) {
                int[] iArr6 = this.f564f;
                if (i5 >= iArr6.length) {
                    break;
                } else if (iArr6[i5] == -1) {
                    availableIndice = i5;
                    break;
                } else {
                    i5++;
                }
            }
        }
        int[] iArr7 = this.f564f;
        if (availableIndice >= iArr7.length) {
            availableIndice = iArr7.length;
            int i6 = this.f562d * 2;
            this.f562d = i6;
            this.k = false;
            this.j = availableIndice - 1;
            this.h = Arrays.copyOf(this.h, i6);
            this.f564f = Arrays.copyOf(this.f564f, this.f562d);
            this.f565g = Arrays.copyOf(this.f565g, this.f562d);
        }
        this.f564f[availableIndice] = variable.f590c;
        this.h[availableIndice] = value;
        if (previous != -1) {
            int[] iArr8 = this.f565g;
            iArr8[availableIndice] = iArr8[previous];
            iArr8[previous] = availableIndice;
        } else {
            this.f565g[availableIndice] = this.i;
            this.i = availableIndice;
        }
        variable.m++;
        variable.a(this.f560b);
        this.f559a++;
        if (!this.k) {
            this.j++;
        }
        int i7 = this.j;
        int[] iArr9 = this.f564f;
        if (i7 >= iArr9.length) {
            this.k = true;
            this.j = iArr9.length - 1;
        }
    }

    @Override // a.f.b.b.a
    public float b(b definition, boolean removeFromDefinition) {
        float value = g(definition.f566a);
        d(definition.f566a, removeFromDefinition);
        b.a definitionVariables = definition.f570e;
        int definitionSize = definitionVariables.k();
        for (int i2 = 0; i2 < definitionSize; i2++) {
            h definitionVariable = definitionVariables.f(i2);
            e(definitionVariable, definitionVariables.g(definitionVariable) * value, removeFromDefinition);
        }
        return value;
    }

    @Override // a.f.b.b.a
    public final float d(h variable, boolean removeFromDefinition) {
        if (this.f563e == variable) {
            this.f563e = null;
        }
        if (this.i == -1) {
            return 0.0f;
        }
        int current = this.i;
        int previous = -1;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            if (this.f564f[current] == variable.f590c) {
                if (current == this.i) {
                    this.i = this.f565g[current];
                } else {
                    int[] iArr = this.f565g;
                    iArr[previous] = iArr[current];
                }
                if (removeFromDefinition) {
                    variable.c(this.f560b);
                }
                variable.m--;
                this.f559a--;
                this.f564f[current] = -1;
                if (this.k) {
                    this.j = current;
                }
                return this.h[current];
            }
            previous = current;
            current = this.f565g[current];
            counter++;
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public final void clear() {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            h variable = this.f561c.f575d[this.f564f[current]];
            if (variable != null) {
                variable.c(this.f560b);
            }
            current = this.f565g[current];
            counter++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f559a = 0;
    }

    @Override // a.f.b.b.a
    public boolean h(h variable) {
        if (this.i == -1) {
            return false;
        }
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            if (this.f564f[current] == variable.f590c) {
                return true;
            }
            current = this.f565g[current];
            counter++;
        }
        return false;
    }

    @Override // a.f.b.b.a
    public void j() {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            float[] fArr = this.h;
            fArr[current] = fArr[current] * -1.0f;
            current = this.f565g[current];
            counter++;
        }
    }

    @Override // a.f.b.b.a
    public void i(float amount) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            float[] fArr = this.h;
            fArr[current] = fArr[current] / amount;
            current = this.f565g[current];
            counter++;
        }
    }

    @Override // a.f.b.b.a
    public int k() {
        return this.f559a;
    }

    @Override // a.f.b.b.a
    public h f(int index) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            if (counter == index) {
                return this.f561c.f575d[this.f564f[current]];
            }
            current = this.f565g[current];
            counter++;
        }
        return null;
    }

    @Override // a.f.b.b.a
    public float a(int index) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            if (counter == index) {
                return this.h[current];
            }
            current = this.f565g[current];
            counter++;
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public final float g(h v) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            if (this.f564f[current] == v.f590c) {
                return this.h[current];
            }
            current = this.f565g[current];
            counter++;
        }
        return 0.0f;
    }

    public String toString() {
        String result = BuildConfig.FLAVOR;
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f559a) {
            result = ((result + " -> ") + this.h[current] + " : ") + this.f561c.f575d[this.f564f[current]];
            current = this.f565g[current];
            counter++;
        }
        return result;
    }
}
