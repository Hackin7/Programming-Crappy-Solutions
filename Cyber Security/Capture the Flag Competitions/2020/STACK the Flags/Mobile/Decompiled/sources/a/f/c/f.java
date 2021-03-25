package a.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class f extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public e f754b;

    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    public static class a extends ConstraintLayout.a {
        public float n0 = 1.0f;
        public boolean o0 = false;
        public float p0 = 0.0f;
        public float q0 = 0.0f;
        public float r0 = 0.0f;
        public float s0 = 0.0f;
        public float t0 = 1.0f;
        public float u0 = 1.0f;
        public float v0 = 0.0f;
        public float w0 = 0.0f;
        public float x0 = 0.0f;
        public float y0 = 0.0f;
        public float z0 = 0.0f;

        public a(int width, int height) {
            super(width, height);
        }

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            TypedArray a2 = c2.obtainStyledAttributes(attrs, k.ConstraintSet);
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                if (attr == k.ConstraintSet_android_alpha) {
                    this.n0 = a2.getFloat(attr, this.n0);
                } else if (attr == k.ConstraintSet_android_elevation) {
                    this.p0 = a2.getFloat(attr, this.p0);
                    this.o0 = true;
                } else if (attr == k.ConstraintSet_android_rotationX) {
                    this.r0 = a2.getFloat(attr, this.r0);
                } else if (attr == k.ConstraintSet_android_rotationY) {
                    this.s0 = a2.getFloat(attr, this.s0);
                } else if (attr == k.ConstraintSet_android_rotation) {
                    this.q0 = a2.getFloat(attr, this.q0);
                } else if (attr == k.ConstraintSet_android_scaleX) {
                    this.t0 = a2.getFloat(attr, this.t0);
                } else if (attr == k.ConstraintSet_android_scaleY) {
                    this.u0 = a2.getFloat(attr, this.u0);
                } else if (attr == k.ConstraintSet_android_transformPivotX) {
                    this.v0 = a2.getFloat(attr, this.v0);
                } else if (attr == k.ConstraintSet_android_transformPivotY) {
                    this.w0 = a2.getFloat(attr, this.w0);
                } else if (attr == k.ConstraintSet_android_translationX) {
                    this.x0 = a2.getFloat(attr, this.x0);
                } else if (attr == k.ConstraintSet_android_translationY) {
                    this.y0 = a2.getFloat(attr, this.y0);
                } else if (attr == k.ConstraintSet_android_translationZ) {
                    this.z0 = a2.getFloat(attr, this.z0);
                }
            }
            a2.recycle();
        }
    }

    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ConstraintLayout.a(p);
    }

    public e getConstraintSet() {
        if (this.f754b == null) {
            this.f754b = new e();
        }
        this.f754b.f(this);
        return this.f754b;
    }

    public void onLayout(boolean changed, int l, int t, int r, int b2) {
    }
}
