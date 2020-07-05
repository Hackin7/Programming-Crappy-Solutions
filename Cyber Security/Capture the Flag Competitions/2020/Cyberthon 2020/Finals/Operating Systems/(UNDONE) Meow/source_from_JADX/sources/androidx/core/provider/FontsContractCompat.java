package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.provider.SelfDestructiveThread.ReplyCallback;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FontsContractCompat {
    private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;
    public static final String PARCEL_FONT_RESULTS = "font_results";
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
    private static final String TAG = "FontsContractCompat";
    private static final SelfDestructiveThread sBackgroundThread = new SelfDestructiveThread("fonts", 10, BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS);
    private static final Comparator<byte[]> sByteArrayComparator = new Comparator<byte[]>() {
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
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
    static final Object sLock = new Object();
    static final SimpleArrayMap<String, ArrayList<ReplyCallback<TypefaceResult>>> sPendingReplies = new SimpleArrayMap<>();
    static final LruCache<String, Typeface> sTypefaceCache = new LruCache<>(16);

    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final FontInfo[] mFonts;
        private final int mStatusCode;

        public FontFamilyResult(int i, FontInfo[] fontInfoArr) {
            this.mStatusCode = i;
            this.mFonts = fontInfoArr;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        public FontInfo[] getFonts() {
            return this.mFonts;
        }
    }

    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        public FontInfo(Uri uri, int i, int i2, boolean z, int i3) {
            this.mUri = (Uri) Preconditions.checkNotNull(uri);
            this.mTtcIndex = i;
            this.mWeight = i2;
            this.mItalic = z;
            this.mResultCode = i3;
        }

        public Uri getUri() {
            return this.mUri;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public int getResultCode() {
            return this.mResultCode;
        }
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        public static final int RESULT_OK = 0;

        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }

    private static final class TypefaceResult {
        final int mResult;
        final Typeface mTypeface;

        TypefaceResult(Typeface typeface, int i) {
            this.mTypeface = typeface;
            this.mResult = i;
        }
    }

    private FontsContractCompat() {
    }

    static TypefaceResult getFontInternal(Context context, FontRequest fontRequest, int i) {
        try {
            FontFamilyResult fetchFonts = fetchFonts(context, null, fontRequest);
            int i2 = -3;
            if (fetchFonts.getStatusCode() == 0) {
                Typeface createFromFontInfo = TypefaceCompat.createFromFontInfo(context, null, fetchFonts.getFonts(), i);
                if (createFromFontInfo != null) {
                    i2 = 0;
                }
                return new TypefaceResult(createFromFontInfo, i2);
            }
            if (fetchFonts.getStatusCode() == 1) {
                i2 = -2;
            }
            return new TypefaceResult(null, i2);
        } catch (NameNotFoundException unused) {
            return new TypefaceResult(null, -1);
        }
    }

    public static void resetCache() {
        sTypefaceCache.evictAll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        sBackgroundThread.postAndReply(r1, new androidx.core.provider.FontsContractCompat.C01243());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface getFontSync(final android.content.Context r2, final androidx.core.provider.FontRequest r3, final androidx.core.content.res.ResourcesCompat.FontCallback r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getIdentifier()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = sTypefaceCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.onFontRetrieved(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0045
            r1 = -1
            if (r7 != r1) goto L_0x0045
            androidx.core.provider.FontsContractCompat$TypefaceResult r2 = getFontInternal(r2, r3, r8)
            if (r4 == 0) goto L_0x0042
            int r3 = r2.mResult
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.mTypeface
            r4.callbackSuccessAsync(r3, r5)
            goto L_0x0042
        L_0x003d:
            int r3 = r2.mResult
            r4.callbackFailAsync(r3, r5)
        L_0x0042:
            android.graphics.Typeface r2 = r2.mTypeface
            return r2
        L_0x0045:
            androidx.core.provider.FontsContractCompat$1 r1 = new androidx.core.provider.FontsContractCompat$1
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0058
            androidx.core.provider.SelfDestructiveThread r3 = sBackgroundThread     // Catch:{ InterruptedException -> 0x0057 }
            java.lang.Object r3 = r3.postAndWait(r1, r7)     // Catch:{ InterruptedException -> 0x0057 }
            androidx.core.provider.FontsContractCompat$TypefaceResult r3 = (androidx.core.provider.FontsContractCompat.TypefaceResult) r3     // Catch:{ InterruptedException -> 0x0057 }
            android.graphics.Typeface r2 = r3.mTypeface     // Catch:{ InterruptedException -> 0x0057 }
        L_0x0057:
            return r2
        L_0x0058:
            if (r4 != 0) goto L_0x005c
            r3 = r2
            goto L_0x0061
        L_0x005c:
            androidx.core.provider.FontsContractCompat$2 r3 = new androidx.core.provider.FontsContractCompat$2
            r3.<init>(r4, r5)
        L_0x0061:
            java.lang.Object r4 = sLock
            monitor-enter(r4)
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread$ReplyCallback<androidx.core.provider.FontsContractCompat$TypefaceResult>>> r5 = sPendingReplies     // Catch:{ all -> 0x0096 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x007b
            if (r3 == 0) goto L_0x0079
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread$ReplyCallback<androidx.core.provider.FontsContractCompat$TypefaceResult>>> r5 = sPendingReplies     // Catch:{ all -> 0x0096 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0096 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0096 }
            r5.add(r3)     // Catch:{ all -> 0x0096 }
        L_0x0079:
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            return r2
        L_0x007b:
            if (r3 == 0) goto L_0x008a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0096 }
            r5.<init>()     // Catch:{ all -> 0x0096 }
            r5.add(r3)     // Catch:{ all -> 0x0096 }
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread$ReplyCallback<androidx.core.provider.FontsContractCompat$TypefaceResult>>> r3 = sPendingReplies     // Catch:{ all -> 0x0096 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0096 }
        L_0x008a:
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            androidx.core.provider.SelfDestructiveThread r3 = sBackgroundThread
            androidx.core.provider.FontsContractCompat$3 r4 = new androidx.core.provider.FontsContractCompat$3
            r4.<init>(r0)
            r3.postAndReply(r1, r4)
            return r2
        L_0x0096:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontsContractCompat.getFontSync(android.content.Context, androidx.core.provider.FontRequest, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    public static void requestFont(final Context context, final FontRequest fontRequest, final FontRequestCallback fontRequestCallback, Handler handler) {
        final Handler handler2 = new Handler();
        handler.post(new Runnable() {
            public void run() {
                try {
                    FontFamilyResult fetchFonts = FontsContractCompat.fetchFonts(context, null, fontRequest);
                    if (fetchFonts.getStatusCode() != 0) {
                        int statusCode = fetchFonts.getStatusCode();
                        if (statusCode == 1) {
                            handler2.post(new Runnable() {
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-2);
                                }
                            });
                        } else if (statusCode != 2) {
                            handler2.post(new Runnable() {
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                        } else {
                            handler2.post(new Runnable() {
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                        }
                    } else {
                        FontInfo[] fonts = fetchFonts.getFonts();
                        if (fonts == null || fonts.length == 0) {
                            handler2.post(new Runnable() {
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(1);
                                }
                            });
                            return;
                        }
                        for (FontInfo fontInfo : fonts) {
                            if (fontInfo.getResultCode() != 0) {
                                final int resultCode = fontInfo.getResultCode();
                                if (resultCode < 0) {
                                    handler2.post(new Runnable() {
                                        public void run() {
                                            fontRequestCallback.onTypefaceRequestFailed(-3);
                                        }
                                    });
                                } else {
                                    handler2.post(new Runnable() {
                                        public void run() {
                                            fontRequestCallback.onTypefaceRequestFailed(resultCode);
                                        }
                                    });
                                }
                                return;
                            }
                        }
                        final Typeface buildTypeface = FontsContractCompat.buildTypeface(context, null, fonts);
                        if (buildTypeface == null) {
                            handler2.post(new Runnable() {
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                        } else {
                            handler2.post(new Runnable() {
                                public void run() {
                                    fontRequestCallback.onTypefaceRetrieved(buildTypeface);
                                }
                            });
                        }
                    }
                } catch (NameNotFoundException unused) {
                    handler2.post(new Runnable() {
                        public void run() {
                            fontRequestCallback.onTypefaceRequestFailed(-1);
                        }
                    });
                }
            }
        });
    }

    public static Typeface buildTypeface(Context context, CancellationSignal cancellationSignal, FontInfo[] fontInfoArr) {
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (FontInfo fontInfo : fontInfoArr) {
            if (fontInfo.getResultCode() == 0) {
                Uri uri = fontInfo.getUri();
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, TypefaceCompatUtil.mmap(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static FontFamilyResult fetchFonts(Context context, CancellationSignal cancellationSignal, FontRequest fontRequest) throws NameNotFoundException {
        ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        if (provider == null) {
            return new FontFamilyResult(1, null);
        }
        return new FontFamilyResult(0, getFontFromProvider(context, fontRequest, provider.authority, cancellationSignal));
    }

    public static ProviderInfo getProvider(PackageManager packageManager, FontRequest fontRequest, Resources resources) throws NameNotFoundException {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(providerAuthority);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            List convertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(convertToByteArrayList, sByteArrayComparator);
            List certificates = getCertificates(fontRequest, resources);
            for (int i = 0; i < certificates.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) certificates.get(i));
                Collections.sort(arrayList, sByteArrayComparator);
                if (equalsByteArrayList(convertToByteArrayList, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(providerAuthority);
            sb2.append(", but package was not ");
            sb2.append(fontRequest.getProviderPackage());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
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

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.core.provider.FontsContractCompat.FontInfo[] getFontFromProvider(android.content.Context r19, androidx.core.provider.FontRequest r20, java.lang.String r21, android.os.CancellationSignal r22) {
        /*
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0137 }
            r5 = 16
            java.lang.String r7 = "font_variation_settings"
            r9 = 2
            r10 = 7
            java.lang.String r11 = "result_code"
            java.lang.String r12 = "font_italic"
            java.lang.String r13 = "font_weight"
            java.lang.String r14 = "font_ttc_index"
            java.lang.String r15 = "file_id"
            java.lang.String r3 = "_id"
            r6 = 1
            r8 = 0
            if (r4 <= r5) goto L_0x007e
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ all -> 0x0137 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0137 }
            r10[r8] = r3     // Catch:{ all -> 0x0137 }
            r10[r6] = r15     // Catch:{ all -> 0x0137 }
            r10[r9] = r14     // Catch:{ all -> 0x0137 }
            r5 = 3
            r10[r5] = r7     // Catch:{ all -> 0x0137 }
            r5 = 4
            r10[r5] = r13     // Catch:{ all -> 0x0137 }
            r5 = 5
            r10[r5] = r12     // Catch:{ all -> 0x0137 }
            r5 = 6
            r10[r5] = r11     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "query = ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = r20.getQuery()     // Catch:{ all -> 0x0137 }
            r9[r8] = r5     // Catch:{ all -> 0x0137 }
            r16 = 0
            r5 = r2
            r18 = r1
            r1 = 1
            r6 = r10
            r10 = 0
            r8 = r9
            r9 = r16
            r1 = 0
            r10 = r22
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0137 }
            goto L_0x00ab
        L_0x007e:
            r18 = r1
            r1 = 0
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ all -> 0x0137 }
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ all -> 0x0137 }
            r6[r1] = r3     // Catch:{ all -> 0x0137 }
            r5 = 1
            r6[r5] = r15     // Catch:{ all -> 0x0137 }
            r6[r9] = r14     // Catch:{ all -> 0x0137 }
            r5 = 3
            r6[r5] = r7     // Catch:{ all -> 0x0137 }
            r5 = 4
            r6[r5] = r13     // Catch:{ all -> 0x0137 }
            r5 = 5
            r6[r5] = r12     // Catch:{ all -> 0x0137 }
            r5 = 6
            r6[r5] = r11     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "query = ?"
            r5 = 1
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = r20.getQuery()     // Catch:{ all -> 0x0137 }
            r8[r1] = r5     // Catch:{ all -> 0x0137 }
            r9 = 0
            r5 = r2
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0137 }
        L_0x00ab:
            if (r4 == 0) goto L_0x0127
            int r5 = r4.getCount()     // Catch:{ all -> 0x0125 }
            if (r5 <= 0) goto L_0x0127
            int r5 = r4.getColumnIndex(r11)     // Catch:{ all -> 0x0125 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0125 }
            r6.<init>()     // Catch:{ all -> 0x0125 }
            int r3 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x0125 }
            int r7 = r4.getColumnIndex(r15)     // Catch:{ all -> 0x0125 }
            int r8 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x0125 }
            int r9 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x0125 }
            int r10 = r4.getColumnIndex(r12)     // Catch:{ all -> 0x0125 }
        L_0x00d0:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x0125 }
            if (r11 == 0) goto L_0x0129
            r11 = -1
            if (r5 == r11) goto L_0x00e0
            int r12 = r4.getInt(r5)     // Catch:{ all -> 0x0125 }
            r18 = r12
            goto L_0x00e2
        L_0x00e0:
            r18 = 0
        L_0x00e2:
            if (r8 == r11) goto L_0x00ea
            int r12 = r4.getInt(r8)     // Catch:{ all -> 0x0125 }
            r15 = r12
            goto L_0x00eb
        L_0x00ea:
            r15 = 0
        L_0x00eb:
            if (r7 != r11) goto L_0x00f6
            long r12 = r4.getLong(r3)     // Catch:{ all -> 0x0125 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r2, r12)     // Catch:{ all -> 0x0125 }
            goto L_0x00fe
        L_0x00f6:
            long r12 = r4.getLong(r7)     // Catch:{ all -> 0x0125 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch:{ all -> 0x0125 }
        L_0x00fe:
            r14 = r12
            if (r9 == r11) goto L_0x0108
            int r12 = r4.getInt(r9)     // Catch:{ all -> 0x0125 }
            r16 = r12
            goto L_0x010c
        L_0x0108:
            r12 = 400(0x190, float:5.6E-43)
            r16 = 400(0x190, float:5.6E-43)
        L_0x010c:
            if (r10 == r11) goto L_0x0118
            int r11 = r4.getInt(r10)     // Catch:{ all -> 0x0125 }
            r12 = 1
            if (r11 != r12) goto L_0x0119
            r17 = 1
            goto L_0x011b
        L_0x0118:
            r12 = 1
        L_0x0119:
            r17 = 0
        L_0x011b:
            androidx.core.provider.FontsContractCompat$FontInfo r11 = new androidx.core.provider.FontsContractCompat$FontInfo     // Catch:{ all -> 0x0125 }
            r13 = r11
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0125 }
            r6.add(r11)     // Catch:{ all -> 0x0125 }
            goto L_0x00d0
        L_0x0125:
            r0 = move-exception
            goto L_0x0139
        L_0x0127:
            r6 = r18
        L_0x0129:
            if (r4 == 0) goto L_0x012e
            r4.close()
        L_0x012e:
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r1]
            java.lang.Object[] r0 = r6.toArray(r0)
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
            return r0
        L_0x0137:
            r0 = move-exception
            r4 = 0
        L_0x0139:
            if (r4 == 0) goto L_0x013e
            r4.close()
        L_0x013e:
            goto L_0x0140
        L_0x013f:
            throw r0
        L_0x0140:
            goto L_0x013f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontsContractCompat.getFontFromProvider(android.content.Context, androidx.core.provider.FontRequest, java.lang.String, android.os.CancellationSignal):androidx.core.provider.FontsContractCompat$FontInfo[]");
    }
}
