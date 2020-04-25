package p000;

import java.util.Arrays;

/* renamed from: dm */
public final class C0258dm {

    /* renamed from: a */
    int f1216a = 0;

    /* renamed from: b */
    final C0259dn f1217b;

    /* renamed from: c */
    final C0260do f1218c;

    /* renamed from: d */
    int[] f1219d = new int[this.f1223h];

    /* renamed from: e */
    int[] f1220e = new int[this.f1223h];

    /* renamed from: f */
    float[] f1221f = new float[this.f1223h];

    /* renamed from: g */
    int f1222g = -1;

    /* renamed from: h */
    private int f1223h = 8;

    /* renamed from: i */
    private C0268dt f1224i = null;

    /* renamed from: j */
    private int f1225j = -1;

    /* renamed from: k */
    private boolean f1226k = false;

    C0258dm(C0259dn dnVar, C0260do doVar) {
        this.f1217b = dnVar;
        this.f1218c = doVar;
    }

    /* renamed from: a */
    static boolean m847a(C0268dt dtVar) {
        return dtVar.f1298i <= 1;
    }

    /* renamed from: a */
    public final float mo1498a(C0268dt dtVar, boolean z) {
        if (this.f1224i == dtVar) {
            this.f1224i = null;
        }
        if (this.f1222g == -1) {
            return 0.0f;
        }
        int i = this.f1222g;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1216a) {
            if (this.f1219d[i] == dtVar.f1290a) {
                if (i == this.f1222g) {
                    this.f1222g = this.f1220e[i];
                } else {
                    this.f1220e[i3] = this.f1220e[i];
                }
                if (z) {
                    dtVar.mo1540b(this.f1217b);
                }
                dtVar.f1298i--;
                this.f1216a--;
                this.f1219d[i] = -1;
                if (this.f1226k) {
                    this.f1225j = i;
                }
                return this.f1221f[i];
            }
            i2++;
            i3 = i;
            i = this.f1220e[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0268dt mo1499a(int i) {
        int i2 = this.f1222g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f1216a) {
            if (i3 == i) {
                return this.f1218c.f1234c[this.f1219d[i2]];
            }
            i2 = this.f1220e[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0268dt mo1500a(boolean[] zArr, C0268dt dtVar) {
        int i = this.f1222g;
        int i2 = 0;
        C0268dt dtVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f1216a) {
            if (this.f1221f[i] < 0.0f) {
                C0268dt dtVar3 = this.f1218c.f1234c[this.f1219d[i]];
                if ((zArr == null || !zArr[dtVar3.f1290a]) && dtVar3 != dtVar && (dtVar3.f1295f == C0269a.f1302c || dtVar3.f1295f == C0269a.f1303d)) {
                    float f2 = this.f1221f[i];
                    if (f2 < f) {
                        dtVar2 = dtVar3;
                        f = f2;
                    }
                }
            }
            i = this.f1220e[i];
            i2++;
        }
        return dtVar2;
    }

    /* renamed from: a */
    public final void mo1501a() {
        int i = this.f1222g;
        int i2 = 0;
        while (i != -1 && i2 < this.f1216a) {
            C0268dt dtVar = this.f1218c.f1234c[this.f1219d[i]];
            if (dtVar != null) {
                dtVar.mo1540b(this.f1217b);
            }
            i = this.f1220e[i];
            i2++;
        }
        this.f1222g = -1;
        this.f1225j = -1;
        this.f1226k = false;
        this.f1216a = 0;
    }

    /* renamed from: a */
    public final void mo1502a(C0268dt dtVar, float f) {
        if (f == 0.0f) {
            mo1498a(dtVar, true);
        } else if (this.f1222g == -1) {
            this.f1222g = 0;
            this.f1221f[this.f1222g] = f;
            this.f1219d[this.f1222g] = dtVar.f1290a;
            this.f1220e[this.f1222g] = -1;
            dtVar.f1298i++;
            dtVar.mo1538a(this.f1217b);
            this.f1216a++;
            if (!this.f1226k) {
                this.f1225j++;
                if (this.f1225j >= this.f1219d.length) {
                    this.f1226k = true;
                    this.f1225j = this.f1219d.length - 1;
                }
            }
        } else {
            int i = this.f1222g;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f1216a) {
                if (this.f1219d[i] == dtVar.f1290a) {
                    this.f1221f[i] = f;
                    return;
                }
                if (this.f1219d[i] < dtVar.f1290a) {
                    i3 = i;
                }
                i = this.f1220e[i];
                i2++;
            }
            int i4 = this.f1225j + 1;
            if (this.f1226k) {
                i4 = this.f1219d[this.f1225j] == -1 ? this.f1225j : this.f1219d.length;
            }
            if (i4 >= this.f1219d.length && this.f1216a < this.f1219d.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f1219d.length) {
                        break;
                    } else if (this.f1219d[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f1219d.length) {
                i4 = this.f1219d.length;
                this.f1223h *= 2;
                this.f1226k = false;
                this.f1225j = i4 - 1;
                this.f1221f = Arrays.copyOf(this.f1221f, this.f1223h);
                this.f1219d = Arrays.copyOf(this.f1219d, this.f1223h);
                this.f1220e = Arrays.copyOf(this.f1220e, this.f1223h);
            }
            this.f1219d[i4] = dtVar.f1290a;
            this.f1221f[i4] = f;
            if (i3 != -1) {
                this.f1220e[i4] = this.f1220e[i3];
                this.f1220e[i3] = i4;
            } else {
                this.f1220e[i4] = this.f1222g;
                this.f1222g = i4;
            }
            dtVar.f1298i++;
            dtVar.mo1538a(this.f1217b);
            this.f1216a++;
            if (!this.f1226k) {
                this.f1225j++;
            }
            if (this.f1216a >= this.f1219d.length) {
                this.f1226k = true;
            }
            if (this.f1225j >= this.f1219d.length) {
                this.f1226k = true;
                this.f1225j = this.f1219d.length - 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1503a(C0268dt dtVar, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f1222g == -1) {
                this.f1222g = 0;
                this.f1221f[this.f1222g] = f;
                this.f1219d[this.f1222g] = dtVar.f1290a;
                this.f1220e[this.f1222g] = -1;
                dtVar.f1298i++;
                dtVar.mo1538a(this.f1217b);
                this.f1216a++;
                if (!this.f1226k) {
                    this.f1225j++;
                    if (this.f1225j >= this.f1219d.length) {
                        this.f1226k = true;
                        this.f1225j = this.f1219d.length - 1;
                    }
                }
                return;
            }
            int i = this.f1222g;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f1216a) {
                if (this.f1219d[i] == dtVar.f1290a) {
                    float[] fArr = this.f1221f;
                    fArr[i] = fArr[i] + f;
                    if (this.f1221f[i] == 0.0f) {
                        if (i == this.f1222g) {
                            this.f1222g = this.f1220e[i];
                        } else {
                            this.f1220e[i3] = this.f1220e[i];
                        }
                        if (z) {
                            dtVar.mo1540b(this.f1217b);
                        }
                        if (this.f1226k) {
                            this.f1225j = i;
                        }
                        dtVar.f1298i--;
                        this.f1216a--;
                    }
                    return;
                }
                if (this.f1219d[i] < dtVar.f1290a) {
                    i3 = i;
                }
                i = this.f1220e[i];
                i2++;
            }
            int i4 = this.f1225j + 1;
            if (this.f1226k) {
                i4 = this.f1219d[this.f1225j] == -1 ? this.f1225j : this.f1219d.length;
            }
            if (i4 >= this.f1219d.length && this.f1216a < this.f1219d.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f1219d.length) {
                        break;
                    } else if (this.f1219d[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f1219d.length) {
                i4 = this.f1219d.length;
                this.f1223h *= 2;
                this.f1226k = false;
                this.f1225j = i4 - 1;
                this.f1221f = Arrays.copyOf(this.f1221f, this.f1223h);
                this.f1219d = Arrays.copyOf(this.f1219d, this.f1223h);
                this.f1220e = Arrays.copyOf(this.f1220e, this.f1223h);
            }
            this.f1219d[i4] = dtVar.f1290a;
            this.f1221f[i4] = f;
            if (i3 != -1) {
                this.f1220e[i4] = this.f1220e[i3];
                this.f1220e[i3] = i4;
            } else {
                this.f1220e[i4] = this.f1222g;
                this.f1222g = i4;
            }
            dtVar.f1298i++;
            dtVar.mo1538a(this.f1217b);
            this.f1216a++;
            if (!this.f1226k) {
                this.f1225j++;
            }
            if (this.f1225j >= this.f1219d.length) {
                this.f1226k = true;
                this.f1225j = this.f1219d.length - 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo1504b(int i) {
        int i2 = this.f1222g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f1216a) {
            if (i3 == i) {
                return this.f1221f[i2];
            }
            i2 = this.f1220e[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo1505b(C0268dt dtVar) {
        int i = this.f1222g;
        int i2 = 0;
        while (i != -1 && i2 < this.f1216a) {
            if (this.f1219d[i] == dtVar.f1290a) {
                return this.f1221f[i];
            }
            i = this.f1220e[i];
            i2++;
        }
        return 0.0f;
    }

    public final String toString() {
        String str = "";
        int i = this.f1222g;
        int i2 = 0;
        while (i != -1 && i2 < this.f1216a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f1221f[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f1218c.f1234c[this.f1219d[i]]);
            str = sb5.toString();
            i = this.f1220e[i];
            i2++;
        }
        return str;
    }
}
