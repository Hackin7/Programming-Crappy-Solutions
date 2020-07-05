package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout.C0088a;

/* renamed from: em */
public final class C0298em extends ViewGroup {

    /* renamed from: a */
    C0296el f1570a;

    /* renamed from: em$a */
    public static class C0299a extends C0088a {

        /* renamed from: an */
        public float f1571an;

        /* renamed from: ao */
        public boolean f1572ao;

        /* renamed from: ap */
        public float f1573ap;

        /* renamed from: aq */
        public float f1574aq;

        /* renamed from: ar */
        public float f1575ar;

        /* renamed from: as */
        public float f1576as;

        /* renamed from: at */
        public float f1577at;

        /* renamed from: au */
        public float f1578au;

        /* renamed from: av */
        public float f1579av;

        /* renamed from: aw */
        public float f1580aw;

        /* renamed from: ax */
        public float f1581ax;

        /* renamed from: ay */
        public float f1582ay;

        /* renamed from: az */
        public float f1583az;

        public C0299a() {
            this.f1571an = 1.0f;
            this.f1572ao = false;
            this.f1573ap = 0.0f;
            this.f1574aq = 0.0f;
            this.f1575ar = 0.0f;
            this.f1576as = 0.0f;
            this.f1577at = 1.0f;
            this.f1578au = 1.0f;
            this.f1579av = 0.0f;
            this.f1580aw = 0.0f;
            this.f1581ax = 0.0f;
            this.f1582ay = 0.0f;
            this.f1583az = 0.0f;
        }

        public C0299a(Context context, AttributeSet attributeSet) {
            float f;
            super(context, attributeSet);
            this.f1571an = 1.0f;
            this.f1572ao = false;
            this.f1573ap = 0.0f;
            this.f1574aq = 0.0f;
            this.f1575ar = 0.0f;
            this.f1576as = 0.0f;
            this.f1577at = 1.0f;
            this.f1578au = 1.0f;
            this.f1579av = 0.0f;
            this.f1580aw = 0.0f;
            this.f1581ax = 0.0f;
            this.f1582ay = 0.0f;
            this.f1583az = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0002b.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0002b.ConstraintSet_android_alpha) {
                    this.f1571an = obtainStyledAttributes.getFloat(index, this.f1571an);
                } else if (index == C0002b.ConstraintSet_android_elevation) {
                    this.f1573ap = obtainStyledAttributes.getFloat(index, this.f1573ap);
                    this.f1572ao = true;
                } else if (index == C0002b.ConstraintSet_android_rotationX) {
                    this.f1575ar = obtainStyledAttributes.getFloat(index, this.f1575ar);
                } else if (index == C0002b.ConstraintSet_android_rotationY) {
                    this.f1576as = obtainStyledAttributes.getFloat(index, this.f1576as);
                } else if (index == C0002b.ConstraintSet_android_rotation) {
                    this.f1574aq = obtainStyledAttributes.getFloat(index, this.f1574aq);
                } else if (index == C0002b.ConstraintSet_android_scaleX) {
                    this.f1577at = obtainStyledAttributes.getFloat(index, this.f1577at);
                } else if (index == C0002b.ConstraintSet_android_scaleY) {
                    this.f1578au = obtainStyledAttributes.getFloat(index, this.f1578au);
                } else if (index == C0002b.ConstraintSet_android_transformPivotX) {
                    this.f1579av = obtainStyledAttributes.getFloat(index, this.f1579av);
                } else if (index == C0002b.ConstraintSet_android_transformPivotY) {
                    this.f1580aw = obtainStyledAttributes.getFloat(index, this.f1580aw);
                } else {
                    if (index == C0002b.ConstraintSet_android_translationX) {
                        f = this.f1581ax;
                    } else if (index == C0002b.ConstraintSet_android_translationY) {
                        this.f1582ay = obtainStyledAttributes.getFloat(index, this.f1582ay);
                    } else if (index == C0002b.ConstraintSet_android_translationZ) {
                        f = this.f1583az;
                    }
                    this.f1581ax = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0299a();
    }

    public final /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0299a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0088a(layoutParams);
    }

    public final C0296el getConstraintSet() {
        if (this.f1570a == null) {
            this.f1570a = new C0296el();
        }
        C0296el elVar = this.f1570a;
        int childCount = getChildCount();
        elVar.f1497a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0299a aVar = (C0299a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!elVar.f1497a.containsKey(Integer.valueOf(id))) {
                elVar.f1497a.put(Integer.valueOf(id), new C0297a(0));
            }
            C0297a aVar2 = (C0297a) elVar.f1497a.get(Integer.valueOf(id));
            if (childAt instanceof C0295ek) {
                C0295ek ekVar = (C0295ek) childAt;
                aVar2.mo1667a(id, aVar);
                if (ekVar instanceof C0294ej) {
                    aVar2.f1543as = 1;
                    C0294ej ejVar = (C0294ej) ekVar;
                    aVar2.f1542ar = ejVar.getType();
                    aVar2.f1544at = ejVar.getReferencedIds();
                }
            }
            aVar2.mo1667a(id, aVar);
        }
        return this.f1570a;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
