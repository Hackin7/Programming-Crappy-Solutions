package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: ej */
public final class C0294ej extends C0295ek {

    /* renamed from: f */
    private int f1486f = 0;

    /* renamed from: g */
    private int f1487g = 0;

    /* renamed from: h */
    private C0270du f1488h;

    public C0294ej(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1656a(AttributeSet attributeSet) {
        super.mo1656a(attributeSet);
        this.f1488h = new C0270du();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0002b.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0002b.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0002b.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1488h.f1308b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f1492d = this.f1488h;
        mo1659a();
    }

    public final int getType() {
        return this.f1486f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r5.f1486f == 6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r5.f1486f == 6) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r5.f1486f == 6) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setType(int r6) {
        /*
            r5 = this;
            r5.f1486f = r6
            r5.f1487g = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 6
            r1 = 5
            r2 = 0
            r3 = 1
            r4 = 17
            if (r6 >= r4) goto L_0x001c
            int r6 = r5.f1486f
            if (r6 != r1) goto L_0x0015
        L_0x0012:
            r5.f1487g = r2
            goto L_0x0043
        L_0x0015:
            int r6 = r5.f1486f
            if (r6 != r0) goto L_0x0043
        L_0x0019:
            r5.f1487g = r3
            goto L_0x0043
        L_0x001c:
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            if (r3 != r6) goto L_0x002c
            r6 = r3
            goto L_0x002d
        L_0x002c:
            r6 = r2
        L_0x002d:
            if (r6 == 0) goto L_0x0039
            int r6 = r5.f1486f
            if (r6 != r1) goto L_0x0034
            goto L_0x0019
        L_0x0034:
            int r6 = r5.f1486f
            if (r6 != r0) goto L_0x0043
            goto L_0x0012
        L_0x0039:
            int r6 = r5.f1486f
            if (r6 != r1) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            int r6 = r5.f1486f
            if (r6 != r0) goto L_0x0043
            goto L_0x0019
        L_0x0043:
            du r6 = r5.f1488h
            int r0 = r5.f1487g
            r6.f1306a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0294ej.setType(int):void");
    }
}
