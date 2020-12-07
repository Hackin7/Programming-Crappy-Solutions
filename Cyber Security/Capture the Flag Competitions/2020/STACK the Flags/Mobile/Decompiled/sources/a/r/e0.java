package a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class e0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f1361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1362b;

    public e0(f0 this$0, u uVar, View view) {
        this.f1361a = uVar;
        this.f1362b = view;
    }

    public void onAnimationEnd(Animator animation) {
        this.f1361a.a(this.f1362b);
    }
}
