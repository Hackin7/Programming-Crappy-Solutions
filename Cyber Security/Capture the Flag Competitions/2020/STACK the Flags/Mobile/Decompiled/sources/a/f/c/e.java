package a.f.c;

import a.f.c.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f717d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f718e;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, b> f719a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f720b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f721c = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f718e = sparseIntArray;
        sparseIntArray.append(k.Constraint_layout_constraintLeft_toLeftOf, 25);
        f718e.append(k.Constraint_layout_constraintLeft_toRightOf, 26);
        f718e.append(k.Constraint_layout_constraintRight_toLeftOf, 29);
        f718e.append(k.Constraint_layout_constraintRight_toRightOf, 30);
        f718e.append(k.Constraint_layout_constraintTop_toTopOf, 36);
        f718e.append(k.Constraint_layout_constraintTop_toBottomOf, 35);
        f718e.append(k.Constraint_layout_constraintBottom_toTopOf, 4);
        f718e.append(k.Constraint_layout_constraintBottom_toBottomOf, 3);
        f718e.append(k.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f718e.append(k.Constraint_layout_editor_absoluteX, 6);
        f718e.append(k.Constraint_layout_editor_absoluteY, 7);
        f718e.append(k.Constraint_layout_constraintGuide_begin, 17);
        f718e.append(k.Constraint_layout_constraintGuide_end, 18);
        f718e.append(k.Constraint_layout_constraintGuide_percent, 19);
        f718e.append(k.Constraint_android_orientation, 27);
        f718e.append(k.Constraint_layout_constraintStart_toEndOf, 32);
        f718e.append(k.Constraint_layout_constraintStart_toStartOf, 33);
        f718e.append(k.Constraint_layout_constraintEnd_toStartOf, 10);
        f718e.append(k.Constraint_layout_constraintEnd_toEndOf, 9);
        f718e.append(k.Constraint_layout_goneMarginLeft, 13);
        f718e.append(k.Constraint_layout_goneMarginTop, 16);
        f718e.append(k.Constraint_layout_goneMarginRight, 14);
        f718e.append(k.Constraint_layout_goneMarginBottom, 11);
        f718e.append(k.Constraint_layout_goneMarginStart, 15);
        f718e.append(k.Constraint_layout_goneMarginEnd, 12);
        f718e.append(k.Constraint_layout_constraintVertical_weight, 40);
        f718e.append(k.Constraint_layout_constraintHorizontal_weight, 39);
        f718e.append(k.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f718e.append(k.Constraint_layout_constraintVertical_chainStyle, 42);
        f718e.append(k.Constraint_layout_constraintHorizontal_bias, 20);
        f718e.append(k.Constraint_layout_constraintVertical_bias, 37);
        f718e.append(k.Constraint_layout_constraintDimensionRatio, 5);
        f718e.append(k.Constraint_layout_constraintLeft_creator, 82);
        f718e.append(k.Constraint_layout_constraintTop_creator, 82);
        f718e.append(k.Constraint_layout_constraintRight_creator, 82);
        f718e.append(k.Constraint_layout_constraintBottom_creator, 82);
        f718e.append(k.Constraint_layout_constraintBaseline_creator, 82);
        f718e.append(k.Constraint_android_layout_marginLeft, 24);
        f718e.append(k.Constraint_android_layout_marginRight, 28);
        f718e.append(k.Constraint_android_layout_marginStart, 31);
        f718e.append(k.Constraint_android_layout_marginEnd, 8);
        f718e.append(k.Constraint_android_layout_marginTop, 34);
        f718e.append(k.Constraint_android_layout_marginBottom, 2);
        f718e.append(k.Constraint_android_layout_width, 23);
        f718e.append(k.Constraint_android_layout_height, 21);
        f718e.append(k.Constraint_android_visibility, 22);
        f718e.append(k.Constraint_android_alpha, 43);
        f718e.append(k.Constraint_android_elevation, 44);
        f718e.append(k.Constraint_android_rotationX, 45);
        f718e.append(k.Constraint_android_rotationY, 46);
        f718e.append(k.Constraint_android_rotation, 60);
        f718e.append(k.Constraint_android_scaleX, 47);
        f718e.append(k.Constraint_android_scaleY, 48);
        f718e.append(k.Constraint_android_transformPivotX, 49);
        f718e.append(k.Constraint_android_transformPivotY, 50);
        f718e.append(k.Constraint_android_translationX, 51);
        f718e.append(k.Constraint_android_translationY, 52);
        f718e.append(k.Constraint_android_translationZ, 53);
        f718e.append(k.Constraint_layout_constraintWidth_default, 54);
        f718e.append(k.Constraint_layout_constraintHeight_default, 55);
        f718e.append(k.Constraint_layout_constraintWidth_max, 56);
        f718e.append(k.Constraint_layout_constraintHeight_max, 57);
        f718e.append(k.Constraint_layout_constraintWidth_min, 58);
        f718e.append(k.Constraint_layout_constraintHeight_min, 59);
        f718e.append(k.Constraint_layout_constraintCircle, 61);
        f718e.append(k.Constraint_layout_constraintCircleRadius, 62);
        f718e.append(k.Constraint_layout_constraintCircleAngle, 63);
        f718e.append(k.Constraint_animate_relativeTo, 64);
        f718e.append(k.Constraint_transitionEasing, 65);
        f718e.append(k.Constraint_drawPath, 66);
        f718e.append(k.Constraint_transitionPathRotate, 67);
        f718e.append(k.Constraint_motionStagger, 79);
        f718e.append(k.Constraint_android_id, 38);
        f718e.append(k.Constraint_motionProgress, 68);
        f718e.append(k.Constraint_layout_constraintWidth_percent, 69);
        f718e.append(k.Constraint_layout_constraintHeight_percent, 70);
        f718e.append(k.Constraint_chainUseRtl, 71);
        f718e.append(k.Constraint_barrierDirection, 72);
        f718e.append(k.Constraint_barrierMargin, 73);
        f718e.append(k.Constraint_constraint_referenced_ids, 74);
        f718e.append(k.Constraint_barrierAllowsGoneWidgets, 75);
        f718e.append(k.Constraint_pathMotionArc, 76);
        f718e.append(k.Constraint_layout_constraintTag, 77);
        f718e.append(k.Constraint_visibilityMode, 78);
        f718e.append(k.Constraint_layout_constrainedWidth, 80);
        f718e.append(k.Constraint_layout_constrainedHeight, 81);
    }

    public static class b {
        public static SparseIntArray k0;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a  reason: collision with root package name */
        public boolean f728a = false;
        public float a0 = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public boolean f729b = false;
        public int b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f730c;
        public int c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f731d;
        public int d0 = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f732e = -1;
        public int[] e0;

        /* renamed from: f  reason: collision with root package name */
        public int f733f = -1;
        public String f0;

        /* renamed from: g  reason: collision with root package name */
        public float f734g = -1.0f;
        public String g0;
        public int h = -1;
        public boolean h0 = false;
        public int i = -1;
        public boolean i0 = false;
        public int j = -1;
        public boolean j0 = true;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;

        public void a(b src) {
            this.f728a = src.f728a;
            this.f730c = src.f730c;
            this.f729b = src.f729b;
            this.f731d = src.f731d;
            this.f732e = src.f732e;
            this.f733f = src.f733f;
            this.f734g = src.f734g;
            this.h = src.h;
            this.i = src.i;
            this.j = src.j;
            this.k = src.k;
            this.l = src.l;
            this.m = src.m;
            this.n = src.n;
            this.o = src.o;
            this.p = src.p;
            this.q = src.q;
            this.r = src.r;
            this.s = src.s;
            this.t = src.t;
            this.u = src.u;
            this.v = src.v;
            this.w = src.w;
            this.x = src.x;
            this.y = src.y;
            this.z = src.z;
            this.A = src.A;
            this.B = src.B;
            this.C = src.C;
            this.D = src.D;
            this.E = src.E;
            this.F = src.F;
            this.G = src.G;
            this.H = src.H;
            this.I = src.I;
            this.J = src.J;
            this.K = src.K;
            this.L = src.L;
            this.M = src.M;
            this.N = src.N;
            this.O = src.O;
            this.P = src.P;
            this.Q = src.Q;
            this.R = src.R;
            this.S = src.S;
            this.T = src.T;
            this.U = src.U;
            this.V = src.V;
            this.W = src.W;
            this.X = src.X;
            this.Y = src.Y;
            this.Z = src.Z;
            this.a0 = src.a0;
            this.b0 = src.b0;
            this.c0 = src.c0;
            this.d0 = src.d0;
            this.g0 = src.g0;
            int[] iArr = src.e0;
            if (iArr != null) {
                this.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.e0 = null;
            }
            this.f0 = src.f0;
            this.h0 = src.h0;
            this.i0 = src.i0;
            this.j0 = src.j0;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(k.Layout_layout_constraintLeft_toLeftOf, 24);
            k0.append(k.Layout_layout_constraintLeft_toRightOf, 25);
            k0.append(k.Layout_layout_constraintRight_toLeftOf, 28);
            k0.append(k.Layout_layout_constraintRight_toRightOf, 29);
            k0.append(k.Layout_layout_constraintTop_toTopOf, 35);
            k0.append(k.Layout_layout_constraintTop_toBottomOf, 34);
            k0.append(k.Layout_layout_constraintBottom_toTopOf, 4);
            k0.append(k.Layout_layout_constraintBottom_toBottomOf, 3);
            k0.append(k.Layout_layout_constraintBaseline_toBaselineOf, 1);
            k0.append(k.Layout_layout_editor_absoluteX, 6);
            k0.append(k.Layout_layout_editor_absoluteY, 7);
            k0.append(k.Layout_layout_constraintGuide_begin, 17);
            k0.append(k.Layout_layout_constraintGuide_end, 18);
            k0.append(k.Layout_layout_constraintGuide_percent, 19);
            k0.append(k.Layout_android_orientation, 26);
            k0.append(k.Layout_layout_constraintStart_toEndOf, 31);
            k0.append(k.Layout_layout_constraintStart_toStartOf, 32);
            k0.append(k.Layout_layout_constraintEnd_toStartOf, 10);
            k0.append(k.Layout_layout_constraintEnd_toEndOf, 9);
            k0.append(k.Layout_layout_goneMarginLeft, 13);
            k0.append(k.Layout_layout_goneMarginTop, 16);
            k0.append(k.Layout_layout_goneMarginRight, 14);
            k0.append(k.Layout_layout_goneMarginBottom, 11);
            k0.append(k.Layout_layout_goneMarginStart, 15);
            k0.append(k.Layout_layout_goneMarginEnd, 12);
            k0.append(k.Layout_layout_constraintVertical_weight, 38);
            k0.append(k.Layout_layout_constraintHorizontal_weight, 37);
            k0.append(k.Layout_layout_constraintHorizontal_chainStyle, 39);
            k0.append(k.Layout_layout_constraintVertical_chainStyle, 40);
            k0.append(k.Layout_layout_constraintHorizontal_bias, 20);
            k0.append(k.Layout_layout_constraintVertical_bias, 36);
            k0.append(k.Layout_layout_constraintDimensionRatio, 5);
            k0.append(k.Layout_layout_constraintLeft_creator, 76);
            k0.append(k.Layout_layout_constraintTop_creator, 76);
            k0.append(k.Layout_layout_constraintRight_creator, 76);
            k0.append(k.Layout_layout_constraintBottom_creator, 76);
            k0.append(k.Layout_layout_constraintBaseline_creator, 76);
            k0.append(k.Layout_android_layout_marginLeft, 23);
            k0.append(k.Layout_android_layout_marginRight, 27);
            k0.append(k.Layout_android_layout_marginStart, 30);
            k0.append(k.Layout_android_layout_marginEnd, 8);
            k0.append(k.Layout_android_layout_marginTop, 33);
            k0.append(k.Layout_android_layout_marginBottom, 2);
            k0.append(k.Layout_android_layout_width, 22);
            k0.append(k.Layout_android_layout_height, 21);
            k0.append(k.Layout_layout_constraintCircle, 61);
            k0.append(k.Layout_layout_constraintCircleRadius, 62);
            k0.append(k.Layout_layout_constraintCircleAngle, 63);
            k0.append(k.Layout_layout_constraintWidth_percent, 69);
            k0.append(k.Layout_layout_constraintHeight_percent, 70);
            k0.append(k.Layout_chainUseRtl, 71);
            k0.append(k.Layout_barrierDirection, 72);
            k0.append(k.Layout_barrierMargin, 73);
            k0.append(k.Layout_constraint_referenced_ids, 74);
            k0.append(k.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, k.Layout);
            this.f729b = true;
            int N2 = a2.getIndexCount();
            for (int i2 = 0; i2 < N2; i2++) {
                int attr = a2.getIndex(i2);
                int i3 = k0.get(attr);
                if (i3 == 80) {
                    this.h0 = a2.getBoolean(attr, this.h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.p = e.k(a2, attr, this.p);
                            continue;
                        case 2:
                            this.G = a2.getDimensionPixelSize(attr, this.G);
                            continue;
                        case 3:
                            this.o = e.k(a2, attr, this.o);
                            continue;
                        case 4:
                            this.n = e.k(a2, attr, this.n);
                            continue;
                        case 5:
                            this.w = a2.getString(attr);
                            continue;
                        case 6:
                            this.A = a2.getDimensionPixelOffset(attr, this.A);
                            continue;
                        case 7:
                            this.B = a2.getDimensionPixelOffset(attr, this.B);
                            continue;
                        case 8:
                            this.H = a2.getDimensionPixelSize(attr, this.H);
                            continue;
                        case 9:
                            this.t = e.k(a2, attr, this.t);
                            continue;
                        case 10:
                            this.s = e.k(a2, attr, this.s);
                            continue;
                        case 11:
                            this.M = a2.getDimensionPixelSize(attr, this.M);
                            continue;
                        case 12:
                            this.N = a2.getDimensionPixelSize(attr, this.N);
                            continue;
                        case 13:
                            this.J = a2.getDimensionPixelSize(attr, this.J);
                            continue;
                        case 14:
                            this.L = a2.getDimensionPixelSize(attr, this.L);
                            continue;
                        case 15:
                            this.O = a2.getDimensionPixelSize(attr, this.O);
                            continue;
                        case 16:
                            this.K = a2.getDimensionPixelSize(attr, this.K);
                            continue;
                        case 17:
                            this.f732e = a2.getDimensionPixelOffset(attr, this.f732e);
                            continue;
                        case 18:
                            this.f733f = a2.getDimensionPixelOffset(attr, this.f733f);
                            continue;
                        case 19:
                            this.f734g = a2.getFloat(attr, this.f734g);
                            continue;
                        case 20:
                            this.u = a2.getFloat(attr, this.u);
                            continue;
                        case 21:
                            this.f731d = a2.getLayoutDimension(attr, this.f731d);
                            continue;
                        case 22:
                            this.f730c = a2.getLayoutDimension(attr, this.f730c);
                            continue;
                        case 23:
                            this.D = a2.getDimensionPixelSize(attr, this.D);
                            continue;
                        case 24:
                            this.h = e.k(a2, attr, this.h);
                            continue;
                        case 25:
                            this.i = e.k(a2, attr, this.i);
                            continue;
                        case 26:
                            this.C = a2.getInt(attr, this.C);
                            continue;
                        case 27:
                            this.E = a2.getDimensionPixelSize(attr, this.E);
                            continue;
                        case 28:
                            this.j = e.k(a2, attr, this.j);
                            continue;
                        case 29:
                            this.k = e.k(a2, attr, this.k);
                            continue;
                        case 30:
                            this.I = a2.getDimensionPixelSize(attr, this.I);
                            continue;
                        case 31:
                            this.q = e.k(a2, attr, this.q);
                            continue;
                        case 32:
                            this.r = e.k(a2, attr, this.r);
                            continue;
                        case 33:
                            this.F = a2.getDimensionPixelSize(attr, this.F);
                            continue;
                        case 34:
                            this.m = e.k(a2, attr, this.m);
                            continue;
                        case 35:
                            this.l = e.k(a2, attr, this.l);
                            continue;
                        case 36:
                            this.v = a2.getFloat(attr, this.v);
                            continue;
                        case 37:
                            this.Q = a2.getFloat(attr, this.Q);
                            continue;
                        case 38:
                            this.P = a2.getFloat(attr, this.P);
                            continue;
                        case 39:
                            this.R = a2.getInt(attr, this.R);
                            continue;
                        case 40:
                            this.S = a2.getInt(attr, this.S);
                            continue;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = a2.getInt(attr, this.T);
                                    continue;
                                case 55:
                                    this.U = a2.getInt(attr, this.U);
                                    continue;
                                case 56:
                                    this.V = a2.getDimensionPixelSize(attr, this.V);
                                    continue;
                                case 57:
                                    this.W = a2.getDimensionPixelSize(attr, this.W);
                                    continue;
                                case 58:
                                    this.X = a2.getDimensionPixelSize(attr, this.X);
                                    continue;
                                case 59:
                                    this.Y = a2.getDimensionPixelSize(attr, this.Y);
                                    continue;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.x = e.k(a2, attr, this.x);
                                            continue;
                                        case 62:
                                            this.y = a2.getDimensionPixelSize(attr, this.y);
                                            continue;
                                        case 63:
                                            this.z = a2.getFloat(attr, this.z);
                                            continue;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = a2.getFloat(attr, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.a0 = a2.getFloat(attr, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.b0 = a2.getInt(attr, this.b0);
                                                    continue;
                                                case 73:
                                                    this.c0 = a2.getDimensionPixelSize(attr, this.c0);
                                                    continue;
                                                case 74:
                                                    this.f0 = a2.getString(attr);
                                                    continue;
                                                case 75:
                                                    this.j0 = a2.getBoolean(attr, this.j0);
                                                    continue;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + k0.get(attr));
                                                    continue;
                                                case 77:
                                                    this.g0 = a2.getString(attr);
                                                    continue;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + k0.get(attr));
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.i0 = a2.getBoolean(attr, this.i0);
                }
            }
            a2.recycle();
        }
    }

    /* renamed from: a.f.c.e$e  reason: collision with other inner class name */
    public static class C0012e {
        public static SparseIntArray n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f747a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f748b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f749c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f750d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f751e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f752f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f753g = Float.NaN;
        public float h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        public void a(C0012e src) {
            this.f747a = src.f747a;
            this.f748b = src.f748b;
            this.f749c = src.f749c;
            this.f750d = src.f750d;
            this.f751e = src.f751e;
            this.f752f = src.f752f;
            this.f753g = src.f753g;
            this.h = src.h;
            this.i = src.i;
            this.j = src.j;
            this.k = src.k;
            this.l = src.l;
            this.m = src.m;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(k.Transform_android_rotation, 1);
            n.append(k.Transform_android_rotationX, 2);
            n.append(k.Transform_android_rotationY, 3);
            n.append(k.Transform_android_scaleX, 4);
            n.append(k.Transform_android_scaleY, 5);
            n.append(k.Transform_android_transformPivotX, 6);
            n.append(k.Transform_android_transformPivotY, 7);
            n.append(k.Transform_android_translationX, 8);
            n.append(k.Transform_android_translationY, 9);
            n.append(k.Transform_android_translationZ, 10);
            n.append(k.Transform_android_elevation, 11);
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, k.Transform);
            this.f747a = true;
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                switch (n.get(attr)) {
                    case 1:
                        this.f748b = a2.getFloat(attr, this.f748b);
                        break;
                    case 2:
                        this.f749c = a2.getFloat(attr, this.f749c);
                        break;
                    case 3:
                        this.f750d = a2.getFloat(attr, this.f750d);
                        break;
                    case 4:
                        this.f751e = a2.getFloat(attr, this.f751e);
                        break;
                    case 5:
                        this.f752f = a2.getFloat(attr, this.f752f);
                        break;
                    case 6:
                        this.f753g = a2.getDimension(attr, this.f753g);
                        break;
                    case 7:
                        this.h = a2.getDimension(attr, this.h);
                        break;
                    case 8:
                        this.i = a2.getDimension(attr, this.i);
                        break;
                    case 9:
                        this.j = a2.getDimension(attr, this.j);
                        break;
                    case 10:
                        this.k = a2.getDimension(attr, this.k);
                        break;
                    case 11:
                        this.l = true;
                        this.m = a2.getDimension(attr, this.m);
                        break;
                }
            }
            a2.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f742a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f743b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f744c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f745d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f746e = Float.NaN;

        public void a(d src) {
            this.f742a = src.f742a;
            this.f743b = src.f743b;
            this.f745d = src.f745d;
            this.f746e = src.f746e;
            this.f744c = src.f744c;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, k.PropertySet);
            this.f742a = true;
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                if (attr == k.PropertySet_android_alpha) {
                    this.f745d = a2.getFloat(attr, this.f745d);
                } else if (attr == k.PropertySet_android_visibility) {
                    this.f743b = a2.getInt(attr, this.f743b);
                    this.f743b = e.f717d[this.f743b];
                } else if (attr == k.PropertySet_visibilityMode) {
                    this.f744c = a2.getInt(attr, this.f744c);
                } else if (attr == k.PropertySet_motionProgress) {
                    this.f746e = a2.getFloat(attr, this.f746e);
                }
            }
            a2.recycle();
        }
    }

    public static class c {
        public static SparseIntArray h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f735a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f736b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f737c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f738d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f739e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f740f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f741g = Float.NaN;

        public void a(c src) {
            this.f735a = src.f735a;
            this.f736b = src.f736b;
            this.f737c = src.f737c;
            this.f738d = src.f738d;
            this.f739e = src.f739e;
            this.f741g = src.f741g;
            this.f740f = src.f740f;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(k.Motion_motionPathRotate, 1);
            h.append(k.Motion_pathMotionArc, 2);
            h.append(k.Motion_transitionEasing, 3);
            h.append(k.Motion_drawPath, 4);
            h.append(k.Motion_animate_relativeTo, 5);
            h.append(k.Motion_motionStagger, 6);
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, k.Motion);
            this.f735a = true;
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                switch (h.get(attr)) {
                    case 1:
                        this.f741g = a2.getFloat(attr, this.f741g);
                        break;
                    case 2:
                        this.f738d = a2.getInt(attr, this.f738d);
                        break;
                    case 3:
                        if (a2.peekValue(attr).type == 3) {
                            this.f737c = a2.getString(attr);
                            break;
                        } else {
                            this.f737c = a.f.a.a.a.f557b[a2.getInteger(attr, 0)];
                            break;
                        }
                    case 4:
                        this.f739e = a2.getInt(attr, 0);
                        break;
                    case 5:
                        this.f736b = e.k(a2, attr, this.f736b);
                        break;
                    case 6:
                        this.f740f = a2.getFloat(attr, this.f740f);
                        break;
                }
            }
            a2.recycle();
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f722a;

        /* renamed from: b  reason: collision with root package name */
        public final d f723b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f724c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final b f725d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final C0012e f726e = new C0012e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, b> f727f = new HashMap<>();

        /* renamed from: e */
        public a clone() {
            a clone = new a();
            clone.f725d.a(this.f725d);
            clone.f724c.a(this.f724c);
            clone.f723b.a(this.f723b);
            clone.f726e.a(this.f726e);
            clone.f722a = this.f722a;
            return clone;
        }

        public final void h(c helper, int viewId, f.a param) {
            g(viewId, param);
            if (helper instanceof a) {
                b bVar = this.f725d;
                bVar.d0 = 1;
                a barrier = (a) helper;
                bVar.b0 = barrier.getType();
                this.f725d.e0 = barrier.getReferencedIds();
                this.f725d.c0 = barrier.getMargin();
            }
        }

        public final void g(int viewId, f.a param) {
            f(viewId, param);
            this.f723b.f745d = param.n0;
            C0012e eVar = this.f726e;
            eVar.f748b = param.q0;
            eVar.f749c = param.r0;
            eVar.f750d = param.s0;
            eVar.f751e = param.t0;
            eVar.f752f = param.u0;
            eVar.f753g = param.v0;
            eVar.h = param.w0;
            eVar.i = param.x0;
            eVar.j = param.y0;
            eVar.k = param.z0;
            eVar.m = param.p0;
            eVar.l = param.o0;
        }

        public final void f(int viewId, ConstraintLayout.a param) {
            this.f722a = viewId;
            b bVar = this.f725d;
            bVar.h = param.f1632d;
            bVar.i = param.f1633e;
            bVar.j = param.f1634f;
            bVar.k = param.f1635g;
            bVar.l = param.h;
            bVar.m = param.i;
            bVar.n = param.j;
            bVar.o = param.k;
            bVar.p = param.l;
            bVar.q = param.p;
            bVar.r = param.q;
            bVar.s = param.r;
            bVar.t = param.s;
            bVar.u = param.z;
            bVar.v = param.A;
            bVar.w = param.B;
            bVar.x = param.m;
            bVar.y = param.n;
            bVar.z = param.o;
            bVar.A = param.P;
            bVar.B = param.Q;
            bVar.C = param.R;
            bVar.f734g = param.f1631c;
            bVar.f732e = param.f1629a;
            bVar.f733f = param.f1630b;
            bVar.f730c = ((ViewGroup.MarginLayoutParams) param).width;
            bVar.f731d = ((ViewGroup.MarginLayoutParams) param).height;
            bVar.D = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            bVar.E = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            bVar.F = ((ViewGroup.MarginLayoutParams) param).topMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            bVar.P = param.E;
            bVar.Q = param.D;
            bVar.S = param.G;
            bVar.R = param.F;
            bVar.h0 = param.S;
            bVar.i0 = param.T;
            bVar.T = param.H;
            bVar.U = param.I;
            bVar.V = param.L;
            bVar.W = param.M;
            bVar.X = param.J;
            bVar.Y = param.K;
            bVar.Z = param.N;
            bVar.a0 = param.O;
            bVar.g0 = param.U;
            bVar.K = param.u;
            bVar.M = param.w;
            bVar.J = param.t;
            bVar.L = param.v;
            bVar.O = param.x;
            bVar.N = param.y;
            int i = Build.VERSION.SDK_INT;
            bVar.H = param.getMarginEnd();
            this.f725d.I = param.getMarginStart();
        }

        public void d(ConstraintLayout.a param) {
            b bVar = this.f725d;
            param.f1632d = bVar.h;
            param.f1633e = bVar.i;
            param.f1634f = bVar.j;
            param.f1635g = bVar.k;
            param.h = bVar.l;
            param.i = bVar.m;
            param.j = bVar.n;
            param.k = bVar.o;
            param.l = bVar.p;
            param.p = bVar.q;
            param.q = bVar.r;
            param.r = bVar.s;
            param.s = bVar.t;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = bVar.D;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) param).topMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = bVar.G;
            param.x = bVar.O;
            param.y = bVar.N;
            param.u = bVar.K;
            param.w = bVar.M;
            param.z = bVar.u;
            param.A = bVar.v;
            param.m = bVar.x;
            param.n = bVar.y;
            param.o = bVar.z;
            param.B = bVar.w;
            param.P = bVar.A;
            param.Q = bVar.B;
            param.E = bVar.P;
            param.D = bVar.Q;
            param.G = bVar.S;
            param.F = bVar.R;
            param.S = bVar.h0;
            param.T = bVar.i0;
            param.H = bVar.T;
            param.I = bVar.U;
            param.L = bVar.V;
            param.M = bVar.W;
            param.J = bVar.X;
            param.K = bVar.Y;
            param.N = bVar.Z;
            param.O = bVar.a0;
            param.R = bVar.C;
            param.f1631c = bVar.f734g;
            param.f1629a = bVar.f732e;
            param.f1630b = bVar.f733f;
            ((ViewGroup.MarginLayoutParams) param).width = bVar.f730c;
            ((ViewGroup.MarginLayoutParams) param).height = bVar.f731d;
            String str = bVar.g0;
            if (str != null) {
                param.U = str;
            }
            param.setMarginStart(this.f725d.I);
            param.setMarginEnd(this.f725d.H);
            param.a();
        }
    }

    public void d(Context context, int constraintLayoutId) {
        e((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public void e(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        this.f721c.clear();
        for (int i = 0; i < count; i++) {
            View view = constraintLayout.getChildAt(i);
            ConstraintLayout.a param = (ConstraintLayout.a) view.getLayoutParams();
            int id = view.getId();
            if (!this.f720b || id != -1) {
                if (!this.f721c.containsKey(Integer.valueOf(id))) {
                    this.f721c.put(Integer.valueOf(id), new a());
                }
                a constraint = this.f721c.get(Integer.valueOf(id));
                constraint.f727f = b.a(this.f719a, view);
                constraint.f(id, param);
                constraint.f723b.f743b = view.getVisibility();
                constraint.f723b.f745d = view.getAlpha();
                constraint.f726e.f748b = view.getRotation();
                constraint.f726e.f749c = view.getRotationX();
                constraint.f726e.f750d = view.getRotationY();
                constraint.f726e.f751e = view.getScaleX();
                constraint.f726e.f752f = view.getScaleY();
                float pivotX = view.getPivotX();
                float pivotY = view.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    C0012e eVar = constraint.f726e;
                    eVar.f753g = pivotX;
                    eVar.h = pivotY;
                }
                constraint.f726e.i = view.getTranslationX();
                constraint.f726e.j = view.getTranslationY();
                constraint.f726e.k = view.getTranslationZ();
                C0012e eVar2 = constraint.f726e;
                if (eVar2.l) {
                    eVar2.m = view.getElevation();
                }
                if (view instanceof a) {
                    a barrier = (a) view;
                    constraint.f725d.j0 = barrier.n();
                    constraint.f725d.e0 = barrier.getReferencedIds();
                    constraint.f725d.b0 = barrier.getType();
                    constraint.f725d.c0 = barrier.getMargin();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void f(f constraints) {
        int count = constraints.getChildCount();
        this.f721c.clear();
        for (int i = 0; i < count; i++) {
            View view = constraints.getChildAt(i);
            f.a param = (f.a) view.getLayoutParams();
            int id = view.getId();
            if (!this.f720b || id != -1) {
                if (!this.f721c.containsKey(Integer.valueOf(id))) {
                    this.f721c.put(Integer.valueOf(id), new a());
                }
                a constraint = this.f721c.get(Integer.valueOf(id));
                if (view instanceof c) {
                    constraint.h((c) view, id, param);
                }
                constraint.g(id, param);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void c(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int count = constraintLayout.getChildCount();
        HashSet<Integer> used = new HashSet<>(this.f721c.keySet());
        for (int i = 0; i < count; i++) {
            View view = constraintLayout.getChildAt(i);
            int id = view.getId();
            if (!this.f721c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + a.f.a.b.a.a(view));
            } else if (this.f720b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f721c.containsKey(Integer.valueOf(id))) {
                    used.remove(Integer.valueOf(id));
                    a constraint = this.f721c.get(Integer.valueOf(id));
                    if (view instanceof a) {
                        constraint.f725d.d0 = 1;
                    }
                    int i2 = constraint.f725d.d0;
                    if (i2 != -1 && i2 == 1) {
                        a barrier = (a) view;
                        barrier.setId(id);
                        barrier.setType(constraint.f725d.b0);
                        barrier.setMargin(constraint.f725d.c0);
                        barrier.setAllowsGoneWidget(constraint.f725d.j0);
                        b bVar = constraint.f725d;
                        int[] iArr = bVar.e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f0;
                            if (str != null) {
                                bVar.e0 = g(barrier, str);
                                barrier.setReferencedIds(constraint.f725d.e0);
                            }
                        }
                    }
                    ConstraintLayout.a param = (ConstraintLayout.a) view.getLayoutParams();
                    param.a();
                    constraint.d(param);
                    if (applyPostLayout) {
                        b.c(view, constraint.f727f);
                    }
                    view.setLayoutParams(param);
                    d dVar = constraint.f723b;
                    if (dVar.f744c == 0) {
                        view.setVisibility(dVar.f743b);
                    }
                    view.setAlpha(constraint.f723b.f745d);
                    view.setRotation(constraint.f726e.f748b);
                    view.setRotationX(constraint.f726e.f749c);
                    view.setRotationY(constraint.f726e.f750d);
                    view.setScaleX(constraint.f726e.f751e);
                    view.setScaleY(constraint.f726e.f752f);
                    if (!Float.isNaN(constraint.f726e.f753g)) {
                        view.setPivotX(constraint.f726e.f753g);
                    }
                    if (!Float.isNaN(constraint.f726e.h)) {
                        view.setPivotY(constraint.f726e.h);
                    }
                    view.setTranslationX(constraint.f726e.i);
                    view.setTranslationY(constraint.f726e.j);
                    view.setTranslationZ(constraint.f726e.k);
                    C0012e eVar = constraint.f726e;
                    if (eVar.l) {
                        view.setElevation(eVar.m);
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator<Integer> it = used.iterator();
        while (it.hasNext()) {
            Integer id2 = it.next();
            a constraint2 = this.f721c.get(id2);
            int i3 = constraint2.f725d.d0;
            if (i3 != -1 && i3 == 1) {
                a barrier2 = new a(constraintLayout.getContext());
                barrier2.setId(id2.intValue());
                b bVar2 = constraint2.f725d;
                int[] iArr2 = bVar2.e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f0;
                    if (str2 != null) {
                        bVar2.e0 = g(barrier2, str2);
                        barrier2.setReferencedIds(constraint2.f725d.e0);
                    }
                }
                barrier2.setType(constraint2.f725d.b0);
                barrier2.setMargin(constraint2.f725d.c0);
                ConstraintLayout.a param2 = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                constraint2.d(param2);
                constraintLayout.addView(barrier2, param2);
            }
            if (constraint2.f725d.f728a) {
                h g2 = new h(constraintLayout.getContext());
                g2.setId(id2.intValue());
                ConstraintLayout.a param3 = constraintLayout.generateDefaultLayoutParams();
                constraint2.d(param3);
                constraintLayout.addView(g2, param3);
            }
        }
    }

    public void i(Context context, int resourceId) {
        XmlPullParser parser = context.getResources().getXml(resourceId);
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String tagName = parser.getName();
                    a constraint = h(context, Xml.asAttributeSet(parser));
                    if (tagName.equalsIgnoreCase("Guideline")) {
                        constraint.f725d.f728a = true;
                    }
                    this.f721c.put(Integer.valueOf(constraint.f722a), constraint);
                } else if (eventType != 3) {
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r7.equals("PropertySet") != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0183, code lost:
        continue;
     */
    public void j(Context context, XmlPullParser parser) {
        a constraint = null;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                if (eventType != 0) {
                    char c2 = 3;
                    if (eventType == 2) {
                        String tagName = parser.getName();
                        switch (tagName.hashCode()) {
                            case -2025855158:
                                if (tagName.equals("Layout")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1984451626:
                                if (tagName.equals("Motion")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1269513683:
                                break;
                            case -1238332596:
                                if (tagName.equals("Transform")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -71750448:
                                if (tagName.equals("Guideline")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1331510167:
                                if (tagName.equals("Barrier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1791837707:
                                if (tagName.equals("CustomAttribute")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1803088381:
                                if (tagName.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                constraint = h(context, Xml.asAttributeSet(parser));
                                continue;
                            case 1:
                                constraint = h(context, Xml.asAttributeSet(parser));
                                constraint.f725d.f728a = true;
                                constraint.f725d.f729b = true;
                                continue;
                            case 2:
                                constraint = h(context, Xml.asAttributeSet(parser));
                                constraint.f725d.d0 = 1;
                                continue;
                            case 3:
                                if (constraint != null) {
                                    constraint.f723b.b(context, Xml.asAttributeSet(parser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 4:
                                if (constraint != null) {
                                    constraint.f726e.b(context, Xml.asAttributeSet(parser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 5:
                                if (constraint != null) {
                                    constraint.f725d.b(context, Xml.asAttributeSet(parser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 6:
                                if (constraint != null) {
                                    constraint.f724c.b(context, Xml.asAttributeSet(parser));
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 7:
                                if (constraint != null) {
                                    b.b(context, parser, constraint.f727f);
                                    continue;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String tagName2 = parser.getName();
                        if (!"ConstraintSet".equals(tagName2)) {
                            if (tagName2.equalsIgnoreCase("Constraint")) {
                                this.f721c.put(Integer.valueOf(constraint.f722a), constraint);
                                constraint = null;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    parser.getName();
                }
                eventType = parser.next();
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public static int k(TypedArray a2, int index, int def) {
        int ret = a2.getResourceId(index, def);
        if (ret == -1) {
            return a2.getInt(index, -1);
        }
        return ret;
    }

    public final a h(Context context, AttributeSet attrs) {
        a c2 = new a();
        TypedArray a2 = context.obtainStyledAttributes(attrs, k.Constraint);
        l(c2, a2);
        a2.recycle();
        return c2;
    }

    public final void l(a c2, TypedArray a2) {
        int N = a2.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a2.getIndex(i);
            if (!(attr == k.Constraint_android_id || k.Constraint_android_layout_marginStart == attr || k.Constraint_android_layout_marginEnd == attr)) {
                c2.f724c.f735a = true;
                c2.f725d.f729b = true;
                c2.f723b.f742a = true;
                c2.f726e.f747a = true;
            }
            switch (f718e.get(attr)) {
                case 1:
                    b bVar = c2.f725d;
                    bVar.p = k(a2, attr, bVar.p);
                    break;
                case 2:
                    b bVar2 = c2.f725d;
                    bVar2.G = a2.getDimensionPixelSize(attr, bVar2.G);
                    break;
                case 3:
                    b bVar3 = c2.f725d;
                    bVar3.o = k(a2, attr, bVar3.o);
                    break;
                case 4:
                    b bVar4 = c2.f725d;
                    bVar4.n = k(a2, attr, bVar4.n);
                    break;
                case 5:
                    c2.f725d.w = a2.getString(attr);
                    break;
                case 6:
                    b bVar5 = c2.f725d;
                    bVar5.A = a2.getDimensionPixelOffset(attr, bVar5.A);
                    break;
                case 7:
                    b bVar6 = c2.f725d;
                    bVar6.B = a2.getDimensionPixelOffset(attr, bVar6.B);
                    break;
                case 8:
                    b bVar7 = c2.f725d;
                    bVar7.H = a2.getDimensionPixelSize(attr, bVar7.H);
                    break;
                case 9:
                    b bVar8 = c2.f725d;
                    bVar8.t = k(a2, attr, bVar8.t);
                    break;
                case 10:
                    b bVar9 = c2.f725d;
                    bVar9.s = k(a2, attr, bVar9.s);
                    break;
                case 11:
                    b bVar10 = c2.f725d;
                    bVar10.M = a2.getDimensionPixelSize(attr, bVar10.M);
                    break;
                case 12:
                    b bVar11 = c2.f725d;
                    bVar11.N = a2.getDimensionPixelSize(attr, bVar11.N);
                    break;
                case 13:
                    b bVar12 = c2.f725d;
                    bVar12.J = a2.getDimensionPixelSize(attr, bVar12.J);
                    break;
                case 14:
                    b bVar13 = c2.f725d;
                    bVar13.L = a2.getDimensionPixelSize(attr, bVar13.L);
                    break;
                case 15:
                    b bVar14 = c2.f725d;
                    bVar14.O = a2.getDimensionPixelSize(attr, bVar14.O);
                    break;
                case 16:
                    b bVar15 = c2.f725d;
                    bVar15.K = a2.getDimensionPixelSize(attr, bVar15.K);
                    break;
                case 17:
                    b bVar16 = c2.f725d;
                    bVar16.f732e = a2.getDimensionPixelOffset(attr, bVar16.f732e);
                    break;
                case 18:
                    b bVar17 = c2.f725d;
                    bVar17.f733f = a2.getDimensionPixelOffset(attr, bVar17.f733f);
                    break;
                case 19:
                    b bVar18 = c2.f725d;
                    bVar18.f734g = a2.getFloat(attr, bVar18.f734g);
                    break;
                case 20:
                    b bVar19 = c2.f725d;
                    bVar19.u = a2.getFloat(attr, bVar19.u);
                    break;
                case 21:
                    b bVar20 = c2.f725d;
                    bVar20.f731d = a2.getLayoutDimension(attr, bVar20.f731d);
                    break;
                case 22:
                    d dVar = c2.f723b;
                    dVar.f743b = a2.getInt(attr, dVar.f743b);
                    d dVar2 = c2.f723b;
                    dVar2.f743b = f717d[dVar2.f743b];
                    break;
                case 23:
                    b bVar21 = c2.f725d;
                    bVar21.f730c = a2.getLayoutDimension(attr, bVar21.f730c);
                    break;
                case 24:
                    b bVar22 = c2.f725d;
                    bVar22.D = a2.getDimensionPixelSize(attr, bVar22.D);
                    break;
                case 25:
                    b bVar23 = c2.f725d;
                    bVar23.h = k(a2, attr, bVar23.h);
                    break;
                case 26:
                    b bVar24 = c2.f725d;
                    bVar24.i = k(a2, attr, bVar24.i);
                    break;
                case 27:
                    b bVar25 = c2.f725d;
                    bVar25.C = a2.getInt(attr, bVar25.C);
                    break;
                case 28:
                    b bVar26 = c2.f725d;
                    bVar26.E = a2.getDimensionPixelSize(attr, bVar26.E);
                    break;
                case 29:
                    b bVar27 = c2.f725d;
                    bVar27.j = k(a2, attr, bVar27.j);
                    break;
                case 30:
                    b bVar28 = c2.f725d;
                    bVar28.k = k(a2, attr, bVar28.k);
                    break;
                case 31:
                    b bVar29 = c2.f725d;
                    bVar29.I = a2.getDimensionPixelSize(attr, bVar29.I);
                    break;
                case 32:
                    b bVar30 = c2.f725d;
                    bVar30.q = k(a2, attr, bVar30.q);
                    break;
                case 33:
                    b bVar31 = c2.f725d;
                    bVar31.r = k(a2, attr, bVar31.r);
                    break;
                case 34:
                    b bVar32 = c2.f725d;
                    bVar32.F = a2.getDimensionPixelSize(attr, bVar32.F);
                    break;
                case 35:
                    b bVar33 = c2.f725d;
                    bVar33.m = k(a2, attr, bVar33.m);
                    break;
                case 36:
                    b bVar34 = c2.f725d;
                    bVar34.l = k(a2, attr, bVar34.l);
                    break;
                case 37:
                    b bVar35 = c2.f725d;
                    bVar35.v = a2.getFloat(attr, bVar35.v);
                    break;
                case 38:
                    c2.f722a = a2.getResourceId(attr, c2.f722a);
                    break;
                case 39:
                    b bVar36 = c2.f725d;
                    bVar36.Q = a2.getFloat(attr, bVar36.Q);
                    break;
                case 40:
                    b bVar37 = c2.f725d;
                    bVar37.P = a2.getFloat(attr, bVar37.P);
                    break;
                case 41:
                    b bVar38 = c2.f725d;
                    bVar38.R = a2.getInt(attr, bVar38.R);
                    break;
                case 42:
                    b bVar39 = c2.f725d;
                    bVar39.S = a2.getInt(attr, bVar39.S);
                    break;
                case 43:
                    d dVar3 = c2.f723b;
                    dVar3.f745d = a2.getFloat(attr, dVar3.f745d);
                    break;
                case 44:
                    C0012e eVar = c2.f726e;
                    eVar.l = true;
                    eVar.m = a2.getDimension(attr, eVar.m);
                    break;
                case 45:
                    C0012e eVar2 = c2.f726e;
                    eVar2.f749c = a2.getFloat(attr, eVar2.f749c);
                    break;
                case 46:
                    C0012e eVar3 = c2.f726e;
                    eVar3.f750d = a2.getFloat(attr, eVar3.f750d);
                    break;
                case 47:
                    C0012e eVar4 = c2.f726e;
                    eVar4.f751e = a2.getFloat(attr, eVar4.f751e);
                    break;
                case 48:
                    C0012e eVar5 = c2.f726e;
                    eVar5.f752f = a2.getFloat(attr, eVar5.f752f);
                    break;
                case 49:
                    C0012e eVar6 = c2.f726e;
                    eVar6.f753g = a2.getDimension(attr, eVar6.f753g);
                    break;
                case 50:
                    C0012e eVar7 = c2.f726e;
                    eVar7.h = a2.getDimension(attr, eVar7.h);
                    break;
                case 51:
                    C0012e eVar8 = c2.f726e;
                    eVar8.i = a2.getDimension(attr, eVar8.i);
                    break;
                case 52:
                    C0012e eVar9 = c2.f726e;
                    eVar9.j = a2.getDimension(attr, eVar9.j);
                    break;
                case 53:
                    C0012e eVar10 = c2.f726e;
                    eVar10.k = a2.getDimension(attr, eVar10.k);
                    break;
                case 54:
                    b bVar40 = c2.f725d;
                    bVar40.T = a2.getInt(attr, bVar40.T);
                    break;
                case 55:
                    b bVar41 = c2.f725d;
                    bVar41.U = a2.getInt(attr, bVar41.U);
                    break;
                case 56:
                    b bVar42 = c2.f725d;
                    bVar42.V = a2.getDimensionPixelSize(attr, bVar42.V);
                    break;
                case 57:
                    b bVar43 = c2.f725d;
                    bVar43.W = a2.getDimensionPixelSize(attr, bVar43.W);
                    break;
                case 58:
                    b bVar44 = c2.f725d;
                    bVar44.X = a2.getDimensionPixelSize(attr, bVar44.X);
                    break;
                case 59:
                    b bVar45 = c2.f725d;
                    bVar45.Y = a2.getDimensionPixelSize(attr, bVar45.Y);
                    break;
                case 60:
                    C0012e eVar11 = c2.f726e;
                    eVar11.f748b = a2.getFloat(attr, eVar11.f748b);
                    break;
                case 61:
                    b bVar46 = c2.f725d;
                    bVar46.x = k(a2, attr, bVar46.x);
                    break;
                case 62:
                    b bVar47 = c2.f725d;
                    bVar47.y = a2.getDimensionPixelSize(attr, bVar47.y);
                    break;
                case 63:
                    b bVar48 = c2.f725d;
                    bVar48.z = a2.getFloat(attr, bVar48.z);
                    break;
                case 64:
                    c cVar = c2.f724c;
                    cVar.f736b = k(a2, attr, cVar.f736b);
                    break;
                case 65:
                    if (a2.peekValue(attr).type == 3) {
                        c2.f724c.f737c = a2.getString(attr);
                        break;
                    } else {
                        c2.f724c.f737c = a.f.a.a.a.f557b[a2.getInteger(attr, 0)];
                        break;
                    }
                case 66:
                    c2.f724c.f739e = a2.getInt(attr, 0);
                    break;
                case 67:
                    c cVar2 = c2.f724c;
                    cVar2.f741g = a2.getFloat(attr, cVar2.f741g);
                    break;
                case 68:
                    d dVar4 = c2.f723b;
                    dVar4.f746e = a2.getFloat(attr, dVar4.f746e);
                    break;
                case 69:
                    c2.f725d.Z = a2.getFloat(attr, 1.0f);
                    break;
                case 70:
                    c2.f725d.a0 = a2.getFloat(attr, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = c2.f725d;
                    bVar49.b0 = a2.getInt(attr, bVar49.b0);
                    break;
                case 73:
                    b bVar50 = c2.f725d;
                    bVar50.c0 = a2.getDimensionPixelSize(attr, bVar50.c0);
                    break;
                case 74:
                    c2.f725d.f0 = a2.getString(attr);
                    break;
                case 75:
                    b bVar51 = c2.f725d;
                    bVar51.j0 = a2.getBoolean(attr, bVar51.j0);
                    break;
                case 76:
                    c cVar3 = c2.f724c;
                    cVar3.f738d = a2.getInt(attr, cVar3.f738d);
                    break;
                case 77:
                    c2.f725d.g0 = a2.getString(attr);
                    break;
                case 78:
                    d dVar5 = c2.f723b;
                    dVar5.f744c = a2.getInt(attr, dVar5.f744c);
                    break;
                case 79:
                    c cVar4 = c2.f724c;
                    cVar4.f740f = a2.getFloat(attr, cVar4.f740f);
                    break;
                case 80:
                    b bVar52 = c2.f725d;
                    bVar52.h0 = a2.getBoolean(attr, bVar52.h0);
                    break;
                case 81:
                    b bVar53 = c2.f725d;
                    bVar53.i0 = a2.getBoolean(attr, bVar53.i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + f718e.get(attr));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + f718e.get(attr));
                    break;
            }
        }
    }

    /* JADX INFO: Multiple debug info for r7v1 int: [D('constraintLayout' androidx.constraintlayout.widget.ConstraintLayout), D('count' int)] */
    public final int[] g(View view, String referenceIdString) {
        Object value;
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] tags = new int[split.length];
        int count = 0;
        int i = 0;
        while (i < split.length) {
            String idString = split[i].trim();
            int tag = 0;
            try {
                tag = j.class.getField(idString).getInt(null);
            } catch (Exception e2) {
            }
            if (tag == 0) {
                tag = context.getResources().getIdentifier(idString, "id", context.getPackageName());
            }
            if (tag == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) view.getParent()).f(0, idString)) != null && (value instanceof Integer)) {
                tag = ((Integer) value).intValue();
            }
            tags[count] = tag;
            i++;
            count++;
        }
        if (count != split.length) {
            return Arrays.copyOf(tags, count);
        }
        return tags;
    }
}
