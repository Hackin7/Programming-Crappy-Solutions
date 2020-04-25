package p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: gy */
public final class C0410gy {

    /* renamed from: a */
    public final AccessibilityNodeInfo f1759a;

    /* renamed from: b */
    public int f1760b = -1;

    public C0410gy(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1759a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public final void mo1834a(int i) {
        this.f1759a.addAction(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0410gy gyVar = (C0410gy) obj;
        if (this.f1759a == null) {
            if (gyVar.f1759a != null) {
                return false;
            }
        } else if (!this.f1759a.equals(gyVar.f1759a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f1759a == null) {
            return 0;
        }
        return this.f1759a.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f1759a.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        this.f1759a.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(this.f1759a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f1759a.getClassName());
        sb.append("; text: ");
        sb.append(this.f1759a.getText());
        sb.append("; contentDescription: ");
        sb.append(this.f1759a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(VERSION.SDK_INT >= 18 ? this.f1759a.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(this.f1759a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f1759a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f1759a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f1759a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f1759a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f1759a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f1759a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f1759a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f1759a.isPassword());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(this.f1759a.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        int actions = this.f1759a.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= ~numberOfTrailingZeros;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            sb.append(str);
            if (actions != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
