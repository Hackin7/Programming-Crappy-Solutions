package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f568a = new SparseArray<>();

    /* renamed from: b */
    C0281dz f569b = new C0281dz();

    /* renamed from: c */
    public HashMap<String, Integer> f570c = new HashMap<>();

    /* renamed from: d */
    int f571d = -1;

    /* renamed from: e */
    int f572e = -1;

    /* renamed from: f */
    int f573f = 0;

    /* renamed from: g */
    int f574g = 0;

    /* renamed from: h */
    private ArrayList<C0295ek> f575h = new ArrayList<>(4);

    /* renamed from: i */
    private final ArrayList<C0278dy> f576i = new ArrayList<>(100);

    /* renamed from: j */
    private int f577j = 0;

    /* renamed from: k */
    private int f578k = 0;

    /* renamed from: l */
    private int f579l = Integer.MAX_VALUE;

    /* renamed from: m */
    private int f580m = Integer.MAX_VALUE;

    /* renamed from: n */
    private boolean f581n = true;

    /* renamed from: o */
    private int f582o = 3;

    /* renamed from: p */
    private C0296el f583p = null;

    /* renamed from: q */
    private int f584q = -1;

    /* renamed from: r */
    private int f585r = -1;

    /* renamed from: s */
    private int f586s = -1;

    /* renamed from: t */
    private C0264dr f587t;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0088a extends MarginLayoutParams {

        /* renamed from: A */
        public float f588A = 0.5f;

        /* renamed from: B */
        public String f589B = null;

        /* renamed from: C */
        float f590C = 0.0f;

        /* renamed from: D */
        int f591D = 1;

        /* renamed from: E */
        public float f592E = -1.0f;

        /* renamed from: F */
        public float f593F = -1.0f;

        /* renamed from: G */
        public int f594G = 0;

        /* renamed from: H */
        public int f595H = 0;

        /* renamed from: I */
        public int f596I = 0;

        /* renamed from: J */
        public int f597J = 0;

        /* renamed from: K */
        public int f598K = 0;

        /* renamed from: L */
        public int f599L = 0;

        /* renamed from: M */
        public int f600M = 0;

        /* renamed from: N */
        public int f601N = 0;

        /* renamed from: O */
        public float f602O = 1.0f;

        /* renamed from: P */
        public float f603P = 1.0f;

        /* renamed from: Q */
        public int f604Q = -1;

        /* renamed from: R */
        public int f605R = -1;

        /* renamed from: S */
        public int f606S = -1;

        /* renamed from: T */
        public boolean f607T = false;

        /* renamed from: U */
        public boolean f608U = false;

        /* renamed from: V */
        boolean f609V = true;

        /* renamed from: W */
        boolean f610W = true;

        /* renamed from: X */
        boolean f611X = false;

        /* renamed from: Y */
        boolean f612Y = false;

        /* renamed from: Z */
        boolean f613Z = false;

        /* renamed from: a */
        public int f614a = -1;

        /* renamed from: aa */
        public boolean f615aa = false;

        /* renamed from: ab */
        int f616ab = -1;

        /* renamed from: ac */
        int f617ac = -1;

        /* renamed from: ad */
        int f618ad = -1;

        /* renamed from: ae */
        int f619ae = -1;

        /* renamed from: af */
        int f620af = -1;

        /* renamed from: ag */
        int f621ag = -1;

        /* renamed from: ah */
        float f622ah = 0.5f;

        /* renamed from: ai */
        int f623ai;

        /* renamed from: aj */
        int f624aj;

        /* renamed from: ak */
        float f625ak;

        /* renamed from: al */
        public C0278dy f626al = new C0278dy();

        /* renamed from: am */
        public boolean f627am = false;

        /* renamed from: b */
        public int f628b = -1;

        /* renamed from: c */
        public float f629c = -1.0f;

        /* renamed from: d */
        public int f630d = -1;

        /* renamed from: e */
        public int f631e = -1;

        /* renamed from: f */
        public int f632f = -1;

        /* renamed from: g */
        public int f633g = -1;

        /* renamed from: h */
        public int f634h = -1;

        /* renamed from: i */
        public int f635i = -1;

        /* renamed from: j */
        public int f636j = -1;

        /* renamed from: k */
        public int f637k = -1;

        /* renamed from: l */
        public int f638l = -1;

        /* renamed from: m */
        public int f639m = -1;

        /* renamed from: n */
        public int f640n = 0;

        /* renamed from: o */
        public float f641o = 0.0f;

        /* renamed from: p */
        public int f642p = -1;

        /* renamed from: q */
        public int f643q = -1;

        /* renamed from: r */
        public int f644r = -1;

        /* renamed from: s */
        public int f645s = -1;

        /* renamed from: t */
        public int f646t = -1;

        /* renamed from: u */
        public int f647u = -1;

        /* renamed from: v */
        public int f648v = -1;

        /* renamed from: w */
        public int f649w = -1;

        /* renamed from: x */
        public int f650x = -1;

        /* renamed from: y */
        public int f651y = -1;

        /* renamed from: z */
        public float f652z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        static class C0089a {

            /* renamed from: a */
            public static final SparseIntArray f653a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f653a = sparseIntArray;
                sparseIntArray.append(C0002b.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f653a.append(C0002b.ConstraintLayout_Layout_android_orientation, 1);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f653a.append(C0002b.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0088a() {
            super(-2, -2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0217, code lost:
            android.util.Log.e(r4, r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0088a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f614a = r0
                r9.f628b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f629c = r1
                r9.f630d = r0
                r9.f631e = r0
                r9.f632f = r0
                r9.f633g = r0
                r9.f634h = r0
                r9.f635i = r0
                r9.f636j = r0
                r9.f637k = r0
                r9.f638l = r0
                r9.f639m = r0
                r2 = 0
                r9.f640n = r2
                r3 = 0
                r9.f641o = r3
                r9.f642p = r0
                r9.f643q = r0
                r9.f644r = r0
                r9.f645s = r0
                r9.f646t = r0
                r9.f647u = r0
                r9.f648v = r0
                r9.f649w = r0
                r9.f650x = r0
                r9.f651y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.f652z = r4
                r9.f588A = r4
                r5 = 0
                r9.f589B = r5
                r9.f590C = r3
                r5 = 1
                r9.f591D = r5
                r9.f592E = r1
                r9.f593F = r1
                r9.f594G = r2
                r9.f595H = r2
                r9.f596I = r2
                r9.f597J = r2
                r9.f598K = r2
                r9.f599L = r2
                r9.f600M = r2
                r9.f601N = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.f602O = r1
                r9.f603P = r1
                r9.f604Q = r0
                r9.f605R = r0
                r9.f606S = r0
                r9.f607T = r2
                r9.f608U = r2
                r9.f609V = r5
                r9.f610W = r5
                r9.f611X = r2
                r9.f612Y = r2
                r9.f613Z = r2
                r9.f615aa = r2
                r9.f616ab = r0
                r9.f617ac = r0
                r9.f618ad = r0
                r9.f619ae = r0
                r9.f620af = r0
                r9.f621ag = r0
                r9.f622ah = r4
                dy r1 = new dy
                r1.<init>()
                r9.f626al = r1
                r9.f627am = r2
                int[] r1 = p000.C0000a.C0002b.ConstraintLayout_Layout
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = r2
            L_0x009a:
                if (r1 >= r11) goto L_0x03de
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.C0088a.C0089a.f653a
                int r6 = r6.get(r4)
                r7 = -2
                switch(r6) {
                    case 0: goto L_0x03da;
                    case 1: goto L_0x03d2;
                    case 2: goto L_0x03bf;
                    case 3: goto L_0x03b6;
                    case 4: goto L_0x039d;
                    case 5: goto L_0x0394;
                    case 6: goto L_0x038b;
                    case 7: goto L_0x0382;
                    case 8: goto L_0x036f;
                    case 9: goto L_0x035c;
                    case 10: goto L_0x0348;
                    case 11: goto L_0x0334;
                    case 12: goto L_0x0320;
                    case 13: goto L_0x030c;
                    case 14: goto L_0x02f8;
                    case 15: goto L_0x02e4;
                    case 16: goto L_0x02d0;
                    case 17: goto L_0x02bc;
                    case 18: goto L_0x02a8;
                    case 19: goto L_0x0294;
                    case 20: goto L_0x0280;
                    case 21: goto L_0x0276;
                    case 22: goto L_0x026c;
                    case 23: goto L_0x0262;
                    case 24: goto L_0x0258;
                    case 25: goto L_0x024e;
                    case 26: goto L_0x0244;
                    case 27: goto L_0x023a;
                    case 28: goto L_0x0230;
                    case 29: goto L_0x0226;
                    case 30: goto L_0x021c;
                    case 31: goto L_0x0209;
                    case 32: goto L_0x01fa;
                    case 33: goto L_0x01e4;
                    case 34: goto L_0x01ce;
                    case 35: goto L_0x01c0;
                    case 36: goto L_0x01aa;
                    case 37: goto L_0x0194;
                    case 38: goto L_0x0186;
                    default: goto L_0x00aa;
                }
            L_0x00aa:
                switch(r6) {
                    case 44: goto L_0x00e7;
                    case 45: goto L_0x00dd;
                    case 46: goto L_0x00d3;
                    case 47: goto L_0x00cb;
                    case 48: goto L_0x00c3;
                    case 49: goto L_0x00b9;
                    case 50: goto L_0x00af;
                    default: goto L_0x00ad;
                }
            L_0x00ad:
                goto L_0x03da
            L_0x00af:
                int r6 = r9.f605R
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f605R = r4
                goto L_0x03da
            L_0x00b9:
                int r6 = r9.f604Q
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f604Q = r4
                goto L_0x03da
            L_0x00c3:
                int r4 = r10.getInt(r4, r2)
                r9.f595H = r4
                goto L_0x03da
            L_0x00cb:
                int r4 = r10.getInt(r4, r2)
                r9.f594G = r4
                goto L_0x03da
            L_0x00d3:
                float r6 = r9.f593F
                float r4 = r10.getFloat(r4, r6)
                r9.f593F = r4
                goto L_0x03da
            L_0x00dd:
                float r6 = r9.f592E
                float r4 = r10.getFloat(r4, r6)
                r9.f592E = r4
                goto L_0x03da
            L_0x00e7:
                java.lang.String r4 = r10.getString(r4)
                r9.f589B = r4
                r4 = 2143289344(0x7fc00000, float:NaN)
                r9.f590C = r4
                r9.f591D = r0
                java.lang.String r4 = r9.f589B
                if (r4 == 0) goto L_0x03da
                java.lang.String r4 = r9.f589B
                int r4 = r4.length()
                java.lang.String r6 = r9.f589B
                r7 = 44
                int r6 = r6.indexOf(r7)
                if (r6 <= 0) goto L_0x0129
                int r7 = r4 + -1
                if (r6 >= r7) goto L_0x0129
                java.lang.String r7 = r9.f589B
                java.lang.String r7 = r7.substring(r2, r6)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x011c
                r9.f591D = r2
                goto L_0x0126
            L_0x011c:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0126
                r9.f591D = r5
            L_0x0126:
                int r6 = r6 + 1
                goto L_0x012a
            L_0x0129:
                r6 = r2
            L_0x012a:
                java.lang.String r7 = r9.f589B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x0175
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x0175
                java.lang.String r4 = r9.f589B
                java.lang.String r4 = r4.substring(r6, r7)
                java.lang.String r6 = r9.f589B
                int r7 = r7 + 1
                java.lang.String r6 = r6.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03da
                int r7 = r6.length()
                if (r7 <= 0) goto L_0x03da
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03da }
                float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x03da }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03da
                int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03da
                int r7 = r9.f591D     // Catch:{ NumberFormatException -> 0x03da }
                if (r7 != r5) goto L_0x016f
                float r6 = r6 / r4
                float r4 = java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x03da }
            L_0x016b:
                r9.f590C = r4     // Catch:{ NumberFormatException -> 0x03da }
                goto L_0x03da
            L_0x016f:
                float r4 = r4 / r6
                float r4 = java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03da }
                goto L_0x016b
            L_0x0175:
                java.lang.String r4 = r9.f589B
                java.lang.String r4 = r4.substring(r6)
                int r6 = r4.length()
                if (r6 <= 0) goto L_0x03da
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03da }
                goto L_0x016b
            L_0x0186:
                float r6 = r9.f603P
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f603P = r4
                goto L_0x03da
            L_0x0194:
                int r6 = r9.f601N     // Catch:{ Exception -> 0x019e }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x019e }
                r9.f601N = r6     // Catch:{ Exception -> 0x019e }
                goto L_0x03da
            L_0x019e:
                int r6 = r9.f601N
                int r4 = r10.getInt(r4, r6)
                if (r4 != r7) goto L_0x03da
                r9.f601N = r7
                goto L_0x03da
            L_0x01aa:
                int r6 = r9.f599L     // Catch:{ Exception -> 0x01b4 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01b4 }
                r9.f599L = r6     // Catch:{ Exception -> 0x01b4 }
                goto L_0x03da
            L_0x01b4:
                int r6 = r9.f599L
                int r4 = r10.getInt(r4, r6)
                if (r4 != r7) goto L_0x03da
                r9.f599L = r7
                goto L_0x03da
            L_0x01c0:
                float r6 = r9.f602O
                float r4 = r10.getFloat(r4, r6)
                float r4 = java.lang.Math.max(r3, r4)
                r9.f602O = r4
                goto L_0x03da
            L_0x01ce:
                int r6 = r9.f600M     // Catch:{ Exception -> 0x01d8 }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01d8 }
                r9.f600M = r6     // Catch:{ Exception -> 0x01d8 }
                goto L_0x03da
            L_0x01d8:
                int r6 = r9.f600M
                int r4 = r10.getInt(r4, r6)
                if (r4 != r7) goto L_0x03da
                r9.f600M = r7
                goto L_0x03da
            L_0x01e4:
                int r6 = r9.f598K     // Catch:{ Exception -> 0x01ee }
                int r6 = r10.getDimensionPixelSize(r4, r6)     // Catch:{ Exception -> 0x01ee }
                r9.f598K = r6     // Catch:{ Exception -> 0x01ee }
                goto L_0x03da
            L_0x01ee:
                int r6 = r9.f598K
                int r4 = r10.getInt(r4, r6)
                if (r4 != r7) goto L_0x03da
                r9.f598K = r7
                goto L_0x03da
            L_0x01fa:
                int r4 = r10.getInt(r4, r2)
                r9.f597J = r4
                int r4 = r9.f597J
                if (r4 != r5) goto L_0x03da
                java.lang.String r4 = "ConstraintLayout"
                java.lang.String r6 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x0217
            L_0x0209:
                int r4 = r10.getInt(r4, r2)
                r9.f596I = r4
                int r4 = r9.f596I
                if (r4 != r5) goto L_0x03da
                java.lang.String r4 = "ConstraintLayout"
                java.lang.String r6 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x0217:
                android.util.Log.e(r4, r6)
                goto L_0x03da
            L_0x021c:
                float r6 = r9.f588A
                float r4 = r10.getFloat(r4, r6)
                r9.f588A = r4
                goto L_0x03da
            L_0x0226:
                float r6 = r9.f652z
                float r4 = r10.getFloat(r4, r6)
                r9.f652z = r4
                goto L_0x03da
            L_0x0230:
                boolean r6 = r9.f608U
                boolean r4 = r10.getBoolean(r4, r6)
                r9.f608U = r4
                goto L_0x03da
            L_0x023a:
                boolean r6 = r9.f607T
                boolean r4 = r10.getBoolean(r4, r6)
                r9.f607T = r4
                goto L_0x03da
            L_0x0244:
                int r6 = r9.f651y
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f651y = r4
                goto L_0x03da
            L_0x024e:
                int r6 = r9.f650x
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f650x = r4
                goto L_0x03da
            L_0x0258:
                int r6 = r9.f649w
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f649w = r4
                goto L_0x03da
            L_0x0262:
                int r6 = r9.f648v
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f648v = r4
                goto L_0x03da
            L_0x026c:
                int r6 = r9.f647u
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f647u = r4
                goto L_0x03da
            L_0x0276:
                int r6 = r9.f646t
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f646t = r4
                goto L_0x03da
            L_0x0280:
                int r6 = r9.f645s
                int r6 = r10.getResourceId(r4, r6)
                r9.f645s = r6
                int r6 = r9.f645s
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f645s = r4
                goto L_0x03da
            L_0x0294:
                int r6 = r9.f644r
                int r6 = r10.getResourceId(r4, r6)
                r9.f644r = r6
                int r6 = r9.f644r
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f644r = r4
                goto L_0x03da
            L_0x02a8:
                int r6 = r9.f643q
                int r6 = r10.getResourceId(r4, r6)
                r9.f643q = r6
                int r6 = r9.f643q
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f643q = r4
                goto L_0x03da
            L_0x02bc:
                int r6 = r9.f642p
                int r6 = r10.getResourceId(r4, r6)
                r9.f642p = r6
                int r6 = r9.f642p
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f642p = r4
                goto L_0x03da
            L_0x02d0:
                int r6 = r9.f638l
                int r6 = r10.getResourceId(r4, r6)
                r9.f638l = r6
                int r6 = r9.f638l
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f638l = r4
                goto L_0x03da
            L_0x02e4:
                int r6 = r9.f637k
                int r6 = r10.getResourceId(r4, r6)
                r9.f637k = r6
                int r6 = r9.f637k
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f637k = r4
                goto L_0x03da
            L_0x02f8:
                int r6 = r9.f636j
                int r6 = r10.getResourceId(r4, r6)
                r9.f636j = r6
                int r6 = r9.f636j
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f636j = r4
                goto L_0x03da
            L_0x030c:
                int r6 = r9.f635i
                int r6 = r10.getResourceId(r4, r6)
                r9.f635i = r6
                int r6 = r9.f635i
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f635i = r4
                goto L_0x03da
            L_0x0320:
                int r6 = r9.f634h
                int r6 = r10.getResourceId(r4, r6)
                r9.f634h = r6
                int r6 = r9.f634h
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f634h = r4
                goto L_0x03da
            L_0x0334:
                int r6 = r9.f633g
                int r6 = r10.getResourceId(r4, r6)
                r9.f633g = r6
                int r6 = r9.f633g
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f633g = r4
                goto L_0x03da
            L_0x0348:
                int r6 = r9.f632f
                int r6 = r10.getResourceId(r4, r6)
                r9.f632f = r6
                int r6 = r9.f632f
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f632f = r4
                goto L_0x03da
            L_0x035c:
                int r6 = r9.f631e
                int r6 = r10.getResourceId(r4, r6)
                r9.f631e = r6
                int r6 = r9.f631e
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f631e = r4
                goto L_0x03da
            L_0x036f:
                int r6 = r9.f630d
                int r6 = r10.getResourceId(r4, r6)
                r9.f630d = r6
                int r6 = r9.f630d
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f630d = r4
                goto L_0x03da
            L_0x0382:
                float r6 = r9.f629c
                float r4 = r10.getFloat(r4, r6)
                r9.f629c = r4
                goto L_0x03da
            L_0x038b:
                int r6 = r9.f628b
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f628b = r4
                goto L_0x03da
            L_0x0394:
                int r6 = r9.f614a
                int r4 = r10.getDimensionPixelOffset(r4, r6)
                r9.f614a = r4
                goto L_0x03da
            L_0x039d:
                float r6 = r9.f641o
                float r4 = r10.getFloat(r4, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r6
                r9.f641o = r4
                float r4 = r9.f641o
                int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r4 >= 0) goto L_0x03da
                float r4 = r9.f641o
                float r4 = r6 - r4
                float r4 = r4 % r6
                r9.f641o = r4
                goto L_0x03da
            L_0x03b6:
                int r6 = r9.f640n
                int r4 = r10.getDimensionPixelSize(r4, r6)
                r9.f640n = r4
                goto L_0x03da
            L_0x03bf:
                int r6 = r9.f639m
                int r6 = r10.getResourceId(r4, r6)
                r9.f639m = r6
                int r6 = r9.f639m
                if (r6 != r0) goto L_0x03da
                int r4 = r10.getInt(r4, r0)
                r9.f639m = r4
                goto L_0x03da
            L_0x03d2:
                int r6 = r9.f606S
                int r4 = r10.getInt(r4, r6)
                r9.f606S = r4
            L_0x03da:
                int r1 = r1 + 1
                goto L_0x009a
            L_0x03de:
                r10.recycle()
                r9.mo735a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0088a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public C0088a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public final void mo735a() {
            this.f612Y = false;
            this.f609V = true;
            this.f610W = true;
            if (this.width == -2 && this.f607T) {
                this.f609V = false;
                this.f596I = 1;
            }
            if (this.height == -2 && this.f608U) {
                this.f610W = false;
                this.f597J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f609V = false;
                if (this.width == 0 && this.f596I == 1) {
                    this.width = -2;
                    this.f607T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f610W = false;
                if (this.height == 0 && this.f597J == 1) {
                    this.height = -2;
                    this.f608U = true;
                }
            }
            if (this.f629c != -1.0f || this.f614a != -1 || this.f628b != -1) {
                this.f612Y = true;
                this.f609V = true;
                this.f610W = true;
                if (!(this.f626al instanceof C0283ea)) {
                    this.f626al = new C0283ea();
                }
                ((C0283ea) this.f626al).mo1631j(this.f606S);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
            if (r1 > 0) goto L_0x00f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0107, code lost:
            if (r1 > 0) goto L_0x00f8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x011b  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r6) {
            /*
                r5 = this;
                int r0 = r5.leftMargin
                int r1 = r5.rightMargin
                super.resolveLayoutDirection(r6)
                r6 = -1
                r5.f618ad = r6
                r5.f619ae = r6
                r5.f616ab = r6
                r5.f617ac = r6
                r5.f620af = r6
                r5.f621ag = r6
                int r2 = r5.f646t
                r5.f620af = r2
                int r2 = r5.f648v
                r5.f621ag = r2
                float r2 = r5.f652z
                r5.f622ah = r2
                int r2 = r5.f614a
                r5.f623ai = r2
                int r2 = r5.f628b
                r5.f624aj = r2
                float r2 = r5.f629c
                r5.f625ak = r2
                int r2 = r5.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = r4
                goto L_0x0037
            L_0x0036:
                r2 = r3
            L_0x0037:
                if (r2 == 0) goto L_0x00aa
                int r2 = r5.f642p
                if (r2 == r6) goto L_0x0043
                int r2 = r5.f642p
                r5.f618ad = r2
            L_0x0041:
                r3 = r4
                goto L_0x004c
            L_0x0043:
                int r2 = r5.f643q
                if (r2 == r6) goto L_0x004c
                int r2 = r5.f643q
                r5.f619ae = r2
                goto L_0x0041
            L_0x004c:
                int r2 = r5.f644r
                if (r2 == r6) goto L_0x0055
                int r2 = r5.f644r
                r5.f617ac = r2
                r3 = r4
            L_0x0055:
                int r2 = r5.f645s
                if (r2 == r6) goto L_0x005e
                int r2 = r5.f645s
                r5.f616ab = r2
                r3 = r4
            L_0x005e:
                int r2 = r5.f650x
                if (r2 == r6) goto L_0x0066
                int r2 = r5.f650x
                r5.f621ag = r2
            L_0x0066:
                int r2 = r5.f651y
                if (r2 == r6) goto L_0x006e
                int r2 = r5.f651y
                r5.f620af = r2
            L_0x006e:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0078
                float r3 = r5.f652z
                float r3 = r2 - r3
                r5.f622ah = r3
            L_0x0078:
                boolean r3 = r5.f612Y
                if (r3 == 0) goto L_0x00da
                int r3 = r5.f606S
                if (r3 != r4) goto L_0x00da
                float r3 = r5.f629c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x0092
                float r3 = r5.f629c
                float r2 = r2 - r3
                r5.f625ak = r2
                r5.f623ai = r6
                r5.f624aj = r6
                goto L_0x00da
            L_0x0092:
                int r2 = r5.f614a
                if (r2 == r6) goto L_0x009f
                int r2 = r5.f614a
                r5.f624aj = r2
                r5.f623ai = r6
            L_0x009c:
                r5.f625ak = r4
                goto L_0x00da
            L_0x009f:
                int r2 = r5.f628b
                if (r2 == r6) goto L_0x00da
                int r2 = r5.f628b
                r5.f623ai = r2
                r5.f624aj = r6
                goto L_0x009c
            L_0x00aa:
                int r2 = r5.f642p
                if (r2 == r6) goto L_0x00b2
                int r2 = r5.f642p
                r5.f617ac = r2
            L_0x00b2:
                int r2 = r5.f643q
                if (r2 == r6) goto L_0x00ba
                int r2 = r5.f643q
                r5.f616ab = r2
            L_0x00ba:
                int r2 = r5.f644r
                if (r2 == r6) goto L_0x00c2
                int r2 = r5.f644r
                r5.f618ad = r2
            L_0x00c2:
                int r2 = r5.f645s
                if (r2 == r6) goto L_0x00ca
                int r2 = r5.f645s
                r5.f619ae = r2
            L_0x00ca:
                int r2 = r5.f650x
                if (r2 == r6) goto L_0x00d2
                int r2 = r5.f650x
                r5.f620af = r2
            L_0x00d2:
                int r2 = r5.f651y
                if (r2 == r6) goto L_0x00da
                int r2 = r5.f651y
                r5.f621ag = r2
            L_0x00da:
                int r2 = r5.f644r
                if (r2 != r6) goto L_0x012b
                int r2 = r5.f645s
                if (r2 != r6) goto L_0x012b
                int r2 = r5.f643q
                if (r2 != r6) goto L_0x012b
                int r2 = r5.f642p
                if (r2 != r6) goto L_0x012b
                int r2 = r5.f632f
                if (r2 == r6) goto L_0x00fb
                int r2 = r5.f632f
                r5.f618ad = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010a
                if (r1 <= 0) goto L_0x010a
            L_0x00f8:
                r5.rightMargin = r1
                goto L_0x010a
            L_0x00fb:
                int r2 = r5.f633g
                if (r2 == r6) goto L_0x010a
                int r2 = r5.f633g
                r5.f619ae = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010a
                if (r1 <= 0) goto L_0x010a
                goto L_0x00f8
            L_0x010a:
                int r1 = r5.f630d
                if (r1 == r6) goto L_0x011b
                int r6 = r5.f630d
                r5.f616ab = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012b
                if (r0 <= 0) goto L_0x012b
                r5.leftMargin = r0
                return
            L_0x011b:
                int r1 = r5.f631e
                if (r1 == r6) goto L_0x012b
                int r6 = r5.f631e
                r5.f617ac = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012b
                if (r0 <= 0) goto L_0x012b
                r5.leftMargin = r0
            L_0x012b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0088a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m280a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m280a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m280a(attributeSet);
    }

    /* renamed from: a */
    public static C0088a m278a() {
        return new C0088a();
    }

    /* renamed from: a */
    private final C0278dy m279a(int i) {
        if (i == 0) {
            return this.f569b;
        }
        View view = (View) this.f568a.get(i);
        if (view == this) {
            return this.f569b;
        }
        if (view == null) {
            return null;
        }
        return ((C0088a) view.getLayoutParams()).f626al;
    }

    /* renamed from: a */
    private void m280a(AttributeSet attributeSet) {
        this.f569b.f1377X = this;
        this.f568a.put(getId(), this);
        this.f583p = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0002b.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0002b.ConstraintLayout_Layout_android_minWidth) {
                    this.f577j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f577j);
                } else if (index == C0002b.ConstraintLayout_Layout_android_minHeight) {
                    this.f578k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f578k);
                } else if (index == C0002b.ConstraintLayout_Layout_android_maxWidth) {
                    this.f579l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f579l);
                } else if (index == C0002b.ConstraintLayout_Layout_android_maxHeight) {
                    this.f580m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f580m);
                } else if (index == C0002b.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f582o = obtainStyledAttributes.getInt(index, this.f582o);
                } else if (index == C0002b.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f583p = new C0296el();
                        C0296el elVar = this.f583p;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    C0297a aVar = new C0297a(0);
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, C0002b.ConstraintSet);
                                    C0296el.m1031a(aVar, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        aVar.f1524a = true;
                                    }
                                    elVar.f1497a.put(Integer.valueOf(aVar.f1547d), aVar);
                                }
                            }
                        } catch (XmlPullParserException e) {
                            e.printStackTrace();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (NotFoundException unused) {
                        this.f583p = null;
                    }
                    this.f584q = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f569b.f1437at = this.f582o;
    }

    /* renamed from: a */
    private void m281a(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f570c == null) {
                this.f570c = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f570c.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: b */
    private void m282b() {
        this.f569b.mo1596A();
        if (this.f587t != null) {
            this.f587t.f1259c++;
        }
    }

    /* renamed from: a */
    public final C0278dy mo709a(View view) {
        if (view == this) {
            return this.f569b;
        }
        if (view == null) {
            return null;
        }
        return ((C0088a) view.getLayoutParams()).f626al;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0088a;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) i3;
                            float f3 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f4 = f2;
                            float f5 = f2;
                            float f6 = f3;
                            float f7 = f;
                            Paint paint2 = paint;
                            canvas2.drawLine(f, f4, f6, f5, paint);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f3;
                            float f10 = f8;
                            canvas2.drawLine(f9, f5, f6, f10, paint);
                            float f11 = f8;
                            float f12 = f7;
                            canvas2.drawLine(f9, f11, f12, f10, paint);
                            float f13 = f7;
                            canvas2.drawLine(f13, f11, f12, f5, paint);
                            paint.setColor(-16711936);
                            float f14 = f3;
                            Paint paint3 = paint;
                            canvas2.drawLine(f13, f5, f14, f8, paint);
                            canvas2.drawLine(f13, f8, f14, f5, paint);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0088a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0088a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0088a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f580m;
    }

    public int getMaxWidth() {
        return this.f579l;
    }

    public int getMinHeight() {
        return this.f578k;
    }

    public int getMinWidth() {
        return this.f577j;
    }

    public int getOptimizationLevel() {
        return this.f569b.f1437at;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0088a aVar = (C0088a) childAt.getLayoutParams();
            C0278dy dyVar = aVar.f626al;
            if ((childAt.getVisibility() != 8 || aVar.f612Y || aVar.f613Z || isInEditMode) && !aVar.f615aa) {
                int n = dyVar.mo1582n();
                int o = dyVar.mo1583o();
                int l = dyVar.mo1580l() + n;
                int m = dyVar.mo1581m() + o;
                childAt.layout(n, o, l, m);
                if (childAt instanceof C0301eo) {
                    View content = ((C0301eo) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(n, o, l, m);
                    }
                }
            }
        }
        int size = this.f575h.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f575h.get(i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x08c6, code lost:
        if (r7.f596I != 1) goto L_0x08ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x07d6  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x07f9  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0806  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0808  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x082a  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x083c  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0846  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0851  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x08e2  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x092e  */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x093d  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0944  */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0946  */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x094b  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x094d  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0959  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0968  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x096c  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0972  */
    /* JADX WARNING: Removed duplicated region for block: B:676:0x0863 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:681:0x0981 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r60, int r61) {
        /*
            r59 = this;
            r0 = r59
            r1 = r60
            r2 = r61
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r60)
            int r4 = android.view.View.MeasureSpec.getSize(r60)
            int r5 = android.view.View.MeasureSpec.getMode(r61)
            int r6 = android.view.View.MeasureSpec.getSize(r61)
            r0.f573f = r3
            r0.f574g = r5
            r0.f571d = r4
            r0.f572e = r6
            int r3 = r59.getPaddingLeft()
            int r4 = r59.getPaddingTop()
            dz r5 = r0.f569b
            r5.mo1560b(r3)
            dz r5 = r0.f569b
            r5.mo1563c(r4)
            dz r5 = r0.f569b
            int r6 = r0.f579l
            int[] r5 = r5.f1414t
            r7 = 0
            r5[r7] = r6
            dz r5 = r0.f569b
            int r6 = r0.f580m
            int[] r5 = r5.f1414t
            r8 = 1
            r5[r8] = r6
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x0058
            dz r5 = r0.f569b
            int r9 = r59.getLayoutDirection()
            if (r9 != r8) goto L_0x0055
            r9 = r8
            goto L_0x0056
        L_0x0055:
            r9 = r7
        L_0x0056:
            r5.f1428a = r9
        L_0x0058:
            int r5 = android.view.View.MeasureSpec.getMode(r60)
            int r9 = android.view.View.MeasureSpec.getSize(r60)
            int r10 = android.view.View.MeasureSpec.getMode(r61)
            int r11 = android.view.View.MeasureSpec.getSize(r61)
            int r12 = r59.getPaddingTop()
            int r13 = r59.getPaddingBottom()
            int r12 = r12 + r13
            int r13 = r59.getPaddingLeft()
            int r14 = r59.getPaddingRight()
            int r13 = r13 + r14
            int r14 = p000.C0278dy.C0280a.f1423a
            int r15 = p000.C0278dy.C0280a.f1423a
            r59.getLayoutParams()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r6) goto L_0x0098
            if (r5 == 0) goto L_0x0095
            if (r5 == r8) goto L_0x008d
        L_0x008b:
            r5 = r7
            goto L_0x009b
        L_0x008d:
            int r5 = r0.f579l
            int r5 = java.lang.Math.min(r5, r9)
            int r5 = r5 - r13
            goto L_0x009b
        L_0x0095:
            int r14 = p000.C0278dy.C0280a.f1424b
            goto L_0x008b
        L_0x0098:
            int r14 = p000.C0278dy.C0280a.f1424b
            r5 = r9
        L_0x009b:
            if (r10 == r6) goto L_0x00af
            if (r10 == 0) goto L_0x00ac
            if (r10 == r8) goto L_0x00a3
        L_0x00a1:
            r11 = r7
            goto L_0x00b1
        L_0x00a3:
            int r6 = r0.f580m
            int r6 = java.lang.Math.min(r6, r11)
            int r6 = r6 - r12
            r11 = r6
            goto L_0x00b1
        L_0x00ac:
            int r15 = p000.C0278dy.C0280a.f1424b
            goto L_0x00a1
        L_0x00af:
            int r15 = p000.C0278dy.C0280a.f1424b
        L_0x00b1:
            dz r6 = r0.f569b
            r6.mo1571f(r7)
            dz r6 = r0.f569b
            r6.mo1573g(r7)
            dz r6 = r0.f569b
            r6.mo1575h(r14)
            dz r6 = r0.f569b
            r6.mo1565d(r5)
            dz r5 = r0.f569b
            r5.mo1577i(r15)
            dz r5 = r0.f569b
            r5.mo1568e(r11)
            dz r5 = r0.f569b
            int r6 = r0.f577j
            int r9 = r59.getPaddingLeft()
            int r6 = r6 - r9
            int r9 = r59.getPaddingRight()
            int r6 = r6 - r9
            r5.mo1571f(r6)
            dz r5 = r0.f569b
            int r6 = r0.f578k
            int r9 = r59.getPaddingTop()
            int r6 = r6 - r9
            int r9 = r59.getPaddingBottom()
            int r6 = r6 - r9
            r5.mo1573g(r6)
            dz r5 = r0.f569b
            int r5 = r5.mo1580l()
            dz r6 = r0.f569b
            int r6 = r6.mo1581m()
            boolean r9 = r0.f581n
            r11 = 8
            r12 = -1
            if (r9 == 0) goto L_0x05a0
            r0.f581n = r7
            int r9 = r59.getChildCount()
            r13 = r7
        L_0x010b:
            if (r13 >= r9) goto L_0x011c
            android.view.View r14 = r0.getChildAt(r13)
            boolean r14 = r14.isLayoutRequested()
            if (r14 == 0) goto L_0x0119
            r9 = 1
            goto L_0x011d
        L_0x0119:
            int r13 = r13 + 1
            goto L_0x010b
        L_0x011c:
            r9 = r7
        L_0x011d:
            if (r9 == 0) goto L_0x05a0
            java.util.ArrayList<dy> r9 = r0.f576i
            r9.clear()
            boolean r9 = r59.isInEditMode()
            int r13 = r59.getChildCount()
            if (r9 == 0) goto L_0x0169
            r14 = r7
        L_0x012f:
            if (r14 >= r13) goto L_0x0169
            android.view.View r15 = r0.getChildAt(r14)
            android.content.res.Resources r8 = r59.getResources()     // Catch:{ NotFoundException -> 0x0164 }
            int r10 = r15.getId()     // Catch:{ NotFoundException -> 0x0164 }
            java.lang.String r8 = r8.getResourceName(r10)     // Catch:{ NotFoundException -> 0x0164 }
            int r10 = r15.getId()     // Catch:{ NotFoundException -> 0x0164 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NotFoundException -> 0x0164 }
            r0.m281a(r8, r10)     // Catch:{ NotFoundException -> 0x0164 }
            r10 = 47
            int r10 = r8.indexOf(r10)     // Catch:{ NotFoundException -> 0x0164 }
            if (r10 == r12) goto L_0x015a
            int r10 = r10 + 1
            java.lang.String r8 = r8.substring(r10)     // Catch:{ NotFoundException -> 0x0164 }
        L_0x015a:
            int r10 = r15.getId()     // Catch:{ NotFoundException -> 0x0164 }
            dy r10 = r0.m279a(r10)     // Catch:{ NotFoundException -> 0x0164 }
            r10.f1379Z = r8     // Catch:{ NotFoundException -> 0x0164 }
        L_0x0164:
            int r14 = r14 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x012f
        L_0x0169:
            r8 = r7
        L_0x016a:
            if (r8 >= r13) goto L_0x017c
            android.view.View r10 = r0.getChildAt(r8)
            dy r10 = r0.mo709a(r10)
            if (r10 == 0) goto L_0x0179
            r10.mo1570f()
        L_0x0179:
            int r8 = r8 + 1
            goto L_0x016a
        L_0x017c:
            int r8 = r0.f584q
            if (r8 == r12) goto L_0x019e
            r8 = r7
        L_0x0181:
            if (r8 >= r13) goto L_0x019e
            android.view.View r10 = r0.getChildAt(r8)
            int r14 = r10.getId()
            int r15 = r0.f584q
            if (r14 != r15) goto L_0x019b
            boolean r14 = r10 instanceof p000.C0298em
            if (r14 == 0) goto L_0x019b
            em r10 = (p000.C0298em) r10
            el r10 = r10.getConstraintSet()
            r0.f583p = r10
        L_0x019b:
            int r8 = r8 + 1
            goto L_0x0181
        L_0x019e:
            el r8 = r0.f583p
            if (r8 == 0) goto L_0x01a7
            el r8 = r0.f583p
            r8.mo1666a(r0)
        L_0x01a7:
            dz r8 = r0.f569b
            r8.mo1653E()
            java.util.ArrayList<ek> r8 = r0.f575h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x01c5
            r10 = r7
        L_0x01b5:
            if (r10 >= r8) goto L_0x01c5
            java.util.ArrayList<ek> r14 = r0.f575h
            java.lang.Object r14 = r14.get(r10)
            ek r14 = (p000.C0295ek) r14
            r14.mo1660a(r0)
            int r10 = r10 + 1
            goto L_0x01b5
        L_0x01c5:
            r8 = r7
        L_0x01c6:
            if (r8 >= r13) goto L_0x0203
            android.view.View r10 = r0.getChildAt(r8)
            boolean r14 = r10 instanceof p000.C0301eo
            if (r14 == 0) goto L_0x0200
            eo r10 = (p000.C0301eo) r10
            int r14 = r10.f1584a
            if (r14 != r12) goto L_0x01e1
            boolean r14 = r10.isInEditMode()
            if (r14 != 0) goto L_0x01e1
            int r14 = r10.f1586c
            r10.setVisibility(r14)
        L_0x01e1:
            int r14 = r10.f1584a
            android.view.View r14 = r0.findViewById(r14)
            r10.f1585b = r14
            android.view.View r14 = r10.f1585b
            if (r14 == 0) goto L_0x0200
            android.view.View r14 = r10.f1585b
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r14 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r14
            r15 = 1
            r14.f615aa = r15
            android.view.View r14 = r10.f1585b
            r14.setVisibility(r7)
            r10.setVisibility(r7)
        L_0x0200:
            int r8 = r8 + 1
            goto L_0x01c6
        L_0x0203:
            r8 = r7
        L_0x0204:
            if (r8 >= r13) goto L_0x05a0
            android.view.View r10 = r0.getChildAt(r8)
            dy r14 = r0.mo709a(r10)
            if (r14 == 0) goto L_0x058c
            android.view.ViewGroup$LayoutParams r15 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r15 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r15
            r15.mo735a()
            boolean r12 = r15.f627am
            if (r12 == 0) goto L_0x0220
            r15.f627am = r7
            goto L_0x024f
        L_0x0220:
            if (r9 == 0) goto L_0x024f
            android.content.res.Resources r12 = r59.getResources()     // Catch:{ NotFoundException -> 0x024f }
            int r7 = r10.getId()     // Catch:{ NotFoundException -> 0x024f }
            java.lang.String r7 = r12.getResourceName(r7)     // Catch:{ NotFoundException -> 0x024f }
            int r12 = r10.getId()     // Catch:{ NotFoundException -> 0x024f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NotFoundException -> 0x024f }
            r0.m281a(r7, r12)     // Catch:{ NotFoundException -> 0x024f }
            java.lang.String r12 = "id/"
            int r12 = r7.indexOf(r12)     // Catch:{ NotFoundException -> 0x024f }
            int r12 = r12 + 3
            java.lang.String r7 = r7.substring(r12)     // Catch:{ NotFoundException -> 0x024f }
            int r12 = r10.getId()     // Catch:{ NotFoundException -> 0x024f }
            dy r12 = r0.m279a(r12)     // Catch:{ NotFoundException -> 0x024f }
            r12.f1379Z = r7     // Catch:{ NotFoundException -> 0x024f }
        L_0x024f:
            int r7 = r10.getVisibility()
            r14.f1378Y = r7
            boolean r7 = r15.f615aa
            if (r7 == 0) goto L_0x025b
            r14.f1378Y = r11
        L_0x025b:
            r14.f1377X = r10
            dz r7 = r0.f569b
            r7.mo1654a(r14)
            boolean r7 = r15.f610W
            if (r7 == 0) goto L_0x026a
            boolean r7 = r15.f609V
            if (r7 != 0) goto L_0x026f
        L_0x026a:
            java.util.ArrayList<dy> r7 = r0.f576i
            r7.add(r14)
        L_0x026f:
            boolean r7 = r15.f612Y
            if (r7 == 0) goto L_0x02a6
            ea r14 = (p000.C0283ea) r14
            int r7 = r15.f623ai
            int r10 = r15.f624aj
            float r12 = r15.f625ak
            int r11 = android.os.Build.VERSION.SDK_INT
            r25 = r7
            r7 = 17
            if (r11 >= r7) goto L_0x028a
            int r7 = r15.f614a
            int r10 = r15.f628b
            float r12 = r15.f629c
            goto L_0x028c
        L_0x028a:
            r7 = r25
        L_0x028c:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0297
            r14.mo1630a(r12)
            goto L_0x058c
        L_0x0297:
            r11 = -1
            if (r7 == r11) goto L_0x029f
            r14.mo1632k(r7)
            goto L_0x058c
        L_0x029f:
            if (r10 == r11) goto L_0x058c
            r14.mo1633l(r10)
            goto L_0x058c
        L_0x02a6:
            r11 = -1
            int r7 = r15.f630d
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f631e
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f632f
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f633g
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f643q
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f642p
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f644r
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f645s
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f634h
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f635i
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f636j
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f637k
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f638l
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f604Q
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f605R
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.f639m
            if (r7 != r11) goto L_0x02ef
            int r7 = r15.width
            if (r7 == r11) goto L_0x02ef
            int r7 = r15.height
            if (r7 != r11) goto L_0x058c
        L_0x02ef:
            int r7 = r15.f616ab
            int r10 = r15.f617ac
            int r11 = r15.f618ad
            int r12 = r15.f619ae
            r26 = r7
            int r7 = r15.f620af
            r27 = r7
            int r7 = r15.f621ag
            r28 = r7
            float r7 = r15.f622ah
            r29 = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r30 = r10
            r10 = 17
            if (r7 >= r10) goto L_0x0368
            int r7 = r15.f630d
            int r11 = r15.f631e
            int r12 = r15.f632f
            int r10 = r15.f633g
            r31 = r13
            int r13 = r15.f646t
            r32 = r13
            int r13 = r15.f648v
            r33 = r13
            float r13 = r15.f652z
            r34 = r13
            r13 = -1
            if (r7 != r13) goto L_0x0339
            if (r11 != r13) goto L_0x0339
            r35 = r7
            int r7 = r15.f643q
            if (r7 == r13) goto L_0x0331
            int r7 = r15.f643q
            goto L_0x033d
        L_0x0331:
            int r7 = r15.f642p
            if (r7 == r13) goto L_0x033b
            int r7 = r15.f642p
            r11 = r7
            goto L_0x033b
        L_0x0339:
            r35 = r7
        L_0x033b:
            r7 = r35
        L_0x033d:
            if (r12 != r13) goto L_0x035b
            if (r10 != r13) goto L_0x035b
            r36 = r7
            int r7 = r15.f644r
            if (r7 == r13) goto L_0x034f
            int r7 = r15.f644r
            r37 = r3
            r38 = r4
            r12 = r7
            goto L_0x0361
        L_0x034f:
            int r7 = r15.f645s
            if (r7 == r13) goto L_0x035d
            int r7 = r15.f645s
            r37 = r3
            r38 = r4
            r10 = r7
            goto L_0x0361
        L_0x035b:
            r36 = r7
        L_0x035d:
            r37 = r3
            r38 = r4
        L_0x0361:
            r24 = r32
            r3 = r34
            r7 = r36
            goto L_0x037b
        L_0x0368:
            r31 = r13
            r13 = -1
            r37 = r3
            r38 = r4
            r10 = r12
            r7 = r26
            r24 = r27
            r33 = r28
            r3 = r29
            r12 = r11
            r11 = r30
        L_0x037b:
            int r4 = r15.f639m
            if (r4 == r13) goto L_0x039c
            int r3 = r15.f639m
            dy r21 = r0.m279a(r3)
            if (r21 == 0) goto L_0x04ba
            float r3 = r15.f641o
            int r4 = r15.f640n
            dx$c r20 = p000.C0273dx.C0277c.CENTER
            dx$c r22 = p000.C0273dx.C0277c.CENTER
            r24 = 0
            r19 = r14
            r23 = r4
            r19.mo1558a(r20, r21, r22, r23, r24)
            r14.f1415u = r3
            goto L_0x04ba
        L_0x039c:
            r4 = r13
            if (r7 == r4) goto L_0x03ac
            dy r21 = r0.m279a(r7)
            if (r21 == 0) goto L_0x03aa
            dx$c r20 = p000.C0273dx.C0277c.LEFT
            dx$c r22 = p000.C0273dx.C0277c.LEFT
            goto L_0x03b8
        L_0x03aa:
            r4 = -1
            goto L_0x03c2
        L_0x03ac:
            if (r11 == r4) goto L_0x03c2
            dy r21 = r0.m279a(r11)
            if (r21 == 0) goto L_0x03aa
            dx$c r20 = p000.C0273dx.C0277c.LEFT
            dx$c r22 = p000.C0273dx.C0277c.RIGHT
        L_0x03b8:
            int r4 = r15.leftMargin
            r19 = r14
            r23 = r4
            r19.mo1558a(r20, r21, r22, r23, r24)
            goto L_0x03aa
        L_0x03c2:
            if (r12 == r4) goto L_0x03cf
            dy r21 = r0.m279a(r12)
            if (r21 == 0) goto L_0x03e6
            dx$c r20 = p000.C0273dx.C0277c.RIGHT
            dx$c r22 = p000.C0273dx.C0277c.LEFT
            goto L_0x03db
        L_0x03cf:
            if (r10 == r4) goto L_0x03e6
            dy r21 = r0.m279a(r10)
            if (r21 == 0) goto L_0x03e6
            dx$c r20 = p000.C0273dx.C0277c.RIGHT
            dx$c r22 = p000.C0273dx.C0277c.RIGHT
        L_0x03db:
            int r4 = r15.rightMargin
            r19 = r14
            r23 = r4
            r24 = r33
            r19.mo1558a(r20, r21, r22, r23, r24)
        L_0x03e6:
            int r4 = r15.f634h
            r7 = -1
            if (r4 == r7) goto L_0x03f8
            int r4 = r15.f634h
            dy r21 = r0.m279a(r4)
            if (r21 == 0) goto L_0x0416
            dx$c r20 = p000.C0273dx.C0277c.TOP
            dx$c r22 = p000.C0273dx.C0277c.TOP
            goto L_0x0409
        L_0x03f8:
            int r4 = r15.f635i
            r7 = -1
            if (r4 == r7) goto L_0x0416
            int r4 = r15.f635i
            dy r21 = r0.m279a(r4)
            if (r21 == 0) goto L_0x0416
            dx$c r20 = p000.C0273dx.C0277c.TOP
            dx$c r22 = p000.C0273dx.C0277c.BOTTOM
        L_0x0409:
            int r4 = r15.topMargin
            int r7 = r15.f647u
            r19 = r14
            r23 = r4
            r24 = r7
            r19.mo1558a(r20, r21, r22, r23, r24)
        L_0x0416:
            int r4 = r15.f636j
            r7 = -1
            if (r4 == r7) goto L_0x0428
            int r4 = r15.f636j
            dy r21 = r0.m279a(r4)
            if (r21 == 0) goto L_0x0446
            dx$c r20 = p000.C0273dx.C0277c.BOTTOM
            dx$c r22 = p000.C0273dx.C0277c.TOP
            goto L_0x0439
        L_0x0428:
            int r4 = r15.f637k
            r7 = -1
            if (r4 == r7) goto L_0x0446
            int r4 = r15.f637k
            dy r21 = r0.m279a(r4)
            if (r21 == 0) goto L_0x0446
            dx$c r20 = p000.C0273dx.C0277c.BOTTOM
            dx$c r22 = p000.C0273dx.C0277c.BOTTOM
        L_0x0439:
            int r4 = r15.bottomMargin
            int r7 = r15.f649w
            r19 = r14
            r23 = r4
            r24 = r7
            r19.mo1558a(r20, r21, r22, r23, r24)
        L_0x0446:
            int r4 = r15.f638l
            r7 = -1
            if (r4 == r7) goto L_0x049d
            android.util.SparseArray<android.view.View> r4 = r0.f568a
            int r7 = r15.f638l
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r7 = r15.f638l
            dy r7 = r0.m279a(r7)
            if (r7 == 0) goto L_0x049d
            if (r4 == 0) goto L_0x049d
            android.view.ViewGroup$LayoutParams r10 = r4.getLayoutParams()
            boolean r10 = r10 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0088a
            if (r10 == 0) goto L_0x049d
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r4 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r4
            r10 = 1
            r15.f611X = r10
            r4.f611X = r10
            dx$c r4 = p000.C0273dx.C0277c.BASELINE
            dx r39 = r14.mo1555a(r4)
            dx$c r4 = p000.C0273dx.C0277c.BASELINE
            dx r40 = r7.mo1555a(r4)
            r41 = 0
            r42 = -1
            int r43 = p000.C0273dx.C0276b.f1341b
            r44 = 0
            r45 = 1
            r39.mo1550a(r40, r41, r42, r43, r44, r45)
            dx$c r4 = p000.C0273dx.C0277c.TOP
            dx r4 = r14.mo1555a(r4)
            r4.mo1552c()
            dx$c r4 = p000.C0273dx.C0277c.BOTTOM
            dx r4 = r14.mo1555a(r4)
            r4.mo1552c()
        L_0x049d:
            r4 = 0
            int r7 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r7 < 0) goto L_0x04aa
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x04aa
            r14.f1375V = r3
        L_0x04aa:
            float r3 = r15.f588A
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x04ba
            float r3 = r15.f588A
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x04ba
            float r3 = r15.f588A
            r14.f1376W = r3
        L_0x04ba:
            if (r9 == 0) goto L_0x04cc
            int r3 = r15.f604Q
            r4 = -1
            if (r3 != r4) goto L_0x04c5
            int r3 = r15.f605R
            if (r3 == r4) goto L_0x04cc
        L_0x04c5:
            int r3 = r15.f604Q
            int r4 = r15.f605R
            r14.mo1556a(r3, r4)
        L_0x04cc:
            boolean r3 = r15.f609V
            if (r3 != 0) goto L_0x04f6
            int r3 = r15.width
            r4 = -1
            if (r3 != r4) goto L_0x04ef
            int r3 = p000.C0278dy.C0280a.f1426d
            r14.mo1575h(r3)
            dx$c r3 = p000.C0273dx.C0277c.LEFT
            dx r3 = r14.mo1555a(r3)
            int r4 = r15.leftMargin
            r3.f1330e = r4
            dx$c r3 = p000.C0273dx.C0277c.RIGHT
            dx r3 = r14.mo1555a(r3)
            int r4 = r15.rightMargin
            r3.f1330e = r4
            goto L_0x0500
        L_0x04ef:
            int r3 = p000.C0278dy.C0280a.f1425c
            r14.mo1575h(r3)
            r3 = 0
            goto L_0x04fd
        L_0x04f6:
            int r3 = p000.C0278dy.C0280a.f1423a
            r14.mo1575h(r3)
            int r3 = r15.width
        L_0x04fd:
            r14.mo1565d(r3)
        L_0x0500:
            boolean r3 = r15.f610W
            if (r3 != 0) goto L_0x052a
            int r3 = r15.height
            r4 = -1
            if (r3 != r4) goto L_0x0523
            int r3 = p000.C0278dy.C0280a.f1426d
            r14.mo1577i(r3)
            dx$c r3 = p000.C0273dx.C0277c.TOP
            dx r3 = r14.mo1555a(r3)
            int r4 = r15.topMargin
            r3.f1330e = r4
            dx$c r3 = p000.C0273dx.C0277c.BOTTOM
            dx r3 = r14.mo1555a(r3)
            int r4 = r15.bottomMargin
            r3.f1330e = r4
            goto L_0x0534
        L_0x0523:
            int r3 = p000.C0278dy.C0280a.f1425c
            r14.mo1577i(r3)
            r3 = 0
            goto L_0x0531
        L_0x052a:
            int r3 = p000.C0278dy.C0280a.f1423a
            r14.mo1577i(r3)
            int r3 = r15.height
        L_0x0531:
            r14.mo1568e(r3)
        L_0x0534:
            java.lang.String r3 = r15.f589B
            if (r3 == 0) goto L_0x053d
            java.lang.String r3 = r15.f589B
            r14.mo1559a(r3)
        L_0x053d:
            float r3 = r15.f592E
            float[] r4 = r14.f1387ag
            r7 = 0
            r4[r7] = r3
            float r3 = r15.f593F
            float[] r4 = r14.f1387ag
            r7 = 1
            r4[r7] = r3
            int r3 = r15.f594G
            r14.f1383ac = r3
            int r3 = r15.f595H
            r14.f1384ad = r3
            int r3 = r15.f596I
            int r4 = r15.f598K
            int r7 = r15.f600M
            float r10 = r15.f602O
            r14.f1401g = r3
            r14.f1404j = r4
            r14.f1405k = r7
            r14.f1406l = r10
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0570
            int r4 = r14.f1401g
            if (r4 != 0) goto L_0x0570
            r4 = 2
            r14.f1401g = r4
        L_0x0570:
            int r4 = r15.f597J
            int r7 = r15.f599L
            int r10 = r15.f601N
            float r11 = r15.f603P
            r14.f1402h = r4
            r14.f1407m = r7
            r14.f1408n = r10
            r14.f1409o = r11
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0592
            int r3 = r14.f1402h
            if (r3 != 0) goto L_0x0592
            r3 = 2
            r14.f1402h = r3
            goto L_0x0592
        L_0x058c:
            r37 = r3
            r38 = r4
            r31 = r13
        L_0x0592:
            int r8 = r8 + 1
            r13 = r31
            r3 = r37
            r4 = r38
            r7 = 0
            r11 = 8
            r12 = -1
            goto L_0x0204
        L_0x05a0:
            r37 = r3
            r38 = r4
            int r3 = r0.f582o
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto L_0x05ad
            r3 = 1
            goto L_0x05ae
        L_0x05ad:
            r3 = 0
        L_0x05ae:
            r4 = -2
            if (r3 == 0) goto L_0x0871
            dz r9 = r0.f569b
            r9.mo1597B()
            dz r9 = r0.f569b
            r9.mo1600e(r5, r6)
            int r9 = r59.getPaddingTop()
            int r10 = r59.getPaddingBottom()
            int r9 = r9 + r10
            int r10 = r59.getPaddingLeft()
            int r11 = r59.getPaddingRight()
            int r10 = r10 + r11
            int r11 = r59.getChildCount()
            r12 = 0
        L_0x05d2:
            if (r12 >= r11) goto L_0x0699
            android.view.View r13 = r0.getChildAt(r12)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x068c
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r14 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r14
            dy r15 = r14.f626al
            boolean r7 = r14.f612Y
            if (r7 != 0) goto L_0x068c
            boolean r7 = r14.f613Z
            if (r7 != 0) goto L_0x068c
            int r7 = r13.getVisibility()
            r15.f1378Y = r7
            int r7 = r14.width
            int r8 = r14.height
            if (r7 == 0) goto L_0x0679
            if (r8 != 0) goto L_0x0600
            goto L_0x0679
        L_0x0600:
            if (r7 != r4) goto L_0x0607
            r46 = r6
            r16 = 1
            goto L_0x060b
        L_0x0607:
            r46 = r6
            r16 = 0
        L_0x060b:
            int r6 = getChildMeasureSpec(r1, r10, r7)
            if (r8 != r4) goto L_0x0614
            r19 = 1
            goto L_0x0616
        L_0x0614:
            r19 = 0
        L_0x0616:
            int r4 = getChildMeasureSpec(r2, r9, r8)
            r13.measure(r6, r4)
            dr r4 = r0.f587t
            if (r4 == 0) goto L_0x062e
            dr r4 = r0.f587t
            r47 = r5
            long r5 = r4.f1257a
            r20 = 1
            long r5 = r5 + r20
            r4.f1257a = r5
            goto L_0x0630
        L_0x062e:
            r47 = r5
        L_0x0630:
            r4 = -2
            if (r7 != r4) goto L_0x0635
            r5 = 1
            goto L_0x0636
        L_0x0635:
            r5 = 0
        L_0x0636:
            r15.f1410p = r5
            if (r8 != r4) goto L_0x063c
            r4 = 1
            goto L_0x063d
        L_0x063c:
            r4 = 0
        L_0x063d:
            r15.f1411q = r4
            int r4 = r13.getMeasuredWidth()
            int r5 = r13.getMeasuredHeight()
            r15.mo1565d(r4)
            r15.mo1568e(r5)
            if (r16 == 0) goto L_0x0651
            r15.f1373S = r4
        L_0x0651:
            if (r19 == 0) goto L_0x0655
            r15.f1374T = r5
        L_0x0655:
            boolean r6 = r14.f611X
            if (r6 == 0) goto L_0x0662
            int r6 = r13.getBaseline()
            r7 = -1
            if (r6 == r7) goto L_0x0662
            r15.f1370P = r6
        L_0x0662:
            boolean r6 = r14.f609V
            if (r6 == 0) goto L_0x0690
            boolean r6 = r14.f610W
            if (r6 == 0) goto L_0x0690
            ef r6 = r15.mo1574h()
            r6.mo1646a(r4)
            ef r4 = r15.mo1576i()
            r4.mo1646a(r5)
            goto L_0x0690
        L_0x0679:
            r47 = r5
            r46 = r6
            ef r4 = r15.mo1574h()
            r4.mo1648c()
            ef r4 = r15.mo1576i()
            r4.mo1648c()
            goto L_0x0690
        L_0x068c:
            r47 = r5
            r46 = r6
        L_0x0690:
            int r12 = r12 + 1
            r6 = r46
            r5 = r47
            r4 = -2
            goto L_0x05d2
        L_0x0699:
            r47 = r5
            r46 = r6
            dz r4 = r0.f569b
            r4.mo1598C()
            r4 = 0
        L_0x06a3:
            if (r4 >= r11) goto L_0x086c
            android.view.View r5 = r0.getChildAt(r4)
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x085b
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r6 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r6
            dy r7 = r6.f626al
            boolean r8 = r6.f612Y
            if (r8 != 0) goto L_0x085b
            boolean r8 = r6.f613Z
            if (r8 != 0) goto L_0x085b
            int r8 = r5.getVisibility()
            r7.f1378Y = r8
            int r8 = r6.width
            int r12 = r6.height
            if (r8 == 0) goto L_0x06cf
            if (r12 != 0) goto L_0x085b
        L_0x06cf:
            dx$c r13 = p000.C0273dx.C0277c.LEFT
            dx r13 = r7.mo1555a(r13)
            ee r13 = r13.f1326a
            dx$c r14 = p000.C0273dx.C0277c.RIGHT
            dx r14 = r7.mo1555a(r14)
            ee r14 = r14.f1326a
            dx$c r15 = p000.C0273dx.C0277c.LEFT
            dx r15 = r7.mo1555a(r15)
            dx r15 = r15.f1329d
            if (r15 == 0) goto L_0x06f7
            dx$c r15 = p000.C0273dx.C0277c.RIGHT
            dx r15 = r7.mo1555a(r15)
            dx r15 = r15.f1329d
            if (r15 == 0) goto L_0x06f7
            r48 = r11
            r15 = 1
            goto L_0x06fa
        L_0x06f7:
            r48 = r11
            r15 = 0
        L_0x06fa:
            dx$c r11 = p000.C0273dx.C0277c.TOP
            dx r11 = r7.mo1555a(r11)
            ee r11 = r11.f1326a
            r49 = r3
            dx$c r3 = p000.C0273dx.C0277c.BOTTOM
            dx r3 = r7.mo1555a(r3)
            ee r3 = r3.f1326a
            r50 = r4
            dx$c r4 = p000.C0273dx.C0277c.TOP
            dx r4 = r7.mo1555a(r4)
            dx r4 = r4.f1329d
            if (r4 == 0) goto L_0x0724
            dx$c r4 = p000.C0273dx.C0277c.BOTTOM
            dx r4 = r7.mo1555a(r4)
            dx r4 = r4.f1329d
            if (r4 == 0) goto L_0x0724
            r4 = 1
            goto L_0x0725
        L_0x0724:
            r4 = 0
        L_0x0725:
            if (r8 != 0) goto L_0x0732
            if (r12 != 0) goto L_0x0732
            if (r15 == 0) goto L_0x0732
            if (r4 != 0) goto L_0x072e
            goto L_0x0732
        L_0x072e:
            r11 = r0
            r5 = 2
            goto L_0x0863
        L_0x0732:
            r51 = r6
            dz r6 = r0.f569b
            int r6 = r6.mo1593x()
            r52 = r5
            int r5 = p000.C0278dy.C0280a.f1424b
            if (r6 == r5) goto L_0x0742
            r5 = 1
            goto L_0x0743
        L_0x0742:
            r5 = 0
        L_0x0743:
            dz r6 = r0.f569b
            int r6 = r6.mo1594y()
            int r0 = p000.C0278dy.C0280a.f1424b
            if (r6 == r0) goto L_0x074f
            r0 = 1
            goto L_0x0750
        L_0x074f:
            r0 = 0
        L_0x0750:
            if (r5 != 0) goto L_0x0759
            ef r6 = r7.mo1574h()
            r6.mo1648c()
        L_0x0759:
            if (r0 != 0) goto L_0x0762
            ef r6 = r7.mo1576i()
            r6.mo1648c()
        L_0x0762:
            if (r8 != 0) goto L_0x0791
            if (r5 == 0) goto L_0x0788
            boolean r6 = r7.mo1567d()
            if (r6 == 0) goto L_0x0788
            if (r15 == 0) goto L_0x0788
            boolean r6 = r13.mo1650e()
            if (r6 == 0) goto L_0x0788
            boolean r6 = r14.mo1650e()
            if (r6 == 0) goto L_0x0788
            float r6 = r14.f1464f
            float r8 = r13.f1464f
            float r6 = r6 - r8
            int r8 = (int) r6
            ef r6 = r7.mo1574h()
            r6.mo1646a(r8)
            goto L_0x07a0
        L_0x0788:
            r6 = -2
            int r5 = getChildMeasureSpec(r1, r10, r6)
            r13 = r5
            r5 = 0
            r6 = 1
            goto L_0x07a5
        L_0x0791:
            r6 = -2
            r13 = -1
            if (r8 != r13) goto L_0x079c
            int r14 = getChildMeasureSpec(r1, r10, r13)
            r13 = r14
            r6 = 0
            goto L_0x07a5
        L_0x079c:
            if (r8 != r6) goto L_0x07a0
            r6 = 1
            goto L_0x07a1
        L_0x07a0:
            r6 = 0
        L_0x07a1:
            int r13 = getChildMeasureSpec(r1, r10, r8)
        L_0x07a5:
            if (r12 != 0) goto L_0x07d6
            if (r0 == 0) goto L_0x07cb
            boolean r14 = r7.mo1569e()
            if (r14 == 0) goto L_0x07cb
            if (r4 == 0) goto L_0x07cb
            boolean r4 = r11.mo1650e()
            if (r4 == 0) goto L_0x07cb
            boolean r4 = r3.mo1650e()
            if (r4 == 0) goto L_0x07cb
            float r3 = r3.f1464f
            float r4 = r11.f1464f
            float r3 = r3 - r4
            int r12 = (int) r3
            ef r3 = r7.mo1576i()
            r3.mo1646a(r12)
            goto L_0x07e7
        L_0x07cb:
            r3 = -2
            int r0 = getChildMeasureSpec(r2, r9, r3)
            r11 = r0
            r0 = r52
            r3 = 1
            r4 = 0
            goto L_0x07f0
        L_0x07d6:
            r3 = -2
            r4 = -1
            if (r12 != r4) goto L_0x07e3
            int r11 = getChildMeasureSpec(r2, r9, r4)
            r4 = r0
            r0 = r52
            r3 = 0
            goto L_0x07f0
        L_0x07e3:
            if (r12 != r3) goto L_0x07e7
            r3 = 1
            goto L_0x07e8
        L_0x07e7:
            r3 = 0
        L_0x07e8:
            int r4 = getChildMeasureSpec(r2, r9, r12)
            r11 = r4
            r4 = r0
            r0 = r52
        L_0x07f0:
            r0.measure(r13, r11)
            r11 = r59
            dr r13 = r11.f587t
            if (r13 == 0) goto L_0x0803
            dr r13 = r11.f587t
            long r14 = r13.f1257a
            r19 = 1
            long r14 = r14 + r19
            r13.f1257a = r14
        L_0x0803:
            r13 = -2
            if (r8 != r13) goto L_0x0808
            r8 = 1
            goto L_0x0809
        L_0x0808:
            r8 = 0
        L_0x0809:
            r7.f1410p = r8
            if (r12 != r13) goto L_0x080f
            r8 = 1
            goto L_0x0810
        L_0x080f:
            r8 = 0
        L_0x0810:
            r7.f1411q = r8
            int r8 = r0.getMeasuredWidth()
            int r12 = r0.getMeasuredHeight()
            r7.mo1565d(r8)
            r7.mo1568e(r12)
            if (r6 == 0) goto L_0x0824
            r7.f1373S = r8
        L_0x0824:
            if (r3 == 0) goto L_0x0828
            r7.f1374T = r12
        L_0x0828:
            if (r5 == 0) goto L_0x0833
            ef r3 = r7.mo1574h()
            r3.mo1646a(r8)
            r5 = 2
            goto L_0x083a
        L_0x0833:
            ef r3 = r7.mo1574h()
            r5 = 2
            r3.f1474i = r5
        L_0x083a:
            if (r4 == 0) goto L_0x0846
            ef r3 = r7.mo1576i()
            r3.mo1646a(r12)
        L_0x0843:
            r6 = r51
            goto L_0x084d
        L_0x0846:
            ef r3 = r7.mo1576i()
            r3.f1474i = r5
            goto L_0x0843
        L_0x084d:
            boolean r3 = r6.f611X
            if (r3 == 0) goto L_0x0863
            int r0 = r0.getBaseline()
            r3 = -1
            if (r0 == r3) goto L_0x0863
            r7.f1370P = r0
            goto L_0x0863
        L_0x085b:
            r49 = r3
            r50 = r4
            r48 = r11
            r5 = 2
            r11 = r0
        L_0x0863:
            int r4 = r50 + 1
            r0 = r11
            r11 = r48
            r3 = r49
            goto L_0x06a3
        L_0x086c:
            r11 = r0
            r49 = r3
            goto L_0x0989
        L_0x0871:
            r11 = r0
            r49 = r3
            r47 = r5
            r46 = r6
            int r0 = r59.getPaddingTop()
            int r3 = r59.getPaddingBottom()
            int r0 = r0 + r3
            int r3 = r59.getPaddingLeft()
            int r4 = r59.getPaddingRight()
            int r3 = r3 + r4
            int r4 = r59.getChildCount()
            r5 = 0
        L_0x088f:
            if (r5 >= r4) goto L_0x0989
            android.view.View r6 = r11.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 == r8) goto L_0x097c
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r7
            dy r8 = r7.f626al
            boolean r9 = r7.f612Y
            if (r9 != 0) goto L_0x097c
            boolean r9 = r7.f613Z
            if (r9 != 0) goto L_0x097c
            int r9 = r6.getVisibility()
            r8.f1378Y = r9
            int r9 = r7.width
            int r10 = r7.height
            boolean r12 = r7.f609V
            if (r12 != 0) goto L_0x08de
            boolean r12 = r7.f610W
            if (r12 != 0) goto L_0x08de
            boolean r12 = r7.f609V
            if (r12 != 0) goto L_0x08c9
            int r12 = r7.f596I
            r15 = 1
            if (r12 == r15) goto L_0x08df
            goto L_0x08ca
        L_0x08c9:
            r15 = 1
        L_0x08ca:
            int r12 = r7.width
            r13 = -1
            if (r12 == r13) goto L_0x08df
            boolean r12 = r7.f610W
            if (r12 != 0) goto L_0x08dc
            int r12 = r7.f597J
            if (r12 == r15) goto L_0x08df
            int r12 = r7.height
            if (r12 != r13) goto L_0x08dc
            goto L_0x08df
        L_0x08dc:
            r12 = 0
            goto L_0x08e0
        L_0x08de:
            r15 = 1
        L_0x08df:
            r12 = r15
        L_0x08e0:
            if (r12 == 0) goto L_0x0959
            if (r9 != 0) goto L_0x08ee
            r12 = -2
            int r13 = getChildMeasureSpec(r1, r3, r12)
            r14 = r13
            r16 = r15
            r13 = -1
            goto L_0x0908
        L_0x08ee:
            r12 = -2
            r13 = -1
            if (r9 != r13) goto L_0x08f9
            int r14 = getChildMeasureSpec(r1, r3, r13)
            r16 = 0
            goto L_0x0908
        L_0x08f9:
            if (r9 != r12) goto L_0x08fd
            r14 = r15
            goto L_0x08fe
        L_0x08fd:
            r14 = 0
        L_0x08fe:
            int r16 = getChildMeasureSpec(r1, r3, r9)
            r58 = r16
            r16 = r14
            r14 = r58
        L_0x0908:
            if (r10 != 0) goto L_0x0912
            int r17 = getChildMeasureSpec(r2, r0, r12)
            r13 = r15
        L_0x090f:
            r12 = r17
            goto L_0x0927
        L_0x0912:
            if (r10 != r13) goto L_0x091c
            int r17 = getChildMeasureSpec(r2, r0, r13)
            r12 = r17
            r13 = 0
            goto L_0x0927
        L_0x091c:
            if (r10 != r12) goto L_0x0920
            r12 = r15
            goto L_0x0921
        L_0x0920:
            r12 = 0
        L_0x0921:
            int r17 = getChildMeasureSpec(r2, r0, r10)
            r13 = r12
            goto L_0x090f
        L_0x0927:
            r6.measure(r14, r12)
            dr r12 = r11.f587t
            if (r12 == 0) goto L_0x093d
            dr r12 = r11.f587t
            r53 = r3
            r54 = r4
            long r3 = r12.f1257a
            r18 = 1
            long r3 = r3 + r18
            r12.f1257a = r3
            goto L_0x0941
        L_0x093d:
            r53 = r3
            r54 = r4
        L_0x0941:
            r3 = -2
            if (r9 != r3) goto L_0x0946
            r4 = r15
            goto L_0x0947
        L_0x0946:
            r4 = 0
        L_0x0947:
            r8.f1410p = r4
            if (r10 != r3) goto L_0x094d
            r3 = r15
            goto L_0x094e
        L_0x094d:
            r3 = 0
        L_0x094e:
            r8.f1411q = r3
            int r9 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            goto L_0x0960
        L_0x0959:
            r53 = r3
            r54 = r4
            r13 = 0
            r16 = 0
        L_0x0960:
            r8.mo1565d(r9)
            r8.mo1568e(r10)
            if (r16 == 0) goto L_0x096a
            r8.f1373S = r9
        L_0x096a:
            if (r13 == 0) goto L_0x096e
            r8.f1374T = r10
        L_0x096e:
            boolean r3 = r7.f611X
            if (r3 == 0) goto L_0x0981
            int r3 = r6.getBaseline()
            r4 = -1
            if (r3 == r4) goto L_0x0981
            r8.f1370P = r3
            goto L_0x0981
        L_0x097c:
            r53 = r3
            r54 = r4
            r15 = 1
        L_0x0981:
            int r5 = r5 + 1
            r3 = r53
            r4 = r54
            goto L_0x088f
        L_0x0989:
            r15 = 1
            int r0 = r59.getChildCount()
            r3 = 0
        L_0x098f:
            if (r3 >= r0) goto L_0x09d3
            android.view.View r4 = r11.getChildAt(r3)
            boolean r5 = r4 instanceof p000.C0301eo
            if (r5 == 0) goto L_0x09cf
            eo r4 = (p000.C0301eo) r4
            android.view.View r5 = r4.f1585b
            if (r5 == 0) goto L_0x09cf
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r5
            android.view.View r4 = r4.f1585b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r4 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r4
            dy r6 = r4.f626al
            r10 = 0
            r6.f1378Y = r10
            dy r6 = r5.f626al
            dy r7 = r4.f626al
            int r7 = r7.mo1580l()
            r6.mo1565d(r7)
            dy r5 = r5.f626al
            dy r6 = r4.f626al
            int r6 = r6.mo1581m()
            r5.mo1568e(r6)
            dy r4 = r4.f626al
            r5 = 8
            r4.f1378Y = r5
            goto L_0x09d0
        L_0x09cf:
            r10 = 0
        L_0x09d0:
            int r3 = r3 + 1
            goto L_0x098f
        L_0x09d3:
            r10 = 0
            java.util.ArrayList<ek> r0 = r11.f575h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x09e7
            r3 = r10
        L_0x09dd:
            if (r3 >= r0) goto L_0x09e7
            java.util.ArrayList<ek> r4 = r11.f575h
            r4.get(r3)
            int r3 = r3 + 1
            goto L_0x09dd
        L_0x09e7:
            int r0 = r59.getChildCount()
            if (r0 <= 0) goto L_0x09f0
            r59.m282b()
        L_0x09f0:
            java.util.ArrayList<dy> r0 = r11.f576i
            int r0 = r0.size()
            int r3 = r59.getPaddingBottom()
            int r4 = r38 + r3
            int r3 = r59.getPaddingRight()
            int r3 = r37 + r3
            if (r0 <= 0) goto L_0x0bff
            dz r6 = r11.f569b
            int r6 = r6.mo1593x()
            int r7 = p000.C0278dy.C0280a.f1424b
            if (r6 != r7) goto L_0x0a10
            r6 = r15
            goto L_0x0a11
        L_0x0a10:
            r6 = r10
        L_0x0a11:
            dz r7 = r11.f569b
            int r7 = r7.mo1594y()
            int r8 = p000.C0278dy.C0280a.f1424b
            if (r7 != r8) goto L_0x0a1d
            r7 = r15
            goto L_0x0a1e
        L_0x0a1d:
            r7 = r10
        L_0x0a1e:
            dz r8 = r11.f569b
            int r8 = r8.mo1580l()
            int r9 = r11.f577j
            int r8 = java.lang.Math.max(r8, r9)
            dz r9 = r11.f569b
            int r9 = r9.mo1581m()
            int r12 = r11.f578k
            int r9 = java.lang.Math.max(r9, r12)
            r12 = r8
            r13 = r9
            r8 = r10
            r9 = r8
            r14 = r9
        L_0x0a3b:
            if (r8 >= r0) goto L_0x0b61
            java.util.ArrayList<dy> r10 = r11.f576i
            java.lang.Object r10 = r10.get(r8)
            dy r10 = (p000.C0278dy) r10
            java.lang.Object r15 = r10.f1377X
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto L_0x0b4e
            android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
            r5 = r16
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.C0088a) r5
            r56 = r0
            boolean r0 = r5.f613Z
            if (r0 != 0) goto L_0x0b50
            boolean r0 = r5.f612Y
            if (r0 != 0) goto L_0x0b50
            int r0 = r15.getVisibility()
            r57 = r9
            r9 = 8
            if (r0 == r9) goto L_0x0b52
            if (r49 == 0) goto L_0x0a7d
            ef r0 = r10.mo1574h()
            boolean r0 = r0.mo1650e()
            if (r0 == 0) goto L_0x0a7d
            ef r0 = r10.mo1576i()
            boolean r0 = r0.mo1650e()
            if (r0 != 0) goto L_0x0b52
        L_0x0a7d:
            int r0 = r5.width
            r9 = -2
            if (r0 != r9) goto L_0x0a8d
            boolean r0 = r5.f609V
            if (r0 == 0) goto L_0x0a8d
            int r0 = r5.width
            int r0 = getChildMeasureSpec(r1, r3, r0)
            goto L_0x0a97
        L_0x0a8d:
            int r0 = r10.mo1580l()
            r9 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
        L_0x0a97:
            int r9 = r5.height
            r1 = -2
            if (r9 != r1) goto L_0x0aa7
            boolean r9 = r5.f610W
            if (r9 == 0) goto L_0x0aa7
            int r9 = r5.height
            int r9 = getChildMeasureSpec(r2, r4, r9)
            goto L_0x0ab1
        L_0x0aa7:
            int r9 = r10.mo1581m()
            r1 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1)
        L_0x0ab1:
            r15.measure(r0, r9)
            dr r0 = r11.f587t
            if (r0 == 0) goto L_0x0ac2
            dr r0 = r11.f587t
            long r1 = r0.f1258b
            r16 = 1
            long r1 = r1 + r16
            r0.f1258b = r1
        L_0x0ac2:
            int r0 = r15.getMeasuredWidth()
            int r1 = r15.getMeasuredHeight()
            int r2 = r10.mo1580l()
            if (r0 == r2) goto L_0x0afa
            r10.mo1565d(r0)
            if (r49 == 0) goto L_0x0adc
            ef r2 = r10.mo1574h()
            r2.mo1646a(r0)
        L_0x0adc:
            if (r6 == 0) goto L_0x0af8
            int r0 = r10.mo1586r()
            if (r0 <= r12) goto L_0x0af8
            int r0 = r10.mo1586r()
            dx$c r2 = p000.C0273dx.C0277c.RIGHT
            dx r2 = r10.mo1555a(r2)
            int r2 = r2.mo1551b()
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r12, r0)
            r12 = r0
        L_0x0af8:
            r57 = 1
        L_0x0afa:
            int r0 = r10.mo1581m()
            if (r1 == r0) goto L_0x0b2a
            r10.mo1568e(r1)
            if (r49 == 0) goto L_0x0b0c
            ef r0 = r10.mo1576i()
            r0.mo1646a(r1)
        L_0x0b0c:
            if (r7 == 0) goto L_0x0b28
            int r0 = r10.mo1587s()
            if (r0 <= r13) goto L_0x0b28
            int r0 = r10.mo1587s()
            dx$c r1 = p000.C0273dx.C0277c.BOTTOM
            dx r1 = r10.mo1555a(r1)
            int r1 = r1.mo1551b()
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r13, r0)
            r13 = r0
        L_0x0b28:
            r57 = 1
        L_0x0b2a:
            boolean r0 = r5.f611X
            if (r0 == 0) goto L_0x0b3e
            int r0 = r15.getBaseline()
            r1 = -1
            if (r0 == r1) goto L_0x0b3f
            int r2 = r10.f1370P
            if (r0 == r2) goto L_0x0b3f
            r10.f1370P = r0
            r57 = 1
            goto L_0x0b3f
        L_0x0b3e:
            r1 = -1
        L_0x0b3f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 11
            if (r0 < r2) goto L_0x0b53
            int r0 = r15.getMeasuredState()
            int r14 = combineMeasuredStates(r14, r0)
            goto L_0x0b53
        L_0x0b4e:
            r56 = r0
        L_0x0b50:
            r57 = r9
        L_0x0b52:
            r1 = -1
        L_0x0b53:
            r9 = r57
            int r8 = r8 + 1
            r0 = r56
            r1 = r60
            r2 = r61
            r10 = 0
            r15 = 1
            goto L_0x0a3b
        L_0x0b61:
            r56 = r0
            r57 = r9
            if (r57 == 0) goto L_0x0ba6
            dz r0 = r11.f569b
            r1 = r47
            r0.mo1565d(r1)
            dz r0 = r11.f569b
            r1 = r46
            r0.mo1568e(r1)
            if (r49 == 0) goto L_0x0b7c
            dz r0 = r11.f569b
            r0.mo1598C()
        L_0x0b7c:
            r59.m282b()
            dz r0 = r11.f569b
            int r0 = r0.mo1580l()
            if (r0 >= r12) goto L_0x0b8e
            dz r0 = r11.f569b
            r0.mo1565d(r12)
            r8 = 1
            goto L_0x0b8f
        L_0x0b8e:
            r8 = 0
        L_0x0b8f:
            dz r0 = r11.f569b
            int r0 = r0.mo1581m()
            if (r0 >= r13) goto L_0x0b9f
            dz r0 = r11.f569b
            r0.mo1568e(r13)
            r55 = 1
            goto L_0x0ba1
        L_0x0b9f:
            r55 = r8
        L_0x0ba1:
            if (r55 == 0) goto L_0x0ba6
            r59.m282b()
        L_0x0ba6:
            r0 = r56
            r1 = 0
        L_0x0ba9:
            if (r1 >= r0) goto L_0x0c00
            java.util.ArrayList<dy> r2 = r11.f576i
            java.lang.Object r2 = r2.get(r1)
            dy r2 = (p000.C0278dy) r2
            java.lang.Object r5 = r2.f1377X
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0bf6
            int r6 = r5.getMeasuredWidth()
            int r7 = r2.mo1580l()
            if (r6 != r7) goto L_0x0bcd
            int r6 = r5.getMeasuredHeight()
            int r7 = r2.mo1581m()
            if (r6 == r7) goto L_0x0bf6
        L_0x0bcd:
            int r6 = r2.f1378Y
            r7 = 8
            if (r6 == r7) goto L_0x0bf8
            int r6 = r2.mo1580l()
            r8 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r2 = r2.mo1581m()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            r5.measure(r6, r2)
            dr r2 = r11.f587t
            if (r2 == 0) goto L_0x0bfa
            dr r2 = r11.f587t
            long r5 = r2.f1258b
            r9 = 1
            long r5 = r5 + r9
            r2.f1258b = r5
            goto L_0x0bfc
        L_0x0bf6:
            r7 = 8
        L_0x0bf8:
            r8 = 1073741824(0x40000000, float:2.0)
        L_0x0bfa:
            r9 = 1
        L_0x0bfc:
            int r1 = r1 + 1
            goto L_0x0ba9
        L_0x0bff:
            r14 = 0
        L_0x0c00:
            dz r0 = r11.f569b
            int r0 = r0.mo1580l()
            int r0 = r0 + r3
            dz r1 = r11.f569b
            int r1 = r1.mo1581m()
            int r1 = r1 + r4
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r2 < r3) goto L_0x0c45
            r2 = r60
            int r0 = resolveSizeAndState(r0, r2, r14)
            int r2 = r14 << 16
            r3 = r61
            int r1 = resolveSizeAndState(r1, r3, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r2
            r1 = r1 & r2
            int r2 = r11.f579l
            int r0 = java.lang.Math.min(r2, r0)
            int r2 = r11.f580m
            int r1 = java.lang.Math.min(r2, r1)
            dz r2 = r11.f569b
            boolean r2 = r2.f1438au
            if (r2 == 0) goto L_0x0c3c
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 | r2
        L_0x0c3c:
            dz r2 = r11.f569b
            boolean r2 = r2.f1439av
            if (r2 == 0) goto L_0x0c45
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r2
        L_0x0c45:
            r11.setMeasuredDimension(r0, r1)
            r11.f585r = r0
            r11.f586s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0278dy a = mo709a(view);
        if ((view instanceof C0300en) && !(a instanceof C0283ea)) {
            C0088a aVar = (C0088a) view.getLayoutParams();
            aVar.f626al = new C0283ea();
            aVar.f612Y = true;
            ((C0283ea) aVar.f626al).mo1631j(aVar.f606S);
        }
        if (view instanceof C0295ek) {
            C0295ek ekVar = (C0295ek) view;
            ekVar.mo1659a();
            ((C0088a) view.getLayoutParams()).f613Z = true;
            if (!this.f575h.contains(ekVar)) {
                this.f575h.add(ekVar);
            }
        }
        this.f568a.put(view.getId(), view);
        this.f581n = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f568a.remove(view.getId());
        C0278dy a = mo709a(view);
        this.f569b.mo1655b(a);
        this.f575h.remove(view);
        this.f576i.remove(a);
        this.f581n = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f581n = true;
        this.f585r = -1;
        this.f586s = -1;
        this.f571d = -1;
        this.f572e = -1;
        this.f573f = 0;
        this.f574g = 0;
    }

    public void setConstraintSet(C0296el elVar) {
        this.f583p = elVar;
    }

    public void setId(int i) {
        this.f568a.remove(getId());
        super.setId(i);
        this.f568a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f580m) {
            this.f580m = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f579l) {
            this.f579l = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f578k) {
            this.f578k = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f577j) {
            this.f577j = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f569b.f1437at = i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
