package p000;

import java.util.HashMap;

/* renamed from: dc */
public final class C0235dc<K, V> extends C0236dd<K, V> {

    /* renamed from: a */
    public HashMap<K, C0239c<K, V>> f1147a = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0239c<K, V> mo1350a(K k) {
        return (C0239c) this.f1147a.get(k);
    }

    /* renamed from: a */
    public final V mo1351a(K k, V v) {
        C0239c a = mo1350a(k);
        if (a != null) {
            return a.f1153b;
        }
        this.f1147a.put(k, mo1355b(k, v));
        return null;
    }

    /* renamed from: b */
    public final V mo1352b(K k) {
        V b = super.mo1352b(k);
        this.f1147a.remove(k);
        return b;
    }

    /* renamed from: c */
    public final boolean mo1353c(K k) {
        return this.f1147a.containsKey(k);
    }
}
