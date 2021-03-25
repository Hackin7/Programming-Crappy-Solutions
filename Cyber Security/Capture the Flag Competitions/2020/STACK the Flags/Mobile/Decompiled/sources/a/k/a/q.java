package a.k.a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class q extends r {
    @Override // a.k.a.r
    public boolean e(Object transition) {
        return transition instanceof Transition;
    }

    @Override // a.k.a.r
    public Object g(Object transition) {
        if (transition != null) {
            return ((Transition) transition).clone();
        }
        return null;
    }

    @Override // a.k.a.r
    public Object A(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    @Override // a.k.a.r
    public void y(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
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
            ((Transition) transitionObj).setEpicenterCallback(new a(this, epicenter));
        }
    }

    public class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1145a;

        public a(q this$0, Rect rect) {
            this.f1145a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f1145a;
        }
    }

    @Override // a.k.a.r
    public void b(Object transitionObj, ArrayList<View> views) {
        Transition transition = (Transition) transitionObj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet set = (TransitionSet) transition;
                int numTransitions = set.getTransitionCount();
                for (int i = 0; i < numTransitions; i++) {
                    b(set.getTransitionAt(i), views);
                }
            } else if (!B(transition) && r.l(transition.getTargets())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.addTarget(views.get(i2));
                }
            }
        }
    }

    public static boolean B(Transition transition) {
        return !r.l(transition.getTargetIds()) || !r.l(transition.getTargetNames()) || !r.l(transition.getTargetTypes());
    }

    @Override // a.k.a.r
    public Object n(Object transition1, Object transition2, Object transition3) {
        TransitionSet transitionSet = new TransitionSet();
        if (transition1 != null) {
            transitionSet.addTransition((Transition) transition1);
        }
        if (transition2 != null) {
            transitionSet.addTransition((Transition) transition2);
        }
        if (transition3 != null) {
            transitionSet.addTransition((Transition) transition3);
        }
        return transitionSet;
    }

    public class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1146a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1147b;

        public b(q this$0, View view, ArrayList arrayList) {
            this.f1146a = view;
            this.f1147b = arrayList;
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1146a.setVisibility(8);
            int numViews = this.f1147b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f1147b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // a.k.a.r
    public void r(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((Transition) exitTransitionObj).addListener(new b(this, fragmentView, exitingViews));
    }

    @Override // a.k.a.r
    public Object m(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        Transition staggered = null;
        Transition exitTransition = (Transition) exitTransitionObj;
        Transition enterTransition = (Transition) enterTransitionObj;
        Transition sharedElementTransition = (Transition) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            staggered = new TransitionSet().addTransition(exitTransition).addTransition(enterTransition).setOrdering(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        TransitionSet together = new TransitionSet();
        if (staggered != null) {
            together.addTransition(staggered);
        }
        together.addTransition(sharedElementTransition);
        return together;
    }

    @Override // a.k.a.r
    public void c(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    public class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f1148a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1149b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f1150c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1151d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f1152e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1153f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1148a = obj;
            this.f1149b = arrayList;
            this.f1150c = obj2;
            this.f1151d = arrayList2;
            this.f1152e = obj3;
            this.f1153f = arrayList3;
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f1148a;
            if (obj != null) {
                q.this.q(obj, this.f1149b, null);
            }
            Object obj2 = this.f1150c;
            if (obj2 != null) {
                q.this.q(obj2, this.f1151d, null);
            }
            Object obj3 = this.f1152e;
            if (obj3 != null) {
                q.this.q(obj3, this.f1153f, null);
            }
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // a.k.a.r
    public void t(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((Transition) overallTransitionObj).addListener(new c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // a.k.a.r
    public void z(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(sharedElementsIn);
            q(sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // a.k.a.r
    public void q(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        List<View> targets;
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                q(set.getTransitionAt(i), oldTargets, newTargets);
            }
        } else if (!B(transition) && (targets = transition.getTargets()) != null && targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
            int targetCount = newTargets == null ? 0 : newTargets.size();
            for (int i2 = 0; i2 < targetCount; i2++) {
                transition.addTarget(newTargets.get(i2));
            }
            for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                transition.removeTarget(oldTargets.get(i3));
            }
        }
    }

    @Override // a.k.a.r
    public void a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).addTarget(view);
        }
    }

    @Override // a.k.a.r
    public void p(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).removeTarget(view);
        }
    }

    @Override // a.k.a.r
    public void u(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((Transition) transitionObj).setEpicenterCallback(new d(this, epicenter));
        }
    }

    public class d extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1155a;

        public d(q this$0, Rect rect) {
            this.f1155a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1155a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1155a;
        }
    }
}
