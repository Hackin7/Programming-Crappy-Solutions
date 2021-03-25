package f.a.a.a.a.a;

import a.b.k.c;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import net.sqlcipher.database.SQLiteDatabase;
import sg.gov.tech.ctf.mobile.Admin.AdminHome;
import sg.gov.tech.ctf.mobile.R;

public class a extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public EditText f2850b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f2851c;

    /* renamed from: d  reason: collision with root package name */
    public Button f2852d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f2853e;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);
        SQLiteDatabase.loadLibs(root.getContext());
        f.a.a.a.a.c.b dbHelperAdmin = f.a.a.a.a.c.b.c(root.getContext());
        SQLiteDatabase db = dbHelperAdmin.getWritableDatabase(c.a.a.a.a(-1338495381432L));
        if (!dbHelperAdmin.b(c.a.a.a.a(-1634848124856L), db)) {
            dbHelperAdmin.a(db);
        }
        EditText editText = (EditText) root.findViewById(R.id.username_input);
        this.f2850b = editText;
        editText.setText(c.a.a.a.a(-1660617928632L));
        this.f2851c = (EditText) root.findViewById(R.id.password_input);
        this.f2852d = (Button) root.findViewById(R.id.login_button);
        this.f2853e = (TextView) root.findViewById(R.id.textView2);
        this.f2850b.setTranslationX(800.0f);
        this.f2851c.setTranslationX(800.0f);
        this.f2852d.setTranslationX(800.0f);
        this.f2853e.setTranslationX(800.0f);
        this.f2850b.setAlpha(0.0f);
        this.f2851c.setAlpha(0.0f);
        this.f2852d.setAlpha(0.0f);
        this.f2853e.setAlpha(0.0f);
        this.f2850b.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(400).start();
        this.f2851c.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(500).start();
        this.f2853e.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(700).start();
        this.f2852d.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(900).start();
        this.f2853e.setOnClickListener(new View$OnClickListenerC0060a(this, root));
        this.f2852d.setOnClickListener(new b(root, dbHelperAdmin));
        return root;
    }

    /* renamed from: f.a.a.a.a.a.a$a  reason: collision with other inner class name */
    public class View$OnClickListenerC0060a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2854b;

        public View$OnClickListenerC0060a(a this$0, ViewGroup viewGroup) {
            this.f2854b = viewGroup;
        }

        public void onClick(View arg0) {
            Toast.makeText(this.f2854b.getContext(), c.a.a.a.a(-2760552376L), 0).show();
        }
    }

    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2855b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f.a.a.a.a.c.b f2856c;

        public b(ViewGroup viewGroup, f.a.a.a.a.c.b bVar) {
            this.f2855b = viewGroup;
            this.f2856c = bVar;
        }

        public void onClick(View v) {
            if (a.this.f2851c.getText().toString().contains(c.a.a.a.a(-891818782648L))) {
                c.a builder = new c.a(this.f2855b.getContext());
                View view = LayoutInflater.from(this.f2855b.getContext()).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText(c.a.a.a.a(-1033552703416L));
                ((TextView) view.findViewById(R.id.alert_detail)).setText(c.a.a.a.a(-1076502376376L));
                builder.h(c.a.a.a.a(-1252596035512L), new DialogInterface$OnClickListenerC0061a());
                builder.f(c.a.a.a.a(-1286955773880L), new DialogInterface$OnClickListenerC0062b());
                builder.k(view);
                builder.l();
                return;
            }
            try {
                new Thread(new c(new Handler())).start();
            } catch (Exception e2) {
                Toast.makeText(this.f2855b.getContext(), c.a.a.a.a(-1312725577656L), 0).show();
            }
        }

        /* renamed from: f.a.a.a.a.a.a$b$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0061a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0061a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                a.this.startActivity(new Intent(b.this.f2855b.getContext(), AdminHome.class));
            }
        }

        /* renamed from: f.a.a.a.a.a.a$b$b  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0062b implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0062b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(b.this.f2855b.getContext(), c.a.a.a.a(-470911987640L), 0).show();
            }
        }

        public class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Handler f2860b;

            public c(Handler handler) {
                this.f2860b = handler;
            }

            /* renamed from: f.a.a.a.a.a.a$b$c$a  reason: collision with other inner class name */
            public class RunnableC0063a implements Runnable {
                public RunnableC0063a() {
                }

                public void run() {
                    Toast.makeText(b.this.f2855b.getContext(), Boolean.valueOf(b.this.f2856c.d(a.this.b(a.this.f2851c.getText().toString()), b.this.f2856c.getWritableDatabase(c.a.a.a.a(-595466039224L)))).toString(), 0).show();
                }
            }

            public void run() {
                this.f2860b.post(new RunnableC0063a());
            }
        }
    }

    public final String b(String query) {
        return query.replaceAll(c.a.a.a.a(-1742222307256L), c.a.a.a.a(-1780877012920L)).replaceAll(c.a.a.a.a(-1789466947512L), c.a.a.a.a(-1836711587768L)).replaceAll(c.a.a.a.a(-1845301522360L), c.a.a.a.a(-1892546162616L)).replaceAll(c.a.a.a.a(-1901136097208L), c.a.a.a.a(-1944085770168L)).replaceAll(c.a.a.a.a(-1952675704760L), c.a.a.a.a(-1995625377720L));
    }
}
