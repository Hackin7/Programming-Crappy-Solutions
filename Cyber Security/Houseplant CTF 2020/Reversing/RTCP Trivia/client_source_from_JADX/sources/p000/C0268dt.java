package p000;

import java.util.Arrays;

/* renamed from: dt */
public final class C0268dt {

    /* renamed from: j */
    private static int f1285j = 1;

    /* renamed from: k */
    private static int f1286k = 1;

    /* renamed from: l */
    private static int f1287l = 1;

    /* renamed from: m */
    private static int f1288m = 1;

    /* renamed from: n */
    private static int f1289n = 1;

    /* renamed from: a */
    public int f1290a = -1;

    /* renamed from: b */
    int f1291b = -1;

    /* renamed from: c */
    public int f1292c = 0;

    /* renamed from: d */
    public float f1293d;

    /* renamed from: e */
    float[] f1294e = new float[7];

    /* renamed from: f */
    int f1295f;

    /* renamed from: g */
    C0259dn[] f1296g = new C0259dn[8];

    /* renamed from: h */
    int f1297h = 0;

    /* renamed from: i */
    public int f1298i = 0;

    /* renamed from: o */
    private String f1299o;

    /* renamed from: dt$a */
    public enum C0269a {
        ;
        

        /* renamed from: a */
        public static final int f1300a = 1;

        /* renamed from: b */
        public static final int f1301b = 2;

        /* renamed from: c */
        public static final int f1302c = 3;

        /* renamed from: d */
        public static final int f1303d = 4;

        /* renamed from: e */
        public static final int f1304e = 5;

        static {
            f1305f = new int[]{f1300a, f1301b, f1302c, f1303d, f1304e};
        }
    }

    public C0268dt(int i) {
        this.f1295f = i;
    }

    /* renamed from: a */
    static void m903a() {
        f1286k++;
    }

    /* renamed from: a */
    public final void mo1538a(C0259dn dnVar) {
        int i = 0;
        while (i < this.f1297h) {
            if (this.f1296g[i] != dnVar) {
                i++;
            } else {
                return;
            }
        }
        if (this.f1297h >= this.f1296g.length) {
            this.f1296g = (C0259dn[]) Arrays.copyOf(this.f1296g, this.f1296g.length * 2);
        }
        this.f1296g[this.f1297h] = dnVar;
        this.f1297h++;
    }

    /* renamed from: b */
    public final void mo1539b() {
        this.f1299o = null;
        this.f1295f = C0269a.f1304e;
        this.f1292c = 0;
        this.f1290a = -1;
        this.f1291b = -1;
        this.f1293d = 0.0f;
        this.f1297h = 0;
        this.f1298i = 0;
    }

    /* renamed from: b */
    public final void mo1540b(C0259dn dnVar) {
        int i = this.f1297h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1296g[i2] == dnVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.f1296g[i4] = this.f1296g[i4 + 1];
                }
                this.f1297h--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo1541c(C0259dn dnVar) {
        int i = this.f1297h;
        for (int i2 = 0; i2 < i; i2++) {
            C0258dm dmVar = this.f1296g[i2].f1230d;
            C0259dn dnVar2 = this.f1296g[i2];
            while (true) {
                int i3 = dmVar.f1222g;
                int i4 = 0;
                while (i3 != -1 && i4 < dmVar.f1216a) {
                    if (dmVar.f1219d[i3] == dnVar.f1227a.f1290a) {
                        float f = dmVar.f1221f[i3];
                        dmVar.mo1498a(dnVar.f1227a, false);
                        C0258dm dmVar2 = dnVar.f1230d;
                        int i5 = dmVar2.f1222g;
                        int i6 = 0;
                        while (i5 != -1 && i6 < dmVar2.f1216a) {
                            dmVar.mo1503a(dmVar.f1218c.f1234c[dmVar2.f1219d[i5]], dmVar2.f1221f[i5] * f, false);
                            i5 = dmVar2.f1220e[i5];
                            i6++;
                        }
                        dnVar2.f1228b += dnVar.f1228b * f;
                    } else {
                        i3 = dmVar.f1220e[i3];
                        i4++;
                    }
                }
            }
        }
        this.f1297h = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f1299o);
        return sb.toString();
    }
}
