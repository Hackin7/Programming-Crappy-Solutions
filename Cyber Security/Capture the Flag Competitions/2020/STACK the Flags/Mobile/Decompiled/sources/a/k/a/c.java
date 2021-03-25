package a.k.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: b  reason: collision with root package name */
    public Handler f1035b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f1036c = new a();

    /* renamed from: d  reason: collision with root package name */
    public int f1037d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1038e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1039f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1040g = true;
    public int h = -1;
    public Dialog i;
    public boolean j;
    public boolean k;
    public boolean l;

    public abstract Dialog c(Bundle bundle);

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.i;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    public void e(i manager, String tag) {
        this.k = false;
        this.l = true;
        o ft = manager.a();
        ft.c(this, tag);
        ft.e();
    }

    public void a(boolean allowStateLoss, boolean fromOnDismiss) {
        if (!this.k) {
            this.k = true;
            this.l = false;
            Dialog dialog = this.i;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.i.dismiss();
                if (!fromOnDismiss) {
                    if (Looper.myLooper() == this.f1035b.getLooper()) {
                        onDismiss(this.i);
                    } else {
                        this.f1035b.post(this.f1036c);
                    }
                }
            }
            this.j = true;
            if (this.h >= 0) {
                requireFragmentManager().f(this.h, 1);
                this.h = -1;
                return;
            }
            o ft = requireFragmentManager().a();
            ft.j(this);
            if (allowStateLoss) {
                ft.f();
            } else {
                ft.e();
            }
        }
    }

    public int b() {
        return this.f1038e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.l) {
            this.k = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.l && !this.k) {
            this.k = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f1035b = new Handler();
        this.f1040g = this.mContainerId == 0;
        if (savedInstanceState != null) {
            this.f1037d = savedInstanceState.getInt("android:style", 0);
            this.f1038e = savedInstanceState.getInt("android:theme", 0);
            this.f1039f = savedInstanceState.getBoolean("android:cancelable", true);
            this.f1040g = savedInstanceState.getBoolean("android:showsDialog", this.f1040g);
            this.h = savedInstanceState.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        if (!this.f1040g) {
            return super.onGetLayoutInflater(savedInstanceState);
        }
        Dialog c2 = c(savedInstanceState);
        this.i = c2;
        if (c2 == null) {
            return (LayoutInflater) this.mHost.e().getSystemService("layout_inflater");
        }
        d(c2, this.f1037d);
        return (LayoutInflater) this.i.getContext().getSystemService("layout_inflater");
    }

    public void d(Dialog dialog, int style) {
        if (!(style == 1 || style == 2)) {
            if (style == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void onCancel(DialogInterface dialog) {
    }

    public void onDismiss(DialogInterface dialog) {
        if (!this.j) {
            a(true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        Bundle dialogState;
        super.onActivityCreated(savedInstanceState);
        if (this.f1040g) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.i.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            Activity activity = getActivity();
            if (activity != null) {
                this.i.setOwnerActivity(activity);
            }
            this.i.setCancelable(this.f1039f);
            this.i.setOnCancelListener(this);
            this.i.setOnDismissListener(this);
            if (savedInstanceState != null && (dialogState = savedInstanceState.getBundle("android:savedDialogState")) != null) {
                this.i.onRestoreInstanceState(dialogState);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.i;
        if (dialog != null) {
            this.j = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Bundle dialogState;
        super.onSaveInstanceState(outState);
        Dialog dialog = this.i;
        if (!(dialog == null || (dialogState = dialog.onSaveInstanceState()) == null)) {
            outState.putBundle("android:savedDialogState", dialogState);
        }
        int i2 = this.f1037d;
        if (i2 != 0) {
            outState.putInt("android:style", i2);
        }
        int i3 = this.f1038e;
        if (i3 != 0) {
            outState.putInt("android:theme", i3);
        }
        boolean z = this.f1039f;
        if (!z) {
            outState.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1040g;
        if (!z2) {
            outState.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.h;
        if (i4 != -1) {
            outState.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.i;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.i;
        if (dialog != null) {
            this.j = true;
            dialog.setOnDismissListener(null);
            this.i.dismiss();
            if (!this.k) {
                onDismiss(this.i);
            }
            this.i = null;
        }
    }
}
