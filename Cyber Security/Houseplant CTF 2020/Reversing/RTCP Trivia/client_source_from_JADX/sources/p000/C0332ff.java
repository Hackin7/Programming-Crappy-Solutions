package p000;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: ff */
public final class C0332ff {

    /* renamed from: ff$a */
    static class C0333a {

        /* renamed from: a */
        int f1615a;

        /* renamed from: b */
        boolean f1616b;

        C0333a() {
        }
    }

    /* renamed from: ff$b */
    public static class C0334b {

        /* renamed from: a */
        public char f1617a;

        /* renamed from: b */
        public float[] f1618b;

        C0334b(char c, float[] fArr) {
            this.f1617a = c;
            this.f1618b = fArr;
        }

        C0334b(C0334b bVar) {
            this.f1617a = bVar.f1617a;
            this.f1618b = C0332ff.m1091a(bVar.f1618b, bVar.f1618b.length);
        }

        /* renamed from: a */
        private static void m1095a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = d11 * sin;
            double d15 = d4 * cos;
            double d16 = (sin2 * d14) + (cos2 * d15);
            double d17 = d9 / ((double) ceil);
            int i = 0;
            double d18 = d6;
            double d19 = d16;
            double d20 = (d12 * sin2) - (d13 * cos2);
            double d21 = d5;
            double d22 = d8;
            while (i < ceil) {
                double d23 = d14;
                double d24 = d22 + d17;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = d17;
                double d26 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d27 = d2 + (d10 * sin * cos3) + (d15 * sin3);
                double d28 = (d12 * sin3) - (d13 * cos3);
                double d29 = (sin3 * d23) + (cos3 * d15);
                double d30 = d24 - d22;
                double d31 = d15;
                double tan = Math.tan(d30 / 2.0d);
                double d32 = d24;
                double sin4 = (Math.sin(d30) * (Math.sqrt(4.0d + ((3.0d * tan) * tan)) - 1.0d)) / 3.0d;
                double d33 = d21 + (d20 * sin4);
                double d34 = d18 + (d19 * sin4);
                int i2 = ceil;
                double d35 = cos;
                double d36 = d26 - (sin4 * d28);
                double d37 = d27 - (sin4 * d29);
                double d38 = sin;
                Path path2 = path;
                path2.rLineTo(0.0f, 0.0f);
                path2.cubicTo((float) d33, (float) d34, (float) d36, (float) d37, (float) d26, (float) d27);
                i++;
                d18 = d27;
                d21 = d26;
                d14 = d23;
                d19 = d29;
                d20 = d28;
                d17 = d25;
                d15 = d31;
                d22 = d32;
                ceil = i2;
                cos = d35;
                sin = d38;
                d10 = d3;
            }
        }

