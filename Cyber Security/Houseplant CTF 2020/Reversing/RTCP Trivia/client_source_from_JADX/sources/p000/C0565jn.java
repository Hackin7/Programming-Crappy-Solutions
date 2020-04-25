package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: jn */
public final class C0565jn extends C0564jm {

    /* renamed from: a */
    static final Mode f2290a = Mode.SRC_IN;

    /* renamed from: b */
    C0572g f2291b;

    /* renamed from: d */
    boolean f2292d;

    /* renamed from: e */
    private PorterDuffColorFilter f2293e;

    /* renamed from: f */
    private ColorFilter f2294f;

    /* renamed from: g */
    private boolean f2295g;

    /* renamed from: h */
    private ConstantState f2296h;

    /* renamed from: i */
    private final float[] f2297i;

    /* renamed from: j */
    private final Matrix f2298j;

    /* renamed from: k */
    private final Rect f2299k;

    /* renamed from: jn$a */
    static class C0566a extends C0570e {
        public C0566a() {
        }

        public C0566a(C0566a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2222a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2327n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2326m = C0332ff.m1093b(string2);
            }
        }

        /* renamed from: a */
        public final boolean mo2223a() {
            return true;
        }
    }

    /* renamed from: jn$b */
    static class C0567b extends C0570e {

        /* renamed from: a */
        C0316ey f2300a;

        /* renamed from: b */
        float f2301b = 0.0f;

        /* renamed from: c */
        C0316ey f2302c;

        /* renamed from: d */
        float f2303d = 1.0f;

        /* renamed from: e */
        int f2304e = 0;

        /* renamed from: f */
        float f2305f = 1.0f;

        /* renamed from: g */
        float f2306g = 0.0f;

        /* renamed from: h */
        float f2307h = 1.0f;

        /* renamed from: i */
        float f2308i = 0.0f;

        /* renamed from: j */
        Cap f2309j = Cap.BUTT;

        /* renamed from: k */
        Join f2310k = Join.MITER;

        /* renamed from: l */
        float f2311l = 4.0f;

        /* renamed from: p */
        private int[] f2312p;

        public C0567b() {
        }

        public C0567b(C0567b bVar) {
            super(bVar);
            this.f2312p = bVar.f2312p;
            this.f2300a = bVar.f2300a;
            this.f2301b = bVar.f2301b;
            this.f2303d = bVar.f2303d;
            this.f2302c = bVar.f2302c;
            this.f2304e = bVar.f2304e;
            this.f2305f = bVar.f2305f;
            this.f2306g = bVar.f2306g;
            this.f2307h = bVar.f2307h;
            this.f2308i = bVar.f2308i;
            this.f2309j = bVar.f2309j;
            this.f2310k = bVar.f2310k;
            this.f2311l = bVar.f2311l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2224a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f2312p = null;
            if (C0330fd.m1081a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2327n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2326m = C0332ff.m1093b(string2);
                }
                this.f2302c = C0330fd.m1080a(typedArray, xmlPullParser, theme, "fillColor", 1);
                this.f2305f = C0330fd.m1075a(typedArray, xmlPullParser, "fillAlpha", 12, this.f2305f);
                int a = C0330fd.m1077a(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
                Cap cap = this.f2309j;
                switch (a) {
                    case 0:
                        cap = Cap.BUTT;
                        break;
                    case 1:
                        cap = Cap.ROUND;
                        break;
                    case 2:
                        cap = Cap.SQUARE;
                        break;
                }
                this.f2309j = cap;
                int a2 = C0330fd.m1077a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
                Join join = this.f2310k;
                switch (a2) {
                    case 0:
                        join = Join.MITER;
                        break;
                    case 1:
                        join = Join.ROUND;
                        break;
                    case 2:
                        join = Join.BEVEL;
                        break;
                }
                this.f2310k = join;
                this.f2311l = C0330fd.m1075a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f2311l);
                this.f2300a = C0330fd.m1080a(typedArray, xmlPullParser, theme, "strokeColor", 3);
                this.f2303d = C0330fd.m1075a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2303d);
                this.f2301b = C0330fd.m1075a(typedArray, xmlPullParser, "strokeWidth", 4, this.f2301b);
                this.f2307h = C0330fd.m1075a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2307h);
                this.f2308i = C0330fd.m1075a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2308i);
                this.f2306g = C0330fd.m1075a(typedArray, xmlPullParser, "trimPathStart", 5, this.f2306g);
                this.f2304e = C0330fd.m1077a(typedArray, xmlPullParser, "fillType", 13, this.f2304e);
            }
        }

        /* renamed from: a */
        public final boolean mo2225a(int[] iArr) {
            return this.f2300a.mo1693a(iArr) | this.f2302c.mo1693a(iArr);
        }

        /* renamed from: b */
        public final boolean mo2226b() {
            return this.f2302c.mo1694b() || this.f2300a.mo1694b();
        }

        /* access modifiers changed from: 0000 */
        public final float getFillAlpha() {
            return this.f2305f;
        }

        /* access modifiers changed from: 0000 */
        public final int getFillColor() {
            return this.f2302c.f1595b;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeAlpha() {
            return this.f2303d;
        }

        /* access modifiers changed from: 0000 */
        public final int getStrokeColor() {
            return this.f2300a.f1595b;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeWidth() {
            return this.f2301b;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathEnd() {
            return this.f2307h;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathOffset() {
            return this.f2308i;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathStart() {
            return this.f2306g;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillAlpha(float f) {
            this.f2305f = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillColor(int i) {
            this.f2302c.f1595b = i;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeAlpha(float f) {
            this.f2303d = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeColor(int i) {
            this.f2300a.f1595b = i;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeWidth(float f) {
            this.f2301b = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathEnd(float f) {
            this.f2307h = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathOffset(float f) {
            this.f2308i = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathStart(float f) {
            this.f2306g = f;
        }
    }

    /* renamed from: jn$c */
    static class C0568c extends C0569d {

        /* renamed from: a */
        final Matrix f2313a = new Matrix();

        /* renamed from: b */
        final ArrayList<C0569d> f2314b = new ArrayList<>();

        /* renamed from: c */
        float f2315c = 0.0f;

        /* renamed from: d */
        float f2316d = 0.0f;

        /* renamed from: e */
        float f2317e = 0.0f;

        /* renamed from: f */
        float f2318f = 1.0f;

        /* renamed from: g */
        float f2319g = 1.0f;

        /* renamed from: h */
        float f2320h = 0.0f;

        /* renamed from: i */
        float f2321i = 0.0f;

        /* renamed from: j */
        final Matrix f2322j = new Matrix();

        /* renamed from: k */
        int f2323k;

        /* renamed from: l */
        int[] f2324l;

        /* renamed from: m */
        String f2325m = null;

        public C0568c() {
            super(0);
        }

        public C0568c(C0568c cVar, C0243de<String, Object> deVar) {
            C0570e eVar;
            super(0);
            this.f2315c = cVar.f2315c;
            this.f2316d = cVar.f2316d;
            this.f2317e = cVar.f2317e;
            this.f2318f = cVar.f2318f;
            this.f2319g = cVar.f2319g;
            this.f2320h = cVar.f2320h;
            this.f2321i = cVar.f2321i;
            this.f2324l = cVar.f2324l;
            this.f2325m = cVar.f2325m;
            this.f2323k = cVar.f2323k;
            if (this.f2325m != null) {
                deVar.put(this.f2325m, this);
            }
            this.f2322j.set(cVar.f2322j);
            ArrayList<C0569d> arrayList = cVar.f2314b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0568c) {
                    this.f2314b.add(new C0568c((C0568c) obj, deVar));
                } else {
                    if (obj instanceof C0567b) {
                        eVar = new C0567b((C0567b) obj);
                    } else if (obj instanceof C0566a) {
                        eVar = new C0566a((C0566a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f2314b.add(eVar);
                    if (eVar.f2327n != null) {
                        deVar.put(eVar.f2327n, eVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2243a() {
            this.f2322j.reset();
            this.f2322j.postTranslate(-this.f2316d, -this.f2317e);
            this.f2322j.postScale(this.f2318f, this.f2319g);
            this.f2322j.postRotate(this.f2315c, 0.0f, 0.0f);
            this.f2322j.postTranslate(this.f2320h + this.f2316d, this.f2321i + this.f2317e);
        }

        /* renamed from: a */
        public final boolean mo2225a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f2314b.size(); i++) {
                z |= ((C0569d) this.f2314b.get(i)).mo2225a(iArr);
            }
            return z;
        }

        /* renamed from: b */
        public final boolean mo2226b() {
            for (int i = 0; i < this.f2314b.size(); i++) {
                if (((C0569d) this.f2314b.get(i)).mo2226b()) {
                    return true;
                }
            }
            return false;
        }

        public final String getGroupName() {
            return this.f2325m;
        }

        public final Matrix getLocalMatrix() {
            return this.f2322j;
        }

        public final float getPivotX() {
            return this.f2316d;
        }

        public final float getPivotY() {
            return this.f2317e;
        }

        public final float getRotation() {
            return this.f2315c;
        }

        public final float getScaleX() {
            return this.f2318f;
        }

        public final float getScaleY() {
            return this.f2319g;
        }

        public final float getTranslateX() {
            return this.f2320h;
        }

        public final float getTranslateY() {
            return this.f2321i;
        }

        public final void setPivotX(float f) {
            if (f != this.f2316d) {
                this.f2316d = f;
                mo2243a();
            }
        }

        public final void setPivotY(float f) {
            if (f != this.f2317e) {
                this.f2317e = f;
                mo2243a();
            }
        }

        public final void setRotation(float f) {
            if (f != this.f2315c) {
                this.f2315c = f;
                mo2243a();
            }
        }

        public final void setScaleX(float f) {
            if (f != this.f2318f) {
                this.f2318f = f;
                mo2243a();
            }
        }

        public final void setScaleY(float f) {
            if (f != this.f2319g) {
                this.f2319g = f;
                mo2243a();
            }
        }

        public final void setTranslateX(float f) {
            if (f != this.f2320h) {
                this.f2320h = f;
                mo2243a();
            }
        }

        public final void setTranslateY(float f) {
            if (f != this.f2321i) {
                this.f2321i = f;
                mo2243a();
            }
        }
    }

    /* renamed from: jn$d */
    static abstract class C0569d {
        private C0569d() {
        }

        /* synthetic */ C0569d(byte b) {
            this();
        }

        /* renamed from: a */
        public boolean mo2225a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2226b() {
            return false;
        }
    }

    /* renamed from: jn$e */
    static abstract class C0570e extends C0569d {

        /* renamed from: m */
        protected C0334b[] f2326m = null;

        /* renamed from: n */
        String f2327n;

        /* renamed from: o */
        int f2328o;

        public C0570e() {
            super(0);
        }

        public C0570e(C0570e eVar) {
            super(0);
            this.f2327n = eVar.f2327n;
            this.f2328o = eVar.f2328o;
            this.f2326m = C0332ff.m1092a(eVar.f2326m);
        }

        /* renamed from: a */
        public final void mo2260a(Path path) {
            path.reset();
            if (this.f2326m != null) {
                C0334b.m1097a(this.f2326m, path);
            }
        }

        /* renamed from: a */
        public boolean mo2223a() {
            return false;
        }

        public C0334b[] getPathData() {
            return this.f2326m;
        }

        public String getPathName() {
            return this.f2327n;
        }

        public void setPathData(C0334b[] bVarArr) {
            if (!C0332ff.m1090a(this.f2326m, bVarArr)) {
                this.f2326m = C0332ff.m1092a(bVarArr);
                return;
            }
            C0334b[] bVarArr2 = this.f2326m;
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr2[i].f1617a = bVarArr[i].f1617a;
                for (int i2 = 0; i2 < bVarArr[i].f1618b.length; i2++) {
                    bVarArr2[i].f1618b[i2] = bVarArr[i].f1618b[i2];
                }
            }
        }
    }

    /* renamed from: jn$f */
    static class C0571f {

        /* renamed from: n */
        private static final Matrix f2329n = new Matrix();

        /* renamed from: a */
        Paint f2330a;

        /* renamed from: b */
        Paint f2331b;

        /* renamed from: c */
        final C0568c f2332c;

        /* renamed from: d */
        float f2333d;

        /* renamed from: e */
        float f2334e;

        /* renamed from: f */
        float f2335f;

        /* renamed from: g */
        float f2336g;

        /* renamed from: h */
        int f2337h;

        /* renamed from: i */
        String f2338i;

        /* renamed from: j */
        Boolean f2339j;

        /* renamed from: k */
        final C0243de<String, Object> f2340k;

        /* renamed from: l */
        private final Path f2341l;

        /* renamed from: m */
        private final Path f2342m;

        /* renamed from: o */
        private final Matrix f2343o;

        /* renamed from: p */
        private PathMeasure f2344p;

        /* renamed from: q */
        private int f2345q;

        public C0571f() {
            this.f2343o = new Matrix();
            this.f2333d = 0.0f;
            this.f2334e = 0.0f;
            this.f2335f = 0.0f;
            this.f2336g = 0.0f;
            this.f2337h = 255;
            this.f2338i = null;
            this.f2339j = null;
            this.f2340k = new C0243de<>();
            this.f2332c = new C0568c();
            this.f2341l = new Path();
            this.f2342m = new Path();
        }

        public C0571f(C0571f fVar) {
            this.f2343o = new Matrix();
            this.f2333d = 0.0f;
            this.f2334e = 0.0f;
            this.f2335f = 0.0f;
            this.f2336g = 0.0f;
            this.f2337h = 255;
            this.f2338i = null;
            this.f2339j = null;
            this.f2340k = new C0243de<>();
            this.f2332c = new C0568c(fVar.f2332c, this.f2340k);
            this.f2341l = new Path(fVar.f2341l);
            this.f2342m = new Path(fVar.f2342m);
            this.f2333d = fVar.f2333d;
            this.f2334e = fVar.f2334e;
            this.f2335f = fVar.f2335f;
            this.f2336g = fVar.f2336g;
            this.f2345q = fVar.f2345q;
            this.f2337h = fVar.f2337h;
            this.f2338i = fVar.f2338i;
            if (fVar.f2338i != null) {
                this.f2340k.put(fVar.f2338i, this);
            }
            this.f2339j = fVar.f2339j;
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        /* JADX WARNING: type inference failed for: r11v21 */
        /* JADX WARNING: type inference failed for: r11v22 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v1, types: [boolean]
          assigns: []
          uses: [?[int, short, byte, char], boolean]
          mth insns count: 222
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1762a(p000.C0565jn.C0568c r18, android.graphics.Matrix r19, android.graphics.Canvas r20, int r21, int r22, android.graphics.ColorFilter r23) {
            /*
                r17 = this;
                r7 = r17
                r8 = r18
                r9 = r20
                r10 = r23
                android.graphics.Matrix r0 = r8.f2313a
                r1 = r19
                r0.set(r1)
                android.graphics.Matrix r0 = r8.f2313a
                android.graphics.Matrix r1 = r8.f2322j
                r0.preConcat(r1)
                r20.save()
                r11 = 0
                r12 = r11
            L_0x001b:
                java.util.ArrayList<jn$d> r0 = r8.f2314b
                int r0 = r0.size()
                if (r12 >= r0) goto L_0x01fb
                java.util.ArrayList<jn$d> r0 = r8.f2314b
                java.lang.Object r0 = r0.get(r12)
                jn$d r0 = (p000.C0565jn.C0569d) r0
                boolean r1 = r0 instanceof p000.C0565jn.C0568c
                if (r1 == 0) goto L_0x0045
                r1 = r0
                jn$c r1 = (p000.C0565jn.C0568c) r1
                android.graphics.Matrix r2 = r8.f2313a
                r0 = r7
                r3 = r9
                r4 = r21
                r5 = r22
                r6 = r10
                r0.m1762a(r1, r2, r3, r4, r5, r6)
            L_0x003e:
                r1 = r21
                r3 = r22
                r5 = r7
                goto L_0x01f5
            L_0x0045:
                boolean r1 = r0 instanceof p000.C0565jn.C0570e
                if (r1 == 0) goto L_0x003e
                jn$e r0 = (p000.C0565jn.C0570e) r0
                r1 = r21
                float r2 = (float) r1
                float r3 = r7.f2335f
                float r2 = r2 / r3
                r3 = r22
                float r4 = (float) r3
                float r5 = r7.f2336g
                float r4 = r4 / r5
                float r5 = java.lang.Math.min(r2, r4)
                android.graphics.Matrix r6 = r8.f2313a
                android.graphics.Matrix r13 = r7.f2343o
                r13.set(r6)
                android.graphics.Matrix r13 = r7.f2343o
                r13.postScale(r2, r4)
                r2 = 4
                float[] r2 = new float[r2]
                r2 = {0, 1065353216, 1065353216, 0} // fill-array
                r6.mapVectors(r2)
                r4 = r2[r11]
                double r13 = (double) r4
                r4 = 1
                r6 = r2[r4]
                r15 = r5
                double r4 = (double) r6
                double r4 = java.lang.Math.hypot(r13, r4)
                float r4 = (float) r4
                r5 = 2
                r6 = r2[r5]
                double r13 = (double) r6
                r6 = 3
                r5 = r2[r6]
                double r6 = (double) r5
                double r5 = java.lang.Math.hypot(r13, r6)
                float r5 = (float) r5
                r6 = r2[r11]
                r7 = 1
                r13 = r2[r7]
                r7 = 2
                r7 = r2[r7]
                r14 = 3
                r2 = r2[r14]
                float r6 = r6 * r2
                float r13 = r13 * r7
                float r6 = r6 - r13
                float r2 = java.lang.Math.max(r4, r5)
                r4 = 0
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x00a8
                float r5 = java.lang.Math.abs(r6)
                float r2 = r5 / r2
                goto L_0x00a9
            L_0x00a8:
                r2 = r4
            L_0x00a9:
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x01f3
                r5 = r17
                android.graphics.Path r6 = r5.f2341l
                r0.mo2260a(r6)
                android.graphics.Path r6 = r5.f2341l
                android.graphics.Path r7 = r5.f2342m
                r7.reset()
                boolean r7 = r0.mo2223a()
                if (r7 == 0) goto L_0x00cf
                android.graphics.Path r0 = r5.f2342m
                android.graphics.Matrix r2 = r5.f2343o
                r0.addPath(r6, r2)
                android.graphics.Path r0 = r5.f2342m
                r9.clipPath(r0)
                goto L_0x01f5
            L_0x00cf:
                jn$b r0 = (p000.C0565jn.C0567b) r0
                float r7 = r0.f2306g
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                r13 = 1065353216(0x3f800000, float:1.0)
                if (r7 != 0) goto L_0x00df
                float r7 = r0.f2307h
                int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r7 == 0) goto L_0x0123
            L_0x00df:
                float r7 = r0.f2306g
                float r14 = r0.f2308i
                float r7 = r7 + r14
                float r7 = r7 % r13
                float r14 = r0.f2307h
                float r4 = r0.f2308i
                float r14 = r14 + r4
                float r14 = r14 % r13
                android.graphics.PathMeasure r4 = r5.f2344p
                if (r4 != 0) goto L_0x00f6
                android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
                r4.<init>()
                r5.f2344p = r4
            L_0x00f6:
                android.graphics.PathMeasure r4 = r5.f2344p
                android.graphics.Path r13 = r5.f2341l
                r4.setPath(r13, r11)
                android.graphics.PathMeasure r4 = r5.f2344p
                float r4 = r4.getLength()
                float r7 = r7 * r4
                float r14 = r14 * r4
                r6.reset()
                int r13 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r13 <= 0) goto L_0x0119
                android.graphics.PathMeasure r13 = r5.f2344p
                r11 = 1
                r13.getSegment(r7, r4, r6, r11)
                android.graphics.PathMeasure r4 = r5.f2344p
                r13 = 0
                r4.getSegment(r13, r14, r6, r11)
                goto L_0x0120
            L_0x0119:
                r11 = 1
                r13 = 0
                android.graphics.PathMeasure r4 = r5.f2344p
                r4.getSegment(r7, r14, r6, r11)
            L_0x0120:
                r6.rLineTo(r13, r13)
            L_0x0123:
                android.graphics.Path r4 = r5.f2342m
                android.graphics.Matrix r7 = r5.f2343o
                r4.addPath(r6, r7)
                ey r4 = r0.f2302c
                boolean r4 = r4.mo1695c()
                r6 = 1132396544(0x437f0000, float:255.0)
                if (r4 == 0) goto L_0x0187
                ey r4 = r0.f2302c
                android.graphics.Paint r7 = r5.f2331b
                if (r7 != 0) goto L_0x0149
                android.graphics.Paint r7 = new android.graphics.Paint
                r11 = 1
                r7.<init>(r11)
                r5.f2331b = r7
                android.graphics.Paint r7 = r5.f2331b
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
                r7.setStyle(r11)
            L_0x0149:
                android.graphics.Paint r7 = r5.f2331b
                boolean r11 = r4.mo1692a()
                if (r11 == 0) goto L_0x0166
                android.graphics.Shader r4 = r4.f1594a
                android.graphics.Matrix r11 = r5.f2343o
                r4.setLocalMatrix(r11)
                r7.setShader(r4)
                float r4 = r0.f2305f
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r7.setAlpha(r4)
                goto L_0x0171
            L_0x0166:
                int r4 = r4.f1595b
                float r11 = r0.f2305f
                int r4 = p000.C0565jn.m1745a(r4, r11)
                r7.setColor(r4)
            L_0x0171:
                r7.setColorFilter(r10)
                android.graphics.Path r4 = r5.f2342m
                int r11 = r0.f2304e
                if (r11 != 0) goto L_0x017d
                android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
                goto L_0x017f
            L_0x017d:
                android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
            L_0x017f:
                r4.setFillType(r11)
                android.graphics.Path r4 = r5.f2342m
                r9.drawPath(r4, r7)
            L_0x0187:
                ey r4 = r0.f2300a
                boolean r4 = r4.mo1695c()
                if (r4 == 0) goto L_0x01f5
                ey r4 = r0.f2300a
                android.graphics.Paint r7 = r5.f2330a
                if (r7 != 0) goto L_0x01a4
                android.graphics.Paint r7 = new android.graphics.Paint
                r11 = 1
                r7.<init>(r11)
                r5.f2330a = r7
                android.graphics.Paint r7 = r5.f2330a
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
                r7.setStyle(r11)
            L_0x01a4:
                android.graphics.Paint r7 = r5.f2330a
                android.graphics.Paint$Join r11 = r0.f2310k
                if (r11 == 0) goto L_0x01af
                android.graphics.Paint$Join r11 = r0.f2310k
                r7.setStrokeJoin(r11)
            L_0x01af:
                android.graphics.Paint$Cap r11 = r0.f2309j
                if (r11 == 0) goto L_0x01b8
                android.graphics.Paint$Cap r11 = r0.f2309j
                r7.setStrokeCap(r11)
            L_0x01b8:
                float r11 = r0.f2311l
                r7.setStrokeMiter(r11)
                boolean r11 = r4.mo1692a()
                if (r11 == 0) goto L_0x01d8
                android.graphics.Shader r4 = r4.f1594a
                android.graphics.Matrix r11 = r5.f2343o
                r4.setLocalMatrix(r11)
                r7.setShader(r4)
                float r4 = r0.f2303d
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r7.setAlpha(r4)
                goto L_0x01e3
            L_0x01d8:
                int r4 = r4.f1595b
                float r6 = r0.f2303d
                int r4 = p000.C0565jn.m1745a(r4, r6)
                r7.setColor(r4)
            L_0x01e3:
                r7.setColorFilter(r10)
                float r2 = r2 * r15
                float r0 = r0.f2301b
                float r0 = r0 * r2
                r7.setStrokeWidth(r0)
                android.graphics.Path r0 = r5.f2342m
                r9.drawPath(r0, r7)
                goto L_0x01f5
            L_0x01f3:
                r5 = r17
            L_0x01f5:
                int r12 = r12 + 1
                r7 = r5
                r11 = 0
                goto L_0x001b
            L_0x01fb:
                r5 = r7
                r20.restore()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0565jn.C0571f.m1762a(jn$c, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter):void");
        }

        /* renamed from: a */
        public final void mo2264a(Canvas canvas, int i, int i2) {
            m1762a(this.f2332c, f2329n, canvas, i, i2, null);
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public final int getRootAlpha() {
            return this.f2337h;
        }

        public final void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public final void setRootAlpha(int i) {
            this.f2337h = i;
        }
    }

    /* renamed from: jn$g */
    static class C0572g extends ConstantState {

        /* renamed from: a */
        int f2346a;

        /* renamed from: b */
        C0571f f2347b;

        /* renamed from: c */
        ColorStateList f2348c;

        /* renamed from: d */
        Mode f2349d;

        /* renamed from: e */
        boolean f2350e;

        /* renamed from: f */
        Bitmap f2351f;

        /* renamed from: g */
        ColorStateList f2352g;

        /* renamed from: h */
        Mode f2353h;

        /* renamed from: i */
        int f2354i;

        /* renamed from: j */
        boolean f2355j;

        /* renamed from: k */
        boolean f2356k;

        /* renamed from: l */
        Paint f2357l;

        public C0572g() {
            this.f2348c = null;
            this.f2349d = C0565jn.f2290a;
            this.f2347b = new C0571f();
        }

        public C0572g(C0572g gVar) {
            this.f2348c = null;
            this.f2349d = C0565jn.f2290a;
            if (gVar != null) {
                this.f2346a = gVar.f2346a;
                this.f2347b = new C0571f(gVar.f2347b);
                if (gVar.f2347b.f2331b != null) {
                    this.f2347b.f2331b = new Paint(gVar.f2347b.f2331b);
                }
                if (gVar.f2347b.f2330a != null) {
                    this.f2347b.f2330a = new Paint(gVar.f2347b.f2330a);
                }
                this.f2348c = gVar.f2348c;
                this.f2349d = gVar.f2349d;
                this.f2350e = gVar.f2350e;
            }
        }

        /* renamed from: a */
        public final void mo2269a(int i, int i2) {
            this.f2351f.eraseColor(0);
            this.f2347b.mo2264a(new Canvas(this.f2351f), i, i2);
        }

        /* renamed from: a */
        public final boolean mo2270a() {
            C0571f fVar = this.f2347b;
            if (fVar.f2339j == null) {
                fVar.f2339j = Boolean.valueOf(fVar.f2332c.mo2226b());
            }
            return fVar.f2339j.booleanValue();
        }

        public final int getChangingConfigurations() {
            return this.f2346a;
        }

        public final Drawable newDrawable() {
            return new C0565jn(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0565jn(this);
        }
    }

    /* renamed from: jn$h */
    static class C0573h extends ConstantState {

        /* renamed from: a */
        private final ConstantState f2358a;

        public C0573h(ConstantState constantState) {
            this.f2358a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f2358a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f2358a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C0565jn jnVar = new C0565jn();
            jnVar.f2289c = (VectorDrawable) this.f2358a.newDrawable();
            return jnVar;
        }

        public final Drawable newDrawable(Resources resources) {
            C0565jn jnVar = new C0565jn();
            jnVar.f2289c = (VectorDrawable) this.f2358a.newDrawable(resources);
            return jnVar;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            C0565jn jnVar = new C0565jn();
            jnVar.f2289c = (VectorDrawable) this.f2358a.newDrawable(resources, theme);
            return jnVar;
        }
    }

    C0565jn() {
        this.f2292d = true;
        this.f2297i = new float[9];
        this.f2298j = new Matrix();
        this.f2299k = new Rect();
        this.f2291b = new C0572g();
    }

    C0565jn(C0572g gVar) {
        this.f2292d = true;
        this.f2297i = new float[9];
        this.f2298j = new Matrix();
        this.f2299k = new Rect();
        this.f2291b = gVar;
        this.f2293e = m1746a(gVar.f2348c, gVar.f2349d);
    }

    /* renamed from: a */
    static int m1745a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1746a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    public static C0565jn m1747a(Resources resources, int i, Theme theme) {
        int next;
        if (VERSION.SDK_INT >= 24) {
            C0565jn jnVar = new C0565jn();
            jnVar.f2289c = VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
            jnVar.f2296h = new C0573h(jnVar.f2289c.getConstantState());
            return jnVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m1748a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    /* renamed from: a */
    public static C0565jn m1748a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0565jn jnVar = new C0565jn();
        jnVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return jnVar;
    }

    /* renamed from: b */
    private void m1749b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        int i;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        C0572g gVar = this.f2291b;
        C0571f fVar = gVar.f2347b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f2332c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i2 = 1; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3); i2 = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0568c cVar = (C0568c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0567b bVar = new C0567b();
                    TypedArray a = C0330fd.m1078a(resources2, theme2, attributeSet2, C0553jf.f2262c);
                    bVar.mo2224a(a, xmlPullParser2, theme2);
                    a.recycle();
                    cVar.f2314b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f2340k.put(bVar.getPathName(), bVar);
                    }
                    gVar.f2346a = bVar.f2328o | gVar.f2346a;
                    z = false;
                } else {
                    if ("clip-path".equals(name)) {
                        C0566a aVar = new C0566a();
                        if (C0330fd.m1081a(xmlPullParser2, "pathData")) {
                            TypedArray a2 = C0330fd.m1078a(resources2, theme2, attributeSet2, C0553jf.f2263d);
                            aVar.mo2222a(a2);
                            a2.recycle();
                        }
                        cVar.f2314b.add(aVar);
                        if (aVar.getPathName() != null) {
                            fVar.f2340k.put(aVar.getPathName(), aVar);
                        }
                        i = aVar.f2328o | gVar.f2346a;
                    } else if ("group".equals(name)) {
                        C0568c cVar2 = new C0568c();
                        TypedArray a3 = C0330fd.m1078a(resources2, theme2, attributeSet2, C0553jf.f2261b);
                        cVar2.f2324l = null;
                        cVar2.f2315c = C0330fd.m1075a(a3, xmlPullParser2, "rotation", 5, cVar2.f2315c);
                        cVar2.f2316d = a3.getFloat(1, cVar2.f2316d);
                        cVar2.f2317e = a3.getFloat(2, cVar2.f2317e);
                        cVar2.f2318f = C0330fd.m1075a(a3, xmlPullParser2, "scaleX", 3, cVar2.f2318f);
                        cVar2.f2319g = C0330fd.m1075a(a3, xmlPullParser2, "scaleY", 4, cVar2.f2319g);
                        cVar2.f2320h = C0330fd.m1075a(a3, xmlPullParser2, "translateX", 6, cVar2.f2320h);
                        cVar2.f2321i = C0330fd.m1075a(a3, xmlPullParser2, "translateY", 7, cVar2.f2321i);
                        String string = a3.getString(0);
                        if (string != null) {
                            cVar2.f2325m = string;
                        }
                        cVar2.mo2243a();
                        a3.recycle();
                        cVar.f2314b.add(cVar2);
                        arrayDeque.push(cVar2);
                        if (cVar2.getGroupName() != null) {
                            fVar.f2340k.put(cVar2.getGroupName(), cVar2);
                        }
                        i = cVar2.f2323k | gVar.f2346a;
                    }
                    gVar.f2346a = i;
                }
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public final boolean canApplyTheme() {
        if (this.f2289c != null) {
            C0345fn.m1155c(this.f2289c);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if ((r1 == r6.f2351f.getWidth() && r3 == r6.f2351f.getHeight()) == false) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f2289c
            if (r0 == 0) goto L_0x000a
            android.graphics.drawable.Drawable r0 = r10.f2289c
            r0.draw(r11)
            return
        L_0x000a:
            android.graphics.Rect r0 = r10.f2299k
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f2299k
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0176
            android.graphics.Rect r0 = r10.f2299k
            int r0 = r0.height()
            if (r0 > 0) goto L_0x0020
            return
        L_0x0020:
            android.graphics.ColorFilter r0 = r10.f2294f
            if (r0 != 0) goto L_0x0027
            android.graphics.PorterDuffColorFilter r0 = r10.f2293e
            goto L_0x0029
        L_0x0027:
            android.graphics.ColorFilter r0 = r10.f2294f
        L_0x0029:
            android.graphics.Matrix r1 = r10.f2298j
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f2298j
            float[] r2 = r10.f2297i
            r1.getValues(r2)
            float[] r1 = r10.f2297i
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f2297i
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f2297i
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f2297i
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x0064
            int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0066
        L_0x0064:
            r1 = r8
            r3 = r1
        L_0x0066:
            android.graphics.Rect r4 = r10.f2299k
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f2299k
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x0176
            if (r3 > 0) goto L_0x0087
            return
        L_0x0087:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f2299k
            int r6 = r6.left
            float r6 = (float) r6
            android.graphics.Rect r9 = r10.f2299k
            int r9 = r9.top
            float r9 = (float) r9
            r11.translate(r6, r9)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 17
            if (r6 < r9) goto L_0x00ac
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00ac
            int r6 = p000.C0345fn.m1157e(r10)
            if (r6 != r5) goto L_0x00ac
            r6 = r5
            goto L_0x00ad
        L_0x00ac:
            r6 = r2
        L_0x00ad:
            if (r6 == 0) goto L_0x00be
            android.graphics.Rect r6 = r10.f2299k
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r7)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r8)
        L_0x00be:
            android.graphics.Rect r6 = r10.f2299k
            r6.offsetTo(r2, r2)
            jn$g r6 = r10.f2291b
            android.graphics.Bitmap r7 = r6.f2351f
            if (r7 == 0) goto L_0x00de
            android.graphics.Bitmap r7 = r6.f2351f
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00db
            android.graphics.Bitmap r7 = r6.f2351f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00db
            r7 = r5
            goto L_0x00dc
        L_0x00db:
            r7 = r2
        L_0x00dc:
            if (r7 != 0) goto L_0x00e8
        L_0x00de:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f2351f = r7
            r6.f2356k = r5
        L_0x00e8:
            boolean r6 = r10.f2292d
            if (r6 != 0) goto L_0x00f2
            jn$g r6 = r10.f2291b
            r6.mo2269a(r1, r3)
            goto L_0x0136
        L_0x00f2:
            jn$g r6 = r10.f2291b
            boolean r7 = r6.f2356k
            if (r7 != 0) goto L_0x0116
            android.content.res.ColorStateList r7 = r6.f2352g
            android.content.res.ColorStateList r8 = r6.f2348c
            if (r7 != r8) goto L_0x0116
            android.graphics.PorterDuff$Mode r7 = r6.f2353h
            android.graphics.PorterDuff$Mode r8 = r6.f2349d
            if (r7 != r8) goto L_0x0116
            boolean r7 = r6.f2355j
            boolean r8 = r6.f2350e
            if (r7 != r8) goto L_0x0116
            int r7 = r6.f2354i
            jn$f r6 = r6.f2347b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x0116
            r6 = r5
            goto L_0x0117
        L_0x0116:
            r6 = r2
        L_0x0117:
            if (r6 != 0) goto L_0x0136
            jn$g r6 = r10.f2291b
            r6.mo2269a(r1, r3)
            jn$g r1 = r10.f2291b
            android.content.res.ColorStateList r3 = r1.f2348c
            r1.f2352g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f2349d
            r1.f2353h = r3
            jn$f r3 = r1.f2347b
            int r3 = r3.getRootAlpha()
            r1.f2354i = r3
            boolean r3 = r1.f2350e
            r1.f2355j = r3
            r1.f2356k = r2
        L_0x0136:
            jn$g r1 = r10.f2291b
            android.graphics.Rect r3 = r10.f2299k
            jn$f r6 = r1.f2347b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x0145
            r2 = r5
        L_0x0145:
            r6 = 0
            if (r2 != 0) goto L_0x014c
            if (r0 != 0) goto L_0x014c
            r0 = r6
            goto L_0x016e
        L_0x014c:
            android.graphics.Paint r2 = r1.f2357l
            if (r2 != 0) goto L_0x015c
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f2357l = r2
            android.graphics.Paint r2 = r1.f2357l
            r2.setFilterBitmap(r5)
        L_0x015c:
            android.graphics.Paint r2 = r1.f2357l
            jn$f r5 = r1.f2347b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f2357l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f2357l
        L_0x016e:
            android.graphics.Bitmap r1 = r1.f2351f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0565jn.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        return this.f2289c != null ? C0345fn.m1153b(this.f2289c) : this.f2291b.f2347b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        return this.f2289c != null ? this.f2289c.getChangingConfigurations() : super.getChangingConfigurations() | this.f2291b.getChangingConfigurations();
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final ConstantState getConstantState() {
        if (this.f2289c != null && VERSION.SDK_INT >= 24) {
            return new C0573h(this.f2289c.getConstantState());
        }
        this.f2291b.f2346a = getChangingConfigurations();
        return this.f2291b;
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f2289c != null ? this.f2289c.getIntrinsicHeight() : (int) this.f2291b.f2347b.f2334e;
    }

    public final int getIntrinsicWidth() {
        return this.f2289c != null ? this.f2289c.getIntrinsicWidth() : (int) this.f2291b.f2347b.f2333d;
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        if (this.f2289c != null) {
            return this.f2289c.getOpacity();
        }
        return -3;
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
        if (this.f2289c != null) {
            this.f2289c.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.f2289c != null) {
            C0345fn.m1149a(this.f2289c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0572g gVar = this.f2291b;
        gVar.f2347b = new C0571f();
        TypedArray a = C0330fd.m1078a(resources, theme, attributeSet, C0553jf.f2260a);
        C0572g gVar2 = this.f2291b;
        C0571f fVar = gVar2.f2347b;
        int a2 = C0330fd.m1077a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        if (a2 == 3) {
            mode = Mode.SRC_OVER;
        } else if (a2 == 5) {
            mode = Mode.SRC_IN;
        } else if (a2 != 9) {
            switch (a2) {
                case 14:
                    mode = Mode.MULTIPLY;
                    break;
                case 15:
                    mode = Mode.SCREEN;
                    break;
                case 16:
                    mode = Mode.ADD;
                    break;
            }
        } else {
            mode = Mode.SRC_ATOP;
        }
        gVar2.f2349d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            gVar2.f2348c = colorStateList;
        }
        boolean z = gVar2.f2350e;
        if (C0330fd.m1081a(xmlPullParser, "autoMirrored")) {
            z = a.getBoolean(5, z);
        }
        gVar2.f2350e = z;
        fVar.f2335f = C0330fd.m1075a(a, xmlPullParser, "viewportWidth", 7, fVar.f2335f);
        fVar.f2336g = C0330fd.m1075a(a, xmlPullParser, "viewportHeight", 8, fVar.f2336g);
        if (fVar.f2335f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (fVar.f2336g <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        } else {
            fVar.f2333d = a.getDimension(3, fVar.f2333d);
            fVar.f2334e = a.getDimension(2, fVar.f2334e);
            if (fVar.f2333d <= 0.0f) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a.getPositionDescription());
                sb3.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb3.toString());
            } else if (fVar.f2334e <= 0.0f) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(a.getPositionDescription());
                sb4.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb4.toString());
            } else {
                fVar.setAlpha(C0330fd.m1075a(a, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = a.getString(0);
                if (string != null) {
                    fVar.f2338i = string;
                    fVar.f2340k.put(string, fVar);
                }
                a.recycle();
                gVar.f2346a = getChangingConfigurations();
                gVar.f2356k = true;
                m1749b(resources, xmlPullParser, attributeSet, theme);
                this.f2293e = m1746a(gVar.f2348c, gVar.f2349d);
            }
        }
    }

    public final void invalidateSelf() {
        if (this.f2289c != null) {
            this.f2289c.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        return this.f2289c != null ? C0345fn.m1152a(this.f2289c) : this.f2291b.f2350e;
    }

    public final boolean isStateful() {
        return this.f2289c != null ? this.f2289c.isStateful() : super.isStateful() || (this.f2291b != null && (this.f2291b.mo2270a() || (this.f2291b.f2348c != null && this.f2291b.f2348c.isStateful())));
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.f2289c != null) {
            this.f2289c.mutate();
            return this;
        }
        if (!this.f2295g && super.mutate() == this) {
            this.f2291b = new C0572g(this.f2291b);
            this.f2295g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.f2289c != null) {
            this.f2289c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f2289c != null) {
            return this.f2289c.setState(iArr);
        }
        boolean z = false;
        C0572g gVar = this.f2291b;
        if (!(gVar.f2348c == null || gVar.f2349d == null)) {
            this.f2293e = m1746a(gVar.f2348c, gVar.f2349d);
            invalidateSelf();
            z = true;
        }
        if (gVar.mo2270a()) {
            boolean a = gVar.f2347b.f2332c.mo2225a(iArr);
            gVar.f2356k |= a;
            if (a) {
                invalidateSelf();
                z = true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.f2289c != null) {
            this.f2289c.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f2289c != null) {
            this.f2289c.setAlpha(i);
            return;
        }
        if (this.f2291b.f2347b.getRootAlpha() != i) {
            this.f2291b.f2347b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f2289c != null) {
            C0345fn.m1151a(this.f2289c, z);
        } else {
            this.f2291b.f2350e = z;
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
            return;
        }
        this.f2294f = colorFilter;
        invalidateSelf();
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
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2289c != null) {
            C0345fn.m1147a(this.f2289c, colorStateList);
            return;
        }
        C0572g gVar = this.f2291b;
        if (gVar.f2348c != colorStateList) {
            gVar.f2348c = colorStateList;
            this.f2293e = m1746a(colorStateList, gVar.f2349d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.f2289c != null) {
            C0345fn.m1150a(this.f2289c, mode);
            return;
        }
        C0572g gVar = this.f2291b;
        if (gVar.f2349d != mode) {
            gVar.f2349d = mode;
            this.f2293e = m1746a(gVar.f2348c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.f2289c != null ? this.f2289c.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.f2289c != null) {
            this.f2289c.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
