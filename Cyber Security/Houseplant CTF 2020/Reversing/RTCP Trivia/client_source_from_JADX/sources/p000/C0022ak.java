package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

/* renamed from: ak */
final class C0022ak implements OnClickListener, OnDismissListener, OnKeyListener, C0102a {

    /* renamed from: a */
    C0019aj f127a;

    /* renamed from: b */
    C0230d f128b;

    /* renamed from: c */
    C0016ah f129c;

    /* renamed from: d */
    private C0102a f130d;

    public C0022ak(C0019aj ajVar) {
        this.f127a = ajVar;
    }

    /* renamed from: a */
    public final void mo196a(C0019aj ajVar, boolean z) {
        if ((z || ajVar == this.f127a) && this.f128b != null) {
            this.f128b.dismiss();
        }
        if (this.f130d != null) {
            this.f130d.mo196a(ajVar, z);
        }
    }

    /* renamed from: a */
    public final boolean mo197a(C0019aj ajVar) {
        if (this.f130d != null) {
            return this.f130d.mo197a(ajVar);
        }
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f127a.mo151a((MenuItem) (C0023al) this.f129c.mo128b().getItem(i), (C0101aq) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f129c.mo94a(this.f127a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f128b.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f128b.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f127a.mo148a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f127a.performShortcut(i, keyEvent, 0);
    }
}
