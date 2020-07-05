package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint.FontMetricsInt;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: hg */
public final class C0440hg {

    /* renamed from: hg$a */
    static class C0441a implements Callback {

        /* renamed from: a */
        private final Callback f1887a;

        /* renamed from: b */
        private final TextView f1888b;

        /* renamed from: c */
        private Class f1889c;

        /* renamed from: d */
        private Method f1890d;

        /* renamed from: e */
        private boolean f1891e;

        /* renamed from: f */
        private boolean f1892f = false;

        C0441a(Callback callback, TextView textView) {
            this.f1887a = callback;
            this.f1888b = textView;
        }

        /* renamed from: a */
        private static Intent m1396a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1887a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1887a.onCreateActionMode(actionMode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f1887a.onDestroyActionMode(actionMode);
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Context context = this.f1888b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f1892f) {
                this.f1892f = true;
                try {
                    this.f1889c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1890d = this.f1889c.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f1891e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f1889c = null;
                    this.f1890d = null;
                    this.f1891e = false;
                }
            }
            try {
                Method declaredMethod = (!this.f1891e || !this.f1889c.isInstance(menu)) ? menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE}) : this.f1890d;
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m1396a(), 0)) {
                        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0))) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                    MenuItem add = menu.add(0, 0, 100 + i, resolveInfo2.loadLabel(packageManager));
                    TextView textView = this.f1888b;
                    add.setIntent(m1396a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled())).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f1887a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Callback m1390a(TextView textView, Callback callback) {
        return (VERSION.SDK_INT < 26 || VERSION.SDK_INT > 27 || (callback instanceof C0441a)) ? callback : new C0441a(callback, textView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r5 != 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r3 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0371fy.C0372a m1391a(android.widget.TextView r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            fy$a r0 = new fy$a
            android.text.PrecomputedText$Params r5 = r5.getTextMetricsParams()
            r0.<init>(r5)
            return r0
        L_0x0010:
            fy$a$a r0 = new fy$a$a
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r5.getPaint()
            r2.<init>(r3)
            r0.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L_0x0030
            int r2 = r5.getBreakStrategy()
            r0.f1710c = r2
            int r2 = r5.getHyphenationFrequency()
            r0.f1711d = r2
        L_0x0030:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r2 < r3) goto L_0x008c
            android.text.method.TransformationMethod r2 = r5.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            if (r2 == 0) goto L_0x0041
        L_0x003e:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.LTR
            goto L_0x008a
        L_0x0041:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r4 = 0
            if (r2 < r1) goto L_0x006e
            int r1 = r5.getInputType()
            r1 = r1 & 15
            r2 = 3
            if (r1 != r2) goto L_0x006e
            java.util.Locale r5 = r5.getTextLocale()
            android.icu.text.DecimalFormatSymbols r5 = android.icu.text.DecimalFormatSymbols.getInstance(r5)
            java.lang.String[] r5 = r5.getDigitStrings()
            r5 = r5[r4]
            int r5 = r5.codePointAt(r4)
            byte r5 = java.lang.Character.getDirectionality(r5)
            if (r5 == r3) goto L_0x006b
            r1 = 2
            if (r5 != r1) goto L_0x003e
        L_0x006b:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.RTL
            goto L_0x008a
        L_0x006e:
            int r1 = r5.getLayoutDirection()
            if (r1 != r3) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = r4
        L_0x0076:
            int r5 = r5.getTextDirection()
            switch(r5) {
                case 2: goto L_0x0085;
                case 3: goto L_0x003e;
                case 4: goto L_0x006b;
                case 5: goto L_0x0082;
                case 6: goto L_0x007f;
                case 7: goto L_0x0088;
                default: goto L_0x007d;
            }
        L_0x007d:
            if (r3 != 0) goto L_0x0088
        L_0x007f:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x008a
        L_0x0082:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x008a
        L_0x0085:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x008a
        L_0x0088:
            android.text.TextDirectionHeuristic r5 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
        L_0x008a:
            r0.f1709b = r5
        L_0x008c:
            fy$a r5 = new fy$a
            android.text.TextPaint r1 = r0.f1708a
            android.text.TextDirectionHeuristic r2 = r0.f1709b
            int r3 = r0.f1710c
            int r0 = r0.f1711d
            r5.<init>(r1, r2, r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0440hg.m1391a(android.widget.TextView):fy$a");
    }

    /* renamed from: a */
    public static void m1392a(TextView textView, int i) {
        C0378gc.m1208a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m1393a(TextView textView, C0371fy fyVar) {
        if (VERSION.SDK_INT >= 28) {
            textView.setText(fyVar.f1700a instanceof PrecomputedText ? (PrecomputedText) fyVar.f1700a : null);
        } else if (!m1391a(textView).equals(fyVar.f1701b)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        } else {
            textView.setText(fyVar);
        }
    }

    /* renamed from: b */
    public static void m1394b(TextView textView, int i) {
        C0378gc.m1208a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static void m1395c(TextView textView, int i) {
        C0378gc.m1208a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }
}
