package a.b.p;

import a.b.c;
import a.b.e;
import a.b.p.m0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f342b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static j f343c;

    /* renamed from: a  reason: collision with root package name */
    public m0 f344a;

    public static synchronized void h() {
        synchronized (j.class) {
            if (f343c == null) {
                j jVar = new j();
                f343c = jVar;
                jVar.f344a = m0.h();
                f343c.f344a.t(new a());
            }
        }
    }

    public class a implements m0.e {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f345a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f346b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f347c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl_dark, e.abc_text_select_handle_middle_mtrl_dark, e.abc_text_select_handle_right_mtrl_dark, e.abc_text_select_handle_left_mtrl_light, e.abc_text_select_handle_middle_mtrl_light, e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f348d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f349e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f350f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

        public final ColorStateList e(Context context) {
            return c(context, r0.c(context, a.b.a.colorButtonNormal));
        }

        public final ColorStateList b(Context context) {
            return c(context, 0);
        }

        public final ColorStateList d(Context context) {
            return c(context, r0.c(context, a.b.a.colorAccent));
        }

        public final ColorStateList c(Context context, int baseColor) {
            int[][] states = new int[4][];
            int[] colors = new int[4];
            int colorControlHighlight = r0.c(context, a.b.a.colorControlHighlight);
            int disabledColor = r0.b(context, a.b.a.colorButtonNormal);
            states[0] = r0.f409b;
            colors[0] = disabledColor;
            int i = 0 + 1;
            states[i] = r0.f411d;
            colors[i] = a.h.f.a.b(colorControlHighlight, baseColor);
            int i2 = i + 1;
            states[i2] = r0.f410c;
            colors[i2] = a.h.f.a.b(colorControlHighlight, baseColor);
            int i3 = i2 + 1;
            states[i3] = r0.f413f;
            colors[i3] = baseColor;
            int i4 = i3 + 1;
            return new ColorStateList(states, colors);
        }

        public final ColorStateList g(Context context) {
            int[][] states = new int[3][];
            int[] colors = new int[3];
            ColorStateList thumbColor = r0.e(context, a.b.a.colorSwitchThumbNormal);
            if (thumbColor == null || !thumbColor.isStateful()) {
                states[0] = r0.f409b;
                colors[0] = r0.b(context, a.b.a.colorSwitchThumbNormal);
                int i = 0 + 1;
                states[i] = r0.f412e;
                colors[i] = r0.c(context, a.b.a.colorControlActivated);
                int i2 = i + 1;
                states[i2] = r0.f413f;
                colors[i2] = r0.c(context, a.b.a.colorSwitchThumbNormal);
                int i3 = i2 + 1;
            } else {
                states[0] = r0.f409b;
                colors[0] = thumbColor.getColorForState(states[0], 0);
                int i4 = 0 + 1;
                states[i4] = r0.f412e;
                colors[i4] = r0.c(context, a.b.a.colorControlActivated);
                int i5 = i4 + 1;
                states[i5] = r0.f413f;
                colors[i5] = thumbColor.getDefaultColor();
                int i6 = i5 + 1;
            }
            return new ColorStateList(states, colors);
        }

        public Drawable f(m0 resourceManager, Context context, int resId) {
            if (resId != e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{resourceManager.j(context, e.abc_cab_background_internal_bg), resourceManager.j(context, e.abc_cab_background_top_mtrl_alpha)});
        }

        public final void j(Drawable d2, int color, PorterDuff.Mode mode) {
            PorterDuff.Mode mode2;
            if (e0.a(d2)) {
                d2 = d2.mutate();
            }
            if (mode == null) {
                mode2 = j.f342b;
            } else {
                mode2 = mode;
            }
            d2.setColorFilter(j.e(color, mode2));
        }

        public boolean k(Context context, int resId, Drawable drawable) {
            if (resId == e.abc_seekbar_track_material) {
                LayerDrawable ld = (LayerDrawable) drawable;
                j(ld.findDrawableByLayerId(16908288), r0.c(context, a.b.a.colorControlNormal), j.f342b);
                j(ld.findDrawableByLayerId(16908303), r0.c(context, a.b.a.colorControlNormal), j.f342b);
                j(ld.findDrawableByLayerId(16908301), r0.c(context, a.b.a.colorControlActivated), j.f342b);
                return true;
            } else if (resId != e.abc_ratingbar_material && resId != e.abc_ratingbar_indicator_material && resId != e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable ld2 = (LayerDrawable) drawable;
                j(ld2.findDrawableByLayerId(16908288), r0.b(context, a.b.a.colorControlNormal), j.f342b);
                j(ld2.findDrawableByLayerId(16908303), r0.c(context, a.b.a.colorControlActivated), j.f342b);
                j(ld2.findDrawableByLayerId(16908301), r0.c(context, a.b.a.colorControlActivated), j.f342b);
                return true;
            }
        }

        public final boolean a(int[] array, int value) {
            for (int id : array) {
                if (id == value) {
                    return true;
                }
            }
            return false;
        }

        public ColorStateList h(Context context, int resId) {
            if (resId == e.abc_edit_text_material) {
                return a.b.l.a.a.c(context, c.abc_tint_edittext);
            }
            if (resId == e.abc_switch_track_mtrl_alpha) {
                return a.b.l.a.a.c(context, c.abc_tint_switch_track);
            }
            if (resId == e.abc_switch_thumb_material) {
                return g(context);
            }
            if (resId == e.abc_btn_default_mtrl_shape) {
                return e(context);
            }
            if (resId == e.abc_btn_borderless_material) {
                return b(context);
            }
            if (resId == e.abc_btn_colored_material) {
                return d(context);
            }
            if (resId == e.abc_spinner_mtrl_am_alpha || resId == e.abc_spinner_textfield_background_material) {
                return a.b.l.a.a.c(context, c.abc_tint_spinner);
            }
            if (a(this.f346b, resId)) {
                return r0.e(context, a.b.a.colorControlNormal);
            }
            if (a(this.f349e, resId)) {
                return a.b.l.a.a.c(context, c.abc_tint_default);
            }
            if (a(this.f350f, resId)) {
                return a.b.l.a.a.c(context, c.abc_tint_btn_checkable);
            }
            if (resId == e.abc_seekbar_thumb_material) {
                return a.b.l.a.a.c(context, c.abc_tint_seek_thumb);
            }
            return null;
        }

        public boolean l(Context context, int resId, Drawable drawable) {
            PorterDuff.Mode tintMode = j.f342b;
            boolean colorAttrSet = false;
            int colorAttr = 0;
            int alpha = -1;
            if (a(this.f345a, resId)) {
                colorAttr = a.b.a.colorControlNormal;
                colorAttrSet = true;
            } else if (a(this.f347c, resId)) {
                colorAttr = a.b.a.colorControlActivated;
                colorAttrSet = true;
            } else if (a(this.f348d, resId)) {
                colorAttr = 16842801;
                colorAttrSet = true;
                tintMode = PorterDuff.Mode.MULTIPLY;
            } else if (resId == e.abc_list_divider_mtrl_alpha) {
                colorAttr = 16842800;
                colorAttrSet = true;
                alpha = Math.round(40.8f);
            } else if (resId == e.abc_dialog_material_background) {
                colorAttr = 16842801;
                colorAttrSet = true;
            }
            if (!colorAttrSet) {
                return false;
            }
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(j.e(r0.c(context, colorAttr), tintMode));
            if (alpha == -1) {
                return true;
            }
            drawable.setAlpha(alpha);
            return true;
        }

        public PorterDuff.Mode i(int resId) {
            if (resId == e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f343c == null) {
                h();
            }
            jVar = f343c;
        }
        return jVar;
    }

    public synchronized Drawable c(Context context, int resId) {
        return this.f344a.j(context, resId);
    }

    public synchronized Drawable d(Context context, int resId, boolean failIfNotKnown) {
        return this.f344a.k(context, resId, failIfNotKnown);
    }

    public synchronized void g(Context context) {
        this.f344a.s(context);
    }

    public synchronized ColorStateList f(Context context, int resId) {
        return this.f344a.m(context, resId);
    }

    public static void i(Drawable drawable, u0 tint, int[] state) {
        m0.v(drawable, tint, state);
    }

    public static synchronized PorterDuffColorFilter e(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (j.class) {
            l = m0.l(color, mode);
        }
        return l;
    }
}
