package a.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f686a;

    /* renamed from: b  reason: collision with root package name */
    public a f687b;

    /* renamed from: c  reason: collision with root package name */
    public int f688c;

    /* renamed from: d  reason: collision with root package name */
    public float f689d;

    /* renamed from: e  reason: collision with root package name */
    public String f690e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f691f;

    /* renamed from: g  reason: collision with root package name */
    public int f692g;

    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public b(String name, a attributeType, Object value) {
        this.f686a = name;
        this.f687b = attributeType;
        d(value);
    }

    public b(b source, Object value) {
        this.f686a = source.f686a;
        this.f687b = source.f687b;
        d(value);
    }

    public void d(Object value) {
        switch (this.f687b.ordinal()) {
            case 0:
                this.f688c = ((Integer) value).intValue();
                return;
            case 1:
                this.f689d = ((Float) value).floatValue();
                return;
            case 2:
            case 3:
                this.f692g = ((Integer) value).intValue();
                return;
            case 4:
                this.f690e = (String) value;
                return;
            case 5:
                this.f691f = ((Boolean) value).booleanValue();
                return;
            case 6:
                this.f689d = ((Float) value).floatValue();
                return;
            default:
                return;
        }
    }

    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, ConstraintAttribute> ret = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String name : hashMap.keySet()) {
            b constraintAttribute = hashMap.get(name);
            try {
                if (name.equals("BackgroundColor")) {
                    ret.put(name, new b(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    ret.put(name, new b(constraintAttribute, cls.getMethod("getMap" + name, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return ret;
    }

    public static void c(View view, HashMap<String, b> hashMap) {
        Class<?> cls = view.getClass();
        for (String name : hashMap.keySet()) {
            b constraintAttribute = hashMap.get(name);
            String methodName = "set" + name;
            try {
                switch (constraintAttribute.f687b.ordinal()) {
                    case 0:
                        cls.getMethod(methodName, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f688c));
                        continue;
                    case 1:
                        cls.getMethod(methodName, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f689d));
                        continue;
                    case 2:
                        cls.getMethod(methodName, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f692g));
                        continue;
                    case 3:
                        Method method = cls.getMethod(methodName, Drawable.class);
                        ColorDrawable drawable = new ColorDrawable();
                        drawable.setColor(constraintAttribute.f692g);
                        method.invoke(view, drawable);
                        continue;
                    case 4:
                        cls.getMethod(methodName, CharSequence.class).invoke(view, constraintAttribute.f690e);
                        continue;
                    case 5:
                        cls.getMethod(methodName, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f691f));
                        continue;
                    case 6:
                        cls.getMethod(methodName, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f689d));
                        continue;
                    default:
                        continue;
                }
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + name + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(methodName);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + name + "\" not found on " + cls.getName());
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                Log.e("TransitionLayout", " Custom Attribute \"" + name + "\" not found on " + cls.getName());
                e4.printStackTrace();
            }
        }
    }

    public static void b(Context context, XmlPullParser parser, HashMap<String, b> hashMap) {
        TypedArray a2 = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.CustomAttribute);
        String name = null;
        Object value = null;
        a type = null;
        int N = a2.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a2.getIndex(i);
            if (attr == k.CustomAttribute_attributeName) {
                name = a2.getString(attr);
                if (name != null && name.length() > 0) {
                    name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
                }
            } else if (attr == k.CustomAttribute_customBoolean) {
                value = Boolean.valueOf(a2.getBoolean(attr, false));
                type = a.BOOLEAN_TYPE;
            } else if (attr == k.CustomAttribute_customColorValue) {
                type = a.COLOR_TYPE;
                value = Integer.valueOf(a2.getColor(attr, 0));
            } else if (attr == k.CustomAttribute_customColorDrawableValue) {
                type = a.COLOR_DRAWABLE_TYPE;
                value = Integer.valueOf(a2.getColor(attr, 0));
            } else if (attr == k.CustomAttribute_customPixelDimension) {
                type = a.DIMENSION_TYPE;
                value = Float.valueOf(TypedValue.applyDimension(1, a2.getDimension(attr, 0.0f), context.getResources().getDisplayMetrics()));
            } else if (attr == k.CustomAttribute_customDimension) {
                type = a.DIMENSION_TYPE;
                value = Float.valueOf(a2.getDimension(attr, 0.0f));
            } else if (attr == k.CustomAttribute_customFloatValue) {
                type = a.FLOAT_TYPE;
                value = Float.valueOf(a2.getFloat(attr, Float.NaN));
            } else if (attr == k.CustomAttribute_customIntegerValue) {
                type = a.INT_TYPE;
                value = Integer.valueOf(a2.getInteger(attr, -1));
            } else if (attr == k.CustomAttribute_customStringValue) {
                type = a.STRING_TYPE;
                value = a2.getString(attr);
            }
        }
        if (!(name == null || value == null)) {
            hashMap.put(name, new b(name, type, value));
        }
        a2.recycle();
    }
}
