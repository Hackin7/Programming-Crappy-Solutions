package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: jh */
public final class C0555jh extends C0564jm implements C0554jg {

    /* renamed from: a */
    ArrayList<Object> f2272a;

    /* renamed from: b */
    final Callback f2273b;

    /* renamed from: d */
    private C0557a f2274d;

    /* renamed from: e */
    private Context f2275e;

    /* renamed from: f */
    private ArgbEvaluator f2276f;

    /* renamed from: g */
    private AnimatorListener f2277g;

    /* renamed from: jh$a */
    static class C0557a extends ConstantState {

        /* renamed from: a */
        int f2279a;

        /* renamed from: b */
        C0565jn f2280b;

        /* renamed from: c */
        AnimatorSet f2281c;

        /* renamed from: d */
        ArrayList<Animator> f2282d;

        /* renamed from: e */
        C0243de<Animator, String> f2283e;

        public final int getChangingConfigurations() {
            return this.f2279a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: jh$b */
    static class C0558b extends ConstantState {

        /* renamed from: a */
        private final ConstantState f2284a;

        public C0558b(ConstantState constantState) {
            this.f2284a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f2284a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f2284a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C0555jh jhVar = new C0555jh();
            jhVar.f2289c = this.f2284a.newDrawable();
            jhVar.f2289c.setCallback(jhVar.f2273b);
            return jhVar;
        }

        public final Drawable newDrawable(Resources resources) {
            C0555jh jhVar = new C0555jh();
            jhVar.f2289c = this.f2284a.newDrawable(resources);
            jhVar.f2289c.setCallback(jhVar.f2273b);
            return jhVar;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            C0555jh jhVar = new C0555jh();
            jhVar.f2289c = this.f2284a.newDrawable(resources, theme);
            jhVar.f2289c.setCallback(jhVar.f2273b);
            return jhVar;
        }
    }

    C0555jh() {
        this(null, 0);
    }

    private C0555jh(Context context) {
        this(context, 0);
    }

    private C0555jh(Context context, byte b) {
        this.f2276f = null;
        this.f2277g = null;
        this.f2272a = null;
        this.f2273b = new Callback() {
            public final void invalidateDrawable(Drawable drawable) {
                C0555jh.this.invalidateSelf();
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0555jh.this.scheduleSelf(runnable, j);
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0555jh.this.unscheduleSelf(runnable);
            }
        };
        this.f2275e = context;
        this.f2274d = new C0557a();
    }

    /* renamed from: a */
    public static C0555jh m1730a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0555jh jhVar = new C0555jh(context);
        jhVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return jhVar;
    }

    /* renamed from: a */
    private void m1731a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m1731a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f2276f == null) {
                    this.f2276f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f2276f);
            }
        }
    }

    public final void applyTheme(Theme theme) {
        if (this.f2289c != null) {
            C0345fn.m1148a(this.f2289c, theme);
        }
    }

    public final boolean canApplyTheme() {
        if (this.f2289c != null) {
            return C0345fn.m1155c(this.f2289c);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void draw(Canvas canvas) {
        if (this.f2289c != null) {
            this.f2289c.draw(canvas);
            return;
        }
        this.f2274d.f2280b.draw(canvas);
        if (this.f2274d.f2281c.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.f2289c != null ? C0345fn.m1153b(this.f2289c) : this.f2274d.f2280b.getAlpha();
    }

    public final int getChangingConfigurations() {
        return this.f2289c != null ? this.f2289c.getChangingConfigurations() : super.getChangingConfigurations() | this.f2274d.f2279a;
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final ConstantState getConstantState() {
        if (this.f2289c == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0558b(this.f2289c.getConstantState());
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f2289c != null ? this.f2289c.getIntrinsicHeight() : this.f2274d.f2280b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f2289c != null ? this.f2289c.getIntrinsicWidth() : this.f2274d.f2280b.getIntrinsicWidth();
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f2289c != null ? this.f2289c.getOpacity() : this.f2274d.f2280b.getOpacity();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        TypedArray obtainAttributes;
        if (this.f2289c != null) {
            C0345fn.m1149a(this.f2289c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0330fd.m1078a(resources, theme, attributeSet, C0553jf.f2264e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0565jn a = C0565jn.m1747a(resources, resourceId, theme);
                        a.f2292d = false;
                        a.setCallback(this.f2273b);
                        if (this.f2274d.f2280b != null) {
                            this.f2274d.f2280b.setCallback(null);
                        }
                        this.f2274d.f2280b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0553jf.f2265f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f2275e != null) {
                            Context context = this.f2275e;
                            Animator loadAnimator = VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, resourceId2) : C0560jj.m1733a(context, context.getResources(), context.getTheme(), resourceId2);
                            loadAnimator.setTarget(this.f2274d.f2280b.f2291b.f2347b.f2340k.get(string));
                            if (VERSION.SDK_INT < 21) {
                                m1731a(loadAnimator);
                            }
                            if (this.f2274d.f2282d == null) {
                                this.f2274d.f2282d = new ArrayList<>();
                                this.f2274d.f2283e = new C0243de<>();
                            }
                            this.f2274d.f2282d.add(loadAnimator);
                            this.f2274d.f2283e.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        C0557a aVar = this.f2274d;
        if (aVar.f2281c == null) {
            aVar.f2281c = new AnimatorSet();
        }
        aVar.f2281c.playTogether(aVar.f2282d);
    }

    public final boolean isAutoMirrored() {
        return this.f2289c != null ? C0345fn.m1152a(this.f2289c) : this.f2274d.f2280b.isAutoMirrored();
    }

    public final boolean isRunning() {
        return this.f2289c != null ? ((AnimatedVectorDrawable) this.f2289c).isRunning() : this.f2274d.f2281c.isRunning();
    }

    public final boolean isStateful() {
        return this.f2289c != null ? this.f2289c.isStateful() : this.f2274d.f2280b.isStateful();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.f2289c != null) {
            this.f2289c.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.f2289c != null) {
            this.f2289c.setBounds(rect);
        } else {
            this.f2274d.f2280b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.f2289c != null ? this.f2289c.setLevel(i) : this.f2274d.f2280b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        return this.f2289c != null ? this.f2289c.setState(iArr) : this.f2274d.f2280b.setState(iArr);
    }

    public final void setAlpha(int i) {
        if (this.f2289c != null) {
            this.f2289c.setAlpha(i);
        } else {
            this.f2274d.f2280b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f2289c != null) {
            C0345fn.m1151a(this.f2289c, z);
        } else {
            this.f2274d.f2280b.setAutoMirrored(z);
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2289c != null) {
            this.f2289c.setColorFilter(colorFilter);
        } else {
            this.f2274d.f2280b.setColorFilter(colorFilter);
        }
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i) {
        if (this.f2289c != null) {
            C0345fn.m1145a(this.f2289c, i);
        } else {
            this.f2274d.f2280b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2289c != null) {
            C0345fn.m1147a(this.f2289c, colorStateList);
        } else {
            this.f2274d.f2280b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.f2289c != null) {
            C0345fn.m1150a(this.f2289c, mode);
        } else {
            this.f2274d.f2280b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f2289c != null) {
            return this.f2289c.setVisible(z, z2);
        }
        this.f2274d.f2280b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (this.f2289c != null) {
            ((AnimatedVectorDrawable) this.f2289c).start();
        } else if (!this.f2274d.f2281c.isStarted()) {
            this.f2274d.f2281c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.f2289c != null) {
            ((AnimatedVectorDrawable) this.f2289c).stop();
        } else {
            this.f2274d.f2281c.end();
        }
    }
}
