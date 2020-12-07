package sg.gov.tech.ctf.mobile.User;

import a.b.k.c;
import a.b.k.d;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
import sg.gov.tech.ctf.mobile.R;

public class ViewActivity extends d {

    /* renamed from: b  reason: collision with root package name */
    public Button f2998b;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.view_activity);
        Button button = (Button) findViewById(R.id.submit);
        this.f2998b = button;
        button.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View v) {
            if (ViewActivity.this.a() == 1720543) {
                c.a builder = new c.a(ViewActivity.this);
                View view = LayoutInflater.from(ViewActivity.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view.findViewById(R.id.alert_detail)).setText(R.string.test);
                f.a.a.a.a.e.b.a().d(true);
                builder.h("Proceed", new DialogInterface$OnClickListenerC0075a());
                builder.f("Close", new b());
                builder.k(view);
                builder.l();
                return;
            }
            Toast.makeText(ViewActivity.this, "Something's happening...", 0).show();
            Toast.makeText(ViewActivity.this, "Maybe not.", 0).show();
        }

        /* renamed from: sg.gov.tech.ctf.mobile.User.ViewActivity$a$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0075a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0075a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ViewActivity.this.startActivity(new Intent(ViewActivity.this, UserHomeActivity.class));
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ViewActivity.this, "Do what you need to do here!", 0).show();
            }
        }
    }

    public int a() {
        int retVal = new Random().nextInt();
        if (retVal < 0) {
            return retVal * -1;
        }
        return retVal;
    }
}
