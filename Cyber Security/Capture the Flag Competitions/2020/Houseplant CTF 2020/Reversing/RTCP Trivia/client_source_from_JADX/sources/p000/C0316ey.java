package p000;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: ey */
public final class C0316ey {

    /* renamed from: a */
    public final Shader f1594a;

    /* renamed from: b */
    public int f1595b;

    /* renamed from: c */
    private final ColorStateList f1596c;

    private C0316ey(Shader shader, ColorStateList colorStateList, int i) {
        this.f1594a = shader;
        this.f1596c = colorStateList;
        this.f1595b = i;
    }

    /* renamed from: a */
    static C0316ey m1054a(int i) {
        return new C0316ey(null, null, i);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r17v0, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.graphics.SweepGradient] */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: type inference failed for: r17v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v2, types: [android.graphics.RadialGradient]
      assigns: [android.graphics.RadialGradient, android.graphics.LinearGradient]
      uses: [android.graphics.RadialGradient, android.graphics.Shader, android.graphics.LinearGradient]
      mth insns count: 153
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c A[Catch:{ Exception -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[Catch:{ Exception -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015f A[Catch:{ Exception -> 0x018a }] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0316ey m1055a(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
        /*
            r1 = r28
            r2 = r30
            android.content.res.XmlResourceParser r4 = r28.getXml(r29)     // Catch:{ Exception -> 0x018a }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r4)     // Catch:{ Exception -> 0x018a }
        L_0x000c:
            int r6 = r4.next()     // Catch:{ Exception -> 0x018a }
            r7 = 1
            r8 = 2
            if (r6 == r8) goto L_0x0016
            if (r6 != r7) goto L_0x000c
        L_0x0016:
            if (r6 == r8) goto L_0x0020
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x018a }
            java.lang.String r2 = "No start tag found"
            r1.<init>(r2)     // Catch:{ Exception -> 0x018a }
            throw r1     // Catch:{ Exception -> 0x018a }
        L_0x0020:
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x018a }
            r8 = -1
            int r9 = r6.hashCode()     // Catch:{ Exception -> 0x018a }
            r10 = 89650992(0x557f730, float:1.01546526E-35)
            r11 = 0
            if (r9 == r10) goto L_0x003f
            r7 = 1191572447(0x4705f3df, float:34291.87)
            if (r9 == r7) goto L_0x0035
            goto L_0x0048
        L_0x0035:
            java.lang.String r7 = "selector"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x018a }
            if (r7 == 0) goto L_0x0048
            r7 = r11
            goto L_0x0049
        L_0x003f:
            java.lang.String r9 = "gradient"
            boolean r9 = r6.equals(r9)     // Catch:{ Exception -> 0x018a }
            if (r9 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r7 = r8
        L_0x0049:
            switch(r7) {
                case 0: goto L_0x015f;
                case 1: goto L_0x0050;
                default: goto L_0x004c;
            }     // Catch:{ Exception -> 0x018a }
        L_0x004c:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x018a }
            goto L_0x016e
        L_0x0050:
            java.lang.String r6 = r4.getName()     // Catch:{ Exception -> 0x018a }
            java.lang.String r7 = "gradient"
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x018a }
            if (r7 != 0) goto L_0x007a
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x018a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018a }
            r2.<init>()     // Catch:{ Exception -> 0x018a }
            java.lang.String r4 = r4.getPositionDescription()     // Catch:{ Exception -> 0x018a }
            r2.append(r4)     // Catch:{ Exception -> 0x018a }
            java.lang.String r4 = ": invalid gradient color tag "
            r2.append(r4)     // Catch:{ Exception -> 0x018a }
            r2.append(r6)     // Catch:{ Exception -> 0x018a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x018a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x018a }
            throw r1     // Catch:{ Exception -> 0x018a }
        L_0x007a:
            int[] r6 = p000.C0302ep.C0305c.GradientColor     // Catch:{ Exception -> 0x018a }
            android.content.res.TypedArray r6 = p000.C0330fd.m1078a(r1, r2, r5, r6)     // Catch:{ Exception -> 0x018a }
            java.lang.String r7 = "startX"
            int r8 = p000.C0302ep.C0305c.GradientColor_android_startX     // Catch:{ Exception -> 0x018a }
            r9 = 0
            float r13 = p000.C0330fd.m1075a(r6, r4, r7, r8, r9)     // Catch:{ Exception -> 0x018a }
            java.lang.String r7 = "startY"
            int r8 = p000.C0302ep.C0305c.GradientColor_android_startY     // Catch:{ Exception -> 0x018a }
            float r14 = p000.C0330fd.m1075a(r6, r4, r7, r8, r9)     // Catch:{ Exception -> 0x018a }
            java.lang.String r7 = "endX"
            int r8 = p000.C0302ep.C0305c.GradientColor_android_endX     // Catch:{ Exception -> 0x018a }
            float r15 = p000.C0330fd.m1075a(r6, r4, r7, r8, r9)     // Catch:{ Exception -> 0x018a }
            java.lang.String r7 = "endY"
            int r8 = p000.C0302ep.C0305c.GradientColor_android_endY     // Catch:{ Exception -> 0x018a }
            float r16 = p000.C0330fd.m1075a(r6, r4, r7, r8, r9)     // Catch:{ Exception -> 0x018a }
            java.lang.String r7 = "centerX"
            int r8 = p000.C0302ep.C0305c.GradientColor_android_centerX     // Catch:{ Exception -> 0x018a }
            float r7 = p000.C0330fd.m1075a(r6, r4, r7, r8, r9)     // Catch:{ Exception -> 0x018a }
            java.lang.String r8 = "centerY"
            int r10 = p000.C0302ep.C0305c.GradientColor_android_centerY     // Catch:{ Exception -> 0x018a }
            float r8 = p000.C0330fd.m1075a(r6, r4, r8, r10, r9)     // Catch:{ Exception -> 0x018a }
            java.lang.String r10 = "type"
            int r12 = p000.C0302ep.C0305c.GradientColor_android_type     // Catch:{ Exception -> 0x018a }
            int r10 = p000.C0330fd.m1077a(r6, r4, r10, r12, r11)     // Catch:{ Exception -> 0x018a }
            java.lang.String r12 = "startColor"
            int r3 = p000.C0302ep.C0305c.GradientColor_android_startColor     // Catch:{ Exception -> 0x018a }
            int r3 = p000.C0330fd.m1076a(r6, r4, r12, r3)     // Catch:{ Exception -> 0x018a }
            java.lang.String r12 = "centerColor"
            boolean r12 = p000.C0330fd.m1081a(r4, r12)     // Catch:{ Exception -> 0x018a }
            java.lang.String r9 = "centerColor"
            int r11 = p000.C0302ep.C0305c.GradientColor_android_centerColor     // Catch:{ Exception -> 0x018a }
            int r9 = p000.C0330fd.m1076a(r6, r4, r9, r11)     // Catch:{ Exception -> 0x018a }
            java.lang.String r11 = "endColor"
            r24 = r15
            int r15 = p000.C0302ep.C0305c.GradientColor_android_endColor     // Catch:{ Exception -> 0x018a }
            int r11 = p000.C0330fd.m1076a(r6, r4, r11, r15)     // Catch:{ Exception -> 0x018a }
            java.lang.String r15 = "tileMode"
            r25 = r14
            int r14 = p000.C0302ep.C0305c.GradientColor_android_tileMode     // Catch:{ Exception -> 0x018a }
            r26 = r13
            r13 = 0
            int r14 = p000.C0330fd.m1077a(r6, r4, r15, r14, r13)     // Catch:{ Exception -> 0x018a }
            java.lang.String r13 = "gradientRadius"
            int r15 = p000.C0302ep.C0305c.GradientColor_android_gradientRadius     // Catch:{ Exception -> 0x018a }
            r27 = r14
            r14 = 0
            float r20 = p000.C0330fd.m1075a(r6, r4, r13, r15, r14)     // Catch:{ Exception -> 0x018a }
            r6.recycle()     // Catch:{ Exception -> 0x018a }
            fa$a r1 = p000.C0323fa.m1067a(r1, r4, r5, r2)     // Catch:{ Exception -> 0x018a }
            if (r1 == 0) goto L_0x00fb
            goto L_0x0108
        L_0x00fb:
            if (r12 == 0) goto L_0x0103
            fa$a r1 = new fa$a     // Catch:{ Exception -> 0x018a }
            r1.<init>(r3, r9, r11)     // Catch:{ Exception -> 0x018a }
            goto L_0x0108
        L_0x0103:
            fa$a r1 = new fa$a     // Catch:{ Exception -> 0x018a }
            r1.<init>(r3, r11)     // Catch:{ Exception -> 0x018a }
        L_0x0108:
            switch(r10) {
                case 1: goto L_0x011a;
                case 2: goto L_0x0110;
                default: goto L_0x010b;
            }     // Catch:{ Exception -> 0x018a }
        L_0x010b:
            r4 = r27
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x018a }
            goto L_0x0141
        L_0x0110:
            android.graphics.SweepGradient r2 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x018a }
            int[] r3 = r1.f1607a     // Catch:{ Exception -> 0x018a }
            float[] r1 = r1.f1608b     // Catch:{ Exception -> 0x018a }
            r2.<init>(r7, r8, r3, r1)     // Catch:{ Exception -> 0x018a }
            goto L_0x0157
        L_0x011a:
            r2 = 0
            int r2 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0127
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x018a }
            java.lang.String r2 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r1.<init>(r2)     // Catch:{ Exception -> 0x018a }
            throw r1     // Catch:{ Exception -> 0x018a }
        L_0x0127:
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x018a }
            int[] r3 = r1.f1607a     // Catch:{ Exception -> 0x018a }
            float[] r1 = r1.f1608b     // Catch:{ Exception -> 0x018a }
            r4 = r27
            android.graphics.Shader$TileMode r23 = p000.C0323fa.m1066a(r4)     // Catch:{ Exception -> 0x018a }
            r17 = r2
            r18 = r7
            r19 = r8
            r21 = r3
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x018a }
            goto L_0x0157
        L_0x0141:
            int[] r3 = r1.f1607a     // Catch:{ Exception -> 0x018a }
            float[] r1 = r1.f1608b     // Catch:{ Exception -> 0x018a }
            android.graphics.Shader$TileMode r19 = p000.C0323fa.m1066a(r4)     // Catch:{ Exception -> 0x018a }
            r12 = r2
            r13 = r26
            r14 = r25
            r15 = r24
            r17 = r3
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x018a }
        L_0x0157:
            ey r1 = new ey     // Catch:{ Exception -> 0x018a }
            r3 = 0
            r4 = 0
            r1.<init>(r2, r4, r3)     // Catch:{ Exception -> 0x018a }
            return r1
        L_0x015f:
            android.content.res.ColorStateList r1 = p000.C0315ex.m1052a(r1, r4, r5, r2)     // Catch:{ Exception -> 0x018a }
            ey r2 = new ey     // Catch:{ Exception -> 0x018a }
            int r3 = r1.getDefaultColor()     // Catch:{ Exception -> 0x018a }
            r4 = 0
            r2.<init>(r4, r1, r3)     // Catch:{ Exception -> 0x018a }
            return r2
        L_0x016e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018a }
            r2.<init>()     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = r4.getPositionDescription()     // Catch:{ Exception -> 0x018a }
            r2.append(r3)     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = ": unsupported complex color tag "
            r2.append(r3)     // Catch:{ Exception -> 0x018a }
            r2.append(r6)     // Catch:{ Exception -> 0x018a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x018a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x018a }
            throw r1     // Catch:{ Exception -> 0x018a }
        L_0x018a:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ComplexColorCompat"
            java.lang.String r3 = "Failed to inflate ComplexColor."
            android.util.Log.e(r2, r3, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0316ey.m1055a(android.content.res.Resources, int, android.content.res.Resources$Theme):ey");
    }

    /* renamed from: a */
    public final boolean mo1692a() {
        return this.f1594a != null;
    }

    /* renamed from: a */
    public final boolean mo1693a(int[] iArr) {
        if (mo1694b()) {
            int colorForState = this.f1596c.getColorForState(iArr, this.f1596c.getDefaultColor());
            if (colorForState != this.f1595b) {
                this.f1595b = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo1694b() {
        return this.f1594a == null && this.f1596c != null && this.f1596c.isStateful();
    }

    /* renamed from: c */
    public final boolean mo1695c() {
        return mo1692a() || this.f1595b != 0;
    }
}
