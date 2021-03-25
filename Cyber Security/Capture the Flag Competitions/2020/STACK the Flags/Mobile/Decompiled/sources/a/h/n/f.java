package a.h.n;

import android.widget.ListView;

public class f extends a {
    public final ListView s;

    public f(ListView target) {
        super(target);
        this.s = target;
    }

    @Override // a.h.n.a
    public void j(int deltaX, int deltaY) {
        g.a(this.s, deltaY);
    }

    @Override // a.h.n.a
    public boolean a(int direction) {
        return false;
    }

    @Override // a.h.n.a
    public boolean b(int direction) {
        ListView target = this.s;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition < itemCount || target.getChildAt(childCount - 1).getBottom() > target.getHeight()) {
                return true;
            }
            return false;
        } else if (direction >= 0) {
            return false;
        } else {
            if (firstPosition > 0 || target.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
    }
}
