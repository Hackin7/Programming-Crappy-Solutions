package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: de */
public class C0243de<K, V> extends C0256dk<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0250dj<K, V> f1161a;

    /* renamed from: a */
    private C0250dj<K, V> m773a() {
        if (this.f1161a == null) {
            this.f1161a = new C0250dj<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo1377a() {
                    return C0243de.this.f1210h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo1378a(Object obj) {
                    return C0243de.this.mo1471a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo1379a(int i, int i2) {
                    return C0243de.this.f1209g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final V mo1380a(int i, V v) {
                    C0243de deVar = C0243de.this;
                    int i2 = (i << 1) + 1;
                    V v2 = deVar.f1209g[i2];
                    deVar.f1209g[i2] = v;
                    return v2;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo1381a(int i) {
                    C0243de.this.mo1479d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo1382a(K k, V v) {
                    C0243de.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final int mo1383b(Object obj) {
                    return C0243de.this.mo1473b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Map<K, V> mo1384b() {
                    return C0243de.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final void mo1385c() {
                    C0243de.this.clear();
                }
            };
        }
        return this.f1161a;
    }

    public Set<Entry<K, V>> entrySet() {
        C0250dj a = m773a();
        if (a.f1189b == null) {
            a.f1189b = new C0252b<>();
        }
        return a.f1189b;
    }

    public Set<K> keySet() {
        return m773a().mo1415d();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        int size = this.f1210h + map.size();
        int i = this.f1210h;
        if (this.f1208f.length < size) {
            int[] iArr = this.f1208f;
            Object[] objArr = this.f1209g;
            super.mo1472a(size);
            if (this.f1210h > 0) {
                System.arraycopy(iArr, 0, this.f1208f, 0, i);
                System.arraycopy(objArr, 0, this.f1209g, 0, i << 1);
            }
            C0256dk.m831a(iArr, objArr, i);
        }
        if (this.f1210h != i) {
            throw new ConcurrentModificationException();
        }
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        C0250dj a = m773a();
        if (a.f1191d == null) {
            a.f1191d = new C0255e<>();
        }
        return a.f1191d;
    }
}
