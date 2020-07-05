package androidx.core.p003os;

import android.os.Parcel;

/* renamed from: androidx.core.os.ParcelCompat */
public final class ParcelCompat {
    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    private ParcelCompat() {
    }
}
