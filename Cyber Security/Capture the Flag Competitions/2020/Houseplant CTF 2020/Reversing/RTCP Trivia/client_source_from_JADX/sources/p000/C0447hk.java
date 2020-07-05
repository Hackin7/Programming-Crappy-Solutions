package p000;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: hk */
final class C0447hk extends Filter {

    /* renamed from: a */
    C0448a f1904a;

    /* renamed from: hk$a */
    interface C0448a {
        /* renamed from: a */
        Cursor mo1883a();

        /* renamed from: a */
        Cursor mo1295a(CharSequence charSequence);

        /* renamed from: a */
        void mo1297a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo1299b(Cursor cursor);
    }

    C0447hk(C0448a aVar) {
        this.f1904a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f1904a.mo1299b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f1904a.mo1295a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f1904a.mo1883a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f1904a.mo1297a((Cursor) filterResults.values);
        }
    }
}
