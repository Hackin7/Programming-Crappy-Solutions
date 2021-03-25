package b.a.a.t;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import b.a.a.g;
import b.a.a.x.d;
import b.a.a.x.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f2064e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2065a;

    /* renamed from: b  reason: collision with root package name */
    public String f2066b;

    /* renamed from: c  reason: collision with root package name */
    public b.a.a.b f2067c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, g> f2068d;

    public b(Drawable.Callback callback, String imagesFolder, b.a.a.b delegate, Map<String, g> map) {
        this.f2066b = imagesFolder;
        if (!TextUtils.isEmpty(imagesFolder)) {
            String str = this.f2066b;
            if (str.charAt(str.length() - 1) != '/') {
                this.f2066b += '/';
            }
        }
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f2068d = new HashMap();
            this.f2065a = null;
            return;
        }
        this.f2065a = ((View) callback).getContext();
        this.f2068d = map;
        d(delegate);
    }

    public void d(b.a.a.b assetDelegate) {
        this.f2067c = assetDelegate;
    }

    public Bitmap a(String id) {
        g asset = this.f2068d.get(id);
        if (asset == null) {
            return null;
        }
        Bitmap bitmap = asset.a();
        if (bitmap != null) {
            return bitmap;
        }
        b.a.a.b bVar = this.f2067c;
        if (bVar != null) {
            Bitmap bitmap2 = bVar.a(asset);
            if (bitmap2 != null) {
                c(id, bitmap2);
            }
            return bitmap2;
        }
        String filename = asset.b();
        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inScaled = true;
        opts.inDensity = 160;
        if (!filename.startsWith("data:") || filename.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f2066b)) {
                    AssetManager assets = this.f2065a.getAssets();
                    Bitmap bitmap3 = h.l(BitmapFactory.decodeStream(assets.open(this.f2066b + filename), null, opts), asset.e(), asset.c());
                    c(id, bitmap3);
                    return bitmap3;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e2) {
                d.d("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] data = Base64.decode(filename.substring(filename.indexOf(44) + 1), 0);
                Bitmap bitmap4 = BitmapFactory.decodeByteArray(data, 0, data.length, opts);
                c(id, bitmap4);
                return bitmap4;
            } catch (IllegalArgumentException e3) {
                d.d("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    public boolean b(Context context) {
        return (context == null && this.f2065a == null) || this.f2065a.equals(context);
    }

    public final Bitmap c(String key, Bitmap bitmap) {
        synchronized (f2064e) {
            this.f2068d.get(key).f(bitmap);
        }
        return bitmap;
    }
}
