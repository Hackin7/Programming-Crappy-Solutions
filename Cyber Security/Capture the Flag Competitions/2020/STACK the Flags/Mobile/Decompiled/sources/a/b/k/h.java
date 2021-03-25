package a.b.k;

import a.b.o.b;
import a.h.m.e;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public class h extends Dialog implements e {

    /* renamed from: b  reason: collision with root package name */
    public f f40b;

    /* renamed from: c  reason: collision with root package name */
    public final e.a f41c = new a();

    public class a implements e.a {
        public a() {
        }

        @Override // a.h.m.e.a
        public boolean superDispatchKeyEvent(KeyEvent event) {
            return h.this.c(event);
        }
    }

    public h(Context context, int theme) {
        super(context, b(context, theme));
        f delegate = a();
        delegate.F(b(context, theme));
        delegate.r(null);
    }

    public void onCreate(Bundle savedInstanceState) {
        a().o();
        super.onCreate(savedInstanceState);
        a().r(savedInstanceState);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        a().B(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        a().D(view, params);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int id) {
        return (T) a().i(id);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        a().G(title);
    }

    @Override // android.app.Dialog
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        a().G(getContext().getString(titleId));
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        a().d(view, params);
    }

    public void onStop() {
        super.onStop();
        a().x();
    }

    public void dismiss() {
        super.dismiss();
        a().s();
    }

    public boolean d(int featureId) {
        return a().A(featureId);
    }

    public void invalidateOptionsMenu() {
        a().p();
    }

    public f a() {
        if (this.f40b == null) {
            this.f40b = f.h(this, this);
        }
        return this.f40b;
    }

    public static int b(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.dialogTheme, outValue, true);
        return outValue.resourceId;
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

    public boolean c(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return e.e(this.f41c, getWindow().getDecorView(), this, event);
    }
}
