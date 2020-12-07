package f.a.a.a.a.c.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import sg.gov.tech.ctf.mobile.Info.AtoZCovid;
import sg.gov.tech.ctf.mobile.R;

public class e extends RecyclerView.g<a> {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<f> f2877c;

    /* renamed from: d  reason: collision with root package name */
    public c f2878d;

    public interface c {
    }

    public e(ArrayList<f> arrayList, c contentListener) {
        this.f2877c = arrayList;
        this.f2878d = contentListener;
    }

    public class b extends a {
        public b(e this$0, View itemView) {
            super(itemView, this$0.f2878d);
        }
    }

    /* renamed from: s */
    public a j(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new b(this, LayoutInflater.from(parent.getContext()).inflate(R.layout.header, parent, false));
        }
        return new a(LayoutInflater.from(parent.getContext()).inflate(R.layout.content_content, parent, false), this.f2878d);
    }

    /* renamed from: r */
    public void h(a holder, int position) {
        try {
            if (holder instanceof a) {
                holder.u.setText(this.f2877c.get(position).a());
            } else if (holder instanceof b) {
                ((b) holder).u.setText(this.f2877c.get(position).a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f2877c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e(int position) {
        if (position == 0 || position == 3 || position == 5 || position == 11 || position == 14 || position == 17 || position == 22 || position == 24 || position == 27 || position == 30 || position == 31 || position == 32 || position == 34 || position == 37 || position == 38 || position == 40 || position == 43 || position == 45 || position == 47 || position == 52 || position == 54 || position == 56 || position == 59 || position == 63 || position == 64 || position == 65) {
            return 1;
        }
        super.e(position);
        return 0;
    }

    public static class a extends RecyclerView.b0 implements View.OnClickListener {
        public TextView u;
        public c v;

        public a(View itemView, c contentListener) {
            super(itemView);
            this.u = (TextView) itemView.findViewById(R.id.text);
            this.v = contentListener;
            itemView.setOnClickListener(this);
        }

        public void onClick(View view) {
            ((AtoZCovid) this.v).b(j());
        }
    }
}
