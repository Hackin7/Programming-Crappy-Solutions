package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;

/* renamed from: ft */
public interface C0354ft extends MenuItem {
    /* renamed from: a */
    C0354ft mo34a(C0381ge geVar);

    /* renamed from: a */
    C0354ft mo35a(CharSequence charSequence);

    /* renamed from: a */
    C0381ge mo36a();

    /* renamed from: b */
    C0354ft mo37b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
