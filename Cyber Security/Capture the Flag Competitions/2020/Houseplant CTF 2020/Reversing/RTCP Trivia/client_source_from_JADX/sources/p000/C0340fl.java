package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fl */
class C0340fl {

    /* renamed from: fl$a */
    interface C0343a<T> {
        /* renamed from: a */
        boolean mo1707a(T t);

        /* renamed from: b */
        int mo1708b(T t);
    }

    C0340fl() {
    }

    /* renamed from: a */
    protected static Typeface m1125a(Context context, InputStream inputStream) {
        File a = C0344fm.m1137a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0344fm.m1143a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    private static <T> T m1126a(T[] tArr, int i, C0343a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        int i3 = Integer.MAX_VALUE;
        T t = null;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo1708b(t2) - i2) * 2) + (aVar.mo1707a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo1703a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0344fm.m1137a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0344fm.m1142a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo1702a(Context context, C0319b bVar, Resources resources, int i) {
        C0320c cVar = (C0320c) m1126a((T[]) bVar.f1597a, i, (C0343a<T>) new C0343a<C0320c>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo1707a(Object obj) {
                return ((C0320c) obj).f1600c;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ int mo1708b(Object obj) {
                return ((C0320c) obj).f1599b;
            }
        });
        if (cVar == null) {
            return null;
        }
        return C0335fg.m1099a(context, resources, cVar.f1603f, cVar.f1598a, i);
    }

    /* renamed from: a */
    public Typeface mo1701a(Context context, C0363b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo1706a(bVarArr, i).f1670a);
            try {
                Typeface a = m1125a(context, inputStream);
                C0344fm.m1141a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0344fm.m1141a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0344fm.m1141a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0344fm.m1141a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0344fm.m1141a((Closeable) inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0363b mo1706a(C0363b[] bVarArr, int i) {
        return (C0363b) m1126a((T[]) bVarArr, i, (C0343a<T>) new C0343a<C0363b>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo1707a(Object obj) {
                return ((C0363b) obj).f1673d;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ int mo1708b(Object obj) {
                return ((C0363b) obj).f1672c;
            }
        });
    }
}
