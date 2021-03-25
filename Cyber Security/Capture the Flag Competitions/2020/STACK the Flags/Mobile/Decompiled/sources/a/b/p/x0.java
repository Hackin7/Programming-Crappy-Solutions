package a.b.p;

import a.b.o.j.a;
import android.view.View;
import android.view.Window;

public class x0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final a f452b = new a(this.f453c.f465a.getContext(), 0, 16908332, 0, this.f453c.i);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y0 f453c;

    public x0(y0 this$0) {
        this.f453c = this$0;
    }

    public void onClick(View v) {
        y0 y0Var = this.f453c;
        Window.Callback callback = y0Var.l;
        if (callback != null && y0Var.m) {
            callback.onMenuItemSelected(0, this.f452b);
        }
    }
}
