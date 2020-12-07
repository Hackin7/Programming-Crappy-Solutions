package a.n.a;

import a.e.h;
import a.m.g;
import a.m.l;
import a.m.m;
import a.m.p;
import a.m.q;
import a.m.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1200c = false;

    /* renamed from: a  reason: collision with root package name */
    public final g f1201a;

    /* renamed from: b  reason: collision with root package name */
    public final c f1202b;

    /* renamed from: a.n.a.b$b  reason: collision with other inner class name */
    public static class C0032b<D> implements m<D> {
    }

    public static class a<D> extends l<D> {
        public g j;
        public C0032b<D> k;

        @Override // androidx.lifecycle.LiveData
        public void d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void e() {
            throw null;
        }

        public void j() {
            if (this.j != null) {
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.m.m<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(m<? super D> mVar) {
            super.f(mVar);
            this.j = null;
            this.k = null;
        }

        /* JADX WARN: Incorrect return type in method signature: (Z)Ljava/lang/Object<TD;>; */
        public void h(boolean reset) {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData, a.m.l
        public void g(D value) {
            super.g(value);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            a.h.l.a.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void i(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            writer.print(prefix);
            writer.print("mId=");
            writer.print(0);
            writer.print(" mArgs=");
            writer.println((Object) null);
            writer.print(prefix);
            writer.print("mLoader=");
            writer.println((Object) null);
            String str = prefix + "  ";
            throw null;
        }
    }

    public static class c extends p {

        /* renamed from: c  reason: collision with root package name */
        public static final q.a f1203c = new a();

        /* renamed from: b  reason: collision with root package name */
        public h<a> f1204b = new h<>();

        public static class a implements q.a {
            @Override // a.m.q.a
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        public static c e(r viewModelStore) {
            return (c) new q(viewModelStore, f1203c).a(c.class);
        }

        public void f() {
            int size = this.f1204b.k();
            for (int index = 0; index < size; index++) {
                this.f1204b.l(index).j();
            }
        }

        @Override // a.m.p
        public void c() {
            super.c();
            if (0 >= this.f1204b.k()) {
                this.f1204b.b();
            } else {
                this.f1204b.l(0).h(true);
                throw null;
            }
        }

        public void d(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            if (this.f1204b.k() > 0) {
                writer.print(prefix);
                writer.println("Loaders:");
                String str = prefix + "    ";
                if (0 < this.f1204b.k()) {
                    a info = this.f1204b.l(0);
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(this.f1204b.h(0));
                    writer.print(": ");
                    writer.println(info.toString());
                    info.i(str, fd, writer, args);
                    throw null;
                }
            }
        }
    }

    public b(g lifecycleOwner, r viewModelStore) {
        this.f1201a = lifecycleOwner;
        this.f1202b = c.e(viewModelStore);
    }

    @Override // a.n.a.a
    public void c() {
        this.f1202b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.h.l.a.a(this.f1201a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // a.n.a.a
    @Deprecated
    public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        this.f1202b.d(prefix, fd, writer, args);
    }
}
