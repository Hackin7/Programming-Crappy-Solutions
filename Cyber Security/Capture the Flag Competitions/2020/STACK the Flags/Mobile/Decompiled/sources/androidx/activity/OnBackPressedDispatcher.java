package androidx.activity;

import a.a.b;
import a.m.d;
import a.m.e;
import a.m.g;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1489a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f1490b = new ArrayDeque<>();

    public OnBackPressedDispatcher(Runnable fallbackOnBackPressed) {
        this.f1489a = fallbackOnBackPressed;
    }

    public a.a.a b(b onBackPressedCallback) {
        this.f1490b.add(onBackPressedCallback);
        a cancellable = new a(onBackPressedCallback);
        onBackPressedCallback.a(cancellable);
        return cancellable;
    }

    public void a(g owner, b onBackPressedCallback) {
        d lifecycle = owner.getLifecycle();
        if (lifecycle.b() != d.b.DESTROYED) {
            onBackPressedCallback.a(new LifecycleOnBackPressedCancellable(lifecycle, onBackPressedCallback));
        }
    }

    public void c() {
        Iterator<OnBackPressedCallback> iterator = this.f1490b.descendingIterator();
        while (iterator.hasNext()) {
            b callback = (b) iterator.next();
            if (callback.c()) {
                callback.b();
                return;
            }
        }
        Runnable runnable = this.f1489a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public class a implements a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f1495a;

        public a(b onBackPressedCallback) {
            this.f1495a = onBackPressedCallback;
        }

        @Override // a.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.f1490b.remove(this.f1495a);
            this.f1495a.e(this);
        }
    }

    public class LifecycleOnBackPressedCancellable implements e, a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final d f1491a;

        /* renamed from: b  reason: collision with root package name */
        public final b f1492b;

        /* renamed from: c  reason: collision with root package name */
        public a.a.a f1493c;

        public LifecycleOnBackPressedCancellable(d lifecycle, b onBackPressedCallback) {
            this.f1491a = lifecycle;
            this.f1492b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // a.m.e
        public void d(g source, d.a event) {
            if (event == d.a.ON_START) {
                this.f1493c = OnBackPressedDispatcher.this.b(this.f1492b);
            } else if (event == d.a.ON_STOP) {
                a.a.a aVar = this.f1493c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (event == d.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // a.a.a
        public void cancel() {
            this.f1491a.c(this);
            this.f1492b.e(this);
            a.a.a aVar = this.f1493c;
            if (aVar != null) {
                aVar.cancel();
                this.f1493c = null;
            }
        }
    }
}
