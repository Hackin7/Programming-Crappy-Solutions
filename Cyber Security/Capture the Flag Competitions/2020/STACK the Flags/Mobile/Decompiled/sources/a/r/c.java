package a.r;

import a.h.m.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class c extends l {
    public static final String[] M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> N = new b(PointF.class, "boundsOrigin");
    public static final Property<k, PointF> O = new C0037c(PointF.class, "topLeft");
    public static final Property<k, PointF> P = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> Q = new e(PointF.class, "bottomRight");
    public static final Property<View, PointF> R = new f(PointF.class, "topLeft");
    public static final Property<View, PointF> S = new g(PointF.class, "position");
    public static j T = new j();
    public int[] J = new int[2];
    public boolean K = false;
    public boolean L = false;

    public static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f1329a = new Rect();

        public b(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: b */
        public void set(Drawable object, PointF value) {
            object.copyBounds(this.f1329a);
            this.f1329a.offsetTo(Math.round(value.x), Math.round(value.y));
            object.setBounds(this.f1329a);
        }

        /* renamed from: a */
        public PointF get(Drawable object) {
            object.copyBounds(this.f1329a);
            Rect rect = this.f1329a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: a.r.c$c  reason: collision with other inner class name */
    public static class C0037c extends Property<k, PointF> {
        public C0037c(Class cls, String x1) {
            super(cls, x1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(k kVar) {
            a();
            return null;
        }

        /* renamed from: b */
        public void set(k viewBounds, PointF topLeft) {
            viewBounds.c(topLeft);
        }

        public PointF a() {
            return null;
        }
    }

    public static class d extends Property<k, PointF> {
        public d(Class cls, String x1) {
            super(cls, x1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(k kVar) {
            a();
            return null;
        }

        /* renamed from: b */
        public void set(k viewBounds, PointF bottomRight) {
            viewBounds.a(bottomRight);
        }

        public PointF a() {
            return null;
        }
    }

    public static class e extends Property<View, PointF> {
        public e(Class cls, String x1) {
            super(cls, x1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            a();
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF bottomRight) {
            z.g(view, view.getLeft(), view.getTop(), Math.round(bottomRight.x), Math.round(bottomRight.y));
        }

        public PointF a() {
            return null;
        }
    }

    public static class f extends Property<View, PointF> {
        public f(Class cls, String x1) {
            super(cls, x1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            a();
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF topLeft) {
            z.g(view, Math.round(topLeft.x), Math.round(topLeft.y), view.getRight(), view.getBottom());
        }

        public PointF a() {
            return null;
        }
    }

    public static class g extends Property<View, PointF> {
        public g(Class cls, String x1) {
            super(cls, x1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            a();
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF topLeft) {
            int left = Math.round(topLeft.x);
            int top = Math.round(topLeft.y);
            z.g(view, left, top, view.getWidth() + left, view.getHeight() + top);
        }

        public PointF a() {
            return null;
        }
    }

    @Override // a.r.l
    public String[] C() {
        return M;
    }

    public final void b0(r values) {
        View view = values.f1403b;
        if (s.K(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            values.f1402a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            values.f1402a.put("android:changeBounds:parent", values.f1403b.getParent());
            if (this.L) {
                values.f1403b.getLocationInWindow(this.J);
                values.f1402a.put("android:changeBounds:windowX", Integer.valueOf(this.J[0]));
                values.f1402a.put("android:changeBounds:windowY", Integer.valueOf(this.J[1]));
            }
            if (this.K) {
                values.f1402a.put("android:changeBounds:clip", s.o(view));
            }
        }
    }

    @Override // a.r.l
    public void i(r transitionValues) {
        b0(transitionValues);
    }

    @Override // a.r.l
    public void f(r transitionValues) {
        b0(transitionValues);
    }

    public final boolean c0(View startParent, View endParent) {
        if (!this.L) {
            return true;
        }
        boolean parentMatches = true;
        r endValues = s(startParent, true);
        if (endValues == null) {
            if (startParent != endParent) {
                parentMatches = false;
            }
            return parentMatches;
        }
        if (endParent != endValues.f1403b) {
            parentMatches = false;
        }
        return parentMatches;
    }

    /* JADX INFO: Multiple debug info for r11v5 int: [D('endRight' int), D('startParentVals' java.util.Map<java.lang.String, java.lang.Object>)] */
    /* JADX INFO: Multiple debug info for r12v4 int: [D('endParentVals' java.util.Map<java.lang.String, java.lang.Object>), D('startBottom' int)] */
    /* JADX INFO: Multiple debug info for r13v3 int: [D('startParent' android.view.ViewGroup), D('endBottom' int)] */
    /* JADX INFO: Multiple debug info for r14v3 int: [D('endParent' android.view.ViewGroup), D('startWidth' int)] */
    /* JADX INFO: Multiple debug info for r6v4 int: [D('startBounds' android.graphics.Rect), D('startHeight' int)] */
    /* JADX INFO: Multiple debug info for r5v6 int: [D('endBounds' android.graphics.Rect), D('endWidth' int)] */
    @Override // a.r.l
    public Animator m(ViewGroup sceneRoot, r startValues, r endValues) {
        boolean z;
        View view;
        Animator anim;
        int endLeft;
        int startTop;
        int startLeft;
        ObjectAnimator positionAnimator;
        Rect startClip;
        int i2;
        Rect endClip;
        Rect rect;
        if (startValues == null) {
            return null;
        }
        if (endValues == null) {
            return null;
        }
        Map<String, Object> startParentVals = startValues.f1402a;
        Map<String, Object> endParentVals = endValues.f1402a;
        ViewGroup startParent = (ViewGroup) startParentVals.get("android:changeBounds:parent");
        ViewGroup endParent = (ViewGroup) endParentVals.get("android:changeBounds:parent");
        if (startParent == null) {
            return null;
        }
        if (endParent == null) {
            return null;
        }
        View view2 = endValues.f1403b;
        if (c0(startParent, endParent)) {
            Rect startBounds = (Rect) startValues.f1402a.get("android:changeBounds:bounds");
            Rect endBounds = (Rect) endValues.f1402a.get("android:changeBounds:bounds");
            int startLeft2 = startBounds.left;
            int endLeft2 = endBounds.left;
            int startTop2 = startBounds.top;
            int endTop = endBounds.top;
            int startRight = startBounds.right;
            int endRight = endBounds.right;
            int startBottom = startBounds.bottom;
            int endBottom = endBounds.bottom;
            int startWidth = startRight - startLeft2;
            int startHeight = startBottom - startTop2;
            int endWidth = endRight - endLeft2;
            int endHeight = endBottom - endTop;
            Rect startClip2 = (Rect) startValues.f1402a.get("android:changeBounds:clip");
            Rect endClip2 = (Rect) endValues.f1402a.get("android:changeBounds:clip");
            int numChanges = 0;
            if (!((startWidth == 0 || startHeight == 0) && (endWidth == 0 || endHeight == 0))) {
                if (!(startLeft2 == endLeft2 && startTop2 == endTop)) {
                    numChanges = 0 + 1;
                }
                if (!(startRight == endRight && startBottom == endBottom)) {
                    numChanges++;
                }
            }
            if ((startClip2 != null && !startClip2.equals(endClip2)) || (startClip2 == null && endClip2 != null)) {
                numChanges++;
            }
            if (numChanges <= 0) {
                return null;
            }
            if (!this.K) {
                z.g(view2, startLeft2, startTop2, startRight, startBottom);
                if (numChanges != 2) {
                    if (startLeft2 != endLeft2) {
                        view = view2;
                    } else if (startTop2 != endTop) {
                        view = view2;
                    } else {
                        view = view2;
                        anim = f.a(view, Q, u().a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                        z = true;
                    }
                    anim = f.a(view, R, u().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    z = true;
                } else if (startWidth == endWidth && startHeight == endHeight) {
                    anim = f.a(view2, S, u().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    view = view2;
                    z = true;
                } else {
                    k viewBounds = new k(view2);
                    ObjectAnimator topLeftAnimator = f.a(viewBounds, O, u().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    ObjectAnimator bottomRightAnimator = f.a(viewBounds, P, u().a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                    AnimatorSet set = new AnimatorSet();
                    set.playTogether(topLeftAnimator, bottomRightAnimator);
                    set.addListener(new h(this, viewBounds));
                    anim = set;
                    view = view2;
                    z = true;
                }
            } else {
                view = view2;
                z.g(view, startLeft2, startTop2, startLeft2 + Math.max(startWidth, endWidth), startTop2 + Math.max(startHeight, endHeight));
                if (startLeft2 == endLeft2 && startTop2 == endTop) {
                    endLeft = endLeft2;
                    positionAnimator = null;
                    startTop = startTop2;
                    startLeft = startLeft2;
                } else {
                    startLeft = startLeft2;
                    startTop = startTop2;
                    endLeft = endLeft2;
                    positionAnimator = f.a(view, S, u().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                }
                if (startClip2 == null) {
                    i2 = 0;
                    startClip = new Rect(0, 0, startWidth, startHeight);
                } else {
                    i2 = 0;
                    startClip = startClip2;
                }
                if (endClip2 == null) {
                    endClip = new Rect(i2, i2, endWidth, endHeight);
                } else {
                    endClip = endClip2;
                }
                ObjectAnimator clipAnimator = null;
                if (!startClip.equals(endClip)) {
                    s.d0(view, startClip);
                    ObjectAnimator clipAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", T, startClip, endClip);
                    rect = startClip;
                    z = true;
                    clipAnimator2.addListener(new i(this, view, endClip2, endLeft, endTop, endRight, endBottom));
                    clipAnimator = clipAnimator2;
                } else {
                    z = true;
                    rect = startClip;
                }
                anim = q.c(positionAnimator, clipAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup parent = (ViewGroup) view.getParent();
                v.b(parent, z);
                a(new j(this, parent));
            }
            return anim;
        }
        int startX = ((Integer) startValues.f1402a.get("android:changeBounds:windowX")).intValue();
        int startY = ((Integer) startValues.f1402a.get("android:changeBounds:windowY")).intValue();
        int endX = ((Integer) endValues.f1402a.get("android:changeBounds:windowX")).intValue();
        int endY = ((Integer) endValues.f1402a.get("android:changeBounds:windowY")).intValue();
        if (startX == endX && startY == endY) {
            return null;
        }
        sceneRoot.getLocationInWindow(this.J);
        Bitmap bitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(bitmap));
        BitmapDrawable drawable = new BitmapDrawable(bitmap);
        float transitionAlpha = z.d(view2);
        z.h(view2, 0.0f);
        ((x) z.c(sceneRoot)).b(drawable);
        g u = u();
        int[] iArr = this.J;
        ObjectAnimator anim2 = ObjectAnimator.ofPropertyValuesHolder(drawable, h.a(N, u.a((float) (startX - iArr[0]), (float) (startY - iArr[1]), (float) (endX - iArr[0]), (float) (endY - iArr[1]))));
        anim2.addListener(new a(this, sceneRoot, drawable, view2, transitionAlpha));
        return anim2;
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f1330a;
        public k mViewBounds = this.f1330a;

        public h(c this$0, k kVar) {
            this.f1330a = kVar;
        }
    }

    public class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1331a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1332b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Rect f1333c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f1334d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f1335e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f1336f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f1337g;

        public i(c this$0, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f1332b = view;
            this.f1333c = rect;
            this.f1334d = i;
            this.f1335e = i2;
            this.f1336f = i3;
            this.f1337g = i4;
        }

        public void onAnimationCancel(Animator animation) {
            this.f1331a = true;
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f1331a) {
                s.d0(this.f1332b, this.f1333c);
                z.g(this.f1332b, this.f1334d, this.f1335e, this.f1336f, this.f1337g);
            }
        }
    }

    public class j extends m {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1338a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1339b;

        public j(c this$0, ViewGroup viewGroup) {
            this.f1339b = viewGroup;
        }

        @Override // a.r.l.f
        public void d(l transition) {
            if (!this.f1338a) {
                v.b(this.f1339b, false);
            }
            transition.O(this);
        }

        @Override // a.r.m, a.r.l.f
        public void a(l transition) {
            v.b(this.f1339b, false);
        }

        @Override // a.r.m, a.r.l.f
        public void b(l transition) {
            v.b(this.f1339b, true);
        }
    }

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1325a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f1326b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1327c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f1328d;

        public a(c this$0, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f1325a = viewGroup;
            this.f1326b = bitmapDrawable;
            this.f1327c = view;
            this.f1328d = f2;
        }

        public void onAnimationEnd(Animator animation) {
            ((x) z.c(this.f1325a)).c(this.f1326b);
            z.h(this.f1327c, this.f1328d);
        }
    }

    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public int f1340a;

        /* renamed from: b  reason: collision with root package name */
        public int f1341b;

        /* renamed from: c  reason: collision with root package name */
        public int f1342c;

        /* renamed from: d  reason: collision with root package name */
        public int f1343d;

        /* renamed from: e  reason: collision with root package name */
        public View f1344e;

        /* renamed from: f  reason: collision with root package name */
        public int f1345f;

        /* renamed from: g  reason: collision with root package name */
        public int f1346g;

        public k(View view) {
            this.f1344e = view;
        }

        public void c(PointF topLeft) {
            this.f1340a = Math.round(topLeft.x);
            this.f1341b = Math.round(topLeft.y);
            int i = this.f1345f + 1;
            this.f1345f = i;
            if (i == this.f1346g) {
                b();
            }
        }

        public void a(PointF bottomRight) {
            this.f1342c = Math.round(bottomRight.x);
            this.f1343d = Math.round(bottomRight.y);
            int i = this.f1346g + 1;
            this.f1346g = i;
            if (this.f1345f == i) {
                b();
            }
        }

        public final void b() {
            z.g(this.f1344e, this.f1340a, this.f1341b, this.f1342c, this.f1343d);
            this.f1345f = 0;
            this.f1346g = 0;
        }
    }
}
