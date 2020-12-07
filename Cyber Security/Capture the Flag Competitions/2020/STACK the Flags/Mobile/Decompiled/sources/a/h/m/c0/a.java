package a.h.m.c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    public final int f927b;

    /* renamed from: c  reason: collision with root package name */
    public final d f928c;

    /* renamed from: d  reason: collision with root package name */
    public final int f929d;

    public a(int originalClickableSpanId, d nodeInfoCompat, int clickableSpanActionId) {
        this.f927b = originalClickableSpanId;
        this.f928c = nodeInfoCompat;
        this.f929d = clickableSpanActionId;
    }

    public void onClick(View unused) {
        Bundle arguments = new Bundle();
        arguments.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f927b);
        this.f928c.F(this.f929d, arguments);
    }
}
