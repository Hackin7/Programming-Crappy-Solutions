package p000;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: di */
public class C0249di<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f1182a;

    /* renamed from: b */
    private int f1183b;

    /* renamed from: c */
    private int f1184c;

    /* renamed from: d */
    private int f1185d;

    /* renamed from: e */
    private int f1186e;

    /* renamed from: f */
    private int f1187f;

    /* renamed from: g */
    private int f1188g;

    public C0249di(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1184c = i;
        this.f1182a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(getClass().getName());
        r0.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m811a(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f1183b     // Catch:{ all -> 0x006a }
            if (r0 < 0) goto L_0x004b
            java.util.LinkedHashMap<K, V> r0 = r2.f1182a     // Catch:{ all -> 0x006a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0012
            int r0 = r2.f1183b     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0012
            goto L_0x004b
        L_0x0012:
            int r0 = r2.f1183b     // Catch:{ all -> 0x006a }
            if (r0 <= r3) goto L_0x0049
            java.util.LinkedHashMap<K, V> r0 = r2.f1182a     // Catch:{ all -> 0x006a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x001f
            goto L_0x0049
        L_0x001f:
            java.util.LinkedHashMap<K, V> r0 = r2.f1182a     // Catch:{ all -> 0x006a }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006a }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006a }
            r0.getValue()     // Catch:{ all -> 0x006a }
            java.util.LinkedHashMap<K, V> r0 = r2.f1182a     // Catch:{ all -> 0x006a }
            r0.remove(r1)     // Catch:{ all -> 0x006a }
            int r0 = r2.f1183b     // Catch:{ all -> 0x006a }
            int r0 = r0 + -1
            r2.f1183b = r0     // Catch:{ all -> 0x006a }
            int r0 = r2.f1186e     // Catch:{ all -> 0x006a }
            int r0 = r0 + 1
            r2.f1186e = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x0000
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            return
        L_0x004b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006a }
            r0.append(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006a }
            r3.<init>(r0)     // Catch:{ all -> 0x006a }
            throw r3     // Catch:{ all -> 0x006a }
        L_0x006a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0249di.m811a(int):void");
    }

    /* renamed from: a */
    public final V mo1410a(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f1182a.get(k);
            if (v != null) {
                this.f1187f++;
                return v;
            }
            this.f1188g++;
            return null;
        }
    }

    /* renamed from: a */
    public final V mo1411a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1185d++;
            this.f1183b++;
            put = this.f1182a.put(k, v);
            if (put != null) {
                this.f1183b--;
            }
        }
        m811a(this.f1184c);
        return put;
    }

    public final synchronized String toString() {
        int i;
        i = this.f1187f + this.f1188g;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f1184c), Integer.valueOf(this.f1187f), Integer.valueOf(this.f1188g), Integer.valueOf(i != 0 ? (100 * this.f1187f) / i : 0)});
    }
}
