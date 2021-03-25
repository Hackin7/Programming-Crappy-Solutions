package a.h.j;

import a.h.l.h;
import android.util.Base64;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f847a;

    /* renamed from: b  reason: collision with root package name */
    public final String f848b;

    /* renamed from: c  reason: collision with root package name */
    public final String f849c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f850d;

    /* renamed from: e  reason: collision with root package name */
    public final int f851e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final String f852f = (this.f847a + "-" + this.f848b + "-" + this.f849c);

    public a(String providerAuthority, String providerPackage, String query, List<List<byte[]>> certificates) {
        h.b(providerAuthority);
        this.f847a = providerAuthority;
        h.b(providerPackage);
        this.f848b = providerPackage;
        h.b(query);
        this.f849c = query;
        h.b(certificates);
        this.f850d = certificates;
    }

    public String d() {
        return this.f847a;
    }

    public String e() {
        return this.f848b;
    }

    public String f() {
        return this.f849c;
    }

    public List<List<byte[]>> a() {
        return this.f850d;
    }

    public int b() {
        return this.f851e;
    }

    public String c() {
        return this.f852f;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.f847a + ", mProviderPackage: " + this.f848b + ", mQuery: " + this.f849c + ", mCertificates:");
        for (int i = 0; i < this.f850d.size(); i++) {
            builder.append(" [");
            List<byte[]> set = this.f850d.get(i);
            for (int j = 0; j < set.size(); j++) {
                builder.append(" \"");
                builder.append(Base64.encodeToString(set.get(j), 0));
                builder.append("\"");
            }
            builder.append(" ]");
        }
        builder.append("}");
        builder.append("mCertificatesArray: " + this.f851e);
        return builder.toString();
    }
}
