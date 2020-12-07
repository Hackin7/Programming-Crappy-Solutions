package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import sg.gov.tech.ctf.mobile.R;

public class update0Activity extends d {

    /* renamed from: b  reason: collision with root package name */
    public TextView f3014b;

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f3015c;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.update0_activity);
        this.f3014b = (TextView) findViewById(R.id.update_details);
        this.f3015c = (ImageButton) findViewById(R.id.back_btn);
        this.f3014b.setText("I do love me some potatoes. Especially the one of that colour.");
        this.f3015c.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            update0Activity.this.startActivity(new Intent(update0Activity.this, UserHomeActivity.class));
        }
    }
}
