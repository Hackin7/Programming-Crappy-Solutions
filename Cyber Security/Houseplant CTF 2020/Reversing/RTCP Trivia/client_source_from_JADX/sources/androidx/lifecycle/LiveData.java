package androidx.lifecycle;

import java.util.Map.Entry;

public abstract class LiveData<T> {

    /* renamed from: b */
    public static final Object f686b = new Object();

    /* renamed from: a */
    final Object f687a = new Object();

    /* renamed from: c */
    protected C0236dd<C0534iv<? super T>, C0097a> f688c = new C0236dd<>();

    /* renamed from: d */
    public int f689d = 0;

    /* renamed from: e */
    public volatile Object f690e = f686b;

    /* renamed from: f */
    volatile Object f691f = f686b;

    /* renamed from: g */
    private int f692g = -1;

    /* renamed from: h */
    private boolean f693h;

    /* renamed from: i */
    private boolean f694i;

    /* renamed from: j */
    private final Runnable f695j = new Runnable() {
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f687a) {
                obj = LiveData.this.f691f;
                LiveData.this.f691f = LiveData.f686b;
            }
            LiveData.this.mo811a(obj);
        }
    };

    public class LifecycleBoundObserver extends C0097a implements C0521im {

        /* renamed from: a */
        final C0526ip f697a;

        public LifecycleBoundObserver(C0526ip ipVar, C0534iv<? super T> ivVar) {
            super(ivVar);
            this.f697a = ipVar;
        }

        /* renamed from: a */
        public final void mo807a(C0526ip ipVar, C0523a aVar) {
            if (this.f697a.mo1688c().mo2120a() == C0524b.DESTROYED) {
                LiveData.this.mo810a(this.f699c);
            } else {
                mo817a(mo814a());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo814a() {
            return this.f697a.mo1688c().mo2120a().mo2123a(C0524b.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo815a(C0526ip ipVar) {
            return this.f697a == ipVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo816b() {
            this.f697a.mo1688c().mo2122b(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public abstract class C0097a {

        /* renamed from: c */
        final C0534iv<? super T> f699c;

        /* renamed from: d */
        boolean f700d;

        /* renamed from: e */
        int f701e = -1;

        C0097a(C0534iv<? super T> ivVar) {
            this.f699c = ivVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo817a(boolean z) {
            if (z != this.f700d) {
                this.f700d = z;
                int i = 1;
                boolean z2 = LiveData.this.f689d == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f689d;
                if (!this.f700d) {
                    i = -1;
                }
                liveData.f689d = i2 + i;
                if (z2 && this.f700d) {
                    LiveData.this.mo808a();
                }
                if (LiveData.this.f689d == 0 && !this.f700d) {
                    LiveData.this.mo812b();
                }
                if (this.f700d) {
                    LiveData.this.mo809a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo814a();

        /* renamed from: a */
        public boolean mo815a(C0526ip ipVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo816b() {
        }
    }

    /* renamed from: a */
    protected static void m323a(String str) {
        if (!C0227cz.m742a().f1137a.mo1341b()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m324b(C0097a aVar) {
        if (aVar.f700d) {
            if (!aVar.mo814a()) {
                aVar.mo817a(false);
            } else if (aVar.f701e < this.f692g) {
                aVar.f701e = this.f692g;
                aVar.f699c.mo2128a(this.f690e);
            }
        }
    }

    /* renamed from: a */
    public void mo808a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo809a(C0097a aVar) {
        if (this.f693h) {
            this.f694i = true;
            return;
        }
        this.f693h = true;
        do {
            this.f694i = false;
            if (aVar == null) {
                C0240d a = this.f688c.mo1354a();
                while (a.hasNext()) {
                    m324b((C0097a) ((Entry) a.next()).getValue());
                    if (this.f694i) {
                        break;
                    }
                }
            } else {
                m324b(aVar);
                aVar = null;
            }
        } while (this.f694i);
        this.f693h = false;
    }

    /* renamed from: a */
    public void mo810a(C0534iv<? super T> ivVar) {
        m323a("removeObserver");
        C0097a aVar = (C0097a) this.f688c.mo1352b(ivVar);
        if (aVar != null) {
            aVar.mo816b();
            aVar.mo817a(false);
        }
    }

    /* renamed from: a */
    public void mo811a(T t) {
        m323a("setValue");
        this.f692g++;
        this.f690e = t;
        mo809a(null);
    }

    /* renamed from: b */
    public void mo812b() {
    }
}
