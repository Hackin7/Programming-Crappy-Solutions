package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aj */
public class C0019aj implements C0353fs {

    /* renamed from: l */
    private static final int[] f100l = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f101A = false;

    /* renamed from: a */
    public final Context f102a;

    /* renamed from: b */
    public C0020a f103b;

    /* renamed from: c */
    ArrayList<C0023al> f104c;

    /* renamed from: d */
    public ArrayList<C0023al> f105d;

    /* renamed from: e */
    public int f106e = 0;

    /* renamed from: f */
    CharSequence f107f;

    /* renamed from: g */
    Drawable f108g;

    /* renamed from: h */
    View f109h;

    /* renamed from: i */
    public boolean f110i = false;

    /* renamed from: j */
    C0023al f111j;

    /* renamed from: k */
    public boolean f112k;

    /* renamed from: m */
    private final Resources f113m;

    /* renamed from: n */
    private boolean f114n;

    /* renamed from: o */
    private boolean f115o;

    /* renamed from: p */
    private ArrayList<C0023al> f116p;

    /* renamed from: q */
    private boolean f117q;

    /* renamed from: r */
    private ArrayList<C0023al> f118r;

    /* renamed from: s */
    private boolean f119s;

    /* renamed from: t */
    private ContextMenuInfo f120t;

    /* renamed from: u */
    private boolean f121u = false;

    /* renamed from: v */
    private boolean f122v = false;

    /* renamed from: w */
    private boolean f123w = false;

    /* renamed from: x */
    private boolean f124x = false;

    /* renamed from: y */
    private ArrayList<C0023al> f125y = new ArrayList<>();

    /* renamed from: z */
    private CopyOnWriteArrayList<WeakReference<C0101aq>> f126z = new CopyOnWriteArrayList<>();

    /* renamed from: aj$a */
    public interface C0020a {
        /* renamed from: a */
        void mo193a(C0019aj ajVar);

        /* renamed from: a */
        boolean mo194a(C0019aj ajVar, MenuItem menuItem);
    }

    /* renamed from: aj$b */
    public interface C0021b {
        /* renamed from: a */
        boolean mo195a(C0023al alVar);
    }

    public C0019aj(Context context) {
        this.f102a = context;
        this.f113m = context.getResources();
        this.f104c = new ArrayList<>();
        this.f116p = new ArrayList<>();
        boolean z = true;
        this.f117q = true;
        this.f105d = new ArrayList<>();
        this.f118r = new ArrayList<>();
        this.f119s = true;
        if (this.f113m.getConfiguration().keyboard == 1 || !C0400gr.m1284a(ViewConfiguration.get(this.f102a), this.f102a)) {
            z = false;
        }
        this.f115o = z;
    }

