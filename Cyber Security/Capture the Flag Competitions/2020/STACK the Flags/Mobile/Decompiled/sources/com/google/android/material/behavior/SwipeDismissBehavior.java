package com.google.android.material.behavior;

import a.h.m.s;
import a.j.b.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public a.j.b.a f2702a;

    /* renamed from: b  reason: collision with root package name */
    public b f2703b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2704c;

    /* renamed from: d  reason: collision with root package name */
    public float f2705d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public int f2706e = 2;

    /* renamed from: f  reason: collision with root package name */
    public float f2707f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public float f2708g = 0.0f;
    public float h = 0.5f;
    public final a.c i = new a();

    public interface b {
        void a(View view);

        void b(int i);
    }

    public void K(int direction) {
        this.f2706e = direction;
    }

    public void J(float fraction) {
        this.f2708g = E(0.0f, fraction, 1.0f);
    }

    public void I(float fraction) {
        this.h = E(0.0f, fraction, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout parent, V child, MotionEvent event) {
        boolean dispatchEventToHelper = this.f2704c;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f2704c = parent.B(child, (int) event.getX(), (int) event.getY());
            dispatchEventToHelper = this.f2704c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2704c = false;
        }
        if (!dispatchEventToHelper) {
            return false;
        }
        G(parent);
        return this.f2702a.F(event);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean C(CoordinatorLayout parent, V v, MotionEvent event) {
        a.j.b.a aVar = this.f2702a;
        if (aVar == null) {
            return false;
        }
        aVar.y(event);
        return true;
    }

    public boolean D(View view) {
        return true;
    }

    public class a extends a.c {

        /* renamed from: a  reason: collision with root package name */
        public int f2709a;

        /* renamed from: b  reason: collision with root package name */
        public int f2710b = -1;

        public a() {
        }

        @Override // a.j.b.a.c
        public boolean m(View child, int pointerId) {
            return this.f2710b == -1 && SwipeDismissBehavior.this.D(child);
        }

        @Override // a.j.b.a.c
        public void i(View capturedChild, int activePointerId) {
            this.f2710b = activePointerId;
            this.f2709a = capturedChild.getLeft();
            ViewParent parent = capturedChild.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.j.b.a.c
        public void j(int state) {
            b bVar = SwipeDismissBehavior.this.f2703b;
            if (bVar != null) {
                bVar.b(state);
            }
        }

        @Override // a.j.b.a.c
        public void l(View child, float xvel, float yvel) {
            int targetLeft;
            b bVar;
            this.f2710b = -1;
            int childWidth = child.getWidth();
            boolean dismiss = false;
            if (n(child, xvel)) {
                int left = child.getLeft();
                int i = this.f2709a;
                targetLeft = left < i ? i - childWidth : i + childWidth;
                dismiss = true;
            } else {
                targetLeft = this.f2709a;
            }
            if (SwipeDismissBehavior.this.f2702a.E(targetLeft, child.getTop())) {
                s.U(child, new c(child, dismiss));
            } else if (dismiss && (bVar = SwipeDismissBehavior.this.f2703b) != null) {
                bVar.a(child);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        public final boolean n(View child, float xvel) {
            if (xvel != 0.0f) {
                boolean isRtl = s.v(child) == 1;
                int i = SwipeDismissBehavior.this.f2706e;
                if (i == 2) {
                    return true;
                }
                if (i == 0) {
                    if (isRtl) {
                        if (xvel < 0.0f) {
                            return true;
                        }
                        return false;
                    } else if (xvel <= 0.0f) {
                        return false;
                    }
                    return true;
                } else if (i != 1) {
                    return false;
                } else {
                    if (isRtl) {
                        if (xvel > 0.0f) {
                            return true;
                        }
                        return false;
                    } else if (xvel >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(child.getLeft() - this.f2709a) >= Math.round(((float) child.getWidth()) * SwipeDismissBehavior.this.f2707f)) {
                    return true;
                }
                return false;
            }
        }

        @Override // a.j.b.a.c
        public int d(View child) {
            return child.getWidth();
        }

        @Override // a.j.b.a.c
        public int a(View child, int left, int dx) {
            int max;
            int min;
            boolean isRtl = s.v(child) == 1;
            int max2 = SwipeDismissBehavior.this.f2706e;
            if (max2 == 0) {
                if (isRtl) {
                    min = this.f2709a - child.getWidth();
                    max = this.f2709a;
                } else {
                    min = this.f2709a;
                    max = this.f2709a + child.getWidth();
                }
            } else if (max2 != 1) {
                min = this.f2709a - child.getWidth();
                max = this.f2709a + child.getWidth();
            } else if (isRtl) {
                min = this.f2709a;
                max = this.f2709a + child.getWidth();
            } else {
                min = this.f2709a - child.getWidth();
                max = this.f2709a;
            }
            return SwipeDismissBehavior.F(min, left, max);
        }

        @Override // a.j.b.a.c
        public int b(View child, int top, int dy) {
            return child.getTop();
        }

        @Override // a.j.b.a.c
        public void k(View child, int left, int top, int dx, int dy) {
            float startAlphaDistance = ((float) this.f2709a) + (((float) child.getWidth()) * SwipeDismissBehavior.this.f2708g);
            float endAlphaDistance = ((float) this.f2709a) + (((float) child.getWidth()) * SwipeDismissBehavior.this.h);
            if (((float) left) <= startAlphaDistance) {
                child.setAlpha(1.0f);
            } else if (((float) left) >= endAlphaDistance) {
                child.setAlpha(0.0f);
            } else {
                child.setAlpha(SwipeDismissBehavior.E(0.0f, 1.0f - SwipeDismissBehavior.H(startAlphaDistance, endAlphaDistance, (float) left), 1.0f));
            }
        }
    }

    public final void G(ViewGroup parent) {
        if (this.f2702a == null) {
            this.f2702a = a.j.b.a.l(parent, this.i);
        }
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f2712b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2713c;

        public c(View view, boolean dismiss) {
            this.f2712b = view;
            this.f2713c = dismiss;
        }

        public void run() {
            b bVar;
            a.j.b.a aVar = SwipeDismissBehavior.this.f2702a;
            if (aVar != null && aVar.k(true)) {
                s.U(this.f2712b, this);
            } else if (this.f2713c && (bVar = SwipeDismissBehavior.this.f2703b) != null) {
                bVar.a(this.f2712b);
            }
        }
    }

    public static float E(float min, float value, float max) {
        return Math.min(Math.max(min, value), max);
    }

    public static int F(int min, int value, int max) {
        return Math.min(Math.max(min, value), max);
    }

    public static float H(float startValue, float endValue, float value) {
        return (value - startValue) / (endValue - startValue);
    }
}
