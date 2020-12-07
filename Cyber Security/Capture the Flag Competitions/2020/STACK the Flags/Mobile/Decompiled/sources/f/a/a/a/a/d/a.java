package f.a.a.a.a.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b.d.a.a.m.b;
import sg.gov.tech.ctf.mobile.R;

public class a extends b {
    public String m;
    public String n;
    public TextView o;
    public TextView p;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.modal_bottom_sheet, container, false);
        this.o = (TextView) v.findViewById(R.id.modal_title);
        TextView textView = (TextView) v.findViewById(R.id.modal_details);
        this.p = textView;
        textView.setText(this.m);
        this.o.setText(this.n);
        return v;
    }

    public a(String title, String details) {
        this.m = details;
        this.n = title;
    }
}
