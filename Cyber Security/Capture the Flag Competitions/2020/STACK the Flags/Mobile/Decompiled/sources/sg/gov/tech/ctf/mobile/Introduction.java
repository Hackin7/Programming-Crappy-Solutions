package sg.gov.tech.ctf.mobile;

import a.b.k.d;
import a.k.a.i;
import a.k.a.n;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;

public class Introduction extends d {
    public static final int NUM_FRAGMENTS = 3;
    public ImageView bg;
    public LottieAnimationView loading;
    public ImageView logo;
    public ScreenSlidePageAdapter pageAdapter;
    public ViewPager viewPager;

    public native String nodebug();

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_splashscreen);
        nodebug();
        this.viewPager = (ViewPager) findViewById(R.id.pager);
        ScreenSlidePageAdapter screenSlidePageAdapter = new ScreenSlidePageAdapter(getSupportFragmentManager());
        this.pageAdapter = screenSlidePageAdapter;
        this.viewPager.setAdapter(screenSlidePageAdapter);
        this.bg = (ImageView) findViewById(R.id.background);
        this.logo = (ImageView) findViewById(R.id.ctf_logo);
        this.loading = (LottieAnimationView) findViewById(R.id.loading);
        this.logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.spin));
        this.bg.animate().translationY(-3000.0f).setDuration(1000).setStartDelay(4000);
        this.logo.animate().translationY(3000.0f).setDuration(1000).setStartDelay(4000);
        this.loading.animate().translationY(3000.0f).setDuration(1000).setStartDelay(4000);
    }

    public class ScreenSlidePageAdapter extends n {
        public ScreenSlidePageAdapter(i fm) {
            super(fm);
        }

        @Override // a.k.a.n
        public Fragment getItem(int position) {
            if (position == 0) {
                return new OnBoardFragment1();
            }
            if (position == 1) {
                return new OnBoardFragment2();
            }
            if (position != 2) {
                return null;
            }
            return new OnBoardFragment3();
        }

        @Override // a.u.a.a
        public int getCount() {
            return 3;
        }
    }

    static {
        System.loadLibrary("native-lib");
    }
}
