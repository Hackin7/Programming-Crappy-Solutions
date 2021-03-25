package androidx.core.graphics.drawable;

import a.t.a;
import android.content.res.ColorStateList;
import android.os.Parcelable;

public class IconCompatParcelizer {
    public static IconCompat read(a parcel) {
        IconCompat obj = new IconCompat();
        obj.f1667a = parcel.p(obj.f1667a, 1);
        obj.f1669c = parcel.j(obj.f1669c, 2);
        obj.f1670d = parcel.r(obj.f1670d, 3);
        obj.f1671e = parcel.p(obj.f1671e, 4);
        obj.f1672f = parcel.p(obj.f1672f, 5);
        obj.f1673g = (ColorStateList) parcel.r(obj.f1673g, 6);
        obj.i = parcel.t(obj.i, 7);
        obj.e();
        return obj;
    }

    public static void write(IconCompat obj, a parcel) {
        parcel.x();
        parcel.f();
        obj.f(false);
        int i = obj.f1667a;
        if (-1 != i) {
            parcel.F(i, 1);
        }
        byte[] bArr = obj.f1669c;
        if (bArr != null) {
            parcel.B(bArr, 2);
        }
        Parcelable parcelable = obj.f1670d;
        if (parcelable != null) {
            parcel.H(parcelable, 3);
        }
        int i2 = obj.f1671e;
        if (i2 != 0) {
            parcel.F(i2, 4);
        }
        int i3 = obj.f1672f;
        if (i3 != 0) {
            parcel.F(i3, 5);
        }
        ColorStateList colorStateList = obj.f1673g;
        if (colorStateList != null) {
            parcel.H(colorStateList, 6);
        }
        String str = obj.i;
        if (str != null) {
            parcel.J(str, 7);
        }
    }
}
