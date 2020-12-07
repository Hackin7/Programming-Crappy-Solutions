package a.f.b;

import java.util.Arrays;
import net.sqlcipher.BuildConfig;

public class h {
    public static int q = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f588a;

    /* renamed from: b  reason: collision with root package name */
    public String f589b;

    /* renamed from: c  reason: collision with root package name */
    public int f590c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f591d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f592e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f593f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f594g = false;
    public float[] h = new float[9];
    public float[] i = new float[9];
    public a j;
    public b[] k = new b[16];
    public int l = 0;
    public int m = 0;
    public boolean n = false;
    public int o = -1;
    public float p = 0.0f;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public static void b() {
        q++;
    }

    public h(a type) {
        this.j = type;
    }

    public final void a(b row) {
        int i2 = 0;
        while (true) {
            int i3 = this.l;
            if (i2 >= i3) {
                b[] bVarArr = this.k;
                if (i3 >= bVarArr.length) {
                    this.k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.k;
                int i4 = this.l;
                bVarArr2[i4] = row;
                this.l = i4 + 1;
                return;
            } else if (this.k[i2] != row) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void c(b row) {
        int count = this.l;
        for (int i2 = 0; i2 < count; i2++) {
            if (this.k[i2] == row) {
                for (int j2 = i2; j2 < count - 1; j2++) {
                    b[] bVarArr = this.k;
                    bVarArr[j2] = bVarArr[j2 + 1];
                }
                this.l--;
                return;
            }
        }
    }

    public final void g(d system, b definition) {
        int count = this.l;
        for (int i2 = 0; i2 < count; i2++) {
            this.k[i2].C(system, definition, false);
        }
        this.l = 0;
    }

    public void e(d system, float value) {
        this.f593f = value;
        this.f594g = true;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int count = this.l;
        this.f591d = -1;
        for (int i2 = 0; i2 < count; i2++) {
            this.k[i2].B(system, this, false);
        }
        this.l = 0;
    }

    public void d() {
        this.f589b = null;
        this.j = a.UNKNOWN;
        this.f592e = 0;
        this.f590c = -1;
        this.f591d = -1;
        this.f593f = 0.0f;
        this.f594g = false;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int count = this.l;
        for (int i2 = 0; i2 < count; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.f588a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void f(a type) {
        this.j = type;
    }

    public String toString() {
        if (this.f589b != null) {
            return BuildConfig.FLAVOR + this.f589b;
        }
        return BuildConfig.FLAVOR + this.f590c;
    }
}
