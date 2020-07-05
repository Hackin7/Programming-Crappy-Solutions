package p000;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: ix */
public final class C0536ix extends Fragment {

    /* renamed from: a */
    private C0537a f2226a;

    /* renamed from: ix$a */
    interface C0537a {
    }

    /* renamed from: a */
    public static void m1706a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0536ix(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m1707a(C0523a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0530ir) {
            ((C0530ir) activity).mo2127a().mo2124a(aVar);
            return;
        }
        if (activity instanceof C0526ip) {
            C0522in c = ((C0526ip) activity).mo1688c();
            if (c instanceof C0527iq) {
                ((C0527iq) c).mo2124a(aVar);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1707a(C0523a.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        m1707a(C0523a.ON_DESTROY);
        this.f2226a = null;
    }

    public final void onPause() {
        super.onPause();
        m1707a(C0523a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        m1707a(C0523a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        m1707a(C0523a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        m1707a(C0523a.ON_STOP);
    }
}
