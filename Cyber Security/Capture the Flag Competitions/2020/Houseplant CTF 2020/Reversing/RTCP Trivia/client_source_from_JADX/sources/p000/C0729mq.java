package p000;

import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mq */
public final class C0729mq {

    /* renamed from: a */
    private static final byte[] f3125a = {42};

    /* renamed from: b */
    private static final String[] f3126b = new String[0];

    /* renamed from: c */
    private static final String[] f3127c = {"*"};

    /* renamed from: d */
    private static final C0729mq f3128d = new C0729mq();

    /* renamed from: e */
    private final AtomicBoolean f3129e = new AtomicBoolean(false);

    /* renamed from: f */
    private final CountDownLatch f3130f = new CountDownLatch(1);

    /* renamed from: g */
    private byte[] f3131g;

    /* renamed from: h */
    private byte[] f3132h;

    /* renamed from: a */
    private static String m2285a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        byte b;
        int i3;
        int length = bArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 >= 0 && bArr[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z) {
                    b = 46;
                    z = false;
                } else {
                    b = bArr2[i9][i10] & 255;
                }
                i3 = b - (bArr[i6 + i11] & 255);
                if (i3 != 0) {
                    break;
                }
                i11++;
                i10++;
                if (i11 != i8) {
                    if (bArr2[i9].length == i10) {
                        if (i9 == bArr2.length - 1) {
                            break;
                        }
                        i9++;
                        i10 = -1;
                        z = true;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr2[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr, i6, i8, C0633kv.f2736e);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }

    /* renamed from: a */
    public static C0729mq m2286a() {
        return f3128d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r0 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r0 == false) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x00b1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093 A[LOOP:2: B:51:0x0090->B:53:0x0093, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d3 A[LOOP:5: B:71:0x00d3->B:75:0x00e0, LOOP_START, PHI: r1 
      PHI: (r1v3 int) = (r1v0 int), (r1v4 int) binds: [B:70:0x00d1, B:75:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] m2287a(java.lang.String[] r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f3129e
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0079
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f3129e
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0079
            r0 = r1
        L_0x0013:
            java.lang.Class<mq> r3 = p000.C0729mq.class
            java.lang.String r4 = "publicsuffixes.gz"
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            if (r3 == 0) goto L_0x0053
            nj r4 = new nj     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            ns r3 = p000.C0768nl.m2510a(r3)     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            r4.<init>(r3)     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            ne r3 = p000.C0768nl.m2508a(r4)     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            int r4 = r3.mo2644h()     // Catch:{ all -> 0x004e }
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x004e }
            r3.mo2616a(r4)     // Catch:{ all -> 0x004e }
            int r5 = r3.mo2644h()     // Catch:{ all -> 0x004e }
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x004e }
            r3.mo2616a(r5)     // Catch:{ all -> 0x004e }
            p000.C0633kv.m1972a(r3)     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            monitor-enter(r7)     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            r7.f3131g = r4     // Catch:{ all -> 0x004b }
            r7.f3132h = r5     // Catch:{ all -> 0x004b }
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            java.util.concurrent.CountDownLatch r3 = r7.f3130f     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            r3.countDown()     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            goto L_0x0053
        L_0x004b:
            r3 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            throw r3     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        L_0x004e:
            r4 = move-exception
            p000.C0633kv.m1972a(r3)     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
            throw r4     // Catch:{ InterruptedIOException -> 0x0077, IOException -> 0x005f }
        L_0x0053:
            if (r0 == 0) goto L_0x007e
        L_0x0055:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x007e
        L_0x005d:
            r8 = move-exception
            goto L_0x006d
        L_0x005f:
            r3 = move-exception
            mp r4 = p000.C0728mp.m2273c()     // Catch:{ all -> 0x005d }
            r5 = 5
            java.lang.String r6 = "Failed to read public suffix list"
            r4.mo2541a(r5, r6, r3)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x007e
            goto L_0x0055
        L_0x006d:
            if (r0 == 0) goto L_0x0076
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0076:
            throw r8
        L_0x0077:
            r0 = r2
            goto L_0x0013
        L_0x0079:
            java.util.concurrent.CountDownLatch r0 = r7.f3130f     // Catch:{ InterruptedException -> 0x007e }
            r0.await()     // Catch:{ InterruptedException -> 0x007e }
        L_0x007e:
            monitor-enter(r7)
            byte[] r0 = r7.f3131g     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x008b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r8.<init>(r0)     // Catch:{ all -> 0x011e }
            throw r8     // Catch:{ all -> 0x011e }
        L_0x008b:
            monitor-exit(r7)     // Catch:{ all -> 0x011e }
            int r0 = r8.length
            byte[][] r0 = new byte[r0][]
            r3 = r1
        L_0x0090:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x00a0
            r4 = r8[r3]
            java.nio.charset.Charset r5 = p000.C0633kv.f2736e
            byte[] r4 = r4.getBytes(r5)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x0090
        L_0x00a0:
            r8 = r1
        L_0x00a1:
            r3 = 0
            int r4 = r0.length
            if (r8 >= r4) goto L_0x00b1
            byte[] r4 = r7.f3131g
            java.lang.String r4 = m2285a(r4, r0, r8)
            if (r4 == 0) goto L_0x00ae
            goto L_0x00b2
        L_0x00ae:
            int r8 = r8 + 1
            goto L_0x00a1
        L_0x00b1:
            r4 = r3
        L_0x00b2:
            int r8 = r0.length
            if (r8 <= r2) goto L_0x00d0
            java.lang.Object r8 = r0.clone()
            byte[][] r8 = (byte[][]) r8
            r5 = r1
        L_0x00bc:
            int r6 = r8.length
            int r6 = r6 - r2
            if (r5 >= r6) goto L_0x00d0
            byte[] r6 = f3125a
            r8[r5] = r6
            byte[] r6 = r7.f3131g
            java.lang.String r6 = m2285a(r6, r8, r5)
            if (r6 == 0) goto L_0x00cd
            goto L_0x00d1
        L_0x00cd:
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00d0:
            r6 = r3
        L_0x00d1:
            if (r6 == 0) goto L_0x00e3
        L_0x00d3:
            int r8 = r0.length
            int r8 = r8 - r2
            if (r1 >= r8) goto L_0x00e3
            byte[] r8 = r7.f3132h
            java.lang.String r8 = m2285a(r8, r0, r1)
            if (r8 == 0) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            int r1 = r1 + 1
            goto L_0x00d3
        L_0x00e3:
            r8 = r3
        L_0x00e4:
            if (r8 == 0) goto L_0x00fb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "!"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "\\."
            java.lang.String[] r8 = r8.split(r0)
            return r8
        L_0x00fb:
            if (r4 != 0) goto L_0x0102
            if (r6 != 0) goto L_0x0102
            java.lang.String[] r8 = f3127c
            return r8
        L_0x0102:
            if (r4 == 0) goto L_0x010b
            java.lang.String r8 = "\\."
            java.lang.String[] r8 = r4.split(r8)
            goto L_0x010d
        L_0x010b:
            java.lang.String[] r8 = f3126b
        L_0x010d:
            if (r6 == 0) goto L_0x0116
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r6.split(r0)
            goto L_0x0118
        L_0x0116:
            java.lang.String[] r0 = f3126b
        L_0x0118:
            int r1 = r8.length
            int r2 = r0.length
            if (r1 <= r2) goto L_0x011d
            return r8
        L_0x011d:
            return r0
        L_0x011e:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x011e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0729mq.m2287a(java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: a */
    public final String mo2561a(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] a = m2287a(split);
        if (split.length == a.length && a[0].charAt(0) != '!') {
            return null;
        }
        if (a[0].charAt(0) == '!') {
            length = split.length;
            length2 = a.length;
        } else {
            length = split.length;
            length2 = a.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i = length - length2; i < split2.length; i++) {
            sb.append(split2[i]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
