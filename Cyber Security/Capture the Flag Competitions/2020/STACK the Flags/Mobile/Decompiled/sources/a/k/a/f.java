package a.k.a;

import a.h.l.h;
import a.m.s;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final h<?> f1043a;

    public static f b(h<?> hVar) {
        h.c(hVar, "callbacks == null");
        return new f(hVar);
    }

    public f(h<?> hVar) {
        this.f1043a = hVar;
    }

    public i u() {
        return this.f1043a.f1049f;
    }

    public Fragment t(String who) {
        return this.f1043a.f1049f.t0(who);
    }

    public void a(Fragment parent) {
        h<?> hVar = this.f1043a;
        hVar.f1049f.q(hVar, hVar, parent);
    }

    public View w(View parent, String name, Context context, AttributeSet attrs) {
        return this.f1043a.f1049f.onCreateView(parent, name, context, attrs);
    }

    public void v() {
        this.f1043a.f1049f.U0();
    }

    public Parcelable y() {
        return this.f1043a.f1049f.f1();
    }

    public void x(Parcelable state) {
        h<?> hVar = this.f1043a;
        if (hVar instanceof s) {
            hVar.f1049f.d1(state);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void f() {
        this.f1043a.f1049f.C();
    }

    public void c() {
        this.f1043a.f1049f.z();
    }

    public void q() {
        this.f1043a.f1049f.e0();
    }

    public void p() {
        this.f1043a.f1049f.d0();
    }

    public void m() {
        this.f1043a.f1049f.Z();
    }

    public void r() {
        this.f1043a.f1049f.g0();
    }

    public void h() {
        this.f1043a.f1049f.E();
    }

    public void j(boolean isInMultiWindowMode) {
        this.f1043a.f1049f.H(isInMultiWindowMode);
    }

    public void n(boolean isInPictureInPictureMode) {
        this.f1043a.f1049f.a0(isInPictureInPictureMode);
    }

    public void d(Configuration newConfig) {
        this.f1043a.f1049f.A(newConfig);
    }

    public void i() {
        this.f1043a.f1049f.G();
    }

    public boolean g(Menu menu, MenuInflater inflater) {
        return this.f1043a.f1049f.D(menu, inflater);
    }

    public boolean o(Menu menu) {
        return this.f1043a.f1049f.b0(menu);
    }

    public boolean k(MenuItem item) {
        return this.f1043a.f1049f.W(item);
    }

    public boolean e(MenuItem item) {
        return this.f1043a.f1049f.B(item);
    }

    public void l(Menu menu) {
        this.f1043a.f1049f.X(menu);
    }

    public boolean s() {
        return this.f1043a.f1049f.m0();
    }
}
