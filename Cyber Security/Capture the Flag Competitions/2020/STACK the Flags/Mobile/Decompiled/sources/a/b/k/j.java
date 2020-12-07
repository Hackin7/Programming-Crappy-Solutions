package a.b.k;

import a.b.p.b0;
import a.b.p.d;
import a.b.p.f;
import a.b.p.h;
import a.b.p.k;
import a.b.p.m;
import a.b.p.o;
import a.b.p.p;
import a.b.p.s;
import a.b.p.t;
import a.b.p.t0;
import a.b.p.u;
import a.b.p.w;
import a.b.p.z;
import a.e.g;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.sqlcipher.BuildConfig;

public class j {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final g<String, Constructor<? extends View>> sConstructorMap = new g<>();
    public static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public final Object[] mConstructorArgs = new Object[2];

    public final View createView(View parent, String name, Context context, AttributeSet attrs, boolean inheritContext, boolean readAndroidTheme, boolean readAppTheme, boolean wrapContext) {
        View view;
        if (inheritContext && parent != null) {
            context = parent.getContext();
        }
        if (readAndroidTheme || readAppTheme) {
            context = themifyContext(context, attrs, readAndroidTheme, readAppTheme);
        }
        if (wrapContext) {
            context = t0.b(context);
        }
        char c2 = 65535;
        switch (name.hashCode()) {
            case -1946472170:
                if (name.equals("RatingBar")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1455429095:
                if (name.equals("CheckedTextView")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (name.equals("MultiAutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -938935918:
                if (name.equals("TextView")) {
                    c2 = 0;
                    break;
                }
                break;
            case -937446323:
                if (name.equals("ImageButton")) {
                    c2 = 5;
                    break;
                }
                break;
            case -658531749:
                if (name.equals("SeekBar")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -339785223:
                if (name.equals("Spinner")) {
                    c2 = 4;
                    break;
                }
                break;
            case 776382189:
                if (name.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (name.equals("ToggleButton")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 1125864064:
                if (name.equals("ImageView")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1413872058:
                if (name.equals("AutoCompleteTextView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (name.equals("CheckBox")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1666676343:
                if (name.equals("EditText")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2001146706:
                if (name.equals("Button")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                view = createTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 1:
                view = createImageView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 2:
                view = createButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case 3:
                view = createEditText(context, attrs);
                verifyNotNull(view, name);
                break;
            case 4:
                view = createSpinner(context, attrs);
                verifyNotNull(view, name);
                break;
            case 5:
                view = createImageButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case 6:
                view = createCheckBox(context, attrs);
                verifyNotNull(view, name);
                break;
            case 7:
                view = createRadioButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\b':
                view = createCheckedTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\t':
                view = createAutoCompleteTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\n':
                view = createMultiAutoCompleteTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 11:
                view = createRatingBar(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\f':
                view = createSeekBar(context, attrs);
                verifyNotNull(view, name);
                break;
            case '\r':
                view = createToggleButton(context, attrs);
                verifyNotNull(view, name);
                break;
            default:
                view = createView(context, name, attrs);
                break;
        }
        if (view == null && context != context) {
            view = createViewFromTag(context, name, attrs);
        }
        if (view != null) {
            checkOnClickListener(view, attrs);
        }
        return view;
    }

    public z createTextView(Context context, AttributeSet attrs) {
        return new z(context, attrs);
    }

    public o createImageView(Context context, AttributeSet attrs) {
        return new o(context, attrs);
    }

    public f createButton(Context context, AttributeSet attrs) {
        return new f(context, attrs);
    }

    public k createEditText(Context context, AttributeSet attrs) {
        return new k(context, attrs);
    }

    public w createSpinner(Context context, AttributeSet attrs) {
        return new w(context, attrs);
    }

    public m createImageButton(Context context, AttributeSet attrs) {
        return new m(context, attrs);
    }

    public a.b.p.g createCheckBox(Context context, AttributeSet attrs) {
        return new a.b.p.g(context, attrs);
    }

    public s createRadioButton(Context context, AttributeSet attrs) {
        return new s(context, attrs);
    }

    public h createCheckedTextView(Context context, AttributeSet attrs) {
        return new h(context, attrs);
    }

    public d createAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new d(context, attrs);
    }

    public p createMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new p(context, attrs);
    }

    public t createRatingBar(Context context, AttributeSet attrs) {
        return new t(context, attrs);
    }

    public u createSeekBar(Context context, AttributeSet attrs) {
        return new u(context, attrs);
    }

    public b0 createToggleButton(Context context, AttributeSet attrs) {
        return new b0(context, attrs);
    }

    private void verifyNotNull(View view, String name) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + name + ">, but returned null");
        }
    }

    public View createView(Context context, String name, AttributeSet attrs) {
        return null;
    }

    private View createViewFromTag(Context context, String name, AttributeSet attrs) {
        if (name.equals("view")) {
            name = attrs.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attrs;
            if (-1 == name.indexOf(46)) {
                for (int i = 0; i < sClassPrefixList.length; i++) {
                    View view = createViewByPrefix(context, name, sClassPrefixList[i]);
                    if (view != null) {
                        return view;
                    }
                }
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View createViewByPrefix = createViewByPrefix(context, name, null);
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
            return createViewByPrefix;
        } catch (Exception e2) {
            return null;
        } finally {
            Object[] objArr3 = this.mConstructorArgs;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    private void checkOnClickListener(View view, AttributeSet attrs) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && a.h.m.s.F(view)) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, sOnClickAttrs);
            String handlerName = a2.getString(0);
            if (handlerName != null) {
                view.setOnClickListener(new a(view, handlerName));
            }
            a2.recycle();
        }
    }

    private View createViewByPrefix(Context context, String name, String prefix) {
        String str;
        Constructor<? extends View> constructor = sConstructorMap.get(name);
        if (constructor == null) {
            if (prefix != null) {
                try {
                    str = prefix + name;
                } catch (Exception e2) {
                    return null;
                }
            } else {
                str = name;
            }
            constructor = Class.forName(str, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(name, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    public static Context themifyContext(Context context, AttributeSet attrs, boolean useAndroidTheme, boolean useAppTheme) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.b.j.View, 0, 0);
        int themeId = 0;
        if (useAndroidTheme) {
            themeId = a2.getResourceId(a.b.j.View_android_theme, 0);
        }
        if (useAppTheme && themeId == 0 && (themeId = a2.getResourceId(a.b.j.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        a2.recycle();
        if (themeId == 0) {
            return context;
        }
        if (!(context instanceof a.b.o.d) || ((a.b.o.d) context).c() != themeId) {
            return new a.b.o.d(context, themeId);
        }
        return context;
    }

    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final View f43b;

        /* renamed from: c  reason: collision with root package name */
        public final String f44c;

        /* renamed from: d  reason: collision with root package name */
        public Method f45d;

        /* renamed from: e  reason: collision with root package name */
        public Context f46e;

        public a(View hostView, String methodName) {
            this.f43b = hostView;
            this.f44c = methodName;
        }

        public void onClick(View v) {
            if (this.f45d == null) {
                a(this.f43b.getContext());
            }
            try {
                this.f45d.invoke(this.f46e, v);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }

        public final void a(Context context) {
            String idText;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f44c, View.class)) != null) {
                        this.f45d = method;
                        this.f46e = context;
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f43b.getId();
            if (id == -1) {
                idText = BuildConfig.FLAVOR;
            } else {
                idText = " with id '" + this.f43b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f44c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f43b.getClass() + idText);
        }
    }
}
