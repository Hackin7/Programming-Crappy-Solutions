package a.r;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.BuildConfig;

public abstract class l implements Cloneable {
    public static final int[] G = {2, 1, 3, 4};
    public static final g H = new a();
    public static ThreadLocal<a.e.a<Animator, d>> I = new ThreadLocal<>();
    public boolean A = false;
    public ArrayList<f> B = null;
    public ArrayList<Animator> C = new ArrayList<>();
    public o D;
    public e E;
    public g F = H;

    /* renamed from: b  reason: collision with root package name */
    public String f1376b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    public long f1377c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f1378d = -1;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f1379e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<Integer> f1380f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<View> f1381g = new ArrayList<>();
    public ArrayList<String> h = null;
    public ArrayList<Class> i = null;
    public ArrayList<Integer> j = null;
    public ArrayList<View> k = null;
    public ArrayList<Class> l = null;
    public ArrayList<String> m = null;
    public ArrayList<Integer> n = null;
    public ArrayList<View> o = null;
    public ArrayList<Class> p = null;
    public s q = new s();
    public s r = new s();
    public p s = null;
    public int[] t = G;
    public ArrayList<r> u;
    public ArrayList<r> v;
    public boolean w = false;
    public ArrayList<Animator> x = new ArrayList<>();
    public int y = 0;
    public boolean z = false;

