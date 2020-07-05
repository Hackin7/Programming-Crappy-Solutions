package p000;

import android.os.Build.VERSION;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: fy */
public final class C0371fy implements Spannable {

    /* renamed from: c */
    private static final Object f1698c = new Object();

    /* renamed from: d */
    private static Executor f1699d;

    /* renamed from: a */
    public final Spannable f1700a;

    /* renamed from: b */
    public final C0372a f1701b;

    /* renamed from: e */
    private final PrecomputedText f1702e;

    /* renamed from: fy$a */
    public static final class C0372a {

        /* renamed from: a */
        public final TextPaint f1703a;

        /* renamed from: b */
        public final TextDirectionHeuristic f1704b;

        /* renamed from: c */
        public final int f1705c;

        /* renamed from: d */
        public final int f1706d;

        /* renamed from: e */
        final Params f1707e;

        /* renamed from: fy$a$a */
        public static class C0373a {

            /* renamed from: a */
            public final TextPaint f1708a;

            /* renamed from: b */
            public TextDirectionHeuristic f1709b;

            /* renamed from: c */
            public int f1710c;

            /* renamed from: d */
            public int f1711d;

            public C0373a(TextPaint textPaint) {
                this.f1708a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f1710c = 1;
                    this.f1711d = 1;
                } else {
                    this.f1711d = 0;
                    this.f1710c = 0;
                }
                this.f1709b = VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }
        }

        public C0372a(Params params) {
            this.f1703a = params.getTextPaint();
            this.f1704b = params.getTextDirection();
            this.f1705c = params.getBreakStrategy();
            this.f1706d = params.getHyphenationFrequency();
            this.f1707e = params;
        }

