package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: s */
class C0799s extends C0794q {

    /* renamed from: c */
    private C0800a f3387c;

    /* renamed from: d */
    private boolean f3388d;

    /* renamed from: s$a */
    static class C0800a extends C0797b {

        /* renamed from: L */
        int[][] f3389L;

        C0800a(C0800a aVar, C0799s sVar, Resources resources) {
            super(aVar, sVar, resources);
            this.f3389L = aVar != null ? aVar.f3389L : new int[this.f3368i.length][];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2750a() {
            int[][] iArr = new int[this.f3389L.length][];
            for (int length = this.f3389L.length - 1; length >= 0; length--) {
                iArr[length] = this.f3389L[length] != null ? (int[]) this.f3389L[length].clone() : null;
            }
            this.f3389L = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo2802b(int[] iArr) {
            int[][] iArr2 = this.f3389L;
            int i = this.f3369j;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: b */
        public final void mo2769b(int i, int i2) {
            super.mo2769b(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f3389L, 0, iArr, 0, i);
            this.f3389L = iArr;
        }

        public Drawable newDrawable() {
            return new C0799s(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0799s(this, resources);
        }
    }

    C0799s() {
        this(null, null);
    }

    C0799s(byte b) {
    }

    C0799s(C0800a aVar, Resources resources) {
        mo2710a(new C0800a(aVar, this, resources));
        onStateChange(getState());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0800a mo2712b() {
        return new C0800a(this.f3387c, this, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2710a(C0797b bVar) {
        super.mo2710a(bVar);
        if (bVar instanceof C0800a) {
            this.f3387c = (C0800a) bVar;
        }
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f3388d && super.mutate() == this) {
            this.f3387c.mo2750a();
            this.f3388d = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f3387c.mo2802b(iArr);
        if (b < 0) {
            b = this.f3387c.mo2802b(StateSet.WILD_CARD);
        }
        return mo2757a(b) || onStateChange;
    }
}
