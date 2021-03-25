package a.h.m;

import a.h.m.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, x> f961a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f962b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f963c = false;

    /* renamed from: d  reason: collision with root package name */
    public static ThreadLocal<Rect> f964d;

    public interface j {
        boolean a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
        int[] iArr = {a.h.b.accessibility_custom_action_0, a.h.b.accessibility_custom_action_1, a.h.b.accessibility_custom_action_2, a.h.b.accessibility_custom_action_3, a.h.b.accessibility_custom_action_4, a.h.b.accessibility_custom_action_5, a.h.b.accessibility_custom_action_6, a.h.b.accessibility_custom_action_7, a.h.b.accessibility_custom_action_8, a.h.b.accessibility_custom_action_9, a.h.b.accessibility_custom_action_10, a.h.b.accessibility_custom_action_11, a.h.b.accessibility_custom_action_12, a.h.b.accessibility_custom_action_13, a.h.b.accessibility_custom_action_14, a.h.b.accessibility_custom_action_15, a.h.b.accessibility_custom_action_16, a.h.b.accessibility_custom_action_17, a.h.b.accessibility_custom_action_18, a.h.b.accessibility_custom_action_19, a.h.b.accessibility_custom_action_20, a.h.b.accessibility_custom_action_21, a.h.b.accessibility_custom_action_22, a.h.b.accessibility_custom_action_23, a.h.b.accessibility_custom_action_24, a.h.b.accessibility_custom_action_25, a.h.b.accessibility_custom_action_26, a.h.b.accessibility_custom_action_27, a.h.b.accessibility_custom_action_28, a.h.b.accessibility_custom_action_29, a.h.b.accessibility_custom_action_30, a.h.b.accessibility_custom_action_31};
        new e();
    }

    public static Rect r() {
        if (f964d == null) {
            f964d = new ThreadLocal<>();
        }
        Rect rect = f964d.get();
        if (rect == null) {
            rect = new Rect();
            f964d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void X(View view, @SuppressLint({"ContextFirst"}) Context context, int[] styleable, AttributeSet attrs, TypedArray t, int defStyleAttr, int defStyleRes) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.a(view, context, styleable, attrs, t, defStyleAttr, defStyleRes);
        }
    }

    public static void Z(View v, a delegate) {
        if (delegate == null && (i(v) instanceof a.C0023a)) {
            delegate = new a();
        }
        v.setAccessibilityDelegate(delegate == null ? null : delegate.d());
    }

    @SuppressLint({"InlinedApi"})
    public static int u(View v) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v.getImportantForAutofill();
        }
        return 0;
    }

    public static void i0(View v, int mode) {
        if (Build.VERSION.SDK_INT >= 26) {
            v.setImportantForAutofill(mode);
        }
    }

    public static boolean E(View view) {
        return i(view) != null;
    }

    public static View.AccessibilityDelegate i(View v) {
        if (Build.VERSION.SDK_INT >= 29) {
            return v.getAccessibilityDelegate();
        }
        return j(v);
    }

    public static View.AccessibilityDelegate j(View v) {
        if (f963c) {
            return null;
        }
        if (f962b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f962b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f963c = true;
                return null;
            }
        }
        try {
            Object o = f962b.get(v);
            if (o instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) o;
            }
            return null;
        } catch (Throwable th2) {
            f963c = true;
            return null;
        }
    }

    public static boolean H(View view) {
        return view.hasTransientState();
    }

    public static void g0(View view, boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
    }

    public static void T(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void U(View view, Runnable action) {
        view.postOnAnimation(action);
    }

    public static void V(View view, Runnable action, long delayMillis) {
        view.postOnAnimationDelayed(action, delayMillis);
    }

    public static int t(View view) {
        return view.getImportantForAccessibility();
    }

    public static void h0(View view, int mode) {
        view.setImportantForAccessibility(mode);
    }

    public static int v(View view) {
        return view.getLayoutDirection();
    }

    public static int k(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static int z(View view) {
        return view.getPaddingStart();
    }

    public static int y(View view) {
        return view.getPaddingEnd();
    }

    public static void k0(View view, int start, int top, int end, int bottom) {
        view.setPaddingRelative(start, top, end, bottom);
    }

    public static int x(View view) {
        return view.getMinimumWidth();
    }

    public static int w(View view) {
        return view.getMinimumHeight();
    }

    public static x b(View view) {
        if (f961a == null) {
            f961a = new WeakHashMap<>();
        }
        x vpa = f961a.get(view);
        if (vpa != null) {
            return vpa;
        }
        x vpa2 = new x(view);
        f961a.put(view, vpa2);
        return vpa2;
    }

    public static void e0(View view, float elevation) {
        view.setElevation(elevation);
    }

    public static float q(View view) {
        return view.getElevation();
    }

    public static void n0(View view, String transitionName) {
        view.setTransitionName(transitionName);
    }

    public static String B(View view) {
        return view.getTransitionName();
    }

    public static int C(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void W(View view) {
        view.requestApplyInsets();
    }

    public static boolean s(View v) {
        return v.getFitsSystemWindows();
    }

    @Deprecated
    public static void f0(View view, boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
    }

    public static void j0(View v, p listener) {
        if (listener == null) {
            v.setOnApplyWindowInsetsListener(null);
        } else {
            v.setOnApplyWindowInsetsListener(new a(listener));
        }
    }

    public class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f965a;

        public a(p pVar) {
            this.f965a = pVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            return this.f965a.a(view, b0.n(insets)).m();
        }
    }

    public static b0 R(View view, b0 insets) {
        WindowInsets unwrapped = insets.m();
        if (unwrapped != null) {
            WindowInsets result = view.onApplyWindowInsets(unwrapped);
            if (!result.equals(unwrapped)) {
                return b0.n(result);
            }
        }
        return insets;
    }

    public static b0 f(View view, b0 insets) {
        WindowInsets unwrapped = insets.m();
        if (unwrapped == null || view.dispatchApplyWindowInsets(unwrapped).equals(unwrapped)) {
            return insets;
        }
        return b0.n(unwrapped);
    }

    public static b0 A(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b0.n(h.a(view));
        }
        return null;
    }

    public static b0 e(View view, b0 insets, Rect outLocalInsets) {
        return g.a(view, insets, outLocalInsets);
    }

    public static boolean G(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean M(View view) {
        return view.isPaddingRelative();
    }

    public static void a0(View view, Drawable background) {
        view.setBackground(background);
    }

    public static ColorStateList m(View view) {
        return view.getBackgroundTintList();
    }

    public static void b0(View view, ColorStateList tintList) {
        view.setBackgroundTintList(tintList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && hasTint) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static PorterDuff.Mode n(View view) {
        return view.getBackgroundTintMode();
    }

    public static void c0(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && hasTint) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static boolean L(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void o0(View view) {
        view.stopNestedScroll();
    }

    public static void p0(View view, int type) {
        if (view instanceof j) {
            ((j) view).a(type);
        } else if (type == 0) {
            o0(view);
        }
    }

    public static boolean K(View view) {
        return view.isLaidOut();
    }

    public static float D(View view) {
        return view.getZ();
    }

    public static void Q(View view, int offset) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(offset);
            return;
        }
        Rect parentRect = r();
        boolean needInvalidateWorkaround = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View p = (View) parent;
            parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
            needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        d(view, offset);
        if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(parentRect);
        }
    }

    public static void d(View view, int offset) {
        view.offsetTopAndBottom(offset);
        if (view.getVisibility() == 0) {
            q0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                q0((View) parent);
            }
        }
    }

    public static void P(View view, int offset) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(offset);
            return;
        }
        Rect parentRect = r();
        boolean needInvalidateWorkaround = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View p = (View) parent;
            parentRect.set(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
            needInvalidateWorkaround = !parentRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        c(view, offset);
        if (needInvalidateWorkaround && parentRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(parentRect);
        }
    }

    public static void c(View view, int offset) {
        view.offsetLeftAndRight(offset);
        if (view.getVisibility() == 0) {
            q0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                q0((View) parent);
            }
        }
    }

    public static void q0(View view) {
        float y = view.getTranslationY();
        view.setTranslationY(1.0f + y);
        view.setTranslationY(y);
    }

    public static void d0(View view, Rect clipBounds) {
        view.setClipBounds(clipBounds);
    }

    public static Rect o(View view) {
        return view.getClipBounds();
    }

    public static boolean J(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean F(View view) {
        return view.hasOnClickListeners();
    }

    public static void m0(View view, int indicators, int mask) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(indicators, mask);
        }
    }

    public static void l0(View view, r pointerIcon) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (pointerIcon != null ? pointerIcon.a() : null));
        }
    }

    public static Display p(View view) {
        return view.getDisplay();
    }

    public static boolean h(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(root).f(evt);
    }

    public static boolean g(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return k.a(root).b(root, evt);
    }

    public static boolean N(View view) {
        Boolean result = Y().d(view);
        if (result == null) {
            return false;
        }
        return result.booleanValue();
    }

    public class b extends f<Boolean> {
        public b(int tagKey, Class cls, int frameworkMinimumSdk) {
            super(tagKey, cls, frameworkMinimumSdk);
        }

        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    public static f<Boolean> Y() {
        return new b(a.h.b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static CharSequence l(View view) {
        return S().d(view);
    }

    public class c extends f<CharSequence> {
        public c(int tagKey, Class cls, int contentChangeType, int frameworkMinimumSdk) {
            super(tagKey, cls, contentChangeType, frameworkMinimumSdk);
        }

        /* renamed from: e */
        public CharSequence c(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    public static f<CharSequence> S() {
        return new c(a.h.b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static boolean I(View view) {
        Boolean result = a().d(view);
        if (result == null) {
            return false;
        }
        return result.booleanValue();
    }

    public class d extends f<Boolean> {
        public d(int tagKey, Class cls, int frameworkMinimumSdk) {
            super(tagKey, cls, frameworkMinimumSdk);
        }

        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    public static f<Boolean> a() {
        return new d(a.h.b.tag_accessibility_heading, Boolean.class, 28);
    }

    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f967a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f968b;

        /* renamed from: c  reason: collision with root package name */
        public final int f969c;

        public abstract T c(View view);

        public f(int tagKey, Class<T> type, int frameworkMinimumSdk) {
            this(tagKey, type, 0, frameworkMinimumSdk);
        }

        public f(int tagKey, Class<T> type, int contentChangeType, int frameworkMinimumSdk) {
            this.f967a = tagKey;
            this.f968b = type;
            this.f969c = frameworkMinimumSdk;
        }

        public T d(View view) {
            if (b()) {
                return c(view);
            }
            a();
            T t = (T) view.getTag(this.f967a);
            if (this.f968b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f969c;
        }

        public final boolean a() {
            return true;
        }
    }

    public static void O(View view, int changeType) {
        int i2;
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean isAccessibilityPane = l(view) != null;
            if (k(view) != 0 || (isAccessibilityPane && view.getVisibility() == 0)) {
                AccessibilityEvent event = AccessibilityEvent.obtain();
                if (isAccessibilityPane) {
                    i2 = 32;
                } else {
                    i2 = 2048;
                }
                event.setEventType(i2);
                event.setContentChangeTypes(changeType);
                view.sendAccessibilityEventUnchecked(event);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, changeType);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f966b = new WeakHashMap<>();

        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f966b.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        public final void a(View pane, boolean oldVisibility) {
            boolean newVisibility = pane.getVisibility() == 0;
            if (oldVisibility != newVisibility) {
                if (newVisibility) {
                    s.O(pane, 16);
                }
                this.f966b.put(pane, Boolean.valueOf(newVisibility));
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    public static class k {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f970d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f971a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f972b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f973c = null;

        public final SparseArray<WeakReference<View>> d() {
            if (this.f972b == null) {
                this.f972b = new SparseArray<>();
            }
            return this.f972b;
        }

        public static k a(View root) {
            k manager = (k) root.getTag(a.h.b.tag_unhandled_key_event_manager);
            if (manager != null) {
                return manager;
            }
            k manager2 = new k();
            root.setTag(a.h.b.tag_unhandled_key_event_manager, manager2);
            return manager2;
        }

        public boolean b(View root, KeyEvent event) {
            if (event.getAction() == 0) {
                g();
            }
            View consumer = c(root, event);
            if (event.getAction() == 0) {
                int keycode = event.getKeyCode();
                if (consumer != null && !KeyEvent.isModifierKey(keycode)) {
                    d().put(keycode, new WeakReference<>(consumer));
                }
            }
            return consumer != null;
        }

        public final View c(View view, KeyEvent event) {
            WeakHashMap<View, Boolean> weakHashMap = this.f971a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                for (int i = vg.getChildCount() - 1; i >= 0; i--) {
                    View consumer = c(vg.getChildAt(i), event);
                    if (consumer != null) {
                        return consumer;
                    }
                }
            }
            if (e(view, event)) {
                return view;
            }
            return null;
        }

        public boolean f(KeyEvent event) {
            int idx;
            WeakReference<KeyEvent> weakReference = this.f973c;
            if (weakReference != null && weakReference.get() == event) {
                return false;
            }
            this.f973c = new WeakReference<>(event);
            WeakReference<View> currentReceiver = null;
            SparseArray<WeakReference<View>> capturedKeys = d();
            if (event.getAction() == 1 && (idx = capturedKeys.indexOfKey(event.getKeyCode())) >= 0) {
                currentReceiver = capturedKeys.valueAt(idx);
                capturedKeys.removeAt(idx);
            }
            if (currentReceiver == null) {
                currentReceiver = capturedKeys.get(event.getKeyCode());
            }
            if (currentReceiver == null) {
                return false;
            }
            View target = currentReceiver.get();
            if (target != null && s.J(target)) {
                e(target, event);
            }
            return true;
        }

        public final boolean e(View v, KeyEvent event) {
            ArrayList<ViewCompat.OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v.getTag(a.h.b.tag_unhandled_key_listeners);
            if (viewListeners == null) {
                return false;
            }
            for (int i = viewListeners.size() - 1; i >= 0; i--) {
                if (((j) viewListeners.get(i)).a(v, event)) {
                    return true;
                }
            }
            return false;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f971a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f970d.isEmpty()) {
                synchronized (f970d) {
                    if (this.f971a == null) {
                        this.f971a = new WeakHashMap<>();
                    }
                    for (int i = f970d.size() - 1; i >= 0; i--) {
                        View v = f970d.get(i).get();
                        if (v == null) {
                            f970d.remove(i);
                        } else {
                            this.f971a.put(v, Boolean.TRUE);
                            for (ViewParent nxt = v.getParent(); nxt instanceof View; nxt = nxt.getParent()) {
                                this.f971a.put((View) nxt, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    public static class g {
        public static b0 a(View v, b0 insets, Rect outLocalInsets) {
            WindowInsets platformInsets = insets.m();
            if (platformInsets != null) {
                return b0.n(v.computeSystemWindowInsets(platformInsets, outLocalInsets));
            }
            outLocalInsets.setEmpty();
            return insets;
        }
    }

    public static class h {
        public static WindowInsets a(View v) {
            return v.getRootWindowInsets();
        }
    }

    public static class i {
        public static void a(View view, Context context, int[] styleable, AttributeSet attrs, TypedArray t, int defStyleAttr, int defStyleRes) {
            view.saveAttributeDataForStyleable(context, styleable, attrs, t, defStyleAttr, defStyleRes);
        }
    }
}
