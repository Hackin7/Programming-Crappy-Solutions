package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: k */
final class C0594k extends C0177c {

    /* renamed from: a */
    C0180ca f2554a;

    /* renamed from: b */
    Callback f2555b;

    /* renamed from: c */
    private boolean f2556c;

    /* renamed from: d */
    private boolean f2557d;

    /* renamed from: e */
    private ArrayList<Object> f2558e;

    /* renamed from: f */
    private final Runnable f2559f;

    /* renamed from: k$a */
    final class C0595a implements C0102a {

        /* renamed from: b */
        private boolean f2561b;

        C0595a() {
        }

        /* renamed from: a */
        public final void mo196a(C0019aj ajVar, boolean z) {
            if (!this.f2561b) {
                this.f2561b = true;
                C0594k.this.f2554a.mo1153n();
                if (C0594k.this.f2555b != null) {
                    C0594k.this.f2555b.onPanelClosed(C0126j.AppCompatTheme_tooltipForegroundColor, ajVar);
                }
                this.f2561b = false;
            }
        }

        /* renamed from: a */
        public final boolean mo197a(C0019aj ajVar) {
            if (C0594k.this.f2555b == null) {
                return false;
            }
            C0594k.this.f2555b.onMenuOpened(C0126j.AppCompatTheme_tooltipForegroundColor, ajVar);
            return true;
        }
    }

    /* renamed from: k$b */
    final class C0596b implements C0020a {
        C0596b() {
        }

        /* renamed from: a */
        public final void mo193a(C0019aj ajVar) {
            if (C0594k.this.f2555b != null) {
                if (C0594k.this.f2554a.mo1148i()) {
                    C0594k.this.f2555b.onPanelClosed(C0126j.AppCompatTheme_tooltipForegroundColor, ajVar);
                } else if (C0594k.this.f2555b.onPreparePanel(0, null, ajVar)) {
                    C0594k.this.f2555b.onMenuOpened(C0126j.AppCompatTheme_tooltipForegroundColor, ajVar);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo194a(C0019aj ajVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: a */
    public final int mo1109a() {
        return this.f2554a.mo1154o();
    }

    /* renamed from: a */
    public final void mo1111a(Configuration configuration) {
        super.mo1111a(configuration);
    }

    /* renamed from: a */
    public final void mo1112a(CharSequence charSequence) {
        this.f2554a.mo1136a(charSequence);
    }

    /* renamed from: a */
    public final void mo1113a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo1114a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (!this.f2556c) {
            this.f2554a.mo1134a((C0102a) new C0595a(), (C0020a) new C0596b());
            this.f2556c = true;
        }
        Menu q = this.f2554a.mo1156q();
        if (q == null) {
            return false;
        }
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        q.setQwertyMode(z);
        return q.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public final boolean mo1115a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo1119c();
        }
        return true;
    }

    /* renamed from: b */
    public final Context mo1116b() {
        return this.f2554a.mo1138b();
    }

    /* renamed from: b */
    public final void mo1117b(boolean z) {
    }

    /* renamed from: c */
    public final void mo1118c(boolean z) {
        if (z != this.f2557d) {
            this.f2557d = z;
            int size = this.f2558e.size();
            for (int i = 0; i < size; i++) {
                this.f2558e.get(i);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo1119c() {
        return this.f2554a.mo1150k();
    }

    /* renamed from: d */
    public final boolean mo1120d() {
        return this.f2554a.mo1151l();
    }

    /* renamed from: e */
    public final boolean mo1121e() {
        this.f2554a.mo1128a().removeCallbacks(this.f2559f);
        C0396gq.m1260a((View) this.f2554a.mo1128a(), this.f2559f);
        return true;
    }

    /* renamed from: f */
    public final boolean mo1122f() {
        if (!this.f2554a.mo1141c()) {
            return false;
        }
        this.f2554a.mo1142d();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo1123g() {
        this.f2554a.mo1128a().removeCallbacks(this.f2559f);
    }
}
