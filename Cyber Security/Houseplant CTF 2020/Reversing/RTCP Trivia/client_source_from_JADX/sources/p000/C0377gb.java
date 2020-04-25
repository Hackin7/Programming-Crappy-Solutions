package p000;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: gb */
public final class C0377gb {
    /* renamed from: a */
    public static int m1207a(Object... objArr) {
        return VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }
}