    public static abstract class e {
    }

    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);
    }

    public abstract void f(r rVar);

    public abstract void i(r rVar);

    public static class a extends g {
        @Override // a.r.g
        public Path a(float startX, float startY, float endX, float endY) {
            Path path = new Path();
            path.moveTo(startX, startY);
            path.lineTo(endX, endY);
            return path;
        }
    }

    public l T(long duration) {
        this.f1378d = duration;
        return this;
    }

    public long p() {
        return this.f1378d;
    }

    public l Y(long startDelay) {
        this.f1377c = startDelay;
        return this;
    }

    public long x() {
        return this.f1377c;
    }

    public l V(TimeInterpolator interpolator) {
        this.f1379e = interpolator;
        return this;
    }

    public TimeInterpolator r() {
        return this.f1379e;
    }

    public String[] C() {
        return null;
    }

    public Animator m(ViewGroup sceneRoot, r startValues, r endValues) {
        return null;
    }

    public final void I(a.e.a<View, r> aVar, a.e.a<View, r> aVar2) {
        r end;
        View view;
        for (int i2 = aVar.size() - 1; i2 >= 0; i2--) {
            View view2 = aVar.i(i2);
            if (!(view2 == null || !F(view2) || (end = aVar2.remove(view2)) == null || (view = end.f1403b) == null || !F(view))) {
                this.u.add(aVar.k(i2));
                this.v.add(end);
            }
        }
    }

    public final void J(a.e.a<View, r> aVar, a.e.a<View, r> aVar2, a.e.d<View> dVar, a.e.d<View> dVar2) {
        View endView;
        int numStartIds = dVar.m();
        for (int i2 = 0; i2 < numStartIds; i2++) {
            View startView = dVar.n(i2);
            if (startView != null && F(startView) && (endView = dVar2.f(dVar.i(i2))) != null && F(endView)) {
                r startValues = aVar.get(startView);
                r endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.u.add(startValues);
                    this.v.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    public final void H(a.e.a<View, r> aVar, a.e.a<View, r> aVar2, SparseArray<View> startIds, SparseArray<View> endIds) {
        View endView;
        int numStartIds = startIds.size();
        for (int i2 = 0; i2 < numStartIds; i2++) {
            View startView = startIds.valueAt(i2);
            if (startView != null && F(startView) && (endView = endIds.get(startIds.keyAt(i2))) != null && F(endView)) {
                r startValues = aVar.get(startView);
                r endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.u.add(startValues);
                    this.v.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    public final void K(a.e.a<View, r> aVar, a.e.a<View, r> aVar2, a.e.a<String, View> aVar3, a.e.a<String, View> aVar4) {
        View endView;
        int numStartNames = aVar3.size();
        for (int i2 = 0; i2 < numStartNames; i2++) {
            View startView = aVar3.m(i2);
            if (startView != null && F(startView) && (endView = aVar4.get(aVar3.i(i2))) != null && F(endView)) {
                r startValues = aVar.get(startView);
                r endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.u.add(startValues);
                    this.v.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    public final void c(a.e.a<View, r> aVar, a.e.a<View, r> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            r start = aVar.m(i2);
            if (F(start.f1403b)) {
                this.u.add(start);
                this.v.add(null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            r end = aVar2.m(i3);
            if (F(end.f1403b)) {
                this.v.add(end);
                this.u.add(null);
            }
        }
    }

    public final void L(s startValues, s endValues) {
        ArrayMap<View, TransitionValues> unmatchedStart = new a.e.a<>(startValues.f1405a);
        ArrayMap<View, TransitionValues> unmatchedEnd = new a.e.a<>(endValues.f1405a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.t;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    I(unmatchedStart, unmatchedEnd);
                } else if (i3 == 2) {
                    K(unmatchedStart, unmatchedEnd, startValues.f1408d, endValues.f1408d);
                } else if (i3 == 3) {
                    H(unmatchedStart, unmatchedEnd, startValues.f1406b, endValues.f1406b);
                } else if (i3 == 4) {
                    J(unmatchedStart, unmatchedEnd, startValues.f1407c, endValues.f1407c);
                }
                i2++;
            } else {
                c(unmatchedStart, unmatchedEnd);
                return;
            }
        }
    }

    public void n(ViewGroup sceneRoot, s startValues, s endValues, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        int startValuesListCount;
        View view;
        r infoValues;
        Animator animator;
        Animator animator2;
        Animator animator3;
        int numExistingAnims;
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = w();
        SparseIntArray startDelays = new SparseIntArray();
        int startValuesListCount2 = arrayList.size();
        int i2 = 0;
        while (i2 < startValuesListCount2) {
            r start = arrayList.get(i2);
            r end = arrayList2.get(i2);
            r start2 = (start == null || start.f1404c.contains(this)) ? start : null;
            r end2 = (end == null || end.f1404c.contains(this)) ? end : null;
            if (start2 == null && end2 == null) {
                startValuesListCount = startValuesListCount2;
            } else if (start2 == null || end2 == null || E(start2, end2)) {
                Animator animator4 = m(sceneRoot, start2, end2);
                if (animator4 != null) {
                    r infoValues2 = null;
                    if (end2 != null) {
                        View view2 = end2.f1403b;
                        String[] properties = C();
                        if (view2 == null || properties == null) {
                            animator3 = animator4;
                            startValuesListCount = startValuesListCount2;
                        } else {
                            animator3 = animator4;
                            if (properties.length > 0) {
                                r infoValues3 = new r();
                                infoValues3.f1403b = view2;
                                r newValues = endValues.f1405a.get(view2);
                                if (newValues != null) {
                                    int j2 = 0;
                                    while (j2 < properties.length) {
                                        infoValues3.f1402a.put(properties[j2], newValues.f1402a.get(properties[j2]));
                                        j2++;
                                        end2 = end2;
                                        startValuesListCount2 = startValuesListCount2;
                                        newValues = newValues;
                                    }
                                    startValuesListCount = startValuesListCount2;
                                } else {
                                    startValuesListCount = startValuesListCount2;
                                }
                                int numExistingAnims2 = runningAnimators.size();
                                int j3 = 0;
                                while (true) {
                                    if (j3 >= numExistingAnims2) {
                                        infoValues2 = infoValues3;
                                        animator2 = animator3;
                                        break;
                                    }
                                    d info = runningAnimators.get((Animator) runningAnimators.i(j3));
                                    if (info.f1387c != null && info.f1385a == view2) {
                                        numExistingAnims = numExistingAnims2;
                                        if (info.f1386b.equals(t()) && info.f1387c.equals(infoValues3)) {
                                            infoValues2 = infoValues3;
                                            animator2 = null;
                                            break;
                                        }
                                    } else {
                                        numExistingAnims = numExistingAnims2;
                                    }
                                    j3++;
                                    numExistingAnims2 = numExistingAnims;
                                }
                                animator = animator2;
                                infoValues = infoValues2;
                                view = view2;
                            } else {
                                startValuesListCount = startValuesListCount2;
                            }
                        }
                        animator2 = animator3;
                        animator = animator2;
                        infoValues = infoValues2;
                        view = view2;
                    } else {
                        startValuesListCount = startValuesListCount2;
                        infoValues = null;
                        animator = animator4;
                        view = start2.f1403b;
                    }
                    if (animator != null) {
                        runningAnimators.put(animator, new d(view, t(), this, z.e(sceneRoot), infoValues));
                        this.C.add(animator);
                    }
                } else {
                    startValuesListCount = startValuesListCount2;
                }
            } else {
                startValuesListCount = startValuesListCount2;
            }
            i2++;
            startValuesListCount2 = startValuesListCount;
        }
        if (Long.MAX_VALUE != 0) {
            for (int i3 = 0; i3 < startDelays.size(); i3++) {
                Animator animator5 = this.C.get(startDelays.keyAt(i3));
                animator5.setStartDelay((((long) startDelays.valueAt(i3)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public boolean F(View target) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int targetId = target.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(targetId))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.k;
        if (arrayList4 != null && arrayList4.contains(target)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.l;
        if (arrayList5 != null) {
            int numTypes = arrayList5.size();
            for (int i2 = 0; i2 < numTypes; i2++) {
                if (this.l.get(i2).isInstance(target)) {
                    return false;
                }
            }
        }
        if (!(this.m == null || s.B(target) == null || !this.m.contains(s.B(target)))) {
            return false;
        }
        if ((this.f1380f.size() == 0 && this.f1381g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) || this.f1380f.contains(Integer.valueOf(targetId)) || this.f1381g.contains(target)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.h;
        if (arrayList6 != null && arrayList6.contains(s.B(target))) {
            return true;
        }
        if (this.i != null) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                if (this.i.get(i3).isInstance(target)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static a.e.a<Animator, d> w() {
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = (a.e.a) I.get();
        if (runningAnimators != null) {
            return runningAnimators;
        }
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators2 = new a.e.a<>();
        I.set(runningAnimators2);
        return runningAnimators2;
    }

    public void S() {
        Z();
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = w();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator anim = it.next();
            if (runningAnimators.containsKey(anim)) {
                Z();
                R(anim, runningAnimators);
            }
        }
        this.C.clear();
        o();
    }

    public final void R(Animator animator, a.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.e.a f1382a;

        public b(a.e.a aVar) {
            this.f1382a = aVar;
        }

        public void onAnimationStart(Animator animation) {
            l.this.x.add(animation);
        }

        public void onAnimationEnd(Animator animation) {
            this.f1382a.remove(animation);
            l.this.x.remove(animation);
        }
    }

    public l b(View target) {
        this.f1381g.add(target);
        return this;
    }

    public l P(View target) {
        this.f1381g.remove(target);
        return this;
    }

    public List<Integer> y() {
        return this.f1380f;
    }

    public List<View> B() {
        return this.f1381g;
    }

    public List<String> z() {
        return this.h;
    }

    public List<Class> A() {
        return this.i;
    }

    public void j(ViewGroup sceneRoot, boolean start) {
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        k(start);
        if ((this.f1380f.size() > 0 || this.f1381g.size() > 0) && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f1380f.size(); i2++) {
                View view = sceneRoot.findViewById(this.f1380f.get(i2).intValue());
                if (view != null) {
                    r values = new r();
                    values.f1403b = view;
                    if (start) {
                        i(values);
                    } else {
                        f(values);
                    }
                    values.f1404c.add(this);
                    h(values);
                    if (start) {
                        d(this.q, view, values);
                    } else {
                        d(this.r, view, values);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f1381g.size(); i3++) {
                View view2 = this.f1381g.get(i3);
                r values2 = new r();
                values2.f1403b = view2;
                if (start) {
                    i(values2);
                } else {
                    f(values2);
                }
                values2.f1404c.add(this);
                h(values2);
                if (start) {
                    d(this.q, view2, values2);
                } else {
                    d(this.r, view2, values2);
                }
            }
        } else {
            g(sceneRoot, start);
        }
        if (!start) {
        }
    }

    public static void d(s transitionValuesMaps, View view, r transitionValues) {
        transitionValuesMaps.f1405a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.f1406b.indexOfKey(id) >= 0) {
                transitionValuesMaps.f1406b.put(id, null);
            } else {
                transitionValuesMaps.f1406b.put(id, view);
            }
        }
        String name = s.B(view);
        if (name != null) {
            if (transitionValuesMaps.f1408d.containsKey(name)) {
                transitionValuesMaps.f1408d.put(name, null);
            } else {
                transitionValuesMaps.f1408d.put(name, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listview = (ListView) view.getParent();
            if (listview.getAdapter().hasStableIds()) {
                long itemId = listview.getItemIdAtPosition(listview.getPositionForView(view));
                if (transitionValuesMaps.f1407c.h(itemId) >= 0) {
                    View alreadyMatched = transitionValuesMaps.f1407c.f(itemId);
                    if (alreadyMatched != null) {
                        s.g0(alreadyMatched, false);
                        transitionValuesMaps.f1407c.j(itemId, null);
                        return;
                    }
                    return;
                }
                s.g0(view, true);
                transitionValuesMaps.f1407c.j(itemId, view);
            }
        }
    }

    public void k(boolean start) {
        if (start) {
            this.q.f1405a.clear();
            this.q.f1406b.clear();
            this.q.f1407c.b();
            return;
        }
        this.r.f1405a.clear();
        this.r.f1406b.clear();
        this.r.f1407c.b();
    }

    public final void g(View view, boolean start) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.l;
                    if (arrayList3 != null) {
                        int numTypes = arrayList3.size();
                        for (int i2 = 0; i2 < numTypes; i2++) {
                            if (this.l.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        r values = new r();
                        values.f1403b = view;
                        if (start) {
                            i(values);
                        } else {
                            f(values);
                        }
                        values.f1404c.add(this);
                        h(values);
                        if (start) {
                            d(this.q, view, values);
                        } else {
                            d(this.r, view, values);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.p;
                                if (arrayList6 != null) {
                                    int numTypes2 = arrayList6.size();
                                    for (int i3 = 0; i3 < numTypes2; i3++) {
                                        if (this.p.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup parent = (ViewGroup) view;
                                for (int i4 = 0; i4 < parent.getChildCount(); i4++) {
                                    g(parent.getChildAt(i4), start);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public r D(View view, boolean start) {
        p pVar = this.s;
        if (pVar != null) {
            return pVar.D(view, start);
        }
        return (start ? this.q : this.r).f1405a.get(view);
    }

    public r s(View view, boolean viewInStart) {
        p pVar = this.s;
        if (pVar != null) {
            return pVar.s(view, viewInStart);
        }
        ArrayList<TransitionValues> lookIn = viewInStart ? this.u : this.v;
        if (lookIn == null) {
            return null;
        }
        int count = lookIn.size();
        int index = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= count) {
                break;
            }
            r values = (r) lookIn.get(i2);
            if (values == null) {
                return null;
            }
            if (values.f1403b == view) {
                index = i2;
                break;
            }
            i2++;
        }
        if (index < 0) {
            return null;
        }
        return (viewInStart ? this.v : this.u).get(index);
    }

    public void M(View sceneRoot) {
        if (!this.A) {
            ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = w();
            int numOldAnims = runningAnimators.size();
            h0 windowId = z.e(sceneRoot);
            for (int i2 = numOldAnims - 1; i2 >= 0; i2--) {
                d info = runningAnimators.m(i2);
                if (info.f1385a != null && windowId.equals(info.f1388d)) {
                    a.b(runningAnimators.i(i2));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.B.clone();
                int numListeners = tmpListeners.size();
                for (int i3 = 0; i3 < numListeners; i3++) {
                    ((f) tmpListeners.get(i3)).a(this);
                }
            }
            this.z = true;
        }
    }

    public void Q(View sceneRoot) {
        if (this.z) {
            if (!this.A) {
                ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = w();
                int numOldAnims = runningAnimators.size();
                h0 windowId = z.e(sceneRoot);
                for (int i2 = numOldAnims - 1; i2 >= 0; i2--) {
                    d info = runningAnimators.m(i2);
                    if (info.f1385a != null && windowId.equals(info.f1388d)) {
                        a.c(runningAnimators.i(i2));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.B.clone();
                    int numListeners = tmpListeners.size();
                    for (int i3 = 0; i3 < numListeners; i3++) {
                        ((f) tmpListeners.get(i3)).b(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public void N(ViewGroup sceneRoot) {
        d oldInfo;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        L(this.q, this.r);
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = w();
        int numOldAnims = runningAnimators.size();
        h0 windowId = z.e(sceneRoot);
        for (int i2 = numOldAnims - 1; i2 >= 0; i2--) {
            Animator anim = runningAnimators.i(i2);
            if (!(anim == null || (oldInfo = runningAnimators.get(anim)) == null || oldInfo.f1385a == null || !windowId.equals(oldInfo.f1388d))) {
                r oldValues = oldInfo.f1387c;
                View oldView = oldInfo.f1385a;
                boolean cancel = true;
                r startValues = D(oldView, true);
                r endValues = s(oldView, true);
                if ((startValues == null && endValues == null) || !oldInfo.f1389e.E(oldValues, endValues)) {
                    cancel = false;
                }
                if (cancel) {
                    if (anim.isRunning() || anim.isStarted()) {
                        anim.cancel();
                    } else {
                        runningAnimators.remove(anim);
                    }
                }
            }
        }
        n(sceneRoot, this.q, this.r, this.u, this.v);
        S();
    }

    public boolean E(r startValues, r endValues) {
        if (startValues == null || endValues == null) {
            return false;
        }
        String[] properties = C();
        if (properties != null) {
            for (String property : properties) {
                if (G(startValues, endValues, property)) {
                    return true;
                }
            }
            return false;
        }
        for (String key : startValues.f1402a.keySet()) {
            if (G(startValues, endValues, key)) {
                return true;
            }
        }
        return false;
    }

    public static boolean G(r oldValues, r newValues, String key) {
        Object oldValue = oldValues.f1402a.get(key);
        Object newValue = newValues.f1402a.get(key);
        if (oldValue == null && newValue == null) {
            return false;
        }
        if (oldValue == null || newValue == null) {
            return true;
        }
        return !oldValue.equals(newValue);
    }

    public void e(Animator animator) {
        if (animator == null) {
            o();
            return;
        }
        if (p() >= 0) {
            animator.setDuration(p());
        }
        if (x() >= 0) {
            animator.setStartDelay(x());
        }
        if (r() != null) {
            animator.setInterpolator(r());
        }
        animator.addListener(new c());
        animator.start();
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public void onAnimationEnd(Animator animation) {
            l.this.o();
            animation.removeListener(this);
        }
    }

    public void Z() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.B.clone();
                int numListeners = tmpListeners.size();
                for (int i2 = 0; i2 < numListeners; i2++) {
                    ((f) tmpListeners.get(i2)).c(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public void o() {
        int i2 = this.y - 1;
        this.y = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.B.clone();
                int numListeners = tmpListeners.size();
                for (int i3 = 0; i3 < numListeners; i3++) {
                    ((f) tmpListeners.get(i3)).d(this);
                }
            }
            for (int i4 = 0; i4 < this.q.f1407c.m(); i4++) {
                View view = this.q.f1407c.n(i4);
                if (view != null) {
                    s.g0(view, false);
                }
            }
            for (int i5 = 0; i5 < this.r.f1407c.m(); i5++) {
                View view2 = this.r.f1407c.n(i5);
                if (view2 != null) {
                    s.g0(view2, false);
                }
            }
            this.A = true;
        }
    }

    public l a(f listener) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(listener);
        return this;
    }

    public l O(f listener) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(listener);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public void W(g pathMotion) {
        if (pathMotion == null) {
            this.F = H;
        } else {
            this.F = pathMotion;
        }
    }

    public g u() {
        return this.F;
    }

    public void U(e epicenterCallback) {
        this.E = epicenterCallback;
    }

    public e q() {
        return this.E;
    }

    public void X(o transitionPropagation) {
        this.D = transitionPropagation;
    }

    public void v() {
    }

    public void h(r transitionValues) {
    }

    public String toString() {
        return a0(BuildConfig.FLAVOR);
    }

    /* renamed from: l */
    public l clone() {
        try {
            l clone = (l) super.clone();
            clone.C = new ArrayList<>();
            clone.q = new s();
            clone.r = new s();
            clone.u = null;
            clone.v = null;
            return clone;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public String t() {
        return this.f1376b;
    }

    public String a0(String indent) {
        String result = indent + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1378d != -1) {
            result = result + "dur(" + this.f1378d + ") ";
        }
        if (this.f1377c != -1) {
            result = result + "dly(" + this.f1377c + ") ";
        }
        if (this.f1379e != null) {
            result = result + "interp(" + this.f1379e + ") ";
        }
        if (this.f1380f.size() <= 0 && this.f1381g.size() <= 0) {
            return result;
        }
        String result2 = result + "tgts(";
        if (this.f1380f.size() > 0) {
            for (int i2 = 0; i2 < this.f1380f.size(); i2++) {
                if (i2 > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f1380f.get(i2);
            }
        }
        if (this.f1381g.size() > 0) {
            for (int i3 = 0; i3 < this.f1381g.size(); i3++) {
                if (i3 > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f1381g.get(i3);
            }
        }
        return result2 + ")";
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f1385a;

        /* renamed from: b  reason: collision with root package name */
        public String f1386b;

        /* renamed from: c  reason: collision with root package name */
        public r f1387c;

        /* renamed from: d  reason: collision with root package name */
        public h0 f1388d;

        /* renamed from: e  reason: collision with root package name */
        public l f1389e;

        public d(View view, String name, l transition, h0 windowId, r values) {
            this.f1385a = view;
            this.f1386b = name;
            this.f1387c = values;
            this.f1388d = windowId;
            this.f1389e = transition;
        }
    }
}
