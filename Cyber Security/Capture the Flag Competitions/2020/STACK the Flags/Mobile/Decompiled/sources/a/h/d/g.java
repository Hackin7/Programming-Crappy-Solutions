package a.h.d;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class g implements Iterable<Intent> {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<Intent> f786b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Context f787c;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public g(Context a2) {
        this.f787c = a2;
    }

    public static g d(Context context) {
        return new g(context);
    }

    public g a(Intent nextIntent) {
        this.f786b.add(nextIntent);
        return this;
    }

    public g b(Activity sourceActivity) {
        Intent parent = null;
        if (sourceActivity instanceof a) {
            parent = ((a) sourceActivity).getSupportParentActivityIntent();
        }
        if (parent == null) {
            parent = e.a(sourceActivity);
        }
        if (parent != null) {
            ComponentName target = parent.getComponent();
            if (target == null) {
                target = parent.resolveActivity(this.f787c.getPackageManager());
            }
            c(target);
            a(parent);
        }
        return this;
    }

    public g c(ComponentName sourceActivityName) {
        int insertAt = this.f786b.size();
        try {
            Intent parent = e.b(this.f787c, sourceActivityName);
            while (parent != null) {
                this.f786b.add(insertAt, parent);
                parent = e.b(this.f787c, parent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f786b.iterator();
    }

    public void e() {
        f(null);
    }

    public void f(Bundle options) {
        if (!this.f786b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f786b;
            Intent[] intents = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intents[0] = new Intent(intents[0]).addFlags(268484608);
            a.h.e.a.d(this.f787c, intents, options);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
