package p000;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: er */
public class C0308er extends Activity implements C0386a, C0526ip {

    /* renamed from: a */
    private C0256dk<Class<? extends Object>, Object> f1588a = new C0256dk<>();

    /* renamed from: b */
    private C0527iq f1589b = new C0527iq(this);

    /* renamed from: a */
    public final boolean mo1687a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: c */
    public C0522in mo1688c() {
        return this.f1589b;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0385gg.m1234a(decorView, keyEvent)) {
            return C0385gg.m1235a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0385gg.m1234a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0536ix.m1706a((Activity) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f1589b.mo2125a(C0524b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
