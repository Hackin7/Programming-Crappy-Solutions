package a.r;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f1399a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1400b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f1401c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f1401c = z;
    }

    public static View a(ViewGroup sceneRoot, View view, View parent) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-parent.getScrollX()), (float) (-parent.getScrollY()));
        z.j(view, matrix);
        z.k(sceneRoot, matrix);
        RectF bounds = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(bounds);
        int left = Math.round(bounds.left);
        int top = Math.round(bounds.top);
        int right = Math.round(bounds.right);
        int bottom = Math.round(bounds.bottom);
        ImageView copy = new ImageView(view.getContext());
        copy.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = b(view, matrix, bounds, sceneRoot);
        if (bitmap != null) {
            copy.setImageBitmap(bitmap);
        }
        copy.measure(View.MeasureSpec.makeMeasureSpec(right - left, 1073741824), View.MeasureSpec.makeMeasureSpec(bottom - top, 1073741824));
        copy.layout(left, top, right, bottom);
        return copy;
    }

    public static Bitmap b(View view, Matrix matrix, RectF bounds, ViewGroup sceneRoot) {
        boolean sceneRootIsAttached;
        boolean addToOverlay;
        if (f1399a) {
            addToOverlay = !view.isAttachedToWindow();
            sceneRootIsAttached = sceneRoot == null ? false : sceneRoot.isAttachedToWindow();
        } else {
            addToOverlay = false;
            sceneRootIsAttached = false;
        }
        ViewGroup parent = null;
        int indexInParent = 0;
        if (f1400b && addToOverlay) {
            if (!sceneRootIsAttached) {
                return null;
            }
            parent = (ViewGroup) view.getParent();
            indexInParent = parent.indexOfChild(view);
            sceneRoot.getOverlay().add(view);
        }
        Bitmap bitmap = null;
        int bitmapWidth = Math.round(bounds.width());
        int bitmapHeight = Math.round(bounds.height());
        if (bitmapWidth > 0 && bitmapHeight > 0) {
            float scale = Math.min(1.0f, 1048576.0f / ((float) (bitmapWidth * bitmapHeight)));
            int bitmapWidth2 = Math.round(((float) bitmapWidth) * scale);
            int bitmapHeight2 = Math.round(((float) bitmapHeight) * scale);
            matrix.postTranslate(-bounds.left, -bounds.top);
            matrix.postScale(scale, scale);
            if (f1401c) {
                Picture picture = new Picture();
                Canvas canvas = picture.beginRecording(bitmapWidth2, bitmapHeight2);
                canvas.concat(matrix);
                view.draw(canvas);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(bitmapWidth2, bitmapHeight2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.concat(matrix);
                view.draw(canvas2);
            }
        }
        if (f1400b && addToOverlay) {
            sceneRoot.getOverlay().remove(view);
            parent.addView(view, indexInParent);
        }
        return bitmap;
    }

    public static Animator c(Animator animator1, Animator animator2) {
        if (animator1 == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator1;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator1, animator2);
        return animatorSet;
    }
}
