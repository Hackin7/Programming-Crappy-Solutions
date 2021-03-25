package a.m;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public final a f1197a;

    /* renamed from: b  reason: collision with root package name */
    public final r f1198b;

    public interface a {
        <T extends p> T a(Class<T> cls);
    }

    public static abstract class b implements a {
        public abstract <T extends p> T b(String str, Class<T> cls);

        @Override // a.m.q.a
        public <T extends p> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    public q(r store, a factory) {
        this.f1197a = factory;
        this.f1198b = store;
    }

    public <T extends p> T a(Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends p> T b(String key, Class<T> modelClass) {
        T t = (T) this.f1198b.b(key);
        if (modelClass.isInstance(t)) {
            return t;
        }
        a aVar = this.f1197a;
        p viewModel = aVar instanceof b ? (T) ((b) aVar).b(key, modelClass) : (T) aVar.a(modelClass);
        this.f1198b.c(key, viewModel);
        return (T) viewModel;
    }
}
