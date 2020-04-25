package p000;

import android.util.Base64;
import java.util.List;

/* renamed from: fv */
public final class C0356fv {

    /* renamed from: a */
    final String f1650a;

    /* renamed from: b */
    final String f1651b;

    /* renamed from: c */
    final String f1652c;

    /* renamed from: d */
    final List<List<byte[]>> f1653d;

    /* renamed from: e */
    final int f1654e = 0;

    /* renamed from: f */
    final String f1655f;

    public C0356fv(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1650a = (String) C0378gc.m1209a(str);
        this.f1651b = (String) C0378gc.m1209a(str2);
        this.f1652c = (String) C0378gc.m1209a(str3);
        this.f1653d = (List) C0378gc.m1209a(list);
        StringBuilder sb = new StringBuilder(this.f1650a);
        sb.append("-");
        sb.append(this.f1651b);
        sb.append("-");
        sb.append(this.f1652c);
        this.f1655f = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.f1650a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f1651b);
        sb2.append(", mQuery: ");
        sb2.append(this.f1652c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f1653d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f1653d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.f1654e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
