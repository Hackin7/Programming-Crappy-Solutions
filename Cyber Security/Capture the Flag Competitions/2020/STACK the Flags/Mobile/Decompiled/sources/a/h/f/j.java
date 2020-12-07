package a.h.f;

import a.h.e.c.c;
import a.h.j.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, c.b> f832a = new ConcurrentHashMap<>();

    public interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    public abstract Typeface a(Context context, c.b bVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i);

    public static <T> T e(T[] fonts, int style, b<T> bVar) {
        int targetWeight = (style & 1) == 0 ? 400 : 700;
        boolean isTargetItalic = (style & 2) != 0;
        T best = null;
        int bestScore = Integer.MAX_VALUE;
        for (T font : fonts) {
            int score = (Math.abs(bVar.a(font) - targetWeight) * 2) + (bVar.b(font) == isTargetItalic ? 0 : 1);
            if (best == null || bestScore > score) {
                best = font;
                bestScore = score;
            }
        }
        return best;
    }

    public class a implements b<b.f> {
        public a(j this$0) {
        }

        /* renamed from: c */
        public int a(b.f info) {
            return info.d();
        }

        /* renamed from: d */
        public boolean b(b.f info) {
            return info.e();
        }
    }

    public b.f f(b.f[] fonts, int style) {
        return (b.f) e(fonts, style, new a(this));
    }

    public Typeface c(Context context, InputStream is) {
        File tmpFile = k.e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!k.d(tmpFile, is)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = k.e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!k.c(tmpFile, resources, id)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }
}
