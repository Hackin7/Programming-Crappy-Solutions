package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f.a.a.a.a.c.c.a;
import f.a.a.a.a.c.c.g;
import f.a.a.a.a.c.c.h;
import java.util.ArrayList;
import sg.gov.tech.ctf.mobile.R;
import sg.gov.tech.ctf.mobile.Rome;

public class UserHomeActivity extends d implements g.b, a.b {

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f2989b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f2990c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f2991d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView.g f2992e;

    /* renamed from: f  reason: collision with root package name */
    public ImageButton f2993f;

    /* renamed from: g  reason: collision with root package name */
    public ImageButton f2994g;
    public ImageButton h;
    public ArrayList<h> i = new ArrayList<>();
    public ArrayList<f.a.a.a.a.c.c.d> j = new ArrayList<>();
    public ArrayList<f.a.a.a.a.c.c.b> k = new ArrayList<>();

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.user_home_activity);
        this.f2989b = (RecyclerView) findViewById(R.id.updates_recycler);
        this.f2990c = (RecyclerView) findViewById(R.id.prizes_recycler);
        this.f2991d = (RecyclerView) findViewById(R.id.about_us_recycler);
        f.a.a.a.a.e.b pathChecker = f.a.a.a.a.e.b.a();
        this.f2993f = (ImageButton) findViewById(R.id.image_button_text_editor);
        this.f2994g = (ImageButton) findViewById(R.id.image_button_shared);
        this.h = (ImageButton) findViewById(R.id.image_button_rome);
        if (pathChecker.b().booleanValue() && !pathChecker.c().booleanValue()) {
            this.f2993f.setEnabled(false);
            this.h.setEnabled(false);
            this.f2994g.setEnabled(true);
        } else if (!pathChecker.b().booleanValue()) {
            this.f2993f.setEnabled(true);
            this.h.setEnabled(false);
            this.f2994g.setEnabled(false);
        }
        if (pathChecker.c().booleanValue() && pathChecker.b().booleanValue()) {
            this.f2993f.setEnabled(false);
            this.f2994g.setEnabled(false);
            this.h.setEnabled(true);
        }
        e();
        d();
        a();
        this.f2993f.setOnClickListener(new a());
        this.f2994g.setOnClickListener(new b());
        this.h.setOnClickListener(new c());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            UserHomeActivity.this.startActivity(new Intent(UserHomeActivity.this, TextEditorActivity.class));
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            UserHomeActivity.this.startActivity(new Intent(UserHomeActivity.this, Stats.class));
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            UserHomeActivity.this.startActivity(new Intent(UserHomeActivity.this, Rome.class));
        }
    }

    public final void e() {
        this.f2989b.setHasFixedSize(true);
        this.f2989b.setLayoutManager(new LinearLayoutManager(0, false));
        this.i.add(new h(R.drawable.potato_freepik, "Potatoes", "I do love me some potatoes. Especially the one of that colour."));
        this.i.add(new h(R.drawable.twitter_freepik, "Twitter Archiver", "Save tweets in a Google Sheet!"));
        this.i.add(new h(R.drawable.pills_freepik, "KoroVax’S...", "First FDA-approved treatment for ebola."));
        this.i.add(new h(R.drawable.medical_mask_freepik, "Phase 3", "Phase 3 Efficacy Trial of COVID-19 Vaccine."));
        g gVar = new g(this.i, this);
        this.f2992e = gVar;
        this.f2989b.setAdapter(gVar);
    }

    public final void d() {
        this.f2990c.setHasFixedSize(true);
        this.f2990c.setLayoutManager(new LinearLayoutManager(0, false));
        this.j.add(new f.a.a.a.a.c.c.d(R.drawable.stomachache_freepik, "STOMACHACHE", "90% of COVID patients suffers from a tummyache."));
        this.j.add(new f.a.a.a.a.c.c.d(R.drawable.depression_freepik, "SADNESS", "Patients suffer from sadness."));
        this.j.add(new f.a.a.a.a.c.c.d(R.drawable.hair_loss_freepik, "HAIR LOSS", "There is a 50% chance COVID patients lose their hair."));
        f.a.a.a.a.c.c.c cVar = new f.a.a.a.a.c.c.c(this.j);
        this.f2992e = cVar;
        this.f2990c.setAdapter(cVar);
    }

    public final void a() {
        this.f2991d.setHasFixedSize(true);
        this.f2991d.setLayoutManager(new LinearLayoutManager(0, false));
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 0});
        this.k.add(new f.a.a.a.a.c.c.b("Philanthropist, Billionaire", "Oswell E Spencer", gradient1));
        this.k.add(new f.a.a.a.a.c.c.b("Professional breaker of things", "Sarah Miller", gradient1));
        this.k.add(new f.a.a.a.a.c.c.b("The office dog or our IT guy", "Samuel the dog", gradient1));
        f.a.a.a.a.c.c.a aVar = new f.a.a.a.a.c.c.a(this.k, this);
        this.f2992e = aVar;
        this.f2991d.setAdapter(aVar);
    }

    public void c(int position) {
        this.i.get(position);
        if (position == 0) {
            startActivity(new Intent(this, update0Activity.class));
        } else if (position == 1) {
            startActivity(new Intent(this, update1Activity.class));
        } else if (position == 2) {
            startActivity(new Intent(this, update2Activity.class));
        } else if (position == 3) {
            startActivity(new Intent(this, update3Activity.class));
        } else {
            throw new IllegalStateException("Unexpected value: " + position);
        }
    }

    public void b(int position) {
        this.k.get(position);
        if (position == 0) {
            startActivity(new Intent(this, about0Activity.class));
        } else if (position == 1) {
            startActivity(new Intent(this, about1Activity.class));
        } else if (position == 2) {
            startActivity(new Intent(this, about2Activity.class));
        } else {
            throw new IllegalStateException("Unexpected value: " + position);
        }
    }
}
