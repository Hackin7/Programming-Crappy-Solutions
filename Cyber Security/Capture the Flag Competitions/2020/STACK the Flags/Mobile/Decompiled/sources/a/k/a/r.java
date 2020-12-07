package a.k.a;

import a.h.m.q;
import a.h.m.s;
import a.h.m.u;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
public abstract class r {
    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object g(Object obj);

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public void k(View view, Rect epicenter) {
        int[] loc = new int[2];
        view.getLocationOnScreen(loc);
        epicenter.set(loc[0], loc[1], loc[0] + view.getWidth(), loc[1] + view.getHeight());
    }

    public ArrayList<String> o(ArrayList<View> sharedElementsIn) {
        ArrayList<String> names = new ArrayList<>();
        int numSharedElements = sharedElementsIn.size();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsIn.get(i);
            names.add(s.B(view));
            s.n0(view, null);
        }
        return names;
    }

    public void x(View sceneRoot, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, ArrayList<String> inNames, Map<String, String> nameOverrides) {
        int numSharedElements = sharedElementsIn.size();
        ArrayList<String> outNames = new ArrayList<>();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsOut.get(i);
            String name = s.B(view);
            outNames.add(name);
            if (name != null) {
                s.n0(view, null);
                String inName = nameOverrides.get(name);
                int j = 0;
                while (true) {
                    if (j >= numSharedElements) {
                        break;
                    } else if (inName.equals(inNames.get(j))) {
                        s.n0(sharedElementsIn.get(j), name);
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        q.a(sceneRoot, new a(this, numSharedElements, sharedElementsIn, inNames, sharedElementsOut, outNames));
    }

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1156b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1157c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1158d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1159e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1160f;

        public a(r this$0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1156b = i;
            this.f1157c = arrayList;
            this.f1158d = arrayList2;
            this.f1159e = arrayList3;
            this.f1160f = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f1156b; i++) {
                s.n0((View) this.f1157c.get(i), (String) this.f1158d.get(i));
                s.n0((View) this.f1159e.get(i), (String) this.f1160f.get(i));
            }
        }
    }

    public void f(ArrayList<View> transitioningViews, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (u.a(viewGroup)) {
                transitioningViews.add(viewGroup);
                return;
            }
            int count = viewGroup.getChildCount();
            for (int i = 0; i < count; i++) {
                f(transitioningViews, viewGroup.getChildAt(i));
            }
            return;
        }
        transitioningViews.add(view);
    }

    public void j(Map<String, View> namedViews, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = s.B(view);
            if (transitionName != null) {
                namedViews.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int count = viewGroup.getChildCount();
                for (int i = 0; i < count; i++) {
                    j(namedViews, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1161b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Map f1162c;

        public b(r this$0, ArrayList arrayList, Map map) {
            this.f1161b = arrayList;
            this.f1162c = map;
        }

        public void run() {
            int numSharedElements = this.f1161b.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f1161b.get(i);
                String name = s.B(view);
                if (name != null) {
                    s.n0(view, r.i(this.f1162c, name));
                }
            }
        }
    }

    public void w(View sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        q.a(sceneRoot, new b(this, sharedElementsIn, nameOverrides));
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1163b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Map f1164c;

        public c(r this$0, ArrayList arrayList, Map map) {
            this.f1163b = arrayList;
            this.f1164c = map;
        }

        public void run() {
            int numSharedElements = this.f1163b.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f1163b.get(i);
                s.n0(view, (String) this.f1164c.get(s.B(view)));
            }
        }
    }

    public void s(ViewGroup sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        q.a(sceneRoot, new c(this, sharedElementsIn, nameOverrides));
    }

    public static void d(List<View> views, View startView) {
        int startIndex = views.size();
        if (!h(views, startView, startIndex)) {
            views.add(startView);
            for (int index = startIndex; index < views.size(); index++) {
                View view = views.get(index);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int childIndex = 0; childIndex < childCount; childIndex++) {
                        View child = viewGroup.getChildAt(childIndex);
                        if (!h(views, child, startIndex)) {
                            views.add(child);
                        }
                    }
                }
            }
        }
    }

    public static boolean h(List<View> views, View view, int maxIndex) {
        for (int i = 0; i < maxIndex; i++) {
            if (views.get(i) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public static String i(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
