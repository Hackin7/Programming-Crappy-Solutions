package b.c.a.a.f;

import b.c.a.a.d.f;
import b.c.a.a.g.a.g;
import com.github.mikephil.charting.charts.PieChart;

public class d extends e<PieChart> {
    public d(PieChart chart) {
        super(chart);
    }

    @Override // b.c.a.a.f.e
    public b a(int index, float x, float y) {
        g set = ((f) ((PieChart) this.f2469a).getData()).q();
        return new b((float) index, set.Q(index).c(), x, y, 0, set.A());
    }
}
