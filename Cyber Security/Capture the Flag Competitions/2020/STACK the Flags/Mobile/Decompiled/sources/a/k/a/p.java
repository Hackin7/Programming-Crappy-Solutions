package a.k.a;

import a.h.d.f;
import a.h.m.q;
import a.h.m.s;
import a.k.a.o;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1117a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final r f1118b = new q();

    /* renamed from: c  reason: collision with root package name */
    public static final r f1119c = x();

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f1139a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1140b;

        /* renamed from: c  reason: collision with root package name */
        public a f1141c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f1142d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1143e;

        /* renamed from: f  reason: collision with root package name */
        public a f1144f;
    }

    public static r x() {
        try {
            return (r) Class.forName("a.r.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            return null;
        }
    }

    public static void C(j fragmentManager, ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, boolean isReordered) {
        if (fragmentManager.p >= 1) {
            SparseArray<FragmentTransition.FragmentContainerTransition> transitioningFragments = new SparseArray<>();
            for (int i = startIndex; i < endIndex; i++) {
                a record = arrayList.get(i);
                if (isRecordPop.get(i).booleanValue()) {
                    e(record, transitioningFragments, isReordered);
                } else {
                    c(record, transitioningFragments, isReordered);
                }
            }
            if (transitioningFragments.size() != 0) {
                View nonExistentView = new View(fragmentManager.q.e());
                int numContainers = transitioningFragments.size();
                for (int i2 = 0; i2 < numContainers; i2++) {
                    int containerId = transitioningFragments.keyAt(i2);
                    ArrayMap<String, String> nameOverrides = d(containerId, arrayList, isRecordPop, startIndex, endIndex);
                    e containerTransition = (e) transitioningFragments.valueAt(i2);
                    if (isReordered) {
                        o(fragmentManager, containerId, containerTransition, nonExistentView, nameOverrides);
                    } else {
                        n(fragmentManager, containerId, containerTransition, nonExistentView, nameOverrides);
                    }
                }
            }
        }
    }

    public static a.e.a<String, String> d(int containerId, ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        ArrayList<String> sources;
        ArrayList<String> targets;
        ArrayMap<String, String> nameOverrides = new a.e.a<>();
        for (int recordNum = endIndex - 1; recordNum >= startIndex; recordNum--) {
            a record = arrayList.get(recordNum);
            if (record.t(containerId)) {
                boolean isPop = isRecordPop.get(recordNum).booleanValue();
                ArrayList<String> arrayList2 = record.n;
                if (arrayList2 != null) {
                    int numSharedElements = arrayList2.size();
                    if (isPop) {
                        targets = record.n;
                        sources = record.o;
                    } else {
                        sources = record.n;
                        targets = record.o;
                    }
                    for (int i = 0; i < numSharedElements; i++) {
                        String sourceName = sources.get(i);
                        String targetName = targets.get(i);
                        String previousTarget = nameOverrides.remove(targetName);
                        if (previousTarget != null) {
                            nameOverrides.put(sourceName, previousTarget);
                        } else {
                            nameOverrides.put(sourceName, targetName);
                        }
                    }
                }
            }
        }
        return nameOverrides;
    }

    public static void o(j fragmentManager, int containerId, e fragments, View nonExistentView, a.e.a<String, String> aVar) {
        ViewGroup sceneRoot;
        Fragment inFragment;
        Fragment outFragment;
        r impl;
        Object exitTransition;
        if (fragmentManager.r.c()) {
            sceneRoot = (ViewGroup) fragmentManager.r.b(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = j((outFragment = fragments.f1142d), (inFragment = fragments.f1139a))) != null) {
            boolean inIsPop = fragments.f1140b;
            boolean outIsPop = fragments.f1143e;
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            Object enterTransition = r(impl, inFragment, inIsPop);
            Object exitTransition2 = s(impl, outFragment, outIsPop);
            Object sharedElementTransition = m(impl, sceneRoot, nonExistentView, aVar, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition2);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition2;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition2;
            }
            ArrayList<View> exitingViews = k(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            ArrayList<View> enteringViews = k(impl, enterTransition, inFragment, sharedElementsIn, nonExistentView);
            B(enteringViews, 4);
            Object transition = v(impl, enterTransition, exitTransition, sharedElementTransition, inFragment, inIsPop);
            if (transition != null) {
                w(impl, exitTransition, outFragment, exitingViews);
                ArrayList<String> inNames = impl.o(sharedElementsIn);
                impl.t(transition, enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn);
                impl.c(sceneRoot, transition);
                impl.x(sceneRoot, sharedElementsOut, sharedElementsIn, inNames, aVar);
                B(enteringViews, 0);
                impl.z(sharedElementTransition, sharedElementsOut, sharedElementsIn);
            }
        }
    }

    public static void w(r impl, Object exitTransition, Fragment exitingFragment, ArrayList<View> exitingViews) {
        if (exitingFragment != null && exitTransition != null && exitingFragment.mAdded && exitingFragment.mHidden && exitingFragment.mHiddenChanged) {
            exitingFragment.setHideReplaced(true);
            impl.r(exitTransition, exitingFragment.getView(), exitingViews);
            q.a(exitingFragment.mContainer, new a(exitingViews));
        }
    }

    public static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1120b;

        public a(ArrayList arrayList) {
            this.f1120b = arrayList;
        }

        public void run() {
            p.B(this.f1120b, 4);
        }
    }

    public static void n(j fragmentManager, int containerId, e fragments, View nonExistentView, a.e.a<String, String> aVar) {
        ViewGroup sceneRoot;
        Fragment inFragment;
        Fragment outFragment;
        r impl;
        Object exitTransition;
        Object exitTransition2;
        if (fragmentManager.r.c()) {
            sceneRoot = (ViewGroup) fragmentManager.r.b(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = j((outFragment = fragments.f1142d), (inFragment = fragments.f1139a))) != null) {
            boolean inIsPop = fragments.f1140b;
            boolean outIsPop = fragments.f1143e;
            Object enterTransition = r(impl, inFragment, inIsPop);
            Object exitTransition3 = s(impl, outFragment, outIsPop);
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            Object sharedElementTransition = l(impl, sceneRoot, nonExistentView, aVar, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition3);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition3;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition3;
            }
            ArrayList<View> exitingViews = k(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            if (exitingViews == null || exitingViews.isEmpty()) {
                exitTransition2 = null;
            } else {
                exitTransition2 = exitTransition;
            }
            impl.a(enterTransition, nonExistentView);
            Object transition = v(impl, enterTransition, exitTransition2, sharedElementTransition, inFragment, fragments.f1140b);
            if (transition != null) {
                ArrayList<View> enteringViews = new ArrayList<>();
                impl.t(transition, enterTransition, enteringViews, exitTransition2, exitingViews, sharedElementTransition, sharedElementsIn);
                z(impl, sceneRoot, inFragment, nonExistentView, sharedElementsIn, enterTransition, enteringViews, exitTransition2, exitingViews);
                impl.w(sceneRoot, sharedElementsIn, aVar);
                impl.c(sceneRoot, transition);
                impl.s(sceneRoot, sharedElementsIn, aVar);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f1121b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ r f1122c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ View f1123d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Fragment f1124e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1125f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1126g;
        public final /* synthetic */ ArrayList h;
        public final /* synthetic */ Object i;

        public b(Object obj, r rVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1121b = obj;
            this.f1122c = rVar;
            this.f1123d = view;
            this.f1124e = fragment;
            this.f1125f = arrayList;
            this.f1126g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        public void run() {
            Object obj = this.f1121b;
            if (obj != null) {
                this.f1122c.p(obj, this.f1123d);
                this.f1126g.addAll(p.k(this.f1122c, this.f1121b, this.f1124e, this.f1125f, this.f1123d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> tempExiting = new ArrayList<>();
                    tempExiting.add(this.f1123d);
                    this.f1122c.q(this.i, this.h, tempExiting);
                }
                this.h.clear();
                this.h.add(this.f1123d);
            }
        }
    }

    public static void z(r impl, ViewGroup sceneRoot, Fragment inFragment, View nonExistentView, ArrayList<View> sharedElementsIn, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews) {
        q.a(sceneRoot, new b(enterTransition, impl, nonExistentView, inFragment, sharedElementsIn, enteringViews, exitingViews, exitTransition));
    }

    public static r j(Fragment outFragment, Fragment inFragment) {
        ArrayList<Object> transitions = new ArrayList<>();
        if (outFragment != null) {
            Object exitTransition = outFragment.getExitTransition();
            if (exitTransition != null) {
                transitions.add(exitTransition);
            }
            Object returnTransition = outFragment.getReturnTransition();
            if (returnTransition != null) {
                transitions.add(returnTransition);
            }
            Object sharedReturnTransition = outFragment.getSharedElementReturnTransition();
            if (sharedReturnTransition != null) {
                transitions.add(sharedReturnTransition);
            }
        }
        if (inFragment != null) {
            Object enterTransition = inFragment.getEnterTransition();
            if (enterTransition != null) {
                transitions.add(enterTransition);
            }
            Object reenterTransition = inFragment.getReenterTransition();
            if (reenterTransition != null) {
                transitions.add(reenterTransition);
            }
            Object sharedEnterTransition = inFragment.getSharedElementEnterTransition();
            if (sharedEnterTransition != null) {
                transitions.add(sharedEnterTransition);
            }
        }
        if (transitions.isEmpty()) {
            return null;
        }
        r rVar = f1118b;
        if (rVar != null && g(rVar, transitions)) {
            return f1118b;
        }
        r rVar2 = f1119c;
        if (rVar2 != null && g(rVar2, transitions)) {
            return f1119c;
        }
        if (f1118b == null && f1119c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static boolean g(r impl, List<Object> transitions) {
        int size = transitions.size();
        for (int i = 0; i < size; i++) {
            if (!impl.e(transitions.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static Object u(r impl, Fragment inFragment, Fragment outFragment, boolean isPop) {
        Object obj;
        if (inFragment == null || outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.getSharedElementReturnTransition();
        } else {
            obj = inFragment.getSharedElementEnterTransition();
        }
        return impl.A(impl.g(obj));
    }

    public static Object r(r impl, Fragment inFragment, boolean isPop) {
        Object obj;
        if (inFragment == null) {
            return null;
        }
        if (isPop) {
            obj = inFragment.getReenterTransition();
        } else {
            obj = inFragment.getEnterTransition();
        }
        return impl.g(obj);
    }

    public static Object s(r impl, Fragment outFragment, boolean isPop) {
        Object obj;
        if (outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.getReturnTransition();
        } else {
            obj = outFragment.getExitTransition();
        }
        return impl.g(obj);
    }

    public static Object m(r impl, ViewGroup sceneRoot, View nonExistentView, a.e.a<String, String> aVar, e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Object sharedElementTransition3;
        View epicenterView;
        Rect epicenter;
        ArrayMap<String, View> inSharedElements;
        Fragment inFragment = fragments.f1139a;
        Fragment outFragment = fragments.f1142d;
        if (inFragment != null) {
            inFragment.requireView().setVisibility(0);
        }
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f1140b;
                if (aVar.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = u(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = i(impl, aVar, sharedElementTransition, fragments);
                ArrayMap<String, View> inSharedElements2 = h(impl, aVar, sharedElementTransition, fragments);
                if (aVar.isEmpty()) {
                    if (outSharedElements != null) {
                        outSharedElements.clear();
                    }
                    if (inSharedElements2 != null) {
                        inSharedElements2.clear();
                    }
                    sharedElementTransition2 = null;
                } else {
                    a(sharedElementsOut, outSharedElements, aVar.keySet());
                    a(sharedElementsIn, inSharedElements2, aVar.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                f(inFragment, outFragment, inIsPop, outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    sharedElementsIn.add(nonExistentView);
                    impl.y(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    A(impl, sharedElementTransition2, exitTransition, outSharedElements, fragments.f1143e, fragments.f1144f);
                    Rect epicenter2 = new Rect();
                    View epicenterView2 = t(inSharedElements, fragments, enterTransition, inIsPop);
                    if (epicenterView2 != null) {
                        impl.u(enterTransition, epicenter2);
                    }
                    epicenter = epicenter2;
                    epicenterView = epicenterView2;
                } else {
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    epicenter = null;
                    epicenterView = null;
                }
                q.a(sceneRoot, new c(inFragment, outFragment, inIsPop, inSharedElements, epicenterView, impl, epicenter));
                return sharedElementTransition3;
            }
        }
        return null;
    }

    public static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Fragment f1127b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Fragment f1128c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f1129d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a.e.a f1130e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f1131f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ r f1132g;
        public final /* synthetic */ Rect h;

        public c(Fragment fragment, Fragment fragment2, boolean z, a.e.a aVar, View view, r rVar, Rect rect) {
            this.f1127b = fragment;
            this.f1128c = fragment2;
            this.f1129d = z;
            this.f1130e = aVar;
            this.f1131f = view;
            this.f1132g = rVar;
            this.h = rect;
        }

        public void run() {
            p.f(this.f1127b, this.f1128c, this.f1129d, this.f1130e, false);
            View view = this.f1131f;
            if (view != null) {
                this.f1132g.k(view, this.h);
            }
        }
    }

    public static void a(ArrayList<View> views, a.e.a<String, View> aVar, Collection<String> nameOverridesSet) {
        for (int i = aVar.size() - 1; i >= 0; i--) {
            View view = aVar.m(i);
            if (nameOverridesSet.contains(s.B(view))) {
                views.add(view);
            }
        }
    }

    public static Object l(r impl, ViewGroup sceneRoot, View nonExistentView, a.e.a<String, String> aVar, e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Rect inEpicenter;
        Fragment inFragment = fragments.f1139a;
        Fragment outFragment = fragments.f1142d;
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f1140b;
                if (aVar.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = u(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = i(impl, aVar, sharedElementTransition, fragments);
                if (aVar.isEmpty()) {
                    sharedElementTransition2 = null;
                } else {
                    sharedElementsOut.addAll(outSharedElements.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                f(inFragment, outFragment, inIsPop, outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    Rect inEpicenter2 = new Rect();
                    impl.y(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    A(impl, sharedElementTransition2, exitTransition, outSharedElements, fragments.f1143e, fragments.f1144f);
                    if (enterTransition != null) {
                        impl.u(enterTransition, inEpicenter2);
                    }
                    inEpicenter = inEpicenter2;
                } else {
                    inEpicenter = null;
                }
                q.a(sceneRoot, new d(impl, aVar, sharedElementTransition2, fragments, sharedElementsIn, nonExistentView, inFragment, outFragment, inIsPop, sharedElementsOut, enterTransition, inEpicenter));
                return sharedElementTransition2;
            }
        }
        return null;
    }

    public static class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r f1133b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a.e.a f1134c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f1135d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e f1136e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1137f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ View f1138g;
        public final /* synthetic */ Fragment h;
        public final /* synthetic */ Fragment i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ ArrayList k;
        public final /* synthetic */ Object l;
        public final /* synthetic */ Rect m;

        public d(r rVar, a.e.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1133b = rVar;
            this.f1134c = aVar;
            this.f1135d = obj;
            this.f1136e = eVar;
            this.f1137f = arrayList;
            this.f1138g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        public void run() {
            ArrayMap<String, View> inSharedElements = p.h(this.f1133b, this.f1134c, this.f1135d, this.f1136e);
            if (inSharedElements != null) {
                this.f1137f.addAll(inSharedElements.values());
                this.f1137f.add(this.f1138g);
            }
            p.f(this.h, this.i, this.j, inSharedElements, false);
            Object obj = this.f1135d;
            if (obj != null) {
                this.f1133b.z(obj, this.k, this.f1137f);
                View inEpicenterView = p.t(inSharedElements, this.f1136e, this.l, this.j);
                if (inEpicenterView != null) {
                    this.f1133b.k(inEpicenterView, this.m);
                }
            }
        }
    }

    public static a.e.a<String, View> i(r impl, a.e.a<String, String> aVar, Object sharedElementTransition, e fragments) {
        ArrayList<String> names;
        f sharedElementCallback;
        if (aVar.isEmpty() || sharedElementTransition == null) {
            aVar.clear();
            return null;
        }
        Fragment outFragment = fragments.f1142d;
        ArrayMap<String, View> outSharedElements = new a.e.a<>();
        impl.j(outSharedElements, outFragment.requireView());
        a outTransaction = fragments.f1144f;
        if (fragments.f1143e) {
            sharedElementCallback = outFragment.getEnterTransitionCallback();
            names = outTransaction.o;
        } else {
            sharedElementCallback = outFragment.getExitTransitionCallback();
            names = outTransaction.n;
        }
        outSharedElements.o(names);
        if (sharedElementCallback != null) {
            sharedElementCallback.a(names, outSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = outSharedElements.get(name);
                if (view == null) {
                    aVar.remove(name);
                } else if (!name.equals(s.B(view))) {
                    aVar.put(s.B(view), aVar.remove(name));
                }
            }
        } else {
            aVar.o(outSharedElements.keySet());
        }
        return outSharedElements;
    }

    public static a.e.a<String, View> h(r impl, a.e.a<String, String> aVar, Object sharedElementTransition, e fragments) {
        ArrayList<String> names;
        f sharedElementCallback;
        String key;
        Fragment inFragment = fragments.f1139a;
        View fragmentView = inFragment.getView();
        if (aVar.isEmpty() || sharedElementTransition == null || fragmentView == null) {
            aVar.clear();
            return null;
        }
        ArrayMap<String, View> inSharedElements = new a.e.a<>();
        impl.j(inSharedElements, fragmentView);
        a inTransaction = fragments.f1141c;
        if (fragments.f1140b) {
            sharedElementCallback = inFragment.getExitTransitionCallback();
            names = inTransaction.n;
        } else {
            sharedElementCallback = inFragment.getEnterTransitionCallback();
            names = inTransaction.o;
        }
        if (names != null) {
            inSharedElements.o(names);
            inSharedElements.o(aVar.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.a(names, inSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = inSharedElements.get(name);
                if (view == null) {
                    String key2 = q(aVar, name);
                    if (key2 != null) {
                        aVar.remove(key2);
                    }
                } else if (!name.equals(s.B(view)) && (key = q(aVar, name)) != null) {
                    aVar.put(key, s.B(view));
                }
            }
        } else {
            y(aVar, inSharedElements);
        }
        return inSharedElements;
    }

    public static String q(a.e.a<String, String> aVar, String value) {
        int numElements = aVar.size();
        for (int i = 0; i < numElements; i++) {
            if (value.equals(aVar.m(i))) {
                return aVar.i(i);
            }
        }
        return null;
    }

    public static View t(a.e.a<String, View> aVar, e fragments, Object enterTransition, boolean inIsPop) {
        ArrayList<String> arrayList;
        String targetName;
        a inTransaction = fragments.f1141c;
        if (enterTransition == null || aVar == null || (arrayList = inTransaction.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (inIsPop) {
            targetName = inTransaction.n.get(0);
        } else {
            targetName = inTransaction.o.get(0);
        }
        return aVar.get(targetName);
    }

    public static void A(r impl, Object sharedElementTransition, Object exitTransition, a.e.a<String, View> aVar, boolean outIsPop, a outTransaction) {
        String sourceName;
        ArrayList<String> arrayList = outTransaction.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (outIsPop) {
                sourceName = outTransaction.o.get(0);
            } else {
                sourceName = outTransaction.n.get(0);
            }
            View outEpicenterView = aVar.get(sourceName);
            impl.v(sharedElementTransition, outEpicenterView);
            if (exitTransition != null) {
                impl.v(exitTransition, outEpicenterView);
            }
        }
    }

    public static void y(a.e.a<String, String> aVar, a.e.a<String, View> aVar2) {
        for (int i = aVar.size() - 1; i >= 0; i--) {
            if (!aVar2.containsKey(aVar.m(i))) {
                aVar.k(i);
            }
        }
    }

    public static void f(Fragment inFragment, Fragment outFragment, boolean isPop, a.e.a<String, View> aVar, boolean isStart) {
        f sharedElementCallback;
        if (isPop) {
            sharedElementCallback = outFragment.getEnterTransitionCallback();
        } else {
            sharedElementCallback = inFragment.getEnterTransitionCallback();
        }
        if (sharedElementCallback != null) {
            ArrayList<View> views = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            int count = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < count; i++) {
                names.add(aVar.i(i));
                views.add(aVar.m(i));
            }
            if (isStart) {
                sharedElementCallback.c(names, views, null);
            } else {
                sharedElementCallback.b(names, views, null);
            }
        }
    }

    public static ArrayList<View> k(r impl, Object transition, Fragment fragment, ArrayList<View> sharedElements, View nonExistentView) {
        ArrayList<View> viewList = null;
        if (transition != null) {
            viewList = new ArrayList<>();
            View root = fragment.getView();
            if (root != null) {
                impl.f(viewList, root);
            }
            if (sharedElements != null) {
                viewList.removeAll(sharedElements);
            }
            if (!viewList.isEmpty()) {
                viewList.add(nonExistentView);
                impl.b(transition, viewList);
            }
        }
        return viewList;
    }

    public static void B(ArrayList<View> views, int visibility) {
        if (views != null) {
            for (int i = views.size() - 1; i >= 0; i--) {
                views.get(i).setVisibility(visibility);
            }
        }
    }

    public static Object v(r impl, Object enterTransition, Object exitTransition, Object sharedElementTransition, Fragment inFragment, boolean isPop) {
        boolean z;
        boolean overlap = true;
        if (!(enterTransition == null || exitTransition == null || inFragment == null)) {
            if (isPop) {
                z = inFragment.getAllowReturnTransitionOverlap();
            } else {
                z = inFragment.getAllowEnterTransitionOverlap();
            }
            overlap = z;
        }
        if (overlap) {
            return impl.n(exitTransition, enterTransition, sharedElementTransition);
        }
        return impl.m(exitTransition, enterTransition, sharedElementTransition);
    }

    public static void c(a transaction, SparseArray<e> sparseArray, boolean isReordered) {
        int numOps = transaction.f1103a.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            b(transaction, transaction.f1103a.get(opNum), sparseArray, false, isReordered);
        }
    }

    public static void e(a transaction, SparseArray<e> sparseArray, boolean isReordered) {
        if (transaction.r.r.c()) {
            for (int opNum = transaction.f1103a.size() - 1; opNum >= 0; opNum--) {
                b(transaction, transaction.f1103a.get(opNum), sparseArray, true, isReordered);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x012d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0114  */
    public static void b(a transaction, o.a op, SparseArray<e> sparseArray, boolean isPop, boolean isReorderedTransaction) {
        int containerId;
        boolean wasAdded;
        boolean setFirstOut;
        boolean wasRemoved;
        boolean setLastIn;
        e containerTransition;
        e containerTransition2;
        Fragment fragment;
        e containerTransition3;
        e containerTransition4;
        boolean setLastIn2;
        boolean setFirstOut2;
        View view;
        boolean setFirstOut3;
        boolean setLastIn3;
        Fragment fragment2 = op.f1111b;
        if (fragment2 != null && (containerId = fragment2.mContainerId) != 0) {
            int command = isPop ? f1117a[op.f1110a] : op.f1110a;
            boolean z = false;
            if (command != 1) {
                if (command != 3) {
                    if (command == 4) {
                        if (isReorderedTransaction) {
                            if (fragment2.mHiddenChanged && fragment2.mAdded && fragment2.mHidden) {
                                z = true;
                            }
                            setFirstOut3 = z;
                        } else {
                            if (fragment2.mAdded && !fragment2.mHidden) {
                                z = true;
                            }
                            setFirstOut3 = z;
                        }
                        setLastIn = false;
                        wasRemoved = true;
                        setFirstOut = setFirstOut3;
                        wasAdded = false;
                    } else if (command == 5) {
                        if (isReorderedTransaction) {
                            if (fragment2.mHiddenChanged && !fragment2.mHidden && fragment2.mAdded) {
                                z = true;
                            }
                            setLastIn3 = z;
                        } else {
                            setLastIn3 = fragment2.mHidden;
                        }
                        setLastIn = setLastIn3;
                        wasRemoved = false;
                        setFirstOut = false;
                        wasAdded = true;
                    } else if (command != 6) {
                        if (command != 7) {
                            setLastIn = false;
                            wasRemoved = false;
                            setFirstOut = false;
                            wasAdded = false;
                        }
                    }
                    e containerTransition5 = sparseArray.get(containerId);
                    if (setLastIn) {
                        e containerTransition6 = p(containerTransition5, sparseArray, containerId);
                        containerTransition6.f1139a = fragment2;
                        containerTransition6.f1140b = isPop;
                        containerTransition6.f1141c = transaction;
                        containerTransition = containerTransition6;
                    } else {
                        containerTransition = containerTransition5;
                    }
                    if (!isReorderedTransaction || !wasAdded) {
                        fragment = null;
                        containerTransition2 = containerTransition;
                    } else {
                        if (containerTransition != null && containerTransition.f1142d == fragment2) {
                            containerTransition.f1142d = null;
                        }
                        j manager = transaction.r;
                        if (fragment2.mState >= 1 || manager.p < 1 || transaction.p) {
                            fragment = null;
                            containerTransition2 = containerTransition;
                        } else {
                            manager.L0(fragment2);
                            containerTransition2 = containerTransition;
                            fragment = null;
                            manager.T0(fragment2, 1, 0, 0, false);
                        }
                    }
                    if (setFirstOut) {
                        containerTransition4 = containerTransition2;
                        if (containerTransition4 == null || containerTransition4.f1142d == null) {
                            containerTransition3 = p(containerTransition4, sparseArray, containerId);
                            containerTransition3.f1142d = fragment2;
                            containerTransition3.f1143e = isPop;
                            containerTransition3.f1144f = transaction;
                            if (!isReorderedTransaction && wasRemoved && containerTransition3 != null && containerTransition3.f1139a == fragment2) {
                                containerTransition3.f1139a = fragment;
                                return;
                            }
                            return;
                        }
                    } else {
                        containerTransition4 = containerTransition2;
                    }
                    containerTransition3 = containerTransition4;
                    if (!isReorderedTransaction) {
                        return;
                    }
                    return;
                }
                if (isReorderedTransaction) {
                    if (!fragment2.mAdded && (view = fragment2.mView) != null && view.getVisibility() == 0 && fragment2.mPostponedAlpha >= 0.0f) {
                        z = true;
                    }
                    setFirstOut2 = z;
                } else {
                    if (fragment2.mAdded && !fragment2.mHidden) {
                        z = true;
                    }
                    setFirstOut2 = z;
                }
                setLastIn = false;
                wasRemoved = true;
                setFirstOut = setFirstOut2;
                wasAdded = false;
                e containerTransition52 = sparseArray.get(containerId);
                if (setLastIn) {
                }
                if (!isReorderedTransaction) {
                }
                fragment = null;
                containerTransition2 = containerTransition;
                if (setFirstOut) {
                }
                containerTransition3 = containerTransition4;
                if (!isReorderedTransaction) {
                }
            }
            if (isReorderedTransaction) {
                setLastIn2 = fragment2.mIsNewlyAdded;
            } else {
                if (!fragment2.mAdded && !fragment2.mHidden) {
                    z = true;
                }
                setLastIn2 = z;
            }
            setLastIn = setLastIn2;
            wasRemoved = false;
            setFirstOut = false;
            wasAdded = true;
            e containerTransition522 = sparseArray.get(containerId);
            if (setLastIn) {
            }
            if (!isReorderedTransaction) {
            }
            fragment = null;
            containerTransition2 = containerTransition;
            if (setFirstOut) {
            }
            containerTransition3 = containerTransition4;
            if (!isReorderedTransaction) {
            }
        }
    }

    public static e p(e containerTransition, SparseArray<e> sparseArray, int containerId) {
        if (containerTransition != null) {
            return containerTransition;
        }
        e containerTransition2 = new e();
        sparseArray.put(containerId, containerTransition2);
        return containerTransition2;
    }
}
