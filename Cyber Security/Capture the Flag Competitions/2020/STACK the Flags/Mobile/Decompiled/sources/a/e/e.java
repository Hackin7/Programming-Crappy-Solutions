package a.e;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f524a;

    /* renamed from: b  reason: collision with root package name */
    public int f525b;

    /* renamed from: c  reason: collision with root package name */
    public int f526c;

    /* renamed from: d  reason: collision with root package name */
    public int f527d;

    /* renamed from: e  reason: collision with root package name */
    public int f528e;

    /* renamed from: f  reason: collision with root package name */
    public int f529f;

    /* renamed from: g  reason: collision with root package name */
    public int f530g;
    public int h;

    public e(int maxSize) {
        if (maxSize > 0) {
            this.f526c = maxSize;
            this.f524a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (0 != 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f528e++;
        r2 = r3.f524a.put(r4, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r2 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3.f524a.put(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r2 = r3.f525b;
        e(r4, null);
        r3.f525b = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        g(r3.f526c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return null;
     */
    public final V c(K key) {
        if (key != null) {
            synchronized (this) {
                V mapValue = this.f524a.get(key);
                if (mapValue != null) {
                    this.f530g++;
                    return mapValue;
                }
                this.h++;
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    public final V d(K key, V value) {
        V previous;
        if (key == null || value == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f527d++;
            int i = this.f525b;
            e(key, value);
            this.f525b = i + 1;
            previous = this.f524a.put(key, value);
            if (previous != null) {
                int i2 = this.f525b;
                e(key, previous);
                this.f525b = i2 - 1;
            }
        }
        if (previous != null) {
            b();
        }
        g(this.f526c);
        return previous;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    public void g(int maxSize) {
        while (true) {
            synchronized (this) {
                if (this.f525b < 0 || (this.f524a.isEmpty() && this.f525b != 0)) {
                } else if (this.f525b <= maxSize) {
                    break;
                } else if (this.f524a.isEmpty()) {
                    break;
                } else {
                    Map.Entry<K, V> toEvict = this.f524a.entrySet().iterator().next();
                    K key = toEvict.getKey();
                    V value = toEvict.getValue();
                    this.f524a.remove(key);
                    int i = this.f525b;
                    e(key, value);
                    this.f525b = i - 1;
                    this.f529f++;
                }
            }
            b();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (ZTK;TV;TV;)V */
    public void b() {
    }

    /* JADX WARN: Incorrect args count in method signature: (TK;)TV; */
    public Object a() {
        return null;
    }

    public final int e(K key, V value) {
        f();
        if (1 >= 0) {
            return 1;
        }
        throw new IllegalStateException("Negative size: " + ((Object) key) + "=" + ((Object) value));
    }

    /* JADX WARN: Incorrect args count in method signature: (TK;TV;)I */
    public int f() {
        return 1;
    }

    public final synchronized String toString() {
        int accesses;
        accesses = this.f530g + this.h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f526c), Integer.valueOf(this.f530g), Integer.valueOf(this.h), Integer.valueOf(accesses != 0 ? (this.f530g * 100) / accesses : 0));
    }
}
