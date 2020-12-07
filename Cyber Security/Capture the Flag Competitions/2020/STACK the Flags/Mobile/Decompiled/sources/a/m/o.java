package a.m;

import a.m.d;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class o extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public a f1195b;

    public interface a {
        void a();

        void b();

        void c();
    }

    public static void e(Activity activity) {
        FragmentManager manager = activity.getFragmentManager();
        if (manager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            manager.beginTransaction().add(new o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            manager.executePendingTransactions();
        }
    }

    public final void b(a listener) {
        if (listener != null) {
            listener.a();
        }
    }

    public final void d(a listener) {
        if (listener != null) {
            listener.c();
        }
    }

    public final void c(a listener) {
        if (listener != null) {
            listener.b();
        }
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b(this.f1195b);
        a(d.a.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        d(this.f1195b);
        a(d.a.ON_START);
    }

    public void onResume() {
        super.onResume();
        c(this.f1195b);
        a(d.a.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        a(d.a.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        a(d.a.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        a(d.a.ON_DESTROY);
        this.f1195b = null;
    }

    public final void a(d.a event) {
        Activity activity = getActivity();
        if (activity instanceof i) {
            ((i) activity).getLifecycle().i(event);
        } else if (activity instanceof g) {
            d lifecycle = ((g) activity).getLifecycle();
            if (lifecycle instanceof h) {
                ((h) lifecycle).i(event);
            }
        }
    }
}
