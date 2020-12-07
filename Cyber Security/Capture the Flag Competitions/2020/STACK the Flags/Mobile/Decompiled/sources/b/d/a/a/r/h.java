package b.d.a.a.r;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class h extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public int f2646b;

    public h(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public h(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2646b = getVisibility();
    }

    public void setVisibility(int visibility) {
        b(visibility, true);
    }

    public final void b(int visibility, boolean fromUser) {
        super.setVisibility(visibility);
        if (fromUser) {
            this.f2646b = visibility;
        }
    }

    public final int getUserSetVisibility() {
        return this.f2646b;
    }
}
