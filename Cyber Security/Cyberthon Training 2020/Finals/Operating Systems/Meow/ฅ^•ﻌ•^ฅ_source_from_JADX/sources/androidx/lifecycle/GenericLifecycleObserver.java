package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.Event;

public interface GenericLifecycleObserver extends LifecycleObserver {
    void onStateChanged(LifecycleOwner lifecycleOwner, Event event);
}
