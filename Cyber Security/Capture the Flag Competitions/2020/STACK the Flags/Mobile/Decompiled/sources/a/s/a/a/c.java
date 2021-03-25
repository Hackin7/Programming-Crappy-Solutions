package a.s.a.a;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class c {
    public static Interpolator a(Context context, int id) {
        return AnimationUtils.loadInterpolator(context, id);
    }
}
