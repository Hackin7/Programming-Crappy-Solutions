package a.o.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1287a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f1288b;

    /* renamed from: c  reason: collision with root package name */
    public int f1289c;

    /* renamed from: d  reason: collision with root package name */
    public int f1290d;

    /* renamed from: e  reason: collision with root package name */
    public int f1291e;

    /* renamed from: f  reason: collision with root package name */
    public int f1292f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1293g = 0;
    public boolean h;
    public boolean i;

    public boolean a(RecyclerView.y state) {
        int i2 = this.f1289c;
        return i2 >= 0 && i2 < state.b();
    }

    public View b(RecyclerView.u recycler) {
        View view = recycler.o(this.f1289c);
        this.f1289c += this.f1290d;
        return view;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1288b + ", mCurrentPosition=" + this.f1289c + ", mItemDirection=" + this.f1290d + ", mLayoutDirection=" + this.f1291e + ", mStartLine=" + this.f1292f + ", mEndLine=" + this.f1293g + '}';
    }
}
