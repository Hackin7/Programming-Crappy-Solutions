package b.d.a.a.x;

import a.e.g;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class a extends a.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0059a();

    /* renamed from: d  reason: collision with root package name */
    public final g<String, Bundle> f2665d;

    public /* synthetic */ a(Parcel x0, ClassLoader x1, C0059a x2) {
        this(x0, x1);
    }

    public a(Parcelable superState) {
        super(superState);
        this.f2665d = new g<>();
    }

    public a(Parcel in, ClassLoader loader) {
        super(in, loader);
        int size = in.readInt();
        String[] keys = new String[size];
        in.readStringArray(keys);
        Bundle[] states = new Bundle[size];
        in.readTypedArray(states, Bundle.CREATOR);
        this.f2665d = new g<>(size);
        for (int i = 0; i < size; i++) {
            this.f2665d.put(keys[i], states[i]);
        }
    }

    @Override // a.j.a.a
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        int size = this.f2665d.size();
        out.writeInt(size);
        String[] keys = new String[size];
        Bundle[] states = new Bundle[size];
        for (int i = 0; i < size; i++) {
            keys[i] = this.f2665d.i(i);
            states[i] = this.f2665d.m(i);
        }
        out.writeStringArray(keys);
        out.writeTypedArray(states, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2665d + "}";
    }

    /* renamed from: b.d.a.a.x.a$a  reason: collision with other inner class name */
    public static class C0059a implements Parcelable.ClassLoaderCreator<a> {
        /* renamed from: b */
        public a createFromParcel(Parcel in, ClassLoader loader) {
            return new a(in, loader, null);
        }

        /* renamed from: a */
        public a createFromParcel(Parcel in) {
            return new a(in, null, null);
        }

        /* renamed from: c */
        public a[] newArray(int size) {
            return new a[size];
        }
    }
}
