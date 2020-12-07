package a.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {
    public int j;
    public int k;
    public LayoutInflater l;

    @Deprecated
    public c(Context context, int layout, Cursor c2, boolean autoRequery) {
        super(context, c2, autoRequery);
        this.k = layout;
        this.j = layout;
        this.l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // a.i.a.a
    public View g(Context context, Cursor cursor, ViewGroup parent) {
        return this.l.inflate(this.j, parent, false);
    }

    @Override // a.i.a.a
    public View f(Context context, Cursor cursor, ViewGroup parent) {
        return this.l.inflate(this.k, parent, false);
    }
}
