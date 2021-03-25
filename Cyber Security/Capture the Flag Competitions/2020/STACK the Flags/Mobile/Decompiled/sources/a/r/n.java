package a.r;

import a.h.m.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import androidx.transition.Transition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static l f1390a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<a.e.a<ViewGroup, ArrayList<l>>>> f1391b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f1392c = new ArrayList<>();

    public static a.e.a<ViewGroup, ArrayList<l>> b() {
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> runningTransitions = f1391b.get();
        if (runningTransitions != null && (transitions = (a.e.a) runningTransitions.get()) != null) {
            return transitions;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions2 = new a.e.a<>();
        f1391b.set(new WeakReference<>(transitions2));
        return transitions2;
    }

    public static void c(ViewGroup sceneRoot, l transition) {
        if (transition != null && sceneRoot != null) {
            a listener = new a(transition, sceneRoot);
            sceneRoot.addOnAttachStateChangeListener(listener);
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(listener);
        }
    }

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public l f1393b;

        /* renamed from: c  reason: collision with root package name */
        public ViewGroup f1394c;

        public a(l transition, ViewGroup sceneRoot) {
            this.f1393b = transition;
            this.f1394c = sceneRoot;
        }

        public final void a() {
            this.f1394c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1394c.removeOnAttachStateChangeListener(this);
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            a();
            n.f1392c.remove(this.f1394c);
            ArrayList<Transition> runningTransitions = n.b().get(this.f1394c);
            if (runningTransitions != null && runningTransitions.size() > 0) {
                Iterator<Transition> it = runningTransitions.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).Q(this.f1394c);
                }
            }
            this.f1393b.k(true);
        }

        public boolean onPreDraw() {
            a();
            if (!n.f1392c.remove(this.f1394c)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition>> runningTransitions = n.b();
            ArrayList<l> currentTransitions = runningTransitions.get(this.f1394c);
            ArrayList<Transition> previousRunningTransitions = null;
            if (currentTransitions == null) {
                currentTransitions = new ArrayList<>();
                runningTransitions.put(this.f1394c, currentTransitions);
            } else if (currentTransitions.size() > 0) {
                previousRunningTransitions = new ArrayList<>(currentTransitions);
            }
            currentTransitions.add(this.f1393b);
            this.f1393b.a(new C0038a(runningTransitions));
            this.f1393b.j(this.f1394c, false);
            if (previousRunningTransitions != null) {
                Iterator<Transition> it = previousRunningTransitions.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).Q(this.f1394c);
                }
            }
            this.f1393b.N(this.f1394c);
            return true;
        }

        /* renamed from: a.r.n$a$a  reason: collision with other inner class name */
        public class C0038a extends m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a.e.a f1395a;

            public C0038a(a.e.a aVar) {
                this.f1395a = aVar;
            }

            @Override // a.r.l.f
            public void d(l transition) {
                ((ArrayList) this.f1395a.get(a.this.f1394c)).remove(transition);
            }
        }
    }

    public static void d(ViewGroup sceneRoot, l transition) {
        ArrayList<Transition> runningTransitions = b().get(sceneRoot);
        if (runningTransitions != null && runningTransitions.size() > 0) {
            Iterator<Transition> it = runningTransitions.iterator();
            while (it.hasNext()) {
                ((l) it.next()).M(sceneRoot);
            }
        }
        if (transition != null) {
            transition.j(sceneRoot, true);
        }
        k previousScene = k.b(sceneRoot);
        if (previousScene != null) {
            previousScene.a();
            throw null;
        }
    }

    public static void a(ViewGroup sceneRoot, l transition) {
        if (!f1392c.contains(sceneRoot) && s.K(sceneRoot)) {
            f1392c.add(sceneRoot);
            if (transition == null) {
                transition = f1390a;
            }
            l transitionClone = transition.clone();
            d(sceneRoot, transitionClone);
            k.c(sceneRoot, null);
            c(sceneRoot, transitionClone);
        }
    }
}
