package p000;

import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: kh */
public final class C0612kh {

    /* renamed from: a */
    private static final Pattern f2603a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    private static final Pattern f2604b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c */
    private final String f2605c;

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C0612kh) && ((C0612kh) obj).f2605c.equals(this.f2605c);
    }

    public final int hashCode() {
        return this.f2605c.hashCode();
    }

    public final String toString() {
        return this.f2605c;
    }
}
