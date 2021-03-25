package sg.gov.tech.ctf.mobile.Contact;

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
import sg.gov.tech.ctf.mobile.MainActivity;
import sg.gov.tech.ctf.mobile.R;

public class ContactForm extends d {
    public native int check(String str);

    public native String retrieveFlag();

    public native int retrieveFlag2(String str, int i);

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.contact_us_activity);
        String key = getIntent().getStringExtra("key");
        String flag = BuildConfig.FLAVOR;
        if (key == null) {
            flag = retrieveFlag();
        }
        ((TextView) findViewById(R.id.contactNo)).setText(flag);
        ((Button) findViewById(R.id.submit_button)).setOnClickListener(new a());
        ((Button) findViewById(R.id.subscribe_button)).setOnClickListener(new b());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View v) {
            String enteredFlagString = ((EditText) ContactForm.this.findViewById(R.id.editText_name)).getText().toString();
            int toPad = 16 - (enteredFlagString.length() % 16);
            if (toPad != 16) {
                for (int i = 0; i < toPad; i++) {
                    enteredFlagString = enteredFlagString + " ";
                }
            }
            int flagStatus = ContactForm.this.retrieveFlag2(enteredFlagString, enteredFlagString.length());
            if (flagStatus == 0) {
                Toast.makeText(ContactForm.this.getApplicationContext(), "The answer is already out if you have been checking something!", 0).show();
            } else if (flagStatus == 2) {
                c.a builder = new c.a(ContactForm.this);
                View view = LayoutInflater.from(ContactForm.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view.findViewById(R.id.alert_detail)).setText(new f.a.a.a.a.b.a().a());
                builder.h("Proceed", new DialogInterface$OnClickListenerC0070a());
                builder.f("Close", new b());
                builder.k(view);
                builder.l();
                Toast.makeText(ContactForm.this.getApplicationContext(), "Correct Password!", 0).show();
            } else if (flagStatus == 1) {
                Toast.makeText(ContactForm.this.getApplicationContext(), "Password is wrong!", 0).show();
            } else {
                Toast.makeText(ContactForm.this.getApplicationContext(), "Something is wrong!", 0).show();
            }
        }

        /* renamed from: sg.gov.tech.ctf.mobile.Contact.ContactForm$a$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0070a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0070a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ContactForm.this.startActivity(new Intent(ContactForm.this, MainActivity.class));
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ContactForm.this, "Do what you need to do here!", 0).show();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View v) {
            if (ContactForm.this.check(((EditText) ContactForm.this.findViewById(R.id.editText_email)).getText().toString()) == 0) {
                c.a builder = new c.a(ContactForm.this);
                View view = LayoutInflater.from(ContactForm.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view.findViewById(R.id.alert_detail)).setText("Well done!");
                builder.h("Proceed", new a());
                builder.f("Close", new DialogInterface$OnClickListenerC0071b());
                builder.k(view);
                builder.l();
                Toast.makeText(ContactForm.this.getApplicationContext(), "Flag is correct!", 0).show();
                return;
            }
            Toast.makeText(ContactForm.this.getApplicationContext(), "Flag is wrong!", 0).show();
        }

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ContactForm.this.startActivity(new Intent(ContactForm.this, MainActivity.class));
            }
        }

        /* renamed from: sg.gov.tech.ctf.mobile.Contact.ContactForm$b$b  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0071b implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0071b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ContactForm.this, "Do what you need to do here!", 0).show();
            }
        }
    }

    static {
        System.loadLibrary("native-lib");
    }
}
