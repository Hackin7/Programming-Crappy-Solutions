package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: hx */
final class C0488hx implements Parcelable {
    public static final Creator<C0488hx> CREATOR = new Creator<C0488hx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C0488hx(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0488hx[i];
        }
    };

    /* renamed from: a */
    C0490hy[] f2108a;

    /* renamed from: b */
    int[] f2109b;

    /* renamed from: c */
    C0455ho[] f2110c;

    /* renamed from: d */
    int f2111d = -1;

    /* renamed from: e */
    int f2112e;

    public C0488hx() {
    }

    public C0488hx(Parcel parcel) {
        this.f2108a = (C0490hy[]) parcel.createTypedArray(C0490hy.CREATOR);
        this.f2109b = parcel.createIntArray();
        this.f2110c = (C0455ho[]) parcel.createTypedArray(C0455ho.CREATOR);
        this.f2111d = parcel.readInt();
        this.f2112e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f2108a, i);
        parcel.writeIntArray(this.f2109b);
        parcel.writeTypedArray(this.f2110c, i);
        parcel.writeInt(this.f2111d);
        parcel.writeInt(this.f2112e);
    }
}
