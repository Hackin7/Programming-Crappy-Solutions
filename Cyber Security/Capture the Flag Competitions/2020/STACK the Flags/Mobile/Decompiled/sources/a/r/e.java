package a.r;

import a.k.a.r;
import a.r.l;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class e extends r {
    @Override // a.k.a.r
    public boolean e(Object transition) {
        return transition instanceof l;
    }

    @Override // a.k.a.r
    public Object g(Object transition) {
        if (transition != null) {
            return ((l) transition).clone();
        }
        return null;
    }

    @Override // a.k.a.r
    public Object A(Object transition) {
        if (transition == null) {
            return null;
        }
        p transitionSet = new p();
        transitionSet.d0((l) transition);
        return transitionSet;
    }

    @Override // a.k.a.r
    public void y(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        p transition = (p) transitionObj;
        List<View> views = transition.B();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            r.d(views, sharedViews.get(i));
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        b(transition, sharedViews);
    }

    @Override // a.k.a.r
    public void v(Object transitionObj, View view) {
        if (view != null) {
            Rect epicenter = new Rect();
            k(view, epicenter);
            ((l) transitionObj).U(new a(this, epicenter));
        }
    }

    public class a extends l.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1350a;

        public a(e this$0, Rect rect) {
            this.f1350a = rect;
        }
    }

    @Override // a.k.a.r
    public void b(Object transitionObj, ArrayList<View> views) {
        l transition = (l) transitionObj;
        if (transition != null) {
            if (transition instanceof p) {
                p set = (p) transition;
                int numTransitions = set.f0();
                for (int i = 0; i < numTransitions; i++) {
                    b(set.e0(i), views);
                }
            } else if (!B(transition) && r.l(transition.B())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.b(views.get(i2));
                }
            }
        }
    }

    public static boolean B(l transition) {
        return !r.l(transition.y()) || !r.l(transition.z()) || !r.l(transition.A());
    }

    @Override // a.k.a.r
    public Object n(Object transition1, Object transition2, Object transition3) {
        p transitionSet = new p();
        if (transition1 != null) {
            transitionSet.d0((l) transition1);
        }
        if (transition2 != null) {
            transitionSet.d0((l) transition2);
        }
        if (transition3 != null) {
            transitionSet.d0((l) transition3);
        }
        return transitionSet;
    }

    public class b implements l.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1351a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1352b;

        public b(e this$0, View view, ArrayList arrayList) {
            this.f1351a = view;
            this.f1352b = arrayList;
        }

        @Override // a.r.l.f
        public void c(l transition) {
        }

        @Override // a.r.l.f
        public void d(l transition) {
            transition.O(this);
            this.f1351a.setVisibility(8);
            int numViews = this.f1352b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f1352b.get(i)).setVisibility(0);
            }
        }

        @Override // a.r.l.f
        public void a(l transition) {
        }

        @Override // a.r.l.f
        public void b(l transition) {
        }
    }

    @Override // a.k.a.r
    public void r(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((l) exitTransitionObj).a(new b(this, fragmentView, exitingViews));
    }

    @Override // a.k.a.r
    public Object m(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        l staggered = null;
        l exitTransition = (l) exitTransitionObj;
        l enterTransition = (l) enterTransitionObj;
        l sharedElementTransition = (l) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            p pVar = new p();
            pVar.d0(exitTransition);
            pVar.d0(enterTransition);
            staggered = pVar.k0(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        p together = new p();
        if (staggered != null) {
            together.d0(staggered);
        }
        together.d0(sharedElementTransition);
        return together;
    }

    @Override // a.k.a.r
    public void c(ViewGroup sceneRoot, Object transition) {
        n.a(sceneRoot, (l) transition);
    }

    public class c implements l.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f1353a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1354b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f1355c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1356d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f1357e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1358f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1353a = obj;
            this.f1354b = arrayList;
            this.f1355c = obj2;
            this.f1356d = arrayList2;
            this.f1357e = obj3;
            this.f1358f = arrayList3;
        }

        @Override // a.r.l.f
        public void c(l transition) {
            Object obj = this.f1353a;
            if (obj != null) {
                e.this.q(obj, this.f1354b, null);
            }
            Object obj2 = this.f1355c;
            if (obj2 != null) {
                e.this.q(obj2, this.f1356d, null);
            }
            Object obj3 = this.f1357e;
            if (obj3 != null) {
                e.this.q(obj3, this.f1358f, null);
            }
        }

        @Override // a.r.l.f
        public void d(l transition) {
        }

        @Override // a.r.l.f
        public void a(l transition) {
        }

        @Override // a.r.l.f
        public void b(l transition) {
        }
    }

    @Override // a.k.a.r
    public void t(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((l) overallTransitionObj).a(new c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // a.k.a.r
    public void z(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        p sharedElementTransition = (p) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.B().clear();
            sharedElementTransition.B().addAll(sharedElementsIn);
            q(sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // a.k.a.r
    public void q(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        l transition = (l) transitionObj;
        if (transition instanceof p) {
            p set = (p) transition;
            int numTransitions = set.f0();
            for (int i = 0; i < numTransitions; i++) {
                q(set.e0(i), oldTargets, newTargets);
            }
        } else if (!B(transition)) {
            List<View> targets = transition.B();
            if (targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
                int targetCount = newTargets == null ? 0 : newTargets.size();
                for (int i2 = 0; i2 < targetCount; i2++) {
                    transition.b(newTargets.get(i2));
                }
                for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                    transition.P(oldTargets.get(i3));
                }
            }
        }
    }

    @Override // a.k.a.r
    public void a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((l) transitionObj).b(view);
        }
    }

    @Override // a.k.a.r
    public void p(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((l) transitionObj).P(view);
        }
    }

    @Override // a.k.a.r
    public void u(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((l) transitionObj).U(new d(this, epicenter));
        }
    }

    public class d extends l.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1360a;

        public d(e this$0, Rect rect) {
            this.f1360a = rect;
        }
    }
}
