package a.b.m.a;

import a.b.m.a.b;
import a.b.m.a.d;
import a.b.p.m0;
import a.e.h;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements a.h.f.l.b {
    public c p;
    public g q;
    public int r;
    public int s;
    public boolean t;

    static {
        a.class.getSimpleName();
    }

    public a() {
        this(null, null);
    }

    public a(c state, Resources res) {
        super(null);
        this.r = -1;
        this.s = -1;
        h(new c(state, this, res));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("animated-selector")) {
            a asl = new a();
            asl.n(context, resources, parser, attrs, theme);
            return asl;
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    public void n(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        TypedArray a2 = a.h.e.c.g.k(resources, theme, attrs, a.b.n.b.AnimatedStateListDrawableCompat);
        setVisible(a2.getBoolean(a.b.n.b.AnimatedStateListDrawableCompat_android_visible, true), true);
        t(a2);
        i(resources);
        a2.recycle();
        o(context, resources, parser, attrs, theme);
        p();
    }

    @Override // a.b.m.a.b
    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        if (this.q != null && (changed || restart)) {
            if (visible) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return changed;
    }

    @Override // a.b.m.a.d
    public boolean isStateful() {
        return true;
    }

    @Override // a.b.m.a.b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            g(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // a.b.m.a.d, a.b.m.a.b
    public boolean onStateChange(int[] stateSet) {
        int targetIndex = this.p.F(stateSet);
        boolean changed = targetIndex != c() && (s(targetIndex) || g(targetIndex));
        Drawable current = getCurrent();
        if (current != null) {
            return changed | current.setState(stateSet);
        }
        return changed;
    }

    public final boolean s(int toIndex) {
        int fromIndex;
        int transitionIndex;
        g transition;
        g currentTransition = this.q;
        if (currentTransition == null) {
            fromIndex = c();
        } else if (toIndex == this.r) {
            return true;
        } else {
            if (toIndex != this.s || !currentTransition.a()) {
                fromIndex = this.r;
                currentTransition.d();
            } else {
                currentTransition.b();
                this.r = this.s;
                this.s = toIndex;
                return true;
            }
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c state = this.p;
        int fromId = state.E(fromIndex);
        int toId = state.E(toIndex);
        if (toId == 0 || fromId == 0 || (transitionIndex = state.G(fromId, toId)) < 0) {
            return false;
        }
        boolean hasReversibleFlag = state.I(fromId, toId);
        g(transitionIndex);
        Drawable d2 = getCurrent();
        if (d2 instanceof AnimationDrawable) {
            transition = new e((AnimationDrawable) d2, state.H(fromId, toId), hasReversibleFlag);
        } else if (d2 instanceof a.s.a.a.b) {
            transition = new d((a.s.a.a.b) d2);
        } else if (!(d2 instanceof Animatable)) {
            return false;
        } else {
            transition = new b((Animatable) d2);
        }
        transition.c();
        this.q = transition;
        this.s = fromIndex;
        this.r = toIndex;
        return true;
    }

    public static abstract class g {
        public abstract void c();

        public abstract void d();

        public g() {
        }

        public void b() {
        }

        public boolean a() {
            return false;
        }
    }

    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f96a;

        public b(Animatable a2) {
            super();
            this.f96a = a2;
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f96a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f96a.stop();
        }
    }

    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f98a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f99b;

        public e(AnimationDrawable ad, boolean reversed, boolean hasReversibleFlag) {
            super();
            int frameCount = ad.getNumberOfFrames();
            int fromFrame = reversed ? frameCount - 1 : 0;
            int toFrame = reversed ? 0 : frameCount - 1;
            f interp = new f(ad, reversed);
            ObjectAnimator anim = ObjectAnimator.ofInt(ad, "currentIndex", fromFrame, toFrame);
            anim.setAutoCancel(true);
            anim.setDuration((long) interp.a());
            anim.setInterpolator(interp);
            this.f99b = hasReversibleFlag;
            this.f98a = anim;
        }

        @Override // a.b.m.a.a.g
        public boolean a() {
            return this.f99b;
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f98a.start();
        }

        @Override // a.b.m.a.a.g
        public void b() {
            this.f98a.reverse();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f98a.cancel();
        }
    }

    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final a.s.a.a.b f97a;

        public d(a.s.a.a.b avd) {
            super();
            this.f97a = avd;
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f97a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f97a.stop();
        }
    }

    public final void t(TypedArray a2) {
        c state = this.p;
        state.f114d |= a2.getChangingConfigurations();
        state.x(a2.getBoolean(a.b.n.b.AnimatedStateListDrawableCompat_android_variablePadding, state.i));
        state.t(a2.getBoolean(a.b.n.b.AnimatedStateListDrawableCompat_android_constantSize, state.l));
        state.u(a2.getInt(a.b.n.b.AnimatedStateListDrawableCompat_android_enterFadeDuration, state.A));
        state.v(a2.getInt(a.b.n.b.AnimatedStateListDrawableCompat_android_exitFadeDuration, state.B));
        setDither(a2.getBoolean(a.b.n.b.AnimatedStateListDrawableCompat_android_dither, state.x));
    }

    public final void p() {
        onStateChange(getState());
    }

    public final void o(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int innerDepth = parser.getDepth() + 1;
        while (true) {
            int type = parser.next();
            if (type != 1) {
                int depth = parser.getDepth();
                if (depth < innerDepth && type == 3) {
                    return;
                }
                if (type == 2 && depth <= innerDepth) {
                    if (parser.getName().equals("item")) {
                        q(context, resources, parser, attrs, theme);
                    } else if (parser.getName().equals("transition")) {
                        r(context, resources, parser, attrs, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final int r(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a2 = a.h.e.c.g.k(resources, theme, attrs, a.b.n.b.AnimatedStateListDrawableTransition);
        int fromId = a2.getResourceId(a.b.n.b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int toId = a2.getResourceId(a.b.n.b.AnimatedStateListDrawableTransition_android_toId, -1);
        Drawable dr = null;
        int drawableId = a2.getResourceId(a.b.n.b.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (drawableId > 0) {
            dr = m0.h().j(context, drawableId);
        }
        boolean reversible = a2.getBoolean(a.b.n.b.AnimatedStateListDrawableTransition_android_reversible, false);
        a2.recycle();
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("animated-vector")) {
                dr = a.s.a.a.b.a(context, resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            }
        }
        if (dr == null) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (fromId != -1 && toId != -1) {
            return this.p.C(fromId, toId, dr, reversible);
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    public final int q(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a2 = a.h.e.c.g.k(resources, theme, attrs, a.b.n.b.AnimatedStateListDrawableItem);
        int keyframeId = a2.getResourceId(a.b.n.b.AnimatedStateListDrawableItem_android_id, 0);
        Drawable dr = null;
        int drawableId = a2.getResourceId(a.b.n.b.AnimatedStateListDrawableItem_android_drawable, -1);
        if (drawableId > 0) {
            dr = m0.h().j(context, drawableId);
        }
        a2.recycle();
        int[] states = k(attrs);
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("vector")) {
                dr = a.s.a.a.g.c(resources, parser, attrs, theme);
            } else {
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            }
        }
        if (dr != null) {
            return this.p.B(states, dr, keyframeId);
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    @Override // a.b.m.a.d, a.b.m.a.b
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.r();
                this.t = true;
            }
        }
        return this;
    }

    /* renamed from: l */
    public c j() {
        return new c(this.p, this, null);
    }

    public static class c extends d.a {
        public a.e.d<Long> K;
        public h<Integer> L;

        public c(c orig, a owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.K = orig.K;
                this.L = orig.L;
                return;
            }
            this.K = new a.e.d<>();
            this.L = new h<>();
        }

        @Override // a.b.m.a.d.a, a.b.m.a.b.c
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public int C(int fromId, int toId, Drawable anim, boolean reversible) {
            int pos = super.a(anim);
            long keyFromTo = D(fromId, toId);
            long reversibleBit = 0;
            if (reversible) {
                reversibleBit = 8589934592L;
            }
            this.K.a(keyFromTo, Long.valueOf(((long) pos) | reversibleBit));
            if (reversible) {
                this.K.a(D(toId, fromId), Long.valueOf(((long) pos) | 4294967296L | reversibleBit));
            }
            return pos;
        }

        public int B(int[] stateSet, Drawable drawable, int id) {
            int index = super.z(stateSet, drawable);
            this.L.i(index, Integer.valueOf(id));
            return index;
        }

        public int F(int[] stateSet) {
            int index = super.A(stateSet);
            if (index >= 0) {
                return index;
            }
            return super.A(StateSet.WILD_CARD);
        }

        public int E(int index) {
            if (index < 0) {
                return 0;
            }
            return this.L.f(index, 0).intValue();
        }

        public int G(int fromId, int toId) {
            return (int) this.K.g(D(fromId, toId), -1L).longValue();
        }

        public boolean H(int fromId, int toId) {
            return (this.K.g(D(fromId, toId), -1L).longValue() & 4294967296L) != 0;
        }

        public boolean I(int fromId, int toId) {
            return (this.K.g(D(fromId, toId), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // a.b.m.a.d.a
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // a.b.m.a.d.a
        public Drawable newDrawable(Resources res) {
            return new a(this, res);
        }

        public static long D(int fromId, int toId) {
            return (((long) fromId) << 32) | ((long) toId);
        }
    }

    @Override // a.b.m.a.d, a.b.m.a.b
    public void h(b.c state) {
        super.h(state);
        if (state instanceof c) {
            this.p = (c) state;
        }
    }

    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f100a;

        /* renamed from: b  reason: collision with root package name */
        public int f101b;

        /* renamed from: c  reason: collision with root package name */
        public int f102c;

        public f(AnimationDrawable d2, boolean reversed) {
            b(d2, reversed);
        }

        public int b(AnimationDrawable d2, boolean reversed) {
            int frameCount = d2.getNumberOfFrames();
            this.f101b = frameCount;
            int[] iArr = this.f100a;
            if (iArr == null || iArr.length < frameCount) {
                this.f100a = new int[frameCount];
            }
            int[] frameTimes = this.f100a;
            int totalDuration = 0;
            for (int i = 0; i < frameCount; i++) {
                int duration = d2.getDuration(reversed ? (frameCount - i) - 1 : i);
                frameTimes[i] = duration;
                totalDuration += duration;
            }
            this.f102c = totalDuration;
            return totalDuration;
        }

        public int a() {
            return this.f102c;
        }

        public float getInterpolation(float input) {
            float frameElapsed;
            int frameCount = this.f101b;
            int[] frameTimes = this.f100a;
            int remaining = (int) ((((float) this.f102c) * input) + 0.5f);
            int i = 0;
            while (i < frameCount && remaining >= frameTimes[i]) {
                remaining -= frameTimes[i];
                i++;
            }
            if (i < frameCount) {
                frameElapsed = ((float) remaining) / ((float) this.f102c);
            } else {
                frameElapsed = 0.0f;
            }
            return (((float) i) / ((float) frameCount)) + frameElapsed;
        }
    }
}
