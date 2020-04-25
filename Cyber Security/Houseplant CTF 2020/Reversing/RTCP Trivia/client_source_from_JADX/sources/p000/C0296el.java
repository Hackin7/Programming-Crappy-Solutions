package p000;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0088a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: el */
public final class C0296el {

    /* renamed from: b */
    private static final int[] f1495b = {0, 4, 8};

    /* renamed from: c */
    private static SparseIntArray f1496c;

    /* renamed from: a */
    public HashMap<Integer, C0297a> f1497a = new HashMap<>();

    /* renamed from: el$a */
    public static class C0297a {

        /* renamed from: A */
        public int f1498A;

        /* renamed from: B */
        public int f1499B;

        /* renamed from: C */
        public int f1500C;

        /* renamed from: D */
        public int f1501D;

        /* renamed from: E */
        public int f1502E;

        /* renamed from: F */
        public int f1503F;

        /* renamed from: G */
        public int f1504G;

        /* renamed from: H */
        public int f1505H;

        /* renamed from: I */
        public int f1506I;

        /* renamed from: J */
        public int f1507J;

        /* renamed from: K */
        public int f1508K;

        /* renamed from: L */
        public int f1509L;

        /* renamed from: M */
        public int f1510M;

        /* renamed from: N */
        public int f1511N;

        /* renamed from: O */
        public int f1512O;

        /* renamed from: P */
        public int f1513P;

        /* renamed from: Q */
        public float f1514Q;

        /* renamed from: R */
        public float f1515R;

        /* renamed from: S */
        public int f1516S;

        /* renamed from: T */
        public int f1517T;

        /* renamed from: U */
        public float f1518U;

        /* renamed from: V */
        public boolean f1519V;

        /* renamed from: W */
        public float f1520W;

        /* renamed from: X */
        public float f1521X;

        /* renamed from: Y */
        public float f1522Y;

        /* renamed from: Z */
        public float f1523Z;

        /* renamed from: a */
        public boolean f1524a;

        /* renamed from: aa */
        public float f1525aa;

        /* renamed from: ab */
        public float f1526ab;

        /* renamed from: ac */
        public float f1527ac;

        /* renamed from: ad */
        public float f1528ad;

        /* renamed from: ae */
        public float f1529ae;

        /* renamed from: af */
        public float f1530af;

        /* renamed from: ag */
        public float f1531ag;

        /* renamed from: ah */
        public boolean f1532ah;

        /* renamed from: ai */
        public boolean f1533ai;

        /* renamed from: aj */
        public int f1534aj;

        /* renamed from: ak */
        public int f1535ak;

        /* renamed from: al */
        public int f1536al;

        /* renamed from: am */
        public int f1537am;

        /* renamed from: an */
        public int f1538an;

        /* renamed from: ao */
        public int f1539ao;

        /* renamed from: ap */
        public float f1540ap;

        /* renamed from: aq */
        public float f1541aq;

        /* renamed from: ar */
        public int f1542ar;

        /* renamed from: as */
        public int f1543as;

        /* renamed from: at */
        public int[] f1544at;

        /* renamed from: b */
        public int f1545b;

        /* renamed from: c */
        public int f1546c;

        /* renamed from: d */
        public int f1547d;

        /* renamed from: e */
        public int f1548e;

        /* renamed from: f */
        public int f1549f;

        /* renamed from: g */
        public float f1550g;

        /* renamed from: h */
        public int f1551h;

        /* renamed from: i */
        public int f1552i;

        /* renamed from: j */
        public int f1553j;

        /* renamed from: k */
        public int f1554k;

        /* renamed from: l */
        public int f1555l;

        /* renamed from: m */
        public int f1556m;

        /* renamed from: n */
        public int f1557n;

        /* renamed from: o */
        public int f1558o;

        /* renamed from: p */
        public int f1559p;

        /* renamed from: q */
        public int f1560q;

        /* renamed from: r */
        public int f1561r;

        /* renamed from: s */
        public int f1562s;

        /* renamed from: t */
        public int f1563t;

        /* renamed from: u */
        public float f1564u;

        /* renamed from: v */
        public float f1565v;

        /* renamed from: w */
        public String f1566w;

        /* renamed from: x */
        public int f1567x;

        /* renamed from: y */
        public int f1568y;

        /* renamed from: z */
        public float f1569z;

