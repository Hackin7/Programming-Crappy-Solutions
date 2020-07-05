package p000;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gq */
public final class C0396gq {

    /* renamed from: a */
    private static final AtomicInteger f1734a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f1735b = null;

    /* renamed from: c */
    private static boolean f1736c = false;

    /* renamed from: d */
    private static WeakHashMap<View, String> f1737d = null;

    /* renamed from: e */
    private static WeakHashMap<View, C0402gt> f1738e = null;

    /* renamed from: f */
    private static boolean f1739f = false;

    /* renamed from: gq$a */
    public interface C0398a {
        /* renamed from: a */
        boolean mo1818a();
    }

    /* renamed from: gq$b */
    static class C0399b {

        /* renamed from: a */
        static final ArrayList<WeakReference<View>> f1741a = new ArrayList<>();

        /* renamed from: b */
        WeakHashMap<View, Boolean> f1742b = null;

        /* renamed from: c */
        WeakReference<KeyEvent> f1743c = null;

        /* renamed from: d */
        private SparseArray<WeakReference<View>> f1744d = null;

        C0399b() {
        }

        /* renamed from: a */
        static C0399b m1279a(View view) {
            C0399b bVar = (C0399b) view.getTag(C0304b.tag_unhandled_key_event_manager);
            if (bVar != null) {
                return bVar;
            }
            C0399b bVar2 = new C0399b();
            view.setTag(C0304b.tag_unhandled_key_event_manager, bVar2);
            return bVar2;
        }

        /* renamed from: b */
        static boolean m1280b(View view) {
            ArrayList arrayList = (ArrayList) view.getTag(C0304b.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C0398a) arrayList.get(size)).mo1818a()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final SparseArray<WeakReference<View>> mo1819a() {
            if (this.f1744d == null) {
                this.f1744d = new SparseArray<>();
            }
            return this.f1744d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final View mo1820a(View view, KeyEvent keyEvent) {
            if (this.f1742b == null || !this.f1742b.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a = mo1820a(viewGroup.getChildAt(childCount), keyEvent);
                    if (a != null) {
                        return a;
                    }
                }
            }
            if (m1280b(view)) {
                return view;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C0409gx m1251a(View view, C0409gx gxVar) {
        if (VERSION.SDK_INT < 21) {
            return gxVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0409gx.m1306a(gxVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0409gx.m1305a((Object) windowInsets);
    }

    /* renamed from: a */
    public static void m1252a(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a */
    public static void m1253a(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    public static void m1254a(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, 3);
        }
    }

    /* renamed from: a */
    public static void m1255a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0395gp) {
            ((C0395gp) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1256a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0395gp) {
            ((C0395gp) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m1257a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m1258a(View view, C0379gd gdVar) {
        view.setAccessibilityDelegate(gdVar == null ? null : gdVar.f1716a);
    }

    /* renamed from: a */
    public static void m1259a(View view, final C0394go goVar) {
        if (VERSION.SDK_INT >= 21) {
            view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) C0409gx.m1306a(goVar.mo1816a(view, C0409gx.m1305a((Object) windowInsets)));
                }
            });
        }
    }

    /* renamed from: a */
    public static void m1260a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m1261a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m1262a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f1737d == null) {
            f1737d = new WeakHashMap<>();
        }
        f1737d.put(view, str);
    }

    /* renamed from: a */
    static boolean m1263a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        C0399b a = C0399b.m1279a(view);
        if (a.f1743c == null || a.f1743c.get() != keyEvent) {
            a.f1743c = new WeakReference<>(keyEvent);
            WeakReference weakReference = null;
            SparseArray a2 = a.mo1819a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a2.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference = (WeakReference) a2.valueAt(indexOfKey);
                    a2.removeAt(indexOfKey);
                }
            }
            if (weakReference == null) {
                weakReference = (WeakReference) a2.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 != null && m1276m(view2)) {
                    C0399b.m1280b(view2);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m1264b(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: b */
    static boolean m1265b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        C0399b a = C0399b.m1279a(view);
        if (keyEvent.getAction() == 0) {
            if (a.f1742b != null) {
                a.f1742b.clear();
            }
            if (!C0399b.f1741a.isEmpty()) {
                synchronized (C0399b.f1741a) {
                    if (a.f1742b == null) {
                        a.f1742b = new WeakHashMap<>();
                    }
                    for (int size = C0399b.f1741a.size() - 1; size >= 0; size--) {
                        View view2 = (View) ((WeakReference) C0399b.f1741a.get(size)).get();
                        if (view2 == null) {
                            C0399b.f1741a.remove(size);
                        } else {
                            a.f1742b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                a.f1742b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = a.mo1820a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                a.mo1819a().put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    /* renamed from: c */
    public static int m1266c(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f1736c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f1735b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1736c = true;
        }
        if (f1735b != null) {
            try {
                return ((Integer) f1735b.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static C0402gt m1267d(View view) {
        if (f1738e == null) {
            f1738e = new WeakHashMap<>();
        }
        C0402gt gtVar = (C0402gt) f1738e.get(view);
        if (gtVar != null) {
            return gtVar;
        }
        C0402gt gtVar2 = new C0402gt(view);
        f1738e.put(view, gtVar2);
        return gtVar2;
    }

    /* renamed from: e */
    public static String m1268e(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        if (f1737d == null) {
            return null;
        }
        return (String) f1737d.get(view);
    }

    /* renamed from: f */
    public static int m1269f(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: g */
    public static void m1270g(View view) {
        if (VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: h */
    public static boolean m1271h(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: i */
    public static ColorStateList m1272i(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C0395gp) {
            return ((C0395gp) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: j */
    public static Mode m1273j(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C0395gp) {
            return ((C0395gp) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: k */
    public static void m1274k(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
            return;
        }
        if (view instanceof C0388gi) {
            ((C0388gi) view).stopNestedScroll();
        }
    }

    /* renamed from: l */
    public static boolean m1275l(View view) {
        return VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: m */
    public static boolean m1276m(View view) {
        return VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: n */
    public static boolean m1277n(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }
}
