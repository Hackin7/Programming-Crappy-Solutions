package p000;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: gk */
public final class C0390gk {

    /* renamed from: a */
    public final View f1727a;

    /* renamed from: b */
    public boolean f1728b;

    /* renamed from: c */
    private ViewParent f1729c;

    /* renamed from: d */
    private ViewParent f1730d;

    /* renamed from: e */
    private int[] f1731e;

    public C0390gk(View view) {
        this.f1727a = view;
    }

    /* renamed from: a */
    public final void mo1810a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1729c = viewParent;
                return;
            case 1:
                this.f1730d = viewParent;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final boolean mo1811a(int i) {
        return mo1815b(i) != null;
    }

    /* renamed from: a */
    public final boolean mo1812a(int i, int i2) {
        if (mo1811a(i2)) {
            return true;
        }
        if (this.f1728b) {
            View view = this.f1727a;
            for (ViewParent parent = this.f1727a.getParent(); parent != null; parent = parent.getParent()) {
                if (C0401gs.m1287a(parent, view, this.f1727a, i, i2)) {
                    mo1810a(i2, parent);
                    View view2 = this.f1727a;
                    if (parent instanceof C0392gm) {
                        ((C0392gm) parent).mo743a(i, i2);
                        return true;
                    }
                    if (i2 == 0) {
                        if (VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view2, i);
                                return true;
                            } catch (AbstractMethodError e) {
                                StringBuilder sb = new StringBuilder("ViewParent ");
                                sb.append(parent);
                                sb.append(" does not implement interface method onNestedScrollAccepted");
                                Log.e("ViewParentCompat", sb.toString(), e);
                                return true;
                            }
                        } else if (parent instanceof C0391gl) {
                            ((C0391gl) parent).onNestedScrollAccepted(view, view2, i);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1813a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        int i7;
        int i8 = i4;
        int[] iArr2 = iArr;
        int i9 = i5;
        if (this.f1728b) {
            ViewParent b = mo1815b(i9);
            if (b == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i8 != 0) {
                if (iArr2 != null) {
                    this.f1727a.getLocationInWindow(iArr2);
                    int i10 = iArr2[0];
                    i6 = iArr2[1];
                    i7 = i10;
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                View view = this.f1727a;
                if (b instanceof C0392gm) {
                    ((C0392gm) b).mo752b(i8, i9);
                } else if (i9 == 0) {
                    if (VERSION.SDK_INT >= 21) {
                        try {
                            b.onNestedScroll(view, i, i2, i3, i8);
                        } catch (AbstractMethodError e) {
                            StringBuilder sb = new StringBuilder("ViewParent ");
                            sb.append(b);
                            sb.append(" does not implement interface method onNestedScroll");
                            Log.e("ViewParentCompat", sb.toString(), e);
                        }
                    } else if (b instanceof C0391gl) {
                        ((C0391gl) b).onNestedScroll(view, i, i2, i3, i8);
                    }
                }
                if (iArr2 != null) {
                    this.f1727a.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i7;
                    iArr2[1] = iArr2[1] - i6;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1814a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (this.f1728b) {
            ViewParent b = mo1815b(i3);
            if (b == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f1727a.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f1731e == null) {
                        this.f1731e = new int[2];
                    }
                    iArr = this.f1731e;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                View view = this.f1727a;
                if (b instanceof C0392gm) {
                    ((C0392gm) b).mo744a(i, i2, iArr, i3);
                } else if (i3 == 0) {
                    if (VERSION.SDK_INT >= 21) {
                        try {
                            b.onNestedPreScroll(view, i, i2, iArr);
                        } catch (AbstractMethodError e) {
                            StringBuilder sb = new StringBuilder("ViewParent ");
                            sb.append(b);
                            sb.append(" does not implement interface method onNestedPreScroll");
                            Log.e("ViewParentCompat", sb.toString(), e);
                        }
                    } else if (b instanceof C0391gl) {
                        ((C0391gl) b).onNestedPreScroll(view, i, i2, iArr);
                    }
                }
                if (iArr2 != null) {
                    this.f1727a.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ViewParent mo1815b(int i) {
        switch (i) {
            case 0:
                return this.f1729c;
            case 1:
                return this.f1730d;
            default:
                return null;
        }
    }
}