        public C0372a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f1707e = VERSION.SDK_INT >= 28 ? new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f1703a = textPaint;
            this.f1704b = textDirectionHeuristic;
            this.f1705c = i;
            this.f1706d = i2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0372a)) {
                return false;
            }
            C0372a aVar = (C0372a) obj;
            if (this.f1707e != null) {
                return this.f1707e.equals(aVar.f1707e);
            }
            if (VERSION.SDK_INT >= 23 && (this.f1705c != aVar.f1705c || this.f1706d != aVar.f1706d)) {
                return false;
            }
            if ((VERSION.SDK_INT >= 18 && this.f1704b != aVar.f1704b) || this.f1703a.getTextSize() != aVar.f1703a.getTextSize() || this.f1703a.getTextScaleX() != aVar.f1703a.getTextScaleX() || this.f1703a.getTextSkewX() != aVar.f1703a.getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f1703a.getLetterSpacing() != aVar.f1703a.getLetterSpacing() || !TextUtils.equals(this.f1703a.getFontFeatureSettings(), aVar.f1703a.getFontFeatureSettings()))) || this.f1703a.getFlags() != aVar.f1703a.getFlags()) {
                return false;
            }
            if (VERSION.SDK_INT >= 24) {
                if (!this.f1703a.getTextLocales().equals(aVar.f1703a.getTextLocales())) {
                    return false;
                }
            } else if (VERSION.SDK_INT >= 17 && !this.f1703a.getTextLocale().equals(aVar.f1703a.getTextLocale())) {
                return false;
            }
            if (this.f1703a.getTypeface() == null) {
                if (aVar.f1703a.getTypeface() != null) {
                    return false;
                }
            } else if (!this.f1703a.getTypeface().equals(aVar.f1703a.getTypeface())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Object[] objArr = VERSION.SDK_INT >= 24 ? new Object[]{Float.valueOf(this.f1703a.getTextSize()), Float.valueOf(this.f1703a.getTextScaleX()), Float.valueOf(this.f1703a.getTextSkewX()), Float.valueOf(this.f1703a.getLetterSpacing()), Integer.valueOf(this.f1703a.getFlags()), this.f1703a.getTextLocales(), this.f1703a.getTypeface(), Boolean.valueOf(this.f1703a.isElegantTextHeight()), this.f1704b, Integer.valueOf(this.f1705c), Integer.valueOf(this.f1706d)} : VERSION.SDK_INT >= 21 ? new Object[]{Float.valueOf(this.f1703a.getTextSize()), Float.valueOf(this.f1703a.getTextScaleX()), Float.valueOf(this.f1703a.getTextSkewX()), Float.valueOf(this.f1703a.getLetterSpacing()), Integer.valueOf(this.f1703a.getFlags()), this.f1703a.getTextLocale(), this.f1703a.getTypeface(), Boolean.valueOf(this.f1703a.isElegantTextHeight()), this.f1704b, Integer.valueOf(this.f1705c), Integer.valueOf(this.f1706d)} : VERSION.SDK_INT >= 18 ? new Object[]{Float.valueOf(this.f1703a.getTextSize()), Float.valueOf(this.f1703a.getTextScaleX()), Float.valueOf(this.f1703a.getTextSkewX()), Integer.valueOf(this.f1703a.getFlags()), this.f1703a.getTextLocale(), this.f1703a.getTypeface(), this.f1704b, Integer.valueOf(this.f1705c), Integer.valueOf(this.f1706d)} : VERSION.SDK_INT >= 17 ? new Object[]{Float.valueOf(this.f1703a.getTextSize()), Float.valueOf(this.f1703a.getTextScaleX()), Float.valueOf(this.f1703a.getTextSkewX()), Integer.valueOf(this.f1703a.getFlags()), this.f1703a.getTextLocale(), this.f1703a.getTypeface(), this.f1704b, Integer.valueOf(this.f1705c), Integer.valueOf(this.f1706d)} : new Object[]{Float.valueOf(this.f1703a.getTextSize()), Float.valueOf(this.f1703a.getTextScaleX()), Float.valueOf(this.f1703a.getTextSkewX()), Integer.valueOf(this.f1703a.getFlags()), this.f1703a.getTypeface(), this.f1704b, Integer.valueOf(this.f1705c), Integer.valueOf(this.f1706d)};
            return C0377gb.m1207a(objArr);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00cf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "textSize="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textScaleX="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textSkewX="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x0080
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", letterSpacing="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", elegantTextHeight="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x0080:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                if (r1 < r2) goto L_0x009e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textLocale="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                android.os.LocaleList r2 = r2.getTextLocales()
            L_0x0093:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L_0x00b2
            L_0x009e:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 17
                if (r1 < r2) goto L_0x00b2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textLocale="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                java.util.Locale r2 = r2.getTextLocale()
                goto L_0x0093
            L_0x00b2:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", typeface="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L_0x00e6
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", variationSettings="
                r1.<init>(r2)
                android.text.TextPaint r2 = r3.f1703a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00e6:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", textDir="
                r1.<init>(r2)
                android.text.TextDirectionHeuristic r2 = r3.f1704b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", breakStrategy="
                r1.<init>(r2)
                int r2 = r3.f1705c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = ", hyphenationFrequency="
                r1.<init>(r2)
                int r2 = r3.f1706d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0371fy.C0372a.toString():java.lang.String");
        }
    }

    public final char charAt(int i) {
        return this.f1700a.charAt(i);
    }

    public final int getSpanEnd(Object obj) {
        return this.f1700a.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f1700a.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f1700a.getSpanStart(obj);
    }

    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return VERSION.SDK_INT >= 28 ? this.f1702e.getSpans(i, i2, cls) : this.f1700a.getSpans(i, i2, cls);
    }

    public final int length() {
        return this.f1700a.length();
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1700a.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f1702e.removeSpan(obj);
        } else {
            this.f1700a.removeSpan(obj);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f1702e.setSpan(obj, i, i2, i3);
        } else {
            this.f1700a.setSpan(obj, i, i2, i3);
        }
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.f1700a.subSequence(i, i2);
    }

    public final String toString() {
        return this.f1700a.toString();
    }
}
