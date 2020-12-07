package f.a.a.a.a.c.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import sg.gov.tech.ctf.mobile.R;
import sg.gov.tech.ctf.mobile.User.UserHomeActivity;

public class a extends RecyclerView.g<View$OnClickListenerC0064a> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<b> f2868c;

    /* renamed from: d  reason: collision with root package name */
    public b f2869d;

    public interface b {
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ View$OnClickListenerC0064a j(ViewGroup viewGroup, int i) {
        return s(viewGroup);
    }

    public a(ArrayList<b> arrayList, b aboutListener) {
        this.f2868c = arrayList;
        this.f2869d = aboutListener;
    }

    public View$OnClickListenerC0064a s(ViewGroup parent) {
        return new View$OnClickListenerC0064a(LayoutInflater.from(parent.getContext()).inflate(R.layout.about_us_card_design, parent, false), this.f2869d);
    }

    /* renamed from: r */
    public void h(View$OnClickListenerC0064a holder, int position) {
        b aboutHelperClass = this.f2868c.get(position);
        holder.u.setText(aboutHelperClass.b());
        holder.v.setText(aboutHelperClass.c());
        holder.w.setBackground(aboutHelperClass.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f2868c.size();
    }

    /* renamed from: f.a.a.a.a.c.c.a$a  reason: collision with other inner class name */
    public static class View$OnClickListenerC0064a extends RecyclerView.b0 implements View.OnClickListener {
        public TextView u;
        public TextView v;
        public RelativeLayout w;
        public b x;

        public View$OnClickListenerC0064a(View itemView, b aboutListener) {
            super(itemView);
            this.u = (TextView) itemView.findViewById(R.id.about_us_text_details);
            this.v = (TextView) itemView.findViewById(R.id.about_us_text);
            this.w = (RelativeLayout) itemView.findViewById(R.id.about_us_bg);
            this.x = aboutListener;
            itemView.setOnClickListener(this);
        }

        public void onClick(View view) {
            ((UserHomeActivity) this.x).b(j());
        }
    }
}
