package b.a.a.s;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

public class a extends Paint {
    public a() {
    }

    public a(int flags) {
        super(flags);
    }

    public a(PorterDuff.Mode porterDuffMode) {
        setXfermode(new PorterDuffXfermode(porterDuffMode));
    }

    public a(int flags, PorterDuff.Mode porterDuffMode) {
        super(flags);
        setXfermode(new PorterDuffXfermode(porterDuffMode));
    }

    public void setTextLocales(LocaleList locales) {
    }
}
