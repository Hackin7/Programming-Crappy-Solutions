package a.b.k;

import a.k.a.c;
import android.app.Dialog;

public class i extends c {
    @Override // a.k.a.c
    public void d(Dialog dialog, int style) {
        if (dialog instanceof h) {
            h acd = (h) dialog;
            if (!(style == 1 || style == 2)) {
                if (style == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            acd.d(1);
            return;
        }
        super.d(dialog, style);
    }
}
