package a.f.a.b;

import android.view.View;

public class a {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception e2) {
            return "UNKNOWN";
        }
    }
}
