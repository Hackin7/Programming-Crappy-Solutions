package b.d.a.a.o;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface c {
    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f2599a;

        /* renamed from: b  reason: collision with root package name */
        public float f2600b;

        /* renamed from: c  reason: collision with root package name */
        public float f2601c;

        public e() {
        }

        public e(float centerX, float centerY, float radius) {
            this.f2599a = centerX;
            this.f2600b = centerY;
            this.f2601c = radius;
        }

        public void a(float centerX, float centerY, float radius) {
            this.f2599a = centerX;
            this.f2600b = centerY;
            this.f2601c = radius;
        }
    }

    /* renamed from: b.d.a.a.o.c$c  reason: collision with other inner class name */
    public static class C0056c extends Property<c, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, e> f2597a = new C0056c("circularReveal");

        public C0056c(String name) {
            super(e.class, name);
        }

        /* renamed from: a */
        public e get(c object) {
            return object.getRevealInfo();
        }

        /* renamed from: b */
        public void set(c object, e value) {
            object.setRevealInfo(value);
        }
    }

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f2595b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f2596a = new e();

        /* renamed from: a */
        public e evaluate(float fraction, e startValue, e endValue) {
            this.f2596a.a(b.d.a.a.s.a.c(startValue.f2599a, endValue.f2599a, fraction), b.d.a.a.s.a.c(startValue.f2600b, endValue.f2600b, fraction), b.d.a.a.s.a.c(startValue.f2601c, endValue.f2601c, fraction));
            return this.f2596a;
        }
    }

    public static class d extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, Integer> f2598a = new d("circularRevealScrimColor");

        public d(String name) {
            super(Integer.class, name);
        }

        /* renamed from: a */
        public Integer get(c object) {
            return Integer.valueOf(object.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(c object, Integer value) {
            object.setCircularRevealScrimColor(value.intValue());
        }
    }
}
