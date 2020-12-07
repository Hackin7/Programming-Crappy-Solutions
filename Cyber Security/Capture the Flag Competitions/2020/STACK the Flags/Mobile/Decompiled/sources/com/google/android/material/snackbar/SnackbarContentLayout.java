package com.google.android.material.snackbar;

import a.h.m.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.d.a.a.d;
import b.d.a.a.f;
import b.d.a.a.j;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public TextView f2755b;

    /* renamed from: c  reason: collision with root package name */
    public Button f2756c;

    /* renamed from: d  reason: collision with root package name */
    public int f2757d;

    /* renamed from: e  reason: collision with root package name */
    public int f2758e;

    public SnackbarContentLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.SnackbarLayout);
        this.f2757d = a2.getDimensionPixelSize(j.SnackbarLayout_android_maxWidth, -1);
        this.f2758e = a2.getDimensionPixelSize(j.SnackbarLayout_maxActionInlineWidth, -1);
        a2.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2755b = (TextView) findViewById(f.snackbar_text);
        this.f2756c = (Button) findViewById(f.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f2755b;
    }

    public Button getActionView() {
        return this.f2756c;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f2757d > 0 && getMeasuredWidth() > (i = this.f2757d)) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int multiLineVPadding = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical_2lines);
        int singleLineVPadding = getResources().getDimensionPixelSize(d.design_snackbar_padding_vertical);
        boolean isMultiLine = this.f2755b.getLayout().getLineCount() > 1;
        boolean remeasure = false;
        if (!isMultiLine || this.f2758e <= 0 || this.f2756c.getMeasuredWidth() <= this.f2758e) {
            int messagePadding = isMultiLine ? multiLineVPadding : singleLineVPadding;
            if (b(0, messagePadding, messagePadding)) {
                remeasure = true;
            }
        } else if (b(1, multiLineVPadding, multiLineVPadding - singleLineVPadding)) {
            remeasure = true;
        }
        if (remeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final boolean b(int orientation, int messagePadTop, int messagePadBottom) {
        boolean changed = false;
        if (orientation != getOrientation()) {
            setOrientation(orientation);
            changed = true;
        }
        if (this.f2755b.getPaddingTop() == messagePadTop && this.f2755b.getPaddingBottom() == messagePadBottom) {
            return changed;
        }
        a(this.f2755b, messagePadTop, messagePadBottom);
        return true;
    }

    public static void a(View view, int topPadding, int bottomPadding) {
        if (s.M(view)) {
            s.k0(view, s.z(view), topPadding, s.y(view), bottomPadding);
        } else {
            view.setPadding(view.getPaddingLeft(), topPadding, view.getPaddingRight(), bottomPadding);
        }
    }
}
