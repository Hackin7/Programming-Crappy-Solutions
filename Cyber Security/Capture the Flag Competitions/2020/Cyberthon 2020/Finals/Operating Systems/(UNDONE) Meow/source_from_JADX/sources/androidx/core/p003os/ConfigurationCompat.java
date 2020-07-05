package androidx.core.p003os;

import android.content.res.Configuration;
import android.os.Build.VERSION;

/* renamed from: androidx.core.os.ConfigurationCompat */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    public static LocaleListCompat getLocales(Configuration configuration) {
        if (VERSION.SDK_INT >= 24) {
            return LocaleListCompat.wrap(configuration.getLocales());
        }
        return LocaleListCompat.create(configuration.locale);
    }
}
