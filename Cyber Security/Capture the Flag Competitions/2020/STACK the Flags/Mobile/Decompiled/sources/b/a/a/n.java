package b.a.a;

import a.h.l.d;
import b.a.a.x.f;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1949a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Set<b> f1950b = new a.e.b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, f> f1951c = new HashMap();

    public interface b {
        void a(float f2);
    }

    public n() {
        new a(this);
    }

    public class a implements Comparator<d<String, Float>> {
        public a(n this$0) {
        }

        /* renamed from: a */
        public int compare(d<String, Float> dVar, d<String, Float> dVar2) {
            float r1 = dVar.f903b.floatValue();
            float r2 = dVar2.f903b.floatValue();
            if (r2 > r1) {
                return 1;
            }
            if (r1 > r2) {
                return -1;
            }
            return 0;
        }
    }

    public void b(boolean enabled) {
        this.f1949a = enabled;
    }

    public void a(String layerName, float millis) {
        if (this.f1949a) {
            f meanCalculator = this.f1951c.get(layerName);
            if (meanCalculator == null) {
                meanCalculator = new f();
                this.f1951c.put(layerName, meanCalculator);
            }
            meanCalculator.a(millis);
            if (layerName.equals("__container")) {
                for (b listener : this.f1950b) {
                    listener.a(millis);
                }
            }
        }
    }
}
