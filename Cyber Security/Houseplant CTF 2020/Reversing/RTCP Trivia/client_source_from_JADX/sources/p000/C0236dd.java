package p000;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: dd */
public class C0236dd<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: b */
    public C0239c<K, V> f1148b;

    /* renamed from: c */
    public C0239c<K, V> f1149c;

    /* renamed from: d */
    public WeakHashMap<C0242f<K, V>, Boolean> f1150d = new WeakHashMap<>();

    /* renamed from: e */
    public int f1151e = 0;

    /* renamed from: dd$a */
    static class C0237a<K, V> extends C0241e<K, V> {
        C0237a(C0239c<K, V> cVar, C0239c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0239c<K, V> mo1360a(C0239c<K, V> cVar) {
            return cVar.f1154c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0239c<K, V> mo1361b(C0239c<K, V> cVar) {
            return cVar.f1155d;
        }
    }

    /* renamed from: dd$b */
    public static class C0238b<K, V> extends C0241e<K, V> {
        public C0238b(C0239c<K, V> cVar, C0239c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0239c<K, V> mo1360a(C0239c<K, V> cVar) {
            return cVar.f1155d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0239c<K, V> mo1361b(C0239c<K, V> cVar) {
            return cVar.f1154c;
        }
    }

    /* renamed from: dd$c */
    public static class C0239c<K, V> implements Entry<K, V> {

        /* renamed from: a */
        final K f1152a;

        /* renamed from: b */
        final V f1153b;

        /* renamed from: c */
        C0239c<K, V> f1154c;

        /* renamed from: d */
        public C0239c<K, V> f1155d;

        C0239c(K k, V v) {
            this.f1152a = k;
            this.f1153b = v;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0239c)) {
                return false;
            }
            C0239c cVar = (C0239c) obj;
            return this.f1152a.equals(cVar.f1152a) && this.f1153b.equals(cVar.f1153b);
        }

        public final K getKey() {
            return this.f1152a;
        }

        public final V getValue() {
            return this.f1153b;
        }

        public final int hashCode() {
            return this.f1152a.hashCode() ^ this.f1153b.hashCode();
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1152a);
            sb.append("=");
            sb.append(this.f1153b);
            return sb.toString();
        }
    }

    /* renamed from: dd$d */
    public class C0240d implements C0242f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: b */
        private C0239c<K, V> f1157b;

        /* renamed from: c */
        private boolean f1158c = true;

        C0240d() {
        }

        /* renamed from: a_ */
        public final void mo1368a_(C0239c<K, V> cVar) {
            if (cVar == this.f1157b) {
                this.f1157b = this.f1157b.f1155d;
                this.f1158c = this.f1157b == null;
            }
        }

        public final boolean hasNext() {
            return this.f1158c ? C0236dd.this.f1148b != null : (this.f1157b == null || this.f1157b.f1154c == null) ? false : true;
        }

        public final /* bridge */ /* synthetic */ Object next() {
            C0239c<K, V> cVar;
            if (this.f1158c) {
                this.f1158c = false;
                cVar = C0236dd.this.f1148b;
            } else {
                cVar = this.f1157b != null ? this.f1157b.f1154c : null;
            }
            this.f1157b = cVar;
            return this.f1157b;
        }
    }

    /* renamed from: dd$e */
    static abstract class C0241e<K, V> implements C0242f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: a */
        C0239c<K, V> f1159a;

        /* renamed from: b */
        C0239c<K, V> f1160b;

        C0241e(C0239c<K, V> cVar, C0239c<K, V> cVar2) {
            this.f1159a = cVar2;
            this.f1160b = cVar;
        }

        /* renamed from: a */
        private C0239c<K, V> m768a() {
            if (this.f1160b == this.f1159a || this.f1159a == null) {
                return null;
            }
            return mo1360a(this.f1160b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C0239c<K, V> mo1360a(C0239c<K, V> cVar);

        /* renamed from: a_ */
        public final void mo1368a_(C0239c<K, V> cVar) {
            if (this.f1159a == cVar && cVar == this.f1160b) {
                this.f1160b = null;
                this.f1159a = null;
            }
            if (this.f1159a == cVar) {
                this.f1159a = mo1361b(this.f1159a);
            }
            if (this.f1160b == cVar) {
                this.f1160b = m768a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C0239c<K, V> mo1361b(C0239c<K, V> cVar);

        public boolean hasNext() {
            return this.f1160b != null;
        }

        public /* synthetic */ Object next() {
            C0239c<K, V> cVar = this.f1160b;
            this.f1160b = m768a();
            return cVar;
        }
    }

    /* renamed from: dd$f */
    interface C0242f<K, V> {
        /* renamed from: a_ */
        void mo1368a_(C0239c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0239c<K, V> mo1350a(K k) {
        C0239c<K, V> cVar = this.f1148b;
        while (cVar != null && !cVar.f1152a.equals(k)) {
            cVar = cVar.f1154c;
        }
        return cVar;
    }

    /* renamed from: a */
    public final C0240d mo1354a() {
        C0240d dVar = new C0240d<>();
        this.f1150d.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    /* renamed from: a */
    public V mo1351a(K k, V v) {
        C0239c a = mo1350a(k);
        if (a != null) {
            return a.f1153b;
        }
        mo1355b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0239c<K, V> mo1355b(K k, V v) {
        C0239c<K, V> cVar = new C0239c<>(k, v);
        this.f1151e++;
        if (this.f1149c == null) {
            this.f1148b = cVar;
            this.f1149c = this.f1148b;
            return cVar;
        }
        this.f1149c.f1154c = cVar;
        cVar.f1155d = this.f1149c;
        this.f1149c = cVar;
        return cVar;
    }

    /* renamed from: b */
    public V mo1352b(K k) {
        C0239c a = mo1350a(k);
        if (a == null) {
            return null;
        }
        this.f1151e--;
        if (!this.f1150d.isEmpty()) {
            for (C0242f a_ : this.f1150d.keySet()) {
                a_.mo1368a_(a);
            }
        }
        if (a.f1155d != null) {
            a.f1155d.f1154c = a.f1154c;
        } else {
            this.f1148b = a.f1154c;
        }
        if (a.f1154c != null) {
            a.f1154c.f1155d = a.f1155d;
        } else {
            this.f1149c = a.f1155d;
        }
        a.f1154c = null;
        a.f1155d = null;
        return a.f1153b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0236dd)) {
            return false;
        }
        C0236dd ddVar = (C0236dd) obj;
        if (this.f1151e != ddVar.f1151e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = ddVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Entry<K, V>> iterator() {
        C0237a aVar = new C0237a(this.f1148b, this.f1149c);
        this.f1150d.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
