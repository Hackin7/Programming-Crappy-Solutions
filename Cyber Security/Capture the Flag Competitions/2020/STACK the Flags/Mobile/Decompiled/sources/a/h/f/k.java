package a.h.f;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
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

public class k {
    public static File e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String prefix = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, prefix + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException e2) {
            }
        }
        return null;
    }

    public static ByteBuffer g(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            try {
                FileChannel channel = fis.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fis.close();
                return map;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        } catch (IOException e2) {
            return null;
        }
    }

    public static ByteBuffer f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor pfd = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (pfd == null) {
                if (pfd != null) {
                    pfd.close();
                }
                return null;
            }
            try {
                FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());
                try {
                    FileChannel channel = fis.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                    fis.close();
                    pfd.close();
                    return map;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
            throw th;
        } catch (IOException e2) {
            return null;
        }
    }

    public static ByteBuffer b(Context context, Resources res, int id) {
        File tmpFile = e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!c(tmpFile, res, id)) {
                return null;
            }
            ByteBuffer g2 = g(tmpFile);
            tmpFile.delete();
            return g2;
        } finally {
            tmpFile.delete();
        }
    }

    public static boolean d(File file, InputStream is) {
        FileOutputStream os = null;
        StrictMode.ThreadPolicy old = StrictMode.allowThreadDiskWrites();
        try {
            os = new FileOutputStream(file, false);
            byte[] buffer = new byte[1024];
            while (true) {
                int readLen = is.read(buffer);
                if (readLen != -1) {
                    os.write(buffer, 0, readLen);
                } else {
                    return true;
                }
            }
        } catch (IOException e2) {
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e2.getMessage());
            return false;
        } finally {
            a(os);
            StrictMode.setThreadPolicy(old);
        }
    }

    public static boolean c(File file, Resources res, int id) {
        InputStream is = null;
        try {
            is = res.openRawResource(id);
            return d(file, is);
        } finally {
            a(is);
        }
    }

    public static void a(Closeable c2) {
        if (c2 != null) {
            try {
                c2.close();
            } catch (IOException e2) {
            }
        }
    }
}
