package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: hm */
public abstract class C0450hm implements Parcelable {
    public static final Creator<C0450hm> CREATOR = new ClassLoaderCreator<C0450hm>() {
        /* renamed from: a */
        private static C0450hm m1411a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0450hm.f1908c;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1411a(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m1411a(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0450hm[i];
        }
    };

    /* renamed from: c */
    public static final C0450hm f1908c = new C0450hm() {
    };

    /* renamed from: d */
    public final Parcelable f1909d;

    private C0450hm() {
        this.f1909d = null;
    }

    /* synthetic */ C0450hm(byte b) {
        this();
    }

    protected C0450hm(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f1908c;
        }
        this.f1909d = readParcelable;
    }

    protected C0450hm(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == f1908c) {
            parcelable = null;
        }
        this.f1909d = parcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1909d, i);
    }
}
