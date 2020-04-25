package wtf.riceteacatpanda.quiz;

import android.os.Bundle;
import android.widget.TextView;

public class Flag extends C0282e {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_flag);
        ((TextView) findViewById(R.id.flag)).setText(getIntent().getStringExtra("flag"));
    }
}
