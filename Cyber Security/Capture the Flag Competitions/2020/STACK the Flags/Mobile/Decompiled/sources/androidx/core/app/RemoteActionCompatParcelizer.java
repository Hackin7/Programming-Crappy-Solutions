package androidx.core.app;

import a.t.a;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a parcel) {
        RemoteActionCompat obj = new RemoteActionCompat();
        obj.f1661a = (IconCompat) parcel.v(obj.f1661a, 1);
        obj.f1662b = parcel.l(obj.f1662b, 2);
        obj.f1663c = parcel.l(obj.f1663c, 3);
        obj.f1664d = (PendingIntent) parcel.r(obj.f1664d, 4);
        obj.f1665e = parcel.h(obj.f1665e, 5);
        obj.f1666f = parcel.h(obj.f1666f, 6);
        return obj;
    }

    public static void write(RemoteActionCompat obj, a parcel) {
        parcel.x();
        parcel.M(obj.f1661a, 1);
        parcel.D(obj.f1662b, 2);
        parcel.D(obj.f1663c, 3);
        parcel.H(obj.f1664d, 4);
        parcel.z(obj.f1665e, 5);
        parcel.z(obj.f1666f, 6);
    }
}
