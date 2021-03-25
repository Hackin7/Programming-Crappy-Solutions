package a.i.a;

import a.b.p.q0;
import android.database.Cursor;
import android.widget.Filter;

public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f1018a;

    public interface a {
    }

    public b(a client) {
        this.f1018a = client;
    }

    public CharSequence convertResultToString(Object resultValue) {
        return ((q0) this.f1018a).c((Cursor) resultValue);
    }

    public Filter.FilterResults performFiltering(CharSequence constraint) {
        Cursor cursor = ((q0) this.f1018a).w(constraint);
        Filter.FilterResults results = new Filter.FilterResults();
        if (cursor != null) {
            results.count = cursor.getCount();
            results.values = cursor;
        } else {
            results.count = 0;
            results.values = null;
        }
        return results;
    }

    public void publishResults(CharSequence constraint, Filter.FilterResults results) {
        Cursor oldCursor = ((a) this.f1018a).d();
        Object obj = results.values;
        if (obj != null && obj != oldCursor) {
            ((q0) this.f1018a).b((Cursor) obj);
        }
    }
}
