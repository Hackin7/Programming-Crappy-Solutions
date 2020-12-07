package a.h.k;

import a.h.l.c;
import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

public class a implements Spannable {
    static {
        new Object();
    }

    /* renamed from: a.h.k.a$a  reason: collision with other inner class name */
    public static final class C0021a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f892a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f893b;

        /* renamed from: c  reason: collision with root package name */
        public final int f894c;

        /* renamed from: d  reason: collision with root package name */
        public final int f895d;

        /* renamed from: a.h.k.a$a$a  reason: collision with other inner class name */
        public static class C0022a {

            /* renamed from: a  reason: collision with root package name */
            public final TextPaint f896a;

            /* renamed from: b  reason: collision with root package name */
            public TextDirectionHeuristic f897b;

            /* renamed from: c  reason: collision with root package name */
            public int f898c;

            /* renamed from: d  reason: collision with root package name */
            public int f899d;

            public C0022a(TextPaint paint) {
                this.f896a = paint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f898c = 1;
                    this.f899d = 1;
                } else {
                    this.f899d = 0;
                    this.f898c = 0;
                }
                this.f897b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public C0022a b(int strategy) {
                this.f898c = strategy;
                return this;
            }

            public C0022a c(int frequency) {
                this.f899d = frequency;
                return this;
            }

            public C0022a d(TextDirectionHeuristic textDir) {
                this.f897b = textDir;
                return this;
            }

            public C0021a a() {
                return new C0021a(this.f896a, this.f897b, this.f898c, this.f899d);
            }
        }

        @SuppressLint({"NewApi"})
        public C0021a(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(paint).setBreakStrategy(strategy).setHyphenationFrequency(frequency).setTextDirection(textDir).build();
            }
            this.f892a = paint;
            this.f893b = textDir;
            this.f894c = strategy;
            this.f895d = frequency;
        }

        public C0021a(PrecomputedText.Params wrapped) {
            this.f892a = wrapped.getTextPaint();
            this.f893b = wrapped.getTextDirection();
            this.f894c = wrapped.getBreakStrategy();
            this.f895d = wrapped.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        public TextPaint e() {
            return this.f892a;
        }

        public TextDirectionHeuristic d() {
            return this.f893b;
        }

        public int b() {
            return this.f894c;
        }

        public int c() {
            return this.f895d;
        }

        public boolean a(C0021a other) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f894c != other.b() || this.f895d != other.c())) || this.f892a.getTextSize() != other.e().getTextSize() || this.f892a.getTextScaleX() != other.e().getTextScaleX() || this.f892a.getTextSkewX() != other.e().getTextSkewX() || this.f892a.getLetterSpacing() != other.e().getLetterSpacing() || !TextUtils.equals(this.f892a.getFontFeatureSettings(), other.e().getFontFeatureSettings()) || this.f892a.getFlags() != other.e().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f892a.getTextLocales().equals(other.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f892a.getTextLocale().equals(other.e().getTextLocale())) {
                return false;
            }
            if (this.f892a.getTypeface() == null) {
                if (other.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f892a.getTypeface().equals(other.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof C0021a)) {
                return false;
            }
            C0021a other = (C0021a) o;
            if (a(other) && this.f893b == other.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return c.b(Float.valueOf(this.f892a.getTextSize()), Float.valueOf(this.f892a.getTextScaleX()), Float.valueOf(this.f892a.getTextSkewX()), Float.valueOf(this.f892a.getLetterSpacing()), Integer.valueOf(this.f892a.getFlags()), this.f892a.getTextLocales(), this.f892a.getTypeface(), Boolean.valueOf(this.f892a.isElegantTextHeight()), this.f893b, Integer.valueOf(this.f894c), Integer.valueOf(this.f895d));
            }
            return c.b(Float.valueOf(this.f892a.getTextSize()), Float.valueOf(this.f892a.getTextScaleX()), Float.valueOf(this.f892a.getTextSkewX()), Float.valueOf(this.f892a.getLetterSpacing()), Integer.valueOf(this.f892a.getFlags()), this.f892a.getTextLocale(), this.f892a.getTypeface(), Boolean.valueOf(this.f892a.isElegantTextHeight()), this.f893b, Integer.valueOf(this.f894c), Integer.valueOf(this.f895d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f892a.getTextSize());
            sb.append(", textScaleX=" + this.f892a.getTextScaleX());
            sb.append(", textSkewX=" + this.f892a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f892a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f892a.isElegantTextHeight());
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f892a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f892a.getTextLocale());
            }
            sb.append(", typeface=" + this.f892a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f892a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f893b);
            sb.append(", breakStrategy=" + this.f894c);
            sb.append(", hyphenationFrequency=" + this.f895d);
            sb.append("}");
            return sb.toString();
        }
    }

    public PrecomputedText b() {
        return null;
    }

    public C0021a a() {
        return null;
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object what, int start, int end, int flags) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object what) {
        if (what instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int start, int end, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    public int getSpanStart(Object tag) {
        throw null;
    }

    public int getSpanEnd(Object tag) {
        throw null;
    }

    public int getSpanFlags(Object tag) {
        throw null;
    }

    public int nextSpanTransition(int start, int limit, Class type) {
        throw null;
    }

    public int length() {
        throw null;
    }

    public char charAt(int index) {
        throw null;
    }

    public CharSequence subSequence(int start, int end) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
