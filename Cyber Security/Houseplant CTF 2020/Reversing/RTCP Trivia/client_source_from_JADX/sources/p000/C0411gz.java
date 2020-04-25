package p000;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: gz */
public final class C0411gz {

    /* renamed from: a */
    public final Object f1761a;

    /* renamed from: gz$a */
    static class C0412a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0411gz f1762a;

        C0412a(C0411gz gzVar) {
            this.f1762a = gzVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return null;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: gz$b */
    static class C0413b extends C0412a {
        C0413b(C0411gz gzVar) {
            super(gzVar);
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            return null;
        }
    }

    public C0411gz() {
        Object obj = VERSION.SDK_INT >= 19 ? new C0413b(this) : VERSION.SDK_INT >= 16 ? new C0412a(this) : null;
        this.f1761a = obj;
    }

    public C0411gz(Object obj) {
        this.f1761a = obj;
    }
}
