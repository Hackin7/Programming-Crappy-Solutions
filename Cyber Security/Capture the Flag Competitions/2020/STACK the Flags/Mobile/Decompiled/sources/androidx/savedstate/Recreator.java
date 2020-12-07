package androidx.savedstate;

import a.m.d;
import a.m.e;
import a.m.g;
import a.p.b;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements e {

    /* renamed from: a  reason: collision with root package name */
    public final b f1836a;

    public Recreator(b owner) {
        this.f1836a = owner;
    }

    @Override // a.m.e
    public void d(g source, d.a event) {
        if (event == d.a.ON_CREATE) {
            source.getLifecycle().c(this);
            Bundle bundle = this.f1836a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (bundle != null) {
                ArrayList<String> classes = bundle.getStringArrayList("classes_to_restore");
                if (classes != null) {
                    Iterator<String> it = classes.iterator();
                    while (it.hasNext()) {
                        h(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public final void h(String className) {
        try {
            Class<? extends SavedStateRegistry.AutoRecreated> clazz = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
            try {
                Constructor<? extends SavedStateRegistry.AutoRecreated> constructor = clazz.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.a) constructor.newInstance(new Object[0])).a(this.f1836a);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to instantiate " + className, e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Class" + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("Class " + className + " wasn't found", e4);
        }
    }
}
