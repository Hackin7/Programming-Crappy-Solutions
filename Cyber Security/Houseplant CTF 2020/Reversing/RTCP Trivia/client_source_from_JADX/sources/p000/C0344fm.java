package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/* renamed from: fm */
public final class C0344fm {
    /* renamed from: a */
    public static File m1137a(Context context) {
        StringBuilder sb = new StringBuilder(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        String sb2 = sb.toString();
        int i = 0;
        while (i < 100) {
            File cacheDir = context.getCacheDir();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(i);
            File file = new File(cacheDir, sb3.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static ByteBuffer m1138a(Context context, Resources resources, int i) {
        File a = m1137a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m1142a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = m1140a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        r8 = r1;
        r1 = r10;
        r10 = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m1139a(android.content.Context r9, android.net.Uri r10) {
        /*
            android.content.ContentResolver r9 = r9.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r9 = r9.openFileDescriptor(r10, r1, r0)     // Catch:{ IOException -> 0x0067 }
            if (r9 != 0) goto L_0x0013
            if (r9 == 0) goto L_0x0012
            r9.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.io.FileDescriptor r1 = r9.getFileDescriptor()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r10.<init>(r1)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.nio.channels.FileChannel r2 = r10.getChannel()     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            long r6 = r2.size()     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            r4 = 0
            java.nio.MappedByteBuffer r1 = r2.map(r3, r4, r6)     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            r10.close()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r9 == 0) goto L_0x0034
            r9.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0034:
            return r1
        L_0x0035:
            r1 = move-exception
            r2 = r0
            goto L_0x003e
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x003e:
            if (r2 == 0) goto L_0x0049
            r10.close()     // Catch:{ Throwable -> 0x0044, all -> 0x004d }
            goto L_0x004c
        L_0x0044:
            r10 = move-exception
            r2.addSuppressed(r10)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x004c
        L_0x0049:
            r10.close()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x004c:
            throw r1     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x004d:
            r10 = move-exception
            r1 = r0
            goto L_0x0056
        L_0x0050:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x0056:
            if (r9 == 0) goto L_0x0066
            if (r1 == 0) goto L_0x0063
            r9.close()     // Catch:{ Throwable -> 0x005e }
            goto L_0x0066
        L_0x005e:
            r9 = move-exception
            r1.addSuppressed(r9)     // Catch:{ IOException -> 0x0067 }
            goto L_0x0066
        L_0x0063:
            r9.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0066:
            throw r10     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0344fm.m1139a(android.content.Context, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    private static ByteBuffer m1140a(File file) {
        Throwable th;
        Throwable th2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th2 = r9;
                th = th4;
            }
            throw th;
            if (th2 != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    th2.addSuppressed(th5);
                }
            } else {
                fileInputStream.close();
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m1141a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1142a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a = m1143a(file, inputStream);
                m1141a((Closeable) inputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                m1141a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m1141a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m1143a(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m1141a((Closeable) fileOutputStream2);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                String str = "TypefaceCompatUtil";
                try {
                    StringBuilder sb = new StringBuilder("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    Log.e(str, sb.toString());
                    m1141a((Closeable) fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m1141a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m1141a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            String str2 = "TypefaceCompatUtil";
            StringBuilder sb2 = new StringBuilder("Error copying resource contents to temp file: ");
            sb2.append(e.getMessage());
            Log.e(str2, sb2.toString());
            m1141a((Closeable) fileOutputStream);
            return false;
        }
    }
}
