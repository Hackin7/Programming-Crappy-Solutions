package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import sg.gov.tech.ctf.mobile.R;

public class about2Activity extends d {

    /* renamed from: b  reason: collision with root package name */
    public TextView f3010b;

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f3011c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f3012d;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.about2_activity);
        this.f3010b = (TextView) findViewById(R.id.update_details);
        this.f3011c = (ImageButton) findViewById(R.id.back_btn);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        this.f3012d = imageView;
        imageView.setImageResource(R.mipmap.corgi);
        this.f3010b.setText("Bark bark woof woof or bash :(){ :|:& };: ? We dont know.\n\nEmail: you know where to get me.");
        this.f3011c.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            about2Activity.this.startActivity(new Intent(about2Activity.this, UserHomeActivity.class));
        }
    }
}
