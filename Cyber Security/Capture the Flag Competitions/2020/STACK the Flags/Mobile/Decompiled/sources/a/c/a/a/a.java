package a.c.a.a;

import java.util.concurrent.Executor;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f479c;

    /* renamed from: a  reason: collision with root package name */
    public c f480a;

    /* renamed from: b  reason: collision with root package name */
    public c f481b;

    static {
        new ExecutorC0008a();
        new b();
    }

    /* renamed from: a.c.a.a.a$a  reason: collision with other inner class name */
    public static class ExecutorC0008a implements Executor {
        public void execute(Runnable command) {
            a.d().c(command);
        }
    }

    public static class b implements Executor {
        public void execute(Runnable command) {
            a.d().a(command);
        }
    }

    public a() {
        b bVar = new b();
        this.f481b = bVar;
        this.f480a = bVar;
    }

    public static a d() {
        if (f479c != null) {
            return f479c;
        }
        synchronized (a.class) {
            if (f479c == null) {
                f479c = new a();
            }
        }
        return f479c;
    }

    @Override // a.c.a.a.c
    public void a(Runnable runnable) {
        this.f480a.a(runnable);
    }

    @Override // a.c.a.a.c
    public void c(Runnable runnable) {
        this.f480a.c(runnable);
    }

    @Override // a.c.a.a.c
    public boolean b() {
        return this.f480a.b();
    }
}
