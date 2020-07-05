package androidx.lifecycle;

public class FullLifecycleObserverAdapter implements C0521im {

    /* renamed from: a */
    private final C0519ik f684a;

    public FullLifecycleObserverAdapter(C0519ik ikVar) {
        this.f684a = ikVar;
    }

    /* renamed from: a */
    public final void mo807a(C0526ip ipVar, C0523a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_START:
            case ON_RESUME:
            case ON_PAUSE:
            case ON_STOP:
            case ON_DESTROY:
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
