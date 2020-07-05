package p000;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: fh */
class C0336fh extends C0340fl {
    C0336fh() {
    }

    /* renamed from: a */
    private static File m1104a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005a, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005b, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x005f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0060, code lost:
        r2 = r6;
        r6 = r4;
        r4 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0015] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo1701a(android.content.Context r4, p000.C0357fw.C0363b[] r5, int r6) {
        /*
            r3 = this;
            r0 = 0
            int r1 = r5.length
            if (r1 > 0) goto L_0x0005
            return r0
        L_0x0005:
            fw$b r5 = r3.mo1706a(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f1670a     // Catch:{ IOException -> 0x0074 }
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r1, r0)     // Catch:{ IOException -> 0x0074 }
            java.io.File r6 = m1104a(r5)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r6 == 0) goto L_0x002c
            boolean r1 = r6.canRead()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r1 != 0) goto L_0x0022
            goto L_0x002c
        L_0x0022:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r5 == 0) goto L_0x002b
            r5.close()     // Catch:{ IOException -> 0x0074 }
        L_0x002b:
            return r4
        L_0x002c:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            java.io.FileDescriptor r1 = r5.getFileDescriptor()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            r6.<init>(r1)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            android.graphics.Typeface r4 = p000.C0340fl.m1125a(r4, r6)     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
            r6.close()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r5 == 0) goto L_0x0041
            r5.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0041:
            return r4
        L_0x0042:
            r4 = move-exception
            r1 = r0
            goto L_0x004b
        L_0x0045:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            r2 = r1
            r1 = r4
            r4 = r2
        L_0x004b:
            if (r1 == 0) goto L_0x0056
            r6.close()     // Catch:{ Throwable -> 0x0051, all -> 0x005a }
            goto L_0x0059
        L_0x0051:
            r6 = move-exception
            r1.addSuppressed(r6)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            goto L_0x0059
        L_0x0056:
            r6.close()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
        L_0x0059:
            throw r4     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
        L_0x005a:
            r4 = move-exception
            r6 = r0
            goto L_0x0063
        L_0x005d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005f:
            r6 = move-exception
            r2 = r6
            r6 = r4
            r4 = r2
        L_0x0063:
            if (r5 == 0) goto L_0x0073
            if (r6 == 0) goto L_0x0070
            r5.close()     // Catch:{ Throwable -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ IOException -> 0x0074 }
            goto L_0x0073
        L_0x0070:
            r5.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0073:
            throw r4     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0336fh.mo1701a(android.content.Context, fw$b[], int):android.graphics.Typeface");
    }
}
