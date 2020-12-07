package a.f.b.i;

import a.f.b.d;
import a.f.b.i.e;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f633a = new boolean[3];

    public static void a(f container, d system, e widget) {
        widget.m = -1;
        widget.n = -1;
        if (container.R[0] != e.a.WRAP_CONTENT && widget.R[0] == e.a.MATCH_PARENT) {
            int left = widget.G.f614g;
            int right = container.P() - widget.I.f614g;
            d dVar = widget.G;
            dVar.i = system.q(dVar);
            d dVar2 = widget.I;
            dVar2.i = system.q(dVar2);
            system.f(widget.G.i, left);
            system.f(widget.I.i, right);
            widget.m = 2;
            widget.w0(left, right);
        }
        if (container.R[1] != e.a.WRAP_CONTENT && widget.R[1] == e.a.MATCH_PARENT) {
            int top = widget.H.f614g;
            int bottom = container.t() - widget.J.f614g;
            d dVar3 = widget.H;
            dVar3.i = system.q(dVar3);
            d dVar4 = widget.J;
            dVar4.i = system.q(dVar4);
            system.f(widget.H.i, top);
            system.f(widget.J.i, bottom);
            if (widget.Z > 0 || widget.O() == 8) {
                d dVar5 = widget.K;
                dVar5.i = system.q(dVar5);
                system.f(widget.K.i, widget.Z + top);
            }
            widget.n = 2;
            widget.N0(top, bottom);
        }
    }

    public static final boolean b(int optimizationLevel, int optimization) {
        return (optimizationLevel & optimization) == optimization;
    }
}