        private C0297a() {
            this.f1524a = false;
            this.f1548e = -1;
            this.f1549f = -1;
            this.f1550g = -1.0f;
            this.f1551h = -1;
            this.f1552i = -1;
            this.f1553j = -1;
            this.f1554k = -1;
            this.f1555l = -1;
            this.f1556m = -1;
            this.f1557n = -1;
            this.f1558o = -1;
            this.f1559p = -1;
            this.f1560q = -1;
            this.f1561r = -1;
            this.f1562s = -1;
            this.f1563t = -1;
            this.f1564u = 0.5f;
            this.f1565v = 0.5f;
            this.f1566w = null;
            this.f1567x = -1;
            this.f1568y = 0;
            this.f1569z = 0.0f;
            this.f1498A = -1;
            this.f1499B = -1;
            this.f1500C = -1;
            this.f1501D = -1;
            this.f1502E = -1;
            this.f1503F = -1;
            this.f1504G = -1;
            this.f1505H = -1;
            this.f1506I = -1;
            this.f1507J = 0;
            this.f1508K = -1;
            this.f1509L = -1;
            this.f1510M = -1;
            this.f1511N = -1;
            this.f1512O = -1;
            this.f1513P = -1;
            this.f1514Q = 0.0f;
            this.f1515R = 0.0f;
            this.f1516S = 0;
            this.f1517T = 0;
            this.f1518U = 1.0f;
            this.f1519V = false;
            this.f1520W = 0.0f;
            this.f1521X = 0.0f;
            this.f1522Y = 0.0f;
            this.f1523Z = 0.0f;
            this.f1525aa = 1.0f;
            this.f1526ab = 1.0f;
            this.f1527ac = Float.NaN;
            this.f1528ad = Float.NaN;
            this.f1529ae = 0.0f;
            this.f1530af = 0.0f;
            this.f1531ag = 0.0f;
            this.f1532ah = false;
            this.f1533ai = false;
            this.f1534aj = 0;
            this.f1535ak = 0;
            this.f1536al = -1;
            this.f1537am = -1;
            this.f1538an = -1;
            this.f1539ao = -1;
            this.f1540ap = 1.0f;
            this.f1541aq = 1.0f;
            this.f1542ar = -1;
            this.f1543as = -1;
        }

