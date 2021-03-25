package b.d.a.a.m;

import a.b.k.h;
import a.h.m.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.d.a.a.f;
import b.d.a.a.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class a extends h {

    /* renamed from: d  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f2576d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2577e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2578f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2579g;
    public BottomSheetBehavior.c h = new d();

    public a(Context context, int theme) {
        super(context, b(context, theme));
        d(1);
    }

    @Override // a.b.k.h, android.app.Dialog
    public void setContentView(int layoutResId) {
        super.setContentView(f(layoutResId, null, null));
    }

    @Override // a.b.k.h
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // a.b.k.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(f(0, view, null));
    }

    @Override // a.b.k.h
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(f(0, view, params));
    }

    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
        if (this.f2577e != cancelable) {
            this.f2577e = cancelable;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f2576d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.P(cancelable);
            }
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f2576d;
        if (bottomSheetBehavior != null && bottomSheetBehavior.K() == 5) {
            this.f2576d.S(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
        super.setCanceledOnTouchOutside(cancel);
        if (cancel && !this.f2577e) {
            this.f2577e = true;
        }
        this.f2578f = cancel;
        this.f2579g = true;
    }

    public final View f(int layoutResId, View view, ViewGroup.LayoutParams params) {
        FrameLayout container = (FrameLayout) View.inflate(getContext(), b.d.a.a.h.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinator = (CoordinatorLayout) container.findViewById(f.coordinator);
        if (layoutResId != 0 && view == null) {
            view = getLayoutInflater().inflate(layoutResId, (ViewGroup) coordinator, false);
        }
        FrameLayout bottomSheet = (FrameLayout) coordinator.findViewById(f.design_bottom_sheet);
        BottomSheetBehavior<FrameLayout> I = BottomSheetBehavior.I(bottomSheet);
        this.f2576d = I;
        I.N(this.h);
        this.f2576d.P(this.f2577e);
        if (params == null) {
            bottomSheet.addView(view);
        } else {
            bottomSheet.addView(view, params);
        }
        coordinator.findViewById(f.touch_outside).setOnClickListener(new View$OnClickListenerC0054a());
        s.Z(bottomSheet, new b());
        bottomSheet.setOnTouchListener(new c(this));
        return container;
    }

    /* renamed from: b.d.a.a.m.a$a  reason: collision with other inner class name */
    public class View$OnClickListenerC0054a implements View.OnClickListener {
        public View$OnClickListenerC0054a() {
        }

        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f2577e && aVar.isShowing() && a.this.e()) {
                a.this.cancel();
            }
        }
    }

    public class b extends a.h.m.a {
        public b() {
        }

        @Override // a.h.m.a
        public void g(View host, a.h.m.c0.d info) {
            super.g(host, info);
            if (a.this.f2577e) {
                info.a(1048576);
                info.N(true);
                return;
            }
            info.N(false);
        }

        @Override // a.h.m.a
        public boolean j(View host, int action, Bundle args) {
            if (action == 1048576) {
                a aVar = a.this;
                if (aVar.f2577e) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(host, action, args);
        }
    }

    public class c implements View.OnTouchListener {
        public c(a this$0) {
        }

        public boolean onTouch(View view, MotionEvent event) {
            return true;
        }
    }

    public boolean e() {
        if (!this.f2579g) {
            TypedArray a2 = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f2578f = a2.getBoolean(0, true);
            a2.recycle();
            this.f2579g = true;
        }
        return this.f2578f;
    }

    public static int b(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(b.d.a.a.b.bottomSheetDialogTheme, outValue, true)) {
            return outValue.resourceId;
        }
        return i.Theme_Design_Light_BottomSheetDialog;
    }

    public class d extends BottomSheetBehavior.c {
        public d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void b(View bottomSheet, int newState) {
            if (newState == 5) {
                a.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public void a(View bottomSheet, float slideOffset) {
        }
    }
}
