package android.support.v4.app;

import a.t.a;
import androidx.core.app.RemoteActionCompat;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a parcel) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(parcel);
    }

    public static void write(RemoteActionCompat obj, a parcel) {
        androidx.core.app.RemoteActionCompatParcelizer.write(obj, parcel);
    }
}