        public /* synthetic */ C0297a(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1667a(int i, C0299a aVar) {
            this.f1547d = i;
            this.f1551h = aVar.f630d;
            this.f1552i = aVar.f631e;
            this.f1553j = aVar.f632f;
            this.f1554k = aVar.f633g;
            this.f1555l = aVar.f634h;
            this.f1556m = aVar.f635i;
            this.f1557n = aVar.f636j;
            this.f1558o = aVar.f637k;
            this.f1559p = aVar.f638l;
            this.f1560q = aVar.f642p;
            this.f1561r = aVar.f643q;
            this.f1562s = aVar.f644r;
            this.f1563t = aVar.f645s;
            this.f1564u = aVar.f652z;
            this.f1565v = aVar.f588A;
            this.f1566w = aVar.f589B;
            this.f1567x = aVar.f639m;
            this.f1568y = aVar.f640n;
            this.f1569z = aVar.f641o;
            this.f1498A = aVar.f604Q;
            this.f1499B = aVar.f605R;
            this.f1500C = aVar.f606S;
            this.f1550g = aVar.f629c;
            this.f1548e = aVar.f614a;
            this.f1549f = aVar.f628b;
            this.f1545b = aVar.width;
            this.f1546c = aVar.height;
            this.f1501D = aVar.leftMargin;
            this.f1502E = aVar.rightMargin;
            this.f1503F = aVar.topMargin;
            this.f1504G = aVar.bottomMargin;
            this.f1514Q = aVar.f593F;
            this.f1515R = aVar.f592E;
            this.f1517T = aVar.f595H;
            this.f1516S = aVar.f594G;
            this.f1532ah = aVar.f607T;
            this.f1533ai = aVar.f608U;
            this.f1534aj = aVar.f596I;
            this.f1535ak = aVar.f597J;
            this.f1532ah = aVar.f607T;
            this.f1536al = aVar.f600M;
            this.f1537am = aVar.f601N;
            this.f1538an = aVar.f598K;
            this.f1539ao = aVar.f599L;
            this.f1540ap = aVar.f602O;
            this.f1541aq = aVar.f603P;
            if (VERSION.SDK_INT >= 17) {
                this.f1505H = aVar.getMarginEnd();
                this.f1506I = aVar.getMarginStart();
            }
            this.f1518U = aVar.f1571an;
            this.f1521X = aVar.f1574aq;
            this.f1522Y = aVar.f1575ar;
            this.f1523Z = aVar.f1576as;
            this.f1525aa = aVar.f1577at;
            this.f1526ab = aVar.f1578au;
            this.f1527ac = aVar.f1579av;
            this.f1528ad = aVar.f1580aw;
            this.f1529ae = aVar.f1581ax;
            this.f1530af = aVar.f1582ay;
            this.f1531ag = aVar.f1583az;
            this.f1520W = aVar.f1573ap;
            this.f1519V = aVar.f1572ao;
        }

        /* renamed from: a */
        public final void mo1668a(C0088a aVar) {
            aVar.f630d = this.f1551h;
            aVar.f631e = this.f1552i;
            aVar.f632f = this.f1553j;
            aVar.f633g = this.f1554k;
            aVar.f634h = this.f1555l;
            aVar.f635i = this.f1556m;
            aVar.f636j = this.f1557n;
            aVar.f637k = this.f1558o;
            aVar.f638l = this.f1559p;
            aVar.f642p = this.f1560q;
            aVar.f643q = this.f1561r;
            aVar.f644r = this.f1562s;
            aVar.f645s = this.f1563t;
            aVar.leftMargin = this.f1501D;
            aVar.rightMargin = this.f1502E;
            aVar.topMargin = this.f1503F;
            aVar.bottomMargin = this.f1504G;
            aVar.f650x = this.f1513P;
            aVar.f651y = this.f1512O;
            aVar.f652z = this.f1564u;
            aVar.f588A = this.f1565v;
            aVar.f639m = this.f1567x;
            aVar.f640n = this.f1568y;
            aVar.f641o = this.f1569z;
            aVar.f589B = this.f1566w;
            aVar.f604Q = this.f1498A;
            aVar.f605R = this.f1499B;
            aVar.f593F = this.f1514Q;
            aVar.f592E = this.f1515R;
            aVar.f595H = this.f1517T;
            aVar.f594G = this.f1516S;
            aVar.f607T = this.f1532ah;
            aVar.f608U = this.f1533ai;
            aVar.f596I = this.f1534aj;
            aVar.f597J = this.f1535ak;
            aVar.f600M = this.f1536al;
            aVar.f601N = this.f1537am;
            aVar.f598K = this.f1538an;
            aVar.f599L = this.f1539ao;
            aVar.f602O = this.f1540ap;
            aVar.f603P = this.f1541aq;
            aVar.f606S = this.f1500C;
            aVar.f629c = this.f1550g;
            aVar.f614a = this.f1548e;
            aVar.f628b = this.f1549f;
            aVar.width = this.f1545b;
            aVar.height = this.f1546c;
            if (VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f1506I);
                aVar.setMarginEnd(this.f1505H);
            }
            aVar.mo735a();
        }

