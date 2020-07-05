package p000;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: iq */
public final class C0527iq extends C0522in {

    /* renamed from: a */
    private C0235dc<C0525io, C0529a> f2212a = new C0235dc<>();

    /* renamed from: b */
    private C0524b f2213b;

    /* renamed from: c */
    private final WeakReference<C0526ip> f2214c;

    /* renamed from: d */
    private int f2215d = 0;

    /* renamed from: e */
    private boolean f2216e = false;

    /* renamed from: f */
    private boolean f2217f = false;

    /* renamed from: g */
    private ArrayList<C0524b> f2218g = new ArrayList<>();

    /* renamed from: iq$a */
    static class C0529a {

        /* renamed from: a */
        C0524b f2221a;

        /* renamed from: b */
        C0521im f2222b;

        C0529a(C0525io ioVar, C0524b bVar) {
            this.f2222b = C0531is.m1699a((Object) ioVar);
            this.f2221a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2126a(C0526ip ipVar, C0523a aVar) {
            C0524b b = C0527iq.m1685b(aVar);
            this.f2221a = C0527iq.m1683a(this.f2221a, b);
            this.f2222b.mo807a(ipVar, aVar);
            this.f2221a = b;
        }
    }

    public C0527iq(C0526ip ipVar) {
        this.f2214c = new WeakReference<>(ipVar);
        this.f2213b = C0524b.INITIALIZED;
    }

    /* renamed from: a */
    static C0524b m1683a(C0524b bVar, C0524b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m1684a(C0526ip ipVar) {
        C0240d a = this.f2212a.mo1354a();
        while (a.hasNext() && !this.f2217f) {
            Entry entry = (Entry) a.next();
            C0529a aVar = (C0529a) entry.getValue();
            while (aVar.f2221a.compareTo(this.f2213b) < 0 && !this.f2217f && this.f2212a.mo1353c(entry.getKey())) {
                m1687b(aVar.f2221a);
                aVar.mo2126a(ipVar, m1688c(aVar.f2221a));
                m1686b();
            }
        }
    }

    /* renamed from: b */
    static C0524b m1685b(C0523a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return C0524b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0524b.STARTED;
            case ON_RESUME:
                return C0524b.RESUMED;
            case ON_DESTROY:
                return C0524b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m1686b() {
        this.f2218g.remove(this.f2218g.size() - 1);
    }

    /* renamed from: b */
    private void m1687b(C0524b bVar) {
        this.f2218g.add(bVar);
    }

    /* renamed from: c */
    private static C0523a m1688c(C0524b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return C0523a.ON_CREATE;
            case CREATED:
                return C0523a.ON_START;
            case STARTED:
                return C0523a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private C0524b m1689c(C0525io ioVar) {
        C0235dc<C0525io, C0529a> dcVar = this.f2212a;
        C0524b bVar = null;
        Entry entry = dcVar.mo1353c(ioVar) ? ((C0239c) dcVar.f1147a.get(ioVar)).f1155d : null;
        C0524b bVar2 = entry != null ? ((C0529a) entry.getValue()).f2221a : null;
        if (!this.f2218g.isEmpty()) {
            bVar = (C0524b) this.f2218g.get(this.f2218g.size() - 1);
        }
        return m1683a(m1683a(this.f2213b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m1690c() {
        C0523a aVar;
        C0526ip ipVar = (C0526ip) this.f2214c.get();
        if (ipVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            boolean z = true;
            if (this.f2212a.f1151e != 0) {
                C0524b bVar = ((C0529a) this.f2212a.f1148b.getValue()).f2221a;
                C0524b bVar2 = ((C0529a) this.f2212a.f1149c.getValue()).f2221a;
                if (!(bVar == bVar2 && this.f2213b == bVar2)) {
                    z = false;
                }
            }
            if (!z) {
                this.f2217f = false;
                if (this.f2213b.compareTo(((C0529a) this.f2212a.f1148b.getValue()).f2221a) < 0) {
                    C0235dc<C0525io, C0529a> dcVar = this.f2212a;
                    C0238b bVar3 = new C0238b(dcVar.f1149c, dcVar.f1148b);
                    dcVar.f1150d.put(bVar3, Boolean.valueOf(false));
                    while (bVar3.hasNext() && !this.f2217f) {
                        Entry entry = (Entry) bVar3.next();
                        C0529a aVar2 = (C0529a) entry.getValue();
                        while (aVar2.f2221a.compareTo(this.f2213b) > 0 && !this.f2217f && this.f2212a.mo1353c(entry.getKey())) {
                            C0524b bVar4 = aVar2.f2221a;
                            switch (bVar4) {
                                case INITIALIZED:
                                    throw new IllegalArgumentException();
                                case CREATED:
                                    aVar = C0523a.ON_DESTROY;
                                    break;
                                case STARTED:
                                    aVar = C0523a.ON_STOP;
                                    break;
                                case RESUMED:
                                    aVar = C0523a.ON_PAUSE;
                                    break;
                                case DESTROYED:
                                    throw new IllegalArgumentException();
                                default:
                                    StringBuilder sb = new StringBuilder("Unexpected state value ");
                                    sb.append(bVar4);
                                    throw new IllegalArgumentException(sb.toString());
                            }
                            m1687b(m1685b(aVar));
                            aVar2.mo2126a(ipVar, aVar);
                            m1686b();
                        }
                    }
                }
                C0239c<K, V> cVar = this.f2212a.f1149c;
                if (!this.f2217f && cVar != null && this.f2213b.compareTo(((C0529a) cVar.getValue()).f2221a) > 0) {
                    m1684a(ipVar);
                }
            } else {
                this.f2217f = false;
                return;
            }
        }
    }

    /* renamed from: a */
    public final C0524b mo2120a() {
        return this.f2213b;
    }

    /* renamed from: a */
    public final void mo2124a(C0523a aVar) {
        mo2125a(m1685b(aVar));
    }

    /* renamed from: a */
    public final void mo2125a(C0524b bVar) {
        if (this.f2213b != bVar) {
            this.f2213b = bVar;
            if (this.f2216e || this.f2215d != 0) {
                this.f2217f = true;
                return;
            }
            this.f2216e = true;
            m1690c();
            this.f2216e = false;
        }
    }

    /* renamed from: a */
    public final void mo2121a(C0525io ioVar) {
        C0529a aVar = new C0529a(ioVar, this.f2213b == C0524b.DESTROYED ? C0524b.DESTROYED : C0524b.INITIALIZED);
        if (((C0529a) this.f2212a.mo1351a(ioVar, aVar)) == null) {
            C0526ip ipVar = (C0526ip) this.f2214c.get();
            if (ipVar != null) {
                boolean z = this.f2215d != 0 || this.f2216e;
                C0524b c = m1689c(ioVar);
                this.f2215d++;
                while (aVar.f2221a.compareTo(c) < 0 && this.f2212a.mo1353c(ioVar)) {
                    m1687b(aVar.f2221a);
                    aVar.mo2126a(ipVar, m1688c(aVar.f2221a));
                    m1686b();
                    c = m1689c(ioVar);
                }
                if (!z) {
                    m1690c();
                }
                this.f2215d--;
            }
        }
    }

    /* renamed from: b */
    public final void mo2122b(C0525io ioVar) {
        this.f2212a.mo1352b(ioVar);
    }
}
