package androidx.activity;

import a.a.c;
import a.h.d.d;
import a.m.d;
import a.m.e;
import a.m.g;
import a.m.h;
import a.m.o;
import a.m.r;
import a.m.s;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends d implements g, s, a.p.b, c {
    public int mContentLayoutId;
    public final h mLifecycleRegistry;
    public final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final a.p.a mSavedStateRegistryController;
    public r mViewModelStore;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f1482a;

        /* renamed from: b  reason: collision with root package name */
        public r f1483b;
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public ComponentActivity() {
        this.mLifecycleRegistry = new h(this);
        this.mSavedStateRegistryController = a.p.a.a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        if (getLifecycle() != null) {
            getLifecycle().a(new e() {
                /* class androidx.activity.ComponentActivity.AnonymousClass2 */

                @Override // a.m.e
                public void d(g source, d.a event) {
                    if (event == d.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View decor = window != null ? window.peekDecorView() : null;
                        if (decor != null) {
                            decor.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new e() {
                /* class androidx.activity.ComponentActivity.AnonymousClass3 */

                @Override // a.m.e
                public void d(g source, d.a event) {
                    if (event == d.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            if (Build.VERSION.SDK_INT <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public ComponentActivity(int contentLayoutId) {
        this();
        this.mContentLayoutId = contentLayoutId;
    }

    @Override // a.h.d.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mSavedStateRegistryController.c(savedInstanceState);
        o.e(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // a.h.d.d
    public void onSaveInstanceState(Bundle outState) {
        a.m.d lifecycle = getLifecycle();
        if (lifecycle instanceof h) {
            ((h) lifecycle).p(d.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.mSavedStateRegistryController.d(outState);
    }

    public final Object onRetainNonConfigurationInstance() {
        b nc;
        Object custom = onRetainCustomNonConfigurationInstance();
        r viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (nc = (b) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nc.f1483b;
        }
        if (viewModelStore == null && custom == null) {
            return null;
        }
        b nci = new b();
        nci.f1482a = custom;
        nci.f1483b = viewModelStore;
        return nci;
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        b nc = (b) getLastNonConfigurationInstance();
        if (nc != null) {
            return nc.f1482a;
        }
        return null;
    }

    @Override // a.h.d.d, a.m.g
    public a.m.d getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // a.m.s
    public r getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                b nc = (b) getLastNonConfigurationInstance();
                if (nc != null) {
                    this.mViewModelStore = nc.f1483b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new r();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    @Override // a.a.c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // a.p.b
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }
}
