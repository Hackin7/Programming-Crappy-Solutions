package f.a.a.a.a.e;

import a.b.k.c;
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
import androidx.fragment.app.Fragment;
import net.sqlcipher.database.SQLiteDatabase;
import sg.gov.tech.ctf.mobile.R;
import sg.gov.tech.ctf.mobile.User.UserHomeActivity;

public class a extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public EditText f2885b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f2886c;

    /* renamed from: d  reason: collision with root package name */
    public Button f2887d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f2888e;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);
        SQLiteDatabase.loadLibs(root.getContext());
        f.a.a.a.a.c.a dbhelper = f.a.a.a.a.c.a.c(root.getContext());
        SQLiteDatabase db = dbhelper.getWritableDatabase(c.a.a.a.a(-10177538076600L));
        if (!dbhelper.b(c.a.a.a.a(-10203307880376L), db)) {
            dbhelper.a(db);
        }
        this.f2885b = (EditText) root.findViewById(R.id.username_input);
        this.f2886c = (EditText) root.findViewById(R.id.password_input);
        this.f2887d = (Button) root.findViewById(R.id.login_button);
        this.f2888e = (TextView) root.findViewById(R.id.textView2);
        this.f2885b.setTranslationX(800.0f);
        this.f2886c.setTranslationX(800.0f);
        this.f2887d.setTranslationX(800.0f);
        this.f2888e.setTranslationX(800.0f);
        this.f2885b.setAlpha(0.0f);
        this.f2886c.setAlpha(0.0f);
        this.f2887d.setAlpha(0.0f);
        this.f2888e.setAlpha(0.0f);
        this.f2885b.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(400).start();
        this.f2886c.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(500).start();
        this.f2888e.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(700).start();
        this.f2887d.animate().translationX(0.0f).alpha(1.0f).setDuration(800).setStartDelay(900).start();
        this.f2888e.setOnClickListener(new View$OnClickListenerC0065a(this, root));
        this.f2887d.setOnClickListener(new b(root, dbhelper));
        return root;
    }

    /* renamed from: f.a.a.a.a.e.a$a  reason: collision with other inner class name */
    public class View$OnClickListenerC0065a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2889b;

        public View$OnClickListenerC0065a(a this$0, ViewGroup viewGroup) {
            this.f2889b = viewGroup;
        }

        public void onClick(View arg0) {
            Toast.makeText(this.f2889b.getContext(), c.a.a.a.a(-9176810696632L), 0).show();
        }
    }

    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2890b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f.a.a.a.a.c.a f2891c;

        public b(ViewGroup viewGroup, f.a.a.a.a.c.a aVar) {
            this.f2890b = viewGroup;
            this.f2891c = aVar;
        }

        public void onClick(View v) {
            String password = a.this.f2886c.getText().toString();
            if (password.contains(c.a.a.a.a(-9421623832504L))) {
                Toast.makeText(this.f2890b.getContext(), c.a.a.a.a(-9516113113016L), 0).show();
            }
            if (this.f2891c.e(c.a.a.a.a(-9726566510520L), password, this.f2891c.getReadableDatabase(c.a.a.a.a(-9700796706744L))).matches(c.a.a.a.a(-9748041347000L))) {
                c.a builder = new c.a(this.f2890b.getContext());
                View view = LayoutInflater.from(this.f2890b.getContext()).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view.findViewById(R.id.title)).setText(c.a.a.a.a(-9842530627512L));
                ((TextView) view.findViewById(R.id.alert_detail)).setText(c.a.a.a.a(-9885480300472L));
                builder.h(c.a.a.a.a(-9997149450168L), new DialogInterface$OnClickListenerC0066a());
                builder.f(c.a.a.a.a(-10031509188536L), new DialogInterface$OnClickListenerC0067b());
                builder.k(view);
                builder.l();
                return;
            }
            Toast.makeText(this.f2890b.getContext(), c.a.a.a.a(-10057278992312L), 0).show();
        }

        /* renamed from: f.a.a.a.a.e.a$b$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0066a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0066a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                a.this.startActivity(new Intent(b.this.f2890b.getContext(), UserHomeActivity.class));
            }
        }

        /* renamed from: f.a.a.a.a.e.a$b$b  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0067b implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0067b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(b.this.f2890b.getContext(), c.a.a.a.a(-9297069780920L), 0).show();
            }
        }
    }
}
