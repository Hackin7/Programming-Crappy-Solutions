package a.f.b.i.m;

import a.f.b.d;
import a.f.b.i.b;
import a.f.b.i.e;
import a.f.b.i.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f668f = 0;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<e> f669a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f670b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f671c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f672d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f673e = -1;

    public o(int orientation) {
        int i = f668f;
        f668f = i + 1;
        this.f670b = i;
        this.f671c = orientation;
    }

    public int d() {
        return this.f671c;
    }

    public int c() {
        return this.f670b;
    }

    public boolean a(e widget) {
        if (this.f669a.contains(widget)) {
            return false;
        }
        this.f669a.add(widget);
        return true;
    }

    public void h(boolean isAuthoritative) {
    }

    public final String e() {
        int i = this.f671c;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        if (i == 2) {
            return "Both";
        }
        return "Unknown";
    }

    public String toString() {
        String ret = e() + " [" + this.f670b + "] <";
        Iterator<e> it = this.f669a.iterator();
        while (it.hasNext()) {
            ret = ret + " " + it.next().p();
        }
        return ret + " >";
    }

    public void g(int orientation, o widgetGroup) {
        Iterator<e> it = this.f669a.iterator();
        while (it.hasNext()) {
            e widget = it.next();
            widgetGroup.a(widget);
            if (orientation == 0) {
                widget.n0 = widgetGroup.c();
            } else {
                widget.o0 = widgetGroup.c();
            }
        }
        this.f673e = widgetGroup.f670b;
    }

    public int f(d system, int orientation) {
        if (this.f669a.size() == 0) {
            return 0;
        }
        return j(system, this.f669a, orientation);
    }

    public final int j(d system, ArrayList<e> arrayList, int orientation) {
        f container = (f) arrayList.get(0).G();
        system.D();
        container.e(system, false);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).e(system, false);
        }
        if (orientation == 0 && container.y0 > 0) {
            b.b(container, system, arrayList, 0);
        }
        if (orientation == 1 && container.z0 > 0) {
            b.b(container, system, arrayList, 1);
        }
        try {
            system.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f672d = new ArrayList<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f672d.add(new a(this, arrayList.get(i2), system, orientation));
        }
        if (orientation == 0) {
            int left = system.x(container.G);
            int right = system.x(container.I);
            system.D();
            return right - left;
        }
        int top = system.x(container.H);
        int bottom = system.x(container.J);
        system.D();
        return bottom - top;
    }

    public void i(int orientation) {
        this.f671c = orientation;
    }

    public void b(ArrayList<o> arrayList) {
        int count = this.f669a.size();
        if (this.f673e != -1 && count > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o group = arrayList.get(i);
                if (this.f673e == group.f670b) {
                    g(this.f671c, group);
                }
            }
        }
        if (count == 0) {
            arrayList.remove(this);
        }
    }

    public class a {
        public a(o this$0, e widget, d system, int orientation) {
            new WeakReference(widget);
            system.x(widget.G);
            system.x(widget.H);
            system.x(widget.I);
            system.x(widget.J);
            system.x(widget.K);
        }
    }
}
