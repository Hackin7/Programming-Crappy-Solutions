package androidx.lifecycle;

import a.m.c;
import a.m.d;
import a.m.e;
import a.m.g;
import a.m.k;

public class CompositeGeneratedAdaptersObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f1693a;

    public CompositeGeneratedAdaptersObserver(c[] generatedAdapters) {
        this.f1693a = generatedAdapters;
    }

    @Override // a.m.e
    public void d(g source, d.a event) {
        k logger = new k();
        for (c mGenerated : this.f1693a) {
            mGenerated.a(source, event, false, logger);
        }
        for (c mGenerated2 : this.f1693a) {
            mGenerated2.a(source, event, true, logger);
        }
    }
}
