package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: ke */
public final class C0605ke {

    /* renamed from: a */
    public final String[] f2577a;

    /* renamed from: ke$a */
    public static final class C0606a {

        /* renamed from: a */
        final List<String> f2578a = new ArrayList(20);

        /* renamed from: b */
        static void m1849b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            } else {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(C0633kv.m1966a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                if (str2 == null) {
                    StringBuilder sb = new StringBuilder("value for name ");
                    sb.append(str);
                    sb.append(" == null");
                    throw new NullPointerException(sb.toString());
                }
                int length2 = str2.length();
                int i2 = 0;
                while (i2 < length2) {
                    char charAt2 = str2.charAt(i2);
                    if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                        i2++;
                    } else {
                        throw new IllegalArgumentException(C0633kv.m1966a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2));
                    }
                }
            }
        }

        /* renamed from: a */
        public final C0606a mo2329a(String str) {
            int i = 0;
            while (i < this.f2578a.size()) {
                if (str.equalsIgnoreCase((String) this.f2578a.get(i))) {
                    this.f2578a.remove(i);
                    this.f2578a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0606a mo2330a(String str, String str2) {
            this.f2578a.add(str);
            this.f2578a.add(str2.trim());
            return this;
        }

        /* renamed from: a */
        public final C0605ke mo2331a() {
            return new C0605ke(this);
        }
    }

    C0605ke(C0606a aVar) {
        this.f2577a = (String[]) aVar.f2578a.toArray(new String[aVar.f2578a.size()]);
    }

    /* renamed from: a */
    public final String mo2322a(int i) {
        return this.f2577a[i * 2];
    }

    @Nullable
    /* renamed from: a */
    public final String mo2323a(String str) {
        String[] strArr = this.f2577a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C0606a mo2324a() {
        C0606a aVar = new C0606a();
        Collections.addAll(aVar.f2578a, this.f2577a);
        return aVar;
    }

    /* renamed from: b */
    public final String mo2325b(int i) {
        return this.f2577a[(i * 2) + 1];
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C0605ke) && Arrays.equals(((C0605ke) obj).f2577a, this.f2577a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2577a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f2577a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(mo2322a(i));
            sb.append(": ");
            sb.append(mo2325b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
