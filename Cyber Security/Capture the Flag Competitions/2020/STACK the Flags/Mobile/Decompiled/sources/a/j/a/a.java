package a.j.a;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f1019c = new C0028a();

    /* renamed from: b  reason: collision with root package name */
    public final Parcelable f1020b;

    /* renamed from: a.j.a.a$a  reason: collision with other inner class name */
    public static class C0028a extends a {
        public C0028a() {
            super((C0028a) null);
        }
    }

    public /* synthetic */ a(C0028a x0) {
        this();
    }

    public a() {
        this.f1020b = null;
    }

    public a(Parcelable superState) {
        if (superState != null) {
            this.f1020b = superState != f1019c ? superState : null;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel source, ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        this.f1020b = superState != null ? superState : f1019c;
    }

    public final Parcelable a() {
        return this.f1020b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f1020b, flags);
    }

    public static class b implements Parcelable.ClassLoaderCreator<a> {
        /* renamed from: b */
        public a createFromParcel(Parcel in, ClassLoader loader) {
            if (in.readParcelable(loader) == null) {
                return a.f1019c;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public a createFromParcel(Parcel in) {
            return createFromParcel(in, null);
        }

        /* renamed from: c */
        public a[] newArray(int size) {
            return new a[size];
        }
    }
}
