package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: i */
public class C0493i extends Dialog implements C0322f {

    /* renamed from: a */
    private C0375g f2125a;

    /* renamed from: b */
    private final C0386a f2126b;

    public C0493i(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0117a.dialogTheme, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        this.f2126b = new C0386a() {
            /* renamed from: a */
            public final boolean mo1687a(KeyEvent keyEvent) {
                return C0493i.this.mo2064a(keyEvent);
            }
        };
        mo2063a().mo1780a((Bundle) null);
        mo2063a().mo1796j();
    }

    /* renamed from: a */
    public final C0375g mo2063a() {
        if (this.f2125a == null) {
            this.f2125a = C0375g.m1185a((Dialog) this, (C0322f) this);
        }
        return this.f2125a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2064a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo2063a().mo1787b(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0385gg.m1235a(this.f2126b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo2063a().mo1777a(i);
    }

    public void invalidateOptionsMenu() {
        mo2063a().mo1793g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo2063a().mo1795i();
        super.onCreate(bundle);
        mo2063a().mo1780a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2063a().mo1791e();
    }

    public void setContentView(int i) {
        mo2063a().mo1785b(i);
    }

    public void setContentView(View view) {
        mo2063a().mo1781a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo2063a().mo1782a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo2063a().mo1783a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo2063a().mo1783a(charSequence);
    }
}
