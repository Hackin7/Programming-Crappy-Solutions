package p000;

/* renamed from: ng */
public abstract class C0763ng implements C0777nr {

    /* renamed from: a */
    private final C0777nr f3270a;

    public C0763ng(C0777nr nrVar) {
        if (nrVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3270a = nrVar;
    }

    /* renamed from: a */
    public final C0779nt mo2465a() {
        return this.f3270a.mo2465a();
    }

    /* renamed from: a_ */
    public void mo2450a_(C0758nc ncVar, long j) {
        this.f3270a.mo2450a_(ncVar, j);
    }

    public void close() {
        this.f3270a.close();
    }

    public void flush() {
        this.f3270a.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f3270a.toString());
        sb.append(")");
        return sb.toString();
    }
}
