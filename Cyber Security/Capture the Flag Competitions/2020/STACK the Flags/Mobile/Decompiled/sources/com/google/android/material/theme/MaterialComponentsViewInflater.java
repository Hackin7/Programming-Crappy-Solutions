package com.google.android.material.theme;

import a.b.k.j;
import a.b.p.f;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import b.d.a.a.n.a;

@Keep
public class MaterialComponentsViewInflater extends j {
    @Override // a.b.k.j
    public f createButton(Context context, AttributeSet attrs) {
        return new a(context, attrs);
    }
}
