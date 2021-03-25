package b.d.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b.d.a.a.r.h;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class b extends a {
    public InsetDrawable I;

    public b(h view, b.d.a.a.v.b shadowViewDelegate) {
        super(view, shadowViewDelegate);
    }

    @Override // b.d.a.a.q.a
    public void H(ColorStateList backgroundTint, PorterDuff.Mode backgroundTintMode, ColorStateList rippleColor, int borderWidth) {
        Drawable rippleContent;
        Drawable q = a.h.f.l.a.q(g());
        this.j = q;
        a.h.f.l.a.o(q, backgroundTint);
        if (backgroundTintMode != null) {
            a.h.f.l.a.p(this.j, backgroundTintMode);
        }
        if (borderWidth > 0) {
            this.l = e(borderWidth, backgroundTint);
            rippleContent = new LayerDrawable(new Drawable[]{this.l, this.j});
        } else {
            this.l = null;
            rippleContent = this.j;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(b.d.a.a.u.a.a(rippleColor), rippleContent, null);
        this.k = rippleDrawable;
        this.m = rippleDrawable;
        ((FloatingActionButton.c) this.v).c(rippleDrawable);
    }

    @Override // b.d.a.a.q.a
    public void Q(ColorStateList rippleColor) {
        Drawable drawable = this.k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(b.d.a.a.u.a.a(rippleColor));
        } else {
            super.Q(rippleColor);
        }
    }

    @Override // b.d.a.a.q.a
    public void B(float elevation, float hoveredFocusedTranslationZ, float pressedTranslationZ) {
        if (Build.VERSION.SDK_INT == 21) {
            this.u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.C, X(elevation, pressedTranslationZ));
            stateListAnimator.addState(a.D, X(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(a.E, X(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(a.F, X(elevation, hoveredFocusedTranslationZ));
            AnimatorSet set = new AnimatorSet();
            List<Animator> animators = new ArrayList<>();
            animators.add(ObjectAnimator.ofFloat(this.u, "elevation", elevation).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                h hVar = this.u;
                animators.add(ObjectAnimator.ofFloat(hVar, View.TRANSLATION_Z, hVar.getTranslationZ()).setDuration(100L));
            }
            animators.add(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            set.playSequentially((Animator[]) animators.toArray(new Animator[0]));
            set.setInterpolator(a.B);
            stateListAnimator.addState(a.G, set);
            stateListAnimator.addState(a.H, X(0.0f, 0.0f));
            this.u.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton.c) this.v).b()) {
            W();
        }
    }

    public final Animator X(float elevation, float translationZ) {
        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(this.u, "elevation", elevation).setDuration(0L)).with(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, translationZ).setDuration(100L));
        set.setInterpolator(a.B);
        return set;
    }

    @Override // b.d.a.a.q.a
    public float l() {
        return this.u.getElevation();
    }

    @Override // b.d.a.a.q.a
    public void y() {
        W();
    }

    @Override // b.d.a.a.q.a
    public void C(Rect padding) {
        if (((FloatingActionButton.c) this.v).b()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.k, padding.left, padding.top, padding.right, padding.bottom);
            this.I = insetDrawable;
            ((FloatingActionButton.c) this.v).c(insetDrawable);
            return;
        }
        ((FloatingActionButton.c) this.v).c(this.k);
    }

    @Override // b.d.a.a.q.a
    public void A(int[] state) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.u.isEnabled()) {
            this.u.setElevation(this.n);
            if (this.u.isPressed()) {
                this.u.setTranslationZ(this.p);
            } else if (this.u.isFocused() || this.u.isHovered()) {
                this.u.setTranslationZ(this.o);
            } else {
                this.u.setTranslationZ(0.0f);
            }
        } else {
            this.u.setElevation(0.0f);
            this.u.setTranslationZ(0.0f);
        }
    }

    @Override // b.d.a.a.q.a
    public void u() {
    }

    @Override // b.d.a.a.q.a
    public boolean G() {
        return false;
    }

    @Override // b.d.a.a.q.a
    public b.d.a.a.r.a v() {
        return new b.d.a.a.r.b();
    }

    @Override // b.d.a.a.q.a
    public GradientDrawable w() {
        return new a();
    }

    @Override // b.d.a.a.q.a
    public void o(Rect rect) {
        if (((FloatingActionButton.c) this.v).b()) {
            float radius = ((FloatingActionButton.c) this.v).a();
            float maxShadowSize = l() + this.p;
            int hPadding = (int) Math.ceil((double) b.d.a.a.v.a.c(maxShadowSize, radius, false));
            int vPadding = (int) Math.ceil((double) b.d.a.a.v.a.d(maxShadowSize, radius, false));
            rect.set(hPadding, vPadding, hPadding, vPadding);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    public static class a extends GradientDrawable {
        public boolean isStateful() {
            return true;
        }
    }
}
