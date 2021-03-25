package a.b.p;

import a.b.o.j.f;
import a.b.o.j.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

public class l0 extends j0 implements k0 {
    public static Method H;
    public k0 G;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                H = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException e2) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public l0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override // a.b.p.j0
    public f0 s(Context context, boolean hijackFocus) {
        a view = new a(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }

    public void N(Object enterTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.C.setEnterTransition((Transition) enterTransition);
        }
    }

    public void O(Object exitTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.C.setExitTransition((Transition) exitTransition);
        }
    }

    public void P(k0 hoverListener) {
        this.G = hoverListener;
    }

    public void Q(boolean touchModal) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.C, Boolean.valueOf(touchModal));
                } catch (Exception e2) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.C.setTouchModal(touchModal);
        }
    }

    @Override // a.b.p.k0
    public void e(g menu, MenuItem item) {
        k0 k0Var = this.G;
        if (k0Var != null) {
            k0Var.e(menu, item);
        }
    }

    @Override // a.b.p.k0
    public void h(g menu, MenuItem item) {
        k0 k0Var = this.G;
        if (k0Var != null) {
            k0Var.h(menu, item);
        }
    }

    public static class a extends f0 {
        public final int p;
        public final int q;
        public k0 r;
        public MenuItem s;

        @Override // a.b.p.f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public a(Context context, boolean hijackFocus) {
            super(context, hijackFocus);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.p = 21;
                this.q = 22;
                return;
            }
            this.p = 22;
            this.q = 21;
        }

        public void setHoverListener(k0 hoverListener) {
            this.r = hoverListener;
        }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            ListMenuItemView selectedItem = (ListMenuItemView) getSelectedView();
            if (selectedItem != null && keyCode == this.p) {
                if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                    performItemClick(selectedItem, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (selectedItem == null || keyCode != this.q) {
                return super.onKeyDown(keyCode, event);
            } else {
                setSelection(-1);
                ((f) getAdapter()).b().e(false);
                return true;
            }
        }

        /* JADX INFO: Multiple debug info for r4v1 android.view.MenuItem: [D('position' int), D('oldMenuItem' android.view.MenuItem)] */
        @Override // a.b.p.f0
        public boolean onHoverEvent(MotionEvent ev) {
            int headersCount;
            f menuAdapter;
            int position;
            int itemPosition;
            if (this.r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerAdapter.getHeadersCount();
                    menuAdapter = (f) headerAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    menuAdapter = (f) adapter;
                }
                MenuItem menuItem = null;
                if (ev.getAction() != 10 && (position = pointToPosition((int) ev.getX(), (int) ev.getY())) != -1 && (itemPosition = position - headersCount) >= 0 && itemPosition < menuAdapter.getCount()) {
                    menuItem = menuAdapter.getItem(itemPosition);
                }
                MenuItem oldMenuItem = this.s;
                if (oldMenuItem != menuItem) {
                    g menu = menuAdapter.b();
                    if (oldMenuItem != null) {
                        this.r.h(menu, oldMenuItem);
                    }
                    this.s = menuItem;
                    if (menuItem != null) {
                        this.r.e(menu, menuItem);
                    }
                }
            }
            return super.onHoverEvent(ev);
        }
    }
}
