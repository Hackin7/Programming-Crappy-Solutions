package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: p */
public class C0787p extends C0799s {

    /* renamed from: c */
    private static final String f3321c = "p";

    /* renamed from: d */
    private C0789b f3322d;

    /* renamed from: e */
    private C0793f f3323e;

    /* renamed from: f */
    private int f3324f;

    /* renamed from: g */
    private int f3325g;

    /* renamed from: h */
    private boolean f3326h;

    /* renamed from: p$a */
    static class C0788a extends C0793f {

        /* renamed from: a */
        private final Animatable f3327a;

        C0788a(Animatable animatable) {
            super(0);
            this.f3327a = animatable;
        }

        /* renamed from: a */
        public final void mo2745a() {
            this.f3327a.start();
        }

        /* renamed from: b */
        public final void mo2746b() {
            this.f3327a.stop();
        }
    }

    /* renamed from: p$b */
    static class C0789b extends C0800a {

        /* renamed from: a */
        C0248dh<Long> f3328a;

        /* renamed from: b */
        C0257dl<Integer> f3329b;

        C0789b(C0789b bVar, C0787p pVar, Resources resources) {
            C0257dl<Integer> dlVar;
            super(bVar, pVar, resources);
            if (bVar != null) {
                this.f3328a = bVar.f3328a;
                dlVar = bVar.f3329b;
            } else {
                this.f3328a = new C0248dh<>();
                dlVar = new C0257dl<>();
            }
            this.f3329b = dlVar;
        }

