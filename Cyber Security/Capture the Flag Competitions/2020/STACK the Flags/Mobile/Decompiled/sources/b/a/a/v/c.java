package b.a.a.v;

import android.content.Context;
import androidx.core.util.Pair;
import b.a.a.d;
import b.a.a.e;
import b.a.a.l;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.network.FileExtension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2250a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2251b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2252c;

    public static l<d> e(Context context, String url, String cacheKey) {
        return new c(context, url, cacheKey).d();
    }

    public c(Context context, String url, String cacheKey) {
        Context applicationContext = context.getApplicationContext();
        this.f2250a = applicationContext;
        this.f2251b = url;
        if (cacheKey == null) {
            this.f2252c = null;
        } else {
            this.f2252c = new b(applicationContext);
        }
    }

    public l<d> d() {
        d result = a();
        if (result != null) {
            return new l<>(result);
        }
        b.a.a.x.d.a("Animation for " + this.f2251b + " not found in cache. Fetching from network.");
        return b();
    }

    public final d a() {
        Pair<FileExtension, InputStream> cacheResult;
        LottieResult<LottieComposition> result;
        b bVar = this.f2252c;
        if (bVar == null || (cacheResult = bVar.a(this.f2251b)) == null) {
            return null;
        }
        a extension = cacheResult.f902a;
        InputStream inputStream = cacheResult.f903b;
        if (extension == a.ZIP) {
            result = e.r(new ZipInputStream(inputStream), this.f2251b);
        } else {
            result = e.h(inputStream, this.f2251b);
        }
        if (result.b() != null) {
            return result.b();
        }
        return null;
    }

    public final l<d> b() {
        try {
            return c();
        } catch (IOException e2) {
            return new l<>(e2);
        }
    }

    public final l<d> c() {
        b.a.a.x.d.a("Fetching " + this.f2251b);
        HttpURLConnection connection = (HttpURLConnection) new URL(this.f2251b).openConnection();
        connection.setRequestMethod("GET");
        try {
            connection.connect();
            if (connection.getErrorStream() == null) {
                if (connection.getResponseCode() == 200) {
                    LottieResult<LottieComposition> result = g(connection);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(result.b() != null);
                    b.a.a.x.d.a(sb.toString());
                    connection.disconnect();
                    return result;
                }
            }
            String error = f(connection);
            return new l<>(new IllegalArgumentException("Unable to fetch " + this.f2251b + ". Failed with " + connection.getResponseCode() + "\n" + error));
        } catch (Exception e2) {
            return new l<>(e2);
        } finally {
            connection.disconnect();
        }
    }

    public final String f(HttpURLConnection connection) {
        connection.getResponseCode();
        BufferedReader r = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
        StringBuilder error = new StringBuilder();
        while (true) {
            try {
                String line = r.readLine();
                if (line != null) {
                    error.append(line);
                    error.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception e2) {
                    }
                }
            } catch (Exception e3) {
                throw e3;
            } catch (Throwable th) {
                try {
                    r.close();
                } catch (Exception e4) {
                }
                throw th;
            }
        }
        r.close();
        return error.toString();
    }

    public final l<d> g(HttpURLConnection connection) {
        LottieResult<LottieComposition> result;
        a extension;
        String contentType = connection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            b.a.a.x.d.a("Handling zip response.");
            extension = a.ZIP;
            b bVar = this.f2252c;
            if (bVar == null) {
                result = e.r(new ZipInputStream(connection.getInputStream()), null);
            } else {
                result = e.r(new ZipInputStream(new FileInputStream(bVar.f(this.f2251b, connection.getInputStream(), extension))), this.f2251b);
            }
        } else {
            b.a.a.x.d.a("Received json response.");
            extension = a.JSON;
            b bVar2 = this.f2252c;
            if (bVar2 == null) {
                result = e.h(connection.getInputStream(), null);
            } else {
                result = e.h(new FileInputStream(new File(bVar2.f(this.f2251b, connection.getInputStream(), extension).getAbsolutePath())), this.f2251b);
            }
        }
        if (!(this.f2252c == null || result.b() == null)) {
            this.f2252c.e(this.f2251b, extension);
        }
        return result;
    }
}
