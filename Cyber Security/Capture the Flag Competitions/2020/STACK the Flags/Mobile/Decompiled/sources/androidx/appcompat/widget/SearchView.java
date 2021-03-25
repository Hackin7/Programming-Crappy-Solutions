package androidx.appcompat.widget;

import a.b.p.d1;
import a.b.p.i0;
import a.b.p.q0;
import a.b.p.w0;
import a.b.p.z0;
import a.h.m.s;
import android.annotation.SuppressLint;
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
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;

public class SearchView extends i0 implements a.b.o.c {
    public static final n r0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public Rect A;
    public Rect B;
    public int[] C;
    public int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public l L;
    public k M;
    public View.OnFocusChangeListener N;
    public m O;
    public View.OnClickListener P;
    public boolean Q;
    public boolean R;
    public a.i.a.a S;
    public boolean T;
    public CharSequence U;
    public boolean V;
    public boolean W;
    public int a0;
    public boolean b0;
    public CharSequence c0;
    public CharSequence d0;
    public boolean e0;
    public int f0;
    public SearchableInfo g0;
    public Bundle h0;
    public final Runnable i0;
    public Runnable j0;
    public final WeakHashMap<String, Drawable.ConstantState> k0;
    public final View.OnClickListener l0;
    public View.OnKeyListener m0;
    public final TextView.OnEditorActionListener n0;
    public final AdapterView.OnItemClickListener o0;
    public final AdapterView.OnItemSelectedListener p0;
    public final SearchAutoComplete q;
    public TextWatcher q0;
    public final View r;
    public final View s;
    public final View t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final View y;
    public p z;

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i);

        boolean b(int i);
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            a.i.a.a aVar = SearchView.this.S;
            if (aVar instanceof q0) {
                aVar.b(null);
            }
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.i0 = new b();
        this.j0 = new c();
        this.k0 = new WeakHashMap<>();
        this.l0 = new f();
        this.m0 = new g();
        this.n0 = new h();
        this.o0 = new i();
        this.p0 = new j();
        this.q0 = new a();
        w0 a2 = w0.u(context, attrs, a.b.j.SearchView, defStyleAttr, 0);
        LayoutInflater.from(context).inflate(a2.m(a.b.j.SearchView_layout, a.b.g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.b.f.search_src_text);
        this.q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.r = findViewById(a.b.f.search_edit_frame);
        this.s = findViewById(a.b.f.search_plate);
        this.t = findViewById(a.b.f.submit_area);
        this.u = (ImageView) findViewById(a.b.f.search_button);
        this.v = (ImageView) findViewById(a.b.f.search_go_btn);
        this.w = (ImageView) findViewById(a.b.f.search_close_btn);
        this.x = (ImageView) findViewById(a.b.f.search_voice_btn);
        this.E = (ImageView) findViewById(a.b.f.search_mag_icon);
        s.a0(this.s, a2.f(a.b.j.SearchView_queryBackground));
        s.a0(this.t, a2.f(a.b.j.SearchView_submitBackground));
        this.u.setImageDrawable(a2.f(a.b.j.SearchView_searchIcon));
        this.v.setImageDrawable(a2.f(a.b.j.SearchView_goIcon));
        this.w.setImageDrawable(a2.f(a.b.j.SearchView_closeIcon));
        this.x.setImageDrawable(a2.f(a.b.j.SearchView_voiceIcon));
        this.E.setImageDrawable(a2.f(a.b.j.SearchView_searchIcon));
        this.F = a2.f(a.b.j.SearchView_searchHintIcon);
        z0.a(this.u, getResources().getString(a.b.h.abc_searchview_description_search));
        this.G = a2.m(a.b.j.SearchView_suggestionRowLayout, a.b.g.abc_search_dropdown_item_icons_2line);
        this.H = a2.m(a.b.j.SearchView_commitIcon, 0);
        this.u.setOnClickListener(this.l0);
        this.w.setOnClickListener(this.l0);
        this.v.setOnClickListener(this.l0);
        this.x.setOnClickListener(this.l0);
        this.q.setOnClickListener(this.l0);
        this.q.addTextChangedListener(this.q0);
        this.q.setOnEditorActionListener(this.n0);
        this.q.setOnItemClickListener(this.o0);
        this.q.setOnItemSelectedListener(this.p0);
        this.q.setOnKeyListener(this.m0);
        this.q.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a2.a(a.b.j.SearchView_iconifiedByDefault, true));
        int maxWidth = a2.e(a.b.j.SearchView_android_maxWidth, -1);
        if (maxWidth != -1) {
            setMaxWidth(maxWidth);
        }
        this.K = a2.o(a.b.j.SearchView_defaultQueryHint);
        this.U = a2.o(a.b.j.SearchView_queryHint);
        int imeOptions = a2.j(a.b.j.SearchView_android_imeOptions, -1);
        if (imeOptions != -1) {
            setImeOptions(imeOptions);
        }
        int inputType = a2.j(a.b.j.SearchView_android_inputType, -1);
        if (inputType != -1) {
            setInputType(inputType);
        }
        setFocusable(a2.a(a.b.j.SearchView_android_focusable, true));
        a2.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        View findViewById = findViewById(this.q.getDropDownAnchor());
        this.y = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        k0(this.Q);
        g0();
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View v, boolean hasFocus) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, hasFocus);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            SearchView.this.B();
        }
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public void setSearchableInfo(SearchableInfo searchable) {
        this.g0 = searchable;
        if (searchable != null) {
            h0();
            g0();
        }
        boolean K2 = K();
        this.b0 = K2;
        if (K2) {
            this.q.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setAppSearchData(Bundle appSearchData) {
        this.h0 = appSearchData;
    }

    public void setImeOptions(int imeOptions) {
        this.q.setImeOptions(imeOptions);
    }

    public int getImeOptions() {
        return this.q.getImeOptions();
    }

    public void setInputType(int inputType) {
        this.q.setInputType(inputType);
    }

    public int getInputType() {
        return this.q.getInputType();
    }

    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        boolean result = this.q.requestFocus(direction, previouslyFocusedRect);
        if (result) {
            k0(false);
        }
        return result;
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.q.clearFocus();
        this.q.setImeVisibility(false);
        this.W = false;
    }

    public void setOnQueryTextListener(l listener) {
        this.L = listener;
    }

    public void setOnCloseListener(k listener) {
        this.M = listener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) {
        this.N = listener;
    }

    public void setOnSuggestionListener(m listener) {
        this.O = listener;
    }

    public void setOnSearchClickListener(View.OnClickListener listener) {
        this.P = listener;
    }

    public CharSequence getQuery() {
        return this.q.getText();
    }

    public void d0(CharSequence query, boolean submit) {
        this.q.setText(query);
        if (query != null) {
            SearchAutoComplete searchAutoComplete = this.q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.d0 = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            W();
        }
    }

    public void setQueryHint(CharSequence hint) {
        this.U = hint;
        g0();
    }

    public CharSequence getQueryHint() {
        if (this.U != null) {
            return this.U;
        }
        SearchableInfo searchableInfo = this.g0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.K;
        }
        return getContext().getText(this.g0.getHintId());
    }

    public void setIconifiedByDefault(boolean iconified) {
        if (this.Q != iconified) {
            this.Q = iconified;
            k0(iconified);
            g0();
        }
    }

    public void setIconified(boolean iconify) {
        if (iconify) {
            R();
        } else {
            V();
        }
    }

    public boolean L() {
        return this.R;
    }

    public void setSubmitButtonEnabled(boolean enabled) {
        this.T = enabled;
        k0(L());
    }

    public void setQueryRefinementEnabled(boolean enable) {
        this.V = enable;
        a.i.a.a aVar = this.S;
        if (aVar instanceof q0) {
            ((q0) aVar).x(enable ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(a.i.a.a adapter) {
        this.S = adapter;
        this.q.setAdapter(adapter);
    }

    public a.i.a.a getSuggestionsAdapter() {
        return this.S;
    }

    public void setMaxWidth(int maxpixels) {
        this.a0 = maxpixels;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.a0;
    }

    @Override // a.b.p.i0
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        if (L()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        if (widthMode == Integer.MIN_VALUE) {
            int i3 = this.a0;
            width = i3 > 0 ? Math.min(i3, width) : Math.min(getPreferredWidth(), width);
        } else if (widthMode == 0) {
            int i4 = this.a0;
            if (i4 <= 0) {
                i4 = getPreferredWidth();
            }
            width = i4;
        } else if (widthMode == 1073741824 && (i2 = this.a0) > 0) {
            width = Math.min(i2, width);
        }
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        if (heightMode == Integer.MIN_VALUE) {
            height = Math.min(getPreferredHeight(), height);
        } else if (heightMode == 0) {
            height = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
    }

    @Override // a.b.p.i0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            I(this.q, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, bottom - top);
            p pVar = this.z;
            if (pVar == null) {
                p pVar2 = new p(this.B, this.A, this.q);
                this.z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.B, this.A);
        }
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i2 = iArr[1];
        int[] iArr2 = this.D;
        int top = i2 - iArr2[1];
        int left = iArr[0] - iArr2[0];
        rect.set(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.b.d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.b.d.abc_search_view_preferred_height);
    }

    public final void k0(boolean collapsed) {
        int iconVisibility;
        this.R = collapsed;
        int i2 = 8;
        boolean z2 = false;
        int visCollapsed = collapsed ? 0 : 8;
        boolean hasText = !TextUtils.isEmpty(this.q.getText());
        this.u.setVisibility(visCollapsed);
        j0(hasText);
        View view = this.r;
        if (!collapsed) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.E.getDrawable() == null || this.Q) {
            iconVisibility = 8;
        } else {
            iconVisibility = 0;
        }
        this.E.setVisibility(iconVisibility);
        e0();
        if (!hasText) {
            z2 = true;
        }
        l0(z2);
        i0();
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.g0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent testIntent = null;
            if (this.g0.getVoiceSearchLaunchWebSearch()) {
                testIntent = this.I;
            } else if (this.g0.getVoiceSearchLaunchRecognizer()) {
                testIntent = this.J;
            }
            if (testIntent == null || getContext().getPackageManager().resolveActivity(testIntent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean N() {
        return (this.T || this.b0) && !L();
    }

    public final void j0(boolean hasText) {
        int visibility = 8;
        if (this.T && N() && hasFocus() && (hasText || !this.b0)) {
            visibility = 0;
        }
        this.v.setVisibility(visibility);
    }

    public final void i0() {
        int visibility = 8;
        if (N() && (this.v.getVisibility() == 0 || this.x.getVisibility() == 0)) {
            visibility = 0;
        }
        this.t.setVisibility(visibility);
    }

    public final void e0() {
        boolean showClose = true;
        boolean hasText = !TextUtils.isEmpty(this.q.getText());
        int i2 = 0;
        if (!hasText && (!this.Q || this.e0)) {
            showClose = false;
        }
        ImageView imageView = this.w;
        if (!showClose) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable closeButtonImg = this.w.getDrawable();
        if (closeButtonImg != null) {
            closeButtonImg.setState(hasText ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void b0() {
        post(this.i0);
    }

    public void f0() {
        int[] stateSet = this.q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable searchPlateBg = this.s.getBackground();
        if (searchPlateBg != null) {
            searchPlateBg.setState(stateSet);
        }
        Drawable submitAreaBg = this.t.getBackground();
        if (submitAreaBg != null) {
            submitAreaBg.setState(stateSet);
        }
        invalidate();
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.i0);
        post(this.j0);
        super.onDetachedFromWindow();
    }

    public void U(CharSequence queryText) {
        setQuery(queryText);
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View v) {
            SearchView searchView = SearchView.this;
            if (v == searchView.u) {
                searchView.V();
            } else if (v == searchView.w) {
                searchView.R();
            } else if (v == searchView.v) {
                searchView.W();
            } else if (v == searchView.x) {
                searchView.a0();
            } else if (v == searchView.q) {
                searchView.H();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View v, int keyCode, KeyEvent event) {
            SearchView searchView = SearchView.this;
            if (searchView.g0 == null) {
                return false;
            }
            if (searchView.q.isPopupShowing() && SearchView.this.q.getListSelection() != -1) {
                return SearchView.this.X(keyCode, event);
            }
            if (SearchView.this.q.b() || !event.hasNoModifiers() || event.getAction() != 1 || keyCode != 66) {
                return false;
            }
            v.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.q.getText().toString());
            return true;
        }
    }

    public boolean X(int keyCode, KeyEvent event) {
        int selPoint;
        if (this.g0 != null && this.S != null && event.getAction() == 0 && event.hasNoModifiers()) {
            if (keyCode == 66 || keyCode == 84 || keyCode == 61) {
                return S(this.q.getListSelection());
            }
            if (keyCode == 21 || keyCode == 22) {
                if (keyCode == 21) {
                    selPoint = 0;
                } else {
                    selPoint = this.q.length();
                }
                this.q.setSelection(selPoint);
                this.q.setListSelection(0);
                this.q.clearListSelection();
                this.q.a();
                return true;
            } else if (keyCode != 19 || this.q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    public final CharSequence J(CharSequence hintText) {
        if (!this.Q || this.F == null) {
            return hintText;
        }
        int textSize = (int) (((double) this.q.getTextSize()) * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        ssb.setSpan(new ImageSpan(this.F), 1, 2, 33);
        ssb.append(hintText);
        return ssb;
    }

    public final void g0() {
        CharSequence hint = getQueryHint();
        this.q.setHint(J(hint == null ? BuildConfig.FLAVOR : hint));
    }

    public final void h0() {
        this.q.setThreshold(this.g0.getSuggestThreshold());
        this.q.setImeOptions(this.g0.getImeOptions());
        int inputType = this.g0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.q.setInputType(inputType);
        a.i.a.a aVar = this.S;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.g0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.g0, this.k0);
            this.S = q0Var;
            this.q.setAdapter(q0Var);
            q0 q0Var2 = (q0) this.S;
            if (this.V) {
                i2 = 2;
            }
            q0Var2.x(i2);
        }
    }

    public final void l0(boolean empty) {
        int visibility = 8;
        if (this.b0 && !L() && empty) {
            visibility = 0;
            this.v.setVisibility(8);
        }
        this.x.setVisibility(visibility);
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            SearchView.this.W();
            return true;
        }
    }

    public void Y(CharSequence newText) {
        CharSequence text = this.q.getText();
        this.d0 = text;
        boolean z2 = true;
        boolean hasText = !TextUtils.isEmpty(text);
        j0(hasText);
        if (hasText) {
            z2 = false;
        }
        l0(z2);
        e0();
        i0();
        if (this.L != null && !TextUtils.equals(newText, this.c0)) {
            this.L.a(newText.toString());
        }
        this.c0 = newText.toString();
    }

    public void W() {
        CharSequence query = this.q.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            l lVar = this.L;
            if (lVar == null || !lVar.b(query.toString())) {
                if (this.g0 != null) {
                    P(0, null, query.toString());
                }
                this.q.setImeVisibility(false);
                G();
            }
        }
    }

    public final void G() {
        this.q.dismissDropDown();
    }

    public void R() {
        if (!TextUtils.isEmpty(this.q.getText())) {
            this.q.setText(BuildConfig.FLAVOR);
            this.q.requestFocus();
            this.q.setImeVisibility(true);
        } else if (this.Q) {
            k kVar = this.M;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    public void V() {
        k0(false);
        this.q.requestFocus();
        this.q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void a0() {
        if (this.g0 != null) {
            SearchableInfo searchable = this.g0;
            try {
                if (searchable.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.I, searchable));
                } else if (searchable.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.J, searchable));
                }
            } catch (ActivityNotFoundException e2) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void Z() {
        k0(L());
        b0();
        if (this.q.hasFocus()) {
            H();
        }
    }

    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        b0();
    }

    @Override // a.b.o.c
    public void f() {
        d0(BuildConfig.FLAVOR, false);
        clearFocus();
        k0(true);
        this.q.setImeOptions(this.f0);
        this.e0 = false;
    }

    @Override // a.b.o.c
    public void c() {
        if (!this.e0) {
            this.e0 = true;
            int imeOptions = this.q.getImeOptions();
            this.f0 = imeOptions;
            this.q.setImeOptions(imeOptions | 33554432);
            this.q.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    public static class o extends a.j.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public boolean f1588d;

        public o(Parcelable superState) {
            super(superState);
        }

        public o(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f1588d = ((Boolean) source.readValue(null)).booleanValue();
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeValue(Boolean.valueOf(this.f1588d));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1588d + "}";
        }

        public class a implements Parcelable.ClassLoaderCreator<o> {
            /* renamed from: b */
            public o createFromParcel(Parcel in, ClassLoader loader) {
                return new o(in, loader);
            }

            /* renamed from: a */
            public o createFromParcel(Parcel in) {
                return new o(in, null);
            }

            /* renamed from: c */
            public o[] newArray(int size) {
                return new o[size];
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        o ss = new o(super.onSaveInstanceState());
        ss.f1588d = L();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof o)) {
            super.onRestoreInstanceState(state);
            return;
        }
        o ss = (o) state;
        super.onRestoreInstanceState(ss.a());
        k0(ss.f1588d);
        requestLayout();
    }

    public void B() {
        int iconOffset;
        int offset;
        if (this.y.getWidth() > 1) {
            Resources res = getContext().getResources();
            int anchorPadding = this.s.getPaddingLeft();
            Rect dropDownPadding = new Rect();
            boolean isLayoutRtl = d1.b(this);
            if (this.Q) {
                iconOffset = res.getDimensionPixelSize(a.b.d.abc_dropdownitem_icon_width) + res.getDimensionPixelSize(a.b.d.abc_dropdownitem_text_padding_left);
            } else {
                iconOffset = 0;
            }
            this.q.getDropDownBackground().getPadding(dropDownPadding);
            if (isLayoutRtl) {
                offset = -dropDownPadding.left;
            } else {
                offset = anchorPadding - (dropDownPadding.left + iconOffset);
            }
            this.q.setDropDownHorizontalOffset(offset);
            this.q.setDropDownWidth((((this.y.getWidth() + dropDownPadding.left) + dropDownPadding.right) + iconOffset) - anchorPadding);
        }
    }

    public boolean S(int position) {
        m mVar = this.O;
        if (mVar != null && mVar.b(position)) {
            return false;
        }
        Q(position, 0, null);
        this.q.setImeVisibility(false);
        G();
        return true;
    }

    public boolean T(int position) {
        m mVar = this.O;
        if (mVar != null && mVar.a(position)) {
            return false;
        }
        c0(position);
        return true;
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.S(position);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.T(position);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public final void c0(int position) {
        CharSequence oldQuery = this.q.getText();
        Cursor c2 = this.S.d();
        if (c2 != null) {
            if (c2.moveToPosition(position)) {
                CharSequence newQuery = this.S.c(c2);
                if (newQuery != null) {
                    setQuery(newQuery);
                } else {
                    setQuery(oldQuery);
                }
            } else {
                setQuery(oldQuery);
            }
        }
    }

    public final boolean Q(int position, int actionKey, String actionMsg) {
        Cursor c2 = this.S.d();
        if (c2 == null || !c2.moveToPosition(position)) {
            return false;
        }
        O(D(c2, actionKey, actionMsg));
        return true;
    }

    public final void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException ex) {
                Log.e("SearchView", "Failed launch activity: " + intent, ex);
            }
        }
    }

    private void setQuery(CharSequence query) {
        this.q.setText(query);
        this.q.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }

    public void P(int actionKey, String actionMsg, String query) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, query, actionKey, actionMsg));
    }

    public final Intent C(String action, Uri data, String extraData, String query, int actionKey, String actionMsg) {
        Intent intent = new Intent(action);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.d0);
        if (query != null) {
            intent.putExtra("query", query);
        }
        if (extraData != null) {
            intent.putExtra("intent_extra_data_key", extraData);
        }
        Bundle bundle = this.h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (actionKey != 0) {
            intent.putExtra("action_key", actionKey);
            intent.putExtra("action_msg", actionMsg);
        }
        intent.setComponent(this.g0.getSearchActivity());
        return intent;
    }

    public final Intent F(Intent baseIntent, SearchableInfo searchable) {
        String str;
        Intent voiceIntent = new Intent(baseIntent);
        ComponentName searchActivity = searchable.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        return voiceIntent;
    }

    public final Intent E(Intent baseIntent, SearchableInfo searchable) {
        String str;
        ComponentName searchActivity = searchable.getSearchActivity();
        Intent queryIntent = new Intent("android.intent.action.SEARCH");
        queryIntent.setComponent(searchActivity);
        PendingIntent pending = PendingIntent.getActivity(getContext(), 0, queryIntent, 1073741824);
        Bundle queryExtras = new Bundle();
        Bundle bundle = this.h0;
        if (bundle != null) {
            queryExtras.putParcelable("app_data", bundle);
        }
        Intent voiceIntent = new Intent(baseIntent);
        String languageModel = "free_form";
        String prompt = null;
        String language = null;
        int maxResults = 1;
        Resources resources = getResources();
        if (searchable.getVoiceLanguageModeId() != 0) {
            languageModel = resources.getString(searchable.getVoiceLanguageModeId());
        }
        if (searchable.getVoicePromptTextId() != 0) {
            prompt = resources.getString(searchable.getVoicePromptTextId());
        }
        if (searchable.getVoiceLanguageId() != 0) {
            language = resources.getString(searchable.getVoiceLanguageId());
        }
        if (searchable.getVoiceMaxResults() != 0) {
            maxResults = searchable.getVoiceMaxResults();
        }
        voiceIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", languageModel);
        voiceIntent.putExtra("android.speech.extra.PROMPT", prompt);
        voiceIntent.putExtra("android.speech.extra.LANGUAGE", language);
        voiceIntent.putExtra("android.speech.extra.MAX_RESULTS", maxResults);
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pending);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", queryExtras);
        return voiceIntent;
    }

    public final Intent D(Cursor c2, int actionKey, String actionMsg) {
        int rowNum;
        String data;
        String id;
        try {
            String action = q0.n(c2, "suggest_intent_action");
            if (action == null) {
                action = this.g0.getSuggestIntentAction();
            }
            if (action == null) {
                action = "android.intent.action.SEARCH";
            }
            String data2 = q0.n(c2, "suggest_intent_data");
            if (data2 == null) {
                data2 = this.g0.getSuggestIntentData();
            }
            if (data2 == null || (id = q0.n(c2, "suggest_intent_data_id")) == null) {
                data = data2;
            } else {
                data = data2 + "/" + Uri.encode(id);
            }
            return C(action, data == null ? null : Uri.parse(data), q0.n(c2, "suggest_intent_extra_data"), q0.n(c2, "suggest_intent_query"), actionKey, actionMsg);
        } catch (RuntimeException e2) {
            try {
                rowNum = c2.getPosition();
            } catch (RuntimeException e3) {
                rowNum = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + rowNum + " returned exception.", e2);
            return null;
        }
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.q.refreshAutoCompleteResults();
            return;
        }
        r0.b(this.q);
        r0.a(this.q);
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void beforeTextChanged(CharSequence s, int start, int before, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int after) {
            SearchView.this.Y(s);
        }

        public void afterTextChanged(Editable s) {
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f1589a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1590b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f1591c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1592d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f1593e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1594f;

        public p(Rect targetBounds, Rect actualBounds, View delegateView) {
            super(targetBounds, delegateView);
            this.f1593e = ViewConfiguration.get(delegateView.getContext()).getScaledTouchSlop();
            a(targetBounds, actualBounds);
            this.f1589a = delegateView;
        }

        public void a(Rect desiredBounds, Rect actualBounds) {
            this.f1590b.set(desiredBounds);
            this.f1592d.set(desiredBounds);
            Rect rect = this.f1592d;
            int i = this.f1593e;
            rect.inset(-i, -i);
            this.f1591c.set(actualBounds);
        }

        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            boolean sendToDelegate = false;
            boolean hit = true;
            int action = event.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    sendToDelegate = this.f1594f;
                    if (sendToDelegate && !this.f1592d.contains(x, y)) {
                        hit = false;
                    }
                } else if (action == 3) {
                    sendToDelegate = this.f1594f;
                    this.f1594f = false;
                }
            } else if (this.f1590b.contains(x, y)) {
                this.f1594f = true;
                sendToDelegate = true;
            }
            if (!sendToDelegate) {
                return false;
            }
            if (!hit || this.f1591c.contains(x, y)) {
                Rect rect = this.f1591c;
                event.setLocation((float) (x - rect.left), (float) (y - rect.top));
            } else {
                event.setLocation((float) (this.f1589a.getWidth() / 2), (float) (this.f1589a.getHeight() / 2));
            }
            return this.f1589a.dispatchTouchEvent(event);
        }
    }

    public static class SearchAutoComplete extends a.b.p.d {

        /* renamed from: e  reason: collision with root package name */
        public int f1571e;

        /* renamed from: f  reason: collision with root package name */
        public SearchView f1572f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1573g;
        public final Runnable h;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attrs) {
            this(context, attrs, a.b.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.h = new a();
            this.f1571e = getThreshold();
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void setSearchView(SearchView searchView) {
            this.f1572f = searchView;
        }

        public void setThreshold(int threshold) {
            super.setThreshold(threshold);
            this.f1571e = threshold;
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void replaceText(CharSequence text) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus && this.f1572f.hasFocus() && getVisibility() == 0) {
                this.f1573g = true;
                if (SearchView.M(getContext())) {
                    a();
                }
            }
        }

        public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            this.f1572f.Z();
        }

        public boolean enoughToFilter() {
            return this.f1571e <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int keyCode, KeyEvent event) {
            if (keyCode == 4) {
                if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState state = getKeyDispatcherState();
                    if (state != null) {
                        state.startTracking(event, this);
                    }
                    return true;
                } else if (event.getAction() == 1) {
                    KeyEvent.DispatcherState state2 = getKeyDispatcherState();
                    if (state2 != null) {
                        state2.handleUpEvent(event);
                    }
                    if (event.isTracking() && !event.isCanceled()) {
                        this.f1572f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(keyCode, event);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration config = getResources().getConfiguration();
            int widthDp = config.screenWidthDp;
            int heightDp = config.screenHeightDp;
            if (widthDp >= 960 && heightDp >= 720 && config.orientation == 2) {
                return 256;
            }
            if (widthDp >= 600) {
                return 192;
            }
            if (widthDp < 640 || heightDp < 480) {
                return 160;
            }
            return 192;
        }

        @Override // a.b.p.d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection ic = super.onCreateInputConnection(editorInfo);
            if (this.f1573g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return ic;
        }

        public void c() {
            if (this.f1573g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1573g = false;
            }
        }

        public void setImeVisibility(boolean visible) {
            InputMethodManager imm = (InputMethodManager) getContext().getSystemService("input_method");
            if (!visible) {
                this.f1573g = false;
                removeCallbacks(this.h);
                imm.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (imm.isActive(this)) {
                this.f1573g = false;
                removeCallbacks(this.h);
                imm.showSoftInput(this, 0);
            } else {
                this.f1573g = true;
            }
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.r0.c(this);
        }
    }

    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f1585a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f1586b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f1587c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1585a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1586b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1587c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }

        public void b(AutoCompleteTextView view) {
            d();
            Method method = this.f1585a;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e2) {
                }
            }
        }

        public void a(AutoCompleteTextView view) {
            d();
            Method method = this.f1586b;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e2) {
                }
            }
        }

        public void c(AutoCompleteTextView view) {
            d();
            Method method = this.f1587c;
            if (method != null) {
                try {
                    method.invoke(view, true);
                } catch (Exception e2) {
                }
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }
}
