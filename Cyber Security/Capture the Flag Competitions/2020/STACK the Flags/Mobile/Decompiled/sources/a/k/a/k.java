package a.k.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<m> f1086b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f1087c;

    /* renamed from: d  reason: collision with root package name */
    public b[] f1088d;

    /* renamed from: e  reason: collision with root package name */
    public String f1089e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f1090f;

    public k() {
    }

    public k(Parcel in) {
        this.f1086b = in.createTypedArrayList(m.CREATOR);
        this.f1087c = in.createStringArrayList();
        this.f1088d = (b[]) in.createTypedArray(b.CREATOR);
        this.f1089e = in.readString();
        this.f1090f = in.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.f1086b);
        dest.writeStringList(this.f1087c);
        dest.writeTypedArray(this.f1088d, flags);
        dest.writeString(this.f1089e);
        dest.writeInt(this.f1090f);
    }

    public static class a implements Parcelable.Creator<k> {
        /* renamed from: a */
        public k createFromParcel(Parcel in) {
            return new k(in);
        }

        /* renamed from: b */
        public k[] newArray(int size) {
            return new k[size];
        }
    }
}