    /* renamed from: a */
    private static int m63a(ArrayList<C0023al> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0023al) arrayList.get(size)).f136a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0023al m64a(int i, KeyEvent keyEvent) {
        ArrayList<C0023al> arrayList = this.f125y;
        arrayList.clear();
        m67a((List<C0023al>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0023al) arrayList.get(0);
        }
        boolean c = mo166c();
        for (int i2 = 0; i2 < size; i2++) {
            C0023al alVar = (C0023al) arrayList.get(i2);
            char alphabeticShortcut = c ? alVar.getAlphabeticShortcut() : alVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (c && alphabeticShortcut == 8 && i == 67))) {
                return alVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private MenuItem m65a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = (-65536 & i3) >> 16;
        if (i4 < 0 || i4 >= f100l.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (f100l[i4] << 16) | (65535 & i3);
        C0023al alVar = new C0023al(this, i, i2, i3, i5, charSequence, this.f106e);
        if (this.f120t != null) {
            alVar.f142g = this.f120t;
        }
        this.f104c.add(m63a(this.f104c, i5), alVar);
        mo163b(true);
        return alVar;
    }

    /* renamed from: a */
    private void m66a(int i, boolean z) {
        if (i >= 0 && i < this.f104c.size()) {
            this.f104c.remove(i);
            if (z) {
                mo163b(true);
            }
        }
    }

    /* renamed from: a */
    private void m67a(List<C0023al> list, int i, KeyEvent keyEvent) {
        boolean c = mo166c();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f104c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0023al alVar = (C0023al) this.f104c.get(i2);
                if (alVar.hasSubMenu()) {
                    ((C0019aj) alVar.getSubMenu()).m67a(list, i, keyEvent);
                }
                char alphabeticShortcut = c ? alVar.getAlphabeticShortcut() : alVar.getNumericShortcut();
                if (((modifiers & 69647) == ((c ? alVar.getAlphabeticModifiers() : alVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c && alphabeticShortcut == 8 && i == 67)) && alVar.isEnabled())) {
                    list.add(alVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo142a() {
        return "android:menu:actionviewstates";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo143a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f113m;
        if (view != null) {
            this.f109h = view;
            this.f107f = null;
            this.f108g = null;
        } else {
            if (i > 0) {
                this.f107f = resources.getText(i);
            } else if (charSequence != null) {
                this.f107f = charSequence;
            }
            if (i2 > 0) {
                this.f108g = C0313ev.m1047a(this.f102a, i2);
            } else if (drawable != null) {
                this.f108g = drawable;
            }
            this.f109h = null;
        }
        mo163b(false);
    }

    /* renamed from: a */
    public void mo144a(C0020a aVar) {
        this.f103b = aVar;
    }

    /* renamed from: a */
    public final void mo145a(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0111aw) item.getSubMenu()).mo145a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo142a(), sparseArray);
        }
    }

    /* renamed from: a */
    public final void mo146a(C0101aq aqVar) {
        mo147a(aqVar, this.f102a);
    }

    /* renamed from: a */
    public final void mo147a(C0101aq aqVar, Context context) {
        this.f126z.add(new WeakReference(aqVar));
        aqVar.mo96a(context, this);
        this.f119s = true;
    }

    /* renamed from: a */
    public final void mo148a(boolean z) {
        if (!this.f124x) {
            this.f124x = true;
            Iterator it = this.f126z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0101aq aqVar = (C0101aq) weakReference.get();
                if (aqVar == null) {
                    this.f126z.remove(weakReference);
                } else {
                    aqVar.mo94a(this, z);
                }
            }
            this.f124x = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo149a(C0019aj ajVar, MenuItem menuItem) {
        return this.f103b != null && this.f103b.mo194a(ajVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo150a(C0023al alVar) {
        boolean z = false;
        if (this.f126z.isEmpty()) {
            return false;
        }
        mo171e();
        Iterator it = this.f126z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0101aq aqVar = (C0101aq) weakReference.get();
            if (aqVar == null) {
                this.f126z.remove(weakReference);
            } else {
                z = aqVar.mo103b(alVar);
                if (z) {
                    break;
                }
            }
        }
        mo172f();
        if (z) {
            this.f111j = alVar;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r1 != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if ((r9 & 1) == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        if (r1 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo151a(android.view.MenuItem r7, p000.C0101aq r8, int r9) {
        /*
            r6 = this;
            al r7 = (p000.C0023al) r7
            r0 = 0
            if (r7 == 0) goto L_0x009a
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            boolean r1 = r7.mo204b()
            ge r2 = r7.f141f
            r3 = 1
            if (r2 == 0) goto L_0x001d
            boolean r4 = r2.mo310c()
            if (r4 == 0) goto L_0x001d
            r4 = r3
            goto L_0x001e
        L_0x001d:
            r4 = r0
        L_0x001e:
            boolean r5 = r7.mo227i()
            if (r5 == 0) goto L_0x002f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x0099
        L_0x002b:
            r6.mo148a(r3)
            return r1
        L_0x002f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003d
            if (r4 == 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x0099
            goto L_0x002b
        L_0x003d:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0044
            r6.mo148a(r0)
        L_0x0044:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0054
            aw r9 = new aw
            android.content.Context r5 = r6.f102a
            r9.<init>(r5, r6, r7)
            r7.mo202a(r9)
        L_0x0054:
            android.view.SubMenu r7 = r7.getSubMenu()
            aw r7 = (p000.C0111aw) r7
            if (r4 == 0) goto L_0x005f
            r2.mo308a(r7)
        L_0x005f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<aq>> r9 = r6.f126z
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0068
            goto L_0x0095
        L_0x0068:
            if (r8 == 0) goto L_0x006e
            boolean r0 = r8.mo102a(r7)
        L_0x006e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<aq>> r8 = r6.f126z
            java.util.Iterator r8 = r8.iterator()
        L_0x0074:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0095
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r2 = r9.get()
            aq r2 = (p000.C0101aq) r2
            if (r2 != 0) goto L_0x008e
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<aq>> r2 = r6.f126z
            r2.remove(r9)
            goto L_0x0074
        L_0x008e:
            if (r0 != 0) goto L_0x0074
            boolean r0 = r2.mo102a(r7)
            goto L_0x0074
        L_0x0095:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x0099
            goto L_0x002b
        L_0x0099:
            return r1
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0019aj.mo151a(android.view.MenuItem, aq, int):boolean");
    }

    public MenuItem add(int i) {
        return m65a(0, 0, 0, this.f113m.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m65a(i, i2, i3, this.f113m.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m65a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m65a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f102a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f113m.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f113m.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0023al alVar = (C0023al) m65a(i, i2, i3, charSequence);
        C0111aw awVar = new C0111aw(this.f102a, this, alVar);
        alVar.mo202a(awVar);
        return awVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void mo161b(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo142a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0111aw) item.getSubMenu()).mo161b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo162b(C0101aq aqVar) {
        Iterator it = this.f126z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0101aq aqVar2 = (C0101aq) weakReference.get();
            if (aqVar2 == null || aqVar2 == aqVar) {
                this.f126z.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public final void mo163b(boolean z) {
        if (!this.f121u) {
            if (z) {
                this.f117q = true;
                this.f119s = true;
            }
            if (!this.f126z.isEmpty()) {
                mo171e();
                Iterator it = this.f126z.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0101aq aqVar = (C0101aq) weakReference.get();
                    if (aqVar == null) {
                        this.f126z.remove(weakReference);
                    } else {
                        aqVar.mo98a(z);
                    }
                }
                mo172f();
            }
            return;
        }
        this.f122v = true;
        if (z) {
            this.f123w = true;
        }
    }

    /* renamed from: b */
    public boolean mo164b() {
        return this.f101A;
    }

    /* renamed from: b */
    public boolean mo165b(C0023al alVar) {
        boolean z = false;
        if (!this.f126z.isEmpty()) {
            if (this.f111j != alVar) {
                return false;
            }
            mo171e();
            Iterator it = this.f126z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0101aq aqVar = (C0101aq) weakReference.get();
                if (aqVar == null) {
                    this.f126z.remove(weakReference);
                } else {
                    z = aqVar.mo104c(alVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo172f();
            if (z) {
                this.f111j = null;
            }
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo166c() {
        return this.f114n;
    }

    public void clear() {
        if (this.f111j != null) {
            mo165b(this.f111j);
        }
        this.f104c.clear();
        mo163b(true);
    }

    public void clearHeader() {
        this.f108g = null;
        this.f107f = null;
        this.f109h = null;
        mo163b(false);
    }

    public void close() {
        mo148a(true);
    }

    /* renamed from: d */
    public boolean mo170d() {
        return this.f115o;
    }

    /* renamed from: e */
    public final void mo171e() {
        if (!this.f121u) {
            this.f121u = true;
            this.f122v = false;
            this.f123w = false;
        }
    }

    /* renamed from: f */
    public final void mo172f() {
        this.f121u = false;
        if (this.f122v) {
            this.f122v = false;
            mo163b(this.f123w);
        }
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0023al alVar = (C0023al) this.f104c.get(i2);
            if (alVar.getItemId() == i) {
                return alVar;
            }
            if (alVar.hasSubMenu()) {
                MenuItem findItem = alVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo174g() {
        this.f117q = true;
        mo163b(true);
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f104c.get(i);
    }

    /* renamed from: h */
    public final void mo176h() {
        this.f119s = true;
        mo163b(true);
    }

    public boolean hasVisibleItems() {
        if (this.f112k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0023al) this.f104c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final ArrayList<C0023al> mo178i() {
        if (!this.f117q) {
            return this.f116p;
        }
        this.f116p.clear();
        int size = this.f104c.size();
        for (int i = 0; i < size; i++) {
            C0023al alVar = (C0023al) this.f104c.get(i);
            if (alVar.isVisible()) {
                this.f116p.add(alVar);
            }
        }
        this.f117q = false;
        this.f119s = true;
        return this.f116p;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m64a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public final void mo180j() {
        ArrayList i = mo178i();
        if (this.f119s) {
            Iterator it = this.f126z.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0101aq aqVar = (C0101aq) weakReference.get();
                if (aqVar == null) {
                    this.f126z.remove(weakReference);
                } else {
                    z |= aqVar.mo99a();
                }
            }
            if (z) {
                this.f105d.clear();
                this.f118r.clear();
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0023al alVar = (C0023al) i.get(i2);
                    (alVar.mo211f() ? this.f105d : this.f118r).add(alVar);
                }
            } else {
                this.f105d.clear();
                this.f118r.clear();
                this.f118r.addAll(mo178i());
            }
            this.f119s = false;
        }
    }

    /* renamed from: k */
    public final ArrayList<C0023al> mo181k() {
        mo180j();
        return this.f118r;
    }

    /* renamed from: l */
    public C0019aj mo182l() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo151a(findItem(i), (C0101aq) null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0023al a = m64a(i, keyEvent);
        boolean a2 = a != null ? mo151a((MenuItem) a, (C0101aq) null, i2) : false;
        if ((i2 & 2) != 0) {
            mo148a(true);
        }
        return a2;
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0023al) this.f104c.get(i2)).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f104c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((C0023al) this.f104c.get(i2)).getGroupId() != i) {
                    mo163b(true);
                } else {
                    m66a(i2, false);
                    i3 = i4;
                }
            }
            mo163b(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0023al) this.f104c.get(i2)).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        m66a(i2, true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f104c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0023al alVar = (C0023al) this.f104c.get(i2);
            if (alVar.getGroupId() == i) {
                alVar.mo203a(z2);
                alVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f101A = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f104c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0023al alVar = (C0023al) this.f104c.get(i2);
            if (alVar.getGroupId() == i) {
                alVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f104c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0023al alVar = (C0023al) this.f104c.get(i2);
            if (alVar.getGroupId() == i && alVar.mo205b(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo163b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f114n = z;
        mo163b(false);
    }

    public int size() {
        return this.f104c.size();
    }
}
