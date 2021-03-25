package b.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import b.a.a.w.t;
import b.a.a.x.h;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieTask;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, m<d>> f1879a = new HashMap();

    public static m<d> p(Context context, String url) {
        return q(context, url, "url_" + url);
    }

    public class c implements Callable<l<d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1882a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f1883b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f1884c;

        public c(Context context, String str, String str2) {
            this.f1882a = context;
            this.f1883b = str;
            this.f1884c = str2;
        }

        /* renamed from: a */
        public l<d> call() {
            return b.a.a.v.c.e(this.f1882a, this.f1883b, this.f1884c);
        }
    }

    public static m<d> q(Context context, String url, String cacheKey) {
        return b(cacheKey, new c(context, url, cacheKey));
    }

    public static m<d> d(Context context, String fileName) {
        return e(context, fileName, "asset_" + fileName);
    }

    public class d implements Callable<l<d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1885a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f1886b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f1887c;

        public d(Context context, String str, String str2) {
            this.f1885a = context;
            this.f1886b = str;
            this.f1887c = str2;
        }

        /* renamed from: a */
        public l<d> call() {
            return e.f(this.f1885a, this.f1886b, this.f1887c);
        }
    }

    public static m<d> e(Context context, String fileName, String cacheKey) {
        return b(cacheKey, new d(context.getApplicationContext(), fileName, cacheKey));
    }

    public static l<d> f(Context context, String fileName, String cacheKey) {
        try {
            if (fileName.endsWith(".zip")) {
                return r(new ZipInputStream(context.getAssets().open(fileName)), cacheKey);
            }
            return h(context.getAssets().open(fileName), cacheKey);
        } catch (IOException e2) {
            return new l<>(e2);
        }
    }

    public static m<d> l(Context context, int rawRes) {
        return m(context, rawRes, u(context, rawRes));
    }

    public static m<d> m(Context context, int rawRes, String cacheKey) {
        return b(cacheKey, new CallableC0043e(new WeakReference<>(context), context.getApplicationContext(), rawRes));
    }

    /* renamed from: b.a.a.e$e  reason: collision with other inner class name */
    public class CallableC0043e implements Callable<l<d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1888a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f1889b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f1890c;

        public CallableC0043e(WeakReference weakReference, Context context, int i) {
            this.f1888a = weakReference;
            this.f1889b = context;
            this.f1890c = i;
        }

        /* renamed from: a */
        public l<d> call() {
            Context originalContext = (Context) this.f1888a.get();
            return e.n(originalContext != null ? originalContext : this.f1889b, this.f1890c);
        }
    }

    public static l<d> n(Context context, int rawRes) {
        return o(context, rawRes, u(context, rawRes));
    }

    public static l<d> o(Context context, int rawRes, String cacheKey) {
        try {
            return h(context.getResources().openRawResource(rawRes), cacheKey);
        } catch (Resources.NotFoundException e2) {
            return new l<>(e2);
        }
    }

    public static String u(Context context, int resId) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(t(context) ? "_night_" : "_day_");
        sb.append(resId);
        return sb.toString();
    }

    public static boolean t(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public class f implements Callable<l<d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f1891a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f1892b;

        public f(InputStream inputStream, String str) {
            this.f1891a = inputStream;
            this.f1892b = str;
        }

        /* renamed from: a */
        public l<d> call() {
            return e.h(this.f1891a, this.f1892b);
        }
    }

    public static m<d> g(InputStream stream, String cacheKey) {
        return b(cacheKey, new f(stream, cacheKey));
    }

    public static l<d> h(InputStream stream, String cacheKey) {
        return i(stream, cacheKey, true);
    }

    public static l<d> i(InputStream stream, String cacheKey, boolean close) {
        try {
            return j(b.a.a.w.k0.c.r(e.e.a(e.e.c(stream))), cacheKey);
        } finally {
            if (close) {
                h.c(stream);
            }
        }
    }

    public static l<d> j(b.a.a.w.k0.c reader, String cacheKey) {
        return k(reader, cacheKey, true);
    }

    public static l<d> k(b.a.a.w.k0.c reader, String cacheKey, boolean close) {
        try {
            d composition = t.a(reader);
            if (cacheKey != null) {
                b.a.a.u.g.b().c(cacheKey, composition);
            }
            l<d> lVar = new l<>(composition);
            if (close) {
                h.c(reader);
            }
            return lVar;
        } catch (Exception e2) {
            l<d> lVar2 = new l<>(e2);
            if (close) {
                h.c(reader);
            }
            return lVar2;
        } catch (Throwable th) {
            if (close) {
                h.c(reader);
            }
            throw th;
        }
    }

    public static l<d> r(ZipInputStream inputStream, String cacheKey) {
        try {
            return s(inputStream, cacheKey);
        } finally {
            h.c(inputStream);
        }
    }

    public static l<d> s(ZipInputStream inputStream, String cacheKey) {
        d composition = null;
        Map<String, Bitmap> images = new HashMap<>();
        try {
            ZipEntry entry = inputStream.getNextEntry();
            while (entry != null) {
                String entryName = entry.getName();
                if (entryName.contains("__MACOSX")) {
                    inputStream.closeEntry();
                } else if (entry.getName().contains(".json")) {
                    composition = k(b.a.a.w.k0.c.r(e.e.a(e.e.c(inputStream))), null, false).b();
                } else {
                    if (!entryName.contains(".png")) {
                        if (!entryName.contains(".webp")) {
                            inputStream.closeEntry();
                        }
                    }
                    String[] splitName = entryName.split("/");
                    images.put(splitName[splitName.length - 1], BitmapFactory.decodeStream(inputStream));
                }
                entry = inputStream.getNextEntry();
            }
            if (composition == null) {
                return new l<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry<String, Bitmap> e2 : images.entrySet()) {
                g imageAsset = c(composition, e2.getKey());
                if (imageAsset != null) {
                    imageAsset.f(h.l(e2.getValue(), imageAsset.e(), imageAsset.c()));
                }
            }
            for (Map.Entry<String, LottieImageAsset> entry2 : composition.i().entrySet()) {
                if (((g) entry2.getValue()).a() == null) {
                    return new l<>(new IllegalStateException("There is no image for " + ((g) entry2.getValue()).b()));
                }
            }
            if (cacheKey != null) {
                b.a.a.u.g.b().c(cacheKey, composition);
            }
            return new l<>(composition);
        } catch (IOException e3) {
            return new l<>(e3);
        }
    }

    public static g c(d composition, String fileName) {
        for (g asset : composition.i().values()) {
            if (asset.b().equals(fileName)) {
                return asset;
            }
        }
        return null;
    }

    public static m<d> b(String cacheKey, Callable<l<d>> callable) {
        d cachedComposition = cacheKey == null ? null : b.a.a.u.g.b().a(cacheKey);
        if (cachedComposition != null) {
            return new m<>(new g(cachedComposition));
        }
        if (cacheKey != null && f1879a.containsKey(cacheKey)) {
            return f1879a.get(cacheKey);
        }
        LottieTask<LottieComposition> task = new m<>(callable);
        if (cacheKey != null) {
            task.f(new a(cacheKey));
            task.e(new b(cacheKey));
            f1879a.put(cacheKey, task);
        }
        return task;
    }

    public class g implements Callable<l<d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f1893a;

        public g(d dVar) {
            this.f1893a = dVar;
        }

        /* renamed from: a */
        public l<d> call() {
            return new l<>(this.f1893a);
        }
    }

    public class a implements h<d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1880a;

        public a(String str) {
            this.f1880a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // b.a.a.h
        public /* bridge */ /* synthetic */ void a(d dVar) {
            b();
        }

        public void b() {
            e.f1879a.remove(this.f1880a);
        }
    }

    public class b implements h<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1881a;

        public b(String str) {
            this.f1881a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // b.a.a.h
        public /* bridge */ /* synthetic */ void a(Throwable th) {
            b();
        }

        public void b() {
            e.f1879a.remove(this.f1881a);
        }
    }
}
