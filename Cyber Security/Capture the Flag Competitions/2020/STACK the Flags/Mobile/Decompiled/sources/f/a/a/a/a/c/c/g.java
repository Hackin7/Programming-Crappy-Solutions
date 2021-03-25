package f.a.a.a.a.c.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import sg.gov.tech.ctf.mobile.R;
import sg.gov.tech.ctf.mobile.User.UserHomeActivity;

public class g extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<h> f2880c;

    /* renamed from: d  reason: collision with root package name */
    public b f2881d;

    public interface b {
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ a j(ViewGroup viewGroup, int i) {
        return s(viewGroup);
    }

    public g(ArrayList<h> arrayList, b updateListener) {
        this.f2880c = arrayList;
        this.f2881d = updateListener;
    }

    public a s(ViewGroup parent) {
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.updates_card_design, parent, false), this.f2881d);
    }

    /* renamed from: r */
    public void h(a holder, int position) {
        h updatesHelperClass = this.f2880c.get(position);
        holder.u.setImageResource(updatesHelperClass.b());
        holder.v.setText(updatesHelperClass.c());
        holder.w.setText(updatesHelperClass.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f2880c.size();
    }

    public static class a extends RecyclerView.b0 implements View.OnClickListener {
        public ImageView u;
        public TextView v;
        public TextView w;
        public b x;

        public a(View itemView, b updateListener) {
            super(itemView);
            this.u = (ImageView) itemView.findViewById(R.id.news_image);
            this.v = (TextView) itemView.findViewById(R.id.news_title);
            this.w = (TextView) itemView.findViewById(R.id.news_details);
            this.x = updateListener;
            itemView.setOnClickListener(this);
        }

        public void onClick(View view) {
            ((UserHomeActivity) this.x).c(j());
        }
    }
}
