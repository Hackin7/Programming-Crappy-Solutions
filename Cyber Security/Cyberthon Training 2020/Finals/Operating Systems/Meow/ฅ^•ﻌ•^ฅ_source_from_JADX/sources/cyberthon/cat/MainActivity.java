package cyberthon.cat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public static int cat_x = 0;
    /* access modifiers changed from: private */
    public static int cat_y = 0;
    public static Context context = null;
    /* access modifiers changed from: private */
    public static boolean freshstart = true;
    public static int jump_index;
    public static int line;
    public static boolean step;
    public int display_h = 0;
    public int display_w = 0;
    /* access modifiers changed from: private */
    public TextView forbaba;
    /* access modifiers changed from: private */
    public ImageView image_bg;
    /* access modifiers changed from: private */
    public ImageView image_fg;
    /* access modifiers changed from: private */
    public ImageView image_intro;
    /* access modifiers changed from: private */
    public int[] jump = {19, 41, 45, 27, 33, 53, 57, 65};

    public class CleanPaw extends AsyncTask<Boolean, Void, Integer> {
        public CleanPaw() {
        }

        /* access modifiers changed from: protected */
        public Integer doInBackground(Boolean... boolArr) {
            Source.keytoyourkingdom();
            return Integer.valueOf(0);
        }
    }

    public static void toast(final Context context2, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                Toast.makeText(context2, str, 1).show();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0275R.layout.activity_main);
        getSupportActionBar().setTitle((CharSequence) "Bl4ckC@t T34M ฅ^•ﻌ•^ฅ");
        setRequestedOrientation(1);
        context = getApplicationContext();
        freshstart = true;
        jump_index = 0;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.display_w = point.x;
        this.display_h = point.y;
        ((TextView) findViewById(C0275R.C0277id.topbar)).setSelected(true);
        ((TextView) findViewById(C0275R.C0277id.btmbar)).setSelected(true);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C0275R.C0276drawable.cat_sit);
        this.image_intro = (ImageView) findViewById(C0275R.C0277id.image_intro);
        this.image_intro.setImageBitmap(decodeResource);
        this.forbaba = (TextView) findViewById(C0275R.C0277id.introtext);
        this.image_intro.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.image_intro.setVisibility(8);
                MainActivity.this.forbaba.setVisibility(8);
                MainActivity.this.image_bg.setVisibility(0);
                MainActivity.this.image_fg.setVisibility(0);
            }
        });
        this.image_bg = (ImageView) findViewById(C0275R.C0277id.image_bg);
        this.image_fg = (ImageView) findViewById(C0275R.C0277id.image_fg);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), C0275R.C0276drawable.image_bg);
        final int height = decodeResource2.getHeight();
        final int width = decodeResource2.getWidth();
        this.image_bg.setImageBitmap(decodeResource2);
        Bitmap createBitmap = Bitmap.createBitmap(width / 2, height / 2, Config.ARGB_8888);
        final Canvas canvas = new Canvas(createBitmap);
        this.image_fg.setImageBitmap(createBitmap);
        final Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), C0275R.C0276drawable.cat_sit), width / 10, height / 10, true);
        double d = (double) width;
        Double.isNaN(d);
        cat_x = ((int) (d * 0.7d)) / 2;
        cat_y = height / 6;
        line = (height / 57) / 2;
        final Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        new CleanPaw().execute(new Boolean[]{Boolean.valueOf(true)});
        this.image_fg.invalidate();
        ImageView imageView = this.image_fg;
        C02743 r3 = new OnClickListener() {
            public void onClick(View view) {
                if (!MainActivity.freshstart) {
                    MainActivity.step = true;
                    Canvas canvas = canvas;
                    Bitmap bitmap = createScaledBitmap;
                    float access$500 = (float) MainActivity.cat_x;
                    int access$600 = MainActivity.cat_y;
                    double d = (double) (height / 10);
                    Double.isNaN(d);
                    canvas.drawBitmap(bitmap, access$500, (float) (access$600 - ((int) (d * 0.659d))), paint);
                    canvas.drawRect(0.0f, (float) (MainActivity.cat_y - (height / 200)), (float) width, (float) (MainActivity.cat_y + (height / 200)), paint);
                    view.invalidate();
                }
                MainActivity.cat_y = MainActivity.line * ((MainActivity.this.jump[MainActivity.jump_index] - 16) + 1);
                MainActivity.jump_index++;
                if (MainActivity.jump_index == MainActivity.this.jump.length) {
                    MainActivity.jump_index = 0;
                }
                Paint paint = new Paint();
                paint.setStyle(Style.FILL);
                Canvas canvas2 = canvas;
                Bitmap bitmap2 = createScaledBitmap;
                float access$5002 = (float) MainActivity.cat_x;
                int access$6002 = MainActivity.cat_y;
                double d2 = (double) (height / 10);
                Double.isNaN(d2);
                canvas2.drawBitmap(bitmap2, access$5002, (float) (access$6002 - ((int) (d2 * 0.659d))), new Paint());
                canvas.drawRect(0.0f, (float) (MainActivity.cat_y - (height / 200)), (float) width, (float) (MainActivity.cat_y + (height / 200)), paint);
                view.invalidate();
                if (MainActivity.freshstart) {
                    MainActivity.freshstart = false;
                }
            }
        };
        imageView.setOnClickListener(r3);
    }
}
