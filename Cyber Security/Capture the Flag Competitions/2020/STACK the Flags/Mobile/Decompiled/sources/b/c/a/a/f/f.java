package b.c.a.a.f;

import b.c.a.a.b.c;
import b.c.a.a.d.e;
import b.c.a.a.d.i;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.List;

public class f extends e<c> {
    public f(c chart) {
        super(chart);
    }

    @Override // b.c.a.a.f.e
    public b a(int index, float x, float y) {
        List<Highlight> highlights = c(index);
        float distanceToCenter = ((c) this.f2469a).r(x, y) / ((c) this.f2469a).getFactor();
        b closest = null;
        float distance = Float.MAX_VALUE;
        for (int i = 0; i < highlights.size(); i++) {
            b high = (b) highlights.get(i);
            float cdistance = Math.abs(high.f() - distanceToCenter);
            if (cdistance < distance) {
                closest = high;
                distance = cdistance;
            }
        }
        return closest;
    }

    public List<b> c(int index) {
        int i = index;
        this.f2470b.clear();
        float phaseX = ((c) this.f2469a).getAnimator().a();
        float phaseY = ((c) this.f2469a).getAnimator().b();
        float sliceangle = ((c) this.f2469a).getSliceAngle();
        float factor = ((c) this.f2469a).getFactor();
        b.c.a.a.j.c pOut = b.c.a.a.j.c.c(0.0f, 0.0f);
        int i2 = 0;
        while (i2 < ((i) ((c) this.f2469a).getData()).e()) {
            IDataSet<?> dataSet = ((i) ((c) this.f2469a).getData()).d(i2);
            e entry = dataSet.Q(i);
            b.c.a.a.j.f.p(((c) this.f2469a).getCenterOffsets(), (entry.c() - ((c) this.f2469a).getYChartMin()) * factor * phaseY, (((float) i) * sliceangle * phaseX) + ((c) this.f2469a).getRotationAngle(), pOut);
            this.f2470b.add(new b((float) i, entry.c(), pOut.f2511c, pOut.f2512d, i2, dataSet.A()));
            i2++;
            i = index;
            phaseX = phaseX;
        }
        return this.f2470b;
    }
}
