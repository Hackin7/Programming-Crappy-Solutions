package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: ci */
public final class C0201ci extends C0192cg implements C0200ch {

    /* renamed from: a */
    public static Method f1014a;

    /* renamed from: b */
    public C0200ch f1015b;

    /* renamed from: ci$a */
    public static class C0202a extends C0182cc {

        /* renamed from: b */
        final int f1016b;

        /* renamed from: c */
        final int f1017c;

        /* renamed from: d */
        private C0200ch f1018d;

        /* renamed from: e */
        private MenuItem f1019e;

        public C0202a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1016b = 22;
                this.f1017c = 21;
                return;
            }
            this.f1016b = 21;
            this.f1017c = 22;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo1157a(int i, int i2, int i3, int i4, int i5) {
            return super.mo1157a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1158a(MotionEvent motionEvent, int i) {
            return super.mo1158a(motionEvent, i);
        }

        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            if (this.f1018d != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0018ai aiVar = (C0018ai) adapter;
                C0023al alVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < aiVar.getCount()) {
                            alVar = aiVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f1019e;
                if (menuItem != alVar) {
                    C0019aj ajVar = aiVar.f94a;
                    if (menuItem != null) {
                        this.f1018d.mo125a(ajVar, menuItem);
                    }
                    this.f1019e = alVar;
                    if (alVar != null) {
                        this.f1018d.mo126b(ajVar, alVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1016b) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1017c) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0018ai) getAdapter()).f94a.mo148a(false);
                return true;
            }
        }

        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public final void setHoverListener(C0200ch chVar) {
            this.f1018d = chVar;
        }

        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f1014a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0201ci(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0182cc mo1209a(Context context, boolean z) {
        C0202a aVar = new C0202a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public final void mo125a(C0019aj ajVar, MenuItem menuItem) {
        if (this.f1015b != null) {
            this.f1015b.mo125a(ajVar, menuItem);
        }
    }

    /* renamed from: b */
    public final void mo126b(C0019aj ajVar, MenuItem menuItem) {
        if (this.f1015b != null) {
            this.f1015b.mo126b(ajVar, menuItem);
        }
    }
}
