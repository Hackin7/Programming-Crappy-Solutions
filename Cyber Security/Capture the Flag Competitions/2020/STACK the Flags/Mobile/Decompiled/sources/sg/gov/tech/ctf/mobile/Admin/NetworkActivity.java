package sg.gov.tech.ctf.mobile.Admin;

import a.b.k.d;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;
import sg.gov.tech.ctf.mobile.R;

public class NetworkActivity extends d {
    public static final char[] h = "0123456789ABCDEF".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public EditText f2940b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f2941c;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton f2942d;

    /* renamed from: e  reason: collision with root package name */
    public String f2943e = "yhi8bpzolrog3yw17fe0wlwrnwllnhic.alttablabs.sg";

    /* renamed from: f  reason: collision with root package name */
    public String f2944f = "41061";

    /* renamed from: g  reason: collision with root package name */
    public String f2945g = ("http://" + this.f2943e + ":" + this.f2944f + "/api/login");

    public native byte[] messy(int i, int i2);

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.network_activity);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        this.f2940b = (EditText) findViewById(R.id.usernameInput);
        this.f2941c = (EditText) findViewById(R.id.passwordInput);
        this.f2942d = (ImageButton) findViewById(R.id.back_btn);
        ((Button) findViewById(R.id.submit)).setOnClickListener(new a());
        this.f2942d.setOnClickListener(new b());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View v) {
            NetworkActivity networkActivity = NetworkActivity.this;
            networkActivity.d(networkActivity.f2940b.getText().toString(), NetworkActivity.this.f2941c.getText().toString(), NetworkActivity.this.f2945g);
            NetworkActivity networkActivity2 = NetworkActivity.this;
            networkActivity2.c(networkActivity2.f2940b.getText().toString(), NetworkActivity.this.f2941c.getText().toString());
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            NetworkActivity.this.startActivity(new Intent(NetworkActivity.this, AdminHome.class));
        }
    }

    public void d(String username, String password, String url) {
        try {
            List<String> response = new f.a.a.a.a.a.b(url, SQLiteDatabase.KEY_ENCODING, username, password).a();
            Log.v("rht", "SERVER REPLIED:");
            Iterator<String> it = response.iterator();
            while (it.hasNext()) {
                Log.v("rht", "Line : " + it.next());
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void c(String username, String password) {
        String hexUserVal = e(username);
        String hexPassVal = e(password);
        String hexUserVal2 = b(hexUserVal);
        b(hexPassVal);
        int numberOfParts = hexUserVal2.length() / 8;
        String[] tokens = new String[numberOfParts];
        for (int i = 1; i <= numberOfParts; i++) {
            tokens[i - 1] = hexUserVal2.substring((i - 1) * 8, i * 8);
        }
        String fullEnc = BuildConfig.FLAVOR;
        for (String str : tokens) {
            fullEnc = fullEnc + bytesToHex(messy(a(Integer.parseInt(str, 16), 8), 8));
        }
    }

    public String b(String str) {
        while (str.length() % 8 != 0) {
            str = str + "20";
        }
        return str;
    }

    public int a(int flag, int count) {
        return (flag >> count) | (flag << (32 - count));
    }

    public String e(String userInput) {
        try {
            return String.format("%02x", new BigInteger(1, userInput.getBytes(SQLiteDatabase.KEY_ENCODING)));
        } catch (UnsupportedEncodingException e2) {
            System.out.println("Encoding not supported.");
            return BuildConfig.FLAVOR;
        }
    }

    static {
        System.loadLibrary("native-lib");
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
