package a.h.e.c;

import a.h.e.c.c;
import a.h.f.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
    public static Drawable a(Resources res, int id, Resources.Theme theme) {
        return res.getDrawable(id, theme);
    }

    public static abstract class a {
        public abstract void c(int i);

        public abstract void d(Typeface typeface);

        public final void b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0017a(typeface));
        }

        /* renamed from: a.h.e.c.f$a$a  reason: collision with other inner class name */
        public class RunnableC0017a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Typeface f804b;

            public RunnableC0017a(Typeface typeface) {
                this.f804b = typeface;
            }

            public void run() {
                a.this.d(this.f804b);
            }
        }

        public final void a(int reason, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(reason));
        }

        public class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f806b;

            public b(int i) {
                this.f806b = i;
            }

            public void run() {
                a.this.c(this.f806b);
            }
        }
    }

    public static Typeface b(Context context, int id, TypedValue value, int style, a fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, id, value, style, fontCallback, null, true);
    }

    public static Typeface c(Context context, int id, TypedValue value, int style, a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = d(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface != null || fontCallback != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee  */
    public static Typeface d(Context context, Resources wrapper, TypedValue value, int id, int style, a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        String file;
        XmlPullParserException e2;
        IOException e3;
        Typeface typeface;
        CharSequence charSequence = value.string;
        if (charSequence != null) {
            String file2 = charSequence.toString();
            if (!file2.startsWith("res/")) {
                if (fontCallback != null) {
                    fontCallback.a(-3, handler);
                }
                return null;
            }
            Typeface typeface2 = d.f(wrapper, id, style);
            if (typeface2 != null) {
                if (fontCallback != null) {
                    fontCallback.b(typeface2, handler);
                }
                return typeface2;
            }
            try {
                if (file2.toLowerCase().endsWith(".xml")) {
                    try {
                        c.a familyEntry = c.b(wrapper.getXml(id), wrapper);
                        if (familyEntry == null) {
                            try {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (fontCallback != null) {
                                    fontCallback.a(-3, handler);
                                }
                                return null;
                            } catch (XmlPullParserException e4) {
                                e2 = e4;
                                file = file2;
                                Log.e("ResourcesCompat", "Failed to parse xml resource " + file, e2);
                                if (fontCallback != null) {
                                }
                                return null;
                            } catch (IOException e5) {
                                e3 = e5;
                                file = file2;
                                Log.e("ResourcesCompat", "Failed to read xml resource " + file, e3);
                                if (fontCallback != null) {
                                }
                                return null;
                            }
                        } else {
                            typeface = typeface2;
                            file = file2;
                            try {
                                return d.c(context, familyEntry, wrapper, id, style, fontCallback, handler, isRequestFromLayoutInflator);
                            } catch (XmlPullParserException e6) {
                                e2 = e6;
                                Log.e("ResourcesCompat", "Failed to parse xml resource " + file, e2);
                                if (fontCallback != null) {
                                }
                                return null;
                            } catch (IOException e7) {
                                e3 = e7;
                                Log.e("ResourcesCompat", "Failed to read xml resource " + file, e3);
                                if (fontCallback != null) {
                                }
                                return null;
                            }
                        }
                    } catch (XmlPullParserException e8) {
                        e2 = e8;
                        file = file2;
                        Log.e("ResourcesCompat", "Failed to parse xml resource " + file, e2);
                        if (fontCallback != null) {
                        }
                        return null;
                    } catch (IOException e9) {
                        e3 = e9;
                        file = file2;
                        Log.e("ResourcesCompat", "Failed to read xml resource " + file, e3);
                        if (fontCallback != null) {
                        }
                        return null;
                    }
                } else {
                    typeface = typeface2;
                    file = file2;
                    try {
                        Typeface typeface3 = d.d(context, wrapper, id, file, style);
                        if (fontCallback != null) {
                            if (typeface3 != null) {
                                try {
                                    fontCallback.b(typeface3, handler);
                                } catch (XmlPullParserException e10) {
                                    e2 = e10;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource " + file, e2);
                                    if (fontCallback != null) {
                                    }
                                    return null;
                                } catch (IOException e11) {
                                    e3 = e11;
                                    Log.e("ResourcesCompat", "Failed to read xml resource " + file, e3);
                                    if (fontCallback != null) {
                                    }
                                    return null;
                                }
                            } else {
                                fontCallback.a(-3, handler);
                            }
                        }
                        return typeface3;
                    } catch (XmlPullParserException e12) {
                        e2 = e12;
                        Log.e("ResourcesCompat", "Failed to parse xml resource " + file, e2);
                        if (fontCallback != null) {
                        }
                        return null;
                    } catch (IOException e13) {
                        e3 = e13;
                        Log.e("ResourcesCompat", "Failed to read xml resource " + file, e3);
                        if (fontCallback != null) {
                        }
                        return null;
                    }
                }
            } catch (XmlPullParserException e14) {
                e2 = e14;
                file = file2;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + file, e2);
                if (fontCallback != null) {
                    fontCallback.a(-3, handler);
                }
                return null;
            } catch (IOException e15) {
                e3 = e15;
                file = file2;
                Log.e("ResourcesCompat", "Failed to read xml resource " + file, e3);
                if (fontCallback != null) {
                }
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + wrapper.getResourceName(id) + "\" (" + Integer.toHexString(id) + ") is not a Font: " + value);
        }
    }

    public static final class b {
        public static void a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0018b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }

        /* renamed from: a.h.e.c.f$b$b  reason: collision with other inner class name */
        public static class C0018b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final Object f808a = new Object();

            /* renamed from: b  reason: collision with root package name */
            public static Method f809b;

            /* renamed from: c  reason: collision with root package name */
            public static boolean f810c;

            public static void a(Resources.Theme theme) {
                synchronized (f808a) {
                    if (!f810c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f809b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        f810c = true;
                    }
                    if (f809b != null) {
                        try {
                            f809b.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            f809b = null;
                        }
                    }
                }
            }
        }
    }
}
