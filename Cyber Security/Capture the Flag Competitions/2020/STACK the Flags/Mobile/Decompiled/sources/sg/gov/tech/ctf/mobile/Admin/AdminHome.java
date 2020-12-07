package sg.gov.tech.ctf.mobile.Admin;

import a.b.k.c;
import a.b.k.d;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;
import sg.gov.tech.ctf.mobile.R;

public class AdminHome extends d {
    public static final char[] h = "0123456789ABCDEF".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public String f2929b = getPasswordHash();

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f2930c;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton f2931d;

    /* renamed from: e  reason: collision with root package name */
    public EditText f2932e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f2933f;

    /* renamed from: g  reason: collision with root package name */
    public CalendarView f2934g;

    public native String getPasswordHash();

    static {
        System.loadLibrary("native-lib");
    }

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home_activity);
        getWindow().setSoftInputMode(32);
        this.f2930c = (ImageButton) findViewById(R.id.button_submit);
        this.f2931d = (ImageButton) findViewById(R.id.network);
        this.f2932e = (EditText) findViewById(R.id.editText_enteredFlag);
        this.f2934g = (CalendarView) findViewById(R.id.calendar_view);
        this.f2933f = (TextView) findViewById(R.id.date);
        this.f2931d.setOnClickListener(new a());
        this.f2934g.setOnDateChangeListener(new b());
        this.f2930c.setOnClickListener(new c());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View v) {
            AdminHome.this.startActivity(new Intent(AdminHome.this, NetworkActivity.class));
        }
    }

    public class b implements CalendarView.OnDateChangeListener {
        public b() {
        }

        public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
            TextView textView = AdminHome.this.f2933f;
            textView.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View v) {
            AdminHome adminHome = AdminHome.this;
            adminHome.f2932e = (EditText) adminHome.findViewById(R.id.editText_enteredFlag);
            if (AdminHome.this.b(AdminHome.this.c(AdminHome.this.f2932e.getText().toString())).equalsIgnoreCase(AdminHome.this.f2929b)) {
                c.a builder = new c.a(AdminHome.this);
                View view = LayoutInflater.from(AdminHome.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view.findViewById(R.id.alert_detail)).setText("Add govtech-csg{} to what you found!");
                builder.h("Proceed", new a());
                builder.f("Close", new b());
                builder.k(view);
                builder.l();
                Toast.makeText(AdminHome.this.getApplicationContext(), "Flag is correct!", 0).show();
                return;
            }
            Toast.makeText(AdminHome.this.getApplicationContext(), "Flag is wrong!", 0).show();
        }

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AdminHome.this.startActivity(new Intent(AdminHome.this, TaskActivity.class));
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AdminHome.this, "Do what you need to do here!", 0).show();
            }
        }
    }

    public final String c(String enteredFlagString) {
        if (!enteredFlagString.contains("govtech-csg{")) {
            return enteredFlagString;
        }
        String result = enteredFlagString.replace("govtech-csg{", BuildConfig.FLAVOR);
        return result.substring(0, result.length() - 1);
    }

    public String b(String toHash) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = toHash.getBytes(SQLiteDatabase.KEY_ENCODING);
            digest.update(bytes, 0, bytes.length);
            return bytesToHex(digest.digest());
        } catch (NoSuchAlgorithmException e2) {
            System.out.println("Algorithm not recognised");
            return null;
        } catch (UnsupportedEncodingException e3) {
            System.out.println("Something is wrong. Like really.");
            return null;
        }
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[(bytes.length * 2)];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 255;
            char[] cArr = h;
            hexChars[j * 2] = cArr[v >>> 4];
            hexChars[(j * 2) + 1] = cArr[v & 15];
        }
        return new String(hexChars);
    }
}
