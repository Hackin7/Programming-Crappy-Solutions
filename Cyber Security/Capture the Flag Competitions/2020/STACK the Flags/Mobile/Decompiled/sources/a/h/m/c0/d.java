package a.h.m.c0;

import a.h.m.c0.g;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d {

    /* renamed from: d  reason: collision with root package name */
    public static int f931d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f932a;

    /* renamed from: b  reason: collision with root package name */
    public int f933b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f934c = -1;

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final a f935d = new a(4096, null);

        /* renamed from: e  reason: collision with root package name */
        public static final a f936e = new a(8192, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f937f = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f938g = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Object f939a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<? extends g.a> f940b;

        /* renamed from: c  reason: collision with root package name */
        public final g f941c;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5 = null;
            new a(1, null);
            new a(2, null);
            new a(4, null);
            new a(8, null);
            new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, g.b.class);
            new a(512, null, g.b.class);
            new a(1024, null, g.c.class);
            new a(2048, null, g.c.class);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, g.C0025g.class);
            new a(262144, null);
            new a(524288, null);
            new a(1048576, null);
            new a(2097152, null, g.h.class);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, 16908342, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                accessibilityAction2 = null;
            }
            new a(accessibilityAction2, 16908343, null, null, g.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                accessibilityAction3 = null;
            }
            new a(accessibilityAction3, 16908348, null, null, null);
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction4 = null;
            }
            new a(accessibilityAction4, 16908349, null, null, g.f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, g.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction5, 16908357, null, null, null);
        }

        public a(int actionId, CharSequence label) {
            this(null, actionId, label, null, null);
        }

        public a(Object action) {
            this(action, 0, null, null, null);
        }

        public a(int actionId, CharSequence label, Class<? extends g.a> cls) {
            this(null, actionId, label, null, cls);
        }

        public a(Object action, int id, CharSequence label, g command, Class<? extends g.a> cls) {
            this.f941c = command;
            if (action == null) {
                this.f939a = new AccessibilityNodeInfo.AccessibilityAction(id, label);
            } else {
                this.f939a = action;
            }
            this.f940b = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f939a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f939a).getLabel();
        }

        public boolean c(View view, Bundle arguments) {
            if (this.f941c == null) {
                return false;
            }
            g.a viewCommandArgument = null;
            Class<? extends g.a> cls = this.f940b;
            if (cls != null) {
                try {
                    viewCommandArgument = (g.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    viewCommandArgument.a(arguments);
                } catch (Exception e2) {
                    Class<? extends g.a> cls2 = this.f940b;
                    String className = cls2 == null ? "null" : cls2.getName();
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + className, e2);
                }
            }
            return this.f941c.a(view, viewCommandArgument);
        }

        public int hashCode() {
            Object obj = this.f939a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a other = (a) obj;
            Object obj2 = this.f939a;
            if (obj2 == null) {
                if (other.f939a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(other.f939a)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f942a;

        public static b a(int rowCount, int columnCount, boolean hierarchical, int selectionMode) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, columnCount, hierarchical, selectionMode));
        }

        public b(Object info) {
            this.f942a = info;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f943a;

        public static c a(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading, boolean selected) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(rowIndex, rowSpan, columnIndex, columnSpan, heading, selected));
        }

        public c(Object info) {
            this.f943a = info;
        }
    }

    public d(AccessibilityNodeInfo info) {
        this.f932a = info;
    }

    public static d T(AccessibilityNodeInfo info) {
        return new d(info);
    }

    public AccessibilityNodeInfo S() {
        return this.f932a;
    }

    public void a(int action) {
        this.f932a.addAction(action);
    }

    public final List<Integer> f(String key) {
        ArrayList<Integer> list = this.f932a.getExtras().getIntegerArrayList(key);
        if (list != null) {
            return list;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        this.f932a.getExtras().putIntegerArrayList(key, list2);
        return list2;
    }

    public void b(a action) {
        this.f932a.addAction((AccessibilityNodeInfo.AccessibilityAction) action.f939a);
    }

    public boolean F(int action, Bundle arguments) {
        return this.f932a.performAction(action, arguments);
    }

    @Deprecated
    public void i(Rect outBounds) {
        this.f932a.getBoundsInParent(outBounds);
    }

    public void j(Rect outBounds) {
        this.f932a.getBoundsInScreen(outBounds);
    }

    public boolean v() {
        return this.f932a.isCheckable();
    }

    public void I(boolean checkable) {
        this.f932a.setCheckable(checkable);
    }

    public boolean w() {
        return this.f932a.isChecked();
    }

    public void J(boolean checked) {
        this.f932a.setChecked(checked);
    }

    public boolean z() {
        return this.f932a.isFocusable();
    }

    public boolean A() {
        return this.f932a.isFocused();
    }

    public boolean E() {
        return this.f932a.isSelected();
    }

    public boolean x() {
        return this.f932a.isClickable();
    }

    public boolean B() {
        return this.f932a.isLongClickable();
    }

    public boolean y() {
        return this.f932a.isEnabled();
    }

    public boolean C() {
        return this.f932a.isPassword();
    }

    public boolean D() {
        return this.f932a.isScrollable();
    }

    public void R(boolean scrollable) {
        this.f932a.setScrollable(scrollable);
    }

    public CharSequence p() {
        return this.f932a.getPackageName();
    }

    public CharSequence k() {
        return this.f932a.getClassName();
    }

    public void K(CharSequence className) {
        this.f932a.setClassName(className);
    }

    public CharSequence r() {
        if (!t()) {
            return this.f932a.getText();
        }
        List<Integer> starts = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> ends = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> flags = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> ids = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        Spannable spannable = new SpannableString(TextUtils.substring(this.f932a.getText(), 0, this.f932a.getText().length()));
        for (int i = 0; i < starts.size(); i++) {
            spannable.setSpan(new a(ids.get(i).intValue(), this, n().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), starts.get(i).intValue(), ends.get(i).intValue(), flags.get(i).intValue());
        }
        return spannable;
    }

    public void d(CharSequence text, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            e();
            G(view);
            ClickableSpan[] spans = l(text);
            if (spans != null && spans.length > 0) {
                n().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.h.b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> tagSpans = o(view);
                for (int i = 0; i < spans.length; i++) {
                    int id = u(spans[i], tagSpans);
                    tagSpans.put(id, new WeakReference<>(spans[i]));
                    c(spans[i], (Spanned) text, id);
                }
            }
        }
    }

    public final SparseArray<WeakReference<ClickableSpan>> o(View host) {
        SparseArray<WeakReference<ClickableSpan>> spans = q(host);
        if (spans != null) {
            return spans;
        }
        SparseArray<WeakReference<ClickableSpan>> spans2 = new SparseArray<>();
        host.setTag(a.h.b.tag_accessibility_clickable_spans, spans2);
        return spans2;
    }

    public final SparseArray<WeakReference<ClickableSpan>> q(View host) {
        return (SparseArray) host.getTag(a.h.b.tag_accessibility_clickable_spans);
    }

    public static ClickableSpan[] l(CharSequence text) {
        if (text instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
        }
        return null;
    }

    public final int u(ClickableSpan span, SparseArray<WeakReference<ClickableSpan>> spans) {
        if (spans != null) {
            for (int i = 0; i < spans.size(); i++) {
                if (span.equals(spans.valueAt(i).get())) {
                    return spans.keyAt(i);
                }
            }
        }
        int i2 = f931d;
        f931d = i2 + 1;
        return i2;
    }

    public final boolean t() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public final void e() {
        this.f932a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f932a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f932a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f932a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public final void c(ClickableSpan span, Spanned spanned, int id) {
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(span)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(span)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(span)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(id));
    }

    public final void G(View view) {
        SparseArray<WeakReference<ClickableSpan>> spans = q(view);
        if (spans != null) {
            List<Integer> toBeRemovedIndices = new ArrayList<>();
            for (int i = 0; i < spans.size(); i++) {
                if (spans.valueAt(i).get() == null) {
                    toBeRemovedIndices.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < toBeRemovedIndices.size(); i2++) {
                spans.remove(toBeRemovedIndices.get(i2).intValue());
            }
        }
    }

    public CharSequence m() {
        return this.f932a.getContentDescription();
    }

    public String s() {
        return this.f932a.getViewIdResourceName();
    }

    public void L(Object collectionInfo) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f932a;
        if (collectionInfo == null) {
            collectionInfo2 = null;
        } else {
            collectionInfo2 = (AccessibilityNodeInfo.CollectionInfo) ((b) collectionInfo).f942a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo2);
    }

    public void M(Object collectionItemInfo) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f932a;
        if (collectionItemInfo == null) {
            collectionItemInfo2 = null;
        } else {
            collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) ((c) collectionItemInfo).f943a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo2);
    }

    public List<a> g() {
        List<Object> actions = this.f932a.getActionList();
        if (actions == null) {
            return Collections.emptyList();
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> result = new ArrayList<>();
        int actionCount = actions.size();
        for (int i = 0; i < actionCount; i++) {
            result.add(new a(actions.get(i)));
        }
        return result;
    }

    public Bundle n() {
        return this.f932a.getExtras();
    }

    public void N(boolean dismissable) {
        this.f932a.setDismissable(dismissable);
    }

    public void P(CharSequence paneTitle) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f932a.setPaneTitle(paneTitle);
        } else {
            this.f932a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paneTitle);
        }
    }

    public void Q(boolean screenReaderFocusable) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f932a.setScreenReaderFocusable(screenReaderFocusable);
        } else {
            H(1, screenReaderFocusable);
        }
    }

    public void O(boolean isHeading) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f932a.setHeading(isHeading);
        } else {
            H(2, isHeading);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f932a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d other = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f932a;
        if (accessibilityNodeInfo == null) {
            if (other.f932a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(other.f932a)) {
            return false;
        }
        if (this.f934c == other.f934c && this.f933b == other.f933b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        Rect bounds = new Rect();
        i(bounds);
        builder.append("; boundsInParent: " + bounds);
        j(bounds);
        builder.append("; boundsInScreen: " + bounds);
        builder.append("; packageName: ");
        builder.append(p());
        builder.append("; className: ");
        builder.append(k());
        builder.append("; text: ");
        builder.append(r());
        builder.append("; contentDescription: ");
        builder.append(m());
        builder.append("; viewId: ");
        builder.append(s());
        builder.append("; checkable: ");
        builder.append(v());
        builder.append("; checked: ");
        builder.append(w());
        builder.append("; focusable: ");
        builder.append(z());
        builder.append("; focused: ");
        builder.append(A());
        builder.append("; selected: ");
        builder.append(E());
        builder.append("; clickable: ");
        builder.append(x());
        builder.append("; longClickable: ");
        builder.append(B());
        builder.append("; enabled: ");
        builder.append(y());
        builder.append("; password: ");
        builder.append(C());
        builder.append("; scrollable: " + D());
        builder.append("; [");
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = g();
        for (int i = 0; i < actions.size(); i++) {
            a action = (a) actions.get(i);
            String actionName = h(action.a());
            if (actionName.equals("ACTION_UNKNOWN") && action.b() != null) {
                actionName = action.b().toString();
            }
            builder.append(actionName);
            if (i != actions.size() - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public final void H(int property, boolean value) {
        Bundle extras = n();
        if (extras != null) {
            int i = 0;
            int booleanProperties = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~property);
            if (value) {
                i = property;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | booleanProperties);
        }
    }

    public static String h(int action) {
        if (action == 1) {
            return "ACTION_FOCUS";
        }
        if (action == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (action) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (action) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (action) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }
}
