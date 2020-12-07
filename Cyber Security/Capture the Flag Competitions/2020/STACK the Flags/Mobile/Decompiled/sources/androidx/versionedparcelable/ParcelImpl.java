package androidx.versionedparcelable;

import a.t.b;
import a.t.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final c f1842b;

    public ParcelImpl(Parcel in) {
        this.f1842b = new b(in).u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        new b(dest).L(this.f1842b);
    }

    public static class a implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel in) {
            return new ParcelImpl(in);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int size) {
            return new ParcelImpl[size];
        }
    }
}
