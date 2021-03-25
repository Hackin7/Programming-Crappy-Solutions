package sg.gov.tech.ctf.mobile.Info;

import a.b.k.c;
import a.b.k.d;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import net.sqlcipher.BuildConfig;
import se.simbio.encryption.Encryption;
import sg.gov.tech.ctf.mobile.R;

public class CovidInfoActivity extends d {

    /* renamed from: b  reason: collision with root package name */
    public String f2969b = "jeldexs+ktquD8iQ1CAEnHIc+SSPc5TcyirRSIYxA/g=";

    public native String getKey();

    public native String getSalt();

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.covidinfo_activity);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        ((Button) findViewById(R.id.button_submit)).setOnClickListener(new a(Encryption.getDefault(getKey(), getSalt(), new byte[16])));
    }

    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Encryption f2970b;

        public a(Encryption encryption) {
            this.f2970b = encryption;
        }

        public void onClick(View v) {
            if (this.f2970b.encryptOrNull(((EditText) CovidInfoActivity.this.findViewById(R.id.editText_enteredFlag)).getText().toString()).replaceAll("\\n", BuildConfig.FLAVOR).equalsIgnoreCase(CovidInfoActivity.this.f2969b)) {
                c.a builder = new c.a(CovidInfoActivity.this);
                View view = LayoutInflater.from(CovidInfoActivity.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view.findViewById(R.id.alert_detail)).setText("Well done!");
                f.a.a.a.a.e.b.a().d(true);
                builder.h("Proceed", new DialogInterface$OnClickListenerC0073a());
                builder.f("Close", new b());
                builder.k(view);
                builder.l();
                Toast.makeText(CovidInfoActivity.this.getApplicationContext(), "Flag is correct!", 0).show();
                return;
            }
            Toast.makeText(CovidInfoActivity.this.getApplicationContext(), "Flag is wrong!", 0).show();
        }

        /* renamed from: sg.gov.tech.ctf.mobile.Info.CovidInfoActivity$a$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0073a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0073a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                CovidInfoActivity.this.startActivity(new Intent(CovidInfoActivity.this, AtoZCovid.class));
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(CovidInfoActivity.this, "Do what you need to do here!", 0).show();
            }
        }
    }

    static {
        System.loadLibrary("native-lib");
    }
}
