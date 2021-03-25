package a.b.p;

import a.b.j;
import a.h.m.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class a0 {
    public static final RectF l = new RectF();
    public static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f263a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f264b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f265c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f266d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f267e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f268f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f269g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final c k;

    public static class c {
        public boolean b(TextView textView) {
            return ((Boolean) a0.o(textView, "getHorizontallyScrolling", false)).booleanValue();
        }

        public void a(StaticLayout.Builder layoutBuilder, TextView textView) {
        }
    }

    public static class a extends c {
        @Override // a.b.p.a0.c
        public void a(StaticLayout.Builder layoutBuilder, TextView textView) {
            layoutBuilder.setTextDirection((TextDirectionHeuristic) a0.o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        @Override // a.b.p.a0.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // a.b.p.a0.c, a.b.p.a0.a
        public void a(StaticLayout.Builder layoutBuilder, TextView textView) {
            layoutBuilder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    public a0(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.k = new b();
        } else if (i2 >= 23) {
            this.k = new a();
        } else {
            this.k = new c();
        }
    }

    public void q(AttributeSet attrs, int defStyleAttr) {
        int autoSizeStepSizeArrayResId;
        float autoSizeMinTextSizeInPx = -1.0f;
        float autoSizeMaxTextSizeInPx = -1.0f;
        float autoSizeStepGranularityInPx = -1.0f;
        TypedArray a2 = this.j.obtainStyledAttributes(attrs, j.AppCompatTextView, defStyleAttr, 0);
        TextView textView = this.i;
        s.X(textView, textView.getContext(), j.AppCompatTextView, attrs, a2, defStyleAttr, 0);
        if (a2.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            this.f263a = a2.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizeStepGranularity)) {
            autoSizeStepGranularityInPx = a2.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizeMinTextSize)) {
            autoSizeMinTextSizeInPx = a2.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizeMaxTextSize)) {
            autoSizeMaxTextSizeInPx = a2.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (autoSizeStepSizeArrayResId = a2.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray autoSizePreDefTextSizes = a2.getResources().obtainTypedArray(autoSizeStepSizeArrayResId);
            x(autoSizePreDefTextSizes);
            autoSizePreDefTextSizes.recycle();
        }
        a2.recycle();
        if (!A()) {
            this.f263a = 0;
        } else if (this.f263a == 1) {
            if (!this.f269g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (autoSizeMinTextSizeInPx == -1.0f) {
                    autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (autoSizeMaxTextSizeInPx == -1.0f) {
                    autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (autoSizeStepGranularityInPx == -1.0f) {
                    autoSizeStepGranularityInPx = 1.0f;
                }
                B(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            }
            w();
        }
    }

    public void t(int autoSizeTextType) {
        if (!A()) {
            return;
        }
        if (autoSizeTextType == 0) {
            c();
        } else if (autoSizeTextType == 1) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (w()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + autoSizeTextType);
        }
    }

    public void r(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (A()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(unit, (float) autoSizeMinTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeMaxTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeStepGranularity, displayMetrics));
            if (w()) {
                a();
            }
        }
    }

    public void s(int[] presetSizes, int unit) {
        if (A()) {
            int presetSizesLength = presetSizes.length;
            if (presetSizesLength > 0) {
                int[] presetSizesInPx = new int[presetSizesLength];
                if (unit == 0) {
                    presetSizesInPx = Arrays.copyOf(presetSizes, presetSizesLength);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < presetSizesLength; i2++) {
                        presetSizesInPx[i2] = Math.round(TypedValue.applyDimension(unit, (float) presetSizes[i2], displayMetrics));
                    }
                }
                this.f268f = b(presetSizesInPx);
                if (!y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(presetSizes));
                }
            } else {
                this.f269g = false;
            }
            if (w()) {
                a();
            }
        }
    }

    public int l() {
        return this.f263a;
    }

    public int j() {
        return Math.round(this.f265c);
    }

    public int i() {
        return Math.round(this.f266d);
    }

    public int h() {
        return Math.round(this.f267e);
    }

    public int[] k() {
        return this.f268f;
    }

    public final void x(TypedArray textSizes) {
        int textSizesLength = textSizes.length();
        int[] parsedSizes = new int[textSizesLength];
        if (textSizesLength > 0) {
            for (int i2 = 0; i2 < textSizesLength; i2++) {
                parsedSizes[i2] = textSizes.getDimensionPixelSize(i2, -1);
            }
            this.f268f = b(parsedSizes);
            y();
        }
    }

    public final boolean y() {
        int sizesLength = this.f268f.length;
        boolean z = sizesLength > 0;
        this.f269g = z;
        if (z) {
            this.f263a = 1;
            int[] iArr = this.f268f;
            this.f266d = (float) iArr[0];
            this.f267e = (float) iArr[sizesLength - 1];
            this.f265c = -1.0f;
        }
        return this.f269g;
    }

    public final int[] b(int[] presetValues) {
        int presetValuesLength = presetValues.length;
        if (presetValuesLength == 0) {
            return presetValues;
        }
        Arrays.sort(presetValues);
        List<Integer> uniqueValidSizes = new ArrayList<>();
        for (int currentPresetValue : presetValues) {
            if (currentPresetValue > 0 && Collections.binarySearch(uniqueValidSizes, Integer.valueOf(currentPresetValue)) < 0) {
                uniqueValidSizes.add(Integer.valueOf(currentPresetValue));
            }
        }
        if (presetValuesLength == uniqueValidSizes.size()) {
            return presetValues;
        }
        int uniqueValidSizesLength = uniqueValidSizes.size();
        int[] cleanedUpSizes = new int[uniqueValidSizesLength];
        for (int i2 = 0; i2 < uniqueValidSizesLength; i2++) {
            cleanedUpSizes[i2] = uniqueValidSizes.get(i2).intValue();
        }
        return cleanedUpSizes;
    }

    public final void B(float autoSizeMinTextSizeInPx, float autoSizeMaxTextSizeInPx, float autoSizeStepGranularityInPx) {
        if (autoSizeMinTextSizeInPx <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px) is less or equal to (0px)");
        } else if (autoSizeMaxTextSizeInPx <= autoSizeMinTextSizeInPx) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + autoSizeMaxTextSizeInPx + "px) is less or equal to minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px)");
        } else if (autoSizeStepGranularityInPx > 0.0f) {
            this.f263a = 1;
            this.f266d = autoSizeMinTextSizeInPx;
            this.f267e = autoSizeMaxTextSizeInPx;
            this.f265c = autoSizeStepGranularityInPx;
            this.f269g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + autoSizeStepGranularityInPx + "px) is less or equal to (0px)");
        }
    }

    public final boolean w() {
        if (!A() || this.f263a != 1) {
            this.f264b = false;
        } else {
            if (!this.f269g || this.f268f.length == 0) {
                int autoSizeValuesLength = ((int) Math.floor((double) ((this.f267e - this.f266d) / this.f265c))) + 1;
                int[] autoSizeTextSizesInPx = new int[autoSizeValuesLength];
                for (int i2 = 0; i2 < autoSizeValuesLength; i2++) {
                    autoSizeTextSizesInPx[i2] = Math.round(this.f266d + (((float) i2) * this.f265c));
                }
                this.f268f = b(autoSizeTextSizesInPx);
            }
            this.f264b = true;
        }
        return this.f264b;
    }

    public void a() {
        int availableWidth;
        if (p()) {
            if (this.f264b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (this.k.b(this.i)) {
                        availableWidth = 1048576;
                    } else {
                        availableWidth = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int availableHeight = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (availableWidth > 0 && availableHeight > 0) {
                        synchronized (l) {
                            l.setEmpty();
                            l.right = (float) availableWidth;
                            l.bottom = (float) availableHeight;
                            float optimalTextSize = (float) g(l);
                            if (optimalTextSize != this.i.getTextSize()) {
                                v(0, optimalTextSize);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f264b = true;
        }
    }

    public final void c() {
        this.f263a = 0;
        this.f266d = -1.0f;
        this.f267e = -1.0f;
        this.f265c = -1.0f;
        this.f268f = new int[0];
        this.f264b = false;
    }

    public void v(int unit, float size) {
        Resources res;
        Context context = this.j;
        if (context == null) {
            res = Resources.getSystem();
        } else {
            res = context.getResources();
        }
        u(TypedValue.applyDimension(unit, size, res.getDisplayMetrics()));
    }

    public final void u(float size) {
        if (size != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(size);
            boolean isInLayout = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                this.f264b = false;
                try {
                    Method method = m("nullLayouts");
                    if (method != null) {
                        method.invoke(this.i, new Object[0]);
                    }
                } catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ex);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public final int g(RectF availableSpace) {
        int sizesCount = this.f268f.length;
        if (sizesCount != 0) {
            int bestSizeIndex = 0;
            int lowIndex = 0 + 1;
            int highIndex = sizesCount - 1;
            while (lowIndex <= highIndex) {
                int sizeToTryIndex = (lowIndex + highIndex) / 2;
                if (z(this.f268f[sizeToTryIndex], availableSpace)) {
                    bestSizeIndex = lowIndex;
                    lowIndex = sizeToTryIndex + 1;
                } else {
                    highIndex = sizeToTryIndex - 1;
                    bestSizeIndex = highIndex;
                }
            }
            return this.f268f[bestSizeIndex];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public void n(int suggestedSizeInPx) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize((float) suggestedSizeInPx);
    }

    public StaticLayout d(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e(text, alignment, availableWidth, maxLines);
        }
        return f(text, alignment, availableWidth);
    }

    public final boolean z(int suggestedSizeInPx, RectF availableSpace) {
        CharSequence transformedText;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (!(transformationMethod == null || (transformedText = transformationMethod.getTransformation(text, this.i)) == null)) {
            text = transformedText;
        }
        int maxLines = this.i.getMaxLines();
        n(suggestedSizeInPx);
        StaticLayout layout = d(text, (Layout.Alignment) o(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(availableSpace.right), maxLines);
        return (maxLines == -1 || (layout.getLineCount() <= maxLines && layout.getLineEnd(layout.getLineCount() - 1) == text.length())) && ((float) layout.getHeight()) <= availableSpace.bottom;
    }

    public final StaticLayout e(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        StaticLayout.Builder layoutBuilder = StaticLayout.Builder.obtain(text, 0, text.length(), this.h, availableWidth);
        layoutBuilder.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
        try {
            this.k.a(layoutBuilder, this.i);
        } catch (ClassCastException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return layoutBuilder.build();
    }

    public final StaticLayout f(CharSequence text, Layout.Alignment alignment, int availableWidth) {
        return new StaticLayout(text, this.h, availableWidth, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }

    public static <T> T o(Object object, String methodName, T defaultValue) {
        try {
            T result = (T) m(methodName).invoke(object, new Object[0]);
            if (result != null || 0 == 0) {
                return result;
            }
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + methodName + "() method", ex);
            if (0 != 0 || 1 == 0) {
                return null;
            }
        } catch (Throwable th) {
            if (0 == 0 && 1 != 0) {
            }
            throw th;
        }
        return defaultValue;
    }

    public static Method m(String methodName) {
        try {
            Method method = m.get(methodName);
            if (method == null && (method = TextView.class.getDeclaredMethod(methodName, new Class[0])) != null) {
                method.setAccessible(true);
                m.put(methodName, method);
            }
            return method;
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + methodName + "() method", ex);
            return null;
        }
    }

    public boolean p() {
        return A() && this.f263a != 0;
    }

    public final boolean A() {
        return !(this.i instanceof k);
    }
}
