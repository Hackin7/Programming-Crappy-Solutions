package p000;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fw */
public final class C0357fw {

    /* renamed from: a */
    static final C0249di<String, Typeface> f1656a = new C0249di<>(16);

    /* renamed from: b */
    static final Object f1657b = new Object();

    /* renamed from: c */
    static final C0256dk<String, ArrayList<C0370a<C0364c>>> f1658c = new C0256dk<>();

    /* renamed from: d */
    private static final C0365fx f1659d = new C0365fx("fonts");

    /* renamed from: e */
    private static final Comparator<byte[]> f1660e = new Comparator<byte[]>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int i;
            int i2;
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    };

    /* renamed from: fw$a */
    public static class C0362a {

        /* renamed from: a */
        final int f1668a;

        /* renamed from: b */
        final C0363b[] f1669b;

        public C0362a(int i, C0363b[] bVarArr) {
            this.f1668a = i;
            this.f1669b = bVarArr;
        }
    }

    /* renamed from: fw$b */
    public static class C0363b {

        /* renamed from: a */
        public final Uri f1670a;

        /* renamed from: b */
        public final int f1671b;

        /* renamed from: c */
        public final int f1672c;

        /* renamed from: d */
        public final boolean f1673d;

        /* renamed from: e */
        final int f1674e;

        public C0363b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f1670a = (Uri) C0378gc.m1209a(uri);
            this.f1671b = i;
            this.f1672c = i2;
            this.f1673d = z;
            this.f1674e = i3;
        }
    }

    /* renamed from: fw$c */
    static final class C0364c {

        /* renamed from: a */
        final Typeface f1675a;

        /* renamed from: b */
        final int f1676b;

        C0364c(Typeface typeface, int i) {
            this.f1675a = typeface;
            this.f1676b = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        r3 = f1659d;
        r3.mo1758a(new p000.C0365fx.C03672(r3, r2, new android.os.Handler(), new p000.C0357fw.C03603()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m1172a(final android.content.Context r3, final p000.C0356fv r4, p000.C0326fc.C0327a r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.f1655f
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            di<java.lang.String, android.graphics.Typeface> r1 = f1656a
            java.lang.Object r1 = r1.mo1410a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r5 == 0) goto L_0x0025
            r5.mo1074a(r1)
        L_0x0025:
            return r1
        L_0x0026:
            r1 = 0
            if (r6 == 0) goto L_0x0044
            r2 = -1
            if (r7 != r2) goto L_0x0044
            fw$c r3 = m1173a(r3, r4, r8)
            if (r5 == 0) goto L_0x0041
            int r4 = r3.f1676b
            if (r4 != 0) goto L_0x003c
            android.graphics.Typeface r4 = r3.f1675a
            r5.mo1697a(r4, r1)
            goto L_0x0041
        L_0x003c:
            int r4 = r3.f1676b
            r5.mo1696a(r4, r1)
        L_0x0041:
            android.graphics.Typeface r3 = r3.f1675a
            return r3
        L_0x0044:
            fw$1 r2 = new fw$1
            r2.<init>(r3, r4, r8, r0)
            if (r6 == 0) goto L_0x0057
            fx r3 = f1659d     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Object r3 = r3.mo1757a(r2, r7)     // Catch:{ InterruptedException -> 0x0056 }
            fw$c r3 = (p000.C0357fw.C0364c) r3     // Catch:{ InterruptedException -> 0x0056 }
            android.graphics.Typeface r3 = r3.f1675a     // Catch:{ InterruptedException -> 0x0056 }
            return r3
        L_0x0056:
            return r1
        L_0x0057:
            if (r5 != 0) goto L_0x005b
            r3 = r1
            goto L_0x0060
        L_0x005b:
            fw$2 r3 = new fw$2
            r3.<init>(r5, r1)
        L_0x0060:
            java.lang.Object r4 = f1657b
            monitor-enter(r4)
            dk<java.lang.String, java.util.ArrayList<fx$a<fw$c>>> r5 = f1658c     // Catch:{ all -> 0x009f }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x007a
            if (r3 == 0) goto L_0x0078
            dk<java.lang.String, java.util.ArrayList<fx$a<fw$c>>> r5 = f1658c     // Catch:{ all -> 0x009f }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x009f }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x009f }
            r5.add(r3)     // Catch:{ all -> 0x009f }
        L_0x0078:
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            return r1
        L_0x007a:
            if (r3 == 0) goto L_0x0089
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            r5.add(r3)     // Catch:{ all -> 0x009f }
            dk<java.lang.String, java.util.ArrayList<fx$a<fw$c>>> r3 = f1658c     // Catch:{ all -> 0x009f }
            r3.put(r0, r5)     // Catch:{ all -> 0x009f }
        L_0x0089:
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            fx r3 = f1659d
            fw$3 r4 = new fw$3
            r4.<init>(r0)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            fx$2 r6 = new fx$2
            r6.<init>(r2, r5, r4)
            r3.mo1758a(r6)
            return r1
        L_0x009f:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0357fw.m1172a(android.content.Context, fv, fc$a, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    static C0364c m1173a(Context context, C0356fv fvVar, int i) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = fvVar.f1650a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                StringBuilder sb = new StringBuilder("No package found for authority: ");
                sb.append(str);
                throw new NameNotFoundException(sb.toString());
            } else if (!resolveContentProvider.packageName.equals(fvVar.f1651b)) {
                StringBuilder sb2 = new StringBuilder("Found content provider ");
                sb2.append(str);
                sb2.append(", but package was not ");
                sb2.append(fvVar.f1651b);
                throw new NameNotFoundException(sb2.toString());
            } else {
                List a = m1174a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a, f1660e);
                List<List<byte[]>> a2 = fvVar.f1653d != null ? fvVar.f1653d : C0317ez.m1061a(resources, fvVar.f1654e);
                int i2 = 0;
                while (true) {
                    if (i2 >= a2.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList = new ArrayList((Collection) a2.get(i2));
                    Collections.sort(arrayList, f1660e);
                    if (m1176a(a, (List<byte[]>) arrayList)) {
                        break;
                    }
                    i2++;
                }
                C0362a aVar = resolveContentProvider == null ? new C0362a(1, null) : new C0362a(0, m1177a(context, fvVar, resolveContentProvider.authority));
                int i3 = -3;
                if (aVar.f1668a == 0) {
                    Typeface a3 = C0335fg.m1101a(context, aVar.f1669b, i);
                    if (a3 != null) {
                        i3 = 0;
                    }
                    return new C0364c(a3, i3);
                }
                if (aVar.f1668a == 1) {
                    i3 = -2;
                }
                return new C0364c(null, i3);
            }
        } catch (NameNotFoundException unused) {
            return new C0364c(null, -1);
        }
    }

    /* renamed from: a */
    private static List<byte[]> m1174a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m1175a(Context context, C0363b[] bVarArr) {
        HashMap hashMap = new HashMap();
        for (C0363b bVar : bVarArr) {
            if (bVar.f1674e == 0) {
                Uri uri = bVar.f1670a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0344fm.m1139a(context, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m1176a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static C0363b[] m1177a(Context context, C0356fv fvVar, String str) {
        C0356fv fvVar2 = fvVar;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str2).build();
        Uri build2 = new Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i = 0;
            Cursor query = VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fvVar2.f1652c}, null, null) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fvVar2.f1652c}, null);
            if (query != null && query.getCount() > 0) {
                int columnIndex = query.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = query.getColumnIndex("_id");
                int columnIndex3 = query.getColumnIndex("file_id");
                int columnIndex4 = query.getColumnIndex("font_ttc_index");
                int columnIndex5 = query.getColumnIndex("font_weight");
                int columnIndex6 = query.getColumnIndex("font_italic");
                while (query.moveToNext()) {
                    int i2 = columnIndex != -1 ? query.getInt(columnIndex) : i;
                    C0363b bVar = new C0363b(columnIndex3 == -1 ? ContentUris.withAppendedId(build, query.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, query.getLong(columnIndex3)), columnIndex4 != -1 ? query.getInt(columnIndex4) : i, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, i2);
                    arrayList.add(bVar);
                    i = 0;
                }
            }
            if (query != null) {
                query.close();
            }
            return (C0363b[]) arrayList.toArray(new C0363b[0]);
        } catch (Throwable th) {
            Throwable th2 = th;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }
}
