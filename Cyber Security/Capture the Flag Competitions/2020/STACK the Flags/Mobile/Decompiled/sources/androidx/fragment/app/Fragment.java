package androidx.fragment.app;

import a.k.a.h;
import a.k.a.i;
import a.k.a.j;
import a.k.a.t;
import a.m.d;
import a.m.l;
import a.m.r;
import a.m.s;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, a.m.g, s, a.p.b {
    public static final int ACTIVITY_CREATED = 2;
    public static final int CREATED = 1;
    public static final int INITIALIZING = 0;
    public static final int RESUMED = 4;
    public static final int STARTED = 3;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public boolean mAdded;
    public d mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public j mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public j mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public h mHost;
    public boolean mInLayout;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public a.m.h mLifecycleRegistry;
    public d.b mMaxState;
    public boolean mMenuVisible;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public a.p.a mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public a.k.a.s mViewLifecycleOwner;
    public l<a.m.g> mViewLifecycleOwnerLiveData;
    public String mWho;

    public interface f {
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    @Override // a.m.g
    public a.m.d getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public a.m.g getViewLifecycleOwner() {
        a.k.a.s sVar = this.mViewLifecycleOwner;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<a.m.g> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // a.m.s
    public r getViewModelStore() {
        j jVar = this.mFragmentManager;
        if (jVar != null) {
            return jVar.C0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // a.p.b
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f1692b;

        public g(Bundle state) {
            this.f1692b = state;
        }

        public g(Parcel in, ClassLoader loader) {
            Bundle readBundle = in.readBundle();
            this.f1692b = readBundle;
            if (loader != null && readBundle != null) {
                readBundle.setClassLoader(loader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeBundle(this.f1692b);
        }

        public static class a implements Parcelable.ClassLoaderCreator<g> {
            /* renamed from: a */
            public g createFromParcel(Parcel in) {
                return new g(in, null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel in, ClassLoader loader) {
                return new g(in, loader);
            }

            /* renamed from: c */
            public g[] newArray(int size) {
                return new g[size];
            }
        }
    }

    public static class e extends RuntimeException {
        public e(String msg, Exception cause) {
            super(msg, cause);
        }
    }

    public Fragment() {
        this.mState = 0;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new j();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = d.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new l<>();
        initLifecycle();
    }

    public Fragment(int contentLayoutId) {
        this();
        this.mContentLayoutId = contentLayoutId;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new a.m.h(this);
        this.mSavedStateRegistryController = a.p.a.a(this);
        this.mLifecycleRegistry.a(new a.m.e() {
            /* class androidx.fragment.app.Fragment.AnonymousClass2 */

            @Override // a.m.e
            public void d(a.m.g source, d.a event) {
                View view;
                if (event == d.a.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
    }

    @Deprecated
    public static Fragment instantiate(Context context, String fname) {
        return instantiate(context, fname, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String fname, Bundle args) {
        try {
            Fragment f2 = (Fragment) a.k.a.g.d(context.getClassLoader(), fname).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f2.getClass().getClassLoader());
                f2.setArguments(args);
            }
            return f2;
        } catch (InstantiationException e2) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public final void restoreViewState(Bundle savedInstanceState) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(savedInstanceState);
        if (!this.mCalled) {
            throw new t("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_CREATE);
        }
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object o) {
        return super.equals(o);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.h.l.a.a(this, sb);
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle args) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = args;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final boolean isStateSaved() {
        j jVar = this.mFragmentManager;
        if (jVar == null) {
            return false;
        }
        return jVar.J0();
    }

    public void setInitialSavedState(g state) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (state == null || (bundle = state.f1692b) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setTargetFragment(Fragment fragment, int requestCode) {
        i mine = getFragmentManager();
        i theirs = fragment != null ? fragment.getFragmentManager() : null;
        if (mine == null || theirs == null || mine == theirs) {
            for (Fragment check = fragment; check != null; check = check.getTargetFragment()) {
                if (check == this) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = requestCode;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.mFragmentManager;
        if (jVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return jVar.h.get(str);
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.e();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final a.k.a.d getActivity() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return (a.k.a.d) hVar.d();
    }

    public final a.k.a.d requireActivity() {
        a.k.a.d activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object getHost() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.i();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final CharSequence getText(int resId) {
        return getResources().getText(resId);
    }

    public final String getString(int resId) {
        return getResources().getString(resId);
    }

    public final String getString(int resId, Object... formatArgs) {
        return getResources().getString(resId, formatArgs);
    }

    public final i getFragmentManager() {
        return this.mFragmentManager;
    }

    public final i requireFragmentManager() {
        i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final i getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isVisible() {
        View view;
        return isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public void onHiddenChanged(boolean hidden) {
    }

    public void setRetainInstance(boolean retain) {
        this.mRetainInstance = retain;
        j jVar = this.mFragmentManager;
        if (jVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (retain) {
            jVar.n(this);
        } else {
            jVar.b1(this);
        }
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setHasOptionsMenu(boolean hasMenu) {
        if (this.mHasMenu != hasMenu) {
            this.mHasMenu = hasMenu;
            if (isAdded() && !isHidden()) {
                this.mHost.r();
            }
        }
    }

    public void setMenuVisibility(boolean menuVisible) {
        if (this.mMenuVisible != menuVisible) {
            this.mMenuVisible = menuVisible;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.r();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (!this.mUserVisibleHint && isVisibleToUser && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.V0(this);
        }
        this.mUserVisibleHint = isVisibleToUser;
        this.mDeferStart = this.mState < 3 && !isVisibleToUser;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(isVisibleToUser);
        }
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Deprecated
    public a.n.a.a getLoaderManager() {
        return a.n.a.a.b(this);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle options) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.p(this, intent, -1, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int requestCode) {
        startActivityForResult(intent, requestCode, null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int requestCode, Bundle options) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.p(this, intent, requestCode, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.q(this, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    public final void requestPermissions(String[] permissions, int requestCode) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.m(this, permissions, requestCode);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    }

    public boolean shouldShowRequestPermissionRationale(String permission) {
        h hVar = this.mHost;
        if (hVar != null) {
            return hVar.o(permission);
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        return getLayoutInflater(savedInstanceState);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return layoutInflater;
    }

    public LayoutInflater performGetLayoutInflater(Bundle savedInstanceState) {
        LayoutInflater layoutInflater = onGetLayoutInflater(savedInstanceState);
        this.mLayoutInflater = layoutInflater;
        return layoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle savedFragmentState) {
        h hVar = this.mHost;
        if (hVar != null) {
            LayoutInflater result = hVar.j();
            j jVar = this.mChildFragmentManager;
            jVar.A0();
            a.h.m.f.a(result, jVar);
            return result;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        this.mCalled = true;
        h hVar = this.mHost;
        Activity hostActivity = hVar == null ? null : hVar.d();
        if (hostActivity != null) {
            this.mCalled = false;
            onInflate(hostActivity, attrs, savedInstanceState);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        this.mCalled = true;
    }

    public void onAttachFragment(Fragment childFragment) {
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        h hVar = this.mHost;
        Activity hostActivity = hVar == null ? null : hVar.d();
        if (hostActivity != null) {
            this.mCalled = false;
            onAttach(hostActivity);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public void onCreate(Bundle savedInstanceState) {
        this.mCalled = true;
        restoreChildFragmentState(savedInstanceState);
        if (!this.mChildFragmentManager.I0(1)) {
            this.mChildFragmentManager.C();
        }
    }

    public void restoreChildFragmentState(Bundle savedInstanceState) {
        Parcelable p;
        if (savedInstanceState != null && (p = savedInstanceState.getParcelable(a.k.a.d.FRAGMENTS_TAG)) != null) {
            this.mChildFragmentManager.d1(p);
            this.mChildFragmentManager.C();
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return inflater.inflate(i, container, false);
        }
        return null;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
    }

    public View getView() {
        return this.mView;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle savedInstanceState) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle outState) {
    }

    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
    }

    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        this.mCalled = true;
    }

    public void onPrimaryNavigationFragmentChanged(boolean isPrimaryNavigationFragment) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new j();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onDestroyOptionsMenu() {
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        requireActivity().onCreateContextMenu(menu, v, menuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public boolean onContextItemSelected(MenuItem item) {
        return false;
    }

    public void setEnterSharedElementCallback(a.h.d.f callback) {
        ensureAnimationInfo();
    }

    public void setExitSharedElementCallback(a.h.d.f callback) {
        ensureAnimationInfo();
    }

    public void setEnterTransition(Object transition) {
        ensureAnimationInfo().f1691g = transition;
    }

    public Object getEnterTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f1691g;
    }

    public void setReturnTransition(Object transition) {
        ensureAnimationInfo().h = transition;
    }

    public Object getReturnTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public void setExitTransition(Object transition) {
        ensureAnimationInfo().i = transition;
    }

    public Object getExitTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public void setReenterTransition(Object transition) {
        ensureAnimationInfo().j = transition;
    }

    public Object getReenterTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public void setSharedElementEnterTransition(Object transition) {
        ensureAnimationInfo().k = transition;
    }

    public Object getSharedElementEnterTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public void setSharedElementReturnTransition(Object transition) {
        ensureAnimationInfo().l = transition;
    }

    public Object getSharedElementReturnTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public void setAllowEnterTransitionOverlap(boolean allow) {
        ensureAnimationInfo().n = Boolean.valueOf(allow);
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        d dVar = this.mAnimationInfo;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean allow) {
        ensureAnimationInfo().m = Boolean.valueOf(allow);
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        d dVar = this.mAnimationInfo;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().q = true;
    }

    public final void postponeEnterTransition(long duration, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().q = true;
        j jVar = this.mFragmentManager;
        if (jVar != null) {
            handler = jVar.q.f();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(duration));
    }

    public void startPostponedEnterTransition() {
        j jVar = this.mFragmentManager;
        if (jVar == null || jVar.q == null) {
            ensureAnimationInfo().q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.q.f().getLooper()) {
            this.mFragmentManager.q.f().postAtFrontOfQueue(new b());
        } else {
            callStartTransitionListener();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener();
        }
    }

    public void callStartTransitionListener() {
        f listener;
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            listener = null;
        } else {
            dVar.q = false;
            f listener2 = dVar.r;
            dVar.r = null;
            listener = listener2;
        }
        if (listener != null) {
            ((j.m) listener).d();
        }
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(this.mFragmentId));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(this.mContainerId));
        writer.print(" mTag=");
        writer.println(this.mTag);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(this.mState);
        writer.print(" mWho=");
        writer.print(this.mWho);
        writer.print(" mBackStackNesting=");
        writer.println(this.mBackStackNesting);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(this.mAdded);
        writer.print(" mRemoving=");
        writer.print(this.mRemoving);
        writer.print(" mFromLayout=");
        writer.print(this.mFromLayout);
        writer.print(" mInLayout=");
        writer.println(this.mInLayout);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(this.mHidden);
        writer.print(" mDetached=");
        writer.print(this.mDetached);
        writer.print(" mMenuVisible=");
        writer.print(this.mMenuVisible);
        writer.print(" mHasMenu=");
        writer.println(this.mHasMenu);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(this.mRetainInstance);
        writer.print(" mUserVisibleHint=");
        writer.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            writer.print(prefix);
            writer.print("mHost=");
            writer.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(this.mSavedViewState);
        }
        Fragment target = getTargetFragment();
        if (target != null) {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(target);
            writer.print(" mTargetRequestCode=");
            writer.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            writer.print(prefix);
            writer.print("mNextAnim=");
            writer.println(getNextAnim());
        }
        if (this.mContainer != null) {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(this.mContainer);
        }
        if (this.mView != null) {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(this.mView);
        }
        if (this.mInnerView != null) {
            writer.print(prefix);
            writer.print("mInnerView=");
            writer.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(getAnimatingAway());
            writer.print(prefix);
            writer.print("mStateAfterAnimating=");
            writer.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            a.n.a.a.b(this).a(prefix, fd, writer, args);
        }
        writer.print(prefix);
        writer.println("Child " + this.mChildFragmentManager + ":");
        j jVar = this.mChildFragmentManager;
        jVar.b(prefix + "  ", fd, writer, args);
    }

    public Fragment findFragmentByWho(String who) {
        if (who.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.t0(who);
    }

    public class c extends a.k.a.e {
        public c() {
        }

        @Override // a.k.a.e
        public View b(int id) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(id);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // a.k.a.e
        public boolean c() {
            return Fragment.this.mView != null;
        }
    }

    public void performAttach() {
        this.mChildFragmentManager.q(this.mHost, new c(), this);
        this.mCalled = false;
        onAttach(this.mHost.e());
        if (!this.mCalled) {
            throw new t("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performCreate(Bundle savedInstanceState) {
        this.mChildFragmentManager.U0();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.c(savedInstanceState);
        onCreate(savedInstanceState);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.i(d.a.ON_CREATE);
            return;
        }
        throw new t("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void performCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mChildFragmentManager.U0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new a.k.a.s();
        View onCreateView = onCreateView(inflater, container, savedInstanceState);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            this.mViewLifecycleOwnerLiveData.g(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performActivityCreated(Bundle savedInstanceState) {
        this.mChildFragmentManager.U0();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(savedInstanceState);
        if (this.mCalled) {
            this.mChildFragmentManager.z();
            return;
        }
        throw new t("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performStart() {
        this.mChildFragmentManager.U0();
        this.mChildFragmentManager.m0();
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.i(d.a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(d.a.ON_START);
            }
            this.mChildFragmentManager.e0();
            return;
        }
        throw new t("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performResume() {
        this.mChildFragmentManager.U0();
        this.mChildFragmentManager.m0();
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.i(d.a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(d.a.ON_RESUME);
            }
            this.mChildFragmentManager.d0();
            this.mChildFragmentManager.m0();
            return;
        }
        throw new t("Fragment " + this + " did not call through to super.onResume()");
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.U0();
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigationFragment = this.mFragmentManager.H0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != isPrimaryNavigationFragment) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(isPrimaryNavigationFragment);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment);
            this.mChildFragmentManager.c0();
        }
    }

    public void performMultiWindowModeChanged(boolean isInMultiWindowMode) {
        onMultiWindowModeChanged(isInMultiWindowMode);
        this.mChildFragmentManager.H(isInMultiWindowMode);
    }

    public void performPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        onPictureInPictureModeChanged(isInPictureInPictureMode);
        this.mChildFragmentManager.a0(isInPictureInPictureMode);
    }

    public void performConfigurationChanged(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        this.mChildFragmentManager.A(newConfig);
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.G();
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        boolean show = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            show = true;
            onCreateOptionsMenu(menu, inflater);
        }
        return show | this.mChildFragmentManager.D(menu, inflater);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean show = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            show = true;
            onPrepareOptionsMenu(menu);
        }
        return show | this.mChildFragmentManager.b0(menu);
    }

    public boolean performOptionsItemSelected(MenuItem item) {
        if (this.mHidden) {
            return false;
        }
        if ((!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(item)) && !this.mChildFragmentManager.W(item)) {
            return false;
        }
        return true;
    }

    public boolean performContextItemSelected(MenuItem item) {
        if (this.mHidden) {
            return false;
        }
        if (!onContextItemSelected(item) && !this.mChildFragmentManager.B(item)) {
            return false;
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.X(menu);
        }
    }

    public void performSaveInstanceState(Bundle outState) {
        onSaveInstanceState(outState);
        this.mSavedStateRegistryController.d(outState);
        Parcelable p = this.mChildFragmentManager.f1();
        if (p != null) {
            outState.putParcelable(a.k.a.d.FRAGMENTS_TAG, p);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.Z();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.i(d.a.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new t("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performStop() {
        this.mChildFragmentManager.g0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_STOP);
        }
        this.mLifecycleRegistry.i(d.a.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new t("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.F();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            a.n.a.a.b(this).c();
            this.mPerformedCreateView = false;
            return;
        }
        throw new t("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDestroy() {
        this.mChildFragmentManager.E();
        this.mLifecycleRegistry.i(d.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new t("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new t("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.F0()) {
            this.mChildFragmentManager.E();
            this.mChildFragmentManager = new j();
        }
    }

    public void setOnStartEnterTransitionListener(f listener) {
        ensureAnimationInfo();
        f fVar = this.mAnimationInfo.r;
        if (listener != fVar) {
            if (listener == null || fVar == null) {
                d dVar = this.mAnimationInfo;
                if (dVar.q) {
                    dVar.r = listener;
                }
                if (listener != null) {
                    ((j.m) listener).e();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    private d ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new d();
        }
        return this.mAnimationInfo;
    }

    public int getNextAnim() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1688d;
    }

    public void setNextAnim(int animResourceId) {
        if (this.mAnimationInfo != null || animResourceId != 0) {
            ensureAnimationInfo().f1688d = animResourceId;
        }
    }

    public int getNextTransition() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1689e;
    }

    public void setNextTransition(int nextTransition, int nextTransitionStyle) {
        if (this.mAnimationInfo != null || nextTransition != 0 || nextTransitionStyle != 0) {
            ensureAnimationInfo();
            d dVar = this.mAnimationInfo;
            dVar.f1689e = nextTransition;
            dVar.f1690f = nextTransitionStyle;
        }
    }

    public int getNextTransitionStyle() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1690f;
    }

    public a.h.d.f getEnterTransitionCallback() {
        return this.mAnimationInfo == null ? null : null;
    }

    public a.h.d.f getExitTransitionCallback() {
        return this.mAnimationInfo == null ? null : null;
    }

    public View getAnimatingAway() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f1685a;
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f1685a = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f1686b = animator;
    }

    public Animator getAnimator() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f1686b;
    }

    public int getStateAfterAnimating() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1687c;
    }

    public void setStateAfterAnimating(int state) {
        ensureAnimationInfo().f1687c = state;
    }

    public boolean isPostponed() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    public boolean isHideReplaced() {
        d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    public void setHideReplaced(boolean replaced) {
        ensureAnimationInfo().s = replaced;
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f1685a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f1686b;

        /* renamed from: c  reason: collision with root package name */
        public int f1687c;

        /* renamed from: d  reason: collision with root package name */
        public int f1688d;

        /* renamed from: e  reason: collision with root package name */
        public int f1689e;

        /* renamed from: f  reason: collision with root package name */
        public int f1690f;

        /* renamed from: g  reason: collision with root package name */
        public Object f1691g = null;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Boolean m;
        public Boolean n;
        public a.h.d.f o;
        public a.h.d.f p;
        public boolean q;
        public f r;
        public boolean s;

        public d() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }
}
