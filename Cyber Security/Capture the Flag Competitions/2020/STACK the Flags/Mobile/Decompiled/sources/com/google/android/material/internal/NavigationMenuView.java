package com.google.android.material.internal;

import a.b.o.j.g;
import a.b.o.j.n;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements n {
    public NavigationMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // a.b.o.j.n
    public void b(g menu) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
