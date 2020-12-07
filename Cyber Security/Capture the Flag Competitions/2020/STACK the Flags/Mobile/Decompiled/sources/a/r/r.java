package a.r;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f1402a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f1403b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<l> f1404c = new ArrayList<>();

    public boolean equals(Object other) {
        if (!(other instanceof r) || this.f1403b != ((r) other).f1403b || !this.f1402a.equals(((r) other).f1402a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f1403b.hashCode() * 31) + this.f1402a.hashCode();
    }

    public String toString() {
        String returnValue = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1403b + "\n") + "    values:";
        for (String s : this.f1402a.keySet()) {
            returnValue = returnValue + "    " + s + ": " + this.f1402a.get(s) + "\n";
        }
        return returnValue;
    }
}
