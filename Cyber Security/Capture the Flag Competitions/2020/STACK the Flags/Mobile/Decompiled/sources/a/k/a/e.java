package a.k.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

public abstract class e {
    public abstract View b(int i);

    public abstract boolean c();

    @Deprecated
    public Fragment a(Context context, String className, Bundle arguments) {
        return Fragment.instantiate(context, className, arguments);
    }
}
