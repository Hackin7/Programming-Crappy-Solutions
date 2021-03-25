package b.c.a.a.e;

import java.text.DecimalFormat;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public DecimalFormat f2459a;

    /* renamed from: b  reason: collision with root package name */
    public int f2460b;

    public a(int digits) {
        this.f2460b = digits;
        StringBuffer b2 = new StringBuffer();
        for (int i = 0; i < digits; i++) {
            if (i == 0) {
                b2.append(".");
            }
            b2.append("0");
        }
        this.f2459a = new DecimalFormat("###,###,###,##0" + b2.toString());
    }

    @Override // b.c.a.a.e.c
    public String b(float value) {
        return this.f2459a.format((double) value);
    }

    public int e() {
        return this.f2460b;
    }
}
