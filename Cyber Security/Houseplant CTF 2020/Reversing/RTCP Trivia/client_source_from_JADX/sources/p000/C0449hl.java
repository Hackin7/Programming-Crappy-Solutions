package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: hl */
public abstract class C0449hl extends C0444hj {

    /* renamed from: a */
    private int f1905a;

    /* renamed from: k */
    private int f1906k;

    /* renamed from: l */
    private LayoutInflater f1907l;

    @Deprecated
    public C0449hl(Context context, int i) {
        super(context);
        this.f1906k = i;
        this.f1905a = i;
        this.f1907l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo1296a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1907l.inflate(this.f1905a, viewGroup, false);
    }

    /* renamed from: b */
    public final View mo1884b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1907l.inflate(this.f1906k, viewGroup, false);
    }
}
