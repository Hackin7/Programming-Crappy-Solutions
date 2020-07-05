package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityManager;

/* renamed from: cu */
final class C0220cu implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {

    /* renamed from: j */
    private static C0220cu f1111j;

    /* renamed from: k */
    private static C0220cu f1112k;

    /* renamed from: a */
    private final View f1113a;

    /* renamed from: b */
    private final CharSequence f1114b;

    /* renamed from: c */
    private final int f1115c;

    /* renamed from: d */
    private final Runnable f1116d = new Runnable() {
        public final void run() {
            C0220cu.this.mo1327a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f1117e = new Runnable() {
        public final void run() {
            C0220cu.this.mo1326a();
        }
    };

    /* renamed from: f */
    private int f1118f;

    /* renamed from: g */
    private int f1119g;

    /* renamed from: h */
    private C0223cv f1120h;

    /* renamed from: i */
    private boolean f1121i;

    private C0220cu(View view, CharSequence charSequence) {
        this.f1113a = view;
        this.f1114b = charSequence;
        this.f1115c = C0400gr.m1283a(ViewConfiguration.get(this.f1113a.getContext()));
        m731b();
        this.f1113a.setOnLongClickListener(this);
        this.f1113a.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m729a(View view, CharSequence charSequence) {
        if (f1111j != null && f1111j.f1113a == view) {
            m730a((C0220cu) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f1112k != null && f1112k.f1113a == view) {
                f1112k.mo1326a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0220cu(view, charSequence);
    }

    /* renamed from: a */
    private static void m730a(C0220cu cuVar) {
        if (f1111j != null) {
            C0220cu cuVar2 = f1111j;
            cuVar2.f1113a.removeCallbacks(cuVar2.f1116d);
        }
        f1111j = cuVar;
        if (cuVar != null) {
            C0220cu cuVar3 = f1111j;
            cuVar3.f1113a.postDelayed(cuVar3.f1116d, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: b */
    private void m731b() {
        this.f1118f = Integer.MAX_VALUE;
        this.f1119g = Integer.MAX_VALUE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1326a() {
        if (f1112k == this) {
            f1112k = null;
            if (this.f1120h != null) {
                this.f1120h.mo1334a();
                this.f1120h = null;
                m731b();
                this.f1113a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1111j == this) {
            m730a((C0220cu) null);
        }
        this.f1113a.removeCallbacks(this.f1117e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1327a(boolean z) {
        int i;
        int i2;
        long j;
        if (C0396gq.m1276m(this.f1113a)) {
            m730a((C0220cu) null);
            if (f1112k != null) {
                f1112k.mo1326a();
            }
            f1112k = this;
            this.f1121i = z;
            this.f1120h = new C0223cv(this.f1113a.getContext());
            C0223cv cvVar = this.f1120h;
            View view = this.f1113a;
            int i3 = this.f1118f;
            int i4 = this.f1119g;
            boolean z2 = this.f1121i;
            CharSequence charSequence = this.f1114b;
            if (cvVar.mo1335b()) {
                cvVar.mo1334a();
            }
            cvVar.f1126c.setText(charSequence);
            LayoutParams layoutParams = cvVar.f1127d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = cvVar.f1124a.getResources().getDimensionPixelOffset(C0120d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i3 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = cvVar.f1124a.getResources().getDimensionPixelOffset(C0120d.tooltip_precise_anchor_extra_offset);
                i = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = cvVar.f1124a.getResources().getDimensionPixelOffset(z2 ? C0120d.tooltip_y_offset_touch : C0120d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof LayoutParams) || ((LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(cvVar.f1128e);
                if (cvVar.f1128e.left < 0 && cvVar.f1128e.top < 0) {
                    Resources resources = cvVar.f1124a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    cvVar.f1128e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(cvVar.f1130g);
                view.getLocationOnScreen(cvVar.f1129f);
                int[] iArr = cvVar.f1129f;
                iArr[0] = iArr[0] - cvVar.f1130g[0];
                int[] iArr2 = cvVar.f1129f;
                iArr2[1] = iArr2[1] - cvVar.f1130g[1];
                layoutParams.x = (cvVar.f1129f[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                cvVar.f1125b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = cvVar.f1125b.getMeasuredHeight();
                int i5 = ((cvVar.f1129f[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i6 = cvVar.f1129f[1] + i + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i6 > cvVar.f1128e.height() : i5 >= 0) {
                    layoutParams.y = i5;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) cvVar.f1124a.getSystemService("window")).addView(cvVar.f1125b, cvVar.f1127d);
            this.f1113a.addOnAttachStateChangeListener(this);
            if (this.f1121i) {
                j = 2500;
            } else {
                j = ((C0396gq.m1269f(this.f1113a) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1113a.removeCallbacks(this.f1117e);
            this.f1113a.postDelayed(this.f1117e, j);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1120h != null && this.f1121i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1113a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7) {
            if (this.f1113a.isEnabled() && this.f1120h == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x - this.f1118f) > this.f1115c || Math.abs(y - this.f1119g) > this.f1115c) {
                    this.f1118f = x;
                    this.f1119g = y;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m730a(this);
                }
            }
            return false;
        } else if (action != 10) {
            return false;
        } else {
            m731b();
            mo1326a();
            return false;
        }
    }

    public final boolean onLongClick(View view) {
        this.f1118f = view.getWidth() / 2;
        this.f1119g = view.getHeight() / 2;
        mo1327a(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        mo1326a();
    }
}
