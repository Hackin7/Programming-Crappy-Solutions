package p000;

import java.util.Arrays;

/* renamed from: eb */
public class C0285eb extends C0278dy {

    /* renamed from: al */
    protected C0278dy[] f1456al = new C0278dy[4];

    /* renamed from: am */
    protected int f1457am = 0;

    /* renamed from: A */
    public final void mo1634A() {
        this.f1457am = 0;
    }

    /* renamed from: a */
    public final void mo1635a(C0278dy dyVar) {
        if (this.f1457am + 1 > this.f1456al.length) {
            this.f1456al = (C0278dy[]) Arrays.copyOf(this.f1456al, this.f1456al.length * 2);
        }
        this.f1456al[this.f1457am] = dyVar;
        this.f1457am++;
    }
}