        /* renamed from: a */
        private static void m1096a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            boolean z3 = z2;
            float f10 = f5;
            float f11 = f6;
            while (true) {
                double radians = Math.toRadians((double) f7);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = (double) f8;
                double d4 = radians;
                double d5 = (double) f2;
                double d6 = d3;
                double d7 = (double) f10;
                double d8 = ((d3 * cos) + (d5 * sin)) / d7;
                double d9 = d5;
                double d10 = (double) f11;
                float f12 = f10;
                float f13 = f11;
                double d11 = ((((double) (-f8)) * sin) + (d5 * cos)) / d10;
                double d12 = (double) f4;
                double d13 = ((((double) f9) * cos) + (d12 * sin)) / d7;
                double d14 = ((((double) (-f9)) * sin) + (d12 * cos)) / d10;
                double d15 = d8 - d13;
                double d16 = d11 - d14;
                double d17 = (d8 + d13) / 2.0d;
                double d18 = (d11 + d14) / 2.0d;
                double d19 = sin;
                double d20 = (d15 * d15) + (d16 * d16);
                if (d20 == 0.0d) {
                    Log.w("PathParser", " Points are coincident");
                    return;
                }
                double d21 = cos;
                double d22 = (1.0d / d20) - 0.25d;
                if (d22 < 0.0d) {
                    StringBuilder sb = new StringBuilder("Points are too far apart ");
                    sb.append(d20);
                    Log.w("PathParser", sb.toString());
                    float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                    f10 = f12 * sqrt;
                    f11 = f13 * sqrt;
                    f8 = f;
                    f9 = f3;
                    boolean z4 = z2;
                } else {
                    double sqrt2 = Math.sqrt(d22);
                    double d23 = d15 * sqrt2;
                    double d24 = sqrt2 * d16;
                    boolean z5 = z2;
                    if (z == z5) {
                        d2 = d17 - d24;
                        d = d18 + d23;
                    } else {
                        d2 = d17 + d24;
                        d = d18 - d23;
                    }
                    double atan2 = Math.atan2(d11 - d, d8 - d2);
                    double atan22 = Math.atan2(d14 - d, d13 - d2) - atan2;
                    int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
                    if (z5 != (i >= 0)) {
                        atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                    }
                    double d25 = d2 * d7;
                    double d26 = d * d10;
                    m1095a(path, (d25 * d21) - (d26 * d19), (d25 * d19) + (d26 * d21), d7, d10, d6, d9, d4, atan2, atan22);
                    return;
                }
            }
        }

        /* JADX WARNING: type inference failed for: r25v14 */
        /* JADX WARNING: type inference failed for: r25v16 */
        /* JADX WARNING: type inference failed for: r25v17 */
        /* JADX WARNING: type inference failed for: r25v19 */
        /* JADX WARNING: type inference failed for: r25v20 */
        /* JADX WARNING: type inference failed for: r25v23 */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0377, code lost:
            r25 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
            r28 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x016e, code lost:
            r29 = r8;
            r25 = r9;
            r30 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a3, code lost:
            r5 = r6;
            r4 = r7;
            r29 = r8;
            r25 = r9;
            r30 = r10;
            r6 = r0 + r2;
            r7 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0332, code lost:
            r5 = r0;
            r4 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0375, code lost:
            r5 = r6;
            r4 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0377, code lost:
            r8 = r29 + r21;
            r9 = r25;
            r15 = r28;
            r1 = r30;
            r10 = r1;
            r0 = r31;
            r14 = 0;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r25v20
          assigns: []
          uses: []
          mth insns count: 458
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m1097a(p000.C0332ff.C0334b[] r31, android.graphics.Path r32) {
            /*
                r0 = r31
                r11 = r32
                r12 = 6
                float[] r13 = new float[r12]
                r14 = 0
                r1 = 109(0x6d, float:1.53E-43)
                r15 = r14
            L_0x000b:
                int r2 = r0.length
                if (r15 >= r2) goto L_0x03a3
                r2 = r0[r15]
                char r10 = r2.f1617a
                r2 = r0[r15]
                float[] r9 = r2.f1618b
                r2 = r13[r14]
                r16 = 1
                r3 = r13[r16]
                r17 = 2
                r4 = r13[r17]
                r18 = 3
                r5 = r13[r18]
                r19 = 4
                r6 = r13[r19]
                r20 = 5
                r7 = r13[r20]
                switch(r10) {
                    case 65: goto L_0x0046;
                    case 67: goto L_0x0043;
                    case 72: goto L_0x0040;
                    case 76: goto L_0x002f;
                    case 77: goto L_0x002f;
                    case 81: goto L_0x003d;
                    case 83: goto L_0x003d;
                    case 84: goto L_0x002f;
                    case 86: goto L_0x0040;
                    case 90: goto L_0x0032;
                    case 97: goto L_0x0046;
                    case 99: goto L_0x0043;
                    case 104: goto L_0x0040;
                    case 108: goto L_0x002f;
                    case 109: goto L_0x002f;
                    case 113: goto L_0x003d;
                    case 115: goto L_0x003d;
                    case 116: goto L_0x002f;
                    case 118: goto L_0x0040;
                    case 122: goto L_0x0032;
                    default: goto L_0x002f;
                }
            L_0x002f:
                r21 = r17
                goto L_0x0049
            L_0x0032:
                r32.close()
                r11.moveTo(r6, r7)
                r2 = r6
                r4 = r2
                r3 = r7
                r5 = r3
                goto L_0x002f
            L_0x003d:
                r21 = r19
                goto L_0x0049
            L_0x0040:
                r21 = r16
                goto L_0x0049
            L_0x0043:
                r21 = r12
                goto L_0x0049
            L_0x0046:
                r8 = 7
                r21 = r8
            L_0x0049:
                r22 = r6
                r23 = r7
                r8 = r14
                r7 = r2
                r6 = r3
            L_0x0050:
                int r2 = r9.length
                if (r8 >= r2) goto L_0x0386
                r14 = 81
                r2 = 116(0x74, float:1.63E-43)
                r3 = 113(0x71, float:1.58E-43)
                r26 = 1073741824(0x40000000, float:2.0)
                r12 = 0
                switch(r10) {
                    case 65: goto L_0x0335;
                    case 67: goto L_0x0306;
                    case 72: goto L_0x02f2;
                    case 76: goto L_0x02d9;
                    case 77: goto L_0x02b1;
                    case 81: goto L_0x028a;
                    case 83: goto L_0x0244;
                    case 84: goto L_0x0214;
                    case 86: goto L_0x0200;
                    case 97: goto L_0x01b0;
                    case 99: goto L_0x0176;
                    case 104: goto L_0x015f;
                    case 108: goto L_0x0147;
                    case 109: goto L_0x0121;
                    case 113: goto L_0x00f1;
                    case 115: goto L_0x00ac;
                    case 116: goto L_0x007f;
                    case 118: goto L_0x006b;
                    default: goto L_0x005f;
                }
            L_0x005f:
                r0 = r6
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                r15 = r7
                goto L_0x0377
            L_0x006b:
                int r1 = r8 + 0
                r2 = r9[r1]
                r11.rLineTo(r12, r2)
                r1 = r9[r1]
                float r6 = r6 + r1
                r29 = r8
                r25 = r9
                r30 = r10
            L_0x007b:
                r28 = r15
                goto L_0x0377
            L_0x007f:
                if (r1 == r3) goto L_0x008c
                if (r1 == r2) goto L_0x008c
                if (r1 == r14) goto L_0x008c
                r2 = 84
                if (r1 != r2) goto L_0x008a
                goto L_0x008c
            L_0x008a:
                r1 = r12
                goto L_0x0090
            L_0x008c:
                float r12 = r7 - r4
                float r1 = r6 - r5
            L_0x0090:
                int r2 = r8 + 0
                r3 = r9[r2]
                int r4 = r8 + 1
                r5 = r9[r4]
                r11.rQuadTo(r12, r1, r3, r5)
                float r12 = r12 + r7
                float r1 = r1 + r6
                r2 = r9[r2]
                float r7 = r7 + r2
                r2 = r9[r4]
                float r6 = r6 + r2
                r5 = r1
                r29 = r8
                r25 = r9
                r30 = r10
                r4 = r12
                goto L_0x007b
            L_0x00ac:
                r2 = 99
                if (r1 == r2) goto L_0x00c0
                r2 = 115(0x73, float:1.61E-43)
                if (r1 == r2) goto L_0x00c0
                r2 = 67
                if (r1 == r2) goto L_0x00c0
                r2 = 83
                if (r1 != r2) goto L_0x00bd
                goto L_0x00c0
            L_0x00bd:
                r2 = r12
                r3 = r2
                goto L_0x00c6
            L_0x00c0:
                float r1 = r7 - r4
                float r2 = r6 - r5
                r3 = r2
                r2 = r1
            L_0x00c6:
                int r12 = r8 + 0
                r4 = r9[r12]
                int r14 = r8 + 1
                r5 = r9[r14]
                int r24 = r8 + 2
                r25 = r9[r24]
                int r26 = r8 + 3
                r27 = r9[r26]
                r1 = r11
                r0 = r6
                r6 = r25
                r28 = r15
                r15 = r7
                r7 = r27
                r1.rCubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r9[r12]
                float r7 = r15 + r1
                r1 = r9[r14]
                float r6 = r0 + r1
                r1 = r9[r24]
                float r1 = r1 + r15
                r2 = r9[r26]
                goto L_0x01a3
            L_0x00f1:
                r0 = r6
                r28 = r15
                r15 = r7
                int r1 = r8 + 0
                r2 = r9[r1]
                int r3 = r8 + 1
                r4 = r9[r3]
                int r5 = r8 + 2
                r6 = r9[r5]
                int r7 = r8 + 3
                r12 = r9[r7]
                r11.rQuadTo(r2, r4, r6, r12)
                r1 = r9[r1]
                float r1 = r1 + r15
                r2 = r9[r3]
                float r6 = r0 + r2
                r2 = r9[r5]
                float r2 = r2 + r15
                r3 = r9[r7]
                float r0 = r0 + r3
                r4 = r1
                r7 = r2
                r5 = r6
                r29 = r8
                r25 = r9
                r30 = r10
                r6 = r0
                goto L_0x0377
            L_0x0121:
                r0 = r6
                r28 = r15
                r15 = r7
                int r1 = r8 + 0
                r2 = r9[r1]
                float r7 = r15 + r2
                int r2 = r8 + 1
                r3 = r9[r2]
                float r6 = r0 + r3
                if (r8 <= 0) goto L_0x013b
                r0 = r9[r1]
                r1 = r9[r2]
                r11.rLineTo(r0, r1)
                goto L_0x016e
            L_0x013b:
                r0 = r9[r1]
                r1 = r9[r2]
                r11.rMoveTo(r0, r1)
                r23 = r6
                r22 = r7
                goto L_0x016e
            L_0x0147:
                r0 = r6
                r28 = r15
                r15 = r7
                int r1 = r8 + 0
                r2 = r9[r1]
                int r3 = r8 + 1
                r6 = r9[r3]
                r11.rLineTo(r2, r6)
                r1 = r9[r1]
                float r7 = r15 + r1
                r1 = r9[r3]
                float r6 = r0 + r1
                goto L_0x016e
            L_0x015f:
                r0 = r6
                r28 = r15
                r15 = r7
                int r1 = r8 + 0
                r2 = r9[r1]
                r11.rLineTo(r2, r12)
                r1 = r9[r1]
                float r7 = r15 + r1
            L_0x016e:
                r29 = r8
                r25 = r9
                r30 = r10
                goto L_0x0377
            L_0x0176:
                r0 = r6
                r28 = r15
                r15 = r7
                int r1 = r8 + 0
                r2 = r9[r1]
                int r1 = r8 + 1
                r3 = r9[r1]
                int r12 = r8 + 2
                r4 = r9[r12]
                int r14 = r8 + 3
                r5 = r9[r14]
                int r24 = r8 + 4
                r6 = r9[r24]
                int r25 = r8 + 5
                r7 = r9[r25]
                r1 = r11
                r1.rCubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r9[r12]
                float r7 = r15 + r1
                r1 = r9[r14]
                float r6 = r0 + r1
                r1 = r9[r24]
                float r1 = r1 + r15
                r2 = r9[r25]
            L_0x01a3:
                float r0 = r0 + r2
                r5 = r6
                r4 = r7
                r29 = r8
                r25 = r9
                r30 = r10
                r6 = r0
                r7 = r1
                goto L_0x0377
            L_0x01b0:
                r0 = r6
                r28 = r15
                r15 = r7
                int r14 = r8 + 5
                r1 = r9[r14]
                float r4 = r1 + r15
                int r24 = r8 + 6
                r1 = r9[r24]
                float r5 = r1 + r0
                int r1 = r8 + 0
                r6 = r9[r1]
                int r1 = r8 + 1
                r7 = r9[r1]
                int r1 = r8 + 2
                r25 = r9[r1]
                int r1 = r8 + 3
                r1 = r9[r1]
                int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r1 == 0) goto L_0x01d7
                r26 = r16
                goto L_0x01d9
            L_0x01d7:
                r26 = 0
            L_0x01d9:
                int r1 = r8 + 4
                r1 = r9[r1]
                int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r1 == 0) goto L_0x01e4
                r12 = r16
                goto L_0x01e5
            L_0x01e4:
                r12 = 0
            L_0x01e5:
                r1 = r11
                r2 = r15
                r3 = r0
                r29 = r8
                r8 = r25
                r25 = r9
                r9 = r26
                r30 = r10
                r10 = r12
                m1096a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r1 = r25[r14]
                float r7 = r15 + r1
                r1 = r25[r24]
                float r6 = r0 + r1
                goto L_0x0375
            L_0x0200:
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                r15 = r7
                int r8 = r29 + 0
                r0 = r25[r8]
                r11.lineTo(r15, r0)
                r6 = r25[r8]
                goto L_0x0377
            L_0x0214:
                r0 = r6
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                r15 = r7
                if (r1 == r3) goto L_0x0228
                if (r1 == r2) goto L_0x0228
                if (r1 == r14) goto L_0x0228
                r2 = 84
                if (r1 != r2) goto L_0x0231
            L_0x0228:
                float r7 = r26 * r15
                float r7 = r7 - r4
                float r26 = r26 * r0
                float r6 = r26 - r5
                r0 = r6
                r15 = r7
            L_0x0231:
                int r8 = r29 + 0
                r1 = r25[r8]
                int r2 = r29 + 1
                r3 = r25[r2]
                r11.quadTo(r15, r0, r1, r3)
                r7 = r25[r8]
                r6 = r25[r2]
                r5 = r0
                r4 = r15
                goto L_0x0377
            L_0x0244:
                r0 = r6
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                r2 = 99
                r15 = r7
                if (r1 == r2) goto L_0x0262
                r2 = 115(0x73, float:1.61E-43)
                if (r1 == r2) goto L_0x0262
                r2 = 67
                if (r1 == r2) goto L_0x0262
                r2 = 83
                if (r1 != r2) goto L_0x025f
                goto L_0x0262
            L_0x025f:
                r3 = r0
                r2 = r15
                goto L_0x026c
            L_0x0262:
                float r7 = r26 * r15
                float r7 = r7 - r4
                float r26 = r26 * r0
                float r26 = r26 - r5
                r2 = r7
                r3 = r26
            L_0x026c:
                int r8 = r29 + 0
                r4 = r25[r8]
                int r0 = r29 + 1
                r5 = r25[r0]
                int r9 = r29 + 2
                r6 = r25[r9]
                int r10 = r29 + 3
                r7 = r25[r10]
                r1 = r11
                r1.cubicTo(r2, r3, r4, r5, r6, r7)
                r1 = r25[r8]
                r0 = r25[r0]
                r7 = r25[r9]
                r6 = r25[r10]
                goto L_0x0332
            L_0x028a:
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                int r8 = r29 + 0
                r0 = r25[r8]
                int r1 = r29 + 1
                r2 = r25[r1]
                int r3 = r29 + 2
                r4 = r25[r3]
                int r5 = r29 + 3
                r6 = r25[r5]
                r11.quadTo(r0, r2, r4, r6)
                r0 = r25[r8]
                r1 = r25[r1]
                r7 = r25[r3]
                r6 = r25[r5]
                r4 = r0
                r5 = r1
                goto L_0x0377
            L_0x02b1:
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                int r8 = r29 + 0
                r7 = r25[r8]
                int r0 = r29 + 1
                r6 = r25[r0]
                if (r29 <= 0) goto L_0x02cc
                r1 = r25[r8]
                r0 = r25[r0]
                r11.lineTo(r1, r0)
                goto L_0x0377
            L_0x02cc:
                r1 = r25[r8]
                r0 = r25[r0]
                r11.moveTo(r1, r0)
                r23 = r6
                r22 = r7
                goto L_0x0377
            L_0x02d9:
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                int r8 = r29 + 0
                r0 = r25[r8]
                int r1 = r29 + 1
                r2 = r25[r1]
                r11.lineTo(r0, r2)
                r7 = r25[r8]
                r6 = r25[r1]
                goto L_0x0377
            L_0x02f2:
                r0 = r6
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                int r8 = r29 + 0
                r1 = r25[r8]
                r11.lineTo(r1, r0)
                r7 = r25[r8]
                goto L_0x0377
            L_0x0306:
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                int r8 = r29 + 0
                r2 = r25[r8]
                int r8 = r29 + 1
                r3 = r25[r8]
                int r8 = r29 + 2
                r4 = r25[r8]
                int r0 = r29 + 3
                r5 = r25[r0]
                int r9 = r29 + 4
                r6 = r25[r9]
                int r10 = r29 + 5
                r7 = r25[r10]
                r1 = r11
                r1.cubicTo(r2, r3, r4, r5, r6, r7)
                r7 = r25[r9]
                r6 = r25[r10]
                r1 = r25[r8]
                r0 = r25[r0]
            L_0x0332:
                r5 = r0
                r4 = r1
                goto L_0x0377
            L_0x0335:
                r0 = r6
                r29 = r8
                r25 = r9
                r30 = r10
                r28 = r15
                r15 = r7
                int r14 = r29 + 5
                r4 = r25[r14]
                int r24 = r29 + 6
                r5 = r25[r24]
                int r8 = r29 + 0
                r6 = r25[r8]
                int r8 = r29 + 1
                r7 = r25[r8]
                int r8 = r29 + 2
                r8 = r25[r8]
                int r1 = r29 + 3
                r1 = r25[r1]
                int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r1 == 0) goto L_0x035e
                r9 = r16
                goto L_0x035f
            L_0x035e:
                r9 = 0
            L_0x035f:
                int r1 = r29 + 4
                r1 = r25[r1]
                int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r1 == 0) goto L_0x036a
                r10 = r16
                goto L_0x036b
            L_0x036a:
                r10 = 0
            L_0x036b:
                r1 = r11
                r2 = r15
                r3 = r0
                m1096a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r7 = r25[r14]
                r6 = r25[r24]
            L_0x0375:
                r5 = r6
                r4 = r7
            L_0x0377:
                int r8 = r29 + r21
                r9 = r25
                r15 = r28
                r1 = r30
                r10 = r1
                r0 = r31
                r12 = 6
                r14 = 0
                goto L_0x0050
            L_0x0386:
                r0 = r6
                r1 = r14
                r28 = r15
                r15 = r7
                r13[r1] = r15
                r13[r16] = r0
                r13[r17] = r4
                r13[r18] = r5
                r13[r19] = r22
                r13[r20] = r23
                r0 = r31
                r2 = r0[r28]
                char r2 = r2.f1617a
                int r15 = r28 + 1
                r1 = r2
                r12 = 6
                goto L_0x000b
            L_0x03a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0332ff.C0334b.m1097a(ff$b[], android.graphics.Path):void");
        }

        /* renamed from: a */
        public final void mo1700a(C0334b bVar, C0334b bVar2, float f) {
            for (int i = 0; i < bVar.f1618b.length; i++) {
                this.f1618b[i] = (bVar.f1618b[i] * (1.0f - f)) + (bVar2.f1618b[i] * f);
            }
        }
    }

    /* renamed from: a */
    private static int m1087a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static Path m1088a(String str) {
        Path path = new Path();
        C0334b[] b = m1093b(str);
        if (b == null) {
            return null;
        }
        try {
            C0334b.m1097a(b, path);
            return path;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Error in parsing ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private static void m1089a(ArrayList<C0334b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0334b(c, fArr));
    }

    /* renamed from: a */
    public static boolean m1090a(C0334b[] bVarArr, C0334b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f1617a != bVarArr2[i].f1617a || bVarArr[i].f1618b.length != bVarArr2[i].f1618b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static float[] m1091a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i - 0;
        int min = Math.min(i2, length - 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: a */
    public static C0334b[] m1092a(C0334b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0334b[] bVarArr2 = new C0334b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0334b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* renamed from: b */
    public static C0334b[] m1093b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = m1087a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                m1089a(arrayList, trim.charAt(0), m1094c(trim));
            }
            i2 = a;
            i = a + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m1089a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0334b[]) arrayList.toArray(new C0334b[arrayList.size()]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r2.f1616b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ NumberFormatException -> 0x0080 }, LOOP:1: B:8:0x002d->B:28:0x005c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[Catch:{ NumberFormatException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[Catch:{ NumberFormatException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078 A[Catch:{ NumberFormatException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x005f A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] m1094c(java.lang.String r13) {
        /*
            r0 = 0
            char r1 = r13.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x009a
            char r1 = r13.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L_0x0013
            goto L_0x009a
        L_0x0013:
            int r1 = r13.length()     // Catch:{ NumberFormatException -> 0x0080 }
            float[] r1 = new float[r1]     // Catch:{ NumberFormatException -> 0x0080 }
            ff$a r2 = new ff$a     // Catch:{ NumberFormatException -> 0x0080 }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x0080 }
            int r3 = r13.length()     // Catch:{ NumberFormatException -> 0x0080 }
            r4 = 1
            r6 = r0
            r5 = r4
        L_0x0025:
            if (r5 >= r3) goto L_0x007b
            r2.f1616b = r0     // Catch:{ NumberFormatException -> 0x0080 }
            r8 = r0
            r9 = r8
            r10 = r9
            r7 = r5
        L_0x002d:
            int r11 = r13.length()     // Catch:{ NumberFormatException -> 0x0080 }
            if (r7 >= r11) goto L_0x005f
            char r11 = r13.charAt(r7)     // Catch:{ NumberFormatException -> 0x0080 }
            r12 = 32
            if (r11 == r12) goto L_0x0058
            r12 = 69
            if (r11 == r12) goto L_0x0056
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L_0x0056
            switch(r11) {
                case 44: goto L_0x0058;
                case 45: goto L_0x004f;
                case 46: goto L_0x0047;
                default: goto L_0x0046;
            }     // Catch:{ NumberFormatException -> 0x0080 }
        L_0x0046:
            goto L_0x0054
        L_0x0047:
            if (r9 != 0) goto L_0x004c
            r8 = r0
            r9 = r4
            goto L_0x005a
        L_0x004c:
            r2.f1616b = r4     // Catch:{ NumberFormatException -> 0x0080 }
            goto L_0x0058
        L_0x004f:
            if (r7 == r5) goto L_0x0054
            if (r8 != 0) goto L_0x0054
            goto L_0x004c
        L_0x0054:
            r8 = r0
            goto L_0x005a
        L_0x0056:
            r8 = r4
            goto L_0x005a
        L_0x0058:
            r8 = r0
            r10 = r4
        L_0x005a:
            if (r10 != 0) goto L_0x005f
            int r7 = r7 + 1
            goto L_0x002d
        L_0x005f:
            r2.f1615a = r7     // Catch:{ NumberFormatException -> 0x0080 }
            int r7 = r2.f1615a     // Catch:{ NumberFormatException -> 0x0080 }
            if (r5 >= r7) goto L_0x0072
            int r8 = r6 + 1
            java.lang.String r5 = r13.substring(r5, r7)     // Catch:{ NumberFormatException -> 0x0080 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x0080 }
            r1[r6] = r5     // Catch:{ NumberFormatException -> 0x0080 }
            r6 = r8
        L_0x0072:
            boolean r5 = r2.f1616b     // Catch:{ NumberFormatException -> 0x0080 }
            if (r5 == 0) goto L_0x0078
            r5 = r7
            goto L_0x0025
        L_0x0078:
            int r5 = r7 + 1
            goto L_0x0025
        L_0x007b:
            float[] r0 = m1091a(r1, r6)     // Catch:{ NumberFormatException -> 0x0080 }
            return r0
        L_0x0080:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r13 = "\""
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.<init>(r13, r0)
            throw r1
        L_0x009a:
            float[] r13 = new float[r0]
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0332ff.m1094c(java.lang.String):float[]");
    }
}
