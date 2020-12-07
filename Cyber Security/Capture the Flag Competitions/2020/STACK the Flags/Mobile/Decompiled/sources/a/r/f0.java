package a.r;

import a.r.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class f0 extends l {
    public static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    public int J = 3;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1369a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1370b;

        /* renamed from: c  reason: collision with root package name */
        public int f1371c;

        /* renamed from: d  reason: collision with root package name */
        public int f1372d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f1373e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f1374f;
    }

    public abstract Animator d0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public abstract Animator f0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public void h0(int mode) {
        if ((mode & -4) == 0) {
            this.J = mode;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a.r.l
    public String[] C() {
        return K;
    }

    public final void b0(r transitionValues) {
        transitionValues.f1402a.put("android:visibility:visibility", Integer.valueOf(transitionValues.f1403b.getVisibility()));
        transitionValues.f1402a.put("android:visibility:parent", transitionValues.f1403b.getParent());
        int[] loc = new int[2];
        transitionValues.f1403b.getLocationOnScreen(loc);
        transitionValues.f1402a.put("android:visibility:screenLocation", loc);
    }

    @Override // a.r.l
    public void i(r transitionValues) {
        b0(transitionValues);
    }

    @Override // a.r.l
    public void f(r transitionValues) {
        b0(transitionValues);
    }

    public final b c0(r startValues, r endValues) {
        b visInfo = new b();
        visInfo.f1369a = false;
        visInfo.f1370b = false;
        if (startValues == null || !startValues.f1402a.containsKey("android:visibility:visibility")) {
            visInfo.f1371c = -1;
            visInfo.f1373e = null;
        } else {
            visInfo.f1371c = ((Integer) startValues.f1402a.get("android:visibility:visibility")).intValue();
            visInfo.f1373e = (ViewGroup) startValues.f1402a.get("android:visibility:parent");
        }
        if (endValues == null || !endValues.f1402a.containsKey("android:visibility:visibility")) {
            visInfo.f1372d = -1;
            visInfo.f1374f = null;
        } else {
            visInfo.f1372d = ((Integer) endValues.f1402a.get("android:visibility:visibility")).intValue();
            visInfo.f1374f = (ViewGroup) endValues.f1402a.get("android:visibility:parent");
        }
        if (startValues == null || endValues == null) {
            if (startValues == null && visInfo.f1372d == 0) {
                visInfo.f1370b = true;
                visInfo.f1369a = true;
            } else if (endValues == null && visInfo.f1371c == 0) {
                visInfo.f1370b = false;
                visInfo.f1369a = true;
            }
        } else if (visInfo.f1371c == visInfo.f1372d && visInfo.f1373e == visInfo.f1374f) {
            return visInfo;
        } else {
            int i = visInfo.f1371c;
            int i2 = visInfo.f1372d;
            if (i != i2) {
                if (i == 0) {
                    visInfo.f1370b = false;
                    visInfo.f1369a = true;
                } else if (i2 == 0) {
                    visInfo.f1370b = true;
                    visInfo.f1369a = true;
                }
            } else if (visInfo.f1374f == null) {
                visInfo.f1370b = false;
                visInfo.f1369a = true;
            } else if (visInfo.f1373e == null) {
                visInfo.f1370b = true;
                visInfo.f1369a = true;
            }
        }
        return visInfo;
    }

    @Override // a.r.l
    public Animator m(ViewGroup sceneRoot, r startValues, r endValues) {
        b visInfo = c0(startValues, endValues);
        if (!visInfo.f1369a) {
            return null;
        }
        if (visInfo.f1373e == null && visInfo.f1374f == null) {
            return null;
        }
        if (visInfo.f1370b) {
            return e0(sceneRoot, startValues, endValues);
        }
        return g0(sceneRoot, startValues, endValues, visInfo.f1372d);
    }

    public Animator e0(ViewGroup sceneRoot, r startValues, r endValues) {
        if ((this.J & 1) != 1 || endValues == null) {
            return null;
        }
        if (startValues == null) {
            View endParent = (View) endValues.f1403b.getParent();
            if (c0(s(endParent, false), D(endParent, false)).f1369a) {
                return null;
            }
        }
        return d0(sceneRoot, endValues.f1403b, startValues, endValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011a A[RETURN] */
    public Animator g0(ViewGroup sceneRoot, r startValues, r endValues, int endVisibility) {
        int id;
        if ((this.J & 2) != 2) {
            return null;
        }
        View startView = startValues != null ? startValues.f1403b : null;
        View endView = endValues != null ? endValues.f1403b : null;
        View overlayView = null;
        View viewToKeep = null;
        if (endView != null) {
            if (endView.getParent() != null) {
                if (endVisibility == 4) {
                    viewToKeep = endView;
                } else if (startView == endView) {
                    viewToKeep = endView;
                } else {
                    overlayView = this.w ? startView : q.a(sceneRoot, startView, (View) startView.getParent());
                }
                if (overlayView == null && startValues != null) {
                    int[] screenLoc = (int[]) startValues.f1402a.get("android:visibility:screenLocation");
                    int screenX = screenLoc[0];
                    int screenY = screenLoc[1];
                    int[] loc = new int[2];
                    sceneRoot.getLocationOnScreen(loc);
                    overlayView.offsetLeftAndRight((screenX - loc[0]) - overlayView.getLeft());
                    overlayView.offsetTopAndBottom((screenY - loc[1]) - overlayView.getTop());
                    u overlay = v.a(sceneRoot);
                    ((t) overlay).b(overlayView);
                    Animator animator = f0(sceneRoot, overlayView, startValues, endValues);
                    if (animator == null) {
                        ((t) overlay).a(overlayView);
                    } else {
                        animator.addListener(new e0(this, overlay, overlayView));
                    }
                    return animator;
                } else if (viewToKeep != null) {
                    return null;
                } else {
                    int originalVisibility = viewToKeep.getVisibility();
                    z.i(viewToKeep, 0);
                    Animator animator2 = f0(sceneRoot, viewToKeep, startValues, endValues);
                    if (animator2 != null) {
                        a disappearListener = new a(viewToKeep, endVisibility, true);
                        animator2.addListener(disappearListener);
                        a.a(animator2, disappearListener);
                        a(disappearListener);
                    } else {
                        z.i(viewToKeep, originalVisibility);
                    }
                    return animator2;
                }
            }
        }
        if (endView != null) {
            overlayView = endView;
        } else if (startView != null) {
            if (startView.getParent() == null) {
                overlayView = startView;
            } else if (startView.getParent() instanceof View) {
                View startParent = (View) startView.getParent();
                if (!c0(D(startParent, true), s(startParent, true)).f1369a) {
                    overlayView = q.a(sceneRoot, startView, startParent);
                } else if (startParent.getParent() == null && (id = startParent.getId()) != -1 && sceneRoot.findViewById(id) != null && this.w) {
                    overlayView = startView;
                }
            }
        }
        if (overlayView == null) {
        }
        if (viewToKeep != null) {
        }
    }

    @Override // a.r.l
    public boolean E(r startValues, r newValues) {
        if (startValues == null && newValues == null) {
            return false;
        }
        if (startValues != null && newValues != null && newValues.f1402a.containsKey("android:visibility:visibility") != startValues.f1402a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b changeInfo = c0(startValues, newValues);
        if (!changeInfo.f1369a) {
            return false;
        }
        if (changeInfo.f1371c == 0 || changeInfo.f1372d == 0) {
            return true;
        }
        return false;
    }

    public static class a extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a  reason: collision with root package name */
        public final View f1363a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1364b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f1365c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1366d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1367e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1368f = false;

        public a(View view, int finalVisibility, boolean suppressLayout) {
            this.f1363a = view;
            this.f1364b = finalVisibility;
            this.f1365c = (ViewGroup) view.getParent();
            this.f1366d = suppressLayout;
            f(true);
        }

        public void onAnimationPause(Animator animation) {
            if (!this.f1368f) {
                z.i(this.f1363a, this.f1364b);
            }
        }

        public void onAnimationResume(Animator animation) {
            if (!this.f1368f) {
                z.i(this.f1363a, 0);
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f1368f = true;
        }

        public void onAnimationRepeat(Animator animation) {
        }

        public void onAnimationStart(Animator animation) {
        }

        public void onAnimationEnd(Animator animation) {
            e();
        }

        @Override // a.r.l.f
        public void c(l transition) {
        }

        @Override // a.r.l.f
        public void d(l transition) {
            e();
            transition.O(this);
        }

        @Override // a.r.l.f
        public void a(l transition) {
            f(false);
        }

        @Override // a.r.l.f
        public void b(l transition) {
            f(true);
        }

        public final void e() {
            if (!this.f1368f) {
                z.i(this.f1363a, this.f1364b);
                ViewGroup viewGroup = this.f1365c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        public final void f(boolean suppress) {
            ViewGroup viewGroup;
            if (this.f1366d && this.f1367e != suppress && (viewGroup = this.f1365c) != null) {
                this.f1367e = suppress;
                v.b(viewGroup, suppress);
            }
        }
    }
}
