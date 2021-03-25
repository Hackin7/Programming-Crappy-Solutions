package a.b.m.a;

import a.b.m.a.b;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
public class d extends b {
    public a n;
    public boolean o;

    public boolean isStateful() {
        return true;
    }

    @Override // a.b.m.a.b
    public boolean onStateChange(int[] stateSet) {
        boolean changed = super.onStateChange(stateSet);
        int idx = this.n.A(stateSet);
        if (idx < 0) {
            idx = this.n.A(StateSet.WILD_CARD);
        }
        return g(idx) || changed;
    }

    public int[] k(AttributeSet attrs) {
        int j = 0;
        int numAttrs = attrs.getAttributeCount();
        int[] states = new int[numAttrs];
        for (int i = 0; i < numAttrs; i++) {
            int stateResId = attrs.getAttributeNameResource(i);
            if (!(stateResId == 0 || stateResId == 16842960 || stateResId == 16843161)) {
                int j2 = j + 1;
                states[j] = attrs.getAttributeBooleanValue(i, false) ? stateResId : -stateResId;
                j = j2;
            }
        }
        return StateSet.trimStateSet(states, j);
    }

    @Override // a.b.m.a.b
    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            if (this == this) {
                this.n.r();
                this.o = true;
            }
        }
        return this;
    }

    /* renamed from: j */
    public a b() {
        return new a(this.n, this, null);
    }

    public static class a extends b.c {
        public int[][] J;

        public a(a orig, d owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.J = orig.J;
            } else {
                this.J = new int[f()][];
            }
        }

        @Override // a.b.m.a.b.c
        public void r() {
            int[][] iArr = this.J;
            int[][] stateSets = new int[iArr.length][];
            for (int i = iArr.length - 1; i >= 0; i--) {
                int[][] iArr2 = this.J;
                stateSets[i] = iArr2[i] != null ? (int[]) iArr2[i].clone() : null;
            }
            this.J = stateSets;
        }

        public int z(int[] stateSet, Drawable drawable) {
            int pos = a(drawable);
            this.J[pos] = stateSet;
            return pos;
        }

        public int A(int[] stateSet) {
            int[][] stateSets = this.J;
            int count = h();
            for (int i = 0; i < count; i++) {
                if (StateSet.stateSetMatches(stateSets[i], stateSet)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new d(this, null);
        }

        public Drawable newDrawable(Resources res) {
            return new d(this, res);
        }

        @Override // a.b.m.a.b.c
        public void o(int oldSize, int newSize) {
            super.o(oldSize, newSize);
            int[][] newStateSets = new int[newSize][];
            System.arraycopy(this.J, 0, newStateSets, 0, oldSize);
            this.J = newStateSets;
        }
    }

    @Override // a.b.m.a.b
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // a.b.m.a.b
    public void h(b.c state) {
        super.h(state);
        if (state instanceof a) {
            this.n = (a) state;
        }
    }

    public d(a state, Resources res) {
        h(new a(state, this, res));
        onStateChange(getState());
    }

    public d(a state) {
        if (state != null) {
            h(state);
        }
    }
}
