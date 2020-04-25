package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: z */
public final class C0817z extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f3428a;

    /* renamed from: b */
    static final Class<?>[] f3429b;

    /* renamed from: c */
    final Object[] f3430c;

    /* renamed from: d */
    final Object[] f3431d = this.f3430c;

    /* renamed from: e */
    Context f3432e;

    /* renamed from: f */
    Object f3433f;

    /* renamed from: z$a */
    static class C0818a implements OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f3434a = {MenuItem.class};

        /* renamed from: b */
        private Object f3435b;

        /* renamed from: c */
        private Method f3436c;

        public C0818a(Object obj, String str) {
            this.f3435b = obj;
            Class cls = obj.getClass();
            try {
                this.f3436c = cls.getMethod(str, f3434a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3436c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3436c.invoke(this.f3435b, new Object[]{menuItem})).booleanValue();
                }
                this.f3436c.invoke(this.f3435b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: z$b */
    class C0819b {

        /* renamed from: A */
        C0381ge f3437A;

        /* renamed from: B */
        CharSequence f3438B;

        /* renamed from: C */
        CharSequence f3439C;

        /* renamed from: D */
        ColorStateList f3440D = null;

        /* renamed from: E */
        Mode f3441E = null;

        /* renamed from: a */
        Menu f3443a;

        /* renamed from: b */
        int f3444b;

        /* renamed from: c */
        int f3445c;

        /* renamed from: d */
        int f3446d;

        /* renamed from: e */
        int f3447e;

        /* renamed from: f */
        boolean f3448f;

        /* renamed from: g */
        boolean f3449g;

        /* renamed from: h */
        boolean f3450h;

        /* renamed from: i */
        int f3451i;

        /* renamed from: j */
        int f3452j;

        /* renamed from: k */
        CharSequence f3453k;

        /* renamed from: l */
        CharSequence f3454l;

        /* renamed from: m */
        int f3455m;

        /* renamed from: n */
        char f3456n;

        /* renamed from: o */
        int f3457o;

        /* renamed from: p */
        char f3458p;

        /* renamed from: q */
        int f3459q;

        /* renamed from: r */
        int f3460r;

        /* renamed from: s */
        boolean f3461s;

        /* renamed from: t */
        boolean f3462t;

        /* renamed from: u */
        boolean f3463u;

        /* renamed from: v */
        int f3464v;

        /* renamed from: w */
        int f3465w;

        /* renamed from: x */
        String f3466x;

        /* renamed from: y */
        String f3467y;

        /* renamed from: z */
        String f3468z;

        public C0819b(Menu menu) {
            this.f3443a = menu;
            mo2840a();
        }

        /* renamed from: a */
        static char m2715a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final <T> T mo2839a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = C0817z.this.f3432e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }

        /* renamed from: a */
        public final void mo2840a() {
            this.f3444b = 0;
            this.f3445c = 0;
            this.f3446d = 0;
            this.f3447e = 0;
            this.f3448f = true;
            this.f3449g = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2841a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f3461s).setVisible(this.f3462t).setEnabled(this.f3463u).setCheckable(this.f3460r > 0).setTitleCondensed(this.f3454l).setIcon(this.f3455m);
            if (this.f3464v >= 0) {
                menuItem.setShowAsAction(this.f3464v);
            }
            if (this.f3468z != null) {
                if (C0817z.this.f3432e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                C0817z zVar = C0817z.this;
                if (zVar.f3433f == null) {
                    zVar.f3433f = C0817z.m2713a(zVar.f3432e);
                }
                menuItem.setOnMenuItemClickListener(new C0818a(zVar.f3433f, this.f3468z));
            }
            if (this.f3460r >= 2) {
                if (menuItem instanceof C0023al) {
                    ((C0023al) menuItem).mo203a(true);
                } else if (menuItem instanceof C0025am) {
                    C0025am amVar = (C0025am) menuItem;
                    try {
                        if (amVar.f163e == null) {
                            amVar.f163e = ((C0354ft) amVar.f45d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        amVar.f163e.invoke(amVar.f45d, new Object[]{Boolean.valueOf(true)});
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            if (this.f3466x != null) {
                menuItem.setActionView((View) mo2839a(this.f3466x, C0817z.f3428a, C0817z.this.f3430c));
                z = true;
            }
            if (this.f3465w > 0) {
                if (!z) {
                    menuItem.setActionView(this.f3465w);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f3437A != null) {
                C0381ge geVar = this.f3437A;
                if (menuItem instanceof C0354ft) {
                    ((C0354ft) menuItem).mo34a(geVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f3438B;
            boolean z2 = menuItem instanceof C0354ft;
            if (z2) {
                ((C0354ft) menuItem).mo35a(charSequence);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f3439C;
            if (z2) {
                ((C0354ft) menuItem).mo37b(charSequence2);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f3456n;
            int i = this.f3457o;
            if (z2) {
                ((C0354ft) menuItem).setAlphabeticShortcut(c, i);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i);
            }
            char c2 = this.f3458p;
            int i2 = this.f3459q;
            if (z2) {
                ((C0354ft) menuItem).setNumericShortcut(c2, i2);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i2);
            }
            if (this.f3441E != null) {
                Mode mode = this.f3441E;
                if (z2) {
                    ((C0354ft) menuItem).setIconTintMode(mode);
                } else if (VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            if (this.f3440D != null) {
                ColorStateList colorStateList = this.f3440D;
                if (z2) {
                    ((C0354ft) menuItem).setIconTintList(colorStateList);
                } else if (VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }

        /* renamed from: b */
        public final SubMenu mo2842b() {
            this.f3450h = true;
            SubMenu addSubMenu = this.f3443a.addSubMenu(this.f3444b, this.f3451i, this.f3452j, this.f3453k);
            mo2841a(addSubMenu.getItem());
            return addSubMenu;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f3428a = clsArr;
        f3429b = clsArr;
    }

    public C0817z(Context context) {
        super(context);
        this.f3432e = context;
        this.f3430c = new Object[]{context};
    }

    /* renamed from: a */
    static Object m2713a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    /* renamed from: a */
    private void m2714a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0819b bVar = new C0819b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (z2) {
                        break;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    z2 = true;
                                    str = name2;
                                    break;
                                } else {
                                    m2714a(xmlPullParser, attributeSet, bVar.mo2842b());
                                    break;
                                }
                            } else {
                                TypedArray obtainStyledAttributes = C0817z.this.f3432e.obtainStyledAttributes(attributeSet, C0126j.MenuItem);
                                bVar.f3451i = obtainStyledAttributes.getResourceId(C0126j.MenuItem_android_id, 0);
                                bVar.f3452j = (obtainStyledAttributes.getInt(C0126j.MenuItem_android_menuCategory, bVar.f3445c) & -65536) | (obtainStyledAttributes.getInt(C0126j.MenuItem_android_orderInCategory, bVar.f3446d) & 65535);
                                bVar.f3453k = obtainStyledAttributes.getText(C0126j.MenuItem_android_title);
                                bVar.f3454l = obtainStyledAttributes.getText(C0126j.MenuItem_android_titleCondensed);
                                bVar.f3455m = obtainStyledAttributes.getResourceId(C0126j.MenuItem_android_icon, 0);
                                bVar.f3456n = C0819b.m2715a(obtainStyledAttributes.getString(C0126j.MenuItem_android_alphabeticShortcut));
                                bVar.f3457o = obtainStyledAttributes.getInt(C0126j.MenuItem_alphabeticModifiers, 4096);
                                bVar.f3458p = C0819b.m2715a(obtainStyledAttributes.getString(C0126j.MenuItem_android_numericShortcut));
                                bVar.f3459q = obtainStyledAttributes.getInt(C0126j.MenuItem_numericModifiers, 4096);
                                bVar.f3460r = obtainStyledAttributes.hasValue(C0126j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0126j.MenuItem_android_checkable, false) : bVar.f3447e;
                                bVar.f3461s = obtainStyledAttributes.getBoolean(C0126j.MenuItem_android_checked, false);
                                bVar.f3462t = obtainStyledAttributes.getBoolean(C0126j.MenuItem_android_visible, bVar.f3448f);
                                bVar.f3463u = obtainStyledAttributes.getBoolean(C0126j.MenuItem_android_enabled, bVar.f3449g);
                                bVar.f3464v = obtainStyledAttributes.getInt(C0126j.MenuItem_showAsAction, -1);
                                bVar.f3468z = obtainStyledAttributes.getString(C0126j.MenuItem_android_onClick);
                                bVar.f3465w = obtainStyledAttributes.getResourceId(C0126j.MenuItem_actionLayout, 0);
                                bVar.f3466x = obtainStyledAttributes.getString(C0126j.MenuItem_actionViewClass);
                                bVar.f3467y = obtainStyledAttributes.getString(C0126j.MenuItem_actionProviderClass);
                                boolean z3 = bVar.f3467y != null;
                                if (z3 && bVar.f3465w == 0 && bVar.f3466x == null) {
                                    bVar.f3437A = (C0381ge) bVar.mo2839a(bVar.f3467y, f3429b, C0817z.this.f3431d);
                                } else {
                                    if (z3) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    bVar.f3437A = null;
                                }
                                bVar.f3438B = obtainStyledAttributes.getText(C0126j.MenuItem_contentDescription);
                                bVar.f3439C = obtainStyledAttributes.getText(C0126j.MenuItem_tooltipText);
                                if (obtainStyledAttributes.hasValue(C0126j.MenuItem_iconTintMode)) {
                                    bVar.f3441E = C0181cb.m605a(obtainStyledAttributes.getInt(C0126j.MenuItem_iconTintMode, -1), bVar.f3441E);
                                } else {
                                    bVar.f3441E = null;
                                }
                                if (obtainStyledAttributes.hasValue(C0126j.MenuItem_iconTint)) {
                                    bVar.f3440D = obtainStyledAttributes.getColorStateList(C0126j.MenuItem_iconTint);
                                } else {
                                    bVar.f3440D = null;
                                }
                                obtainStyledAttributes.recycle();
                                bVar.f3450h = false;
                                break;
                            }
                        } else {
                            TypedArray obtainStyledAttributes2 = C0817z.this.f3432e.obtainStyledAttributes(attributeSet, C0126j.MenuGroup);
                            bVar.f3444b = obtainStyledAttributes2.getResourceId(C0126j.MenuGroup_android_id, 0);
                            bVar.f3445c = obtainStyledAttributes2.getInt(C0126j.MenuGroup_android_menuCategory, 0);
                            bVar.f3446d = obtainStyledAttributes2.getInt(C0126j.MenuGroup_android_orderInCategory, 0);
                            bVar.f3447e = obtainStyledAttributes2.getInt(C0126j.MenuGroup_android_checkableBehavior, 0);
                            bVar.f3448f = obtainStyledAttributes2.getBoolean(C0126j.MenuGroup_android_visible, true);
                            bVar.f3449g = obtainStyledAttributes2.getBoolean(C0126j.MenuGroup_android_enabled, true);
                            obtainStyledAttributes2.recycle();
                            break;
                        }
                    }
                    break;
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!bVar.f3450h) {
                                if (bVar.f3437A != null && bVar.f3437A.mo310c()) {
                                    bVar.mo2842b();
                                    break;
                                } else {
                                    bVar.f3450h = true;
                                    bVar.mo2841a(bVar.f3443a.add(bVar.f3444b, bVar.f3451i, bVar.f3452j, bVar.f3453k));
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bVar.mo2840a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(int r3, android.view.Menu r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof p000.C0353fs
            if (r0 != 0) goto L_0x0008
            super.inflate(r3, r4)
            return
        L_0x0008:
            r0 = 0
            android.content.Context r1 = r2.f3432e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.XmlResourceParser r3 = r1.getLayout(r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            r2.m2714a(r3, r0, r4)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            if (r3 == 0) goto L_0x001f
            r3.close()
        L_0x001f:
            return
        L_0x0020:
            r4 = move-exception
            r0 = r3
            goto L_0x003d
        L_0x0023:
            r4 = move-exception
            r0 = r3
            goto L_0x002c
        L_0x0026:
            r4 = move-exception
            r0 = r3
            goto L_0x0035
        L_0x0029:
            r4 = move-exception
            goto L_0x003d
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x0034:
            r4 = move-exception
        L_0x0035:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0817z.inflate(int, android.view.Menu):void");
    }
}
