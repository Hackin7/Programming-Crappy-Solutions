package a.s.a.a;

import a.h.e.c.g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b extends f implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    public C0039b f1424c;

    /* renamed from: d  reason: collision with root package name */
    public Context f1425d;

    /* renamed from: e  reason: collision with root package name */
    public ArgbEvaluator f1426e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable.Callback f1427f;

    public b() {
        this(null, null, null);
    }

    public b(Context context) {
        this(context, null, null);
    }

    public b(Context context, C0039b state, Resources res) {
        this.f1426e = null;
        this.f1427f = new a();
        this.f1425d = context;
        if (state != null) {
            this.f1424c = state;
        } else {
            this.f1424c = new C0039b(state, this.f1427f, res);
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public static b a(Context context, Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        b drawable = new b(context);
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f1437b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f1437b.getConstantState());
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1424c.f1429a;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1424c.f1430b.draw(canvas);
        if (this.f1424c.f1431c.isStarted()) {
            invalidateSelf();
        }
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setBounds(bounds);
        } else {
            this.f1424c.f1430b.setBounds(bounds);
        }
    }

    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.setState(state);
        }
        return this.f1424c.f1430b.setState(state);
    }

    @Override // a.s.a.a.f
    public boolean onLevelChange(int level) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return this.f1424c.f1430b.setLevel(level);
    }

    public int getAlpha() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return a.h.f.l.a.d(drawable);
        }
        return this.f1424c.f1430b.getAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else {
            this.f1424c.f1430b.setAlpha(alpha);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1424c.f1430b.setColorFilter(colorFilter);
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return a.h.f.l.a.e(drawable);
        }
        return this.f1424c.f1430b.getColorFilter();
    }

    public void setTint(int tint) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.n(drawable, tint);
        } else {
            this.f1424c.f1430b.setTint(tint);
        }
    }

    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.o(drawable, tint);
        } else {
            this.f1424c.f1430b.setTintList(tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.p(drawable, tintMode);
        } else {
            this.f1424c.f1430b.setTintMode(tintMode);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        this.f1424c.f1430b.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    public boolean isStateful() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f1424c.f1430b.isStateful();
    }

    public int getOpacity() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f1424c.f1430b.getOpacity();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f1424c.f1430b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f1424c.f1430b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return a.h.f.l.a.h(drawable);
        }
        return this.f1424c.f1430b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.j(drawable, mirrored);
        } else {
            this.f1424c.f1430b.setAutoMirrored(mirrored);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.g(drawable, res, parser, attrs, theme);
            return;
        }
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        while (eventType != 1 && (parser.getDepth() >= innerDepth || eventType != 3)) {
            if (eventType == 2) {
                String tagName = parser.getName();
                if ("animated-vector".equals(tagName)) {
                    TypedArray a2 = g.k(res, theme, attrs, a.f1421e);
                    int drawableRes = a2.getResourceId(0, 0);
                    if (drawableRes != 0) {
                        g vectorDrawable = g.b(res, drawableRes, theme);
                        vectorDrawable.h(false);
                        vectorDrawable.setCallback(this.f1427f);
                        g gVar = this.f1424c.f1430b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f1424c.f1430b = vectorDrawable;
                    }
                    a2.recycle();
                } else if ("target".equals(tagName)) {
                    TypedArray a3 = res.obtainAttributes(attrs, a.f1422f);
                    String target = a3.getString(0);
                    int id = a3.getResourceId(1, 0);
                    if (id != 0) {
                        Context context = this.f1425d;
                        if (context != null) {
                            b(target, d.i(context, id));
                        } else {
                            a3.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a3.recycle();
                } else {
                    continue;
                }
            }
            eventType = parser.next();
        }
        this.f1424c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        inflate(res, parser, attrs, null);
    }

    @Override // a.s.a.a.f
    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            a.h.f.l.a.a(drawable, t);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return a.h.f.l.a.b(drawable);
        }
        return false;
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f1434a;

        public c(Drawable.ConstantState state) {
            this.f1434a = state;
        }

        public Drawable newDrawable() {
            b drawableCompat = new b();
            Drawable newDrawable = this.f1434a.newDrawable();
            drawableCompat.f1437b = newDrawable;
            newDrawable.setCallback(drawableCompat.f1427f);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            b drawableCompat = new b();
            Drawable newDrawable = this.f1434a.newDrawable(res);
            drawableCompat.f1437b = newDrawable;
            newDrawable.setCallback(drawableCompat.f1427f);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            b drawableCompat = new b();
            Drawable newDrawable = this.f1434a.newDrawable(res, theme);
            drawableCompat.f1437b = newDrawable;
            newDrawable.setCallback(drawableCompat.f1427f);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f1434a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f1434a.getChangingConfigurations();
        }
    }

    /* renamed from: a.s.a.a.b$b  reason: collision with other inner class name */
    public static class C0039b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f1429a;

        /* renamed from: b  reason: collision with root package name */
        public g f1430b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f1431c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f1432d;

        /* renamed from: e  reason: collision with root package name */
        public a.e.a<Animator, String> f1433e;

        public C0039b(C0039b copy, Drawable.Callback owner, Resources res) {
            if (copy != null) {
                this.f1429a = copy.f1429a;
                g gVar = copy.f1430b;
                if (gVar != null) {
                    Drawable.ConstantState cs = gVar.getConstantState();
                    if (res != null) {
                        this.f1430b = (g) cs.newDrawable(res);
                    } else {
                        this.f1430b = (g) cs.newDrawable();
                    }
                    g gVar2 = this.f1430b;
                    gVar2.mutate();
                    g gVar3 = gVar2;
                    this.f1430b = gVar3;
                    gVar3.setCallback(owner);
                    this.f1430b.setBounds(copy.f1430b.getBounds());
                    this.f1430b.h(false);
                }
                ArrayList<Animator> arrayList = copy.f1432d;
                if (arrayList != null) {
                    int numAnimators = arrayList.size();
                    this.f1432d = new ArrayList<>(numAnimators);
                    this.f1433e = new a.e.a<>(numAnimators);
                    for (int i = 0; i < numAnimators; i++) {
                        Animator anim = copy.f1432d.get(i);
                        Animator animClone = anim.clone();
                        String targetName = copy.f1433e.get(anim);
                        animClone.setTarget(this.f1430b.d(targetName));
                        this.f1432d.add(animClone);
                        this.f1433e.put(animClone, targetName);
                    }
                    a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources res) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f1429a;
        }

        public void a() {
            if (this.f1431c == null) {
                this.f1431c = new AnimatorSet();
            }
            this.f1431c.playTogether(this.f1432d);
        }
    }

    public final void b(String name, Animator animator) {
        animator.setTarget(this.f1424c.f1430b.d(name));
        C0039b bVar = this.f1424c;
        if (bVar.f1432d == null) {
            bVar.f1432d = new ArrayList<>();
            this.f1424c.f1433e = new a.e.a<>();
        }
        this.f1424c.f1432d.add(animator);
        this.f1424c.f1433e.put(animator, name);
    }

    public boolean isRunning() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f1424c.f1431c.isRunning();
    }

    public void start() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f1424c.f1431c.isStarted()) {
            this.f1424c.f1431c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f1437b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1424c.f1431c.end();
        }
    }

    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable who) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            b.this.scheduleSelf(what, when);
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            b.this.unscheduleSelf(what);
        }
    }
}
