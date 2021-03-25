package a.h.e;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f788a = new Object();

    public static boolean d(Context context, Intent[] intents, Bundle options) {
        context.startActivities(intents, options);
        return true;
    }

    public static Drawable c(Context context, int id) {
        return context.getDrawable(id);
    }

    public static ColorStateList b(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(id);
        }
        return context.getResources().getColorStateList(id);
    }

    public static int a(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(id);
        }
        return context.getResources().getColor(id);
    }
}
