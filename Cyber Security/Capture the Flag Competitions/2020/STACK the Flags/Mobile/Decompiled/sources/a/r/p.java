package a.r;

import a.r.l;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class p extends l {
    public ArrayList<l> J = new ArrayList<>();
    public boolean K = true;
    public int L;
    public boolean M = false;
    public int N = 0;

    @Override // a.r.l
    public /* bridge */ /* synthetic */ l T(long j) {
        i0(j);
        return this;
    }

    public p k0(int ordering) {
        if (ordering == 0) {
            this.K = true;
        } else if (ordering == 1) {
            this.K = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + ordering);
        }
        return this;
    }

    public p d0(l transition) {
        this.J.add(transition);
        transition.s = this;
        long j = this.f1378d;
        if (j >= 0) {
            transition.T(j);
        }
        if ((this.N & 1) != 0) {
            transition.V(r());
        }
        if ((this.N & 2) != 0) {
            v();
            transition.X(null);
        }
        if ((this.N & 4) != 0) {
            transition.W(u());
        }
        if ((this.N & 8) != 0) {
            transition.U(q());
        }
        return this;
    }

    public int f0() {
        return this.J.size();
    }

    public l e0(int index) {
        if (index < 0 || index >= this.J.size()) {
            return null;
        }
        return this.J.get(index);
    }

    public p i0(long duration) {
        super.T(duration);
        if (this.f1378d >= 0) {
            int numTransitions = this.J.size();
            for (int i = 0; i < numTransitions; i++) {
                this.J.get(i).T(duration);
            }
        }
        return this;
    }

    /* renamed from: l0 */
    public p Y(long startDelay) {
        super.Y(startDelay);
        return this;
    }

    /* renamed from: j0 */
    public p V(TimeInterpolator interpolator) {
        this.N |= 1;
        ArrayList<l> arrayList = this.J;
        if (arrayList != null) {
            int numTransitions = arrayList.size();
            for (int i = 0; i < numTransitions; i++) {
                this.J.get(i).V(interpolator);
            }
        }
        super.V(interpolator);
        return this;
    }

    /* renamed from: c0 */
    public p b(View target) {
        for (int i = 0; i < this.J.size(); i++) {
            this.J.get(i).b(target);
        }
        super.b(target);
        return this;
    }

    /* renamed from: b0 */
    public p a(l.f listener) {
        super.a(listener);
        return this;
    }

    /* renamed from: h0 */
    public p P(View target) {
        for (int i = 0; i < this.J.size(); i++) {
            this.J.get(i).P(target);
        }
        super.P(target);
        return this;
    }

    /* renamed from: g0 */
    public p O(l.f listener) {
        super.O(listener);
        return this;
    }

    @Override // a.r.l
    public void W(g pathMotion) {
        super.W(pathMotion);
        this.N |= 4;
        for (int i = 0; i < this.J.size(); i++) {
            this.J.get(i).W(pathMotion);
        }
    }

    public final void m0() {
        b listener = new b(this);
        Iterator<l> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().a(listener);
        }
        this.L = this.J.size();
    }

    public static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public p f1398a;

        public b(p transitionSet) {
            this.f1398a = transitionSet;
        }

        @Override // a.r.m, a.r.l.f
        public void c(l transition) {
            p pVar = this.f1398a;
            if (!pVar.M) {
                pVar.Z();
                this.f1398a.M = true;
            }
        }

        @Override // a.r.l.f
        public void d(l transition) {
            p pVar = this.f1398a;
            int i = pVar.L - 1;
            pVar.L = i;
            if (i == 0) {
                pVar.M = false;
                pVar.o();
            }
            transition.O(this);
        }
    }

    @Override // a.r.l
    public void n(ViewGroup sceneRoot, s startValues, s endValues, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long startDelay = x();
        int numTransitions = this.J.size();
        for (int i = 0; i < numTransitions; i++) {
            l childTransition = this.J.get(i);
            if (startDelay > 0 && (this.K || i == 0)) {
                long childStartDelay = childTransition.x();
                if (childStartDelay > 0) {
                    childTransition.Y(startDelay + childStartDelay);
                } else {
                    childTransition.Y(startDelay);
                }
            }
            childTransition.n(sceneRoot, startValues, endValues, arrayList, arrayList2);
        }
    }

    @Override // a.r.l
    public void S() {
        if (this.J.isEmpty()) {
            Z();
            o();
            return;
        }
        m0();
        if (!this.K) {
            for (int i = 1; i < this.J.size(); i++) {
                this.J.get(i - 1).a(new a(this, this.J.get(i)));
            }
            l firstTransition = this.J.get(0);
            if (firstTransition != null) {
                firstTransition.S();
                return;
            }
            return;
        }
        Iterator<l> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().S();
        }
    }

    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f1397a;

        public a(p this$0, l lVar) {
            this.f1397a = lVar;
        }

        @Override // a.r.l.f
        public void d(l transition) {
            this.f1397a.S();
            transition.O(this);
        }
    }

    @Override // a.r.l
    public void i(r transitionValues) {
        if (F(transitionValues.f1403b)) {
            Iterator<l> it = this.J.iterator();
            while (it.hasNext()) {
                l childTransition = it.next();
                if (childTransition.F(transitionValues.f1403b)) {
                    childTransition.i(transitionValues);
                    transitionValues.f1404c.add(childTransition);
                }
            }
        }
    }

    @Override // a.r.l
    public void f(r transitionValues) {
        if (F(transitionValues.f1403b)) {
            Iterator<l> it = this.J.iterator();
            while (it.hasNext()) {
                l childTransition = it.next();
                if (childTransition.F(transitionValues.f1403b)) {
                    childTransition.f(transitionValues);
                    transitionValues.f1404c.add(childTransition);
                }
            }
        }
    }

    @Override // a.r.l
    public void h(r transitionValues) {
        super.h(transitionValues);
        int numTransitions = this.J.size();
        for (int i = 0; i < numTransitions; i++) {
            this.J.get(i).h(transitionValues);
        }
    }

    @Override // a.r.l
    public void M(View sceneRoot) {
        super.M(sceneRoot);
        int numTransitions = this.J.size();
        for (int i = 0; i < numTransitions; i++) {
            this.J.get(i).M(sceneRoot);
        }
    }

    @Override // a.r.l
    public void Q(View sceneRoot) {
        super.Q(sceneRoot);
        int numTransitions = this.J.size();
        for (int i = 0; i < numTransitions; i++) {
            this.J.get(i).Q(sceneRoot);
        }
    }

    @Override // a.r.l
    public void X(o propagation) {
        super.X(propagation);
        this.N |= 2;
        int numTransitions = this.J.size();
        for (int i = 0; i < numTransitions; i++) {
            this.J.get(i).X(propagation);
        }
    }

    @Override // a.r.l
    public void U(l.e epicenterCallback) {
        super.U(epicenterCallback);
        this.N |= 8;
        int numTransitions = this.J.size();
        for (int i = 0; i < numTransitions; i++) {
            this.J.get(i).U(epicenterCallback);
        }
    }

    @Override // a.r.l
    public String a0(String indent) {
        String result = super.a0(indent);
        for (int i = 0; i < this.J.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(result);
            sb.append("\n");
            sb.append(this.J.get(i).a0(indent + "  "));
            result = sb.toString();
        }
        return result;
    }

    @Override // a.r.l
    /* renamed from: l */
    public l clone() {
        p clone = (p) super.clone();
        clone.J = new ArrayList<>();
        int numTransitions = this.J.size();
        for (int i = 0; i < numTransitions; i++) {
            clone.d0(this.J.get(i).clone());
        }
        return clone;
    }
}
