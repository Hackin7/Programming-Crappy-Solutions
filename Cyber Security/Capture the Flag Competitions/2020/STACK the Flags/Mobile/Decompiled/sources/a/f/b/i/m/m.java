package a.f.b.i.m;

import a.f.b.i.f;
import java.util.ArrayList;

public class m {

    /* renamed from: c  reason: collision with root package name */
    public static int f665c;

    /* renamed from: a  reason: collision with root package name */
    public p f666a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<p> f667b = new ArrayList<>();

    public m(p run, int dir) {
        f665c++;
        this.f666a = run;
    }

    public void a(p run) {
        this.f667b.add(run);
    }

    public final long d(f node, long startPosition) {
        p run = node.f654d;
        if (run instanceof k) {
            return startPosition;
        }
        long position = startPosition;
        int count = node.k.size();
        for (int i = 0; i < count; i++) {
            d dependency = node.k.get(i);
            if (dependency instanceof f) {
                f nextNode = (f) dependency;
                if (nextNode.f654d != run) {
                    position = Math.max(position, d(nextNode, ((long) nextNode.f656f) + startPosition));
                }
            }
        }
        if (node != run.h) {
            return position;
        }
        long dimension = run.j();
        return Math.max(Math.max(position, d(run.i, startPosition + dimension)), (startPosition + dimension) - ((long) run.i.f656f));
    }

    public final long c(f node, long startPosition) {
        p run = node.f654d;
        if (run instanceof k) {
            return startPosition;
        }
        long position = startPosition;
        int count = node.k.size();
        for (int i = 0; i < count; i++) {
            d dependency = node.k.get(i);
            if (dependency instanceof f) {
                f nextNode = (f) dependency;
                if (nextNode.f654d != run) {
                    position = Math.min(position, c(nextNode, ((long) nextNode.f656f) + startPosition));
                }
            }
        }
        if (node != run.i) {
            return position;
        }
        long dimension = run.j();
        return Math.min(Math.min(position, c(run.h, startPosition - dimension)), (startPosition - dimension) - ((long) run.h.f656f));
    }

    /* JADX INFO: Multiple debug info for r1v9 long: [D('minPosition' long), D('dimension' long)] */
    /* JADX INFO: Multiple debug info for r1v13 long: [D('maxPosition' long), D('dimension' long)] */
    public long b(f container, int orientation) {
        p pVar = this.f666a;
        if (pVar instanceof c) {
            if (((c) pVar).f679f != orientation) {
                return 0;
            }
        } else if (orientation == 0) {
            if (!(pVar instanceof l)) {
                return 0;
            }
        } else if (!(pVar instanceof n)) {
            return 0;
        }
        f containerStart = (orientation == 0 ? container.f624d : container.f625e).h;
        f containerEnd = (orientation == 0 ? container.f624d : container.f625e).i;
        boolean runWithStartTarget = this.f666a.h.l.contains(containerStart);
        boolean runWithEndTarget = this.f666a.i.l.contains(containerEnd);
        long dimension = this.f666a.j();
        if (runWithStartTarget && runWithEndTarget) {
            long maxPosition = d(this.f666a.h, 0);
            long minPosition = c(this.f666a.i, 0);
            long endGap = maxPosition - dimension;
            int i = this.f666a.i.f656f;
            if (endGap >= ((long) (-i))) {
                endGap += (long) i;
            }
            int i2 = this.f666a.h.f656f;
            long startGap = ((-minPosition) - dimension) - ((long) i2);
            if (startGap >= ((long) i2)) {
                startGap -= (long) i2;
            }
            float bias = this.f666a.f675b.m(orientation);
            long gap = 0;
            if (bias > 0.0f) {
                gap = (long) ((((float) startGap) / bias) + (((float) endGap) / (1.0f - bias)));
            }
            long j = ((long) ((((float) gap) * bias) + 0.5f)) + dimension;
            p pVar2 = this.f666a;
            return (((long) pVar2.h.f656f) + (j + ((long) ((((float) gap) * (1.0f - bias)) + 0.5f)))) - ((long) pVar2.i.f656f);
        } else if (runWithStartTarget) {
            f fVar = this.f666a.h;
            return Math.max(d(fVar, (long) fVar.f656f), ((long) this.f666a.h.f656f) + dimension);
        } else if (runWithEndTarget) {
            f fVar2 = this.f666a.i;
            return Math.max(-c(fVar2, (long) fVar2.f656f), ((long) (-this.f666a.i.f656f)) + dimension);
        } else {
            p pVar3 = this.f666a;
            return (((long) pVar3.h.f656f) + pVar3.j()) - ((long) this.f666a.i.f656f);
        }
    }
}
