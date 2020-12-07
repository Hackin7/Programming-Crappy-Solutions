package a.h.n;

import a.h.k.a;
import a.h.l.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class i {
    public static void i(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        textView.setCompoundDrawablesRelative(start, top, end, bottom);
    }

    public static int c(TextView textView) {
        return textView.getMaxLines();
    }

    public static void n(TextView textView, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(resId);
        } else {
            textView.setTextAppearance(textView.getContext(), resId);
        }
    }

    public static ActionMode.Callback p(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof a)) ? callback : new a(callback, textView);
    }

    public static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f1004a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1005b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f1006c;

        /* renamed from: d  reason: collision with root package name */
        public Method f1007d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1008e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1009f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f1004a = callback;
            this.f1005b = textView;
        }

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.f1004a.onCreateActionMode(mode, menu);
        }

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            f(menu);
            return this.f1004a.onPrepareActionMode(mode, menu);
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.f1004a.onActionItemClicked(mode, item);
        }

        public void onDestroyActionMode(ActionMode mode) {
            this.f1004a.onDestroyActionMode(mode);
        }

        public final void f(Menu menu) {
            Method removeItemAtMethod;
            Context context = this.f1005b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f1009f) {
                this.f1009f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1006c = cls;
                    this.f1007d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f1008e = true;
                } catch (ClassNotFoundException | NoSuchMethodException e2) {
                    this.f1006c = null;
                    this.f1007d = null;
                    this.f1008e = false;
                }
            }
            try {
                if (!this.f1008e || !this.f1006c.isInstance(menu)) {
                    removeItemAtMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    removeItemAtMethod = this.f1007d;
                }
                for (int i = menu.size() - 1; i >= 0; i--) {
                    MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        removeItemAtMethod.invoke(menu, Integer.valueOf(i));
                    }
                }
                List<ResolveInfo> supportedActivities = c(context, packageManager);
                for (int i2 = 0; i2 < supportedActivities.size(); i2++) {
                    ResolveInfo info = supportedActivities.get(i2);
                    menu.add(0, 0, i2 + 100, info.loadLabel(packageManager)).setIntent(b(info, this.f1005b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            }
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList<>();
            if (!(context instanceof Activity)) {
                return supportedActivities;
            }
            for (ResolveInfo info : packageManager.queryIntentActivities(a(), 0)) {
                if (e(info, context)) {
                    supportedActivities.add(info);
                }
            }
            return supportedActivities;
        }

        public final boolean e(ResolveInfo info, Context context) {
            if (context.getPackageName().equals(info.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = info.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        public final Intent b(ResolveInfo info, TextView textView11) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView11));
            ActivityInfo activityInfo = info.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final boolean d(TextView textView11) {
            return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    public static void j(TextView textView, int firstBaselineToTopHeight) {
        int fontMetricsTop;
        h.a(firstBaselineToTopHeight);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            fontMetricsTop = fontMetrics.top;
        } else {
            fontMetricsTop = fontMetrics.ascent;
        }
        if (firstBaselineToTopHeight > Math.abs(fontMetricsTop)) {
            textView.setPadding(textView.getPaddingLeft(), firstBaselineToTopHeight + fontMetricsTop, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void k(TextView textView, int lastBaselineToBottomHeight) {
        int fontMetricsBottom;
        h.a(lastBaselineToBottomHeight);
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            fontMetricsBottom = fontMetrics.bottom;
        } else {
            fontMetricsBottom = fontMetrics.descent;
        }
        if (lastBaselineToBottomHeight > Math.abs(fontMetricsBottom)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), lastBaselineToBottomHeight - fontMetricsBottom);
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void l(TextView textView, int lineHeight) {
        h.a(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        if (lineHeight != fontHeight) {
            textView.setLineSpacing((float) (lineHeight - fontHeight), 1.0f);
        }
    }

    public static a.C0021a f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new a.C0021a(textView.getTextMetricsParams());
        }
        a.C0021a.C0022a builder = new a.C0021a.C0022a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            builder.b(textView.getBreakStrategy());
            builder.c(textView.getHyphenationFrequency());
        }
        builder.d(e(textView));
        return builder.a();
    }

    public static void o(TextView textView, a.C0021a params) {
        textView.setTextDirection(d(params.d()));
        if (Build.VERSION.SDK_INT < 23) {
            float paintTextScaleX = params.e().getTextScaleX();
            textView.getPaint().set(params.e());
            if (paintTextScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((paintTextScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(paintTextScaleX);
            return;
        }
        textView.getPaint().set(params.e());
        textView.setBreakStrategy(params.b());
        textView.setHyphenationFrequency(params.c());
    }

    public static void m(TextView textView, a.h.k.a precomputed) {
        if (Build.VERSION.SDK_INT >= 29) {
            precomputed.b();
            textView.setText((CharSequence) null);
            return;
        }
        a.C0021a param = f(textView);
        precomputed.a();
        if (param.a(null)) {
            textView.setText(precomputed);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static TextDirectionHeuristic e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean defaultIsRtl = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                defaultIsRtl = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (defaultIsRtl) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte digitDirection = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (digitDirection == 1 || digitDirection == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    public static int d(TextDirectionHeuristic heuristic) {
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (heuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (heuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (heuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (heuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    public static void g(TextView textView, ColorStateList tint) {
        h.b(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(tint);
        } else if (textView instanceof j) {
            ((j) textView).setSupportCompoundDrawablesTintList(tint);
        }
    }

    public static void h(TextView textView, PorterDuff.Mode tintMode) {
        h.b(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(tintMode);
        } else if (textView instanceof j) {
            ((j) textView).setSupportCompoundDrawablesTintMode(tintMode);
        }
    }
}
