package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: bk */
final class C0154bk {
    /* renamed from: a */
    static InputConnection m504a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof C0226cy) {
                    editorInfo.hintText = ((C0226cy) parent).mo1338a();
                    return inputConnection;
                }
            }
        }
        return inputConnection;
    }
}
