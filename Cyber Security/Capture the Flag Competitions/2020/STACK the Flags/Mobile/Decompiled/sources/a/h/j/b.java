package a.h.j;

import a.h.e.c.f;
import a.h.f.k;
import a.h.j.c;
import a.h.l.h;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.SelfDestructiveThread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a.e.e<String, Typeface> f853a = new a.e.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final c f854b = new c("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f855c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final a.e.g<String, ArrayList<c.d<g>>> f856d = new a.e.g<>();

    /* renamed from: e  reason: collision with root package name */
    public static final Comparator<byte[]> f857e = new d();

    public static g f(Context context, a request, int style) {
        try {
            e result = c(context, null, request);
            int resultCode = -3;
            if (result.b() == 0) {
                Typeface typeface = a.h.f.d.b(context, null, result.a(), style);
                if (typeface != null) {
                    resultCode = 0;
                }
                return new g(typeface, resultCode);
            }
            if (result.b() == 1) {
                resultCode = -2;
            }
            return new g(null, resultCode);
        } catch (PackageManager.NameNotFoundException e2) {
            return new g(null, -1);
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f872a;

        /* renamed from: b  reason: collision with root package name */
        public final int f873b;

        public g(Typeface typeface, int result) {
            this.f872a = typeface;
            this.f873b = result;
        }
    }

    public static Typeface g(Context context, a request, f.a fontCallback, Handler handler, boolean isBlockingFetch, int timeout, int style) {
        SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult> reply;
        String id = request.c() + "-" + style;
        Typeface cached = f853a.c(id);
        if (cached != null) {
            if (fontCallback != null) {
                fontCallback.d(cached);
            }
            return cached;
        } else if (!isBlockingFetch || timeout != -1) {
            a aVar = new a(context, request, style, id);
            if (isBlockingFetch) {
                try {
                    return ((g) f854b.e(aVar, timeout)).f872a;
                } catch (InterruptedException e2) {
                    return null;
                }
            } else {
                if (fontCallback == null) {
                    reply = null;
                } else {
                    reply = new C0019b(fontCallback, handler);
                }
                synchronized (f855c) {
                    ArrayList<SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult>> pendingReplies = f856d.get(id);
                    if (pendingReplies != null) {
                        if (reply != null) {
                            pendingReplies.add(reply);
                        }
                        return null;
                    }
                    if (reply != null) {
                        ArrayList<SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult>> pendingReplies2 = new ArrayList<>();
                        pendingReplies2.add(reply);
                        f856d.put(id, pendingReplies2);
                    }
                    f854b.d(aVar, new c(id));
                    return null;
                }
            }
        } else {
            g typefaceResult = f(context, request, style);
            if (fontCallback != null) {
                int i = typefaceResult.f873b;
                if (i == 0) {
                    fontCallback.b(typefaceResult.f872a, handler);
                } else {
                    fontCallback.a(i, handler);
                }
            }
            return typefaceResult.f872a;
        }
    }

    public class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f858a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f859b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f860c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f861d;

        public a(Context context, a aVar, int i, String str) {
            this.f858a = context;
            this.f859b = aVar;
            this.f860c = i;
            this.f861d = str;
        }

        /* renamed from: a */
        public g call() {
            g typeface = b.f(this.f858a, this.f859b, this.f860c);
            Typeface typeface2 = typeface.f872a;
            if (typeface2 != null) {
                b.f853a.d(this.f861d, typeface2);
            }
            return typeface;
        }
    }

    /* renamed from: a.h.j.b$b  reason: collision with other inner class name */
    public class C0019b implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f.a f862a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Handler f863b;

        public C0019b(f.a aVar, Handler handler) {
            this.f862a = aVar;
            this.f863b = handler;
        }

        /* renamed from: b */
        public void a(g typeface) {
            if (typeface == null) {
                this.f862a.a(1, this.f863b);
                return;
            }
            int i = typeface.f873b;
            if (i == 0) {
                this.f862a.b(typeface.f872a, this.f863b);
            } else {
                this.f862a.a(i, this.f863b);
            }
        }
    }

    public class c implements c.d<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f864a;

        public c(String str) {
            this.f864a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((a.h.j.c.d) r1.get(r0)).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        public void a(g typeface) {
            synchronized (b.f855c) {
                ArrayList<SelfDestructiveThread.ReplyCallback<FontsContractCompat.TypefaceResult>> replies = b.f856d.get(this.f864a);
                if (replies != null) {
                    b.f856d.remove(this.f864a);
                }
            }
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f867a;

        /* renamed from: b  reason: collision with root package name */
        public final int f868b;

        /* renamed from: c  reason: collision with root package name */
        public final int f869c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f870d;

        /* renamed from: e  reason: collision with root package name */
        public final int f871e;

        public f(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
            h.b(uri);
            this.f867a = uri;
            this.f868b = ttcIndex;
            this.f869c = weight;
            this.f870d = italic;
            this.f871e = resultCode;
        }

        public Uri c() {
            return this.f867a;
        }

        public int b() {
            return this.f868b;
        }

        public int d() {
            return this.f869c;
        }

        public boolean e() {
            return this.f870d;
        }

        public int a() {
            return this.f871e;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f865a;

        /* renamed from: b  reason: collision with root package name */
        public final f[] f866b;

        public e(int statusCode, f[] fonts) {
            this.f865a = statusCode;
            this.f866b = fonts;
        }

        public int b() {
            return this.f865a;
        }

        public f[] a() {
            return this.f866b;
        }
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fonts, CancellationSignal cancellationSignal) {
        HashMap<Uri, ByteBuffer> out = new HashMap<>();
        for (f font : fonts) {
            if (font.a() == 0) {
                Uri uri = font.c();
                if (!out.containsKey(uri)) {
                    out.put(uri, k.f(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(out);
    }

    public static e c(Context context, CancellationSignal cancellationSignal, a request) {
        ProviderInfo providerInfo = h(context.getPackageManager(), request, context.getResources());
        if (providerInfo == null) {
            return new e(1, null);
        }
        return new e(0, e(context, request, providerInfo.authority, cancellationSignal));
    }

    public static ProviderInfo h(PackageManager packageManager, a request, Resources resources) {
        String providerAuthority = request.d();
        ProviderInfo info = packageManager.resolveContentProvider(providerAuthority, 0);
        if (info == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        } else if (info.packageName.equals(request.e())) {
            List<byte[]> signatures = a(packageManager.getPackageInfo(info.packageName, 64).signatures);
            Collections.sort(signatures, f857e);
            List<List<byte[]>> requestCertificatesList = d(request, resources);
            for (int i = 0; i < requestCertificatesList.size(); i++) {
                List<byte[]> requestSignatures = new ArrayList<>(requestCertificatesList.get(i));
                Collections.sort(requestSignatures, f857e);
                if (b(signatures, requestSignatures)) {
                    return info;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.e());
        }
    }

    public static List<List<byte[]>> d(a request, Resources resources) {
        if (request.a() != null) {
            return request.a();
        }
        return a.h.e.c.c.c(resources, request.b());
    }

    public class d implements Comparator<byte[]> {
        /* renamed from: a */
        public int compare(byte[] l, byte[] r) {
            if (l.length != r.length) {
                return l.length - r.length;
            }
            for (int i = 0; i < l.length; i++) {
                if (l[i] != r[i]) {
                    return l[i] - r[i];
                }
            }
            return 0;
        }
    }

    public static boolean b(List<byte[]> signatures, List<byte[]> requestSignatures) {
        if (signatures.size() != requestSignatures.size()) {
            return false;
        }
        for (int i = 0; i < signatures.size(); i++) {
            if (!Arrays.equals(signatures.get(i), requestSignatures.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List<byte[]> a(Signature[] signatures) {
        List<byte[]> shas = new ArrayList<>();
        for (Signature signature : signatures) {
            shas.add(signature.toByteArray());
        }
        return shas;
    }

    public static f[] e(Context context, a request, String authority, CancellationSignal cancellationSignal) {
        Uri fileUri;
        ArrayList<FontsContractCompat.FontInfo> result = new ArrayList<>();
        Uri uri = new Uri.Builder().scheme("content").authority(authority).build();
        Uri fileBaseUri = new Uri.Builder().scheme("content").authority(authority).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{request.f()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int resultCodeColumnIndex = cursor.getColumnIndex("result_code");
                result = new ArrayList<>();
                int idColumnIndex = cursor.getColumnIndex("_id");
                int fileIdColumnIndex = cursor.getColumnIndex("file_id");
                int ttcIndexColumnIndex = cursor.getColumnIndex("font_ttc_index");
                int weightColumnIndex = cursor.getColumnIndex("font_weight");
                int italicColumnIndex = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int resultCode = resultCodeColumnIndex != -1 ? cursor.getInt(resultCodeColumnIndex) : 0;
                    int ttcIndex = ttcIndexColumnIndex != -1 ? cursor.getInt(ttcIndexColumnIndex) : 0;
                    if (fileIdColumnIndex == -1) {
                        fileUri = ContentUris.withAppendedId(uri, cursor.getLong(idColumnIndex));
                    } else {
                        fileUri = ContentUris.withAppendedId(fileBaseUri, cursor.getLong(fileIdColumnIndex));
                    }
                    result.add(new f(fileUri, ttcIndex, weightColumnIndex != -1 ? cursor.getInt(weightColumnIndex) : 400, italicColumnIndex != -1 && cursor.getInt(italicColumnIndex) == 1, resultCode));
                }
            }
            return (f[]) result.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
