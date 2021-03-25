package a.r;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

public class d extends f0 {
    public d(int fadingMode) {
        h0(fadingMode);
    }

    @Override // a.r.f0, a.r.l
    public void i(r transitionValues) {
        super.i(transitionValues);
        transitionValues.f1402a.put("android:fade:transitionAlpha", Float.valueOf(z.d(transitionValues.f1403b)));
    }

    public final Animator i0(View view, float startAlpha, float endAlpha) {
        if (startAlpha == endAlpha) {
            return null;
        }
        z.h(view, startAlpha);
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, z.f1416d, endAlpha);
        anim.addListener(new b(view));
        a(new a(this, view));
        return anim;
    }

    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1347a;

        public a(d this$0, View view) {
            this.f1347a = view;
        }

        @Override // a.r.l.f
        public void d(l transition) {
            z.h(this.f1347a, 1.0f);
            z.a(this.f1347a);
            transition.O(this);
        }
    }

    @Override // a.r.f0
    public Animator d0(ViewGroup sceneRoot, View view, r startValues, r endValues) {
        float startAlpha = j0(startValues, 0.0f);
        if (startAlpha == 1.0f) {
            startAlpha = 0.0f;
        }
        return i0(view, startAlpha, 1.0f);
    }

    @Override // a.r.f0
    public Animator f0(ViewGroup sceneRoot, View view, r startValues, r endValues) {
        z.f(view);
        return i0(view, j0(startValues, 1.0f), 0.0f);
    }

    public static float j0(r startValues, float fallbackValue) {
        Float startAlphaFloat;
        if (startValues == null || (startAlphaFloat = (Float) startValues.f1402a.get("android:fade:transitionAlpha")) == null) {
            return fallbackValue;
        }
        return startAlphaFloat.floatValue();
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f1348a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1349b = false;

        public b(View view) {
            this.f1348a = view;
        }

        public void onAnimationStart(Animator animation) {
            if (s.G(this.f1348a) && this.f1348a.getLayerType() == 0) {
                this.f1349b = true;
                this.f1348a.setLayerType(2, null);
            }
        }

        public void onAnimationEnd(Animator animation) {
            z.h(this.f1348a, 1.0f);
            if (this.f1349b) {
                this.f1348a.setLayerType(0, null);
            }
        }
    }
}
