package b.c.a.a.f;

import b.c.a.a.b.b;
import com.github.mikephil.charting.charts.PieChart;
import java.util.ArrayList;
import java.util.List;

public abstract class e<T extends b> implements c {

    /* renamed from: a  reason: collision with root package name */
    public T f2469a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f2470b = new ArrayList();

    public abstract b a(int i, float f2, float f3);

    public e(T chart) {
        this.f2469a = chart;
    }

    public b b(float x, float y) {
        if (this.f2469a.r(x, y) > this.f2469a.getRadius()) {
            return null;
        }
        float angle = this.f2469a.s(x, y);
        T t = this.f2469a;
        if (t instanceof PieChart) {
            angle /= t.getAnimator().b();
        }
        int index = this.f2469a.t(angle);
        if (index < 0 || index >= this.f2469a.getData().k().E()) {
            return null;
        }
        return a(index, x, y);
    }
}
