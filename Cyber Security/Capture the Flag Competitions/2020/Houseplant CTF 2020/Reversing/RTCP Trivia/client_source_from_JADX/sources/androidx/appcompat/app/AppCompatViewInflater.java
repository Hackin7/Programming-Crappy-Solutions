package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {

    /* renamed from: a */
    public static final int[] f285a = {16843375};

    /* renamed from: b */
    private static final Class<?>[] f286b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final String[] f287c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f288d = new C0243de();

    /* renamed from: e */
    private final Object[] f289e = new Object[2];

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    public static class C0044a implements OnClickListener {

        /* renamed from: a */
        private final View f290a;

        /* renamed from: b */
        private final String f291b;

        /* renamed from: c */
        private Method f292c;

        /* renamed from: d */
        private Context f293d;

        public C0044a(View view, String str) {
            this.f290a = view;
            this.f291b = str;
        }

        public final void onClick(View view) {
            String str;
            if (this.f292c == null) {
                for (Context context = this.f290a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted()) {
                            Method method = context.getClass().getMethod(this.f291b, new Class[]{View.class});
                            if (method != null) {
                                this.f292c = method;
                                this.f293d = context;
                            }
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.f290a.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder sb = new StringBuilder(" with id '");
                    sb.append(this.f290a.getContext().getResources().getResourceEntryName(id));
                    sb.append("'");
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder("Could not find method ");
                sb2.append(this.f291b);
                sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sb2.append(this.f290a.getClass());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            try {
                this.f292c.invoke(this.f293d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private View m141a(Context context, String str, String str2) {
        String str3;
        Constructor constructor = (Constructor) f288d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f286b);
                f288d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f289e);
    }

    /* renamed from: a */
    public final View mo338a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f289e[0] = context;
            this.f289e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f287c) {
                    View a2 = m141a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                this.f289e[0] = null;
                this.f289e[1] = null;
                return null;
            }
            View a3 = m141a(context, str, (String) null);
            this.f289e[0] = null;
            this.f289e[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            this.f289e[0] = null;
            this.f289e[1] = null;
        }
    }
}
