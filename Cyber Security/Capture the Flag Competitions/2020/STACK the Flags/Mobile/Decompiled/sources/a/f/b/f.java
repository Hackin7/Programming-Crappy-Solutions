package a.f.b;

public class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f583a;

    /* renamed from: b  reason: collision with root package name */
    public int f584b;

    public f(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f583a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f584b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        Object[] objArr = this.f583a;
        T instance = (T) objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f584b = i - 1;
        return instance;
    }

    public boolean b(T instance) {
        int i = this.f584b;
        Object[] objArr = this.f583a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.f584b = i + 1;
        return true;
    }

    public void c(T[] variables, int count) {
        if (count > variables.length) {
            count = variables.length;
        }
        for (int i = 0; i < count; i++) {
            T instance = variables[i];
            int i2 = this.f584b;
            Object[] objArr = this.f583a;
            if (i2 < objArr.length) {
                objArr[i2] = instance;
                this.f584b = i2 + 1;
            }
        }
    }
}
