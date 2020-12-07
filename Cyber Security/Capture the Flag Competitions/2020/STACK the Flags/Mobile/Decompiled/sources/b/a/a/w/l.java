package b.a.a.w;

import android.graphics.Color;
import b.a.a.u.k.c;
import b.a.a.w.k0.c;
import b.a.a.x.g;
import java.util.ArrayList;
import java.util.List;

public class l implements j0<c> {

    /* renamed from: a  reason: collision with root package name */
    public int f2292a;

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // b.a.a.w.j0
    public /* bridge */ /* synthetic */ c a(b.a.a.w.k0.c cVar, float f2) {
        return d(cVar);
    }

    public l(int colorPoints) {
        this.f2292a = colorPoints;
    }

    public c d(b.a.a.w.k0.c reader) {
        List<Float> array = new ArrayList<>();
        int i = 1;
        boolean isArray = reader.s() == c.b.BEGIN_ARRAY;
        if (isArray) {
            reader.g();
        }
        while (reader.l()) {
            array.add(Float.valueOf((float) reader.n()));
        }
        if (isArray) {
            reader.i();
        }
        if (this.f2292a == -1) {
            this.f2292a = array.size() / 4;
        }
        int i2 = this.f2292a;
        float[] positions = new float[i2];
        int[] colors = new int[i2];
        int r = 0;
        int g2 = 0;
        int i3 = 0;
        while (i3 < this.f2292a * 4) {
            int colorIndex = i3 / 4;
            double value = (double) array.get(i3).floatValue();
            int i4 = i3 % 4;
            if (i4 == 0) {
                positions[colorIndex] = (float) value;
            } else if (i4 == i) {
                r = (int) (255.0d * value);
            } else if (i4 == 2) {
                g2 = (int) (255.0d * value);
            } else if (i4 == 3) {
                colors[colorIndex] = Color.argb(255, r, g2, (int) (255.0d * value));
            }
            i3++;
            i = 1;
        }
        b.a.a.u.k.c gradientColor = new b.a.a.u.k.c(positions, colors);
        b(gradientColor, array);
        return gradientColor;
    }

    public final void b(b.a.a.u.k.c gradientColor, List<Float> array) {
        int startIndex = this.f2292a * 4;
        if (array.size() > startIndex) {
            int opacityStops = (array.size() - startIndex) / 2;
            double[] positions = new double[opacityStops];
            double[] opacities = new double[opacityStops];
            int j = 0;
            for (int i = startIndex; i < array.size(); i++) {
                if (i % 2 == 0) {
                    positions[j] = (double) array.get(i).floatValue();
                } else {
                    opacities[j] = (double) array.get(i).floatValue();
                    j++;
                }
            }
            for (int i2 = 0; i2 < gradientColor.c(); i2++) {
                int color = gradientColor.a()[i2];
                gradientColor.a()[i2] = Color.argb(c((double) gradientColor.b()[i2], positions, opacities), Color.red(color), Color.green(color), Color.blue(color));
            }
        }
    }

    public final int c(double position, double[] positions, double[] opacities) {
        for (int i = 1; i < positions.length; i++) {
            double lastPosition = positions[i - 1];
            double thisPosition = positions[i];
            if (positions[i] >= position) {
                return (int) (g.i(opacities[i - 1], opacities[i], (position - lastPosition) / (thisPosition - lastPosition)) * 255.0d);
            }
        }
        return (int) (opacities[opacities.length - 1] * 255.0d);
    }
}