        /* renamed from: a */
        static long m2620a(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2747a(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f3329b.mo1489a(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2748a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo2765a(drawable);
            long a2 = m2620a(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f3328a.mo1407c(a2, Long.valueOf(j2 | j));
            if (z) {
                this.f3328a.mo1407c(m2620a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2749a(int[] iArr) {
            int b = super.mo2802b(iArr);
            return b >= 0 ? b : super.mo2802b(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2750a() {
            this.f3328a = this.f3328a.clone();
            this.f3329b = this.f3329b.clone();
        }

        public final Drawable newDrawable() {
            return new C0787p(this, null);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0787p(this, resources);
        }
    }

    /* renamed from: p$c */
    static class C0790c extends C0793f {

        /* renamed from: a */
        private final C0555jh f3330a;

        C0790c(C0555jh jhVar) {
            super(0);
            this.f3330a = jhVar;
        }

        /* renamed from: a */
        public final void mo2745a() {
            this.f3330a.start();
        }

        /* renamed from: b */
        public final void mo2746b() {
            this.f3330a.stop();
        }
    }

    /* renamed from: p$d */
    static class C0791d extends C0793f {

        /* renamed from: a */
        private final ObjectAnimator f3331a;

        /* renamed from: b */
        private final boolean f3332b;

        C0791d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(0);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0792e eVar = new C0792e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.f3333a);
            ofInt.setInterpolator(eVar);
            this.f3332b = z2;
            this.f3331a = ofInt;
        }

        /* renamed from: a */
        public final void mo2745a() {
            this.f3331a.start();
        }

        /* renamed from: b */
        public final void mo2746b() {
            this.f3331a.cancel();
        }

        /* renamed from: c */
        public final boolean mo2753c() {
            return this.f3332b;
        }

        /* renamed from: d */
        public final void mo2754d() {
            this.f3331a.reverse();
        }
    }

    /* renamed from: p$e */
    static class C0792e implements TimeInterpolator {

        /* renamed from: a */
        int f3333a;

        /* renamed from: b */
        private int[] f3334b;

        /* renamed from: c */
        private int f3335c;

        C0792e(AnimationDrawable animationDrawable, boolean z) {
            m2631a(animationDrawable, z);
        }

        /* renamed from: a */
        private int m2631a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f3335c = numberOfFrames;
            if (this.f3334b == null || this.f3334b.length < numberOfFrames) {
                this.f3334b = new int[numberOfFrames];
            }
            int[] iArr = this.f3334b;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr[i2] = duration;
                i += duration;
            }
            this.f3333a = i;
            return i;
        }

        public final float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f3333a)) + 0.5f);
            int i2 = this.f3335c;
            int[] iArr = this.f3334b;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f3333a) : 0.0f);
        }
    }

    /* renamed from: p$f */
    static abstract class C0793f {
        private C0793f() {
        }

        /* synthetic */ C0793f(byte b) {
            this();
        }

        /* renamed from: a */
        public abstract void mo2745a();

        /* renamed from: b */
        public abstract void mo2746b();

        /* renamed from: c */
        public boolean mo2753c() {
            return false;
        }

        /* renamed from: d */
        public void mo2754d() {
        }
    }

    public C0787p() {
        this(null, null);
    }

    C0787p(C0789b bVar, Resources resources) {
        super(0);
        this.f3324f = -1;
        this.f3325g = -1;
        mo2710a(new C0789b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0787p m2611a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid animated-selector tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        C0787p pVar = new C0787p();
        TypedArray a = C0330fd.m1078a(resources, theme, attributeSet, C0126j.AnimatedStateListDrawableCompat);
        pVar.setVisible(a.getBoolean(C0126j.AnimatedStateListDrawableCompat_android_visible, true), true);
        C0789b bVar = pVar.f3322d;
        if (VERSION.SDK_INT >= 21) {
            bVar.f3365f |= a.getChangingConfigurations();
        }
        bVar.f3370k = a.getBoolean(C0126j.AnimatedStateListDrawableCompat_android_variablePadding, bVar.f3370k);
        bVar.f3373n = a.getBoolean(C0126j.AnimatedStateListDrawableCompat_android_constantSize, bVar.f3373n);
        bVar.f3353C = a.getInt(C0126j.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.f3353C);
        bVar.f3354D = a.getInt(C0126j.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.f3354D);
        pVar.setDither(a.getBoolean(C0126j.AnimatedStateListDrawableCompat_android_dither, bVar.f3385z));
        pVar.f3336a.mo2766a(resources);
        a.recycle();
        pVar.m2612b(context, resources, xmlPullParser, attributeSet, theme);
        pVar.onStateChange(pVar.getState());
        return pVar;
    }

    /* renamed from: b */
    private void m2612b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        AttributeSet attributeSet2 = attributeSet;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                break;
            } else if (next2 != 2 || depth2 > depth) {
                Context context2 = context;
                Resources resources2 = resources;
                Theme theme2 = theme;
            } else if (xmlPullParser.getName().equals("item")) {
                TypedArray a = C0330fd.m1078a(resources, theme, attributeSet2, C0126j.AnimatedStateListDrawableItem);
                int resourceId = a.getResourceId(C0126j.AnimatedStateListDrawableItem_android_id, 0);
                Drawable drawable = null;
                int resourceId2 = a.getResourceId(C0126j.AnimatedStateListDrawableItem_android_drawable, -1);
                if (resourceId2 > 0) {
                    drawable = C0785o.m2608b(context, resourceId2);
                } else {
                    Context context3 = context;
                }
                a.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet2.getAttributeNameResource(i2);
                    if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                        int i3 = i + 1;
                        if (!attributeSet2.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr, i);
                if (drawable == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(xmlPullParser.getPositionDescription());
                        sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        throw new XmlPullParserException(sb.toString());
                    }
                    drawable = xmlPullParser.getName().equals("vector") ? C0565jn.m1748a(resources, xmlPullParser, attributeSet, theme) : VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
                if (drawable == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(xmlPullParser.getPositionDescription());
                    sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    throw new XmlPullParserException(sb2.toString());
                }
                C0789b bVar = this.f3322d;
                int a2 = bVar.mo2765a(drawable);
                bVar.f3389L[a2] = trimStateSet;
                bVar.f3329b.mo1493b(a2, Integer.valueOf(resourceId));
            } else {
                Context context4 = context;
                Resources resources3 = resources;
                Theme theme3 = theme;
                if (xmlPullParser.getName().equals("transition")) {
                    m2613c(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: c */
    private int m2613c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int next;
        TypedArray a = C0330fd.m1078a(resources, theme, attributeSet, C0126j.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0126j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0126j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C0126j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable b = resourceId3 > 0 ? C0785o.m2608b(context, resourceId3) : null;
        boolean z = a.getBoolean(C0126j.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
            b = xmlPullParser.getName().equals("animated-vector") ? C0555jh.m1730a(context, resources, xmlPullParser, attributeSet, theme) : VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (b == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f3322d.mo2748a(resourceId, resourceId2, b, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C0789b mo2712b() {
        return new C0789b(this.f3322d, this, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2710a(C0797b bVar) {
        super.mo2710a(bVar);
        if (bVar instanceof C0789b) {
            this.f3322d = (C0789b) bVar;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        return this.f3322d;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.f3323e != null) {
            this.f3323e.mo2746b();
            this.f3323e = null;
            mo2757a(this.f3324f);
            this.f3324f = -1;
            this.f3325g = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f3326h && super.mutate() == this) {
            this.f3322d.mo2750a();
            this.f3326h = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r15) {
        /*
            r14 = this;
            p$b r0 = r14.f3322d
            int r0 = r0.mo2749a(r15)
            int r1 = r14.f3337b
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x00e9
            p$f r1 = r14.f3323e
            if (r1 == 0) goto L_0x0031
            int r4 = r14.f3324f
            if (r0 != r4) goto L_0x0017
        L_0x0014:
            r1 = r3
            goto L_0x00e0
        L_0x0017:
            int r4 = r14.f3325g
            if (r0 != r4) goto L_0x002b
            boolean r4 = r1.mo2753c()
            if (r4 == 0) goto L_0x002b
            r1.mo2754d()
            int r1 = r14.f3325g
            r14.f3324f = r1
            r14.f3325g = r0
            goto L_0x0014
        L_0x002b:
            int r4 = r14.f3324f
            r1.mo2746b()
            goto L_0x0033
        L_0x0031:
            int r4 = r14.f3337b
        L_0x0033:
            r1 = 0
            r14.f3323e = r1
            r1 = -1
            r14.f3325g = r1
            r14.f3324f = r1
            p$b r1 = r14.f3322d
            int r5 = r1.mo2747a(r4)
            int r6 = r1.mo2747a(r0)
            if (r6 == 0) goto L_0x00df
            if (r5 != 0) goto L_0x004b
            goto L_0x00df
        L_0x004b:
            long r7 = p000.C0787p.C0789b.m2620a(r5, r6)
            dh<java.lang.Long> r9 = r1.f3328a
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r7 = r9.mo1405a(r7, r12)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r7 = (int) r7
            if (r7 >= 0) goto L_0x0066
            goto L_0x00df
        L_0x0066:
            long r8 = p000.C0787p.C0789b.m2620a(r5, r6)
            dh<java.lang.Long> r12 = r1.f3328a
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r8 = r12.mo1405a(r8, r13)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            long r8 = r8 & r12
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0088
            r8 = r3
            goto L_0x0089
        L_0x0088:
            r8 = r2
        L_0x0089:
            r14.mo2757a(r7)
            android.graphics.drawable.Drawable r7 = r14.getCurrent()
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L_0x00bd
            long r5 = p000.C0787p.C0789b.m2620a(r5, r6)
            dh<java.lang.Long> r1 = r1.f3328a
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.Object r1 = r1.mo1405a(r5, r9)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r5 = r5 & r9
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00b4
            r1 = r3
            goto L_0x00b5
        L_0x00b4:
            r1 = r2
        L_0x00b5:
            p$d r5 = new p$d
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r1, r8)
            goto L_0x00d4
        L_0x00bd:
            boolean r1 = r7 instanceof p000.C0555jh
            if (r1 == 0) goto L_0x00c9
            p$c r5 = new p$c
            jh r7 = (p000.C0555jh) r7
            r5.<init>(r7)
            goto L_0x00d4
        L_0x00c9:
            boolean r1 = r7 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x00df
            p$a r5 = new p$a
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L_0x00d4:
            r5.mo2745a()
            r14.f3323e = r5
            r14.f3325g = r4
            r14.f3324f = r0
            goto L_0x0014
        L_0x00df:
            r1 = r2
        L_0x00e0:
            if (r1 != 0) goto L_0x00e8
            boolean r0 = r14.mo2757a(r0)
            if (r0 == 0) goto L_0x00e9
        L_0x00e8:
            r2 = r3
        L_0x00e9:
            android.graphics.drawable.Drawable r0 = r14.getCurrent()
            if (r0 == 0) goto L_0x00f4
            boolean r15 = r0.setState(r15)
            r2 = r2 | r15
        L_0x00f4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0787p.onStateChange(int[]):boolean");
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f3323e != null && (visible || z2)) {
            if (z) {
                this.f3323e.mo2745a();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
