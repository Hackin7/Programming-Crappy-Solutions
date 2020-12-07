package a.b.o;

import a.b.j;
import a.b.o.j.i;
import a.b.p.e0;
import a.b.p.w0;
import a.h.m.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f137e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f138f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f139a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f140b;

    /* renamed from: c  reason: collision with root package name */
    public Context f141c;

    /* renamed from: d  reason: collision with root package name */
    public Object f142d;

    static {
        Class<?>[] clsArr = {Context.class};
        f137e = clsArr;
        f138f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f141c = context;
        Object[] objArr = {context};
        this.f139a = objArr;
        this.f140b = objArr;
    }

    public void inflate(int menuRes, Menu menu) {
        if (!(menu instanceof a.h.g.a.a)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        try {
            parser = this.f141c.getResources().getLayout(menuRes);
            c(parser, Xml.asAttributeSet(parser), menu);
            parser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    public final void c(XmlPullParser parser, AttributeSet attrs, Menu menu) {
        b menuState = new b(menu);
        int eventType = parser.getEventType();
        boolean lookingForEndOfUnknownTag = false;
        String unknownTagName = null;
        while (true) {
            if (eventType != 2) {
                eventType = parser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String tagName = parser.getName();
                if (tagName.equals("menu")) {
                    eventType = parser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + tagName);
                }
            }
        }
        boolean reachedEndOfMenu = false;
        while (!reachedEndOfMenu) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String tagName2 = parser.getName();
                        if (lookingForEndOfUnknownTag && tagName2.equals(unknownTagName)) {
                            lookingForEndOfUnknownTag = false;
                            unknownTagName = null;
                        } else if (tagName2.equals("group")) {
                            menuState.h();
                        } else if (tagName2.equals("item")) {
                            if (!menuState.d()) {
                                a.h.m.b bVar = menuState.A;
                                if (bVar == null || !bVar.a()) {
                                    menuState.a();
                                } else {
                                    menuState.b();
                                }
                            }
                        } else if (tagName2.equals("menu")) {
                            reachedEndOfMenu = true;
                        }
                    }
                } else if (!lookingForEndOfUnknownTag) {
                    String tagName3 = parser.getName();
                    if (tagName3.equals("group")) {
                        menuState.f(attrs);
                    } else if (tagName3.equals("item")) {
                        menuState.g(attrs);
                    } else if (tagName3.equals("menu")) {
                        c(parser, attrs, menuState.b());
                    } else {
                        lookingForEndOfUnknownTag = true;
                        unknownTagName = tagName3;
                    }
                }
                eventType = parser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public Object b() {
        if (this.f142d == null) {
            this.f142d = a(this.f141c);
        }
        return this.f142d;
    }

    public final Object a(Object owner) {
        if (!(owner instanceof Activity) && (owner instanceof ContextWrapper)) {
            return a(((ContextWrapper) owner).getBaseContext());
        }
        return owner;
    }

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f143c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f144a;

        /* renamed from: b  reason: collision with root package name */
        public Method f145b;

        public a(Object realOwner, String methodName) {
            this.f144a = realOwner;
            Class<?> c2 = realOwner.getClass();
            try {
                this.f145b = c2.getMethod(methodName, f143c);
            } catch (Exception e2) {
                InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c2.getName());
                ex.initCause(e2);
                throw ex;
            }
        }

        public boolean onMenuItemClick(MenuItem item) {
            try {
                if (this.f145b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f145b.invoke(this.f144a, item)).booleanValue();
                }
                this.f145b.invoke(this.f144a, item);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class b {
        public a.h.m.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f146a;

        /* renamed from: b  reason: collision with root package name */
        public int f147b;

        /* renamed from: c  reason: collision with root package name */
        public int f148c;

        /* renamed from: d  reason: collision with root package name */
        public int f149d;

        /* renamed from: e  reason: collision with root package name */
        public int f150e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f151f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f152g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.f146a = menu;
            h();
        }

        public void h() {
            this.f147b = 0;
            this.f148c = 0;
            this.f149d = 0;
            this.f150e = 0;
            this.f151f = true;
            this.f152g = true;
        }

        public void f(AttributeSet attrs) {
            TypedArray a2 = g.this.f141c.obtainStyledAttributes(attrs, j.MenuGroup);
            this.f147b = a2.getResourceId(j.MenuGroup_android_id, 0);
            this.f148c = a2.getInt(j.MenuGroup_android_menuCategory, 0);
            this.f149d = a2.getInt(j.MenuGroup_android_orderInCategory, 0);
            this.f150e = a2.getInt(j.MenuGroup_android_checkableBehavior, 0);
            this.f151f = a2.getBoolean(j.MenuGroup_android_visible, true);
            this.f152g = a2.getBoolean(j.MenuGroup_android_enabled, true);
            a2.recycle();
        }

        public void g(AttributeSet attrs) {
            w0 a2 = w0.t(g.this.f141c, attrs, j.MenuItem);
            this.i = a2.m(j.MenuItem_android_id, 0);
            this.j = (-65536 & a2.j(j.MenuItem_android_menuCategory, this.f148c)) | (65535 & a2.j(j.MenuItem_android_orderInCategory, this.f149d));
            this.k = a2.o(j.MenuItem_android_title);
            this.l = a2.o(j.MenuItem_android_titleCondensed);
            this.m = a2.m(j.MenuItem_android_icon, 0);
            this.n = c(a2.n(j.MenuItem_android_alphabeticShortcut));
            this.o = a2.j(j.MenuItem_alphabeticModifiers, 4096);
            this.p = c(a2.n(j.MenuItem_android_numericShortcut));
            this.q = a2.j(j.MenuItem_numericModifiers, 4096);
            if (a2.r(j.MenuItem_android_checkable)) {
                this.r = a2.a(j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.r = this.f150e;
            }
            this.s = a2.a(j.MenuItem_android_checked, false);
            this.t = a2.a(j.MenuItem_android_visible, this.f151f);
            this.u = a2.a(j.MenuItem_android_enabled, this.f152g);
            this.v = a2.j(j.MenuItem_showAsAction, -1);
            this.z = a2.n(j.MenuItem_android_onClick);
            this.w = a2.m(j.MenuItem_actionLayout, 0);
            this.x = a2.n(j.MenuItem_actionViewClass);
            String n2 = a2.n(j.MenuItem_actionProviderClass);
            this.y = n2;
            boolean hasActionProvider = n2 != null;
            if (hasActionProvider && this.w == 0 && this.x == null) {
                this.A = (a.h.m.b) e(this.y, g.f138f, g.this.f140b);
            } else {
                if (hasActionProvider) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a2.o(j.MenuItem_contentDescription);
            this.C = a2.o(j.MenuItem_tooltipText);
            if (a2.r(j.MenuItem_iconTintMode)) {
                this.E = e0.d(a2.j(j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (a2.r(j.MenuItem_iconTint)) {
                this.D = a2.c(j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            a2.v();
            this.h = false;
        }

        public final char c(String shortcutString) {
            if (shortcutString == null) {
                return 0;
            }
            return shortcutString.charAt(0);
        }

        public final void i(MenuItem item) {
            item.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                item.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.f141c.isRestricted()) {
                    item.setOnMenuItemClickListener(new a(g.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (item instanceof i) {
                    ((i) item).t(true);
                } else if (item instanceof a.b.o.j.j) {
                    ((a.b.o.j.j) item).h(true);
                }
            }
            boolean actionViewSpecified = false;
            String str = this.x;
            if (str != null) {
                item.setActionView((View) e(str, g.f137e, g.this.f139a));
                actionViewSpecified = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!actionViewSpecified) {
                    item.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a.h.m.b bVar = this.A;
            if (bVar != null) {
                h.a(item, bVar);
            }
            h.c(item, this.B);
            h.g(item, this.C);
            h.b(item, this.n, this.o);
            h.f(item, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                h.e(item, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                h.d(item, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            i(this.f146a.add(this.f147b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenu = this.f146a.addSubMenu(this.f147b, this.i, this.j, this.k);
            i(subMenu.getItem());
            return subMenu;
        }

        public boolean d() {
            return this.h;
        }

        public final <T> T e(String className, Class<?>[] constructorSignature, Object[] arguments) {
            try {
                Constructor<?> constructor = Class.forName(className, false, g.this.f141c.getClassLoader()).getConstructor(constructorSignature);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(arguments);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + className, e2);
                return null;
            }
        }
    }
}
