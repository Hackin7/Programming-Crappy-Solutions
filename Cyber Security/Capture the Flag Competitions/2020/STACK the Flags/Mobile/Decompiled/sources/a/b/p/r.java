package a.b.p;

import a.h.f.l.c;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class r {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f405c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f406a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f407b;

    public r(ProgressBar view) {
        this.f406a = view;
    }

    public void c(AttributeSet attrs, int defStyleAttr) {
        w0 a2 = w0.u(this.f406a.getContext(), attrs, f405c, defStyleAttr, 0);
        Drawable drawable = a2.g(0);
        if (drawable != null) {
            this.f406a.setIndeterminateDrawable(e(drawable));
        }
        Drawable drawable2 = a2.g(1);
        if (drawable2 != null) {
            this.f406a.setProgressDrawable(d(drawable2, false));
        }
        a2.v();
    }

    public final Drawable d(Drawable drawable, boolean clip) {
        if (drawable instanceof c) {
            Drawable inner = ((c) drawable).a();
            if (inner != null) {
                ((c) drawable).b(d(inner, clip));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable background = (LayerDrawable) drawable;
            int N = background.getNumberOfLayers();
            Drawable[] outDrawables = new Drawable[N];
            for (int i = 0; i < N; i++) {
                int id = background.getId(i);
                outDrawables[i] = d(background.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable newBg = new LayerDrawable(outDrawables);
            for (int i2 = 0; i2 < N; i2++) {
                newBg.setId(i2, background.getId(i2));
            }
            return newBg;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap tileBitmap = bitmapDrawable.getBitmap();
            if (this.f407b == null) {
                this.f407b = tileBitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return clip ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable background = (AnimationDrawable) drawable;
        int N = background.getNumberOfFrames();
        AnimationDrawable newBg = new AnimationDrawable();
        newBg.setOneShot(background.isOneShot());
        for (int i = 0; i < N; i++) {
            Drawable frame = d(background.getFrame(i), true);
            frame.setLevel(10000);
            newBg.addFrame(frame, background.getDuration(i));
        }
        newBg.setLevel(10000);
        return newBg;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap b() {
        return this.f407b;
    }
}
