package a.h.l;

public class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f904a;

    /* renamed from: b  reason: collision with root package name */
    public int f905b;

    public f(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f904a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // a.h.l.e
    public T b() {
        int i = this.f905b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        Object[] objArr = this.f904a;
        T instance = (T) objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f905b = i - 1;
        return instance;
    }

    @Override // a.h.l.e
    public boolean a(T instance) {
        if (!c(instance)) {
            int i = this.f905b;
            Object[] objArr = this.f904a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = instance;
            this.f905b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public final boolean c(T instance) {
        for (int i = 0; i < this.f905b; i++) {
            if (this.f904a[i] == instance) {
                return true;
            }
        }
        return false;
    }
}