        public final /* synthetic */ Object clone() {
            C0297a aVar = new C0297a();
            aVar.f1524a = this.f1524a;
            aVar.f1545b = this.f1545b;
            aVar.f1546c = this.f1546c;
            aVar.f1548e = this.f1548e;
            aVar.f1549f = this.f1549f;
            aVar.f1550g = this.f1550g;
            aVar.f1551h = this.f1551h;
            aVar.f1552i = this.f1552i;
            aVar.f1553j = this.f1553j;
            aVar.f1554k = this.f1554k;
            aVar.f1555l = this.f1555l;
            aVar.f1556m = this.f1556m;
            aVar.f1557n = this.f1557n;
            aVar.f1558o = this.f1558o;
            aVar.f1559p = this.f1559p;
            aVar.f1560q = this.f1560q;
            aVar.f1561r = this.f1561r;
            aVar.f1562s = this.f1562s;
            aVar.f1563t = this.f1563t;
            aVar.f1564u = this.f1564u;
            aVar.f1565v = this.f1565v;
            aVar.f1566w = this.f1566w;
            aVar.f1498A = this.f1498A;
            aVar.f1499B = this.f1499B;
            aVar.f1564u = this.f1564u;
            aVar.f1564u = this.f1564u;
            aVar.f1564u = this.f1564u;
            aVar.f1564u = this.f1564u;
            aVar.f1564u = this.f1564u;
            aVar.f1500C = this.f1500C;
            aVar.f1501D = this.f1501D;
            aVar.f1502E = this.f1502E;
            aVar.f1503F = this.f1503F;
            aVar.f1504G = this.f1504G;
            aVar.f1505H = this.f1505H;
            aVar.f1506I = this.f1506I;
            aVar.f1507J = this.f1507J;
            aVar.f1508K = this.f1508K;
            aVar.f1509L = this.f1509L;
            aVar.f1510M = this.f1510M;
            aVar.f1511N = this.f1511N;
            aVar.f1512O = this.f1512O;
            aVar.f1513P = this.f1513P;
            aVar.f1514Q = this.f1514Q;
            aVar.f1515R = this.f1515R;
            aVar.f1516S = this.f1516S;
            aVar.f1517T = this.f1517T;
            aVar.f1518U = this.f1518U;
            aVar.f1519V = this.f1519V;
            aVar.f1520W = this.f1520W;
            aVar.f1521X = this.f1521X;
            aVar.f1522Y = this.f1522Y;
            aVar.f1523Z = this.f1523Z;
            aVar.f1525aa = this.f1525aa;
            aVar.f1526ab = this.f1526ab;
            aVar.f1527ac = this.f1527ac;
            aVar.f1528ad = this.f1528ad;
            aVar.f1529ae = this.f1529ae;
            aVar.f1530af = this.f1530af;
            aVar.f1531ag = this.f1531ag;
            aVar.f1532ah = this.f1532ah;
            aVar.f1533ai = this.f1533ai;
            aVar.f1534aj = this.f1534aj;
            aVar.f1535ak = this.f1535ak;
            aVar.f1536al = this.f1536al;
            aVar.f1537am = this.f1537am;
            aVar.f1538an = this.f1538an;
            aVar.f1539ao = this.f1539ao;
            aVar.f1540ap = this.f1540ap;
            aVar.f1541aq = this.f1541aq;
            aVar.f1542ar = this.f1542ar;
            aVar.f1543as = this.f1543as;
            if (this.f1544at != null) {
                aVar.f1544at = Arrays.copyOf(this.f1544at, this.f1544at.length);
            }
            aVar.f1567x = this.f1567x;
            aVar.f1568y = this.f1568y;
            aVar.f1569z = this.f1569z;
            return aVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1496c = sparseIntArray;
        sparseIntArray.append(C0002b.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f1496c.append(C0002b.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f1496c.append(C0002b.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f1496c.append(C0002b.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f1496c.append(C0002b.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f1496c.append(C0002b.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f1496c.append(C0002b.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f1496c.append(C0002b.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f1496c.append(C0002b.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f1496c.append(C0002b.ConstraintSet_layout_editor_absoluteX, 6);
        f1496c.append(C0002b.ConstraintSet_layout_editor_absoluteY, 7);
        f1496c.append(C0002b.ConstraintSet_layout_constraintGuide_begin, 17);
        f1496c.append(C0002b.ConstraintSet_layout_constraintGuide_end, 18);
        f1496c.append(C0002b.ConstraintSet_layout_constraintGuide_percent, 19);
        f1496c.append(C0002b.ConstraintSet_android_orientation, 27);
        f1496c.append(C0002b.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f1496c.append(C0002b.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f1496c.append(C0002b.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f1496c.append(C0002b.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f1496c.append(C0002b.ConstraintSet_layout_goneMarginLeft, 13);
        f1496c.append(C0002b.ConstraintSet_layout_goneMarginTop, 16);
        f1496c.append(C0002b.ConstraintSet_layout_goneMarginRight, 14);
        f1496c.append(C0002b.ConstraintSet_layout_goneMarginBottom, 11);
        f1496c.append(C0002b.ConstraintSet_layout_goneMarginStart, 15);
        f1496c.append(C0002b.ConstraintSet_layout_goneMarginEnd, 12);
        f1496c.append(C0002b.ConstraintSet_layout_constraintVertical_weight, 40);
        f1496c.append(C0002b.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f1496c.append(C0002b.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f1496c.append(C0002b.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f1496c.append(C0002b.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f1496c.append(C0002b.ConstraintSet_layout_constraintVertical_bias, 37);
        f1496c.append(C0002b.ConstraintSet_layout_constraintDimensionRatio, 5);
        f1496c.append(C0002b.ConstraintSet_layout_constraintLeft_creator, 64);
        f1496c.append(C0002b.ConstraintSet_layout_constraintTop_creator, 64);
        f1496c.append(C0002b.ConstraintSet_layout_constraintRight_creator, 64);
        f1496c.append(C0002b.ConstraintSet_layout_constraintBottom_creator, 64);
        f1496c.append(C0002b.ConstraintSet_layout_constraintBaseline_creator, 64);
        f1496c.append(C0002b.ConstraintSet_android_layout_marginLeft, 24);
        f1496c.append(C0002b.ConstraintSet_android_layout_marginRight, 28);
        f1496c.append(C0002b.ConstraintSet_android_layout_marginStart, 31);
        f1496c.append(C0002b.ConstraintSet_android_layout_marginEnd, 8);
        f1496c.append(C0002b.ConstraintSet_android_layout_marginTop, 34);
        f1496c.append(C0002b.ConstraintSet_android_layout_marginBottom, 2);
        f1496c.append(C0002b.ConstraintSet_android_layout_width, 23);
        f1496c.append(C0002b.ConstraintSet_android_layout_height, 21);
        f1496c.append(C0002b.ConstraintSet_android_visibility, 22);
        f1496c.append(C0002b.ConstraintSet_android_alpha, 43);
        f1496c.append(C0002b.ConstraintSet_android_elevation, 44);
        f1496c.append(C0002b.ConstraintSet_android_rotationX, 45);
        f1496c.append(C0002b.ConstraintSet_android_rotationY, 46);
        f1496c.append(C0002b.ConstraintSet_android_rotation, 60);
        f1496c.append(C0002b.ConstraintSet_android_scaleX, 47);
        f1496c.append(C0002b.ConstraintSet_android_scaleY, 48);
        f1496c.append(C0002b.ConstraintSet_android_transformPivotX, 49);
        f1496c.append(C0002b.ConstraintSet_android_transformPivotY, 50);
        f1496c.append(C0002b.ConstraintSet_android_translationX, 51);
        f1496c.append(C0002b.ConstraintSet_android_translationY, 52);
        f1496c.append(C0002b.ConstraintSet_android_translationZ, 53);
        f1496c.append(C0002b.ConstraintSet_layout_constraintWidth_default, 54);
        f1496c.append(C0002b.ConstraintSet_layout_constraintHeight_default, 55);
        f1496c.append(C0002b.ConstraintSet_layout_constraintWidth_max, 56);
        f1496c.append(C0002b.ConstraintSet_layout_constraintHeight_max, 57);
        f1496c.append(C0002b.ConstraintSet_layout_constraintWidth_min, 58);
        f1496c.append(C0002b.ConstraintSet_layout_constraintHeight_min, 59);
        f1496c.append(C0002b.ConstraintSet_layout_constraintCircle, 61);
        f1496c.append(C0002b.ConstraintSet_layout_constraintCircleRadius, 62);
        f1496c.append(C0002b.ConstraintSet_layout_constraintCircleAngle, 63);
        f1496c.append(C0002b.ConstraintSet_android_id, 38);
    }

    /* renamed from: a */
    private static int m1030a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    public static void m1031a(C0297a aVar, TypedArray typedArray) {
        String str;
        StringBuilder sb;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f1496c.get(index);
            switch (i2) {
                case 1:
                    aVar.f1559p = m1030a(typedArray, index, aVar.f1559p);
                    break;
                case 2:
                    aVar.f1504G = typedArray.getDimensionPixelSize(index, aVar.f1504G);
                    break;
                case 3:
                    aVar.f1558o = m1030a(typedArray, index, aVar.f1558o);
                    break;
                case 4:
                    aVar.f1557n = m1030a(typedArray, index, aVar.f1557n);
                    break;
                case 5:
                    aVar.f1566w = typedArray.getString(index);
                    break;
                case 6:
                    aVar.f1498A = typedArray.getDimensionPixelOffset(index, aVar.f1498A);
                    break;
                case 7:
                    aVar.f1499B = typedArray.getDimensionPixelOffset(index, aVar.f1499B);
                    break;
                case 8:
                    aVar.f1505H = typedArray.getDimensionPixelSize(index, aVar.f1505H);
                    break;
                case 9:
                    aVar.f1563t = m1030a(typedArray, index, aVar.f1563t);
                    break;
                case 10:
                    aVar.f1562s = m1030a(typedArray, index, aVar.f1562s);
                    break;
                case 11:
                    aVar.f1511N = typedArray.getDimensionPixelSize(index, aVar.f1511N);
                    break;
                case 12:
                    aVar.f1512O = typedArray.getDimensionPixelSize(index, aVar.f1512O);
                    break;
                case 13:
                    aVar.f1508K = typedArray.getDimensionPixelSize(index, aVar.f1508K);
                    break;
                case 14:
                    aVar.f1510M = typedArray.getDimensionPixelSize(index, aVar.f1510M);
                    break;
                case 15:
                    aVar.f1513P = typedArray.getDimensionPixelSize(index, aVar.f1513P);
                    break;
                case 16:
                    aVar.f1509L = typedArray.getDimensionPixelSize(index, aVar.f1509L);
                    break;
                case 17:
                    aVar.f1548e = typedArray.getDimensionPixelOffset(index, aVar.f1548e);
                    break;
                case 18:
                    aVar.f1549f = typedArray.getDimensionPixelOffset(index, aVar.f1549f);
                    break;
                case 19:
                    aVar.f1550g = typedArray.getFloat(index, aVar.f1550g);
                    break;
                case 20:
                    aVar.f1564u = typedArray.getFloat(index, aVar.f1564u);
                    break;
                case 21:
                    aVar.f1546c = typedArray.getLayoutDimension(index, aVar.f1546c);
                    break;
                case 22:
                    aVar.f1507J = typedArray.getInt(index, aVar.f1507J);
                    aVar.f1507J = f1495b[aVar.f1507J];
                    break;
                case 23:
                    aVar.f1545b = typedArray.getLayoutDimension(index, aVar.f1545b);
                    break;
                case 24:
                    aVar.f1501D = typedArray.getDimensionPixelSize(index, aVar.f1501D);
                    break;
                case 25:
                    aVar.f1551h = m1030a(typedArray, index, aVar.f1551h);
                    break;
                case 26:
                    aVar.f1552i = m1030a(typedArray, index, aVar.f1552i);
                    break;
                case 27:
                    aVar.f1500C = typedArray.getInt(index, aVar.f1500C);
                    break;
                case 28:
                    aVar.f1502E = typedArray.getDimensionPixelSize(index, aVar.f1502E);
                    break;
                case 29:
                    aVar.f1553j = m1030a(typedArray, index, aVar.f1553j);
                    break;
                case 30:
                    aVar.f1554k = m1030a(typedArray, index, aVar.f1554k);
                    break;
                case 31:
                    aVar.f1506I = typedArray.getDimensionPixelSize(index, aVar.f1506I);
                    break;
                case 32:
                    aVar.f1560q = m1030a(typedArray, index, aVar.f1560q);
                    break;
                case 33:
                    aVar.f1561r = m1030a(typedArray, index, aVar.f1561r);
                    break;
                case 34:
                    aVar.f1503F = typedArray.getDimensionPixelSize(index, aVar.f1503F);
                    break;
                case 35:
                    aVar.f1556m = m1030a(typedArray, index, aVar.f1556m);
                    break;
                case 36:
                    aVar.f1555l = m1030a(typedArray, index, aVar.f1555l);
                    break;
                case 37:
                    aVar.f1565v = typedArray.getFloat(index, aVar.f1565v);
                    break;
                case 38:
                    aVar.f1547d = typedArray.getResourceId(index, aVar.f1547d);
                    break;
                case 39:
                    aVar.f1515R = typedArray.getFloat(index, aVar.f1515R);
                    break;
                case 40:
                    aVar.f1514Q = typedArray.getFloat(index, aVar.f1514Q);
                    break;
                case 41:
                    aVar.f1516S = typedArray.getInt(index, aVar.f1516S);
                    break;
                case 42:
                    aVar.f1517T = typedArray.getInt(index, aVar.f1517T);
                    break;
                case 43:
                    aVar.f1518U = typedArray.getFloat(index, aVar.f1518U);
                    break;
                case 44:
                    aVar.f1519V = true;
                    aVar.f1520W = typedArray.getDimension(index, aVar.f1520W);
                    break;
                case 45:
                    aVar.f1522Y = typedArray.getFloat(index, aVar.f1522Y);
                    break;
                case 46:
                    aVar.f1523Z = typedArray.getFloat(index, aVar.f1523Z);
                    break;
                case 47:
                    aVar.f1525aa = typedArray.getFloat(index, aVar.f1525aa);
                    break;
                case 48:
                    aVar.f1526ab = typedArray.getFloat(index, aVar.f1526ab);
                    break;
                case 49:
                    aVar.f1527ac = typedArray.getFloat(index, aVar.f1527ac);
                    break;
                case 50:
                    aVar.f1528ad = typedArray.getFloat(index, aVar.f1528ad);
                    break;
                case 51:
                    aVar.f1529ae = typedArray.getDimension(index, aVar.f1529ae);
                    break;
                case 52:
                    aVar.f1530af = typedArray.getDimension(index, aVar.f1530af);
                    break;
                case 53:
                    aVar.f1531ag = typedArray.getDimension(index, aVar.f1531ag);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.f1521X = typedArray.getFloat(index, aVar.f1521X);
                            continue;
                        case 61:
                            aVar.f1567x = m1030a(typedArray, index, aVar.f1567x);
                            continue;
                        case 62:
                            aVar.f1568y = typedArray.getDimensionPixelSize(index, aVar.f1568y);
                            continue;
                        case 63:
                            aVar.f1569z = typedArray.getFloat(index, aVar.f1569z);
                            continue;
                        case 64:
                            str = "ConstraintSet";
                            sb = new StringBuilder("unused attribute 0x");
                            break;
                        default:
                            str = "ConstraintSet";
                            sb = new StringBuilder("Unknown attribute 0x");
                            break;
                    }
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f1496c.get(index));
                    Log.w(str, sb.toString());
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo1666a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1497a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f1497a.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0297a aVar = (C0297a) this.f1497a.get(Integer.valueOf(id));
                if (aVar.f1543as != -1 && aVar.f1543as == 1) {
                    C0294ej ejVar = (C0294ej) childAt;
                    ejVar.setId(id);
                    ejVar.setReferencedIds(aVar.f1544at);
                    ejVar.setType(aVar.f1542ar);
                    aVar.mo1668a(ConstraintLayout.m278a());
                }
                C0088a aVar2 = (C0088a) childAt.getLayoutParams();
                aVar.mo1668a(aVar2);
                childAt.setLayoutParams(aVar2);
                childAt.setVisibility(aVar.f1507J);
                if (VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(aVar.f1518U);
                    childAt.setRotation(aVar.f1521X);
                    childAt.setRotationX(aVar.f1522Y);
                    childAt.setRotationY(aVar.f1523Z);
                    childAt.setScaleX(aVar.f1525aa);
                    childAt.setScaleY(aVar.f1526ab);
                    if (!Float.isNaN(aVar.f1527ac)) {
                        childAt.setPivotX(aVar.f1527ac);
                    }
                    if (!Float.isNaN(aVar.f1528ad)) {
                        childAt.setPivotY(aVar.f1528ad);
                    }
                    childAt.setTranslationX(aVar.f1529ae);
                    childAt.setTranslationY(aVar.f1530af);
                    if (VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(aVar.f1531ag);
                        if (aVar.f1519V) {
                            childAt.setElevation(aVar.f1520W);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0297a aVar3 = (C0297a) this.f1497a.get(num);
            if (aVar3.f1543as != -1 && aVar3.f1543as == 1) {
                C0294ej ejVar2 = new C0294ej(constraintLayout.getContext());
                ejVar2.setId(num.intValue());
                ejVar2.setReferencedIds(aVar3.f1544at);
                ejVar2.setType(aVar3.f1542ar);
                C0088a a = ConstraintLayout.m278a();
                aVar3.mo1668a(a);
                constraintLayout.addView(ejVar2, a);
            }
            if (aVar3.f1524a) {
                C0300en enVar = new C0300en(constraintLayout.getContext());
                enVar.setId(num.intValue());
                C0088a a2 = ConstraintLayout.m278a();
                aVar3.mo1668a(a2);
                constraintLayout.addView(enVar, a2);
            }
        }
    }
}
