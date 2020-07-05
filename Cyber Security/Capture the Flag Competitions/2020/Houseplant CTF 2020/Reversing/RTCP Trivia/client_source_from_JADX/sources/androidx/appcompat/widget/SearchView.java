package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends C0190cf implements C0804v {

    /* renamed from: p */
    static final C0072a f437p = new C0072a();

    /* renamed from: A */
    private final int f438A;

    /* renamed from: B */
    private final int f439B;

    /* renamed from: C */
    private final CharSequence f440C;

    /* renamed from: D */
    private C0074c f441D;

    /* renamed from: E */
    private C0073b f442E;

    /* renamed from: F */
    private OnClickListener f443F;

    /* renamed from: G */
    private boolean f444G;

    /* renamed from: H */
    private boolean f445H;

    /* renamed from: I */
    private CharSequence f446I;

    /* renamed from: J */
    private boolean f447J;

    /* renamed from: K */
    private boolean f448K;

    /* renamed from: L */
    private int f449L;

    /* renamed from: M */
    private boolean f450M;

    /* renamed from: N */
    private CharSequence f451N;

    /* renamed from: O */
    private CharSequence f452O;

    /* renamed from: P */
    private boolean f453P;

    /* renamed from: Q */
    private int f454Q;

    /* renamed from: R */
    private final Runnable f455R;

    /* renamed from: S */
    private Runnable f456S;

    /* renamed from: T */
    private final WeakHashMap<String, ConstantState> f457T;

    /* renamed from: U */
    private final OnClickListener f458U;

    /* renamed from: V */
    private final OnEditorActionListener f459V;

    /* renamed from: W */
    private final OnItemClickListener f460W;

    /* renamed from: a */
    final SearchAutoComplete f461a;

    /* renamed from: aa */
    private final OnItemSelectedListener f462aa;

    /* renamed from: ab */
    private TextWatcher f463ab;

    /* renamed from: b */
    final View f464b;

    /* renamed from: c */
    final ImageView f465c;

    /* renamed from: d */
    final ImageView f466d;

    /* renamed from: e */
    final ImageView f467e;

    /* renamed from: f */
    final ImageView f468f;

    /* renamed from: g */
    final View f469g;

    /* renamed from: h */
    final Intent f470h;

    /* renamed from: i */
    final Intent f471i;

    /* renamed from: j */
    OnFocusChangeListener f472j;

    /* renamed from: k */
    C0075d f473k;

    /* renamed from: l */
    boolean f474l;

    /* renamed from: m */
    C0444hj f475m;

    /* renamed from: n */
    SearchableInfo f476n;

    /* renamed from: o */
    Bundle f477o;

    /* renamed from: q */
    OnKeyListener f478q;

    /* renamed from: r */
    private final View f479r;

    /* renamed from: s */
    private final View f480s;

    /* renamed from: t */
    private C0078f f481t;

    /* renamed from: u */
    private Rect f482u;

    /* renamed from: v */
    private Rect f483v;

    /* renamed from: w */
    private int[] f484w;

    /* renamed from: x */
    private int[] f485x;

    /* renamed from: y */
    private final ImageView f486y;

    /* renamed from: z */
    private final Drawable f487z;

    public static class SearchAutoComplete extends C0141bc {

        /* renamed from: a */
        boolean f498a;

        /* renamed from: b */
        final Runnable f499b;

        /* renamed from: c */
        private int f500c;

        /* renamed from: d */
        private SearchView f501d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0117a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f499b = new Runnable() {
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.f498a) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.f498a = false;
                    }
                }
            };
            this.f500c = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        public boolean enoughToFilter() {
            return this.f500c <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f498a) {
                removeCallbacks(this.f499b);
                post(this.f499b);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f501d.mo562h();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f501d.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f501d.hasFocus() && getVisibility() == 0) {
                this.f498a = true;
                if (SearchView.m219a(getContext())) {
                    SearchView.f437p.mo611a(this);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f498a = false;
                removeCallbacks(this.f499b);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f498a = false;
                removeCallbacks(this.f499b);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f498a = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f501d = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f500c = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    static class C0072a {

        /* renamed from: a */
        Method f503a;

        /* renamed from: b */
        Method f504b;

        /* renamed from: c */
        private Method f505c;

        C0072a() {
            try {
                this.f503a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f503a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f504b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f504b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f505c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f505c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo611a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f505c != null) {
                try {
                    this.f505c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(true)});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public interface C0073b {
        /* renamed from: a */
        boolean mo612a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public interface C0074c {
        /* renamed from: a */
        boolean mo613a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public interface C0075d {
        /* renamed from: a */
        boolean mo614a();

        /* renamed from: b */
        boolean mo615b();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    static class C0076e extends C0450hm {
        public static final Creator<C0076e> CREATOR = new ClassLoaderCreator<C0076e>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0076e(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0076e(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0076e[i];
            }
        };

        /* renamed from: a */
        boolean f506a;

        public C0076e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f506a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0076e(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f506a);
            sb.append("}");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f506a));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    static class C0078f extends TouchDelegate {

        /* renamed from: a */
        private final View f507a;

        /* renamed from: b */
        private final Rect f508b = new Rect();

        /* renamed from: c */
        private final Rect f509c = new Rect();

        /* renamed from: d */
        private final Rect f510d = new Rect();

        /* renamed from: e */
        private final int f511e;

        /* renamed from: f */
        private boolean f512f;

        public C0078f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f511e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo621a(rect, rect2);
            this.f507a = view;
        }

        /* renamed from: a */
        public final void mo621a(Rect rect, Rect rect2) {
            this.f508b.set(rect);
            this.f510d.set(rect);
            this.f510d.inset(-this.f511e, -this.f511e);
            this.f509c.set(rect2);
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0027;
                    case 1: goto L_0x0019;
                    case 2: goto L_0x0019;
                    case 3: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0033
            L_0x0014:
                boolean r2 = r6.f512f
                r6.f512f = r4
                goto L_0x0034
            L_0x0019:
                boolean r2 = r6.f512f
                if (r2 == 0) goto L_0x0034
                android.graphics.Rect r5 = r6.f510d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L_0x0034
                r3 = r4
                goto L_0x0034
            L_0x0027:
                android.graphics.Rect r2 = r6.f508b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x0033
                r6.f512f = r3
                r2 = r3
                goto L_0x0034
            L_0x0033:
                r2 = r4
            L_0x0034:
                if (r2 == 0) goto L_0x0067
                if (r3 == 0) goto L_0x0052
                android.graphics.Rect r2 = r6.f509c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0052
                android.view.View r0 = r6.f507a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f507a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                goto L_0x005d
            L_0x0052:
                android.graphics.Rect r2 = r6.f509c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f509c
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x005d:
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                android.view.View r0 = r6.f507a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L_0x0067:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0078f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0117a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f482u = new Rect();
        this.f483v = new Rect();
        this.f484w = new int[2];
        this.f485x = new int[2];
        this.f455R = new Runnable() {
            public final void run() {
                SearchView.this.mo550d();
            }
        };
        this.f456S = new Runnable() {
            public final void run() {
                if (SearchView.this.f475m != null && (SearchView.this.f475m instanceof C0209cm)) {
                    SearchView.this.f475m.mo1297a((Cursor) null);
                }
            }
        };
        this.f457T = new WeakHashMap<>();
        this.f458U = new OnClickListener() {
            public final void onClick(View view) {
                if (view == SearchView.this.f465c) {
                    SearchView.this.mo553g();
                } else if (view == SearchView.this.f467e) {
                    SearchView.this.mo552f();
                } else if (view == SearchView.this.f466d) {
                    SearchView.this.mo551e();
                } else if (view == SearchView.this.f468f) {
                    SearchView searchView = SearchView.this;
                    if (searchView.f476n != null) {
                        SearchableInfo searchableInfo = searchView.f476n;
                        try {
                            String str = null;
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.f470h);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                String str2 = "calling_package";
                                if (searchActivity != null) {
                                    str = searchActivity.flattenToShortString();
                                }
                                intent.putExtra(str2, str);
                                searchView.getContext().startActivity(intent);
                                return;
                            }
                            if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.f471i;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle bundle = new Bundle();
                                if (searchView.f477o != null) {
                                    bundle.putParcelable("app_data", searchView.f477o);
                                }
                                Intent intent4 = new Intent(intent2);
                                String str3 = "free_form";
                                int i = 1;
                                Resources resources = searchView.getResources();
                                if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                    str3 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                }
                                String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                                String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i = searchableInfo.getVoiceMaxResults();
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str3);
                                intent4.putExtra("android.speech.extra.PROMPT", string);
                                intent4.putExtra("android.speech.extra.LANGUAGE", string2);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                                String str4 = "calling_package";
                                if (searchActivity2 != null) {
                                    str = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra(str4, str);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                searchView.getContext().startActivity(intent4);
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                        }
                    }
                } else {
                    if (view == SearchView.this.f461a) {
                        SearchView.this.mo563i();
                    }
                }
            }
        };
        this.f478q = new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f476n == null) {
                    return false;
                }
                if (SearchView.this.f461a.isPopupShowing() && SearchView.this.f461a.getListSelection() != -1) {
                    return SearchView.this.mo547a(i, keyEvent);
                }
                if ((TextUtils.getTrimmedLength(SearchView.this.f461a.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView.this.mo546a(SearchView.this.f461a.getText().toString());
                return true;
            }
        };
        this.f459V = new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo551e();
                return true;
            }
        };
        this.f460W = new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo548b(i);
            }
        };
        this.f462aa = new OnItemSelectedListener() {
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView searchView = SearchView.this;
                if (searchView.f473k == null || !searchView.f473k.mo614a()) {
                    Editable text = searchView.f461a.getText();
                    Cursor a = searchView.f475m.mo1883a();
                    if (a != null) {
                        if (a.moveToPosition(i)) {
                            CharSequence b = searchView.f475m.mo1299b(a);
                            if (b != null) {
                                searchView.setQuery(b);
                            } else {
                                searchView.setQuery(text);
                            }
                        } else {
                            searchView.setQuery(text);
                        }
                    }
                }
            }

            public final void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f463ab = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo545a(charSequence);
            }
        };
        C0215cr a = C0215cr.m676a(context, attributeSet, C0126j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo1324g(C0126j.SearchView_layout, C0123g.abc_search_view), this, true);
        this.f461a = (SearchAutoComplete) findViewById(C0122f.search_src_text);
        this.f461a.setSearchView(this);
        this.f479r = findViewById(C0122f.search_edit_frame);
        this.f464b = findViewById(C0122f.search_plate);
        this.f480s = findViewById(C0122f.submit_area);
        this.f465c = (ImageView) findViewById(C0122f.search_button);
        this.f466d = (ImageView) findViewById(C0122f.search_go_btn);
        this.f467e = (ImageView) findViewById(C0122f.search_close_btn);
        this.f468f = (ImageView) findViewById(C0122f.search_voice_btn);
        this.f486y = (ImageView) findViewById(C0122f.search_mag_icon);
        C0396gq.m1257a(this.f464b, a.mo1312a(C0126j.SearchView_queryBackground));
        C0396gq.m1257a(this.f480s, a.mo1312a(C0126j.SearchView_submitBackground));
        this.f465c.setImageDrawable(a.mo1312a(C0126j.SearchView_searchIcon));
        this.f466d.setImageDrawable(a.mo1312a(C0126j.SearchView_goIcon));
        this.f467e.setImageDrawable(a.mo1312a(C0126j.SearchView_closeIcon));
        this.f468f.setImageDrawable(a.mo1312a(C0126j.SearchView_voiceIcon));
        this.f486y.setImageDrawable(a.mo1312a(C0126j.SearchView_searchIcon));
        this.f487z = a.mo1312a(C0126j.SearchView_searchHintIcon);
        C0219ct.m728a(this.f465c, getResources().getString(C0124h.abc_searchview_description_search));
        this.f438A = a.mo1324g(C0126j.SearchView_suggestionRowLayout, C0123g.abc_search_dropdown_item_icons_2line);
        this.f439B = a.mo1324g(C0126j.SearchView_commitIcon, 0);
        this.f465c.setOnClickListener(this.f458U);
        this.f467e.setOnClickListener(this.f458U);
        this.f466d.setOnClickListener(this.f458U);
        this.f468f.setOnClickListener(this.f458U);
        this.f461a.setOnClickListener(this.f458U);
        this.f461a.addTextChangedListener(this.f463ab);
        this.f461a.setOnEditorActionListener(this.f459V);
        this.f461a.setOnItemClickListener(this.f460W);
        this.f461a.setOnItemSelectedListener(this.f462aa);
        this.f461a.setOnKeyListener(this.f478q);
        this.f461a.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.f472j != null) {
                    SearchView.this.f472j.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo1313a(C0126j.SearchView_iconifiedByDefault, true));
        int e = a.mo1320e(C0126j.SearchView_android_maxWidth, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f440C = a.mo1317c(C0126j.SearchView_defaultQueryHint);
        this.f446I = a.mo1317c(C0126j.SearchView_queryHint);
        int a2 = a.mo1311a(C0126j.SearchView_android_imeOptions, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo1311a(C0126j.SearchView_android_inputType, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo1313a(C0126j.SearchView_android_focusable, true));
        a.f1087b.recycle();
        this.f470h = new Intent("android.speech.action.WEB_SEARCH");
        this.f470h.addFlags(268435456);
        this.f470h.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f471i = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f471i.addFlags(268435456);
        this.f469g = findViewById(this.f461a.getDropDownAnchor());
        if (this.f469g != null) {
            this.f469g.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView searchView = SearchView.this;
                    if (searchView.f469g.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.f464b.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean a = C0225cx.m739a(searchView);
                        int dimensionPixelSize = searchView.f474l ? resources.getDimensionPixelSize(C0120d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0120d.abc_dropdownitem_text_padding_left) : 0;
                        searchView.f461a.getDropDownBackground().getPadding(rect);
                        searchView.f461a.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                        searchView.f461a.setDropDownWidth((((searchView.f469g.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    }
                }
            });
        }
        m218a(this.f474l);
        m226n();
    }

    /* renamed from: a */
    private Intent m216a(Cursor cursor) {
        int i;
        try {
            String a = C0209cm.m657a(cursor, "suggest_intent_action");
            if (a == null) {
                a = this.f476n.getSuggestIntentAction();
            }
            if (a == null) {
                a = "android.intent.action.SEARCH";
            }
            String a2 = C0209cm.m657a(cursor, "suggest_intent_data");
            if (a2 == null) {
                a2 = this.f476n.getSuggestIntentData();
            }
            if (a2 != null) {
                String a3 = C0209cm.m657a(cursor, "suggest_intent_data_id");
                if (a3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append("/");
                    sb.append(Uri.encode(a3));
                    a2 = sb.toString();
                }
            }
            return m217a(a, a2 == null ? null : Uri.parse(a2), C0209cm.m657a(cursor, "suggest_intent_extra_data"), C0209cm.m657a(cursor, "suggest_intent_query"));
        } catch (RuntimeException e) {
            try {
                i = cursor.getPosition();
            } catch (RuntimeException unused) {
                i = -1;
            }
            StringBuilder sb2 = new StringBuilder("Search suggestions cursor at row ");
            sb2.append(i);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m217a(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f452O);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f477o != null) {
            intent.putExtra("app_data", this.f477o);
        }
        intent.setComponent(this.f476n.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m218a(boolean z) {
        this.f444G = z;
        int i = 8;
        boolean z2 = false;
        boolean z3 = !TextUtils.isEmpty(this.f461a.getText());
        this.f465c.setVisibility(z ? 0 : 8);
        m220b(z3);
        this.f479r.setVisibility(z ? 8 : 0);
        if (this.f486y.getDrawable() != null && !this.f474l) {
            i = 0;
        }
        this.f486y.setVisibility(i);
        m224l();
        if (!z3) {
            z2 = true;
        }
        m221c(z2);
        m223k();
    }

    /* renamed from: a */
    static boolean m219a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private void m220b(boolean z) {
        this.f466d.setVisibility((!this.f445H || !m222j() || !hasFocus() || (!z && this.f450M)) ? 8 : 0);
    }

    /* renamed from: c */
    private void m221c(boolean z) {
        int i;
        if (!this.f450M || this.f444G || !z) {
            i = 8;
        } else {
            i = 0;
            this.f466d.setVisibility(8);
        }
        this.f468f.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0120d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0120d.abc_search_view_preferred_width);
    }

    /* renamed from: j */
    private boolean m222j() {
        return (this.f445H || this.f450M) && !this.f444G;
    }

    /* renamed from: k */
    private void m223k() {
        this.f480s.setVisibility((!m222j() || !(this.f466d.getVisibility() == 0 || this.f468f.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: l */
    private void m224l() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f461a.getText());
        int i = 0;
        if (!z2 && (!this.f474l || this.f453P)) {
            z = false;
        }
        ImageView imageView = this.f467e;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f467e.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: m */
    private void m225m() {
        post(this.f455R);
    }

    /* renamed from: n */
    private void m226n() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f461a;
        if (queryHint == 0) {
            queryHint = "";
        }
        if (this.f474l && this.f487z != null) {
            int textSize = (int) (((double) this.f461a.getTextSize()) * 1.25d);
            this.f487z.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f487z), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: a */
    public final void mo311a() {
        if (!this.f453P) {
            this.f453P = true;
            this.f454Q = this.f461a.getImeOptions();
            this.f461a.setImeOptions(this.f454Q | 33554432);
            this.f461a.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo545a(CharSequence charSequence) {
        Editable text = this.f461a.getText();
        this.f452O = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m220b(z2);
        if (z2) {
            z = false;
        }
        m221c(z);
        m224l();
        m223k();
        if (this.f441D != null && !TextUtils.equals(charSequence, this.f451N)) {
            charSequence.toString();
        }
        this.f451N = charSequence.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo546a(String str) {
        getContext().startActivity(m217a("android.intent.action.SEARCH", null, null, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo547a(int i, KeyEvent keyEvent) {
        if (this.f476n != null && this.f475m != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo548b(this.f461a.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f461a.setSelection(i == 21 ? 0 : this.f461a.length());
                this.f461a.setListSelection(0);
                this.f461a.clearListSelection();
                f437p.mo611a(this.f461a);
                return true;
            } else if (i != 19 || this.f461a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo312b() {
        String str = "";
        this.f461a.setText(str);
        this.f461a.setSelection(this.f461a.length());
        this.f452O = str;
        clearFocus();
        m218a(true);
        this.f461a.setImeOptions(this.f454Q);
        this.f453P = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo548b(int i) {
        if (this.f473k != null && this.f473k.mo615b()) {
            return false;
        }
        Cursor a = this.f475m.mo1883a();
        if (a != null && a.moveToPosition(i)) {
            Intent a2 = m216a(a);
            if (a2 != null) {
                try {
                    getContext().startActivity(a2);
                } catch (RuntimeException e) {
                    StringBuilder sb = new StringBuilder("Failed launch activity: ");
                    sb.append(a2);
                    Log.e("SearchView", sb.toString(), e);
                }
            }
        }
        this.f461a.setImeVisibility(false);
        this.f461a.dismissDropDown();
        return true;
    }

    public void clearFocus() {
        this.f448K = true;
        super.clearFocus();
        this.f461a.clearFocus();
        this.f461a.setImeVisibility(false);
        this.f448K = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo550d() {
        int[] iArr = this.f461a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f464b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f480s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo551e() {
        Editable text = this.f461a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f441D != null) {
                C0074c cVar = this.f441D;
                text.toString();
                if (cVar.mo613a()) {
                    return;
                }
            }
            if (this.f476n != null) {
                mo546a(text.toString());
            }
            this.f461a.setImeVisibility(false);
            this.f461a.dismissDropDown();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo552f() {
        if (!TextUtils.isEmpty(this.f461a.getText())) {
            this.f461a.setText("");
            this.f461a.requestFocus();
            this.f461a.setImeVisibility(true);
        } else if (this.f474l && (this.f442E == null || !this.f442E.mo612a())) {
            clearFocus();
            m218a(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo553g() {
        m218a(false);
        this.f461a.requestFocus();
        this.f461a.setImeVisibility(true);
        if (this.f443F != null) {
            this.f443F.onClick(this);
        }
    }

    public int getImeOptions() {
        return this.f461a.getImeOptions();
    }

    public int getInputType() {
        return this.f461a.getInputType();
    }

    public int getMaxWidth() {
        return this.f449L;
    }

    public CharSequence getQuery() {
        return this.f461a.getText();
    }

    public CharSequence getQueryHint() {
        return this.f446I != null ? this.f446I : (this.f476n == null || this.f476n.getHintId() == 0) ? this.f440C : getContext().getText(this.f476n.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f439B;
    }

    public int getSuggestionRowLayout() {
        return this.f438A;
    }

    public C0444hj getSuggestionsAdapter() {
        return this.f475m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo562h() {
        m218a(this.f444G);
        m225m();
        if (this.f461a.hasFocus()) {
            mo563i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo563i() {
        C0072a aVar = f437p;
        SearchAutoComplete searchAutoComplete = this.f461a;
        if (aVar.f503a != null) {
            try {
                aVar.f503a.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0072a aVar2 = f437p;
        SearchAutoComplete searchAutoComplete2 = this.f461a;
        if (aVar2.f504b != null) {
            try {
                aVar2.f504b.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f455R);
        post(this.f456S);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f461a;
            Rect rect = this.f482u;
            searchAutoComplete.getLocationInWindow(this.f484w);
            getLocationInWindow(this.f485x);
            int i5 = this.f484w[1] - this.f485x[1];
            int i6 = this.f484w[0] - this.f485x[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            this.f483v.set(this.f482u.left, 0, this.f482u.right, i4 - i2);
            if (this.f481t == null) {
                this.f481t = new C0078f(this.f483v, this.f482u, this.f461a);
                setTouchDelegate(this.f481t);
                return;
            }
            this.f481t.mo621a(this.f483v, this.f482u);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r3.f449L <= 0) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f444G
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x003c
        L_0x001b:
            int r0 = r3.f449L
            if (r0 <= 0) goto L_0x003c
            goto L_0x0030
        L_0x0020:
            int r4 = r3.f449L
            if (r4 <= 0) goto L_0x0027
            int r4 = r3.f449L
            goto L_0x003c
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x003c
        L_0x002c:
            int r0 = r3.f449L
            if (r0 <= 0) goto L_0x0037
        L_0x0030:
            int r0 = r3.f449L
        L_0x0032:
            int r4 = java.lang.Math.min(r0, r4)
            goto L_0x003c
        L_0x0037:
            int r0 = r3.getPreferredWidth()
            goto L_0x0032
        L_0x003c:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004e
            if (r0 == 0) goto L_0x0049
            goto L_0x0056
        L_0x0049:
            int r5 = r3.getPreferredHeight()
            goto L_0x0056
        L_0x004e:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0056:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0076e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0076e eVar = (C0076e) parcelable;
        super.onRestoreInstanceState(eVar.f1909d);
        m218a(eVar.f506a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0076e eVar = new C0076e(super.onSaveInstanceState());
        eVar.f506a = this.f444G;
        return eVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m225m();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f448K || !isFocusable()) {
            return false;
        }
        if (this.f444G) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f461a.requestFocus(i, rect);
        if (requestFocus) {
            m218a(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f477o = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo552f();
        } else {
            mo553g();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f474l != z) {
            this.f474l = z;
            m218a(z);
            m226n();
        }
    }

    public void setImeOptions(int i) {
        this.f461a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f461a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f449L = i;
        requestLayout();
    }

    public void setOnCloseListener(C0073b bVar) {
        this.f442E = bVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f472j = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0074c cVar) {
        this.f441D = cVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f443F = onClickListener;
    }

    public void setOnSuggestionListener(C0075d dVar) {
        this.f473k = dVar;
    }

    public void setQuery(CharSequence charSequence) {
        this.f461a.setText(charSequence);
        this.f461a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f446I = charSequence;
        m226n();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f447J = z;
        if (this.f475m instanceof C0209cm) {
            ((C0209cm) this.f475m).f1047a = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f476n = searchableInfo;
        Intent intent = null;
        if (this.f476n != null) {
            this.f461a.setThreshold(this.f476n.getSuggestThreshold());
            this.f461a.setImeOptions(this.f476n.getImeOptions());
            int inputType = this.f476n.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f476n.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f461a.setInputType(inputType);
            if (this.f475m != null) {
                this.f475m.mo1297a((Cursor) null);
            }
            if (this.f476n.getSuggestAuthority() != null) {
                this.f475m = new C0209cm(getContext(), this, this.f476n, this.f457T);
                this.f461a.setAdapter(this.f475m);
                ((C0209cm) this.f475m).f1047a = this.f447J ? 2 : 1;
            }
            m226n();
        }
        boolean z = false;
        if (this.f476n != null && this.f476n.getVoiceSearchEnabled()) {
            if (this.f476n.getVoiceSearchLaunchWebSearch()) {
                intent = this.f470h;
            } else if (this.f476n.getVoiceSearchLaunchRecognizer()) {
                intent = this.f471i;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null)) {
                z = true;
            }
        }
        this.f450M = z;
        if (this.f450M) {
            this.f461a.setPrivateImeOptions("nm");
        }
        m218a(this.f444G);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f445H = z;
        m218a(this.f444G);
    }

    public void setSuggestionsAdapter(C0444hj hjVar) {
        this.f475m = hjVar;
        this.f461a.setAdapter(this.f475m);
    }
}
