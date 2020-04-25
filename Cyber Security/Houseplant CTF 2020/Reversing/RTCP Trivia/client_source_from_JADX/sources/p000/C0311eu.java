package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: eu */
public final class C0311eu implements Iterable<Intent> {

    /* renamed from: a */
    public final ArrayList<Intent> f1590a = new ArrayList<>();

    /* renamed from: b */
    public final Context f1591b;

    /* renamed from: eu$a */
    public interface C0312a {
        /* renamed from: b */
        Intent mo1604b();
    }

    private C0311eu(Context context) {
        this.f1591b = context;
    }

    /* renamed from: a */
    public static C0311eu m1044a(Context context) {
        return new C0311eu(context);
    }

    /* renamed from: a */
    public final C0311eu mo1690a(ComponentName componentName) {
        int size = this.f1590a.size();
        try {
            Context context = this.f1591b;
            while (true) {
                Intent a = C0309es.m1041a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f1590a.add(size, a);
                context = this.f1591b;
                componentName = a.getComponent();
            }
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f1590a.iterator();
    }
}
