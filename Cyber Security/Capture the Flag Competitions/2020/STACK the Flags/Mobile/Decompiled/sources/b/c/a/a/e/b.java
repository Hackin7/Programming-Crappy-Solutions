package b.c.a.a.e;

import java.text.DecimalFormat;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public DecimalFormat f2461a;

    public b(int digits) {
        e(digits);
    }

    public void e(int digits) {
        StringBuffer b2 = new StringBuffer();
        for (int i = 0; i < digits; i++) {
            if (i == 0) {
                b2.append(".");
            }
            b2.append("0");
        }
        this.f2461a = new DecimalFormat("###,###,###,##0" + b2.toString());
    }

    @Override // b.c.a.a.e.c
    public String b(float value) {
        return this.f2461a.format((double) value);
    }
}
