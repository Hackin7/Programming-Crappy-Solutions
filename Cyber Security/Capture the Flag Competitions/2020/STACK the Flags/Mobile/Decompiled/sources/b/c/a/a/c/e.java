package b.c.a.a.c;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import b.c.a.a.j.f;
import b.c.a.a.j.g;
import java.util.ArrayList;
import java.util.List;

public class e extends b {
    public List<b.c.a.a.j.b> A = new ArrayList(16);
    public List<Boolean> B = new ArrayList(16);
    public List<b.c.a.a.j.b> C = new ArrayList(16);

    /* renamed from: g  reason: collision with root package name */
    public f[] f2398g = new f[0];
    public boolean h = false;
    public c i = c.LEFT;
    public EnumC0051e j = EnumC0051e.BOTTOM;
    public d k = d.HORIZONTAL;
    public boolean l = false;
    public a m = a.LEFT_TO_RIGHT;
    public b n = b.SQUARE;
    public float o = 8.0f;
    public float p = 3.0f;
    public DashPathEffect q = null;
    public float r = 6.0f;
    public float s = 0.0f;
    public float t = 5.0f;
    public float u = 3.0f;
    public float v = 0.95f;
    public float w = 0.0f;
    public float x = 0.0f;
    public float y = 0.0f;
    public boolean z = false;

    public enum a {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum b {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum c {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum d {
        HORIZONTAL,
        VERTICAL
    }

    /* renamed from: b.c.a.a.c.e$e  reason: collision with other inner class name */
    public enum EnumC0051e {
        TOP,
        CENTER,
        BOTTOM
    }

    public e() {
        this.f2395e = f.e(10.0f);
        this.f2392b = f.e(5.0f);
        this.f2393c = f.e(3.0f);
    }

    public void E(List<f> list) {
        this.f2398g = (f[]) list.toArray(new f[list.size()]);
    }

    public f[] m() {
        return this.f2398g;
    }

    public float w(Paint p2) {
        float max = 0.0f;
        float maxFormSize = 0.0f;
        float formToTextSpace = f.e(this.t);
        f[] fVarArr = this.f2398g;
        for (f entry : fVarArr) {
            float formSize = f.e(Float.isNaN(entry.f2421c) ? this.o : entry.f2421c);
            if (formSize > maxFormSize) {
                maxFormSize = formSize;
            }
            String label = entry.f2419a;
            if (label != null) {
                float length = (float) f.d(p2, label);
                if (length > max) {
                    max = length;
                }
            }
        }
        return max + maxFormSize + formToTextSpace;
    }

    public float v(Paint p2) {
        float max = 0.0f;
        for (f entry : this.f2398g) {
            String label = entry.f2419a;
            if (label != null) {
                float length = (float) f.a(p2, label);
                if (length > max) {
                    max = length;
                }
            }
        }
        return max;
    }

    public f[] n() {
        return null;
    }

    public boolean D() {
        return this.h;
    }

    public c t() {
        return this.i;
    }

    public EnumC0051e z() {
        return this.j;
    }

    public d x() {
        return this.k;
    }

    public boolean C() {
        return this.l;
    }

    public a l() {
        return this.m;
    }

    public b o() {
        return this.n;
    }

    public float r() {
        return this.o;
    }

    public float q() {
        return this.p;
    }

    public DashPathEffect p() {
        return this.q;
    }

    public float A() {
        return this.r;
    }

    public float B() {
        return this.s;
    }

    public float s() {
        return this.t;
    }

    public float y() {
        return this.u;
    }

    public float u() {
        return this.v;
    }

    public List<b.c.a.a.j.b> j() {
        return this.A;
    }

    public List<Boolean> i() {
        return this.B;
    }

    public List<b.c.a.a.j.b> k() {
        return this.C;
    }

