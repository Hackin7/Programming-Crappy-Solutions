package a.b.o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class i implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f162b;

    public i(Window.Callback wrapped) {
        if (wrapped != null) {
            this.f162b = wrapped;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f162b.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return this.f162b.dispatchKeyShortcutEvent(event);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        return this.f162b.dispatchTouchEvent(event);
    }

    public boolean dispatchTrackballEvent(MotionEvent event) {
        return this.f162b.dispatchTrackballEvent(event);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return this.f162b.dispatchGenericMotionEvent(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return this.f162b.dispatchPopulateAccessibilityEvent(event);
    }

    public View onCreatePanelView(int featureId) {
        return this.f162b.onCreatePanelView(featureId);
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return this.f162b.onCreatePanelMenu(featureId, menu);
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return this.f162b.onPreparePanel(featureId, view, menu);
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return this.f162b.onMenuOpened(featureId, menu);
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        return this.f162b.onMenuItemSelected(featureId, item);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
        this.f162b.onWindowAttributesChanged(attrs);
    }

    public void onContentChanged() {
        this.f162b.onContentChanged();
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        this.f162b.onWindowFocusChanged(hasFocus);
    }

    public void onAttachedToWindow() {
        this.f162b.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f162b.onDetachedFromWindow();
    }

    public void onPanelClosed(int featureId, Menu menu) {
        this.f162b.onPanelClosed(featureId, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f162b.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f162b.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f162b.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        return this.f162b.onWindowStartingActionMode(callback, type);
    }

    public void onActionModeStarted(ActionMode mode) {
        this.f162b.onActionModeStarted(mode);
    }

    public void onActionModeFinished(ActionMode mode) {
        this.f162b.onActionModeFinished(mode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        this.f162b.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    public void onPointerCaptureChanged(boolean hasCapture) {
        this.f162b.onPointerCaptureChanged(hasCapture);
    }

    public final Window.Callback a() {
        return this.f162b;
    }
}
