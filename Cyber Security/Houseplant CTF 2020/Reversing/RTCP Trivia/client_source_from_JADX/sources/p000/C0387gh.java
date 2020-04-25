package p000;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: gh */
public final class C0387gh {

    /* renamed from: a */
    private static Field f1725a;

    /* renamed from: b */
    private static boolean f1726b;

    /* renamed from: a */
    public static void m1237a(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (VERSION.SDK_INT < 21) {
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                m1238b(layoutInflater, (Factory2) factory);
                return;
            }
            m1238b(layoutInflater, factory2);
        }
    }

    /* renamed from: b */
    private static void m1238b(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1726b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1725a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder sb = new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb.toString(), e);
            }
            f1726b = true;
        }
        if (f1725a != null) {
            try {
                f1725a.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb2.toString(), e2);
            }
        }
    }
}
