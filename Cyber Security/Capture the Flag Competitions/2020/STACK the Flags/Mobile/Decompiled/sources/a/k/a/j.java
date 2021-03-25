package a.k.a;

import a.h.m.q;
import a.m.d;
import a.m.r;
import a.m.s;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.collection.ArraySet;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class j extends i implements LayoutInflater.Factory2 {
    public static boolean H = false;
    public static final Interpolator I = new DecelerateInterpolator(2.5f);
    public static final Interpolator J = new DecelerateInterpolator(1.5f);
    public ArrayList<Boolean> A;
    public ArrayList<Fragment> B;
    public Bundle C = null;
    public SparseArray<Parcelable> D = null;
    public ArrayList<m> E;
    public l F;
    public Runnable G = new b();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<k> f1052d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1053e;

    /* renamed from: f  reason: collision with root package name */
    public int f1054f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<Fragment> f1055g = new ArrayList<>();
    public final HashMap<String, Fragment> h = new HashMap<>();
    public ArrayList<a> i;
    public ArrayList<Fragment> j;
    public OnBackPressedDispatcher k;
    public final a.a.b l = new a(false);
    public ArrayList<a> m;
    public ArrayList<Integer> n;
    public final CopyOnWriteArrayList<i> o = new CopyOnWriteArrayList<>();
    public int p = 0;
    public h q;
    public e r;
    public Fragment s;
    public Fragment t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public ArrayList<a> z;

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f1077a;
    }

    /* renamed from: a.k.a.j$j  reason: collision with other inner class name */
    public static class C0030j {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f1078a = {16842755, 16842960, 16842961};
    }

    public interface k {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class a extends a.a.b {
        public a(boolean x0) {
            super(x0);
        }

        @Override // a.a.b
        public void b() {
            j.this.D0();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j.this.m0();
        }
    }

    public final void o1(RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter pw = new PrintWriter(new a.h.l.b("FragmentManager"));
        h hVar = this.q;
        if (hVar != null) {
            try {
                hVar.h("  ", null, pw, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                b("  ", null, pw, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw ex;
    }

    @Override // a.k.a.i
    public o a() {
        return new a(this);
    }

    public final void q1() {
        ArrayList<k> arrayList = this.f1052d;
        boolean z2 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            a.a.b bVar = this.l;
            if (y0() <= 0 || !H0(this.s)) {
                z2 = false;
            }
            bVar.f(z2);
            return;
        }
        this.l.f(true);
    }

    public boolean H0(Fragment parent) {
        if (parent == null) {
            return true;
        }
        j parentFragmentManager = parent.mFragmentManager;
        if (parent != parentFragmentManager.B0() || !H0(parentFragmentManager.s)) {
            return false;
        }
        return true;
    }

    public void D0() {
        m0();
        if (this.l.c()) {
            g();
        } else {
            this.k.c();
        }
    }

    @Override // a.k.a.i
    public boolean g() {
        u();
        return W0(null, -1, 0);
    }

    @Override // a.k.a.i
    public void f(int id, int flags) {
        if (id >= 0) {
            j0(new l(null, id, flags), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + id);
    }

    public final boolean W0(String name, int id, int flags) {
        m0();
        k0(true);
        Fragment fragment = this.t;
        if (fragment != null && id < 0 && name == null && fragment.getChildFragmentManager().g()) {
            return true;
        }
        boolean executePop = X0(this.z, this.A, name, id, flags);
        if (executePop) {
            this.f1053e = true;
            try {
                a1(this.z, this.A);
            } finally {
                v();
            }
        }
        q1();
        h0();
        s();
        return executePop;
    }

    public int y0() {
        ArrayList<a> arrayList = this.i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // a.k.a.i
    public void h(Bundle bundle, String key, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(key, fragment.mWho);
            return;
        }
        o1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    @Override // a.k.a.i
    public Fragment c(Bundle bundle, String key) {
        String who = bundle.getString(key);
        if (who == null) {
            return null;
        }
        Fragment f2 = this.h.get(who);
        if (f2 != null) {
            return f2;
        }
        o1(new IllegalStateException("Fragment no longer exists for key " + key + ": unique id " + who));
        throw null;
    }

    @Override // a.k.a.i
    public List<Fragment> e() {
        List<Fragment> list;
        if (this.f1055g.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1055g) {
            list = (List) this.f1055g.clone();
        }
        return list;
    }

    public r C0(Fragment f2) {
        return this.F.i(f2);
    }

    public l z0(Fragment f2) {
        return this.F.f(f2);
    }

    public void n(Fragment f2) {
        if (!J0() && this.F.d(f2)) {
        }
    }

    public void b1(Fragment f2) {
        if (!J0() && this.F.k(f2)) {
        }
    }

    @Override // a.k.a.i
    public Fragment.g i(Fragment fragment) {
        Bundle result;
        if (fragment.mFragmentManager != this) {
            o1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
            throw null;
        } else if (fragment.mState <= 0 || (result = g1(fragment)) == null) {
            return null;
        } else {
            return new Fragment.g(result);
        }
    }

    public boolean F0() {
        return this.x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.s;
        if (fragment != null) {
            a.h.l.a.a(fragment, sb);
        } else {
            a.h.l.a.a(this.q, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // a.k.a.i
    public void b(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        int N;
        int N2;
        int N3;
        int N4;
        String innerPrefix = prefix + "    ";
        if (!this.h.isEmpty()) {
            writer.print(prefix);
            writer.print("Active Fragments in ");
            writer.print(Integer.toHexString(System.identityHashCode(this)));
            writer.println(":");
            for (Fragment f2 : this.h.values()) {
                writer.print(prefix);
                writer.println(f2);
                if (f2 != null) {
                    f2.dump(innerPrefix, fd, writer, args);
                }
            }
        }
        int N5 = this.f1055g.size();
        if (N5 > 0) {
            writer.print(prefix);
            writer.println("Added Fragments:");
            for (int i2 = 0; i2 < N5; i2++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(this.f1055g.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.j;
        if (arrayList != null && (N4 = arrayList.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < N4; i3++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i3);
                writer.print(": ");
                writer.println(this.j.get(i3).toString());
            }
        }
        ArrayList<a> arrayList2 = this.i;
        if (arrayList2 != null && (N3 = arrayList2.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i4 = 0; i4 < N3; i4++) {
                a bs = this.i.get(i4);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i4);
                writer.print(": ");
                writer.println(bs.toString());
                bs.n(innerPrefix, writer);
            }
        }
        synchronized (this) {
            if (this.m != null && (N2 = this.m.size()) > 0) {
                writer.print(prefix);
                writer.println("Back Stack Indices:");
                for (int i5 = 0; i5 < N2; i5++) {
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i5);
                    writer.print(": ");
                    writer.println(this.m.get(i5));
                }
            }
            if (this.n != null && this.n.size() > 0) {
                writer.print(prefix);
                writer.print("mAvailBackStackIndices: ");
                writer.println(Arrays.toString(this.n.toArray()));
            }
        }
        ArrayList<k> arrayList3 = this.f1052d;
        if (arrayList3 != null && (N = arrayList3.size()) > 0) {
            writer.print(prefix);
            writer.println("Pending Actions:");
            for (int i6 = 0; i6 < N; i6++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i6);
                writer.print(": ");
                writer.println(this.f1052d.get(i6));
            }
        }
        writer.print(prefix);
        writer.println("FragmentManager misc state:");
        writer.print(prefix);
        writer.print("  mHost=");
        writer.println(this.q);
        writer.print(prefix);
        writer.print("  mContainer=");
        writer.println(this.r);
        if (this.s != null) {
            writer.print(prefix);
            writer.print("  mParent=");
            writer.println(this.s);
        }
        writer.print(prefix);
        writer.print("  mCurState=");
        writer.print(this.p);
        writer.print(" mStateSaved=");
        writer.print(this.v);
        writer.print(" mStopped=");
        writer.print(this.w);
        writer.print(" mDestroyed=");
        writer.println(this.x);
        if (this.u) {
            writer.print(prefix);
            writer.print("  mNeedMenuInvalidate=");
            writer.println(this.u);
        }
    }

    public static g O0(float startScale, float endScale, float startAlpha, float endAlpha) {
        AnimationSet set = new AnimationSet(false);
        ScaleAnimation scale = new ScaleAnimation(startScale, endScale, startScale, endScale, 1, 0.5f, 1, 0.5f);
        scale.setInterpolator(I);
        scale.setDuration(220);
        set.addAnimation(scale);
        AlphaAnimation alpha = new AlphaAnimation(startAlpha, endAlpha);
        alpha.setInterpolator(J);
        alpha.setDuration(220);
        set.addAnimation(alpha);
        return new g(set);
    }

    public static g M0(float start, float end) {
        AlphaAnimation anim = new AlphaAnimation(start, end);
        anim.setInterpolator(J);
        anim.setDuration(220);
        return new g(anim);
    }

    public g K0(Fragment fragment, int transit, boolean enter, int transitionStyle) {
        int styleIndex;
        int nextAnim = fragment.getNextAnim();
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation animation = fragment.onCreateAnimation(transit, enter, nextAnim);
        if (animation != null) {
            return new g(animation);
        }
        Animator animator = fragment.onCreateAnimator(transit, enter, nextAnim);
        if (animator != null) {
            return new g(animator);
        }
        if (nextAnim != 0) {
            boolean isAnim = "anim".equals(this.q.e().getResources().getResourceTypeName(nextAnim));
            boolean successfulLoad = false;
            if (isAnim) {
                try {
                    Animation animation2 = AnimationUtils.loadAnimation(this.q.e(), nextAnim);
                    if (animation2 != null) {
                        return new g(animation2);
                    }
                    successfulLoad = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                }
            }
            if (!successfulLoad) {
                try {
                    Animator animator2 = AnimatorInflater.loadAnimator(this.q.e(), nextAnim);
                    if (animator2 != null) {
                        return new g(animator2);
                    }
                } catch (RuntimeException e4) {
                    if (!isAnim) {
                        Animation animation3 = AnimationUtils.loadAnimation(this.q.e(), nextAnim);
                        if (animation3 != null) {
                            return new g(animation3);
                        }
                    } else {
                        throw e4;
                    }
                }
            }
        }
        if (transit == 0 || (styleIndex = p1(transit, enter)) < 0) {
            return null;
        }
        switch (styleIndex) {
            case 1:
                return O0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return O0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return O0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return O0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return M0(0.0f, 1.0f);
            case 6:
                return M0(1.0f, 0.0f);
            default:
                if (transitionStyle == 0 && this.q.l()) {
                    transitionStyle = this.q.k();
                }
                return transitionStyle == 0 ? null : null;
        }
    }

    public void V0(Fragment f2) {
        if (!f2.mDeferStart) {
            return;
        }
        if (this.f1053e) {
            this.y = true;
            return;
        }
        f2.mDeferStart = false;
        T0(f2, this.p, 0, 0, false);
    }

    public boolean I0(int state) {
        return this.p >= state;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        if (r1 != 3) goto L_0x02bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b2  */
    public void T0(Fragment f2, int newState, int transit, int transitionStyle, boolean keepActive) {
        int newState2;
        int newState3;
        Fragment target;
        boolean shouldClear;
        ViewGroup viewGroup;
        String resName;
        String str;
        int i2;
        boolean z2 = true;
        if (!f2.mAdded || f2.mDetached) {
            newState2 = newState;
            if (newState2 > 1) {
                newState2 = 1;
            }
        } else {
            newState2 = newState;
        }
        if (f2.mRemoving && newState2 > (i2 = f2.mState)) {
            if (i2 != 0 || !f2.isInBackStack()) {
                newState2 = f2.mState;
            } else {
                newState2 = 1;
            }
        }
        if (f2.mDeferStart && f2.mState < 3 && newState2 > 2) {
            newState2 = 2;
        }
        d.b bVar = f2.mMaxState;
        if (bVar == d.b.CREATED) {
            newState3 = Math.min(newState2, 1);
        } else {
            newState3 = Math.min(newState2, bVar.ordinal());
        }
        int i3 = f2.mState;
        if (i3 <= newState3) {
            if (!f2.mFromLayout || f2.mInLayout) {
                if (!(f2.getAnimatingAway() == null && f2.getAnimator() == null)) {
                    f2.setAnimatingAway(null);
                    f2.setAnimator(null);
                    T0(f2, f2.getStateAfterAnimating(), 0, 0, true);
                }
                int i4 = f2.mState;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                        }
                        if (newState3 > 2) {
                            f2.performStart();
                            S(f2, false);
                        }
                        if (newState3 > 3) {
                            f2.performResume();
                            Q(f2, false);
                            f2.mSavedFragmentState = null;
                            f2.mSavedViewState = null;
                        }
                    }
                } else if (newState3 > 0) {
                    Bundle bundle = f2.mSavedFragmentState;
                    if (bundle != null) {
                        bundle.setClassLoader(this.q.e().getClassLoader());
                        f2.mSavedViewState = f2.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                        Fragment target2 = c(f2.mSavedFragmentState, "android:target_state");
                        String str2 = target2 != null ? target2.mWho : null;
                        f2.mTargetWho = str2;
                        if (str2 != null) {
                            f2.mTargetRequestCode = f2.mSavedFragmentState.getInt("android:target_req_state", 0);
                        }
                        Boolean bool = f2.mSavedUserVisibleHint;
                        if (bool != null) {
                            f2.mUserVisibleHint = bool.booleanValue();
                            f2.mSavedUserVisibleHint = null;
                        } else {
                            f2.mUserVisibleHint = f2.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
                        }
                        if (!f2.mUserVisibleHint) {
                            f2.mDeferStart = true;
                            if (newState3 > 2) {
                                newState3 = 2;
                            }
                        }
                    }
                    h hVar = this.q;
                    f2.mHost = hVar;
                    Fragment fragment = this.s;
                    f2.mParentFragment = fragment;
                    f2.mFragmentManager = fragment != null ? fragment.mChildFragmentManager : hVar.f1049f;
                    Fragment fragment2 = f2.mTarget;
                    if (fragment2 != null) {
                        Fragment fragment3 = this.h.get(fragment2.mWho);
                        Fragment fragment4 = f2.mTarget;
                        if (fragment3 == fragment4) {
                            if (fragment4.mState < 1) {
                                str = "Fragment ";
                                T0(fragment4, 1, 0, 0, true);
                            } else {
                                str = "Fragment ";
                            }
                            f2.mTargetWho = f2.mTarget.mWho;
                            f2.mTarget = null;
                        } else {
                            throw new IllegalStateException("Fragment " + f2 + " declared target fragment " + f2.mTarget + " that does not belong to this FragmentManager!");
                        }
                    } else {
                        str = "Fragment ";
                    }
                    String str3 = f2.mTargetWho;
                    if (str3 != null) {
                        Fragment target3 = this.h.get(str3);
                        if (target3 == null) {
                            throw new IllegalStateException(str + f2 + " declared target fragment " + f2.mTargetWho + " that does not belong to this FragmentManager!");
                        } else if (target3.mState < 1) {
                            T0(target3, 1, 0, 0, true);
                        }
                    }
                    O(f2, this.q.e(), false);
                    f2.performAttach();
                    Fragment fragment5 = f2.mParentFragment;
                    if (fragment5 == null) {
                        this.q.g(f2);
                    } else {
                        fragment5.onAttachFragment(f2);
                    }
                    J(f2, this.q.e(), false);
                    if (!f2.mIsCreated) {
                        P(f2, f2.mSavedFragmentState, false);
                        f2.performCreate(f2.mSavedFragmentState);
                        K(f2, f2.mSavedFragmentState, false);
                    } else {
                        f2.restoreChildFragmentState(f2.mSavedFragmentState);
                        f2.mState = 1;
                    }
                }
                if (newState3 > 0) {
                    l0(f2);
                }
                if (newState3 > 1) {
                    if (!f2.mFromLayout) {
                        ViewGroup container = null;
                        int i5 = f2.mContainerId;
                        if (i5 != 0) {
                            if (i5 != -1) {
                                container = (ViewGroup) this.r.b(i5);
                                if (container == null && !f2.mRestored) {
                                    try {
                                        resName = f2.getResources().getResourceName(f2.mContainerId);
                                    } catch (Resources.NotFoundException e2) {
                                        resName = "unknown";
                                    }
                                    o1(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(f2.mContainerId) + " (" + resName + ") for fragment " + f2));
                                    throw null;
                                }
                            } else {
                                o1(new IllegalArgumentException("Cannot create fragment " + f2 + " for a container view with no id"));
                                throw null;
                            }
                        }
                        f2.mContainer = container;
                        f2.performCreateView(f2.performGetLayoutInflater(f2.mSavedFragmentState), container, f2.mSavedFragmentState);
                        View view = f2.mView;
                        if (view != null) {
                            f2.mInnerView = view;
                            view.setSaveFromParentEnabled(false);
                            if (container != null) {
                                container.addView(f2.mView);
                            }
                            if (f2.mHidden) {
                                f2.mView.setVisibility(8);
                            }
                            f2.onViewCreated(f2.mView, f2.mSavedFragmentState);
                            U(f2, f2.mView, f2.mSavedFragmentState, false);
                            if (f2.mView.getVisibility() != 0 || f2.mContainer == null) {
                                z2 = false;
                            }
                            f2.mIsNewlyAdded = z2;
                        } else {
                            f2.mInnerView = null;
                        }
                    }
                    f2.performActivityCreated(f2.mSavedFragmentState);
                    I(f2, f2.mSavedFragmentState, false);
                    if (f2.mView != null) {
                        f2.restoreViewState(f2.mSavedFragmentState);
                    }
                    f2.mSavedFragmentState = null;
                }
                if (newState3 > 2) {
                }
                if (newState3 > 3) {
                }
            } else {
                return;
            }
        } else if (i3 > newState3) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            if (newState3 < 4) {
                                f2.performPause();
                                N(f2, false);
                            }
                        }
                    }
                    if (newState3 < 3) {
                        f2.performStop();
                        T(f2, false);
                    }
                }
                if (newState3 < 2) {
                    if (f2.mView != null && this.q.n(f2) && f2.mSavedViewState == null) {
                        h1(f2);
                    }
                    f2.performDestroyView();
                    V(f2, false);
                    View view2 = f2.mView;
                    if (view2 != null && (viewGroup = f2.mContainer) != null) {
                        viewGroup.endViewTransition(view2);
                        f2.mView.clearAnimation();
                        g anim = null;
                        if (f2.getParentFragment() == null || !f2.getParentFragment().mRemoving) {
                            if (this.p > 0 && !this.x) {
                                if (f2.mView.getVisibility() == 0 && f2.mPostponedAlpha >= 0.0f) {
                                    anim = K0(f2, transit, false, transitionStyle);
                                }
                            }
                            f2.mPostponedAlpha = 0.0f;
                            if (anim != null) {
                                p(f2, anim, newState3);
                            }
                            f2.mContainer.removeView(f2.mView);
                        }
                    }
                    f2.mContainer = null;
                    f2.mView = null;
                    f2.mViewLifecycleOwner = null;
                    f2.mViewLifecycleOwnerLiveData.g(null);
                    f2.mInnerView = null;
                    f2.mInLayout = false;
                }
            }
            if (newState3 < 1) {
                if (this.x) {
                    if (f2.getAnimatingAway() != null) {
                        View v2 = f2.getAnimatingAway();
                        f2.setAnimatingAway(null);
                        v2.clearAnimation();
                    } else if (f2.getAnimator() != null) {
                        Animator animator = f2.getAnimator();
                        f2.setAnimator(null);
                        animator.cancel();
                    }
                }
                if (f2.getAnimatingAway() == null && f2.getAnimator() == null) {
                    boolean beingRemoved = f2.mRemoving && !f2.isInBackStack();
                    if (beingRemoved || this.F.l(f2)) {
                        h hVar2 = this.q;
                        if (hVar2 instanceof s) {
                            shouldClear = this.F.j();
                        } else if (hVar2.e() instanceof Activity) {
                            shouldClear = !((Activity) this.q.e()).isChangingConfigurations();
                        } else {
                            shouldClear = true;
                        }
                        if (beingRemoved || shouldClear) {
                            this.F.e(f2);
                        }
                        f2.performDestroy();
                        L(f2, false);
                    } else {
                        f2.mState = 0;
                    }
                    f2.performDetach();
                    M(f2, false);
                    if (!keepActive) {
                        if (beingRemoved || this.F.l(f2)) {
                            N0(f2);
                        } else {
                            f2.mHost = null;
                            f2.mParentFragment = null;
                            f2.mFragmentManager = null;
                            String str4 = f2.mTargetWho;
                            if (!(str4 == null || (target = this.h.get(str4)) == null || !target.getRetainInstance())) {
                                f2.mTarget = target;
                            }
                        }
                    }
                } else {
                    f2.setStateAfterAnimating(newState3);
                    newState3 = 1;
                }
            }
        }
        if (f2.mState != newState3) {
            Log.w("FragmentManager", "moveToState: Fragment state for " + f2 + " not updated inline; expected state " + newState3 + " found " + f2.mState);
            f2.mState = newState3;
        }
    }

    public final void p(Fragment fragment, g anim, int newState) {
        View viewToAnimate = fragment.mView;
        ViewGroup container = fragment.mContainer;
        container.startViewTransition(viewToAnimate);
        fragment.setStateAfterAnimating(newState);
        if (anim.f1070a != null) {
            Animation animation = new h(anim.f1070a, container, viewToAnimate);
            fragment.setAnimatingAway(fragment.mView);
            animation.setAnimationListener(new c(container, fragment));
            fragment.mView.startAnimation(animation);
            return;
        }
        Animator animator = anim.f1071b;
        fragment.setAnimator(anim.f1071b);
        animator.addListener(new d(container, viewToAnimate, fragment));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    public class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1058a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Fragment f1059b;

        public c(ViewGroup viewGroup, Fragment fragment) {
            this.f1058a = viewGroup;
            this.f1059b = fragment;
        }

        public void onAnimationStart(Animation animation) {
        }

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                if (c.this.f1059b.getAnimatingAway() != null) {
                    c.this.f1059b.setAnimatingAway(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f1059b;
                    jVar.T0(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        }

        public void onAnimationEnd(Animation animation) {
            this.f1058a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1062a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1063b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Fragment f1064c;

        public d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1062a = viewGroup;
            this.f1063b = view;
            this.f1064c = fragment;
        }

        public void onAnimationEnd(Animator anim) {
            this.f1062a.endViewTransition(this.f1063b);
            Animator animator = this.f1064c.getAnimator();
            this.f1064c.setAnimator(null);
            if (animator != null && this.f1062a.indexOfChild(this.f1063b) < 0) {
                j jVar = j.this;
                Fragment fragment = this.f1064c;
                jVar.T0(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
            }
        }
    }

    public void S0(Fragment f2) {
        T0(f2, this.p, 0, 0, false);
    }

    public void l0(Fragment f2) {
        if (f2.mFromLayout && !f2.mPerformedCreateView) {
            f2.performCreateView(f2.performGetLayoutInflater(f2.mSavedFragmentState), null, f2.mSavedFragmentState);
            View view = f2.mView;
            if (view != null) {
                f2.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (f2.mHidden) {
                    f2.mView.setVisibility(8);
                }
                f2.onViewCreated(f2.mView, f2.mSavedFragmentState);
                U(f2, f2.mView, f2.mSavedFragmentState, false);
                return;
            }
            f2.mInnerView = null;
        }
    }

    public void x(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            g anim = K0(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (anim == null || (animator = anim.f1071b) == null) {
                if (anim != null) {
                    fragment.mView.startAnimation(anim.f1070a);
                    anim.f1070a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup container = fragment.mContainer;
                    View animatingView = fragment.mView;
                    container.startViewTransition(animatingView);
                    anim.f1071b.addListener(new e(this, container, animatingView, fragment));
                }
                anim.f1071b.start();
            }
        }
        if (fragment.mAdded && G0(fragment)) {
            this.u = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1066a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1067b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Fragment f1068c;

        public e(j this$0, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1066a = viewGroup;
            this.f1067b = view;
            this.f1068c = fragment;
        }

        public void onAnimationEnd(Animator animation) {
            this.f1066a.endViewTransition(this.f1067b);
            animation.removeListener(this);
            Fragment fragment = this.f1068c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    public void Q0(Fragment f2) {
        ViewGroup container;
        int underIndex;
        int viewIndex;
        if (f2 != null && this.h.containsKey(f2.mWho)) {
            int nextState = this.p;
            if (f2.mRemoving) {
                if (f2.isInBackStack()) {
                    nextState = Math.min(nextState, 1);
                } else {
                    nextState = Math.min(nextState, 0);
                }
            }
            T0(f2, nextState, f2.getNextTransition(), f2.getNextTransitionStyle(), false);
            if (f2.mView != null) {
                Fragment underFragment = u0(f2);
                if (underFragment != null && (viewIndex = container.indexOfChild(f2.mView)) < (underIndex = (container = f2.mContainer).indexOfChild(underFragment.mView))) {
                    container.removeViewAt(viewIndex);
                    container.addView(f2.mView, underIndex);
                }
                if (f2.mIsNewlyAdded && f2.mContainer != null) {
                    float f3 = f2.mPostponedAlpha;
                    if (f3 > 0.0f) {
                        f2.mView.setAlpha(f3);
                    }
                    f2.mPostponedAlpha = 0.0f;
                    f2.mIsNewlyAdded = false;
                    g anim = K0(f2, f2.getNextTransition(), true, f2.getNextTransitionStyle());
                    if (anim != null) {
                        Animation animation = anim.f1070a;
                        if (animation != null) {
                            f2.mView.startAnimation(animation);
                        } else {
                            anim.f1071b.setTarget(f2.mView);
                            anim.f1071b.start();
                        }
                    }
                }
            }
            if (f2.mHiddenChanged) {
                x(f2);
            }
        }
    }

    public void R0(int newState, boolean always) {
        h hVar;
        if (this.q == null && newState != 0) {
            throw new IllegalStateException("No activity");
        } else if (always || newState != this.p) {
            this.p = newState;
            int numAdded = this.f1055g.size();
            for (int i2 = 0; i2 < numAdded; i2++) {
                Q0(this.f1055g.get(i2));
            }
            for (Fragment f2 : this.h.values()) {
                if (f2 != null && ((f2.mRemoving || f2.mDetached) && !f2.mIsNewlyAdded)) {
                    Q0(f2);
                }
            }
            n1();
            if (this.u && (hVar = this.q) != null && this.p == 4) {
                hVar.r();
                this.u = false;
            }
        }
    }

    public void n1() {
        for (Fragment f2 : this.h.values()) {
            if (f2 != null) {
                V0(f2);
            }
        }
    }

    public void L0(Fragment f2) {
        if (this.h.get(f2.mWho) == null) {
            this.h.put(f2.mWho, f2);
            if (f2.mRetainInstanceChangedWhileDetached) {
                if (f2.mRetainInstance) {
                    n(f2);
                } else {
                    b1(f2);
                }
                f2.mRetainInstanceChangedWhileDetached = false;
            }
        }
    }

    public void N0(Fragment f2) {
        if (this.h.get(f2.mWho) != null) {
            for (Fragment fragment : this.h.values()) {
                if (fragment != null && f2.mWho.equals(fragment.mTargetWho)) {
                    fragment.mTarget = f2;
                    fragment.mTargetWho = null;
                }
            }
            this.h.put(f2.mWho, null);
            b1(f2);
            String str = f2.mTargetWho;
            if (str != null) {
                f2.mTarget = this.h.get(str);
            }
            f2.initState();
        }
    }

    public void m(Fragment fragment, boolean moveToStateNow) {
        L0(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f1055g.contains(fragment)) {
            synchronized (this.f1055g) {
                this.f1055g.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (G0(fragment)) {
                this.u = true;
            }
            if (moveToStateNow) {
                S0(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void Z0(Fragment fragment) {
        boolean inactive = !fragment.isInBackStack();
        if (!fragment.mDetached || inactive) {
            synchronized (this.f1055g) {
                this.f1055g.remove(fragment);
            }
            if (G0(fragment)) {
                this.u = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public void E0(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public void m1(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void y(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.f1055g) {
                    this.f1055g.remove(fragment);
                }
                if (G0(fragment)) {
                    this.u = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public void r(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f1055g.contains(fragment)) {
                synchronized (this.f1055g) {
                    this.f1055g.add(fragment);
                }
                fragment.mAdded = true;
                if (G0(fragment)) {
                    this.u = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public Fragment r0(int id) {
        for (int i2 = this.f1055g.size() - 1; i2 >= 0; i2--) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null && f2.mFragmentId == id) {
                return f2;
            }
        }
        for (Fragment f3 : this.h.values()) {
            if (f3 != null && f3.mFragmentId == id) {
                return f3;
            }
        }
        return null;
    }

    public Fragment s0(String tag) {
        if (tag != null) {
            for (int i2 = this.f1055g.size() - 1; i2 >= 0; i2--) {
                Fragment f2 = this.f1055g.get(i2);
                if (f2 != null && tag.equals(f2.mTag)) {
                    return f2;
                }
            }
        }
        if (tag == null) {
            return null;
        }
        for (Fragment f3 : this.h.values()) {
            if (f3 != null && tag.equals(f3.mTag)) {
                return f3;
            }
        }
        return null;
    }

    public Fragment t0(String who) {
        Fragment f2;
        for (Fragment f3 : this.h.values()) {
            if (!(f3 == null || (f2 = f3.findFragmentByWho(who)) == null)) {
                return f2;
            }
        }
        return null;
    }

    public final void u() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean J0() {
        return this.v || this.w;
    }

    public void j0(k action, boolean allowStateLoss) {
        if (!allowStateLoss) {
            u();
        }
        synchronized (this) {
            if (!this.x) {
                if (this.q != null) {
                    if (this.f1052d == null) {
                        this.f1052d = new ArrayList<>();
                    }
                    this.f1052d.add(action);
                    i1();
                    return;
                }
            }
            if (!allowStateLoss) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void i1() {
        synchronized (this) {
            boolean pendingReady = false;
            boolean postponeReady = this.E != null && !this.E.isEmpty();
            if (this.f1052d != null && this.f1052d.size() == 1) {
                pendingReady = true;
            }
            if (postponeReady || pendingReady) {
                this.q.f().removeCallbacks(this.G);
                this.q.f().post(this.G);
                q1();
            }
        }
    }

    public int o(a bse) {
        synchronized (this) {
            if (this.n != null) {
                if (this.n.size() > 0) {
                    int index = this.n.remove(this.n.size() - 1).intValue();
                    this.m.set(index, bse);
                    return index;
                }
            }
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int index2 = this.m.size();
            this.m.add(bse);
            return index2;
        }
    }

    public void j1(int index, a bse) {
        synchronized (this) {
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int N = this.m.size();
            if (index < N) {
                this.m.set(index, bse);
            } else {
                while (N < index) {
                    this.m.add(null);
                    if (this.n == null) {
                        this.n = new ArrayList<>();
                    }
                    this.n.add(Integer.valueOf(N));
                    N++;
                }
                this.m.add(bse);
            }
        }
    }

    public void w0(int index) {
        synchronized (this) {
            this.m.set(index, null);
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            this.n.add(Integer.valueOf(index));
        }
    }

    public final void k0(boolean allowStateLoss) {
        if (this.f1053e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.q == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.q.f().getLooper()) {
            if (!allowStateLoss) {
                u();
            }
            if (this.z == null) {
                this.z = new ArrayList<>();
                this.A = new ArrayList<>();
            }
            this.f1053e = true;
            try {
                q0(null, null);
            } finally {
                this.f1053e = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public void n0(k action, boolean allowStateLoss) {
        if (!allowStateLoss || (this.q != null && !this.x)) {
            k0(allowStateLoss);
            if (action.a(this.z, this.A)) {
                this.f1053e = true;
                try {
                    a1(this.z, this.A);
                } finally {
                    v();
                }
            }
            q1();
            h0();
            s();
        }
    }

    public final void v() {
        this.f1053e = false;
        this.A.clear();
        this.z.clear();
    }

    /* JADX INFO: finally extract failed */
    public boolean m0() {
        k0(true);
        boolean didSomething = false;
        while (x0(this.z, this.A)) {
            this.f1053e = true;
            try {
                a1(this.z, this.A);
                v();
                didSomething = true;
            } catch (Throwable th) {
                v();
                throw th;
            }
        }
        q1();
        h0();
        s();
        return didSomething;
    }

    public final void q0(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop) {
        int index;
        int index2;
        ArrayList<m> arrayList2 = this.E;
        int numPostponed = arrayList2 == null ? 0 : arrayList2.size();
        int i2 = 0;
        while (i2 < numPostponed) {
            m listener = this.E.get(i2);
            if (arrayList != null && !listener.f1083a && (index2 = arrayList.indexOf(listener.f1084b)) != -1 && isRecordPop.get(index2).booleanValue()) {
                this.E.remove(i2);
                i2--;
                numPostponed--;
                listener.a();
            } else if (listener.c() || (arrayList != null && listener.f1084b.u(arrayList, 0, arrayList.size()))) {
                this.E.remove(i2);
                i2--;
                numPostponed--;
                if (arrayList == null || listener.f1083a || (index = arrayList.indexOf(listener.f1084b)) == -1 || !isRecordPop.get(index).booleanValue()) {
                    listener.b();
                } else {
                    listener.a();
                }
            }
            i2++;
        }
    }

    public final void a1(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (isRecordPop == null || arrayList.size() != isRecordPop.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            q0(arrayList, isRecordPop);
            int numRecords = arrayList.size();
            int startIndex = 0;
            int recordNum = 0;
            while (recordNum < numRecords) {
                if (!arrayList.get(recordNum).p) {
                    if (startIndex != recordNum) {
                        p0(arrayList, isRecordPop, startIndex, recordNum);
                    }
                    int reorderingEnd = recordNum + 1;
                    if (isRecordPop.get(recordNum).booleanValue()) {
                        while (reorderingEnd < numRecords && isRecordPop.get(reorderingEnd).booleanValue() && !arrayList.get(reorderingEnd).p) {
                            reorderingEnd++;
                        }
                    }
                    p0(arrayList, isRecordPop, recordNum, reorderingEnd);
                    startIndex = reorderingEnd;
                    recordNum = reorderingEnd - 1;
                }
                recordNum++;
            }
            if (startIndex != numRecords) {
                p0(arrayList, isRecordPop, startIndex, numRecords);
            }
        }
    }

    public final void p0(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        int i2;
        boolean allowReordering = arrayList.get(startIndex).p;
        ArrayList<Fragment> arrayList2 = this.B;
        if (arrayList2 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.B.addAll(this.f1055g);
        int recordNum = startIndex;
        boolean addToBackStack = false;
        Fragment oldPrimaryNav = B0();
        while (true) {
            boolean z2 = true;
            if (recordNum >= endIndex) {
                break;
            }
            a record = arrayList.get(recordNum);
            if (!isRecordPop.get(recordNum).booleanValue()) {
                oldPrimaryNav = record.r(this.B, oldPrimaryNav);
            } else {
                oldPrimaryNav = record.z(this.B, oldPrimaryNav);
            }
            if (!addToBackStack && !record.h) {
                z2 = false;
            }
            addToBackStack = z2;
            recordNum++;
        }
        this.B.clear();
        if (!allowReordering) {
            p.C(this, arrayList, isRecordPop, startIndex, endIndex, false);
        }
        o0(arrayList, isRecordPop, startIndex, endIndex);
        int postponeIndex = endIndex;
        if (allowReordering) {
            ArraySet<Fragment> addedFragments = new a.e.b<>();
            k(addedFragments);
            postponeIndex = Y0(arrayList, isRecordPop, startIndex, endIndex, addedFragments);
            P0(addedFragments);
        }
        if (postponeIndex != startIndex && allowReordering) {
            p.C(this, arrayList, isRecordPop, startIndex, postponeIndex, true);
            R0(this.p, true);
        }
        for (int recordNum2 = startIndex; recordNum2 < endIndex; recordNum2++) {
            a record2 = arrayList.get(recordNum2);
            if (isRecordPop.get(recordNum2).booleanValue() && (i2 = record2.t) >= 0) {
                w0(i2);
                record2.t = -1;
            }
            record2.x();
        }
        if (addToBackStack) {
            c1();
        }
    }

    public final void P0(a.e.b<Fragment> bVar) {
        int numAdded = bVar.size();
        for (int i2 = 0; i2 < numAdded; i2++) {
            Fragment fragment = bVar.h(i2);
            if (!fragment.mAdded) {
                View view = fragment.requireView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    public final int Y0(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, a.e.b<Fragment> bVar) {
        int postponeIndex = endIndex;
        for (int i2 = endIndex - 1; i2 >= startIndex; i2--) {
            a record = arrayList.get(i2);
            boolean isPop = isRecordPop.get(i2).booleanValue();
            if (record.w() && !record.u(arrayList, i2 + 1, endIndex)) {
                if (this.E == null) {
                    this.E = new ArrayList<>();
                }
                m listener = new m(record, isPop);
                this.E.add(listener);
                record.y(listener);
                if (isPop) {
                    record.p();
                } else {
                    record.q(false);
                }
                postponeIndex--;
                if (i2 != postponeIndex) {
                    arrayList.remove(i2);
                    arrayList.add(postponeIndex, record);
                }
                k(bVar);
            }
        }
        return postponeIndex;
    }

    public void w(a record, boolean isPop, boolean runTransitions, boolean moveToState) {
        if (isPop) {
            record.q(moveToState);
        } else {
            record.p();
        }
        ArrayList<BackStackRecord> records = new ArrayList<>(1);
        ArrayList<Boolean> isRecordPop = new ArrayList<>(1);
        records.add(record);
        isRecordPop.add(Boolean.valueOf(isPop));
        if (runTransitions) {
            p.C(this, records, isRecordPop, 0, 1, true);
        }
        if (moveToState) {
            R0(this.p, true);
        }
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && record.t(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (moveToState) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public final Fragment u0(Fragment f2) {
        ViewGroup container = f2.mContainer;
        View view = f2.mView;
        if (container == null || view == null) {
            return null;
        }
        for (int i2 = this.f1055g.indexOf(f2) - 1; i2 >= 0; i2--) {
            Fragment underFragment = this.f1055g.get(i2);
            if (underFragment.mContainer == container && underFragment.mView != null) {
                return underFragment;
            }
        }
        return null;
    }

    public static void o0(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        for (int i2 = startIndex; i2 < endIndex; i2++) {
            a record = arrayList.get(i2);
            boolean moveToState = true;
            if (isRecordPop.get(i2).booleanValue()) {
                record.l(-1);
                if (i2 != endIndex - 1) {
                    moveToState = false;
                }
                record.q(moveToState);
            } else {
                record.l(1);
                record.p();
            }
        }
    }

    public final void k(a.e.b<Fragment> bVar) {
        int i2 = this.p;
        if (i2 >= 1) {
            int state = Math.min(i2, 3);
            int numAdded = this.f1055g.size();
            for (int i3 = 0; i3 < numAdded; i3++) {
                Fragment fragment = this.f1055g.get(i3);
                if (fragment.mState < state) {
                    T0(fragment, state, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    public final void v0() {
        if (this.E != null) {
            while (!this.E.isEmpty()) {
                this.E.remove(0).b();
            }
        }
    }

    public final void i0() {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    T0(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    public final boolean x0(ArrayList<a> arrayList, ArrayList<Boolean> isPop) {
        boolean didSomething = false;
        synchronized (this) {
            if (this.f1052d != null) {
                if (this.f1052d.size() != 0) {
                    int numActions = this.f1052d.size();
                    for (int i2 = 0; i2 < numActions; i2++) {
                        didSomething |= this.f1052d.get(i2).a(arrayList, isPop);
                    }
                    this.f1052d.clear();
                    this.q.f().removeCallbacks(this.G);
                    return didSomething;
                }
            }
            return false;
        }
    }

    public void h0() {
        if (this.y) {
            this.y = false;
            n1();
        }
    }

    public void c1() {
    }

    public void l(a state) {
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.add(state);
    }

    public boolean X0(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop, String name, int id, int flags) {
        ArrayList<a> arrayList2 = this.i;
        if (arrayList2 == null) {
            return false;
        }
        if (name == null && id < 0 && (flags & 1) == 0) {
            int last = arrayList2.size() - 1;
            if (last < 0) {
                return false;
            }
            arrayList.add(this.i.remove(last));
            isRecordPop.add(true);
        } else {
            int index = -1;
            if (name != null || id >= 0) {
                index = this.i.size() - 1;
                while (index >= 0) {
                    a bss = this.i.get(index);
                    if ((name != null && name.equals(bss.s())) || (id >= 0 && id == bss.t)) {
                        break;
                    }
                    index--;
                }
                if (index < 0) {
                    return false;
                }
                if ((flags & 1) != 0) {
                    index--;
                    while (index >= 0) {
                        a bss2 = this.i.get(index);
                        if ((name == null || !name.equals(bss2.s())) && (id < 0 || id != bss2.t)) {
                            break;
                        }
                        index--;
                    }
                }
            }
            if (index == this.i.size() - 1) {
                return false;
            }
            for (int i2 = this.i.size() - 1; i2 > index; i2--) {
                arrayList.add(this.i.remove(i2));
                isRecordPop.add(true);
            }
        }
        return true;
    }

    public void h1(Fragment f2) {
        if (f2.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.D;
            if (sparseArray == null) {
                this.D = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            f2.mInnerView.saveHierarchyState(this.D);
            if (this.D.size() > 0) {
                f2.mSavedViewState = this.D;
                this.D = null;
            }
        }
    }

    public Bundle g1(Fragment f2) {
        Bundle result = null;
        if (this.C == null) {
            this.C = new Bundle();
        }
        f2.performSaveInstanceState(this.C);
        R(f2, this.C, false);
        if (!this.C.isEmpty()) {
            result = this.C;
            this.C = null;
        }
        if (f2.mView != null) {
            h1(f2);
        }
        if (f2.mSavedViewState != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray("android:view_state", f2.mSavedViewState);
        }
        if (!f2.mUserVisibleHint) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean("android:user_visible_hint", f2.mUserVisibleHint);
        }
        return result;
    }

    public Parcelable f1() {
        int size;
        v0();
        i0();
        m0();
        this.v = true;
        if (this.h.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> active = new ArrayList<>(this.h.size());
        boolean haveFragments = false;
        for (Fragment f2 : this.h.values()) {
            if (f2 != null) {
                if (f2.mFragmentManager == this) {
                    haveFragments = true;
                    m fs = new m(f2);
                    active.add(fs);
                    if (f2.mState <= 0 || fs.n != null) {
                        fs.n = f2.mSavedFragmentState;
                    } else {
                        fs.n = g1(f2);
                        String str = f2.mTargetWho;
                        if (str == null) {
                            continue;
                        } else {
                            Fragment target = this.h.get(str);
                            if (target != null) {
                                if (fs.n == null) {
                                    fs.n = new Bundle();
                                }
                                h(fs.n, "android:target_state", target);
                                int i2 = f2.mTargetRequestCode;
                                if (i2 != 0) {
                                    fs.n.putInt("android:target_req_state", i2);
                                }
                            } else {
                                o1(new IllegalStateException("Failure saving state: " + f2 + " has target not in fragment manager: " + f2.mTargetWho));
                                throw null;
                            }
                        }
                    }
                } else {
                    o1(new IllegalStateException("Failure saving state: active " + f2 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!haveFragments) {
            return null;
        }
        ArrayList<String> added = null;
        b[] backStack = null;
        int size2 = this.f1055g.size();
        if (size2 > 0) {
            added = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f1055g.iterator();
            while (it.hasNext()) {
                Fragment f3 = it.next();
                added.add(f3.mWho);
                if (f3.mFragmentManager != this) {
                    o1(new IllegalStateException("Failure saving state: active " + f3 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        ArrayList<a> arrayList = this.i;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStack = new b[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStack[i3] = new b(this.i.get(i3));
            }
        }
        k fms = new k();
        fms.f1086b = active;
        fms.f1087c = added;
        fms.f1088d = backStack;
        Fragment fragment = this.t;
        if (fragment != null) {
            fms.f1089e = fragment.mWho;
        }
        fms.f1090f = this.f1054f;
        return fms;
    }

    public void d1(Parcelable state) {
        m fs;
        if (state != null) {
            k fms = (k) state;
            if (fms.f1086b != null) {
                for (Fragment f2 : this.F.h()) {
                    Iterator<m> it = fms.f1086b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fs = null;
                            break;
                        }
                        m fragmentState = it.next();
                        if (fragmentState.f1098c.equals(f2.mWho)) {
                            fs = fragmentState;
                            break;
                        }
                    }
                    if (fs == null) {
                        T0(f2, 1, 0, 0, false);
                        f2.mRemoving = true;
                        T0(f2, 0, 0, 0, false);
                    } else {
                        fs.o = f2;
                        f2.mSavedViewState = null;
                        f2.mBackStackNesting = 0;
                        f2.mInLayout = false;
                        f2.mAdded = false;
                        Fragment fragment = f2.mTarget;
                        f2.mTargetWho = fragment != null ? fragment.mWho : null;
                        f2.mTarget = null;
                        Bundle bundle = fs.n;
                        if (bundle != null) {
                            bundle.setClassLoader(this.q.e().getClassLoader());
                            f2.mSavedViewState = fs.n.getSparseParcelableArray("android:view_state");
                            f2.mSavedFragmentState = fs.n;
                        }
                    }
                }
                this.h.clear();
                Iterator<m> it2 = fms.f1086b.iterator();
                while (it2.hasNext()) {
                    m fs2 = it2.next();
                    if (fs2 != null) {
                        Fragment f3 = fs2.a(this.q.e().getClassLoader(), d());
                        f3.mFragmentManager = this;
                        this.h.put(f3.mWho, f3);
                        fs2.o = null;
                    }
                }
                this.f1055g.clear();
                ArrayList<String> arrayList = fms.f1087c;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String who = it3.next();
                        Fragment f4 = this.h.get(who);
                        if (f4 != null) {
                            f4.mAdded = true;
                            if (!this.f1055g.contains(f4)) {
                                synchronized (this.f1055g) {
                                    this.f1055g.add(f4);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + f4);
                            }
                        } else {
                            o1(new IllegalStateException("No instantiated fragment for (" + who + ")"));
                            throw null;
                        }
                    }
                }
                if (fms.f1088d != null) {
                    this.i = new ArrayList<>(fms.f1088d.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = fms.f1088d;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        a bse = bVarArr[i2].a(this);
                        this.i.add(bse);
                        int i3 = bse.t;
                        if (i3 >= 0) {
                            j1(i3, bse);
                        }
                        i2++;
                    }
                } else {
                    this.i = null;
                }
                String str = fms.f1089e;
                if (str != null) {
                    Fragment fragment2 = this.h.get(str);
                    this.t = fragment2;
                    Y(fragment2);
                }
                this.f1054f = fms.f1090f;
            }
        }
    }

    public final void s() {
        this.h.values().removeAll(Collections.singleton(null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: a.a.c */
    /* JADX WARN: Multi-variable type inference failed */
    public void q(h host, e container, Fragment parent) {
        if (this.q == null) {
            this.q = host;
            this.r = container;
            this.s = parent;
            if (parent != null) {
                q1();
            }
            if (host instanceof a.a.c) {
                a.a.c dispatcherOwner = (a.a.c) host;
                this.k = dispatcherOwner.getOnBackPressedDispatcher();
                this.k.a(parent != null ? parent : dispatcherOwner, this.l);
            }
            if (parent != null) {
                this.F = parent.mFragmentManager.z0(parent);
            } else if (host instanceof s) {
                this.F = l.g(((s) host).getViewModelStore());
            } else {
                this.F = new l(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public void U0() {
        this.v = false;
        this.w = false;
        int addedCount = this.f1055g.size();
        for (int i2 = 0; i2 < addedCount; i2++) {
            Fragment fragment = this.f1055g.get(i2);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void C() {
        this.v = false;
        this.w = false;
        f0(1);
    }

    public void z() {
        this.v = false;
        this.w = false;
        f0(2);
    }

    public void e0() {
        this.v = false;
        this.w = false;
        f0(3);
    }

    public void d0() {
        this.v = false;
        this.w = false;
        f0(4);
    }

    public void Z() {
        f0(3);
    }

    public void g0() {
        this.w = true;
        f0(2);
    }

    public void F() {
        f0(1);
    }

    public void E() {
        this.x = true;
        m0();
        f0(0);
        this.q = null;
        this.r = null;
        this.s = null;
        if (this.k != null) {
            this.l.d();
            this.k = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void f0(int nextState) {
        try {
            this.f1053e = true;
            R0(nextState, false);
            this.f1053e = false;
            m0();
        } catch (Throwable th) {
            this.f1053e = false;
            throw th;
        }
    }

    public void H(boolean isInMultiWindowMode) {
        for (int i2 = this.f1055g.size() - 1; i2 >= 0; i2--) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null) {
                f2.performMultiWindowModeChanged(isInMultiWindowMode);
            }
        }
    }

    public void a0(boolean isInPictureInPictureMode) {
        for (int i2 = this.f1055g.size() - 1; i2 >= 0; i2--) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null) {
                f2.performPictureInPictureModeChanged(isInPictureInPictureMode);
            }
        }
    }

    public void A(Configuration newConfig) {
        for (int i2 = 0; i2 < this.f1055g.size(); i2++) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null) {
                f2.performConfigurationChanged(newConfig);
            }
        }
    }

    public void G() {
        for (int i2 = 0; i2 < this.f1055g.size(); i2++) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null) {
                f2.performLowMemory();
            }
        }
    }

    public boolean D(Menu menu, MenuInflater inflater) {
        if (this.p < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<Fragment> newMenus = null;
        for (int i2 = 0; i2 < this.f1055g.size(); i2++) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null && f2.performCreateOptionsMenu(menu, inflater)) {
                show = true;
                if (newMenus == null) {
                    newMenus = new ArrayList<>();
                }
                newMenus.add(f2);
            }
        }
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                Fragment f3 = this.j.get(i3);
                if (newMenus == null || !newMenus.contains(f3)) {
                    f3.onDestroyOptionsMenu();
                }
            }
        }
        this.j = newMenus;
        return show;
    }

    public boolean b0(Menu menu) {
        if (this.p < 1) {
            return false;
        }
        boolean show = false;
        for (int i2 = 0; i2 < this.f1055g.size(); i2++) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null && f2.performPrepareOptionsMenu(menu)) {
                show = true;
            }
        }
        return show;
    }

    public boolean W(MenuItem item) {
        if (this.p < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1055g.size(); i2++) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null && f2.performOptionsItemSelected(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean B(MenuItem item) {
        if (this.p < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1055g.size(); i2++) {
            Fragment f2 = this.f1055g.get(i2);
            if (f2 != null && f2.performContextItemSelected(item)) {
                return true;
            }
        }
        return false;
    }

    public void X(Menu menu) {
        if (this.p >= 1) {
            for (int i2 = 0; i2 < this.f1055g.size(); i2++) {
                Fragment f2 = this.f1055g.get(i2);
                if (f2 != null) {
                    f2.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public void l1(Fragment f2) {
        if (f2 == null || (this.h.get(f2.mWho) == f2 && (f2.mHost == null || f2.getFragmentManager() == this))) {
            Fragment previousPrimaryNav = this.t;
            this.t = f2;
            Y(previousPrimaryNav);
            Y(this.t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + f2 + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(Fragment f2) {
        if (f2 != null && this.h.get(f2.mWho) == f2) {
            f2.performPrimaryNavigationFragmentChanged();
        }
    }

    public void c0() {
        q1();
        Y(this.t);
    }

    public Fragment B0() {
        return this.t;
    }

    public void k1(Fragment f2, d.b state) {
        if (this.h.get(f2.mWho) == f2 && (f2.mHost == null || f2.getFragmentManager() == this)) {
            f2.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + f2 + " is not an active fragment of FragmentManager " + this);
    }

    @Override // a.k.a.i
    public g d() {
        if (super.d() == i.f1050c) {
            Fragment fragment = this.s;
            if (fragment != null) {
                return fragment.mFragmentManager.d();
            }
            j(new f());
        }
        return super.d();
    }

    public class f extends g {
        public f() {
        }

        @Override // a.k.a.g
        public Fragment a(ClassLoader classLoader, String className) {
            h hVar = j.this.q;
            return hVar.a(hVar.e(), className, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void O(Fragment f2, Context context, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).O(f2, context, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void J(Fragment f2, Context context, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).J(f2, context, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void P(Fragment f2, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).P(f2, savedInstanceState, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void K(Fragment f2, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).K(f2, savedInstanceState, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void I(Fragment f2, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).I(f2, savedInstanceState, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void U(Fragment f2, View v2, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).U(f2, v2, savedInstanceState, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void S(Fragment f2, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).S(f2, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void Q(Fragment f2, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).Q(f2, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void N(Fragment f2, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).N(f2, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void T(Fragment f2, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).T(f2, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void R(Fragment f2, Bundle outState, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).R(f2, outState, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void V(Fragment f2, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).V(f2, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void L(Fragment f2, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).L(f2, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public void M(Fragment f2, boolean onlyRecursive) {
        Fragment fragment = this.s;
        if (fragment != null) {
            i parentManager = fragment.getFragmentManager();
            if (parentManager instanceof j) {
                ((j) parentManager).M(f2, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i holder = it.next();
            if (!onlyRecursive || holder.f1077a) {
                throw null;
            }
            while (it.hasNext()) {
            }
        }
    }

    public boolean t() {
        boolean hasMenu = false;
        for (Fragment f2 : this.h.values()) {
            if (f2 != null) {
                hasMenu = G0(f2);
                continue;
            }
            if (hasMenu) {
                return true;
            }
        }
        return false;
    }

    public final boolean G0(Fragment f2) {
        return (f2.mHasMenu && f2.mMenuVisible) || f2.mChildFragmentManager.t();
    }

    public static int e1(int transit) {
        if (transit == 4097) {
            return 8194;
        }
        if (transit == 4099) {
            return 4099;
        }
        if (transit != 8194) {
            return 0;
        }
        return 4097;
    }

    public static int p1(int transit, boolean enter) {
        if (transit == 4097) {
            return enter ? 1 : 2;
        } else if (transit == 4099) {
            return enter ? 5 : 6;
        } else if (transit != 8194) {
            return -1;
        } else {
            return enter ? 3 : 4;
        }
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        String fname;
        Fragment fragment;
        Fragment fragment2 = null;
        if (!"fragment".equals(name)) {
            return null;
        }
        String fname2 = attrs.getAttributeValue(null, "class");
        TypedArray a2 = context.obtainStyledAttributes(attrs, C0030j.f1078a);
        int containerId = 0;
        if (fname2 == null) {
            fname = a2.getString(0);
        } else {
            fname = fname2;
        }
        int id = a2.getResourceId(1, -1);
        String tag = a2.getString(2);
        a2.recycle();
        if (fname == null || !g.b(context.getClassLoader(), fname)) {
            return null;
        }
        if (parent != null) {
            containerId = parent.getId();
        }
        if (containerId == -1 && id == -1 && tag == null) {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + fname);
        }
        if (id != -1) {
            fragment2 = r0(id);
        }
        if (fragment2 == null && tag != null) {
            fragment2 = s0(tag);
        }
        if (fragment2 == null && containerId != -1) {
            fragment2 = r0(containerId);
        }
        if (fragment2 == null) {
            Fragment fragment3 = d().a(context.getClassLoader(), fname);
            fragment3.mFromLayout = true;
            fragment3.mFragmentId = id != 0 ? id : containerId;
            fragment3.mContainerId = containerId;
            fragment3.mTag = tag;
            fragment3.mInLayout = true;
            fragment3.mFragmentManager = this;
            h hVar = this.q;
            fragment3.mHost = hVar;
            fragment3.onInflate(hVar.e(), attrs, fragment3.mSavedFragmentState);
            m(fragment3, true);
            fragment = fragment3;
        } else if (!fragment2.mInLayout) {
            fragment2.mInLayout = true;
            h hVar2 = this.q;
            fragment2.mHost = hVar2;
            fragment2.onInflate(hVar2.e(), attrs, fragment2.mSavedFragmentState);
            fragment = fragment2;
        } else {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(id) + ", tag " + tag + ", or parent id 0x" + Integer.toHexString(containerId) + " with another fragment for " + fname);
        }
        if (this.p >= 1 || !fragment.mFromLayout) {
            S0(fragment);
        } else {
            T0(fragment, 1, 0, 0, false);
        }
        View view = fragment.mView;
        if (view != null) {
            if (id != 0) {
                view.setId(id);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(tag);
            }
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + fname + " did not create a view.");
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    public LayoutInflater.Factory2 A0() {
        return this;
    }

    public class l implements k {

        /* renamed from: a  reason: collision with root package name */
        public final String f1079a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1080b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1081c;

        public l(String name, int id, int flags) {
            this.f1079a = name;
            this.f1080b = id;
            this.f1081c = flags;
        }

        @Override // a.k.a.j.k
        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop) {
            Fragment fragment = j.this.t;
            if (fragment == null || this.f1080b >= 0 || this.f1079a != null || !fragment.getChildFragmentManager().g()) {
                return j.this.X0(arrayList, isRecordPop, this.f1079a, this.f1080b, this.f1081c);
            }
            return false;
        }
    }

    public static class m implements Fragment.f {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f1083a;

        /* renamed from: b  reason: collision with root package name */
        public final a f1084b;

        /* renamed from: c  reason: collision with root package name */
        public int f1085c;

        public m(a record, boolean isBack) {
            this.f1083a = isBack;
            this.f1084b = record;
        }

        public void d() {
            int i = this.f1085c - 1;
            this.f1085c = i;
            if (i == 0) {
                this.f1084b.r.i1();
            }
        }

        public void e() {
            this.f1085c++;
        }

        public boolean c() {
            return this.f1085c == 0;
        }

        public void b() {
            boolean z = false;
            boolean canceled = this.f1085c > 0;
            j manager = this.f1084b.r;
            int numAdded = manager.f1055g.size();
            for (int i = 0; i < numAdded; i++) {
                Fragment fragment = manager.f1055g.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (canceled && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            a aVar = this.f1084b;
            j jVar = aVar.r;
            boolean z2 = this.f1083a;
            if (!canceled) {
                z = true;
            }
            jVar.w(aVar, z2, z, true);
        }

        public void a() {
            a aVar = this.f1084b;
            aVar.r.w(aVar, this.f1083a, false, false);
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1070a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1071b;

        public g(Animation animation) {
            this.f1070a = animation;
            this.f1071b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public g(Animator animator) {
            this.f1070a = null;
            this.f1071b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class h extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f1072b;

        /* renamed from: c  reason: collision with root package name */
        public final View f1073c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1074d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1075e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1076f = true;

        public h(Animation animation, ViewGroup parent, View child) {
            super(false);
            this.f1072b = parent;
            this.f1073c = child;
            addAnimation(animation);
            this.f1072b.post(this);
        }

        public boolean getTransformation(long currentTime, Transformation t) {
            this.f1076f = true;
            if (this.f1074d) {
                return true ^ this.f1075e;
            }
            if (!super.getTransformation(currentTime, t)) {
                this.f1074d = true;
                q.a(this.f1072b, this);
            }
            return true;
        }

        public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) {
            this.f1076f = true;
            if (this.f1074d) {
                return true ^ this.f1075e;
            }
            if (!super.getTransformation(currentTime, outTransformation, scale)) {
                this.f1074d = true;
                q.a(this.f1072b, this);
            }
            return true;
        }

        public void run() {
            if (this.f1074d || !this.f1076f) {
                this.f1072b.endViewTransition(this.f1073c);
                this.f1075e = true;
                return;
            }
            this.f1076f = false;
            this.f1072b.post(this);
        }
    }
}
