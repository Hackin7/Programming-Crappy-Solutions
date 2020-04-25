package p000;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: an */
final class C0030an extends C0025am {

    /* renamed from: an$a */
    class C0031a extends C0026a implements VisibilityListener {

        /* renamed from: c */
        C0383b f169c;

        public C0031a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public final View mo316a(MenuItem menuItem) {
            return this.f164a.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public final void mo317a(C0383b bVar) {
            this.f169c = bVar;
            this.f164a.setVisibilityListener(this);
        }

        /* renamed from: d */
        public final boolean mo318d() {
            return this.f164a.overridesItemVisibility();
        }

        /* renamed from: e */
        public final boolean mo319e() {
            return this.f164a.isVisible();
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            if (this.f169c != null) {
                this.f169c.mo251a();
            }
        }
    }

    C0030an(Context context, C0354ft ftVar) {
        super(context, ftVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0026a mo252a(ActionProvider actionProvider) {
        return new C0031a(this.f42a, actionProvider);
    }
}
