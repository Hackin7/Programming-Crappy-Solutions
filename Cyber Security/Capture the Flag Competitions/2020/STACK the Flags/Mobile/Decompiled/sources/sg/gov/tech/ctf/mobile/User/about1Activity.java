package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import sg.gov.tech.ctf.mobile.R;

public class about1Activity extends d {

    /* renamed from: b  reason: collision with root package name */
    public TextView f3006b;

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f3007c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f3008d;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.about1_activity);
        this.f3006b = (TextView) findViewById(R.id.update_details);
        this.f3007c = (ImageButton) findViewById(R.id.back_btn);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        this.f3008d = imageView;
        imageView.setImageResource(R.mipmap.sarah);
        this.f3006b.setText("Emergency and Cybersecurity Manager who digs disasters, tech, hockey, equity, cats. I do a lot of things for a lot of people.\n\nEmail: sarah.miller@korovax.org");
        this.f3007c.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            about1Activity.this.startActivity(new Intent(about1Activity.this, UserHomeActivity.class));
        }
    }
}
