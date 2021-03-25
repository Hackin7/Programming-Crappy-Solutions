package a.h.f;

import a.e.e;
import a.h.e.c.c;
import a.h.e.c.f;
import a.h.j.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

@SuppressLint({"NewApi"})
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final j f820a;

    /* renamed from: b  reason: collision with root package name */
    public static final e<String, Typeface> f821b = new e<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f820a = new i();
        } else if (i >= 28) {
            f820a = new h();
        } else if (i >= 26) {
            f820a = new g();
        } else if (i < 24 || !f.i()) {
            f820a = new e();
        } else {
            f820a = new f();
        }
    }

    public static Typeface f(Resources resources, int id, int style) {
        return f821b.c(e(resources, id, style));
    }

    public static String e(Resources resources, int id, int style) {
        return resources.getResourcePackageName(id) + "-" + id + "-" + style;
    }

    public static Typeface c(Context context, c.a entry, Resources resources, int id, int style, f.a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Typeface typeface;
        boolean isBlocking;
        int timeout;
        if (entry instanceof c.d) {
            c.d providerEntry = (c.d) entry;
            if (isRequestFromLayoutInflator) {
                isBlocking = providerEntry.a() == 0;
            } else {
                isBlocking = fontCallback == null;
            }
            if (isRequestFromLayoutInflator) {
                timeout = providerEntry.c();
            } else {
                timeout = -1;
            }
            typeface = b.g(context, providerEntry.b(), fontCallback, handler, isBlocking, timeout, style);
        } else {
            typeface = f820a.a(context, (c.b) entry, resources, style);
            if (fontCallback != null) {
                if (typeface != null) {
                    fontCallback.b(typeface, handler);
                } else {
                    fontCallback.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f821b.d(e(resources, id, style), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int id, String path, int style) {
        Typeface typeface = f820a.d(context, resources, id, path, style);
        if (typeface != null) {
            f821b.d(e(resources, id, style), typeface);
        }
        return typeface;
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        return f820a.b(context, cancellationSignal, fonts, style);
    }

    public static Typeface a(Context context, Typeface family, int style) {
        if (context != null) {
            return Typeface.create(family, style);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
