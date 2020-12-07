package a.b.p;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class b0 extends ToggleButton {

    /* renamed from: b  reason: collision with root package name */
    public final y f279b;

    public b0(Context context, AttributeSet attrs) {
        this(context, attrs, 16842827);
    }

    public b0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        r0.a(this, getContext());
        y yVar = new y(this);
        this.f279b = yVar;
        yVar.m(attrs, defStyleAttr);
    }
}
