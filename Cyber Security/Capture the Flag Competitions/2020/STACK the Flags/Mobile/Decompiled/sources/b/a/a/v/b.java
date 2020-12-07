package b.a.a.v;

import a.h.l.d;
import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import net.sqlcipher.BuildConfig;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2249a;

    public b(Context appContext) {
        this.f2249a = appContext.getApplicationContext();
    }

    public d<a, InputStream> a(String url) {
        a extension;
        try {
            File cachedFile = c(url);
            if (cachedFile == null) {
                return null;
            }
            try {
                FileInputStream inputStream = new FileInputStream(cachedFile);
                if (cachedFile.getAbsolutePath().endsWith(".zip")) {
                    extension = a.ZIP;
                } else {
                    extension = a.JSON;
                }
                b.a.a.x.d.a("Cache hit for " + url + " at " + cachedFile.getAbsolutePath());
                return new d<>(extension, inputStream);
            } catch (FileNotFoundException e2) {
                return null;
            }
        } catch (FileNotFoundException e3) {
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public File f(String url, InputStream stream, a extension) {
        File file = new File(d(), b(url, extension, true));
        try {
            OutputStream output = new FileOutputStream(file);
            try {
                byte[] buffer = new byte[1024];
                while (true) {
                    int read = stream.read(buffer);
                    if (read != -1) {
                        output.write(buffer, 0, read);
                    } else {
                        output.flush();
                        output.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                output.close();
                throw th;
            }
        } finally {
            stream.close();
        }
    }

    public void e(String url, a extension) {
        File file = new File(d(), b(url, extension, true));
        File newFile = new File(file.getAbsolutePath().replace(".temp", BuildConfig.FLAVOR));
        boolean renamed = file.renameTo(newFile);
        b.a.a.x.d.a("Copying temp file to real file (" + newFile + ")");
        if (!renamed) {
            b.a.a.x.d.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + newFile.getAbsolutePath() + ".");
        }
    }

    public final File c(String url) {
        File jsonFile = new File(d(), b(url, a.JSON, false));
        if (jsonFile.exists()) {
            return jsonFile;
        }
        File zipFile = new File(d(), b(url, a.ZIP, false));
        if (zipFile.exists()) {
            return zipFile;
        }
        return null;
    }

    public final File d() {
        File file = new File(this.f2249a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String b(String url, a extension, boolean isTemp) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(url.replaceAll("\\W+", BuildConfig.FLAVOR));
        sb.append(isTemp ? extension.a() : extension.f2248b);
        return sb.toString();
    }
}
