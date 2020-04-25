package p000;

/* renamed from: nh */
public abstract class C0764nh implements C0778ns {

    /* renamed from: d */
    protected final C0778ns f3271d;

    public C0764nh(C0778ns nsVar) {
        if (nsVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3271d = nsVar;
    }

    /* renamed from: a */
    public long mo2414a(C0758nc ncVar, long j) {
        return this.f3271d.mo2414a(ncVar, j);
    }

    /* renamed from: a */
    public final C0779nt mo2415a() {
        return this.f3271d.mo2415a();
    }

    public void close() {
        this.f3271d.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f3271d.toString());
        sb.append(")");
        return sb.toString();
    }
}
