package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: gt */
public final class C0402gt {

    /* renamed from: a */
    public WeakReference<View> f1746a;

    /* renamed from: b */
    Runnable f1747b = null;

    /* renamed from: c */
    Runnable f1748c = null;

    /* renamed from: d */
    int f1749d = -1;

    /* renamed from: gt$a */
    static class C0405a implements C0406gu {

        /* renamed from: a */
        C0402gt f1756a;

        /* renamed from: b */
        boolean f1757b;

        C0405a(C0402gt gtVar) {
            this.f1756a = gtVar;
        }

        /* renamed from: a */
        public final void mo7a(View view) {
            this.f1757b = false;
            C0406gu guVar = null;
            if (this.f1756a.f1749d >= 0) {
                view.setLayerType(2, null);
            }
            if (this.f1756a.f1747b != null) {
                Runnable runnable = this.f1756a.f1747b;
                this.f1756a.f1747b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C0406gu) {
                guVar = (C0406gu) tag;
            }
            if (guVar != null) {
                guVar.mo7a(view);
            }
        }

        /* renamed from: b */
        public final void mo8b(View view) {
            C0406gu guVar = null;
            if (this.f1756a.f1749d >= 0) {
                view.setLayerType(this.f1756a.f1749d, null);
                this.f1756a.f1749d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f1757b) {
                if (this.f1756a.f1748c != null) {
                    Runnable runnable = this.f1756a.f1748c;
                    this.f1756a.f1748c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C0406gu) {
                    guVar = (C0406gu) tag;
                }
                if (guVar != null) {
                    guVar.mo8b(view);
                }
                this.f1757b = true;
            }
        }

        /* renamed from: c */
        public final void mo876c(View view) {
            Object tag = view.getTag(2113929216);
            C0406gu guVar = tag instanceof C0406gu ? (C0406gu) tag : null;
            if (guVar != null) {
                guVar.mo876c(view);
            }
        }
    }

    C0402gt(View view) {
        this.f1746a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m1288a(final View view, final C0406gu guVar) {
        if (guVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    guVar.mo876c(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    guVar.mo8b(view);
                }

                public final void onAnimationStart(Animator animator) {
                    guVar.mo7a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public final C0402gt mo1821a(float f) {
        View view = (View) this.f1746a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public final C0402gt mo1822a(long j) {
        View view = (View) this.f1746a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C0402gt mo1823a(C0406gu guVar) {
        View view = (View) this.f1746a.get();
        if (view == null) {
            return this;
        }
        if (VERSION.SDK_INT < 16) {
            view.setTag(2113929216, guVar);
            guVar = new C0405a(this);
        }
        m1288a(view, guVar);
        return this;
    }

    /* renamed from: a */
    public final C0402gt mo1824a(final C0408gw gwVar) {
        final View view = (View) this.f1746a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C04042 r1 = null;
            if (gwVar != null) {
                r1 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        gwVar.mo1831a();
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo1825a() {
        View view = (View) this.f1746a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public final C0402gt mo1826b(float f) {
        View view = (View) this.f1746a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
