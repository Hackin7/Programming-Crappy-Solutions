package a.k.a;

import a.k.a.j;
import a.k.a.o;
import a.m.d;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a extends o implements j.k {
    public final j r;
    public boolean s;
    public int t = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    public void n(String prefix, PrintWriter writer) {
        o(prefix, writer, true);
    }

    public void o(String prefix, PrintWriter writer, boolean full) {
        String cmdStr;
        if (full) {
            writer.print(prefix);
            writer.print("mName=");
            writer.print(this.i);
            writer.print(" mIndex=");
            writer.print(this.t);
            writer.print(" mCommitted=");
            writer.println(this.s);
            if (this.f1108f != 0) {
                writer.print(prefix);
                writer.print("mTransition=#");
                writer.print(Integer.toHexString(this.f1108f));
                writer.print(" mTransitionStyle=#");
                writer.println(Integer.toHexString(this.f1109g));
            }
            if (!(this.f1104b == 0 && this.f1105c == 0)) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.f1104b));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.f1105c));
            }
            if (!(this.f1106d == 0 && this.f1107e == 0)) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.f1106d));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.f1107e));
            }
            if (!(this.j == 0 && this.k == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.j));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbShortTitleRes=#");
                writer.print(Integer.toHexString(this.l));
                writer.print(" mBreadCrumbShortTitleText=");
                writer.println(this.m);
            }
        }
        if (!this.f1103a.isEmpty()) {
            writer.print(prefix);
            writer.println("Operations:");
            int numOps = this.f1103a.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                o.a op = this.f1103a.get(opNum);
                switch (op.f1110a) {
                    case 0:
                        cmdStr = "NULL";
                        break;
                    case 1:
                        cmdStr = "ADD";
                        break;
                    case 2:
                        cmdStr = "REPLACE";
                        break;
                    case 3:
                        cmdStr = "REMOVE";
                        break;
                    case 4:
                        cmdStr = "HIDE";
                        break;
                    case 5:
                        cmdStr = "SHOW";
                        break;
                    case 6:
                        cmdStr = "DETACH";
                        break;
                    case 7:
                        cmdStr = "ATTACH";
                        break;
                    case 8:
                        cmdStr = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        cmdStr = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        cmdStr = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        cmdStr = "cmd=" + op.f1110a;
                        break;
                }
                writer.print(prefix);
                writer.print("  Op #");
                writer.print(opNum);
                writer.print(": ");
                writer.print(cmdStr);
                writer.print(" ");
                writer.println(op.f1111b);
                if (full) {
                    if (!(op.f1112c == 0 && op.f1113d == 0)) {
                        writer.print(prefix);
                        writer.print("enterAnim=#");
                        writer.print(Integer.toHexString(op.f1112c));
                        writer.print(" exitAnim=#");
                        writer.println(Integer.toHexString(op.f1113d));
                    }
                    if (op.f1114e != 0 || op.f1115f != 0) {
                        writer.print(prefix);
                        writer.print("popEnterAnim=#");
                        writer.print(Integer.toHexString(op.f1114e));
                        writer.print(" popExitAnim=#");
                        writer.println(Integer.toHexString(op.f1115f));
                    }
                }
            }
        }
    }

    public a(j manager) {
        this.r = manager;
    }

    @Override // a.k.a.o
    public void i(int containerViewId, Fragment fragment, String tag, int opcmd) {
        super.i(containerViewId, fragment, tag, opcmd);
        fragment.mFragmentManager = this.r;
    }

    @Override // a.k.a.o
    public o j(Fragment fragment) {
        j jVar = fragment.mFragmentManager;
        if (jVar == null || jVar == this.r) {
            super.j(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // a.k.a.o
    public o k(Fragment fragment, d.b state) {
        if (fragment.mFragmentManager != this.r) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.r);
        } else if (state.a(d.b.CREATED)) {
            super.k(fragment, state);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + d.b.CREATED);
        }
    }

    public void l(int amt) {
        if (this.h) {
            boolean z = j.H;
            int numOps = this.f1103a.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                Fragment fragment = this.f1103a.get(opNum).f1111b;
                if (fragment != null) {
                    fragment.mBackStackNesting += amt;
                    boolean z2 = j.H;
                }
            }
        }
    }

    public void x() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    @Override // a.k.a.o
    public int e() {
        return m(false);
    }

    @Override // a.k.a.o
    public int f() {
        return m(true);
    }

    @Override // a.k.a.o
    public void g() {
        h();
        this.r.n0(this, true);
    }

    public int m(boolean allowStateLoss) {
        if (!this.s) {
            boolean z = j.H;
            this.s = true;
            if (this.h) {
                this.t = this.r.o(this);
            } else {
                this.t = -1;
            }
            this.r.j0(this, allowStateLoss);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // a.k.a.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> isRecordPop) {
        boolean z = j.H;
        arrayList.add(this);
        isRecordPop.add(false);
        if (!this.h) {
            return true;
        }
        this.r.l(this);
        return true;
    }

    public boolean t(int containerId) {
        int numOps = this.f1103a.size();
        int opNum = 0;
        while (true) {
            int fragContainer = 0;
            if (opNum >= numOps) {
                return false;
            }
            Fragment fragment = this.f1103a.get(opNum).f1111b;
            if (fragment != null) {
                fragContainer = fragment.mContainerId;
            }
            if (fragContainer != 0 && fragContainer == containerId) {
                return true;
            }
            opNum++;
        }
    }

    public boolean u(ArrayList<a> arrayList, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.f1103a.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            Fragment fragment = this.f1103a.get(opNum).f1111b;
            int container = fragment != null ? fragment.mContainerId : 0;
            if (!(container == 0 || container == lastContainer)) {
                lastContainer = container;
                for (int i = startIndex; i < endIndex; i++) {
                    a record = arrayList.get(i);
                    int numThoseOps = record.f1103a.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        Fragment fragment2 = record.f1103a.get(thoseOpIndex).f1111b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == container) {
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    public void p() {
        int numOps = this.f1103a.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            o.a op = this.f1103a.get(opNum);
            Fragment f2 = op.f1111b;
            if (f2 != null) {
                f2.setNextTransition(this.f1108f, this.f1109g);
            }
            switch (op.f1110a) {
                case 1:
                    f2.setNextAnim(op.f1112c);
                    this.r.m(f2, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f1110a);
                case 3:
                    f2.setNextAnim(op.f1113d);
                    this.r.Z0(f2);
                    break;
                case 4:
                    f2.setNextAnim(op.f1113d);
                    this.r.E0(f2);
                    break;
                case 5:
                    f2.setNextAnim(op.f1112c);
                    this.r.m1(f2);
                    break;
                case 6:
                    f2.setNextAnim(op.f1113d);
                    this.r.y(f2);
                    break;
                case 7:
                    f2.setNextAnim(op.f1112c);
                    this.r.r(f2);
                    break;
                case 8:
                    this.r.l1(f2);
                    break;
                case 9:
                    this.r.l1(null);
                    break;
                case 10:
                    this.r.k1(f2, op.h);
                    break;
            }
            if (!(this.p || op.f1110a == 1 || f2 == null)) {
                this.r.Q0(f2);
            }
        }
        if (!this.p) {
            j jVar = this.r;
            jVar.R0(jVar.p, true);
        }
    }

    public void q(boolean moveToState) {
        for (int opNum = this.f1103a.size() - 1; opNum >= 0; opNum--) {
            o.a op = this.f1103a.get(opNum);
            Fragment f2 = op.f1111b;
            if (f2 != null) {
                f2.setNextTransition(j.e1(this.f1108f), this.f1109g);
            }
            switch (op.f1110a) {
                case 1:
                    f2.setNextAnim(op.f1115f);
                    this.r.Z0(f2);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f1110a);
                case 3:
                    f2.setNextAnim(op.f1114e);
                    this.r.m(f2, false);
                    break;
                case 4:
                    f2.setNextAnim(op.f1114e);
                    this.r.m1(f2);
                    break;
                case 5:
                    f2.setNextAnim(op.f1115f);
                    this.r.E0(f2);
                    break;
                case 6:
                    f2.setNextAnim(op.f1114e);
                    this.r.r(f2);
                    break;
                case 7:
                    f2.setNextAnim(op.f1115f);
                    this.r.y(f2);
                    break;
                case 8:
                    this.r.l1(null);
                    break;
                case 9:
                    this.r.l1(f2);
                    break;
                case 10:
                    this.r.k1(f2, op.f1116g);
                    break;
            }
            if (!(this.p || op.f1110a == 3 || f2 == null)) {
                this.r.Q0(f2);
            }
        }
        if (!this.p && moveToState) {
            j jVar = this.r;
            jVar.R0(jVar.p, true);
        }
    }

    public Fragment r(ArrayList<Fragment> added, Fragment oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.f1103a.size()) {
            o.a op = this.f1103a.get(opNum);
            int i = op.f1110a;
            if (i != 1) {
                if (i == 2) {
                    Fragment f2 = op.f1111b;
                    int containerId = f2.mContainerId;
                    boolean alreadyAdded = false;
                    for (int i2 = added.size() - 1; i2 >= 0; i2--) {
                        Fragment old = added.get(i2);
                        if (old.mContainerId == containerId) {
                            if (old == f2) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.f1103a.add(opNum, new o.a(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                o.a removeOp = new o.a(3, old);
                                removeOp.f1112c = op.f1112c;
                                removeOp.f1114e = op.f1114e;
                                removeOp.f1113d = op.f1113d;
                                removeOp.f1115f = op.f1115f;
                                this.f1103a.add(opNum, removeOp);
                                added.remove(old);
                                opNum++;
                            }
                        }
                    }
                    if (alreadyAdded) {
                        this.f1103a.remove(opNum);
                        opNum--;
                    } else {
                        op.f1110a = 1;
                        added.add(f2);
                    }
                } else if (i == 3 || i == 6) {
                    added.remove(op.f1111b);
                    Fragment fragment = op.f1111b;
                    if (fragment == oldPrimaryNav) {
                        this.f1103a.add(opNum, new o.a(9, fragment));
                        opNum++;
                        oldPrimaryNav = null;
                    }
                } else if (i != 7) {
                    if (i == 8) {
                        this.f1103a.add(opNum, new o.a(9, oldPrimaryNav));
                        opNum++;
                        oldPrimaryNav = op.f1111b;
                    }
                }
                opNum++;
            }
            added.add(op.f1111b);
            opNum++;
        }
        return oldPrimaryNav;
    }

    public Fragment z(ArrayList<Fragment> added, Fragment oldPrimaryNav) {
        for (int opNum = this.f1103a.size() - 1; opNum >= 0; opNum--) {
            o.a op = this.f1103a.get(opNum);
            int i = op.f1110a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            oldPrimaryNav = null;
                            break;
                        case 9:
                            oldPrimaryNav = op.f1111b;
                            break;
                        case 10:
                            op.h = op.f1116g;
                            break;
                    }
                }
                added.add(op.f1111b);
            }
            added.remove(op.f1111b);
        }
        return oldPrimaryNav;
    }

    public boolean w() {
        for (int opNum = 0; opNum < this.f1103a.size(); opNum++) {
            if (v(this.f1103a.get(opNum))) {
                return true;
            }
        }
        return false;
    }

    public void y(Fragment.f listener) {
        for (int opNum = 0; opNum < this.f1103a.size(); opNum++) {
            o.a op = this.f1103a.get(opNum);
            if (v(op)) {
                op.f1111b.setOnStartEnterTransitionListener(listener);
            }
        }
    }

    public static boolean v(o.a op) {
        Fragment fragment = op.f1111b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    public String s() {
        return this.i;
    }
}
