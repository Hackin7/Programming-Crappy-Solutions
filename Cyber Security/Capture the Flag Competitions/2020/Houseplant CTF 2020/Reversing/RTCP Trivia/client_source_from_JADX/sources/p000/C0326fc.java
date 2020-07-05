package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: fc */
public final class C0326fc {

    /* renamed from: fc$a */
    public static abstract class C0327a {
        /* renamed from: a */
        public final void mo1696a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                }
            });
        }

        /* renamed from: a */
        public abstract void mo1074a(Typeface typeface);

        /* renamed from: a */
        public final void mo1697a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                    C0327a.this.mo1074a(typeface);
                }
            });
        }
    }

    /* renamed from: a */
    public static Typeface m1071a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0327a aVar) {
        StringBuilder sb;
        String str;
        if (typedValue.string == null) {
            StringBuilder sb2 = new StringBuilder("Resource \"");
            sb2.append(resources.getResourceName(i));
            sb2.append("\" (");
            sb2.append(Integer.toHexString(i));
            sb2.append(") is not a Font: ");
            sb2.append(typedValue);
            throw new NotFoundException(sb2.toString());
        }
        String charSequence = typedValue.string.toString();
        if (!charSequence.startsWith("res/")) {
            aVar.mo1696a(-3, (Handler) null);
            return null;
        }
        Typeface a = C0335fg.m1102a(resources, i, i2);
        if (a != null) {
            aVar.mo1697a(a, (Handler) null);
            return a;
        }
        try {
            if (charSequence.toLowerCase().endsWith(".xml")) {
                C0318a a2 = C0317ez.m1060a((XmlPullParser) resources.getXml(i), resources);
                if (a2 != null) {
                    return C0335fg.m1100a(context, a2, resources, i, i2, aVar);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                aVar.mo1696a(-3, (Handler) null);
                return null;
            }
            Typeface a3 = C0335fg.m1099a(context, resources, i, charSequence, i2);
            if (a3 != null) {
                aVar.mo1697a(a3, (Handler) null);
                return a3;
            }
            aVar.mo1696a(-3, (Handler) null);
            return a3;
        } catch (XmlPullParserException e) {
            e = e;
            str = "ResourcesCompat";
            sb = new StringBuilder("Failed to parse xml resource ");
            sb.append(charSequence);
            Log.e(str, sb.toString(), e);
            aVar.mo1696a(-3, (Handler) null);
            return null;
        } catch (IOException e2) {
            e = e2;
            str = "ResourcesCompat";
            sb = new StringBuilder("Failed to read xml resource ");
            sb.append(charSequence);
            Log.e(str, sb.toString(), e);
            aVar.mo1696a(-3, (Handler) null);
            return null;
        }
    }
}
