package a.b.k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

public class c extends h implements DialogInterface {

    /* renamed from: d  reason: collision with root package name */
    public final AlertController f3d = new AlertController(getContext(), this, getWindow());

    public c(Context context, int themeResId) {
        super(context, f(context, themeResId));
    }

    public static int f(Context context, int resid) {
        if (((resid >>> 24) & 255) >= 1) {
            return resid;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }

    public ListView e() {
        return this.f3d.d();
    }

    @Override // a.b.k.h, android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        this.f3d.p(title);
    }

    @Override // a.b.k.h
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f3d.e();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.f3d.g(event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.f3d.h(event)) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.f f4a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5b;

        public a(Context context) {
            this(context, c.f(context, 0));
        }

        public a(Context context, int themeResId) {
            this.f4a = new AlertController.f(new ContextThemeWrapper(context, c.f(context, themeResId)));
            this.f5b = themeResId;
        }

        public Context b() {
            return this.f4a.f1517a;
        }

        public a j(CharSequence title) {
            this.f4a.f1522f = title;
            return this;
        }

        public a d(View customTitleView) {
            this.f4a.f1523g = customTitleView;
            return this;
        }

        public a e(Drawable icon) {
            this.f4a.f1520d = icon;
            return this;
        }

        public a h(CharSequence text, DialogInterface.OnClickListener listener) {
            AlertController.f fVar = this.f4a;
            fVar.h = text;
            fVar.i = listener;
            return this;
        }

        public a f(CharSequence text, DialogInterface.OnClickListener listener) {
            AlertController.f fVar = this.f4a;
            fVar.j = text;
            fVar.k = listener;
            return this;
        }

        public a g(DialogInterface.OnKeyListener onKeyListener) {
            this.f4a.o = onKeyListener;
            return this;
        }

        public a c(ListAdapter adapter, DialogInterface.OnClickListener listener) {
            AlertController.f fVar = this.f4a;
            fVar.p = adapter;
            fVar.q = listener;
            return this;
        }

        public a i(ListAdapter adapter, int checkedItem, DialogInterface.OnClickListener listener) {
            AlertController.f fVar = this.f4a;
            fVar.p = adapter;
            fVar.q = listener;
            fVar.v = checkedItem;
            fVar.u = true;
            return this;
        }

        public a k(View view) {
            AlertController.f fVar = this.f4a;
            fVar.s = view;
            fVar.r = 0;
            fVar.t = false;
            return this;
        }

        public c a() {
            c dialog = new c(this.f4a.f1517a, this.f5b);
            this.f4a.a(dialog.f3d);
            dialog.setCancelable(this.f4a.l);
            if (this.f4a.l) {
                dialog.setCanceledOnTouchOutside(true);
            }
            dialog.setOnCancelListener(this.f4a.m);
            dialog.setOnDismissListener(this.f4a.n);
            DialogInterface.OnKeyListener onKeyListener = this.f4a.o;
            if (onKeyListener != null) {
                dialog.setOnKeyListener(onKeyListener);
            }
            return dialog;
        }

        public c l() {
            c dialog = a();
            dialog.show();
            return dialog;
        }
    }
}
