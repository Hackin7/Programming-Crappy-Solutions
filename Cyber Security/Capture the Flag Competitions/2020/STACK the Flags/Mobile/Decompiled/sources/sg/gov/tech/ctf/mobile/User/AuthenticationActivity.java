package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import a.k.a.i;
import a.k.a.n;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import f.a.a.a.a.e.c;
import sg.gov.tech.ctf.mobile.R;

public class AuthenticationActivity extends d {

    /* renamed from: b  reason: collision with root package name */
    public TabLayout f2975b;

    /* renamed from: c  reason: collision with root package name */
    public ViewPager f2976c;

    /* renamed from: d  reason: collision with root package name */
    public FloatingActionButton f2977d;

    /* renamed from: e  reason: collision with root package name */
    public FloatingActionButton f2978e;

    /* renamed from: f  reason: collision with root package name */
    public FloatingActionButton f2979f;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(8192, 8192);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.user_authentication_activity);
        new f.a.a.a.a.e.b();
        f.a.a.a.a.e.b pathChecker = f.a.a.a.a.e.b.a();
        pathChecker.d(false);
        pathChecker.e(false);
        this.f2975b = (TabLayout) findViewById(R.id.tab_layout);
        this.f2976c = (ViewPager) findViewById(R.id.view_pager);
        this.f2977d = (FloatingActionButton) findViewById(R.id.fab_facebook);
        this.f2979f = (FloatingActionButton) findViewById(R.id.fab_twitter);
        this.f2978e = (FloatingActionButton) findViewById(R.id.fab_google);
        TabLayout tabLayout = this.f2975b;
        TabLayout.f w = tabLayout.w();
        w.o("Login");
        tabLayout.c(w);
        TabLayout tabLayout2 = this.f2975b;
        TabLayout.f w2 = tabLayout2.w();
        w2.o("Sign up");
        tabLayout2.c(w2);
        this.f2975b.setTabGravity(0);
        this.f2976c.setAdapter(new b(this, getSupportFragmentManager()));
        this.f2976c.g(new TabLayout.g(this.f2975b));
        this.f2977d.setTranslationY(300.0f);
        this.f2979f.setTranslationY(300.0f);
        this.f2978e.setTranslationY(300.0f);
        this.f2975b.setTranslationY(300.0f);
        this.f2977d.setAlpha(0.0f);
        this.f2979f.setAlpha(0.0f);
        this.f2978e.setAlpha(0.0f);
        this.f2975b.setAlpha(0.0f);
        this.f2977d.animate().translationY(0.0f).alpha(1.0f).setDuration(1000).setStartDelay(400).start();
        this.f2978e.animate().translationY(0.0f).alpha(1.0f).setDuration(1000).setStartDelay(600).start();
        this.f2979f.animate().translationY(0.0f).alpha(1.0f).setDuration(1000).setStartDelay(800).start();
        this.f2975b.animate().translationY(0.0f).alpha(1.0f).setDuration(1000).setStartDelay(1000).start();
        this.f2975b.b(new a());
    }

    public class a implements TabLayout.c {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f tab) {
            AuthenticationActivity.this.f2976c.setCurrentItem(tab.e());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f tab) {
        }
    }

    public class b extends n {
        public b(AuthenticationActivity authenticationActivity, i fm) {
            super(fm);
        }

        @Override // a.k.a.n
        public Fragment getItem(int position) {
            if (position == 0) {
                return new f.a.a.a.a.e.a();
            }
            if (position != 1) {
                return null;
            }
            return new c();
        }

        @Override // a.u.a.a
        public int getCount() {
            return 2;
        }
    }
}
