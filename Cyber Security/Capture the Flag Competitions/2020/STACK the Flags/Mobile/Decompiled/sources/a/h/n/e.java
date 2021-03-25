package a.h.n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class e {
    public static ColorStateList a(ImageView view) {
        return view.getImageTintList();
    }

    public static void c(ImageView view, ColorStateList tintList) {
        Drawable imageViewDrawable;
        view.setImageTintList(tintList);
        if (Build.VERSION.SDK_INT == 21 && (imageViewDrawable = view.getDrawable()) != null && view.getImageTintList() != null) {
            if (imageViewDrawable.isStateful()) {
                imageViewDrawable.setState(view.getDrawableState());
            }
            view.setImageDrawable(imageViewDrawable);
        }
    }

    public static PorterDuff.Mode b(ImageView view) {
        return view.getImageTintMode();
    }

    public static void d(ImageView view, PorterDuff.Mode mode) {
        Drawable imageViewDrawable;
        view.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT == 21 && (imageViewDrawable = view.getDrawable()) != null && view.getImageTintList() != null) {
            if (imageViewDrawable.isStateful()) {
                imageViewDrawable.setState(view.getDrawableState());
            }
            view.setImageDrawable(imageViewDrawable);
        }
    }
}
