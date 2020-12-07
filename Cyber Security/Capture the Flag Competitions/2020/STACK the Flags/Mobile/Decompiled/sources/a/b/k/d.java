package a.b.k;

import a.b.o.b;
import a.b.p.c1;
import a.h.d.a;
import a.h.d.e;
import a.h.d.g;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public class d extends a.k.a.d implements e, g.a {
    public f mDelegate;
    public Resources mResources;

    public d() {
    }

    public d(int contentLayoutId) {
        super(contentLayoutId);
    }

    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(getDelegate().f(newBase));
    }

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d
    public void onCreate(Bundle savedInstanceState) {
        f delegate = getDelegate();
        delegate.o();
        delegate.r(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int resId) {
        super.setTheme(resId);
        getDelegate().F(resId);
    }

    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        getDelegate().t(savedInstanceState);
    }

    public a getSupportActionBar() {
        return getDelegate().n();
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().E(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().m();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        getDelegate().B(layoutResID);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        getDelegate().C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        getDelegate().D(view, params);
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        getDelegate().d(view, params);
    }

    @Override // a.k.a.d
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(newConfig, super.getResources().getDisplayMetrics());
        }
        getDelegate().q(newConfig);
    }

    @Override // a.k.a.d
    public void onPostResume() {
        super.onPostResume();
        getDelegate().u();
    }

    @Override // a.k.a.d
    public void onStart() {
        super.onStart();
        getDelegate().w();
    }

    @Override // a.k.a.d
    public void onStop() {
        super.onStop();
        getDelegate().x();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int id) {
        return (T) getDelegate().i(id);
    }

    @Override // a.k.a.d
    public final boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        a ab = getSupportActionBar();
        if (item.getItemId() != 16908332 || ab == null || (ab.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // a.k.a.d
    public void onDestroy() {
        super.onDestroy();
        getDelegate().s();
    }

    public void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        getDelegate().G(title);
    }

    public boolean supportRequestWindowFeature(int featureId) {
        return getDelegate().A(featureId);
    }

    @Override // a.k.a.d
    public void supportInvalidateOptionsMenu() {
        getDelegate().p();
    }

    public void invalidateOptionsMenu() {
        getDelegate().p();
    }

    @Override // a.b.k.e
    public void onSupportActionModeStarted(b mode) {
    }

    @Override // a.b.k.e
    public void onSupportActionModeFinished(b mode) {
    }

    @Override // a.b.k.e
    public b onWindowStartingSupportActionMode(b.a callback) {
        return null;
    }

    public b startSupportActionMode(b.a callback) {
        return getDelegate().H(callback);
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean visible) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean visible) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean indeterminate) {
    }

    @Deprecated
    public void setSupportProgress(int progress) {
    }

    public void onCreateSupportNavigateUpTaskStack(g builder) {
        builder.b(this);
    }

    public void onPrepareSupportNavigateUpTaskStack(g builder) {
    }

    public boolean onSupportNavigateUp() {
        Intent upIntent = getSupportParentActivityIntent();
        if (upIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(upIntent)) {
            g b2 = g.d(this);
            onCreateSupportNavigateUpTaskStack(b2);
            onPrepareSupportNavigateUpTaskStack(b2);
            b2.e();
            try {
                a.e(this);
                return true;
            } catch (IllegalStateException e2) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(upIntent);
            return true;
        }
    }

    @Override // a.h.d.g.a
    public Intent getSupportParentActivityIntent() {
        return e.a(this);
    }

    public boolean supportShouldUpRecreateTask(Intent targetIntent) {
        return e.f(this, targetIntent);
    }

    public void supportNavigateUpTo(Intent upIntent) {
        e.e(this, upIntent);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public b getDrawerToggleDelegate() {
        return getDelegate().k();
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override // a.k.a.d
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getDelegate().v(outState);
    }

    public f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = f.g(this, this);
        }
        return this.mDelegate;
    }

    @Override // a.h.d.d
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        a actionBar = getSupportActionBar();
        if (keyCode != 82 || actionBar == null || !actionBar.j(event)) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    public Resources getResources() {
        if (this.mResources == null) {
            c1.b();
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    private boolean performMenuItemShortcut(KeyEvent event) {
        Window currentWindow;
        if (Build.VERSION.SDK_INT >= 26 || event.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(event.getMetaState()) || event.getRepeatCount() != 0 || KeyEvent.isModifierKey(event.getKeyCode()) || (currentWindow = getWindow()) == null || currentWindow.getDecorView() == null || !currentWindow.getDecorView().dispatchKeyShortcutEvent(event)) {
            return false;
        }
        return true;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (performMenuItemShortcut(event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void openOptionsMenu() {
        a actionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.k()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        a actionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.a()) {
            super.closeOptionsMenu();
        }
    }

    public void onNightModeChanged(int mode) {
    }
}
