package androidx.appcompat.app;

import a.b.j;
import a.b.p.i0;
import a.h.m.s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q = 0;
    public Handler R;
    public final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f1497a;

    /* renamed from: b  reason: collision with root package name */
    public final a.b.k.h f1498b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f1499c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1500d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1501e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1502f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f1503g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n = false;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View v) {
            Message m;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (v != alertController.o || (message3 = alertController.q) == null) {
                AlertController alertController2 = AlertController.this;
                if (v != alertController2.s || (message2 = alertController2.u) == null) {
                    AlertController alertController3 = AlertController.this;
                    if (v != alertController3.w || (message = alertController3.y) == null) {
                        m = null;
                    } else {
                        m = Message.obtain(message);
                    }
                } else {
                    m = Message.obtain(message2);
                }
            } else {
                m = Message.obtain(message3);
            }
            if (m != null) {
                m.sendToTarget();
            }
            AlertController alertController4 = AlertController.this;
            alertController4.R.obtainMessage(1, alertController4.f1498b).sendToTarget();
        }
    }

    public static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f1526a;

        public g(DialogInterface dialog) {
            this.f1526a = new WeakReference<>(dialog);
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) msg.obj).onClick(this.f1526a.get(), msg.what);
            } else if (i == 1) {
                ((DialogInterface) msg.obj).dismiss();
            }
        }
    }

    public static boolean y(Context context) {
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.a.alertDialogCenterButtons, outValue, true);
        if (outValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, a.b.k.h di, Window window) {
        this.f1497a = context;
        this.f1498b = di;
        this.f1499c = window;
        this.R = new g(di);
        TypedArray a2 = context.obtainStyledAttributes(null, j.AlertDialog, a.b.a.alertDialogStyle, 0);
        this.J = a2.getResourceId(j.AlertDialog_android_layout, 0);
        this.K = a2.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
        this.L = a2.getResourceId(j.AlertDialog_listLayout, 0);
        this.M = a2.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
        this.N = a2.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
        this.O = a2.getResourceId(j.AlertDialog_listItemLayout, 0);
        this.P = a2.getBoolean(j.AlertDialog_showTitle, true);
        this.f1500d = a2.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
        a2.recycle();
        di.d(1);
    }

    public static boolean a(View v2) {
        if (v2.onCheckIsTextEditor()) {
            return true;
        }
        if (!(v2 instanceof ViewGroup)) {
            return false;
        }
        ViewGroup vg = (ViewGroup) v2;
        int i2 = vg.getChildCount();
        while (i2 > 0) {
            i2--;
            if (a(vg.getChildAt(i2))) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        this.f1498b.setContentView(j());
        x();
    }

    public final int j() {
        int i2 = this.K;
        if (i2 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i2;
        }
        return this.J;
    }

    public void p(CharSequence title) {
        this.f1501e = title;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(title);
        }
    }

    public void l(View customTitleView) {
        this.G = customTitleView;
    }

    public void q(int layoutResId) {
        this.h = null;
        this.i = layoutResId;
        this.n = false;
    }

    public void r(View view) {
        this.h = view;
        this.i = 0;
        this.n = false;
    }

    public void s(View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) {
        this.h = view;
        this.i = 0;
        this.n = true;
        this.j = viewSpacingLeft;
        this.k = viewSpacingTop;
        this.l = viewSpacingRight;
        this.m = viewSpacingBottom;
    }

    public void k(int whichButton, CharSequence text, DialogInterface.OnClickListener listener, Message msg, Drawable icon) {
        if (msg == null && listener != null) {
            msg = this.R.obtainMessage(whichButton, listener);
        }
        if (whichButton == -3) {
            this.x = text;
            this.y = msg;
            this.z = icon;
        } else if (whichButton == -2) {
            this.t = text;
            this.u = msg;
            this.v = icon;
        } else if (whichButton == -1) {
            this.p = text;
            this.q = msg;
            this.r = icon;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void m(int resId) {
        this.C = null;
        this.B = resId;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (resId != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable icon) {
        this.C = icon;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (icon != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(icon);
            return;
        }
        imageView.setVisibility(8);
    }

    public int c(int attrId) {
        TypedValue out = new TypedValue();
        this.f1497a.getTheme().resolveAttribute(attrId, out, true);
        return out.resourceId;
    }

    public ListView d() {
        return this.f1503g;
    }

    public boolean g(KeyEvent event) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(event);
    }

    public boolean h(KeyEvent event) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(event);
    }

    public final ViewGroup i(View customPanel, View defaultPanel) {
        if (customPanel == null) {
            if (defaultPanel instanceof ViewStub) {
                defaultPanel = ((ViewStub) defaultPanel).inflate();
            }
            return (ViewGroup) defaultPanel;
        }
        if (defaultPanel != null) {
            ViewParent parent = defaultPanel.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(defaultPanel);
            }
        }
        if (customPanel instanceof ViewStub) {
            customPanel = ((ViewStub) customPanel).inflate();
        }
        return (ViewGroup) customPanel;
    }

    public final void x() {
        ListAdapter listAdapter;
        View parentPanel = this.f1499c.findViewById(a.b.f.parentPanel);
        View defaultTopPanel = parentPanel.findViewById(a.b.f.topPanel);
        View defaultContentPanel = parentPanel.findViewById(a.b.f.contentPanel);
        View defaultButtonPanel = parentPanel.findViewById(a.b.f.buttonPanel);
        ViewGroup customPanel = (ViewGroup) parentPanel.findViewById(a.b.f.customPanel);
        v(customPanel);
        View customTopPanel = customPanel.findViewById(a.b.f.topPanel);
        View customContentPanel = customPanel.findViewById(a.b.f.contentPanel);
        View customButtonPanel = customPanel.findViewById(a.b.f.buttonPanel);
        ViewGroup topPanel = i(customTopPanel, defaultTopPanel);
        ViewGroup contentPanel = i(customContentPanel, defaultContentPanel);
        ViewGroup buttonPanel = i(customButtonPanel, defaultButtonPanel);
        u(contentPanel);
        t(buttonPanel);
        w(topPanel);
        boolean hasCustomPanel = customPanel.getVisibility() != 8;
        boolean hasTopPanel = (topPanel == null || topPanel.getVisibility() == 8) ? false : true;
        boolean hasButtonPanel = buttonPanel.getVisibility() != 8;
        if (!hasButtonPanel) {
            View spacer = contentPanel.findViewById(a.b.f.textSpacerNoButtons);
            if (spacer != null) {
                spacer.setVisibility(0);
            }
        }
        if (hasTopPanel) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View divider = null;
            if (!(this.f1502f == null && this.f1503g == null)) {
                divider = topPanel.findViewById(a.b.f.titleDividerNoCustom);
            }
            if (divider != null) {
                divider.setVisibility(0);
            }
        } else {
            View spacer2 = contentPanel.findViewById(a.b.f.textSpacerNoTitle);
            if (spacer2 != null) {
                spacer2.setVisibility(0);
            }
        }
        View spacer3 = this.f1503g;
        if (spacer3 instanceof RecycleListView) {
            ((RecycleListView) spacer3).a(hasTopPanel, hasButtonPanel);
        }
        if (!hasCustomPanel) {
            View content = this.f1503g;
            if (content == null) {
                content = this.A;
            }
            if (content != null) {
                o(contentPanel, content, (hasTopPanel ? 1 : 0) | (hasButtonPanel ? 2 : 0), 3);
            }
        }
        ListView listView = this.f1503g;
        if (listView != null && (listAdapter = this.H) != null) {
            listView.setAdapter(listAdapter);
            int checkedItem = this.I;
            if (checkedItem > -1) {
                listView.setItemChecked(checkedItem, true);
                listView.setSelection(checkedItem);
            }
        }
    }

    public final void o(ViewGroup contentPanel, View content, int indicators, int mask) {
        View indicatorUp = this.f1499c.findViewById(a.b.f.scrollIndicatorUp);
        View indicatorDown = this.f1499c.findViewById(a.b.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            s.m0(content, indicators, mask);
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
                return;
            }
            return;
        }
        if (indicatorUp != null && (indicators & 1) == 0) {
            contentPanel.removeView(indicatorUp);
            indicatorUp = null;
        }
        if (indicatorDown != null && (indicators & 2) == 0) {
            contentPanel.removeView(indicatorDown);
            indicatorDown = null;
        }
        if (indicatorUp != null || indicatorDown != null) {
            if (this.f1502f != null) {
                this.A.setOnScrollChangeListener(new b(this, indicatorUp, indicatorDown));
                this.A.post(new c(indicatorUp, indicatorDown));
                return;
            }
            ListView listView = this.f1503g;
            if (listView != null) {
                listView.setOnScrollListener(new d(this, indicatorUp, indicatorDown));
                this.f1503g.post(new e(indicatorUp, indicatorDown));
                return;
            }
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
            }
        }
    }

    public class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1507a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1508b;

        public b(AlertController this$0, View view, View view2) {
            this.f1507a = view;
            this.f1508b = view2;
        }

        public void a(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            AlertController.f(v, this.f1507a, this.f1508b);
        }
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1509b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1510c;

        public c(View view, View view2) {
            this.f1509b = view;
            this.f1510c = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.A, this.f1509b, this.f1510c);
        }
    }

    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1512a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1513b;

        public d(AlertController this$0, View view, View view2) {
            this.f1512a = view;
            this.f1513b = view2;
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
        }

        public void onScroll(AbsListView v, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            AlertController.f(v, this.f1512a, this.f1513b);
        }
    }

    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1514b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1515c;

        public e(View view, View view2) {
            this.f1514b = view;
            this.f1515c = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.f1503g, this.f1514b, this.f1515c);
        }
    }

    public final void v(ViewGroup customPanel) {
        View customView;
        boolean hasCustomView = false;
        if (this.h != null) {
            customView = this.h;
        } else if (this.i != 0) {
            customView = LayoutInflater.from(this.f1497a).inflate(this.i, customPanel, false);
        } else {
            customView = null;
        }
        if (customView != null) {
            hasCustomView = true;
        }
        if (!hasCustomView || !a(customView)) {
            this.f1499c.setFlags(131072, 131072);
        }
        if (hasCustomView) {
            FrameLayout custom = (FrameLayout) this.f1499c.findViewById(a.b.f.custom);
            custom.addView(customView, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                custom.setPadding(this.j, this.k, this.l, this.m);
            }
            if (this.f1503g != null) {
                ((i0.a) customPanel.getLayoutParams()).f340a = 0.0f;
                return;
            }
            return;
        }
        customPanel.setVisibility(8);
    }

    public final void w(ViewGroup topPanel) {
        if (this.G != null) {
            topPanel.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1499c.findViewById(a.b.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f1499c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1501e)) || !this.P) {
            this.f1499c.findViewById(a.b.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            topPanel.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1499c.findViewById(a.b.f.alertTitle);
        this.E = textView;
        textView.setText(this.f1501e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    public final void u(ViewGroup contentPanel) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1499c.findViewById(a.b.f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) contentPanel.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f1502f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f1503g != null) {
                ViewGroup scrollParent = (ViewGroup) this.A.getParent();
                int childIndex = scrollParent.indexOfChild(this.A);
                scrollParent.removeViewAt(childIndex);
                scrollParent.addView(this.f1503g, childIndex, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            contentPanel.setVisibility(8);
        }
    }

    public static void f(View v2, View upIndicator, View downIndicator) {
        int i2 = 0;
        if (upIndicator != null) {
            upIndicator.setVisibility(v2.canScrollVertically(-1) ? 0 : 4);
        }
        if (downIndicator != null) {
            if (!v2.canScrollVertically(1)) {
                i2 = 4;
            }
            downIndicator.setVisibility(i2);
        }
    }

    public final void t(ViewGroup buttonPanel) {
        int whichButtons = 0;
        Button button = (Button) buttonPanel.findViewById(16908313);
        this.o = button;
        button.setOnClickListener(this.S);
        boolean hasButtons = false;
        if (!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i2 = this.f1500d;
                drawable.setBounds(0, 0, i2, i2);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            whichButtons = 0 | 1;
        } else {
            this.o.setVisibility(8);
        }
        Button button2 = (Button) buttonPanel.findViewById(16908314);
        this.s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i3 = this.f1500d;
                drawable2.setBounds(0, 0, i3, i3);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            whichButtons |= 2;
        } else {
            this.s.setVisibility(8);
        }
        Button button3 = (Button) buttonPanel.findViewById(16908315);
        this.w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable3 = this.z;
            if (drawable3 != null) {
                int i4 = this.f1500d;
                drawable3.setBounds(0, 0, i4, i4);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            whichButtons |= 4;
        } else {
            this.w.setVisibility(8);
        }
        if (y(this.f1497a)) {
            if (whichButtons == 1) {
                b(this.o);
            } else if (whichButtons == 2) {
                b(this.s);
            } else if (whichButtons == 4) {
                b(this.w);
            }
        }
        if (whichButtons != 0) {
            hasButtons = true;
        }
        if (!hasButtons) {
            buttonPanel.setVisibility(8);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) button.getLayoutParams();
        params.gravity = 1;
        params.weight = 0.5f;
        button.setLayoutParams(params);
    }

    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        public final int f1504b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1505c;

        public RecycleListView(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray ta = context.obtainStyledAttributes(attrs, j.RecycleListView);
            this.f1505c = ta.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1504b = ta.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
        }

        public void a(boolean hasTitle, boolean hasButtons) {
            if (!hasButtons || !hasTitle) {
                setPadding(getPaddingLeft(), hasTitle ? getPaddingTop() : this.f1504b, getPaddingRight(), hasButtons ? getPaddingBottom() : this.f1505c);
            }
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1517a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f1518b;

        /* renamed from: c  reason: collision with root package name */
        public int f1519c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f1520d;

        /* renamed from: e  reason: collision with root package name */
        public int f1521e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f1522f;

        /* renamed from: g  reason: collision with root package name */
        public View f1523g;
        public CharSequence h;
        public DialogInterface.OnClickListener i;
        public CharSequence j;
        public DialogInterface.OnClickListener k;
        public boolean l;
        public DialogInterface.OnCancelListener m;
        public DialogInterface.OnDismissListener n;
        public DialogInterface.OnKeyListener o;
        public ListAdapter p;
        public DialogInterface.OnClickListener q;
        public int r;
        public View s;
        public boolean t = false;
        public boolean u;
        public int v = -1;

        public f(Context context) {
            this.f1517a = context;
            this.l = true;
            this.f1518b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController dialog) {
            View view = this.f1523g;
            if (view != null) {
                dialog.l(view);
            } else {
                CharSequence charSequence = this.f1522f;
                if (charSequence != null) {
                    dialog.p(charSequence);
                }
                Drawable drawable = this.f1520d;
                if (drawable != null) {
                    dialog.n(drawable);
                }
                int i2 = this.f1519c;
                if (i2 != 0) {
                    dialog.m(i2);
                }
                int i3 = this.f1521e;
                if (i3 != 0) {
                    dialog.m(dialog.c(i3));
                }
            }
            CharSequence charSequence2 = this.h;
            if (charSequence2 != null) {
                dialog.k(-1, charSequence2, this.i, null, null);
            }
            CharSequence charSequence3 = this.j;
            if (charSequence3 != null) {
                dialog.k(-2, charSequence3, this.k, null, null);
            }
            if (this.p != null) {
                b(dialog);
            }
            View view2 = this.s;
            if (view2 == null) {
                int i4 = this.r;
                if (i4 != 0) {
                    dialog.q(i4);
                }
            } else if (this.t) {
                dialog.s(view2, 0, 0, 0, 0);
            } else {
                dialog.r(view2);
            }
        }

        public final void b(AlertController dialog) {
            int layout;
            ListAdapter adapter;
            RecycleListView listView = (RecycleListView) this.f1518b.inflate(dialog.L, (ViewGroup) null);
            if (this.u) {
                layout = dialog.N;
            } else {
                layout = dialog.O;
            }
            if (this.p != null) {
                adapter = this.p;
            } else {
                adapter = new h(this.f1517a, layout, 16908308, null);
            }
            dialog.H = adapter;
            dialog.I = this.v;
            if (this.q != null) {
                listView.setOnItemClickListener(new a(dialog));
            }
            if (this.u) {
                listView.setChoiceMode(1);
            }
            dialog.f1503g = listView;
        }

        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AlertController f1524b;

            public a(AlertController alertController) {
                this.f1524b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                f.this.q.onClick(this.f1524b.f1498b, position);
                if (!f.this.u) {
                    this.f1524b.f1498b.dismiss();
                }
            }
        }
    }

    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int resource, int textViewResourceId, CharSequence[] objects) {
            super(context, resource, textViewResourceId, objects);
        }

        public boolean hasStableIds() {
            return true;
        }

        public long getItemId(int position) {
            return (long) position;
        }
    }
}
