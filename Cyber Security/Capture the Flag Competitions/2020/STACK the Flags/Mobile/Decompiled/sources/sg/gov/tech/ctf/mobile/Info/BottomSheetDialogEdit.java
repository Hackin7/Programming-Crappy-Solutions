package sg.gov.tech.ctf.mobile.Info;

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
import b.d.a.a.m.b;
import sg.gov.tech.ctf.mobile.R;
import sg.gov.tech.ctf.mobile.Rome;

public class BottomSheetDialogEdit extends b {
    public String m;
    public TextView n;
    public EditText o;
    public Button p;

    public native String secretFlag();

    public native String secretFunction(String str, String str2);

    public native int secretFunction2(String str, int i);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String flag;
        View v = inflater.inflate(R.layout.modal_bottom_sheet_edit, container, false);
        this.n = (TextView) v.findViewById(R.id.modal_title);
        this.o = (EditText) v.findViewById(R.id.modal_editText);
        this.p = (Button) v.findViewById(R.id.submit_btn);
        this.n.setText(this.m);
        this.o.setText((CharSequence) null);
        String key = getActivity().getIntent().getStringExtra("key");
        if (key == null) {
            flag = secretFlag();
        } else {
            String fileDir = getActivity().getFilesDir().toString();
            flag = secretFunction(key, fileDir + "/encFlag");
        }
        this.n.setText(flag);
        this.p.setOnClickListener(new a());
        return v;
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            String enteredFlagString = BottomSheetDialogEdit.this.o.getText().toString();
            int toPad = 16 - (enteredFlagString.length() % 16);
            if (toPad != 16) {
                for (int i = 0; i < toPad; i++) {
                    enteredFlagString = enteredFlagString + " ";
                }
            }
            int flagStatus = BottomSheetDialogEdit.this.secretFunction2(enteredFlagString, enteredFlagString.length());
            if (flagStatus == 0) {
                Toast.makeText(BottomSheetDialogEdit.this.getContext(), "Password is correct!", 0).show();
                c.a builder = new c.a(BottomSheetDialogEdit.this.getContext());
                View view2 = LayoutInflater.from(BottomSheetDialogEdit.this.getContext()).inflate(R.layout.custom_alert, (ViewGroup) null);
                ((TextView) view2.findViewById(R.id.title)).setText("Congrats!");
                ((TextView) view2.findViewById(R.id.alert_detail)).setText("Well done!");
                builder.h("Proceed", new DialogInterface$OnClickListenerC0072a());
                builder.f("Close", new b());
                builder.k(view2);
                builder.l();
            } else if (flagStatus == 2) {
                Toast.makeText(BottomSheetDialogEdit.this.getContext(), "Did you think it'd be that easy?", 0).show();
            } else if (flagStatus == 1) {
                Toast.makeText(BottomSheetDialogEdit.this.getContext(), "Password is wrong!", 0).show();
            } else {
                Toast.makeText(BottomSheetDialogEdit.this.getContext(), "Something is wrong!", 0).show();
            }
        }

        /* renamed from: sg.gov.tech.ctf.mobile.Info.BottomSheetDialogEdit$a$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0072a implements DialogInterface.OnClickListener {
            public DialogInterface$OnClickListenerC0072a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                BottomSheetDialogEdit.this.startActivity(new Intent(BottomSheetDialogEdit.this.getContext(), Rome.class));
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(BottomSheetDialogEdit.this.getActivity(), "Do what you need to do here!", 0).show();
            }
        }
    }

    public BottomSheetDialogEdit(String title) {
        this.m = title;
    }

    static {
        System.loadLibrary("native-lib");
    }
}
