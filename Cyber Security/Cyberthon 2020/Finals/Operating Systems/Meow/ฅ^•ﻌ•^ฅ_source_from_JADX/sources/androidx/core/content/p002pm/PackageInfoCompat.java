package androidx.core.content.p002pm;

import android.content.pm.PackageInfo;
import android.os.Build.VERSION;

/* renamed from: androidx.core.content.pm.PackageInfoCompat */
public final class PackageInfoCompat {
    public static long getLongVersionCode(PackageInfo packageInfo) {
        if (VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    private PackageInfoCompat() {
    }
}
