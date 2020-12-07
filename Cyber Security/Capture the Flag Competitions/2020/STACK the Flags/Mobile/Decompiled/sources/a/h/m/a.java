package a.h.m;

import a.h.b;
import a.h.m.c0.d;
import a.h.m.c0.e;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f907c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f908a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f909b;

    /* renamed from: a.h.m.a$a  reason: collision with other inner class name */
    public static final class C0023a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f910a;

        public C0023a(a compat) {
            this.f910a = compat;
        }

        public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            return this.f910a.a(host, event);
        }

        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f910a.f(host, event);
        }

        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
            d nodeInfoCompat = d.T(info);
            nodeInfoCompat.Q(s.N(host));
            nodeInfoCompat.O(s.I(host));
            nodeInfoCompat.P(s.l(host));
            this.f910a.g(host, nodeInfoCompat);
            nodeInfoCompat.d(info.getText(), host);
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = a.c(host);
            for (int i = 0; i < actions.size(); i++) {
                nodeInfoCompat.b((d.a) actions.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f910a.h(host, event);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            return this.f910a.i(host, child, event);
        }

        public void sendAccessibilityEvent(View host, int eventType) {
            this.f910a.l(host, eventType);
        }

        public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
            this.f910a.m(host, event);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
            e provider = this.f910a.b(host);
            if (provider != null) {
                return (AccessibilityNodeProvider) provider.a();
            }
            return null;
        }

        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            return this.f910a.j(host, action, args);
        }
    }

    public a() {
        this(f907c);
    }

    public a(View.AccessibilityDelegate originalDelegate) {
        this.f908a = originalDelegate;
        this.f909b = new C0023a(this);
    }

    public View.AccessibilityDelegate d() {
        return this.f909b;
    }

    public void l(View host, int eventType) {
        this.f908a.sendAccessibilityEvent(host, eventType);
    }

    public void m(View host, AccessibilityEvent event) {
        this.f908a.sendAccessibilityEventUnchecked(host, event);
    }

    public boolean a(View host, AccessibilityEvent event) {
        return this.f908a.dispatchPopulateAccessibilityEvent(host, event);
    }

    public void h(View host, AccessibilityEvent event) {
        this.f908a.onPopulateAccessibilityEvent(host, event);
    }

    public void f(View host, AccessibilityEvent event) {
        this.f908a.onInitializeAccessibilityEvent(host, event);
    }

    public void g(View host, d info) {
        this.f908a.onInitializeAccessibilityNodeInfo(host, info.S());
    }

    public boolean i(ViewGroup host, View child, AccessibilityEvent event) {
        return this.f908a.onRequestSendAccessibilityEvent(host, child, event);
    }

    public e b(View host) {
        Object provider = this.f908a.getAccessibilityNodeProvider(host);
        if (provider != null) {
            return new e(provider);
        }
        return null;
    }

    public boolean j(View host, int action, Bundle args) {
        boolean success = false;
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = c(host);
        int i = 0;
        while (true) {
            if (i >= actions.size()) {
                break;
            }
            d.a actionCompat = (d.a) actions.get(i);
            if (actionCompat.a() == action) {
                success = actionCompat.c(host, args);
                break;
            }
            i++;
        }
        if (!success) {
            success = this.f908a.performAccessibilityAction(host, action, args);
        }
        if (success || action != b.accessibility_action_clickable_span) {
            return success;
        }
        return k(args.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), host);
    }

    public final boolean k(int clickableSpanId, View host) {
        WeakReference<ClickableSpan> reference;
        SparseArray<WeakReference<ClickableSpan>> spans = (SparseArray) host.getTag(b.tag_accessibility_clickable_spans);
        if (spans == null || (reference = spans.get(clickableSpanId)) == null) {
            return false;
        }
        ClickableSpan span = reference.get();
        if (!e(span, host)) {
            return false;
        }
        span.onClick(host);
        return true;
    }

    public final boolean e(ClickableSpan span, View view) {
        if (span == null) {
            return false;
        }
        ClickableSpan[] spans = d.l(view.createAccessibilityNodeInfo().getText());
        int i = 0;
        while (spans != null && i < spans.length) {
            if (span.equals(spans[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static List<d.a> c(View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = (List) view.getTag(b.tag_accessibility_actions);
        return actions == null ? Collections.emptyList() : actions;
    }
}
