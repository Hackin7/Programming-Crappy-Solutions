package b.c.a.a.d;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

public class e extends b implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public float f2454e = 0.0f;

    public e() {
    }

    public e(float x, float y) {
        super(y);
        this.f2454e = x;
    }

    public String toString() {
        return "Entry, x: " + this.f2454e + " y: " + c();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(this.f2454e);
        dest.writeFloat(c());
        if (a() == null) {
            dest.writeInt(0);
        } else if (a() instanceof Parcelable) {
            dest.writeInt(1);
            dest.writeParcelable((Parcelable) a(), flags);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    public e(Parcel in) {
        this.f2454e = in.readFloat();
        e(in.readFloat());
        if (in.readInt() == 1) {
            d(in.readParcelable(Object.class.getClassLoader()));
        }
    }

    public static class a implements Parcelable.Creator<e> {
        /* renamed from: a */
        public e createFromParcel(Parcel source) {
            return new e(source);
        }

        /* renamed from: b */
        public e[] newArray(int size) {
            return new e[size];
        }
    }
}
