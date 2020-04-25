package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: by */
final class C0175by {

    /* renamed from: i */
    private static final RectF f912i = new RectF();

    /* renamed from: j */
    private static ConcurrentHashMap<String, Method> f913j = new ConcurrentHashMap<>();

    /* renamed from: a */
    int f914a = 0;

    /* renamed from: b */
    boolean f915b = false;

    /* renamed from: c */
    float f916c = -1.0f;

    /* renamed from: d */
    float f917d = -1.0f;

    /* renamed from: e */
    float f918e = -1.0f;

    /* renamed from: f */
    int[] f919f = new int[0];

    /* renamed from: g */
    boolean f920g = false;

    /* renamed from: h */
    final Context f921h;

    /* renamed from: k */
    private TextPaint f922k;

    /* renamed from: l */
    private final TextView f923l;

    C0175by(TextView textView) {
        this.f923l = textView;
        this.f921h = this.f923l.getContext();
    }

    /* renamed from: a */
    private static <T> T m538a(Object obj, String str, T t) {
        try {
            return m539a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private static Method m539a(String str) {
        try {
            Method method = (Method) f913j.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f913j.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    static int[] m540a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1102a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 <= 0.0f) {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        } else {
            this.f914a = 1;
            this.f917d = f;
            this.f918e = f2;
            this.f916c = f3;
            this.f920g = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1103a(int i, float f) {
        float applyDimension = TypedValue.applyDimension(i, f, (this.f921h == null ? Resources.getSystem() : this.f921h.getResources()).getDisplayMetrics());
        if (applyDimension != this.f923l.getPaint().getTextSize()) {
            this.f923l.getPaint().setTextSize(applyDimension);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f923l.isInLayout() : false;
            if (this.f923l.getLayout() != null) {
                this.f915b = false;
                try {
                    Method a = m539a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f923l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f923l.requestLayout();
                } else {
                    this.f923l.forceLayout();
                }
                this.f923l.invalidate();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1104a() {
        int length = this.f919f.length;
        this.f920g = length > 0;
        if (this.f920g) {
            this.f914a = 1;
            this.f917d = (float) this.f919f[0];
            this.f918e = (float) this.f919f[length - 1];
            this.f916c = -1.0f;
        }
        return this.f920g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo1105b() {
        if (!mo1108e() || this.f914a != 1) {
            this.f915b = false;
        } else {
            if (!this.f920g || this.f919f.length == 0) {
                float round = (float) Math.round(this.f917d);
                int i = 1;
                while (Math.round(this.f916c + round) <= Math.round(this.f918e)) {
                    i++;
                    round += this.f916c;
                }
                int[] iArr = new int[i];
                float f = this.f917d;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f916c;
                }
                this.f919f = m540a(iArr);
            }
            this.f915b = true;
        }
        return this.f915b;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int] */
    /* JADX WARNING: type inference failed for: r2v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r4v10, types: [int] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r20v0 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: type inference failed for: r20v2 */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r20v5 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v5
      assigns: []
      uses: []
      mth insns count: 232
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f1 A[Catch:{ all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f9 A[Catch:{ all -> 0x0215 }] */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1106c() {
        /*
            r21 = this;
            r1 = r21
            boolean r2 = r21.mo1107d()
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r2 = r1.f915b
            r3 = 1
            if (r2 == 0) goto L_0x021a
            android.widget.TextView r2 = r1.f923l
            int r2 = r2.getMeasuredHeight()
            if (r2 <= 0) goto L_0x0219
            android.widget.TextView r2 = r1.f923l
            int r2 = r2.getMeasuredWidth()
            if (r2 > 0) goto L_0x001f
            return
        L_0x001f:
            android.widget.TextView r2 = r1.f923l
            java.lang.String r4 = "getHorizontallyScrolling"
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r2 = m538a(r2, r4, (T) r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0037
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x004b
        L_0x0037:
            android.widget.TextView r2 = r1.f923l
            int r2 = r2.getMeasuredWidth()
            android.widget.TextView r4 = r1.f923l
            int r4 = r4.getTotalPaddingLeft()
            int r2 = r2 - r4
            android.widget.TextView r4 = r1.f923l
            int r4 = r4.getTotalPaddingRight()
            int r2 = r2 - r4
        L_0x004b:
            android.widget.TextView r4 = r1.f923l
            int r4 = r4.getHeight()
            android.widget.TextView r6 = r1.f923l
            int r6 = r6.getCompoundPaddingBottom()
            int r4 = r4 - r6
            android.widget.TextView r6 = r1.f923l
            int r6 = r6.getCompoundPaddingTop()
            int r4 = r4 - r6
            if (r2 <= 0) goto L_0x0219
            if (r4 > 0) goto L_0x0064
            return
        L_0x0064:
            android.graphics.RectF r6 = f912i
            monitor-enter(r6)
            android.graphics.RectF r7 = f912i     // Catch:{ all -> 0x0215 }
            r7.setEmpty()     // Catch:{ all -> 0x0215 }
            android.graphics.RectF r7 = f912i     // Catch:{ all -> 0x0215 }
            float r2 = (float) r2     // Catch:{ all -> 0x0215 }
            r7.right = r2     // Catch:{ all -> 0x0215 }
            android.graphics.RectF r2 = f912i     // Catch:{ all -> 0x0215 }
            float r4 = (float) r4     // Catch:{ all -> 0x0215 }
            r2.bottom = r4     // Catch:{ all -> 0x0215 }
            android.graphics.RectF r2 = f912i     // Catch:{ all -> 0x0215 }
            int[] r4 = r1.f919f     // Catch:{ all -> 0x0215 }
            int r4 = r4.length     // Catch:{ all -> 0x0215 }
            if (r4 != 0) goto L_0x0085
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0215 }
            java.lang.String r3 = "No available text sizes to choose from."
            r2.<init>(r3)     // Catch:{ all -> 0x0215 }
            throw r2     // Catch:{ all -> 0x0215 }
        L_0x0085:
            int r4 = r4 - r3
            r7 = r4
            r8 = r5
            r4 = r3
        L_0x0089:
            if (r4 > r7) goto L_0x01ff
            int r8 = r4 + r7
            int r8 = r8 / 2
            int[] r9 = r1.f919f     // Catch:{ all -> 0x0215 }
            r9 = r9[r8]     // Catch:{ all -> 0x0215 }
            android.widget.TextView r10 = r1.f923l     // Catch:{ all -> 0x0215 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ all -> 0x0215 }
            android.widget.TextView r11 = r1.f923l     // Catch:{ all -> 0x0215 }
            android.text.method.TransformationMethod r11 = r11.getTransformationMethod()     // Catch:{ all -> 0x0215 }
            if (r11 == 0) goto L_0x00aa
            android.widget.TextView r12 = r1.f923l     // Catch:{ all -> 0x0215 }
            java.lang.CharSequence r11 = r11.getTransformation(r10, r12)     // Catch:{ all -> 0x0215 }
            if (r11 == 0) goto L_0x00aa
            r10 = r11
        L_0x00aa:
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0215 }
            r12 = 16
            r15 = -1
            if (r11 < r12) goto L_0x00b8
            android.widget.TextView r11 = r1.f923l     // Catch:{ all -> 0x0215 }
            int r11 = r11.getMaxLines()     // Catch:{ all -> 0x0215 }
            goto L_0x00b9
        L_0x00b8:
            r11 = r15
        L_0x00b9:
            android.text.TextPaint r13 = r1.f922k     // Catch:{ all -> 0x0215 }
            if (r13 != 0) goto L_0x00c5
            android.text.TextPaint r13 = new android.text.TextPaint     // Catch:{ all -> 0x0215 }
            r13.<init>()     // Catch:{ all -> 0x0215 }
            r1.f922k = r13     // Catch:{ all -> 0x0215 }
            goto L_0x00ca
        L_0x00c5:
            android.text.TextPaint r13 = r1.f922k     // Catch:{ all -> 0x0215 }
            r13.reset()     // Catch:{ all -> 0x0215 }
        L_0x00ca:
            android.text.TextPaint r13 = r1.f922k     // Catch:{ all -> 0x0215 }
            android.widget.TextView r14 = r1.f923l     // Catch:{ all -> 0x0215 }
            android.text.TextPaint r14 = r14.getPaint()     // Catch:{ all -> 0x0215 }
            r13.set(r14)     // Catch:{ all -> 0x0215 }
            android.text.TextPaint r13 = r1.f922k     // Catch:{ all -> 0x0215 }
            float r9 = (float) r9     // Catch:{ all -> 0x0215 }
            r13.setTextSize(r9)     // Catch:{ all -> 0x0215 }
            android.widget.TextView r9 = r1.f923l     // Catch:{ all -> 0x0215 }
            java.lang.String r13 = "getLayoutAlignment"
            android.text.Layout$Alignment r14 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ all -> 0x0215 }
            java.lang.Object r9 = m538a(r9, r13, (T) r14)     // Catch:{ all -> 0x0215 }
            android.text.Layout$Alignment r9 = (android.text.Layout.Alignment) r9     // Catch:{ all -> 0x0215 }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0215 }
            r14 = 23
            if (r13 < r14) goto L_0x0153
            float r12 = r2.right     // Catch:{ all -> 0x0215 }
            int r12 = java.lang.Math.round(r12)     // Catch:{ all -> 0x0215 }
            android.widget.TextView r13 = r1.f923l     // Catch:{ all -> 0x0215 }
            java.lang.String r14 = "getTextDirectionHeuristic"
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR     // Catch:{ all -> 0x0215 }
            java.lang.Object r3 = m538a(r13, r14, (T) r3)     // Catch:{ all -> 0x0215 }
            android.text.TextDirectionHeuristic r3 = (android.text.TextDirectionHeuristic) r3     // Catch:{ all -> 0x0215 }
            int r13 = r10.length()     // Catch:{ all -> 0x0215 }
            android.text.TextPaint r14 = r1.f922k     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout$Builder r12 = android.text.StaticLayout.Builder.obtain(r10, r5, r13, r14, r12)     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout$Builder r9 = r12.setAlignment(r9)     // Catch:{ all -> 0x0215 }
            android.widget.TextView r12 = r1.f923l     // Catch:{ all -> 0x0215 }
            float r12 = r12.getLineSpacingExtra()     // Catch:{ all -> 0x0215 }
            android.widget.TextView r13 = r1.f923l     // Catch:{ all -> 0x0215 }
            float r13 = r13.getLineSpacingMultiplier()     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout$Builder r9 = r9.setLineSpacing(r12, r13)     // Catch:{ all -> 0x0215 }
            android.widget.TextView r12 = r1.f923l     // Catch:{ all -> 0x0215 }
            boolean r12 = r12.getIncludeFontPadding()     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout$Builder r9 = r9.setIncludePad(r12)     // Catch:{ all -> 0x0215 }
            android.widget.TextView r12 = r1.f923l     // Catch:{ all -> 0x0215 }
            int r12 = r12.getBreakStrategy()     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout$Builder r9 = r9.setBreakStrategy(r12)     // Catch:{ all -> 0x0215 }
            android.widget.TextView r12 = r1.f923l     // Catch:{ all -> 0x0215 }
            int r12 = r12.getHyphenationFrequency()     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout$Builder r9 = r9.setHyphenationFrequency(r12)     // Catch:{ all -> 0x0215 }
            if (r11 != r15) goto L_0x0141
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0142
        L_0x0141:
            r12 = r11
        L_0x0142:
            android.text.StaticLayout$Builder r9 = r9.setMaxLines(r12)     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout$Builder r3 = r9.setTextDirection(r3)     // Catch:{ all -> 0x0215 }
            android.text.StaticLayout r3 = r3.build()     // Catch:{ all -> 0x0215 }
            r20 = r4
            r5 = r15
            goto L_0x01c8
        L_0x0153:
            float r3 = r2.right     // Catch:{ all -> 0x0215 }
            int r3 = java.lang.Math.round(r3)     // Catch:{ all -> 0x0215 }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0215 }
            if (r13 < r12) goto L_0x0178
            android.widget.TextView r12 = r1.f923l     // Catch:{ all -> 0x0215 }
            float r12 = r12.getLineSpacingMultiplier()     // Catch:{ all -> 0x0215 }
            android.widget.TextView r13 = r1.f923l     // Catch:{ all -> 0x0215 }
            float r13 = r13.getLineSpacingExtra()     // Catch:{ all -> 0x0215 }
            android.widget.TextView r14 = r1.f923l     // Catch:{ all -> 0x0215 }
            boolean r14 = r14.getIncludeFontPadding()     // Catch:{ all -> 0x0215 }
            r20 = r4
            r17 = r12
            r18 = r13
            r19 = r14
            goto L_0x01ba
        L_0x0178:
            android.widget.TextView r12 = r1.f923l     // Catch:{ all -> 0x0215 }
            java.lang.String r13 = "getLineSpacingMultiplier"
            r14 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch:{ all -> 0x0215 }
            java.lang.Object r12 = m538a(r12, r13, (T) r14)     // Catch:{ all -> 0x0215 }
            java.lang.Float r12 = (java.lang.Float) r12     // Catch:{ all -> 0x0215 }
            float r12 = r12.floatValue()     // Catch:{ all -> 0x0215 }
            android.widget.TextView r13 = r1.f923l     // Catch:{ all -> 0x0215 }
            java.lang.String r14 = "getLineSpacingExtra"
            r15 = 0
            java.lang.Float r15 = java.lang.Float.valueOf(r15)     // Catch:{ all -> 0x0215 }
            java.lang.Object r13 = m538a(r13, r14, (T) r15)     // Catch:{ all -> 0x0215 }
            java.lang.Float r13 = (java.lang.Float) r13     // Catch:{ all -> 0x0215 }
            float r13 = r13.floatValue()     // Catch:{ all -> 0x0215 }
            android.widget.TextView r14 = r1.f923l     // Catch:{ all -> 0x0215 }
            java.lang.String r15 = "getIncludeFontPadding"
            r20 = r4
            r5 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0215 }
            java.lang.Object r4 = m538a(r14, r15, (T) r4)     // Catch:{ all -> 0x0215 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0215 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0215 }
            r19 = r4
            r17 = r12
            r18 = r13
        L_0x01ba:
            android.text.StaticLayout r4 = new android.text.StaticLayout     // Catch:{ all -> 0x0215 }
            android.text.TextPaint r14 = r1.f922k     // Catch:{ all -> 0x0215 }
            r12 = r4
            r13 = r10
            r5 = -1
            r15 = r3
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0215 }
            r3 = r4
        L_0x01c8:
            if (r11 == r5) goto L_0x01e2
            int r4 = r3.getLineCount()     // Catch:{ all -> 0x0215 }
            if (r4 > r11) goto L_0x01e0
            int r4 = r3.getLineCount()     // Catch:{ all -> 0x0215 }
            r5 = 1
            int r4 = r4 - r5
            int r4 = r3.getLineEnd(r4)     // Catch:{ all -> 0x0215 }
            int r5 = r10.length()     // Catch:{ all -> 0x0215 }
            if (r4 == r5) goto L_0x01e2
        L_0x01e0:
            r3 = 0
            goto L_0x01ef
        L_0x01e2:
            int r3 = r3.getHeight()     // Catch:{ all -> 0x0215 }
            float r3 = (float) r3     // Catch:{ all -> 0x0215 }
            float r4 = r2.bottom     // Catch:{ all -> 0x0215 }
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ee
            goto L_0x01e0
        L_0x01ee:
            r3 = 1
        L_0x01ef:
            if (r3 == 0) goto L_0x01f9
            int r4 = r8 + 1
            r8 = r20
        L_0x01f5:
            r3 = 1
            r5 = 0
            goto L_0x0089
        L_0x01f9:
            int r8 = r8 + -1
            r7 = r8
            r4 = r20
            goto L_0x01f5
        L_0x01ff:
            int[] r2 = r1.f919f     // Catch:{ all -> 0x0215 }
            r2 = r2[r8]     // Catch:{ all -> 0x0215 }
            float r2 = (float) r2     // Catch:{ all -> 0x0215 }
            android.widget.TextView r3 = r1.f923l     // Catch:{ all -> 0x0215 }
            float r3 = r3.getTextSize()     // Catch:{ all -> 0x0215 }
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0212
            r3 = 0
            r1.mo1103a(r3, r2)     // Catch:{ all -> 0x0215 }
        L_0x0212:
            monitor-exit(r6)     // Catch:{ all -> 0x0215 }
            r2 = 1
            goto L_0x021b
        L_0x0215:
            r0 = move-exception
            r2 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x0215 }
            throw r2
        L_0x0219:
            return
        L_0x021a:
            r2 = r3
        L_0x021b:
            r1.f915b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0175by.mo1106c():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo1107d() {
        return mo1108e() && this.f914a != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo1108e() {
        return !(this.f923l instanceof C0153bj);
    }
}