    /* JADX INFO: Multiple debug info for r6v4 b.c.a.a.c.f: [D('yEntrySpace' float), D('e' b.c.a.a.c.f)] */
    /* JADX INFO: Multiple debug info for r11v6 java.lang.String: [D('label' java.lang.String), D('maxLineWidth' float)] */
    /* JADX INFO: Multiple debug info for r14v7 java.lang.String: [D('label' java.lang.String), D('width' float)] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0200  */
    public void h(Paint labelpaint, g viewPortHandler) {
        int i2;
        float formSize;
        float requiredWidth;
        float labelLineHeight;
        float maxLineWidth;
        float labelLineHeight2;
        float stackSpace;
        float maxLineWidth2;
        float maxLineWidth3;
        float formSize2;
        float width;
        float width2;
        Paint paint = labelpaint;
        float defaultFormSize = f.e(this.o);
        float maxLineWidth4 = f.e(this.u);
        float formToTextSpace = f.e(this.t);
        float xEntrySpace = f.e(this.r);
        float labelLineHeight3 = f.e(this.s);
        boolean wordWrapEnabled = this.z;
        f[] entries = this.f2398g;
        int entryCount = entries.length;
        w(labelpaint);
        this.y = v(labelpaint);
        int ordinal = this.k.ordinal();
        if (ordinal == 0) {
            float labelLineHeight4 = f.k(labelpaint);
            float labelLineSpacing = f.m(labelpaint) + labelLineHeight3;
            float contentWidth = viewPortHandler.e() * this.v;
            float maxLineWidth5 = 0.0f;
            float currentLineWidth = 0.0f;
            float requiredWidth2 = 0.0f;
            int stackedStartIndex = -1;
            this.B.clear();
            this.A.clear();
            this.C.clear();
            int i3 = 0;
            while (i3 < entryCount) {
                f e2 = entries[i3];
                boolean drawingForm = e2.f2420b != b.NONE;
                if (Float.isNaN(e2.f2421c)) {
                    formSize = defaultFormSize;
                } else {
                    formSize = f.e(e2.f2421c);
                }
                String label = e2.f2419a;
                this.B.add(false);
                if (stackedStartIndex == -1) {
                    requiredWidth = 0.0f;
                } else {
                    requiredWidth = requiredWidth2 + maxLineWidth4;
                }
                if (label != null) {
                    this.A.add(f.b(paint, label));
                    requiredWidth2 = requiredWidth + (drawingForm ? formToTextSpace + formSize : 0.0f) + this.A.get(i3).f2508c;
                } else {
                    this.A.add(b.c.a.a.j.b.b(0.0f, 0.0f));
                    float requiredWidth3 = requiredWidth + (drawingForm ? formSize : 0.0f);
                    if (stackedStartIndex == -1) {
                        stackedStartIndex = i3;
                        requiredWidth2 = requiredWidth3;
                    } else {
                        requiredWidth2 = requiredWidth3;
                    }
                }
                if (label != null || i3 == entryCount - 1) {
                    float requiredSpacing = currentLineWidth == 0.0f ? 0.0f : xEntrySpace;
                    if (!wordWrapEnabled || currentLineWidth == 0.0f) {
                        maxLineWidth3 = maxLineWidth5;
                        labelLineHeight2 = labelLineHeight4;
                        labelLineHeight = maxLineWidth4;
                        maxLineWidth = formToTextSpace;
                    } else if (contentWidth - currentLineWidth >= requiredSpacing + requiredWidth2) {
                        maxLineWidth3 = maxLineWidth5;
                        labelLineHeight2 = labelLineHeight4;
                        labelLineHeight = maxLineWidth4;
                        maxLineWidth = formToTextSpace;
                    } else {
                        labelLineHeight2 = labelLineHeight4;
                        labelLineHeight = maxLineWidth4;
                        this.C.add(b.c.a.a.j.b.b(currentLineWidth, labelLineHeight2));
                        float maxLineWidth6 = Math.max(maxLineWidth5, currentLineWidth);
                        maxLineWidth = formToTextSpace;
                        this.B.set(stackedStartIndex > -1 ? stackedStartIndex : i3, true);
                        maxLineWidth2 = requiredWidth2;
                        stackSpace = maxLineWidth6;
                        if (i3 != entryCount - 1) {
                            this.C.add(b.c.a.a.j.b.b(maxLineWidth2, labelLineHeight2));
                            stackSpace = Math.max(stackSpace, maxLineWidth2);
                            currentLineWidth = maxLineWidth2;
                        } else {
                            currentLineWidth = maxLineWidth2;
                        }
                    }
                    stackSpace = maxLineWidth3;
                    maxLineWidth2 = requiredSpacing + requiredWidth2 + currentLineWidth;
                    if (i3 != entryCount - 1) {
                    }
                } else {
                    labelLineHeight2 = labelLineHeight4;
                    labelLineHeight = maxLineWidth4;
                    stackSpace = maxLineWidth5;
                    maxLineWidth = formToTextSpace;
                }
                stackedStartIndex = label != null ? -1 : stackedStartIndex;
                i3++;
                paint = labelpaint;
                maxLineWidth5 = stackSpace;
                labelLineHeight4 = labelLineHeight2;
                labelLineHeight3 = labelLineHeight3;
                entries = entries;
                labelLineSpacing = labelLineSpacing;
                formToTextSpace = maxLineWidth;
                maxLineWidth4 = labelLineHeight;
            }
            this.w = maxLineWidth5;
            float size = ((float) this.C.size()) * labelLineHeight4;
            if (this.C.size() == 0) {
                i2 = 0;
            } else {
                i2 = this.C.size() - 1;
            }
            this.x = size + (labelLineSpacing * ((float) i2));
        } else if (ordinal == 1) {
            float maxWidth = 0.0f;
            float maxHeight = 0.0f;
            float width3 = 0.0f;
            float labelLineHeight5 = f.k(labelpaint);
            boolean wasStacked = false;
            int i4 = 0;
            while (i4 < entryCount) {
                f e3 = entries[i4];
                boolean drawingForm2 = e3.f2420b != b.NONE;
                if (Float.isNaN(e3.f2421c)) {
                    formSize2 = defaultFormSize;
                } else {
                    formSize2 = f.e(e3.f2421c);
                }
                float width4 = width3;
                String label2 = e3.f2419a;
                if (!wasStacked) {
                    width4 = 0.0f;
                }
                if (drawingForm2) {
                    if (wasStacked) {
                        width4 += maxLineWidth4;
                    }
                    width = width4 + formSize2;
                } else {
                    width = width4;
                }
                if (label2 != null) {
                    if (drawingForm2 && !wasStacked) {
                        width += formToTextSpace;
                    } else if (wasStacked) {
                        maxWidth = Math.max(maxWidth, width);
                        maxHeight += labelLineHeight5 + labelLineHeight3;
                        width = 0.0f;
                        wasStacked = false;
                    }
                    width2 = width + ((float) f.d(paint, label2));
                    if (i4 < entryCount - 1) {
                        maxHeight += labelLineHeight5 + labelLineHeight3;
                    }
                } else {
                    width2 = width + formSize2;
                    wasStacked = true;
                    if (i4 < entryCount - 1) {
                        width2 += maxLineWidth4;
                    }
                }
                maxWidth = Math.max(maxWidth, width2);
                i4++;
                width3 = width2;
                defaultFormSize = defaultFormSize;
                xEntrySpace = xEntrySpace;
            }
            this.w = maxWidth;
            this.x = maxHeight;
        }
        this.x += this.f2393c;
        this.w += this.f2392b;
    }
}
