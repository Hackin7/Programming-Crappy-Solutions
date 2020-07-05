package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class AlertController {

    /* renamed from: A */
    public NestedScrollView f171A;

    /* renamed from: B */
    public int f172B = 0;

    /* renamed from: C */
    public Drawable f173C;

    /* renamed from: D */
    public ImageView f174D;

    /* renamed from: E */
    public TextView f175E;

    /* renamed from: F */
    public TextView f176F;

    /* renamed from: G */
    public View f177G;

    /* renamed from: H */
    public ListAdapter f178H;

    /* renamed from: I */
    public int f179I = -1;

    /* renamed from: J */
    public int f180J;

    /* renamed from: K */
    public int f181K;

    /* renamed from: L */
    public int f182L;

    /* renamed from: M */
    public int f183M;

    /* renamed from: N */
    public int f184N;

    /* renamed from: O */
    public int f185O;

    /* renamed from: P */
    public boolean f186P;

    /* renamed from: Q */
    public int f187Q = 0;

    /* renamed from: R */
    Handler f188R;

    /* renamed from: S */
    public final OnClickListener f189S = new OnClickListener() {
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r0 = r0.f204o
                if (r3 != r0) goto L_0x0015
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.os.Message r0 = r0.f206q
                if (r0 == 0) goto L_0x0015
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Message r3 = r3.f206q
            L_0x0010:
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0038
            L_0x0015:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r0 = r0.f208s
                if (r3 != r0) goto L_0x0026
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.os.Message r0 = r0.f210u
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Message r3 = r3.f210u
                goto L_0x0010
            L_0x0026:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r0 = r0.f212w
                if (r3 != r0) goto L_0x0037
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Message r3 = r3.f214y
                if (r3 == 0) goto L_0x0037
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Message r3 = r3.f214y
                goto L_0x0010
            L_0x0037:
                r3 = 0
            L_0x0038:
                if (r3 == 0) goto L_0x003d
                r3.sendToTarget()
            L_0x003d:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r3 = r3.f188R
                r0 = 1
                androidx.appcompat.app.AlertController r1 = androidx.appcompat.app.AlertController.this
                i r1 = r1.f191b
                android.os.Message r3 = r3.obtainMessage(r0, r1)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C00321.onClick(android.view.View):void");
        }
    };

    /* renamed from: a */
    public final Context f190a;

    /* renamed from: b */
    public final C0493i f191b;

    /* renamed from: c */
    public final Window f192c;

    /* renamed from: d */
    public final int f193d;

    /* renamed from: e */
    public CharSequence f194e;

    /* renamed from: f */
    public CharSequence f195f;

    /* renamed from: g */
    public ListView f196g;

    /* renamed from: h */
    public View f197h;

    /* renamed from: i */
    public int f198i;

    /* renamed from: j */
    public int f199j;

    /* renamed from: k */
    public int f200k;

    /* renamed from: l */
    public int f201l;

    /* renamed from: m */
    public int f202m;

    /* renamed from: n */
    public boolean f203n = false;

    /* renamed from: o */
    public Button f204o;

    /* renamed from: p */
    public CharSequence f205p;

    /* renamed from: q */
    Message f206q;

    /* renamed from: r */
    public Drawable f207r;

    /* renamed from: s */
    public Button f208s;

    /* renamed from: t */
    public CharSequence f209t;

    /* renamed from: u */
    Message f210u;

    /* renamed from: v */
    public Drawable f211v;

    /* renamed from: w */
    public Button f212w;

    /* renamed from: x */
    public CharSequence f213x;

    /* renamed from: y */
    Message f214y;

    /* renamed from: z */
    public Drawable f215z;

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f229a;

        /* renamed from: b */
        public final int f230b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126j.RecycleListView);
            this.f230b = obtainStyledAttributes.getDimensionPixelOffset(C0126j.RecycleListView_paddingBottomNoButtons, -1);
            this.f229a = obtainStyledAttributes.getDimensionPixelOffset(C0126j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public static class C0037a {

        /* renamed from: A */
        public int f231A;

        /* renamed from: B */
        public int f232B;

        /* renamed from: C */
        public int f233C;

        /* renamed from: D */
        public int f234D;

        /* renamed from: E */
        public boolean f235E = false;

        /* renamed from: F */
        public boolean[] f236F;

        /* renamed from: G */
        public boolean f237G;

        /* renamed from: H */
        public boolean f238H;

        /* renamed from: I */
        public int f239I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f240J;

        /* renamed from: K */
        public Cursor f241K;

        /* renamed from: L */
        public String f242L;

        /* renamed from: M */
        public String f243M;

        /* renamed from: N */
        public OnItemSelectedListener f244N;

        /* renamed from: O */
        public boolean f245O = true;

        /* renamed from: a */
        public final Context f246a;

        /* renamed from: b */
        public final LayoutInflater f247b;

        /* renamed from: c */
        public int f248c = 0;

        /* renamed from: d */
        public Drawable f249d;

        /* renamed from: e */
        public int f250e = 0;

        /* renamed from: f */
        public CharSequence f251f;

        /* renamed from: g */
        public View f252g;

        /* renamed from: h */
        public CharSequence f253h;

        /* renamed from: i */
        public CharSequence f254i;

        /* renamed from: j */
        public Drawable f255j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f256k;

        /* renamed from: l */
        public CharSequence f257l;

        /* renamed from: m */
        public Drawable f258m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f259n;

        /* renamed from: o */
        public CharSequence f260o;

        /* renamed from: p */
        public Drawable f261p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f262q;

        /* renamed from: r */
        public boolean f263r;

        /* renamed from: s */
        public OnCancelListener f264s;

        /* renamed from: t */
        public OnDismissListener f265t;

        /* renamed from: u */
        public OnKeyListener f266u;

        /* renamed from: v */
        public CharSequence[] f267v;

        /* renamed from: w */
        public ListAdapter f268w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f269x;

        /* renamed from: y */
        public int f270y;

        /* renamed from: z */
        public View f271z;

        public C0037a(Context context) {
            this.f246a = context;
            this.f263r = true;
            this.f247b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    static final class C0042b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f284a;

        public C0042b(DialogInterface dialogInterface) {
            this.f284a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f284a.get(), message.what);
                        return;
                    default:
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static class C0043c extends ArrayAdapter<CharSequence> {
        public C0043c(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0493i iVar, Window window) {
        this.f190a = context;
        this.f191b = iVar;
        this.f192c = window;
        this.f188R = new C0042b(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0126j.AlertDialog, C0117a.alertDialogStyle, 0);
        this.f180J = obtainStyledAttributes.getResourceId(C0126j.AlertDialog_android_layout, 0);
        this.f181K = obtainStyledAttributes.getResourceId(C0126j.AlertDialog_buttonPanelSideLayout, 0);
        this.f182L = obtainStyledAttributes.getResourceId(C0126j.AlertDialog_listLayout, 0);
        this.f183M = obtainStyledAttributes.getResourceId(C0126j.AlertDialog_multiChoiceItemLayout, 0);
        this.f184N = obtainStyledAttributes.getResourceId(C0126j.AlertDialog_singleChoiceItemLayout, 0);
        this.f185O = obtainStyledAttributes.getResourceId(C0126j.AlertDialog_listItemLayout, 0);
        this.f186P = obtainStyledAttributes.getBoolean(C0126j.AlertDialog_showTitle, true);
        this.f193d = obtainStyledAttributes.getDimensionPixelSize(C0126j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        iVar.mo2063a().mo1789c(1);
    }

    /* renamed from: a */
    public static ViewGroup m133a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m134a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m135a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static boolean m136a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m136a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo321a(int i) {
        this.f173C = null;
        this.f172B = i;
        if (this.f174D != null) {
            if (i != 0) {
                this.f174D.setVisibility(0);
                this.f174D.setImageResource(this.f172B);
                return;
            }
            this.f174D.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo322a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.f188R.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f213x = charSequence;
                this.f214y = message;
                this.f215z = drawable;
                return;
            case -2:
                this.f209t = charSequence;
                this.f210u = message;
                this.f211v = drawable;
                return;
            case -1:
                this.f205p = charSequence;
                this.f206q = message;
                this.f207r = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public final void mo323a(CharSequence charSequence) {
        this.f194e = charSequence;
        if (this.f175E != null) {
            this.f175E.setText(charSequence);
        }
    }
}
