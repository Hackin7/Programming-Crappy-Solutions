package p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ic */
public abstract class C0506ic {
    /* renamed from: a */
    static ArrayList<String> m1647a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C0396gq.m1268e(view));
            C0396gq.m1262a(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    protected static void m1648a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    protected static boolean m1649a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    static boolean m1650a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo2078a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2106a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String e = C0396gq.m1268e(view2);
            arrayList4.add(e);
            if (e != null) {
                C0396gq.m1262a(view2, (String) null);
                String str = (String) map.get(e);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0396gq.m1262a((View) arrayList2.get(i2), e);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C05071 r0 = new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    C0396gq.m1262a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C0396gq.m1262a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        };
        C0510id.m1670a(view, r0);
    }

    /* renamed from: a */
    public abstract void mo2079a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo2080a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2081a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2082a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2083a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo2084a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2085a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2107a(ArrayList<View> arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (VERSION.SDK_INT >= 21) {
                    z = viewGroup.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) viewGroup.getTag(C0304b.tag_transition_group);
                    z = ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0396gq.m1268e(viewGroup) == null) ? false : true;
                }
                if (z) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2107a(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2108a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String e = C0396gq.m1268e(view);
            if (e != null) {
                map.put(e, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2108a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2086a(Object obj);

    /* renamed from: b */
    public abstract Object mo2087b(Object obj);

    /* renamed from: b */
    public abstract Object mo2088b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2089b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2090b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo2091b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo2092c(Object obj);

    /* renamed from: c */
    public abstract void mo2093c(Object obj, View view);
}
