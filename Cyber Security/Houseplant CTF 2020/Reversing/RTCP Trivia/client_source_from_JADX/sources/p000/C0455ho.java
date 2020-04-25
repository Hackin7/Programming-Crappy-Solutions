package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: ho */
final class C0455ho implements Parcelable {
    public static final Creator<C0455ho> CREATOR = new Creator<C0455ho>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C0455ho(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0455ho[i];
        }
    };

    /* renamed from: a */
    final int[] f1937a;

    /* renamed from: b */
    final int f1938b;

    /* renamed from: c */
    final int f1939c;

    /* renamed from: d */
    final String f1940d;

    /* renamed from: e */
    final int f1941e;

    /* renamed from: f */
    final int f1942f;

    /* renamed from: g */
    final CharSequence f1943g;

    /* renamed from: h */
    final int f1944h;

    /* renamed from: i */
    final CharSequence f1945i;

    /* renamed from: j */
    final ArrayList<String> f1946j;

    /* renamed from: k */
    final ArrayList<String> f1947k;

    /* renamed from: l */
    final boolean f1948l;

    public C0455ho(Parcel parcel) {
        this.f1937a = parcel.createIntArray();
        this.f1938b = parcel.readInt();
        this.f1939c = parcel.readInt();
        this.f1940d = parcel.readString();
        this.f1941e = parcel.readInt();
        this.f1942f = parcel.readInt();
        this.f1943g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1944h = parcel.readInt();
        this.f1945i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1946j = parcel.createStringArrayList();
        this.f1947k = parcel.createStringArrayList();
        this.f1948l = parcel.readInt() != 0;
    }

    public C0455ho(C0453hn hnVar) {
        int size = hnVar.f1911b.size();
        this.f1937a = new int[(size * 6)];
        if (!hnVar.f1918i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C0454a aVar = (C0454a) hnVar.f1911b.get(i);
            int i3 = i2 + 1;
            this.f1937a[i2] = aVar.f1931a;
            int i4 = i3 + 1;
            this.f1937a[i3] = aVar.f1932b != null ? aVar.f1932b.f1978f : -1;
            int i5 = i4 + 1;
            this.f1937a[i4] = aVar.f1933c;
            int i6 = i5 + 1;
            this.f1937a[i5] = aVar.f1934d;
            int i7 = i6 + 1;
            this.f1937a[i6] = aVar.f1935e;
            int i8 = i7 + 1;
            this.f1937a[i7] = aVar.f1936f;
            i++;
            i2 = i8;
        }
        this.f1938b = hnVar.f1916g;
        this.f1939c = hnVar.f1917h;
        this.f1940d = hnVar.f1920k;
        this.f1941e = hnVar.f1922m;
        this.f1942f = hnVar.f1923n;
        this.f1943g = hnVar.f1924o;
        this.f1944h = hnVar.f1925p;
        this.f1945i = hnVar.f1926q;
        this.f1946j = hnVar.f1927r;
        this.f1947k = hnVar.f1928s;
        this.f1948l = hnVar.f1929t;
    }

    /* renamed from: a */
    public final C0453hn mo1914a(C0472hv hvVar) {
        C0453hn hnVar = new C0453hn(hvVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1937a.length) {
            C0454a aVar = new C0454a();
            int i3 = i + 1;
            aVar.f1931a = this.f1937a[i];
            if (C0472hv.f2046a) {
                StringBuilder sb = new StringBuilder("Instantiate ");
                sb.append(hnVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f1937a[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            int i4 = i3 + 1;
            int i5 = this.f1937a[i3];
            aVar.f1932b = i5 >= 0 ? (C0457hp) hvVar.f2058f.get(i5) : null;
            int i6 = i4 + 1;
            aVar.f1933c = this.f1937a[i4];
            int i7 = i6 + 1;
            aVar.f1934d = this.f1937a[i6];
            int i8 = i7 + 1;
            aVar.f1935e = this.f1937a[i7];
            int i9 = i8 + 1;
            aVar.f1936f = this.f1937a[i8];
            hnVar.f1912c = aVar.f1933c;
            hnVar.f1913d = aVar.f1934d;
            hnVar.f1914e = aVar.f1935e;
            hnVar.f1915f = aVar.f1936f;
            hnVar.f1911b.add(aVar);
            aVar.f1933c = hnVar.f1912c;
            aVar.f1934d = hnVar.f1913d;
            aVar.f1935e = hnVar.f1914e;
            aVar.f1936f = hnVar.f1915f;
            i2++;
            i = i9;
        }
        hnVar.f1916g = this.f1938b;
        hnVar.f1917h = this.f1939c;
        hnVar.f1920k = this.f1940d;
        hnVar.f1922m = this.f1941e;
        hnVar.f1918i = true;
        hnVar.f1923n = this.f1942f;
        hnVar.f1924o = this.f1943g;
        hnVar.f1925p = this.f1944h;
        hnVar.f1926q = this.f1945i;
        hnVar.f1927r = this.f1946j;
        hnVar.f1928s = this.f1947k;
        hnVar.f1929t = this.f1948l;
        hnVar.mo1903a(1);
        return hnVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1937a);
        parcel.writeInt(this.f1938b);
        parcel.writeInt(this.f1939c);
        parcel.writeString(this.f1940d);
        parcel.writeInt(this.f1941e);
        parcel.writeInt(this.f1942f);
        TextUtils.writeToParcel(this.f1943g, parcel, 0);
        parcel.writeInt(this.f1944h);
        TextUtils.writeToParcel(this.f1945i, parcel, 0);
        parcel.writeStringList(this.f1946j);
        parcel.writeStringList(this.f1947k);
        parcel.writeInt(this.f1948l ? 1 : 0);
    }
}
