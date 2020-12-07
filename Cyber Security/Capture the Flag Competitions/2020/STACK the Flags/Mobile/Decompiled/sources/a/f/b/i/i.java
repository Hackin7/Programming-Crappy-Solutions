package a.f.b.i;

import a.f.b.i.m.o;
import java.util.ArrayList;
import java.util.Arrays;

public class i extends e implements h {
    public e[] q0 = new e[4];
    public int r0 = 0;

    @Override // a.f.b.i.h
    public void a(f container) {
    }

    public void Y0(e widget) {
        if (widget != this && widget != null) {
            int i = this.r0 + 1;
            e[] eVarArr = this.q0;
            if (i > eVarArr.length) {
                this.q0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.q0;
            int i2 = this.r0;
            eVarArr2[i2] = widget;
            this.r0 = i2 + 1;
        }
    }

    public void b1() {
        this.r0 = 0;
        Arrays.fill(this.q0, (Object) null);
    }

    public void Z0(ArrayList<o> arrayList, int orientation, o group) {
        for (int i = 0; i < this.r0; i++) {
            group.a(this.q0[i]);
        }
        for (int i2 = 0; i2 < this.r0; i2++) {
            a.f.b.i.m.i.a(this.q0[i2], orientation, arrayList, group);
        }
    }

    public int a1(int orientation) {
        int i;
        int i2;
        for (int i3 = 0; i3 < this.r0; i3++) {
            e widget = this.q0[i3];
            if (orientation == 0 && (i2 = widget.n0) != -1) {
                return i2;
            }
            if (orientation == 1 && (i = widget.o0) != -1) {
                return i;
            }
        }
        return -1;
    }
}
