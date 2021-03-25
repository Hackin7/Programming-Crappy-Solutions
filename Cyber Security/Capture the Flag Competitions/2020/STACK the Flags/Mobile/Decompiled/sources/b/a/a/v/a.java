package b.a.a.v;

public enum a {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: b  reason: collision with root package name */
    public final String f2248b;

    /* access modifiers changed from: public */
    a(String extension) {
        this.f2248b = extension;
    }

    public String a() {
        return ".temp" + this.f2248b;
    }

    public String toString() {
        return this.f2248b;
    }
}
