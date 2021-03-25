package a.k.a;

import a.h.d.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class h<E> extends e {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f1045b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1046c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1047d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1048e;

    /* renamed from: f  reason: collision with root package name */
    public final j f1049f;

    public abstract E i();

    public h(d activity) {
        this(activity, activity, new Handler(), 0);
    }

    public h(Activity activity, Context context, Handler handler, int windowAnimations) {
        this.f1049f = new j();
        this.f1045b = activity;
        a.h.l.h.c(context, "context == null");
        this.f1046c = context;
        a.h.l.h.c(handler, "handler == null");
        this.f1047d = handler;
        this.f1048e = windowAnimations;
    }

    public void h(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
    }

    public boolean n(Fragment fragment) {
        return true;
    }

    public LayoutInflater j() {
        return LayoutInflater.from(this.f1046c);
    }

    public void r() {
    }

    public void p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int requestCode, Bundle options) {
        if (requestCode == -1) {
            this.f1046c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void q(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        if (requestCode == -1) {
            a.o(this.f1045b, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void m(Fragment fragment, String[] permissions, int requestCode) {
    }

    public boolean o(String permission) {
        return false;
    }

    public boolean l() {
        return true;
    }

    public int k() {
        return this.f1048e;
    }

    @Override // a.k.a.e
    public View b(int id) {
        return null;
    }

    @Override // a.k.a.e
    public boolean c() {
        return true;
    }

    public Activity d() {
        return this.f1045b;
    }

    public Context e() {
        return this.f1046c;
    }

    public Handler f() {
        return this.f1047d;
    }

    public void g(Fragment fragment) {
    }
}
