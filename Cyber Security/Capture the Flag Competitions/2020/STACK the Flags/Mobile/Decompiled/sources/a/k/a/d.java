package a.k.a;

import a.a.c;
import a.h.d.a;
import a.h.d.f;
import a.m.d;
import a.m.h;
import a.m.r;
import a.m.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class d extends ComponentActivity implements a.b, a.d {
    public static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    public static final String FRAGMENTS_TAG = "android:support:fragments";
    public static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    public static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    public static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    public static final String TAG = "FragmentActivity";
    public boolean mCreated;
    public final h mFragmentLifecycleRegistry = new h(this);
    public final f mFragments = f.b(new a());
    public int mNextCandidateRequestIndex;
    public a.e.h<String> mPendingFragmentActivityResults;
    public boolean mRequestedPermissionsFromFragment;
    public boolean mResumed;
    public boolean mStartedActivityFromFragment;
    public boolean mStartedIntentSenderFromFragment;
    public boolean mStopped = true;

    public d() {
    }

    public d(int contentLayoutId) {
        super(contentLayoutId);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.mFragments.v();
        int requestIndex = requestCode >> 16;
        if (requestIndex != 0) {
            int requestIndex2 = requestIndex - 1;
            String who = this.mPendingFragmentActivityResults.e(requestIndex2);
            this.mPendingFragmentActivityResults.j(requestIndex2);
            if (who == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment targetFragment = this.mFragments.t(who);
            if (targetFragment == null) {
                Log.w(TAG, "Activity result no fragment exists for who: " + who);
                return;
            }
            targetFragment.onActivityResult(65535 & requestCode, resultCode, data);
            return;
        }
        a.h.d.a.g();
        a.c delegate = null;
        if (0 == 0 || !delegate.a(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void supportFinishAfterTransition() {
        a.h.d.a.f(this);
    }

    public void setEnterSharedElementCallback(f callback) {
        a.h.d.a.k(this);
    }

    public void setExitSharedElementCallback(f listener) {
        a.h.d.a.l(this);
    }

    public void supportPostponeEnterTransition() {
        a.h.d.a.h(this);
    }

    public void supportStartPostponedEnterTransition() {
        a.h.d.a.p(this);
    }

    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        this.mFragments.j(isInMultiWindowMode);
    }

    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        this.mFragments.n(isInPictureInPictureMode);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.mFragments.v();
        this.mFragments.d(newConfig);
    }

    @Override // androidx.activity.ComponentActivity, a.h.d.d
    public void onCreate(Bundle savedInstanceState) {
        this.mFragments.a(null);
        if (savedInstanceState != null) {
            this.mFragments.x(savedInstanceState.getParcelable(FRAGMENTS_TAG));
            if (savedInstanceState.containsKey(NEXT_CANDIDATE_REQUEST_INDEX_TAG)) {
                this.mNextCandidateRequestIndex = savedInstanceState.getInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG);
                int[] requestCodes = savedInstanceState.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                String[] fragmentWhos = savedInstanceState.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (requestCodes == null || fragmentWhos == null || requestCodes.length != fragmentWhos.length) {
                    Log.w(TAG, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new a.e.h<>(requestCodes.length);
                    for (int i = 0; i < requestCodes.length; i++) {
                        this.mPendingFragmentActivityResults.i(requestCodes[i], fragmentWhos[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new a.e.h<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(savedInstanceState);
        this.mFragmentLifecycleRegistry.i(d.a.ON_CREATE);
        this.mFragments.f();
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId == 0) {
            return super.onCreatePanelMenu(featureId, menu) | this.mFragments.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(featureId, menu);
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v = dispatchFragmentsOnCreateView(parent, name, context, attrs);
        if (v == null) {
            return super.onCreateView(parent, name, context, attrs);
        }
        return v;
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View v = dispatchFragmentsOnCreateView(null, name, context, attrs);
        if (v == null) {
            return super.onCreateView(name, context, attrs);
        }
        return v;
    }

    public final View dispatchFragmentsOnCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return this.mFragments.w(parent, name, context, attrs);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.i(d.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.mFragments.k(item);
        }
        if (featureId != 6) {
            return false;
        }
        return this.mFragments.e(item);
    }

    public void onPanelClosed(int featureId, Menu menu) {
        if (featureId == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.i(d.a.ON_PAUSE);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.v();
    }

    public void onStateNotSaved() {
        this.mFragments.v();
    }

    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.v();
        this.mFragments.s();
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(d.a.ON_RESUME);
        this.mFragments.p();
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu);
        }
        return super.onPreparePanel(featureId, view, menu);
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, a.h.d.d
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(d.a.ON_STOP);
        Parcelable p = this.mFragments.y();
        if (p != null) {
            outState.putParcelable(FRAGMENTS_TAG, p);
        }
        if (this.mPendingFragmentActivityResults.k() > 0) {
            outState.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] requestCodes = new int[this.mPendingFragmentActivityResults.k()];
            String[] fragmentWhos = new String[this.mPendingFragmentActivityResults.k()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.k(); i++) {
                requestCodes[i] = this.mPendingFragmentActivityResults.h(i);
                fragmentWhos[i] = this.mPendingFragmentActivityResults.l(i);
            }
            outState.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, requestCodes);
            outState.putStringArray(REQUEST_FRAGMENT_WHO_TAG, fragmentWhos);
        }
    }

    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.v();
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.i(d.a.ON_START);
        this.mFragments.q();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.i(d.a.ON_STOP);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        writer.print(prefix);
        writer.print("Local FragmentActivity ");
        writer.print(Integer.toHexString(System.identityHashCode(this)));
        writer.println(" State:");
        String innerPrefix = prefix + "  ";
        writer.print(innerPrefix);
        writer.print("mCreated=");
        writer.print(this.mCreated);
        writer.print(" mResumed=");
        writer.print(this.mResumed);
        writer.print(" mStopped=");
        writer.print(this.mStopped);
        if (getApplication() != null) {
            a.n.a.a.b(this).a(innerPrefix, fd, writer, args);
        }
        this.mFragments.u().b(prefix, fd, writer, args);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public i getSupportFragmentManager() {
        return this.mFragments.u();
    }

    @Deprecated
    public a.n.a.a getSupportLoaderManager() {
        return a.n.a.a.b(this);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int requestCode) {
        if (!this.mStartedActivityFromFragment && requestCode != -1) {
            checkForValidRequestCode(requestCode);
        }
        super.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int requestCode, Bundle options) {
        if (!this.mStartedActivityFromFragment && requestCode != -1) {
            checkForValidRequestCode(requestCode);
        }
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) {
        if (!this.mStartedIntentSenderFromFragment && requestCode != -1) {
            checkForValidRequestCode(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        if (!this.mStartedIntentSenderFromFragment && requestCode != -1) {
            checkForValidRequestCode(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public static void checkForValidRequestCode(int requestCode) {
        if ((-65536 & requestCode) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // a.h.d.a.d
    public final void validateRequestPermissionsRequestCode(int requestCode) {
        if (!this.mRequestedPermissionsFromFragment && requestCode != -1) {
            checkForValidRequestCode(requestCode);
        }
    }

    @Override // a.h.d.a.b
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        this.mFragments.v();
        int index = (requestCode >> 16) & 65535;
        if (index != 0) {
            int index2 = index - 1;
            String who = this.mPendingFragmentActivityResults.e(index2);
            this.mPendingFragmentActivityResults.j(index2);
            if (who == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment frag = this.mFragments.t(who);
            if (frag == null) {
                Log.w(TAG, "Activity result no fragment exists for who: " + who);
                return;
            }
            frag.onRequestPermissionsResult(65535 & requestCode, permissions, grantResults);
        }
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int requestCode) {
        startActivityFromFragment(fragment, intent, requestCode, null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int requestCode, Bundle options) {
        this.mStartedActivityFromFragment = true;
        if (requestCode == -1) {
            try {
                a.h.d.a.n(this, intent, -1, options);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(requestCode);
            a.h.d.a.n(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (65535 & requestCode), options);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        this.mStartedIntentSenderFromFragment = true;
        if (requestCode == -1) {
            try {
                a.h.d.a.o(this, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(requestCode);
            a.h.d.a.o(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (65535 & requestCode), fillInIntent, flagsMask, flagsValues, extraFlags, options);
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.k() < 65534) {
            while (this.mPendingFragmentActivityResults.g(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            }
            int requestIndex = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.i(requestIndex, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            return requestIndex;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* JADX INFO: finally extract failed */
    public void requestPermissionsFromFragment(Fragment fragment, String[] permissions, int requestCode) {
        if (requestCode == -1) {
            a.h.d.a.j(this, permissions, requestCode);
            return;
        }
        checkForValidRequestCode(requestCode);
        try {
            this.mRequestedPermissionsFromFragment = true;
            a.h.d.a.j(this, permissions, ((allocateRequestIndex(fragment) + 1) << 16) + (65535 & requestCode));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    public class a extends h<d> implements s, c {
        public a() {
            super(d.this);
        }

        @Override // a.m.g
        public a.m.d getLifecycle() {
            return d.this.mFragmentLifecycleRegistry;
        }

        @Override // a.m.s
        public r getViewModelStore() {
            return d.this.getViewModelStore();
        }

        @Override // a.a.c
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return d.this.getOnBackPressedDispatcher();
        }

        @Override // a.k.a.h
        public void h(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            d.this.dump(prefix, fd, writer, args);
        }

        @Override // a.k.a.h
        public boolean n(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // a.k.a.h
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        /* renamed from: s */
        public d i() {
            return d.this;
        }

        @Override // a.k.a.h
        public void r() {
            d.this.supportInvalidateOptionsMenu();
        }

        @Override // a.k.a.h
        public void p(Fragment fragment, Intent intent, int requestCode, Bundle options) {
            d.this.startActivityFromFragment(fragment, intent, requestCode, options);
        }

        @Override // a.k.a.h
        public void q(Fragment fragment, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
            d.this.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        }

        @Override // a.k.a.h
        public void m(Fragment fragment, String[] permissions, int requestCode) {
            d.this.requestPermissionsFromFragment(fragment, permissions, requestCode);
        }

        @Override // a.k.a.h
        public boolean o(String permission) {
            return a.h.d.a.m(d.this, permission);
        }

        @Override // a.k.a.h
        public boolean l() {
            return d.this.getWindow() != null;
        }

        @Override // a.k.a.h
        public int k() {
            Window w = d.this.getWindow();
            if (w == null) {
                return 0;
            }
            return w.getAttributes().windowAnimations;
        }

        @Override // a.k.a.h
        public void g(Fragment fragment) {
            d.this.onAttachFragment(fragment);
        }

        @Override // a.k.a.e, a.k.a.h
        public View b(int id) {
            return d.this.findViewById(id);
        }

        @Override // a.k.a.e, a.k.a.h
        public boolean c() {
            Window w = d.this.getWindow();
            return (w == null || w.peekDecorView() == null) ? false : true;
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), d.b.CREATED));
    }

    public static boolean markState(i manager, d.b state) {
        boolean hadNotMarked = false;
        for (Fragment fragment : manager.e()) {
            if (fragment != null) {
                if (fragment.getLifecycle().b().a(d.b.STARTED)) {
                    fragment.mLifecycleRegistry.p(state);
                    hadNotMarked = true;
                }
                if (fragment.getHost() != null) {
                    hadNotMarked |= markState(fragment.getChildFragmentManager(), state);
                }
            }
        }
        return hadNotMarked;
    }
}
