package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import sg.gov.tech.ctf.mobile.R;

public class about0Activity extends d {

    /* renamed from: b  reason: collision with root package name */
    public TextView f3002b;

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f3003c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f3004d;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.about0_activity);
        this.f3002b = (TextView) findViewById(R.id.update_details);
        this.f3003c = (ImageButton) findViewById(R.id.back_btn);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        this.f3004d = imageView;
        imageView.setImageResource(R.mipmap.spencerg);
        this.f3002b.setText("An aristocratic British billionaire, virologist and eugenicist. Has a hobby of art collecting and hunting.\n\nOswell has the vision to remake the world and lead it to a new era.\n\nEmail: oswell.e.spencer@korovax.org");
        this.f3003c.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            about0Activity.this.startActivity(new Intent(about0Activity.this, UserHomeActivity.class));
        }
    }
}
