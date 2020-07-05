package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: bu */
final class C0164bu extends C0160bq {

    /* renamed from: b */
    final SeekBar f868b;

    /* renamed from: c */
    Drawable f869c;

    /* renamed from: d */
    private ColorStateList f870d = null;

    /* renamed from: e */
    private Mode f871e = null;

    /* renamed from: f */
    private boolean f872f = false;

    /* renamed from: g */
    private boolean f873g = false;

    C0164bu(SeekBar seekBar) {
        super(seekBar);
        this.f868b = seekBar;
    }

    /* renamed from: a */
    private void m515a() {
        if (this.f869c == null) {
            return;
        }
        if (this.f872f || this.f873g) {
            this.f869c = C0345fn.m1156d(this.f869c.mutate());
            if (this.f872f) {
                C0345fn.m1147a(this.f869c, this.f870d);
            }
            if (this.f873g) {
                C0345fn.m1150a(this.f869c, this.f871e);
            }
            if (this.f869c.isStateful()) {
                this.f869c.setState(this.f868b.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1015a(AttributeSet attributeSet, int i) {
        super.mo1015a(attributeSet, i);
        C0215cr a = C0215cr.m676a(this.f868b.getContext(), attributeSet, C0126j.AppCompatSeekBar, i, 0);
        Drawable b = a.mo1315b(C0126j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f868b.setThumb(b);
        }
        Drawable a2 = a.mo1312a(C0126j.AppCompatSeekBar_tickMark);
        if (this.f869c != null) {
            this.f869c.setCallback(null);
        }
        this.f869c = a2;
        if (a2 != null) {
            a2.setCallback(this.f868b);
            C0345fn.m1154b(a2, C0396gq.m1264b(this.f868b));
            if (a2.isStateful()) {
                a2.setState(this.f868b.getDrawableState());
            }
            m515a();
        }
        this.f868b.invalidate();
        if (a.mo1323f(C0126j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f871e = C0181cb.m605a(a.mo1311a(C0126j.AppCompatSeekBar_tickMarkTintMode, -1), this.f871e);
            this.f873g = true;
        }
        if (a.mo1323f(C0126j.AppCompatSeekBar_tickMarkTint)) {
            this.f870d = a.mo1321e(C0126j.AppCompatSeekBar_tickMarkTint);
            this.f872f = true;
        }
        a.f1087b.recycle();
        m515a();
    }
}
