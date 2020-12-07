package a.h.d;

import a.h.m.e;
import a.m.d;
import a.m.g;
import a.m.h;
import a.m.o;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class d extends Activity implements g, e.a {
    public a.e.g<Class<? extends a>, a> mExtraDataMap = new a.e.g<>();
    public h mLifecycleRegistry = new h(this);

    @Deprecated
    public static class a {
    }

    @Override // a.m.g
    public abstract a.m.d getLifecycle();

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: a.e.g<java.lang.Class<? extends a.h.d.d$a>, a.h.d.d$a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void putExtraData(a extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        o.e(this);
    }

    public void onSaveInstanceState(Bundle outState) {
        this.mLifecycleRegistry.k(d.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> extraDataClass) {
        return (T) this.mExtraDataMap.get(extraDataClass);
    }

    @Override // a.h.m.e.a
    public boolean superDispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !e.d(decor, event)) {
            return super.dispatchKeyShortcutEvent(event);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !e.d(decor, event)) {
            return e.e(this, decor, this, event);
        }
        return true;
    }
}
