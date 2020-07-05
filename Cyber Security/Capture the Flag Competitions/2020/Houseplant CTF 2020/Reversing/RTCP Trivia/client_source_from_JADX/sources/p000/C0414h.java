package p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.C0060a;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;

/* renamed from: h */
final class C0414h extends C0375g implements C0020a, Factory2 {

    /* renamed from: x */
    private static final boolean f1763x = (VERSION.SDK_INT < 21);

    /* renamed from: y */
    private static final int[] f1764y = {16842836};

    /* renamed from: z */
    private static boolean f1765z = true;

    /* renamed from: A */
    private CharSequence f1766A;

    /* renamed from: B */
    private C0176bz f1767B;

    /* renamed from: C */
    private C0423a f1768C;

    /* renamed from: D */
    private C0431g f1769D;

    /* renamed from: E */
    private boolean f1770E;

    /* renamed from: F */
    private TextView f1771F;

    /* renamed from: G */
    private View f1772G;

    /* renamed from: H */
    private boolean f1773H;

    /* renamed from: I */
    private boolean f1774I;

    /* renamed from: J */
    private boolean f1775J;

    /* renamed from: K */
    private C0430f[] f1776K;

    /* renamed from: L */
    private C0430f f1777L;

    /* renamed from: M */
    private boolean f1778M;

    /* renamed from: N */
    private int f1779N = -100;

    /* renamed from: O */
    private boolean f1780O;

    /* renamed from: P */
    private C0427d f1781P;

    /* renamed from: Q */
    private final Runnable f1782Q = new Runnable() {
        public final void run() {
            if ((C0414h.this.f1808w & 1) != 0) {
                C0414h.this.mo1850f(0);
            }
            if ((C0414h.this.f1808w & 4096) != 0) {
                C0414h.this.mo1850f(C0126j.AppCompatTheme_tooltipForegroundColor);
            }
            C0414h.this.f1807v = false;
            C0414h.this.f1808w = 0;
        }
    };

    /* renamed from: R */
    private boolean f1783R;

    /* renamed from: S */
    private Rect f1784S;

    /* renamed from: T */
    private Rect f1785T;

    /* renamed from: U */
    private AppCompatViewInflater f1786U;

    /* renamed from: b */
    final Context f1787b;

    /* renamed from: c */
    final Window f1788c;

    /* renamed from: d */
    final Callback f1789d;

    /* renamed from: e */
    final Callback f1790e;

    /* renamed from: f */
    final C0322f f1791f;

    /* renamed from: g */
    C0177c f1792g;

    /* renamed from: h */
    MenuInflater f1793h;

    /* renamed from: i */
    C0802u f1794i;

    /* renamed from: j */
    ActionBarContextView f1795j;

    /* renamed from: k */
    PopupWindow f1796k;

    /* renamed from: l */
    Runnable f1797l;

    /* renamed from: m */
    C0402gt f1798m = null;

    /* renamed from: n */
    boolean f1799n = true;

    /* renamed from: o */
    ViewGroup f1800o;

    /* renamed from: p */
    boolean f1801p;

    /* renamed from: q */
    boolean f1802q;

    /* renamed from: r */
    boolean f1803r;

    /* renamed from: s */
    boolean f1804s;

    /* renamed from: t */
    boolean f1805t;

    /* renamed from: u */
    boolean f1806u;

    /* renamed from: v */
    boolean f1807v;

    /* renamed from: w */
    int f1808w;

    /* renamed from: h$a */
    final class C0423a implements C0102a {
        C0423a() {
        }

        /* renamed from: a */
        public final void mo196a(C0019aj ajVar, boolean z) {
            C0414h.this.mo1847b(ajVar);
        }

        /* renamed from: a */
        public final boolean mo197a(C0019aj ajVar) {
            Callback callback = C0414h.this.f1788c.getCallback();
            if (callback != null) {
                callback.onMenuOpened(C0126j.AppCompatTheme_tooltipForegroundColor, ajVar);
            }
            return true;
        }
    }

    /* renamed from: h$b */
    class C0424b implements C0803a {

        /* renamed from: b */
        private C0803a f1819b;

        public C0424b(C0803a aVar) {
            this.f1819b = aVar;
        }

        /* renamed from: a */
        public final void mo1862a(C0802u uVar) {
            this.f1819b.mo1862a(uVar);
            if (C0414h.this.f1796k != null) {
                C0414h.this.f1788c.getDecorView().removeCallbacks(C0414h.this.f1797l);
            }
            if (C0414h.this.f1795j != null) {
                C0414h.this.mo1854m();
                C0414h.this.f1798m = C0396gq.m1267d(C0414h.this.f1795j).mo1821a(0.0f);
                C0414h.this.f1798m.mo1823a((C0406gu) new C0407gv() {
                    /* renamed from: b */
                    public final void mo8b(View view) {
                        C0414h.this.f1795j.setVisibility(8);
                        if (C0414h.this.f1796k != null) {
                            C0414h.this.f1796k.dismiss();
                        } else if (C0414h.this.f1795j.getParent() instanceof View) {
                            C0396gq.m1270g((View) C0414h.this.f1795j.getParent());
                        }
                        C0414h.this.f1795j.removeAllViews();
                        C0414h.this.f1798m.mo1823a((C0406gu) null);
                        C0414h.this.f1798m = null;
                    }
                });
            }
            if (C0414h.this.f1791f != null) {
                C0322f fVar = C0414h.this.f1791f;
                C0802u uVar2 = C0414h.this.f1794i;
            }
            C0414h.this.f1794i = null;
        }

        /* renamed from: a */
        public final boolean mo1863a(C0802u uVar, Menu menu) {
            return this.f1819b.mo1863a(uVar, menu);
        }

        /* renamed from: a */
        public final boolean mo1864a(C0802u uVar, MenuItem menuItem) {
            return this.f1819b.mo1864a(uVar, menuItem);
        }

        /* renamed from: b */
        public final boolean mo1865b(C0802u uVar, Menu menu) {
            return this.f1819b.mo1865b(uVar, menu);
        }
    }

    /* renamed from: h$c */
    class C0426c extends C0005ab {
        C0426c(Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        private ActionMode m1370a(ActionMode.Callback callback) {
            Context context;
            C0816a aVar = new C0816a(C0414h.this.f1787b, callback);
            C0414h hVar = C0414h.this;
            if (hVar.f1794i != null) {
                hVar.f1794i.mo2592c();
            }
            C0424b bVar = new C0424b(aVar);
            C0177c a = hVar.mo1778a();
            if (a != null) {
                hVar.f1794i = a.mo1110a((C0803a) bVar);
            }
            if (hVar.f1794i == null) {
                hVar.mo1854m();
                if (hVar.f1794i != null) {
                    hVar.f1794i.mo2592c();
                }
                boolean z = true;
                if (hVar.f1795j == null) {
                    if (hVar.f1804s) {
                        TypedValue typedValue = new TypedValue();
                        Theme theme = hVar.f1787b.getTheme();
                        theme.resolveAttribute(C0117a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Theme newTheme = hVar.f1787b.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new C0805w(hVar.f1787b, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = hVar.f1787b;
                        }
                        hVar.f1795j = new ActionBarContextView(context);
                        hVar.f1796k = new PopupWindow(context, null, C0117a.actionModePopupWindowStyle);
                        C0439hf.m1388a(hVar.f1796k, 2);
                        hVar.f1796k.setContentView(hVar.f1795j);
                        hVar.f1796k.setWidth(-1);
                        context.getTheme().resolveAttribute(C0117a.actionBarSize, typedValue, true);
                        hVar.f1795j.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        hVar.f1796k.setHeight(-2);
                        hVar.f1797l = new Runnable() {
                            public final void run() {
                                C0414h.this.f1796k.showAtLocation(C0414h.this.f1795j, 55, 0, 0);
                                C0414h.this.mo1854m();
                                if (C0414h.this.mo1853l()) {
                                    C0414h.this.f1795j.setAlpha(0.0f);
                                    C0414h.this.f1798m = C0396gq.m1267d(C0414h.this.f1795j).mo1821a(1.0f);
                                    C0414h.this.f1798m.mo1823a((C0406gu) new C0407gv() {
                                        /* renamed from: a */
                                        public final void mo7a(View view) {
                                            C0414h.this.f1795j.setVisibility(0);
                                        }

                                        /* renamed from: b */
                                        public final void mo8b(View view) {
                                            C0414h.this.f1795j.setAlpha(1.0f);
                                            C0414h.this.f1798m.mo1823a((C0406gu) null);
                                            C0414h.this.f1798m = null;
                                        }
                                    });
                                    return;
                                }
                                C0414h.this.f1795j.setAlpha(1.0f);
                                C0414h.this.f1795j.setVisibility(0);
                            }
                        };
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) hVar.f1800o.findViewById(C0122f.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(hVar.mo1852k()));
                            hVar.f1795j = (ActionBarContextView) viewStubCompat.mo697a();
                        }
                    }
                }
                if (hVar.f1795j != null) {
                    hVar.mo1854m();
                    hVar.f1795j.mo396b();
                    Context context2 = hVar.f1795j.getContext();
                    ActionBarContextView actionBarContextView = hVar.f1795j;
                    if (hVar.f1796k != null) {
                        z = false;
                    }
                    C0814x xVar = new C0814x(context2, actionBarContextView, bVar, z);
                    if (bVar.mo1863a((C0802u) xVar, xVar.mo2589b())) {
                        xVar.mo2593d();
                        hVar.f1795j.mo394a(xVar);
                        hVar.f1794i = xVar;
                        if (hVar.mo1853l()) {
                            hVar.f1795j.setAlpha(0.0f);
                            hVar.f1798m = C0396gq.m1267d(hVar.f1795j).mo1821a(1.0f);
                            hVar.f1798m.mo1823a((C0406gu) new C0407gv() {
                                /* renamed from: a */
                                public final void mo7a(View view) {
                                    C0414h.this.f1795j.setVisibility(0);
                                    C0414h.this.f1795j.sendAccessibilityEvent(32);
                                    if (C0414h.this.f1795j.getParent() instanceof View) {
                                        C0396gq.m1270g((View) C0414h.this.f1795j.getParent());
                                    }
                                }

                                /* renamed from: b */
                                public final void mo8b(View view) {
                                    C0414h.this.f1795j.setAlpha(1.0f);
                                    C0414h.this.f1798m.mo1823a((C0406gu) null);
                                    C0414h.this.f1798m = null;
                                }
                            });
                        } else {
                            hVar.f1795j.setAlpha(1.0f);
                            hVar.f1795j.setVisibility(0);
                            hVar.f1795j.sendAccessibilityEvent(32);
                            if (hVar.f1795j.getParent() instanceof View) {
                                C0396gq.m1270g((View) hVar.f1795j.getParent());
                            }
                        }
                        if (hVar.f1796k != null) {
                            hVar.f1788c.getDecorView().post(hVar.f1797l);
                        }
                    } else {
                        hVar.f1794i = null;
                    }
                }
                hVar.f1794i = hVar.f1794i;
            }
            C0802u uVar = hVar.f1794i;
            if (uVar != null) {
                return aVar.mo2836b(uVar);
            }
            return null;
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0414h.this.mo1846a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0414h.this.mo1845a(keyEvent.getKeyCode(), keyEvent);
        }

