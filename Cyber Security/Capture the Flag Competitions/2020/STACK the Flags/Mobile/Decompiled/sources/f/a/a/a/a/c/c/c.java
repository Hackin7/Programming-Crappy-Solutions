package f.a.a.a.a.c.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import sg.gov.tech.ctf.mobile.R;

public class c extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<d> f2873c;

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ a j(ViewGroup viewGroup, int i) {
        return s(viewGroup);
    }

    public c(ArrayList<d> arrayList) {
        this.f2873c = arrayList;
    }

    public a s(ViewGroup parent) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.covid_card_design, parent, false));
    }

    /* renamed from: r */
    public void h(a holder, int position) {
        d COVIDHelperClass = this.f2873c.get(position);
        holder.u.setImageResource(COVIDHelperClass.b());
        holder.v.setText(COVIDHelperClass.c());
        holder.w.setText(COVIDHelperClass.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f2873c.size();
    }

    public static class a extends RecyclerView.b0 {
        public ImageView u;
        public TextView v;
        public TextView w;

        public a(View itemView) {
            super(itemView);
            this.u = (ImageView) itemView.findViewById(R.id.prizes_image);
            this.v = (TextView) itemView.findViewById(R.id.prizes_text);
            this.w = (TextView) itemView.findViewById(R.id.prizes_detail);
        }
    }
}
