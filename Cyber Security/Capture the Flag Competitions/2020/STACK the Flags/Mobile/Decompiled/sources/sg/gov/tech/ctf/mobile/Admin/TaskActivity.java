package sg.gov.tech.ctf.mobile.Admin;

import a.b.k.c;
import a.b.k.d;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import sg.gov.tech.ctf.mobile.R;
import sg.gov.tech.ctf.mobile.Rome;

public class TaskActivity extends d {

    /* renamed from: b  reason: collision with root package name */
    public CalendarView f2948b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f2949c;

    public native int checkFlag(String str, int i);

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_task_activity);
        getWindow().setSoftInputMode(32);
        this.f2948b = (CalendarView) findViewById(R.id.calendar_view);
        this.f2949c = (TextView) findViewById(R.id.date);
        this.f2948b.setOnDateChangeListener(new a());
        ((Button) findViewById(R.id.button_submit)).setOnClickListener(new b());
    }

    public class a implements CalendarView.OnDateChangeListener {
        public a() {
        }

        public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
            TextView textView = TaskActivity.this.f2949c;
            textView.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View v) {
            String enteredFlagString = ((EditText) TaskActivity.this.findViewById(R.id.editText_enteredFlag)).getText().toString();
            int toPad = 4 - (enteredFlagString.length() % 4);
            if (toPad != 4) {
                for (int i = 0; i < toPad; i++) {
                    enteredFlagString = enteredFlagString + " ";
                }
            }
            int flagStatus = TaskActivity.this.checkFlag(enteredFlagString, enteredFlagString.length());
            if (flagStatus == 0 && TaskActivity.this.f2949c.getText().toString().matches("31/12/2019")) {
                c.a builder = new c.a(TaskActivity.this);
                View view = LayoutInflater.from(TaskActivity.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view.findViewById(R.id.alert_detail)).setText("Well done!");
                builder.h("Proceed", new a());
                builder.f("Close", new DialogInterface$OnClickListenerC0069b());
                builder.k(view);
                builder.l();
                Toast.makeText(TaskActivity.this.getApplicationContext(), "Password is correct!", 0).show();
            } else if (flagStatus == 2) {
                Toast.makeText(TaskActivity.this.getApplicationContext(), "Nice try, but that isn't it :)", 0).show();
            } else if (flagStatus == 1) {
                Toast.makeText(TaskActivity.this.getApplicationContext(), "Password is wrong!", 0).show();
            } else {
                Toast.makeText(TaskActivity.this.getApplicationContext(), "Something is wrong!", 0).show();
            }
        }

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                TaskActivity.this.startActivity(new Intent(TaskActivity.this, Rome.class));
            }
        }

        /* renamed from: sg.gov.tech.ctf.mobile.Admin.TaskActivity$b$b  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0069b implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0069b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(TaskActivity.this, "Do what you need to do here!", 0).show();
            }
        }
    }

    static {
        System.loadLibrary("native-lib");
    }
}
