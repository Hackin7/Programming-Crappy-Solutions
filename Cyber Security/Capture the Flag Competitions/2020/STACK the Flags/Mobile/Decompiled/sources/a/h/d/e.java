package a.h.d;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public final class e {
    public static boolean f(Activity sourceActivity, Intent targetIntent) {
        return sourceActivity.shouldUpRecreateTask(targetIntent);
    }

    public static void e(Activity sourceActivity, Intent upIntent) {
        sourceActivity.navigateUpTo(upIntent);
    }

    public static Intent a(Activity sourceActivity) {
        Intent result = sourceActivity.getParentActivityIntent();
        if (result != null) {
            return result;
        }
        String parentName = c(sourceActivity);
        if (parentName == null) {
            return null;
        }
        ComponentName target = new ComponentName(sourceActivity, parentName);
        try {
            if (d(sourceActivity, target) == null) {
                return Intent.makeMainActivity(target);
            }
            return new Intent().setComponent(target);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + parentName + "' in manifest");
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) {
        String parentActivity = d(context, componentName);
        if (parentActivity == null) {
            return null;
        }
        ComponentName target = new ComponentName(componentName.getPackageName(), parentActivity);
        if (d(context, target) == null) {
            return Intent.makeMainActivity(target);
        }
        return new Intent().setComponent(target);
    }

    public static String c(Activity sourceActivity) {
        try {
            return d(sourceActivity, sourceActivity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String d(Context context, ComponentName componentName) {
        int flags;
        String parentActivity;
        PackageManager pm = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 24) {
            flags = 128 | 512;
        } else {
            flags = 128 | 512;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            flags |= 269221888;
        } else if (i >= 24) {
            flags |= 786432;
        }
        ActivityInfo info = pm.getActivityInfo(componentName, flags);
        String result = info.parentActivityName;
        if (result != null) {
            return result;
        }
        Bundle bundle = info.metaData;
        if (bundle == null || (parentActivity = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (parentActivity.charAt(0) != '.') {
            return parentActivity;
        }
        return context.getPackageName() + parentActivity;
    }
}
