package sg.gov.tech.ctf.mobile.User;

import a.b.k.c;
import a.b.k.d;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import b.c.a.a.d.f;
import b.c.a.a.d.g;
import b.c.a.a.d.h;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import sg.gov.tech.ctf.mobile.R;

public class Stats extends d {
    public native int check(String str, int i);

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats_activity);
        PieChart pieChart = (PieChart) findViewById(R.id.pie_chart);
        getWindow().setSoftInputMode(32);
        ArrayList<PieEntry> entry = new ArrayList<>();
        entry.add(new h(1828828.0f, "Africa"));
        entry.add(new h(1.3884681E7f, "Asia"));
        entry.add(new h(2.1239676E7f, "America"));
        entry.add(new h(1.1173822E7f, "Europe"));
        entry.add(new h(43861.0f, "Oceania"));
        g pieDataSet = new g(entry, "Reported Cases");
        pieDataSet.h0(b.c.a.a.j.a.f2506a);
        pieDataSet.i0(-16777216);
        pieDataSet.j0(16.0f);
        pieChart.setData(new f(pieDataSet));
        pieChart.getDescription().g(false);
        pieChart.setCenterText("Reported COVID cases");
        pieChart.animate();
        ((ImageButton) findViewById(R.id.submit)).setOnClickListener(new a());
        ((ImageButton) findViewById(R.id.back_btn)).setOnClickListener(new b());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View v) {
            String enteredFlagString = ((EditText) Stats.this.findViewById(R.id.user_input)).getText().toString();
            int flagStatus = Stats.this.check(enteredFlagString, enteredFlagString.length());
            if (flagStatus == 0) {
                f.a.a.a.a.e.b.a().e(true);
                c.a builder = new c.a(Stats.this);
                View view = LayoutInflater.from(Stats.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view.findViewById(R.id.alert_detail)).setText("Well done!");
                builder.h("Proceed", new DialogInterface$OnClickListenerC0074a());
                builder.f("Close", new b());
                builder.k(view);
                builder.l();
            }
            if (flagStatus == 1) {
                Toast.makeText(Stats.this.getApplicationContext(), "Nice try, but that isn't it :)", 0).show();
            } else if (flagStatus == 2) {
                Toast.makeText(Stats.this.getApplicationContext(), "Flag is wrong!", 0).show();
            } else {
                Toast.makeText(Stats.this.getApplicationContext(), "Something is wrong!", 0).show();
            }
        }

        /* renamed from: sg.gov.tech.ctf.mobile.User.Stats$a$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0074a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0074a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Stats.this.startActivity(new Intent(Stats.this, UserHomeActivity.class));
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Stats.this, "Do what you need to do here!", 0).show();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View v) {
            Stats.this.startActivity(new Intent(Stats.this, UserHomeActivity.class));
        }
    }

    static {
        System.loadLibrary("native-lib");
    }
}
