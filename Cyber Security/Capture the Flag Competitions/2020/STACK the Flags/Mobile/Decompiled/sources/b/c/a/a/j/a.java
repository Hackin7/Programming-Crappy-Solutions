package b.c.a.a.j;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.BuildConfig;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2506a = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162), Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)};

    static {
        int[] iArr = {Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};
        int[] iArr2 = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)};
        int[] iArr3 = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};
        int[] iArr4 = {Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)};
        int[] iArr5 = {c("#2ecc71"), c("#f1c40f"), c("#e74c3c"), c("#3498db")};
    }

    public static int c(String hex) {
        int color = (int) Long.parseLong(hex.replace("#", BuildConfig.FLAVOR), 16);
        return Color.rgb((color >> 16) & 255, (color >> 8) & 255, (color >> 0) & 255);
    }

    public static int a(int color, int alpha) {
        return (16777215 & color) | ((alpha & 255) << 24);
    }

    public static List<Integer> b(int[] colors) {
        List<Integer> result = new ArrayList<>();
        for (int i : colors) {
            result.add(Integer.valueOf(i));
        }
        return result;
    }
}
