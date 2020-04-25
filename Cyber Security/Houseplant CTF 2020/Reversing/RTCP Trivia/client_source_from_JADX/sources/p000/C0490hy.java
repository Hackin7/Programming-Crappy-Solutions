package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: hy */
final class C0490hy implements Parcelable {
    public static final Creator<C0490hy> CREATOR = new Creator<C0490hy>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C0490hy(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0490hy[i];
        }
    };

    /* renamed from: a */
    final String f2113a;

    /* renamed from: b */
    final int f2114b;

    /* renamed from: c */
    final boolean f2115c;

    /* renamed from: d */
    final int f2116d;

    /* renamed from: e */
    final int f2117e;

    /* renamed from: f */
    final String f2118f;

    /* renamed from: g */
    final boolean f2119g;

    /* renamed from: h */
    final boolean f2120h;

    /* renamed from: i */
    final Bundle f2121i;

    /* renamed from: j */
    final boolean f2122j;

    /* renamed from: k */
    Bundle f2123k;

    /* renamed from: l */
    C0457hp f2124l;

    C0490hy(Parcel parcel) {
        this.f2113a = parcel.readString();
        this.f2114b = parcel.readInt();
        boolean z = false;
        this.f2115c = parcel.readInt() != 0;
        this.f2116d = parcel.readInt();
        this.f2117e = parcel.readInt();
        this.f2118f = parcel.readString();
        this.f2119g = parcel.readInt() != 0;
        this.f2120h = parcel.readInt() != 0;
        this.f2121i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f2122j = z;
        this.f2123k = parcel.readBundle();
    }

    C0490hy(C0457hp hpVar) {
        this.f2113a = hpVar.getClass().getName();
        this.f2114b = hpVar.f1978f;
        this.f2115c = hpVar.f1986n;
        this.f2116d = hpVar.f1997y;
        this.f2117e = hpVar.f1998z;
        this.f2118f = hpVar.f1951A;
        this.f2119g = hpVar.f1954D;
        this.f2120h = hpVar.f1953C;
        this.f2121i = hpVar.f1980h;
        this.f2122j = hpVar.f1952B;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2113a);
        parcel.writeInt(this.f2114b);
        parcel.writeInt(this.f2115c ? 1 : 0);
        parcel.writeInt(this.f2116d);
        parcel.writeInt(this.f2117e);
        parcel.writeString(this.f2118f);
        parcel.writeInt(this.f2119g ? 1 : 0);
        parcel.writeInt(this.f2120h ? 1 : 0);
        parcel.writeBundle(this.f2121i);
        parcel.writeInt(this.f2122j ? 1 : 0);
        parcel.writeBundle(this.f2123k);
    }
}
