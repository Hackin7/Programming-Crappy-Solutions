package a.r;

import android.view.View;
import android.view.WindowId;

public class g0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f1375a;

    public g0(View view) {
        this.f1375a = view.getWindowId();
    }

    public boolean equals(Object o) {
        return (o instanceof g0) && ((g0) o).f1375a.equals(this.f1375a);
    }

    public int hashCode() {
        return this.f1375a.hashCode();
    }
}
