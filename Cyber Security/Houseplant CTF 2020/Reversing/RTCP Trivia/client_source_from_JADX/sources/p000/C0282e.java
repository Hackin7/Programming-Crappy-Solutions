package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: e */
public class C0282e extends C0464hq implements C0312a, C0322f {

    /* renamed from: j */
    private C0375g f1443j;

    /* renamed from: k */
    private int f1444k = 0;

    /* renamed from: l */
    private Resources f1445l;

    /* renamed from: e */
    private boolean m977e() {
        boolean z;
        Intent a = C0309es.m1040a(this);
        if (a == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 16) {
            z = shouldUpRecreateTask(a);
        } else {
            String action = getIntent().getAction();
            z = action != null && !action.equals("android.intent.action.MAIN");
        }
        if (z) {
            C0311eu a2 = C0311eu.m1044a((Context) this);
            Intent intent = null;
            if (this instanceof C0312a) {
                intent = mo1604b();
            }
            if (intent == null) {
                intent = C0309es.m1040a(this);
            }
            if (intent != null) {
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(a2.f1591b.getPackageManager());
                }
                a2.mo1690a(component);
                a2.f1590a.add(intent);
            }
            if (a2.f1590a.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) a2.f1590a.toArray(new Intent[a2.f1590a.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            C0313ev.m1048a(a2.f1591b, intentArr);
            try {
                C0306eq.m1036a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else if (VERSION.SDK_INT >= 16) {
            navigateUpTo(a);
            return true;
        } else {
            a.addFlags(67108864);
            startActivity(a);
            finish();
            return true;
        }
    }

    /* renamed from: f */
    private C0375g m978f() {
        if (this.f1443j == null) {
            this.f1443j = C0375g.m1184a((Activity) this, (C0322f) this);
        }
        return this.f1443j;
    }

    /* renamed from: a_ */
    public final void mo1602a_() {
        m978f().mo1793g();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m978f().mo1787b(view, layoutParams);
    }

    /* renamed from: b */
    public final Intent mo1604b() {
        return C0309es.m1040a(this);
    }

    public void closeOptionsMenu() {
        C0177c a = m978f().mo1778a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.mo1120d()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0177c a = m978f().mo1778a();
        if (keyCode != 82 || a == null || !a.mo1115a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return m978f().mo1777a(i);
    }

    public MenuInflater getMenuInflater() {
        return m978f().mo1784b();
    }

    public Resources getResources() {
        if (this.f1445l == null && C0224cw.m736a()) {
            this.f1445l = new C0224cw(this, super.getResources());
        }
        return this.f1445l == null ? super.getResources() : this.f1445l;
    }

    public void invalidateOptionsMenu() {
        m978f().mo1793g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m978f().mo1779a(configuration);
        if (this.f1445l != null) {
            this.f1445l.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        C0375g f = m978f();
        f.mo1795i();
        f.mo1780a(bundle);
        if (f.mo1796j() && this.f1444k != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1444k, false);
            } else {
                setTheme(this.f1444k);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m978f().mo1794h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 26
            if (r0 >= r2) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r2 = r0.getDecorView()
            if (r2 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = r1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r1
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0282e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0177c a = m978f().mo1778a();
        if (menuItem.getItemId() != 16908332 || a == null || (a.mo1109a() & 4) == 0) {
            return false;
        }
        return m977e();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m978f().mo1788c();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        m978f().mo1792f();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m978f().mo1786b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m978f().mo1790d();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m978f().mo1791e();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m978f().mo1783a(charSequence);
    }

    public void openOptionsMenu() {
        C0177c a = m978f().mo1778a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.mo1119c()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        m978f().mo1785b(i);
    }

    public void setContentView(View view) {
        m978f().mo1781a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m978f().mo1782a(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f1444k = i;
    }
}
