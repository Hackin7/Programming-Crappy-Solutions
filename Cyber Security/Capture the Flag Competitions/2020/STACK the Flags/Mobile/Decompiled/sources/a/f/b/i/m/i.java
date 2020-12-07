package a.f.b.i.m;

import a.f.b.i.a;
import a.f.b.i.d;
import a.f.b.i.e;
import a.f.b.i.f;
import a.f.b.i.g;
import a.f.b.i.m.b;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class i {
    public static boolean d(e.a layoutHorizontal, e.a layoutVertical, e.a widgetHorizontal, e.a widgetVertical) {
        return (widgetHorizontal == e.a.FIXED || widgetHorizontal == e.a.WRAP_CONTENT || (widgetHorizontal == e.a.MATCH_PARENT && layoutHorizontal != e.a.WRAP_CONTENT)) || (widgetVertical == e.a.FIXED || widgetVertical == e.a.WRAP_CONTENT || (widgetVertical == e.a.MATCH_PARENT && layoutVertical != e.a.WRAP_CONTENT));
    }

    public static boolean c(f layout, b.AbstractC0011b measurer) {
        ArrayList<ConstraintWidget> children = layout.Z0();
        int count = children.size();
        ArrayList<Guideline> verticalGuidelines = null;
        ArrayList<Guideline> horizontalGuidelines = null;
        ArrayList<HelperWidget> horizontalBarriers = null;
        ArrayList<HelperWidget> verticalBarriers = null;
        ArrayList<ConstraintWidget> isolatedHorizontalChildren = null;
        ArrayList<ConstraintWidget> isolatedVerticalChildren = null;
        for (int i = 0; i < count; i++) {
            e child = (e) children.get(i);
            if (!d(layout.w(), layout.M(), child.w(), child.M())) {
                return false;
            }
        }
        for (int i2 = 0; i2 < count; i2++) {
            e child2 = children.get(i2);
            if (!d(layout.w(), layout.M(), child2.w(), child2.M())) {
                f.z1(child2, measurer, layout.J0, false);
            }
            if (child2 instanceof g) {
                g guideline = (g) child2;
                if (guideline.Z0() == 0) {
                    if (horizontalGuidelines == null) {
                        horizontalGuidelines = new ArrayList<>();
                    }
                    horizontalGuidelines.add(guideline);
                }
                if (guideline.Z0() == 1) {
                    if (verticalGuidelines == null) {
                        verticalGuidelines = new ArrayList<>();
                    }
                    verticalGuidelines.add(guideline);
                }
            }
            if (child2 instanceof a.f.b.i.i) {
                if (child2 instanceof a) {
                    a barrier = (a) child2;
                    if (barrier.g1() == 0) {
                        if (horizontalBarriers == null) {
                            horizontalBarriers = new ArrayList<>();
                        }
                        horizontalBarriers.add(barrier);
                    }
                    if (barrier.g1() == 1) {
                        if (verticalBarriers == null) {
                            verticalBarriers = new ArrayList<>();
                        }
                        verticalBarriers.add(barrier);
                    }
                } else {
                    a.f.b.i.i helper = (a.f.b.i.i) child2;
                    if (horizontalBarriers == null) {
                        horizontalBarriers = new ArrayList<>();
                    }
                    horizontalBarriers.add(helper);
                    if (verticalBarriers == null) {
                        verticalBarriers = new ArrayList<>();
                    }
                    verticalBarriers.add(helper);
                }
            }
            if (child2.G.f613f == null && child2.I.f613f == null && !(child2 instanceof g) && !(child2 instanceof a)) {
                if (isolatedHorizontalChildren == null) {
                    isolatedHorizontalChildren = new ArrayList<>();
                }
                isolatedHorizontalChildren.add(child2);
            }
            if (child2.H.f613f == null && child2.J.f613f == null && child2.K.f613f == null && !(child2 instanceof g) && !(child2 instanceof a)) {
                if (isolatedVerticalChildren == null) {
                    isolatedVerticalChildren = new ArrayList<>();
                }
                isolatedVerticalChildren.add(child2);
            }
        }
        ArrayList<WidgetGroup> allDependencyLists = new ArrayList<>();
        if (verticalGuidelines != null) {
            Iterator<Guideline> it = verticalGuidelines.iterator();
            while (it.hasNext()) {
                a((g) it.next(), 0, allDependencyLists, null);
            }
        }
        if (horizontalBarriers != null) {
            Iterator<HelperWidget> it2 = horizontalBarriers.iterator();
            while (it2.hasNext()) {
                a.f.b.i.i barrier2 = (a.f.b.i.i) it2.next();
                o group = a(barrier2, 0, allDependencyLists, null);
                barrier2.Z0(allDependencyLists, 0, group);
                group.b(allDependencyLists);
                verticalGuidelines = verticalGuidelines;
            }
        }
        d left = layout.k(d.a.LEFT);
        if (left.c() != null) {
            Iterator<d> it3 = left.c().iterator();
            while (it3.hasNext()) {
                a(it3.next().f611d, 0, allDependencyLists, null);
                left = left;
            }
        }
        d right = layout.k(d.a.RIGHT);
        if (right.c() != null) {
            Iterator<d> it4 = right.c().iterator();
            while (it4.hasNext()) {
                a(it4.next().f611d, 0, allDependencyLists, null);
                right = right;
            }
        }
        d center = layout.k(d.a.CENTER);
        if (center.c() != null) {
            Iterator<d> it5 = center.c().iterator();
            while (it5.hasNext()) {
                a(it5.next().f611d, 0, allDependencyLists, null);
                center = center;
            }
        }
        if (isolatedHorizontalChildren != null) {
            Iterator<ConstraintWidget> it6 = isolatedHorizontalChildren.iterator();
            while (it6.hasNext()) {
                a((e) it6.next(), 0, allDependencyLists, null);
            }
        }
        if (horizontalGuidelines != null) {
            Iterator<Guideline> it7 = horizontalGuidelines.iterator();
            while (it7.hasNext()) {
                a((g) it7.next(), 1, allDependencyLists, null);
            }
        }
        if (verticalBarriers != null) {
            Iterator<HelperWidget> it8 = verticalBarriers.iterator();
            while (it8.hasNext()) {
                a.f.b.i.i barrier3 = (a.f.b.i.i) it8.next();
                o group2 = a(barrier3, 1, allDependencyLists, null);
                barrier3.Z0(allDependencyLists, 1, group2);
                group2.b(allDependencyLists);
            }
        }
        d top = layout.k(d.a.TOP);
        if (top.c() != null) {
            Iterator<d> it9 = top.c().iterator();
            while (it9.hasNext()) {
                a(it9.next().f611d, 1, allDependencyLists, null);
                horizontalGuidelines = horizontalGuidelines;
            }
        }
        d baseline = layout.k(d.a.BASELINE);
        if (baseline.c() != null) {
            Iterator<d> it10 = baseline.c().iterator();
            while (it10.hasNext()) {
                a(it10.next().f611d, 1, allDependencyLists, null);
                baseline = baseline;
            }
        }
        d bottom = layout.k(d.a.BOTTOM);
        if (bottom.c() != null) {
            Iterator<d> it11 = bottom.c().iterator();
            while (it11.hasNext()) {
                a(it11.next().f611d, 1, allDependencyLists, null);
                bottom = bottom;
            }
        }
        d center2 = layout.k(d.a.CENTER);
        if (center2.c() != null) {
            Iterator<d> it12 = center2.c().iterator();
            while (it12.hasNext()) {
                a(it12.next().f611d, 1, allDependencyLists, null);
                center2 = center2;
            }
        }
        if (isolatedVerticalChildren != null) {
            Iterator<ConstraintWidget> it13 = isolatedVerticalChildren.iterator();
            while (it13.hasNext()) {
                a((e) it13.next(), 1, allDependencyLists, null);
            }
        }
        for (int i3 = 0; i3 < count; i3++) {
            e child3 = (e) children.get(i3);
            if (child3.e0()) {
                o horizontalGroup = b(allDependencyLists, child3.n0);
                o verticalGroup = b(allDependencyLists, child3.o0);
                if (!(horizontalGroup == null || verticalGroup == null)) {
                    horizontalGroup.g(0, verticalGroup);
                    verticalGroup.i(2);
                    allDependencyLists.remove(horizontalGroup);
                }
            }
        }
        if (allDependencyLists.size() <= 1) {
            return false;
        }
        o horizontalPick = null;
        o verticalPick = null;
        if (layout.w() == e.a.WRAP_CONTENT) {
            int maxWrap = 0;
            o picked = null;
            Iterator<WidgetGroup> it14 = allDependencyLists.iterator();
            while (it14.hasNext()) {
                o list = (o) it14.next();
                if (list.d() == 1) {
                    children = children;
                } else {
                    list.h(false);
                    int wrap = list.f(layout.s1(), 0);
                    if (wrap > maxWrap) {
                        maxWrap = wrap;
                        picked = list;
                    }
                    children = children;
                }
            }
            if (picked != null) {
                layout.x0(e.a.FIXED);
                layout.S0(maxWrap);
                picked.h(true);
                horizontalPick = picked;
            }
        }
        if (layout.M() == e.a.WRAP_CONTENT) {
            int maxWrap2 = 0;
            o picked2 = null;
            Iterator<WidgetGroup> it15 = allDependencyLists.iterator();
            while (it15.hasNext()) {
                o list2 = (o) it15.next();
                if (list2.d() != 0) {
                    list2.h(false);
                    int wrap2 = list2.f(layout.s1(), 1);
                    if (wrap2 > maxWrap2) {
                        picked2 = list2;
                        maxWrap2 = wrap2;
                    }
                }
            }
            if (picked2 != null) {
                layout.O0(e.a.FIXED);
                layout.t0(maxWrap2);
                picked2.h(true);
                verticalPick = picked2;
            }
        }
        return (horizontalPick == null && verticalPick == null) ? false : true;
    }

    public static o b(ArrayList<o> arrayList, int groupId) {
        int count = arrayList.size();
        for (int i = 0; i < count; i++) {
            o group = arrayList.get(i);
            if (groupId == group.f670b) {
                return group;
            }
        }
        return null;
    }

    public static o a(e constraintWidget, int orientation, ArrayList<o> arrayList, o group) {
        int groupId;
        int groupId2;
        if (orientation == 0) {
            groupId = constraintWidget.n0;
        } else {
            groupId = constraintWidget.o0;
        }
        if (groupId != -1 && (group == null || groupId != group.f670b)) {
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                o widgetGroup = arrayList.get(i);
                if (widgetGroup.c() == groupId) {
                    if (group != null) {
                        group.g(orientation, widgetGroup);
                        arrayList.remove(group);
                    }
                    group = widgetGroup;
                } else {
                    i++;
                }
            }
        } else if (groupId != -1) {
            return group;
        }
        if (group == null) {
            if ((constraintWidget instanceof a.f.b.i.i) && (groupId2 = ((a.f.b.i.i) constraintWidget).a1(orientation)) != -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    o widgetGroup2 = arrayList.get(i2);
                    if (widgetGroup2.c() == groupId2) {
                        group = widgetGroup2;
                        break;
                    }
                    i2++;
                }
            }
            if (group == null) {
                group = new o(orientation);
            }
            arrayList.add(group);
        }
        if (group.a(constraintWidget)) {
            if (constraintWidget instanceof g) {
                g guideline = (g) constraintWidget;
                guideline.Y0().b(guideline.Z0() == 0 ? 1 : 0, arrayList, group);
            }
            if (orientation == 0) {
                constraintWidget.n0 = group.c();
                constraintWidget.G.b(orientation, arrayList, group);
                constraintWidget.I.b(orientation, arrayList, group);
            } else {
                constraintWidget.o0 = group.c();
                constraintWidget.H.b(orientation, arrayList, group);
                constraintWidget.K.b(orientation, arrayList, group);
                constraintWidget.J.b(orientation, arrayList, group);
            }
            constraintWidget.N.b(orientation, arrayList, group);
        }
        return group;
    }
}
