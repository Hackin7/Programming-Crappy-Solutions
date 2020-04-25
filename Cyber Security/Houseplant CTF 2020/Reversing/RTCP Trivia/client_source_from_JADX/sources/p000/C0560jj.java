package p000;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: jj */
public final class C0560jj {

    /* renamed from: jj$a */
    static class C0561a implements TypeEvaluator<C0334b[]> {

        /* renamed from: a */
        private C0334b[] f2285a;

        C0561a() {
        }

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            C0334b[] bVarArr = (C0334b[]) obj;
            C0334b[] bVarArr2 = (C0334b[]) obj2;
            if (!C0332ff.m1090a(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (this.f2285a == null || !C0332ff.m1090a(this.f2285a, bVarArr)) {
                this.f2285a = C0332ff.m1092a(bVarArr);
            }
            for (int i = 0; i < bVarArr.length; i++) {
                this.f2285a[i].mo1700a(bVarArr[i], bVarArr2[i], f);
            }
            return this.f2285a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m1733a(android.content.Context r10, android.content.res.Resources r11, android.content.res.Resources.Theme r12, int r13) {
        /*
            r0 = 0
            android.content.res.XmlResourceParser r9 = r11.getAnimation(r13)     // Catch:{ XmlPullParserException -> 0x0042, IOException -> 0x0026 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r9)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001e, all -> 0x001b }
            r6 = 0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r9
            android.animation.Animator r10 = m1734a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001e, all -> 0x001b }
            if (r9 == 0) goto L_0x001a
            r9.close()
        L_0x001a:
            return r10
        L_0x001b:
            r10 = move-exception
            r0 = r9
            goto L_0x005e
        L_0x001e:
            r10 = move-exception
            r0 = r9
            goto L_0x0027
        L_0x0021:
            r10 = move-exception
            r0 = r9
            goto L_0x0043
        L_0x0024:
            r10 = move-exception
            goto L_0x005e
        L_0x0026:
            r10 = move-exception
        L_0x0027:
            android.content.res.Resources$NotFoundException r11 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Can't load animation resource ID #0x"
            r12.<init>(r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r13 = java.lang.Integer.toHexString(r13)     // Catch:{ all -> 0x0024 }
            r12.append(r13)     // Catch:{ all -> 0x0024 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0024 }
            r11.<init>(r12)     // Catch:{ all -> 0x0024 }
            r11.initCause(r10)     // Catch:{ all -> 0x0024 }
            throw r11     // Catch:{ all -> 0x0024 }
        L_0x0042:
            r10 = move-exception
        L_0x0043:
            android.content.res.Resources$NotFoundException r11 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Can't load animation resource ID #0x"
            r12.<init>(r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r13 = java.lang.Integer.toHexString(r13)     // Catch:{ all -> 0x0024 }
            r12.append(r13)     // Catch:{ all -> 0x0024 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0024 }
            r11.<init>(r12)     // Catch:{ all -> 0x0024 }
            r11.initCause(r10)     // Catch:{ all -> 0x0024 }
            throw r11     // Catch:{ all -> 0x0024 }
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0.close()
        L_0x0063:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0560jj.m1733a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int):android.animation.Animator");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: type inference failed for: r7v2, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.animation.ValueAnimator] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x000e, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2
      assigns: []
      uses: []
      mth insns count: 115
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m1734a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00df
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00df
            r3 = 2
            if (r1 != r3) goto L_0x00db
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0045
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r18
            r1 = r8
            r2 = r9
            r3 = r22
            r4 = r7
            r5 = r25
            r6 = r10
            m1737a(r0, r1, r2, r3, r4, r5, r6)
            r3 = r18
            r0 = r7
            goto L_0x00b3
        L_0x0045:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005e
            r4 = 0
            r0 = r18
            r1 = r8
            r2 = r9
            r3 = r22
            r5 = r25
            r6 = r10
            android.animation.ValueAnimator r0 = m1737a(r0, r1, r2, r3, r4, r5, r6)
            r3 = r18
            goto L_0x00b3
        L_0x005e:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0092
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = p000.C0553jf.f2267h
            r7 = r22
            android.content.res.TypedArray r6 = p000.C0330fd.m1078a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = p000.C0330fd.m1077a(r6, r10, r0, r14, r14)
            r5 = r15
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r14 = r6
            r6 = r16
            r7 = r25
            m1734a(r0, r1, r2, r3, r4, r5, r6, r7)
            r14.recycle()
            r3 = r18
            r0 = r15
            r14 = 0
            goto L_0x00b3
        L_0x0092:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c3
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m1742a(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b2
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b2:
            r14 = r2
        L_0x00b3:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00be
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00be:
            r13.add(r0)
            goto L_0x000e
        L_0x00c3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00db:
            r3 = r18
            goto L_0x000e
        L_0x00df:
            if (r11 == 0) goto L_0x010b
            if (r13 == 0) goto L_0x010b
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
            r17 = 0
        L_0x00ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0102
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r17 + 1
            r1[r17] = r3
            r17 = r4
            goto L_0x00ef
        L_0x0102:
            if (r24 != 0) goto L_0x0108
            r11.playTogether(r1)
            return r0
        L_0x0108:
            r11.playSequentially(r1)
        L_0x010b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0560jj.m1734a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m1735a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static PropertyValuesHolder m1736a(TypedArray typedArray, int i, int i2, int i3, String str) {
        Object[] objArr;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m1741a(i4)) && (!z2 || !m1741a(i5))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0334b[] b = C0332ff.m1093b(string);
            C0334b[] b2 = C0332ff.m1093b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    C0561a aVar = new C0561a();
                    if (b2 == null) {
                        objArr = new Object[]{b};
                    } else if (!C0332ff.m1090a(b, b2)) {
                        StringBuilder sb = new StringBuilder(" Can't morph from ");
                        sb.append(string);
                        sb.append(" to ");
                        sb.append(string2);
                        throw new InflateException(sb.toString());
                    } else {
                        objArr = new Object[]{b, b2};
                    }
                    return PropertyValuesHolder.ofObject(str, aVar, objArr);
                } else if (b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new C0561a(), new Object[]{b2});
                }
            }
            return propertyValuesHolder;
        }
        TypeEvaluator a = i == 3 ? C0562jk.m1743a() : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
                }
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f)});
            }
        } else if (z) {
            int i6 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m1741a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                int i7 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m1741a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i6, i7});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i6});
            }
        } else if (z2) {
            int i8 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m1741a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i8});
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (!(propertyValuesHolder2 == null || a == null)) {
            propertyValuesHolder2.setEvaluator(a);
        }
        return propertyValuesHolder2;
    }

    /* renamed from: a */
    private static ValueAnimator m1737a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0330fd.m1078a(resources, theme, attributeSet, C0553jf.f2266g);
        TypedArray a2 = C0330fd.m1078a(resources, theme, attributeSet, C0553jf.f2270k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m1738a(valueAnimator, a, a2, f, xmlPullParser);
        int b = C0330fd.m1082b(a, xmlPullParser, "interpolator", 0);
        if (b > 0) {
            valueAnimator.setInterpolator(C0559ji.m1732a(context, b));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m1738a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArray3 = typedArray;
        TypedArray typedArray4 = typedArray2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long a = (long) C0330fd.m1077a(typedArray3, xmlPullParser2, "duration", 1, 300);
        long a2 = (long) C0330fd.m1077a(typedArray3, xmlPullParser2, "startOffset", 2, 0);
        int a3 = C0330fd.m1077a(typedArray3, xmlPullParser2, "valueType", 7, 4);
        if (C0330fd.m1081a(xmlPullParser2, "valueFrom") && C0330fd.m1081a(xmlPullParser2, "valueTo")) {
            if (a3 == 4) {
                TypedValue peekValue = typedArray3.peekValue(5);
                boolean z = peekValue != null;
                int i = z ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray3.peekValue(6);
                boolean z2 = peekValue2 != null;
                a3 = ((!z || !m1741a(i)) && (!z2 || !m1741a(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder a4 = m1736a(typedArray3, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator2.setDuration(a);
        valueAnimator2.setStartDelay(a2);
        valueAnimator2.setRepeatCount(C0330fd.m1077a(typedArray3, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(C0330fd.m1077a(typedArray3, xmlPullParser2, "repeatMode", 4, 1));
        if (typedArray4 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String c = C0330fd.m1083c(typedArray4, xmlPullParser2, "pathData", 1);
            if (c != null) {
                String c2 = C0330fd.m1083c(typedArray4, xmlPullParser2, "propertyXName", 2);
                String c3 = C0330fd.m1083c(typedArray4, xmlPullParser2, "propertyYName", 3);
                if (c2 == null && c3 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(typedArray2.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                m1739a(C0332ff.m1088a(c), objectAnimator, 0.5f * f, c2, c3);
                return;
            }
            objectAnimator.setPropertyName(C0330fd.m1083c(typedArray4, xmlPullParser2, "propertyName", 0));
        }
    }

    /* renamed from: a */
    private static void m1739a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f4 += f3;
            int i3 = i + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i = i3;
            }
            i2++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* renamed from: a */
    private static void m1740a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m1741a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m1742a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r4 = 0
        L_0x0007:
            int r5 = r24.getEventType()
            r6 = 3
            r7 = 0
            if (r5 == r6) goto L_0x01e6
            r8 = 1
            if (r5 == r8) goto L_0x01e6
            r9 = 2
            if (r5 == r9) goto L_0x0019
            r24.next()
            goto L_0x0007
        L_0x0019:
            java.lang.String r5 = r24.getName()
            java.lang.String r10 = "propertyValuesHolder"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x01db
            int[] r5 = p000.C0553jf.f2268i
            r10 = r25
            android.content.res.TypedArray r5 = p000.C0330fd.m1078a(r0, r1, r10, r5)
            java.lang.String r11 = "propertyName"
            java.lang.String r11 = p000.C0330fd.m1083c(r5, r2, r11, r6)
            java.lang.String r12 = "valueType"
            r13 = 4
            int r9 = p000.C0330fd.m1077a(r5, r2, r12, r9, r13)
            r14 = r9
            r12 = 0
        L_0x003c:
            int r15 = r24.next()
            if (r15 == r6) goto L_0x0100
            if (r15 == r8) goto L_0x0100
            java.lang.String r15 = r24.getName()
            java.lang.String r8 = "keyframe"
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x00fa
            if (r14 != r13) goto L_0x0077
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r24)
            int[] r14 = p000.C0553jf.f2269j
            android.content.res.TypedArray r8 = p000.C0330fd.m1078a(r0, r1, r8, r14)
            java.lang.String r14 = "value"
            android.util.TypedValue r14 = p000.C0330fd.m1079a(r8, r2, r14)
            if (r14 == 0) goto L_0x0066
            r15 = 1
            goto L_0x0067
        L_0x0066:
            r15 = r7
        L_0x0067:
            if (r15 == 0) goto L_0x0073
            int r14 = r14.type
            boolean r14 = m1741a(r14)
            if (r14 == 0) goto L_0x0073
            r14 = r6
            goto L_0x0074
        L_0x0073:
            r14 = r7
        L_0x0074:
            r8.recycle()
        L_0x0077:
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r24)
            int[] r15 = p000.C0553jf.f2269j
            android.content.res.TypedArray r8 = p000.C0330fd.m1078a(r0, r1, r8, r15)
            java.lang.String r15 = "fraction"
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = p000.C0330fd.m1075a(r8, r2, r15, r6, r3)
            java.lang.String r15 = "value"
            android.util.TypedValue r15 = p000.C0330fd.m1079a(r8, r2, r15)
            if (r15 == 0) goto L_0x0094
            r18 = 1
            goto L_0x0096
        L_0x0094:
            r18 = r7
        L_0x0096:
            if (r14 != r13) goto L_0x00a6
            if (r18 == 0) goto L_0x00a4
            int r15 = r15.type
            boolean r15 = m1741a(r15)
            if (r15 == 0) goto L_0x00a4
            r15 = r6
            goto L_0x00a7
        L_0x00a4:
            r15 = r7
            goto L_0x00a7
        L_0x00a6:
            r15 = r14
        L_0x00a7:
            if (r18 == 0) goto L_0x00c7
            if (r15 == r6) goto L_0x00bc
            switch(r15) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x00bc;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            r3 = 0
            goto L_0x00d2
        L_0x00b0:
            java.lang.String r15 = "value"
            r13 = 0
            float r13 = p000.C0330fd.m1075a(r8, r2, r15, r7, r13)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r3, r13)
            goto L_0x00d2
        L_0x00bc:
            java.lang.String r13 = "value"
            int r13 = p000.C0330fd.m1077a(r8, r2, r13, r7, r7)
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3, r13)
            goto L_0x00d2
        L_0x00c7:
            if (r15 != 0) goto L_0x00ce
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r3)
            goto L_0x00d2
        L_0x00ce:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r3)
        L_0x00d2:
            java.lang.String r13 = "interpolator"
            r15 = 1
            int r13 = p000.C0330fd.m1082b(r8, r2, r13, r15)
            if (r13 <= 0) goto L_0x00e5
            r15 = r21
            android.view.animation.Interpolator r13 = p000.C0559ji.m1732a(r15, r13)
            r3.setInterpolator(r13)
            goto L_0x00e7
        L_0x00e5:
            r15 = r21
        L_0x00e7:
            r8.recycle()
            if (r3 == 0) goto L_0x00f6
            if (r12 != 0) goto L_0x00f3
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00f3:
            r12.add(r3)
        L_0x00f6:
            r24.next()
            goto L_0x00fc
        L_0x00fa:
            r15 = r21
        L_0x00fc:
            r8 = 1
            r13 = 4
            goto L_0x003c
        L_0x0100:
            r15 = r21
            if (r12 == 0) goto L_0x01c2
            int r3 = r12.size()
            if (r3 <= 0) goto L_0x01c2
            java.lang.Object r8 = r12.get(r7)
            android.animation.Keyframe r8 = (android.animation.Keyframe) r8
            int r13 = r3 + -1
            java.lang.Object r13 = r12.get(r13)
            android.animation.Keyframe r13 = (android.animation.Keyframe) r13
            float r18 = r13.getFraction()
            r6 = 1065353216(0x3f800000, float:1.0)
            int r19 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r19 >= 0) goto L_0x0139
            r17 = 0
            int r18 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            if (r18 >= 0) goto L_0x012c
            r13.setFraction(r6)
            goto L_0x0139
        L_0x012c:
            int r7 = r12.size()
            android.animation.Keyframe r13 = m1735a(r13, r6)
            r12.add(r7, r13)
            int r3 = r3 + 1
        L_0x0139:
            float r7 = r8.getFraction()
            r13 = 0
            int r17 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x0154
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x014a
            r8.setFraction(r13)
            goto L_0x0154
        L_0x014a:
            android.animation.Keyframe r7 = m1735a(r8, r13)
            r8 = 0
            r12.add(r8, r7)
            int r3 = r3 + 1
        L_0x0154:
            android.animation.Keyframe[] r7 = new android.animation.Keyframe[r3]
            r12.toArray(r7)
            r8 = 0
        L_0x015a:
            if (r8 >= r3) goto L_0x01b3
            r12 = r7[r8]
            float r13 = r12.getFraction()
            r6 = 0
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x01aa
            if (r8 != 0) goto L_0x016d
            r12.setFraction(r6)
            goto L_0x01aa
        L_0x016d:
            int r6 = r3 + -1
            if (r8 != r6) goto L_0x0179
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.setFraction(r13)
            r17 = 0
            goto L_0x01ac
        L_0x0179:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = r8 + 1
            r13 = r8
        L_0x017e:
            if (r12 >= r6) goto L_0x0193
            r0 = r7[r12]
            float r0 = r0.getFraction()
            r17 = 0
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0195
            int r0 = r12 + 1
            r13 = r12
            r12 = r0
            r0 = r22
            goto L_0x017e
        L_0x0193:
            r17 = 0
        L_0x0195:
            int r0 = r13 + 1
            r0 = r7[r0]
            float r0 = r0.getFraction()
            int r6 = r8 + -1
            r6 = r7[r6]
            float r6 = r6.getFraction()
            float r0 = r0 - r6
            m1740a(r7, r0, r8, r13)
            goto L_0x01ac
        L_0x01aa:
            r17 = r6
        L_0x01ac:
            int r8 = r8 + 1
            r0 = r22
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x015a
        L_0x01b3:
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofKeyframe(r11, r7)
            r0 = 3
            if (r14 != r0) goto L_0x01c3
            jk r0 = p000.C0562jk.m1743a()
            r3.setEvaluator(r0)
            goto L_0x01c3
        L_0x01c2:
            r3 = 0
        L_0x01c3:
            if (r3 != 0) goto L_0x01cb
            r0 = 1
            r8 = 0
            android.animation.PropertyValuesHolder r3 = m1736a(r5, r9, r8, r0, r11)
        L_0x01cb:
            if (r3 == 0) goto L_0x01d7
            if (r4 != 0) goto L_0x01d4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01d4:
            r4.add(r3)
        L_0x01d7:
            r5.recycle()
            goto L_0x01df
        L_0x01db:
            r15 = r21
            r10 = r25
        L_0x01df:
            r24.next()
            r0 = r22
            goto L_0x0007
        L_0x01e6:
            r8 = r7
            if (r4 == 0) goto L_0x01ff
            int r0 = r4.size()
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r0]
        L_0x01ef:
            if (r8 >= r0) goto L_0x01fc
            java.lang.Object r1 = r4.get(r8)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r3[r8] = r1
            int r8 = r8 + 1
            goto L_0x01ef
        L_0x01fc:
            r16 = r3
            return r16
        L_0x01ff:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0560jj.m1742a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }
}