        public final void onContentChanged() {
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0019aj)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0414h hVar = C0414h.this;
            if (i == 108) {
                C0177c a = hVar.mo1778a();
                if (a != null) {
                    a.mo1118c(true);
                }
            }
            return true;
        }

        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0414h.this.mo1848d(i);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            C0019aj ajVar = menu instanceof C0019aj ? (C0019aj) menu : null;
            if (i == 0 && ajVar == null) {
                return false;
            }
            if (ajVar != null) {
                ajVar.f112k = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (ajVar != null) {
                ajVar.f112k = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0430f e = C0414h.this.mo1849e(0);
            if (e == null || e.f1838j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, e.f1838j, i);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0414h.this.f1799n ? m1370a(callback) : super.onWindowStartingActionMode(callback);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0414h.this.f1799n || i != 0) ? super.onWindowStartingActionMode(callback, i) : m1370a(callback);
        }
    }

    /* renamed from: h$d */
    final class C0427d {

        /* renamed from: a */
        C0684m f1822a;

        /* renamed from: b */
        boolean f1823b;

        /* renamed from: c */
        BroadcastReceiver f1824c;

        /* renamed from: d */
        IntentFilter f1825d;

        C0427d(C0684m mVar) {
            this.f1822a = mVar;
            this.f1823b = mVar.mo2479a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1866a() {
            if (this.f1824c != null) {
                C0414h.this.f1787b.unregisterReceiver(this.f1824c);
                this.f1824c = null;
            }
        }
    }

    /* renamed from: h$e */
    class C0429e extends ContentFrameLayout {
        public C0429e(Context context) {
            super(context);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0414h.this.mo1846a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    C0414h.this.mo1855n();
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C0785o.m2608b(getContext(), i));
        }
    }

    /* renamed from: h$f */
    public static final class C0430f {

        /* renamed from: a */
        int f1829a;

        /* renamed from: b */
        int f1830b;

        /* renamed from: c */
        int f1831c;

        /* renamed from: d */
        int f1832d;

        /* renamed from: e */
        int f1833e;

        /* renamed from: f */
        int f1834f;

        /* renamed from: g */
        ViewGroup f1835g;

        /* renamed from: h */
        View f1836h;

        /* renamed from: i */
        View f1837i;

        /* renamed from: j */
        C0019aj f1838j;

        /* renamed from: k */
        C0016ah f1839k;

        /* renamed from: l */
        Context f1840l;

        /* renamed from: m */
        boolean f1841m;

        /* renamed from: n */
        boolean f1842n;

        /* renamed from: o */
        boolean f1843o;

        /* renamed from: p */
        public boolean f1844p;

        /* renamed from: q */
        boolean f1845q = false;

        /* renamed from: r */
        boolean f1846r;

        /* renamed from: s */
        Bundle f1847s;

        C0430f(int i) {
            this.f1829a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1871a(C0019aj ajVar) {
            if (ajVar != this.f1838j) {
                if (this.f1838j != null) {
                    this.f1838j.mo162b((C0101aq) this.f1839k);
                }
                this.f1838j = ajVar;
                if (!(ajVar == null || this.f1839k == null)) {
                    ajVar.mo146a((C0101aq) this.f1839k);
                }
            }
        }
    }

    /* renamed from: h$g */
    final class C0431g implements C0102a {
        C0431g() {
        }

        /* renamed from: a */
        public final void mo196a(C0019aj ajVar, boolean z) {
            C0019aj l = ajVar.mo182l();
            boolean z2 = l != ajVar;
            C0414h hVar = C0414h.this;
            if (z2) {
                ajVar = l;
            }
            C0430f a = hVar.mo1842a((Menu) ajVar);
            if (a != null) {
                if (z2) {
                    C0414h.this.mo1843a(a.f1829a, a, (Menu) l);
                    C0414h.this.mo1844a(a, true);
                    return;
                }
                C0414h.this.mo1844a(a, z);
            }
        }

        /* renamed from: a */
        public final boolean mo197a(C0019aj ajVar) {
            if (ajVar == null && C0414h.this.f1801p) {
                Callback callback = C0414h.this.f1788c.getCallback();
                if (callback != null && !C0414h.this.f1806u) {
                    callback.onMenuOpened(C0126j.AppCompatTheme_tooltipForegroundColor, ajVar);
                }
            }
            return true;
        }
    }

    static {
        if (f1763x && !f1765z) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    boolean z = false;
                    if (th instanceof NotFoundException) {
                        String message = th.getMessage();
                        if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                            z = true;
                        }
                    }
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        NotFoundException notFoundException = new NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C0414h(Context context, Window window, C0322f fVar) {
        this.f1787b = context;
        this.f1788c = window;
        this.f1791f = fVar;
        this.f1789d = this.f1788c.getCallback();
        if (this.f1789d instanceof C0426c) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1790e = new C0426c(this.f1789d);
        this.f1788c.setCallback(this.f1790e);
        C0215cr a = C0215cr.m675a(context, (AttributeSet) null, f1764y);
        Drawable b = a.mo1315b(0);
        if (b != null) {
            this.f1788c.setBackgroundDrawable(b);
        }
        a.f1087b.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m1308a(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            androidx.appcompat.app.AppCompatViewInflater r0 = r8.f1786U
            r1 = 0
            if (r0 != 0) goto L_0x005d
            android.content.Context r0 = r8.f1787b
            int[] r2 = p000.C0116b.C0126j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p000.C0116b.C0126j.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x0056
            java.lang.Class<androidx.appcompat.app.AppCompatViewInflater> r2 = androidx.appcompat.app.AppCompatViewInflater.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0022
            goto L_0x0056
        L_0x0022:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x0037 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x0037 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Throwable -> 0x0037 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0037 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ Throwable -> 0x0037 }
            androidx.appcompat.app.AppCompatViewInflater r2 = (androidx.appcompat.app.AppCompatViewInflater) r2     // Catch:{ Throwable -> 0x0037 }
            r8.f1786U = r2     // Catch:{ Throwable -> 0x0037 }
            goto L_0x005d
        L_0x0037:
            r2 = move-exception
            java.lang.String r3 = "AppCompatDelegate"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to instantiate custom view inflater "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.i(r3, r0, r2)
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            goto L_0x005b
        L_0x0056:
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
        L_0x005b:
            r8.f1786U = r0
        L_0x005d:
            boolean r0 = f1763x
            r2 = 1
            if (r0 == 0) goto L_0x0079
            boolean r0 = r12 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L_0x0071
            r0 = r12
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x0079
            r0 = r2
            goto L_0x007a
        L_0x0071:
            r0 = r9
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r8.m1310a(r0)
            goto L_0x007a
        L_0x0079:
            r0 = r1
        L_0x007a:
            androidx.appcompat.app.AppCompatViewInflater r3 = r8.f1786U
            boolean r4 = f1763x
            boolean r5 = p000.C0224cw.m736a()
            if (r0 == 0) goto L_0x008b
            if (r9 == 0) goto L_0x008b
            android.content.Context r9 = r9.getContext()
            goto L_0x008c
        L_0x008b:
            r9 = r11
        L_0x008c:
            int[] r0 = p000.C0116b.C0126j.View
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r12, r0, r1, r1)
            if (r4 == 0) goto L_0x009b
            int r4 = p000.C0116b.C0126j.View_android_theme
            int r4 = r0.getResourceId(r4, r1)
            goto L_0x009c
        L_0x009b:
            r4 = r1
        L_0x009c:
            if (r4 != 0) goto L_0x00ad
            int r4 = p000.C0116b.C0126j.View_theme
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L_0x00ad
            java.lang.String r6 = "AppCompatViewInflater"
            java.lang.String r7 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r6, r7)
        L_0x00ad:
            r0.recycle()
            if (r4 == 0) goto L_0x00c3
            boolean r0 = r9 instanceof p000.C0805w
            if (r0 == 0) goto L_0x00bd
            r0 = r9
            w r0 = (p000.C0805w) r0
            int r0 = r0.f3393a
            if (r0 == r4) goto L_0x00c3
        L_0x00bd:
            w r0 = new w
            r0.<init>(r9, r4)
            r9 = r0
        L_0x00c3:
            if (r5 == 0) goto L_0x00c9
            android.content.Context r9 = p000.C0212co.m672a(r9)
        L_0x00c9:
            r0 = -1
            int r4 = r10.hashCode()
            switch(r4) {
                case -1946472170: goto L_0x0152;
                case -1455429095: goto L_0x0147;
                case -1346021293: goto L_0x013c;
                case -938935918: goto L_0x0132;
                case -937446323: goto L_0x0128;
                case -658531749: goto L_0x011d;
                case -339785223: goto L_0x0113;
                case 776382189: goto L_0x0109;
                case 1125864064: goto L_0x00ff;
                case 1413872058: goto L_0x00f4;
                case 1601505219: goto L_0x00e9;
                case 1666676343: goto L_0x00de;
                case 2001146706: goto L_0x00d3;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x015c
        L_0x00d3:
            java.lang.String r2 = "Button"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 2
            goto L_0x015c
        L_0x00de:
            java.lang.String r2 = "EditText"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 3
            goto L_0x015c
        L_0x00e9:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 6
            goto L_0x015c
        L_0x00f4:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 9
            goto L_0x015c
        L_0x00ff:
            java.lang.String r4 = "ImageView"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x015c
            r0 = r2
            goto L_0x015c
        L_0x0109:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 7
            goto L_0x015c
        L_0x0113:
            java.lang.String r2 = "Spinner"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 4
            goto L_0x015c
        L_0x011d:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 12
            goto L_0x015c
        L_0x0128:
            java.lang.String r2 = "ImageButton"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 5
            goto L_0x015c
        L_0x0132:
            java.lang.String r2 = "TextView"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = r1
            goto L_0x015c
        L_0x013c:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 10
            goto L_0x015c
        L_0x0147:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 8
            goto L_0x015c
        L_0x0152:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x015c
            r0 = 11
        L_0x015c:
            switch(r0) {
                case 0: goto L_0x01a9;
                case 1: goto L_0x01a3;
                case 2: goto L_0x019d;
                case 3: goto L_0x0197;
                case 4: goto L_0x0191;
                case 5: goto L_0x018b;
                case 6: goto L_0x0185;
                case 7: goto L_0x017f;
                case 8: goto L_0x0179;
                case 9: goto L_0x0173;
                case 10: goto L_0x016d;
                case 11: goto L_0x0167;
                case 12: goto L_0x0161;
                default: goto L_0x015f;
            }
        L_0x015f:
            r0 = 0
            goto L_0x01ae
        L_0x0161:
            bt r0 = new bt
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x0167:
            bs r0 = new bs
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x016d:
            bo r0 = new bo
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x0173:
            bc r0 = new bc
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x0179:
            bg r0 = new bg
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x017f:
            br r0 = new br
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x0185:
            bf r0 = new bf
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x018b:
            bl r0 = new bl
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x0191:
            bv r0 = new bv
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x0197:
            bj r0 = new bj
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x019d:
            be r0 = new be
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x01a3:
            bn r0 = new bn
            r0.<init>(r9, r12)
            goto L_0x01ae
        L_0x01a9:
            bx r0 = new bx
            r0.<init>(r9, r12)
        L_0x01ae:
            if (r0 != 0) goto L_0x01b6
            if (r11 == r9) goto L_0x01b6
            android.view.View r0 = r3.mo338a(r9, r10, r12)
        L_0x01b6:
            if (r0 == 0) goto L_0x01e4
            android.content.Context r9 = r0.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x01e4
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 15
            if (r10 < r11) goto L_0x01cd
            boolean r10 = p000.C0396gq.m1277n(r0)
            if (r10 != 0) goto L_0x01cd
            return r0
        L_0x01cd:
            int[] r10 = androidx.appcompat.app.AppCompatViewInflater.f285a
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r1)
            if (r10 == 0) goto L_0x01e1
            androidx.appcompat.app.AppCompatViewInflater$a r11 = new androidx.appcompat.app.AppCompatViewInflater$a
            r11.<init>(r0, r10)
            r0.setOnClickListener(r11)
        L_0x01e1:
            r9.recycle()
        L_0x01e4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0414h.m1308a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0162, code lost:
        if (r14.f1836h != null) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0168  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1309a(p000.C0414h.C0430f r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f1843o
            if (r0 != 0) goto L_0x01e0
            boolean r0 = r13.f1806u
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r14.f1829a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0026
            android.content.Context r0 = r13.f1787b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0022
            r0 = r2
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            return
        L_0x0026:
            android.view.Window r0 = r13.f1788c
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L_0x003c
            int r3 = r14.f1829a
            aj r4 = r14.f1838j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003c
            r13.mo1844a(r14, r2)
            return
        L_0x003c:
            android.content.Context r0 = r13.f1787b
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            boolean r15 = r13.m1312b(r14, r15)
            if (r15 != 0) goto L_0x0050
            return
        L_0x0050:
            android.view.ViewGroup r15 = r14.f1835g
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006e
            boolean r15 = r14.f1845q
            if (r15 == 0) goto L_0x005b
            goto L_0x006e
        L_0x005b:
            android.view.View r15 = r14.f1837i
            if (r15 == 0) goto L_0x01be
            android.view.View r15 = r14.f1837i
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01be
            int r15 = r15.width
            if (r15 != r3) goto L_0x01be
            r6 = r3
            goto L_0x01bf
        L_0x006e:
            android.view.ViewGroup r15 = r14.f1835g
            if (r15 != 0) goto L_0x00e3
            android.content.Context r15 = r13.mo1852k()
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            int r6 = p000.C0116b.C0117a.actionBarPopupTheme
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x0098
            int r6 = r3.resourceId
            r5.applyStyle(r6, r2)
        L_0x0098:
            int r6 = p000.C0116b.C0117a.panelMenuListTheme
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x00a7
            int r3 = r3.resourceId
        L_0x00a3:
            r5.applyStyle(r3, r2)
            goto L_0x00aa
        L_0x00a7:
            int r3 = p000.C0116b.C0125i.Theme_AppCompat_CompactMenu
            goto L_0x00a3
        L_0x00aa:
            w r3 = new w
            r3.<init>(r15, r1)
            android.content.res.Resources$Theme r15 = r3.getTheme()
            r15.setTo(r5)
            r14.f1840l = r3
            int[] r15 = p000.C0116b.C0126j.AppCompatTheme
            android.content.res.TypedArray r15 = r3.obtainStyledAttributes(r15)
            int r3 = p000.C0116b.C0126j.AppCompatTheme_panelBackground
            int r3 = r15.getResourceId(r3, r1)
            r14.f1830b = r3
            int r3 = p000.C0116b.C0126j.AppCompatTheme_android_windowAnimationStyle
            int r3 = r15.getResourceId(r3, r1)
            r14.f1834f = r3
            r15.recycle()
            h$e r15 = new h$e
            android.content.Context r3 = r14.f1840l
            r15.<init>(r3)
            r14.f1835g = r15
            r15 = 81
            r14.f1831c = r15
            android.view.ViewGroup r15 = r14.f1835g
            if (r15 != 0) goto L_0x00f4
            return
        L_0x00e3:
            boolean r15 = r14.f1845q
            if (r15 == 0) goto L_0x00f4
            android.view.ViewGroup r15 = r14.f1835g
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f4
            android.view.ViewGroup r15 = r14.f1835g
            r15.removeAllViews()
        L_0x00f4:
            android.view.View r15 = r14.f1837i
            if (r15 == 0) goto L_0x00fe
            android.view.View r15 = r14.f1837i
            r14.f1836h = r15
        L_0x00fc:
            r15 = r2
            goto L_0x0166
        L_0x00fe:
            aj r15 = r14.f1838j
            if (r15 == 0) goto L_0x0165
            h$g r15 = r13.f1769D
            if (r15 != 0) goto L_0x010d
            h$g r15 = new h$g
            r15.<init>()
            r13.f1769D = r15
        L_0x010d:
            h$g r15 = r13.f1769D
            aj r3 = r14.f1838j
            if (r3 != 0) goto L_0x0115
            r15 = 0
            goto L_0x015c
        L_0x0115:
            ah r3 = r14.f1839k
            if (r3 != 0) goto L_0x012f
            ah r3 = new ah
            android.content.Context r5 = r14.f1840l
            int r6 = p000.C0116b.C0123g.abc_list_menu_item_layout
            r3.<init>(r5, r6)
            r14.f1839k = r3
            ah r3 = r14.f1839k
            r3.f90h = r15
            aj r15 = r14.f1838j
            ah r3 = r14.f1839k
            r15.mo146a(r3)
        L_0x012f:
            ah r15 = r14.f1839k
            android.view.ViewGroup r3 = r14.f1835g
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.f86d
            if (r5 != 0) goto L_0x015a
            android.view.LayoutInflater r5 = r15.f84b
            int r6 = p000.C0116b.C0123g.abc_expanded_menu_layout
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.f86d = r3
            ah$a r3 = r15.f91i
            if (r3 != 0) goto L_0x014e
            ah$a r3 = new ah$a
            r3.<init>()
            r15.f91i = r3
        L_0x014e:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f86d
            ah$a r5 = r15.f91i
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.f86d
            r3.setOnItemClickListener(r15)
        L_0x015a:
            androidx.appcompat.view.menu.ExpandedMenuView r15 = r15.f86d
        L_0x015c:
            android.view.View r15 = (android.view.View) r15
            r14.f1836h = r15
            android.view.View r15 = r14.f1836h
            if (r15 == 0) goto L_0x0165
            goto L_0x00fc
        L_0x0165:
            r15 = r1
        L_0x0166:
            if (r15 == 0) goto L_0x01e0
            android.view.View r15 = r14.f1836h
            if (r15 == 0) goto L_0x017f
            android.view.View r15 = r14.f1837i
            if (r15 == 0) goto L_0x0172
        L_0x0170:
            r15 = r2
            goto L_0x0180
        L_0x0172:
            ah r15 = r14.f1839k
            android.widget.ListAdapter r15 = r15.mo128b()
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x017f
            goto L_0x0170
        L_0x017f:
            r15 = r1
        L_0x0180:
            if (r15 != 0) goto L_0x0183
            return
        L_0x0183:
            android.view.View r15 = r14.f1836h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0190
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0190:
            int r3 = r14.f1830b
            android.view.ViewGroup r5 = r14.f1835g
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f1836h
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x01aa
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01aa
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f1836h
            r3.removeView(r5)
        L_0x01aa:
            android.view.ViewGroup r3 = r14.f1835g
            android.view.View r5 = r14.f1836h
            r3.addView(r5, r15)
            android.view.View r15 = r14.f1836h
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01be
            android.view.View r15 = r14.f1836h
            r15.requestFocus()
        L_0x01be:
            r6 = r4
        L_0x01bf:
            r14.f1842n = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            int r8 = r14.f1832d
            int r9 = r14.f1833e
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.f1831c
            r15.gravity = r1
            int r1 = r14.f1834f
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.f1835g
            r0.addView(r1, r15)
            r14.f1843o = r2
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0414h.m1309a(h$f, android.view.KeyEvent):void");
    }

    /* renamed from: a */
    private boolean m1310a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1788c.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0396gq.m1276m((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m1311a(C0430f fVar, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((fVar.f1841m || m1312b(fVar, keyEvent)) && fVar.f1838j != null) {
            z = fVar.f1838j.performShortcut(i, keyEvent, 1);
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1312b(p000.C0414h.C0430f r11, android.view.KeyEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f1806u
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r11.f1841m
            r2 = 1
            if (r0 == 0) goto L_0x000c
            return r2
        L_0x000c:
            h$f r0 = r10.f1777L
            if (r0 == 0) goto L_0x0019
            h$f r0 = r10.f1777L
            if (r0 == r11) goto L_0x0019
            h$f r0 = r10.f1777L
            r10.mo1844a(r0, r1)
        L_0x0019:
            android.view.Window r0 = r10.f1788c
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L_0x0029
            int r3 = r11.f1829a
            android.view.View r3 = r0.onCreatePanelView(r3)
            r11.f1837i = r3
        L_0x0029:
            int r3 = r11.f1829a
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == 0) goto L_0x0036
            int r3 = r11.f1829a
            if (r3 != r4) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = r1
            goto L_0x0037
        L_0x0036:
            r3 = r2
        L_0x0037:
            if (r3 == 0) goto L_0x0042
            bz r5 = r10.f1767B
            if (r5 == 0) goto L_0x0042
            bz r5 = r10.f1767B
            r5.mo428g()
        L_0x0042:
            android.view.View r5 = r11.f1837i
            if (r5 != 0) goto L_0x015b
            if (r3 == 0) goto L_0x004e
            c r5 = r10.f1792g
            boolean r5 = r5 instanceof p000.C0594k
            if (r5 != 0) goto L_0x015b
        L_0x004e:
            aj r5 = r11.f1838j
            r6 = 0
            if (r5 == 0) goto L_0x0057
            boolean r5 = r11.f1846r
            if (r5 == 0) goto L_0x0109
        L_0x0057:
            aj r5 = r11.f1838j
            if (r5 != 0) goto L_0x00cd
            android.content.Context r5 = r10.f1787b
            int r7 = r11.f1829a
            if (r7 == 0) goto L_0x0065
            int r7 = r11.f1829a
            if (r7 != r4) goto L_0x00bc
        L_0x0065:
            bz r4 = r10.f1767B
            if (r4 == 0) goto L_0x00bc
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r7 = r5.getTheme()
            int r8 = p000.C0116b.C0117a.actionBarTheme
            r7.resolveAttribute(r8, r4, r2)
            int r8 = r4.resourceId
            if (r8 == 0) goto L_0x0091
            android.content.res.Resources r8 = r5.getResources()
            android.content.res.Resources$Theme r8 = r8.newTheme()
            r8.setTo(r7)
            int r9 = r4.resourceId
            r8.applyStyle(r9, r2)
            int r9 = p000.C0116b.C0117a.actionBarWidgetTheme
            r8.resolveAttribute(r9, r4, r2)
            goto L_0x0097
        L_0x0091:
            int r8 = p000.C0116b.C0117a.actionBarWidgetTheme
            r7.resolveAttribute(r8, r4, r2)
            r8 = r6
        L_0x0097:
            int r9 = r4.resourceId
            if (r9 == 0) goto L_0x00ad
            if (r8 != 0) goto L_0x00a8
            android.content.res.Resources r8 = r5.getResources()
            android.content.res.Resources$Theme r8 = r8.newTheme()
            r8.setTo(r7)
        L_0x00a8:
            int r4 = r4.resourceId
            r8.applyStyle(r4, r2)
        L_0x00ad:
            if (r8 == 0) goto L_0x00bc
            w r4 = new w
            r4.<init>(r5, r1)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            r5.setTo(r8)
            goto L_0x00bd
        L_0x00bc:
            r4 = r5
        L_0x00bd:
            aj r5 = new aj
            r5.<init>(r4)
            r5.mo144a(r10)
            r11.mo1871a(r5)
            aj r4 = r11.f1838j
            if (r4 != 0) goto L_0x00cd
            return r1
        L_0x00cd:
            if (r3 == 0) goto L_0x00e7
            bz r4 = r10.f1767B
            if (r4 == 0) goto L_0x00e7
            h$a r4 = r10.f1768C
            if (r4 != 0) goto L_0x00de
            h$a r4 = new h$a
            r4.<init>()
            r10.f1768C = r4
        L_0x00de:
            bz r4 = r10.f1767B
            aj r5 = r11.f1838j
            h$a r7 = r10.f1768C
            r4.mo419a(r5, r7)
        L_0x00e7:
            aj r4 = r11.f1838j
            r4.mo171e()
            int r4 = r11.f1829a
            aj r5 = r11.f1838j
            boolean r4 = r0.onCreatePanelMenu(r4, r5)
            if (r4 != 0) goto L_0x0107
            r11.mo1871a(r6)
            if (r3 == 0) goto L_0x0106
            bz r11 = r10.f1767B
            if (r11 == 0) goto L_0x0106
            bz r11 = r10.f1767B
            h$a r12 = r10.f1768C
            r11.mo419a(r6, r12)
        L_0x0106:
            return r1
        L_0x0107:
            r11.f1846r = r1
        L_0x0109:
            aj r4 = r11.f1838j
            r4.mo171e()
            android.os.Bundle r4 = r11.f1847s
            if (r4 == 0) goto L_0x011b
            aj r4 = r11.f1838j
            android.os.Bundle r5 = r11.f1847s
            r4.mo161b(r5)
            r11.f1847s = r6
        L_0x011b:
            android.view.View r4 = r11.f1837i
            aj r5 = r11.f1838j
            boolean r0 = r0.onPreparePanel(r1, r4, r5)
            if (r0 != 0) goto L_0x0138
            if (r3 == 0) goto L_0x0132
            bz r12 = r10.f1767B
            if (r12 == 0) goto L_0x0132
            bz r12 = r10.f1767B
            h$a r0 = r10.f1768C
            r12.mo419a(r6, r0)
        L_0x0132:
            aj r11 = r11.f1838j
            r11.mo172f()
            return r1
        L_0x0138:
            if (r12 == 0) goto L_0x013f
            int r12 = r12.getDeviceId()
            goto L_0x0140
        L_0x013f:
            r12 = -1
        L_0x0140:
            android.view.KeyCharacterMap r12 = android.view.KeyCharacterMap.load(r12)
            int r12 = r12.getKeyboardType()
            if (r12 == r2) goto L_0x014c
            r12 = r2
            goto L_0x014d
        L_0x014c:
            r12 = r1
        L_0x014d:
            r11.f1844p = r12
            aj r12 = r11.f1838j
            boolean r0 = r11.f1844p
            r12.setQwertyMode(r0)
            aj r12 = r11.f1838j
            r12.mo172f()
        L_0x015b:
            r11.f1841m = r2
            r11.f1842n = r1
            r10.f1777L = r11
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0414h.m1312b(h$f, android.view.KeyEvent):boolean");
    }

    /* renamed from: h */
    private void m1313h(int i) {
        this.f1808w = (1 << i) | this.f1808w;
        if (!this.f1807v) {
            C0396gq.m1260a(this.f1788c.getDecorView(), this.f1782Q);
            this.f1807v = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1314p() {
        /*
            r3 = this;
            r3.m1315q()
            boolean r0 = r3.f1801p
            if (r0 == 0) goto L_0x003b
            c r0 = r3.f1792g
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            android.view.Window$Callback r0 = r3.f1789d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0020
            n r0 = new n
            android.view.Window$Callback r1 = r3.f1789d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f1802q
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f1792g = r0
            goto L_0x0030
        L_0x0020:
            android.view.Window$Callback r0 = r3.f1789d
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x0030
            n r0 = new n
            android.view.Window$Callback r1 = r3.f1789d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x0030:
            c r0 = r3.f1792g
            if (r0 == 0) goto L_0x003b
            c r0 = r3.f1792g
            boolean r1 = r3.f1783R
            r0.mo1113a(r1)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0414h.m1314p():void");
    }

    /* renamed from: q */
    private void m1315q() {
        ViewGroup viewGroup;
        if (!this.f1770E) {
            TypedArray obtainStyledAttributes = this.f1787b.obtainStyledAttributes(C0126j.AppCompatTheme);
            if (!obtainStyledAttributes.hasValue(C0126j.AppCompatTheme_windowActionBar)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(C0126j.AppCompatTheme_windowNoTitle, false)) {
                mo1789c(1);
            } else if (obtainStyledAttributes.getBoolean(C0126j.AppCompatTheme_windowActionBar, false)) {
                mo1789c(C0126j.AppCompatTheme_tooltipForegroundColor);
            }
            if (obtainStyledAttributes.getBoolean(C0126j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo1789c(C0126j.AppCompatTheme_tooltipFrameBackground);
            }
            if (obtainStyledAttributes.getBoolean(C0126j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo1789c(10);
            }
            this.f1804s = obtainStyledAttributes.getBoolean(C0126j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f1788c.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1787b);
            if (this.f1805t) {
                viewGroup = (ViewGroup) from.inflate(this.f1803r ? C0123g.abc_screen_simple_overlay_action_mode : C0123g.abc_screen_simple, null);
                if (VERSION.SDK_INT >= 21) {
                    C0396gq.m1259a((View) viewGroup, (C0394go) new C0394go() {
                        /* renamed from: a */
                        public final C0409gx mo1816a(View view, C0409gx gxVar) {
                            int i = 0;
                            int systemWindowInsetTop = VERSION.SDK_INT >= 20 ? ((WindowInsets) gxVar.f1758a).getSystemWindowInsetTop() : 0;
                            int g = C0414h.this.mo1851g(systemWindowInsetTop);
                            if (systemWindowInsetTop != g) {
                                int systemWindowInsetLeft = VERSION.SDK_INT >= 20 ? ((WindowInsets) gxVar.f1758a).getSystemWindowInsetLeft() : 0;
                                int systemWindowInsetRight = VERSION.SDK_INT >= 20 ? ((WindowInsets) gxVar.f1758a).getSystemWindowInsetRight() : 0;
                                if (VERSION.SDK_INT >= 20) {
                                    i = ((WindowInsets) gxVar.f1758a).getSystemWindowInsetBottom();
                                }
                                gxVar = VERSION.SDK_INT >= 20 ? new C0409gx(((WindowInsets) gxVar.f1758a).replaceSystemWindowInsets(systemWindowInsetLeft, g, systemWindowInsetRight, i)) : null;
                            }
                            return C0396gq.m1251a(view, gxVar);
                        }
                    });
                } else {
                    ((C0185cd) viewGroup).setOnFitSystemWindowsListener(new C0186a() {
                        /* renamed from: a */
                        public final void mo1176a(Rect rect) {
                            rect.top = C0414h.this.mo1851g(rect.top);
                        }
                    });
                }
            } else if (this.f1804s) {
                viewGroup = (ViewGroup) from.inflate(C0123g.abc_dialog_title_material, null);
                this.f1802q = false;
                this.f1801p = false;
            } else if (this.f1801p) {
                TypedValue typedValue = new TypedValue();
                this.f1787b.getTheme().resolveAttribute(C0117a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0805w(this.f1787b, typedValue.resourceId) : this.f1787b).inflate(C0123g.abc_screen_toolbar, null);
                this.f1767B = (C0176bz) viewGroup.findViewById(C0122f.decor_content_parent);
                this.f1767B.setWindowCallback(this.f1788c.getCallback());
                if (this.f1802q) {
                    this.f1767B.mo418a(C0126j.AppCompatTheme_tooltipFrameBackground);
                }
                if (this.f1773H) {
                    this.f1767B.mo418a(2);
                }
                if (this.f1774I) {
                    this.f1767B.mo418a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.f1801p);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.f1802q);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.f1804s);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.f1803r);
                sb.append(", windowNoTitle: ");
                sb.append(this.f1805t);
                sb.append(" }");
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.f1767B == null) {
                this.f1771F = (TextView) viewGroup.findViewById(C0122f.title);
            }
            C0225cx.m740b(viewGroup);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0122f.action_bar_activity_content);
            ViewGroup viewGroup2 = (ViewGroup) this.f1788c.findViewById(16908290);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.f1788c.setContentView(viewGroup);
            contentFrameLayout.setAttachListener(new C0060a() {
                /* renamed from: a */
                public final void mo539a() {
                    C0414h.this.mo1856o();
                }
            });
            this.f1800o = viewGroup;
            CharSequence title = this.f1789d instanceof Activity ? ((Activity) this.f1789d).getTitle() : this.f1766A;
            if (!TextUtils.isEmpty(title)) {
                if (this.f1767B != null) {
                    this.f1767B.setWindowTitle(title);
                } else if (this.f1792g != null) {
                    this.f1792g.mo1112a(title);
                } else if (this.f1771F != null) {
                    this.f1771F.setText(title);
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1800o.findViewById(16908290);
            View decorView = this.f1788c.getDecorView();
            contentFrameLayout2.f428b.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (C0396gq.m1275l(contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray obtainStyledAttributes2 = this.f1787b.obtainStyledAttributes(C0126j.AppCompatTheme);
            obtainStyledAttributes2.getValue(C0126j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
            obtainStyledAttributes2.getValue(C0126j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
            if (obtainStyledAttributes2.hasValue(C0126j.AppCompatTheme_windowFixedWidthMajor)) {
                obtainStyledAttributes2.getValue(C0126j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
            }
            if (obtainStyledAttributes2.hasValue(C0126j.AppCompatTheme_windowFixedWidthMinor)) {
                obtainStyledAttributes2.getValue(C0126j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
            }
            if (obtainStyledAttributes2.hasValue(C0126j.AppCompatTheme_windowFixedHeightMajor)) {
                obtainStyledAttributes2.getValue(C0126j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
            }
            if (obtainStyledAttributes2.hasValue(C0126j.AppCompatTheme_windowFixedHeightMinor)) {
                obtainStyledAttributes2.getValue(C0126j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.f1770E = true;
            C0430f e = mo1849e(0);
            if (this.f1806u) {
                return;
            }
            if (e == null || e.f1838j == null) {
                m1313h(C0126j.AppCompatTheme_tooltipForegroundColor);
            }
        }
    }

    /* renamed from: r */
    private void m1316r() {
        if (this.f1770E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: s */
    private void m1317s() {
        if (this.f1781P == null) {
            Context context = this.f1787b;
            if (C0684m.f2950a == null) {
                Context applicationContext = context.getApplicationContext();
                C0684m.f2950a = new C0684m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1781P = new C0427d(C0684m.f2950a);
        }
    }

    /* renamed from: t */
    private boolean m1318t() {
        if (!this.f1780O || !(this.f1787b instanceof Activity)) {
            return false;
        }
        try {
            return (this.f1787b.getPackageManager().getActivityInfo(new ComponentName(this.f1787b, this.f1787b.getClass()), 0).configChanges & 512) == 0;
        } catch (NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* renamed from: a */
    public final <T extends View> T mo1777a(int i) {
        m1315q();
        return this.f1788c.findViewById(i);
    }

    /* renamed from: a */
    public final C0177c mo1778a() {
        m1314p();
        return this.f1792g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0430f mo1842a(Menu menu) {
        C0430f[] fVarArr = this.f1776K;
        int length = fVarArr != null ? fVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0430f fVar = fVarArr[i];
            if (fVar != null && fVar.f1838j == menu) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1843a(int i, C0430f fVar, Menu menu) {
        if (menu == null) {
            if (fVar == null && i >= 0 && i < this.f1776K.length) {
                fVar = this.f1776K[i];
            }
            if (fVar != null) {
                menu = fVar.f1838j;
            }
        }
        if ((fVar == null || fVar.f1843o) && !this.f1806u) {
            this.f1789d.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public final void mo193a(C0019aj ajVar) {
        if (this.f1767B == null || !this.f1767B.mo420b() || (ViewConfiguration.get(this.f1787b).hasPermanentMenuKey() && !this.f1767B.mo423d())) {
            C0430f e = mo1849e(0);
            e.f1845q = true;
            mo1844a(e, false);
            m1309a(e, (KeyEvent) null);
            return;
        }
        Callback callback = this.f1788c.getCallback();
        if (this.f1767B.mo421c()) {
            this.f1767B.mo426f();
            if (!this.f1806u) {
                callback.onPanelClosed(C0126j.AppCompatTheme_tooltipForegroundColor, mo1849e(0).f1838j);
            }
        } else if (callback != null && !this.f1806u) {
            if (this.f1807v && (1 & this.f1808w) != 0) {
                this.f1788c.getDecorView().removeCallbacks(this.f1782Q);
                this.f1782Q.run();
            }
            C0430f e2 = mo1849e(0);
            if (e2.f1838j != null && !e2.f1846r && callback.onPreparePanel(0, e2.f1837i, e2.f1838j)) {
                callback.onMenuOpened(C0126j.AppCompatTheme_tooltipForegroundColor, e2.f1838j);
                this.f1767B.mo425e();
            }
        }
    }

    /* renamed from: a */
    public final void mo1779a(Configuration configuration) {
        if (this.f1801p && this.f1770E) {
            C0177c a = mo1778a();
            if (a != null) {
                a.mo1111a(configuration);
            }
        }
        C0147bi.m485a().mo968a(this.f1787b);
        mo1796j();
    }

    /* renamed from: a */
    public final void mo1780a(Bundle bundle) {
        if (this.f1789d instanceof Activity) {
            String str = null;
            try {
                str = C0309es.m1042b((Activity) this.f1789d);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0177c cVar = this.f1792g;
                if (cVar == null) {
                    this.f1783R = true;
                } else {
                    cVar.mo1113a(true);
                }
            }
        }
        if (bundle != null && this.f1779N == -100) {
            this.f1779N = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: a */
    public final void mo1781a(View view) {
        m1315q();
        ViewGroup viewGroup = (ViewGroup) this.f1800o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1789d.onContentChanged();
    }

    /* renamed from: a */
    public final void mo1782a(View view, LayoutParams layoutParams) {
        m1315q();
        ViewGroup viewGroup = (ViewGroup) this.f1800o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1789d.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1844a(C0430f fVar, boolean z) {
        if (!z || fVar.f1829a != 0 || this.f1767B == null || !this.f1767B.mo421c()) {
            WindowManager windowManager = (WindowManager) this.f1787b.getSystemService("window");
            if (!(windowManager == null || !fVar.f1843o || fVar.f1835g == null)) {
                windowManager.removeView(fVar.f1835g);
                if (z) {
                    mo1843a(fVar.f1829a, fVar, (Menu) null);
                }
            }
            fVar.f1841m = false;
            fVar.f1842n = false;
            fVar.f1843o = false;
            fVar.f1836h = null;
            fVar.f1845q = true;
            if (this.f1777L == fVar) {
                this.f1777L = null;
            }
            return;
        }
        mo1847b(fVar.f1838j);
    }

    /* renamed from: a */
    public final void mo1783a(CharSequence charSequence) {
        this.f1766A = charSequence;
        if (this.f1767B != null) {
            this.f1767B.setWindowTitle(charSequence);
        } else if (this.f1792g != null) {
            this.f1792g.mo1112a(charSequence);
        } else {
            if (this.f1771F != null) {
                this.f1771F.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1845a(int i, KeyEvent keyEvent) {
        C0177c a = mo1778a();
        if (a != null && a.mo1114a(i, keyEvent)) {
            return true;
        }
        if (this.f1777L == null || !m1311a(this.f1777L, keyEvent.getKeyCode(), keyEvent)) {
            if (this.f1777L == null) {
                C0430f e = mo1849e(0);
                m1312b(e, keyEvent);
                boolean a2 = m1311a(e, keyEvent.getKeyCode(), keyEvent);
                e.f1841m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        if (this.f1777L != null) {
            this.f1777L.f1842n = true;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo194a(C0019aj ajVar, MenuItem menuItem) {
        Callback callback = this.f1788c.getCallback();
        if (callback != null && !this.f1806u) {
            C0430f a = mo1842a((Menu) ajVar.mo182l());
            if (a != null) {
                return callback.onMenuItemSelected(a.f1829a, menuItem);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0117 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0118 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1846a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f1789d
            boolean r0 = r0 instanceof p000.C0385gg.C0386a
            r1 = 1
            if (r0 != 0) goto L_0x000d
            android.view.Window$Callback r0 = r6.f1789d
            boolean r0 = r0 instanceof p000.C0493i
            if (r0 == 0) goto L_0x001c
        L_0x000d:
            android.view.Window r0 = r6.f1788c
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001c
            boolean r0 = p000.C0385gg.m1234a(r0, r7)
            if (r0 == 0) goto L_0x001c
            return r1
        L_0x001c:
            int r0 = r7.getKeyCode()
            r2 = 82
            if (r0 != r2) goto L_0x002d
            android.view.Window$Callback r0 = r6.f1789d
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r1
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = r1
            goto L_0x003b
        L_0x003a:
            r3 = r4
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0062
            if (r0 == r5) goto L_0x0055
            if (r0 == r2) goto L_0x0043
            return r4
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0054
            h$f r0 = r6.mo1849e(r4)
            boolean r2 = r0.f1843o
            if (r2 != 0) goto L_0x0054
            r6.m1312b(r0, r7)
        L_0x0054:
            return r1
        L_0x0055:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r4
        L_0x005f:
            r6.f1778M = r1
            return r4
        L_0x0062:
            if (r0 == r5) goto L_0x00e8
            if (r0 == r2) goto L_0x0067
            return r4
        L_0x0067:
            u r0 = r6.f1794i
            if (r0 != 0) goto L_0x00e7
            h$f r0 = r6.mo1849e(r4)
            bz r2 = r6.f1767B
            if (r2 == 0) goto L_0x00a7
            bz r2 = r6.f1767B
            boolean r2 = r2.mo420b()
            if (r2 == 0) goto L_0x00a7
            android.content.Context r2 = r6.f1787b
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            boolean r2 = r2.hasPermanentMenuKey()
            if (r2 != 0) goto L_0x00a7
            bz r2 = r6.f1767B
            boolean r2 = r2.mo421c()
            if (r2 != 0) goto L_0x00a0
            boolean r2 = r6.f1806u
            if (r2 != 0) goto L_0x00c7
            boolean r7 = r6.m1312b(r0, r7)
            if (r7 == 0) goto L_0x00c7
            bz r7 = r6.f1767B
            boolean r7 = r7.mo425e()
            goto L_0x00ce
        L_0x00a0:
            bz r7 = r6.f1767B
            boolean r7 = r7.mo426f()
            goto L_0x00ce
        L_0x00a7:
            boolean r2 = r0.f1843o
            if (r2 != 0) goto L_0x00c9
            boolean r2 = r0.f1842n
            if (r2 == 0) goto L_0x00b0
            goto L_0x00c9
        L_0x00b0:
            boolean r2 = r0.f1841m
            if (r2 == 0) goto L_0x00c7
            boolean r2 = r0.f1846r
            if (r2 == 0) goto L_0x00bf
            r0.f1841m = r4
            boolean r2 = r6.m1312b(r0, r7)
            goto L_0x00c0
        L_0x00bf:
            r2 = r1
        L_0x00c0:
            if (r2 == 0) goto L_0x00c7
            r6.m1309a(r0, r7)
            r7 = r1
            goto L_0x00ce
        L_0x00c7:
            r7 = r4
            goto L_0x00ce
        L_0x00c9:
            boolean r7 = r0.f1843o
            r6.mo1844a(r0, r1)
        L_0x00ce:
            if (r7 == 0) goto L_0x00e7
            android.content.Context r7 = r6.f1787b
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e0
            r7.playSoundEffect(r4)
            return r1
        L_0x00e0:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
        L_0x00e7:
            return r1
        L_0x00e8:
            boolean r7 = r6.f1778M
            r6.f1778M = r4
            h$f r0 = r6.mo1849e(r4)
            if (r0 == 0) goto L_0x00fc
            boolean r2 = r0.f1843o
            if (r2 == 0) goto L_0x00fc
            if (r7 != 0) goto L_0x00fb
            r6.mo1844a(r0, r1)
        L_0x00fb:
            return r1
        L_0x00fc:
            u r7 = r6.f1794i
            if (r7 == 0) goto L_0x0107
            u r7 = r6.f1794i
            r7.mo2592c()
        L_0x0105:
            r7 = r1
            goto L_0x0115
        L_0x0107:
            c r7 = r6.mo1778a()
            if (r7 == 0) goto L_0x0114
            boolean r7 = r7.mo1122f()
            if (r7 == 0) goto L_0x0114
            goto L_0x0105
        L_0x0114:
            r7 = r4
        L_0x0115:
            if (r7 == 0) goto L_0x0118
            return r1
        L_0x0118:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0414h.mo1846a(android.view.KeyEvent):boolean");
    }

    /* renamed from: b */
    public final MenuInflater mo1784b() {
        if (this.f1793h == null) {
            m1314p();
            this.f1793h = new C0817z(this.f1792g != null ? this.f1792g.mo1116b() : this.f1787b);
        }
        return this.f1793h;
    }

    /* renamed from: b */
    public final void mo1785b(int i) {
        m1315q();
        ViewGroup viewGroup = (ViewGroup) this.f1800o.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1787b).inflate(i, viewGroup);
        this.f1789d.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1847b(C0019aj ajVar) {
        if (!this.f1775J) {
            this.f1775J = true;
            this.f1767B.mo435h();
            Callback callback = this.f1788c.getCallback();
            if (callback != null && !this.f1806u) {
                callback.onPanelClosed(C0126j.AppCompatTheme_tooltipForegroundColor, ajVar);
            }
            this.f1775J = false;
        }
    }

    /* renamed from: b */
    public final void mo1786b(Bundle bundle) {
        if (this.f1779N != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f1779N);
        }
    }

    /* renamed from: b */
    public final void mo1787b(View view, LayoutParams layoutParams) {
        m1315q();
        ((ViewGroup) this.f1800o.findViewById(16908290)).addView(view, layoutParams);
        this.f1789d.onContentChanged();
    }

    /* renamed from: c */
    public final void mo1788c() {
        m1315q();
    }

    /* renamed from: c */
    public final boolean mo1789c(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = C0126j.AppCompatTheme_tooltipFrameBackground;
        }
        if (this.f1805t && i == 108) {
            return false;
        }
        if (this.f1801p && i == 1) {
            this.f1801p = false;
        }
        switch (i) {
            case 1:
                m1316r();
                this.f1805t = true;
                return true;
            case 2:
                m1316r();
                this.f1773H = true;
                return true;
            case 5:
                m1316r();
                this.f1774I = true;
                return true;
            case 10:
                m1316r();
                this.f1803r = true;
                return true;
            case C0126j.AppCompatTheme_tooltipForegroundColor /*108*/:
                m1316r();
                this.f1801p = true;
                return true;
            case C0126j.AppCompatTheme_tooltipFrameBackground /*109*/:
                m1316r();
                this.f1802q = true;
                return true;
            default:
                return this.f1788c.requestFeature(i);
        }
    }

    /* renamed from: d */
    public final void mo1790d() {
        mo1796j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1848d(int i) {
        if (i == 108) {
            C0177c a = mo1778a();
            if (a != null) {
                a.mo1118c(false);
            }
            return;
        }
        if (i == 0) {
            C0430f e = mo1849e(i);
            if (e.f1843o) {
                mo1844a(e, false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C0430f mo1849e(int i) {
        C0430f[] fVarArr = this.f1776K;
        if (fVarArr == null || fVarArr.length <= i) {
            C0430f[] fVarArr2 = new C0430f[(i + 1)];
            if (fVarArr != null) {
                System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            }
            this.f1776K = fVarArr2;
            fVarArr = fVarArr2;
        }
        C0430f fVar = fVarArr[i];
        if (fVar != null) {
            return fVar;
        }
        C0430f fVar2 = new C0430f(i);
        fVarArr[i] = fVar2;
        return fVar2;
    }

    /* renamed from: e */
    public final void mo1791e() {
        C0177c a = mo1778a();
        if (a != null) {
            a.mo1117b(false);
        }
        if (this.f1781P != null) {
            this.f1781P.mo1866a();
        }
    }

    /* renamed from: f */
    public final void mo1792f() {
        C0177c a = mo1778a();
        if (a != null) {
            a.mo1117b(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo1850f(int i) {
        C0430f e = mo1849e(i);
        if (e.f1838j != null) {
            Bundle bundle = new Bundle();
            e.f1838j.mo145a(bundle);
            if (bundle.size() > 0) {
                e.f1847s = bundle;
            }
            e.f1838j.mo171e();
            e.f1838j.clear();
        }
        e.f1846r = true;
        e.f1845q = true;
        if ((i == 108 || i == 0) && this.f1767B != null) {
            C0430f e2 = mo1849e(0);
            if (e2 != null) {
                e2.f1841m = false;
                m1312b(e2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo1851g(int i) {
        boolean z;
        boolean z2;
        int i2 = 0;
        if (this.f1795j == null || !(this.f1795j.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1795j.getLayoutParams();
            z = true;
            if (this.f1795j.isShown()) {
                if (this.f1784S == null) {
                    this.f1784S = new Rect();
                    this.f1785T = new Rect();
                }
                Rect rect = this.f1784S;
                Rect rect2 = this.f1785T;
                rect.set(0, i, 0, 0);
                C0225cx.m738a(this.f1800o, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f1772G == null) {
                        this.f1772G = new View(this.f1787b);
                        this.f1772G.setBackgroundColor(this.f1787b.getResources().getColor(C0119c.abc_input_method_navigation_guard));
                        this.f1800o.addView(this.f1772G, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f1772G.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1772G.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f1772G == null) {
                    z = false;
                }
                if (!this.f1803r && z) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.f1795j.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f1772G != null) {
            View view = this.f1772G;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: g */
    public final void mo1793g() {
        C0177c a = mo1778a();
        if (a == null || !a.mo1121e()) {
            m1313h(0);
        }
    }

    /* renamed from: h */
    public final void mo1794h() {
        if (this.f1807v) {
            this.f1788c.getDecorView().removeCallbacks(this.f1782Q);
        }
        this.f1806u = true;
        if (this.f1792g != null) {
            this.f1792g.mo1123g();
        }
        if (this.f1781P != null) {
            this.f1781P.mo1866a();
        }
    }

    /* renamed from: i */
    public final void mo1795i() {
        LayoutInflater from = LayoutInflater.from(this.f1787b);
        if (from.getFactory() == null) {
            C0387gh.m1237a(from, this);
            return;
        }
        if (!(from.getFactory2() instanceof C0414h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f4, code lost:
        if (r1 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012f, code lost:
        if (r1 == null) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1796j() {
        /*
            r9 = this;
            int r0 = r9.f1779N
            r1 = -100
            if (r0 == r1) goto L_0x0009
            int r0 = r9.f1779N
            goto L_0x000b
        L_0x0009:
            int r0 = p000.C0375g.f1712a
        L_0x000b:
            r2 = 2
            r3 = 23
            r4 = -1
            r5 = 1
            if (r0 == r1) goto L_0x0040
            if (r0 == 0) goto L_0x0016
            r1 = r0
            goto L_0x0041
        L_0x0016:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x002b
            android.content.Context r1 = r9.f1787b
            java.lang.Class<android.app.UiModeManager> r6 = android.app.UiModeManager.class
            java.lang.Object r1 = r1.getSystemService(r6)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            int r1 = r1.getNightMode()
            if (r1 != 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            r9.m1317s()
            h$d r1 = r9.f1781P
            m r6 = r1.f1822a
            boolean r6 = r6.mo2479a()
            r1.f1823b = r6
            boolean r1 = r1.f1823b
            if (r1 == 0) goto L_0x003e
            r1 = r2
            goto L_0x0041
        L_0x003e:
            r1 = r5
            goto L_0x0041
        L_0x0040:
            r1 = r4
        L_0x0041:
            r6 = 0
            if (r1 == r4) goto L_0x0170
            android.content.Context r4 = r9.f1787b
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r7 = r4.getConfiguration()
            int r8 = r7.uiMode
            r8 = r8 & 48
            if (r1 != r2) goto L_0x0057
            r1 = 32
            goto L_0x0059
        L_0x0057:
            r1 = 16
        L_0x0059:
            if (r8 == r1) goto L_0x0170
            boolean r2 = r9.m1318t()
            if (r2 == 0) goto L_0x006a
            android.content.Context r1 = r9.f1787b
            android.app.Activity r1 = (android.app.Activity) r1
            r1.recreate()
            goto L_0x016f
        L_0x006a:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>(r7)
            android.util.DisplayMetrics r6 = r4.getDisplayMetrics()
            int r7 = r2.uiMode
            r7 = r7 & -49
            r1 = r1 | r7
            r2.uiMode = r1
            r4.updateConfiguration(r2, r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L_0x016f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L_0x016f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            r6 = 0
            if (r1 < r2) goto L_0x00fb
            boolean r1 = p000.C0541j.f2232d
            if (r1 != 0) goto L_0x00ac
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mResourcesImpl"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x00a2 }
            p000.C0541j.f2231c = r1     // Catch:{ NoSuchFieldException -> 0x00a2 }
            r1.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x00a2 }
            goto L_0x00aa
        L_0x00a2:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r2, r3, r1)
        L_0x00aa:
            p000.C0541j.f2232d = r5
        L_0x00ac:
            java.lang.reflect.Field r1 = p000.C0541j.f2231c
            if (r1 == 0) goto L_0x016f
            java.lang.reflect.Field r1 = p000.C0541j.f2231c     // Catch:{ IllegalAccessException -> 0x00b7 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ IllegalAccessException -> 0x00b7 }
            goto L_0x00c0
        L_0x00b7:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r2, r3, r1)
            r1 = r6
        L_0x00c0:
            if (r1 == 0) goto L_0x016f
            boolean r2 = p000.C0541j.f2230b
            if (r2 != 0) goto L_0x00e0
            java.lang.Class r2 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x00d6 }
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x00d6 }
            p000.C0541j.f2229a = r2     // Catch:{ NoSuchFieldException -> 0x00d6 }
            r2.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x00d6 }
            goto L_0x00de
        L_0x00d6:
            r2 = move-exception
            java.lang.String r3 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r3, r4, r2)
        L_0x00de:
            p000.C0541j.f2230b = r5
        L_0x00e0:
            java.lang.reflect.Field r2 = p000.C0541j.f2229a
            if (r2 == 0) goto L_0x00f3
            java.lang.reflect.Field r2 = p000.C0541j.f2229a     // Catch:{ IllegalAccessException -> 0x00eb }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ IllegalAccessException -> 0x00eb }
            goto L_0x00f4
        L_0x00eb:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r2, r3, r1)
        L_0x00f3:
            r1 = r6
        L_0x00f4:
            if (r1 == 0) goto L_0x016f
        L_0x00f6:
            p000.C0541j.m1710a(r1)
            goto L_0x016f
        L_0x00fb:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x0132
            boolean r1 = p000.C0541j.f2230b
            if (r1 != 0) goto L_0x011b
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0111 }
            p000.C0541j.f2229a = r1     // Catch:{ NoSuchFieldException -> 0x0111 }
            r1.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x0111 }
            goto L_0x0119
        L_0x0111:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r2, r3, r1)
        L_0x0119:
            p000.C0541j.f2230b = r5
        L_0x011b:
            java.lang.reflect.Field r1 = p000.C0541j.f2229a
            if (r1 == 0) goto L_0x012e
            java.lang.reflect.Field r1 = p000.C0541j.f2229a     // Catch:{ IllegalAccessException -> 0x0126 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ IllegalAccessException -> 0x0126 }
            goto L_0x012f
        L_0x0126:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r2, r3, r1)
        L_0x012e:
            r1 = r6
        L_0x012f:
            if (r1 == 0) goto L_0x016f
            goto L_0x00f6
        L_0x0132:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x016f
            boolean r1 = p000.C0541j.f2230b
            if (r1 != 0) goto L_0x0154
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x014a }
            p000.C0541j.f2229a = r1     // Catch:{ NoSuchFieldException -> 0x014a }
            r1.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x014a }
            goto L_0x0152
        L_0x014a:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r2, r3, r1)
        L_0x0152:
            p000.C0541j.f2230b = r5
        L_0x0154:
            java.lang.reflect.Field r1 = p000.C0541j.f2229a
            if (r1 == 0) goto L_0x016f
            java.lang.reflect.Field r1 = p000.C0541j.f2229a     // Catch:{ IllegalAccessException -> 0x0161 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ IllegalAccessException -> 0x0161 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ IllegalAccessException -> 0x0161 }
            goto L_0x016a
        L_0x0161:
            r1 = move-exception
            java.lang.String r2 = "ResourcesFlusher"
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r2, r3, r1)
            r1 = r6
        L_0x016a:
            if (r1 == 0) goto L_0x016f
            r1.clear()
        L_0x016f:
            r6 = r5
        L_0x0170:
            if (r0 != 0) goto L_0x01b0
            r9.m1317s()
            h$d r0 = r9.f1781P
            r0.mo1866a()
            android.content.BroadcastReceiver r1 = r0.f1824c
            if (r1 != 0) goto L_0x0185
            h$d$1 r1 = new h$d$1
            r1.<init>()
            r0.f1824c = r1
        L_0x0185:
            android.content.IntentFilter r1 = r0.f1825d
            if (r1 != 0) goto L_0x01a5
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            r0.f1825d = r1
            android.content.IntentFilter r1 = r0.f1825d
            java.lang.String r2 = "android.intent.action.TIME_SET"
            r1.addAction(r2)
            android.content.IntentFilter r1 = r0.f1825d
            java.lang.String r2 = "android.intent.action.TIMEZONE_CHANGED"
            r1.addAction(r2)
            android.content.IntentFilter r1 = r0.f1825d
            java.lang.String r2 = "android.intent.action.TIME_TICK"
            r1.addAction(r2)
        L_0x01a5:
            h r1 = p000.C0414h.this
            android.content.Context r1 = r1.f1787b
            android.content.BroadcastReceiver r2 = r0.f1824c
            android.content.IntentFilter r0 = r0.f1825d
            r1.registerReceiver(r2, r0)
        L_0x01b0:
            r9.f1780O = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0414h.mo1796j():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final Context mo1852k() {
        C0177c a = mo1778a();
        Context b = a != null ? a.mo1116b() : null;
        return b == null ? this.f1787b : b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo1853l() {
        return this.f1770E && this.f1800o != null && C0396gq.m1275l(this.f1800o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo1854m() {
        if (this.f1798m != null) {
            this.f1798m.mo1825a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo1855n() {
        mo1844a(mo1849e(0), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo1856o() {
        if (this.f1767B != null) {
            this.f1767B.mo435h();
        }
        if (this.f1796k != null) {
            this.f1788c.getDecorView().removeCallbacks(this.f1797l);
            if (this.f1796k.isShowing()) {
                try {
                    this.f1796k.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1796k = null;
        }
        mo1854m();
        C0430f e = mo1849e(0);
        if (e != null && e.f1838j != null) {
            e.f1838j.close();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m1308a(view, str, context, attributeSet);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
