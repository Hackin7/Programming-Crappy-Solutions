package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: c */
public abstract class C0177c {

    /* renamed from: c$a */
    public static class C0178a extends MarginLayoutParams {

        /* renamed from: a */
        public int f924a;

        public C0178a() {
            super(-2, -2);
            this.f924a = 0;
            this.f924a = 8388627;
        }

        public C0178a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f924a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126j.ActionBarLayout);
            this.f924a = obtainStyledAttributes.getInt(C0126j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0178a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f924a = 0;
        }

        public C0178a(C0178a aVar) {
            super(aVar);
            this.f924a = 0;
            this.f924a = aVar.f924a;
        }
    }

    @Deprecated
    /* renamed from: c$b */
    public static abstract class C0179b {
        /* renamed from: a */
        public abstract Drawable mo1124a();

        /* renamed from: b */
        public abstract CharSequence mo1125b();

        /* renamed from: c */
        public abstract View mo1126c();

        /* renamed from: d */
        public abstract CharSequence mo1127d();
    }

    /* renamed from: a */
    public abstract int mo1109a();

    /* renamed from: a */
    public C0802u mo1110a(C0803a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo1111a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo1112a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo1113a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo1114a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1115a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo1116b() {
        return null;
    }

    /* renamed from: b */
    public void mo1117b(boolean z) {
    }

    /* renamed from: c */
    public void mo1118c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo1119c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1120d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1121e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1122f() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1123g() {
    }
}
