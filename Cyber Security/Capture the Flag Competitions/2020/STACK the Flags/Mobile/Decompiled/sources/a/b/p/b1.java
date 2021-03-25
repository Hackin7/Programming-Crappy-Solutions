package a.b.p;

import a.b.d;
import a.b.f;
import a.b.g;
import a.b.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

public class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f280a;

    /* renamed from: b  reason: collision with root package name */
    public final View f281b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f282c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f283d = new WindowManager.LayoutParams();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f284e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f285f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f286g = new int[2];

    public b1(Context context) {
        this.f280a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f281b = inflate;
        this.f282c = (TextView) inflate.findViewById(f.message);
        this.f283d.setTitle(getClass().getSimpleName());
        this.f283d.packageName = this.f280a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f283d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void e(View anchorView, int anchorX, int anchorY, boolean fromTouch, CharSequence tooltipText) {
        if (d()) {
            c();
        }
        this.f282c.setText(tooltipText);
        a(anchorView, anchorX, anchorY, fromTouch, this.f283d);
        ((WindowManager) this.f280a.getSystemService("window")).addView(this.f281b, this.f283d);
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f280a.getSystemService("window")).removeView(this.f281b);
        }
    }

    public boolean d() {
        return this.f281b.getParent() != null;
    }

    public final void a(View anchorView, int anchorX, int anchorY, boolean fromTouch, WindowManager.LayoutParams outParams) {
        int offsetX;
        int offsetBelow;
        int offsetExtra;
        int statusBarHeight;
        outParams.token = anchorView.getApplicationWindowToken();
        int tooltipPreciseAnchorThreshold = this.f280a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (anchorView.getWidth() >= tooltipPreciseAnchorThreshold) {
            offsetX = anchorX;
        } else {
            offsetX = anchorView.getWidth() / 2;
        }
        if (anchorView.getHeight() >= tooltipPreciseAnchorThreshold) {
            int offsetExtra2 = this.f280a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            offsetBelow = anchorY + offsetExtra2;
            offsetExtra = anchorY - offsetExtra2;
        } else {
            offsetBelow = anchorView.getHeight();
            offsetExtra = 0;
        }
        outParams.gravity = 49;
        int tooltipOffset = this.f280a.getResources().getDimensionPixelOffset(fromTouch ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View appView = b(anchorView);
        if (appView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        appView.getWindowVisibleDisplayFrame(this.f284e);
        Rect rect = this.f284e;
        if (rect.left < 0 && rect.top < 0) {
            Resources res = this.f280a.getResources();
            int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId != 0) {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            } else {
                statusBarHeight = 0;
            }
            DisplayMetrics metrics = res.getDisplayMetrics();
            this.f284e.set(0, statusBarHeight, metrics.widthPixels, metrics.heightPixels);
        }
        appView.getLocationOnScreen(this.f286g);
        anchorView.getLocationOnScreen(this.f285f);
        int[] iArr = this.f285f;
        int i = iArr[0];
        int[] iArr2 = this.f286g;
        iArr[0] = i - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        outParams.x = (iArr[0] + offsetX) - (appView.getWidth() / 2);
        int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f281b.measure(spec, spec);
        int tooltipHeight = this.f281b.getMeasuredHeight();
        int[] iArr3 = this.f285f;
        int yAbove = ((iArr3[1] + offsetExtra) - tooltipOffset) - tooltipHeight;
        int yBelow = iArr3[1] + offsetBelow + tooltipOffset;
        if (fromTouch) {
            if (yAbove >= 0) {
                outParams.y = yAbove;
            } else {
                outParams.y = yBelow;
            }
        } else if (yBelow + tooltipHeight <= this.f284e.height()) {
            outParams.y = yBelow;
        } else {
            outParams.y = yAbove;
        }
    }

    public static View b(View anchorView) {
        View rootView = anchorView.getRootView();
        ViewGroup.LayoutParams lp = rootView.getLayoutParams();
        if ((lp instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) lp).type == 2) {
            return rootView;
        }
        for (Context context = anchorView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
