package p000;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: gd */
public class C0379gd {

    /* renamed from: b */
    private static final AccessibilityDelegate f1715b = new AccessibilityDelegate();

    /* renamed from: a */
    final AccessibilityDelegate f1716a = new C0380a(this);

    /* renamed from: gd$a */
    static final class C0380a extends AccessibilityDelegate {

        /* renamed from: a */
        private final C0379gd f1717a;

        C0380a(C0379gd gdVar) {
            this.f1717a = gdVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return C0379gd.m1215b(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0411gz a = C0379gd.m1211a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.f1761a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1717a.mo802d(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f1717a.mo800a(view, new C0410gy(accessibilityNodeInfo));
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C0379gd.m1216c(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C0379gd.m1214a(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f1717a.mo801a(view, i, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            C0379gd.m1212a(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C0379gd.m1213a(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public static C0411gz m1211a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = f1715b.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0411gz(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m1212a(View view, int i) {
        f1715b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public static void m1213a(View view, AccessibilityEvent accessibilityEvent) {
        f1715b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static boolean m1214a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1715b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public static boolean m1215b(View view, AccessibilityEvent accessibilityEvent) {
        return f1715b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public static void m1216c(View view, AccessibilityEvent accessibilityEvent) {
        f1715b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo800a(View view, C0410gy gyVar) {
        f1715b.onInitializeAccessibilityNodeInfo(view, gyVar.f1759a);
    }

    /* renamed from: a */
    public boolean mo801a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return f1715b.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: d */
    public void mo802d(View view, AccessibilityEvent accessibilityEvent) {
        f1715b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
