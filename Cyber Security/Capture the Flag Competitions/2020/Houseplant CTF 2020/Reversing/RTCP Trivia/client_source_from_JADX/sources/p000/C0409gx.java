package p000;

/* renamed from: gx */
public final class C0409gx {

    /* renamed from: a */
    public final Object f1758a;

    public C0409gx(Object obj) {
        this.f1758a = obj;
    }

    /* renamed from: a */
    static C0409gx m1305a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0409gx(obj);
    }

    /* renamed from: a */
    static Object m1306a(C0409gx gxVar) {
        if (gxVar == null) {
            return null;
        }
        return gxVar.f1758a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0409gx gxVar = (C0409gx) obj;
        return this.f1758a == null ? gxVar.f1758a == null : this.f1758a.equals(gxVar.f1758a);
    }

    public final int hashCode() {
        if (this.f1758a == null) {
            return 0;
        }
        return this.f1758a.hashCode();
    }
}
