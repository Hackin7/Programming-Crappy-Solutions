package a.h.d;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

public class a extends a.h.e.a {

    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface c {
        boolean a(Activity activity, int i, int i2, Intent intent);
    }

    public interface d {
        void validateRequestPermissionsRequestCode(int i);
    }

    public static c g() {
        return null;
    }

    public static void n(Activity activity, Intent intent, int requestCode, Bundle options) {
        activity.startActivityForResult(intent, requestCode, options);
    }

    public static void o(Activity activity, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        activity.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public static void e(Activity activity) {
        activity.finishAffinity();
    }

    public static void f(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void k(Activity activity) {
        SharedElementCallback frameworkCallback;
        if (0 != 0) {
            frameworkCallback = new e();
        } else {
            frameworkCallback = null;
        }
        activity.setEnterSharedElementCallback(frameworkCallback);
    }

    public static void l(Activity activity) {
        SharedElementCallback frameworkCallback;
        if (0 != 0) {
            frameworkCallback = new e();
        } else {
            frameworkCallback = null;
        }
        activity.setExitSharedElementCallback(frameworkCallback);
    }

    public static void h(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void p(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void j(Activity activity, String[] permissions, int requestCode) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).validateRequestPermissionsRequestCode(requestCode);
            }
            activity.requestPermissions(permissions, requestCode);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0013a(permissions, activity, requestCode));
        }
    }

    /* renamed from: a.h.d.a$a  reason: collision with other inner class name */
    public class RunnableC0013a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String[] f764b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Activity f765c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f766d;

        public RunnableC0013a(String[] strArr, Activity activity, int i) {
            this.f764b = strArr;
            this.f765c = activity;
            this.f766d = i;
        }

        public void run() {
            int[] grantResults = new int[this.f764b.length];
            PackageManager packageManager = this.f765c.getPackageManager();
            String packageName = this.f765c.getPackageName();
            int permissionCount = this.f764b.length;
            for (int i = 0; i < permissionCount; i++) {
                grantResults[i] = packageManager.checkPermission(this.f764b[i], packageName);
            }
            ((b) this.f765c).onRequestPermissionsResult(this.f766d, this.f764b, grantResults);
        }
    }

    public static boolean m(Activity activity, String permission) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(permission);
        }
        return false;
    }

    public static void i(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!b.i(activity)) {
            activity.recreate();
        }
    }

    public static class e extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        public final f f767a = null;

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            throw null;
        }

        public Parcelable onCaptureSharedElementSnapshot(View sharedElement, Matrix viewToGlobalMatrix, RectF screenBounds) {
            throw null;
        }

        public View onCreateSnapshotView(Context context, Parcelable snapshot) {
            throw null;
        }

        /* renamed from: a.h.d.a$e$a  reason: collision with other inner class name */
        public class C0014a {
            public C0014a(e this$0, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            }
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener listener) {
            new C0014a(this, listener);
            throw null;
        }
    }
}
