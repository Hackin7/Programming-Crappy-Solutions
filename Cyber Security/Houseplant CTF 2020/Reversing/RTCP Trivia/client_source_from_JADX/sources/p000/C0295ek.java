package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0088a;
import java.util.Arrays;

/* renamed from: ek */
public abstract class C0295ek extends View {

    /* renamed from: a */
    protected int[] f1489a = new int[32];

    /* renamed from: b */
    protected int f1490b = 0;

    /* renamed from: c */
    protected Context f1491c;

    /* renamed from: d */
    protected C0285eb f1492d = null;

    /* renamed from: e */
    protected boolean f1493e = false;

    /* renamed from: f */
    private String f1494f;

    public C0295ek(Context context) {
        super(context);
        this.f1491c = context;
        mo1656a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m1026a(String str) {
        Object obj;
        if (str != null && this.f1491c != null) {
            String trim = str.trim();
            int i = 0;
            try {
                i = C0001a.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
            if (i == 0) {
                i = this.f1491c.getResources().getIdentifier(trim, "id", this.f1491c.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
                if (trim instanceof String) {
                    String str2 = trim;
                    if (constraintLayout.f570c != null && constraintLayout.f570c.containsKey(str2)) {
                        obj = constraintLayout.f570c.get(str2);
                        if (obj != null && (obj instanceof Integer)) {
                            i = ((Integer) obj).intValue();
                        }
                    }
                }
                obj = null;
                i = ((Integer) obj).intValue();
            }
            if (i != 0) {
                setTag(i, null);
                return;
            }
            StringBuilder sb = new StringBuilder("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
            Log.w("ConstraintHelper", sb.toString());
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1026a(str.substring(i));
                    return;
                } else {
                    m1026a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1659a() {
        if (this.f1492d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0088a) {
                ((C0088a) layoutParams).f626al = this.f1492d;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1656a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0002b.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0002b.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f1494f = obtainStyledAttributes.getString(index);
                    setIds(this.f1494f);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1660a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1494f);
        }
        if (this.f1492d != null) {
            this.f1492d.mo1634A();
            for (int i = 0; i < this.f1490b; i++) {
                View findViewById = constraintLayout.findViewById(this.f1489a[i]);
                if (findViewById != null) {
                    this.f1492d.mo1635a(constraintLayout.mo709a(findViewById));
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1489a, this.f1490b);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1493e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1490b = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    public void setTag(int i, Object obj) {
        if (this.f1490b + 1 > this.f1489a.length) {
            this.f1489a = Arrays.copyOf(this.f1489a, this.f1489a.length * 2);
        }
        this.f1489a[this.f1490b] = i;
        this.f1490b++;
    }
}
