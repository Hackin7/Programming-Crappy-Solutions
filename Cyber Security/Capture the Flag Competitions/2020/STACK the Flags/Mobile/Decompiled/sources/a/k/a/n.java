package a.k.a;

import a.m.d;
import a.u.a.a;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public abstract class n extends a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    public static final boolean DEBUG = false;
    public static final String TAG = "FragmentStatePagerAdapt";
    public final int mBehavior;
    public o mCurTransaction;
    public Fragment mCurrentPrimaryItem;
    public final i mFragmentManager;
    public ArrayList<Fragment> mFragments;
    public ArrayList<Fragment.g> mSavedState;

    public abstract Fragment getItem(int i);

    @Deprecated
    public n(i fm) {
        this(fm, 0);
    }

    public n(i fm, int behavior) {
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList<>();
        this.mFragments = new ArrayList<>();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fm;
        this.mBehavior = behavior;
    }

    @Override // a.u.a.a
    public void startUpdate(ViewGroup container) {
        if (container.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // a.u.a.a
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment.g fss;
        Fragment f2;
        if (this.mFragments.size() > position && (f2 = this.mFragments.get(position)) != null) {
            return f2;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.a();
        }
        Fragment fragment = getItem(position);
        if (this.mSavedState.size() > position && (fss = this.mSavedState.get(position)) != null) {
            fragment.setInitialSavedState(fss);
        }
        while (this.mFragments.size() <= position) {
            this.mFragments.add(null);
        }
        fragment.setMenuVisibility(false);
        if (this.mBehavior == 0) {
            fragment.setUserVisibleHint(false);
        }
        this.mFragments.set(position, fragment);
        this.mCurTransaction.b(container.getId(), fragment);
        if (this.mBehavior == 1) {
            this.mCurTransaction.k(fragment, d.b.STARTED);
        }
        return fragment;
    }

    @Override // a.u.a.a
    public void destroyItem(ViewGroup container, int position, Object object) {
        Fragment fragment = (Fragment) object;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.a();
        }
        while (this.mSavedState.size() <= position) {
            this.mSavedState.add(null);
        }
        this.mSavedState.set(position, fragment.isAdded() ? this.mFragmentManager.i(fragment) : null);
        this.mFragments.set(position, null);
        this.mCurTransaction.j(fragment);
        if (fragment == this.mCurrentPrimaryItem) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // a.u.a.a
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        Fragment fragment = (Fragment) object;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.a();
                    }
                    this.mCurTransaction.k(this.mCurrentPrimaryItem, d.b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.a();
                }
                this.mCurTransaction.k(fragment, d.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // a.u.a.a
    public void finishUpdate(ViewGroup container) {
        o oVar = this.mCurTransaction;
        if (oVar != null) {
            oVar.g();
            this.mCurTransaction = null;
        }
    }

    @Override // a.u.a.a
    public boolean isViewFromObject(View view, Object object) {
        return ((Fragment) object).getView() == view;
    }

    @Override // a.u.a.a
    public Parcelable saveState() {
        Bundle state = null;
        if (this.mSavedState.size() > 0) {
            state = new Bundle();
            Fragment.g[] fss = new Fragment.g[this.mSavedState.size()];
            this.mSavedState.toArray(fss);
            state.putParcelableArray("states", fss);
        }
        for (int i = 0; i < this.mFragments.size(); i++) {
            Fragment f2 = this.mFragments.get(i);
            if (f2 != null && f2.isAdded()) {
                if (state == null) {
                    state = new Bundle();
                }
                this.mFragmentManager.h(state, "f" + i, f2);
            }
        }
        return state;
    }

    @Override // a.u.a.a
    public void restoreState(Parcelable state, ClassLoader loader) {
        if (state != null) {
            Bundle bundle = (Bundle) state;
            bundle.setClassLoader(loader);
            Parcelable[] fss = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (fss != null) {
                for (Parcelable parcelable : fss) {
                    this.mSavedState.add((Fragment.g) parcelable);
                }
            }
            for (String key : bundle.keySet()) {
                if (key.startsWith("f")) {
                    int index = Integer.parseInt(key.substring(1));
                    Fragment f2 = this.mFragmentManager.c(bundle, key);
                    if (f2 != null) {
                        while (this.mFragments.size() <= index) {
                            this.mFragments.add(null);
                        }
                        f2.setMenuVisibility(false);
                        this.mFragments.set(index, f2);
                    } else {
                        Log.w(TAG, "Bad fragment at key " + key);
                    }
                }
            }
        }
    }
}
