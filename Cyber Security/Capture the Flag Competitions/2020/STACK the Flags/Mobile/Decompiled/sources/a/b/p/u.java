package a.b.p;

import a.b.a;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class u extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    public final v f420b;

    public u(Context context, AttributeSet attrs) {
        this(context, attrs, a.seekBarStyle);
    }

    public u(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        r0.a(this, getContext());
        v vVar = new v(this);
        this.f420b = vVar;
        vVar.c(attrs, defStyleAttr);
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f420b.g(canvas);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f420b.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f420b.i();
    }
}
